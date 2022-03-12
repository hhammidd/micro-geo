@Library('javahome-demo') _

properties([
        parameters([
                string(name: 'service_name', defaultValue: 'micro-geo', description: 'Service-name',),
                string(name: 'IMAGE_TAG', defaultValue: '', description: 'Image TAG',),
                string(name: 'branch', defaultValue: 'master', description: 'Which is the branch triggered',),
                string(name: 'environment', defaultValue: 'default', description: 'Which cluster you need to deploy, default/bricks-tst/bricks-acc/bricks-prd',),
        ])
])

pipeline {

    environment {
        registry = "hhssaaffii/${service_name}"
        registryCredential = ''
        dockerImage = ''
        //Use Pipeline Utility Steps plugin to read information from pom.xml into env variables
        IMAGE = readMavenPom().getArtifactId()
        VERSION = readMavenPom().getVersion()
    }
    agent any
    stages {
        stage("get version") {
            steps {
                script {
                    if ("${IMAGE_TAG}"?.trim()) {
                        stage('Input pam') {
                            sh 'echo ${IMAGE_TAG}'
                        }
                    } else {
                        stage('current') {
                            sh 'echo ${VERSION}'
                        }
                    }
                }
            }
        }
        stage("start build process") {
            steps {
                buildapp("${service_name}")
            }
        }

        stage("start build and push image") {
            steps {
                buildimage("${VERSION}")
            }
        }

        stage("deploy") {
            steps {
                createhelm("${IMAGE}")
            }
        }

    }
}

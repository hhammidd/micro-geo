@Library('javahome-demo') _

properties([
        parameters([
                string(name: 'service_name', defaultValue: 'micro-geo', description: 'Service-name',),
                string(name: 'IMAGE_TAG', defaultValue: '', description: 'Image TAG',),
                string(name: 'branch', defaultValue: 'master', description: 'Which is the branch triggered',),
                string(name: 'environment', defaultValue: 'tst', description: 'Which cluster you need to deploy, default/bricks-tst/bricks-acc/bricks-prd',),
        ])
])
currentBuild.displayName = "${service_name}-#" + currentBuild.number
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

        stage("start build process") {
            steps {
                startBuild("${service_name}", "${VERSION}")
            }
        }

        stage("OWASP") {
            steps {
                checkOwasp()
            }
        }

        stage("start build and push image") {
            steps {
                buildimageProcess("${VERSION}")
            }
        }

        stage("deploy") {
            steps {
                createhelm("${IMAGE}")
            }
        }
    }
}

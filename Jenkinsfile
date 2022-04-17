@Library('javahome-demo') _
properties([
        parameters([
                string(name: 'service_name', defaultValue: 'sale-point-service', description: 'Service-name',),
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

        // TODO turn on later
//        stage("OWASP") {
//            steps {
//                checkOwasp()
//            }
//        }

        stage("start build and push image") {
            steps {
                script {
                    if ("${environment}"?.trim() == "prd" || "master" == branch?.trim()) { // if it is branch master and or prd env
                        VERSION_PRD = "${VERSION}".substring(0, "${VERSION}".indexOf('-')) // maybe better way
                        buildimageProcess("${VERSION_PRD}")
                    } else {
                        buildimageProcess("${VERSION}")
                    }
                }

            }
        }

        stage("deploy") {
            steps {
                script {
                    if ("${environment}"?.trim() == "prd" || "master" == branch?.trim()) {
                        VERSION_PRD = "${VERSION}".substring(0, "${VERSION}".indexOf('-')) // maybe better way
                        createhelm("${service_name}", "${VERSION_PRD}") // TODO nodePOrt different than test
                    } else {
                        VERSION_SNAPSHOT = "${VERSION}"
                        createhelm("${service_name}", "${VERSION}") // TODO
                    }
                }

            }
        }

        stage("bump up version") {
            steps {
                script {
                    if ("${environment}"?.trim() == "prd" || "master" == branch?.trim()) {
                        bumpupVersion("${service_name}", "${branch}")
                    } else {
                        sh 'echo not bump feature'
                    }
                }
            }
        }

    }
}

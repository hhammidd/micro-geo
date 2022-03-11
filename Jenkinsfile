properties([
  parameters([
    string(name: 'service_name', defaultValue: 'micro-geo', description: 'Service-name', ),
    string(name: 'IMAGE_TAG', defaultValue: '11', description: 'Image TAG', ),
        string(name: 'branch', defaultValue: 'master', description: 'Which is the branch triggered', ),
        string(name: 'environment', defaultValue: 'sale_tst', description: 'Which cluster you need to deploy, sale_tst/sale_acc/sale_prd', ),
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
        stage("git checkout") {
            steps{
                git 'https://github.com/hhammidd/${service_name}.git'
            }
        }

        stage("echo variables") {
                    steps{
                        sh "echo ${IMAGE}"
                        sh "echo ${VERSION}"
                    }
                }


        stage("build-test") {
            steps{
                sh "mvn clean install"
//                 sh "echo ${branch}"
            }
        }
        stage("build Image") {
            steps{
                script {
//                     dockerImage = docker.build registry + "/$IMAGE" + ":$BUILD_NUMBER"
                        dockerImage = docker.build registry + ":$BUILD_NUMBER"
                }
            }
        }

        stage("Push image") {
            steps {
                script {
                    docker.withRegistry( '' ) {
                        dockerImage.push()
                    }
                }
            }
        }

/*
        stage("Remove Unused docker image") {
            steps{
                sh "docker rmi $registry:$BUILD_NUMBER"
            }
        }
        stage("Pull image from docker registry") {
            steps{
                sh "docker pull hhssaaffii/micro-geo:${params.IMAGE_TAG}"
            }
        }


        stage("Remove Unused docker image") {
                    steps{
                            sh "docker rmi $registry:${BUILD_NUMBER.toInteger()-2}"
                    }

                }
*/
        stage("Helm chart checkout") {
            steps{
                sh "rm -rf ~/apps/apps-helm-charts/helm-checkouts/${IMAGE}/"
                sh "rm -rf ~/apps/apps-helm-charts/helm-checkouts/${IMAGE}/.git"
                sh "git clone https://github.com/hhammidd/Charts.git  ~/apps/apps-helm-charts/helm-checkouts/${IMAGE}"
            }
        }

        stage("Install helm and deploy") {
            steps{
                sh " helm upgrade --install micro-geo  ~/apps/apps-helm-charts/helm-checkouts/springboot-services/${IMAGE} --set tag=${params.IMAGE_TAG}"
            }
        }

    }
}

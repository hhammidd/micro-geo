properties([
  parameters([
    string(name: 'IMAGE_TAG', defaultValue: '11', description: 'Image TAG', ),
    string(name: 'branch', defaultValue: 'master', description: 'Which is the branch triggered', ),
    string(name: 'environment', defaultValue: 'sale_tst', description: 'Which cluster you need to deploy, sale_tst/sale_acc/sale_prd', ),
   ])
])

pipeline {
    environment {
        registry = "hhssaaffii/micro-geo"
        registryCredential = ''
        dockerImage = ''
    }
    agent any
    stages {
        stage("git checkout") {
            steps{
                git 'https://github.com/hhammidd/micro-geo.git'
            }
        }

        stage("build-test") {
            steps{
                sh "echo ${branch}"
//                 sh "echo ${branch}"
            }
        }
        stage("environment") {
                    steps{
                        sh "echo ${environment}"
        //                 sh "echo ${branch}"
                    }
                }
//         stage("build Image") {
//             steps{
//                 script {
//                     dockerImage = docker.build registry + ":$BUILD_NUMBER"
//                 }
//             }
//         }
//
//         stage("Push image") {
//             steps {
//                 script {
//                     docker.withRegistry( '' ) {
//                         dockerImage.push()
//                     }
//                 }
//             }
//         }

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


        stage("Install helm and deploy") {
            steps{
                sh " helm upgrade --install micro-geo  ~/apps/apps-helm-charts/micro-geo/ --set tag=${params.IMAGE_TAG}"
            }
        }
*/
    }
}

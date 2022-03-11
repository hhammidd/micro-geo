properties([
        parameters([
                string(name: 'service_name', defaultValue: 'micro-geo', description: 'Service-name',),
                string(name: 'IMAGE_TAG', defaultValue: '11', description: 'Image TAG',),
                string(name: 'branch', defaultValue: 'master', description: 'Which is the branch triggered',),
                string(name: 'environment', defaultValue: 'sale_tst', description: 'Which cluster you need to deploy, sale_tst/sale_acc/sale_prd',),
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
            steps {
                git 'https://github.com/hhammidd/${service_name}.git'
            }
        }


        stage("build-test") {
            steps {
                sh "mvn clean install"
//                 sh "echo ${branch}"
            }
        }
        stage("build Image") {
            steps {
                script {
//                     dockerImage = docker.build registry + "/$IMAGE" + ":$BUILD_NUMBER"
                    dockerImage = docker.build registry + ":${VERSION}"
                }
            }
        }

        stage("Push image") {
            steps {
                script {
                    docker.withRegistry('') {
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
            steps {
                // get the helm.yaml variables
                sh "git clone https://github.com/hhammidd/${IMAGE}.git  ~/apps/apps-helm-charts/helm-checkouts/${IMAGE}/1"

                // remove the dir
                sh "rm -rf ~/apps/apps-helm-charts/helm-checkouts/${IMAGE}/"
                sh "rm -rf ~/apps/apps-helm-charts/helm-checkouts/${IMAGE}/.git"

                // checkout last Chart
                sh "git clone https://github.com/hhammidd/Charts.git  ~/apps/apps-helm-charts/helm-checkouts/${IMAGE}"

                // replace spring boot helm.yml with value.yaml
                sh "cp ~/apps/apps-helm-charts/helm-checkouts/${IMAGE}/1/helm.yml ~/apps/apps-helm-charts/helm-checkouts/${IMAGE}/springboot-services/values.yaml"
                // remove unwanted code
                sh "rm -rf ~/apps/apps-helm-charts/helm-checkouts/${IMAGE}"
            }
        }

        stage("Install helm and deploy") {
            steps {
                sh " helm upgrade --install ${service_name}  ~/apps/apps-helm-charts/helm-checkouts/${IMAGE}/springboot-services --set tag=${VERSION}"
            }
        }

    }
}

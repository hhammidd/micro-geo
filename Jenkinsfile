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
                build("${service_name}", "${VERSION}")
            }
        }


        stage("Helm chart checkout") {
            steps {
                // remove the dir
                sh "rm -rf ~/apps/apps-helm-charts/helm-checkouts/${IMAGE}/charts"
                sh "rm -rf ~/apps/apps-helm-charts/helm-checkouts/${IMAGE}/charts/.git"
                sh "rm -rf ~/apps/apps-helm-charts/helm-checkouts/${IMAGE}/code"

                // get the helm.yaml variables
                sh "git clone https://github.com/hhammidd/${IMAGE}.git  ~/apps/apps-helm-charts/helm-checkouts/${IMAGE}/code"

                // checkout last Chart
                sh "git clone https://github.com/hhammidd/Charts.git  ~/apps/apps-helm-charts/helm-checkouts/${IMAGE}/charts"

                // replace spring boot helm.yml with value.yaml
                sh "cp ~/apps/apps-helm-charts/helm-checkouts/${IMAGE}/code/helm.yml ~/apps/apps-helm-charts/helm-checkouts/${IMAGE}/charts/springboot-services/values.yaml"

                // cpy secrets to chart dir
                sh "cp ~/apps/apps-helm-charts/secrets/${IMAGE}/secret.yaml ~/apps/apps-helm-charts/helm-checkouts/${IMAGE}/charts/springboot-services/templates"
                // remove unwanted code
                sh "rm -rf ~/apps/apps-helm-charts/helm-checkouts/${IMAGE}/code"
            }
        }

        stage("Install helm and deploy") {
            steps {
                sh " helm upgrade --install ${service_name}  ~/apps/apps-helm-charts/helm-checkouts/${IMAGE}/charts/springboot-services --set tag=${VERSION} --namespace=${environment}"
            }
        }

    }
}

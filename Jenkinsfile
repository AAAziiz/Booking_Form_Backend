pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        
        stage('test') {
            steps {
                sh 'mvn test'
            }
        }
        
        
        stage('SonarQube Scan') {
            steps {
                    withSonarQubeEnv(installationName : 'sq') {
                      sh 'mvn sonar:sonar'
                  }
                }
            }
        }
    }
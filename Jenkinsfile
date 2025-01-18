pipeline {
    agent any
    tools{ 
        maven 'Maven' 
      
    }
    environment { 
        SCANNER_HOME = tool 'MySonarqubeScanner'
    }
   
    stages{ 
         stage('Check Java Version') { 
            steps {
                sh 'java -version' 
                echo 'java version is :'
            }
        }

        stage('Build Application') {
            steps {
                script {
                    sh 'mvn clean install -DskipTests'  
                }
            }
        }


        stage("Sonarqube Analysis "){ 
                    steps{
                        withSonarQubeEnv('Sonarqube') {
                            sh ''' $SCANNER_HOME/bin/sonar-scanner -Dsonar.projectName=sonar-security-check \
                            -Dsonar.java.binaries=. \
                            -Dsonar.projectKey=sonar-security-check'''
                        }
                    }
                }

                /*stage("quality gate"){
                    steps {
                        script {
                          waitForQualityGate abortPipeline: true, credentialsId: 'sonar-token'
                        }
                   }
                *///}
        

        
        stage('OWASP Dependency-Check Vulnerabilities') {
      steps {
        dependencyCheck additionalArguments: '''                
                    -o './'
                    -s './target'
                    -f 'ALL' 
                    --prettyPrint
                    --log ./dependency-check-debug.log ''', odcInstallation: 'OWASP-DC'
        
        dependencyCheckPublisher pattern: 'dependency-check-report.xml'
      }
    }


               
        



          stage('Build and start Docker Compose Containers') {
             steps {
                    sh 'docker-compose up -d'
                }
            }




            stage('Push New Tagged images to Docker Hub') {

            steps {
                    withCredentials([usernamePassword(credentialsId: 'secret', usernameVariable: 'DOCKER_USERNAME', passwordVariable: 'DOCKER_PASSWORD')]) {
                    sh '''
                docker login -u ${DOCKER_USERNAME} -p ${DOCKER_PASSWORD} 
                docker tag app-back azziiz/security-check:latest
                docker push azziiz/security-check:latest

                
            '''
        }
    }
}
        
       
    }

}
   
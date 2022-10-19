pipeline{
    agent any
    stages {
    stage ('GIT Checkout'){
    steps {
        echo "getting project from git " ;
        git branch: 'fatima', url: 'https://github.com/trifieya/Continuous-integration-project.git'
    }
    }
        stage('Clean'){
            steps {
                sh 'mvn clean '
            }
            
        }
        
         stage('Compile'){
            steps {
                sh 'mvn compile -DskipTests'
            }
            
        }

stage ('UNIT Testing'){
        steps {
           
            sh 'mvn test'
        }
        }


  stage('SonarQube Analysis'){
                steps {
                    sh """mvn sonar:sonar -DskipTests \
                            -Dsonar.language=java \
                            -Dsonar.host.url=http://192.168.1.15:9000 
                            
                    """
                }
                
            }
        
        
        
        
        stage('Nexus'){
            steps{
                sh 'mvn deploy -DskipTests'
            }
        }
          
        


  }
}

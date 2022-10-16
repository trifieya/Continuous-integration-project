pipeline{
    agent any

    stages{


        stage('Cloning from GitHub') {
                steps {
                    git branch: 'samar', url: 'https://github.com/trifieya/Continuous-integration-project.git'
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

         stage('SonarQube Analysis'){
                steps {
                    sh """mvn sonar:sonar -DskipTests \
                            
                            
                            -Dsonar.sourceEncoding=UTF-8 \
                            -Dsonar.language=java \
                            -Dsonar.host.url=http://192.168.1.124:9000 
                            
                    """
                }
                
            }
        
        
        
        
        
        
       
        
        
       


    }
}

pipeline{
    agent any

    stages{


        stage('Cloning from GitHub') {
                steps {
                    git branch: 'samar', url: 'https://github.com/trifieya/Continuous-integration-project.git'
                }
                
            }
      
      stage('BUILD'){
            steps {
                sh 'mvn clean install -DskipTests'
            }
            
        }

        
        
        
        
        
        
       
        
        
       


    }
}

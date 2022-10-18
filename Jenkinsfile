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
        
        
         stage('UNIT test'){
            steps{
                sh 'mvn test'
            }
        }

         stage('SonarQube Analysis'){
                steps {
                    sh """mvn sonar:sonar -DskipTests \
                            -Dsonar.language=java \
                            -Dsonar.host.url=http://192.168.1.124:9000 
                            
                    """
                }
                
            }
        
        
        
        
        stage('Nexus'){
            steps{
                sh 'mvn deploy -DskipTests'
            }
        }
        
        
        
        stage('email'){
 
            steps {

                    mail bcc: '', 
                        body: ''' Bonjour Samar,
                                  le pipeline a correctement marché
                                  Cordialement''', 
                        cc: '', 
                        from: '',
                        replyTo: '',
                        subject: 'Mailing CI', 
                        to: 'samar.belhadj9@gmail.com'
    
 }}
        
        
        

        
        
        
        
        
        
       
        
        
       


    }
}

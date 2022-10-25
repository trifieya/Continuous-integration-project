pipeline{
    agent any
    tools {
        maven 'M2_HOME'
    }
    stages {
      
        
        stage ('GIT') {
            steps {
               echo "Getting Project from Git"; 
                git branch: "fatimaab", 
                    url: "https://github.com/trifieya/Continuous-integration-project.git"; 
            }
        }

       stage('Docker build')
        {
            steps {
                 sh 'docker build -t fatimaabdawa1/projet  .'
            }
        }
        stage('Docker login')
        {
            steps {
                sh 'echo $dockerhub_PSW | docker login -u fatimaabdawa1 -p dckr_pat_4E0y6AqhIMzcAZdnGIwxqa1WSr4'
            }    
       
        }
      stage('Push') {

			steps {
				sh 'docker push fatimaabdawa1/projet'
			}
		}
       stage('DockerCompose') {
        
                       steps {
                                sh 'cd /var/lib/jenkins/workspace/CD-FAT'
				sh 'docker-compose up -d'
                        }
                          
        }
       
       
       
   
       
       

     
}
}

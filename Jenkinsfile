pipeline{
    agent any
    stages {
    stage ('GIT Checkout'){
    steps {
        echo "getting project from git " ;
        git branch: 'fatima', url: 'https://github.com/trifieya/Continuous-integration-project.git'
    }
    }
       
stage ('SONARQUBE') {
    steps {
        sh 'mvn sonar:sonar -Dsonar.login=admin -Dsonar.password=sonar'
    }
} 
    
stage ('UNIT Testing'){
        steps {
           
            sh 'mvn test'
        }
        }



           stage ('Integration Test'){
        steps {
            
            sh 'mvn verify -DskipUnitTests'
        }
        }


  }
}

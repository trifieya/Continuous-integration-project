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


  stage ('SONARQUBE') {
    steps {
        sh 'mvn sonar:sonar -Dsonar.login=admin -Dsonar.password=sonar'
    }
} 





        stage('Nexus'){
            steps{
                sh 'mvn deploy -DskipTests'
            }
        }




  }
}

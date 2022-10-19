pipeline{
    agent any
    stages {
    stage ('GIT Checkout'){
    steps {
        echo "getting project from git " ;
        git branch: 'fatima', url: 'https://github.com/trifieya/Continuous-integration-project.git'
    }
    }
        stage ('UNIT Testing'){
        steps {
            echo "getting project from git " ;
            sh 'mvn test'
        }
        }

  }
}

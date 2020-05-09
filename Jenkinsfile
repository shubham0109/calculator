pipeline {
  agent any
  stages 
    {
    stage('Clean') {
      steps {
        bash 'mvn clean'
      }
    }
    stage('Compile') {
      steps {
        bash 'mvn compile'
      }
    }
    stage('Test') {
      steps {
        bash 'mvn test'
      }
    }
  }
}

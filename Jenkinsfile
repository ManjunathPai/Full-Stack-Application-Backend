pipeline {
  agent any
  stages {
    stage('Tool Version') {
      parallel {
        stage('Tool Version') {
          steps {
            bat(script: 'mvn -version', returnStatus: true, returnStdout: true)
          }
        }

        stage('check for pom') {
          steps {
            fileExists 'pom.xml'
          }
        }

      }
    }

    stage('Build') {
      steps {
        bat 'mvn clean install'
      }
    }

    stage('Post Build') {
      steps {
        echo 'Build is success'
      }
    }

  }
}
pipeline {
  agent any
  stages {
    stage('Tool Version') {
      parallel {
        stage('Tool Version') {
          steps {
            bat(script: 'java -version', returnStatus: true, returnStdout: true)
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
        sh 'mvn compile test package'
      }
    }

    stage('Post Build') {
      steps {
        echo 'Build is success'
      }
    }

  }
}
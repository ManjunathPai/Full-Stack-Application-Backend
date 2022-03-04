pipeline {
  agent any
  stages {
    stage('Tool Version') {
      parallel {
        stage('Tool Version') {
          steps {
            sh '''java -version
'''
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
pipeline {
  agent any
  stages {
    stage('Version Info') {
      parallel {
        stage('Version Info') {
          steps {
            bat(script: 'mvn -version', returnStatus: true, returnStdout: true)
            bat(script: 'mvn -version', returnStatus: true, returnStdout: true, label: 'Maven version')
          }
        }

        stage('POM exists or not') {
          steps {
            fileExists 'pom.xml'
          }
        }

      }
    }

    stage('Build It') {
      steps {
        bat(script: 'mvn clean install', returnStatus: true, returnStdout: true)
      }
    }

    stage('Post Build') {
      steps {
        writeFile(file: 'status.txt', text: 'Successfully built the project.!')
      }
    }

  }
}
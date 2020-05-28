pipeline {
  agent any
  stages {
    stage('clean') {
      agent {
        node {
          label 'main'
        }

      }
      steps {
        echo 'Going to clean workspace'
        pwd(tmp: true)
        dir(path: '/home/pi/buildWS')
      }
    }

  }
}
pipeline {
  agent any
  stages {
    stage('clean') {
      agent any
      steps {
        echo 'Going to clean workspace'
        pwd(tmp: true)
        dir(path: '/home/pi/buildWS')
        sh 'rm -r *.*'
      }
    }

  }
}
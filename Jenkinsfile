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
    stage('build') {
      agent any
      steps {
        echo 'Going to build application'
      }
    }
    stage('test') {
      agent any
      steps {
        echo 'Going to test application'
      }
    }
    stage('deploy') {
      agent any
      steps {
        echo 'Going to deploy application'
      }
    }
  }
}

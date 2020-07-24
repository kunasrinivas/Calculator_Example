pipeline {
  agent any
  options {
        ansiColor('xterm')
   }
  parameters { choice(name: 'Environment', choices: ['dev', 'test', 'pre-prod'], description: '') }
  stages {
    stage('clean') {
      agent any
      steps {
        echo 'Going to clean workspace'
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

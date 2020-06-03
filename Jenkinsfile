pipeline {
   agent any
      environment {
           BROWSER = 'REMOTE'
       }

   stages {
      stage('checkout') {
         steps {
            checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/QA-Learning/OWASPJuiceShopUITests']]])
         }
      }

      stage('Maven installation') {
         steps {
             sh 'mvn clean test'
        }
      }
   }
}

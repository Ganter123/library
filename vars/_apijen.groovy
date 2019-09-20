#!/usr/bin/env groovy

def call(){
 
  pipeline {
    agent any
     
    stages {       
        stage ('pre-build') {           
            steps {
                     sh 'npm install'
                       
            }
        }
        stage('checkstyle') {
            steps {                    
                    _checkstylecommand()                    
            }
        }
   stage ('cobertura') {
            steps {
                    _coberturacommand()         
            }
        }
     stage ('sonarqube') {
            steps {
                     sh 'npm install sonarqube-scanner --save-dev' 
        }    
    }   
    }
post {
   failure {
      email()
      }
  success {
      _cobertura()
      
      }
   always {       
       _addBadge()  
       _checkstyle()
       _sonar()
     // _cobertura()
   } 
  }
 
  }
}

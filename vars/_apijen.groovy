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
        stage('eslint') {
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
                     _sonarscanner()                    
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
       _sonarqube()
   } 
  }
 }

}

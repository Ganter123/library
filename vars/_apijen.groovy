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
     
     stage ('flock') {
      steps { 
          flock('flock-token:', [text: "Hello there! Check out the last build:\n$BUILD_URL"]) 
         }
      
     } 
     
     stage ('flocknotity') {
     steps { 
         
      FLOCK_MESSAGE { hello }
     //   Branch <b><a href='${URL_BRANCH}'>${DEPLOYED_BRANCH}</a></b> has been deployed<br/>
      //  MSS:         <b><a href='${URL_JENKINS}'>${DEPLOYED_MSS}</a></b><br/>
      //  Environment: <b>${ENV}</b><br/>
       // </flockml>""".stripIndent()
                 
     }
     }
     
   /*  stage ('sonarqube') {
            steps {
                     sh 'npm install sonarqube-scanner --save-dev'
                     
             
        }    
    }*/   
     
     
    }
 
   
  post {
   failure {
      _email()
      }
  success {
      _cobertura()
      
      }
   always {       
       _addBadge()  
       _checkstyle()
    //   _sonar()
       _email()
     
       
   } 
  }
 }

}

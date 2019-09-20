#!/usr/bin/env groovy

def call(){
 
withSonarQubeEnv('sonar1') {
                sh 'node sonar-project.js'
                   }
 
}

                  
  

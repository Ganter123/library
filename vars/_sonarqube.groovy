#!/usr/bin/env groovy


def call() {
withSonarQubeEnv(credentialsId: 'b78769d3-9b80-44f7-a4e3-34e9e803ccd7') {
    withSonarQubeEnv('sonar1') {
                sh 'node sonar-project.js'
                   
                    }
                 }
              }
                  
  

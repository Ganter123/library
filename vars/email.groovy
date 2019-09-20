#!/usr/bin/env groovy

def call() {
mail bcc: '', body: 'failed', cc: '', from: '', replyTo: '', subject: 'Build failed in Jenkins: $PROJECT_NAME - #$BUILD_NUMBER', to: 'darpan.patel@volansys.com' 
}
 

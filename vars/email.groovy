#!/usr/bin/env groovy

def call() {
  mail bcc: '', body: 'Check console output at $BUILD_URL to view the results. \\n\\n ${CHANGES} \\n\\n -------------------------------------------------- \\n${BUILD_LOG, maxLines=100, escapeHtml=false}', cc: 'sachin.pavar@volansys.com', from: '', replyTo: '', subject: 'Build failed in Jenkins: $PROJECT_NAME - #$BUILD_NUMBER', to: 'darpan.patel@volansys.com'
}
 

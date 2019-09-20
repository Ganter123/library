#!/usr/bin/env groovy

def call(){

emailext attachLog: true, body: '''Hello,
your current build status is failed. please check the log here ${BUILD_URL}.  
thanks''', compressLog: true, subject: 'build is failed. please check the log', to: 'darpan.patel@volansys.com'

}

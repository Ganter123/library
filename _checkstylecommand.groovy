#!/usr/bin/env groovy

def call(){

  sh './node_modules/.bin/eslint -f checkstyle --ignore-path .gitignore . --fix > eslint.xml'

}

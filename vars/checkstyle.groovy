#!/usr/bin/env groovy

def call() {
 sh'npm install'

 checkstyle canComputeNew: false, defaultEncoding: '', healthy: '', pattern: ' checkstyle pattern: \'eslint.xml\'', unHealthy: ''
 
}

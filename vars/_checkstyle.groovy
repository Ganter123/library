#!/usr/bin/env groovy

def call() {
 

checkstyle canComputeNew: false, defaultEncoding: '', healthy: '', pattern: 'eslint.xml', unHealthy: ''
 
}

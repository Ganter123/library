#!/usr/bin/env groovy

def call() {

 checkstyle canComputeNew: false, defaultEncoding: '', healthy: '', pattern: ' checkstyle pattern: \'eslint.xml\'', unHealthy: ''
 
}

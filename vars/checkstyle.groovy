#!/usr/bin/env groovy
def call() {
 checkstyle canComputeNew: false, defaultEncoding: '', healthy: '', pattern: './node_modules/.bin/eslint -f checkstyle --ignore-path .gitignore . --fix > eslint.xml\'', unHealthy: ''
}

 #!/usr/bin/env groovy
 def call () {

flock('flock-token:', [text: "Hello there! Check out the last build:\n$BUILD_URL"])
}

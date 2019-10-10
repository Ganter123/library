 #!/usr/bin/env groovy




  def call () {
        FLOCK_MESSAGE = """<flockml>
        Branch <b><a href='${URL_BRANCH}'>${DEPLOYED_BRANCH}</a></b> has been deployed<br/>
        MSS:         <b><a href='${URL_JENKINS}'>${DEPLOYED_MSS}</a></b><br/>
        Environment: <b>${ENV}</b><br/>
        </flockml>""".stripIndent()
        }


 

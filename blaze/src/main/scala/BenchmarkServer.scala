package blaze.techempower

import blaze.{Controller, Server}

object BenchmarkServer extends Server {

  register(new Controller {

    /**
     * JSON Serialization
     */
    get("/json") { request =>
      respond.json(Map("message" -> "Hello, World!"))
    }

  })

}
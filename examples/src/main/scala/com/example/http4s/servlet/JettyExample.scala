package com.example.http4s
package servlet

import com.example.http4s.ExampleService
import org.http4s.jetty.JettyServer

object JettyExample extends App {
  JettyServer.newBuilder
    .withHost("0.0.0.0")
    .mountService(ExampleService.service, "/http4s")
    .mountServlet(new RawServlet, "/raw/*")
    .run()
    .join()
}

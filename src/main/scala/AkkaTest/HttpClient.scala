package AkkaTest

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.model.{HttpRequest, HttpResponse}
import akka.stream.ActorMaterializer

import scala.concurrent.Future

/**
  * Created by arthur on 16-11-6.
  * this is a simple of http client
  */
object HttpClient {
  def main(args: Array[String]): Unit = {
    implicit val system = ActorSystem()
    implicit val materializer = ActorMaterializer()
    val responseFuture: Future[HttpResponse] =
      Http().singleRequest(HttpRequest(uri = "http://akka.io"))
    println(responseFuture)
  }

}

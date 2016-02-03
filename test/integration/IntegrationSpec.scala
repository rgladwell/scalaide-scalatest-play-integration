package integration

import play.api.test._
import play.api.test.Helpers._
import play.api.libs.ws._
import org.scalatest._
import org.scalatestplus.play.OneServerPerSuite

class IntegrationSpec  extends WordSpec with Matchers with OneServerPerSuite {

  "Application" should {

    "mount assets" in {
      val response = await(WS.url(s"http://localhost:$port/assets/images/favicon.png").withFollowRedirects(false).get())
      response.status shouldBe (OK)
    }
  }
}

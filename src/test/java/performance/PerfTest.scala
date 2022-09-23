package performance

import com.intuit.karate.gatling.PreDef._
import io.gatling.core.Predef._
import scala.concurrent.duration._

class PerfTest extends Simulation {

  val protocol = karateProtocol()

  val users_test = scenario("Example API Test").exec(karateFeature("classpath:examples/users/users.feature"))


  setUp(
    users_test.inject(atOnceUsers(10)).protocols(protocol),
    //users_test.inject(rampUsers(50) during (20 seconds)).protocols(protocol)
  )
}
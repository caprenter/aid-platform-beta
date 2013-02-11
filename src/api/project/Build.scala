import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "api"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Application Dependencies
    "com.tzavellas" % "sse-guice"    % "0.7.0",
    "org.neo4j"     % "neo4j-kernel" % "1.8.1",
    "org.neo4j"     % "neo4j-cypher" % "1.8.1",

    // Testing Dependencies
    "org.mockito"       %  "mockito-all"   % "1.9.5" % "test"
  )

  val main = play.Project(appName, appVersion, appDependencies).settings()
}

import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

    val appName         = "websocket-chat"
    val appVersion      = "1.0.1"

    val appDependencies = Seq(
      // Add your project dependencies here,
      "uk.co.panaxiom" %% "play-dubsub" % "0.3-SNAPSHOT"
    )

    val main = play.Project(appName, appVersion, appDependencies).settings(
      // Add your own project settings here
      resolvers += Resolver.url("Alex's GitHub Repository", url("http://alexanderjarvis.github.com/snapshots/"))(Resolver.ivyStylePatterns)
    )

}

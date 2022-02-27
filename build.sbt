ThisBuild / scalaVersion := "3.1.1"

val AkkaVersion = "2.6.8"
val AkkaHttpVersion = "10.2.8"

libraryDependencies ++= Seq(
  "com.typesafe.akka" % "akka-actor-typed_2.13" % AkkaVersion,
  "com.typesafe.akka" % "akka-stream_2.13" % AkkaVersion,
  "com.typesafe.akka" % "akka-http_2.13" % AkkaHttpVersion
)


lazy val app = (project in file("."))
    .enablePlugins(JavaAppPackaging)
    .settings(
        mainClass := Some("main"),
    )

/*
val stage = taskKey[Unit]("Stage task")

val Stage = config("stage")

stage := {
  (packageWar in Compile).value
  (update in Stage).value.allFiles.foreach { f =>
    if (f.getName.matches("webapp-runner-[0-9\\.]+.jar")) {
      println("copying " + f.getName)
      IO.copyFile(f, baseDirectory.value / "target" / "webapp-runner.jar")
    }
  }
}
*/
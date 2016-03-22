lazy val root = (project in file(".")).
  settings(
    organization := "ro.cosminene",
    name := "employee-profile",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := "2.11.8",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-actor" % "2.4.2"
    )
  )

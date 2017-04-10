name := "$name$"

version := "$applicationVersion$"

scalaVersion := "$scalaVersion$"

libraryDependencies ++= Seq(
  "javax.servlet" % "javax.servlet-api" % "3.1.0" % "provided",
  "org.scalatest" %% "scalatest" % "3.0.1" % "test"
)

enablePlugins(JettyPlugin)

containerPort := 18080

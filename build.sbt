name := "RESTClient"

version := "0.1"

scalaVersion := "2.12.4"

val akkaVersion = "2.6.17"
val akkaHttpVersion = "10.2.6"
val typesafeConfigVersion = "1.4.1"


libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-stream" % akkaVersion,
  "com.typesafe.akka" %% "akka-http" % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpVersion,
  "com.typesafe" % "config" % typesafeConfigVersion,
)
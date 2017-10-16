val options = Def.setting(Seq(
  "-Xlint",
  "-unchecked",
  "-deprecation",
  "-feature",
  "-P:scalajs:sjsDefinedByDefault"
))

lazy val root = (project in file("."))
  .settings(
    name := "scalajs-jointjs-facade",
    version := "0.1",
    organization := "uk.co.callhandling",
    scalaVersion := "2.12.3",
    scalacOptions ++= options.value
  )
  .settings(
    libraryDependencies ++= Seq(
      "org.scala-js" %%% "scalajs-dom" % "0.9.2",
      "org.querki" %%% "querki-jsext" % "0.8",
      "be.doeraene" %%% "scalajs-jquery" % "0.9.2"
    )
  ).enablePlugins(ScalaJSPlugin)
lazy val `sbt-6925` = project
  .in(file("."))
  .settings(
    scalaVersion := "2.12.15",
    scriptedBufferLog := false
  )
  .enablePlugins(ScriptedPlugin)

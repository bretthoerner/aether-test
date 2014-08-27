organization := "aether-test"

name := "aether-test"

version := "1.0.0"

scalaVersion := "2.10.4"

publishTo := {
  val nexus = "http://localhost:8081/nexus/"
  if (version.value.trim.endsWith("SNAPSHOT"))
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "content/repositories/releases")
}

aetherPublishBothSettings


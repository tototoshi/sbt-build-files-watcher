name := "sbt-build-files-watcher"

organization := "com.github.tototoshi"

version := "0.1.2-SNAPSHOT"

sbtPlugin := true

publishMavenStyle := true

publishArtifact in Test := false

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (version.value.trim.endsWith("SNAPSHOT")) Some("snapshots" at nexus + "content/repositories/snapshots")
  else Some("releases" at nexus + "service/local/staging/deploy/maven2")
}

pomExtra := {
<url>http://github.com/tototoshi/sbt-build-files-watcher</url>
<licenses>
  <license>
    <name>Apache License, Version 2.0</name>
    <url>http://www.apache.org/licenses/LICENSE-2.0.html</url>
    <distribution>repo</distribution>
  </license>
</licenses>
<scm>
  <url>git@github.com:tototoshi/scala-build-files-watcher</url>
  <connection>scm:git:git@github.com:tototoshi/sbt-build-files-watcher.git</connection>
</scm>
<developers>
  <developer>
    <id>tototoshi</id>
    <name>Toshiyuki Takahashi</name>
    <url>http://tototoshi.github.io</url>
  </developer>
</developers>
}

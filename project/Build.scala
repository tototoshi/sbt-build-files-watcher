import sbt._
import sbt.Keys._

object PluginBuild extends Build {

  lazy val root = Project(
    id = "sbt-build-files-watcher",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "sbt-build-files-watcher",
      organization := "com.github.tototoshi",
      version := "0.1.0-SNAPSHOT",
      sbtPlugin := true
    ) ++ publishingSettings
  )

  val publishingSettings = Seq(
    publishMavenStyle := true,
    publishTo <<= version { (v: String) => _publishTo(v) },
    publishArtifact in Test := false,
    pomExtra := _pomExtra
  )

  def _publishTo(v: String) = {
    val nexus = "https://oss.sonatype.org/"
    if (v.trim.endsWith("SNAPSHOT")) Some("snapshots" at nexus + "content/repositories/snapshots")
    else Some("releases" at nexus + "service/local/staging/deploy/maven2")
  }

  val _pomExtra =
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

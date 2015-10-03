# sbt-build-files-watcher

![screenshot](./screenshot.png)

## Install

```scala
// ~/.sbt/0.13/plugins/build.sbt
addSbtPlugin("com.github.tototoshi" % "sbt-build-files-watcher" % "0.1.1")
```

## Usage

```scala
// ~/.sbt/0.13/build.sbt
showMessageOnBuildFilesChanged
```

with sbt-git
```scala
shellPrompt := { state =>
  messageOnBuildFilesChanged(state) + GitCommand.prompt(state)
}
```

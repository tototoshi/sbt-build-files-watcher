# sbt-build-files-watcher

## Install

```scala
addSbtPlugin("com.github.tototoshi" % "sbt-build-files-watcher" % "0.1.1")
```

## Usage

```
// build.sbt
showMessageOnBuildFilesChanged
```

with sbt-git
```
shellPrompt := { state =>
  messageOnBuildFilesChanged(state) + GitCommand.prompt(state)
}
```

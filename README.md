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

The message printed when the build files have changed can be customized by changing the ```reloadMessage``` setting:
 ```scala
 reloadMessage := scala.Console.RED + "Build files changed. Please reload." + scala.Console.RESET + "\n"
 ```

seq(blaze.sbt.BlazePlugin.blazeSettings: _*)

organization := "org.blazeproject"

name := "blaze-benchmark-app"

version := "0.0.1"

scalaVersion := "2.10.3"

scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked")

libraryDependencies ++= Seq(
  "org.blazeproject"      %% "blaze"            % "0.0.1-SNAPSHOT"
)

resolvers ++= Seq(
  "blaze snapshots" at "http://blaze-snapshots.s3.amazonaws.com/",
  "blaze releases" at "http://blaze-releases.s3.amazonaws.com/"
)

addCommandAlias("stage", ";web-stage;assembly")
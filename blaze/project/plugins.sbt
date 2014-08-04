resolvers ++= Seq(
  "blaze snapshots" at "http://blaze-snapshots.s3.amazonaws.com/",
  "blaze releases" at "http://blaze-releases.s3.amazonaws.com/",
  "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/",
  "Typesafe snapshots" at "http://repo.typesafe.com/typesafe/snapshots/",
  "Era7 maven releases" at "http://releases.era7.com.s3.amazonaws.com" // sbt-s3-resolver
)

addSbtPlugin("org.blazeproject" %% "blaze-sbt" % "0.0.1-SNAPSHOT")

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.10.2")

addSbtPlugin("ohnosequences" % "sbt-s3-resolver" % "0.7.0")
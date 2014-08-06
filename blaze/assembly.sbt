import AssemblyKeys._

assemblySettings

mergeStrategy in assembly <<= (mergeStrategy in assembly) { (old) =>
  {
    case PathList("com", "esotericsoftware", cem @ _*)    => MergeStrategy.first
    case PathList("org", "objectweb", "asm", ooa @ _*)    => MergeStrategy.first
    case "application.conf"                               => MergeStrategy.first
    case "META-INF/mime.types"                            => MergeStrategy.first
    case "META-INF/io.netty.versions.properties"          => MergeStrategy.first
    case PathList("io", "netty", ion @ _*)                => MergeStrategy.first
    case x                                                => old(x)
  }
}
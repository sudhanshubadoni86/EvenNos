name:="EvenNumbers"
version:="1.0"
scalaVersion:="2.10.4"
libraryDependencies ++= Seq("org.apache.spark" %% "spark-core" % "1.4.0","org.apache.spark" %% "spark-mllib" % "1.4.0")
resolvers += Resolver.url("bintray-sbt-plugins", url("http://dl.bintray.com/sbt/sbt-plugin-releases"))(Resolver.ivyStylePatterns)
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.0")
//resourceDirectory in Compile := baseDirectory.value / "resources"
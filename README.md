# mongoDB3.0.0_javadriver
Use of MongoDb 3.0.0 with mongo-java-driver &amp; 3.0.0-SNAPSHOT

step1 - In maven xml (pom.xml) place following dependency:

<dependencies>
 <dependency>
          <groupId>org.mongodb</groupId>
          <artifactId>mongo-java-driver</artifactId>
          <version>3.0.0-SNAPSHOT</version>
      </dependency>
      ....
  </dependencies>

  step2 - Use the class code as sample code

  NOTE: if you use IntelliJ editor required classes will be imported itself, else place cursor on class name and press Alt + Enter
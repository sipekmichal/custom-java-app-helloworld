custom.java.app.helloworld
=======================

This is "Hello World" Example for Java.

The structure ``HelloWorld`` package is like this: ::

  custom.java.app.helloworld/
  |-- HelloWorld
  |   `-- Main.java
  `-- README.rst

Compile class
-------------

For compile the main class for package, execute the follow command: ::

  javac HelloWorld/Main.java

This generate the ``Main.class`` file into ``HelloWorld`` directory.

Run class
---------

For run the main class for package, execute the follow command: ::

  java -cp . HelloWorld.Main

This show the ``Hello world`` message.

Create a JAR file
-----------------

For pack the main class for package as a JAR file, execute the follow command: ::

  jar cfme Main.jar HelloWorld.Main HelloWorld/Main.class


Run a JAR file
--------------

For run the JAR file packed, execute the follow command: ::

  java -jar Main.jar

This show the ``Hello world`` message.

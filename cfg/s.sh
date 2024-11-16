#!/bin/bash


# UNCOMMENT THIS ELISE FOR TURN IN 
cd ./homework4

javac -cp asm-9.7.1.jar:asm-tree-9.7.1.jar *.java

# java -cp asm-9.7.1.jar:asm-tree-9.7.1.jar:. cfgtool.java hardtests.java
java -cp asm-9.7.1.jar:asm-tree-9.7.1.jar:. cfgtool.java homework4main.java
# java -cp asm-9.7.1.jar:asm-tree-9.7.1.jar:. cfgtool.java inclassex.java
# java -cp asm-9.7.1.jar:asm-tree-9.7.1.jar:. cfgtool.java firstinstructtest.java

#!/bin/bash


# cd ./../

# sed -i 's/report.txt\");/report_mine.txt\");/g' ./jpf-core/src/main/gov/nasa/jpf/listener/ChoiceTracker.java







# UNCOMMENT THIS ELISE FOR TURN IN 
# cd ./homework4








# echo "note: please place your test files in homework3 folder"
# read -p "Enter your test file name: " filename  # The '-p' flag allows you to provide a prompt

# echo "Done running your test files."

javac -cp asm-9.7.1.jar:asm-tree-9.7.1.jar *.java

# java -cp asm-9.7.1.jar:asm-tree-9.7.1.jar:. cfgtool.java hardtests.java
# java -cp asm-9.7.1.jar:asm-tree-9.7.1.jar:. cfgtool.java homework4main.java
# java -cp asm-9.7.1.jar:asm-tree-9.7.1.jar:. cfgtool.java inclassex.java
java -cp asm-9.7.1.jar:asm-tree-9.7.1.jar:. cfgtool.java firstinstructtest.java

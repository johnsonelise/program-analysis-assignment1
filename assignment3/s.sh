#!/bin/bash
cd ./homework3

javac AElise.java BElise.java CElise.java HelloWorld_elise.java 

cd ./../

sed -i 's/report.txt\");/report_mine.txt\");/g' ./jpf-core/src/main/gov/nasa/jpf/listener/ChoiceTracker.java

javac -cp ./jpf-core/build/jpf.jar:./jpf-core/build/classes:. ./jpf-core/src/main/gov/nasa/jpf/listener/ChoiceTracker.java

cd ./jpf-core

./gradlew

cd ..

java -cp ./jpf-core/build/jpf.jar gov.nasa.jpf.tool.RunJPF ./jpf-core/HelloWorld_elise.jpf

sed -i 's/report_mine.txt\");/report.txt\");/g' ./jpf-core/src/main/gov/nasa/jpf/listener/ChoiceTracker.java
 
echo "Done running my test files."

echo "note: please place your test files in homework3 folder"
read -p "Enter your test file name: " filename  # The '-p' flag allows you to provide a prompt

cd ./homework3

javac "$filename".java

cd ./../

javac -cp ./jpf-core/build/jpf.jar:./jpf-core/build/classes:. ./jpf-core/src/main/gov/nasa/jpf/listener/ChoiceTracker.java

cd ./jpf-core

./gradlew

cd ..

sed -i "s/HelloWorld_elise/$filename/g" ./test2.jpf

java -cp ./jpf-core/build/jpf.jar gov.nasa.jpf.tool.RunJPF ./test2.jpf

sed -i "s/$filename/HelloWorld_elise/g" ./test2.jpf

echo "Done running your test files."
#!/bin/bash

# Name of your C file
input_files=(maindriver.java maindriver2.java maindriver3.java maindriver4.java maindriver5.java)
compiled_files=(test test2 test3 test4 test5)
expected_response=("Columns not created before" "+ only used with integers" "+ only used with integers" "+ only used with integers" "Passes")

# Compile the C file

for ((i = 0; i < ${#input_files[@]}; i++)); do
    echo $item
    javac -cp antlr-4.7.2-complete.jar:. ${input_files[i]}

    # Check if the compilation was successful
    if [ $? -eq 0 ]; then
        # echo "Compilation successful!"
        # Run the executable
        echo ${expected_response[i]}
        echo " "
        java -cp antlr-4.7.2-complete.jar:. ${compiled_files[i]}
        echo "${input_files[i]} done"
    else
        echo "script error"
    fi
done

echo "all done!"

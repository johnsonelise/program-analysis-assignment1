#!/bin/bash

# Name of your C file
FILE_NAME="../clang/test/elise-tests/elise-expresssion-tests.c"

# Name of the output executable
OUTPUT_NAME="elise_tests"

# Compile the C file
./bin/clang -o $OUTPUT_NAME $FILE_NAME

# Check if the compilation was successful
if [ $? -eq 0 ]; then
    echo "Compilation successful!"
    # Run the executable
    ./$OUTPUT_NAME
    echo "Run successful"
else
    echo "Compilation failed."
fi

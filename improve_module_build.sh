#!/bin/bash
if [ ! -n "$1" ];then
    echo "please specify the module:"
    echo "1.graphx"
    echo "2.core"
    echo "3.assembly"
    echo "4.launcher"
    echo "5.mllib"
    echo "6.mllib-local"
    echo "7.repl"
    echo "8.streaming"
    echo "9.tools"
    exit -1
fi
Module=$1
mvn -T 8 -pl ${Module} -am -DskipTests package

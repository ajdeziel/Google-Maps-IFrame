#!/bin/bash


javac -d classes ScrapTester.java

java -cp $CLASSPATH:classes/ org.junit.runner.JUnitCore ScrapTester

read -rsp $'Press any key or wait 1 minute to continue...\n' -n 1 -t 60;

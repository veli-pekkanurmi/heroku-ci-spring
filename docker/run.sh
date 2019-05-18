#!/bin/sh
java -Xms256m -Xmx256m -Xss512k -Dspring.profiles.active=$1 -jar app.jar


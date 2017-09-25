#!/bin/bash
#./build/mvn -T8 -pl :spark-assembly_2.11 -Pyarn -Phadoop-2.6 -Dhadoop.version=2.6.0 -DskipTests clean install
#mvn -T8 -Pyarn -Phadoop-2.6 -Dhadoop.version=2.6.0 -DskipTests  -Dmaven.javadoc.skip=true clean install
#mvn -T8 -pl :spark-core_2.11 -Pyarn -Phadoop-2.6 -Dhadoop.version=2.6.0 -DskipTests  -Dmaven.javadoc.skip=true clean install -
mvn -T8 -pl :spark-assembly_2.11 -Pyarn -Phadoop-2.6 -Dhadoop.version=2.6.0 clean install -DskipTests  -Dmaven.javadoc.skip=true -Dcheckstyle.skip

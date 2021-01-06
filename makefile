all:
	javac -cp "antlr-4.9-complete.jar" src/*.java gen/*.java

run:
	java -cp "antlr-4.9-complete.jar;gen;src" Main
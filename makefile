all:
	rm -r -f ./out
	mkdir ./out
	javac -sourcepath ./src -d ./out src/my/Presenter/SimpleCalculator.java
clean:
	rm -r -f ./out
javadoc:
	rm -r -f ./doc
	javadoc -d ./doc -sourcepath ./src -cp ./out -subpackages my Presenter.SimpleCalculator
run:
	java -classpath ./out my.Presenter.SimpleCalculator	

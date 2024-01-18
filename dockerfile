FROM amazoncorretto:latest
COPY ./src ./src
RUN mkdir ./out
RUN javac -sourcepath ./src -d ./out ./src/my/Presenter/SimpleCalculator.java
RUN ls -la src/my/Presenter
RUN mkdir ./doc
RUN java -classpath ./out my.Presenter.SimpleCalculator
RUN javadoc -d ./doc -sourcepath ./src -cp ./out -subpackages my
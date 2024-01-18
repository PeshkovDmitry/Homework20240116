FROM bellsoft/liberica-openjdk-alpine:11.0.0-x86_64
COPY ./src ./src
RUN mkdir ./out
RUN javac -sourcepath ./src -d ./out ./src/my/Presenter/SimpleCalculator.java
RUN mkdir ./doc
RUN java -classpath ./out my.Presenter.SimpleCalculator
RUN javadoc -d ./doc -sourcepath ./src/my -cp ./out -subpackages my Presenter.SimpleCalculator
RUN ls -la ./doc
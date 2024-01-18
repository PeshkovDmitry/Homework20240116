FROM bellsoft/liberica-openjdk-alpine:latest
COPY ./src ./src
RUN mkdir ./out
RUN javac -sourcepath ./src -d ./out ./src/my/Presenter/SimpleCalculator.java
RUN mkdir ./doc
RUN javadoc -d ./doc -sourcepath ./src -cp ./out -subpackages my
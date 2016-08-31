FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/try_hiccup.jar /try_hiccup/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/try_hiccup/app.jar"]

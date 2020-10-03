# Roomie

I am welcoming in nature and help people when they visit.

## How to start
- Package the app using `lein uberjar`. This shall put a file called
  `roomie.jar` in your `target` directory.
- Run the app using `java -jar target/roomie.jar` where target is the
  name of the directory where the jar is installed.

## API

### POST 'v1/events?challenge=some%20challenging%20parameter'
---
200 OK
{"some challenging parameter"}

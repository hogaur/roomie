# Roomie

I am welcoming in nature and help people when they visit. I am a
finder's tool. I look into a wiki and its documents to find the best one that suits
your needs.

I am written in Clojure. I will be deployed using a docker image.

The minimum usable version of this product will return a doc link, given
search keywords and a wiki. You can ask roomie to find docs if you
have multiple repositories where your documents are spread or you have
too many documents.

Later, Roomie can integrated with slack to increase developer
productivity.

In case of questions, you can reach out to me at https://twitter.com/hogaur

## Setup

(For mac users only, assumes that `java` command is available on the path)
- Install Clojure: `brew install clojure/tools/clojure`
- Install leiningen: `brew install leiningen`
- Package the app using `lein uberjar`. This shall put a file called
  `roomie.jar` in your `target` directory.
- Run the app using `java -jar target/roomie.jar` where target is the
  name of the directory where the jar is installed.

## APIs

### GET '/v1/roomie?wiki=<wiki>&keyword=<keyword>'
200 OK
{"link": <link>}

### POST 'v1/events?challenge=some%20challenging%20parameter'
---
200 OK
{"some challenging parameter"}

To contribute, please read and follow this [How to Github](https://www.gun.io/blog/how-to-github-fork-branch-and-pull-request) blog post.

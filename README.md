# internet-of-thing-server

An AWS Lambda function for reporting information triggered by an Amazon IoT button, built for [a talk about desktop apps in ClojureScript with Electron](http://increasinglyfunctional.com/2016/07/07/electron-clojurescript-talk/).

## Usage

First, add your AWS creds and an SQS queue to `core.clj`. Better yet, store those creds on S3 and have your function download them when it starts. Then `lein uberjar` and upload the resulting jar file to AWS Lambda.

## License

Copyright © 2016 Joshua Miller

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.

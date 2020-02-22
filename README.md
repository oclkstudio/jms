# jms
Spring Boot Application with Jms and ActiveMq

## Installation

* Download the latest ActiveMQ release:

  [http://activemq.apache.org/download.html](http://activemq.apache.org/download.html)

* Extract the files from the archive and run the activemq file by using the command line, for example:

   ```bash
   activemq.bat start
   ```

## Usage

Run the JmsApplication.java

HTTP Methods

* GET

* POST

The producer creates and sends this request to send the Simeranya.java object to the queue.(POST request)

```bash
localhost:3000/jms/produce
```

The consumer uses the following request to receive the message waiting in the queue.(GET request)

```bash
localhost:3000/jms/receive
```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

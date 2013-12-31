A Chat room built using WebSockets. Additionally there is a bot used speaking on the same chat room. It demonstrates:

- WebSocket connections.
- Advanced usage of Akka.

## DubSub addition:

This is the websocket-chat example from the Play framework distribution, enhanced with [DubSub](https://github.com/alexanderjarvis/DubSub).

The chat example only has one chat room and so this is a relatively simplistic example but it demonstrates DubSub sharing messages between JVMs

To run this example (requires [Play](http://www.playframework.com/)):

    git clone https://github.com/alexanderjarvis/websocket-chat-dubsub.git
    cd websocket-chat-dubsub/
    play stage
    target/universal/stage/bin/websocket-chat -Dhttp.port=9000 -Ddubsub.akka.remote.netty.tcp.port=2551 -Dpidfile.path=/dev/null

In another terminal window:

    target/universal/stage/bin/websocket-chat -Dhttp.port=9001 -Ddubsub.akka.remote.netty.tcp.port=2552 -Dpidfile.path=/dev/null
    target/universal/stage/bin/websocket-chat -Dhttp.port=9003 -Dpidfile.path=/dev/null
    ...

You may now use the websocket-chat applicaiton in multiple browser windows for each of the different ports
e.g. http://localhost:9000 and http://localhost:9001

and see the messages appear in each window.

package main.java.com.pelucky.danmu.thread;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import main.java.com.pelucky.danmu.util.TcpSocketClient;

public class KeepaliveSender implements Runnable {
    private TcpSocketClient tcpSocketClient;
//    private Logger logger = LoggerFactory.getLogger(KeepaliveSender.class);

    public KeepaliveSender(TcpSocketClient tcpSocketClient) {
        this.tcpSocketClient = tcpSocketClient;
    }

    @Override
    public void run() {
        while (true) {
            long unixTime = System.currentTimeMillis() / 1000L;
            this.tcpSocketClient.sendData("type@=keeplive/tick@=" + unixTime + "/");
            try {
                Thread.sleep(40000);
            } catch (InterruptedException e) {
                System.out.println("Sleep interrupted!");
//                logger.info("Sleep interrupted!");
                e.printStackTrace();
            }
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UDP;

import java.net.DatagramSocket;
import java.net.SocketException;

/**
 *
 * @author LucaSosti <your.name at your.org>
 */
public class MainUDP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        DatagramSocket dsocket;
        for (int port = 1024; port <= 65535; port++) {
            try {
                dsocket = new DatagramSocket(port);
                System.err.println("Non c'è un server in ascolto sulla porta " + port);
                dsocket.close();
            } catch (SocketException ex) {
                System.out.println("C'è un server in ascolto sulla porta " + port);
            }
        }
    }

}

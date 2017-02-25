/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portscan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 *
 * @author LucaSosti
 */
public class PortScan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String ip;
        Socket sk;
        System.out.println("Inserisci l'indirizzo : ");
        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));
        ip = tastiera.readLine(); 
        for (int port = 1; port <= 65535; port++) {
            try {
                sk = new Socket();
                sk.connect(new InetSocketAddress(ip, port), 10000);
                sk.close();
                System.out.println("La porta " + port + " è aperta");
            } catch (Exception e) {
                System.err.println("La porta " + port + " è chiusa");
            }
        }

    }

}

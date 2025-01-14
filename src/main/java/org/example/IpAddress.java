package org.example;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Scanner;

public class IpAddress {
    public static void ip(String[] args) throws MalformedURLException, UnknownHostException {
        Scanner userInput = new Scanner(System.in);
        String url;
        System.out.println("which website's url you want to see ");
        url = userInput.nextLine();

        URL showUrl = new URL(url);
        String host = showUrl.getHost();
        InetAddress inetAddress = InetAddress.getByName(host);
        String ipAddress = inetAddress.getHostAddress();
        System.out.println(ipAddress);
    }
}

package org.example;

import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ChandrasUrlTool {
    public static void main(String[] args) throws MalformedURLException, UnknownHostException {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to the Chandra's URL Tool.");
        System.out.println("Type 1 to see the source code of the Website.");
        System.out.println("Type 2 to see the ip address of the website.");
        System.out.println("Type 3 to get the HTTP response from a website.");
        System.out.println("Type 4 to get the HTTP response and the ip address in JSON format.");
        System.out.println("Type 5 for a list of examples URLs that work.");
        String choice = userInput.nextLine();
        switch (choice) {
            case "1":
                break;
            case "2":
                IpAddress.ip(args);
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                break;
            case "6":
                break;

        }
    }
}
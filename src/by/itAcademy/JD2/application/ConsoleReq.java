package by.itAcademy.JD2.application;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Enumeration;
import java.util.Scanner;

public class ConsoleReq {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.print("Input firstName: ");
        String firstName = in.nextLine();
        System.out.print("Input lastName: ");
        String lastName = in.nextLine();
        URL url = new URL("http://localhost:8080/firstapp/hello_with_name?firstName=" + firstName + "&lastName=" + lastName);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        int responseCode = con.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            System.out.println("GET Response Code :: " + responseCode);
        } else {
            System.out.println("GET request did not work.");
        }
    }
}

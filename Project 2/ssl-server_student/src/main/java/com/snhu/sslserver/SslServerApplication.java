package com.snhu.sslserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.MessageDigest;

@SpringBootApplication
@RestController
public class SslServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SslServerApplication.class, args);
    }

    @GetMapping(value = "/hash", produces = "text/html")
    public String getChecksum() {
        try {
            String data = "Checksum Verification for Artemis Financial Project";
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(data.getBytes("UTF-8"));

            // Convert byte array to hex string
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                hexString.append(String.format("%02x", b));
            }

            // Return simple HTML response
            return "<html>" +
                   "<body>" +
                   "<h3>Checksum Verification</h3>" +
                   "<hr>" +
                   "<p><strong>Data:</strong> " + data + "</p>" +
                   "<hr>" +
                   "<p><strong>Created by:</strong> Edgar Pena</p>" +
                   "<hr>" +
                   "<p><strong>SHA-256 Checksum:</strong><br>" + hexString.toString() + "</p>" +
                   "</body>" +
                   "</html>";

        } catch (Exception e) {
            return "Error generating checksum: " + e.getMessage();
        }
    }
}
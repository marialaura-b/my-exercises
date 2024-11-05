package io.codeforall.bootcamp;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
public class Main {
    public static void main(String[] args) {

        String urlStr = "www.google.com";
        BufferedInputStream reader = null;

        try {
            URL url = new URL(urlStr);
            InputStream inputStream = url.openStream();

            reader.read();

            while (reader.read() != -1) {
                System.out.println((char c);
            }


        } catch (MalformedURLException e){
            throw new RuntimeException(e);
        } catch (IOException) {
            throw new RuntimeException();
        } finally{
            try {
                if(reader != null) {
                    reader.close();
            }
        }
    }
    }
}

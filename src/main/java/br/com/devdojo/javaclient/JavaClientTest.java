package br.com.devdojo.javaclient;

import org.apache.tomcat.util.codec.binary.Base64;
import org.apache.tomcat.util.http.fileupload.IOUtils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author William Suane for DevDojo on 7/5/17.
 */
public class JavaClientTest {
    public static void main(String[] args) {
        HttpURLConnection connection = null;
        BufferedReader reader = null;
        String user = "toyo";
        String password = "devdojo";
        try {
            URL url = new URL("http://localhost:8080/v1/protected/students/1");
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.addRequestProperty("Authorization", "Basic " + encodeUsernamePassword(user, password));
            System.out.println(encodeUsernamePassword(user, password));
            reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder jsonSB = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                jsonSB.append(line);
            }
            System.out.println(jsonSB.toString());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            IOUtils.closeQuietly(reader);
            if (connection != null)
                connection.disconnect();
        }
    }

    private static String encodeUsernamePassword(String user, String password) {
        String userPassword = user + ":" + password;
        return new String(Base64.encodeBase64(userPassword.getBytes()));
    }
}

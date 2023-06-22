package Dia15.Sala;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class APIWeb {

    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.boredapi.com/api/activity");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String linha;
            StringBuilder resposta = new StringBuilder();
            while ((linha = reader.readLine()) != null) {
                resposta.append(linha);
            }
            reader.close();
            System.out.println(resposta.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

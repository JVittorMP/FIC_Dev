package Dia15.Desafio15;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class WeatherAPI {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://api.open-meteo.com/v1/forecast?latitude=-15.64&longitude=-56.01&current_weather=true&forecast_days=1&timezone=auto");
            Scanner sc = new Scanner(url.openStream());
            String resposta = "";
            while(sc.hasNext()) {
                resposta += sc.nextLine();
            }
            sc.close();

            JSONParser parse = new JSONParser();  
            JSONObject jobjA = (JSONObject) parse.parse(resposta);
            JSONObject jobjB = (JSONObject) jobjA.get("current_weather");

            StringBuilder output = new StringBuilder();
            
            String latitude = "Latitude: " + Double.toString((Double) jobjA.get("latitude")) + "\n";
            String longitude = "Longitude: " + Double.toString((Double) jobjA.get("longitude")) + "\n";
            String timezone = "Timezone: " + (String) jobjA.get("timezone") + " (GMT" + jobjA.get("timezone_abbreviation") + ")\n";
            String elevation = "Elevation: " + Double.toString((Double) jobjA.get("elevation")) + "\n";
            String temperature = "Temperature: " +  Double.toString((Double) jobjB.get("temperature")) + "\n";
            String windspeed = "Windspeed: " + Double.toString((Double) jobjB.get("windspeed")) + "\n";
            String time = "Time: " + (String) jobjB.get("time") + "\n";
            String titulo = "Info Clima - Cuiabá/MT (" + time.substring(17, 22) + " H)" + "\n\n";
            
            output.append(titulo);
            output.append(latitude);
            output.append(longitude);
            output.append(timezone);
            output.append(elevation);
            output.append(temperature);
            output.append(windspeed);
            output.append(time);
            
            System.out.println(output);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}

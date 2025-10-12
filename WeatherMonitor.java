import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;

// Import the new JSON classes
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * A real-time weather monitoring system that fetches and displays formatted weather data.
 */
public class WeatherMonitor {

    private static final String WEATHER_SERVICE_HOST = "wttr.in";

    public static void main(String[] args) {
        // Force the use of a modern security protocol
        System.setProperty("https.protocols", "TLSv1.2");

        String location = "Chembarambakkam";

        try {
            // 1. Resolve Hostname
            System.out.println(" Resolving hostname: " + WEATHER_SERVICE_HOST + "...");
            InetAddress weatherServiceAddress = InetAddress.getByName(WEATHER_SERVICE_HOST);
            System.out.println(" Hostname resolved successfully! IP: " + weatherServiceAddress.getHostAddress());
            System.out.println("-------------------------------------------------");

            // 2. Fetch Weather Data
            System.out.println(" Fetching weather data for " + location + "...");
            String urlString = "https://" + WEATHER_SERVICE_HOST + "/" + location + "?format=j1";
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Read the response into a single string
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
                System.out.println("✅ Weather data fetched successfully!");

                // 3. Parse and Display the Data
                parseAndDisplayWeather(response.toString());

            } else {
                System.out.println("❌ Error: Failed to fetch weather data. HTTP Response Code: " + responseCode);
            }

        } catch (UnknownHostException e) {
            System.err.println("❌ Error: Could not resolve the hostname: " + WEATHER_SERVICE_HOST);
        } catch (IOException e) {
            System.err.println("❌ Error: An I/O error occurred while connecting to the server.");
            e.printStackTrace();
        }
    }

    /**
     * Parses the JSON string and prints the weather details in a formatted way.
     * @param jsonResponse The raw JSON string from the weather service.
     */
    private static void parseAndDisplayWeather(String jsonResponse) {
        // Create a JSONObject from the response string
        JSONObject weatherData = new JSONObject(jsonResponse);

        // Extract data by navigating the JSON structure
        JSONObject currentCondition = weatherData.getJSONArray("current_condition").getJSONObject(0);
        JSONObject nearestArea = weatherData.getJSONArray("nearest_area").getJSONObject(0);
        JSONObject todayWeather = weatherData.getJSONArray("weather").getJSONObject(0);
        JSONObject astronomy = todayWeather.getJSONArray("astronomy").getJSONObject(0);

        String area = nearestArea.getJSONArray("areaName").getJSONObject(0).getString("value");
        String region = nearestArea.getJSONArray("region").getJSONObject(0).getString("value");
        String country = nearestArea.getJSONArray("country").getJSONObject(0).getString("value");

        // Print the formatted details
        System.out.println("\n======= Weather Report =======");
        System.out.println(" Location:    " + area + ", " + region + ", " + country);
        System.out.println("--------------------------------");
        System.out.println("   Condition:   " + currentCondition.getJSONArray("weatherDesc").getJSONObject(0).getString("value"));
        System.out.println("  Temperature: " + currentCondition.getString("temp_C") + " °C");
        System.out.println("   Feels Like:  " + currentCondition.getString("FeelsLikeC") + " °C");
        System.out.println(" Humidity:    " + currentCondition.getString("humidity") + " %");
        System.out.println(" Wind Speed:  " + currentCondition.getString("windspeedKmph") + " km/h");
        System.out.println("   Pressure:    " + currentCondition.getString("pressure") + " mb");
        System.out.println("--------------------------------");
        System.out.println("   Max Temp:    " + todayWeather.getString("maxtempC") + " °C");
        System.out.println("   Min Temp:    " + todayWeather.getString("mintempC") + " °C");
        System.out.println("  Sunrise:     " + astronomy.getString("sunrise"));
        System.out.println(" Sunset:      " + astronomy.getString("sunset"));
        System.out.println("==============================");
        System.out.println("Name: Deepika S");
        System.out.println("Reg No: 2117240020063");
    
    }
}
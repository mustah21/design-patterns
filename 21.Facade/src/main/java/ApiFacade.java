
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ApiFacade {

    public String getAttributeValueFromJson(String urlString, String attributeName)
            throws IOException, IllegalArgumentException {

        String jsonResponse = sendGetRequest(urlString);
        return parseAttribute(jsonResponse, attributeName);
    }

    private String sendGetRequest(String urlString) throws IOException {
        URL url;
        try {
            url = new URL(urlString);
        } catch (MalformedURLException e) {
            throw new IOException("Invalid URL: " + urlString, e);
        }

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        int responseCode = connection.getResponseCode();
        if (responseCode != HttpURLConnection.HTTP_OK) {
            throw new IOException("HTTP request failed with status code: " + responseCode);
        }

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(connection.getInputStream()))) {
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }
            return content.toString();
        } finally {
            connection.disconnect();
        }
    }

    private String parseAttribute(String json, String attributeName)
            throws IOException, IllegalArgumentException {
        try {
            JSONParser parser = new JSONParser();
            JSONObject jsonObject = (JSONObject) parser.parse(json);

            if (!jsonObject.containsKey(attributeName)) {
                throw new IllegalArgumentException(
                        "Attribute '" + attributeName + "' not found in JSON response.");
            }

            return String.valueOf(jsonObject.get(attributeName));

        } catch (ParseException e) {
            throw new IOException("Failed to parse JSON response.", e);
        }
    }

}
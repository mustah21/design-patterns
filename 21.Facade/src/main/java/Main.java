import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        ApiFacade facade = new ApiFacade();

        System.out.println("=== Chuck Norris Joke ===");
        try {
            String joke = facade.getAttributeValueFromJson(
                    "https://api.chucknorris.io/jokes/random", "value");
            System.out.println(joke);
        } catch (IOException | IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n=== Forex Rates - Base Currency ===");
        try {
            String baseCurrency = facade.getAttributeValueFromJson(
                    "https://api.fxratesapi.com/latest", "base");
            System.out.println("Base currency: " + baseCurrency);
        } catch (IOException | IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n=== Error Demo: Invalid URL ===");
        try {
            facade.getAttributeValueFromJson("not-a-valid-url", "value");
        } catch (IOException e) {
            System.out.println("Caught IOException (expected): " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n=== Error Demo: Attribute Not Found ===");
        try {
            facade.getAttributeValueFromJson(
                    "https://api.chucknorris.io/jokes/random", "nonexistent_field");
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException (expected): " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
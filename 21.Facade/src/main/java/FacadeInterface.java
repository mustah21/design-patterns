import java.io.IOException;

public interface FacadeInterface {
    String getAttributeValueFromJson(String urlString, String attributeName) throws IllegalArgumentException,  IOException;
}

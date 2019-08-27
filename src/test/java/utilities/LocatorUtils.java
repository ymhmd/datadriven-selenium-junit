package utilities;

import org.json.simple.JSONObject;

import java.io.InputStreamReader;
import java.util.Map;

public class LocatorUtils {

    private String LOCATORS_FILE_PATH = "/Locators.json";

    private String pageName;

    public LocatorUtils(String pageName) {
        this.pageName = pageName;
    }

    public String getLocator(String locatorKey) {
        try {
            org.json.simple.parser.JSONParser parser = new org.json.simple.parser.JSONParser();
            Object obj = parser.parse(new InputStreamReader(getClass().getResourceAsStream(LOCATORS_FILE_PATH)));
            Map pageObject = ((Map)((JSONObject) obj).get(pageName));
            return pageObject.get(locatorKey).toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}

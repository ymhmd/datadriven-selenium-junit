package utilities;


import org.json.simple.JSONObject;

import java.io.InputStreamReader;
import java.util.Map;

public class TestDataUtils {

    private Map getTestData() {
        String TEST_DATA_FILE_PATH = "/TestData.json";

        try {
            org.json.simple.parser.JSONParser parser = new org.json.simple.parser.JSONParser();
            Object obj = parser.parse(new InputStreamReader(getClass().getResourceAsStream(TEST_DATA_FILE_PATH)));

            return ((JSONObject) obj);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getValue (String key) {
        return getTestData().get(key).toString();
    }

}

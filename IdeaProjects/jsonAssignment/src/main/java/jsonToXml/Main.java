package jsonToXml;

import netscape.javascript.JSObject;
import org.json.JSONObject;
import org.json.XML;

public class Main {
    public static void main(String[] args) {
        String json = "{ \"employee\": { \"name\": \"John\", \"age\": 30, \"city\": \"New York\" } }";
        JSONObject jsObject=new JSONObject(json);
        String xml= XML.toString(jsObject);
        System.out.println(xml);
    }
}

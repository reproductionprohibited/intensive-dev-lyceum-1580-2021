import java.util.HashMap;

public class RemoveParams {
    public static String strip(String url) {
        HashMap<String, String> requestParameters = new HashMap<>();
        String[] splitUrl = url.split("[?]", 2);
        String[] parameters = splitUrl[1].split("&");
        for (String parameter : parameters) {
            String[] keyValuePair = parameter.split("=");
            String key = keyValuePair[0];
            String value = keyValuePair[1];
            if (!requestParameters.containsKey(key)) {
                requestParameters.put(key, value);
            }
        }
        StringBuilder resultUrl = new StringBuilder(splitUrl[0] + "?");
        for (String key: requestParameters.keySet()) {
            String appendValue = key + "=" + requestParameters.get(key) + "&";
            resultUrl.append(appendValue);
        }
        return resultUrl.deleteCharAt(resultUrl.length() - 1).toString();
    }

    public static void main(String[] args) {
        String url = "http://ya.ru?a=1&b=2&a=2";
        String stripUrl = strip(url);
        System.out.println(stripUrl);
    }
}

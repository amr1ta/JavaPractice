package weatherDetails;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;

import org.apache.commons.io.IOUtils;
//import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class commonsIOGet {
	
	public JSONObject get_api(String location) throws JSONException, MalformedURLException, IOException {
		JSONObject response = new JSONObject(IOUtils.toString(new URL("https://api.openweathermap.org/data/2.5/weather?q="+location+"&APPID=c9c92ce1093927f5dfe446a5598fbecc"), Charset.forName("UTF-8")));
//		System.out.println(response);
		return response;		
	}

	public static void main(String[] args) {
		
	}

}

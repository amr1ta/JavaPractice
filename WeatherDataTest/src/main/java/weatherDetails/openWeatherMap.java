package weatherDetails;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;



public class openWeatherMap {
	
	// object reference of jsonOrgparser
	commonsIOGet get_json= new commonsIOGet();
	
//	writeOutput output_details= new writeOutput();
	jsonFileoutput output= new jsonFileoutput();
	
	JSONArray jArray = new JSONArray();
	JSONObject jsonResponse= new JSONObject();
	
	
	
	public void get_weatherDetails(String fileName) throws Exception{
		
		Xls_Reader reader = new Xls_Reader(fileName);
		for(int i=2;i<=4;i++){
				String city= reader.getCellData("weatherdata","City" , i);
				String country= reader.getCellData("weatherdata", "Country", i);
				String location= city + ','+country;
				System.out.println(location);
				jsonResponse= get_json.get_api(location);
				// Append responses to the JSON Array
				jArray.put(jsonResponse);
			
		}
		
		
		// Get all lines in csv
//		List<String> lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
////		System.out.println(lines);
//		
//		// Get response for all cities in the list except header
//		for(int i = 1; i < lines.size(); i++) {
//			System.out.println(lines.get(i));
//			jsonResponse= get_json.get_api(lines.get(i));
//			// Append responses to the JSON Array
//			jArray.put(jsonResponse);
//		}
//		System.out.println(jArray);
			
		// Finally write JSON Array to output file
        output.write_output(jArray);
	}
	
	

	public static void main(String[] args) throws Exception {
		openWeatherMap w= new openWeatherMap();
		w.get_weatherDetails("weatherdata.xlsx");
		
}
		
	}



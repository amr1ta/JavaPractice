package weatherDetails;
import java.io.FileWriter;
import java.io.IOException;
import org.json.JSONArray;

public class jsonFileoutput {
	
	
	public void write_output(JSONArray json_array) throws IOException{
		
		FileWriter fileWriter = new FileWriter("output.json");
		fileWriter.write(json_array.toString());
        fileWriter.close();
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}

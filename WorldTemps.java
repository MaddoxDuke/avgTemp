import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WorldTemps {

	public static void main(String[] args) {
		
		String fileName = "city_temperature.csv";
		LinkedList ll = new LinkedList();
		init(fileName, ll);
		
		Reading maxTemp = ll.findMax();
		Reading minTemp = ll.findMin();

		
		System.out.println("Max Temperature was: " + maxTemp.getAvgTemperature() + " in " + maxTemp.getCity() + " on " + maxTemp.getMonth() + "/" + maxTemp.getDay() + "/" + maxTemp.getYear());
		System.out.println("Min Temperature was: " + minTemp.getAvgTemperature() + " in " + minTemp.getCity() + " on " + minTemp.getMonth() + "/" + minTemp.getDay() + "/" + minTemp.getYear());

		System.out.println("done");
	}
	
	public static void init(String fileName, LinkedList ll) {
		
		String line = "";
		String splitBy = ",";
		
		try {
		
		FileReader fr = new FileReader(fileName);
		BufferedReader br = new BufferedReader(fr);
		
		line = br.readLine();
		
		int count = 0;
		
		while ((line = br.readLine()) != null) {
			
			String[] data = line.split(splitBy);
			String region = data[0];
			String country = data[1];
			String state = data[2];
			String city = data[3];
			int month = Integer.parseInt(data[4]);
			int day = Integer.parseInt(data[5]);
			int year = Integer.parseInt(data[6]);
			double avgTemp = Double.parseDouble(data[7]);
			
			Reading r = new Reading(region, country, state, city, month, day, year, avgTemp);
			
			ll.add(r);
			count++;
			
			
		}
		System.out.println(count + " records read");
		
		br.close();
		}
		catch (IOException e) {
			System.out.println("File Error: " + fileName);
		}
		
	}

}

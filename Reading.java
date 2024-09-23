
public class Reading {
	
	private String region;
	private String country;
	private String city;
	private int month;
	private int day;
	private int year;
	private double avgTemperature;
	private Reading next = null;
	
	public Reading (String region, String country, String state, String city,
			int month, int day, int year, double avgTemperature) {
		this.region = region;
		this.country = country;
		this.city = city;
		this.month = month;
		this.day = day;
		this.year = year;
		this.avgTemperature = avgTemperature;
	}
	
	public void setNext(Reading n) {
		next = n;
	}
	
	public Reading getNext() {
		return next;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getRegion() {
		return region;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getcountry() {
		return country;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCity() {
		return city;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getMonth() {
		return month;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getDay() {
		return day;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getYear() {
		return year;
	}
	public void setAvgTemperature(Double avgTemperature) {
		this.avgTemperature = avgTemperature;
	}
	public Double getAvgTemperature() {
		return avgTemperature;
	}
}

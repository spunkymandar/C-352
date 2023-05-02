
public class Address {
	private String cityName;
	private String countryName;
	public Address(String cityName, String countryName) {
		super();
		this.cityName = cityName;
		this.countryName = countryName;
	}
	@Override
	public String toString() {
		return "Address [cityName=" + cityName + ", countryName=" + countryName + "]";
	}
	

}

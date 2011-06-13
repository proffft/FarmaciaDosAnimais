package classes;

/* 
 * class written by Philippe Gabriel Souza Moraes Ribeiro
 * Department of Computer Science, University of Minnesota
 * Minneapolis, Minnesota, USA - 55455
 * 
 * class Address, defines an address
 * 
 *  private String addressStreetName: defines the avenue/street/highway name e.g: Larpenteur Avenue West
 *  private int addressNumber: defines the address number e.g: 1855
 *  private addressZipCode: defines the address' zip code e.g: 55113
 *  private Locality locality: defines the remaining locality of an address  e.g: Dinkytown, Minneapolis, Minnesota, USA
 */
public class Address {
	/*
	 * defines the address name
	 */
	private String addressStreetName;
	/*
	 * defines the address' number
	 */
	private int addressNumber;
	/*
	 * defines the address' zipCode
	 */
	private String addressZipCode;
	/*
	 * defines the remaining of the address
	 */
	private Locality locality;

	/*
	 * default constructor
	 */
	public Address(){
		this.addressStreetName = "";
		this.addressNumber = 0;
		this.addressZipCode = "";
		this.locality = new Locality();
	}
	
	/*
	 * overrode constructor, takes 4 arguments
	 */
	public Address(int number, String street,  String zipCode, Locality locality){
		this.setAddresStreetName(street);
		this.setAddressNumber(number);
		this.setAddressZipCode(zipCode);
		this.setAddressLocality(locality);
	}

	/*
	 * sets the locality
	 */
	public void setAddressLocality(Locality locality){
		this.locality = locality;
	}
	/*
	 * need a regular expression to format 
	 * the zip code as xxxxx - xxxx
	 */
	public void setAddressZipCode(String zipCode) {
		// TODO Auto-generated method stub
		this.addressZipCode = zipCode;
	}

	/*
	 * sets the address number
	 */
	public void setAddressNumber(int number) {
		// TODO Auto-generated method stub
		if(number > 0){
			this.addressNumber = number;
		}
		else{
			this.addressNumber = 0;
		}
	}

	/*
	 * sets the street name
	 */
	public void setAddresStreetName(String street) {
		// TODO Auto-generated method stub
		this.addressStreetName = street;
	}
	
	/*
	 * returns the zipCode
	 */
	public String getAddressZipCode(){
		return this.addressZipCode;
	}
	
	/*
	 * returns the number
	 */
	public int getAddressNumber(){
		return this.addressNumber;
	}
	
	/*
	 * returns the name
	 */
	public String getAddressStreetName(){
		return this.addressStreetName;
	}
	
	/*
	 * returns the locality
	 */
	public Locality getAddressLocality(){
		return this.locality;
	}
	
	/*
	 * examples:
	 * 1855 Larpenteur Avenue West Apt 6 Saint Paul Minnesota USA - 55113
	 * 
	 */
	public String formatToString(){
		String address = this.getAddressNumber() + " " + this.getAddressStreetName() + ", " + this.locality.formatToString() + " - " + this.getAddressZipCode();
		return address;
	}
}

package classes;

public class Supplier {

	private Name name;
	private Telephone telephone;
	private Company company;
	private Integer supplierId;
	private Address address;
	
	public Supplier(){
		this.name = new Name();
		this.telephone = new Telephone();
		this.company = new Company();
		this.address = new Address();
		this.supplierId = 0;
	}
	
	public Supplier(Name name, Telephone telephone, Company company, Integer id, Address address){
		this.setSupplierName(name);
		this.setSupplierTelephone(telephone);
		this.setSupplierCompany(company);
		this.setSupplierId(id);
		this.setSupplierAddress(address);
	}

	public void setSupplierAddress(Address address) {
		// TODO Auto-generated method stub
		this.address = address;
	}

	public void setSupplierId(Integer id) {
		// TODO Auto-generated method stub
		if(id > 0){
			this.supplierId = id;
		}
		else{
			this.supplierId = 0;
		}
	}

	public void setSupplierTelephone(Telephone telephone) {
		// TODO Auto-generated method stub
		this.telephone = telephone;
	}

	public void setSupplierCompany(Company company) {
		// TODO Auto-generated method stub
		this.company = company;
	}

	public void setSupplierName(Name name) {
		// TODO Auto-generated method stub
		this.name = name;
	}
	
	public Name getSupplierName(){
		return this.name;
	}
	
	public Telephone getSupplierTelephone(){
		return this.telephone;
	}
	
	public Company getSupplierCompany(){
		return this.company;
	}
	
	public Address getSupplierAddress(){
		return this.address;
	}
	
	public Integer getSupplierId(){
		return this.supplierId;
	}
}

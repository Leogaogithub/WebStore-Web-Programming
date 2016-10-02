package com.leo.webstore.domain;

public class Customer {
	String customerId;
	String name;
	String address;
	String noOfOrdersMade;
	public Customer(String customerId, String name){
		this.customerId = customerId;
		this.name = name;		
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNoOfOrdersMade() {
		return noOfOrdersMade;
	}
	public void setNoOfOrdersMade(String noOfOrdersMade) {
		this.noOfOrdersMade = noOfOrdersMade;
	}
	
	@Override
	  public boolean equals(Object obj) {
	    if (this == obj)
	      return true;
	    if (obj == null)
	      return false;
	    if (getClass() != obj.getClass())
	      return false;
	    Customer other = (Customer) obj;
	    if (customerId == null) {
	      if (other.customerId != null)
	        return false;
	    } else if (!customerId.equals(other.customerId))
	      return false;
	    return true;
	  }

	  @Override
	  public int hashCode() {
	    final int prime = 31;
	    int result = 1;
	    result = prime * result
	        + ((customerId == null) ? 0 : customerId.hashCode());
	    return result;
	  }

	  @Override
	  public String toString() {
	    return "Customer [customerId=" + customerId + ", name=" + name + "]";
	  }
	
}

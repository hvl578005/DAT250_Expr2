package no.hvl.dat250.jpa.basicexample;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity
public class Pincode {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    private String pincode;
    private int count;

    @OneToMany
    private List<CreditCard> creditCards;

    public Long getId() {
        return id;
    }

    public void setId(Long Id) {
        this.id = Id;
    }

    public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	public void setCount(Integer count) {
		this.count = count;
	}
	
	public String getPincode() {
		return pincode;
	}
	
	public Integer getCount() {
		return count;
	}
}
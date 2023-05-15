package hiberdemo.hibernate;


import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;



@Entity
@Cacheable
@Cache(usage= CacheConcurrencyStrategy.READ_ONLY)
public class Employee {
	
	@Id
	private int id;
	private String name;
	private String country;
	
	@OneToOne
	private Equipment equi;	
	
	public Equipment getEqui() {
		return equi;
	}
	public void setEqui(Equipment equi) {
		this.equi = equi;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", country=" + country + ", equi=" + equi + "]";
	}
	
	
	
}

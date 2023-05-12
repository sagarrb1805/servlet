package hiberdemo.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Equipment {
	@Id
	private int equi_id;
	
	private String equi_name;

	public int getEqui_id() {
		return equi_id;
	}

	public void setEqui_id(int equi_id) {
		this.equi_id = equi_id;
	}

	public String getEqui_name() {
		return equi_name;
	}

	public void setEqui_name(String equi_name) {
		this.equi_name = equi_name;
	}

	@Override
	public String toString() {
		return "Equipment [equi_id=" + equi_id + ", equi_name=" + equi_name + "]";
	}
	
	
	

}

package entity;

import java.io.Serializable;

public class Users implements Serializable{

	
	 private static final long serialVersionUID = 1L;
	    private Integer id;
	    private String name;
	    private String pass;
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPass() {
			return pass;
		}
		public void setPass(String pass) {
			this.pass = pass;
		}
	    
	    
	    
}

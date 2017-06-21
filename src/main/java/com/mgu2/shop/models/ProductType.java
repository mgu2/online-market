package com.mgu2.shop.models;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "t_producttype")
public class ProductType implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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

}

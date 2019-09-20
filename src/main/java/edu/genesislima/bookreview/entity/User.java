package edu.genesislima.bookreview.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="TB_USER")
public class User implements Serializable {

	@Id
	private int id;
	private String name;
	private String email;
	private String nickname;
	
	@OneToMany(mappedBy="user")	
	private List<Review> reviews;
	
}

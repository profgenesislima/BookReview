package edu.genesislima.bookreview.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="TB_BOOK")
public class Book implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String description;
	
	@ManyToOne
	@JoinColumn(name="category_id")
	private Category category;
	
	@OneToMany(mappedBy="book")
	private List<Review> review;
}

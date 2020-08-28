package com.cos.review.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SearchKeyword {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	private String keyword;
}

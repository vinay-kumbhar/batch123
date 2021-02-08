package com.crts.app.sme.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserDocuments {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int udid;
	private byte [] aadharCard;
	private byte [] panCard;
	private byte [] photo;

}

package com.pollutionapp.user.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table
public class User {
	

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	private String email;
	private String name;
	private String password;
	

}

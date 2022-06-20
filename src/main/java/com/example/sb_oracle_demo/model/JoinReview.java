package com.example.sb_oracle_demo.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class JoinReview {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idx;

	@Column
	private String isView;
	
	@CreationTimestamp
	private Timestamp createDate;
}

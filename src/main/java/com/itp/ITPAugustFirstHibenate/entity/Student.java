package com.itp.ITPAugustFirstHibenate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
@Table(name="mystudent")
public class Student {
	@Id
	private int rno;
	@Column(name="studentName")
	private String sname;
	private double per;
	
	@Transient
	private int temp;
	
	static String principalName="Mr Smith";
}

package com.itp.ITPAugustFirstHibenate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
public class Student {
	@Id
	private int rno;
	private String sname;
	private double per;
}

package com.itp.ITPAugustFirstHibenate.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
@Builder
public class Employee {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int eno;
		private String ename;
		private double sal;
}

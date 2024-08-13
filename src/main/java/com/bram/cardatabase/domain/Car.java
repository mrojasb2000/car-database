package com.bram.cardatabase.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Car {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long Id;
	private String brand, model, color, registrationNumber;
	private int modelYear, price;
}

package com.programmingtechie.productservice.model;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {
	@Id
	private String id;
	private String name;
	private String description;
	private BigDecimal price;
	
}

package com.programmingtechie.productservice.dto;

import java.math.BigDecimal;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductResponse {
	private String id;
	private String name;
	private String description;
	private BigDecimal price;
}

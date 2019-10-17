package net.kodar.restaurantui.data.entities;


import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;


/**
 * The persistent class for the product database table.
 * 
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class Product extends NamedPersistent implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal price;

	private LifecycleStatus lifecycleStatus;

	private Measure measure;

	private ProductStatus productStatus;
}
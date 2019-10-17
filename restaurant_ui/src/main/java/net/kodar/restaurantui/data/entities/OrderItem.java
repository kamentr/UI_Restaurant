package net.kodar.restaurantui.data.entities;


import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;


@Data
@EqualsAndHashCode(callSuper=true)
public class OrderItem extends NamedPersistent implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal price;

	private int quantity;

	private LifecycleStatus lifecycleStatus;

	private Product product;

}
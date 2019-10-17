package net.kodar.restaurantui.data.entities;


import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;


/**
 * The persistent class for the menu_item database table.
 * 
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class MenuItem extends NamedPersistent implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal price;

	private Measure measure;
}
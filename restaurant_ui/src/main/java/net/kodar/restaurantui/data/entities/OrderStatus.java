package net.kodar.restaurantui.data.entities;


import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * The persistent class for the order_status database table.
 * 
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class OrderStatus extends NamedPersistent implements Serializable {
	private static final long serialVersionUID = 1L;

}
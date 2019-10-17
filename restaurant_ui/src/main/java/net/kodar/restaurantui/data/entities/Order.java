package net.kodar.restaurantui.data.entities;


import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class Order extends NamedPersistent implements Serializable {
	private static final long serialVersionUID = 1L;

	private OrderStatus orderStatus;

	private LifecycleStatus lifecycleStatus;
	
	private RestaurantTable table;
}
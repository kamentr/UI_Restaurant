package net.kodar.restaurantui.data.entities;


import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper=true)
public class ProductStatus extends NamedPersistent implements Serializable {
	private static final long serialVersionUID = 1L;
}
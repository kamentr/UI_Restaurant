package net.kodar.restaurantui.data.entities;


import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;



/**
 * The persistent class for the api_group_status database table.
 * 
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class ApiGroupStatus extends NamedPersistent implements Serializable {
	private static final long serialVersionUID = 1L;

}
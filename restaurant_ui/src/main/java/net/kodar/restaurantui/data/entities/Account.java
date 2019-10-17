package net.kodar.restaurantui.data.entities;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * The persistent class for the account database table.
 * 
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class Account extends NamedPersistent implements Serializable {
	private static final long serialVersionUID = 1L;


	private LifecycleStatus lifecycleStatus;

	private ApiUser apiUser;
}
package net.kodar.restaurantui.data.entities;


import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper=true)
public class ApiUser extends NamedPersistent implements Serializable {
	private static final long serialVersionUID = 1L;

	private String password;

	private String username;

	private ApiUserStatus apiUserStatus;

	private LifecycleStatus lifecycleStatus;
}
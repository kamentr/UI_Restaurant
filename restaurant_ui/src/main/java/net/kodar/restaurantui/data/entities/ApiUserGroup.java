package net.kodar.restaurantui.data.entities;


import java.io.Serializable;


import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper=true)
public class ApiUserGroup extends NamedPersistent implements Serializable {
	private static final long serialVersionUID = 1L;

	private ApiUser apiUser;

	private ApiGroup apiGroup;



}
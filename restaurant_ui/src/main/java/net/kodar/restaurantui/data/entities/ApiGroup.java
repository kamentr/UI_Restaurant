package net.kodar.restaurantui.data.entities;

import java.io.Serializable;

import org.springframework.security.core.GrantedAuthority;

import lombok.Data;
import lombok.EqualsAndHashCode;



/**
 * The persistent class for the api_group database table.
 * 
 */

@Data
@EqualsAndHashCode(callSuper=true)
public class ApiGroup extends NamedPersistent implements Serializable, GrantedAuthority {
	private static final long serialVersionUID = 1L;

	private String authority;

	private ApiGroupStatus apiGroupStatus;

	private LifecycleStatus lifecycleStatus;

	@Override
	public String getAuthority() {
		return this.authority;
	}

}
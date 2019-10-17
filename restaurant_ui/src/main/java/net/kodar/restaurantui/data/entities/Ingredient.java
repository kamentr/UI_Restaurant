package net.kodar.restaurantui.data.entities;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * The persistent class for the ingredient database table.
 * 
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class Ingredient extends NamedPersistent implements Serializable {
	private static final long serialVersionUID = 1L;

	private IngredientStatus ingredientStatus;
}
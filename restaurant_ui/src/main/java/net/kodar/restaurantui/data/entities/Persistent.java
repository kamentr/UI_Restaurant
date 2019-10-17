package net.kodar.restaurantui.data.entities;


import java.io.Serializable;
import lombok.Data;

@Data
public abstract class Persistent implements Serializable {

  private static final long serialVersionUID = -8700250893205702893L;

  protected Long id; 

  protected boolean locked;

}

package net.kodar.restaurantui.data.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class NamedPersistent extends Persistent {

  private static final long serialVersionUID = 6857410091575760475L;
  
  private String code;

  private String name;
  
  private String description;
}

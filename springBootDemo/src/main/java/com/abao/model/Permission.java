package com.abao.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_permission")
public class Permission implements Serializable {
  
  /**
   * 
   */
  private static final long serialVersionUID = -704012344421310744L;
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String name;
  private String description;
  private String url;
  private int pId;
  
  @OneToMany(mappedBy = "permissionId", cascade = CascadeType.ALL)
  private Set<RolePermission> rp = new HashSet<RolePermission>();
}

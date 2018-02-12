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
@Table(name = "tb_role")
public class Role implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 1316972025690742605L;
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String name;
  
  @OneToMany(mappedBy = "roleId",cascade=CascadeType.ALL)
  private Set<RoleUser> ru = new HashSet<RoleUser>();
}

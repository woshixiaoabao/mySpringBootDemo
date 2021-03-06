package com.abao.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_role_permission")
public class RolePermission implements Serializable {
  
  /**
   * 
   */
  private static final long serialVersionUID = -3893868497312591340L;
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  
  @ManyToOne
  @JoinColumn(name = "role_id", referencedColumnName = "id")
  private Role roleId;
  
  @ManyToOne
  @JoinColumn(name = "permission_id", referencedColumnName = "id")
  private Permission permissionId;
}

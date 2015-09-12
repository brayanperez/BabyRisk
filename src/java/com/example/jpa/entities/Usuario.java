
package com.example.jpa.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.jar.Attributes;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table (name = "USUARIOS")

public class Usuario implements Serializable{
    
    @Id
    @Column (name = "id_usuario")
    private String idUsuario;
    
    private String nombres;
    
    private String apellidos;
    
    private String email;
    
    private String contrasenia;
    
    private char sexo;
    
     @ManyToOne
   @JoinColumn(name ="id_tipo_usuario", referencedColumnName = "id_tipo_usuario")
   private TipoUsuario aUsuTipU;
   
   @ManyToOne
   @JoinColumn(name ="id_rol", referencedColumnName = "id_rol")
   private Roles aUsuRol;
   
   @ManyToOne
   @JoinColumns(
           {
           @JoinColumn(name ="id_ciudad", referencedColumnName = "id_ciudad"),
           @JoinColumn(name ="id_departamento", referencedColumnName = "id_departamento"),         
           }
          )
   private Ciudad aUsuCiu;
   
   
   
   @ManyToOne
   @JoinColumn(name = "id_regimen", referencedColumnName = "id_regimen")
           private Regimen aUsuReg;
           
          
    
    @Column (name = "fecha_nacimiento")
    @Temporal (TemporalType.DATE)
    private Date fechaNacimiento;
    
    @Column (name = "nit_empresa")
    private int nitEmpresa;
    
    @Column (name = "tipo_empresa")
    private String tipoEmpresa;
    
    @Column (name = "razon_social")
    private  String razonSocial;
    
    @Column (name = "representante_legal")
    private  String representanteLegal;
    
    @Column (name = "direccion_empresa")
    private  String direccionEmpresa;
    
    @Column (name = "telefono_empresa")
    private  String telefonoEmpresa;

    public Usuario() {
    }

    public Usuario(String idUsuario, String email, String contrasenia, TipoUsuario aUsuTipU, Roles aUsuRol, Ciudad aUsuCiu, Regimen aUsuReg) {
        this.idUsuario = idUsuario;
        this.email = email;
        this.contrasenia = contrasenia;
        this.aUsuTipU = aUsuTipU;
        this.aUsuRol = aUsuRol;
        this.aUsuCiu = aUsuCiu;
        this.aUsuReg = aUsuReg;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public TipoUsuario getaUsuTipU() {
        return aUsuTipU;
    }

    public void setaUsuTipU(TipoUsuario aUsuTipU) {
        this.aUsuTipU = aUsuTipU;
    }

    public Roles getaUsuRol() {
        return aUsuRol;
    }

    public void setaUsuRol(Roles aUsuRol) {
        this.aUsuRol = aUsuRol;
    }

    public Ciudad getaUsuCiu() {
        return aUsuCiu;
    }

    public void setaUsuCiu(Ciudad aUsuCiu) {
        this.aUsuCiu = aUsuCiu;
    }

    public Regimen getaUsuReg() {
        return aUsuReg;
    }

    public void setaUsuReg(Regimen aUsuReg) {
        this.aUsuReg = aUsuReg;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getNitEmpresa() {
        return nitEmpresa;
    }

    public void setNitEmpresa(int nitEmpresa) {
        this.nitEmpresa = nitEmpresa;
    }

    public String getTipoEmpresa() {
        return tipoEmpresa;
    }

    public void setTipoEmpresa(String tipoEmpresa) {
        this.tipoEmpresa = tipoEmpresa;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getRepresentanteLegal() {
        return representanteLegal;
    }

    public void setRepresentanteLegal(String representanteLegal) {
        this.representanteLegal = representanteLegal;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public String getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(String telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

   
  
    
    

   }
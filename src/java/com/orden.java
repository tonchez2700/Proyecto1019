/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;


public class orden {
private int Id;
private String Nombre;   
private String CC;
private String Colonia;
private String Ciudad;
private String Telefono;
private String Tam;
private String Cantidad;

    public orden() {
    }

    public orden(int Id, String Nombre, String CC, String Colonia, String Ciudad, String Telefono, String Tam, String Cantidad) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.CC = CC;
        this.Colonia = Colonia;
        this.Ciudad = Ciudad;
        this.Telefono = Telefono;
        this.Tam = Tam;
        this.Cantidad = Cantidad;
    }
      public String execute() {
        if (Nombre.isEmpty() || CC.isEmpty() || Colonia.isEmpty() || Ciudad.isEmpty() || Telefono.isEmpty()  || Cantidad.isEmpty()      ) {
            return "error";
        } else {
            return "success";
        }
    }
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCC() {
        return CC;
    }

    public void setCC(String CC) {
        this.CC = CC;
    }

    public String getColonia() {
        return Colonia;
    }

    public void setColonia(String Colonia) {
        this.Colonia = Colonia;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getTam() {
        return Tam;
    }

    public void setTam(String Tam) {
        this.Tam = Tam;
    }

    public String getCantidad() {
        return Cantidad;
    }

    public void setCantidad(String Cantidad) {
        this.Cantidad = Cantidad;
    }

}

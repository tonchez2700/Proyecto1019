/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;


public class DC {
    private String Nombre ,  Ingrediente , Tam1 , Pre1 , Tam2 , Pre2;

    public DC() {
    }

    public DC(String Nombre, String Ingrediente, String Tam1, String Pre1, String Tam2, String Pre2) {
        this.Nombre = Nombre;
        this.Ingrediente = Ingrediente;
        this.Tam1 = Tam1;
        this.Pre1 = Pre1;
        this.Tam2 = Tam2;
        this.Pre2 = Pre2;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getIngrediente() {
        return Ingrediente;
    }

    public void setIngrediente(String Ingrediente) {
        this.Ingrediente = Ingrediente;
    }

    public String getTam1() {
        return Tam1;
    }

    public void setTam1(String Tam1) {
        this.Tam1 = Tam1;
    }

    public String getPre1() {
        return Pre1;
    }

    public void setPre1(String Pre1) {
        this.Pre1 = Pre1;
    }

    public String getTam2() {
        return Tam2;
    }

    public void setTam2(String Tam2) {
        this.Tam2 = Tam2;
    }

    public String getPre2() {
        return Pre2;
    }

    public void setPre2(String Pre2) {
        this.Pre2 = Pre2;
    }
    
}

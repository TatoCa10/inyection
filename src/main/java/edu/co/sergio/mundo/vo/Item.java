/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sergio.mundo.vo;

/**
 *
 * @author Carlos Alberto
 */
public class Item {
    private int IdItem;
    private int IDLote;
    private int Cantidad;
    private String NombreProd;
    private String Proveedor;
    private int Precio;
    private int Razon;

    public int getIdItem() {
        return IdItem;
    }

    public void setIdItem(int IdItem) {
        this.IdItem = IdItem;
    }

    public int getIDLote() {
        return IDLote;
    }

    public void setIDLote(int IDLote) {
        this.IDLote = IDLote;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getNombreProd() {
        return NombreProd;
    }

    public void setNombreProd(String NombreProd) {
        this.NombreProd = NombreProd;
    }

    public String getProveedor() {
        return Proveedor;
    }

    public void setProveedor(String Proveedor) {
        this.Proveedor = Proveedor;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public int getRazon() {
        return Razon;
    }

    public void setRazon(int Razon) {
        this.Razon = Razon;
    }
}

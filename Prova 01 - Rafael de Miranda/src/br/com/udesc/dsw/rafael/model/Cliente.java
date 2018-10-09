package br.com.udesc.dsw.rafael.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.management.Query;

public class Cliente {



    private int id;

    private String nome;

    private Date cadastro;

    public Cliente(int id, String nome, Date cadastro) {
        this.id = id;
        this.nome = nome;
        this.cadastro = cadastro;
    }

    public Cliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getCadastro() {
        return cadastro;
    }

    public void setCadastro(Date cadastro) {
        this.cadastro = cadastro;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nome=" + nome + ", cadastro=" + cadastro + '}';
    }

    static Query createNamedQuery(String localizaClientes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static Collection getResultList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

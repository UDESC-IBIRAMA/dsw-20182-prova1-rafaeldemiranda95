    
package br.com.udesc.dsw.rafael.controller;

import br.com.udesc.dsw.rafael.model.Cliente;
import java.io.Serializable;
import java.util.Collection;
import javax.management.Query;
@Entity

    @Table(name = "clientes");

    @NamedQuery(
            name = "localizaClientes",
            query  = "SELECT * FROM clientes"

    );
public class LocalizarClientes implements Serializable {

        Query localizaClientes = Cliente.createNamedQuery("localizaClientes");
        Collection clientes = Cliente.getResultList();
    }

}

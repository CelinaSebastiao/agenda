/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda.controlo;

import agenda.modelo.Recado;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Celina Sebastião
 */
@Named(value = "recadoCDIBean")
@RequestScoped

public class RecadoCDIBean {

    /**
     * Creates a new instance of RecadoCDIBean
     */
Recado recado;
    
@PostConstruct
public void inicializar()
{
    recado = new Recado();
}

    public Recado getRecado() {
        return recado;
    }

    public void setRecado(Recado recado) {
        this.recado = recado;
    }

    public String mostraMunicipio(){
    return "Municipio Escolhido "+getRecado().getMunicipio();
    }
    
    
}

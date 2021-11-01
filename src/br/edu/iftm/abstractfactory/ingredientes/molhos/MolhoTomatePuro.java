package br.edu.iftm.abstractfactory.ingredientes.molhos;

import br.edu.iftm.abstractfactory.interfaces.ingredientes.Molho;

public class MolhoTomatePuro implements Molho{
    @Override
    public String toString(){
        return "Molho tomate feito com tomates frescos";
    }
}

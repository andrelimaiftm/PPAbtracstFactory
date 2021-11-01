package br.edu.iftm.abstractfactory.ingredientes.queijo;

import br.edu.iftm.abstractfactory.interfaces.ingredientes.Queijo;

public class QueijoMozzarella implements Queijo{
    @Override
    public String toString(){
        return "Queijo Mozzarella desfiado";
    }
}
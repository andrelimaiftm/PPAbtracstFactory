package br.edu.iftm.abstractfactory.interfaces;

import br.edu.iftm.abstractfactory.interfaces.ingredientes.*;

public interface PizzaIngredientFactory {
    public Borda criarBorda();
    public Molho criarMolho();
    public Queijo criarQueijo();
    public Vegetais[] criarVegetais();
    public Pepperoni criarPepperoni();
    public FrutoDoMar criaFrutoDoMar(); 
}

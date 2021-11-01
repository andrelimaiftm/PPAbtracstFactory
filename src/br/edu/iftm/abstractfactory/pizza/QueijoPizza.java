package br.edu.iftm.abstractfactory.pizza;

import br.edu.iftm.abstractfactory.classesabstratas.Pizza;
import br.edu.iftm.abstractfactory.interfaces.PizzaIngredientFactory;

public class QueijoPizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;

    public QueijoPizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }
    public void prepare(){
        System.out.println("Preparando "+ this.nome);
        this.borda = ingredientFactory.criarBorda();
        this.molho = ingredientFactory.criarMolho();
        this.queijo = ingredientFactory.criarQueijo();
    }
}

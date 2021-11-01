package br.edu.iftm.abstractfactory.pizza;

import br.edu.iftm.abstractfactory.classesabstratas.Pizza;
import br.edu.iftm.abstractfactory.interfaces.PizzaIngredientFactory;

public class VegetarianaPizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;

    public VegetarianaPizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparando " + this.nome);
        this.borda = ingredientFactory.criarBorda();
        this.molho = ingredientFactory.criarMolho();
        this.queijo = ingredientFactory.criarQueijo();
        this.vegetais = ingredientFactory.criarVegetais();
        
    }
    
}

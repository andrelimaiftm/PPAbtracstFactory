package br.edu.iftm.abstractfactory;

import br.edu.iftm.abstractfactory.classesabstratas.Pizza;
import br.edu.iftm.abstractfactory.classesabstratas.PizzaStore;
import br.edu.iftm.abstractfactory.interfaces.PizzaIngredientFactory;
import br.edu.iftm.abstractfactory.pizza.FrutosDoMarPizza;
import br.edu.iftm.abstractfactory.pizza.PepperoniPizza;
import br.edu.iftm.abstractfactory.pizza.QueijoPizza;
import br.edu.iftm.abstractfactory.pizza.VegetarianaPizza;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza criaPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if (item.equals("queijo")) {
            pizza = new QueijoPizza(ingredientFactory);
            pizza.setNome("Pizza de Queijo estilo de Chicago");

        } else if (item.equals("vegetariana")) {
            pizza = new VegetarianaPizza(ingredientFactory);
            pizza.setNome("Pizza vegetariana no estilo de Chicago");

        }else  if(item.equals("frutosDoMar")){
            pizza = new FrutosDoMarPizza(ingredientFactory);
            pizza.setNome("Pizza de frutos do Mar no estilo de Chicago");
        }else if(item.equals("pepperoni")){
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setNome("Pizza de Pepperoni no estilo de Chicago");
        }
        return pizza;
    }
}

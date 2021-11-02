package br.edu.iftm.abstractfactory;

import br.edu.iftm.abstractfactory.classesabstratas.Pizza;
import br.edu.iftm.abstractfactory.classesabstratas.PizzaStore;
import br.edu.iftm.abstractfactory.interfaces.PizzaIngredientFactory;
import br.edu.iftm.abstractfactory.pizza.FrutosDoMarPizza;
import br.edu.iftm.abstractfactory.pizza.PepperoniPizza;
import br.edu.iftm.abstractfactory.pizza.QueijoPizza;
import br.edu.iftm.abstractfactory.pizza.VegetarianaPizza;

public class NYPizzaStore extends PizzaStore{

    @Override
    protected Pizza criaPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

            if(item.equals("queijo")){
                pizza = new QueijoPizza(ingredientFactory);
                pizza.setNome("Pizza de queijo no estilo de nova york");
            }else if(item.equals("vegetariana")){
                pizza = new VegetarianaPizza(ingredientFactory);
                pizza.setNome("Pizza vegetariana no estilo de nova york");
            }else if(item.equals("frutosDoMar")){
                pizza = new FrutosDoMarPizza(ingredientFactory);
                pizza.setNome("Pizza de frutos do mar no estilo de nova york");
            }
            else if(item.equals("pepperoni")){
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setNome("Pizza de peperroni no estilo de nova york");
            }
        return pizza;
    }

}
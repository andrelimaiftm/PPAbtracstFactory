package br.edu.iftm.abstractfactory;

import br.edu.iftm.abstractfactory.classesabstratas.Pizza;
import br.edu.iftm.abstractfactory.classesabstratas.PizzaStore;

public class PizzaTestDriver {
    public static void main(String[] args) throws Exception {
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        PizzaStore nyStore = new NYPizzaStore();

        Pizza pizza = chicagoStore.orderPizza("queijo");
        System.out.println(pizza);

        pizza = nyStore.orderPizza("queijo");
        System.out.println(pizza);
    }
}

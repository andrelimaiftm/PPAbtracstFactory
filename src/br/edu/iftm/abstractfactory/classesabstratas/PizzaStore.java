package br.edu.iftm.abstractfactory.classesabstratas;

public abstract class PizzaStore{

    protected abstract Pizza criaPizza(String item);

    public Pizza orderPizza(String tipo){
        Pizza pizza = this.criaPizza(tipo);
        System.out.println("--- Preparando a " + pizza.getNome() + " ---");
        pizza.prepare();
        pizza.assar();
        pizza.cortar();
        pizza.encaixotar();
        return pizza;
    }

}
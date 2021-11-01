package br.edu.iftm.abstractfactory;

import br.edu.iftm.abstractfactory.ingredientes.queijo.QueijoMozzarella;
import br.edu.iftm.abstractfactory.ingredientes.vegetais.AzeitonaPreta;
import br.edu.iftm.abstractfactory.ingredientes.vegetais.Beringela;
import br.edu.iftm.abstractfactory.ingredientes.vegetais.Espinafre;
import br.edu.iftm.abstractfactory.ingredientes.bordas.BordaLargaCrocante;
import br.edu.iftm.abstractfactory.ingredientes.frutosdomar.FrutosdoMarCongelados;
import br.edu.iftm.abstractfactory.ingredientes.molhos.MolhoTomatePuro;
import br.edu.iftm.abstractfactory.ingredientes.pepperoni.PepperoniFatiado;
import br.edu.iftm.abstractfactory.interfaces.PizzaIngredientFactory;
import br.edu.iftm.abstractfactory.interfaces.ingredientes.Borda;
import br.edu.iftm.abstractfactory.interfaces.ingredientes.FrutoDoMar;
import br.edu.iftm.abstractfactory.interfaces.ingredientes.Molho;
import br.edu.iftm.abstractfactory.interfaces.ingredientes.Pepperoni;
import br.edu.iftm.abstractfactory.interfaces.ingredientes.Queijo;
import br.edu.iftm.abstractfactory.interfaces.ingredientes.Vegetais;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{

    @Override
    public Borda criarBorda() {
        return new BordaLargaCrocante();
    }

    @Override
    public Molho criarMolho() {        
        return new MolhoTomatePuro();
    }

    @Override
    public Queijo criarQueijo() {        
        return new QueijoMozzarella();
    }

    @Override
    public Vegetais[] criarVegetais() {
        Vegetais vegetais[] = {
            new AzeitonaPreta(),
            new Espinafre(),
            new Beringela() };
        return vegetais;
    }

    @Override
    public Pepperoni criarPepperoni() {        
        return new PepperoniFatiado();
    }

    @Override
    public FrutoDoMar criaFrutoDoMar() {        
        return new FrutosdoMarCongelados();
    }

}
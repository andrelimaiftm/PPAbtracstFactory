package br.edu.iftm.abstractfactory;

import br.edu.iftm.abstractfactory.ingredientes.bordas.BordaFinaCrocante;
import br.edu.iftm.abstractfactory.ingredientes.frutosdomar.FrutosdoMarFrescos;
import br.edu.iftm.abstractfactory.ingredientes.molhos.MolhoMarinara;
import br.edu.iftm.abstractfactory.ingredientes.pepperoni.PepperoniFatiado;
import br.edu.iftm.abstractfactory.ingredientes.queijo.QueijoReggiano;
import br.edu.iftm.abstractfactory.ingredientes.vegetais.Alho;
import br.edu.iftm.abstractfactory.ingredientes.vegetais.Cebola;
import br.edu.iftm.abstractfactory.ingredientes.vegetais.Cogumelo;
import br.edu.iftm.abstractfactory.ingredientes.vegetais.PimentaVermelha;
import br.edu.iftm.abstractfactory.interfaces.PizzaIngredientFactory;
import br.edu.iftm.abstractfactory.interfaces.ingredientes.Borda;
import br.edu.iftm.abstractfactory.interfaces.ingredientes.FrutoDoMar;
import br.edu.iftm.abstractfactory.interfaces.ingredientes.Molho;
import br.edu.iftm.abstractfactory.interfaces.ingredientes.Pepperoni;
import br.edu.iftm.abstractfactory.interfaces.ingredientes.Queijo;
import br.edu.iftm.abstractfactory.interfaces.ingredientes.Vegetais;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{

    @Override
    public Borda criarBorda() {        
        return new BordaFinaCrocante();
    }

    @Override
    public Molho criarMolho() {        
        return new MolhoMarinara();
    }

    @Override
    public Queijo criarQueijo() {        
        return new QueijoReggiano();
    }

    @Override
    public Vegetais[] criarVegetais() {        
        Vegetais vegetais[] = { new Alho(),
             new Cebola(),
              new Cogumelo(),
               new PimentaVermelha()};
        return vegetais;
    }

    @Override
    public Pepperoni criarPepperoni() {        
        return new PepperoniFatiado();
    }

    @Override
    public FrutoDoMar criaFrutoDoMar() {        
        return new FrutosdoMarFrescos();
    }
    
}

package br.edu.iftm.abstractfactory.classesabstratas;

import br.edu.iftm.abstractfactory.interfaces.ingredientes.*;

public abstract class Pizza {
    protected String nome;

    protected Borda borda;
    protected Molho molho;
    protected Vegetais vegetais[];
    protected Queijo queijo;
    protected Pepperoni pepperoni;
    protected FrutoDoMar frutosMar;

    public abstract void prepare();

    public void assar(){
        System.out.println("Asse por 25 minutos a 350 graus");
    }

    public void cortar(){
        System.out.println("Cortando a pizza em pedações diagonais");
    }

    public void encaixotar(){
        System.out.println("Colocar pizza na caixa official PizzaStore");
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String toString(){
        StringBuffer resultado = new StringBuffer();
        resultado.append("---- "+ this.nome + " ----\n" );
        if(this.borda != null){
            resultado.append(this.borda);
            resultado.append("\n");            
        }
        if(this.molho != null){
            resultado.append(this.molho);
            resultado.append("\n");  
        }
        if(this.queijo != null){
            resultado.append(this.queijo);
            resultado.append("\n");  
        }
        if(this.vegetais != null){
            for (int i = 0; i < vegetais.length; i++) {
                resultado.append(this.vegetais[i]);
                if(i < vegetais.length-1){
                    resultado.append(", ");
                }
            }
            resultado.append("\n");
        }
        if(this.frutosMar != null){
            resultado.append(this.frutosMar);
            resultado.append("\n");
        }
        if(this.pepperoni != null){
            resultado.append(this.pepperoni);
            resultado.append("\n");
        }
        return resultado.toString();
    }
    
}

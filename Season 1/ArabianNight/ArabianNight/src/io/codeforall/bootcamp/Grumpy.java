package io.codeforall.bootcamp;

public class Grumpy extends Genie{


    public Grumpy(){
        super(5);
    }

    @Override  // BUSCAR O GETTER PARA PODER INVOCAR AQUI O METODO.
    public int getWishes() {
        return super.getWishes();
    }

    @Override
    public void makeAWish() {           // BUSCAR O METODO IGUAL E ADICIONAR UMA CONDICIONANTE.
        if (getWishes() < 1) {
            super.makeAWish();
        } else {
            System.out.println("No wishes for you");
        }
    }
}


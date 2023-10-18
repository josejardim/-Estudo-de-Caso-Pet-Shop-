package petshop;

import java.util.ArrayList;

public class TaxiParaAnimais {
    private ArrayList<Animal> passageiros;

    public TaxiParaAnimais(String motorista) {
        this.passageiros = new ArrayList<>();
    }

    public void adicionarPassageiro(Animal animal) {
        passageiros.add(animal);
    }

    public void listarPassageiros() {
        if (passageiros.isEmpty()) {
            System.out.println("Nenhum animal utilizou o serviço de táxi.");
        } else {
            System.out.println("Passageiros no táxi para animais:");
            for (Animal animal : passageiros) {
                System.out.println(animal);
            }
        }
    }
}


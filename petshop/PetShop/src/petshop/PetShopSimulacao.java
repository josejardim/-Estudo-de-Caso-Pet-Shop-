package petshop;

import java.util.ArrayList;

public class PetShopSimulacao {
    public static void main(String[] args) {
        ArrayList<Animal> animais = new ArrayList<>();
        ArrayList<Produto> produtos = new ArrayList<>();
        ArrayList<Agenda> agendas = new ArrayList<>();
        ArrayList<TaxiParaAnimais> taxis = new ArrayList<>();

      
        Animal animal1 = new Animal("Rex", "Cachorro", "Labrador", "01/01/2018", "João");
        Animal animal2 = new Animal("Whiskers", "Gato", "Siamês", "15/05/2020", "Maria");
        animais.add(animal1);
        animais.add(animal2);
        Animal animal3 = new Animal("Bob", "Cachorro", "Vira lata", "12/07/2018", "Cosme");
        Animal animal4 = new Animal("Belo", "Gato", "Angorá", "15/09/2022", "Maisa");
        animais.add(animal3);
        animais.add(animal4);
        Animal animal5 = new Animal("Bia", "Gato", "Ragdoll", "21/03/2021", "Julia");
        animais.add(animal5);

 
        Produto produto1 = new Produto("Ração para Cachorro", "Alimento", 50.0, 100);
        Produto produto2 = new Produto("Brinquedo para Gato", "Brinquedo", 10.0, 30);
        produtos.add(produto1);
        produtos.add(produto2);


        // ... Cadastre mais produtos se necessário

        // Exemplo de agendamento de serviço
        Servico banho = new Banho();
        Servico tosa = new Tosa();
        Animal animalAgendado = animais.get(0);
        String dataAgendamento = "20/10/2023";
        String horarioAgendamento = "10:00";

        Agenda agenda1 = new Agenda(animalAgendado, banho, dataAgendamento, horarioAgendamento);
        Agenda agenda2 = new Agenda(animalAgendado, tosa, dataAgendamento, "11:00");
        agendas.add(agenda1);
        agendas.add(agenda2);

        // ... Agende serviços para os animais, se necessário

        // Exemplo de venda de produtos
        Produto produtoAVender = produtos.get(0);
        int quantidadeVendida = 5;

        if (produtoAVender.getQuantidadeEmEstoque() >= quantidadeVendida) {
            produtoAVender.vender(quantidadeVendida);
            System.out.println("Venda realizada com sucesso.");
        } else {
            System.out.println("Produto fora de estoque.");
        }

        // Criar um serviço de táxi para animais
        TaxiParaAnimais taxi = new TaxiParaAnimais("João, o Motorista de Táxi");
        taxis.add(taxi);

        // Adicionar animais ao serviço de táxi
        taxi.adicionarPassageiro(animal1);
        taxi.adicionarPassageiro(animal2);
        taxi.adicionarPassageiro(animal3);
        taxi.adicionarPassageiro(animal4);
        taxi.adicionarPassageiro(animal5);

        System.out.println("\nAnimais que utilizaram o serviço de táxi:");
        for (TaxiParaAnimais taxiParaAnimais : taxis) {
            taxiParaAnimais.listarPassageiros();
        }
        // Adicione mais animais ao serviço de táxi (animal3, animal4, animal5)

        // Exibir informações de maneira organizada
        System.out.println("Lista de Animais:");
        for (Animal animal : animais) {
            System.out.println(animal);
        }

        // Exibir os animais que utilizaram o serviço de táxi
        System.out.println("\nAnimais que utilizaram o serviço de táxi:");
        for (TaxiParaAnimais taxiParaAnimais : taxis) {
            taxiParaAnimais.listarPassageiros();
        }

        System.out.println("\nLista de Produtos:");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }

        System.out.println("\nAgendamentos:");
        for (Agenda agenda : agendas) {
            System.out.println(agenda);
        }
    }
}

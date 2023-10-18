package petshop;

public class Banho extends Servico {
    @Override
    public String descricao() {
        return "Banho";
    }

    @Override
    public double preco() {
        return 30.0;
    }
}

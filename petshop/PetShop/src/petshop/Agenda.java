package petshop;

public class Agenda {
    private Animal animal;
    private Servico servico;
    private String data;
    private String horario;

    public Agenda(Animal animal, Servico servico, String data, String horario) {
        this.animal = animal;
        this.servico = servico;
        this.data = data;
        this.horario = horario;
    }

    // Getters e setters
    // ...

    @Override
    public String toString() {
        return "Agenda{" +
                "animal=" + animal +
                ", servico=" + servico.descricao() +
                ", data='" + data + '\'' +
                ", horario='" + horario + '\'' +
                '}';
    }
}


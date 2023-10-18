package petshop;

import java.util.ArrayList;

public class Animal {
    private String nome;
    private String especie;
    private String raca;
    private String dataNascimento;
    private String proprietario;
    private ArrayList<Mimo> mimos;

    public Animal(String nome, String especie, String raca, String dataNascimento, String proprietario) {
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.dataNascimento = dataNascimento;
        this.proprietario = proprietario;
        mimos = new ArrayList<>();
    }

    public void adicionarMimo(Mimo mimo) {
        mimos.add(mimo);
    }

    public ArrayList<Mimo> getMimos() {
        return mimos;
    }

    // Restante dos getters e setters
    // ...

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", especie='" + especie + '\'' +
                ", raca='" + raca + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", proprietario='" + proprietario + '\'' +
                ", mimos=" + mimos +
                '}';
    }

	public char[] getNome() {
		return null;
	}
}

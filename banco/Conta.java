package banco;

public class Conta {
	private int numAcc;
	private String nome;
	private int age;
	private double saldo;

	public Conta(int numAcc, String nome, int age) {
		this.numAcc = numAcc;
		this.setNome(nome);
		this.setAge(age);
	}

	public void deposito(double value) {
		this.saldo = (getValue() + value);
		System.out.println("\nOperação realizada com sucesso!");
	}

	public void saque(double value) {
		if (this.saldo >= value) {
			this.saldo = (getValue() - (value + 5));
			System.out.println("\nOperação realizada com Sucesso");
		} else if (this.getValue() <= 0) {
			System.out.printf("\nNão há saldo suficiente: %f", this.getValue());
		}
	}

	public int getNumAcc() {
		return numAcc;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValue() {
		return saldo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Conta numAcc: " + numAcc + ", Nome: " + nome + ", Saldo: " + saldo
				+ "\n================================================================";
	}

}

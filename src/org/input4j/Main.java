package org.input4j;

class Main {
	public static void main(String[] args) {
		String nome = Input.Str("Digite seu nome: ");
		int idade = Input.Int("Digite sua idade: ");
		String[] carros = Input.Str("Digite seus carros: ").toLowerCase().split(" ");
		boolean ok = Input.Bool("Hue? ");
		
		StringBuilder msg1 = new StringBuilder("Nome: ");
		msg1.append(nome)
		.append("\n")
		.append("Idade: ")
		.append(idade);
		
		System.out.println(msg1);
		System.out.println(ok);
		
		for(String carro : carros) {
			System.out.println(carro);
		}
		
	}
}
package principal;

import java.util.Scanner;

public class principal {

	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		//Instanciando some a supercasse
		/*
		Pessoa pessoa = new Pessoa();
		
		System.out.println("Informe o nome");
		pessoa.setNome(ler.nextLine());
		
		System.out.println("Nome:" + pessoa.getNome());
		*/
		
		String tipo;
		System.out.println("Informe se é professor (P) ou aluno (A)");
		tipo = ler.nextLine();
		
		Aluno alu = new Aluno();
		
		if(tipo == "A") {
			
		}
		System.out.println("Informe o nome");
		alu.setNome(ler.nextLine());
		
		System.out.println("Informe a idade");
		alu.setIdade(ler.nextInt());
		
		System.out.println("Informe o peso");
		alu.setPeso(ler.nextDouble());
		
		System.out.println("Informe a altura");
		alu.setAltura(ler.nextDouble());
		
		double imc = alu.getIMC();
		
		System.out.println("O aluno é bolsista?");
		alu.setBolsista(ler.nextBoolean());
		
		System.out.println("Informe a matricula");
		alu.setRa(ler.nextInt());
		
		System.out.println("Informe o curso");
		alu.setCurso(ler.nextLine());
		
		System.out.println("******* RESULTADO *******");
		System.out.println("Nome: " + alu.getNome());
		System.out.println("IMC: " + imc);
		System.out.println("Matricula" + alu.getRa());
		ler.close();
	}

}

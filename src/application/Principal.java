package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.entities.Livro;
import model.entities.Produto;

public class Principal {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		List<Produto> list = new ArrayList<>();
		Produto[] product = new Produto[5];
		Livro[] livro = new Livro[5];
		
		int n =0;
		int i = 0;
		int j = 0;
		
		do {
			System.out.println();
			System.out.println("Olá, informe uma das opções abaixo(1 à 6)");
			System.out.println("i: Cadastrar produto");
			System.out.println("ii: Listar produtos");
			System.out.println("iii: Cadastrar livro");
			System.out.println("iv: Listar livros");
			System.out.println("v: Imprimir tudo");
			System.out.println("vi: Sair");
			System.out.println();
			
			n = sc.nextInt();
			sc.nextLine();
			
			if(n==1) {
				System.out.print("Informe o nome: ");
				String nome = sc.nextLine();
				System.out.print("Descrição do produto: ");
				String descriçao = sc.nextLine();
				System.out.print("Informe o preço: ");
				Double preço = sc.nextDouble();
				sc.nextLine();
				
				Produto p = new Produto(nome,descriçao,preço);
				
				list.add(p);
				product[i] = p;
				i++;
			}
			
			if(n==2) {
				for(i = 0; i < product.length; i++) {
					if(product[i] != null) {
						System.out.println(product[i].toString());
					}
				}
			}
			
			if(n==3) {
				System.out.print("Informe o nome: ");
				String nome = sc.nextLine();
				System.out.print("Descrição do produto: ");
				String descriçao = sc.nextLine();
				System.out.print("Informe o preço: ");
				Double preço = sc.nextDouble();
				sc.nextLine();
				System.out.print("Informe o autor: ");
				String autores = sc.nextLine();
				System.out.print("ISBN: ");
				String ISBN = sc.nextLine();
				System.out.print("Editora: ");
				String editora = sc.nextLine();
				
				Livro l = new Livro(nome,descriçao,preço,autores,ISBN,editora);
				
				list.add(l);
				livro[j] = l;
				j++;
			}
			
			if(n==4) {
				for(j = 0; j < product.length; j++) {
					if(livro[j] != null) {
						System.out.println(livro[j].toString());
					}
				}
			}
			
			if(n==5) {
				for(Produto produto : list) {
					System.out.println(produto);
				}
			}
		}while(n!=6);
		
		System.out.println("Encerrado!");
		sc.close();
	}
}

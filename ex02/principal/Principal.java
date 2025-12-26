package principal;

import entidades.Livro;
import entidades.Eletronico;
import entidades.Produto;
import entidades.Vestuario;

public class Principal {


		public static void main(String[] args) {
			Produto livro = new Livro();
			Produto celular = new Eletronico();

			livro.adicionarProduto("Java: Como Programar - Deitel", 120.0, 5);
			celular.adicionarProduto("Smartphone Samsung", 2500.0, 10);

			livro.exibirInformacoes();
			celular.exibirInformacoes();
		}




}

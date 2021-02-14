package model.entities;

public class Livro extends Produto{

		private String autores;
		private String ISBN;
		private String editora;
		
		public Livro(String nome, String descriçao, Double preço, String autores, String iSBN, String editora) {
			super(nome, descriçao, preço);
			this.autores = autores;
			ISBN = iSBN;
			this.editora = editora;
		}

		public String getAutores() {
			return autores;
		}

		public void setAutores(String autores) {
			this.autores = autores;
		}

		public String getISBN() {
			return ISBN;
		}

		public void setISBN(String iSBN) {
			ISBN = iSBN;
		}

		public String getEditora() {
			return editora;
		}

		public void setEditora(String editora) {
			this.editora = editora;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (!super.equals(obj))
				return false;
			if (getClass() != obj.getClass())
				return false;
			Livro other = (Livro) obj;
			if (ISBN == null) {
				if (other.ISBN != null)
					return false;
			} else if (!ISBN.equals(other.ISBN))
				return false;
			if (autores == null) {
				if (other.autores != null)
					return false;
			} else if (!autores.equals(other.autores))
				return false;
			if (editora == null) {
				if (other.editora != null)
					return false;
			} else if (!editora.equals(other.editora))
				return false;
			return true;
		}
		
		@Override
		public String toString() {
			return "Produto: " + nome + ", " + descriçao + ", " + preço + ", " + autores + ", " + ISBN + ", " + editora;
		}
}

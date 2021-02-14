package model.entities;

public class Produto {
	
	protected String nome;
	protected String descriçao;
	protected Double preço;
	
	public Produto(String nome, String descriçao, Double preço) {
		super();
		this.nome = nome;
		this.descriçao = descriçao;
		this.preço = preço;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescriçao() {
		return descriçao;
	}

	public void setDescriçao(String descriçao) {
		this.descriçao = descriçao;
	}

	public Double getPreço() {
		return preço;
	}

	public void setPreço(Double preço) {
		this.preço = preço;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (descriçao == null) {
			if (other.descriçao != null)
				return false;
		} else if (!descriçao.equals(other.descriçao))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (preço == null) {
			if (other.preço != null)
				return false;
		} else if (!preço.equals(other.preço))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Produto: " + nome + ", " + descriçao + ", " + preço;
	}
	
	
}

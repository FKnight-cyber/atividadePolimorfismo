package model.entities;

public class Produto {
	
	protected String nome;
	protected String descri�ao;
	protected Double pre�o;
	
	public Produto(String nome, String descri�ao, Double pre�o) {
		super();
		this.nome = nome;
		this.descri�ao = descri�ao;
		this.pre�o = pre�o;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescri�ao() {
		return descri�ao;
	}

	public void setDescri�ao(String descri�ao) {
		this.descri�ao = descri�ao;
	}

	public Double getPre�o() {
		return pre�o;
	}

	public void setPre�o(Double pre�o) {
		this.pre�o = pre�o;
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
		if (descri�ao == null) {
			if (other.descri�ao != null)
				return false;
		} else if (!descri�ao.equals(other.descri�ao))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (pre�o == null) {
			if (other.pre�o != null)
				return false;
		} else if (!pre�o.equals(other.pre�o))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Produto: " + nome + ", " + descri�ao + ", " + pre�o;
	}
	
	
}

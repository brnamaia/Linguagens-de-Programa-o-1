package br.com.bruna;

public class Client implements Comparable <Client>{

    private String nome;
    private Integer ordemChegada;
    private Boolean prioridade;
    
    public Client(String nome, Boolean prioridade) {
    	this.prioridade = prioridade;
    	this.nome= nome;
    }

    public String getNome(){
        return nome;
    }

    public Integer getOrdemChegada(){
        return ordemChegada;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setOrdemChegada(Integer ordemChegada){
        this.ordemChegada = ordemChegada;
    }
    
    public int compareTo(Client other){
        return ordemChegada.compareTo(other.getOrdemChegada());
    }
    
    public Boolean getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(Boolean prioridade) {
		this.prioridade = prioridade;
	}

	public Client(String nome, Integer ordemChegada) {
        this.nome = nome;
        this.ordemChegada = ordemChegada;
    }
    
}

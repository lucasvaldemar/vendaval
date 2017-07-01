package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class produto {
	@Id
	private Integer id;
	private String descricao;
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}

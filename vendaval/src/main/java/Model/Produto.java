package Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity	
public class Produto {
	@Id		
	private Integer id;
	private String descricao;
}

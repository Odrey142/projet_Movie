package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author odrey
 *
 */
@Entity
@Table(name="ROLE")
public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String nomPerso;

	/**
	 * Constructeur sans paramètre
	 */
	public Role() {
		
	};
	/**
	 * @param nomPerso
	 */
	public Role(String nomPerso) {
		super();
		this.nomPerso = nomPerso;
	}

	public String getNomPerso() {
		return nomPerso;
	}

	public void setNomPerso(String nomPerso) {
		this.nomPerso = nomPerso;
	}
	
	
}

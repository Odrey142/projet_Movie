package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy;

/**
 * @author odrey
 *
 */
@Entity
@Table(name = "LIEU")
public class Lieu {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String ville;
	
	@Column
	private String etatDept;
	
	@Column
	private String pays;

	
	
	/**
	 * Constructeur sans paramètre
	 */
	public Lieu() {
		
	};
	/**
	 * @param ville
	 * @param etatDept
	 * @param pays
	 */
	public Lieu(String ville, String etatDept, String pays, int id) {
		super();
		this.ville = ville;
		this.etatDept = etatDept;
		this.pays = pays;
		this.id= id;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getEtatDept() {
		return etatDept;
	}

	public void setEtatDept(String etatDept) {
		this.etatDept = etatDept;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}

package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author odrey
 *
 */
@Entity
@Table(name = "ACTEUR")
public class Acteur {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column
	private String identite;

	@Column
	private int height;
	
	@Column
	private String url;

	@Column
	private String dateNaissance;
	
	@ManyToMany
	@JoinTable(name = "ACT_ROL", joinColumns = @JoinColumn(name = "ID_ACTEUR", referencedColumnName = "ID"), inverseJoinColumns = @JoinColumn(name = "ID_ROLE", referencedColumnName = "ID"))
	private Role role;
	
	@ManyToMany
	@JoinTable(name = "ACT_LIE", joinColumns = @JoinColumn(name = "ID_ACTEUR", referencedColumnName = "ID"), inverseJoinColumns = @JoinColumn(name = "ID_LIEU", referencedColumnName = "ID"))
	private Lieu lieu;
	
	

	
	/**
	 * Constructeur sans param
	 */
	public Acteur() {
	};
	
	
	/**
	 * Constructeur
	 * @param id
	 * @param identite
	 * @param height
	 * @param url
	 * @param dateNaissance
	 */
	public Acteur(int id, String identite, int height, String url, String dateNaissance) {
		super();
		this.id = id;
		this.identite = identite;
		this.height = height;
		this.url = url;
		this.dateNaissance = dateNaissance;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIdentite() {
		return identite;
	}

	public void setIdentite(String identite) {
		this.identite = identite;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

}

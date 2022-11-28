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
@Table(name = "REALISATEUR")
public class Realisateur {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String identity;
	
	@Column
	private String url;

	
	/**
	 * Constructeur sans paramètre
	 */
	public Realisateur() {
		
	};
	/**
	 * @param identity
	 * @param url
	 */
	public Realisateur(String identity, String url, int id) {
		super();
		this.identity = identity;
		this.url = url;
		this.id = id;
	}

	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}

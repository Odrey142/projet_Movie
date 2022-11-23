package Dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author odrey
 *
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class LieuDto {

	private String ville;
	private String etatDept;
	private String pays;

	/**
	 * @param ville
	 * @param etatDept
	 * @param pays
	 */
	public LieuDto(String ville, String etatDept, String pays) {
		super();
		this.ville = ville;
		this.etatDept = etatDept;
		this.pays = pays;
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

}

package Dto;

/**
 * @author odrey
 *
 */
public class RealisateurDto {
	
	
	private String identite;
	
	private String url;
	

	/**
	 * @param identite
	 * @param url
	 */
	public RealisateurDto(String identite, String url) {
		super();
		this.identite = identite;
		this.url = url;
	}

	@Override
	public String toString() {
		return "RealisateurDto [identite=" + identite + ", url=" + url + "]";
	}

	public String getIdentite() {
		return identite;
	}

	public void setIdentite(String identite) {
		this.identite = identite;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}

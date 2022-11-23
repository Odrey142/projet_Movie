package Dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author odrey
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RoleDto {
	
	@JsonProperty("characterName")
	private String nomPerso;

	/**
	 * @param nomPerso
	 */
	public RoleDto(String nomPerso) {
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

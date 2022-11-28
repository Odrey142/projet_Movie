package Dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import Model.Acteur;
import Model.Genre;
import Model.Lieu;
import Model.Realisateur;
import Model.Role;

/**
 * @author odrey
 *
 */
@JsonDeserialize()
@JsonIgnoreProperties(ignoreUnknown = true)
public class FilmDto {

	private int id;
	private String nom;
	private String url;
	private String plot;
	private String langue;
	private String anneeSortie;
	private List<RealisateurDto> realisateur;
	private List<ActeurDto> acteur;
	private List<RoleDto> role;
	private List<GenreDto> genre;
	private List<LieuDto> lieu;

	/**
	 * @param id
	 * @param nom
	 * @param url
	 * @param plot
	 * @param langue
	 * @param anneeSortie
	 * @param realisateur
	 * @param acteur
	 * @param role
	 * @param genre
	 * @param lieu
	 */
	public FilmDto(int id, String nom, String url, String plot, String langue, String anneeSortie,
			List<RealisateurDto> realisateur, List<ActeurDto> acteur, List<RoleDto> role, List<GenreDto> genre,
			List<LieuDto> lieu) {
		super();
		this.id = id;
		this.nom = nom;
		this.url = url;
		this.plot = plot;
		this.langue = langue;
		this.anneeSortie = anneeSortie;
		this.realisateur = realisateur;
		this.acteur = acteur;
		this.role = role;
		this.genre = genre;
		this.lieu = lieu;
	}

	@Override
	public String toString() {
		return "FilmDto [id=" + id + ", nom=" + nom + ", url=" + url + ", plot=" + plot + ", langue=" + langue
				+ ", anneeSortie=" + anneeSortie + ", realisateur=" + realisateur + ", acteur=" + acteur + ", role="
				+ role + ", genre=" + genre + ", lieu=" + lieu + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPlot() {
		return plot;
	}

	public void setPlot(String plot) {
		this.plot = plot;
	}

	public String getLangue() {
		return langue;
	}

	public void setLangue(String langue) {
		this.langue = langue;
	}

	public String getAnneeSortie() {
		return anneeSortie;
	}

	public void setAnneeSortie(String anneeSortie) {
		this.anneeSortie = anneeSortie;
	}

	public List<RealisateurDto> getRealisateur() {
		return realisateur;
	}

	public void setRealisateur(List<RealisateurDto> realisateur) {
		this.realisateur = realisateur;
	}

	public List<ActeurDto> getActeur() {
		return acteur;
	}

	public void setActeur(List<ActeurDto> acteur) {
		this.acteur = acteur;
	}

	public List<RoleDto> getRole() {
		return role;
	}

	public void setRole(List<RoleDto> role) {
		this.role = role;
	}

	public List<GenreDto> getGenre() {
		return genre;
	}

	public void setGenre(List<GenreDto> genre) {
		this.genre = genre;
	}

	public List<LieuDto> getLieu() {
		return lieu;
	}

	public void setLieu(List<LieuDto> lieu) {
		this.lieu = lieu;
	}

}
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

import org.hibernate.annotations.ManyToAny;

/**
 * @author odrey
 *
 */
@Entity
@Table(name = "FILM")
public class Film {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column
	private String nom;

	@Column
	private String url;

	@Column
	private String plot;

	@Column
	private String langue;

	@Column
	private String anneeSortie;

	@ManyToMany
	@JoinTable(name = "FIL_REA", joinColumns = @JoinColumn(name = "ID_FILM", referencedColumnName = "ID"), inverseJoinColumns = @JoinColumn(name = "ID_REALISATEUR", referencedColumnName = "ID"))
	private Realisateur realisateur;

	@ManyToMany
	@JoinTable(name = "FIL_ACT", joinColumns = @JoinColumn(name = "ID_FILM", referencedColumnName = "ID"), inverseJoinColumns = @JoinColumn(name = "ID_ACTEUR", referencedColumnName = "ID"))
	private Acteur acteur;

	@ManyToMany
	@JoinTable(name = "FIL_ROL", joinColumns = @JoinColumn(name = "ID_FILM", referencedColumnName = "ID"), inverseJoinColumns = @JoinColumn(name = "ID_ROLE", referencedColumnName = "ID"))
	private Role role;

	@ManyToMany
	@JoinTable(name = "FIL_GEN", joinColumns = @JoinColumn(name = "ID_FILM", referencedColumnName = "ID"), inverseJoinColumns = @JoinColumn(name = "ID_GENRE", referencedColumnName = "ID"))
	private Genre genre;

	@ManyToMany
	@JoinTable(name = "FIL_LIE", joinColumns = @JoinColumn(name = "ID_FILM", referencedColumnName = "ID"), inverseJoinColumns = @JoinColumn(name = "ID_LIEU", referencedColumnName = "ID"))
	private Lieu lieu;

	/**
	 * Constructeur sans paramètre
	 */
	public Film() {

	};

	/**
	 * Constructeur
	 * 
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
	public Film(int id, String nom, String url, String plot, String langue, String anneeSortie, Realisateur realisateur,
			Acteur acteur, Role role, Genre genre, Lieu lieu) {
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

	public Realisateur getRealisateur() {
		return realisateur;
	}

	public void setRealisateur(Realisateur realisateur) {
		this.realisateur = realisateur;
	}

	public Acteur getActeur() {
		return acteur;
	}

	public void setActeur(Acteur acteur) {
		this.acteur = acteur;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public Lieu getLieu() {
		return lieu;
	}

	public void setLieu(Lieu lieu) {
		this.lieu = lieu;
	}

}

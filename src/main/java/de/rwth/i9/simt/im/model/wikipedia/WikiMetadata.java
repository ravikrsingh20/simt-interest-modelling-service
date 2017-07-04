package de.rwth.i9.simt.im.model.wikipedia;
// Generated May 7, 2017 1:46:11 PM by Hibernate Tools 5.2.1.Final

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Version;

/**
 * Metadata generated by hbm2java
 */
@Entity
@Table(name = "metadata", catalog = "enwikidb")
public class WikiMetadata implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8844000250119591507L;
	private Long id;
	private String version;
	private String language;
	private String disambiguationCategory;
	private String mainCategory;
	private Long nrofPages;
	private Long nrofRedirects;
	private Long nrofDisambiguationPages;
	private Long nrofCategories;

	public WikiMetadata() {
	}

	public WikiMetadata(String language, String disambiguationCategory, String mainCategory, Long nrofPages,
			Long nrofRedirects, Long nrofDisambiguationPages, Long nrofCategories) {
		this.language = language;
		this.disambiguationCategory = disambiguationCategory;
		this.mainCategory = mainCategory;
		this.nrofPages = nrofPages;
		this.nrofRedirects = nrofRedirects;
		this.nrofDisambiguationPages = nrofDisambiguationPages;
		this.nrofCategories = nrofCategories;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Version
	@Column(name = "version")
	@Transient
	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Column(name = "language")
	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Column(name = "disambiguationCategory")
	public String getDisambiguationCategory() {
		return this.disambiguationCategory;
	}

	public void setDisambiguationCategory(String disambiguationCategory) {
		this.disambiguationCategory = disambiguationCategory;
	}

	@Column(name = "mainCategory")
	public String getMainCategory() {
		return this.mainCategory;
	}

	public void setMainCategory(String mainCategory) {
		this.mainCategory = mainCategory;
	}

	@Column(name = "nrofPages")
	public Long getNrofPages() {
		return this.nrofPages;
	}

	public void setNrofPages(Long nrofPages) {
		this.nrofPages = nrofPages;
	}

	@Column(name = "nrofRedirects")
	public Long getNrofRedirects() {
		return this.nrofRedirects;
	}

	public void setNrofRedirects(Long nrofRedirects) {
		this.nrofRedirects = nrofRedirects;
	}

	@Column(name = "nrofDisambiguationPages")
	public Long getNrofDisambiguationPages() {
		return this.nrofDisambiguationPages;
	}

	public void setNrofDisambiguationPages(Long nrofDisambiguationPages) {
		this.nrofDisambiguationPages = nrofDisambiguationPages;
	}

	@Column(name = "nrofCategories")
	public Long getNrofCategories() {
		return this.nrofCategories;
	}

	public void setNrofCategories(Long nrofCategories) {
		this.nrofCategories = nrofCategories;
	}

}
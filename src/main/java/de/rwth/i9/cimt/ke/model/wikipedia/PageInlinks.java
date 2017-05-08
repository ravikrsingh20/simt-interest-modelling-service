package de.rwth.i9.cimt.ke.model.wikipedia;
// Generated May 7, 2017 1:46:11 PM by Hibernate Tools 5.2.1.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * PageInlinks generated by hbm2java
 */
@Entity
@Table(name = "page_inlinks", catalog = "simplewikidb")
public class PageInlinks implements java.io.Serializable {

	private PageInlinksId id;

	public PageInlinks() {
	}

	public PageInlinks(PageInlinksId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "id", column = @Column(name = "id", nullable = false)),
			@AttributeOverride(name = "inLinks", column = @Column(name = "inLinks")) })
	public PageInlinksId getId() {
		return this.id;
	}

	public void setId(PageInlinksId id) {
		this.id = id;
	}

}
package de.rwth.i9.simt.im.model.wikipedia;
// Generated May 7, 2017 1:46:11 PM by Hibernate Tools 5.2.1.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * CategoryInlinks generated by hbm2java
 */
@Entity
@Table(name = "category_inlinks", catalog = "enwikidb")
public class WikiCategoryInlinks implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5074965065109338280L;
	private WikiCategoryInlinksId id;

	public WikiCategoryInlinks() {
	}

	public WikiCategoryInlinks(WikiCategoryInlinksId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "id", column = @Column(name = "id", nullable = false)),
			@AttributeOverride(name = "inLinks", column = @Column(name = "inLinks")) })
	public WikiCategoryInlinksId getId() {
		return this.id;
	}

	public void setId(WikiCategoryInlinksId id) {
		this.id = id;
	}

}

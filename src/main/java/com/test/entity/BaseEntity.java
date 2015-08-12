package com.test.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.envers.Audited;

@MappedSuperclass
@Audited
public abstract class BaseEntity implements Serializable {

	@GeneratedValue(generator = "guid")
	@GenericGenerator(name = "guid", strategy = "guid")
	@Column(columnDefinition = "CHAR(36)")
	@Id
	protected String id;

	@Temporal(TemporalType.TIMESTAMP)
	protected Date dateCreated = new Date();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	private static final long serialVersionUID = -8371628134270930829L;
}

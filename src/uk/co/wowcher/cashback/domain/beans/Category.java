package uk.co.wowcher.cashback.domain.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component("domainCategory")
@Entity
@Table(name="category_Table")
public class Category {

	
	@Id
	@Column(name="categoryId")
	private int iCategoryId;
	@Column(name="categoryName")
	private String sName;
	@Column(name="description")
	private String sDescription;
	
	public int getICategoryId() {
		return iCategoryId;
	}
	public void setICategoryId(int iCategoryId) {
		this.iCategoryId = iCategoryId;
	}
	public String getSName() {
		return sName;
	}
	public void setSName(String sName) {
		this.sName = sName;
	}
	public String getSDescription() {
		return sDescription;
	}
	public void setSDescription(String sDescription) {
		this.sDescription = sDescription;
	}
	
	
}

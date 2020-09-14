package org.oar.laptopproj;
import java.io.Serializable;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name = "laptop")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class LaptopDto implements Serializable
{
	@Id
	@Column(name = "LID")
	@GenericGenerator(name = "laptop_id",strategy = "org.oar.laptopproj.CustomGeneratorId")
	@GeneratedValue(generator = "laptop_id")
	private String lid;
	@Column(name = "laptop_brand")
	private String laptopbrand;
	@Column(name = "laptop_model")
	private String lmodelname;
	@Column(name = "laptop_speci")
	private String lspecification;
	@Column(name = "laptop_price")
	private Double lprice;
	@Column(name = "laptop_ratings")
	private Double lratings;
	public LaptopDto() {
	}
	public String getLid() {
		return lid;
	}
	public void setLid(String lid) {
		this.lid = lid;
	}
	public String getLaptopbrand() {
		return laptopbrand;
	}
	public void setLaptopbrand(String laptopbrand) {
		this.laptopbrand = laptopbrand;
	}
	public String getLmodelname() {
		return lmodelname;
	}
	public void setLmodelname(String lmodelname) {
		this.lmodelname = lmodelname;
	}
	public String getLspecification() {
		return lspecification;
	}
	public void setLspecification(String lspecification) {
		this.lspecification = lspecification;
	}
	public Double getLprice() {
		return lprice;
	}
	public void setLprice(Double lprice) {
		this.lprice = lprice;
	}
	public Double getLratings() {
		return lratings;
	}
	public void setLratings(Double lratings) {
		this.lratings = lratings;
	}
	@Override
	public String toString() {
		return "LaptopDto [lid=" + lid + ", laptopbrand=" + laptopbrand + ", lmodelname=" + lmodelname
				+ ", lspecification=" + lspecification + ", lprice=" + lprice + ", lratings=" + lratings + "]";
	}
	
	

}

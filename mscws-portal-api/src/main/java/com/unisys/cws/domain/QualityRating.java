package com.unisys.cws.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "quality_rating")
public class QualityRating {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	Long qualityRating; 
	
	String qualityRatingDescription;
	
	Integer qualityCode;

	public Long getQualityRating() {
		return qualityRating;
	}

	public void setQualityRating(Long qualityRating) {
		this.qualityRating = qualityRating;
	}

	public String getQualityRatingDescription() {
		return qualityRatingDescription;
	}

	public void setQualityRatingDescription(String qualityRatingDescription) {
		this.qualityRatingDescription = qualityRatingDescription;
	}

	public Integer getQualityCode() {
		return qualityCode;
	}

	public void setQualityCode(Integer qualityCode) {
		this.qualityCode = qualityCode;
	}
	
	
}

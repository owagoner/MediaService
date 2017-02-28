package edu.cmu.odw.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Media {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long businessId;
	private String featureImage;
	private List<String> images;
	
	public Media() {
	}

	public Long getBusinessId() {
		return businessId;
	}

	public void setBusinessId(Long businessId) {
		this.businessId = businessId;
	}

	public String getFeatureImage() {
		return featureImage;
	}

	public void setFeatureImage(String featureImage) {
		this.featureImage = featureImage;
	}

	public List<String> getImages() {
		return images;
	}

	public void setImages(List<String> images) {
		this.images = images;
	}

	@Override
	public String toString() {
		return "Media [id=" + id + ", businessId=" + businessId + ", featureImage=" + featureImage + ", images="
				+ images + "]";
	}

	public Media(Long businessId, String featureImage, List<String> images) {
		super();	
		this.businessId = businessId;
		this.featureImage = featureImage;
		this.images = images;
	}

	

}

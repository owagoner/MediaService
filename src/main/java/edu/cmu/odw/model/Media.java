package edu.cmu.odw.model;

import java.util.ArrayList;
import java.util.Arrays;
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
	private String images;
	
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
		List<String> result = Arrays.asList(images.split(",*,"));		
		return result;
	}

	public void setImages(List<String> images) {
		this.images = String.join(",*,", images);
	}

	@Override
	public String toString() {
		return "Media [id=" + id + ", businessId=" + businessId + ", featureImage=" + featureImage + ", images="
				+ images + "]";
	}

	public Media(Long businessId, String featureImage, ArrayList<String> images) {
		super();	
		this.businessId = businessId;
		this.featureImage = featureImage;
		this.images = String.join(",*,", images);
	}

	

}

package edu.cmu.odw.service;

import edu.cmu.odw.model.Media;

public interface MediaServiceCustom{	
	public Iterable<Media> getMediaByBusinessId(long businessId);
	public String getFeatureImgByBusinessId(long businessId);
	public Iterable<String> getImagesByBusinessId(long businessId);
}
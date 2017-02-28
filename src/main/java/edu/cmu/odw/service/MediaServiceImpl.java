package edu.cmu.odw.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import edu.cmu.odw.model.Media;


public class MediaServiceImpl implements MediaServiceCustom{

	@Autowired
	MediaService mediaService;
	

	@Override
	public Iterable<Media> getMediaByBusinessId(long businessId) {

		ArrayList<Media> result = new ArrayList<Media>();
		
	    Iterable<Media> allMedia = mediaService.findAll();	
		
		for(Media m: allMedia){
			if(m.getBusinessId() == businessId){				
				result.add(m);
			}
		}
		return result;
	}

	@Override
	public String getFeatureImgByBusinessId(long businessId) {
		
	    Iterable<Media> allMedia = mediaService.findAll();	
		
		for(Media m: allMedia){
			if(m.getBusinessId() == businessId){				
				return m.getFeatureImage();
			}
		}
		return "";
	}

	@Override
	public Iterable<String> getImagesByBusinessId(long businessId) {
		
		Iterable<Media> allMedia = mediaService.findAll();	
		
		for(Media m: allMedia){
			if(m.getBusinessId() == businessId){				
				return m.getImages();
			}
		}
		return null;
	}
	
}
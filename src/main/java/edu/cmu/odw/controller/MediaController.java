package edu.cmu.odw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.cmu.odw.model.Media;
import edu.cmu.odw.service.MediaService;


@RestController
public class MediaController {
	@Autowired
	private MediaService mediaService;

	@RequestMapping(value = "/api/media/{id}")
	public Media mediaByBusiness(@PathVariable("id") long id) {
		return mediaService.findOne(id);
	}
	
	@RequestMapping(value = "/api/media/businessId/{id}")
	public Iterable<Media> mediaBusinessId(@PathVariable("id") long id) {
		return mediaService.getMediaByBusinessId(id);
	}
	
	@RequestMapping(value = "/api/media/feature/businessId/{id}")
	public String imgFeatureBusinessId(@PathVariable("id") long id) {
		return mediaService.getFeatureImgByBusinessId(id);
	}
	@RequestMapping(value = "/api/media/all/businessId/{id}")
	public Iterable<String> imgBusinessId(@PathVariable("id") long id) {
		return mediaService.getImagesByBusinessId(id);
	}
	
	@RequestMapping(value = "/api/media", method = RequestMethod.POST)
	public Media saveMedia(@RequestBody Media media) {
		System.out.println(media);		
		
		return mediaService.save(media);
	}
	
	
}
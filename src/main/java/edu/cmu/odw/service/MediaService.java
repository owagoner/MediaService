package edu.cmu.odw.service;

import org.springframework.data.repository.CrudRepository;
import edu.cmu.odw.model.Media;


public interface MediaService extends CrudRepository<Media, Long>, MediaServiceCustom {
		
}
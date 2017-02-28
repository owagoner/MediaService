package edu.cmu.odw;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import edu.cmu.odw.model.Media;
import edu.cmu.odw.service.MediaService;


@Configuration
public class SeedData {	
    
	@Autowired
	MediaService mediaService;
    
    private static final Logger log = LoggerFactory.getLogger(SeedData.class);

    private static String base = "https://mediaservice.cfapps.io/img/";
    
    @Bean
    public SeedData getBean() {        

    	Media m1 = new Media(new Long(1),base + "barber1.jpg",
    			new ArrayList<String>(){{
    				add(base + "barber4.jpeg");    			
    				}});
    	Media m2 = new Media(new Long(2),base + "barber2.jpeg",
    			new ArrayList<String>(){{
    				add(base + "barber5.jpeg");
    				}});
    	Media m3 = new Media(new Long(3),base + "salon1.jpeg",
    			new ArrayList<String>(){{
    				add(base + "salon3.jpeg");
    				add(base + "salon4.jpeg");    				
    				}});
    	Media m4 = new Media(new Long(4),base + "mechanic1.jpeg",
    			new ArrayList<String>(){{
    				add(base + "mechanic7.jpeg");
    				add(base + "mechanic8.jpeg");
    				add(base + "mechanic9.jpeg");
    				}});
    	Media m5 = new Media(new Long(5),base + "mechanic2.jpeg",
    			new ArrayList<String>(){{
    				add(base + "mechanic7.jpeg");
    				add(base + "mechanic8.jpeg");
    				add(base + "mechanic9.jpeg");
    				}});
    	Media m6 = new Media(new Long(6),base + "mechanic3.jpeg",
    			new ArrayList<String>(){{
    				add(base + "mechanic7.jpeg");
    				add(base + "mechanic8.jpeg");
    				add(base + "mechanic9.jpeg");
    				}});
    	Media m7 = new Media(new Long(7),base + "mechanic4.jpeg",
    			new ArrayList<String>(){{
    				add(base + "mechanic7.jpeg");
    				add(base + "mechanic8.jpeg");
    				add(base + "mechanic9.jpeg");
    				}});
    	Media m8 = new Media(new Long(8),base + "mechanic5.jpeg",
    			new ArrayList<String>(){{
    				add(base + "mechanic7.jpeg");
    				add(base + "mechanic8.jpeg");
    				add(base + "mechanic9.jpeg");
    				}});
    	Media m9 = new Media(new Long(9),base + "mechanic6.jpeg",
    			new ArrayList<String>(){{
    				add(base + "mechanic7.jpeg");
    				add(base + "mechanic8.jpeg");
    				add(base + "mechanic9.jpeg");
    				}});
    	Media m10 = new Media(new Long(10),base + "barber3.jpeg",
    			new ArrayList<String>(){{
    				add(base + "barber6.jpeg");    			
    				}});
    	Media m11 = new Media(new Long(11),base + "salon2.jpeg",
    			new ArrayList<String>(){{
    				add(base + "salon5.jpeg");
    				}});
    	
        mediaService.save(m1);
        mediaService.save(m2);
        mediaService.save(m3);
        mediaService.save(m4);
        mediaService.save(m5);
        mediaService.save(m6);
        mediaService.save(m7);
        mediaService.save(m8);
        mediaService.save(m9);
        mediaService.save(m10);
        mediaService.save(m11);
        
        
        log.info("Address found with findAll():");
        log.info("-------------------------------");
        for (Media b : mediaService.findAll()) {
            log.info(b.toString());
        }
        return new SeedData();
    }
}
package com.techdevpoint.springproject.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics(){		
		return Arrays.asList(
				new Topic("spring","Spring Framework","Spring Description"),
				new Topic("javasript","JavaScript","JavaSript Description"),
				new Topic("angularJs","AngularJs","AngularJs Description")
				);
	}

}

package com.dharani.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dharani.entity.Topic;
import com.dharani.spring.service.TopicService;

@RestController
public class TopicController {

	@Autowired
	private TopicService topicService;

	@GetMapping(path = "/topics")
	public List<Topic> getTopics() {
 
		return topicService.getTopics();
	}

	@GetMapping(path = "/topics/{id}")
	public Topic getTopicById(@PathVariable int id) {

		return topicService.getTopicsById(id);
	}

	@PostMapping("/topics")
	public void addTopics(@RequestBody Topic topic) {
		topicService.addTopic(topic);

	}

	@PutMapping(path = "/topics/{id}")
	public void updateTopics(@RequestBody Topic topic, @PathVariable int id) {
		
		topicService.updateTopics(topic , id);

	}
	
	@DeleteMapping("/topics/{id}")
	public void deleteTopic(@PathVariable int id) {
		topicService.deleteTopic(id);
	}
}

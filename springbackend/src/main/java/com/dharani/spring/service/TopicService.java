package com.dharani.spring.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dharani.entity.Topic;

@Service
public class TopicService {

	List<Topic> topicList = new ArrayList<Topic>(Arrays.asList(new Topic(1, "Spring Boot", "Web Services & Micro services"),
			new Topic(2, "Hibernate", "HIbenate & Lazy Loading"), new Topic(3, "Monog DB", "No SQL and MonogDB"),
			new Topic(4, "Vue Js", "Vue JS & Node.js")));

	public List<Topic> getTopics() {

		return topicList;
	}
	
	public Topic getTopicsById(int id) {
		return topicList.stream().filter(t -> id == t.getId()).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topicList.add(topic);
	}

	public void updateTopics(Topic topic, int id) {
		  for(int i=0;i<topicList.size();i++) {
			  Topic  element = topicList.get(i);
			  if(id == element.getId()) {
				  topicList.set(i, topic);
				  return ;
			  }
		  }
	}

	public void deleteTopic(int id) {
		topicList.removeIf(t -> t.getId() == id);
	}

}

package com.question.pro.problem.service;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.question.pro.problem.entity.StoryEntity;
import com.question.pro.problem.entity.StoryID;

@Service
@CacheConfig(cacheNames = {"example"})
public class HackerNewsServiceImpl implements HackerNewsService {
	
	public  RestTemplate restTemplate;
	StoryID specificData1, specificData2;
    static int storyId1, storyId2;
	int maxid2;
	
	@Autowired
	public HackerNewsServiceImpl(RestTemplate restTemplate) {
		super();
		this.restTemplate = restTemplate;
	}


	@Cacheable
	public ArrayList<StoryEntity> getTopStories() {

		specificData1 = restTemplate.getForObject("https://hacker-news.firebaseio.com/v0/maxitem.json", StoryID.class);
		 ArrayList<StoryEntity> topStories = new ArrayList<>();
		 storyId1 = specificData1.getId();
		 for(Integer i = storyId1; i>storyId1-10;i--) {
			  
			 topStories.add(restTemplate.getForObject("https://hacker-news.firebaseio.com/v0/item/"+i+".json", StoryEntity.class));
		 }
		 
		return topStories;
		
	}


	public ArrayList<StoryEntity> getPastStories() {
		specificData2 = restTemplate.getForObject("https://hacker-news.firebaseio.com/v0/maxitem.json", StoryID.class);
		 maxid2 = specificData2.getId();
		 ArrayList<StoryEntity> result2 = new ArrayList<>();
		 for(int i = maxid2; i>storyId1-10;i--) {
			 result2.add(restTemplate.getForObject("https://hacker-news.firebaseio.com/v0/item/"+i+".json", StoryEntity.class));
		 }
		 
		return result2;
		
	
	}


	public String getComments(long id) {		
		StoryEntity temp =restTemplate.getForObject("https://hacker-news.firebaseio.com/v0/item/"+id+".json", StoryEntity.class);
		return ("Comments: "+temp.getText());
	}


	

}

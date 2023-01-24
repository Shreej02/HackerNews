package com.question.pro.problem.service;

import java.util.ArrayList;

import com.question.pro.problem.entity.StoryEntity;

public interface HackerNewsService {
	
	public ArrayList<StoryEntity> getTopStories();
	public ArrayList<StoryEntity> getPastStories();
	public String getComments(long id);

}

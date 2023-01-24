package com.question.pro.problem.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.question.pro.problem.entity.StoryEntity;

import com.question.pro.problem.service.HackerNewsServiceImpl;

@RestController
public class HackerNewsController {

	@Autowired
	public HackerNewsServiceImpl serviceLayer;

	@GetMapping("/top-stories")
	public ResponseEntity<ArrayList<StoryEntity>> getTopStories() {
		return new ResponseEntity<>(serviceLayer.getTopStories(), HttpStatus.OK);
	}

	@GetMapping("/past-stories")
	public ResponseEntity<ArrayList<StoryEntity>> getPastStories() {
		return new ResponseEntity<>(serviceLayer.getPastStories(), HttpStatus.OK);
	}

	@GetMapping("/comments/{id}")
	public ResponseEntity<String> getComments(@PathVariable long id) {
		return new ResponseEntity<>(serviceLayer.getComments(id), HttpStatus.OK);
	}

}

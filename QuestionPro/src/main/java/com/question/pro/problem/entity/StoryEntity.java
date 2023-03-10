package com.question.pro.problem.entity;

import java.util.Arrays;

import lombok.NoArgsConstructor;


public class StoryEntity {

	public StoryEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	private Integer id;
	private boolean deleted;	
	private String type;
	private String by;
	private long time;
	private String text;
	private boolean dead;
	private long parent;
	private long poll;
	private long[] kids;
	private String url;
	private long score;
	private String title;
	private long[] parts;
	private int descendants;

	public StoryEntity(Integer id, boolean deleted, String type, String by, long time, String text, boolean dead, long parent,
			long poll, long[] kids, String url, long score, String title, long[] parts, int descendants) {
		super();
		this.id = id;
		this.deleted = deleted;
		this.type = type;
		this.by = by;
		this.time = time;
		this.text = text;
		this.dead = dead;
		this.parent = parent;
		this.poll = poll;
		this.kids = kids;
		this.url = url;
		this.score = score;
		this.title = title;
		this.parts = parts;
		this.descendants = descendants;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBy() {
		return by;
	}

	public void setBy(String by) {
		this.by = by;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public boolean isDead() {
		return dead;
	}

	public void setDead(boolean dead) {
		this.dead = dead;
	}

	public long getParent() {
		return parent;
	}

	public void setParent(long parent) {
		this.parent = parent;
	}

	public long getPoll() {
		return poll;
	}

	public void setPoll(long poll) {
		this.poll = poll;
	}

	public long[] getKids() {
		return kids;
	}

	public void setKids(long[] kids) {
		this.kids = kids;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public long getScore() {
		return score;
	}

	public void setScore(long score) {
		this.score = score;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public long[] getParts() {
		return parts;
	}

	public void setParts(long[] parts) {
		this.parts = parts;
	}

	public int getDescendants() {
		return descendants;
	}

	public void setDescendants(int descendants) {
		this.descendants = descendants;
	}

	@Override
	public String toString() {
		return "Items [id=" + id + ", deleted=" + deleted + ", type=" + type + ", by=" + by + ", time=" + time
				+ ", text=" + text + ", dead=" + dead + ", parent=" + parent + ", poll=" + poll + ", kids="
				+ Arrays.toString(kids) + ", url=" + url + ", score=" + score + ", title=" + title + ", parts="
				+ Arrays.toString(parts) + ", descendants=" + descendants + "]";
	}

	
	
}

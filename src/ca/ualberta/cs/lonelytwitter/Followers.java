package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;

public abstract class Followers extends User {
	protected Integer n;
	protected String follower;

	public Integer getN() {
		return n;
	}

	public abstract void setN(Integer n) throws IOException;

	public String getFollower() {
		return follower;
	}

	public void setFollower(String follower) {
		this.follower = follower;
	}

	public Followers() {
		super();
		follower = "anonymous";
		n = 1;
	}

	public Followers(String follower) {
		super();
		this.follower = follower;
		n = 1;
	}
	
}

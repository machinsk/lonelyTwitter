package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;

public class LonelyFollower extends Followers {

	@Override
	public void setN(Integer n) throws IOException{
		if (n > 1) {
			throw new IOException("Too many followers");
		}
		this.n = n;
	}

	@Override
	public void setName(String name) {
		this.name = name;
		
	}


}

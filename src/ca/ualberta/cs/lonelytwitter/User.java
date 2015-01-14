package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;

public abstract class User extends Object{
	//access modifier -> public, private, protected (within the package),         <default>(excludes subroutines within package)
	protected String name;

	public String getName() {
		return name;
	}

	public abstract void setName(String name) throws IOException;
	
	public User(String n) {
		super();
		name = n;
	}
	
	public User() {
		super();
		name = "anonymous";
	}
	
}

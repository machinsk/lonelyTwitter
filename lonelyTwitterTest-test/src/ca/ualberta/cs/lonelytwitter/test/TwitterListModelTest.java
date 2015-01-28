package ca.ualberta.cs.lonelytwitter.test;

import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;
import ca.ualberta.cs.lonelytwitter.TwitterListModel;
import android.test.ActivityInstrumentationTestCase2;

public class TwitterListModelTest extends
		ActivityInstrumentationTestCase2<LonelyTwitterActivity> {
	
	TwitterListModel tweets;
	
	public TwitterListModelTest() {
		super(LonelyTwitterActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
		tweets = new TwitterListModel();
	}
	
	public void tweetsListInitialised(){
//		TwitterListModel tweets = new TwitterListModel();
		assertNotNull("Is array list iniialised?", tweets);
	}
	
	public void testListCount(){
//		TwitterListModel tweets = new TwitterListModel();
		NormalTweetModel tweet = new NormalTweetModel("hi");
		tweets.addTweet(tweet);
//		assertEquals("Zero Tweets case not handled", 0 , tweets.getListLength());
		assertEquals("Added a tweet", 1 , tweets.getListLength());
	}

    public void testAddDuplicate(){
        NormalTweetModel tweet = new NormalTweetModel("hi");
        NormalTweetModel tweet2 = new NormalTweetModel("hi");
        try{
            tweets.addTweet(tweet);
            tweets.addTweet(tweet2);
        }catch(IllegalArgumentException e){
            assertEquals("already tweeted", e.getMessage());
        }
       
    }

	public void testHas(){
//		TwitterListModel tweets = new TwitterListModel();
		NormalTweetModel tweet = new NormalTweetModel("hi");
		tweets.addTweet(tweet);
//		assertEquals("Zero Tweets case not handled", 0 , tweets.getListLength());
		NormalTweetModel tweetT = new NormalTweetModel("hi2");
		tweets.addTweet(tweetT);
		NormalTweetModel tweet2 = new NormalTweetModel("hi2");
		tweets.addTweet(tweet2);
		assertEquals("success",  tweets.hasTweet(tweet2), true);
	}
    
}

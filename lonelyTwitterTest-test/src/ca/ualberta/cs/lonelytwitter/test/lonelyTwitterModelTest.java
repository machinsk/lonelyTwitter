package ca.ualberta.cs.lonelytwitter.test;

import java.util.Date;

import android.test.ActivityInstrumentationTestCase2;
import ca.ualberta.cs.lonelytwitter.ImportantTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;

public class lonelyTwitterModelTest extends
        ActivityInstrumentationTestCase2<LonelyTwitterActivity> {

    public lonelyTwitterModelTest() {
        super(LonelyTwitterActivity.class);
    }

    protected void setUp() throws Exception {
        super.setUp();
    }
   
//    public void testFail(){
//        fail("yolo");
//    }
   
//    public void testPass(){
//        assertEquals("They are equal", 5, 5);
//    }
   
   
   
    public void testEqual(){
        Date date = new Date(12343);
        NormalTweetModel normal = new NormalTweetModel("test tweet");
        NormalTweetModel secondTweet = new NormalTweetModel("test tweet 2");
        assertFalse("Tweets are not equal", normal.equals(secondTweet));
    }

    public void testEquals(){
        NormalTweetModel normal = new NormalTweetModel("test tweet");
        ImportantTweetModel imp = new ImportantTweetModel("test tweet");
        LonelyTweetModel lone = new LonelyTweetModel("test tweet") {
           
            @Override
            public Date getTimestamp() {
                // TODO Auto-generated method stub
                return null;
            }
        };
        assertTrue("NormalTweet does not eqaul a ImportantTweet", normal.equals(imp));
        assertTrue("ImpTweet does not eqaul a LoneTweet", imp.equals(lone));
        assertTrue("NormalTweet does not eqaul a LoneTweet", normal.equals(lone));
       
    }
   
    public boolean greaterThan(int i, int j){
        if(i>j){
            return true;
        }else{
            return false;
        }
    }
   
   
   
   
}
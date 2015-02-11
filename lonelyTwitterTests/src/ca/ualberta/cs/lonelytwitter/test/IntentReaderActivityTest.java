package ca.ualberta.cs.lonelytwitter.test;

import ca.ualberta.cs.lonelytwitter.IntentReaderActivity;
import android.content.Intent;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;
import ca.ualberta.cs.lonelytwitter.R;

public class IntentReaderActivityTest extends
		ActivityInstrumentationTestCase2<IntentReaderActivity> {

	public IntentReaderActivityTest() {
		super(IntentReaderActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testSendText(){
		String text = "Hello";
		IntentReaderActivity activity = startWithText(text, IntentReaderActivity.NORMAL);
		assertEquals("Is the activity getting my text?", text, activity.getText());
	}

	public void testSendReverseText(){
		String text = "Hello";
		String text2 = "olleH";
		IntentReaderActivity activity = startWithText(text, IntentReaderActivity.REVERSE);
		assertEquals("Is the activity reversing my text?", text2, activity.getText());
	}
	
	public void testDoubleText(){
		String text = "Hi";
		IntentReaderActivity activity = startWithText(text, IntentReaderActivity.DOUBLE);
		assertEquals("correct?", text+text, activity.getText());
	}
	
	public void testDisplayText(){
		IntentReaderActivity activity = startWithText("Hello", IntentReaderActivity.NORMAL);
		TextView view = (TextView) activity.findViewById(R.id.intentText);
		assertEquals("display correct text?", "Hello", view.getText());
	}
	
	private IntentReaderActivity startWithText(String text, int transform_code){
		
		Intent intent = new Intent();
		intent.putExtra(IntentReaderActivity.TEXT_KEY, text);
		intent.putExtra(IntentReaderActivity.TRANSFORM_KEY, transform_code);
		setActivityIntent(intent);
		return(IntentReaderActivity) getActivity();
	}
	
	private IntentReaderActivity startWithoutText(){
		
		Intent intent = new Intent();
		setActivityIntent(intent);
		return(IntentReaderActivity) getActivity();
	}
	
	public void testDisplayEmptyText(){
		IntentReaderActivity activity = startWithoutText();
		TextView view = (TextView) activity.findViewById(R.id.intentText);
		assertEquals("is getText empty?", "No Text", view.getText());
	}
	
	
}

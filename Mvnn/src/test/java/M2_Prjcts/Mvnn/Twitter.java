package M2_Prjcts.Mvnn;

import org.testng.annotations.Test;

public class Twitter {
	@Test
	public void twitterAccount()
	{
		System.out.println("Twitter Account Created");
	}
	
	@Test
	public void twitterAccount_profile()
	{
		System.out.println("Twitter Account Update");
	}
	
	@Test
	public void tweets()
	{
		System.out.println("tweet_post/reply");
	}
	
	@Test
	public void tweet_Edit()
	{
		System.out.println("tweets_edit_saved/cancel");
	}
	@Test
	public void tweet_Delete()
	{
		System.out.println("tweets_delete_ok/cancel");
	}
}

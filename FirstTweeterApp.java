
/**
 * @author Raheel Khan
 * @Description - the program will read twitter stream for a specific user using his OAuth credentials and key pairs
 *
 */

import twitter4j.conf.ConfigurationBuilder;
import twitter4j.TwitterFactory;
import java.util.List;
import twitter4j.Status;

public class FirstTweeterApp {

	public static void main(String[] args) throws twitter4j.TwitterException {
		
		ConfigurationBuilder cf = new ConfigurationBuilder();
		
		cf.setDebugEnabled(true)
			.setOAuthConsumerKey("3ZhECgoPYOW80oguhnWkCsBRt")
			.setOAuthConsumerSecret("HBNV5KSlNQ1R5ZaKIfaDVeHvGjiV3gVHAUBksHaWQecj86ExhE")
			.setOAuthAccessToken("38505652-2jjX4LkEO8ekk0ZUTw29GcQxlYHLo7kEavxqTpnjT")
			.setOAuthAccessTokenSecret("oVtGtOQaFv5vdk6RbSIMbTdQMgwcwahqTiqZrs5247IaJ");
		
		TwitterFactory tf = new TwitterFactory(cf.build());
		twitter4j.Twitter twitter = tf.getInstance();
		
		List<Status> status = twitter.getHomeTimeline();
		//List<Status> status2 = twitter.getFavorites();
		
		System.out.println("Screen Name:    " + twitter.getScreenName());
		
		for (Status st: status) {
				System.out.println("User:   " + st.getUser().getName() + " <><><><><> " + st.getText());
				System.out.println("Image URL:   " +st.getUser().getProfileImageURL());
		}
		

	}

	public void authenticateUser() {
		// code to come here...
	}
}

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class JenkinsJob {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		String url = "http://localhost:8080/job/JenkinsJob/build?token=vinodd";
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		Thread.sleep(50000);
		System.out.println("Done ::"+con.getResponseCode());
	}

}

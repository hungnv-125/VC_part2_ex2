package ex2;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

	// TODO Auto-generated method stub
	private static final Logger logger = LoggerFactory.getLogger("ex2");

	// Tạo Document từ URL và lấy title
	public static void getTitleOfUrl() throws IOException {
		Document doc = Jsoup.connect("http://dantri.com.vn/").get();
		String title = doc.text();
		System.out.println(title);
		logger.debug(title);
	}


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		getTitleOfUrl();
	}

}

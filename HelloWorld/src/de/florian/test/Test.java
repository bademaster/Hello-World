
package de.florian.test;
import java.io.File;
import java.io.IOException;



import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Test");

		// JSoup
	}
	
	
	public static org.jsoup.select.Elements getElements(File input) throws IOException {
		String source = null;
		org.jsoup.nodes.Document doc = Jsoup.parse(input, "utf-8", source);
		org.jsoup.select.Elements elements = doc.select("div.fp_result");
		return elements;
	}
}

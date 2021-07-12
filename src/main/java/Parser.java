import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.net.URL;

public class Parser {
    private static Document getPage() throws IOException {
        String url = "https://www.gismeteo.com/weather-almaty-5205/month/";
        Document page = Jsoup.parse(new URL(url), 8000);
        return page;
    }
    public static void main(String[] args) throws IOException {
        System.out.println(getPage());
    }
}

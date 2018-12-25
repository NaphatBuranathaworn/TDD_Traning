package th.co.gosoft;

import com.rometools.rome.feed.synd.SyndEntry;
import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.io.SyndFeedInput;
import com.rometools.rome.io.XmlReader;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class RSSParser {

    public PostToday parse(String url) throws Exception {
        PostToday postToday = new PostToday();
        postToday.setTitle(this.extractTitle(url));
        postToday.setAmountOfItem(this.extractAmountTitle(url));
        postToday.setListOfItemTitle(this.extractListTitle(url));
        return postToday;
    }

    private String extractTitle(String url) throws Exception {
        URL postTodayUrl = new URL(url);
        SyndFeedInput input = new SyndFeedInput();
        SyndFeed feed = input.build(new XmlReader(postTodayUrl));
        return feed.getTitle();
    }

    private int extractAmountTitle(String url) throws Exception {
        URL postTodayUrl = new URL(url);
        SyndFeedInput input = new SyndFeedInput();
        SyndFeed feed = input.build(new XmlReader(postTodayUrl));
        return feed.getEntries().size();
    }

    private String[] extractListTitle(String url) throws Exception {
        URL postTodayUrl = new URL(url);
        SyndFeedInput input = new SyndFeedInput();
        SyndFeed feed = input.build(new XmlReader(postTodayUrl));

        List<String> resultList = new ArrayList<>();
        for(SyndEntry obj : feed.getEntries()) {
            resultList.add(obj.getTitle());
        }

        return resultList.toArray(new String[resultList.size()]);
    }

}

package th.co.gosoft;

import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.io.SyndFeedInput;
import com.rometools.rome.io.XmlReader;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Paths;

public class RSSParserTest {

    final String URL = "https://www.posttoday.com/rss/src/breakingnews.xml";

    @Test
    public void getPathSouldReturnLocalPathURL() throws MalformedURLException {
        String localPath = "D:\\_training_TDD\\post_today.xml";
        URL localurl = Paths.get(localPath).toUri().toURL();
        Assert.assertEquals(localPath, localurl.toString());
    }

    @Test
    public void parsePostTodayShouldNotNull() throws Exception {
        URL url = new URL(URL);
        SyndFeedInput input = new SyndFeedInput();
        SyndFeed feed = input.build(new XmlReader(url));
        Assert.assertNotEquals(null, feed);
    }

    @Test
    public void getTitlePostTodayShouldBeString() throws Exception {
        RSSParser rssPaser = new RSSParser();
        PostToday actual = rssPaser.parse(URL);
        Assert.assertEquals("Posttoday.com : Breaking News", actual.getTitle());
    }

    @Test
    public void getCountTitlePostTodayShouldCount20() throws Exception {
        RSSParser rssPaser = new RSSParser();
        PostToday actual = rssPaser.parse(URL);
        Assert.assertEquals(20, actual.getAmountOfItem());
    }

    @Test
    public void getListTitlePostTodayShouldMoreThan0() throws Exception {
        RSSParser rssPaser = new RSSParser();
        PostToday actual = rssPaser.parse(URL);
        Assert.assertTrue(actual.getListOfItemTitle().length > 0);
    }



}

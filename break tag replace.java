

package javaapplication19;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.safety.Whitelist;


public class JavaApplication19 {

    public static void main(String[] args) {
      String strings= "<div>imran imranimranimranimranimran imranimran<br/><br/><br/>imranimran</div>";
       // Document document = Jsoup.parse(strings);
    //document.outputSettings(new Document.OutputSettings().prettyPrint(false));//makes html() preserve linebreaks and spacing
   // document.select("br").append("\\n");
    //document.select("p").prepend("\\n\\n");
    //String s = document.html().replaceAll("<br/>", "<br/>");

    String document= Jsoup.parse(strings.replaceAll("(?i)<br[^>]*>", "br2n")).text();
    String text = document.replaceAll("br2n", "\n");
    
    String string= Jsoup.clean(text, "", Whitelist.none(), new Document.OutputSettings().prettyPrint(false));
    System.out.println(string);
    }
    
}

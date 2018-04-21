

package javaapplication19;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.safety.Whitelist;


public class JavaApplication19 {

    public static void main(String[] args) {
        
        
//    String strings= "<div>imran imranimranimranimranimran imranimran<br/><br/><br/>imranimran</div>";
//    String s="wefjwefhiwf\n\n\njwfvuwfbw\n\nuioefhcweiuf";
//    s=s.trim().replaceAll("\n+","\n");//+ for multiple occurrences 
//    System.out.println(s);
//    String s1="wefjwefhiwf<br/><br/><br/>jwfvuwfbw<br/><br/>uioefhcweiuf";
//    s1=s1.trim().replaceAll("<br/>","\n");//+ for multiple occurrences 
//    System.out.println(s1);
//    String s2=s1.trim().replaceAll("\n+","\n");
//    System.out.println(s2);
        
    String s1="wefjwefhiwf<br/><br/><br/><br><br>jwfvuwfbw<br/><br/><br/><br/><br/>uioefhc<br/><br/><br/>weiuf";
    s1=s1.trim().replaceAll("(?i)<br[^>]*>","\n");//+ for multiple occurrences 
    System.out.println(s1);
    String s2=s1.trim().replaceAll("\n+","<br/><br/>");
    System.out.println(s2);
    }
    
}

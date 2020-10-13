import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;



/**
 * TODO: Document me!
 *
 * @author kalpap
 *
 */
public class MultiKeyMap {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Map<String, Map<String, String>> MultiKey = new  HashMap<String, Map<String,String>>();
        Map<String, String> SubKey = new  HashMap<String, String>();
        SubKey.put("x1", "1");
        MultiKey.put("a", SubKey);
        SubKey = new  HashMap<String, String>();
        SubKey.put("x2", "2");
        MultiKey.put("b", SubKey);
        Iterator KeyIterator = MultiKey.entrySet().iterator();
        Map.Entry ki;
        while(KeyIterator.hasNext()){
            ki =  (Map.Entry)  KeyIterator.next();
            KeyIterator.remove();
            System.out.println(ki.getKey());
           
        }
        }
        
    }



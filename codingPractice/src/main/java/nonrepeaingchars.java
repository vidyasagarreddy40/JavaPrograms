import java.util.*;

public class nonrepeaingchars {

    public static void main(String[] args) {
        String aa = "adhandfgdmgdfeg";

        System.out.println( firstInstance(aa));
    }

    public static char firstInstance(String a) {
        Set<Character> hs = new HashSet<Character>();
        List<Character> li = new ArrayList<Character>();

        char[] c = a.toCharArray();
        HashMap<Character, Integer> hm = new LinkedHashMap<Character, Integer>();

        for (int i = 0; i < c.length; i++) {
            if (hm.containsKey(c[i])) {
                hm.put(c[i], hm.get(c[i]) + 1);
            } else {
                hm.put(c[i], 1);
            }
        }

        for (Character key : hm.keySet()) {
            if (hm.get(key) == 1) {
                li.add(key);
            }
        }
        if (li.isEmpty()) {
            li.add('_');
        }


        return li.get(0);
    }


}

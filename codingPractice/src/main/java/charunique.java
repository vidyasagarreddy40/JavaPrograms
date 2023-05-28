import java.util.*;

public class charunique {

    public static void main(String[] args){
       charunique cc=new charunique();
       char v=cc.solution("ngrhhqbhnsipkcoqjyviikvxbxyphsnjpdxkhtadltsuxbfbrkof");
       System.out.println(v);
    }

    char solution(String s) {

        List<Character> ls = new ArrayList<Character>();
        char[] ss = s.toCharArray();
        Map<Character, Integer> hm = new LinkedHashMap<Character, Integer>();

        for (int i = 0; i < ss.length; i++) {

            if (hm.containsKey(ss[i])) {
                hm.put(ss[i], hm.get(ss[i]) + 1);
            } else {
                hm.put(ss[i], 1);
            }

        }
        for (Character key : hm.keySet()) {
            if (hm.get(key) == 1) {
                ls.add(key);
            }
        }
        if (ls.isEmpty()) {
            ls.add('_');
        }


        return ls.get(0);
    }
}

package Questions.ValidAnagram;

import java.util.*;
import java.util.stream.Collectors;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        List<String> sortedS = Arrays.stream(s.split("")).sorted().collect(Collectors.toList());
        List<String> sortedT = Arrays.stream(t.split("")).sorted().collect(Collectors.toList());
        return sortedS.equals(sortedT);
    }
    }





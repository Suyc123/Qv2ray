package N44;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String ReverseSentence(String str) {
        int len = str.length();
        if(len < 2)
            return str;
        List<String> words = new ArrayList<String>();
        int rear = len;
        int front = len - 1;
        while(front >= 0){
            if(front == 0){
                if(rear - front > 0)
                    words.add(str.substring(front, rear));
                break;
            }

            if(str.charAt(front) == ' ') {
                if(rear - front > 0)
                    words.add(str.substring(front + 1, rear));
                while (front >= 0 && str.charAt(front) == ' ') {
                    front--;
                }
                rear = front + 1;
            }else{
                front --;
            }
        }
        String res = "";
        System.out.println(words.size());
        System.out.println(words.get(0).length());
        if(words.size() == 0 && words.get(0).length() == 0)
            return str;
        for(int i = 0; i < words.size(); i ++){
            res = res + words.get(i);
            if(i < words.size() - 1)
                res = res + " ";
        }
        return res;
    }
}

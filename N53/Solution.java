package N53;

public class Solution {
    public boolean isNumberic(char[] str){
        if(str.length == 0)
            return false;
        int eFlag = -1;  //记录 是否出现过 e 或 E
        int cFlag = -1;
        for(int i = 0; i < str.length; i ++){
            if(i == 0){
                if(str[i] != '+' && str[i] != '-' && !(str[i] >= '0' && str[i] <= '9'))
                    return false;
                continue;
            }
            if(str[i] == 'e' || str[i] == 'E'){
                if(eFlag != -1)
                    return false;
                eFlag = i;
            }else if(str[i] == '-' || str[i] == '+'){
                if(str[i - 1] == 'e' || str[i - 1] == 'E')
                    continue;
                return false;
            }else if(str[i] == '.'){
                if(eFlag != -1 || cFlag != -1)
                    return false;
                cFlag = i;
            }else if(!(str[i] >= '0' && str[i] <= '9')){
                return false;
            }
        }
        if(eFlag == str.length - 1)
            return false;
        return true;
    }
}

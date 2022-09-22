
//Input: s = "Let's take LeetCode contest"
//Output: "s'teL ekat edoCteeL tsetnoc"



  public String reverseWords(String s) {
        StringBuilder str = new StringBuilder();
        String res = "";
     for(char c: s.toCharArray()){
         if (c==' '){
             str.reverse();
             res+=str;
             res+=" ";
             str = new StringBuilder();
         }
         else {
             str.append(c);
         }
     }
     str.reverse();
     res+=str;
     return res;
    }

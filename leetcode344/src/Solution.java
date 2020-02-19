public class Solution {
    public static void main(String args[]){
        char[] s = new char[] {'a','b','c','d'};
        char[] rev = new char[s.length];

        reverse(s,rev,0);

        for(char ch : rev){
            System.out.print(ch);

            if(ch != rev[rev.length-1])
                System.out.print(",");
        }
    }
    private static char[] reverse(char[] org, char[] rev, int idx){
        if(idx == org.length)
            return rev;
        rev[idx] = org[org.length-1 - idx];
        return reverse(org,rev,idx+1);
    }
}


/*
 Other solution.

 class Solution {
    public char[] reverseString(char[] s) {

        char[] res = new char[s.length];

        res = reverseFunc(s,s.length-1);

        return res;
    }

    public char[] reverseFunc(char[] org, int idx){
        if(idx == 0)
            return org[idx];
        return org[idx] + reverseFunc(org,idx-1);

    }
}
*/

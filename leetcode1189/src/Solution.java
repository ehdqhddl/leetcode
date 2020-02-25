import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String args[]){
        String text = "krhizmmgmcrecekgyljqkldocicziihtgpqwbticmvuyznragqoyrukzopfmjhjjxemsxmrsxuqmnkrzhgvtgdgtykhcglurvppvcwhrhrjoislonvvglhdciilduvuiebmffaagxerjeewmtcwmhmtwlxtvlbocczlrppmpjbpnifqtlninyzjtmazxdbzwxthpvrfulvrspycqcghuopjirzoeuqhetnbrcdakilzmklxwudxxhwilasbjjhhfgghogqoofsufysmcqeilaivtmfziumjloewbkjvaahsaaggteppqyuoylgpbdwqubaalfwcqrjeycjbbpifjbpigjdnnswocusuprydgrtxuaojeriigwumlovafxnpibjopjfqzrwemoinmptxddgcszmfprdrichjeqcvikynzigleaajcysusqasqadjemgnyvmzmbcfrttrzonwafrnedglhpudovigwvpimttiketopkvqw";
        int res = 0;
        //arr = balon
        int[] arr = new int[5];

        for(int i = 0;i<text.length();i++) {
            if (text.charAt(i) == 'b')
                arr[0]++;
            else if (text.charAt(i) == 'a')
                arr[1]++;
            else if (text.charAt(i) == 'l')
                arr[2]++;
            else if (text.charAt(i) == 'o')
                arr[3]++;
            else if (text.charAt(i) == 'n')
                arr[4]++;
            else
                continue;
        }


        while(true){
            if(arr[0] < 1 || arr[1] < 1 || arr[4] < 1)
                break;
            if(arr[2] < 2 || arr[3] < 2)
                break;

            arr[0]-=1;arr[1]-=1;arr[2]-=2;arr[3]-=2;arr[4]-=1;
            res++;
        }

        System.out.println(res);
    }
}

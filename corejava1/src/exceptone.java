public class exceptone {
    public static void main(String[] args) {
        String str="aabbccddeffgg";
        String[] s=str.split("");
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(s[i].equals(s[j])){
                    s[i]="0";
                    s[j]="0";
                    break;
                }
            }
        }
        for(int k=0;k<str.length();k++){
            if(s[k].equals("0")){
                continue;
            }
            else{
                System.out.println(s[k]);
            }
        }



    }
}

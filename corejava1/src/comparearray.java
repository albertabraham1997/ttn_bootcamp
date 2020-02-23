public class comparearray {
    public static void main(String[] args) {
        String str1="Albert";
        String str2="smpAlbertsmpAlbert";
        String[] strarr1=str1.split("");
        String[] strarr2=str2.split("");
        char[] common=new char[str1.length()];
        int k=0;
        for(int i=0;i<strarr1.length;i++){
            for(int j=0;j<strarr2.length;j++){
                if(strarr1[i].equals(strarr2[j])){
                    //System.out.println(k);
                    //System.out.println(strarr1[i].charAt(0));
                    common[k]=strarr1[i].charAt(0);
                    k=k+1;
                    break;



                }
            }
        }
        for(int l=0;l<strarr1.length;l++){
            System.out.println(common[l]);
        }
    }
}

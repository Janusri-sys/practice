class CodeStr{
    public static void main(String[] args){
        String s="alabama";
        int count=0;
        boolean[] isVisit=new boolean[26];
        int n=s.length();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(s.charAt(j)!='#' && !isVisit[s.charAt(i)-'a']){
                if(s.charAt(i)==(s.charAt(j)) && (j)%2==0){
                s=s.replace(s.charAt(j),'#');
                count+=1;
                isVisit[s.charAt(i)-'a']=true;
                }
            }
            }
        }
        System.out.println(count);
        System.out.println(s);

    }
}
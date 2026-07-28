package day6;
public class ReverswViaRecursion {
    public static void reverse (String[] orgs,int start, int end){
        if (start<end){
            String third =orgs[start];
            orgs[start]= orgs[end];
            orgs[end]= third;
            reverse (orgs,start+1,end -1);
        }else return;
    }
    public static void main(String[] args) {
        String[]campus = {"tcs","zoho","infy","ibm","lti"};
        int start=0;
        int end = campus.length-1;
        reverse(campus,start,end);
        for(String org:campus){
            System.out.println(org);
        }
    }
}

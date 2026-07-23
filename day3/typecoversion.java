

public class typecoversion {
    public static void main(String[] args) {
        //type casting:a.upcasting
        String contactname="jaiadhithya";
        System.out.println(contactname.toLowerCase());
        Object obj1=contactname;
        System.out.println(obj1);
        obj1=12.5;//upcasting
        System.out.println(obj1);
        Object obj2=false;
        boolean data =(boolean)obj2;//downcasting
        System.out.println(data);

        //casting between data type

        long zeta =88L;char alpha='\0';
        alpha= (char)zeta;
        System.out.println(alpha);
        short micro = 92;int fella =0;
        fella = micro;
        float seek = 0.0F;seek = micro;
        byte sigma = 0;sigma = (byte)micro;
        
        char check = 'R',match = 'a';
        check = (char)(check^match);  
        match= (char)(check^match);
        check= (char)(check^match);
        System.out.println(check+""+match);
        
    }
}

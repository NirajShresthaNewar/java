public class HandelingString
{
    public static void main(String[]args)
    {
        String one="Niraj";
        String two="Nirajshrestha";
            
        //1
        int r=one.length();
        System.out.println("len1="+r);
        //2
        System.out.println("len2="+two.charAt(4));
        //3
        System.out.println("len3="+ two.substring(3));
        //4
        System.out.println("len4="+ two.substring(3,5));
        //5
        String ss="Hello";
        String sr="World";
        String outputs=ss.concat(sr);
        System.out.println("concart="+outputs);
        //6
        String st="Eat Sleep code";
        System.out.println("len5="+st.indexOf("Sleep"));
        //7
        String T="Learn hare Coeade";
        System.out.println("len6="+T.indexOf("ea",3));
        //8
        String u="Learn Sleep code";
        System.out.println("len7="+u.lastIndexOf("a"));
        //9
        Boolean out="Hello".equals("Hello");
        System.out.println("equal:"+out);
        
        Boolean outt="Hello".equals("hello");
        System.out.println("equal2:"+outt);
        //10
        Boolean out1="Hello".equalsIgnoreCase("Hello");
        System.out.println("equal3:"+out1);
        Boolean out2="Hello".equalsIgnoreCase("hello");
        System.out.println("equal4:"+out2);
        //11
        String s1="abc";
        String s2="dec";
        int out3=s1.compareTo(s2);
        System.out.println("equal5:"+out3);
        
        int out4=s1.compareToIgnoreCase(s2);
        System.out.println("equal6:"+out4);
        
        //13
        String s4="HELLO";
        String s5=s4.toLowerCase();
        System.out.println("equal7:"+s5);
        
        //14
        String s6="HELLO";
        String s7=s4.toUpperCase();
        System.out.println("equal8:"+s7);
        //15
        String s8="Lets learn code";
        String s9=s8.trim();
        System.out.println("equal9:"+s9);
        //16
        String s10="Lets learn code";
        String s11=s10.replace('l','c');
        System.out.println("equal10:"+s11);
        //empty
        String s12="";
        String s13="hi";
        System.out.println(s12.isEmpty());
        System.out.println(s13.isEmpty());
        
    }
}
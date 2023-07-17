
class CharacterExtraction
{
    public static void main(String...s)
    {
      String str="Hello World";
        char ch=str.charAt(2);
        System.out.println(ch);
        
        char chr[]=new char[4];
        str.getChars(1,5,chr,0);
        System.out.println(chr);
        
        
        byte b[]=str.getBytes();
        System.out.println(b);
        
        
        char characters[]=str.toCharArray();
        System.out.println(characters);
        
       
    
    }
}




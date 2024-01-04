class StringReplace{
	public static void main(String [] args){
        String str="hello everyone, how are you?";
        //StringBuffer revStr= new StringBuffer(str);
      //  StringBuilder revStr= new StringBuilder(str);
       // revStr.replace(6,14,"folks");
        str=str.replace("everyone","folks");
        System.out.println(str);
    }
}
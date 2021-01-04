public String doubleChar(String str) {
  
  String s ="";
  for(int x=0; x<str.length();x++){
   s = s + str.substring(x,x+1) + str.substring(x,x+1);
  }
  return s;
}

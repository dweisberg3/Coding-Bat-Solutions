public int countHi(String str) {
  
  int x=0;
  int total =0;
  while(x <str.length()-1){
    if(str.substring(x,x+2).equals("hi")){
      total++;
      x = x+1;
    }
    else{
      x=x+1;
    }
  }
  return total;
}

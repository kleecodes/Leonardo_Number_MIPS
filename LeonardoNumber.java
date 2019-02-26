public class LeonardoNumber{

  public static void main(String[] args){
    int current = 1;// also known as index 1 of results
    int last_num = 1;// also known as index 0 of results
    int spare;
    for(int i = 0; i < Integer.parseInt(args[0]) + 1; i++){
      if(i < 2) System.out.println(current);
      else{
        spare = current;
        current = current + last_num + 1;
        System.out.println(current);
        last_num = spare;
      }
    }

  }
}

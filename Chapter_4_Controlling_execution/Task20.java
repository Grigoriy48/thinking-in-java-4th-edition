public class Task20 {
  static int test(int testval, int begin, int end) {
    if(end < begin)
      return 0;
    else if((testval >= begin) && (testval <= end)) 
      return +1;
    else if((testval < begin) || (testval > end))
      return -1;
    return 0;
  }
  public static void main(String[] args) {
    System.out.println(test(10, 5, 4));
    System.out.println(test(5, 4, 10));
    System.out.println(test(4, 4, 5));
    System.out.println(test(10, 4, 5));  
    System.out.println(test(5, 5, 5));
  }
} 

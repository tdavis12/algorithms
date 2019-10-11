public class Runner {
  public static void main(String[] args)
  {
    Solution sol = new Solution();
    int[] set = {4,5,6,7,0,1,2};

    int t1 = 0;
    int t2 = 4;
    int t3 = 6;
    int t4 = 3;

    System.out.println(sol.search(set, t1));
    System.out.println(sol.search(set, t2));
    System.out.println(sol.search(set, t3));
    System.out.println(sol.search(set, t4));
  }
}

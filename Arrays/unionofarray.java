class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:a)
        {
            set.add(num);
        }
        for(int num2:b)
        {
            set.add(num2);
        }
        return new ArrayList<>(set);
       
        
    }
}

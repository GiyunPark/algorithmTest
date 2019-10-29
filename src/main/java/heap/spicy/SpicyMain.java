package heap.spicy;

public class SpicyMain {

    public static void main(String[] args){
        int scoville[] = {1,2,3,9,10,12};
        int k = 7;

        Solution solution = new Solution();
        int result = solution.solution(scoville,k);
        System.out.println(result);
    }
}

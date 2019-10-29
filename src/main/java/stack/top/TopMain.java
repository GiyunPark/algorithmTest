package stack.top;

public class TopMain {
    public static void main(String[] args){
        TopSolution topSolution=new TopSolution();

        int[] heights={6,9,5,7,4};
        int[] answer= topSolution.solution(heights);

        int[] heights1={3,9,9,3,5,7,2};
        int[] answer1= topSolution.solution(heights1);

        int[] heights2={1,5,3,6,7,6,5};
        int[] answer2= topSolution.solution(heights2);


        ResultView resultView= new ResultView();

        resultView.showResult(answer);
        resultView.showResult(answer1);
        resultView.showResult(answer2);

    }
}

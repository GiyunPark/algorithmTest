package grid.gym;

public class GymClothesMain {

    public static void main(String[] args){
        int totalStudent = 5;
        int[] lost={1,2,3,4,5};
        int[] reserve={2,4};

        GymClothesSolution gymClothesSolution=new GymClothesSolution();
        int answer = gymClothesSolution.solution(totalStudent,lost,reserve);
        System.out.println(answer); // expect 2

        int[] lost1={1,2};
        int[] reserve1={2,4};

        int answer1 = gymClothesSolution.solution(totalStudent,lost1,reserve1);
        System.out.println(answer1); // expect 4
    }
}

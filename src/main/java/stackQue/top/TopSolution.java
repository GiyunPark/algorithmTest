package stackQue.top;

import java.util.Stack;

class TopSolution {
    public int[] solution(int[] heights) {
        Stack<Integer> sender=new Stack<>();
        Stack<Integer> receiver=new Stack<>();
        int[] answer = new int[heights.length];

        for(int sendIdx=0; sendIdx<heights.length; sendIdx++){
            sender.push(heights[sendIdx]);
        }
        for(int heightsLen=heights.length; heightsLen>0; heightsLen-- ){

            for(int receiverIdx=0; receiverIdx<heightsLen-1; receiverIdx++){
                receiver.push(heights[receiverIdx]);
            }
            int senderHeight=sender.pop();

            for(int receiverIdx=heightsLen-1; receiverIdx>0; receiverIdx--){
                int receiverHeight=receiver.pop();

                if(senderHeight<receiverHeight){
                    answer[heightsLen-1]=receiverIdx;
                    break;
                }
            }
        }

        return answer;
    }
}
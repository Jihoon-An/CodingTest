package programmers.lv2;

import java.util.*;

public class Num42587 {
    public int solution(int[] priorities, int location) {
        int cnt = 0;
        int prLen = priorities.length;

        Queue<Doc> que = new LinkedList<>();

        for (int i = 0; i < prLen; i++) {
            if (i == location) {
                que.add(new Doc(priorities[i], true));
            }else {
                que.add(new Doc(priorities[i], false));
            }
        }

        Comparator<Doc> comparator = Comparator.comparingInt(Doc::getPriority);

        while (true) {
            Doc max = que.stream().max(comparator).get();

            Doc doc = que.poll();

            if(doc.priority == max.priority){
                cnt++;
                if(doc.pick) break;
            }
            else que.add(doc);
        }

        return cnt;
    }

    private class Doc {
        int priority;
        boolean pick;

        public Doc(int priority, boolean pick) {
            this.priority = priority;
            this.pick = pick;
        }

        public int getPriority() {
            return priority;
        }
    }
}

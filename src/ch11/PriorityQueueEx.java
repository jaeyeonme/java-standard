package ch11;

import java.util.PriorityQueue;

/**
 * Date   : 2021. 09. 21
 * Source : PriorityQueueEx.java
 * Author : 조재연 (Jaeyeon Cho)
 * Email  : cjyeon1022@gamil.com
 */
public class PriorityQueueEx {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.offer(3);          // pq.offer(new Integer(3)); 오토박싱
        pq.offer(1);
        pq.offer(5);
        pq.offer(2);
        pq.offer(4);
        System.out.println(pq);  // pq의 내부 배열을 출력

        Object obj = null;

        // PriorityQueue에 저장된 요소를 하나씩 꺼낸다.
        while ((obj = pq.poll()) != null)
            System.out.println(obj);
    }
}

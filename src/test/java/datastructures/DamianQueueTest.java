package datastructures;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class DamianQueueTest {

    private DamianQueue<Integer> myQueue = new DamianQueue<>();

    @Test
    public void whenPoll_ThenReturnFirstValueAndRemovesIt() {
        myQueue.add(0);
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        System.out.println(myQueue.poll());
        assertThat(myQueue.size()).isEqualTo(3);
        assertThat(myQueue.get(2)).isEqualTo(3);
    }

    @Test (expected = RuntimeException.class)
    public void whenPollAndQueueIsEmpty_ThenThrowException() {
        myQueue.poll();

    }

    @Test
    public void whenPeek_ThenReturnFirstValue() {
        myQueue.add(0);
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        System.out.println(myQueue.peek());
        assertThat(myQueue.size()).isEqualTo(4);
        assertThat(myQueue.get(2)).isEqualTo(2);
    }
}
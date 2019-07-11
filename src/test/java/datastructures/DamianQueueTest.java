package datastructures;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class DamianQueueTest {

    private DamianQueue<Integer> myQueue = new DamianQueue<>();

    @Test
    public void whenPoll_ThenReturnFirstValueAndRemovesIt() {
        addFourElements();
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
        addFourElements();
        System.out.println(myQueue.peek());
        assertThat(myQueue.size()).isEqualTo(4);
        assertThat(myQueue.get(2)).isEqualTo(2);
    }

    @Test
    public void whenAddToPosition_ThenSizeGetsBigger() {
        addFourElements();
        myQueue.add(1,99);
        assertThat(myQueue.size()).isEqualTo(5);
        assertThat(myQueue.get(1)).isEqualTo(99);
        assertThat(myQueue.get(2)).isEqualTo(1);
    }

    @Test
    public void whenRemoveAnItem_ThenSizeGetsShorter() {
        addFourElements();
        myQueue.remove(1);
        assertThat(myQueue.size()).isEqualTo(3);
        assertThat(myQueue.get(1)).isEqualTo(2);
        assertThat(myQueue.get(0)).isEqualTo(0);
    }

    private void addFourElements() {
        myQueue.add(0);
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
    }
}
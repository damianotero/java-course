package datastructures;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DamianStackTest {

    private DamianStack<Integer> myIntStack;

    @Before
    public void setUp() throws Exception {
        myIntStack = new DamianStack<>();

    }

    @Test
    public void whenPushObject_ThenSizeGetsHigher() {
        myIntStack.push(0);
        myIntStack.push(1);
        myIntStack.push(2);

        assertThat(myIntStack.size()).isEqualTo(3);
    }


    @Test
    public void whenPopObject_ThenSizeGetsShorter() {
        myIntStack.push(0);
        myIntStack.push(1);
        myIntStack.push(2);
        myIntStack.pop();
        assertThat(myIntStack.size()).isEqualTo(2);
    }

    @Test
    public void whenStackContainsItem_ThenReturnTrue() {
        myIntStack.push(0);
        myIntStack.push(1);
        myIntStack.push(2);
        assertThat(myIntStack.contains(2)).isEqualTo(true);
    }

    @Test
    public void whenStackDoesntContainsItem_ThenReturnTrue() {
        myIntStack.push(0);
        myIntStack.push(1);
        myIntStack.push(2);
        assertThat(myIntStack.contains(4)).isEqualTo(false);
    }

    @Test(expected = RuntimeException.class)
    public void whenPopWhenStackIsEmpty_ThenThrowException() {
        myIntStack.pop();
    }

    @Test
    public void whenGetSize_ThenReturnSize() {
        myIntStack.push(0);
        myIntStack.push(1);
        myIntStack.push(2);
        assertThat(myIntStack.size()).isEqualTo(3);
    }

    @Test(expected = RuntimeException.class)
    public void whenPushAPositionGreaterThanSizeOrLessThanZero_ThenThrowException() {
        myIntStack.push(0);
        myIntStack.add(4, 3);
    }

    @Test
    public void whenAddToPositionAndStackIsFull_ThenItGrows() {
        myIntStack.push(0);
        myIntStack.push(1);
        myIntStack.push(2);
        myIntStack.push(0);
        myIntStack.push(1);
        myIntStack.push(2);
        myIntStack.push(0);
        myIntStack.push(1);
        myIntStack.push(2);
        myIntStack.push(0);
        myIntStack.add(2, 0);
        assertThat(myIntStack.size()).isEqualTo(11);
    }

    @Test
    public void whenAddToPosition_ThenGetReturnsPosition() {
        myIntStack.push(0);
        myIntStack.push(1);
        myIntStack.push(2);
        myIntStack.add(0, 99);
        assertThat(myIntStack.get(0)).isEqualTo(99);

    }

    @Test
    public void whenPushAndStackIsFull_ThenItGrows() {
        myIntStack.push(0);
        myIntStack.push(1);
        myIntStack.push(2);
        myIntStack.push(3);
        myIntStack.push(4);
        myIntStack.push(5);
        myIntStack.push(6);
        myIntStack.push(7);
        myIntStack.push(8);
        myIntStack.push(9);
        myIntStack.push( 10);
        assertThat(myIntStack.size()).isEqualTo(11);


    }
}
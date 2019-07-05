package datastructures;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DamianStackTest {

    DamianStack<Integer> myIntStack;

    @Test
    public void whenPushObject_ThenSizeGetsHigher() {
        myIntStack = new DamianStack<>();
        myIntStack.push(0);
        myIntStack.push(1);
        myIntStack.push(2);

        assertThat(myIntStack.getSize()).isEqualTo(3);
    }


    @Test
    public void whenPopObject_ThenSizeGetsShorter() {
        myIntStack = new DamianStack<>();
        myIntStack.push(0);
        myIntStack.push(1);
        myIntStack.push(2);
        myIntStack.pop();
        assertThat(myIntStack.getSize()).isEqualTo(2);
    }

    @Test
    public void whenStackContainsItem_ThenReturnTrue() {
        myIntStack = new DamianStack<>();
        myIntStack.push(0);
        myIntStack.push(1);
        myIntStack.push(2);
        assertThat(myIntStack.contains(2)).isEqualTo(true);
    }

    @Test
    public void whenStackDoesntContainsItem_ThenReturnTrue() {
        myIntStack = new DamianStack<>();
        myIntStack.push(0);
        myIntStack.push(1);
        myIntStack.push(2);
        assertThat(myIntStack.contains(4)).isEqualTo(false);
    }

    @Test(expected = RuntimeException.class)
    public void whenPopWhenStackIsEmpty_ThenThrowException() {
        myIntStack = new DamianStack<>();
        myIntStack.pop();
    }

    @Test
    public void whenGetSize_ThenReturnSize() {
        myIntStack = new DamianStack<>();
        myIntStack.push(0);
        myIntStack.push(1);
        myIntStack.push(2);
        assertThat(myIntStack.getSize()).isEqualTo(3);
    }

    @Test(expected = RuntimeException.class)
    public void whenPushAPositionGreaterThanSizeOrLessThanZero_ThenThrowException() {
        myIntStack = new DamianStack<>();
        myIntStack.push(0);
        myIntStack.addToPosition(4, 3);
    }

    @Test
    public void whenAddToPositionAndStackIsFull_ThenItGrows() {
        myIntStack = new DamianStack<>();
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
        myIntStack.addToPosition(2, 0);
        assertThat(myIntStack.getSize()).isEqualTo(11);
    }

    @Test
    public void whenAddToPosition_ThenGetReturnsPosition() {
        myIntStack = new DamianStack<>();
        myIntStack.push(0);
        myIntStack.push(1);
        myIntStack.push(2);
        myIntStack.addToPosition(0,99);
        assertThat(myIntStack.get(0)).isEqualTo(99);

    }
    @Test
    public void whenPushAndStackIsFull_ThenItGrows() {
        myIntStack = new DamianStack<>();
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
        myIntStack.push( 0);
        assertThat(myIntStack.getSize()).isEqualTo(11);
    }
}
package datastructures;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DamianStackTest {

    DamianStack<Integer> myIntStack;

    @Test
    public void whenPushObject_ThenSizeGetsHigher() {
        myIntStack = new DamianStack<>(5);
        myIntStack.push(0);
        myIntStack.push(1);
        myIntStack.push(2);

        assertThat(myIntStack.getSize()).isEqualTo(3);
    }

    @Test(expected = RuntimeException.class)
    public void ifPushWhenStackIsFull_ThenThrowException() {
        myIntStack = new DamianStack<>(3);
        myIntStack.push(0);
        myIntStack.push(1);
        myIntStack.push(2);
        myIntStack.push(3);

    }

    @Test
    public void whenPopObject_ThenSizeGetsShorter() {
        myIntStack = new DamianStack<>(3);
        myIntStack.push(0);
        myIntStack.push(1);
        myIntStack.push(2);
        myIntStack.pop();
        assertThat(myIntStack.getSize()).isEqualTo(2);
    }

    @Test
    public void whenStackContainsItem_ThenReturnTrue() {
        myIntStack = new DamianStack<>(3);
        myIntStack.push(0);
        myIntStack.push(1);
        myIntStack.push(2);
        assertThat(myIntStack.contains(2)).isEqualTo(true);
    }

    @Test(expected = RuntimeException.class)
    public void whenPopWhenStackIsEmpty_ThenThrowException() {
        myIntStack = new DamianStack<>(3);
        myIntStack.pop();
    }

    @Test
    public void whenGetSize_ThenReturnSize() {
        myIntStack = new DamianStack<>(3);
        myIntStack.push(0);
        myIntStack.push(1);
        myIntStack.push(2);
        assertThat(myIntStack.getSize()).isEqualTo(3);
    }
}
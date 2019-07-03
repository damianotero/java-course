package datastructures;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class DamianLinkedListTest {
    DamianLinkedList<Integer> integerDamianLinkedList = new DamianLinkedList<>();

    @Test
    public void whenAdding3Items_ThenReturnSize3() {

        integerDamianLinkedList.add(1);
        integerDamianLinkedList.add(2);
        integerDamianLinkedList.add(3);
        assertThat(integerDamianLinkedList.getSize()).isEqualTo(3);
    }

    @Test
    public void whenGet_ThenReturnPosition() {
        integerDamianLinkedList.add(1);
        integerDamianLinkedList.add(2);
        integerDamianLinkedList.add(3);
        assertThat(integerDamianLinkedList.get(2)).isEqualTo(3);
    }

    @Test
    public void whenRemoveAnItem_ThenNextPositionChanges() {
        integerDamianLinkedList.add(1);
        integerDamianLinkedList.add(2);
        integerDamianLinkedList.add(3);
        integerDamianLinkedList.remove(1);
        assertThat(integerDamianLinkedList.get(1)).isEqualTo(3);
    }

    @Test
    public void whenAddToPosition_ThenGetReturnsOk() {
        integerDamianLinkedList.add(1);
        integerDamianLinkedList.add(2);
        integerDamianLinkedList.add(3);
        integerDamianLinkedList.addToPosition(2,99);
        assertThat(integerDamianLinkedList.get(2)).isEqualTo(99);
    }
}
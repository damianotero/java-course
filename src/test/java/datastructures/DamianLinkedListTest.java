package datastructures;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class DamianLinkedListTest {
    DamianLinkedList<Integer> integerDamianLinkedList = new DamianLinkedList<>();

    @Test
    public void whenAdding3Items_ThenReturnSize3() {

        addThreeElements();
        assertThat(integerDamianLinkedList.size()).isEqualTo(3);
    }

    @Test
    public void whenGet_ThenReturnPosition() {
        addThreeElements();
        assertThat(integerDamianLinkedList.get(2)).isEqualTo(3);
    }

    @Test
    public void whenRemoveAnItem_ThenNextPositionChanges() {
        addThreeElements();
        integerDamianLinkedList.remove(1);
        assertThat(integerDamianLinkedList.get(1)).isEqualTo(3);
    }

    @Test
    public void whenRemoveTheFirstItem_TheNextPositionsChanges() {
        addThreeElements();
        integerDamianLinkedList.remove(0);
        assertThat(integerDamianLinkedList.get(0)).isEqualTo(2);
        assertThat(integerDamianLinkedList.get(1)).isEqualTo(3);
        assertThat(integerDamianLinkedList.size()).isEqualTo(2);

    }

    @Test
    public void whenAddToPosition_ThenGetReturnsOk() {
        addThreeElements();
        integerDamianLinkedList.add(2,99);
        assertThat(integerDamianLinkedList.get(2)).isEqualTo(99);
    }

    @Test
    public void whenAddToPosition0_ThenHeadEqualsTheValue() {
        addThreeElements();
        integerDamianLinkedList.add(0,99);
        assertThat(integerDamianLinkedList.get(0)).isEqualTo(99);
    }

    @Test (expected = RuntimeException.class)
    public void whenRemoveItemLessThanZero_ThenThrowException() {
        addThreeElements();
        integerDamianLinkedList.remove(-11);
    }

    private void addThreeElements() {
        integerDamianLinkedList.add(1);
        integerDamianLinkedList.add(2);
        integerDamianLinkedList.add(3);
    }
}
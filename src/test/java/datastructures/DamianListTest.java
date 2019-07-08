package datastructures;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class DamianListTest {
    private DamianList<String> damianList;

    @Before
    public void setUp() throws Exception {
        damianList = new DamianList<>();
    }

    @Test
    public void whenAddingAnItemToAList_ThenSizeEqualsOne() {
        damianList.add("Roi");

        assertThat(damianList.size()).isEqualTo(1);
    }


    @Test
    public void whenGettingAnItemFromPosition_ThenReturnName() {
        addToList(damianList, 3);

        assertThat(damianList.get(2)).isEqualTo("Element - 2");
    }

    @Test
    public void whenListContainsItem_ThenReturnTrue() {
        damianList.add("Roi1");

        assertThat(damianList.contains("Roi1")).isEqualTo(true);
    }

    @Test
    public void whenRemoveItem_ThenListDoesNotContainIt() {
        damianList.add("Roi0");
        damianList.add("Roi1");
        damianList.add("Roi2");

        damianList.remove(0);

        assertThat(damianList.contains("Roi0")).isEqualTo(false);
    }

    @Test
    public void whenRemoveItem_thenSizeGetsShort() {
        damianList.add("Roi0");
        damianList.add("Roi1");
        damianList.add("Roi2");

        damianList.remove(0);

        assertThat(damianList.size()).isEqualTo(2);
    }

    @Test(expected = RuntimeException.class)
    public void whenRemovingAPositionOutOfBounds_ThenThrowException() {
        damianList.remove(18);
    }

    @Test(expected = RuntimeException.class)
    public void whenRemovingAPositionEmpty_ThenThrowException() {
        damianList.add("Roi0");
        damianList.remove(1);
    }

    @Test
    public void WhenAddingAnItem_ThenArrayGetsBigger() {
        for (int i = 0; i < 11; i++) {
            damianList.add(String.valueOf(i));
        }

        assertThat(damianList.size()).isEqualTo(11);
    }


    @Test
    public void whenAddToPosition_ThenGetReturnsOk() {
        addToList(damianList,3);
        damianList.add(2, "Added");
        assertThat(damianList.get(2)).isEqualTo("Added");
    }

    @Test
    public void whenAddToPositionAndArrayIsFull_ThenArrayDuplicatesLength() {
        addToList(damianList,10);
        damianList.add(3, "Roi10");
        assertThat(damianList.get(19)).isEqualTo(null);
    }

    @Test(expected = RuntimeException.class)
    public void whenAddToPositionGreaterThanSize_ThenThrowException() {
        addToList(damianList,2);
        damianList.add(6, "Error");
    }

    @Test
    public void whenIsEmpty_ThenReturnTrue() {
        assertThat(damianList.isEmpty()).isEqualTo(true);
        damianList.add("Roi0");
        assertThat(damianList.isEmpty()).isEqualTo(false);

    }

    @Test
    public void whenClearList_ThenIsEmpty() {
        addToList(damianList, 4);
        damianList.clear();
        assertThat(damianList.get(1)).isEqualTo(null);
        assertThat(damianList.size()).isEqualTo(0);
    }

    @Test
    public void whenSetPosition_thenPositionChanges() {
       addToList(damianList, 4);
        damianList.set(1, "setted");
        assertThat(damianList.get(1)).isEqualTo("setted");
    }

    @Test
    public void whenIndexOf_ThenReturnValuesIndex() {
        addToList(damianList,4);
        assertThat(damianList.indexOf("Element - 2")).isEqualTo(2);
        assertThat(damianList.indexOf("NoIndex")).isEqualTo(-1);
    }

    @Test
    public void whenLastIndexOf_ReturnTheLastPosition() {
        damianList.add("Roi0");
        damianList.add("Roi1");
        damianList.add("Roi0");
        damianList.add("Roi3");
        damianList.add("Roi0");
        damianList.add("Roi5");
        assertThat(damianList.lastIndexOf("Roi0")).isEqualTo(4);
        assertThat(damianList.lastIndexOf("NoIndex")).isEqualTo(-1);
    }

    @Test
    public void ifThisObjectEqualsObject_ThenReturnTrue() {
        damianList.add("1");
        DamianList<String> newList = new DamianList<>();
        newList.add("1");
        assertThat(damianList).isEqualTo(newList);

    }

    @Test
    public void whenContainsAllElements_ReturnTrue() {
        addToList(damianList,4);
        DamianList<String> damianList2 = new DamianList<>();
        damianList2.add("Element - 2");
        damianList2.add("Element - 1");
        damianList2.add("Element - 0");
        damianList2.add("Element - 3");
        assertThat(damianList2.containsAll(damianList)).isEqualTo(true);
        damianList.add("NotContained");
        assertThat(damianList2.containsAll(damianList)).isEqualTo(false);
    }

    @Test
    public void whenAddAll_ThenContainsAllElementsAdded() {
        damianList.add("Element");
        DamianList<String> damianList2 = new DamianList<>();
        damianList2.add("Roi2");
        damianList2.add("Roi1");
        damianList2.add("Roi0");
        damianList2.add("Roi3");
        damianList.addAll(damianList2);
        assertThat(damianList.containsAll(damianList2)).isEqualTo(true);
    }

    @Test
    public void whenRemoveAllElementsOfSecondList_ThenListDoesNotContainThatElements() {
        addToList(damianList,4);
        DamianList<String> damianList2 = new DamianList<>();
        damianList2.add("Element - 1");
        damianList2.add("Element - 0");
        damianList.removeAll(damianList2);
        assertThat(damianList.contains("Element - 3")).isEqualTo(true);
        assertThat(damianList.contains("Element - 1")).isEqualTo(false);
        assertThat(damianList.contains("Element - 0")).isEqualTo(false);


    }

    private void addToList(DamianList<String> damianList, String prefix, int total) {
        for (int i = 0; i < total; i++) {
            damianList.add("Element - " + prefix + i);
        }
    }


    private void addToList(DamianList<String> damianList, int total) {
        addToList(damianList, "", total);
    }
}

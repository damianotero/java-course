package datastructures;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class DamianListTest {
    private DamianList<String> damianList;

    @Before
    public void setUp() throws Exception {
        damianList = new DamianList<>(3);

    }

    @Test
    public void whenAddingAnItemToAList_ThenSizeEqualsOne() {
        damianList.add("Roi");

        assertThat(damianList.size()).isEqualTo(1);
    }

    @Test(expected = RuntimeException.class)
    public void whenAddingMoreItemsThanSize_ThenThrowException() {
        damianList.add("Roi1");
        damianList.add("Roi2");
        damianList.add("Roi3");
        damianList.add("Roi4");
    }

    @Test
    public void whenGettingAnItemFromPosition_ThenReturnName() {
        damianList.add("Roi0");
        damianList.add("Roi1");
        damianList.add("Roi2");

        assertThat(damianList.get(2)).isEqualTo("Roi2");
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

    @Test (expected = RuntimeException.class)
    public void whenRemovingAPositionOutOfBounds_ThenThrowException() {
        damianList.remove(8);
    }

    @Test (expected = RuntimeException.class)
    public void whenRemovingAPositionEmpty_ThenThrowException() {
        damianList.add("Roi0");
        damianList.remove(1);
    }
}
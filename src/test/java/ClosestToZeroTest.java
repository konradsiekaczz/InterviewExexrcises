import com.company.ClosestToZero;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ClosestToZeroTest {

    @Test
    public void shouldFindCorrectlyClosestToZero() {
        ClosestToZero closestToZero = new ClosestToZero();
        int expected = -1;
        int[] intArr = {2, 3, 5, -2, -1};
        Assert.assertEquals(expected, closestToZero.getClosestToZero(intArr));
    }

    @Test
    public void shouldFindCorrectlyClosestToZero2() {
        ClosestToZero closestToZero = new ClosestToZero();
        int expected = 1;
        int[] intArr = {1, 3, 5, -2, -1};
        Assert.assertEquals(expected, closestToZero.getClosestToZero(intArr));
    }


}
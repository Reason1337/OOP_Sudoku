import org.junit.Test;
import org.junit.Before;

public class RGameGridBasicTest {
    private int[][] grid;

    @Before
    public void setUp() {
        grid = new int[][]{
            {9,4,0,1,0,2,0,5,8},
            {6,0,0,0,5,0,0,0,4},
            {0,0,2,4,0,3,1,0,0},
            {0,2,0,0,0,0,0,6,0},
            {5,0,8,0,2,0,4,0,1},
            {0,6,0,0,0,0,0,8,0},
            {0,0,1,6,0,8,7,0,0},
            {7,0,0,0,4,0,0,0,3},
            {4,3,0,5,0,9,0,1,2}
        };
    }

    @Test
    public void gameGridCtorTest() {
        RGameGrid game = new RGameGrid(grid);
    }

    @Test
    public void gameGridCpyCtorTest() {
        RGameGrid game = new RGameGrid(grid);
        RGameGrid gameCpy = new RGameGrid(game);
    }

    @Test
    public void isInitialTest() {
       RGameGrid game = new RGameGrid(grid);
       boolean result = game.isInitial(0,0);
    }

    @Test
    public void getFieldTest() {
       RGameGrid game = new RGameGrid(grid);
       int result = game.getField(0,0);
    }

    @Test
    public void setFieldTest() {
       RGameGrid game = new RGameGrid(grid);
       game.setField(0,0,1);
    }

    @Test
    public void clearFieldTest() {
       RGameGrid game = new RGameGrid(grid);
       game.clearField(0,0);
    }

    @Test
    public void toStringTest() {
        RGameGrid game = new RGameGrid(grid);
        String result = game.toString();
    }
}

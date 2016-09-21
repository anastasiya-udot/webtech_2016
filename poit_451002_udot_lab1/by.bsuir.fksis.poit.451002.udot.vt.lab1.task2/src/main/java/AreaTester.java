
import obj.Area;
import obj.UserPoint;
import org.junit.Test;

import static junit.framework.Assert.*;
/**
 * Created by anastasiya on 21.9.16.
 */
public class AreaTester {

    @Test
    public void testPointInArea(){
        UserPoint point = new UserPoint();
        Area area = new Area();

        point.setX(2);
        point.setY(4);
        assertTrue(area.isInArea(point));

        point.setX(-6);
        point.setY(-3);
        assertTrue(area.isInArea(point));

    }

    @Test
    public void testPointNotInArea(){
        UserPoint point = new UserPoint();
        Area area = new Area();

        point.setX(100);
        point.setY(100);
        assertFalse(area.isInArea(point));
    }
}

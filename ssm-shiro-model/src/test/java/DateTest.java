import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
    @Test
    public void tets(){
        String strDate;
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        strDate=simpleDateFormat.format(new Date());
        System.out.println(strDate);
//        return strDate;
    }
}

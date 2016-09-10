package standalone;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.SomeSrv;

/**
 * standalone-owy tester repozytoriów.
 */
public class StandaloneStart {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("standalone-config.xml");
        SomeSrv srv = ctx.getBean(SomeSrv.class);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ctx.close();
    }
}

package com.jd.bdp.hydra.collector;

import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * User: xiangkui
 * Date: 13-5-22
 * Time: 下午5:04
 */
public class HydraCollector {
    public static void main(String[] strings) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{
                "classpath*:dubbo-hydra-provider.xml"
        });
        context.start();
        while (true) {
            try {
                Thread.sleep(Long.MAX_VALUE);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
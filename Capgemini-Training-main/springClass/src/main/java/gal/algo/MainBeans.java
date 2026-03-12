package gal.algo;

import com.gal.algo.PasswordHasher;
import com.gal.algo.Calc;

import javax.sql.DataSource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainBeans {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext();

        // scan packages containing beans
        context.scan("com.gal","gal.algo");
        context.refresh();

        PasswordHasher bean = context.getBean(PasswordHasher.class);
        PasswordHasher bean2 = context.getBean(PasswordHasher.class);

        System.out.println(bean);
        System.out.println(bean2);

        System.out.println(bean.hash("hello"));

        // get Calc bean by type
        Calc calc = context.getBean(Calc.class);
        System.out.println(calc.add(5,3));

        // get beans by correct name
        Object bean5 = context.getBean("getCalc");
        Object bean6 = context.getBean("getCalcNamedBean");

        // ⭐ NEW PART (DataSource Bean)
        DataSource dataSource = context.getBean(DataSource.class);
        System.out.println("DataSource bean created: " + dataSource);

        String[] beans = context.getBeanDefinitionNames();

        for(String beanname : beans){
            System.out.println(beanname);
        }

        context.close();
    }
}
package de.subhan.sgd;

import de.subhan.sgd.model.Classificator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SgdApplication {

    public static void main(String[] args) {
        SpringApplication.run(SgdApplication.class, args);
    }

    @Bean(name = "Classificator0")
    public Classificator createClassificator0() {
        Classificator classificator0 = ClassificatorFactory.createClassificator("0");
        System.out.println("Classificator0 Done");
        return classificator0;
    }

    @Bean(name = "Classificator1")
    public Classificator createClassificator1() {
        Classificator classificator1 = ClassificatorFactory.createClassificator("1");
        System.out.println("Classificator1 Done");
        return classificator1;
    }

    @Bean(name = "Classificator2")
    public Classificator createClassificator2() {
        Classificator classificator2 = ClassificatorFactory.createClassificator("2");
        System.out.println("Classificator2 Done");
        return classificator2;
    }

    @Bean(name = "Classificator3")
    public Classificator createClassificator3() {
        Classificator classificator3 = ClassificatorFactory.createClassificator("3");
        System.out.println("Classificator3 Done");
        return classificator3;
    }

    @Bean(name = "Classificator4")
    public Classificator createClassificator4() {
        Classificator classificator4 = ClassificatorFactory.createClassificator("4");
        System.out.println("Classificator4 Done");
        return classificator4;
    }

    @Bean(name = "Classificator5")
    public Classificator createClassificator5() {
        Classificator classificator5 = ClassificatorFactory.createClassificator("5");
        System.out.println("Classificator5 Done");
        return classificator5;
    }

    @Bean(name = "Classificator6")
    public Classificator createClassificator6() {
        Classificator classificator6 = ClassificatorFactory.createClassificator("6");
        System.out.println("Classificator6 Done");
        return classificator6;
    }

    @Bean(name = "Classificator7")
    public Classificator createClassificator7() {
        Classificator classificator7 = ClassificatorFactory.createClassificator("7");
        System.out.println("Classificator7 Done");
        return classificator7;
    }

    @Bean(name = "Classificator8")
    public Classificator createClassificator8() {
        Classificator classificator8 = ClassificatorFactory.createClassificator("8");
        System.out.println("Classificator8 Done");
        return classificator8;
    }

    @Bean(name = "Classificator9")
    public Classificator createClassificator9() {
        Classificator classificator9 = ClassificatorFactory.createClassificator("9");
        System.out.println("Classificator9 Done");
        return classificator9;
    }

}


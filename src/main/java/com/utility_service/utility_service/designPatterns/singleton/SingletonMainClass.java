package core.designPatterns.singleton;

import java.util.Arrays;
import java.util.List;

public class SingletonMainClass {

    public static void main(String[] args) {

        SingletonClass singletonClass = SingletonClass.createObject();
        SingletonClass singletonClass2 = SingletonClass.createObject();

        System.out.println(singletonClass.hashCode());
        System.out.println(singletonClass2.hashCode());

    }

}

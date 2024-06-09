package core.designPatterns.singleton;

public class SingletonClass {

    private static SingletonClass singletonClass;

    private SingletonClass() {}

    public static SingletonClass createObject(){
        if(singletonClass == null){
            singletonClass = new SingletonClass();
        }
        return singletonClass;
    }
}

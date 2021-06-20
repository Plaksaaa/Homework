package homework.classes.guitar;

public interface PlayAble {
    default void play(){
        System.out.println("play");
    }
}

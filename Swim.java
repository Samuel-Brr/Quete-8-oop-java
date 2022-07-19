public interface Swim {

    void dive();

    int swimDown(int meters);

    int swimUp(int meters);

    void getOut();

    default void glide(){
        System.out.println("glides into the air");
    };
}

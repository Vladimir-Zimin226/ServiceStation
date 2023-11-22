public interface UpdatingTyres {
    default void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}

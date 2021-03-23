public class BoxUtil {

    public static <T> void copyFromBoxToBox(final Box<T> src, final Box<? super T> dest) {
        dest.put(src.get());
    }

    public static <T extends Fruit> void copyFreshFruitFromBoxToBox(final Box<T> src, final Box<? super T> dest) {
        if (src.get() != null && src.get().isFresh()) {
            dest.put(src.get());
        }
    }

    public static <T> void printElementFromTwoBoxes(final Box<Box> box) {
        Box<T> secondBox = box.get();
        System.out.println(secondBox.get());
    }

    public static <T> void printElementFromBoxes(final Box<T> box) {
        T element = box.get();
        if (element instanceof Box) {
            Box<T> helpBox = (Box<T>) element;
            printElementFromBoxes(helpBox);
        } else {
            System.out.println(element);
        }
    }
}
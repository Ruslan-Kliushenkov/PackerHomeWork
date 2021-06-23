public class Packer {

    public static void main(String[] args) {
        Packer packer = new Packer();
        Box<Food> foodBox = new Box<>();
        Box<Cake> cakeBox = new Box<>();

        Cake cake = new Cake();

        cakeBox.put(cake);

        packer.repackage(foodBox, cakeBox);
        cakeBox.get();
        foodBox.get();
    }

    public void repackage(Box to, Box<? extends Bakery > from) {
    to.put(from.get());
    from.remove();
    }

}

class Box<T extends Food> {

    private T item;

    public void put(T item) {
        this.item = item;
    }

    public T get() {
        return this.item;
    }

    public void remove(){
        this.item = null;
    }
}

class Goods {
}

class Food extends Goods{
}

class Bakery extends Food{
}

class Cake extends Bakery {
}
class Pie extends Bakery {
}

class Tart extends Bakery {
}

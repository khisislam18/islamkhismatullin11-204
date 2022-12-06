public class DIP {
    Car car = new Car();
    Motocycle motocycle = new Motocycle();
    //это плохо, есть зависимость от других объектов, но не от абстракций, лучше сделать так
    Car car1;
    Motocycle motocycle1;

    public DIP(Car car1, Motocycle motocycle1) {
        this.car1 = car1;
        this.motocycle1 = motocycle1;
    }
    // вот так правильно, теперь мы создали поля, и у нас нет зависимости от конкретных деталей, есть только абстракции
}

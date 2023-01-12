public class Cat {
    private String type;
    private String color;
    private int age;
    private double weight;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void informationsnouShi(){
        System.out.println("Type: "+type+" color: "+color+" age: "+age+" weight: "+weight);
        System.out.println("Информация: Сноу-шу — порода, отличающаяся умом и высокой активностью.\n" +
                " Этой кошке нужна компания, поэтому она не подойдёт тем, " +
                "\nкто проводит мало времени дома. Обучаема, может приносить игрушки." +
                "\n Любит играть с водой, особенно текущей из крана, купаться." +
                "\n Предпочитает забираться высоко, в места, откуда открывается хороший вид на помещение." +
                "\n Мяукает мелодично и достаточно часто. ");
    }
    public void informationShinshila(){
        System.out.println("Type: "+type+" color: "+color+" age: "+age+" weight: "+weight);
        System.out.println("Информация: Шиншилла — покладистая, любящая и преданная кошка.\n" +
                " Эти животные имеют репутацию спокойных и тихих питомцев.\n" +
                " Однако на фоне других персидских пород шиншилла выглядит настоящим экстравертом:" +
                " \nона ориентирована на внешний мир и интересуется происходящим вокруг.");
    }
}

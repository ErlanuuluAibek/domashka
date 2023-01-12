public class Fish {
    private String type;
    private String color;
    private double weight;
    private double height;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void informationSazan(){
        System.out.println("Type: "+type+" color: "+color+" height: "+height+" weight: "+weight);
        System.out.println("Информация: Крупная всеядная рыба с толстым, умеренно удлинённым телом, покрытым крупной, " +
                "\n гладкой, плотно сидящей чешуёй. Бока золотистого цвета, спина темноватая." +
                "\n Расцветка может изменяться в зависимости от места обитания. У основания каждой чешуйки имеется тёмное пятнышко," +
                "\n край чешуй окаймлён чёрной точечной полоской." +
                "\n Чешуй в боковой линии 32—41.");
    }
    public void informationSwordfish(){
        System.out.println("Type: "+type+" color: "+color+" height: "+height+" weight: "+weight);
        System.out.println("Информация: Это одинокий, очень мигрирующий, очень прожорливый и агрессивный хищник, \n" +
                "поглощающий свою добычу сразу." +
                " Ест мелкую рыбу (сардины и скумбрия) и кальмаров");
    }
}

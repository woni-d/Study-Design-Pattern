package template_method.beverage;

public abstract class CoffeineBeverage {
    // 템플릿 메소드: 알고리즘을 가지고 있다
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void brew(); // 서브클래스에서 구현
    abstract void addCondiments(); // 서브클래스에서 구현

    protected void boilWater() {
        System.out.println("물 끓이기");
    }

    protected void pourInCup() {
        System.out.println("컵에 따르기");
    }

    boolean customWantsCondiments() {
        return false;
    }
}
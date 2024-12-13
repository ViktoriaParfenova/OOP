public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Алексей ");
        Human human2 = new Human("Иван ");
        Human human3 = new Human("Арсентий ");
        Human human4 = new Human("Андрей ");
        Human human5 = new Human("Анатолий ");
        Human human6 = new Human("Ярослав ");



        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.acceptToMarket(human3);
        market.acceptToMarket(human4);
        market.acceptToMarket(human5);
        market.acceptToMarket(human6);

        market.update();

    }
}

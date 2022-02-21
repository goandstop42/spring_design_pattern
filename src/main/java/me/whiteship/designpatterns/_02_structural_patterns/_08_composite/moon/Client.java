package me.whiteship.designpatterns._02_structural_patterns._08_composite.moon;

/* Composite
 * - client는 Component 인터페이스만 본다
 * - leaf는 가장 기본적인 단위
 * - 기본적인 단위를 group화 한 것이 Composite
 * - Composite은 leaf를 list, 배열로 가지고 있으나
 * 	 leaf type으로 가지고 있지 않고, component type을 가지고 있음
 * - 가격을 구하는 것을 client가 알고 있지 않고, composite 객체나 leaf 객체가 알고 있으면 됨
 * - leaf나 composite이 추가되더라도 client 코드는 변경 안 됨
 * - 만약 Component의 실제 type이 bag인지 item인지 체크해야 하는 경우 어울리지 않음
 * */
public class Client {
    public static void main(String[] args) {
        Item doranBlade = new Item("도란검", 450);
        Item healPotion = new Item("체력 물약", 50);

        Bag bag = new Bag();
        bag.add(doranBlade);
        bag.add(healPotion);

        Client client = new Client();
        client.printPrice(doranBlade);
        client.printPrice(bag);
    }

    private void printPrice(Component component) {
        System.out.println(component.getPrice());
    }

}

public class ClassMethod01 {
    public static void main(String[] args) {
        Study yamada = new Study();
        System.out.println("名前は" + yamada.name + "で、年齢は" + yamada.age + "です");
        
        Study sato = new Study("佐藤", 25);
        System.out.println("名前は" + sato.name + "で、年齢は" + sato.age + "です");
    }
}
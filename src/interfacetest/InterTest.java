package interfacetest;

public class InterTest {
    public static void main(String[] args) {
        InterTest interTest = new InterTest();

        Wizard harry = new Harry();
        Wizard ron = new Ron();
        Wizard hermione = new Hermione();

        interTest.spelling(harry);
        interTest.spelling(ron);
        interTest.spelling(hermione);

    }
    public void spelling(Wizard wizard){
        wizard.spell();
    }
}

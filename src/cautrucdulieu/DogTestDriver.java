package cautrucdulieu;

public class DogTestDriver {
    public static void main(String[] args) {
        Dog[] danhSachDog = new Dog[7];

        Dog dog0 = new Dog(23, "Yellow", "Lu");
        Dog dog1 = new Dog(23, "Black", "Li");
        Dog dog2 = new Dog(23, "White", "La");
        Dog dog3 = new Dog(23, "Red", "Lo");
        Dog dog4 = new Dog(23, "Black and White", "Ju");
        Dog dog5 = new Dog(23, "Pink", "Ja");
        Dog dog6 = new Dog(23, "Orange", "Jo");
        
        danhSachDog[0] = dog0;
        danhSachDog[1] = dog1;
        danhSachDog[2] = dog2;
        danhSachDog[3] = dog3;
        danhSachDog[4] = dog4;
        danhSachDog[5] = dog5;
        danhSachDog[6] = dog6;

        for (int i = 0; i < danhSachDog.length; i++) {
            danhSachDog[i].inThongTin();
        }
        
    }
}

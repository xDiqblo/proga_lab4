import java.util.Scanner;
public class Soldier{
    private String callSign;
    private int equipNumber;
    Equip equipKit;
    static int soldierNumber = 0;
    public Soldier(){
        soldierNumber++;
    }

    public Soldier(String setCallSign,
                   int setEquipNumber,
                   Equip setEquipKit)
    {
        soldierNumber++;
        this.callSign = setCallSign;
        this.equipNumber = setEquipNumber;
        this.equipKit = setEquipKit;
    }

    public static int getSoldiersCount(){
        return soldierNumber;
    }

    public void setCallSign(String callSign) {
        this.callSign = callSign;
    }

    public void setEquipNumber(String equipNumber) {
        StringNumber sourceString = new StringNumber(equipNumber);
        sourceString.convertToInt();
        this.equipNumber = sourceString.getOutputNumber();
    }

    public void setEquipKit(Equip equipKit) {
        this.equipKit = equipKit;
    }

    public String getCallSign() {
        return callSign;
    }

    public int getEquipNumber() {
        return equipNumber;
    }

    public Equip getEquipKit() {
        return equipKit;
    }

    public Soldier createSoldier(){
        String callSignStorage;
        Equip equipKitStorage = new Equip();
        Soldier dataSoldierStorage = new Soldier();
        int equipNumberStorage;

        String dataSourceString;
        StringNumber equipNumberString = new StringNumber();

        Scanner input = new Scanner(System.in);

        System.out.print("Введите позывной солдата: ");
        callSignStorage = input.nextLine();

        System.out.print("Введите номер снаряжения: ");
        dataSourceString = input.nextLine();
        equipNumberString.setSourceString(dataSourceString);
        equipNumberString.convertToInt();
        equipNumberStorage = equipNumberString.getOutputNumber();

        equipKitStorage.createEquipKit();

        dataSoldierStorage.callSign = callSignStorage;
        dataSoldierStorage.equipNumber = equipNumberStorage;
        dataSoldierStorage.equipKit = equipKitStorage;
        return dataSoldierStorage;
    }

    public void printSoldier() {
        System.out.println("Позывной: " + callSign);
        System.out.println("Номер снаряжения: " + equipNumber);
        this.equipKit.printEquipKit();
    }

}
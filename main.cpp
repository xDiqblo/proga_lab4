#include "classes.h"
#include <Windows.h>

int Soldier::soldierNumber = 0;

int main() {
	setlocale(0, "");
	SetConsoleCP(1251);
    
    //1. Пример работы со статическим методом
    for (int i = 0; i < 4; i++) {
        Soldier test = Soldier();
    }
    Soldier::getSoldierNumber();
    std::cout << std::endl;
    //2. Возврат значения ч/з указатель и ссылку

    //1) Через указатель
    Equip equipKit1;
    equipKit1.createEquipKit(&equipKit1);
    equipKit1.printEquipKit();
    //2) Через ссылку
    Soldier soldier1;
    soldier1.createSoldier(soldier1);
    soldier1.printSoldier();
    
    //3. Перегрузка операторов +, ++
    Troop dataTroop = Troop();
    std::cout << "Номер dataTroop: " << dataTroop.getTroopNumber() << std::endl;

    Troop testTroop = dataTroop + 10;
    std::cout << "Номер testTroop: " << testTroop.getTroopNumber() << std::endl;

    ++testTroop;
    std::cout << "Номер testTroop2: " << testTroop.getTroopNumber() << std::endl;

    Troop testTroop3 = testTroop++;
    std::cout << "Номер testTroop3: " << testTroop3.getTroopNumber() << std::endl;

    //4. Работа с классом std::string
    Soldier soldier2;
    std::string callSign = "Позывной";
    soldier2.setCallSign(callSign);
    std::cout << "До изменения: " << soldier2.getCallSign() << std::endl;
    callSign += " изменённый 1 раз";
    soldier2.setCallSign(callSign);
    std::cout << "После 1 изменения: " << soldier2.getCallSign() << std::endl;
    callSign.replace(callSign.find("1"), 1, "2");
    soldier2.setCallSign(callSign);
    std::cout << "После 2 изменения: " << soldier2.getCallSign() << std::endl;



}

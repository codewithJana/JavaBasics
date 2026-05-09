package OOP.Interface;

/*
Rules:
1. Interface MUST have only declarations, no method implementations
2. classes should implement , not extend
 */


public interface Interface_Signature {
    void connectBluetooth();

    void Wifi();
}

class Mobile implements Interface_Signature{

    @Override
    public void connectBluetooth() {
        System.out.println("Mobile connected to bluetooth");
    }
    @Override
    public void Wifi() {
        System.out.println("Mobile connected to wifi");
    }
}


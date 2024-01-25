package AdapterPattern;
//One of the structural design pattern
/*
It is used so that two unrelated interfaces can work together
The object that joins these unrelated interfaces is called an adapter
 */

import AdapterPattern.adapter.model.Volt;

public class ClientTest {
    public static void main(String[] args) {
        WallSocket wallSocket = new WallSocketimpl();
        Volt v240 = wallSocket.getVolts();
        System.out.println(v240);

        MobileAdapter mobileAdapter = new MobileAdapterImpl(wallSocket);
        Volt v3 = mobileAdapter.get3Volt();
        System.out.println(v3);

    }
}

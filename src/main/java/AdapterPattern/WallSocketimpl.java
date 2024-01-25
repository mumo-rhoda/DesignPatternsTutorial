package AdapterPattern;

import AdapterPattern.adapter.model.Volt;

public class WallSocketimpl implements WallSocket{


    @Override
    public Volt getVolts() {
        return new Volt(240);
    }
}

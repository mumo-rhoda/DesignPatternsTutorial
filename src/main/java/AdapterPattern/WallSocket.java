package AdapterPattern;

import AdapterPattern.adapter.model.Volt;

public interface WallSocket {
    public abstract Volt getVolts();
}

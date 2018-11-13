package corps.remikon.capability;

public class RemikonState implements IRemikonState {
    private byte R18;

    @Override
    public byte isR18() {
        return R18;
    }

    @Override
    public void setR18(byte R18In) {
        R18 = R18In;
    }
}

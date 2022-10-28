public class Adapter extends  InonStandardImpl implements Iimage {
 public InonStandardImpl inonStandard;

    public Adapter(InonStandardImpl inonStandard) {
        super();
        this.inonStandard = inonStandard;

    }

    @Override
    public int[] filter(int[] data) {

        inonStandard.appliquerfilter("string",data);
        return new int[0];
    }
}

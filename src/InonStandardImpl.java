public class InonStandardImpl implements InonStandard {


    @Override
    public int[] appliquerfilter(String firstname, int[] data) {
        System.out.println("firstname: "+ firstname);
        for(int i=0; i<data.length;i++){
            data[i]=data[i]-1;
        }
        return data;
    }
}

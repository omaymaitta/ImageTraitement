public class IimageImpl2 implements Iimage {
    @Override
    public int[] filter(int[] data) {
        System.out.println("implémentation2");
        for(int i=0; i<data.length;i++){
            data[i]=data[i]-1;
        }
        return data;

    }
}

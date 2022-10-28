public class IimageImpl1 implements Iimage {
    @Override
    public int[] filter(int[] data) {
        System.out.println("implémentation1");
        for(int i=0; i<data.length;i++){
            data[i]=data[i]+1;
        }
        return data;
    }

}

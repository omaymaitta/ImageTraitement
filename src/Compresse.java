abstract class Compresse{
    public abstract int operation();
    public int[] compresse(int[] data){
        System.out.println("etape de compression ");
        int b=operation();
        for(int i=0; i<data.length;i++){
            data[i]=data[i]+b;
        }
        return data;
    }
}

public class App {
    public static void main(String[] args) {
        Client cl=new Client() ;
        int[] image={4,5,7,9,6,3,5,};
        cl.setImage(new IimageImpl1());
        cl.filterapllay(image);
        System.out.println("===================");
        cl.setImage(new IimageImpl2());
        cl.filterapllay(image);
        System.out.println("=========adapter==========");
        InonStandardImpl inonStandard=new InonStandardImpl();
        cl.setImage(new Adapter(inonStandard));
        cl.filterapllay(image);
        System.out.println("=========compression==========");
        Compresse compresse=new CompresseImpl();
        compresse.compresse(image);


    }
}

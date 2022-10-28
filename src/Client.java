
public class Client {
    public Iimage image;

    public void  filterapllay(int[] data){

        image.filter(data);
    }

    public void setImage(Iimage image) {
        this.image = image;
    }

}

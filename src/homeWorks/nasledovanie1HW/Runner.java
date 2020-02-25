package homeWorks.nasledovanie1HW;

public class Runner {
    public static void main(String[] args) {
        Photo photo1 = new Photo("in turkey");
        Photo photo2 = new Photo("my birthday");

        Page page1 = new Page();
        page1.getPhotos().add(photo1);
        page1.getPhotos().add(photo2);

        Album myAlbum = new Album();

        myAlbum.getPages().add(page1);

        Photo newPhoto = new Photo("school trip");
        myAlbum.addPhoto(newPhoto);

        System.out.println("\nPhotos count: " + myAlbum.getPhotosCount());
        myAlbum.getPhotosInfo();
    }
}

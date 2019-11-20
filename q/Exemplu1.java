public class Exemplu1{
    public static void main(String [] args){
        UserProfile userProfile = new UserProfile();
        userProfile.addListener(new FBListener());
        userProfile.addListener(new InstaListener());
        userProfile.addPhoto();
    }
}
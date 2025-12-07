public class Showroom {
    private String showroomName;
    private String location;

    public void setShowroomDetails(String showroomName,String location){
        this.showroomName = showroomName;
        this.location = location;
    }
    public void getShowroomDetails(){
        System.out.println("======== Showroom Details ========");
        System.out.println("Name : " + showroomName);
        System.out.println("Location : " + location);
    }
}

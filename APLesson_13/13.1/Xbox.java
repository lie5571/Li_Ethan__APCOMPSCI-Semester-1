public class Xbox extends Console{
    public Xbox() {
        super();
    }

    public Xbox(String system) {
        super(system);
    }


   
    public String getController() {
        return "Xbox Elite Controller";
    }

	
    public String getPlatform(){
        return "Xbox Scorpio";
    }
}

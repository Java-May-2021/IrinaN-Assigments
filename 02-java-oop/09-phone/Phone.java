public abstract class Phone{
    private String versionnumber;
    private int batteryPercentage;
    private String carrier;
    private String ringtone;

    public Phone(String a, int b, String c, String d){
        this.versionnumber = a;
        this.batteryPercentage = b;
        this.carrier = c;
        this.ringtone = d;
    }

    public abstract void displayInfo();
}
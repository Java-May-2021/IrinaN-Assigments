public class Project{
    private String name;
    private String description;
    private double initialCost;

    public Project(){
        this.name = "unknown";
        this.description = "unknown";
        this.initialCost = 0.0;
    }

    public Project(String a){
        this.name = a;
    }

    public Project(String a, String b){
        this.name = a;
        this.description = b;
    }

    public Project(String a, String b, double c){
        this.name = a;
        this.description = b;
        this.initialCost = c;
    }

    public String getName(){
        return this.name;
    }

    public String getdescription(){
        return this.description;

    }
    public Double getinitialCost(){
        return this.initialCost;

    }

    public void setinitialCost(double a){
        this.initialCost = a;
    }

    public void setname(String a){
        this.name = a;
    }

    public void setdescription(String a){
        this.description = a;
    }

    public void display(){
        System.out.println(this.name);
        System.out.println(this.description);
        System.out.println(this.initialCost);
    }
}
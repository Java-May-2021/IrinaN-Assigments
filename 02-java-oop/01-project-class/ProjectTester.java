
public class ProjectTester {
    public static void main(String[] args){
        Project projectTest1 = new Project();
        Project projectTest2 = new Project("Test2");
        Project projectTest3 = new Project("Test3", "This is test3");
        Project projectTest4 = new Project("Test4", "This is test4", 10.0);

        // System.out.println(projectTest1.name);
        String z = projectTest2.getName();
        System.out.println(z);

        String Q = projectTest3.getName();
        System.out.println(Q);

        String Q2 = projectTest3.getdescription();
        System.out.println(Q2);

        double Q3 = projectTest4.getinitialCost();
        System.out.println(Q3);

        projectTest4.display();

        projectTest2.setinitialCost(22);

        double Q4 = projectTest2.getinitialCost();
        System.out.println(Q4);





    }
    
}

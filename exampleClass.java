class EmployeeData{
    private int employeeNumber;
    private String employeeName;
    private int age; 
    private String skillLevel;
    EmployeeData(int num, String name, int age, String skill){
        employeeNumber = num;
        employeeName = name;
        age = age;
        skillLevel = skill;
    }
    public int getNum(){
        return employeeNumber
    }
    public String getName(){
        return employeeName
    }
    public int getAge(){
        return age
    }
    public String getSkill(){
        return skill
    }
    public static void main(String args[]){
        EmployeeData obj = new EmployeeData(0,"Immanuel",25, "High");
        System.out.println("Employee Name is: "+obj.getName());
        System.out.println("Employee Age is: "+obj.getAge());
        System.out.println("Employee ID is: "+obj.getNum());
        System.out.println("Employee skill level is: "+obj.getSkill());

        }

}
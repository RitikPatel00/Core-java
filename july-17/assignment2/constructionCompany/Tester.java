package assignment2.constructionCompany;

public class Tester {
    public static void main(String[] args) {
        PermanentEmployee permEmp1 = new PermanentEmployee(711211, "Rafael", 1850, 115, 3.5f);
    

        ContractEmployee contEmp1 = new ContractEmployee(102, "Jennifer", 16, 90);
       

        permEmp1.displayDetails();
        System.out.println();
        
        System.out.println();
        contEmp1.displayDetails();
       
     
    }
}

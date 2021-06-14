
package studentinfo;

public class StudentInfo {
     public static void main(String[] args){
        Student salim = new Student();
        salim.setName("Salim");
        salim.setAge(23);
        salim.setId("abcd1234");

        System.out.print("Name : " + salim.getName() + "\nAge : " + salim.getAge());   
     }
    
}

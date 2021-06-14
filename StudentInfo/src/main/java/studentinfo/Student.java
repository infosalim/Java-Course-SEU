
package studentinfo;

public class Student {
   private String name;
   private String id;
   private int age;

   public int getAge() {
      return age;
   }

   public String getName() {
      return name;
   }

   public String getIdNum() {
      return id;
   }

   public void setAge( int age) {
      this.age = age;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void setId( String id) {
      this.id = id;
   }
}

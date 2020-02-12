import module.Student;
import module.Teacher;

public class Application {

  public static void main(String[] args) {
    Student student1 = new Student("Cindy", 80);
    Student student2 = new Student("Mary", 95);
    Teacher teacher1 = new Teacher("Solider", student2);
    Teacher teacher2 = new Teacher("Bob", student1);

    addGrade(teacher1);
    addGrade(teacher2);
  }

  public static void addGrade(Teacher teacher) {
    Student stu = teacher.getStudent();
    stu.setGrade(stu.getGrade() + 5);
    System.out.print(String.format("老师名字是%s，", teacher.getName()));
    System.out.print(String.format("该老师的学生叫%s，", stu.getName()));
    System.out.println(String.format("该学生的成绩为%d。", stu.getGrade()));
  }

}

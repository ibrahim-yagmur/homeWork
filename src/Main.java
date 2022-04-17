public class Main {

    public static void main(String[] args) {
        Course c1=new Course(1,"matematık",0);
        Course c2=new Course(2,"turkce",10);
        Course c3=new Course(3,"fizik",20);
        Course[] courses={c1,c2,c3};
        for (Course cs:courses) {
            System.out.println(cs.courseName);
        }
        CourseManager courseManager=new CourseManager();
        courseManager.add(c1);
        courseManager.delete(c3);
    }
}

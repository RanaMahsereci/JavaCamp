public class CourseManager {
    public void addToCourse(Course course){
        System.out.println(course.name+" kursu eklendi");
    }
    public void completion(Course course){
        System.out.println("%"+course.completion_rate+" tamamlandı");
    }
    public void teacher(Course course){
        System.out.println("Eğitmen: "+course.teacher);
    }

}

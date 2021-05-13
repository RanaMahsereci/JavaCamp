public class Main {

    public static void main(String[] args) {
	Course course1 = new Course("Programlamaya Giriş için Temel Kurs ",100, " Engin Demiroğ");

	Course course2 = new Course("Yazılım Geliştirici Yetiştirme Kampı(C# + Angular) ",100," Engin Demiroğ");

	Course course3 = new Course("Yazılım Geliştirici Yetiştirme Kampı(Java+React) ",25," Engin Demiroğ");

	Course[] courses = {course1,course2,course3};
	   for(Course course : courses){
           System.out.println(
                   course.name+
                   course.completion_rate+
                   course.teacher);
       }
	   CourseManager courseManager = new CourseManager();
	   courseManager.addToCourse(course1);
	   courseManager.completion(course1);
	   courseManager.teacher(course1);

	   courseManager.addToCourse(course2);
	   courseManager.completion(course2);
	   courseManager.teacher(course2);

	   courseManager.addToCourse(course3);
	   courseManager.completion(course3);
	   courseManager.teacher(course3);




    }
}

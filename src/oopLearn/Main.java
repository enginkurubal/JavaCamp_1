package oopLearn;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1,"Java+React","Engin Demiro�");
		Course course2 = new Course(2,"C#+Angular","Engin Demiro�");
		Course course3 = new Course(3,"Temel Kurs","Engin Demiro�");
		Course courses[] = {course1,course2,course3};
		for(Course course : courses){
		System.out.println("Kurs Ad� : "+course.name +"  "+ "E�itmen Ad� : " +course.instructorName );
		}
		Category category1 = new Category(1,"Programlama");
		Category category2 = new Category(2,"T�m�");
		Category categories [] = {category1,category2};
		for(Category category : categories){
		System.out.println("Kategori Ad� : "+category.name); 
		}
		CourseManager courseManager = new CourseManager();
		courseManager.addToCourses(course1);


	}

}

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Course {

	public String courseID;

	public String courseName;

	private String instructor;

	private int maxCapacity;

	private Collection<Student> student;

	private Department department;

	private ArrayList<String> enrolledStudents;

	public boolean addStudent() {
		return false;
	}

	public boolean removeStudent() {
		return false;
	}

	public int getAvailableSeats() {
		return 0;
	}

}

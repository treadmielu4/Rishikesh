package assignments;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class TempStudent {
	public String name;
	public int age;
	public Address address;
	public List<MobileNumber> mobileNumbers;

	public TempStudent(String name, int age, Address address, List<MobileNumber> mobileNumbers) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.mobileNumbers = mobileNumbers;
	}
}

class Student {
	private String name;
	private int age;
	private Address address;
	private List<MobileNumber> mobileNumbers;

	public Student(String name, int age, Address address, List<MobileNumber> mobileNumbers) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.mobileNumbers = mobileNumbers;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Address getAddress() {
		return address;
	}

	public List<MobileNumber> getMobileNumbers() {
		return mobileNumbers;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setMobileNumbers(List<MobileNumber> mobileNumbers) {
		this.mobileNumbers = mobileNumbers;
	}

	@Override
	public String toString() {
		return "Student{" + "name='" + name + '\'' + ", age=" + age + ", address=" + address + ", mobileNumbers="
				+ mobileNumbers + '}';
	}
}

class Address {
	private String zipcode;

	public Address(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
}

class MobileNumber {
	private String number;

	public MobileNumber(String number) {
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
}

public class MainClass {

	public static void main(String args[]) {

		// String name, int age, Address address, List<MobileNumber> mobileNumbers
		Student s1 = new Student("Jeeya", 22, new Address("831024"),
				Arrays.asList(new MobileNumber("94613753458"), new MobileNumber("9467859458")));
		Student s2 = new Student("Suresh", 23, new Address("838024"),
				Arrays.asList(new MobileNumber("946137522615"), new MobileNumber("3333")));
		Student s3 = new Student("Venkatesh", 24, new Address("1235"),
				Arrays.asList(new MobileNumber("1233"), new MobileNumber("1234")));
		Student s4 = new Student("Ramesh", 22, new Address("831024"),
				Arrays.asList(new MobileNumber("9464573458"), new MobileNumber("3333")));
		Student s5 = new Student("Jayesh", 22, new Address("831724"),
				Arrays.asList(new MobileNumber("9464573458"), new MobileNumber("1333")));


		List<Student> studentList = Arrays.asList(s1, s2, s3, s4,s5);

		Optional<Student> stud = studentList.stream().filter(student -> student.getName().equalsIgnoreCase("jayesh"))
				.findFirst();

		System.out.println("Student with exact match name jayesh:");
		System.out.println(stud.isPresent() ? stud.get().getName() : "No student found");

		Optional<Student> stud1 = studentList.stream()
				.filter(student -> student.getAddress().getZipcode().equals("1235")).findFirst();
		System.out.println("");
		System.out.println("Student with matching address 1235 :");
		System.out.println(stud1.isPresent() ? stud1.get().getName() : "No student found");
		System.out.println("");
		System.out.println("all student having mobile numbers 3333:");
		List<Student> stud2 = studentList.stream().filter(student111 -> student111.getMobileNumbers().stream()
				.anyMatch(x -> Objects.equals(x.getNumber(), "3333"))).collect(Collectors.toList());

		String result1 = stud2.stream().map(student -> student.getName()).collect(Collectors.joining(",", "[", "]"));
		System.out.println(result1);
		System.out.println("");

		System.out.println("All student having mobile number 1233 and 1234 :");

		List<Student> stud3 = studentList.stream()
				.filter(student -> student.getMobileNumbers().stream()
						.allMatch(x -> Objects.equals(x.getNumber(), "1233") || Objects.equals(x.getNumber(), "1234")))
				.collect(Collectors.toList());

		String result2 = stud3.stream().map(student -> student.getName()).collect(Collectors.joining(",", "[", "]"));
		System.out.println(result2);
		System.out.println("");
		System.out.println("Create a List<Student> from the List<TempStudent>");

		TempStudent ts1 = new TempStudent("Jayesh", 22, new Address("831024"),
				Arrays.asList(new MobileNumber("94613753458"), new MobileNumber("9467859458")));
		TempStudent ts2 = new TempStudent("Suresh", 23, new Address("838024"),
				Arrays.asList(new MobileNumber("946137522615"), new MobileNumber("3333")));
		TempStudent ts3 = new TempStudent("Venkatesh", 24, new Address("1235"),
				Arrays.asList(new MobileNumber("1233"), new MobileNumber("1234")));
		TempStudent ts4 = new TempStudent("Ramesh", 22, new Address("831024"),
				Arrays.asList(new MobileNumber("9464573458"), new MobileNumber("3333")));
		TempStudent ts5 = new TempStudent("Jeeya", 22, new Address("831724"),
				Arrays.asList(new MobileNumber("9464573458"), new MobileNumber("1333")));

		List<TempStudent> tmpStudents = Arrays.asList(ts1, ts2, ts3, ts4, ts5);

		List<Student> studentList2 = tmpStudents.stream()
				.map(tempStd -> new Student(tempStd.name, tempStd.age, tempStd.address, tempStd.mobileNumbers))
				.collect(Collectors.toList());
		studentList2.forEach(System.out::println);

		System.out.println("");
		System.out.println("Convert List<Student> to List<String> of student name");

		List<String> studentsName = studentList.stream().map(Student::getName).collect(Collectors.toList());

		System.out.println(studentsName.stream().collect(Collectors.joining(",")));
		System.out.println(studentsName.stream().collect(Collectors.joining(",", "[", "]")));

		System.out.println("");

		System.out.println("Convert List<students> to String:");

		String studentName = studentList.stream().map(Student::getName).collect(Collectors.joining(",", "[", "]"));
		System.out.println(studentName);

		System.out.println("");
		System.out.println("Change the case of List<String>:");

		List<String> nameList = Arrays.asList("Jayesh", "Rishab", "Jeeya", "Suresh", "Ramesh");

		nameList.stream().map(String::toUpperCase).forEach(System.out::println);
		System.out.println("");

		System.out.println("Sort List<String>:");
		List<String> namesList = Arrays.asList("Jayesh", "Rishab", "Jeeya", "Suresh", "Ramesh");

		namesList.stream().sorted().forEach(System.out::println);
		System.out.println("");
		
		
		System.out.println("Conditionally apply Filter condition");
		boolean sortConditionFlag = true;

        Stream<Student> conditionalFilterResult = studentList.stream()
            .filter(std -> std.getName().startsWith("J"));

        if(sortConditionFlag){
            conditionalFilterResult = conditionalFilterResult.sorted(Comparator.comparing(Student::getName));
        }

        System.out.println("Before sorting :");
        studentList.forEach(s -> System.out.println(s.getName()));

        List<Student> list = conditionalFilterResult.collect(Collectors.toList());
        System.out.println("After filter and conditional sorting :");
        list.forEach(s -> System.out.println(s.getName()));
		

	}
}

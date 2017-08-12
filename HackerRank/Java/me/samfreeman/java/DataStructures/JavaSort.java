package me.samfreeman.java.DataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Sorter implements Comparator<Students> {

	@Override
	public int compare(Students o1, Students o2) {

		if (o2.getCgpa() == o1.getCgpa()) {
			if (o2.getFname().equals(o1.getFname())) {

				return o2.getId() - o1.getId();
			}
			return o1.getFname().compareTo(o2.getFname());
		}
		return (o2.getCgpa() > o1.getCgpa()) ? 1 : -1;
	}
}

// Provided Code 

class Students {
	private int id;
	private String fname;
	private double cgpa;

	public Students(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public double getCgpa() {
		return cgpa;
	}
}

// Complete the code
public class JavaSort {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		List<Student> studentList = new ArrayList<Student>();
		while (testCases-- > 0) {
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();

			Student st = new Student(id, fname, cgpa);
			studentList.add(st);

		}
		in.close();
		
		Students[] students = studentList.toArray(new Students[studentList.size()]);
		Arrays.sort(students, new Sorter());
		
		for (Students st : students) {
			System.out.println(st.getFname());
		}
	}
}
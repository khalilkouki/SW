package esprit.ws.graphql;

import com.coxautodev.graphql.tools.GraphQLRootResolver;

import esprit.ws.entities.Student;
import esprit.ws.reposot.StudentRepository;

public class Mutation implements GraphQLRootResolver{
	public StudentRepository std;
	public Mutation(StudentRepository std) {
		// TODO Auto-generated constructor stub
		this.std= std;
	}
   public Student createStudent(String cin, String email,
		   String nompre) {
	   Student s = new Student(cin,nompre,email);
	   return this.std.createStudent(s);
   }
}

package esprit.ws.graphql;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLRootResolver;


import esprit.ws.entities.Student;

import esprit.ws.reposot.StudentRepository;
//query => read 
public class Query implements GraphQLRootResolver{

	private StudentRepository studentRepository;

	
	public Query(StudentRepository stdR)
	{this.studentRepository=stdR;

	}
	
	
	public List<Student> getAllStudents()
	{return studentRepository.getListStudent();}
	
   public Student getStudentByCin(String cin) {
	   return studentRepository.getStudentByCin(cin);
   }

	
}

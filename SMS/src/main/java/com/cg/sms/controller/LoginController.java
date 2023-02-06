/*
 * package com.cg.sms.controller;
 * 
 * import java.util.ArrayList; import java.util.HashMap; import java.util.List;
 * import java.util.Map;
 * 
 * import org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RequestMethod; import
 * org.springframework.web.bind.annotation.RequestParam; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import com.cg.sms.dto.Student;
 * 
 * @RestController public class LoginController {
 * 
 * @RequestMapping(value = "/", method = RequestMethod.GET) //@GetMapping("/")
 * public String hello(@RequestParam(value="username", required = false) String
 * name) { if(name != null) return "Hello! "+name; else return "Hello!"; }
 * 
 * @GetMapping("/student") public Student getStudent() {
 * 
 * Student student = new Student(); student.setName("Ramesh");
 * student.setRollNumber(9898989); student.setEmail("ramesh@gmail.com");
 * 
 * return student; }
 * 
 * 
 * @GetMapping("/students") public List<Student> getStudents(){
 * 
 * List<Student> students = new ArrayList<>();
 * 
 * Student student1 = new Student(); student1.setName("Ramesh");
 * student1.setRollNumber(9898989); student1.setEmail("ramesh@gmail.com");
 * 
 * Student student2 = new Student(); student2.setName("Mahesh");
 * student2.setRollNumber(87878); student2.setEmail("mahesh.com");
 * 
 * Student student3 = new Student(); student3.setName("Suresh");
 * student3.setRollNumber(76767); student3.setEmail("suresh@gmail.com");
 * 
 * students.add(student1); students.add(student2); students.add(student3);
 * 
 * return students; }
 * 
 * @GetMapping("/students-map") public Map<String, Student> getStudentMap(){
 * 
 * Map<String, Student> studentsMap = new HashMap<>();
 * 
 * Student student1 = new Student(); student1.setName("Ramesh");
 * student1.setRollNumber(9898989); student1.setEmail("ramesh@gmail.com");
 * 
 * Student student2 = new Student(); student2.setName("Mahesh");
 * student2.setRollNumber(87878); student2.setEmail("mahesh.com");
 * 
 * Student student3 = new Student(); student3.setName("Suresh");
 * student3.setRollNumber(76767); student3.setEmail("suresh@gmail.com");
 * 
 * studentsMap.put("CSE", student1); studentsMap.put("EEE", student2);
 * studentsMap.put("ECE", student3);
 * 
 * return studentsMap; }
 * 
 * 
 * @GetMapping("/students-depatment") public Map<String, List<Student>>
 * getStudentsByDepartment(){ Map<String, List<Student>> map = new HashMap<>();
 * 
 * List<Student> cseStudents = new ArrayList<>();
 * 
 * Student student1 = new Student(); student1.setName("Suresh");
 * student1.setRollNumber(76767); student1.setEmail("suresh@gmail.com");
 * 
 * Student student2 = new Student(); student2.setName("Kumar");
 * student2.setRollNumber(76767); student2.setEmail("kumar@gmail.com");
 * 
 * Student student3 = new Student(); student3.setName("Rajesh");
 * student3.setRollNumber(6666); student3.setEmail("rajesh@gmail.com");
 * 
 * cseStudents.add(student1); cseStudents.add(student2);
 * cseStudents.add(student3);
 * 
 * map.put("CSE", cseStudents);
 * 
 * 
 * List<Student> eeeStudents = new ArrayList<>();
 * 
 * Student student4 = new Student(); student4.setName("Rahul");
 * student4.setRollNumber(8888); student4.setEmail("rahul@gmail.com");
 * 
 * Student student5 = new Student(); student5.setName("Suman");
 * student5.setRollNumber(9999); student5.setEmail("suman@gmail.com");
 * 
 * Student student6 = new Student(); student6.setName("Akash");
 * student6.setRollNumber(444); student6.setEmail("akash@gmail.com");
 * 
 * eeeStudents.add(student4); eeeStudents.add(student5);
 * eeeStudents.add(student6);
 * 
 * map.put("EEE", eeeStudents);
 * 
 * List<Student> eceStudents = new ArrayList<>();
 * 
 * Student student7 = new Student(); student7.setName("Tarun");
 * student7.setRollNumber(3444); student7.setEmail("tarun@gmail.com");
 * 
 * Student student8 = new Student(); student8.setName("Basav");
 * student8.setRollNumber(899); student8.setEmail("basav@gmail.com");
 * 
 * 
 * eceStudents.add(student7); eceStudents.add(student8);
 * 
 * map.put("ECE", eceStudents);
 * 
 * return map;
 * 
 * }
 * 
 * 
 * }
 */
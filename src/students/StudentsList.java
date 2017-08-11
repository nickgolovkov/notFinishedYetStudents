package students;


import java.util.ArrayList;
import java.util.List;

public class StudentsList {
    static String surname;
    static String name;
    static Integer group;

    StudentsList() {
        String surname;
        String name;
        Integer group;
    }

    public void printInf(){
        System.out.println("Студент:"+name+surname+group);
    }

    public void setInf (String surname1,String name1,Integer group1 ){
        //System.out.println("Введите информацию о студенте ");

        surname=surname1;
        name=name1;
        group=group1;
    }

    public String getSurname(){
        return surname;
    }

    public String getName(){
        return name;
    }

    public Integer getGroup (){
        return group;

    }

    public static void main(String[] args){
    	System.out.println(" Add new student? ");
    	System.out.println(" 1-Yes ");
    	System.out.println(" 2-No ");
        Scanner scan = new Scanner(System.in);
        int choose=scan.nextInt();
        int numb=0;
        String surname;
        String name;
        int gr=0;
        ArrayList<StudentsList> studs = new ArrayList<StudentsList>();
    	while (choose !=2 ){
        StudentsList arr[]=new StudentsList[];
        //arr[0]=new StudentsList() ;
        //arr[0].setInf("Ванек","Сидоров",67);
        //arr[0]=new StudentsList();
        //StudentsList stud=new StudentsList();
        //stud.setInf("Пупкин","Вася",45);
        //System.out.print(arr[0].getGroup());
        studs.add(new StudentsList());
        studs.get(numb).setInf("Пупкин","Вася",5);
        System.out.print(studs.get(numb).getGroup());
        numb++;
    }
    }
}

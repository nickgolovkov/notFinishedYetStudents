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
        StudentsList arr[]=new StudentsList[10];
        //arr[0]=new StudentsList() ;
        //arr[0].setInf("Ванек","Сидоров",67);
        //arr[0]=new StudentsList();
        //StudentsList stud=new StudentsList();
        //stud.setInf("Пупкин","Вася",45);
        //System.out.print(arr[0].getGroup());
        ArrayList<StudentsList> studs= new ArrayList<StudentsList>();
        studs.add(new StudentsList());
        studs.get(0).setInf("Пупкин","Вася",5);
        System.out.print(studs.get(0).getGroup());
    }
    

}

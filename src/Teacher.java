public class Teacher {
    String name, mpno, branch;

    Teacher(String name, String mpno, String branch){
        this.name=name;
        this.mpno=mpno;
        this.branch=branch;


    }
    public void printTeacher(){
        System.out.println("Öğretmenin adı :" + this.name);
        System.out.println("Öğretmenin branşı :" + this.branch);
        System.out.println("Öğretmenin telefon numarası :" + this.mpno);
        System.out.println();
    }
}

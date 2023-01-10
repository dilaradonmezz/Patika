public class Course {
    String name, code, prefix;
    Teacher teacher;
    int note, note1;

    Course(String name, String code, String prefix, Teacher teacher){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.teacher=teacher;
        this.note=note; 
        int note=0;
        int note1= 0;


    }
    void addTeacher(Teacher teacher){ //branch - prefix eşitlik kontrolü
        if(teacher.branch.equals(this.prefix))
            this.teacher=teacher;
        else
            System.out.println("Öğretmen ve branş uyuşmuyor.");

    }

}

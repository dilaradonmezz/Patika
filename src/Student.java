public class Student {
    String stuname, stuno, classes;
    Course course1, course2, course3;
    double avarage=0.0;
    boolean ispass=false;

    Student(String stuname, String stuno, String classes, Course course1, Course course2, Course course3){
        this.stuname=stuname;
        this.stuno=stuno;
        this.classes=classes;
        this.course1=course1;
        this.course2=course2;
        this.course3=course3;

    }
    void addBulkExamNote(int note1, int note2, int note3){
        if(note1>=0 && note1<=100)
            this.course1.note=note1;
        if(note2>=0 && note2<=100)
            this.course2.note=note2;
        if(note3>=0 && note3<=100)
            this.course3.note=note3;

    }
    void addBulkVerbalNote(int so1, int so2, int so3){
        if(so1>=0 && so1<=100)
            this.course1.note1=so1;
        if(so2>=0 && so2<=100)
            this.course2.note1=so2;
        if(so3>=0 && so3<=100)
            this.course3.note1=so3;

    }
    void calcavarage(){
        System.out.println();
        printNote();
        double mat=(this.course1.note)*0.8 +(this.course1.note1)*0.2;
        double fiz=(this.course2.note)*0.8 +(this.course2.note1)*0.2;
        double biyo=(this.course3.note)*0.8 +(this.course3.note1)*0.2;
        this.avarage=(mat+fiz+biyo)/3;
        if(this.avarage>=50) {
            this.ispass = true;
            System.out.println("Sınıfı geçti!");
        }
        else {
            this.ispass = false;
            System.out.println("Sınıfta kaldı!");
        }

        System.out.println("Ortalaması: " + this.avarage);


    }

    void printNote(){
        System.out.println("Öğrencinin adı: "+stuname + "\ndersi: " +
                this.course1.name+ " notu: " + this.course1.note +
                        "\ndersi: " +  this.course2.name+ " notu: " + this.course2.note +
                "\ndersi: " + this.course3.name+ " notu: " + this.course3.note);

    }

}

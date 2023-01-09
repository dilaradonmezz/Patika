public class OgrenciBilgiSistemi {
    public static void main(String[] args){

        Teacher t1= new Teacher("Einstein", "0555", "FİZ");
        t1.printTeacher();
        Teacher t2= new Teacher("Mendel", "0554", "BİYO");
        t2.printTeacher();
        Teacher t3= new Teacher("Farabi", "0553", "MAT");
        t3.printTeacher();

        Course mat=new Course("Matematik", "101", "MAT", t3);
        Course fiz=new Course("Fizik", "102", "FİZ", t1);
        Course biyo=new Course("Biyoloji", "103", "BİYO", t2);
        mat.addTeacher(t3);
        fiz.addTeacher(t1);
        biyo.addTeacher(t2);

        Student s1= new Student ("Derin", "01", "4", mat, fiz, biyo);
        Student s2= new Student ("Umut", "02", "4", mat, fiz, biyo);

        s1.addBulkExamNote(100,100,100);
        s1.addBulkVerbalNote(50,50,50);
        s1.calcavarage();
        s2.addBulkExamNote(10,60,100);
        s2.addBulkVerbalNote(30,50,100);
        s2.calcavarage();

    }
}

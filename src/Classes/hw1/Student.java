package Classes.hw1;

public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }

    public void addBulkLectureNote(int mat, int fizik, int kimya){

        if (mat >= 0 && mat <= 100) {
            this.mat.lectureNote = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.lectureNote = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.lectureNote = kimya;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0 || this.mat.lectureNote == 0 || this.fizik.lectureNote == 0 || this.kimya.lectureNote == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        // Ders notlarının ve sözlü notlarının ağırlıklarını dikkate alarak hesap yapalım.
        this.avarage = (this.fizik.note * this.fizik.noteWeight + this.fizik.lectureNote * this.fizik.lectureWeight +
                this.kimya.note * this.kimya.noteWeight + this.kimya.lectureNote * this.kimya.lectureWeight +
                this.mat.note * this.mat.noteWeight + this.mat.note * this.mat.lectureWeight) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note + " Sözlü Notu : "+ this.mat.lectureNote);
        System.out.println("Fizik Notu : " + this.fizik.note + " Sözlü Notu : " + this.fizik.lectureNote);
        System.out.println("Kimya Notu : " + this.kimya.note + " Sözlü Notu : " + this.kimya.lectureNote);
    }

}
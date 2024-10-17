package main.java.by.rublevskaya.lesson_6;


public class StudentsRun {
    public static void main(String[] args) {

       StudentsTMS student1 = new StudentsTMS ( "Katusha","Rublevskaya", "+375336778909",
               "katerub@icloud.com"," java", "MP4356789");

       StudentsTMS student2 = new StudentsTMS ( "Ilyusha","Malyash", "+375330989096",
                "ilyamal@icloud.com"," java", "MP0986789");

       StudentsTMS student3 = new StudentsTMS ( "Marina","Krasotka", "+375336754327",
                "marinarr@icloud.com"," java", "MP4358769");

       StudentsTMS student4 = new StudentsTMS ( "Rita","Solnyshko", "+375336745307",
                "ritarita@icloud.com"," java", "MP4350936");

       StudentsTMS student5 = new StudentsTMS ( "Kiryusha","Krasavet", "+375335564327",
                "kirillll@icloud.com"," java", "MP4358098");

       StudentsTMS student6 = new StudentsTMS ( "Dmitry","Krasavchik", "+375335543217",
                "dimas@icloud.com"," java", "MP9856098");

       StudentsTMS student7 = new StudentsTMS ( "Dmitry","Hrama", "+375335540437",
                "hrama@icloud.com"," java", "MP9322098");

       StudentsTMS student8 = new StudentsTMS ( "Bogdan","Rasewa", "+375338704337",
                "bogggg@icloud.com"," java", "MP9322452");

       StudentsTMS student9 = new StudentsTMS ( "Danik","Luchic", "+375334414337",
                "danicc@icloud.com"," java", "MP9007452");

       StudentsTMS student10 = new StudentsTMS ( "Sultan","Samedow", "+375294414337",
                "samedow@icloud.com"," java", "MP8567452");

       StudentsTMS student11 = new StudentsTMS ( "Igor","Sameder", "+375445514337",
                "igor@icloud.com"," java", "MP8565552");

       StudentsTMS student12 = new StudentsTMS ( "Oleg","Savitskyi", "+375440984337",
                "oleg@icloud.com"," java",  "MP8560988");

       StudentsTMS student13 = new StudentsTMS ( "Arima","Wasyti", "+375446574337",
                "arima@icloud.com"," java", "MP0989688");

       StudentsTMS student14 = new StudentsTMS ( "Vlad","Lohiytsa", "+375440984337",
                "vladiccc@icloud.com"," java", "MP8566388");

       StudentsTMS student15 = new StudentsTMS ( "Sergio","Reduka", "+375440984093",
                "serrrgiow@icloud.com"," java", "MP8564328");

       StudentsTMS[] studentsTMS = {student1, student2,student3,student4,student5,student6,student7,student8,student9,student10,
                                    student11,student12,student13,student14,student15};

       for (StudentsTMS student : studentsTMS) {
           student.printInfo();
       }

    }
}
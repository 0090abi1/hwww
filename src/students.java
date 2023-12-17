package modules;
public class students {
    String name;
    int grade = 12;
    int rollno;
    int age;
    int maths_mark;
    int nep_mark;
    int science_mark;




    public students(String name,int rollno,int age,int maths_mark,int nep_mark,int science_mark,int total) {
        this.name = name;}

    public students(String name) {
        this.name = name;
    }


    public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }


        public void displayInformation () {
            String name = this.name;
            int rollNo = this.rollno;
            int grade = this.grade;

            int total = ((science_mark+nep_mark+maths_mark)/300)*100;
            if (total > 90 && total < 100) {
                System.out.println("Hello" + name + "of age" + age + "roll no:" + rollno + "of grade" + grade + " You have received A  grade" + "You managed to score " + total + "%");
            } else if (total > 70) {
                System.out.println("Hello " + name +"of age"  + age +  " roll no" + rollno + "of grade" + grade + " You have received B grade" + "You managed to score " + total + "%");
            } else if (total > 50) {
                System.out.println("Hello " + name + "of age" + age +"roll no" + rollno + "of grade" + grade + "You have received C  grade" + "You managed to score " + total + "%");
            } else {
                System.out.println("Hello" + name + "of age" + age + "roll no" + rollno + "of grade" + grade + "You have been failed" + "You managed to score " + total + "%");
            }

        }


    }

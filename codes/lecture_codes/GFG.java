package codes.lecture_codes;

abstract class subject {
    subject() {
        System.out.println("Learning subject");
    }
    abstract void syllabus();

    void learn() {
        System.out.println("Preparing right now !");
    }
}

class IT extends subject {
    void syllabus() {
        System.out.println("C, Java, C++");
    }
}

class GFG{
    public static void main(String[] args) {
        subject x = new IT();
        x.syllabus();
        x.learn();
    }
}

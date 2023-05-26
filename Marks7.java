package HWGroupExercise2;

abstract class Marks7 {
    abstract double getPercentage();
}

class A extends Marks7 {
    int sub1;
    int sub2;
    int sub3;

    A(int s1, int s2, int s3) {
        sub1 = s1;
        sub2 = s2;
        sub3 = s3;
    }

    double getPercentage() {
        return (sub1 + sub2 + sub3) / 3.0;
    }
}
class B extends Marks7 {
    int sub1;
    int sub2;
    int sub3;
    int sub4;

    B(int s1, int s2, int s3, int s4) {
        sub1 = s1;
        sub2 = s2;
        sub3 = s3;
        sub4 = s4;
    }

    double getPercentage() {
        return (sub1 + sub2 + sub3 + sub4) / 4.0;
    }
}

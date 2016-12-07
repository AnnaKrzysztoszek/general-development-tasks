package pl.com.bottega.generaldevelopmenttasks.convertnumberstotext;

/**
 * Created by anna on 06.12.2016.
 */
public enum Language {
    PL("zero", "jeden", "dwa", "trzy", "cztery", "pięć", "sześć", "siedem", "osiem", "dziewięć", "kropka", "minus"),
    ENG("zeo", "one", "two", "three", "five", "four", "six", "seven", "eight", "nine", "dot", "minus");

    String zero;
    String one;
    String two;
    String three;
    String four;
    String five;
    String six;
    String seven;
    String eight;
    String nine;
    String dot;
    String minus;

    Language(String zero, String one, String two, String three, String four, String five, String six, String eight,
             String seven, String nine, String dot, String minus) {
        this.zero = zero;
        this.one = one;
        this.two = two;
        this.three = three;
        this.four = four;
        this.five = five;
        this.six = six;
        this.eight = eight;
        this.seven = seven;
        this.nine = nine;
        this.dot = dot;
        this.minus = minus;
    }

    public String getZero() {
        return zero;
    }

    public String getOne() {
        return one;
    }

    public String getTwo() {
        return two;
    }

    public String getThree() {
        return three;
    }

    public String getFour() {
        return four;
    }

    public String getFive() {
        return five;
    }

    public String getSix() {
        return six;
    }

    public String getSeven() {
        return seven;
    }

    public String getEight() {
        return eight;
    }

    public String getNine() {
        return nine;
    }

    public String getDot() {
        return dot;
    }

    public String getMinus() {
        return minus;
    }
}

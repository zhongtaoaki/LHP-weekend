package thirdWeek;

/**
 * 枚举
 * Season
 * 春夏秋冬
 * 
 */
public class EnumDemo {

    public int age;

    public static void main(String[] args) {

        System.out.println(Season.SPRING);

    }
}

enum Season {

    // public final static Season SPRING = new Season("春天");
    // public final static Season SUMMER = new Season("夏天");
    // public final static Season AUTUMN = new Season("秋天");
    // public final static Season WINTER = new Season("冬天");

    SPRING("春天"), SUMMER("夏天"),
    AUTUMN("秋天"), WINTER("冬天");

    private String chineseName;

    private Season(String chineseName) {
        this.chineseName = chineseName;
    }

    public String getChineseName() {
        return chineseName;
    }

}

enum Season2{
    SPRING,SUMMER,AUTUMN,WINTER;
}
package SE;

enum Time{
    MONDAY(1,"星期一"),Tuesday(2,"星期二");
    private int num;
    private String time;

    Time(int num,String time) {
        this.num = num;
        this.time = time;
    }

    public int getNum() {
        return num;
    }

    public String getTime() {
        return time;
    }
}

public class TestFir {
    public static void main(String[] args) {
        System.out.println(Time.MONDAY.getTime());

    }
}

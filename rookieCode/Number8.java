public class Number8{
    public static void main(String[] args){
        int score = 65 ;
        if (score>=0 && score<60)
        { System.out.println("不及格");
        } else if (score>=60 && score<=69){
            System.out.println("及格");
        } else if (score>=70 && score<=79){
            System.out.println("良");
        } else if (score>=80 && score<90){
            System.out.println("好");
        } else if (score>=90 && score<=100){
            System.out.println("优秀");
        }else {
            System.out.println("成绩显示错误");
        }
    }
}
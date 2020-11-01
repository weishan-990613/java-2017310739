package pack01;

public class student extends person {
    String selectcourse;
    public void xuanke(int course_id,String course_name,String classroom,String time,String teacher) {
        System.out.println("选课成功！");
        System.out.println("课程编号：" + course_id);
        System.out.println("课程名称：" + course_name);
        System.out.println("上课地点：" + classroom);
        System.out.println("上课时间：" + time);
        System.out.println("授课教师：" + teacher);
    }
    public void tuike(int course_id,String course_name,String classroom,String time,String teacher){
        System.out.println("退课成功！");
        System.out.println("课程编号：" + course_id);
        System.out.println("课程名称：" + course_name);
        System.out.println("上课地点：" + classroom);
        System.out.println("上课时间：" + time);
        System.out.println("授课教师：" + teacher);
    }
}

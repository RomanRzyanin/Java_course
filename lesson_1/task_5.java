public class task_5 {
    public static void main(String[] args) {

        String s = "Добро пожаловать на курс по Java";
        String[] split = s.split("\\s");
        String res = "";
        for (int i = split.length - 1; i >= 0; i--) {
            res += split[i] + " ";
            //System.out.print(split[i] + " ");
        }
        System.out.print(res);

    
    }
}

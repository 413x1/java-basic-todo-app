public class TodoApp {

    public static String[] data = new String[10];
    public static void main(String[] args) {
//        testShowTodo();
        testAddTodo();
    }

    public static void showTodo() {
        for(var i=0; i<data.length; i++) {
            var todo = data[i];
            var no = i+1;

            if (todo != null) {
                System.out.println(no + ". "+ todo);
            } else {
                break;
            }

        }
    }

    public static void testShowTodo() {
        data[1] = "Belajar Jave";
        data[2] = "Belajar Python";
        data[3] = "Belajar Algoritma";
        showTodo();
    }

    public static void addTodo(String task) {
        var dataIsFull = true;
        int idx = 0;

        for(var i=0; i<data.length; i++) {
            if (data[i] == null) {
                dataIsFull = false;
                idx = i;
                break;
            }
        }

        if(dataIsFull){
            var _temp_data = data;
            idx = data.length;
            data = new String[data.length + (data.length / 2)];

            for (var i=0; i< _temp_data.length; i++) {
                data[i] = _temp_data[i];
            }
        }

        data[idx] = task;
    }

    public static void testAddTodo() {
        for(var i=0; i<data.length-5; i++) {
            data[i] = "working "+ i;
        }

        addTodo("membaca 1");
        addTodo("membaca 2");
        addTodo("membaca 3");

        showTodo();
    }

    public static void deleteTodo() {

    }

    public static void viewShowTodo() {

    }

    public static void viewAddTodo() {

    }

    public static void viewDeleteTodo() {

    }
}

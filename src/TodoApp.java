public class TodoApp {

    public static String[] data = new String[10];
    public static void main(String[] args) {
//        testShowTodo();
//        testAddTodo();
        testDeleteTodo();

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

    public static boolean deleteTodo(Integer idx) {
        var r_idx = (idx - 1);

        if(r_idx >= data.length) {
            return false;
        }

        if (data[(idx-1)] == null) {
            return false;
        }

        for (int i = (idx - 1); i < data.length; i++) {
            if(i == (data.length - 1)) {
                data[i] = null;
            }else {
                data[i] = data[i+1];
            }
        }
        return true;
    }

    public static void testDeleteTodo() {
        addTodo("Kerja 1");
        addTodo("Kerja 2");
        addTodo("Kerja 3");
        addTodo("Kerja 4");
        addTodo("Kerja 5");
        addTodo("Kerja 6");
//        showTodo();
        var result = deleteTodo(3);
        System.out.println(result);

        result = deleteTodo(100);
        System.out.println(result);

        result = deleteTodo(5);
        System.out.println(result);
        showTodo();
    }

    public static void viewShowTodo() {

    }

    public static void viewAddTodo() {

    }

    public static void viewDeleteTodo() {

    }
}

public class TodoApp {

    public static String[] data = new String[10];
    public static void main(String[] args) {

    }

    public static void showTodo() {
        for(var i=0; i< data.length; i++) {
            var todo = data[i];
            var no = i+1;

            if (todo != null) {
                System.out.println(no + ". "+ todo);
            }

        }
    }

    public static void addTodo() {

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

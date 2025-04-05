package org.maugalcst.tasktracker;

public class TaskTracker {
    public static void main(String[] args) {

        if (args.length > 0) {
            String command = args[0];
            String command2 = args[1];
            System.out.println("Comando ingresado: " + command2);

            // Aquí puedes añadir lógica para manejar diferentes comandos
            if (command.equals("add")) {
                System.out.println("Se agregó el argumento: " + command2);
                //Puedes implementar la lógica para agregar una tarea.
            } else if (command.equals("list")){
                System.out.println("Lista de comandos agregados:\n");
                System.out.println(command2);
                //Puedes implementar la lógica para listar tareas.
            } else {
                System.out.println("Comando desconocido.");
            }
        } else {
            System.out.println("No se ingresaron argumentos.");
        }
    }
}
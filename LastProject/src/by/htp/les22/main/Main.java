package by.htp.les22.main;

import by.htp.les22.controller.Controller;

public class Main {
    public static void main(String[] args) {
        String loginRequest;
        String checkRequest;
        String findRequest;
        String response;

        Controller controller = new Controller();

        loginRequest = "logination login=Aaaaaaab password=AbbbaasscB";
        response = controller.doAction(loginRequest);
        System.out.println(response);
        checkRequest = "check path=E:\\Courses-Java\\IDEA\\Last_Project\\resourses\\appliances.txt";
        response = controller.doAction(checkRequest);
        System.out.println(response);
        String path = "E:\\Courses-Java\\IDEA\\Last_Project\\resourses\\appliances.txt";


        findRequest = "find key=OS name=Linux";
        response = controller.doAction(findRequest);
        System.out.println(response);
    }

}
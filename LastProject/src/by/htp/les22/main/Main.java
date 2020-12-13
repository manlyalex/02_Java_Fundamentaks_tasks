package by.htp.les22.main;

import by.htp.les22.controller.Controller;

public class Main {
    public static void main(String[] args) {
        String loginRequest;
        String checkRequest;
        String findRequest;
        String response;
        String addRequest;
        Controller controller = new Controller();

        loginRequest = "logination login=Aaaaaaab password=AbbbaasscB";
        response = controller.doAction(loginRequest);
        System.out.println(response);
        checkRequest = "check path=E:\\Courses-Java\\IDEA\\Last_Project\\resourses\\appliances.txt";
        response = controller.doAction(checkRequest);
        System.out.println(response);
        String path = "E:\\Courses-Java\\IDEA\\Last_Project\\resourses\\appliances.txt";


        findRequest = "find key=OS name=Windows";
        response = controller.doAction(findRequest);
        System.out.println(response);


        addRequest = "add nameProduct=Laptop batteryCapacity=1.2 OS=Windows memoryRom=6500 systemMemory=2000 CPU=2.1 displayInches=32 " +
                "path=E:\\Courses-Java\\IDEA\\Last_Project\\resourses\\appliances.txt";

        response = controller.doAction(addRequest);
        System.out.println(response);
    }
}
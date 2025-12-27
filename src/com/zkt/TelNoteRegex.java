package com.zkt;


import java.util.Scanner;

/**
 * 校验器类
 */
public class TelNoteRegex {
    //对菜单项校验
    public int menuItemValidate(int min,int max){
        //定义验证菜单项的正则表达式
        String regex = "[1-9]";
        //创建键盘输入对象
        Scanner scanner = new Scanner(System.in);
        //判断用户输入的合法性
        while (true){
            System.out.println("请输入数字，最小是: "+min+" 最大是: "+max);
            String input = scanner.nextLine();
            if(input.matches(regex)){
                int inputNum = Integer.parseInt(input);
                if(inputNum>=min && inputNum<=max){
                    return inputNum;
                }else {
                    System.out.println("输入的数字不在氛围内，请重新输入!");
                }
            }else {
                System.out.println("必须输入数字，请检查!");
            }
        }
    }

    //对姓名校验 字母长度1-10
    public String nameValidate(){
        //定义验证姓名的正则表达式
        String regex ="[a-zA-Z]{1,10}";
        //创建键盘输入对象
        Scanner scanner = new Scanner(System.in);
        //校验姓名的合法性
        while (true){
            System.out.println("请输入姓名，应为字母，且长度在1-10之间");
            String input = scanner.nextLine();
            if(input.matches(regex)){
                return input;
            }else {
                System.out.println("输入的姓名有误，请重新输入！");
            }
        }

    }

    //对年龄校验 10-99
    public String ageValidate(){
        //定义校验年龄的正则表达式
        String regex= "[1-9][0-9]";
        //创建键盘输入对象
        Scanner scanner = new Scanner(System.in);
        //校验年龄
        while (true){
            System.out.println("请输入年龄，10-99之间");
            String input = scanner.nextLine();
            if(input.matches(regex)){
                return input;
            }else {
                System.out.println("输入的格式错误，请检查！");
            }
        }
    }

    //对性别校验 男:m M 女:f F
    public String sexValidate(){
        //定义校验性别的正则表达式
        String regex ="[m|M|f|F]";
        //创建键盘输入对象
        Scanner scanner = new Scanner(System.in);
        //校验性别
        while (true){
            System.out.println("请输入性别，男：m或者M，女：f或者F");
            String input = scanner.nextLine();
            if(input.matches(regex)){
                return input;
            }else {
                System.out.println("输入的格式有误，请重新输入!");
            }
        }
    }

    //对电话号码校验 允许座机号和手机号
    public String telNumValidate() {
        //定义校验电话号码的正则表达式
        String regex ="(\\d{3,4}-\\d{7,8}) | ([1]\\d{10})";
        //创建键盘输入对象
        Scanner scanner = new Scanner(System.in);
        //校验手机号
        while (true){
            System.out.println("请输入电话号码，座机号或者手机号");
            String input = scanner.nextLine();
            if (input.matches(regex)){
                return input;
            }else {
                System.out.println("输入的电话号码有误，请重新输入");
            }
        }
    }

    //对地址校验 字母或者数字 长度1-50
    public String addressValidate(){
        //定义校验地址的正则表达式
        String regex ="\\w{1-50}";
        //创建键盘输入对象
        Scanner scanner = new Scanner(System.in);
        //校验地址
        while (true){
            System.out.println("请输入地址，字母或者数字，长度1-50");
            String input = scanner.nextLine();
            if(input.matches(regex)){
                return input;
            }else {
                System.out.println("输入的地址有误，请重新输入！");
            }
        }
    }
}

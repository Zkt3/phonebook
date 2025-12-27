package com.zkt;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 核心业务类
 */
public class Operate {
    private List<Person> list;
    public Operate() {
        this.list = new ArrayList<>();
    }

    //添加业务逻辑
    public void addLogic(){
        Menu menu = new Menu();
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        while (true){
            menu.addMenu();
            int item = telNoteRegex.menuItemValidate(1,3);
            switch (item){
                case 1:this.addOperation();break;
                case 2:this.showAll();break;
                case 3:return;
            }

        }
    }

    //查询业务逻辑
    public void searchLogic(){
        Menu menu = new Menu();
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        while (true){
            menu.searchMenu();
            int item = telNoteRegex.menuItemValidate(1,7);
            switch (item){
                case 1:this.searchByName();break;
                case 2:this.searchByAge();break;
                case 3:this.searchBySex();break;
                case 4:this.searchByTelNum();break;
                case 5:this.searchByAddress();break;
                case 6:this.showAll();break;
                case 7:return;
            }
        }
    }

    //修改业务逻辑
    public void modifyLogic(){
        Menu menu = new Menu();
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        while (true){
            menu.modifyMenu();
            int item = telNoteRegex.menuItemValidate(1,3);
            switch (item){
                case 1:this.showAll();break;
                case 2:this.modifyOperation();break;
                case 3:return;
            }
        }
    }

    //删除业务逻辑
    public void deleteLogic(){
        Menu menu = new Menu();
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        while (true){
            menu.deleteMenu();
            int item = telNoteRegex.menuItemValidate(1,4);
            switch (item){
                case 1:this.showAll();break;
                case 2:this.deleteOperation();break;
                case 3:this.deleteAllOperation();break;
                case 4:return;
            }
        }
    }

    //排序业务逻辑
    public void orderLogic(){
        Menu menu = new Menu();
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        while (true){
            menu.orderMenu();
            int item = telNoteRegex.menuItemValidate(1,5);
            switch (item){
                case 1: this.orderByName();break;
                case 2: this.orderByAge();break;
                case 3: this.orderBySex();break;
                case 4: this.showAll();
                case 5:return;
            }
        }
    }

    //添加新纪录信息
    public void addOperation(){
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        String name = telNoteRegex.nameValidate();
        String age = telNoteRegex.ageValidate();
        String sex = telNoteRegex.sexValidate();
        String telNum = telNoteRegex.telNumValidate();
        String address = telNoteRegex.addressValidate();
        Person person = new Person(name,age,sex,telNum,address);
        this.list.add(person);
        person.setId(this.list.size());
    }

    //查询全部记录
    public void showAll(){
        System.out.println("查询全部");
    }

    //按姓名查找
    public void searchByName(){
        System.out.println("姓名");
    }

    //按年龄查找
    public void searchByAge(){
        System.out.println("年龄");
    }

    //按性别查找
    public void searchBySex(){
        System.out.println("性别");
    }

    //按电话号码查找
    public void searchByTelNum(){
        System.out.println("号码");
    }

    //按地址查找
    public void searchByAddress(){
        System.out.println("地址");
    }

    //修改指定记录
    public void modifyOperation(){
        System.out.println("修改记录");
    }

    //删除指定记录
    public void deleteOperation(){
        System.out.println("删除");
    }

    //删除全部记录
    public void deleteAllOperation(){
        System.out.println("删除全部");
    }

    //按姓名排序
    public void orderByName(){
        System.out.println("按姓名排序");
    }

    //按年龄排序
    public void orderByAge(){
        System.out.println("按年龄排序");
    }

    //按性别排序
    public void orderBySex(){
        System.out.println("按性别排序");
    }


    /**
     * 按姓名排序的比较器
     */
    class OrderByName implements Comparator<Person>{

        @Override
        public int compare(Person o1, Person o2) {
            return 0;
        }
    }
    /**
     * 按年龄排序的比较器
     */
    class OrderByAge implements Comparator<Person>{

        @Override
        public int compare(Person o1, Person o2) {
            return 0;
        }
    }

    /**
     * 按性别排序的比较器
     */
    class OrderBySex implements Comparator<Person>{

        @Override
        public int compare(Person o1, Person o2) {
            return 0;
        }
    }

}

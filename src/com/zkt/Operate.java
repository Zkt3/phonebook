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
        if(this.list.isEmpty()){
            System.out.println("没有任何记录");
            return;
        }
        for(int i =0;i<this.list.size();i++){
            System.out.println(this.list.get(i));
        }
    }

    //按姓名查找
    public void searchByName(){
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        String name = telNoteRegex.nameValidate();
        boolean flag =true; //默认没找到
        for(int i =0;i<this.list.size();i++){
            if(name.equals(this.list.get(i).getName())){
                System.out.println(this.list.get(i));
                flag = false;
            }
        }
        if(flag){
            System.out.println("没有此人记录");
        }
    }

    //按年龄查找
    public void searchByAge(){
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        String age = telNoteRegex.ageValidate();
        boolean flag =true; //默认没找到
        for(int i =0;i<this.list.size();i++){
            if(age.equals(this.list.get(i).getAge())){
                System.out.println(this.list.get(i));
                flag = false;
            }
        }
        if(flag){
            System.out.println("没有此人记录");
        }
    }

    //按性别查找
    public void searchBySex(){
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        String sex = telNoteRegex.sexValidate();
        boolean flag =true; //默认没找到
        for(int i =0;i<this.list.size();i++){
            //忽略大小写
            if(sex.equalsIgnoreCase(this.list.get(i).getSex())){
                System.out.println(this.list.get(i));
                flag = false;
            }
        }
        if(flag){
            System.out.println("没有此人记录");
        }
    }

    //按电话号码查找
    public void searchByTelNum(){
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        String telNum = telNoteRegex.telNumValidate();
        boolean flag =true; //默认没找到
        for(int i =0;i<this.list.size();i++){
            if(telNum.equals(this.list.get(i).getTelNum())){
                System.out.println(this.list.get(i));
                flag = false;
            }
        }
        if(flag){
            System.out.println("没有此人记录");
        }
    }

    //按地址查找
    public void searchByAddress(){
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        String address = telNoteRegex.addressValidate();
        boolean flag =true; //默认没找到
        for(int i =0;i<this.list.size();i++){
            if(address.equals(this.list.get(i).getAddress())){
                System.out.println(this.list.get(i));
                flag = false;
            }
        }
        if(flag){
            System.out.println("没有此人记录");
        }
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

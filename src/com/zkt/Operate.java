package com.zkt;

import java.util.ArrayList;
import java.util.Collections;
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
                case 4: this.showAll(); break;
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
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        Menu menu = new Menu();
        //对被修改的序号进行验证
        System.out.println("请输入记录的序号");
        int itemNum = telNoteRegex.menuItemValidate(1,this.list.size());
        menu.subModifyMenu();
        int menuItem = telNoteRegex.menuItemValidate(1,6);
        switch (menuItem){
            case 1:
                String name = telNoteRegex.nameValidate();
                this.list.get(itemNum-1).setName(name);
                break;
            case 2:
                String age = telNoteRegex.ageValidate();
                this.list.get(itemNum-1).setAge(age);
                break;
            case 3:
                String sex = telNoteRegex.sexValidate();
                this.list.get(itemNum-1).setSex(sex);
                break;
            case 4:
                String telNum = telNoteRegex.telNumValidate();
                this.list.get(itemNum-1).setTelNum(telNum);
                break;
            case 5:
                String address = telNoteRegex.addressValidate();
                this.list.get(itemNum-1).setAddress(address);
                break;
            case 6:
                return;

        }
    }

    //删除指定记录
    public void deleteOperation(){
        TelNoteRegex telNoteRegex = new TelNoteRegex();
        System.out.println("请输入要删除的记录的序号");
        int itemNum = telNoteRegex.menuItemValidate(1,this.list.size());
        this.list.remove(itemNum-1);
        //重新为记录设置序号
        for(int i =0;i<this.list.size();i++){
            this.list.get(i).setId(i+1);
        }
        System.out.println("删除成功");

    }

    //删除全部记录
    public void deleteAllOperation(){
        this.list.clear();
        System.out.println("电话本中的记录已经清空");
    }

    //按姓名排序
    public void orderByName(){
        Collections.sort(this.list,new OrderByName());
        //重新为记录设置序号
        for(int i =0;i<this.list.size();i++){
            this.list.get(i).setId(i+1);
        }

    }

    //按年龄排序
    public void orderByAge(){
        Collections.sort(this.list,new OrderByAge());
        //重新为记录设置序号
        for(int i =0;i<this.list.size();i++){
            this.list.get(i).setId(i+1);
        }
    }

    //按性别排序
    public void orderBySex(){
        Collections.sort(this.list,new OrderBySex());
        //重新为记录设置序号
        for(int i =0;i<this.list.size();i++){
            this.list.get(i).setId(i+1);
        }
    }


    /**
     * 按姓名排序的比较器
     */
    class OrderByName implements Comparator<Person>{

        @Override
        public int compare(Person o1, Person o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }
    /**
     * 按年龄排序的比较器
     */
    class OrderByAge implements Comparator<Person>{

        @Override
        public int compare(Person o1, Person o2) {
            return o1.getAge().compareTo(o2.getAge());
        }
    }

    /**
     * 按性别排序的比较器
     */
    class OrderBySex implements Comparator<Person>{

        @Override
        public int compare(Person o1, Person o2) {
           return o1.getSex().compareTo(o2.getSex());
        }
    }

}

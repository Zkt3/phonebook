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
        System.out.println("添加");
    }

    //查询业务逻辑
    public void searchLogic(){
        System.out.println("查询");
    }

    //修改业务逻辑
    public void modifyLogic(){
        System.out.println("修改");
    }

    //删除业务逻辑
    public void deleteLogic(){
        System.out.println("删除");
    }

    //排序业务逻辑
    public void orderLogic(){
        System.out.println("排序");
    }

    //添加新纪录信息
    public void addOperation(){

    }

    //查询全部记录
    public void showAll(){

    }

    //按姓名查找
    public void searchByName(){

    }

    //按年龄查找
    public void searchByAge(){

    }

    //按性别查找
    public void searchBySex(){

    }

    //按电话号码查找
    public void searchByTelNum(){

    }

    //按地址查找
    public void searchByAddress(){

    }

    //修改指定记录
    public void modifyOperation(){

    }

    //删除指定记录
    public void deleteOperation(){

    }

    //删除全部记录
    public void deleteAllOperation(){

    }

    //按姓名排序
    public void orderByName(){

    }

    //按年龄排序
    public void orderByAge(){

    }

    //按性别排序
    public void orderBySex(){

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

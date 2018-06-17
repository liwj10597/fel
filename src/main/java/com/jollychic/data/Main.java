package com.jollychic.data;


import com.greenpineyu.fel.FelEngine;
import com.greenpineyu.fel.FelEngineImpl;

/**
 * fel表达式引擎
 */
public class Main {
    public static void main(String[] args) {
        /**
         * 变量
         */
        /*FelEngine fel = new FelEngineImpl();
        Object result = fel.eval("5000*12+7500");
        System.out.println(result);
        FelContext ctx = fel.getContext();
        ctx.set("单价", 5000);
        ctx.set("数量", 12);
        ctx.set("运费", 7500);
        Object resultFel = fel.eval("单价*数量+运费");
        System.out.println(resultFel);*/

        /*类函数调用：Math.min(1,2)*/
        /*System.out.println(FelEngine.instance.eval("$('Math').min(1,2)"));*/

        /*对象函数调用：new HashMap().size();*/
        /*System.out.println(FelEngine.instance.eval("$('java.util.HashMap.new').size()"));*/

        /*自定义函数调用*/
        FelEngine fel = new FelEngineImpl();
        fel.getContext();


        fel.eval("$('com.jollychic.data.MainServiceImpl.new').setName('aubrey');");

    }
}

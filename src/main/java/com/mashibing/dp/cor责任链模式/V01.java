package com.mashibing.dp.cor责任链模式;

import java.util.ArrayList;

/**
 * @author zhangning
 * @date 2020/9/22
 */
public class V01 {
    public static void main(String[] args) {
        Msg msgObj = new Msg("大家好,:)，<script> 欢迎大家访问 mashibing.com ，大家伙儿基本996哦！</script>");

        FilterChain filterChain1 = new FilterChain();

        filterChain1.add(new FaceFilter()).add(new HtmlFilter());


        FilterChain filterChain2 = new FilterChain();
        filterChain2.add(new UrLFilter()).add(new J996Filter());


        filterChain1.add(filterChain2);

        filterChain1.doFilter(msgObj);


        System.out.println(msgObj.getMsg());
    }
}

class Msg {
    String msg;

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return this.msg;
    }

    public Msg(String msg) {
        this.msg = msg;
    }
}

interface Filter {
    boolean doFilter(Msg msg);
}

class FilterChain implements Filter {

    ArrayList<Filter> filters = new ArrayList<>();

    public FilterChain add(Filter filter) {
        filters.add(filter);
        return this;
    }

    @Override
    public boolean doFilter(Msg msg) {
        for (Filter f : filters) {
            //有一个过滤器返回false，就不往后走了
            if (!f.doFilter(msg)) {
                return false;
            }
        }
        return true;
    }
}

//下面是4个过滤
class HtmlFilter implements Filter {
    @Override
    public boolean doFilter(Msg msg) {
        String r = msg.getMsg();
        r = r.replace("<", "[");
        r = r.replace(">", "]");
        msg.setMsg(r);
        return true;
    }
}

class UrLFilter implements Filter {
    @Override
    public boolean doFilter(Msg msg) {
        String r = msg.getMsg();
        r = r.replace("mashibing.com", "https://www.mashibing.com");
        msg.setMsg(r);
        return false;
    }
}

class J996Filter implements Filter {
    @Override
    public boolean doFilter(Msg msg) {
        String r = msg.getMsg();
        r = r.replace("996", "955");
        msg.setMsg(r);
        return true;
    }
}

class FaceFilter implements Filter {
    @Override
    public boolean doFilter(Msg msg) {
        String r = msg.getMsg();
        r = r.replace(":)", "笑脸");
        msg.setMsg(r);
        return true;
    }
}





package com.mashibing.dp.cor责任链模式.servlelFilter;


import java.util.ArrayList;

/**
 * @author zhangning
 * @date 2020/9/22
 */
public class ServletMain {
    public static void main(String[] args) {
        Request request = new Request();
        request.setReqStr("大家好，:)，<script>，欢迎访问 mashibing.com ，大家都是996");

        Response response = new Response();
        response.setResStr("响应字符串：");

        FilterChain filterChain = new FilterChain();
        filterChain.add(new HTMLFilter()).add(new URLFilter());
        filterChain.doFilter(request,response);


        System.out.println(request.getReqStr());
        System.out.println(response.getResStr());
    }
}



interface Filter{
    void doFilter(Request request,Response response,FilterChain filterChain);
}


class FilterChain {
    ArrayList<Filter> filters = new ArrayList<>();
    int index = 0;

    public FilterChain add(Filter filter){
        filters.add(filter);
        return this;
    }

    public void doFilter(Request request, Response response) {
        if(index==filters.size()){
            return;
        }
        Filter filter = filters.get(index);
        index++;
        filter.doFilter(request,response,this);

    }
}


class HTMLFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        String s= request.getReqStr().replaceAll("<", "[").replaceAll(">", "]") + "-----HTMLFilter()";
        request.setReqStr(s);
        filterChain.doFilter(request, response);

        String resStr = response.getResStr();
        resStr += "--HTMLFilter()";
        response.setResStr(resStr);

    }
}

class URLFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        String reqStr = request.getReqStr();
        String replace = reqStr.replace("mashibing.com", "https://www.mashibing.com");
        replace+="------URLFilter";
        request.setReqStr(replace);

        filterChain.doFilter(request, response);

        String resStr = response.getResStr();
        resStr += "--URLFilter()";
        response.setResStr(resStr);

    }
}


class Request {
    private String reqStr;

    public String getReqStr() {
        return reqStr;
    }

    public void setReqStr(String reqStr) {
        this.reqStr = reqStr;
    }
}

class Response {
    private String resStr;

    public String getResStr() {
        return resStr;
    }

    public void setResStr(String resStr) {
        this.resStr = resStr;
    }
}

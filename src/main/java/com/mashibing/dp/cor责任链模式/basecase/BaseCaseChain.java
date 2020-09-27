package com.mashibing.dp.cor责任链模式.basecase;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangning
 * @date 2020/9/23
 */
public class BaseCaseChain implements BaseCase {
    // 所有 case 列表
    List<BaseCase> mCaseList = new ArrayList<>();

    // 索引，用于遍历所有 case 列表
    int index = 0;

    // 添加 case
    public BaseCaseChain addCase(BaseCase baseCase){
        mCaseList.add(baseCase);
        return this;
    }
    @Override
    public void doSomeThing(String input, BaseCase baseCase) {
        // 所有遍历完了，直接返回
        if(index==mCaseList.size()){
            return;
        }
        // 获取当前 case
        BaseCase baseCase1 = mCaseList.get(index);
        // 修改索引值，以便下次回调获取下个节点，达到遍历效果
        index++;
        // 调用 当前 case 处理方法
        baseCase1.doSomeThing(input,this);
    }
}

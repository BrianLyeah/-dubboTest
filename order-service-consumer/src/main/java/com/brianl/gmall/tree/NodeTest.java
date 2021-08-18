package com.brianl.gmall.tree;

import com.brianl.gmall.thread.MyThread;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.util.concurrent.Executors.*;

/**
 * <p>
 *
 * </p>
 *
 * @Author 李星霖
 * @Date 2021-05-21 16:49
 */
public class NodeTest {

    public static void main(String[] args) {
//        String str="{\"nodeName\":\"发起人\",\"pkId\":\"sid-start-node\",\"conditionList\":[],\"conditionNodes\":[],\"settype\":\"\",\"nodeCode\":\"startNode\",\"nodeUserList\":[],\"type\":0,\"childNode\":{\"nodeName\":\"多路分支\",\"conditionNodes\":[{\"nodeName\":\"条件1\",\"conditionList\":[{\"symbol\":\"\",\"showName\":\"请假天数\",\"columnId\":\"1293080553570029570\",\"groupId\":1,\"opt1\":\"<\",\"opt2\":\"<\",\"type\":2,\"optType\":\"2\",\"columnDbname\":\"days\",\"columnType\":\"Double\",\"groupSymbol\":\"\",\"showType\":\"1\",\"alias\":\"name_4lqsv\",\"zdy1\":\"5\",\"zdy2\":2}],\"priorityLevel\":1,\"nodeCode\":\"CondNode_xz80\",\"nodeUserList\":[],\"error\":false,\"type\":3,\"aliasStr\":\"(name_4lqsv)\",\"childNode\":{\"nodeName\":\"部门经理\",\"settype\":1,\"noHanderAction\":1,\"nodeCode\":\"UserTask_g0eb\",\"nodeUserList\":[{\"targetId\":\"614470872341676032\",\"name\":\"张珑_cl\",\"type\":1}],\"examineMode\":1,\"error\":false,\"type\":1,\"directorLevel\":1,\"expiredTime\":\"\",\"childNode\":{\"nodeName\":\"单路分支\",\"conditionNodes\":[{\"nodeName\":\"年假\",\"conditionList\":[{\"symbol\":\"\",\"showName\":\"请假类型\",\"columnId\":\"1275271269644025858\",\"groupId\":1,\"opt1\":\"\",\"type\":2,\"optType\":\"11\",\"columnDbname\":\"leave_type\",\"columnType\":\"Enum\",\"groupSymbol\":\"\",\"showType\":\"3\",\"alias\":\"name_x0i88\",\"zdy1\":\"03\",\"fixedDownBoxValue\":\"[{\\\"key\\\":\\\"01\\\",\\\"value\\\":\\\"事假\\\"},{\\\"key\\\":\\\"02\\\",\\\"value\\\":\\\"病假\\\"},{\\\"key\\\":\\\"03\\\",\\\"value\\\":\\\"年假\\\"}]\"}],\"priorityLevel\":1,\"nodeCode\":\"CondNode_8kjb\",\"nodeUserList\":[],\"error\":false,\"type\":3,\"aliasStr\":\"(name_x0i88)\",\"childNode\":{\"nodeName\":\"依次审批\",\"settype\":1,\"noHanderAction\":1,\"nodeCode\":\"UserTask_cu51\",\"nodeUserList\":[{\"targetId\":\"585135001184501760\",\"name\":\"谭乐天\",\"type\":1},{\"targetId\":\"695025505929265152\",\"name\":\"符晓林\",\"type\":1}],\"examineMode\":1,\"error\":false,\"type\":1,\"directorLevel\":1,\"expiredTime\":\"48\",\"childNode\":{\"nodeName\":\"会签审批\",\"settype\":1,\"noHanderAction\":1,\"nodeCode\":\"UserTask_ydhw\",\"nodeUserList\":[{\"targetId\":\"589044636593422336\",\"name\":\"许丁月_cl\",\"type\":1},{\"targetId\":\"614470872341676032\",\"name\":\"张珑_cl\",\"type\":1}],\"examineMode\":2,\"error\":false,\"type\":1,\"directorLevel\":1,\"expiredTime\":\"48\",\"selectMode\":0,\"selectRange\":0,\"replaceByUp\":0,\"examineEndDirectorLevel\":0,\"ccUserList\":[],\"agreedPercentage\":\"30\"},\"selectMode\":0,\"selectRange\":0,\"replaceByUp\":0,\"examineEndDirectorLevel\":0,\"ccUserList\":[],\"agreedPercentage\":\"\"}},{\"nodeName\":\"事假/病假\",\"conditionList\":[{\"symbol\":\"\",\"showName\":\"请假类型\",\"columnId\":\"1298818560132755458\",\"groupId\":1,\"opt1\":\"\",\"type\":2,\"optType\":\"11\",\"columnDbname\":\"leave_type\",\"columnType\":\"Enum\",\"groupSymbol\":\"\",\"showType\":\"3\",\"alias\":\"name_ve33b\",\"zdy1\":\"03\",\"fixedDownBoxValue\":\"[{\\\"key\\\":\\\"01\\\",\\\"value\\\":\\\"事假\\\"},{\\\"key\\\":\\\"02\\\",\\\"value\\\":\\\"病假\\\"},{\\\"key\\\":\\\"03\\\",\\\"value\\\":\\\"年假\\\"}]\"}],\"priorityLevel\":2,\"nodeCode\":\"CondNode_ejqz\",\"nodeUserList\":[],\"type\":3,\"error\":false,\"aliasStr\":\"(name_ve33b)\",\"childNode\":{\"nodeName\":\"自己审批\",\"settype\":6,\"noHanderAction\":2,\"nodeCode\":\"UserTask_43kj\",\"nodeUserList\":[{\"targetId\":\"19\",\"name\":\"集团中心管理员\",\"type\":2}],\"examineMode\":1,\"error\":false,\"type\":1,\"directorLevel\":1,\"expiredTime\":\"48\",\"selectMode\":0,\"selectRange\":3,\"replaceByUp\":0,\"examineEndDirectorLevel\":0,\"ccUserList\":[],\"agreedPercentage\":\"\",\"claimRule\":\"own\"}}],\"nodeCode\":\"RouteNode_15bf\",\"type\":4,\"ifChoose\":false,\"childNode\":{\"nodeName\":\"网关节点\",\"noHanderAction\":1,\"nodeCode\":\"gateway_n7rg\",\"examineMode\":1,\"replaceByUp\":0,\"examineEndDirectorLevel\":0,\"interfaceId\":\"\",\"error\":false,\"type\":8,\"directorLevel\":1,\"expiredTime\":\"\"},\"multi\":1},\"selectMode\":0,\"selectRange\":0,\"replaceByUp\":0,\"examineEndDirectorLevel\":0,\"ccUserList\":[],\"agreedPercentage\":\"\"}},{\"nodeName\":\"条件2\",\"conditionList\":[{\"symbol\":\"\",\"showName\":\"请假天数\",\"columnId\":\"1293080553570029570\",\"groupId\":1,\"opt1\":\"<\",\"opt2\":\"<\",\"type\":2,\"optType\":\"1\",\"columnDbname\":\"days\",\"columnType\":\"Double\",\"groupSymbol\":\"\",\"showType\":\"1\",\"alias\":\"name_bcxvo\",\"zdy1\":\"5\",\"zdy2\":\"\"}],\"priorityLevel\":2,\"nodeCode\":\"CondNode_exur\",\"nodeUserList\":[],\"type\":3,\"error\":false,\"aliasStr\":\"(name_bcxvo)\",\"childNode\":{\"nodeName\":\"部门领导\",\"settype\":1,\"noHanderAction\":1,\"nodeCode\":\"UserTask_lbds\",\"nodeUserList\":[{\"targetId\":\"4037804736098119680\",\"name\":\"刘志鹏_cl\",\"type\":1}],\"examineMode\":1,\"error\":false,\"type\":1,\"directorLevel\":1,\"expiredTime\":\"\",\"selectMode\":0,\"selectRange\":0,\"replaceByUp\":0,\"examineEndDirectorLevel\":0,\"ccUserList\":[],\"agreedPercentage\":\"\"}}],\"nodeCode\":\"RouteNode_aypn\",\"type\":4,\"ifChoose\":true,\"childNode\":{\"nodeName\":\"网关节点\",\"noHanderAction\":1,\"nodeCode\":\"gateway_qvin\",\"examineMode\":1,\"replaceByUp\":0,\"examineEndDirectorLevel\":0,\"interfaceId\":\"\",\"error\":false,\"type\":8,\"directorLevel\":1,\"expiredTime\":\"\"},\"multi\":1}}";
//        String condition = "1275271269644025858";
//        System.out.println(str.contains(condition));
//        System.out.println("-------------");
//
//        System.out.println(str.replace(condition,"111111111111111"));
        System.out.println(LocalDate.now());
    }

    public static void t1(){
        int i= 1/0;
    }



}

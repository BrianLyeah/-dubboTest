package com.brianl.gmall.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSONObject;
import com.brianl.gmall.bean.UserAddress;
import com.brianl.gmall.service.OrderService;
import com.brianl.gmall.service.UserService;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 *
 * </p>
 *
 * @Author 李星霖
 * @Date 2021-03-24 23:43
 */
@Component
public class OrderServiceImpl implements OrderService {

    private LinkedHashMap<String, String> map = new LinkedHashMap<>();

    @Reference
    UserService userService;

    @Override
    public List<UserAddress> initOrder(String userId) {
        //查询用户地址
        return userService.getUserAddressList(userId);
    }

    @Override
    public void School() throws IOException {
        File file = new File("G:\\四妹预估能上的学校");

        for (File fil : Objects.requireNonNull(file.listFiles())) {
            FileReader reader = new FileReader(fil);
            BufferedReader br = new BufferedReader(reader);
            StringBuffer buf = new StringBuffer();
            String s = null;
            //使用readLine方法，一次读一行
            while ((s = br.readLine()) != null) {
                buf.append("\n").append(s);
            }
            br.close();
            buildFiles(buf.toString());
        }
    }

    private void buildFiles(String str) {
        StringBuffer buf = new StringBuffer();
        Document doc = Jsoup.parse(str);
        Elements header = doc.select("div[class=app-college-header]");
        Elements detail = doc.select("div[class=app-college-content]");
        String schoolStr = header.text();
        String detailStr = detail.text();
        String[] split = schoolStr.split(" ");
//        System.out.print(split[0]);
//        System.out.print("\t");
//        System.out.print(split[1]);
//        System.out.print("\t");
//        System.out.print(split[2]);
//        System.out.print("\t");
//        System.out.println(detailStr);
//        System.out.println("--------------分割线----------------");

        Element table = doc.select("div[class=app-college-major-plan-table]").get(0);
        Elements div = table.select("div");
        for (int i = 1; i < div.size(); i++) {
            Elements div1 = div.get(i).select("div");
            for (int i1 = 1; i1 < div1.size(); i1++) {
                buf.append(div1.get(i1).text()).append("\t");
//                System.out.print(div1.get(i1).text()+"\t");
            }
            if (div1.size() > 1) {
                buf.append("\n");
//                System.out.println();
            }
        }
        String s = buf.toString();
        if (s.contains("大数据")
                || s.contains("物联网")
                || s.contains("工商企业管理")
                || s.contains("护理")
        ) {

            map.put(schoolStr, "\n" + buf.toString());
        }
    }

    @Override
    public String getMap() {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("--------------分割线-----------------");
        }
        String s = map.toString();
        map.clear();
        return s;
//        return JSONObject.toJSONString(map);
    }

}

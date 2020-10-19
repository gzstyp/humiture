package com.fwtai.service;

import com.fwtai.dao.DaoHandle;
import com.fwtai.tool.ToolClient;
import com.fwtai.tool.ToolString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

/**
 * 楼层的货位号管理
 * @作者 田应平
 * @版本 v1.0
 * @创建时间 2020-05-28 10:21
 * @QQ号码 444141300
 * @Email service@dwlai.com
 * @官网 http://www.fwtai.com
*/
@Service
public class HumitureService{

    @Autowired
    private DaoHandle daoHandle;

    public String listData(final HttpServletRequest request){
        final String ids = request.getParameter("ids");
        if(ids == null || ids.length() <= 0){
            return ToolClient.createJsonFail("参数有误,请添加温湿度所在区域");
        }
        final ArrayList<String> lists = ToolString.keysToList(ids);
        if(lists == null || lists.size() <= 0){
            return ToolClient.createJsonFail("参数有误");
        }
        return ToolClient.queryJson(daoHandle.queryForListMap("humiture.getListData",lists));
    }
}
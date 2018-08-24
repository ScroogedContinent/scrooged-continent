package cn.org.continent.base.service.impl;

import cn.org.continent.base.entity.DataTable;
import cn.org.continent.base.service.IBaseService;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Condition;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * @author Design By Scrooged
 * @version 1.0
 * @description
 * @date 2018/8/24 12:02
 */
public class BaseServiceImpl<M extends BaseMapper<T>, T> extends ServiceImpl<M, T> implements IBaseService<T> {

    protected Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public DataTable<T> pageSearch(DataTable<T> dataTable) {
        return pageSearch(dataTable, new Condition());
    }

    @Override
    public DataTable<T> pageSearch(DataTable<T> dataTable, Condition condition) {
        if( null == dataTable ){
            dataTable = new DataTable<>();
        }
        if( null == condition ){
            condition = new Condition();
        }

        //页码、页大小
        Page<T> page = new Page<>(dataTable.getPageNum(), dataTable.getPageSize());

        // TODO: 2018/8/24  
        
        selectPage(page, condition);
        dataTable.setTotal((int)page.getTotal());
        dataTable.setRows(page.getRecords());
        return dataTable;
    }

    @Override
    public List<T> searchList(DataTable<T> dataTable) {
        return searchList(dataTable, new Condition());
    }

    @Override
    public List<T> searchList(DataTable<T> dataTable, Condition condition) {
        if(null != dataTable){
            // TODO: 2018/8/24   
        }
        return this.selectList(condition);
    }
}

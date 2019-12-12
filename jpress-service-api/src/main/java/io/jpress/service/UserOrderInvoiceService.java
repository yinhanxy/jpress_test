package io.jpress.service;

import com.jfinal.plugin.activerecord.Page;
import io.jpress.model.UserOrderInvoice;
import io.jboot.db.model.Columns;

import java.util.List;

public interface UserOrderInvoiceService  {

    /**
     * 根据主键查找Model
     *
     * @param id
     * @return
     */
    public UserOrderInvoice findById(Object id);


    /**
     * 根据 Columns 查找单条数据
     *
     * @param columns
     * @return
     */
    public UserOrderInvoice findFirstByColumns(Columns columns);

    /**
     * 根据 Columns 查找单条数据
     *
     * @param columns
     * @param orderBy
     * @return
     */
    public UserOrderInvoice findFirstByColumns(Columns columns, String orderBy);


    /**
     * 查找全部数据
     *
     * @return
     */
    public List<UserOrderInvoice> findAll();


    /**
     * 根据 Columns 查找数据
     *
     * @param columns
     * @return
     */
    public List<UserOrderInvoice> findListByColumns(Columns columns);


    /**
     * 根据 Columns 查找数据
     *
     * @param columns
     * @param orderBy
     * @return
     */
    public List<UserOrderInvoice> findListByColumns(Columns columns, String orderBy);

    /**
     * 根据 Columns 查找数据
     *
     * @param columns
     * @param count
     * @return
     */
    public List<UserOrderInvoice> findListByColumns(Columns columns, Integer count);

    /**
     * 根据 Columns 查找数据
     *
     * @param columns
     * @param orderBy
     * @param count
     * @return
     */
    public List<UserOrderInvoice> findListByColumns(Columns columns, String orderBy, Integer count);


    /**
     * 根据提交查询数据量
     *
     * @param columns
     * @return
     */
    public long findCountByColumns(Columns columns);


    /**
     * 根据ID 删除model
     *
     * @param id
     * @return
     */
    public boolean deleteById(Object id);


    /**
     * 删除
     *
     * @param model
     * @return
     */
    public boolean delete(UserOrderInvoice model);


    /**
     * 根据 多个 id 批量删除
     *
     * @param ids
     * @return
     */
    public boolean batchDeleteByIds(Object... ids);


    /**
     * 保存到数据库
     *
     * @param model
     * @return id if success
     */
    public Object save(UserOrderInvoice model);


    /**
     * 保存或更新
     *
     * @param model
     * @return id if success
     */
    public Object saveOrUpdate(UserOrderInvoice model);

    /**
     * 更新
     *
     * @param model
     * @return
     */
    public boolean update(UserOrderInvoice model);


    /**
     * 分页
     *
     * @param page
     * @param pageSize
     * @return
     */
    public Page<UserOrderInvoice> paginate(int page, int pageSize);


    /**
     * 分页
     *
     * @param page
     * @param pageSize
     * @return
     */
    public Page<UserOrderInvoice> paginateByColumns(int page, int pageSize, Columns columns);


    /**
     * 分页
     *
     * @param page
     * @param pageSize
     * @param columns
     * @param orderBy
     * @return
     */
    public Page<UserOrderInvoice> paginateByColumns(int page, int pageSize, Columns columns, String orderBy);


}
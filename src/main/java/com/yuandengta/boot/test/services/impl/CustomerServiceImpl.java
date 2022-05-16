package com.yuandengta.boot.test.services.impl;

import com.yuandengta.boot.test.mapper.CustomerMapper;
import com.yuandengta.boot.test.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import com.yuandengta.boot.test.entity.Customer;
/**
 * Customer 业务接口实现类 {@link CustomerServiceImpl}
 *
 * @author Kevin
 * @wx: 36567126
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    // 属性注入，有警告，不推荐使用
//    @Autowired
    private CustomerMapper customerMapper;
    /**
     * 构造注入
     * - 强依赖的情况使用
     *
     * @param customerMapper
     */
    @Autowired
    public CustomerServiceImpl(CustomerMapper customerMapper) {
        this.customerMapper = customerMapper;
    }

    /**
     * 保存 Customer
     *
     * @param customer
     */
    @Override
    public void saveCustomer(Customer customer) {
        customerMapper.save(customer);
    }

    /**
     * 更新 Customer
     *
     * @param customer
     */
    @Override
    public void updateCustomer(Customer customer) {
        customerMapper.update(customer);
    }

    /**
     * 删除 Customer
     *
     * @param id
     */
    @Override
    public void deleteCustomer(Integer id) {
        customerMapper.delete(id);
    }

    /**
     * 查询 Customer
     *
     * @param id
     * @return
     */
    @Override
    public Customer queryCustomer(Integer id) {
        return customerMapper.query(id);
    }

    /**
     * 查询 Customer 列表
     *
     * @return
     */
    @Override
    public List<Customer> queryCustomers() {
        return customerMapper.queryForList();
    }
}

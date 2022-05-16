package com.yuandengta.boot.test.controller;

import com.yuandengta.boot.test.entity.Customer;
import com.yuandengta.boot.test.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Customer Handler 处理类 {@link CustomerController}
 * - REST 访问方式
 * 对资源的访问：
 * POST(新增资源)
 * GET(获取资源)
 * DELETE(删除资源)
 * PUT(修改资源)
 *
 * @author Kevin
 * @wx: 36567126
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {

    private CustomerService customerService;

    /**
     * set 注入
     *
     * @param customerService
     */
    @Autowired
    public void setCustomerService(CustomerService customerService) {

        this.customerService = customerService;
    }

    /**
     * 查询 Customer 列表
     *
     * @return
     */
    @GetMapping("")
//    @RequestMapping(value = "" ,method = RequestMethod.GET)
    public List<Customer> listI() {

        return customerService.queryCustomers();
    }

    /**
     * 根据 id 查询 Customer
     *
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Customer getCustomer(@PathVariable Integer id) {
        return customerService.queryCustomer(id);
    }

    /**
     * 添加 Customer
     *
     * @param customer
     */
    @PostMapping("")
    public void addCustomer(Customer customer) {
        customerService.saveCustomer(customer);
    }

    /**
     * 修改 Customer
     *
     * @param customer
     */
    @PutMapping("")
    public void updateCustomer(Customer customer) {
        customerService.updateCustomer(customer);
    }

    /**
     * 删除 Customer
     *
     * @param id
     */
    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable Integer id) {
        customerService.deleteCustomer(id);
    }
}

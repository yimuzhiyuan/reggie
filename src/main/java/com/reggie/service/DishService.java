package com.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.reggie.dto.DishDto;
import com.reggie.entity.Dish;

import java.util.List;

public interface DishService extends IService<Dish> {
//    新增菜品，同时插入菜品对应的口味数据，需要操作两张表：dish、dish_flavor

    public void saveWithFlavor(DishDto dishDto);
//
    //根据id查询菜品信息和对应的口味信息

    public DishDto getByIdWithFlavor(Long id);

    //更新菜品信息，同时更新对应的口味信息

    public void updateWithFlavor(DishDto dishDto);
    /**
     * 删除套餐，同时需要删除套餐和菜品的关联数据
     * @param ids
     */
    public void removeWithFlavor(List<Long> ids);
}

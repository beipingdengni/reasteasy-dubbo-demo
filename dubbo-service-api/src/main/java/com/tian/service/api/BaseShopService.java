package com.tian.service.api;

import com.tian.service.vo.shop.ShopInfoVo;

/**
 * Create by tianbeiping on 18/7/5
 */
public interface BaseShopService {

    ShopInfoVo getShopInfoById(Integer shopId);
}

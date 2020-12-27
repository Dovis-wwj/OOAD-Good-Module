package com.ooad.good.model.vo.spu;

import com.ooad.good.model.bo.Spu;
import com.ooad.good.model.vo.brand.BrandIdVo;
import com.ooad.good.model.vo.brand.BrandRetVo;
import lombok.Data;

/**
 * @AuthorId: 24320182203185
 * @Author: Chaoyang Deng
 * @Date: 2020/12/21 上午9:30
 */
@Data
public class SpuRetVo {
    private Long id;
    private BrandIdVo brand;

    public SpuRetVo(Spu spu){
        this.id=spu.getId();
        this.brand=new BrandIdVo(spu.getBrandId());
    }
}

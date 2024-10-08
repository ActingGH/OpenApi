package com.yupi.project.service;

import com.acting.actapicommon.model.entity.InterfaceInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author 86186
 * @description 针对表【interface_info(接口信息)】的数据库操作Service
 * @createDate 2024-09-20 20:08:40
 */
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);


}

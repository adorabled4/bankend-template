package com.dhx.template.utils;

import org.apache.commons.lang3.StringUtils;

/**
 * @author adorabled4
 * @className SqlUtil
 * @date : 2023/07/05/ 15:09
 **/
public class SqlUtil {

    /**
     * 校验排序字段是否合法（防止 SQL 注入）
     *
     * @param sortField
     * @return
     */
    public static boolean validSortField(String sortField) {
        if (StringUtils.isBlank(sortField)) {
            return false;
        }
        return !StringUtils.containsAny(sortField, "=", "(", ")", " ");
    }

}

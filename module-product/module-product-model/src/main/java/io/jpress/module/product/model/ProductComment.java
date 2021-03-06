package io.jpress.module.product.model;

import io.jboot.db.annotation.Table;
import io.jpress.commons.utils.CommonsUtils;
import io.jpress.commons.utils.JsoupUtils;
import io.jpress.module.product.model.base.BaseProductComment;

import java.util.HashMap;
import java.util.Map;

/**
 * Generated by JPress.
 */
@Table(tableName = "product_comment", primaryKey = "id")
public class ProductComment extends BaseProductComment<ProductComment> {

    private static final long serialVersionUID = 1L;

    public static final int STATUS_NORMAL = 1; //正常
    public static final int STATUS_UNAUDITED = 2; //待审核
    public static final int STATUS_TRASH = 3; //垃圾箱

    public static final Map<Integer, String> statusStrMap = new HashMap<>();

    static {
        statusStrMap.put(STATUS_NORMAL, "正常");
        statusStrMap.put(STATUS_UNAUDITED, "待审核");
        statusStrMap.put(STATUS_TRASH, "垃圾箱");
    }

    public boolean isNormal() {
        return STATUS_NORMAL == getStatus();
    }

    public boolean isUnaudited() {
        return STATUS_UNAUDITED == getStatus();
    }

    public boolean isTrash() {
        return STATUS_TRASH == getStatus();
    }



    public String getStatusStr() {
        return statusStrMap.get(getStatus());
    }


    @Override
    public boolean save() {
        CommonsUtils.escapeHtmlForAllAttrs(this, "content");
        JsoupUtils.clean(this, "content");
        return super.save();
    }

    @Override
    public boolean update() {
        CommonsUtils.escapeHtmlForAllAttrs(this, "content");
        JsoupUtils.clean(this, "content");
        return super.update();
    }
}

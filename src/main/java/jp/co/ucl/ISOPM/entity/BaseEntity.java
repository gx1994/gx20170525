package jp.co.ucl.ISOPM.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * Created by ZhenYang on 2017/02/19.
 */
public class BaseEntity {
    @JSONField(name = "created_at")
    private Date createdAt;

    @JSONField(name = "updated_at")
    private Date updatedAt;

    @JSONField(name = "deleted_at")
    private Date deletedAt;

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }
}

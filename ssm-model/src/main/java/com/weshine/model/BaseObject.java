package com.weshine.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class BaseObject implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 初始化为默认值
     * @return 当前对象
     */
    public abstract User initDefault();

    public abstract String toString();

    public abstract boolean equals(Object o);

    public abstract int hashCode();


    protected Timestamp getTimestamp(){
        String dateStr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        return Timestamp.valueOf(dateStr);
    }
}

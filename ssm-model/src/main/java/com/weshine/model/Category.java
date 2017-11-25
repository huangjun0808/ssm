package com.weshine.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 类@
 *
 * @author huangjun
 * &date 2017/11/25
 */
public class Category extends BaseModel {

    private static final long serialVersionUID = 3715275057396755688L;

    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    private String name;

    private String thumb;

    private String displayorder;

    private Boolean enabled;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public String getDisplayorder() {
        return displayorder;
    }

    public void setDisplayorder(String displayorder) {
        this.displayorder = displayorder;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Category category = (Category) o;

        if (id != null ? !id.equals(category.id) : category.id != null) return false;
        if (name != null ? !name.equals(category.name) : category.name != null) return false;
        if (thumb != null ? !thumb.equals(category.thumb) : category.thumb != null) return false;
        if (displayorder != null ? !displayorder.equals(category.displayorder) : category.displayorder != null)
            return false;
        return enabled != null ? enabled.equals(category.enabled) : category.enabled == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (thumb != null ? thumb.hashCode() : 0);
        result = 31 * result + (displayorder != null ? displayorder.hashCode() : 0);
        result = 31 * result + (enabled != null ? enabled.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Category{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", thumb='").append(thumb).append('\'');
        sb.append(", displayorder='").append(displayorder).append('\'');
        sb.append(", enabled=").append(enabled);
        sb.append('}');
        return sb.toString();
    }
}

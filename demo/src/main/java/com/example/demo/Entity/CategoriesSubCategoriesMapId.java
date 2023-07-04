package com.example.demo.Entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class CategoriesSubCategoriesMapId implements Serializable {
    private static final long serialVersionUID = -7883908919098044998L;
    @NotNull
    @Column(name = "categoryId", nullable = false)
    private Integer categoryId;

    @NotNull
    @Column(name = "sub_categoryId", nullable = false)
    private Integer subCategoryId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CategoriesSubCategoriesMapId entity = (CategoriesSubCategoriesMapId) o;
        return Objects.equals(this.subCategoryId, entity.subCategoryId) &&
                Objects.equals(this.categoryId, entity.categoryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subCategoryId, categoryId);
    }

}
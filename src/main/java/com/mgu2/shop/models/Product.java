package com.mgu2.shop.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.format.annotation.DateTimeFormat;


@Entity
@DynamicUpdate
@Table(name = "t_product")
public class Product implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String name;
    private Integer price;
    private Picture mainPic;
    private List<Picture> relatedPic;
    private String description;
    private Date createTime;
    private String code;
    private String model;
    private Long stock;
    private Admin inputUser;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @Lob
    @Column(columnDefinition = "TEXT")
    public String getDescription() {
		return description;
	}

    public void setDescription(String description) {
		this.description = description;
	}

    public Integer getPrice() {
		return price;
	}
    
    public void setPrice(Integer price) {
		this.price = price;
	}

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Long getStock() {
        return stock;
    }

    public void setStock(Long stock) {
        this.stock = stock;
    }

    @ManyToOne
    @JoinColumn
    public Admin getInputUser() {
        return inputUser;
    }

    public void setInputUser(Admin inputUser) {
        this.inputUser = inputUser;
    }

    @ManyToOne
    @JoinColumn
    public Picture getMainPic() {
		return mainPic;
	}

    public void setMainPic(Picture mainPic) {
		this.mainPic = mainPic;
	}

    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    public List<Picture> getRelatedPic() {
		return relatedPic;
	}

    public void setRelatedPic(List<Picture> relatedPic) {
		this.relatedPic = relatedPic;
	}
    

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", mainPic=" + mainPic +
                ", relatedPic=" + relatedPic +
                ", desc='" + description + '\'' +
                ", createTime=" + createTime +
                ", code='" + code + '\'' +
                ", model='" + model + '\'' +
                ", stock=" + stock +
                ", inputUser=" + inputUser +
                '}';
    }
}

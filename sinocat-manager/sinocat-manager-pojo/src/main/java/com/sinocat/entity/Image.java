package com.sinocat.entity;

import java.util.Arrays;

/**
 * @Auther: whl
 * @Description:图片实体类
 */
public class Image extends BaseEntity {
	//图片id
    private String id;
    //图片名
    private String fileName;
    //图片类型
    private String type;
    //图片生成的二进制代码
    private byte[] imge;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public byte[] getImge() {
        return imge;
    }

    public void setImge(byte[] imge) {
        this.imge = imge;
    }

    public Image(String id, String fileName, String type, byte[] imge) {
        this.id = id;
        this.fileName = fileName;
        this.type = type;
        this.imge = imge;
    }

    public Image() {
        super();
    }

    @Override
    public String toString() {
        return "Image{" +
                "id=" + id +
                ", fileName='" + fileName + '\'' +
                ", type='" + type + '\'' +
                ", imge=" + Arrays.toString(imge) +
                '}';
    }
}


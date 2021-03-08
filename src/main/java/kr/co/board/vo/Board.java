package kr.co.board.vo;

import org.apache.ibatis.type.Alias;

import java.util.Date;

@Alias("Board")
public class Board {

    private int bdNo;
    private int cateNo;
    private String bdTitle;
    private String bdDescription;
    private String bdImage;
    private Date bdDate;
    private String userId;
    private int bdLike;

    public int getBdNo() {
        return bdNo;
    }

    public void setBdNo(int bdNo) {
        this.bdNo = bdNo;
    }

    public int getCateNo() {
        return cateNo;
    }

    public void setCateNo(int cateNo) {
        this.cateNo = cateNo;
    }

    public String getBdTitle() {
        return bdTitle;
    }

    public void setBdTitle(String bdTitle) {
        this.bdTitle = bdTitle;
    }

    public String getBdDescription() {
        return bdDescription;
    }

    public void setBdDescription(String bdDescription) {
        this.bdDescription = bdDescription;
    }

    public String getBdImage() {
        return bdImage;
    }

    public void setBdImage(String bdImage) {
        this.bdImage = bdImage;
    }

    public Date getBdDate() {
        return bdDate;
    }

    public void setBdDate(Date bdDate) {
        this.bdDate = bdDate;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getBdLike() {
        return bdLike;
    }

    public void setBdLike(int bdLike) {
        this.bdLike = bdLike;
    }

    public Board() {}

    @Override
    public String toString() {
        return "Board{" +
                "bdNo=" + bdNo +
                ", cateNo=" + cateNo +
                ", bdTitle='" + bdTitle + '\'' +
                ", bdDescription='" + bdDescription + '\'' +
                ", bdImage='" + bdImage + '\'' +
                ", bdDate=" + bdDate +
                ", userId='" + userId + '\'' +
                ", bdLike=" + bdLike +
                '}';
    }
}

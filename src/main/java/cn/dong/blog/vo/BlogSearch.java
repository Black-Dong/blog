package cn.dong.blog.vo;

/**
 * @author : Dong
 * @date : 2019/11/25 13:52
 */
public class BlogSearch {

    String title;
    Long typeId;
    boolean recommendStatus;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public boolean isRecommendStatus() {
        return recommendStatus;
    }

    public void setRecommendStatus(boolean recommendStatus) {
        this.recommendStatus = recommendStatus;
    }
}

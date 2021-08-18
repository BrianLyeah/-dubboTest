package com.brianl.gmall.config;

/**
 * <p>
 *
 * </p>
 *
 * @Author 李星霖
 * @Date 2021-04-09 0:23
 */
public class School {
    Integer id;
    String name;
    String thumbs;
    String code;
    Integer latestScorel;
    Integer latestRank1;
    Integer latestScore2;
    Integer latestRank2;
    Integer latestRand;
    Integer isPublic;
    String city;
    String category;
    Integer lastRand;
    Integer favorite;
    String url;

    @Override
    public String toString() {
        return "School{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", thumbs='" + thumbs + '\'' +
                ", code='" + code + '\'' +
                ", latestScorel=" + latestScorel +
                ", latestRank1=" + latestRank1 +
                ", latestScore2=" + latestScore2 +
                ", latestRank2=" + latestRank2 +
                ", latestRand=" + latestRand +
                ", isPublic=" + isPublic +
                ", city='" + city + '\'' +
                ", category='" + category + '\'' +
                ", lastRand=" + lastRand +
                ", favorite=" + favorite +
                ", url='" + url + '\'' +
                '}';
    }

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

    public String getThumbs() {
        return thumbs;
    }

    public void setThumbs(String thumbs) {
        this.thumbs = thumbs;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getLatestScorel() {
        return latestScorel;
    }

    public void setLatestScorel(Integer latestScorel) {
        this.latestScorel = latestScorel;
    }

    public Integer getLatestRank1() {
        return latestRank1;
    }

    public void setLatestRank1(Integer latestRank1) {
        this.latestRank1 = latestRank1;
    }

    public Integer getLatestScore2() {
        return latestScore2;
    }

    public void setLatestScore2(Integer latestScore2) {
        this.latestScore2 = latestScore2;
    }

    public Integer getLatestRank2() {
        return latestRank2;
    }

    public void setLatestRank2(Integer latestRank2) {
        this.latestRank2 = latestRank2;
    }

    public Integer getLatestRand() {
        return latestRand;
    }

    public void setLatestRand(Integer latestRand) {
        this.latestRand = latestRand;
    }

    public Integer getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(Integer isPublic) {
        this.isPublic = isPublic;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getLastRand() {
        return lastRand;
    }

    public void setLastRand(Integer lastRand) {
        this.lastRand = lastRand;
    }

    public Integer getFavorite() {
        return favorite;
    }

    public void setFavorite(Integer favorite) {
        this.favorite = favorite;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

package ibs.ctdm.testretrofit.task.network.model;

import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

@Parcel
public class User {
    String login;
    Integer id;
    String url;
    String type;
    String name;
    String company;
    @SerializedName("blog")
    String website;
    String location;
    String email;
    Boolean hireable;
    Integer followers;
    Integer following;
    @SerializedName("gravatar_id")
    String gravatarId;
    @SerializedName("avatar_url")
    String avatarUrl;
    @SerializedName("html_url")
    String htmlUrl;
    @SerializedName("followers_url")
    String followersUrl;
    @SerializedName("following_url")
    String followingUrl;
    @SerializedName("gists_url")
    String gistsUrl;
    @SerializedName("starred_url")
    String starredUrl;
    @SerializedName("subscriptions_url")
    String subscriptionsUrl;
    @SerializedName("organizations_url")
    String organizationsUrl;
    @SerializedName("repos_url")
    String reposUrl;
    @SerializedName("events_url")
    String eventsUrl;
    @SerializedName("received_events_url")
    String receivedEventsUrl;
    @SerializedName("site_admin")
    Boolean siteAdmin;
    @SerializedName("public_repos")
    Integer publicRepos;
    @SerializedName("public_gists")
    Integer publicGists;
    @SerializedName("created_at")
    String createdAt;
    @SerializedName("updated_at")
    String updatedAt;

    /**
     * @return The login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login The login
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return The avatarUrl
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * @param avatarUrl The avatar_url
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    /**
     * @return The gravatarId
     */
    public String getGravatarId() {
        return gravatarId;
    }

    /**
     * @param gravatarId The gravatar_id
     */
    public void setGravatarId(String gravatarId) {
        this.gravatarId = gravatarId;
    }

    /**
     * @return The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return The htmlUrl
     */
    public String getHtmlUrl() {
        return htmlUrl;
    }

    /**
     * @param htmlUrl The html_url
     */
    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    /**
     * @return The followersUrl
     */
    public String getFollowersUrl() {
        return followersUrl;
    }

    /**
     * @param followersUrl The followers_url
     */
    public void setFollowersUrl(String followersUrl) {
        this.followersUrl = followersUrl;
    }

    /**
     * @return The followingUrl
     */
    public String getFollowingUrl() {
        return followingUrl;
    }

    /**
     * @param followingUrl The following_url
     */
    public void setFollowingUrl(String followingUrl) {
        this.followingUrl = followingUrl;
    }

    /**
     * @return The gistsUrl
     */
    public String getGistsUrl() {
        return gistsUrl;
    }

    /**
     * @param gistsUrl The gists_url
     */
    public void setGistsUrl(String gistsUrl) {
        this.gistsUrl = gistsUrl;
    }

    /**
     * @return The starredUrl
     */
    public String getStarredUrl() {
        return starredUrl;
    }

    /**
     * @param starredUrl The starred_url
     */
    public void setStarredUrl(String starredUrl) {
        this.starredUrl = starredUrl;
    }

    /**
     * @return The subscriptionsUrl
     */
    public String getSubscriptionsUrl() {
        return subscriptionsUrl;
    }

    /**
     * @param subscriptionsUrl The subscriptions_url
     */
    public void setSubscriptionsUrl(String subscriptionsUrl) {
        this.subscriptionsUrl = subscriptionsUrl;
    }

    /**
     * @return The organizationsUrl
     */
    public String getOrganizationsUrl() {
        return organizationsUrl;
    }

    /**
     * @param organizationsUrl The organizations_url
     */
    public void setOrganizationsUrl(String organizationsUrl) {
        this.organizationsUrl = organizationsUrl;
    }

    /**
     * @return The reposUrl
     */
    public String getReposUrl() {
        return reposUrl;
    }

    /**
     * @param reposUrl The repos_url
     */
    public void setReposUrl(String reposUrl) {
        this.reposUrl = reposUrl;
    }

    /**
     * @return The eventsUrl
     */
    public String getEventsUrl() {
        return eventsUrl;
    }

    /**
     * @param eventsUrl The events_url
     */
    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    /**
     * @return The receivedEventsUrl
     */
    public String getReceivedEventsUrl() {
        return receivedEventsUrl;
    }

    /**
     * @param receivedEventsUrl The received_events_url
     */
    public void setReceivedEventsUrl(String receivedEventsUrl) {
        this.receivedEventsUrl = receivedEventsUrl;
    }

    /**
     * @return The type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return The siteAdmin
     */
    public Boolean getSiteAdmin() {
        return siteAdmin;
    }

    /**
     * @param siteAdmin The site_admin
     */
    public void setSiteAdmin(Boolean siteAdmin) {
        this.siteAdmin = siteAdmin;
    }

    /**
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return The company
     */
    public String getCompany() {
        return company;
    }

    /**
     * @param company The company
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * @return The website
     */
    public String getWebsite() {
        return website;
    }

    /**
     * @param website The website
     */
    public void setWebsite(String website) {
        this.website = website;
    }

    /**
     * @return The location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location The location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return The email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email The email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return The hireable
     */
    public Boolean getHireable() {
        return hireable;
    }

    /**
     * @param hireable The hireable
     */
    public void setHireable(Boolean hireable) {
        this.hireable = hireable;
    }

    /**
     * @return The publicRepos
     */
    public Integer getPublicRepos() {
        return publicRepos;
    }

    /**
     * @param publicRepos The public_repos
     */
    public void setPublicRepos(Integer publicRepos) {
        this.publicRepos = publicRepos;
    }

    /**
     * @return The publicGists
     */
    public Integer getPublicGists() {
        return publicGists;
    }

    /**
     * @param publicGists The public_gists
     */
    public void setPublicGists(Integer publicGists) {
        this.publicGists = publicGists;
    }

    /**
     * @return The followers
     */
    public Integer getFollowers() {
        return followers;
    }

    /**
     * @param followers The followers
     */
    public void setFollowers(Integer followers) {
        this.followers = followers;
    }

    /**
     * @return The following
     */
    public Integer getFollowing() {
        return following;
    }

    /**
     * @param following The following
     */
    public void setFollowing(Integer following) {
        this.following = following;
    }

    /**
     * @return The createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt The created_at
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return The updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * @param updatedAt The updated_at
     */
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

}
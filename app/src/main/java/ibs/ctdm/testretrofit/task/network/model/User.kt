package ibs.ctdm.testretrofit.task.network.model

import com.google.gson.annotations.SerializedName

import org.parceler.Parcel

@Parcel
data class User (
    /**
     * @return The login
     */
    /**
     * @param login The login
     */
    var login: String? = null,
    /**
     * @return The id
     */
    /**
     * @param id The id
     */
    var id: Int? = null,
    /**
     * @return The url
     */
    /**
     * @param url The url
     */
    var url: String? = null,
    /**
     * @return The type
     */
    /**
     * @param type The type
     */
    var type: String? = null,
    /**
     * @return The name
     */
    /**
     * @param name The name
     */
    var name: String? = null,
    /**
     * @return The company
     */
    /**
     * @param company The company
     */
    var company: String? = null,
    /**
     * @return The website
     */
    /**
     * @param website The website
     */
    @SerializedName("blog")
    var website: String? = null,
    /**
     * @return The location
     */
    /**
     * @param location The location
     */
    var location: String? = null,
    /**
     * @return The email
     */
    /**
     * @param email The email
     */
    var email: String? = null,
    /**
     * @return The hireable
     */
    /**
     * @param hireable The hireable
     */
    var hireable: Boolean? = null,
    /**
     * @return The followers
     */
    /**
     * @param followers The followers
     */
    var followers: Int? = null,
    /**
     * @return The following
     */
    /**
     * @param following The following
     */
    var following: Int? = null,
    /**
     * @return The gravatarId
     */
    /**
     * @param gravatarId The gravatar_id
     */
    @SerializedName("gravatar_id")
    var gravatarId: String? = null,
    /**
     * @return The avatarUrl
     */
    /**
     * @param avatarUrl The avatar_url
     */
    @SerializedName("avatar_url")
    var avatarUrl: String? = null,
    /**
     * @return The htmlUrl
     */
    /**
     * @param htmlUrl The html_url
     */
    @SerializedName("html_url")
    var htmlUrl: String? = null,
    /**
     * @return The followersUrl
     */
    /**
     * @param followersUrl The followers_url
     */
    @SerializedName("followers_url")
    var followersUrl: String? = null,
    /**
     * @return The followingUrl
     */
    /**
     * @param followingUrl The following_url
     */
    @SerializedName("following_url")
    var followingUrl: String? = null,
    /**
     * @return The gistsUrl
     */
    /**
     * @param gistsUrl The gists_url
     */
    @SerializedName("gists_url")
    var gistsUrl: String? = null,
    /**
     * @return The starredUrl
     */
    /**
     * @param starredUrl The starred_url
     */
    @SerializedName("starred_url")
    var starredUrl: String? = null,
    /**
     * @return The subscriptionsUrl
     */
    /**
     * @param subscriptionsUrl The subscriptions_url
     */
    @SerializedName("subscriptions_url")
    var subscriptionsUrl: String? = null,
    /**
     * @return The organizationsUrl
     */
    /**
     * @param organizationsUrl The organizations_url
     */
    @SerializedName("organizations_url")
    var organizationsUrl: String? = null,
    /**
     * @return The reposUrl
     */
    /**
     * @param reposUrl The repos_url
     */
    @SerializedName("repos_url")
    var reposUrl: String? = null,
    /**
     * @return The eventsUrl
     */
    /**
     * @param eventsUrl The events_url
     */
    @SerializedName("events_url")
    var eventsUrl: String? = null,
    /**
     * @return The receivedEventsUrl
     */
    /**
     * @param receivedEventsUrl The received_events_url
     */
    @SerializedName("received_events_url")
    var receivedEventsUrl: String? = null,
    /**
     * @return The siteAdmin
     */
    /**
     * @param siteAdmin The site_admin
     */
    @SerializedName("site_admin")
    var siteAdmin: Boolean? = null,
    /**
     * @return The publicRepos
     */
    /**
     * @param publicRepos The public_repos
     */
    @SerializedName("public_repos")
    var publicRepos: Int? = null,
    /**
     * @return The publicGists
     */
    /**
     * @param publicGists The public_gists
     */
    @SerializedName("public_gists")
    var publicGists: Int? = null,
    /**
     * @return The createdAt
     */
    /**
     * @param createdAt The created_at
     */
    @SerializedName("created_at")
    var createdAt: String? = null,
    /**
     * @return The updatedAt
     */
    /**
     * @param updatedAt The updated_at
     */
    @SerializedName("updated_at")
    var updatedAt: String? = null

)
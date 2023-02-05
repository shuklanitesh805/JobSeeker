package com.nitesh.jobseeker.model;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.springframework.data.mongodb.core.mapping.Document;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "profile",
        "experience",
        "skill",
        "description",
        "id"
})
@Document(collection="JobPost")
public class Post implements Serializable {

    @JsonProperty("profile")
    private String profile;
    @JsonProperty("experience")
    private String experience;
    @JsonProperty("skill")
    private List<String> skill;
    @JsonProperty("description")
    private String description;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = 5641309164355390186L;

    @JsonProperty("profile")
    public String getProfile() {
        return profile;
    }

    @JsonProperty("profile")
    public void setProfile(String profile) {
        this.profile = profile;
    }

    @JsonProperty("experience")
    public String getExperience() {
        return experience;
    }

    @JsonProperty("experience")
    public void setExperience(String experience) {
        this.experience = experience;
    }

    @JsonProperty("skill")
    public List<String> getSkill() {
        return skill;
    }

    @JsonProperty("skill")
    public void setSkill(List<String> skill) {
        this.skill = skill;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Post.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("profile");
        sb.append('=');
        sb.append(((this.profile == null) ? "<null>" : this.profile));
        sb.append(',');
        sb.append("experience");
        sb.append('=');
        sb.append(((this.experience == null) ? "<null>" : this.experience));
        sb.append(',');
        sb.append("skill");
        sb.append('=');
        sb.append(((this.skill == null) ? "<null>" : this.skill));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null) ? "<null>" : this.description));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null) ? "<null>" : this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }
}
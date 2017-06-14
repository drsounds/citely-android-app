package ly.cite.app.models;

import com.parse.ParseObject;

/**
 * Created by alecca on efter Kristus 2017-06-14.
 */

public class Source extends ParseObject {
    public String getName() {
        return this.getString("name");
    }
    public void setName(String value) {
        this.put("name", value);
    }
    public void setAuthor(String value) {
        this.put("author", value);
    }
    public String getAuthor() {
        return this.getString("author");
    }
    public String getUrl() {
        return this.getString("url");
    }
    public void setUrl(String value) {
        this.put("url", value);
    }
}

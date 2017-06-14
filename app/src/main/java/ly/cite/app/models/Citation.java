package ly.cite.app.models;

import com.parse.ParseObject;

import java.util.Date;

/**
 * Created by alecca on efter Kristus 2017-06-14.
 */

public class Citation extends ParseObject {
    public String getUrl() {
        return this.getString("url");
    }
    public void setUrl(String value)
    {
        this.put("url", value);
    }
    public Source getSource() {
        return (Source)this.getParseObject("source");
    }
    public void setSource(Source value) {
        this.put("source", value);
    }
    public Assignment getAssignment() {
        return (Assignment) this.getParseObject("assignment");
    }
    public void setAssignment(Assignment assignment) {
        this.put("assignment", assignment);
    }
    public void setPage(int page) {
        this.put("page", page);
    }
    public int getPageNumber() {
        return this.getInt("page");
    }
    public String getName() {
        return this.getString("name");
    }
    public void setName(String value) {
        this.put("name", value);
    }
    private String getDescription() {
        return this.getString("description");
    }
    public void setDescription(String value){
        this.put("description", value);
    }
    public Date getDate() {
        return this.getDate("time");
    }
    public void setDate(Date value) {
        this.put("time", value);
    }
}

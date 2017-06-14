package ly.cite.app.models;

import com.parse.ParseObject;

import java.util.Date;

/**
 * Created by alecca on efter Kristus 2017-06-14.
 */

public class Assignment extends ParseObject {
    public String getName() {
        return this.getString("name");
    }
    public void setName(String value) {
        this.put("name", value);
    }
    public Date getDeadline() {
        return this.getDate("deadline");
    }
    public void setDeadline(Date date) {
        this.put("deadline", date);
    }

}

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.gson.annotations.SerializedName;

/*@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "channelId",
        "title",
        "assignable",
})*/
public class snippet {
	@SerializedName("channelId")
    public String channelID;
	@SerializedName("title")
    public String title;
	@SerializedName("assignable")
    public boolean assignable;

    public String toString(){
        return "{channel ID:"+channelID+"\nTitle:"+title+"\nAssignable:"+assignable+"}";

    }
}

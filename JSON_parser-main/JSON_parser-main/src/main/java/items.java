import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.gson.annotations.SerializedName;

import java.time.LocalDate;

/*@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "kind",
        "etag",
        "id",
        "snippet"
})*/
public class items {
	@SerializedName("kind")
    public String kind;
	@SerializedName("etag")
    public String etag;
	@SerializedName("id")
    public String id;
	@SerializedName("snippet")
    public snippet snippet;

    public String toString(){
        return "{kind:"+kind+"\netag:"+etag+"\nid:"+id+"\nsnippet:\n"+snippet+"\n}";
    }
}

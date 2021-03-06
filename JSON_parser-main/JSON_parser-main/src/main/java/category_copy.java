import com.google.gson.annotations.SerializedName;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.ObjectUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/*@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "kind",
        "etag",
        "items"
})*/
public class category_copy {

    @SerializedName("kind")
    public String kind;
    @SerializedName("etag")
    public String etag;
    @SerializedName("items")
    public List<items> itemarr = new ArrayList<items>();

    public String toString(){
        StringBuilder sb = new StringBuilder("{kind:"+kind+"\netag:"+etag+"\nItems:[\n");
        for(items i : itemarr){
            sb.append(i+",\n");
        }
        sb.append("]\n}");
        return sb.toString();
    }
}





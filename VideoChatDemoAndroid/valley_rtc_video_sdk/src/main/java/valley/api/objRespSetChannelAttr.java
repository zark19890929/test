package valley.api;

/**
 * Created by shawn on 2018/10/17.
 */

public class objRespSetChannelAttr {
    protected com.rtc.client.object_channel_attr attr = null;
    protected objRespSetChannelAttr(com.rtc.client.object_channel_attr from){
        attr = from;
    }
    public String  getAttrName() {return  attr.getAttrName();}
    public String  getAttrValue() {return  attr.getAttrValue();}
}

package com.github.sheigutn.pushbullet.items.push.sendable.defaults;

import com.github.sheigutn.pushbullet.items.push.sendable.SendablePush;
import com.github.sheigutn.pushbullet.items.push.PushType;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Data
@ToString(callSuper = true)
public class LinkPush extends SendablePush {

    /**
     * The title of this push
     */
    private String title;

    /**
     * The body of this push
     */
    private String body;

    private String url;

    public LinkPush() {
        super(PushType.LINK);
    }

    public LinkPush(String title, String body, String url) {
        this();
        this.title = title;
        this.body = body;
        this.url = url;
    }
}

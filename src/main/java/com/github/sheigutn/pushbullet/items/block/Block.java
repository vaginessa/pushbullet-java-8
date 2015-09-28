package com.github.sheigutn.pushbullet.items.block;

import com.github.sheigutn.pushbullet.http.defaults.delete.DeleteSpecificBlockRequest;
import com.github.sheigutn.pushbullet.interfaces.Deletable;
import com.github.sheigutn.pushbullet.items.PushbulletObject;
import com.github.sheigutn.pushbullet.items.user.BlockedUser;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString(callSuper = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Block extends PushbulletObject implements Deletable {

    private BlockedUser user;

    @Override
    public void delete() {
        if(!isActive()) return;
        getPushbullet().executeRequest(new DeleteSpecificBlockRequest(getIdentity()));
        setActive(false);
    }
}

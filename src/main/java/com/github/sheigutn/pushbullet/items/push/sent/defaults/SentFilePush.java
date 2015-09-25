package com.github.sheigutn.pushbullet.items.push.sent.defaults;

import com.github.sheigutn.pushbullet.items.push.sent.SentPush;
import com.github.sheigutn.pushbullet.items.push.PushType;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
public class SentFilePush extends SentPush {

    private SentFilePush() {
        setType(PushType.FILE);
    }

    private String body;

    /**
     * The file's name
     */
    @SerializedName("file_name")
    private String fileName;

    /**
     * The file's mime type
     */
    @SerializedName("file_type")
    private String fileType;

    /**
     * The file's url
     */
    @SerializedName("file_url")
    private String fileUrl;

    /**
     * The url of the image<br>
     * Only set if the file's mime type is image/*
     */
    @SerializedName("image_url")
    private String imageUrl;

    /**
     * The width of the image<br>
     * Only set if the file's mime type is image/*
     */
    @SerializedName("image_width")
    private int imageWidth;

    /**
     * The height of the image<br>
     * Only set if the file's mime type is image/*
     */
    @SerializedName("image_height")
    private int imageHeight;

    /**
     * @return Whether the file of this push is an image file
     */
    public boolean hasImageFile() {
        return imageUrl != null;
    }
}

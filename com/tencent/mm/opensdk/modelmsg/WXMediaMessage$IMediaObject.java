package com.tencent.mm.opensdk.modelmsg;

import android.os.Bundle;

public abstract interface WXMediaMessage$IMediaObject
{
  public static final int TYPE_APPBRAND = 33;
  public static final int TYPE_APPDATA = 7;
  public static final int TYPE_BUSINESS_CARD = 45;
  public static final int TYPE_CARD_SHARE = 16;
  public static final int TYPE_DESIGNER_SHARED = 25;
  public static final int TYPE_DEVICE_ACCESS = 12;
  public static final int TYPE_EMOJI = 8;
  public static final int TYPE_EMOJILIST_SHARED = 27;
  public static final int TYPE_EMOTICON_GIFT = 11;
  public static final int TYPE_EMOTICON_SHARED = 15;
  public static final int TYPE_EMOTIONLIST_SHARED = 26;
  public static final int TYPE_FILE = 6;
  public static final int TYPE_GAME_VIDEO_FILE = 39;
  public static final int TYPE_GIFTCARD = 34;
  public static final int TYPE_IMAGE = 2;
  public static final int TYPE_LOCATION = 30;
  public static final int TYPE_LOCATION_SHARE = 17;
  public static final int TYPE_MALL_PRODUCT = 13;
  public static final int TYPE_MUSIC = 3;
  public static final int TYPE_NOTE = 24;
  public static final int TYPE_OLD_TV = 14;
  public static final int TYPE_OPENSDK_APPBRAND = 36;
  public static final int TYPE_OPENSDK_APPBRAND_WEISHIVIDEO = 46;
  public static final int TYPE_PRODUCT = 10;
  public static final int TYPE_RECORD = 19;
  public static final int TYPE_TEXT = 1;
  public static final int TYPE_TV = 20;
  public static final int TYPE_UNKNOWN = 0;
  public static final int TYPE_URL = 5;
  public static final int TYPE_VIDEO = 4;
  public static final int TYPE_VIDEO_FILE = 38;

  public abstract boolean checkArgs();

  public abstract void serialize(Bundle paramBundle);

  public abstract int type();

  public abstract void unserialize(Bundle paramBundle);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject
 * JD-Core Version:    0.6.2
 */
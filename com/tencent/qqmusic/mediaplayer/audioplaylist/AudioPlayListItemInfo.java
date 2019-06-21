package com.tencent.qqmusic.mediaplayer.audioplaylist;

import android.os.Parcelable;

public abstract class AudioPlayListItemInfo
  implements Parcelable
{
  public static int TYPE_CUE = 1;
  public static int TYPE_M3U = 2;
  public static int TYPE_NONE = 0;
  protected int mType = TYPE_NONE;
  protected String mUri;

  public int getType()
  {
    return this.mType;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.audioplaylist.AudioPlayListItemInfo
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.gallery.model;

import android.os.Parcelable;

public abstract class GalleryItem$MediaItem
  implements Parcelable, Comparable<MediaItem>
{
  public double bDG = 181.0D;
  public double bDH = 91.0D;
  public String fPT;
  public String lZg;
  public String mMimeType;
  public String mOi;
  public String mOj;
  public long mOk;
  public long mOl;
  public long mOm;
  public String mOn;

  public GalleryItem$MediaItem()
  {
    this(0L, "", "", "");
  }

  public GalleryItem$MediaItem(long paramLong)
  {
    this(paramLong, "", "", "");
  }

  public GalleryItem$MediaItem(long paramLong, String paramString1, String paramString2, String paramString3)
  {
    this.mOk = paramLong;
    this.fPT = paramString1;
    this.lZg = paramString2;
    this.mMimeType = paramString3;
  }

  public static MediaItem N(int paramInt, long paramLong)
  {
    if (paramInt == 1);
    for (Object localObject = new GalleryItem.ImageMediaItem(paramLong); ; localObject = new GalleryItem.VideoMediaItem(paramLong))
      return localObject;
  }

  public static MediaItem a(int paramInt, long paramLong, String paramString1, String paramString2, String paramString3)
  {
    if (paramInt == 1);
    for (paramString1 = new GalleryItem.ImageMediaItem(paramLong, paramString1, paramString2, paramString3); ; paramString1 = new GalleryItem.VideoMediaItem(paramLong, paramString1, paramString2, paramString3))
      return paramString1;
  }

  public abstract String Wy();

  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (paramObject != null)
    {
      bool2 = bool1;
      if ((paramObject instanceof MediaItem))
      {
        paramObject = (MediaItem)paramObject;
        bool2 = bool1;
        if (this.fPT != null)
        {
          bool2 = bool1;
          if (this.fPT.equals(paramObject.fPT))
            bool2 = true;
        }
      }
    }
    return bool2;
  }

  public abstract int getType();

  public String toString()
  {
    return "MediaItem{mOrignalPath='" + this.fPT + '\'' + ", mThumbPath='" + this.lZg + '\'' + ", origId=" + this.mOk + ", generateDate=" + this.mOl + ", mMimeType='" + this.mMimeType + '\'' + ", mLongitude='" + this.bDH + '\'' + ", mLatitude='" + this.bDG + '\'' + ", mBusinessTag='" + this.mOn + '\'' + '}';
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.model.GalleryItem.MediaItem
 * JD-Core Version:    0.6.2
 */
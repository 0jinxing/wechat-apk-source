package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;

public abstract class ShareMedia
  implements ShareModel
{
  private final Bundle params;

  ShareMedia(Parcel paramParcel)
  {
    this.params = paramParcel.readBundle();
  }

  protected ShareMedia(ShareMedia.Builder paramBuilder)
  {
    this.params = new Bundle(ShareMedia.Builder.access$000(paramBuilder));
  }

  public int describeContents()
  {
    return 0;
  }

  public abstract ShareMedia.Type getMediaType();

  @Deprecated
  public Bundle getParameters()
  {
    return new Bundle(this.params);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeBundle(this.params);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.facebook.share.model.ShareMedia
 * JD-Core Version:    0.6.2
 */
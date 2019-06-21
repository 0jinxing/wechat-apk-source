package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public abstract class ShareMedia$Builder<M extends ShareMedia, B extends Builder>
  implements ShareModelBuilder<M, B>
{
  private Bundle params = new Bundle();

  static List<ShareMedia> readListFrom(Parcel paramParcel)
  {
    Parcelable[] arrayOfParcelable = paramParcel.readParcelableArray(ShareMedia.class.getClassLoader());
    paramParcel = new ArrayList(arrayOfParcelable.length);
    int i = arrayOfParcelable.length;
    for (int j = 0; j < i; j++)
      paramParcel.add((ShareMedia)arrayOfParcelable[j]);
    return paramParcel;
  }

  static void writeListTo(Parcel paramParcel, int paramInt, List<ShareMedia> paramList)
  {
    paramParcel.writeParcelableArray((ShareMedia[])paramList.toArray(), paramInt);
  }

  public B readFrom(M paramM)
  {
    if (paramM == null);
    for (paramM = this; ; paramM = setParameters(paramM.getParameters()))
      return paramM;
  }

  @Deprecated
  public B setParameter(String paramString1, String paramString2)
  {
    this.params.putString(paramString1, paramString2);
    return this;
  }

  @Deprecated
  public B setParameters(Bundle paramBundle)
  {
    this.params.putAll(paramBundle);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.facebook.share.model.ShareMedia.Builder
 * JD-Core Version:    0.6.2
 */
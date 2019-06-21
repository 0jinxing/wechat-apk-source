package com.tencent.mm.plugin.appbrand.launching;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

public abstract class AppBrandLaunchErrorAction
  implements Parcelable
{
  public static final AppBrandLaunchErrorAction.a CREATOR = new AppBrandLaunchErrorAction.a();
  final String appId;
  final int har;

  AppBrandLaunchErrorAction(Parcel paramParcel)
  {
    this.appId = paramParcel.readString();
    this.har = paramParcel.readInt();
  }

  AppBrandLaunchErrorAction(String paramString, int paramInt)
  {
    this.appId = paramString;
    this.har = paramInt;
  }

  public abstract void cQ(Context paramContext);

  public final int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(getClass().getName());
    paramParcel.writeString(this.appId);
    paramParcel.writeInt(this.har);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorAction
 * JD-Core Version:    0.6.2
 */
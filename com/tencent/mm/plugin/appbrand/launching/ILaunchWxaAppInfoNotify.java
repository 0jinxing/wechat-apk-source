package com.tencent.mm.plugin.appbrand.launching;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle;

public abstract interface ILaunchWxaAppInfoNotify
{
  public static final ILaunchWxaAppInfoNotify ihc = new ILaunchWxaAppInfoNotify.1();

  public abstract void a(String paramString1, int paramInt, String paramString2, aa paramaa);

  public static class LaunchInfoIpcWrapper
    implements Parcelable
  {
    public static final Parcelable.Creator<LaunchInfoIpcWrapper> CREATOR;
    public String appId;
    public AppRuntimeApiPermissionBundle bQt;
    public int har;
    public AppBrandLaunchErrorAction ihd;

    static
    {
      AppMethodBeat.i(131824);
      CREATOR = new ILaunchWxaAppInfoNotify.LaunchInfoIpcWrapper.1();
      AppMethodBeat.o(131824);
    }

    LaunchInfoIpcWrapper()
    {
    }

    LaunchInfoIpcWrapper(Parcel paramParcel)
    {
      AppMethodBeat.i(131823);
      this.appId = paramParcel.readString();
      this.har = paramParcel.readInt();
      this.bQt = ((AppRuntimeApiPermissionBundle)paramParcel.readParcelable(AppRuntimeApiPermissionBundle.class.getClassLoader()));
      this.ihd = ((AppBrandLaunchErrorAction)paramParcel.readParcelable(AppBrandLaunchErrorAction.class.getClassLoader()));
      AppMethodBeat.o(131823);
    }

    public int describeContents()
    {
      return 0;
    }

    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      AppMethodBeat.i(131822);
      paramParcel.writeString(this.appId);
      paramParcel.writeInt(this.har);
      paramParcel.writeParcelable(this.bQt, paramInt);
      paramParcel.writeParcelable(this.ihd, paramInt);
      AppMethodBeat.o(131822);
    }
  }

  public static final class a
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.ILaunchWxaAppInfoNotify
 * JD-Core Version:    0.6.2
 */
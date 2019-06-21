package com.tencent.mm.plugin.appbrand.launching.params;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate;
import com.tencent.luggage.sdk.launching.OnWXAppResultXPCWrapper;
import com.tencent.luggage.sdk.launching.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.LaunchParamsOptional;
import com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;

public final class LaunchParcel
  implements Parcelable
{
  public static final Parcelable.Creator<LaunchParcel> CREATOR;
  public String appId;
  public int har;
  public String hgC;
  public AppBrandLaunchReferrer hgF;
  public ActivityStarterIpcDelegate ifP;
  public long ijA;
  public b<?> ijB;
  public AppBrandStatObject ijy;
  public LaunchParamsOptional ijz;
  public String username;
  public int version;

  static
  {
    AppMethodBeat.i(102124);
    CREATOR = new LaunchParcel.1();
    AppMethodBeat.o(102124);
  }

  public LaunchParcel()
  {
  }

  private LaunchParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(102121);
    this.username = paramParcel.readString();
    this.appId = paramParcel.readString();
    this.version = paramParcel.readInt();
    this.har = paramParcel.readInt();
    this.hgC = paramParcel.readString();
    this.ijy = ((AppBrandStatObject)paramParcel.readParcelable(AppBrandStatObject.class.getClassLoader()));
    this.hgF = ((AppBrandLaunchReferrer)paramParcel.readParcelable(AppBrandLaunchReferrer.class.getClassLoader()));
    this.ijz = ((LaunchParamsOptional)paramParcel.readParcelable(LaunchParamsOptional.class.getClassLoader()));
    this.ijA = paramParcel.readLong();
    this.ifP = ((ActivityStarterIpcDelegate)paramParcel.readParcelable(ActivityStarterIpcDelegate.class.getClassLoader()));
    this.ijB = OnWXAppResultXPCWrapper.b(paramParcel);
    AppMethodBeat.o(102121);
  }

  public static String Cm(String paramString)
  {
    AppMethodBeat.i(102123);
    if (TextUtils.isEmpty(paramString))
      AppMethodBeat.o(102123);
    while (true)
    {
      return paramString;
      for (int i = 0; (i < paramString.length()) && ('/' == paramString.charAt(i)); i++);
      paramString = paramString.substring(i);
      AppMethodBeat.o(102123);
    }
  }

  public final void c(AppBrandInitConfigLU paramAppBrandInitConfigLU)
  {
    Object localObject1 = null;
    AppMethodBeat.i(102122);
    if (paramAppBrandInitConfigLU == null)
    {
      AppMethodBeat.o(102122);
      return;
    }
    if (TextUtils.isEmpty(paramAppBrandInitConfigLU.username))
      paramAppBrandInitConfigLU.username = this.username;
    if ((this.ijz != null) && (this.ijz.bQj != null))
      paramAppBrandInitConfigLU.bQj.a(this.ijz.bQj);
    paramAppBrandInitConfigLU.hgC = Cm(this.hgC);
    paramAppBrandInitConfigLU.hgF.a(this.hgF);
    if (this.ijz == null)
    {
      localObject2 = null;
      label97: paramAppBrandInitConfigLU.bQh = ((String)localObject2);
      if (this.ijz != null)
        break label151;
    }
    label151: for (Object localObject2 = localObject1; ; localObject2 = this.ijz.bQi)
    {
      paramAppBrandInitConfigLU.bQi = ((String)localObject2);
      paramAppBrandInitConfigLU.startTime = this.ijA;
      paramAppBrandInitConfigLU.bQm = this.ijB;
      AppMethodBeat.o(102122);
      break;
      localObject2 = this.ijz.bQh;
      break label97;
    }
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(102120);
    paramParcel.writeString(this.username);
    paramParcel.writeString(this.appId);
    paramParcel.writeInt(this.version);
    paramParcel.writeInt(this.har);
    paramParcel.writeString(this.hgC);
    paramParcel.writeParcelable(this.ijy, paramInt);
    paramParcel.writeParcelable(this.hgF, paramInt);
    paramParcel.writeParcelable(this.ijz, paramInt);
    paramParcel.writeLong(this.ijA);
    paramParcel.writeParcelable(this.ifP, paramInt);
    OnWXAppResultXPCWrapper.a(this.ijB, paramParcel);
    AppMethodBeat.o(102120);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel
 * JD-Core Version:    0.6.2
 */
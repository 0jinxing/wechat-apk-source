package com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class JsApiNavigateToDevMiniProgram$DevPkgInfo
  implements Parcelable
{
  public static final Parcelable.Creator<DevPkgInfo> CREATOR;
  String appId;
  String cOj;
  String cOk;
  String hQT;

  static
  {
    AppMethodBeat.i(131341);
    CREATOR = new JsApiNavigateToDevMiniProgram.DevPkgInfo.1();
    AppMethodBeat.o(131341);
  }

  JsApiNavigateToDevMiniProgram$DevPkgInfo()
  {
  }

  JsApiNavigateToDevMiniProgram$DevPkgInfo(Parcel paramParcel)
  {
    AppMethodBeat.i(131340);
    this.appId = paramParcel.readString();
    this.cOj = paramParcel.readString();
    this.cOk = paramParcel.readString();
    this.hQT = paramParcel.readString();
    AppMethodBeat.o(131340);
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(131339);
    paramParcel.writeString(this.appId);
    paramParcel.writeString(this.cOj);
    paramParcel.writeString(this.cOk);
    paramParcel.writeString(this.hQT);
    AppMethodBeat.o(131339);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.JsApiNavigateToDevMiniProgram.DevPkgInfo
 * JD-Core Version:    0.6.2
 */
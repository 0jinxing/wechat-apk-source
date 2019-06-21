package com.tencent.mm.plugin.appbrand.jsapi.version;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;

final class JsApiUpdateApp$SyncResult
  implements Parcelable
{
  public static final Parcelable.Creator<SyncResult> CREATOR;
  private AppBrandInitConfigWC hYb;
  private boolean hYd;

  static
  {
    AppMethodBeat.i(131495);
    CREATOR = new JsApiUpdateApp.SyncResult.1();
    AppMethodBeat.o(131495);
  }

  JsApiUpdateApp$SyncResult(Parcel paramParcel)
  {
    AppMethodBeat.i(131494);
    if (paramParcel.readByte() != 0);
    for (boolean bool = true; ; bool = false)
    {
      this.hYd = bool;
      this.hYb = ((AppBrandInitConfigWC)paramParcel.readParcelable(AppBrandInitConfigWC.class.getClassLoader()));
      AppMethodBeat.o(131494);
      return;
    }
  }

  JsApiUpdateApp$SyncResult(boolean paramBoolean, AppBrandInitConfigWC paramAppBrandInitConfigWC)
  {
    this.hYd = paramBoolean;
    this.hYb = paramAppBrandInitConfigWC;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(131493);
    if (this.hYd)
      paramInt = 1;
    int j;
    for (int i = paramInt; ; j = paramInt)
    {
      paramParcel.writeByte(i);
      paramParcel.writeParcelable(this.hYb, 0);
      AppMethodBeat.o(131493);
      return;
      paramInt = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.version.JsApiUpdateApp.SyncResult
 * JD-Core Version:    0.6.2
 */
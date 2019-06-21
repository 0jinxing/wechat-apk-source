package com.tencent.mm.plugin.appbrand.jsapi.version;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;

final class JsApiUpdateApp$SyncRequest
  implements Parcelable
{
  public static final Parcelable.Creator<SyncRequest> CREATOR;
  private AppBrandInitConfigWC hYb;
  private AppBrandStatObject hYc;

  static
  {
    AppMethodBeat.i(138133);
    CREATOR = new JsApiUpdateApp.SyncRequest.1();
    AppMethodBeat.o(138133);
  }

  protected JsApiUpdateApp$SyncRequest(Parcel paramParcel)
  {
    AppMethodBeat.i(138132);
    this.hYb = ((AppBrandInitConfigWC)paramParcel.readParcelable(AppBrandInitConfigWC.class.getClassLoader()));
    this.hYc = ((AppBrandStatObject)paramParcel.readParcelable(AppBrandStatObject.class.getClassLoader()));
    AppMethodBeat.o(138132);
  }

  public JsApiUpdateApp$SyncRequest(AppBrandInitConfigWC paramAppBrandInitConfigWC, AppBrandStatObject paramAppBrandStatObject)
  {
    this.hYb = paramAppBrandInitConfigWC;
    this.hYc = paramAppBrandStatObject;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(138131);
    paramParcel.writeParcelable(this.hYb, paramInt);
    paramParcel.writeParcelable(this.hYc, paramInt);
    AppMethodBeat.o(138131);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.version.JsApiUpdateApp.SyncRequest
 * JD-Core Version:    0.6.2
 */
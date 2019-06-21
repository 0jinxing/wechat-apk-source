package com.tencent.mm.plugin.appbrand.jsapi;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.ProcessResult;

final class JsApiPrivateAddContact$AddContactResult extends AppBrandProxyUIProcessTask.ProcessResult
{
  public static final Parcelable.Creator<AddContactResult> CREATOR;
  private int bFZ;

  static
  {
    AppMethodBeat.i(73165);
    CREATOR = new JsApiPrivateAddContact.AddContactResult.1();
    AppMethodBeat.o(73165);
  }

  JsApiPrivateAddContact$AddContactResult()
  {
  }

  JsApiPrivateAddContact$AddContactResult(Parcel paramParcel)
  {
    AppMethodBeat.i(73162);
    k(paramParcel);
    AppMethodBeat.o(73162);
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void k(Parcel paramParcel)
  {
    AppMethodBeat.i(73163);
    this.bFZ = paramParcel.readInt();
    AppMethodBeat.o(73163);
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(73164);
    paramParcel.writeInt(this.bFZ);
    AppMethodBeat.o(73164);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.JsApiPrivateAddContact.AddContactResult
 * JD-Core Version:    0.6.2
 */
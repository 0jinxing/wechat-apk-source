package com.tencent.mm.plugin.appbrand.jsapi.lab;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class JsApiSetLabInfo$IPCSetLabInfoRequest
  implements Parcelable
{
  public static final Parcelable.Creator<IPCSetLabInfoRequest> CREATOR;
  private String csB;
  private boolean enabled;

  static
  {
    AppMethodBeat.i(131106);
    CREATOR = new JsApiSetLabInfo.IPCSetLabInfoRequest.1();
    AppMethodBeat.o(131106);
  }

  public JsApiSetLabInfo$IPCSetLabInfoRequest()
  {
  }

  protected JsApiSetLabInfo$IPCSetLabInfoRequest(Parcel paramParcel)
  {
    AppMethodBeat.i(131105);
    this.csB = paramParcel.readString();
    if (paramParcel.readByte() != 0);
    for (boolean bool = true; ; bool = false)
    {
      this.enabled = bool;
      AppMethodBeat.o(131105);
      return;
    }
  }

  public JsApiSetLabInfo$IPCSetLabInfoRequest(String paramString, boolean paramBoolean)
  {
    this.csB = paramString;
    this.enabled = paramBoolean;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(131104);
    paramParcel.writeString(this.csB);
    if (this.enabled)
      paramInt = 1;
    int j;
    for (int i = paramInt; ; j = paramInt)
    {
      paramParcel.writeByte(i);
      AppMethodBeat.o(131104);
      return;
      paramInt = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.lab.JsApiSetLabInfo.IPCSetLabInfoRequest
 * JD-Core Version:    0.6.2
 */
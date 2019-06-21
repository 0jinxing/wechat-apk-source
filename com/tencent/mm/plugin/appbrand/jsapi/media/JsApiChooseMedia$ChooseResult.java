package com.tencent.mm.plugin.appbrand.jsapi.media;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.ProcessResult;

final class JsApiChooseMedia$ChooseResult extends AppBrandProxyUIProcessTask.ProcessResult
{
  public static final Parcelable.Creator<ChooseResult> CREATOR;
  int bFZ;
  String hPo;
  String type;

  static
  {
    AppMethodBeat.i(131167);
    CREATOR = new JsApiChooseMedia.ChooseResult.1();
    AppMethodBeat.o(131167);
  }

  JsApiChooseMedia$ChooseResult()
  {
  }

  JsApiChooseMedia$ChooseResult(Parcel paramParcel)
  {
    AppMethodBeat.i(131166);
    k(paramParcel);
    AppMethodBeat.o(131166);
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void k(Parcel paramParcel)
  {
    AppMethodBeat.i(131164);
    this.bFZ = paramParcel.readInt();
    this.type = paramParcel.readString();
    this.hPo = paramParcel.readString();
    AppMethodBeat.o(131164);
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(131165);
    paramParcel.writeInt(this.bFZ);
    paramParcel.writeString(this.type);
    paramParcel.writeString(this.hPo);
    AppMethodBeat.o(131165);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia.ChooseResult
 * JD-Core Version:    0.6.2
 */
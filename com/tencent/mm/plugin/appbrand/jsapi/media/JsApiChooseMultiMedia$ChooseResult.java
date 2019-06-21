package com.tencent.mm.plugin.appbrand.jsapi.media;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.ProcessResult;

final class JsApiChooseMultiMedia$ChooseResult extends AppBrandProxyUIProcessTask.ProcessResult
{
  public static final Parcelable.Creator<ChooseResult> CREATOR;
  int bFZ;
  String hPI;

  static
  {
    AppMethodBeat.i(131229);
    CREATOR = new JsApiChooseMultiMedia.ChooseResult.1();
    AppMethodBeat.o(131229);
  }

  JsApiChooseMultiMedia$ChooseResult()
  {
  }

  JsApiChooseMultiMedia$ChooseResult(Parcel paramParcel)
  {
    super(paramParcel);
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void k(Parcel paramParcel)
  {
    AppMethodBeat.i(131227);
    this.bFZ = paramParcel.readInt();
    this.hPI = paramParcel.readString();
    AppMethodBeat.o(131227);
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(131228);
    paramParcel.writeInt(this.bFZ);
    paramParcel.writeString(this.hPI);
    AppMethodBeat.o(131228);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia.ChooseResult
 * JD-Core Version:    0.6.2
 */
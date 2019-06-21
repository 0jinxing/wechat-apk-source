package com.tencent.mm.plugin.appbrand.jsapi.file;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.ProcessResult;

final class JsApiOpenDocument$OpenResult extends AppBrandProxyUIProcessTask.ProcessResult
{
  public static final Parcelable.Creator<OpenResult> CREATOR;
  public int ret;

  static
  {
    AppMethodBeat.i(131075);
    CREATOR = new JsApiOpenDocument.OpenResult.1();
    AppMethodBeat.o(131075);
  }

  JsApiOpenDocument$OpenResult()
  {
  }

  JsApiOpenDocument$OpenResult(Parcel paramParcel)
  {
    super(paramParcel);
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void k(Parcel paramParcel)
  {
    AppMethodBeat.i(131073);
    this.ret = paramParcel.readInt();
    AppMethodBeat.o(131073);
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(131074);
    paramParcel.writeInt(this.ret);
    AppMethodBeat.o(131074);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.file.JsApiOpenDocument.OpenResult
 * JD-Core Version:    0.6.2
 */
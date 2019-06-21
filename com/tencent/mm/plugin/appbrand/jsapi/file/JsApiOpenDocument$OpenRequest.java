package com.tencent.mm.plugin.appbrand.jsapi.file;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.ProcessRequest;

final class JsApiOpenDocument$OpenRequest extends AppBrandProxyUIProcessTask.ProcessRequest
{
  public static final Parcelable.Creator<OpenRequest> CREATOR;
  public String eov;
  public String filePath;

  static
  {
    AppMethodBeat.i(131071);
    CREATOR = new JsApiOpenDocument.OpenRequest.1();
    AppMethodBeat.o(131071);
  }

  JsApiOpenDocument$OpenRequest()
  {
  }

  JsApiOpenDocument$OpenRequest(Parcel paramParcel)
  {
    super(paramParcel);
  }

  public final String aBZ()
  {
    return "QbDocumentReader";
  }

  public final Class<? extends AppBrandProxyUIProcessTask> aCa()
  {
    return JsApiOpenDocument.a.class;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void k(Parcel paramParcel)
  {
    AppMethodBeat.i(131069);
    super.k(paramParcel);
    this.filePath = paramParcel.readString();
    this.eov = paramParcel.readString();
    AppMethodBeat.o(131069);
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(131070);
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeString(this.filePath);
    paramParcel.writeString(this.eov);
    AppMethodBeat.o(131070);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.file.JsApiOpenDocument.OpenRequest
 * JD-Core Version:    0.6.2
 */
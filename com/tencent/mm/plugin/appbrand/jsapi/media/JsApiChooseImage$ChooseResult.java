package com.tencent.mm.plugin.appbrand.jsapi.media;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.ProcessResult;
import java.util.ArrayList;

final class JsApiChooseImage$ChooseResult extends AppBrandProxyUIProcessTask.ProcessResult
{
  public static final Parcelable.Creator<ChooseResult> CREATOR;
  int bFZ;
  ArrayList<AppBrandLocalMediaObject> hOW;

  static
  {
    AppMethodBeat.i(131134);
    CREATOR = new Parcelable.Creator()
    {
    };
    AppMethodBeat.o(131134);
  }

  JsApiChooseImage$ChooseResult()
  {
  }

  JsApiChooseImage$ChooseResult(Parcel paramParcel)
  {
    super(paramParcel);
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void k(Parcel paramParcel)
  {
    AppMethodBeat.i(131132);
    this.bFZ = paramParcel.readInt();
    this.hOW = paramParcel.createTypedArrayList(AppBrandLocalMediaObject.CREATOR);
    AppMethodBeat.o(131132);
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(131133);
    paramParcel.writeInt(this.bFZ);
    paramParcel.writeTypedList(this.hOW);
    AppMethodBeat.o(131133);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseImage.ChooseResult
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.appbrand.jsapi.media;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.ProcessRequest;

final class JsApiChooseVideo$ChooseRequest extends AppBrandProxyUIProcessTask.ProcessRequest
{
  public static final Parcelable.Creator<ChooseRequest> CREATOR;
  String appId;
  boolean hOS;
  boolean hOT;
  boolean hPR;
  int maxDuration;

  static
  {
    AppMethodBeat.i(131276);
    CREATOR = new JsApiChooseVideo.ChooseRequest.1();
    AppMethodBeat.o(131276);
  }

  JsApiChooseVideo$ChooseRequest()
  {
  }

  JsApiChooseVideo$ChooseRequest(Parcel paramParcel)
  {
    AppMethodBeat.i(131275);
    k(paramParcel);
    AppMethodBeat.o(131275);
  }

  public final boolean aBY()
  {
    return true;
  }

  public final String aBZ()
  {
    return "GalleryChooseVideo";
  }

  public final Class<? extends AppBrandProxyUIProcessTask> aCa()
  {
    return JsApiChooseVideo.a.class;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void k(Parcel paramParcel)
  {
    boolean bool1 = true;
    AppMethodBeat.i(131273);
    this.appId = paramParcel.readString();
    this.maxDuration = paramParcel.readInt();
    if (paramParcel.readByte() != 0)
    {
      bool2 = true;
      this.hOS = bool2;
      if (paramParcel.readByte() == 0)
        break label76;
      bool2 = true;
      label46: this.hOT = bool2;
      if (paramParcel.readByte() == 0)
        break label81;
    }
    label76: label81: for (boolean bool2 = bool1; ; bool2 = false)
    {
      this.hPR = bool2;
      AppMethodBeat.o(131273);
      return;
      bool2 = false;
      break;
      bool2 = false;
      break label46;
    }
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = 1;
    AppMethodBeat.i(131274);
    paramParcel.writeString(this.appId);
    paramParcel.writeInt(this.maxDuration);
    int i;
    if (this.hOS)
    {
      i = 1;
      byte b = i;
      paramParcel.writeByte(b);
      if (!this.hOT)
        break label89;
      i = 1;
      b = i;
      label53: paramParcel.writeByte(b);
      if (!this.hPR)
        break label97;
    }
    label89: label97: int k;
    for (int j = paramInt; ; k = paramInt)
    {
      paramParcel.writeByte(j);
      AppMethodBeat.o(131274);
      return;
      i = 0;
      j = i;
      break;
      i = 0;
      j = i;
      break label53;
      paramInt = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseVideo.ChooseRequest
 * JD-Core Version:    0.6.2
 */
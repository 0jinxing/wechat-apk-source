package com.tencent.mm.plugin.appbrand.jsapi.media;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.ProcessRequest;

final class JsApiChooseMultiMedia$ChooseRequest extends AppBrandProxyUIProcessTask.ProcessRequest
{
  public static final Parcelable.Creator<ChooseRequest> CREATOR;
  String appId;
  int count;
  String eUu;
  double fNN;
  int gLP;
  boolean hOS;
  boolean hOT;
  double latitude;
  double longitude;

  static
  {
    AppMethodBeat.i(131225);
    CREATOR = new JsApiChooseMultiMedia.ChooseRequest.1();
    AppMethodBeat.o(131225);
  }

  JsApiChooseMultiMedia$ChooseRequest()
  {
  }

  JsApiChooseMultiMedia$ChooseRequest(Parcel paramParcel)
  {
    AppMethodBeat.i(131224);
    k(paramParcel);
    AppMethodBeat.o(131224);
  }

  public final boolean aBY()
  {
    return true;
  }

  public final String aBZ()
  {
    return "GalleryChooseMultiMedia";
  }

  public final Class<? extends AppBrandProxyUIProcessTask> aCa()
  {
    return JsApiChooseMultiMedia.a.class;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void k(Parcel paramParcel)
  {
    boolean bool1 = true;
    AppMethodBeat.i(131223);
    this.appId = paramParcel.readString();
    this.count = paramParcel.readInt();
    this.longitude = paramParcel.readDouble();
    this.latitude = paramParcel.readDouble();
    this.eUu = paramParcel.readString();
    this.fNN = paramParcel.readDouble();
    if (paramParcel.readByte() != 0)
    {
      bool2 = true;
      this.hOS = bool2;
      if (paramParcel.readByte() == 0)
        break label102;
    }
    label102: for (boolean bool2 = bool1; ; bool2 = false)
    {
      this.hOT = bool2;
      this.gLP = paramParcel.readInt();
      AppMethodBeat.o(131223);
      return;
      bool2 = false;
      break;
    }
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = 1;
    AppMethodBeat.i(131222);
    paramParcel.writeString(this.appId);
    paramParcel.writeInt(this.count);
    paramParcel.writeDouble(this.longitude);
    paramParcel.writeDouble(this.latitude);
    paramParcel.writeString(this.eUu);
    paramParcel.writeDouble(this.fNN);
    int i;
    if (this.hOS)
    {
      i = 1;
      byte b = i;
      paramParcel.writeByte(b);
      if (!this.hOT)
        break label111;
    }
    label111: int k;
    for (int j = paramInt; ; k = paramInt)
    {
      paramParcel.writeByte(j);
      paramParcel.writeInt(this.gLP);
      AppMethodBeat.o(131222);
      return;
      i = 0;
      j = i;
      break;
      paramInt = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia.ChooseRequest
 * JD-Core Version:    0.6.2
 */
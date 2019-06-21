package com.tencent.mm.plugin.appbrand.jsapi.media;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.ProcessRequest;

final class JsApiChooseImage$ChooseRequest extends AppBrandProxyUIProcessTask.ProcessRequest
{
  public static final Parcelable.Creator<ChooseRequest> CREATOR;
  String appId;
  int count;
  boolean hOS;
  boolean hOT;
  boolean hOU;
  boolean hOV;

  static
  {
    AppMethodBeat.i(131130);
    CREATOR = new JsApiChooseImage.ChooseRequest.1();
    AppMethodBeat.o(131130);
  }

  JsApiChooseImage$ChooseRequest()
  {
  }

  JsApiChooseImage$ChooseRequest(Parcel paramParcel)
  {
    AppMethodBeat.i(131129);
    k(paramParcel);
    AppMethodBeat.o(131129);
  }

  public final boolean aBY()
  {
    return true;
  }

  public final String aBZ()
  {
    return "GalleryChooseImage";
  }

  public final Class<? extends AppBrandProxyUIProcessTask> aCa()
  {
    return JsApiChooseImage.a.class;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void k(Parcel paramParcel)
  {
    boolean bool1 = true;
    AppMethodBeat.i(131127);
    this.appId = paramParcel.readString();
    this.count = paramParcel.readInt();
    if (paramParcel.readByte() != 0)
    {
      bool2 = true;
      this.hOS = bool2;
      if (paramParcel.readByte() == 0)
        break label90;
      bool2 = true;
      label46: this.hOT = bool2;
      if (paramParcel.readByte() == 0)
        break label95;
      bool2 = true;
      label60: this.hOU = bool2;
      if (paramParcel.readByte() == 0)
        break label100;
    }
    label90: label95: label100: for (boolean bool2 = bool1; ; bool2 = false)
    {
      this.hOV = bool2;
      AppMethodBeat.o(131127);
      return;
      bool2 = false;
      break;
      bool2 = false;
      break label46;
      bool2 = false;
      break label60;
    }
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = 1;
    AppMethodBeat.i(131128);
    paramParcel.writeString(this.appId);
    paramParcel.writeInt(this.count);
    int i;
    if (this.hOS)
    {
      i = 1;
      byte b = i;
      paramParcel.writeByte(b);
      if (!this.hOT)
        break label107;
      i = 1;
      b = i;
      label53: paramParcel.writeByte(b);
      if (!this.hOU)
        break label115;
      i = 1;
      b = i;
      label71: paramParcel.writeByte(b);
      if (!this.hOV)
        break label123;
    }
    label107: label115: label123: int k;
    for (int j = paramInt; ; k = paramInt)
    {
      paramParcel.writeByte(j);
      AppMethodBeat.o(131128);
      return;
      i = 0;
      j = i;
      break;
      i = 0;
      j = i;
      break label53;
      i = 0;
      j = i;
      break label71;
      paramInt = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseImage.ChooseRequest
 * JD-Core Version:    0.6.2
 */
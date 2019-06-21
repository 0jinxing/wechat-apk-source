package com.tencent.mm.plugin.appbrand.jsapi.media;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.ProcessRequest;

final class JsApiChooseMedia$ChooseRequest extends AppBrandProxyUIProcessTask.ProcessRequest
{
  public static final Parcelable.Creator<ChooseRequest> CREATOR;
  String appId;
  int count;
  boolean hOU;
  boolean hOV;
  boolean hPk;
  boolean hPl;
  boolean hPm;
  boolean hPn;
  boolean isFront;
  int maxDuration;

  static
  {
    AppMethodBeat.i(131162);
    CREATOR = new Parcelable.Creator()
    {
    };
    AppMethodBeat.o(131162);
  }

  JsApiChooseMedia$ChooseRequest()
  {
  }

  JsApiChooseMedia$ChooseRequest(Parcel paramParcel)
  {
    AppMethodBeat.i(131161);
    k(paramParcel);
    AppMethodBeat.o(131161);
  }

  public final boolean aBY()
  {
    return true;
  }

  public final String aBZ()
  {
    return "GalleryChooseMedia";
  }

  public final Class<? extends AppBrandProxyUIProcessTask> aCa()
  {
    return JsApiChooseMedia.a.class;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void k(Parcel paramParcel)
  {
    boolean bool1 = true;
    AppMethodBeat.i(131159);
    this.appId = paramParcel.readString();
    if (paramParcel.readByte() != 0)
    {
      bool2 = true;
      this.hPk = bool2;
      if (paramParcel.readByte() == 0)
        break label140;
      bool2 = true;
      label38: this.hPl = bool2;
      if (paramParcel.readByte() == 0)
        break label145;
      bool2 = true;
      label52: this.hPm = bool2;
      if (paramParcel.readByte() == 0)
        break label150;
      bool2 = true;
      label66: this.hPn = bool2;
      if (paramParcel.readByte() == 0)
        break label155;
      bool2 = true;
      label80: this.isFront = bool2;
      this.maxDuration = paramParcel.readInt();
      this.count = paramParcel.readInt();
      if (paramParcel.readByte() == 0)
        break label160;
      bool2 = true;
      label110: this.hOU = bool2;
      if (paramParcel.readByte() == 0)
        break label165;
    }
    label140: label145: label150: label155: label160: label165: for (boolean bool2 = bool1; ; bool2 = false)
    {
      this.hOV = bool2;
      AppMethodBeat.o(131159);
      return;
      bool2 = false;
      break;
      bool2 = false;
      break label38;
      bool2 = false;
      break label52;
      bool2 = false;
      break label66;
      bool2 = false;
      break label80;
      bool2 = false;
      break label110;
    }
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = 1;
    AppMethodBeat.i(131160);
    paramParcel.writeString(this.appId);
    int i;
    if (this.hPk)
    {
      i = 1;
      byte b = i;
      paramParcel.writeByte(b);
      if (!this.hPl)
        break label169;
      i = 1;
      b = i;
      label45: paramParcel.writeByte(b);
      if (!this.hPm)
        break label177;
      i = 1;
      b = i;
      label63: paramParcel.writeByte(b);
      if (!this.hPn)
        break label185;
      i = 1;
      b = i;
      label81: paramParcel.writeByte(b);
      if (!this.isFront)
        break label193;
      i = 1;
      b = i;
      label99: paramParcel.writeByte(b);
      paramParcel.writeInt(this.maxDuration);
      paramParcel.writeInt(this.count);
      if (!this.hOU)
        break label201;
      i = 1;
      b = i;
      label133: paramParcel.writeByte(b);
      if (!this.hOV)
        break label209;
    }
    label169: label177: label185: label193: label201: label209: int k;
    for (int j = paramInt; ; k = paramInt)
    {
      paramParcel.writeByte(j);
      AppMethodBeat.o(131160);
      return;
      i = 0;
      j = i;
      break;
      i = 0;
      j = i;
      break label45;
      i = 0;
      j = i;
      break label63;
      i = 0;
      j = i;
      break label81;
      i = 0;
      j = i;
      break label99;
      i = 0;
      j = i;
      break label133;
      paramInt = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia.ChooseRequest
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.appbrand.jsapi;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeParam
  implements Parcelable
{
  public static final Parcelable.Creator<IPCQRCodeRecognizeParam> CREATOR;
  private String hzq;
  private String hzr;

  static
  {
    AppMethodBeat.i(130601);
    CREATOR = new JsApiShowImageOperateSheet.BottomSheetLogicHelper.IPCQRCodeRecognizeParam.1();
    AppMethodBeat.o(130601);
  }

  protected JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeParam()
  {
  }

  protected JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeParam(Parcel paramParcel)
  {
    AppMethodBeat.i(130599);
    this.hzq = paramParcel.readString();
    this.hzr = paramParcel.readString();
    AppMethodBeat.o(130599);
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(130600);
    paramParcel.writeString(this.hzq);
    paramParcel.writeString(this.hzr);
    AppMethodBeat.o(130600);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet.BottomSheetLogicHelper.IPCQRCodeRecognizeParam
 * JD-Core Version:    0.6.2
 */
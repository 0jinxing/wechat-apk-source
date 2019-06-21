package com.tencent.mm.plugin.appbrand.jsapi;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult
  implements Parcelable
{
  public static final Parcelable.Creator<IPCQRCodeRecognizeResult> CREATOR;
  private int cvn;
  private int cvo;
  private String filePath;
  private String result;

  static
  {
    AppMethodBeat.i(130605);
    CREATOR = new JsApiShowImageOperateSheet.BottomSheetLogicHelper.IPCQRCodeRecognizeResult.1();
    AppMethodBeat.o(130605);
  }

  protected JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult()
  {
  }

  protected JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCQRCodeRecognizeResult(Parcel paramParcel)
  {
    AppMethodBeat.i(130603);
    this.result = paramParcel.readString();
    this.filePath = paramParcel.readString();
    this.cvn = paramParcel.readInt();
    this.cvo = paramParcel.readInt();
    AppMethodBeat.o(130603);
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(130604);
    paramParcel.writeString(this.result);
    paramParcel.writeString(this.filePath);
    paramParcel.writeInt(this.cvn);
    paramParcel.writeInt(this.cvo);
    AppMethodBeat.o(130604);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet.BottomSheetLogicHelper.IPCQRCodeRecognizeResult
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.appbrand.jsapi;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.ProcessRequest;

final class JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCProcessQRCodeResultRequest extends AppBrandProxyUIProcessTask.ProcessRequest
{
  public static final Parcelable.Creator<IPCProcessQRCodeResultRequest> CREATOR;
  private JsApiShowImageOperateSheet.BottomSheetLogicHelper.IPCQRCodeRecognizeResult hzh;
  private String hzi;
  private String hzj;

  static
  {
    AppMethodBeat.i(130589);
    CREATOR = new JsApiShowImageOperateSheet.BottomSheetLogicHelper.IPCProcessQRCodeResultRequest.1();
    AppMethodBeat.o(130589);
  }

  protected JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCProcessQRCodeResultRequest()
  {
  }

  protected JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCProcessQRCodeResultRequest(Parcel paramParcel)
  {
    AppMethodBeat.i(130587);
    this.hzh = ((JsApiShowImageOperateSheet.BottomSheetLogicHelper.IPCQRCodeRecognizeResult)paramParcel.readParcelable(IPCProcessQRCodeResultRequest.class.getClassLoader()));
    this.hzi = paramParcel.readString();
    this.hzj = paramParcel.readString();
    AppMethodBeat.o(130587);
  }

  public final boolean aBY()
  {
    return true;
  }

  public final Class<? extends AppBrandProxyUIProcessTask> aCa()
  {
    return JsApiShowImageOperateSheet.BottomSheetLogicHelper.b.class;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(130588);
    paramParcel.writeParcelable(this.hzh, paramInt);
    paramParcel.writeString(this.hzi);
    paramParcel.writeString(this.hzj);
    AppMethodBeat.o(130588);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet.BottomSheetLogicHelper.IPCProcessQRCodeResultRequest
 * JD-Core Version:    0.6.2
 */
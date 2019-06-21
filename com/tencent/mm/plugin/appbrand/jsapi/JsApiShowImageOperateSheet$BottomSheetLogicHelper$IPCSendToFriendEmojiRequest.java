package com.tencent.mm.plugin.appbrand.jsapi;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.ProcessRequest;

final class JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCSendToFriendEmojiRequest extends AppBrandProxyUIProcessTask.ProcessRequest
{
  public static final Parcelable.Creator<IPCSendToFriendEmojiRequest> CREATOR;
  private String hzs;

  static
  {
    AppMethodBeat.i(130609);
    CREATOR = new JsApiShowImageOperateSheet.BottomSheetLogicHelper.IPCSendToFriendEmojiRequest.1();
    AppMethodBeat.o(130609);
  }

  protected JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCSendToFriendEmojiRequest()
  {
  }

  protected JsApiShowImageOperateSheet$BottomSheetLogicHelper$IPCSendToFriendEmojiRequest(Parcel paramParcel)
  {
    AppMethodBeat.i(130607);
    this.hzs = paramParcel.readString();
    AppMethodBeat.o(130607);
  }

  public final Class<? extends AppBrandProxyUIProcessTask> aCa()
  {
    return JsApiShowImageOperateSheet.BottomSheetLogicHelper.d.class;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(130608);
    paramParcel.writeString(this.hzs);
    AppMethodBeat.o(130608);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet.BottomSheetLogicHelper.IPCSendToFriendEmojiRequest
 * JD-Core Version:    0.6.2
 */
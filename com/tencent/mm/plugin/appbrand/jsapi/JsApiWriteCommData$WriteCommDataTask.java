package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONObject;

class JsApiWriteCommData$WriteCommDataTask extends MainProcessTask
{
  public static final Parcelable.Creator<WriteCommDataTask> CREATOR;
  private int bOs;
  private m hxE;
  private boolean hxM;
  private String hxN;
  private c hzz;
  private String mData;
  private String mPackageName;

  static
  {
    AppMethodBeat.i(114339);
    CREATOR = new JsApiWriteCommData.WriteCommDataTask.1();
    AppMethodBeat.o(114339);
  }

  public JsApiWriteCommData$WriteCommDataTask(Parcel paramParcel)
  {
    AppMethodBeat.i(114334);
    g(paramParcel);
    AppMethodBeat.o(114334);
  }

  public JsApiWriteCommData$WriteCommDataTask(m paramm, c paramc, int paramInt, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(114333);
    this.hxE = paramm;
    this.hzz = paramc;
    this.bOs = paramInt;
    this.mPackageName = paramJSONObject.optString("packageName");
    this.mData = paramJSONObject.optString("data");
    this.hxM = true;
    AppMethodBeat.o(114333);
  }

  public final void asP()
  {
    boolean bool = false;
    AppMethodBeat.i(114335);
    if (bo.isNullOrNil(this.mPackageName))
      ab.e("MicroMsg.JsApiWriteCommData", "packageName nil");
    while (true)
    {
      aCb();
      AppMethodBeat.o(114335);
      return;
      if (!ah.getContext().getSharedPreferences(ah.getPackageName() + "_comm_preferences", 0).edit().putString(this.mPackageName, this.mData).commit())
        bool = true;
      this.hxM = bool;
    }
  }

  public final void asQ()
  {
    AppMethodBeat.i(114336);
    String str;
    if (this.hxM)
      if (bo.isNullOrNil(this.hxN))
      {
        str = "fail";
        this.hzz.M(this.bOs, this.hxE.j(str, null));
        AppMethodBeat.o(114336);
      }
    while (true)
    {
      return;
      str = String.format("fail:%s", new Object[] { this.hxN });
      break;
      this.hzz.M(this.bOs, this.hxE.j("ok", null));
      AppMethodBeat.o(114336);
    }
  }

  public final void g(Parcel paramParcel)
  {
    boolean bool = true;
    AppMethodBeat.i(114337);
    this.mPackageName = paramParcel.readString();
    this.mData = paramParcel.readString();
    if (paramParcel.readInt() == 1);
    while (true)
    {
      this.hxM = bool;
      this.hxN = paramParcel.readString();
      AppMethodBeat.o(114337);
      return;
      bool = false;
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(114338);
    paramParcel.writeString(this.mPackageName);
    paramParcel.writeString(this.mData);
    if (this.hxM);
    for (paramInt = 1; ; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      paramParcel.writeString(this.hxN);
      AppMethodBeat.o(114338);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.JsApiWriteCommData.WriteCommDataTask
 * JD-Core Version:    0.6.2
 */
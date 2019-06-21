package com.tencent.mm.plugin.appbrand.jsapi.audio;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelvoice.u;
import com.tencent.mm.plugin.appbrand.appstorage.p;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.plugin.appbrand.s.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

class JsApiStartRecordVoice$StartRecordVoice extends MainProcessTask
{
  public static final Parcelable.Creator<StartRecordVoice> CREATOR;
  private String appId;
  private int duration;
  private String filePath;
  private JsApiStartRecordVoice hBl;
  private boolean hBm;
  private q hwf;
  private int hwi;
  private int result;

  static
  {
    AppMethodBeat.i(130799);
    CREATOR = new JsApiStartRecordVoice.StartRecordVoice.2();
    AppMethodBeat.o(130799);
  }

  JsApiStartRecordVoice$StartRecordVoice(Parcel paramParcel)
  {
    AppMethodBeat.i(130792);
    this.hBm = false;
    g(paramParcel);
    AppMethodBeat.o(130792);
  }

  JsApiStartRecordVoice$StartRecordVoice(JsApiStartRecordVoice paramJsApiStartRecordVoice, q paramq, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(130791);
    this.hBm = false;
    this.hBl = paramJsApiStartRecordVoice;
    this.hwf = paramq;
    this.duration = paramInt1;
    this.hwi = paramInt2;
    this.appId = paramq.getAppId();
    String str = u.uY(this.appId);
    paramJsApiStartRecordVoice = new com.tencent.mm.plugin.appbrand.r.j();
    if (paramq.asE().a(paramJsApiStartRecordVoice) == com.tencent.mm.plugin.appbrand.appstorage.j.gXA)
    {
      this.filePath = new File((String)paramJsApiStartRecordVoice.value, str).getAbsolutePath();
      AppMethodBeat.o(130791);
    }
    while (true)
    {
      return;
      this.filePath = new File(paramq.getContext().getCacheDir(), str).getAbsolutePath();
      AppMethodBeat.o(130791);
    }
  }

  public final void asP()
  {
    AppMethodBeat.i(130793);
    e.aNS().aa(new JsApiStartRecordVoice.StartRecordVoice.1(this));
    AppMethodBeat.o(130793);
  }

  public final void asQ()
  {
    AppMethodBeat.i(130794);
    if (this.result == -1)
    {
      ab.e("MicroMsg.JsApiStartRecordVoice", "fail:record_error");
      this.hwf.M(this.hwi, this.hBl.j("fail:record_error", null));
      AppMethodBeat.o(130794);
      return;
    }
    HashMap localHashMap;
    if (this.hBm)
    {
      localHashMap = new HashMap(1);
      com.tencent.mm.plugin.appbrand.r.j localj = new com.tencent.mm.plugin.appbrand.r.j();
      if (this.hwf.asE().a(new File(this.filePath), "silk", true, localj) == com.tencent.mm.plugin.appbrand.appstorage.j.gXA)
      {
        localHashMap.put("tempFilePath", localj.value);
        this.hwf.M(this.hwi, this.hBl.j("ok", localHashMap));
      }
    }
    while (true)
    {
      ab.i("MicroMsg.JsApiStartRecordVoice", "runInClientProcess, appId = %s, startRecordOk = %b", new Object[] { this.appId, Boolean.valueOf(this.hBm) });
      JsApiStartRecordVoice.a(this.hBl, false);
      AppMethodBeat.o(130794);
      break;
      ab.e("MicroMsg.JsApiStartRecordVoice", "AppBrandLocalMediaObject obj is null");
      localHashMap.put("tempFilePath", "");
      this.hwf.M(this.hwi, this.hBl.j("fail", null));
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public final void g(Parcel paramParcel)
  {
    AppMethodBeat.i(130795);
    this.hwi = paramParcel.readInt();
    this.appId = paramParcel.readString();
    this.filePath = paramParcel.readString();
    if (paramParcel.readByte() != 0);
    for (boolean bool = true; ; bool = false)
    {
      this.hBm = bool;
      this.duration = paramParcel.readInt();
      this.result = paramParcel.readInt();
      AppMethodBeat.o(130795);
      return;
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(130796);
    paramParcel.writeInt(this.hwi);
    paramParcel.writeString(this.appId);
    paramParcel.writeString(this.filePath);
    if (this.hBm)
      paramInt = 1;
    int j;
    for (int i = paramInt; ; j = paramInt)
    {
      paramParcel.writeByte(i);
      paramParcel.writeInt(this.duration);
      paramParcel.writeInt(this.result);
      AppMethodBeat.o(130796);
      return;
      paramInt = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStartRecordVoice.StartRecordVoice
 * JD-Core Version:    0.6.2
 */
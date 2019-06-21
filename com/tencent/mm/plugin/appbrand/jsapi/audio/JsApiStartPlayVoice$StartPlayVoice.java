package com.tencent.mm.plugin.appbrand.jsapi.audio;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.h.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.compat.a.b;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.sdk.platformtools.al;
import java.util.HashMap;
import java.util.Map;

class JsApiStartPlayVoice$StartPlayVoice extends MainProcessTask
{
  public static final Parcelable.Creator<StartPlayVoice> CREATOR;
  public String czD;
  public boolean error;
  public String filePath;
  private q hwf;
  private int hwi;
  private m hwz;

  static
  {
    AppMethodBeat.i(130782);
    CREATOR = new JsApiStartPlayVoice.StartPlayVoice.2();
    AppMethodBeat.o(130782);
  }

  public JsApiStartPlayVoice$StartPlayVoice(Parcel paramParcel)
  {
    AppMethodBeat.i(130775);
    this.error = false;
    g(paramParcel);
    AppMethodBeat.o(130775);
  }

  public JsApiStartPlayVoice$StartPlayVoice(m paramm, q paramq, int paramInt)
  {
    this.error = false;
    this.hwz = paramm;
    this.hwf = paramq;
    this.hwi = paramInt;
  }

  public final void asP()
  {
    AppMethodBeat.i(130776);
    al.d(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(130773);
        ((b)g.K(b.class)).a(JsApiStartPlayVoice.StartPlayVoice.this.filePath, new JsApiStartPlayVoice.StartPlayVoice.1.1(this), new h.b()
        {
          public final void onError()
          {
            AppMethodBeat.i(130772);
            JsApiStartPlayVoice.StartPlayVoice.this.error = true;
            JsApiStartPlayVoice.StartPlayVoice.c(JsApiStartPlayVoice.StartPlayVoice.this);
            AppMethodBeat.o(130772);
          }
        });
        AppMethodBeat.o(130773);
      }
    });
    AppMethodBeat.o(130776);
  }

  public final void asQ()
  {
    AppMethodBeat.i(130777);
    HashMap localHashMap = new HashMap();
    localHashMap.put("localId", this.czD);
    q localq = this.hwf;
    int i = this.hwi;
    m localm = this.hwz;
    if (this.error);
    for (String str = "fail"; ; str = "ok")
    {
      localq.M(i, localm.j(str, localHashMap));
      JsApiStartPlayVoice.hBd = null;
      AppMethodBeat.o(130777);
      return;
    }
  }

  public final void g(Parcel paramParcel)
  {
    AppMethodBeat.i(130778);
    this.czD = paramParcel.readString();
    this.filePath = paramParcel.readString();
    if (paramParcel.readByte() != 0);
    for (boolean bool = true; ; bool = false)
    {
      this.error = bool;
      AppMethodBeat.o(130778);
      return;
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(130779);
    paramParcel.writeString(this.czD);
    paramParcel.writeString(this.filePath);
    if (this.error)
      paramInt = 1;
    int j;
    for (int i = paramInt; ; j = paramInt)
    {
      paramParcel.writeByte(i);
      AppMethodBeat.o(130779);
      return;
      paramInt = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStartPlayVoice.StartPlayVoice
 * JD-Core Version:    0.6.2
 */
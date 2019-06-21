package com.tencent.mm.plugin.appbrand.jsapi.appdownload;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.plugin.downloader.f.a;
import com.tencent.mm.plugin.downloader.model.c;
import com.tencent.mm.plugin.downloader.model.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONObject;

class JsApiPauseDownloadTask$PauseDownloadTask extends MainProcessTask
{
  public static final Parcelable.Creator<PauseDownloadTask> CREATOR;
  private int bOs;
  private q gNC;
  private m hxE;
  private boolean hxM;
  private String hxN;
  private long hxO;

  static
  {
    AppMethodBeat.i(130697);
    CREATOR = new JsApiPauseDownloadTask.PauseDownloadTask.1();
    AppMethodBeat.o(130697);
  }

  public JsApiPauseDownloadTask$PauseDownloadTask(Parcel paramParcel)
  {
    AppMethodBeat.i(130692);
    g(paramParcel);
    AppMethodBeat.o(130692);
  }

  public JsApiPauseDownloadTask$PauseDownloadTask(m paramm, q paramq, int paramInt, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(130691);
    this.hxE = paramm;
    this.gNC = paramq;
    this.bOs = paramInt;
    this.hxO = paramJSONObject.optLong("downloadId");
    this.hxM = true;
    AppMethodBeat.o(130691);
  }

  public final void asP()
  {
    boolean bool = true;
    AppMethodBeat.i(130693);
    ab.i("MicroMsg.JsApiPauseDownloadTask", "doPauseDownloadTask, downloadId = %d", new Object[] { Long.valueOf(this.hxO) });
    if (this.hxO <= 0L);
    a locala;
    for (this.hxN = "downloadId invalid"; ; this.hxN = "downloadId invalid")
    {
      aCb();
      AppMethodBeat.o(130693);
      return;
      locala = c.hv(this.hxO);
      if (locala != null)
        break;
    }
    if (locala.field_downloadInWifi)
    {
      locala.field_downloadInWifi = false;
      c.e(locala);
    }
    if (!d.bij().hn(this.hxO));
    while (true)
    {
      this.hxM = bool;
      break;
      bool = false;
    }
  }

  public final void asQ()
  {
    AppMethodBeat.i(130694);
    String str;
    if (this.hxM)
      if (bo.isNullOrNil(this.hxN))
      {
        str = "fail";
        this.gNC.M(this.bOs, this.hxE.j(str, null));
        AppMethodBeat.o(130694);
      }
    while (true)
    {
      return;
      str = String.format("fail:%s", new Object[] { this.hxN });
      break;
      this.gNC.M(this.bOs, this.hxE.j("ok", null));
      AppMethodBeat.o(130694);
    }
  }

  public final void g(Parcel paramParcel)
  {
    boolean bool = true;
    AppMethodBeat.i(130695);
    this.hxO = paramParcel.readLong();
    if (paramParcel.readInt() == 1);
    while (true)
    {
      this.hxM = bool;
      this.hxN = paramParcel.readString();
      AppMethodBeat.o(130695);
      return;
      bool = false;
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(130696);
    paramParcel.writeLong(this.hxO);
    if (this.hxM);
    for (paramInt = 1; ; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      paramParcel.writeString(this.hxN);
      AppMethodBeat.o(130696);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiPauseDownloadTask.PauseDownloadTask
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.appbrand.jsapi;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.plugin.downloader.f.a;
import com.tencent.mm.plugin.downloader.model.c;
import com.tencent.mm.plugin.downloader.model.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONObject;

class JsApiResumeDownloadTask$ResumeDownloadTask extends MainProcessTask
{
  public static final Parcelable.Creator<ResumeDownloadTask> CREATOR;
  private int bOs;
  private q gNC;
  private m hxE;
  private boolean hxM;
  private String hxN;
  private long hxO;
  private boolean hyG;

  static
  {
    AppMethodBeat.i(73179);
    CREATOR = new JsApiResumeDownloadTask.ResumeDownloadTask.1();
    AppMethodBeat.o(73179);
  }

  public JsApiResumeDownloadTask$ResumeDownloadTask(Parcel paramParcel)
  {
    AppMethodBeat.i(73174);
    g(paramParcel);
    AppMethodBeat.o(73174);
  }

  public JsApiResumeDownloadTask$ResumeDownloadTask(m paramm, q paramq, int paramInt, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(73173);
    this.hxE = paramm;
    this.gNC = paramq;
    this.bOs = paramInt;
    this.hxO = paramJSONObject.optLong("downloadId");
    this.hyG = paramJSONObject.optBoolean("downloadInWifi", false);
    this.hxM = true;
    AppMethodBeat.o(73173);
  }

  public final void asP()
  {
    boolean bool = true;
    AppMethodBeat.i(73175);
    ab.i("MicroMsg.JsApiResumeDownloadTask", "doQueryDownloadTask, downloadId = %d", new Object[] { Long.valueOf(this.hxO) });
    if (this.hxO <= 0L)
    {
      this.hxN = "downloadId invalid";
      aCb();
      AppMethodBeat.o(73175);
      return;
    }
    a locala = c.hv(this.hxO);
    if ((locala != null) && (locala.field_downloadInWifi != this.hyG))
    {
      locala.field_downloadInWifi = this.hyG;
      c.e(locala);
    }
    if (!d.bij().ho(this.hxO));
    while (true)
    {
      this.hxM = bool;
      break;
      bool = false;
    }
  }

  public final void asQ()
  {
    AppMethodBeat.i(73176);
    String str;
    if (this.hxM)
      if (bo.isNullOrNil(this.hxN))
      {
        str = "fail";
        this.gNC.M(this.bOs, this.hxE.j(str, null));
        AppMethodBeat.o(73176);
      }
    while (true)
    {
      return;
      str = String.format("fail:%s", new Object[] { this.hxN });
      break;
      this.gNC.M(this.bOs, this.hxE.j("ok", null));
      AppMethodBeat.o(73176);
    }
  }

  public final void g(Parcel paramParcel)
  {
    boolean bool1 = true;
    AppMethodBeat.i(73177);
    this.hxO = paramParcel.readLong();
    if (paramParcel.readByte() == 1)
    {
      bool2 = true;
      this.hyG = bool2;
      if (paramParcel.readInt() != 1)
        break label64;
    }
    label64: for (boolean bool2 = bool1; ; bool2 = false)
    {
      this.hxM = bool2;
      this.hxN = paramParcel.readString();
      AppMethodBeat.o(73177);
      return;
      bool2 = false;
      break;
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = 1;
    AppMethodBeat.i(73178);
    paramParcel.writeLong(this.hxO);
    byte b1;
    byte b2;
    if (this.hyG)
    {
      b1 = 1;
      b2 = b1;
      paramParcel.writeByte(b2);
      if (!this.hxM)
        break label67;
    }
    while (true)
    {
      paramParcel.writeInt(paramInt);
      paramParcel.writeString(this.hxN);
      AppMethodBeat.o(73178);
      return;
      b1 = 0;
      b2 = b1;
      break;
      label67: paramInt = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.JsApiResumeDownloadTask.ResumeDownloadTask
 * JD-Core Version:    0.6.2
 */
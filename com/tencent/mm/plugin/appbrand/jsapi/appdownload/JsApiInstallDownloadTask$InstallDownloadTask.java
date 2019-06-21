package com.tencent.mm.plugin.appbrand.jsapi.appdownload;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONObject;

class JsApiInstallDownloadTask$InstallDownloadTask extends MainProcessTask
{
  public static final Parcelable.Creator<InstallDownloadTask> CREATOR;
  private int bOs;
  private m hxE;
  private boolean hxM;
  private String hxN;
  private long hxO;
  private com.tencent.mm.plugin.appbrand.jsapi.c hzz;
  private String mAppId;

  static
  {
    AppMethodBeat.i(130688);
    CREATOR = new JsApiInstallDownloadTask.InstallDownloadTask.3();
    AppMethodBeat.o(130688);
  }

  public JsApiInstallDownloadTask$InstallDownloadTask(Parcel paramParcel)
  {
    AppMethodBeat.i(130683);
    g(paramParcel);
    AppMethodBeat.o(130683);
  }

  public JsApiInstallDownloadTask$InstallDownloadTask(m paramm, com.tencent.mm.plugin.appbrand.jsapi.c paramc, int paramInt, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(130682);
    this.hxE = paramm;
    this.hzz = paramc;
    this.bOs = paramInt;
    this.hxO = paramJSONObject.optLong("downloadId");
    this.mAppId = paramJSONObject.optString("appId");
    this.hxM = true;
    AppMethodBeat.o(130682);
  }

  public final void asP()
  {
    AppMethodBeat.i(130684);
    ab.i("MicroMsg.JsApiInstallDownloadTask", "doInstallDownloadTask, downloadId = %d", new Object[] { Long.valueOf(this.hxO) });
    com.tencent.mm.plugin.downloader.f.a locala;
    if (!bo.isNullOrNil(this.mAppId))
    {
      locala = com.tencent.mm.plugin.downloader.model.c.In(this.mAppId);
      if ((locala != null) && (locala.field_status == 3) && (e.ct(locala.field_filePath)))
        com.tencent.mm.plugin.downloader.h.a.a(locala.field_downloadId, false, new com.tencent.mm.pluginsdk.permission.a()
        {
          public final void dT(boolean paramAnonymousBoolean)
          {
            AppMethodBeat.i(130679);
            JsApiInstallDownloadTask.InstallDownloadTask localInstallDownloadTask = JsApiInstallDownloadTask.InstallDownloadTask.this;
            if (!paramAnonymousBoolean);
            for (paramAnonymousBoolean = true; ; paramAnonymousBoolean = false)
            {
              JsApiInstallDownloadTask.InstallDownloadTask.a(localInstallDownloadTask, paramAnonymousBoolean);
              AppMethodBeat.o(130679);
              return;
            }
          }
        });
    }
    while (true)
    {
      aCb();
      AppMethodBeat.o(130684);
      return;
      locala = com.tencent.mm.plugin.downloader.model.c.hv(this.hxO);
      if ((locala != null) && (locala.field_status == 3) && (e.ct(locala.field_filePath)))
        com.tencent.mm.plugin.downloader.h.a.a(locala.field_downloadId, false, new JsApiInstallDownloadTask.InstallDownloadTask.2(this));
    }
  }

  public final void asQ()
  {
    AppMethodBeat.i(130685);
    String str;
    if (this.hxM)
      if (bo.isNullOrNil(this.hxN))
      {
        str = "fail";
        this.hzz.M(this.bOs, this.hxE.j(str, null));
        AppMethodBeat.o(130685);
      }
    while (true)
    {
      return;
      str = String.format("fail:%s", new Object[] { this.hxN });
      break;
      this.hzz.M(this.bOs, this.hxE.j("ok", null));
      AppMethodBeat.o(130685);
    }
  }

  public final void g(Parcel paramParcel)
  {
    boolean bool = true;
    AppMethodBeat.i(130686);
    this.hxO = paramParcel.readLong();
    this.mAppId = paramParcel.readString();
    if (paramParcel.readInt() == 1);
    while (true)
    {
      this.hxM = bool;
      this.hxN = paramParcel.readString();
      AppMethodBeat.o(130686);
      return;
      bool = false;
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(130687);
    paramParcel.writeLong(this.hxO);
    paramParcel.writeString(this.mAppId);
    if (this.hxM);
    for (paramInt = 1; ; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      paramParcel.writeString(this.hxN);
      AppMethodBeat.o(130687);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiInstallDownloadTask.InstallDownloadTask
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.appbrand.jsapi.appdownload;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.plugin.downloader.model.c;
import com.tencent.mm.plugin.downloader.model.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vfs.e;
import org.json.JSONArray;
import org.json.JSONException;

class JsApiCancelDownloadTask$CancelDownloadTask extends MainProcessTask
{
  public static Parcelable.Creator<CancelDownloadTask> CREATOR;
  private q hwf;
  private int hwi;
  private JSONArray hzI;
  private com.tencent.mm.plugin.appbrand.jsapi.a hzJ;

  static
  {
    AppMethodBeat.i(130676);
    CREATOR = new JsApiCancelDownloadTask.CancelDownloadTask.1();
    AppMethodBeat.o(130676);
  }

  private JsApiCancelDownloadTask$CancelDownloadTask(Parcel paramParcel)
  {
    AppMethodBeat.i(130673);
    g(paramParcel);
    AppMethodBeat.o(130673);
  }

  public JsApiCancelDownloadTask$CancelDownloadTask(JSONArray paramJSONArray, com.tencent.mm.plugin.appbrand.jsapi.a parama, q paramq, int paramInt)
  {
    AppMethodBeat.i(130672);
    aBV();
    this.hzI = paramJSONArray;
    this.hzJ = parama;
    this.hwf = paramq;
    this.hwi = paramInt;
    AppMethodBeat.o(130672);
  }

  public final void asP()
  {
    AppMethodBeat.i(130670);
    if ((this.hzI != null) && (this.hzI.length() > 0))
    {
      int i = 0;
      if (i < this.hzI.length())
      {
        long l = this.hzI.optLong(i);
        com.tencent.mm.plugin.downloader.f.a locala = c.hv(l);
        if ((locala != null) && (locala.field_status == 3))
        {
          ab.i("MicroMsg.JsApiCancelDownloadTask", "canceldownloadtask, path: %s", new Object[] { locala.field_filePath });
          e.deleteFile(locala.field_filePath);
          c.Io(locala.field_downloadUrl);
        }
        while (true)
        {
          i++;
          break;
          d.bij().hl(l);
        }
      }
    }
    aCb();
    AppMethodBeat.o(130670);
  }

  public final void asQ()
  {
    AppMethodBeat.i(130671);
    aBW();
    this.hwf.M(this.hwi, this.hzJ.j("ok", null));
    AppMethodBeat.o(130671);
  }

  public final void g(Parcel paramParcel)
  {
    AppMethodBeat.i(130674);
    paramParcel = paramParcel.readString();
    if (paramParcel != null);
    while (true)
    {
      try
      {
        JSONArray localJSONArray = new org/json/JSONArray;
        localJSONArray.<init>(paramParcel);
        this.hzI = localJSONArray;
        AppMethodBeat.o(130674);
        return;
      }
      catch (JSONException paramParcel)
      {
        ab.e("MicroMsg.JsApiCancelDownloadTask", "parseFromParcel: " + paramParcel.getMessage());
      }
      AppMethodBeat.o(130674);
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(130675);
    if (this.hzI != null);
    for (String str = this.hzI.toString(); ; str = null)
    {
      paramParcel.writeString(str);
      AppMethodBeat.o(130675);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiCancelDownloadTask.CancelDownloadTask
 * JD-Core Version:    0.6.2
 */
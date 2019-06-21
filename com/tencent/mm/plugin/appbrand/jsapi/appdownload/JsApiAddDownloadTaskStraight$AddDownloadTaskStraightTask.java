package com.tencent.mm.plugin.appbrand.jsapi.appdownload;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.plugin.downloader.model.d;
import com.tencent.mm.plugin.downloader.model.e.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

class JsApiAddDownloadTaskStraight$AddDownloadTaskStraightTask extends MainProcessTask
{
  public static final Parcelable.Creator<AddDownloadTaskStraightTask> CREATOR;
  private int bOs;
  private q gNC;
  private m hxE;
  private String hxF;
  private String hxG;
  private String hxH;
  private String hxI;
  private long hxJ;
  private String hxK;
  private String hxL;
  private boolean hxM;
  private String hxN;
  private long hxO;
  private String mAppId;
  private String mPackageName;

  static
  {
    AppMethodBeat.i(130667);
    CREATOR = new JsApiAddDownloadTaskStraight.AddDownloadTaskStraightTask.1();
    AppMethodBeat.o(130667);
  }

  public JsApiAddDownloadTaskStraight$AddDownloadTaskStraightTask(Parcel paramParcel)
  {
    AppMethodBeat.i(130662);
    g(paramParcel);
    AppMethodBeat.o(130662);
  }

  public JsApiAddDownloadTaskStraight$AddDownloadTaskStraightTask(m paramm, q paramq, int paramInt, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(130661);
    this.hxE = paramm;
    this.gNC = paramq;
    this.bOs = paramInt;
    this.hxF = paramJSONObject.optString("taskName");
    this.hxG = paramJSONObject.optString("taskUrl");
    this.hxH = paramJSONObject.optString("fileMd5");
    this.hxI = paramJSONObject.optString("alternativeUrl");
    this.hxJ = paramJSONObject.optInt("taskSize", 0);
    this.hxK = paramJSONObject.optString("extInfo");
    this.hxL = paramJSONObject.optString("fileType");
    this.mAppId = paramq.getAppId();
    this.mPackageName = paramJSONObject.optString("packageName");
    this.hxM = true;
    AppMethodBeat.o(130661);
  }

  public final void asP()
  {
    AppMethodBeat.i(130663);
    g.RQ();
    if (!g.RP().isSDCardAvailable())
      this.hxN = "fail_sdcard_not_ready";
    while (true)
    {
      aCb();
      AppMethodBeat.o(130663);
      return;
      if ((this.hxJ > 0L) && (!f.eW(this.hxJ)))
      {
        this.hxN = "fail_sdcard_has_not_enough_space";
      }
      else if (bo.isNullOrNil(this.hxG))
      {
        this.hxN = "fail_invalid_url";
      }
      else
      {
        ab.i("MicroMsg.JsApiAddDownloadTaskStraight", "runInMainProcess taskUrl:%s md5:%s", new Object[] { this.hxG, this.hxH });
        Object localObject = new e.a();
        ((e.a)localObject).It(this.hxG);
        ((e.a)localObject).Iu(this.hxI);
        ((e.a)localObject).hA(this.hxJ);
        ((e.a)localObject).Iv(this.hxF);
        ((e.a)localObject).Iw(this.hxH);
        ((e.a)localObject).setAppId(this.mAppId);
        ((e.a)localObject).cY(this.mPackageName);
        ((e.a)localObject).ga(true);
        ((e.a)localObject).tN(bo.getInt(this.hxL, 1));
        ((e.a)localObject).setScene(6001);
        ((e.a)localObject).Ix(this.hxK);
        localObject = ((e.a)localObject).kNl;
        long l = d.bij().a((com.tencent.mm.plugin.downloader.model.e)localObject);
        ab.i("MicroMsg.JsApiAddDownloadTaskStraight", "doAddDownloadTaskStraight, downloadId = ".concat(String.valueOf(l)));
        if (l <= 0L)
        {
          ab.e("MicroMsg.JsApiAddDownloadTaskStraight", "doAddDownloadTaskStraight fail, downloadId = ".concat(String.valueOf(l)));
          this.hxN = "";
        }
        else
        {
          this.hxM = false;
          this.hxO = l;
        }
      }
    }
  }

  public final void asQ()
  {
    AppMethodBeat.i(130664);
    Object localObject;
    if (this.hxM)
      if (bo.isNullOrNil(this.hxN))
      {
        localObject = "fail";
        this.gNC.M(this.bOs, this.hxE.j((String)localObject, null));
        AppMethodBeat.o(130664);
      }
    while (true)
    {
      return;
      localObject = String.format("fail:%s", new Object[] { this.hxN });
      break;
      localObject = new HashMap();
      ((Map)localObject).put("downloadId", Long.valueOf(this.hxO));
      this.gNC.M(this.bOs, this.hxE.j("ok", (Map)localObject));
      AppMethodBeat.o(130664);
    }
  }

  public final void g(Parcel paramParcel)
  {
    boolean bool = true;
    AppMethodBeat.i(130665);
    this.hxF = paramParcel.readString();
    this.hxG = paramParcel.readString();
    this.hxH = paramParcel.readString();
    this.hxI = paramParcel.readString();
    this.hxJ = paramParcel.readLong();
    this.hxK = paramParcel.readString();
    this.hxL = paramParcel.readString();
    this.mAppId = paramParcel.readString();
    this.mPackageName = paramParcel.readString();
    if (paramParcel.readInt() == 1);
    while (true)
    {
      this.hxM = bool;
      this.hxN = paramParcel.readString();
      this.hxO = paramParcel.readLong();
      AppMethodBeat.o(130665);
      return;
      bool = false;
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(130666);
    paramParcel.writeString(this.hxF);
    paramParcel.writeString(this.hxG);
    paramParcel.writeString(this.hxH);
    paramParcel.writeString(this.hxI);
    paramParcel.writeLong(this.hxJ);
    paramParcel.writeString(this.hxK);
    paramParcel.writeString(this.hxL);
    paramParcel.writeString(this.mAppId);
    paramParcel.writeString(this.mPackageName);
    if (this.hxM);
    for (paramInt = 1; ; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      paramParcel.writeString(this.hxN);
      paramParcel.writeLong(this.hxO);
      AppMethodBeat.o(130666);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiAddDownloadTaskStraight.AddDownloadTaskStraightTask
 * JD-Core Version:    0.6.2
 */
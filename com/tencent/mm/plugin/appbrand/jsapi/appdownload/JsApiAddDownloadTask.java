package com.tencent.mm.plugin.appbrand.jsapi.appdownload;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.game.report.api.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.plugin.downloader.model.d;
import com.tencent.mm.plugin.downloader.model.e.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class JsApiAddDownloadTask extends a<q>
{
  public static final int CTRL_INDEX = 474;
  public static final String NAME = "addDownloadTask";

  static class AddDownloadTask extends MainProcessTask
  {
    public static final Parcelable.Creator<AddDownloadTask> CREATOR;
    private int bOs;
    private q gNC;
    private m hxE;
    private String hxF;
    private String hxG;
    private String hxH;
    private long hxJ;
    private String hxK;
    private String hxL;
    private boolean hxM;
    private String hxN;
    private long hxO;
    private boolean hyG;
    private boolean hzG;
    private int hzH;
    private String mAppId;
    private String mPackageName;

    static
    {
      AppMethodBeat.i(130658);
      CREATOR = new JsApiAddDownloadTask.AddDownloadTask.1();
      AppMethodBeat.o(130658);
    }

    public AddDownloadTask(Parcel paramParcel)
    {
      AppMethodBeat.i(130653);
      g(paramParcel);
      AppMethodBeat.o(130653);
    }

    public AddDownloadTask(m paramm, q paramq, int paramInt, JSONObject paramJSONObject)
    {
      AppMethodBeat.i(130652);
      aBV();
      this.hxE = paramm;
      this.gNC = paramq;
      this.bOs = paramInt;
      this.hxF = paramJSONObject.optString("taskName");
      this.hxG = paramJSONObject.optString("taskUrl");
      this.hxH = paramJSONObject.optString("fileMd5");
      this.hxJ = paramJSONObject.optInt("taskSize", 0);
      this.hxK = paramJSONObject.optString("extInfo");
      this.hxL = paramJSONObject.optString("fileType");
      this.mAppId = paramJSONObject.optString("appId");
      this.mPackageName = paramJSONObject.optString("packageName");
      this.hyG = paramJSONObject.optBoolean("downloadInWifi", false);
      this.hzG = paramJSONObject.optBoolean("showNotification", false);
      this.hzH = paramJSONObject.optInt("downloaderType", 0);
      this.hxM = true;
      AppMethodBeat.o(130652);
    }

    public final void asP()
    {
      AppMethodBeat.i(130654);
      g.RQ();
      if (!g.RP().isSDCardAvailable())
        this.hxN = "fail_sdcard_not_ready";
      while (true)
      {
        aCb();
        AppMethodBeat.o(130654);
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
          ab.i("MicroMsg.JsApiAddDownloadTask", "runInMainProcess taskUrl:%s md5:%s", new Object[] { this.hxG, this.hxH });
          Object localObject = new e.a();
          ((e.a)localObject).It(this.hxG);
          ((e.a)localObject).hA(this.hxJ);
          ((e.a)localObject).Iv(this.hxF);
          ((e.a)localObject).Iw(this.hxH);
          ((e.a)localObject).setAppId(this.mAppId);
          ((e.a)localObject).cY(this.mPackageName);
          ((e.a)localObject).ga(true);
          ((e.a)localObject).tN(bo.getInt(this.hxL, 1));
          ((e.a)localObject).setScene(6001);
          ((e.a)localObject).Ix(this.hxK);
          ((e.a)localObject).gb(this.hzG);
          ((e.a)localObject).gc(this.hyG);
          ((e.a)localObject).ga(false);
          ((e.a)localObject).kNl.kNh = true;
          localObject = ((e.a)localObject).kNl;
          if (this.hzH == 1);
          for (long l = d.bij().b((com.tencent.mm.plugin.downloader.model.e)localObject); ; l = d.bij().a((com.tencent.mm.plugin.downloader.model.e)localObject))
          {
            ab.i("MicroMsg.JsApiAddDownloadTask", "doAddDownloadTaskStraight, downloadId = ".concat(String.valueOf(l)));
            if (l > 0L)
              break label301;
            ab.e("MicroMsg.JsApiAddDownloadTask", "doAddDownloadTaskStraight fail, downloadId = ".concat(String.valueOf(l)));
            this.hxN = "";
            break;
          }
          label301: this.hxM = false;
          this.hxO = l;
          if (this.hyG)
            b.eBF.a(this.mAppId, 6001, 11, l, "", this.hxK);
        }
      }
    }

    public final void asQ()
    {
      AppMethodBeat.i(130655);
      aBW();
      Object localObject;
      if (this.hxM)
        if (bo.isNullOrNil(this.hxN))
        {
          localObject = "fail";
          this.gNC.M(this.bOs, this.hxE.j((String)localObject, null));
          AppMethodBeat.o(130655);
        }
      while (true)
      {
        return;
        localObject = String.format("fail:%s", new Object[] { this.hxN });
        break;
        localObject = new HashMap();
        ((Map)localObject).put("downloadId", Long.valueOf(this.hxO));
        this.gNC.M(this.bOs, this.hxE.j("ok", (Map)localObject));
        AppMethodBeat.o(130655);
      }
    }

    public final void g(Parcel paramParcel)
    {
      boolean bool1 = true;
      AppMethodBeat.i(130656);
      this.hxF = paramParcel.readString();
      this.hxG = paramParcel.readString();
      this.hxH = paramParcel.readString();
      this.hxJ = paramParcel.readLong();
      this.hxK = paramParcel.readString();
      this.hxL = paramParcel.readString();
      this.mAppId = paramParcel.readString();
      this.mPackageName = paramParcel.readString();
      if (paramParcel.readByte() == 1)
      {
        bool2 = true;
        this.hyG = bool2;
        if (paramParcel.readByte() != 1)
          break label153;
        bool2 = true;
        label97: this.hzG = bool2;
        this.hzH = paramParcel.readInt();
        if (paramParcel.readInt() != 1)
          break label158;
      }
      label153: label158: for (boolean bool2 = bool1; ; bool2 = false)
      {
        this.hxM = bool2;
        this.hxN = paramParcel.readString();
        this.hxO = paramParcel.readLong();
        AppMethodBeat.o(130656);
        return;
        bool2 = false;
        break;
        bool2 = false;
        break label97;
      }
    }

    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramInt = 1;
      AppMethodBeat.i(130657);
      paramParcel.writeString(this.hxF);
      paramParcel.writeString(this.hxG);
      paramParcel.writeString(this.hxH);
      paramParcel.writeLong(this.hxJ);
      paramParcel.writeString(this.hxK);
      paramParcel.writeString(this.hxL);
      paramParcel.writeString(this.mAppId);
      paramParcel.writeString(this.mPackageName);
      byte b1;
      byte b2;
      if (this.hyG)
      {
        b1 = 1;
        b2 = b1;
        paramParcel.writeByte(b2);
        if (!this.hzG)
          break label159;
        b1 = 1;
        b2 = b1;
        label102: paramParcel.writeByte(b2);
        paramParcel.writeInt(this.hzH);
        if (!this.hxM)
          break label167;
      }
      while (true)
      {
        paramParcel.writeInt(paramInt);
        paramParcel.writeString(this.hxN);
        paramParcel.writeLong(this.hxO);
        AppMethodBeat.o(130657);
        return;
        b1 = 0;
        b2 = b1;
        break;
        label159: b1 = 0;
        b2 = b1;
        break label102;
        label167: paramInt = 0;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiAddDownloadTask
 * JD-Core Version:    0.6.2
 */
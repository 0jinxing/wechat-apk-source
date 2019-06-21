package com.tencent.mm.plugin.appbrand.jsapi.media;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.i.g;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager;
import com.tencent.mm.plugin.appbrand.c.a.a;
import com.tencent.mm.plugin.appbrand.c.d.a;
import com.tencent.mm.plugin.appbrand.c.d.b;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.jsapi.p;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;
import org.json.JSONObject;

public class JsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask extends MainProcessTask
{
  public static final Parcelable.Creator<JsApiUploadEncryptedMediaFileTask> CREATOR;
  public String appId;
  public String czD;
  private ProgressDialog ehJ;
  public String eyr;
  public String fileId;
  public String fileUrl;
  public int gUm;
  public boolean hQq;
  public int hQr;
  public int hQs;
  public int hQt;
  Activity hQu;
  d.a hQv;
  d.b hQw;
  public Runnable hww;
  com.tencent.mm.plugin.appbrand.jsapi.c hxS;
  public String mimeType;

  static
  {
    AppMethodBeat.i(131318);
    CREATOR = new JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.5();
    AppMethodBeat.o(131318);
  }

  public JsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask()
  {
    this.hQr = 0;
    this.hQs = 0;
    this.hQt = 0;
    this.ehJ = null;
  }

  public JsApiUploadEncryptedFileToCDN$JsApiUploadEncryptedMediaFileTask(Parcel paramParcel)
  {
    AppMethodBeat.i(131311);
    this.hQr = 0;
    this.hQs = 0;
    this.hQt = 0;
    this.ehJ = null;
    g(paramParcel);
    AppMethodBeat.o(131311);
  }

  public final void asP()
  {
    AppMethodBeat.i(131312);
    ab.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "runInMainProcess mainEvent:%d, clientEvent:%d", new Object[] { Integer.valueOf(this.hQs), Integer.valueOf(this.hQt) });
    if (this.hQs == 1)
    {
      ab.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "user cancel upload the file, remove callback");
      com.tencent.mm.plugin.appbrand.app.f.auY().a(this.hQv);
      com.tencent.mm.plugin.appbrand.app.f.auY().a(this.hQw);
      com.tencent.mm.plugin.appbrand.app.f.auY();
      com.tencent.mm.plugin.appbrand.c.b.yC(this.czD);
      this.hQs = 0;
      this.hQt = 1;
      aCb();
      AppMethodBeat.o(131312);
    }
    while (true)
    {
      return;
      final AppBrandLocalMediaObject localAppBrandLocalMediaObject = AppBrandLocalMediaObjectManager.bt(this.appId, this.czD);
      if (localAppBrandLocalMediaObject == null)
      {
        ab.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "getItemByLocalId return mediaObject is null, ");
        this.hQt = 1;
        aCb();
        AppMethodBeat.o(131312);
      }
      else
      {
        Object localObject1 = new com.tencent.mm.plugin.appbrand.c.a();
        ((com.tencent.mm.plugin.appbrand.c.a)localObject1).czD = localAppBrandLocalMediaObject.czD;
        ((com.tencent.mm.plugin.appbrand.c.a)localObject1).heo = localAppBrandLocalMediaObject.fnQ;
        ((com.tencent.mm.plugin.appbrand.c.a)localObject1).gjQ = localAppBrandLocalMediaObject.gjQ;
        Object localObject2 = this.czD;
        ((com.tencent.mm.plugin.appbrand.c.a)localObject1).cHr = com.tencent.mm.al.c.a("appbrandmediafile", bo.anU(), (String)localObject2, (String)localObject2);
        com.tencent.mm.plugin.appbrand.app.f.auX().a((com.tencent.mm.plugin.appbrand.c.a)localObject1);
        this.hQv = new JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.1(this);
        this.hQw = new d.b()
        {
          public final void b(boolean paramAnonymousBoolean, String paramAnonymousString1, String paramAnonymousString2, String paramAnonymousString3)
          {
            AppMethodBeat.i(131305);
            ab.i("MicroMsg.JsApiUploadEncryptedFileToCDN", " on cdn finish,  is success : %s, mediaId : %s, localId : %s, mediaUrl : %s", new Object[] { Boolean.valueOf(paramAnonymousBoolean), paramAnonymousString2, paramAnonymousString1, paramAnonymousString3 });
            if ((!bo.isNullOrNil(paramAnonymousString1)) && (paramAnonymousString1.equals(localAppBrandLocalMediaObject.czD)))
            {
              com.tencent.mm.plugin.appbrand.app.f.auY().a(JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.hQv);
              com.tencent.mm.plugin.appbrand.app.f.auY().a(JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.hQw);
              com.tencent.mm.plugin.appbrand.app.f.auY();
              com.tencent.mm.plugin.appbrand.c.b.yC(localAppBrandLocalMediaObject.czD);
              if (paramAnonymousBoolean)
                break label267;
              ab.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "upload encrypt file false");
              paramAnonymousString1 = com.tencent.mm.plugin.appbrand.app.f.auX();
              paramAnonymousString2 = JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.fileId;
              if (!bo.isNullOrNil(paramAnonymousString2))
                break label285;
              ab.e("MicroMsg.AppbrandMediaCdnItemManager", "getItemByServerId error, media id is null or nil");
              label134: break label299;
              label135: paramAnonymousString1 = null;
              label137: if ((paramAnonymousString1 == null) || (paramAnonymousString1.heq == null))
                break label337;
              ab.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "cdn info is valid");
              JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.eyr = paramAnonymousString1.heq.field_aesKey;
              JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.fileId = paramAnonymousString1.heq.field_fileId;
              JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.fileUrl = paramAnonymousString1.heq.field_fileUrl;
              JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.gUm = paramAnonymousString1.heq.field_fileLength;
              ab.d("MicroMsg.JsApiUploadEncryptedFileToCDN", "aesKey:%s, fileLength:%d", new Object[] { JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.eyr, Integer.valueOf(JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.gUm) });
            }
            while (true)
            {
              JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.hQt = 1;
              JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.b(JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this);
              AppMethodBeat.o(131305);
              return;
              label267: JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.fileId = paramAnonymousString2;
              ab.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "upload encrypt file success");
              break;
              label285: paramAnonymousString3 = paramAnonymousString1.hez.values().iterator();
              label299: if (!paramAnonymousString3.hasNext())
                break label135;
              paramAnonymousString1 = (com.tencent.mm.plugin.appbrand.c.a)paramAnonymousString3.next();
              if (!bo.nullAsNil(paramAnonymousString1.hep).equals(paramAnonymousString2))
                break label134;
              break label137;
              label337: ab.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "cdn info is null");
            }
          }
        };
        localObject1 = com.tencent.mm.plugin.appbrand.app.f.auY();
        localObject2 = this.hQv;
        if ((((com.tencent.mm.plugin.appbrand.c.b)localObject1).hev != null) && (localObject2 != null) && (!((com.tencent.mm.plugin.appbrand.c.b)localObject1).hev.contains(localObject2)))
          ((com.tencent.mm.plugin.appbrand.c.b)localObject1).hev.add(localObject2);
        localObject2 = com.tencent.mm.plugin.appbrand.app.f.auY();
        String str1 = this.appId;
        String str2 = localAppBrandLocalMediaObject.czD;
        int i = com.tencent.mm.i.a.efH;
        Object localObject3 = this.hQw;
        localObject1 = com.tencent.mm.plugin.appbrand.app.f.auX().yE(str2);
        boolean bool;
        if (localObject1 == null)
        {
          ab.e("MicroMsg.AppbrandCdnService", "addUploadTask get webview file chooser item  by local id failed : %s", new Object[] { str2 });
          bool = false;
          ab.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "addUploadTask: add cdn upload task result : %b", new Object[] { Boolean.valueOf(bool) });
          if (!bool)
          {
            ab.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "addUploadTask fail");
            this.hQt = 1;
            com.tencent.mm.plugin.appbrand.app.f.auY().a(this.hQv);
            com.tencent.mm.plugin.appbrand.app.f.auY().a(this.hQw);
            com.tencent.mm.plugin.appbrand.app.f.auY();
            com.tencent.mm.plugin.appbrand.c.b.yC(localAppBrandLocalMediaObject.czD);
            aCb();
            AppMethodBeat.o(131312);
          }
        }
        else
        {
          ((com.tencent.mm.plugin.appbrand.c.a)localObject1).appId = str1;
          if ((localObject3 != null) && (((com.tencent.mm.plugin.appbrand.c.b)localObject2).heu != null) && (localObject3 != null) && (!((com.tencent.mm.plugin.appbrand.c.b)localObject2).heu.contains(localObject3)))
            ((com.tencent.mm.plugin.appbrand.c.b)localObject2).heu.add(localObject3);
          ((com.tencent.mm.plugin.appbrand.c.a)localObject1).her = true;
          localObject3 = new g();
          ((g)localObject3).egl = ((com.tencent.mm.plugin.appbrand.c.b)localObject2).fFk;
          ((g)localObject3).cRY = true;
          ((g)localObject3).field_mediaId = ((com.tencent.mm.plugin.appbrand.c.a)localObject1).cHr;
          ((g)localObject3).field_fullpath = ((com.tencent.mm.plugin.appbrand.c.a)localObject1).heo;
          ((g)localObject3).field_fileType = i;
          ((g)localObject3).field_talker = "weixin";
          ((g)localObject3).field_priority = com.tencent.mm.i.a.efC;
          if (i == com.tencent.mm.i.a.efH);
          for (((g)localObject3).field_needStorage = true; ; ((g)localObject3).field_needStorage = false)
          {
            ((g)localObject3).field_isStreamMedia = false;
            ((g)localObject3).field_appType = 0;
            ((g)localObject3).field_bzScene = 0;
            ((g)localObject3).field_force_aeskeycdn = true;
            ((g)localObject3).field_trysafecdn = false;
            bool = com.tencent.mm.al.f.afx().e((g)localObject3);
            ab.i("MicroMsg.AppbrandCdnService", "summersafecdn add upload cdn task : %b, force_aeskeycdn: %b, trysafecdn: %b, localid : %s ", new Object[] { Boolean.valueOf(bool), Boolean.valueOf(((g)localObject3).field_force_aeskeycdn), Boolean.valueOf(((g)localObject3).field_trysafecdn), str2 });
            break;
          }
          if (this.hQq)
          {
            ab.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "show the process dialog");
            this.hQt = 2;
            aCb();
          }
          AppMethodBeat.o(131312);
        }
      }
    }
  }

  public final void asQ()
  {
    AppMethodBeat.i(131313);
    if (this.hQt == 0)
    {
      ab.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "CLIENT_EVENT_INIT");
      AppMethodBeat.o(131313);
    }
    while (true)
    {
      return;
      if (this.hQt == 1)
      {
        ab.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "CLIENT_EVENT_FINISH");
        if (this.ehJ != null)
        {
          this.ehJ.dismiss();
          this.ehJ = null;
        }
        if (this.hww != null)
        {
          this.hww.run();
          AppMethodBeat.o(131313);
        }
      }
      else
      {
        Object localObject;
        if (this.hQt == 2)
        {
          ab.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "CLIENT_EVENT_SHOW_DIALOG");
          localObject = this.hQu;
          this.hQu.getString(2131297061);
          this.ehJ = h.b((Context)localObject, this.hQu.getString(2131297127), true, new JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.3(this));
          this.ehJ.setOnKeyListener(new JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.4(this));
          AppMethodBeat.o(131313);
        }
        else
        {
          if (this.hQt == 3)
          {
            ab.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "CLIENT_EVENT_PROGRESS");
            localObject = new HashMap();
            ((Map)localObject).put("tempFilePath", this.czD);
            ((Map)localObject).put("percent", Integer.valueOf(this.hQr));
            localObject = new JSONObject((Map)localObject).toString();
            new JsApiUploadEncryptedFileToCDN.a((byte)0).i(this.hxS).AL((String)localObject).aCj();
          }
          AppMethodBeat.o(131313);
        }
      }
    }
  }

  public final void g(Parcel paramParcel)
  {
    boolean bool = true;
    AppMethodBeat.i(131314);
    this.appId = paramParcel.readString();
    this.czD = paramParcel.readString();
    this.fileId = paramParcel.readString();
    this.eyr = paramParcel.readString();
    this.fileUrl = paramParcel.readString();
    this.gUm = paramParcel.readInt();
    if (paramParcel.readInt() == 1);
    while (true)
    {
      this.hQq = bool;
      this.hQr = paramParcel.readInt();
      this.hQt = paramParcel.readInt();
      this.hQs = paramParcel.readInt();
      this.mimeType = paramParcel.readString();
      AppMethodBeat.o(131314);
      return;
      bool = false;
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(131315);
    paramParcel.writeString(this.appId);
    paramParcel.writeString(this.czD);
    paramParcel.writeString(this.fileId);
    paramParcel.writeString(this.eyr);
    paramParcel.writeString(this.fileUrl);
    paramParcel.writeInt(this.gUm);
    if (this.hQq);
    for (paramInt = 1; ; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      paramParcel.writeInt(this.hQr);
      paramParcel.writeInt(this.hQt);
      paramParcel.writeInt(this.hQs);
      paramParcel.writeString(this.mimeType);
      AppMethodBeat.o(131315);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.media.JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask
 * JD-Core Version:    0.6.2
 */
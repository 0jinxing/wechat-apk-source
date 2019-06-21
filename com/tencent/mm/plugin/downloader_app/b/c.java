package com.tencent.mm.plugin.downloader_app.b;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader.model.e.a;
import com.tencent.mm.plugin.downloader_app.a.a.a;
import com.tencent.mm.plugin.downloader_app.a.a.b;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.vfs.e;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.LinkedList;
import org.json.JSONException;
import org.json.JSONObject;

public class c
{
  private static String IE(String paramString)
  {
    AppMethodBeat.i(136108);
    if ((paramString != null) && (paramString.contains("OpInWidget")))
    {
      AppMethodBeat.o(136108);
      return paramString;
    }
    if (!bo.isNullOrNil(paramString));
    while (true)
    {
      try
      {
        str1 = URLDecoder.decode(paramString, "utf-8");
      }
      catch (UnsupportedEncodingException paramString)
      {
        try
        {
          paramString = new org/json/JSONObject;
          paramString.<init>(str1);
          localObject = paramString;
          if (paramString == null)
            localObject = new JSONObject();
        }
        catch (Exception paramString)
        {
          try
          {
            while (true)
            {
              String str1;
              ((JSONObject)localObject).put("OpInWidget", 1);
              try
              {
                paramString = URLEncoder.encode(((JSONObject)localObject).toString(), "utf-8");
                str1 = paramString;
                label82: AppMethodBeat.o(136108);
                paramString = str1;
                break;
                localUnsupportedEncodingException = localUnsupportedEncodingException;
                str2 = paramString;
                continue;
                paramString = paramString;
                paramString = null;
              }
              catch (UnsupportedEncodingException paramString)
              {
                break label82;
              }
            }
          }
          catch (JSONException paramString)
          {
            continue;
          }
        }
      }
      Object localObject = null;
      String str2 = paramString;
      paramString = (String)localObject;
    }
  }

  public static long a(a parama, a.b paramb)
  {
    AppMethodBeat.i(136101);
    if (!j.contains(parama.appId))
    {
      localObject = j.biP();
      ((LinkedList)localObject).add(parama.appId);
      g.a((LinkedList)localObject, new c.14());
      j.Iz(parama.appId);
    }
    Object localObject = new e.a();
    ((e.a)localObject).It(parama.downloadUrl);
    ((e.a)localObject).Iu(parama.kOB);
    ((e.a)localObject).hA(parama.kOC);
    ((e.a)localObject).Iv(parama.appName);
    ((e.a)localObject).setAppId(parama.appId);
    ((e.a)localObject).Iw(parama.kOD);
    ((e.a)localObject).ga(true);
    ((e.a)localObject).gb(false);
    int i;
    long l;
    if (parama.fileType == 0)
    {
      i = 1;
      ((e.a)localObject).tN(i);
      ((e.a)localObject).cY(parama.packageName);
      ((e.a)localObject).bis();
      ((e.a)localObject).setScene(parama.scene);
      ((e.a)localObject).Ix(parama.extInfo);
      ((e.a)localObject).gc(parama.kNt);
      if (parama.cBA != 1)
        break label302;
      l = com.tencent.mm.plugin.downloader.model.d.bij().b(((e.a)localObject).kNl);
      label182: ab.i("MicroMsg.DownloadPluginUtil", " add download task result:[%d], appid[%s]，downloaerType[%d]", new Object[] { Long.valueOf(l), parama.appId, Integer.valueOf(parama.cBA) });
      if (paramb != null)
      {
        if ((!parama.kNt) || (at.isWifi(ah.getContext())))
          break label317;
        localObject = a.a.kOb;
      }
    }
    while (true)
    {
      paramb.a((a.a)localObject, l);
      if ((parama.kNt) && (!at.isWifi(ah.getContext())))
        d.IG(parama.appId);
      com.tencent.mm.modelstat.d.b(10, "DownloadPluginUtil_downloadTaskStraight", c.class.hashCode());
      AppMethodBeat.o(136101);
      return l;
      i = parama.fileType;
      break;
      label302: l = com.tencent.mm.plugin.downloader.model.d.bij().a(((e.a)localObject).kNl);
      break label182;
      label317: if (l > 0L)
        localObject = a.a.kNZ;
      else
        localObject = a.a.kOa;
    }
  }

  public static void a(Context paramContext, final long paramLong, final a.b paramb)
  {
    AppMethodBeat.i(138738);
    com.tencent.mm.plugin.downloader.f.a locala = com.tencent.mm.plugin.downloader.model.c.hv(paramLong);
    if (locala == null)
    {
      paramb.a(a.a.kOa, -1L);
      AppMethodBeat.o(138738);
    }
    while (true)
    {
      return;
      ((com.tencent.mm.plugin.downloader_app.a.c)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.downloader_app.a.c.class)).b(paramContext, locala.field_appId, new c.4(locala, paramb), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          AppMethodBeat.i(136089);
          paramAnonymousDialogInterface = this.kMF;
          this.kMF.field_downloadInWifi = false;
          paramAnonymousDialogInterface.field_reserveInWifi = false;
          com.tencent.mm.plugin.downloader.model.c.e(this.kMF);
          if (this.kMF.field_status == 0)
            d.IH(this.kMF.field_appId);
          if (paramb != null)
            paramb.a(a.a.kOc, paramLong);
          AppMethodBeat.o(136089);
        }
      }
      , null);
      AppMethodBeat.o(138738);
    }
  }

  public static void a(Context paramContext, com.tencent.mm.plugin.downloader.f.a parama, i parami, final a.b paramb)
  {
    AppMethodBeat.i(136103);
    if (!at.isConnected(paramContext))
    {
      h.a(paramContext, paramContext.getString(2131301662), paramContext.getString(2131301663), paramContext.getString(2131300880), false, new c.15(parama, paramb));
      AppMethodBeat.o(136103);
    }
    while (true)
    {
      return;
      if (at.isWifi(paramContext))
      {
        d.IF(parama.field_appId);
        a(parama, false, paramb);
        AppMethodBeat.o(136103);
      }
      else if (parami.kPc.kKX)
      {
        ((com.tencent.mm.plugin.downloader_app.a.c)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.downloader_app.a.c.class)).a(paramContext, parama.field_appId, new c.16(parama, paramb), new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            AppMethodBeat.i(136098);
            if ((!this.kMF.field_reserveInWifi) || (!this.kMF.field_downloadInWifi))
            {
              paramAnonymousDialogInterface = this.kMF;
              this.kMF.field_downloadInWifi = true;
              paramAnonymousDialogInterface.field_reserveInWifi = true;
              com.tencent.mm.plugin.downloader.model.c.e(this.kMF);
            }
            paramb.a(a.a.kOb, this.kMF.field_downloadId);
            AppMethodBeat.o(136098);
          }
        }
        , null);
        AppMethodBeat.o(136103);
      }
      else
      {
        if (parama.field_reserveInWifi)
        {
          parama.field_downloadInWifi = false;
          parama.field_reserveInWifi = false;
          com.tencent.mm.plugin.downloader.model.c.e(parama);
        }
        h.a(paramContext, paramContext.getString(2131305542), paramContext.getString(2131305543), paramContext.getString(2131305537), paramContext.getString(2131296868), false, new c.2(parama, paramb), new c.3(parami), 2131690683);
        AppMethodBeat.o(136103);
      }
    }
  }

  public static void a(Context paramContext, a parama, a.b paramb)
  {
    AppMethodBeat.i(136100);
    if ((paramContext == null) || (!parama.isValid()))
      AppMethodBeat.o(136100);
    while (true)
    {
      return;
      if (!at.isWifi(paramContext))
      {
        if (parama.kNt)
        {
          ((com.tencent.mm.plugin.downloader_app.a.c)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.downloader_app.a.c.class)).a(paramContext, parama.appId, new c.10(parama, paramb), new c.11(parama, paramb), null);
          AppMethodBeat.o(136100);
        }
        else
        {
          h.a(paramContext, paramContext.getString(2131305542), paramContext.getString(2131305543), paramContext.getString(2131305537), paramContext.getString(2131296868), false, new c.12(parama, paramb), new c.13(), 2131690683);
          AppMethodBeat.o(136100);
        }
      }
      else
      {
        d.IF(parama.appId);
        parama.kNt = false;
        a(parama, paramb);
        AppMethodBeat.o(136100);
      }
    }
  }

  public static void a(Context paramContext, i parami)
  {
    AppMethodBeat.i(138734);
    a(paramContext, parami, false);
    AppMethodBeat.o(138734);
  }

  public static void a(Context paramContext, i parami, a.b paramb)
  {
    AppMethodBeat.i(138736);
    a(paramContext, parami, true, paramb);
    AppMethodBeat.o(138736);
  }

  public static void a(Context paramContext, i parami, boolean paramBoolean)
  {
    AppMethodBeat.i(136099);
    if (!paramBoolean)
      com.tencent.mm.plugin.downloader_app.c.a.a(10, com.tencent.mm.plugin.downloader_app.c.a.tQ(parami.type), parami.position, 23, parami.appId, "", "");
    b(paramContext, parami, paramBoolean);
    AppMethodBeat.o(136099);
  }

  public static void a(Context paramContext, i parami, boolean paramBoolean, a.b paramb)
  {
    AppMethodBeat.i(136102);
    com.tencent.mm.plugin.downloader.f.a locala = com.tencent.mm.plugin.downloader.model.c.In(parami.appId);
    if (locala != null)
    {
      locala.field_extInfo = IE(locala.field_extInfo);
      a(paramContext, locala, parami, paramb);
      com.tencent.mm.game.report.api.b.eBF.a(locala.field_appId, locala.field_scene, 10, locala.field_startSize, locala.field_downloadedSize - locala.field_startSize, locala.field_totalSize, locala.field_downloadUrl, locala.field_errCode, locala.field_downloaderType, locala.field_channelId, (System.currentTimeMillis() - locala.field_startTime) / 1000L, locala.field_startState, locala.field_downloadId, locala.field_extInfo, 0);
    }
    if (paramBoolean)
      com.tencent.mm.plugin.downloader_app.c.a.a(10, com.tencent.mm.plugin.downloader_app.c.a.tQ(parami.type), parami.position, 6, parami.appId, "", "");
    AppMethodBeat.o(136102);
  }

  public static void a(i parami)
  {
    AppMethodBeat.i(136105);
    com.tencent.mm.plugin.downloader.f.a locala = com.tencent.mm.plugin.downloader.model.c.In(parami.appId);
    if (locala != null)
    {
      com.tencent.mm.plugin.downloader.model.d.bij().hn(locala.field_downloadId);
      com.tencent.mm.plugin.downloader_app.c.a.a(10, com.tencent.mm.plugin.downloader_app.c.a.tQ(parami.type), parami.position, 5, locala.field_appId, "", "");
    }
    AppMethodBeat.o(136105);
  }

  public static boolean a(com.tencent.mm.plugin.downloader.f.a parama, boolean paramBoolean, a.b paramb)
  {
    AppMethodBeat.i(136104);
    if (!j.contains(parama.field_appId))
    {
      localObject = j.biP();
      ((LinkedList)localObject).add(parama.field_appId);
      g.a((LinkedList)localObject, null);
      j.Iz(parama.field_appId);
    }
    parama.field_showNotification = false;
    parama.field_fromDownloadApp = true;
    parama.field_downloadInWifi = paramBoolean;
    parama.field_reserveInWifi = paramBoolean;
    com.tencent.mm.plugin.downloader.model.c.e(parama);
    paramBoolean = com.tencent.mm.plugin.downloader.model.d.bij().ho(parama.field_downloadId);
    if (paramb != null)
      if (!paramBoolean)
        break label121;
    label121: for (Object localObject = a.a.kNZ; ; localObject = a.a.kOa)
    {
      paramb.a((a.a)localObject, parama.field_downloadId);
      com.tencent.mm.modelstat.d.b(10, "DownloadPluginUtil_resumeDownloadTaskStraight", c.class.hashCode());
      AppMethodBeat.o(136104);
      return paramBoolean;
    }
  }

  private static void b(Context paramContext, i parami, boolean paramBoolean)
  {
    AppMethodBeat.i(138735);
    if ((paramContext == null) || (parami == null))
      AppMethodBeat.o(138735);
    while (true)
    {
      return;
      a locala = new a();
      locala.downloadUrl = parami.kPc.egm;
      locala.kOB = parami.kPc.kKV;
      locala.appId = parami.appId;
      locala.appName = parami.appName;
      locala.kOC = parami.kPc.kKP;
      locala.kOD = parami.kPc.kKQ;
      locala.packageName = parami.kPc.kKO;
      locala.cBA = parami.kPc.kKR;
      locala.extInfo = biI();
      if (paramBoolean);
      for (int i = 6003; ; i = 6002)
      {
        locala.scene = i;
        locala.kNt = parami.kPc.kKX;
        locala.fileType = 1;
        com.tencent.mm.game.report.api.b.eBF.a(locala.appId, locala.scene, 9, -1L, "", null);
        if (at.isConnected(paramContext))
          break label231;
        h.a(paramContext, paramContext.getString(2131301662), paramContext.getString(2131301663), paramContext.getString(2131300880), false, new c.1(locala));
        AppMethodBeat.o(138735);
        break;
      }
      label231: a(paramContext, locala, null);
      AppMethodBeat.o(138735);
    }
  }

  public static void b(i parami)
  {
    AppMethodBeat.i(138737);
    com.tencent.mm.plugin.downloader.f.a locala = com.tencent.mm.plugin.downloader.model.c.In(parami.appId);
    if (locala != null)
      com.tencent.mm.plugin.downloader.model.d.bij().hl(locala.field_downloadId);
    com.tencent.mm.plugin.downloader_app.c.a.a(11, com.tencent.mm.plugin.downloader_app.c.a.tQ(parami.type), parami.position, 81, parami.appId, "", "");
    AppMethodBeat.o(138737);
  }

  public static boolean b(Context paramContext, i parami)
  {
    boolean bool = false;
    AppMethodBeat.i(136106);
    com.tencent.mm.plugin.downloader.f.a locala = com.tencent.mm.plugin.downloader.model.c.In(parami.appId);
    if (locala == null)
      AppMethodBeat.o(136106);
    while (true)
    {
      return bool;
      if (e.ct(locala.field_filePath))
      {
        com.tencent.mm.plugin.downloader.h.a.a(locala.field_downloadId, false, null);
        com.tencent.mm.plugin.downloader_app.c.a.a(10, com.tencent.mm.plugin.downloader_app.c.a.tQ(parami.type), parami.position, 44, parami.appId, "", "");
        bool = true;
        AppMethodBeat.o(136106);
      }
      else
      {
        h.a(paramContext, paramContext.getString(2131301895), paramContext.getString(2131301896), paramContext.getString(2131302490), paramContext.getString(2131304026), false, new c.6(paramContext, parami), new c.7());
        AppMethodBeat.o(136106);
      }
    }
  }

  private static String biI()
  {
    AppMethodBeat.i(136107);
    Object localObject1 = new JSONObject();
    try
    {
      ((JSONObject)localObject1).put("DownloadInWidget", 1);
      ((JSONObject)localObject1).put("OpInWidget", 1);
      label31: Object localObject2 = null;
      try
      {
        localObject1 = URLEncoder.encode(((JSONObject)localObject1).toString(), "utf-8");
        localObject2 = localObject1;
        label45: AppMethodBeat.o(136107);
        return localObject2;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        break label45;
      }
    }
    catch (JSONException localJSONException)
    {
      break label31;
    }
  }

  public static void c(Context paramContext, i parami)
  {
    AppMethodBeat.i(138739);
    if (p.u(paramContext, parami.kPc.kKO))
    {
      com.tencent.mm.plugin.downloader.h.a.a(paramContext, parami.appId, null);
      com.tencent.mm.plugin.downloader_app.c.a.a(10, com.tencent.mm.plugin.downloader_app.c.a.tQ(parami.type), parami.position, 22, parami.appId, "", "");
      AppMethodBeat.o(138739);
    }
    while (true)
    {
      return;
      h.a(paramContext, paramContext.getString(2131297066), paramContext.getString(2131297067), paramContext.getString(2131302490), paramContext.getString(2131304026), false, new c.8(paramContext, parami), new c.9());
      AppMethodBeat.o(138739);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.b.c
 * JD-Core Version:    0.6.2
 */
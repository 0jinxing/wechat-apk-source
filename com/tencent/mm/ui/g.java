package com.tencent.mm.ui;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.c;
import com.tencent.mm.aj.r;
import com.tencent.mm.aj.z;
import com.tencent.mm.ce.a;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.t;

public final class g
{
  private static int as(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(29204);
    com.tencent.mm.aj.d locald = z.aeR().qP(paramString);
    if (locald.adQ())
      paramString = locald.adX();
    paramString = z.afa().qC(paramString);
    int i;
    int j;
    label54: long l1;
    if (paramString != null)
    {
      i = paramString.field_qyUin;
      if (paramString == null)
        break label206;
      j = paramString.field_userUin;
      if (paramString == null)
        break label212;
      l1 = paramString.field_wwCorpId;
      label64: if (paramString == null)
        break label218;
    }
    label206: label212: label218: for (long l2 = paramString.field_wwUserVid; ; l2 = 0L)
    {
      com.tencent.mm.plugin.report.service.h.pYm.e(13656, new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Long.valueOf(l1), Long.valueOf(l2) });
      ab.d("MicroMsg.EnterpriseHelper", "enterprise wework action report: %s,%s,%s,%s,%s,%s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Long.valueOf(l1), Long.valueOf(l2) });
      AppMethodBeat.o(29204);
      return paramInt2;
      i = 0;
      break;
      j = 0;
      break label54;
      l1 = 0L;
      break label64;
    }
  }

  public static void at(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(29206);
    Object localObject = z.aeR().qP(paramString);
    if (paramInt2 == 3)
      paramInt2 = 2;
    while (true)
    {
      int i = paramInt2;
      if (paramInt2 == 4)
        i = 3;
      if (((com.tencent.mm.aj.d)localObject).adQ())
        paramString = ((com.tencent.mm.aj.d)localObject).adX();
      localObject = z.afa().qC(paramString);
      paramString = new r((com.tencent.mm.aj.b)localObject, paramInt1, i, new Object());
      com.tencent.mm.kernel.g.RO().eJo.a(paramString, 0);
      if (((com.tencent.mm.aj.b)localObject).field_chatOpen)
      {
        paramInt2 = 1;
        if (!((com.tencent.mm.aj.b)localObject).field_show_confirm)
          break label200;
      }
      label200: for (int j = 1; ; j = 0)
      {
        com.tencent.mm.plugin.report.service.h.pYm.e(15162, new Object[] { Long.valueOf(((com.tencent.mm.aj.b)localObject).field_wwCorpId), Long.valueOf(((com.tencent.mm.aj.b)localObject).field_wwUserVid), Integer.valueOf(paramInt2), Integer.valueOf(((com.tencent.mm.aj.b)localObject).field_wwUnreadCnt), Integer.valueOf(j), Integer.valueOf(((com.tencent.mm.aj.b)localObject).field_userType), Integer.valueOf(paramInt1), Integer.valueOf(i) });
        AppMethodBeat.o(29206);
        return;
        paramInt2 = 0;
        break;
      }
    }
  }

  public static int bK(Context paramContext, String paramString)
  {
    int i = 0;
    AppMethodBeat.i(29199);
    int j;
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(29199);
      j = i;
    }
    while (true)
    {
      return j;
      paramString = z.afa().qC(paramString);
      if ((paramString != null) && ((paramString.field_userFlag & 0x2) != 0))
        j = 1;
      while (true)
        if (j != 0)
        {
          if ((paramString.field_wwExposeTimes < paramString.field_wwMaxExposeTimes) || (com.tencent.mm.pluginsdk.model.app.p.u(paramContext, "com.tencent.wework")))
          {
            j = 2;
            AppMethodBeat.o(29199);
            break;
            j = 0;
            continue;
          }
          AppMethodBeat.o(29199);
          j = 1;
          break;
        }
      AppMethodBeat.o(29199);
      j = i;
    }
  }

  public static void bL(Context paramContext, String paramString)
  {
    AppMethodBeat.i(29200);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(29200);
    while (true)
    {
      return;
      if (!com.tencent.mm.pluginsdk.model.app.p.u(paramContext, "com.tencent.wework"))
        z.afa().qF(paramString);
      AppMethodBeat.o(29200);
    }
  }

  public static void ew(String paramString, int paramInt)
  {
    AppMethodBeat.i(29205);
    if (paramInt <= 0)
    {
      AppMethodBeat.o(29205);
      return;
    }
    paramString = z.afa().qC(paramString);
    int i;
    if (paramString != null)
    {
      i = paramString.field_qyUin;
      label34: if (paramString == null)
        break label123;
    }
    label123: for (int j = paramString.field_userUin; ; j = 0)
    {
      com.tencent.mm.plugin.report.service.h.pYm.e(13703, new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(paramInt) });
      ab.d("MicroMsg.EnterpriseHelper", "enterprise click report: %s,%s,%s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(paramInt) });
      AppMethodBeat.o(29205);
      break;
      i = 0;
      break label34;
    }
  }

  public static void t(Context paramContext, String paramString, int paramInt)
  {
    AppMethodBeat.i(29201);
    if (com.tencent.mm.pluginsdk.model.app.p.u(paramContext, "com.tencent.wework"))
    {
      as(paramString, 4, paramInt);
      AppMethodBeat.o(29201);
    }
    while (true)
    {
      return;
      as(paramString, 5, paramInt);
      AppMethodBeat.o(29201);
    }
  }

  public static void u(Context paramContext, String paramString, int paramInt)
  {
    AppMethodBeat.i(29202);
    as(paramString, 1, paramInt);
    at(paramString, 2, paramInt);
    Object localObject = z.afa().qD(paramString);
    if (com.tencent.mm.pluginsdk.model.app.p.u(paramContext, "com.tencent.wework"))
    {
      as(paramString, 2, paramInt);
      paramString = com.tencent.mm.plugin.appbrand.r.b.getPackageInfo(paramContext, "com.tencent.wework");
      if ((!bo.isNullOrNil(paramString.versionName)) && (paramString.versionName.compareTo("1.3.3") >= 0))
      {
        localObject = new Intent();
        ((Intent)localObject).setAction("android.intent.action.VIEW");
        if ((paramInt == 2) || (paramInt == 4) || (paramInt == 6))
        {
          paramString = "wxwork://createconversation";
          ((Intent)localObject).setData(Uri.parse(paramString));
          paramString = (String)localObject;
          label117: a.post(new g.4(paramContext, paramString));
          AppMethodBeat.o(29202);
        }
      }
    }
    while (true)
    {
      return;
      paramString = "wxwork://conversationlist";
      break;
      paramString = paramContext.getPackageManager().getLaunchIntentForPackage("com.tencent.wework");
      break label117;
      if ((((com.tencent.mm.aj.b)localObject).field_chatOpen) || (((com.tencent.mm.aj.b)localObject).field_use_preset_banner_tips))
      {
        com.tencent.mm.ui.base.h.a(paramContext, 2131299237, 0, 2131299236, 2131296868, new g.1(paramContext, paramString, paramInt), null);
        AppMethodBeat.o(29202);
      }
      else
      {
        if (((com.tencent.mm.aj.b)localObject).field_show_confirm)
        {
          localObject = new com.tencent.mm.ui.widget.a.e.a(paramContext);
          ((com.tencent.mm.ui.widget.a.e.a)localObject).zQK = paramContext.getString(2131296868);
          ((com.tencent.mm.ui.widget.a.e.a)localObject).Qg(2131299236);
          z.afa();
          z.afa();
          String str = c.lb(1);
          if (str == null)
            ((com.tencent.mm.ui.widget.a.e.a)localObject).asL(paramContext.getString(2131299237));
          while (true)
          {
            ((com.tencent.mm.ui.widget.a.e.a)localObject).a(new g.2(), new g.3(paramContext, paramString, paramInt)).show();
            AppMethodBeat.o(29202);
            break;
            ((com.tencent.mm.ui.widget.a.e.a)localObject).asL(str);
          }
        }
        v(paramContext, paramString, paramInt);
        AppMethodBeat.o(29202);
      }
    }
  }

  public static void v(Context paramContext, String paramString, int paramInt)
  {
    AppMethodBeat.i(29203);
    as(paramString, 3, paramInt);
    at(paramString, 3, paramInt);
    z.aeR();
    if (bo.isNullOrNil(com.tencent.mm.aj.e.qT(paramString)));
    for (paramString = "off"; ; paramString = "on")
    {
      paramString = String.format("https://work.weixin.qq.com/wework_admin/commdownload?from=conv%s", new Object[] { paramString });
      Object localObject = com.tencent.mm.plugin.downloader.model.d.bij().Is(paramString);
      if ((localObject != null) && (((FileDownloadTaskInfo)localObject).status == 3) && (com.tencent.mm.vfs.e.ct(((FileDownloadTaskInfo)localObject).path)))
        com.tencent.mm.vfs.e.deleteFile(((FileDownloadTaskInfo)localObject).path);
      t.makeText(paramContext, paramContext.getString(2131299238), 2000).show();
      localObject = new com.tencent.mm.plugin.downloader.model.e.a();
      ((com.tencent.mm.plugin.downloader.model.e.a)localObject).It(paramString);
      ((com.tencent.mm.plugin.downloader.model.e.a)localObject).Iv(paramContext.getString(2131299234));
      ((com.tencent.mm.plugin.downloader.model.e.a)localObject).tN(1);
      ((com.tencent.mm.plugin.downloader.model.e.a)localObject).ga(true);
      com.tencent.mm.plugin.downloader.model.d.bij().a(((com.tencent.mm.plugin.downloader.model.e.a)localObject).kNl);
      AppMethodBeat.o(29203);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.g
 * JD-Core Version:    0.6.2
 */
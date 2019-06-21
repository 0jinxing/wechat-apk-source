package com.tencent.mm.plugin.hp.b;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Process;
import android.support.v4.app.v.c;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.app.v;
import com.tencent.mm.app.v.a;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.modelmulti.l;
import com.tencent.mm.modelmulti.l.a;
import com.tencent.mm.plugin.downloader.model.e.a;
import com.tencent.mm.plugin.downloader.model.k;
import com.tencent.mm.plugin.hp.a.a.1;
import com.tencent.mm.protocal.protobuf.che;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.SharePatchInfo;
import com.tencent.tinker.loader.shareutil.ShareSecurityCheck;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;
import java.io.File;

public final class e
  implements k
{
  final com.tencent.mm.plugin.hp.d.b ntI;
  private long ntJ;

  public e(com.tencent.mm.plugin.hp.d.b paramb)
  {
    AppMethodBeat.i(90596);
    this.ntI = paramb;
    com.tencent.mm.plugin.downloader.model.d.bij();
    com.tencent.mm.plugin.downloader.model.b.a(this);
    AppMethodBeat.o(90596);
  }

  private void bGl()
  {
    AppMethodBeat.i(90599);
    ah.getContext();
    com.tencent.mm.plugin.hp.d.d.bGA();
    com.tencent.mm.plugin.hp.d.d.bGB();
    e.a locala = new e.a();
    locala.It(this.ntI.nuk);
    locala.Iv(this.ntI.num);
    locala.Iw(this.ntI.nul);
    locala.ga(false);
    locala.bir();
    locala.tN(2);
    locala.gb(false);
    this.ntJ = com.tencent.mm.plugin.downloader.model.d.bij().a(locala.kNl);
    ab.i("Tinker.SyncResponseProcessor", "Download task id is :%d", new Object[] { Long.valueOf(this.ntJ) });
    com.tencent.mm.plugin.report.service.h.pYm.a(614L, 2L, 1L, false);
    if (at.isWifi(ah.getContext()))
      com.tencent.mm.plugin.report.service.h.pYm.a(614L, 7L, 1L, false);
    while (true)
    {
      if (this.ntI.nui.intValue() == 3)
      {
        com.tencent.mm.plugin.report.service.h.pYm.a(614L, 56L, 1L, false);
        ab.d("Tinker.SyncResponseProcessor", "boots download start silent.");
      }
      AppMethodBeat.o(90599);
      return;
      com.tencent.mm.plugin.report.service.h.pYm.a(614L, 8L, 1L, false);
    }
  }

  public final void b(long paramLong, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(90602);
    ab.w("Tinker.SyncResponseProcessor", "onTaskFailed");
    if (this.ntJ != paramLong)
    {
      ab.i("Tinker.SyncResponseProcessor", "onTaskFailed ignore. id is no equal. download id :%s callback id:%s", new Object[] { Long.valueOf(this.ntJ), Long.valueOf(paramLong) });
      AppMethodBeat.o(90602);
    }
    while (true)
    {
      return;
      b.wY(2);
      if (this.ntI.nui.intValue() == 3)
        com.tencent.mm.plugin.report.service.h.pYm.a(614L, 51L, 1L, false);
      com.tencent.mm.plugin.downloader.model.d.bij();
      com.tencent.mm.plugin.downloader.model.b.b(this);
      AppMethodBeat.o(90602);
    }
  }

  public final void b(long paramLong, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(90601);
    ab.i("Tinker.SyncResponseProcessor", "onTaskFinished id:%d path:%s hasChangeUrl:%s", new Object[] { Long.valueOf(paramLong), paramString, Boolean.valueOf(paramBoolean) });
    if (this.ntJ != paramLong)
    {
      ab.i("Tinker.SyncResponseProcessor", "onTaskFinished ignore. id is no equal. download id :%s callback id:%s", new Object[] { Long.valueOf(this.ntJ), Long.valueOf(paramLong) });
      AppMethodBeat.o(90601);
    }
    Context localContext;
    Object localObject1;
    Object localObject2;
    while (true)
    {
      return;
      b.wX(2);
      localContext = ah.getContext();
      localObject1 = new File(paramString);
      paramString = new ShareSecurityCheck(localContext);
      paramBoolean = false;
      try
      {
        boolean bool = paramString.aw((File)localObject1);
        paramBoolean = bool;
        if ((this.ntI.nui.intValue() == 2) && (!paramBoolean))
        {
          com.tencent.tinker.lib.util.a.i("Tinker.SyncResponseProcessor", "verify patch signature failed.", new Object[0]);
          b.wY(2);
          com.tencent.mm.plugin.report.service.h.pYm.a(614L, 31L, 1L, false);
          if (this.ntI.nui.intValue() == 3)
          {
            com.tencent.mm.plugin.report.service.h.pYm.a(614L, 54L, 1L, false);
            ab.d("Tinker.SyncResponseProcessor", "boots download patch md5 no equal.");
          }
          com.tencent.mm.plugin.downloader.model.d.bij();
          com.tencent.mm.plugin.downloader.model.b.b(this);
          AppMethodBeat.o(90601);
        }
      }
      catch (Exception paramString)
      {
        while (true)
        {
          ab.printErrStackTrace("Tinker.SyncResponseProcessor", paramString, "verify patch signature failed.", new Object[0]);
          com.tencent.mm.plugin.report.service.h.pYm.a(614L, 39L, 1L, false);
        }
        paramString = localContext.getApplicationInfo();
        if (paramString == null)
          paramString = null;
        while (paramString != null)
        {
          File[] arrayOfFile = paramString.listFiles();
          if (arrayOfFile == null)
            break;
          localObject2 = ((File)localObject1).getName();
          int i = arrayOfFile.length;
          for (int j = 0; j < i; j++)
          {
            paramString = arrayOfFile[j];
            if (!paramString.getName().equals(localObject2))
              SharePatchFileUtil.as(paramString);
          }
          localObject2 = new File(paramString.dataDir, "tinker_server");
          paramString = (String)localObject2;
          if (!((File)localObject2).exists())
          {
            ((File)localObject2).mkdirs();
            paramString = (String)localObject2;
          }
        }
        switch (this.ntI.nui.intValue())
        {
        default:
        case 2:
        case 3:
        case 1:
        }
      }
    }
    label404: paramString = this.ntI;
    if (paramString.bGw());
    for (paramString = com.tencent.mm.plugin.hp.d.b.a(paramString.nuh, 2); ; paramString = "")
    {
      localContext.getSharedPreferences("tinker_patch_share_config", 4).edit().putString("tinker_patch_msg_key", paramString).apply();
      break;
      com.tencent.tinker.lib.util.a.i("Tinker.SyncResponseProcessor", "onReceiveUpgradePatch. try to start apply", new Object[0]);
      if (com.tencent.mm.sdk.a.b.dnR())
      {
        com.tencent.tinker.lib.util.a.w("Tinker.SyncResponseProcessor", "[tomys] patch applying is blocked by assist.", new Object[0]);
        break label404;
      }
      if (!v.a.cfp.BC())
      {
        com.tencent.tinker.lib.util.a.w("Tinker.SyncResponseProcessor", "patch applying is blocked by TinkerEnsuranceOnFault, update basepack with different clientver to recover.", new Object[0]);
        break label404;
      }
      com.tencent.tinker.lib.e.c.cf(localContext, ((File)localObject1).getAbsolutePath());
      break label404;
      paramString = ((File)localObject1).getAbsolutePath();
      localObject1 = this.ntI;
      ab.i("MicroMsg.Tinker.CTinkerInstaller", "onReceiveUpgradeBsDiff bsDiffPath:%s , new apk md5：%s", new Object[] { paramString, ((com.tencent.mm.plugin.hp.d.b)localObject1).nun });
      localObject2 = com.tencent.mm.plugin.hp.d.d.OJ(((com.tencent.mm.plugin.hp.d.b)localObject1).nun);
      com.tencent.mm.kernel.g.RS().aa(new a.1((String)localObject2, localContext, paramString, (com.tencent.mm.plugin.hp.d.b)localObject1));
      break label404;
      ab.i("Tinker.SyncResponseProcessor", "coming soon! now can not support full apk update.");
      break label404;
    }
  }

  final void bGk()
  {
    AppMethodBeat.i(90598);
    if (!com.tencent.mm.compatible.util.h.getExternalStorageState().equals("mounted"))
    {
      ab.e("Tinker.SyncResponseProcessor", "no sdcard.");
      com.tencent.mm.plugin.report.service.h.pYm.a(614L, 50L, 1L, false);
      AppMethodBeat.o(90598);
    }
    while (true)
    {
      return;
      if (!f.eW(this.ntI.fileSize))
      {
        ab.e("Tinker.SyncResponseProcessor", "sdcard is full.");
        com.tencent.mm.plugin.report.service.h.pYm.a(614L, 51L, 1L, false);
        if (this.ntI.nui.intValue() == 3)
          com.tencent.mm.plugin.report.service.h.pYm.a(614L, 55L, 1L, false);
        AppMethodBeat.o(90598);
      }
      else
      {
        if ((this.ntI.nui.intValue() == 3) && (!bo.isNullOrNil(this.ntI.nun)) && (com.tencent.mm.a.e.ct(com.tencent.mm.plugin.hp.d.d.OJ(this.ntI.nun))) && (com.tencent.mm.c.a.cM(com.tencent.mm.plugin.hp.d.d.OJ(this.ntI.nun))))
        {
          Context localContext = ah.getContext();
          if (bo.isNullOrNil(this.ntI.bGx()));
          for (String str = localContext.getString(2131304177); ; str = this.ntI.bGx())
          {
            che localche = new che();
            localche.num = this.ntI.num;
            localche.title = localContext.getString(2131300006);
            localche.xgb = localContext.getString(2131300625);
            localche.nna = localContext.getString(2131304158);
            localche.nun = this.ntI.nun;
            localche.nuo = this.ntI.nuo;
            localche.iCm = this.ntI.fileSize;
            localche.nuk = this.ntI.nuk;
            localche.cdy = this.ntI.nul;
            localche.versionCode = this.ntI.versionCode;
            localche.xga = com.tencent.mm.plugin.hp.d.d.OJ(this.ntI.nun);
            localche.bzH = str;
            com.tencent.mm.plugin.hp.d.d.a(localche);
            ab.i("Tinker.SyncResponseProcessor", "file is exist. need no to download. newApkMd5:%s", new Object[] { this.ntI.nun });
            AppMethodBeat.o(90598);
            break;
          }
        }
        this.ntI.nui.intValue();
        bGl();
        AppMethodBeat.o(90598);
      }
    }
  }

  public final void gm(long paramLong)
  {
    AppMethodBeat.i(90605);
    ab.d("Tinker.SyncResponseProcessor", "onTaskProgressChanged taskId:%d", new Object[] { Long.valueOf(paramLong) });
    AppMethodBeat.o(90605);
  }

  public final void gn(long paramLong)
  {
  }

  public final void i(long paramLong, String paramString)
  {
    AppMethodBeat.i(90606);
    ab.d("Tinker.SyncResponseProcessor", "onTaskResumed taskId:%d filePath:%s", new Object[] { Long.valueOf(paramLong), paramString });
    AppMethodBeat.o(90606);
  }

  public final boolean jdMethod_if(boolean paramBoolean)
  {
    boolean bool = false;
    AppMethodBeat.i(90597);
    com.tencent.tinker.lib.util.a.i("Tinker.SyncResponseProcessor", "process tinker response: %s", new Object[] { this.ntI.toString() });
    Object localObject1 = this.ntI;
    int i;
    if ((((com.tencent.mm.plugin.hp.d.b)localObject1).nug.intValue() > 4) || (((com.tencent.mm.plugin.hp.d.b)localObject1).nug.intValue() <= 0))
    {
      ab.e("Tinker.TinkerSyncResponse", "responseState: %d must between %d and %d", new Object[] { ((com.tencent.mm.plugin.hp.d.b)localObject1).nug, Integer.valueOf(1), Integer.valueOf(4) });
      com.tencent.mm.plugin.report.service.h.pYm.a(614L, 24L, 1L, false);
      i = 0;
      if (i != 0)
        break label264;
      com.tencent.tinker.lib.util.a.i("Tinker.SyncResponseProcessor", "process check response fail, just return", new Object[0]);
      AppMethodBeat.o(90597);
      paramBoolean = bool;
    }
    while (true)
    {
      return paramBoolean;
      if (((com.tencent.mm.plugin.hp.d.b)localObject1).bGv())
      {
        if (TextUtils.isEmpty(((com.tencent.mm.plugin.hp.d.b)localObject1).num))
        {
          ab.e("Tinker.TinkerSyncResponse", "sync response patchId should not be null");
          com.tencent.mm.plugin.report.service.h.pYm.a(614L, 25L, 1L, false);
          i = 0;
          break;
        }
        if (TextUtils.isEmpty(((com.tencent.mm.plugin.hp.d.b)localObject1).nuk))
        {
          ab.e("Tinker.TinkerSyncResponse", "sync response cdnUrl should not be null");
          com.tencent.mm.plugin.report.service.h.pYm.a(614L, 26L, 1L, false);
          i = 0;
          break;
        }
        if (TextUtils.isEmpty(((com.tencent.mm.plugin.hp.d.b)localObject1).nul))
        {
          ab.e("Tinker.TinkerSyncResponse", "sync response fileMd5 should not be null");
          com.tencent.mm.plugin.report.service.h.pYm.a(614L, 27L, 1L, false);
          i = 0;
          break;
        }
      }
      i = 1;
      break;
      label264: if (this.ntI.nug.intValue() == 3)
      {
        i = 1;
        label281: if (i == 0)
          break label410;
        localObject2 = ah.getContext();
        localObject1 = com.tencent.tinker.lib.e.a.iX((Context)localObject2);
        if (((com.tencent.tinker.lib.e.a)localObject1).ABK)
          break label333;
        com.tencent.tinker.lib.util.a.w("Tinker.SyncResponseProcessor", "SyncResponseProcessor: onPatchRollback, tinker is not loaded, just return", new Object[0]);
      }
      while (true)
      {
        AppMethodBeat.o(90597);
        paramBoolean = true;
        break;
        i = 0;
        break label281;
        label333: com.tencent.tinker.lib.util.a.i("Tinker.SyncResponseProcessor", "tinker wait screen to clean patch and kill all process", new Object[0]);
        new l(ah.getContext(), new l.a()
        {
          public final void cO(boolean paramAnonymousBoolean)
          {
            AppMethodBeat.i(90595);
            if (!paramAnonymousBoolean)
            {
              com.tencent.tinker.lib.util.a.i("Tinker.SyncResponseProcessor", "app is background now, i can kill quietly", new Object[0]);
              ShareTinkerInternals.jr(this.val$context);
              this.ntL.bGr();
              Process.killProcess(Process.myPid());
            }
            AppMethodBeat.o(90595);
          }
        });
        localObject2 = new SharePatchInfo(((com.tencent.tinker.lib.e.a)localObject1).ABJ.ABO, "00000000000000000000000000000000", true, Build.FINGERPRINT, "odex");
        SharePatchInfo.a(((com.tencent.tinker.lib.e.a)localObject1).ABG, (SharePatchInfo)localObject2, ((com.tencent.tinker.lib.e.a)localObject1).ABH);
      }
      label410: if (!this.ntI.bGv())
      {
        AppMethodBeat.o(90597);
        paramBoolean = true;
      }
      else if (this.ntI.bGy())
      {
        com.tencent.tinker.lib.util.a.w("Tinker.SyncResponseProcessor", "is lower version skip.", new Object[0]);
        com.tencent.mm.plugin.report.service.h.pYm.a(614L, 78L, 1L, false);
        AppMethodBeat.o(90597);
        paramBoolean = true;
      }
      else
      {
        if (!com.tencent.mm.sdk.a.b.dnR())
          break label507;
        com.tencent.tinker.lib.util.a.w("Tinker.SyncResponseProcessor", "[tomys] patch downloading is blocked by assist.", new Object[0]);
        AppMethodBeat.o(90597);
        paramBoolean = true;
      }
    }
    label507: Object localObject3;
    if ((this.ntI.nui.intValue() == 3) && (!bo.isNullOrNil(this.ntI.clientVersion)) && (com.tencent.mm.plugin.hp.d.c.OH(this.ntI.clientVersion)))
    {
      com.tencent.mm.plugin.report.service.h.pYm.a(614L, 77L, 1L, false);
      localObject3 = this.ntI;
      Context localContext = ah.getContext();
      if (bo.isNullOrNil(((com.tencent.mm.plugin.hp.d.b)localObject3).nup))
      {
        localObject1 = localContext.getString(2131297029);
        label592: if (!bo.isNullOrNil(((com.tencent.mm.plugin.hp.d.b)localObject3).nuq))
          break label820;
        localObject2 = "";
        label608: if (!bo.isNullOrNil(((com.tencent.mm.plugin.hp.d.b)localObject3).nur))
          break label830;
        localObject3 = "http://support.weixin.qq.com/cgi-bin/mmsupport-bin/readtemplate?t=page/android_exp__index";
        label624: Intent localIntent = new Intent("android.intent.action.VIEW");
        localIntent.setClassName(ah.getPackageName(), ah.getPackageName() + ".plugin.webview.ui.tools.WebViewUI");
        localIntent.putExtra("rawUrl", (String)localObject3);
        localIntent.putExtra("useJs", true);
        localIntent.putExtra("vertical_scroll", true);
        localIntent.setFlags(872415232);
        localObject3 = PendingIntent.getActivity(localContext, 0, localIntent, 268435456);
        localObject1 = com.tencent.mm.bo.a.bt(localContext, "reminder_channel_id").g(null).j(System.currentTimeMillis()).d((CharSequence)localObject1).e((CharSequence)localObject2);
        ((v.c)localObject1).EI = ((PendingIntent)localObject3);
        ((v.c)localObject1).as(com.tencent.mm.bo.a.bWV());
        localObject1 = ((v.c)localObject1).build();
        ((Notification)localObject1).flags |= 16;
        if (!paramBoolean)
          break label840;
        ((NotificationManager)localContext.getSystemService("notification")).notify(19841110, (Notification)localObject1);
      }
      while (true)
      {
        AppMethodBeat.o(90597);
        paramBoolean = true;
        break;
        localObject1 = ((com.tencent.mm.plugin.hp.d.b)localObject3).nup;
        break label592;
        label820: localObject2 = ((com.tencent.mm.plugin.hp.d.b)localObject3).nuq;
        break label608;
        label830: localObject3 = ((com.tencent.mm.plugin.hp.d.b)localObject3).nur;
        break label624;
        label840: ab.i("Tinker.SyncResponseProcessor", "ignore action when load from cache,when response is alpha version");
      }
    }
    com.tencent.tinker.lib.util.a.i("Tinker.SyncResponseProcessor", "check need show before download. network type:%d msg:%s", new Object[] { this.ntI.nuj, this.ntI.bGx() });
    Object localObject2 = ah.getContext();
    if ((this.ntI.nuj.intValue() == 2) && (at.isMobile(ah.getContext())) && (this.ntI.bGw()))
      if (!com.tencent.mm.plugin.hp.tinker.g.az((Context)localObject2, this.ntI.num))
        if (this.ntI.nui.intValue() == 2)
        {
          localObject1 = ah.getContext().getString(2131300008, new Object[] { this.ntI.bGx(), ah.getContext().getString(2131304166), bo.ga(this.ntI.fileSize) });
          i.a(ah.getContext().getString(2131300006), (String)localObject1, ah.getContext().getString(2131304170), new e.1(this), ah.getContext().getString(2131304158), new e.2(this, (Context)localObject2));
          label1049: a.wV(4);
        }
    while (true)
    {
      AppMethodBeat.o(90597);
      paramBoolean = true;
      break;
      if (this.ntI.nui.intValue() != 3)
        break label1049;
      ab.d("Tinker.SyncResponseProcessor", "showUpdateDialog ");
      if (bo.isNullOrNil(this.ntI.bGx()));
      for (localObject1 = ((Context)localObject2).getString(2131304177); ; localObject1 = this.ntI.bGx())
      {
        localObject3 = new che();
        ((che)localObject3).num = this.ntI.num;
        ((che)localObject3).title = ((Context)localObject2).getString(2131300006);
        ((che)localObject3).xgb = ((Context)localObject2).getString(2131304170);
        ((che)localObject3).nna = ((Context)localObject2).getString(2131304158);
        ((che)localObject3).nun = this.ntI.nun;
        ((che)localObject3).nuo = this.ntI.nuo;
        ((che)localObject3).iCm = this.ntI.fileSize;
        ((che)localObject3).nuk = this.ntI.nuk;
        ((che)localObject3).cdy = this.ntI.nul;
        ((che)localObject3).versionCode = this.ntI.versionCode;
        ((che)localObject3).xga = com.tencent.mm.plugin.hp.d.d.OJ(this.ntI.nun);
        ((che)localObject3).bzH = ((String)localObject1);
        com.tencent.mm.plugin.hp.d.d.a((che)localObject3);
        break;
      }
      com.tencent.mm.plugin.report.service.h.pYm.a(614L, 44L, 1L, false);
      ab.i("Tinker.SyncResponseProcessor", "this patch id :%s show cancel before user, need show again.", new Object[] { this.ntI.num });
      continue;
      if ((this.ntI.bGu()) && (!com.tencent.mm.plugin.hp.tinker.g.az((Context)localObject2, this.ntI.num)))
        bGk();
    }
  }

  public final void onTaskPaused(long paramLong)
  {
    AppMethodBeat.i(90604);
    ab.d("Tinker.SyncResponseProcessor", "onTaskPaused taskId:%d", new Object[] { Long.valueOf(paramLong) });
    AppMethodBeat.o(90604);
  }

  public final void onTaskRemoved(long paramLong)
  {
    AppMethodBeat.i(90603);
    ab.i("Tinker.SyncResponseProcessor", "onTaskRemoved taskId:%d", new Object[] { Long.valueOf(paramLong) });
    com.tencent.mm.plugin.downloader.model.d.bij();
    com.tencent.mm.plugin.downloader.model.b.b(this);
    AppMethodBeat.o(90603);
  }

  public final void onTaskStarted(long paramLong, String paramString)
  {
    AppMethodBeat.i(90600);
    ab.d("Tinker.SyncResponseProcessor", "onTaskStarted taskId %d", new Object[] { Long.valueOf(paramLong) });
    AppMethodBeat.o(90600);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.hp.b.e
 * JD-Core Version:    0.6.2
 */
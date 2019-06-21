package com.tencent.mm.pluginsdk.model;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Looper;
import android.os.MessageQueue;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.g;
import com.tencent.xweb.WebView;
import com.tencent.xweb.x;
import com.tencent.xweb.x5.sdk.f;

public final class v$a
{
  private static boolean vbL;

  static
  {
    AppMethodBeat.i(114673);
    ab.i("TBSDownloadChecker", "TRACE_ORDER:TBSHelper.java");
    x.a(ah.getContext(), new v.a.1());
    vbL = false;
    AppMethodBeat.o(114673);
  }

  public static void Kv(int paramInt)
  {
    AppMethodBeat.i(114668);
    Intent localIntent = new Intent();
    localIntent.setClassName(ah.getPackageName(), "com.tencent.mm.sandbox.updater.UpdaterService");
    localIntent.putExtra("intent_extra_download_type", paramInt);
    com.tencent.mm.bp.d.j(localIntent, "sandbox");
    ab.i("MicroMsg.TBSDownloadChecker", "start UpdaterService to download xwalk now");
    AppMethodBeat.o(114668);
  }

  public static void dho()
  {
    AppMethodBeat.i(114669);
    if (g.dnY())
    {
      ab.d("MicroMsg.TBSDownloadChecker", "preCheck isGPVersion, ignore this request");
      AppMethodBeat.o(114669);
    }
    while (true)
    {
      return;
      if ((f.jA(ah.getContext())) && (WebView.getInstalledTbsCoreVersion(ah.getContext()) <= 0))
      {
        Intent localIntent = new Intent();
        localIntent.setClassName(ah.getPackageName(), "com.tencent.mm.sandbox.updater.UpdaterService");
        localIntent.putExtra("intent_extra_download_type", 1);
        com.tencent.mm.bp.d.j(localIntent, "sandbox");
        ab.i("MicroMsg.TBSDownloadChecker", "start UpdaterService to download tbs");
      }
      AppMethodBeat.o(114669);
    }
  }

  public static boolean dhp()
  {
    AppMethodBeat.i(114670);
    boolean bool1 = f.isDownloading();
    boolean bool2 = com.tencent.xweb.x5.sdk.d.getTBSInstalling();
    boolean bool3 = vbL;
    if ((bool1) || (bool2) || (bool3))
    {
      bool1 = true;
      AppMethodBeat.o(114670);
    }
    while (true)
    {
      return bool1;
      bool1 = false;
      AppMethodBeat.o(114670);
    }
  }

  public static int dhq()
  {
    int i = 4;
    AppMethodBeat.i(114671);
    if ((com.tencent.mm.compatible.util.d.iW(19)) || (com.tencent.mm.compatible.util.d.fP(16)))
    {
      AppMethodBeat.o(114671);
      i = 1;
    }
    while (true)
    {
      return i;
      if (WebView.getInstalledTbsCoreVersion(ah.getContext()) > 0)
      {
        AppMethodBeat.o(114671);
      }
      else if (f.isDownloading())
      {
        AppMethodBeat.o(114671);
        i = 2;
      }
      else if (com.tencent.xweb.x5.sdk.d.getTBSInstalling())
      {
        i = 3;
        AppMethodBeat.o(114671);
      }
      else
      {
        boolean bool = ah.getContext().getSharedPreferences("com.tencent.mm_webview_x5_preferences", 4).getBoolean("tbs_download_oversea", false);
        ab.i("MicroMsg.TBSDownloadChecker", "oversea = %b", new Object[] { Boolean.valueOf(bool) });
        if (bool)
        {
          AppMethodBeat.o(114671);
          i = 2;
        }
        else
        {
          ab.e("MicroMsg.TBSDownloadChecker", "WTF, how could it be?");
          AppMethodBeat.o(114671);
          i = 0;
        }
      }
    }
  }

  public static void dhr()
  {
    AppMethodBeat.i(114672);
    Object localObject = new Intent();
    ((Intent)localObject).setClassName(ah.getPackageName(), "com.tencent.mm.sandbox.updater.UpdaterService");
    ((Intent)localObject).putExtra("intent_extra_download_type", 2);
    ((Intent)localObject).putExtra("intent_extra_download_ignore_network_type", true);
    com.tencent.mm.bp.d.j((Intent)localObject, "sandbox");
    ab.i("MicroMsg.TBSDownloadChecker", "start UpdaterService to download tbs");
    localObject = ah.getContext().getSharedPreferences("com.tencent.mm_webview_x5_preferences", 4);
    if (localObject != null)
      ((SharedPreferences)localObject).edit().putBoolean("tbs_download_oversea", true).apply();
    AppMethodBeat.o(114672);
  }

  public static void fH(Context paramContext)
  {
    AppMethodBeat.i(114666);
    Looper.myQueue().addIdleHandler(new v.a.2(paramContext));
    AppMethodBeat.o(114666);
  }

  public static void fI(Context paramContext)
  {
    AppMethodBeat.i(114667);
    ab.i("MicroMsg.TBSDownloadChecker", "webview start check tbs");
    Object localObject1 = paramContext.getSharedPreferences("com.tencent.mm_webview_x5_preferences", 4);
    long l1;
    long l2;
    Object localObject2;
    if (localObject1 != null)
    {
      l1 = ((SharedPreferences)localObject1).getLong("last_check_xwalk", 0L);
      l2 = System.currentTimeMillis();
      if (l2 - l1 >= 1800000L)
      {
        localObject2 = ((SharedPreferences)localObject1).edit();
        ((SharedPreferences.Editor)localObject2).putLong("last_check_xwalk", l2);
        ((SharedPreferences.Editor)localObject2).apply();
        Kv(4);
      }
    }
    boolean bool = ((SharedPreferences)localObject1).getBoolean("tbs_download_oversea", false);
    ab.i("MicroMsg.TBSDownloadChecker", "user hasDownloadOverSea = %b", new Object[] { Boolean.valueOf(bool) });
    if (bool);
    for (int i = 2; ; i = 1)
    {
      localObject2 = ((SharedPreferences)localObject1).getString("tbs_download", null);
      if (!"1".equals(localObject2))
      {
        ab.i("MicroMsg.TBSDownloadChecker", "tbsDownload switch is off, value = %s", new Object[] { localObject2 });
        AppMethodBeat.o(114667);
      }
      while (true)
      {
        return;
        if (!g.dnY())
          break;
        ab.i("MicroMsg.TBSDownloadChecker", "isGPVersion, ignore this request");
        AppMethodBeat.o(114667);
        continue;
        com.tencent.xweb.x5.sdk.d.setUploadCode(ah.getContext(), 130);
        bool = at.isWifi(paramContext);
        ab.i("MicroMsg.TBSDownloadChecker", "check, tbsDownload = %s, isWifi = %b", new Object[] { localObject2, Boolean.valueOf(bool) });
        if (!bool)
        {
          ab.i("MicroMsg.TBSDownloadChecker", "check, net type is not wifi");
          com.tencent.xweb.x5.sdk.d.setUploadCode(ah.getContext(), 131);
          AppMethodBeat.o(114667);
        }
        else
        {
          if (localObject1 == null)
            ab.e("MicroMsg.TBSDownloadChecker", "sp is null");
          label265: for (int j = 0; ; j = 1)
          {
            if (j != 0)
              break label379;
            j = WebView.getInstalledTbsCoreVersion(paramContext);
            ab.i("MicroMsg.TBSDownloadChecker", "check expired false, tbsCoreVersion = %d", new Object[] { Integer.valueOf(j) });
            if (j <= 0)
              break label379;
            com.tencent.xweb.x5.sdk.d.setUploadCode(ah.getContext(), 132);
            AppMethodBeat.o(114667);
            break;
            l1 = ((SharedPreferences)localObject1).getLong("last_check_ts", 0L);
            l2 = System.currentTimeMillis();
            if (l2 - l1 <= 7200000L)
              break label265;
            localObject1 = ((SharedPreferences)localObject1).edit();
            ((SharedPreferences.Editor)localObject1).putLong("last_check_ts", l2);
            ((SharedPreferences.Editor)localObject1).apply();
          }
          label379: paramContext = new Intent();
          paramContext.setClassName(ah.getPackageName(), "com.tencent.mm.sandbox.updater.UpdaterService");
          paramContext.putExtra("intent_extra_download_type", i);
          com.tencent.mm.bp.d.j(paramContext, "sandbox");
          ab.i("MicroMsg.TBSDownloadChecker", "start UpdaterService to download tbs");
          AppMethodBeat.o(114667);
        }
      }
    }
  }

  public static void ov(boolean paramBoolean)
  {
    vbL = paramBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.v.a
 * JD-Core Version:    0.6.2
 */
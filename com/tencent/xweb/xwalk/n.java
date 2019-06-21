package com.tencent.xweb.xwalk;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.WebView.d;
import com.tencent.xweb.a;
import com.tencent.xweb.c.c;
import com.tencent.xweb.util.d;
import com.tencent.xweb.w;
import java.io.File;
import java.util.HashMap;
import org.xwalk.core.Log;
import org.xwalk.core.XWalkDecompressor;
import org.xwalk.core.XWalkEnvironment;
import org.xwalk.core.XWalkInitializer;
import org.xwalk.core.XWalkInitializer.XWalkInitListener;
import org.xwalk.core.XWalkUpdater;
import org.xwalk.core.XWalkUpdater.FileListMD5Checker;
import org.xwalk.core.XWalkUpdater.XWalkBackgroundUpdateListener;

public class n
  implements XWalkInitializer.XWalkInitListener, XWalkUpdater.XWalkBackgroundUpdateListener
{
  static n ASD;
  XWalkInitializer ASE;
  XWalkUpdater ASF;
  protected Context mContext;

  public n(Context paramContext)
  {
    AppMethodBeat.i(85389);
    this.mContext = paramContext;
    this.ASE = new XWalkInitializer(this, paramContext);
    this.ASF = new XWalkUpdater(this, paramContext);
    AppMethodBeat.o(85389);
  }

  public static void E(Context paramContext, boolean paramBoolean)
  {
    AppMethodBeat.i(85378);
    SharedPreferences localSharedPreferences = XWalkEnvironment.getSharedPreferencesForUpdateConfig();
    if (localSharedPreferences == null)
      AppMethodBeat.o(85378);
    while (true)
    {
      return;
      long l1 = localSharedPreferences.getLong("LAST_TRY_CLEAR_APK_TIME", 0L);
      long l2 = System.currentTimeMillis();
      if ((paramBoolean) || (l2 < l1) || (l2 - l1 > 259200000L));
      try
      {
        jD(paramContext);
        localSharedPreferences.edit().putLong("LAST_TRY_CLEAR_APK_TIME", l2).commit();
        AppMethodBeat.o(85378);
      }
      catch (Exception paramContext)
      {
        while (true)
          Log.e("XWalkUpdaterImp", "tryClearOldXWebCore failed " + paramContext.getMessage());
      }
    }
  }

  private static boolean SA(int paramInt)
  {
    AppMethodBeat.i(85381);
    File localFile = SC(paramInt);
    boolean bool;
    if (localFile == null)
    {
      Log.e("XWalkUpdaterImp", "checkfiles no config file");
      bool = false;
      AppMethodBeat.o(85381);
    }
    while (true)
    {
      return bool;
      bool = XWalkUpdater.FileListMD5Checker.checkFileListMd5(paramInt, localFile);
      AppMethodBeat.o(85381);
    }
  }

  private static boolean SB(int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(85386);
    File localFile = SC(paramInt);
    if (localFile == null)
      if (XWalkEnvironment.isTestVersion(paramInt))
        AppMethodBeat.o(85386);
    while (true)
    {
      return bool;
      Log.e("XWalkUpdaterImp", "checkfiles no config file");
      com.tencent.xweb.util.f.nI(78L);
      if ("true".equalsIgnoreCase(a.iG("dis_config_file_check", "tools")))
      {
        XWalkInitializer.addXWalkInitializeLog("XWalkUpdaterImp", "dis_config_file_check ");
        AppMethodBeat.o(85386);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(85386);
        continue;
        bool = XWalkUpdater.FileListMD5Checker.checkFileListMd5(paramInt, localFile);
        AppMethodBeat.o(85386);
      }
    }
  }

  private static File SC(int paramInt)
  {
    AppMethodBeat.i(85387);
    try
    {
      String str = XWalkEnvironment.getPatchFileListConfig(paramInt);
      File localFile = new java/io/File;
      localFile.<init>(str);
      boolean bool = localFile.exists();
      if (bool)
        AppMethodBeat.o(85387);
      while (true)
      {
        return localFile;
        str = XWalkEnvironment.getDownloadZipFileListConfig(paramInt);
        localFile = new java/io/File;
        localFile.<init>(str);
        bool = localFile.exists();
        if (bool)
        {
          AppMethodBeat.o(85387);
        }
        else
        {
          AppMethodBeat.o(85387);
          localFile = null;
        }
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        AppMethodBeat.o(85387);
        Object localObject = null;
      }
    }
  }

  public static void a(Context paramContext, HashMap<String, String> paramHashMap)
  {
    int i = 1;
    AppMethodBeat.i(85377);
    if (ASD == null)
      ASD = new n(paramContext);
    if (!XWalkEnvironment.isTestVersion(XWalkEnvironment.getInstalledNewstVersion()))
      rE(false);
    int j;
    if (c.b("LOAD_CORE", WebView.d.ANb).APn >= 6L)
    {
      j = 1;
      if (j == 0)
        break label157;
      com.tencent.xweb.util.f.nI(252L);
      if (!"true".equalsIgnoreCase(a.iG("enable_check_dex", "tools")))
        break label157;
      j = 1;
      label84: if (j != 0)
      {
        if (!"true".equals(a.ava("dis_".concat(String.valueOf("check_need_fix_dex")))))
          break label219;
        j = 0;
      }
    }
    while (true)
    {
      if ((j != 0) && (!dVL()))
      {
        com.tencent.xweb.util.f.nI(248L);
        XWalkEnvironment.setAvailableVersion(-1, null);
      }
      E(paramContext, false);
      ASD.s(paramHashMap);
      AppMethodBeat.o(85377);
      return;
      j = 0;
      break;
      label157: if (c.b("CREATE_WEBVIEW", WebView.d.ANb).APn >= 6L);
      for (j = 1; ; j = 0)
      {
        if (j == 0)
          break label214;
        com.tencent.xweb.util.f.nI(247L);
        if (!"true".equalsIgnoreCase(a.iG("enable_check_dex_new_web", "tools")))
          break label214;
        j = 1;
        break;
      }
      label214: j = 0;
      break label84;
      label219: SharedPreferences localSharedPreferences = XWalkEnvironment.getMMKVSharedPreferences("FREQUENT_LIMITER");
      long l1 = localSharedPreferences.getLong("check_need_fix_dex", 0L);
      long l2 = System.currentTimeMillis();
      if (Math.abs(l2 - l1) < 43200000L)
      {
        j = 0;
      }
      else
      {
        localSharedPreferences.edit().putLong("check_need_fix_dex", l2).commit();
        j = i;
      }
    }
  }

  public static int aE(Context paramContext, int paramInt)
  {
    int i = 1;
    AppMethodBeat.i(85380);
    if ((paramContext == null) || (paramContext.getApplicationInfo() == null) || (paramContext.getApplicationInfo().dataDir == null))
    {
      XWalkEnvironment.addXWalkInitializeLog("revertToApkVer failed: bad context");
      AppMethodBeat.o(85380);
    }
    for (int j = -1; ; j = -1)
    {
      return j;
      paramContext = new File(paramContext.getApplicationInfo().dataDir).listFiles();
      if (paramContext != null)
        break;
      XWalkEnvironment.addXWalkInitializeLog("revertToApkVer failed files is null");
      AppMethodBeat.o(85380);
    }
    int k = XWalkEnvironment.getInstalledNewstVersion();
    int m = paramContext.length;
    int n = 0;
    j = -1;
    int i1 = 0;
    label101: int i3;
    if (n < m)
    {
      int i2 = ay(paramContext[n]);
      i3 = i1;
      if (i2 < 0)
        break label393;
      if (i2 == paramInt)
        i1 = 1;
      i3 = i1;
      if (i2 > paramInt)
        break label393;
      i3 = i1;
      if (i2 < 49)
        break label393;
      i3 = i1;
      if (i2 == k)
        break label393;
      i3 = i1;
      if (i2 <= j)
        break label393;
      j = i2;
    }
    while (true)
    {
      n++;
      break label101;
      if (j > 0);
      for (i3 = i; ; i3 = 0)
      {
        if (i1 != 0)
          if (SA(paramInt))
          {
            XWalkEnvironment.addXWalkInitializeLog("revertToApkVer checkApkExist targetApk exist");
            j = paramInt;
          }
        label384: 
        while (true)
        {
          label213: if (j == paramInt)
            com.tencent.xweb.util.f.nI(89L);
          while (true)
          {
            XWalkEnvironment.addXWalkInitializeLog("revert from:" + XWalkEnvironment.getInstalledNewstVersion() + " to:" + j);
            XWalkEnvironment.setAvailableVersion(j, "revert from:" + XWalkEnvironment.getInstalledNewstVersion() + " to:" + j);
            AppMethodBeat.o(85380);
            break;
            if (SA(j))
              break label384;
            XWalkEnvironment.addXWalkInitializeLog("revertToApkVer nAvailableOldVer targetApk not exist");
            j = -1;
            break label213;
            XWalkEnvironment.addXWalkInitializeLog("revertToApkVer did not find target version:".concat(String.valueOf(paramInt)));
            if (SA(j))
              break label384;
            XWalkEnvironment.addXWalkInitializeLog("revertToApkVer nAvailableOldVer targetApk not exist");
            j = -1;
            break label213;
            if (j > 0)
              com.tencent.xweb.util.f.nI(90L);
            else if (i3 != 0)
              com.tencent.xweb.util.f.nI(92L);
            else
              com.tencent.xweb.util.f.nI(91L);
          }
        }
      }
      label393: i1 = i3;
    }
  }

  private static int ay(File paramFile)
  {
    int i = -1;
    AppMethodBeat.i(85382);
    if (paramFile == null)
      AppMethodBeat.o(85382);
    while (true)
    {
      return i;
      String str = paramFile.getName();
      if ((str != null) && (str.startsWith("app_xwalk_")) && (paramFile.isDirectory()))
      {
        str = str.substring(10);
        try
        {
          int j = Integer.parseInt(str);
          i = j;
          AppMethodBeat.o(85382);
        }
        catch (Exception paramFile)
        {
          Log.e("XWalkUpdaterImp", "get apk version strApkVer  is ".concat(String.valueOf(str)));
        }
      }
      else
      {
        AppMethodBeat.o(85382);
      }
    }
  }

  private static boolean dVK()
  {
    AppMethodBeat.i(85383);
    boolean bool;
    if (com.tencent.xweb.util.b.avl(XWalkEnvironment.getOptimizedDexDir(XWalkEnvironment.getInstalledNewstVersion())))
    {
      XWalkEnvironment.addXWalkInitializeLog("tryRemoveOptDex suc");
      bool = true;
      AppMethodBeat.o(85383);
    }
    while (true)
    {
      return bool;
      XWalkEnvironment.addXWalkInitializeLog("tryRemoveOptDex failed");
      bool = false;
      AppMethodBeat.o(85383);
    }
  }

  public static boolean dVL()
  {
    boolean bool = false;
    AppMethodBeat.i(85384);
    int i = XWalkEnvironment.getInstalledNewstVersion();
    if (i <= 0)
      AppMethodBeat.o(85384);
    while (true)
    {
      return bool;
      localObject1 = SC(i);
      if (localObject1 == null)
      {
        Log.e("XWalkUpdaterImp", "doFixDex checkfiles no config file");
        AppMethodBeat.o(85384);
      }
      else
      {
        if (XWalkUpdater.FileListMD5Checker.checkFileListMd5(i, (File)localObject1))
          break;
        Log.e("XWalkUpdaterImp", "doFixDex checkFileListMd5 failed");
        AppMethodBeat.o(85384);
      }
    }
    String str1 = XWalkEnvironment.getExtractedCoreDir(i);
    Object localObject1 = XWalkEnvironment.getExtractedCoreDir(i) + "_bk";
    Object localObject2 = new File((String)localObject1);
    if (!((File)localObject2).exists())
      ((File)localObject2).mkdirs();
    if (!XWalkDecompressor.extractResource(XWalkEnvironment.getDownloadApkPath(i), (String)localObject1))
      XWalkInitializer.addXWalkInitializeLog("XWalkUpdaterImp", " doFixDex extract faield");
    localObject2 = str1 + File.separator + "classes.dex";
    String str2 = (String)localObject1 + File.separator + "classes.dex";
    str1 = d.cz((String)localObject2);
    localObject1 = str1;
    if (TextUtils.isEmpty(str1))
      localObject1 = "";
    if (!((String)localObject1).equalsIgnoreCase(d.cz(str2)))
    {
      i = 1;
      label236: if (i == 0)
        break label338;
      com.tencent.xweb.util.f.nI(253L);
      XWalkInitializer.addXWalkInitializeLog("XWalkUpdaterImp", " doFixDex dex cruppted");
      if (!com.tencent.xweb.util.b.avl((String)localObject2))
        break label319;
      if (!com.tencent.xweb.util.b.copyFile(str2, (String)localObject2))
        break label300;
      XWalkInitializer.addXWalkInitializeLog("XWalkUpdaterImp", " doFixDex copy dex to replace suc");
      bool = true;
      label282: dVK();
    }
    while (true)
    {
      AppMethodBeat.o(85384);
      break;
      i = 0;
      break label236;
      label300: com.tencent.xweb.util.f.nI(249L);
      XWalkInitializer.addXWalkInitializeLog("XWalkUpdaterImp", " doFixDex copy dex to replace failed");
      bool = false;
      break label282;
      label319: com.tencent.xweb.util.f.nI(250L);
      XWalkInitializer.addXWalkInitializeLog("XWalkUpdaterImp", " doFixDex delete cruppted dex failed");
      bool = false;
      break label282;
      label338: if (dVK())
      {
        com.tencent.xweb.util.f.nI(254L);
        XWalkInitializer.addXWalkInitializeLog("XWalkUpdaterImp", "doFixDex try remove  opt dex suc");
        bool = true;
      }
      else
      {
        XWalkInitializer.addXWalkInitializeLog("XWalkUpdaterImp", "doFixDex try remove  opt dex failed");
        com.tencent.xweb.util.f.nI(255L);
        bool = false;
      }
    }
  }

  public static boolean isBusy()
  {
    AppMethodBeat.i(85388);
    boolean bool;
    if (ASD == null)
    {
      bool = false;
      AppMethodBeat.o(85388);
    }
    while (true)
    {
      return bool;
      bool = com.tencent.xweb.xwalk.b.f.dWf();
      AppMethodBeat.o(85388);
    }
  }

  private static void jD(Context paramContext)
  {
    AppMethodBeat.i(85379);
    if ((paramContext == null) || (paramContext.getApplicationInfo() == null) || (paramContext.getApplicationInfo().dataDir == null))
      AppMethodBeat.o(85379);
    while (true)
    {
      return;
      paramContext = new File(paramContext.getApplicationInfo().dataDir).listFiles();
      if (paramContext != null)
        break;
      AppMethodBeat.o(85379);
    }
    int i = 0;
    int j = 0;
    int k = XWalkEnvironment.getInstalledNewstVersion();
    int m = paramContext.length;
    int n = 0;
    label80: int i1;
    if (n < m)
    {
      i1 = ay(paramContext[n]);
      if ((i1 < 0) || (i1 == k))
        break label270;
      if (i1 >= i)
      {
        j = i;
        i = i1;
      }
    }
    label270: 
    while (true)
    {
      n++;
      break label80;
      if (i1 >= j)
      {
        j = i1;
        continue;
        n = paramContext.length;
        i = 0;
        while (true)
          if (i < n)
          {
            File localFile = paramContext[i];
            i1 = ay(localFile);
            if ((i1 > 0) && (i1 < j) && (i1 != XWalkEnvironment.getAvailableVersion()));
            try
            {
              com.tencent.xweb.util.b.avl(localFile.getAbsolutePath());
              XWalkEnvironment.addXWalkInitializeLog("XWalkUpdaterImp", "cleared version = ".concat(String.valueOf(i1)));
              com.tencent.xweb.util.f.n(577L, 65L, 1L);
              i++;
            }
            catch (Exception localException)
            {
              while (true)
              {
                XWalkEnvironment.addXWalkInitializeLog("XWalkUpdaterImp", " FileUtils.deleteAll failed " + localException.getMessage());
                com.tencent.xweb.util.f.n(577L, 66L, 1L);
              }
            }
          }
        AppMethodBeat.o(85379);
        break;
      }
    }
  }

  public static void rE(boolean paramBoolean)
  {
    AppMethodBeat.i(85385);
    int i = XWalkEnvironment.getAvailableVersion();
    if (i <= 0)
      AppMethodBeat.o(85385);
    while (true)
    {
      return;
      SharedPreferences localSharedPreferences = XWalkEnvironment.getSharedPreferencesForUpdateConfig();
      if (localSharedPreferences == null)
      {
        AppMethodBeat.o(85385);
      }
      else
      {
        long l1 = localSharedPreferences.getLong("CHECK_FILES_MD5_TIME", 0L);
        long l2 = System.currentTimeMillis();
        if ((paramBoolean) || (l2 < l1) || (l2 - l1 > 7200000L))
        {
          localSharedPreferences.edit().putLong("CHECK_FILES_MD5_TIME", l2).commit();
          String str = XWalkEnvironment.getExtractedCoreDir(i);
          boolean bool = XWalkUpdater.checkExtractResFileLengtgAndMd5(XWalkEnvironment.getDownloadResFileListConfig(i), str, i);
          int j;
          if (!bool)
          {
            j = localSharedPreferences.getInt("LAST_CHECK_RES_VERSION", -1);
            localSharedPreferences.edit().putInt("LAST_CHECK_RES_VERSION", -1).commit();
            if (j == i)
              break label299;
            com.tencent.xweb.util.f.nI(77L);
            XWalkEnvironment.addXWalkInitializeLog("", "some res corrupted at first time");
            label175: com.tencent.xweb.util.f.nI(76L);
          }
          paramBoolean = SB(i);
          if (!paramBoolean)
          {
            j = localSharedPreferences.getInt("LAST_CHECK_VERSION", -1);
            localSharedPreferences.edit().putInt("LAST_CHECK_VERSION", -1).commit();
            if (j == i)
              break label311;
            com.tencent.xweb.util.f.nI(64L);
            XWalkEnvironment.addXWalkInitializeLog("", "some files corrupted at first time");
            label244: com.tencent.xweb.util.f.nI(63L);
          }
          if ("true".equalsIgnoreCase(a.iG("disable_res_check", "tools")))
            break label323;
          paramBoolean &= bool;
        }
        while (true)
        {
          if (paramBoolean)
            break label335;
          XWalkEnvironment.setAvailableVersion(-1, null);
          AppMethodBeat.o(85385);
          break;
          AppMethodBeat.o(85385);
          break;
          label299: XWalkEnvironment.addXWalkInitializeLog("", "some res corrupted");
          break label175;
          label311: XWalkEnvironment.addXWalkInitializeLog("", "some files corrupted");
          break label244;
          label323: XWalkEnvironment.addXWalkInitializeLog("", "ignore res files check");
        }
        label335: localSharedPreferences.edit().putInt("LAST_CHECK_VERSION", i).commit();
        Log.i("XWalkUpdaterImp", "checkfiles parse");
        AppMethodBeat.o(85385);
      }
    }
  }

  public void onXWalkInitCancelled()
  {
  }

  public void onXWalkInitCompleted()
  {
  }

  public void onXWalkInitFailed()
  {
  }

  public void onXWalkInitStarted()
  {
  }

  public void onXWalkUpdateCancelled()
  {
    AppMethodBeat.i(85393);
    com.tencent.xweb.xwalk.b.f.dWh();
    b localb = w.dUo();
    if (localb != null)
      localb.aMA();
    AppMethodBeat.o(85393);
  }

  public void onXWalkUpdateCompleted()
  {
    AppMethodBeat.i(85395);
    com.tencent.xweb.xwalk.b.f.dWi();
    b localb = w.dUo();
    if (localb != null)
      localb.aMB();
    AppMethodBeat.o(85395);
  }

  public void onXWalkUpdateFailed(int paramInt)
  {
    AppMethodBeat.i(85394);
    com.tencent.xweb.xwalk.b.f.SF(paramInt);
    b localb = w.dUo();
    if (localb != null)
      localb.aMA();
    AppMethodBeat.o(85394);
  }

  public void onXWalkUpdateProgress(int paramInt)
  {
    AppMethodBeat.i(85392);
    b localb = w.dUo();
    if (localb != null)
      localb.pP(paramInt);
    AppMethodBeat.o(85392);
  }

  public void onXWalkUpdateStarted()
  {
    AppMethodBeat.i(85391);
    com.tencent.xweb.xwalk.b.f.dWg();
    AppMethodBeat.o(85391);
  }

  public final boolean s(HashMap<String, String> paramHashMap)
  {
    AppMethodBeat.i(85390);
    new com.tencent.xweb.xwalk.b.f(this.ASF, paramHashMap).execute(new String[0]);
    AppMethodBeat.o(85390);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.n
 * JD-Core Version:    0.6.2
 */
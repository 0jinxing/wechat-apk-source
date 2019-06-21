package com.tencent.smtt.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.export.external.DexLoader;
import com.tencent.smtt.utils.TbsLog;
import com.tencent.smtt.utils.r;
import java.io.File;
import java.io.IOException;

public class TbsExtensionFunctionManager
{
  public static final String BUGLY_SWITCH_FILE_NAME = "bugly_switch.txt";
  public static final String COOKIE_SWITCH_FILE_NAME = "cookie_switch.txt";
  public static final String DISABLE_GET_APK_VERSION_SWITCH_FILE_NAME = "disable_get_apk_version_switch.txt";
  public static final String DISABLE_UNPREINIT = "disable_unpreinit.txt";
  public static final String DISABLE_USE_HOST_BACKUP_CORE = "disable_use_host_backup_core.txt";
  public static final String SP_KEY_COOKIE_DB_VERSION = "cookie_db_version";
  public static final String SP_NAME_FOR_COOKIE = "cookie_compatiable";
  public static final int SWITCH_BYTE_COOKIE = 1;
  public static final int SWITCH_BYTE_DISABLE_GET_APK_VERSION = 2;
  public static final int SWITCH_BYTE_DISABLE_UNPREINIT = 4;
  public static final int SWITCH_BYTE_DISABLE_USE_HOST_BACKUPCORE = 8;
  public static final String USEX5_FILE_NAME = "usex5.txt";
  private static TbsExtensionFunctionManager b;
  private boolean a;

  public static TbsExtensionFunctionManager getInstance()
  {
    AppMethodBeat.i(64385);
    if (b == null);
    try
    {
      if (b == null)
      {
        localTbsExtensionFunctionManager = new com/tencent/smtt/sdk/TbsExtensionFunctionManager;
        localTbsExtensionFunctionManager.<init>();
        b = localTbsExtensionFunctionManager;
      }
      TbsExtensionFunctionManager localTbsExtensionFunctionManager = b;
      AppMethodBeat.o(64385);
      return localTbsExtensionFunctionManager;
    }
    finally
    {
      AppMethodBeat.o(64385);
    }
  }

  public boolean canUseFunction(Context paramContext, String paramString)
  {
    try
    {
      AppMethodBeat.i(64388);
      File localFile = new java/io/File;
      localFile.<init>(paramContext.getFilesDir(), paramString);
      boolean bool;
      if ((localFile.exists()) && (localFile.isFile()))
      {
        bool = true;
        AppMethodBeat.o(64388);
      }
      while (true)
      {
        return bool;
        bool = false;
        AppMethodBeat.o(64388);
      }
    }
    finally
    {
    }
    throw paramContext;
  }

  public int getRomCookieDBVersion(Context paramContext)
  {
    int i = -1;
    try
    {
      AppMethodBeat.i(64389);
      if (Build.VERSION.SDK_INT >= 11)
      {
        paramContext = paramContext.getSharedPreferences("cookie_compatiable", 4);
        if (paramContext != null)
          break label49;
        AppMethodBeat.o(64389);
      }
      while (true)
      {
        return i;
        paramContext = paramContext.getSharedPreferences("cookie_compatiable", 0);
        break;
        label49: i = paramContext.getInt("cookie_db_version", -1);
        AppMethodBeat.o(64389);
      }
    }
    finally
    {
    }
    throw paramContext;
  }

  public void initTbsBuglyIfNeed(Context paramContext)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(64386);
        if (this.a)
        {
          AppMethodBeat.o(64386);
          return;
        }
        if (!canUseFunction(paramContext, "bugly_switch.txt"))
        {
          TbsLog.i("TbsExtensionFunMana", "bugly is forbiden!!");
          AppMethodBeat.o(64386);
          continue;
        }
      }
      finally
      {
      }
      if (TbsShareManager.isThirdPartyApp(paramContext));
      for (Object localObject1 = TbsShareManager.c(paramContext); ; localObject1 = ((File)localObject1).getAbsolutePath())
      {
        if (!TextUtils.isEmpty((CharSequence)localObject1))
          break label143;
        TbsLog.i("TbsExtensionFunMana", "bugly init ,corePath is null");
        AppMethodBeat.o(64386);
        break;
        localObject1 = an.a().r(paramContext);
        if (localObject1 == null)
          TbsLog.i("TbsExtensionFunMana", "getTbsCoreShareDir is null");
        if ((((File)localObject1).listFiles() == null) || (((File)localObject1).listFiles().length <= 0))
        {
          TbsLog.i("TbsExtensionFunMana", "getTbsCoreShareDir is empty!");
          AppMethodBeat.o(64386);
          break;
        }
      }
      label143: Object localObject2 = an.a().r(paramContext);
      if (localObject2 == null)
      {
        TbsLog.i("TbsExtensionFunMana", "bugly init ,optDir is null");
        AppMethodBeat.o(64386);
      }
      else
      {
        Object localObject3 = new java/io/File;
        ((File)localObject3).<init>((String)localObject1, "tbs_bugly_dex.jar");
        try
        {
          DexLoader localDexLoader = new com/tencent/smtt/export/external/DexLoader;
          Object localObject4 = ((File)localObject3).getParent();
          localObject3 = ((File)localObject3).getAbsolutePath();
          localObject2 = ((File)localObject2).getAbsolutePath();
          localDexLoader.<init>((String)localObject4, paramContext, new String[] { localObject3 }, (String)localObject2, null);
          localObject4 = localDexLoader.loadClass("com.tencent.smtt.tbs.bugly.TBSBuglyManager");
          int i = WebView.getTbsSDKVersion(paramContext);
          int j = WebView.getTbsCoreVersion(paramContext);
          r.a((Class)localObject4, "initBugly", new Class[] { Context.class, String.class, String.class, String.class }, new Object[] { paramContext, localObject1, String.valueOf(i), String.valueOf(j) });
          this.a = true;
          TbsLog.i("TbsExtensionFunMana", "initTbsBuglyIfNeed success!");
          AppMethodBeat.o(64386);
        }
        catch (Throwable paramContext)
        {
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>("bugly init ,try init bugly failed(need new core):");
          TbsLog.i("TbsExtensionFunMana", Log.getStackTraceString(paramContext));
          AppMethodBeat.o(64386);
        }
      }
    }
  }

  public boolean setFunctionEnable(Context paramContext, String paramString, boolean paramBoolean)
  {
    boolean bool = false;
    while (true)
    {
      File localFile;
      try
      {
        AppMethodBeat.i(64387);
        if (paramContext == null)
        {
          AppMethodBeat.o(64387);
          paramBoolean = bool;
          return paramBoolean;
        }
        localFile = new java/io/File;
        localFile.<init>(paramContext.getFilesDir(), paramString);
        if (paramBoolean)
        {
          paramBoolean = localFile.exists();
          if (paramBoolean)
            break label157;
          try
          {
            paramBoolean = localFile.createNewFile();
            if (!paramBoolean)
              break label157;
            AppMethodBeat.o(64387);
            paramBoolean = true;
          }
          catch (IOException paramContext)
          {
            TbsLog.e("TbsExtensionFunMana", "setFunctionEnable,createNewFile fail:".concat(String.valueOf(paramString)));
            AppMethodBeat.o(64387);
            paramBoolean = bool;
          }
          continue;
        }
      }
      finally
      {
      }
      if (localFile.exists())
      {
        if (localFile.delete())
        {
          AppMethodBeat.o(64387);
          paramBoolean = true;
        }
        else
        {
          TbsLog.e("TbsExtensionFunMana", "setFunctionEnable,file.delete fail:".concat(String.valueOf(paramString)));
          AppMethodBeat.o(64387);
          paramBoolean = bool;
        }
      }
      else
      {
        label157: AppMethodBeat.o(64387);
        paramBoolean = true;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.TbsExtensionFunctionManager
 * JD-Core Version:    0.6.2
 */
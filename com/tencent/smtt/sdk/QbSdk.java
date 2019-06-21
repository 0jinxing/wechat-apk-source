package com.tencent.smtt.sdk;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebIconDatabase;
import android.webkit.WebStorage;
import android.webkit.WebViewDatabase;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.export.external.DexLoader;
import com.tencent.smtt.export.external.interfaces.IX5WebViewBase;
import com.tencent.smtt.sdk.a.d;
import com.tencent.smtt.utils.TbsLog;
import com.tencent.smtt.utils.TbsLogClient;
import com.tencent.smtt.utils.b;
import com.tencent.smtt.utils.r;
import com.tencent.smtt.utils.t;
import java.io.File;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@SuppressLint({"NewApi"})
public class QbSdk
{
  private static String A;
  private static boolean B = false;
  private static boolean C = false;
  private static TbsListener D;
  private static TbsListener E;
  public static final int EXTENSION_INIT_FAILURE = -99999;
  private static boolean F = false;
  private static boolean G = false;
  public static String KEY_SET_SENDREQUEST_AND_UPLOAD;
  public static final String LOGIN_TYPE_KEY_PARTNER_CALL_POS = "PosID";
  public static final String LOGIN_TYPE_KEY_PARTNER_ID = "ChannelID";
  public static final String PARAM_KEY_FEATUREID = "param_key_featureid";
  public static final String PARAM_KEY_FUNCTIONID = "param_key_functionid";
  public static final String PARAM_KEY_POSITIONID = "param_key_positionid";
  public static final int QBMODE = 2;
  public static final String SVNVERSION = "jnizz";
  public static final int TBSMODE = 1;
  public static final String TID_QQNumber_Prefix = "QQ:";
  public static final int VERSION = 1;
  static boolean a;
  static boolean b;
  static boolean c;
  static String d;
  static boolean e;
  static long f;
  static long g;
  static Object h;
  static boolean i;
  static boolean j;
  static boolean k;
  static volatile boolean l;
  static TbsListener m;
  public static boolean mDisableUseHostBackupCore;
  static Map<String, Object> n;
  private static int o;
  private static String p;
  private static Class<?> q;
  private static Object r;
  private static boolean s;
  public static boolean sIsVersionPrinted;
  private static String[] t;
  private static String u;
  private static String v;
  private static boolean w;
  private static int x;
  private static int y;
  private static String z;

  static
  {
    AppMethodBeat.i(64056);
    sIsVersionPrinted = false;
    o = 0;
    p = "";
    q = null;
    r = null;
    a = false;
    b = false;
    c = true;
    s = false;
    u = "NULL";
    v = "UNKNOWN";
    e = false;
    f = 0L;
    g = 0L;
    h = new Object();
    w = false;
    i = true;
    j = true;
    k = false;
    x = 0;
    y = 170;
    z = null;
    A = null;
    l = a;
    mDisableUseHostBackupCore = false;
    B = false;
    C = true;
    D = null;
    E = null;
    F = false;
    G = false;
    m = new n();
    KEY_SET_SENDREQUEST_AND_UPLOAD = "SET_SENDREQUEST_AND_UPLOAD";
    n = null;
    AppMethodBeat.o(64056);
  }

  static Bundle a(Context paramContext, Bundle paramBundle)
  {
    AppMethodBeat.i(64004);
    if (!a(paramContext))
    {
      TbsLogReport.getInstance(paramContext).setInstallErrorCode(216, "initForPatch return false!");
      paramContext = null;
      AppMethodBeat.o(64004);
    }
    while (true)
    {
      return paramContext;
      paramBundle = r.a(r, "incrUpdate", new Class[] { Context.class, Bundle.class }, new Object[] { paramContext, paramBundle });
      if (paramBundle != null)
      {
        paramContext = (Bundle)paramBundle;
        AppMethodBeat.o(64004);
      }
      else
      {
        TbsLogReport.getInstance(paramContext).setInstallErrorCode(216, "incrUpdate return null!");
        paramContext = null;
        AppMethodBeat.o(64004);
      }
    }
  }

  static Object a(Context paramContext, String paramString, Bundle paramBundle)
  {
    AppMethodBeat.i(64052);
    if (!a(paramContext))
    {
      paramContext = Integer.valueOf(-99999);
      AppMethodBeat.o(64052);
    }
    while (true)
    {
      return paramContext;
      paramContext = r.a(r, "miscCall", new Class[] { String.class, Bundle.class }, new Object[] { paramString, paramBundle });
      if (paramContext != null)
      {
        AppMethodBeat.o(64052);
      }
      else
      {
        paramContext = null;
        AppMethodBeat.o(64052);
      }
    }
  }

  static String a()
  {
    return p;
  }

  static void a(Context paramContext, String paramString)
  {
    try
    {
      AppMethodBeat.i(64018);
      if (a)
        AppMethodBeat.o(64018);
      while (true)
      {
        return;
        a = true;
        v = "forceSysWebViewInner: ".concat(String.valueOf(paramString));
        paramString = new java/lang/StringBuilder;
        paramString.<init>("QbSdk.SysWebViewForcedInner...");
        TbsLog.e("QbSdk", v);
        TbsCoreLoadStat localTbsCoreLoadStat = TbsCoreLoadStat.getInstance();
        paramString = new java/lang/Throwable;
        paramString.<init>(v);
        localTbsCoreLoadStat.a(paramContext, 401, paramString);
        AppMethodBeat.o(64018);
      }
    }
    finally
    {
    }
    throw paramContext;
  }

  static boolean a(Context paramContext)
  {
    AppMethodBeat.i(64001);
    try
    {
      Object localObject1 = q;
      if (localObject1 != null)
      {
        AppMethodBeat.o(64001);
        bool = true;
      }
      while (true)
      {
        return bool;
        Object localObject2 = an.a().r(paramContext);
        if (localObject2 == null)
        {
          TbsLog.e("QbSdk", "QbSdk initExtension (false) optDir == null");
          AppMethodBeat.o(64001);
          bool = false;
        }
        else
        {
          localObject1 = new java/io/File;
          ((File)localObject1).<init>((File)localObject2, "tbs_sdk_extension_dex.jar");
          if (!((File)localObject1).exists())
          {
            TbsLog.e("QbSdk", "QbSdk initExtension (false) dexFile.exists()=false", true);
            AppMethodBeat.o(64001);
            bool = false;
          }
          else
          {
            Object localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>("new DexLoader #3 dexFile is ");
            TbsLog.i("QbSdk", ((File)localObject1).getAbsolutePath());
            bv.a().a(paramContext);
            DexLoader localDexLoader = new com/tencent/smtt/export/external/DexLoader;
            localObject3 = ((File)localObject1).getParent();
            String str = ((File)localObject1).getAbsolutePath();
            localObject2 = ((File)localObject2).getAbsolutePath();
            localDexLoader.<init>((String)localObject3, paramContext, new String[] { str }, (String)localObject2, null);
            q = localDexLoader.loadClass("com.tencent.tbs.sdk.extension.TbsSDKExtension");
            loadTBSSDKExtension(paramContext, ((File)localObject1).getParent());
            AppMethodBeat.o(64001);
            bool = true;
          }
        }
      }
    }
    catch (Throwable paramContext)
    {
      while (true)
      {
        TbsLog.e("QbSdk", "initExtension sys WebView: " + Log.getStackTraceString(paramContext));
        AppMethodBeat.o(64001);
        boolean bool = false;
      }
    }
  }

  static boolean a(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(64005);
    boolean bool = a(paramContext, paramInt, 20000);
    AppMethodBeat.o(64005);
    return bool;
  }

  static boolean a(Context paramContext, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(64006);
    boolean bool;
    if ((n != null) && (n.containsKey(KEY_SET_SENDREQUEST_AND_UPLOAD)) && (n.get(KEY_SET_SENDREQUEST_AND_UPLOAD).equals("false")))
    {
      TbsLog.i("QbSdk", "[QbSdk.isX5Disabled] -- SET_SENDREQUEST_AND_UPLOAD is false");
      AppMethodBeat.o(64006);
      bool = true;
    }
    while (true)
    {
      return bool;
      if (!c(paramContext))
      {
        AppMethodBeat.o(64006);
        bool = true;
      }
      else
      {
        paramContext = r.a(r, "isX5Disabled", new Class[] { Integer.TYPE, Integer.TYPE, Integer.TYPE }, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(43644), Integer.valueOf(paramInt2) });
        if (paramContext != null)
        {
          bool = ((Boolean)paramContext).booleanValue();
          AppMethodBeat.o(64006);
        }
        else
        {
          paramContext = r.a(r, "isX5Disabled", new Class[] { Integer.TYPE, Integer.TYPE }, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(43644) });
          if (paramContext != null)
          {
            bool = ((Boolean)paramContext).booleanValue();
            AppMethodBeat.o(64006);
          }
          else
          {
            AppMethodBeat.o(64006);
            bool = true;
          }
        }
      }
    }
  }

  @SuppressLint({"NewApi"})
  private static boolean a(Context paramContext, boolean paramBoolean)
  {
    AppMethodBeat.i(63997);
    TbsLog.initIfNeed(paramContext);
    if (!sIsVersionPrinted)
    {
      TbsLog.i("QbSdk", "svn revision: jnizz; SDK_VERSION_CODE: 43644; SDK_VERSION_NAME: 4.3.0.1057");
      sIsVersionPrinted = true;
    }
    if ((a) && (!paramBoolean))
    {
      TbsLog.e("QbSdk", "QbSdk init: " + v, false);
      TbsCoreLoadStat.getInstance().a(paramContext, 414, new Throwable(v));
      AppMethodBeat.o(63997);
      paramBoolean = false;
    }
    Object localObject4;
    label543: Object localObject3;
    while (true)
    {
      return paramBoolean;
      if (b)
      {
        TbsLog.e("QbSdk", "QbSdk init mIsSysWebViewForcedByOuter = true", true);
        TbsCoreLoadStat.getInstance().a(paramContext, 402, new Throwable(u));
        AppMethodBeat.o(63997);
        paramBoolean = false;
      }
      else
      {
        if (!C)
          d(paramContext);
        int i2;
        try
        {
          localObject1 = an.a().r(paramContext);
          Object localObject2;
          if (localObject1 == null)
          {
            TbsLog.e("QbSdk", "QbSdk init (false) optDir == null");
            localObject1 = TbsCoreLoadStat.getInstance();
            localObject2 = new java/lang/Throwable;
            ((Throwable)localObject2).<init>("QbSdk.init (false) TbsCoreShareDir is null");
            ((TbsCoreLoadStat)localObject1).a(paramContext, 312, (Throwable)localObject2);
            AppMethodBeat.o(63997);
            paramBoolean = false;
            continue;
          }
          if (TbsShareManager.isThirdPartyApp(paramContext))
            if ((o != 0) && (o != TbsShareManager.d(paramContext)))
            {
              q = null;
              r = null;
              TbsLog.e("QbSdk", "QbSdk init (false) ERROR_UNMATCH_TBSCORE_VER_THIRDPARTY!");
              localObject4 = TbsCoreLoadStat.getInstance();
              localObject1 = new java/lang/Throwable;
              localObject2 = new java/lang/StringBuilder;
              ((StringBuilder)localObject2).<init>("sTbsVersion: ");
              ((Throwable)localObject1).<init>(o + "; AvailableTbsCoreVersion: " + TbsShareManager.d(paramContext));
              ((TbsCoreLoadStat)localObject4).a(paramContext, 302, (Throwable)localObject1);
              AppMethodBeat.o(63997);
              paramBoolean = false;
              continue;
            }
          for (o = TbsShareManager.d(paramContext); ; o = i2)
          {
            localObject2 = q;
            if (localObject2 == null)
              break label543;
            AppMethodBeat.o(63997);
            paramBoolean = true;
            break;
            if (o != 0)
            {
              int i1 = an.a().a(true, paramContext);
              i2 = i1;
              if (o == i1)
                continue;
              q = null;
              r = null;
              TbsLog.e("QbSdk", "QbSdk init (false) not isThirdPartyApp tbsCoreInstalledVer=".concat(String.valueOf(i1)), true);
              localObject2 = new java/lang/StringBuilder;
              ((StringBuilder)localObject2).<init>("QbSdk init (false) not isThirdPartyApp sTbsVersion=");
              TbsLog.e("QbSdk", o, true);
              localObject1 = TbsCoreLoadStat.getInstance();
              localObject4 = new java/lang/Throwable;
              localObject2 = new java/lang/StringBuilder;
              ((StringBuilder)localObject2).<init>("sTbsVersion: ");
              ((Throwable)localObject4).<init>(o + "; tbsCoreInstalledVer: " + i1);
              ((TbsCoreLoadStat)localObject1).a(paramContext, 303, (Throwable)localObject4);
              AppMethodBeat.o(63997);
              paramBoolean = false;
              break;
            }
            i2 = 0;
          }
        }
        catch (Throwable localThrowable)
        {
          TbsLog.e("QbSdk", "QbSdk init Throwable: " + Log.getStackTraceString(localThrowable));
          TbsCoreLoadStat.getInstance().a(paramContext, 306, localThrowable);
          AppMethodBeat.o(63997);
          paramBoolean = false;
        }
        continue;
        if (TbsShareManager.isThirdPartyApp(paramContext))
          if (TbsShareManager.j(paramContext))
          {
            localObject3 = new java/io/File;
            ((File)localObject3).<init>(TbsShareManager.c(paramContext), "tbs_sdk_extension_dex.jar");
            label572: paramBoolean = ((File)localObject3).exists();
            if (paramBoolean)
              break label838;
          }
        try
        {
          TbsLog.e("QbSdk", "QbSdk init (false) tbs_sdk_extension_dex.jar is not exist!");
          i2 = an.a().j(paramContext);
          localObject1 = new java/io/File;
          ((File)localObject1).<init>(((File)localObject3).getParentFile(), "tbs_jars_fusion_dex.jar");
          if (((File)localObject1).exists())
          {
            if (i2 > 0)
            {
              localObject1 = TbsCoreLoadStat.getInstance();
              localObject3 = new java/lang/Exception;
              ((Exception)localObject3).<init>("tbs_sdk_extension_dex not exist(with fusion dex)!".concat(String.valueOf(i2)));
              ((TbsCoreLoadStat)localObject1).a(paramContext, 4131, (Throwable)localObject3);
            }
            while (true)
            {
              AppMethodBeat.o(63997);
              paramBoolean = false;
              break;
              localObject3 = TbsCoreLoadStat.getInstance();
              localObject1 = new java/lang/Throwable;
              ((Throwable)localObject1).<init>("isShareTbsCoreAvailable false!");
              ((TbsCoreLoadStat)localObject3).a(paramContext, 304, (Throwable)localObject1);
              AppMethodBeat.o(63997);
              paramBoolean = false;
              break;
              localObject3 = new File(an.a().r(paramContext), "tbs_sdk_extension_dex.jar");
              break label572;
              localObject3 = TbsCoreLoadStat.getInstance();
              localObject1 = new java/lang/Exception;
              ((Exception)localObject1).<init>("tbs_sdk_extension_dex not exist(with fusion dex)!".concat(String.valueOf(i2)));
              ((TbsCoreLoadStat)localObject3).a(paramContext, 4132, (Throwable)localObject1);
            }
          }
        }
        catch (Throwable paramContext)
        {
          while (true)
          {
            continue;
            if (i2 > 0)
            {
              localObject3 = TbsCoreLoadStat.getInstance();
              localObject1 = new java/lang/Exception;
              ((Exception)localObject1).<init>("tbs_sdk_extension_dex not exist(without fusion dex)!".concat(String.valueOf(i2)));
              ((TbsCoreLoadStat)localObject3).a(paramContext, 4121, (Throwable)localObject1);
            }
            else
            {
              localObject3 = TbsCoreLoadStat.getInstance();
              localObject1 = new java/lang/Exception;
              ((Exception)localObject1).<init>("tbs_sdk_extension_dex not exist(without fusion dex)!".concat(String.valueOf(i2)));
              ((TbsCoreLoadStat)localObject3).a(paramContext, 4122, (Throwable)localObject1);
            }
          }
        }
      }
    }
    label838: if (TbsShareManager.getHostCorePathAppDefined() != null);
    for (Object localObject1 = TbsShareManager.getHostCorePathAppDefined(); ; localObject1 = ((File)localObject1).getAbsolutePath())
    {
      TbsLog.i("QbSdk", "QbSdk init optDirExtension #1 is ".concat(String.valueOf(localObject1)));
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>("new DexLoader #1 dexFile is ");
      TbsLog.i("QbSdk", ((File)localObject3).getAbsolutePath());
      bv.a().a(paramContext);
      localObject4 = new com/tencent/smtt/export/external/DexLoader;
      ((DexLoader)localObject4).<init>(((File)localObject3).getParent(), paramContext, new String[] { ((File)localObject3).getAbsolutePath() }, (String)localObject1, null);
      q = ((DexLoader)localObject4).loadClass("com.tencent.tbs.sdk.extension.TbsSDKExtension");
      loadTBSSDKExtension(paramContext, ((File)localObject3).getParent());
      localObject4 = r;
      localObject1 = b.a;
      String str1 = b.b;
      String str2 = b.c;
      localObject3 = b.d;
      r.a(localObject4, "putInfo", new Class[] { String.class, String.class, String.class, String.class }, new Object[] { localObject1, str1, str2, localObject3 });
      r.a(r, "setClientVersion", new Class[] { Integer.TYPE }, new Object[] { Integer.valueOf(1) });
      AppMethodBeat.o(63997);
      paramBoolean = true;
      break;
    }
  }

  // ERROR //
  static boolean a(Context paramContext, boolean paramBoolean1, boolean paramBoolean2)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: iconst_0
    //   3: istore 4
    //   5: iconst_0
    //   6: istore 5
    //   8: iconst_0
    //   9: istore_2
    //   10: ldc_w 470
    //   13: invokestatic 93	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   16: aload_0
    //   17: invokestatic 475	com/tencent/smtt/sdk/TbsPVConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsPVConfig;
    //   20: invokevirtual 479	com/tencent/smtt/sdk/TbsPVConfig:getDisabledCoreVersion	()I
    //   23: istore 6
    //   25: iload 6
    //   27: ifeq +33 -> 60
    //   30: iload 6
    //   32: invokestatic 272	com/tencent/smtt/sdk/an:a	()Lcom/tencent/smtt/sdk/an;
    //   35: aload_0
    //   36: invokevirtual 429	com/tencent/smtt/sdk/an:j	(Landroid/content/Context;)I
    //   39: if_icmpne +21 -> 60
    //   42: ldc 243
    //   44: ldc_w 481
    //   47: invokestatic 255	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   50: ldc_w 470
    //   53: invokestatic 177	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   56: iload_2
    //   57: istore_1
    //   58: iload_1
    //   59: ireturn
    //   60: aload_0
    //   61: invokestatic 392	com/tencent/smtt/sdk/TbsShareManager:isThirdPartyApp	(Landroid/content/Context;)Z
    //   64: ifeq +31 -> 95
    //   67: aload_0
    //   68: invokestatic 483	com/tencent/smtt/sdk/TbsShareManager:i	(Landroid/content/Context;)Z
    //   71: ifne +24 -> 95
    //   74: invokestatic 260	com/tencent/smtt/sdk/TbsCoreLoadStat:getInstance	()Lcom/tencent/smtt/sdk/TbsCoreLoadStat;
    //   77: aload_0
    //   78: sipush 302
    //   81: invokevirtual 486	com/tencent/smtt/sdk/TbsCoreLoadStat:a	(Landroid/content/Context;I)V
    //   84: ldc_w 470
    //   87: invokestatic 177	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   90: iload_2
    //   91: istore_1
    //   92: goto -34 -> 58
    //   95: aload_0
    //   96: iload_1
    //   97: invokestatic 488	com/tencent/smtt/sdk/QbSdk:a	(Landroid/content/Context;Z)Z
    //   100: ifne +22 -> 122
    //   103: ldc 243
    //   105: ldc_w 490
    //   108: invokestatic 255	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   111: ldc_w 470
    //   114: invokestatic 177	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   117: iload_2
    //   118: istore_1
    //   119: goto -61 -> 58
    //   122: getstatic 105	com/tencent/smtt/sdk/QbSdk:r	Ljava/lang/Object;
    //   125: ldc_w 492
    //   128: iconst_1
    //   129: anewarray 199	java/lang/Class
    //   132: dup
    //   133: iconst_0
    //   134: getstatic 363	java/lang/Integer:TYPE	Ljava/lang/Class;
    //   137: aastore
    //   138: iconst_1
    //   139: anewarray 4	java/lang/Object
    //   142: dup
    //   143: iconst_0
    //   144: ldc_w 364
    //   147: invokestatic 218	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   150: aastore
    //   151: invokestatic 208	com/tencent/smtt/utils/r:a	(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    //   154: astore 7
    //   156: aload 7
    //   158: ifnull +915 -> 1073
    //   161: aload 7
    //   163: instanceof 222
    //   166: ifeq +28 -> 194
    //   169: aload 7
    //   171: checkcast 222	java/lang/String
    //   174: ldc_w 494
    //   177: invokevirtual 498	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   180: ifeq +14 -> 194
    //   183: ldc_w 470
    //   186: invokestatic 177	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   189: iload_2
    //   190: istore_1
    //   191: goto -133 -> 58
    //   194: aload 7
    //   196: instanceof 203
    //   199: ifne +45 -> 244
    //   202: invokestatic 260	com/tencent/smtt/sdk/TbsCoreLoadStat:getInstance	()Lcom/tencent/smtt/sdk/TbsCoreLoadStat;
    //   205: aload_0
    //   206: sipush 330
    //   209: new 262	java/lang/Throwable
    //   212: dup
    //   213: aload 7
    //   215: invokestatic 230	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   218: invokespecial 263	java/lang/Throwable:<init>	(Ljava/lang/String;)V
    //   221: invokevirtual 266	com/tencent/smtt/sdk/TbsCoreLoadStat:a	(Landroid/content/Context;ILjava/lang/Throwable;)V
    //   224: ldc_w 500
    //   227: ldc_w 502
    //   230: invokestatic 255	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   233: ldc_w 470
    //   236: invokestatic 177	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   239: iload_2
    //   240: istore_1
    //   241: goto -183 -> 58
    //   244: aload 7
    //   246: checkcast 203	android/os/Bundle
    //   249: astore 8
    //   251: aload 8
    //   253: invokevirtual 505	android/os/Bundle:isEmpty	()Z
    //   256: ifeq +45 -> 301
    //   259: invokestatic 260	com/tencent/smtt/sdk/TbsCoreLoadStat:getInstance	()Lcom/tencent/smtt/sdk/TbsCoreLoadStat;
    //   262: aload_0
    //   263: sipush 331
    //   266: new 262	java/lang/Throwable
    //   269: dup
    //   270: aload 7
    //   272: invokestatic 230	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   275: invokespecial 263	java/lang/Throwable:<init>	(Ljava/lang/String;)V
    //   278: invokevirtual 266	com/tencent/smtt/sdk/TbsCoreLoadStat:a	(Landroid/content/Context;ILjava/lang/Throwable;)V
    //   281: ldc_w 500
    //   284: ldc_w 507
    //   287: invokestatic 255	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   290: ldc_w 470
    //   293: invokestatic 177	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   296: iload_2
    //   297: istore_1
    //   298: goto -240 -> 58
    //   301: aload 8
    //   303: ldc_w 509
    //   306: iconst_m1
    //   307: invokevirtual 513	android/os/Bundle:getInt	(Ljava/lang/String;I)I
    //   310: istore 6
    //   312: iload 6
    //   314: ifne +181 -> 495
    //   317: iconst_1
    //   318: istore_1
    //   319: aload_0
    //   320: invokestatic 392	com/tencent/smtt/sdk/TbsShareManager:isThirdPartyApp	(Landroid/content/Context;)Z
    //   323: ifeq +177 -> 500
    //   326: aload_0
    //   327: invokestatic 395	com/tencent/smtt/sdk/TbsShareManager:d	(Landroid/content/Context;)I
    //   330: invokestatic 517	com/tencent/smtt/sdk/o:a	(I)V
    //   333: aload_0
    //   334: invokestatic 395	com/tencent/smtt/sdk/TbsShareManager:d	(Landroid/content/Context;)I
    //   337: invokestatic 412	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   340: astore 7
    //   342: aload 7
    //   344: putstatic 101	com/tencent/smtt/sdk/QbSdk:p	Ljava/lang/String;
    //   347: aload 7
    //   349: invokevirtual 520	java/lang/String:length	()I
    //   352: iconst_5
    //   353: if_icmpne +25 -> 378
    //   356: new 236	java/lang/StringBuilder
    //   359: dup
    //   360: ldc_w 522
    //   363: invokespecial 241	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   366: getstatic 101	com/tencent/smtt/sdk/QbSdk:p	Ljava/lang/String;
    //   369: invokevirtual 247	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   372: invokevirtual 250	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   375: putstatic 101	com/tencent/smtt/sdk/QbSdk:p	Ljava/lang/String;
    //   378: getstatic 101	com/tencent/smtt/sdk/QbSdk:p	Ljava/lang/String;
    //   381: invokevirtual 520	java/lang/String:length	()I
    //   384: bipush 6
    //   386: if_icmpeq +8 -> 394
    //   389: ldc 99
    //   391: putstatic 101	com/tencent/smtt/sdk/QbSdk:p	Ljava/lang/String;
    //   394: aload 8
    //   396: ldc_w 524
    //   399: invokevirtual 528	android/os/Bundle:getStringArray	(Ljava/lang/String;)[Ljava/lang/String;
    //   402: putstatic 530	com/tencent/smtt/sdk/QbSdk:t	[Ljava/lang/String;
    //   405: getstatic 530	com/tencent/smtt/sdk/QbSdk:t	[Ljava/lang/String;
    //   408: instanceof 531
    //   411: ifne +360 -> 771
    //   414: invokestatic 260	com/tencent/smtt/sdk/TbsCoreLoadStat:getInstance	()Lcom/tencent/smtt/sdk/TbsCoreLoadStat;
    //   417: aload_0
    //   418: sipush 307
    //   421: new 262	java/lang/Throwable
    //   424: dup
    //   425: new 236	java/lang/StringBuilder
    //   428: dup
    //   429: ldc_w 533
    //   432: invokespecial 241	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   435: getstatic 530	com/tencent/smtt/sdk/QbSdk:t	[Ljava/lang/String;
    //   438: invokevirtual 536	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   441: invokevirtual 250	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   444: invokespecial 263	java/lang/Throwable:<init>	(Ljava/lang/String;)V
    //   447: invokevirtual 266	com/tencent/smtt/sdk/TbsCoreLoadStat:a	(Landroid/content/Context;ILjava/lang/Throwable;)V
    //   450: ldc_w 470
    //   453: invokestatic 177	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   456: iload_2
    //   457: istore_1
    //   458: goto -400 -> 58
    //   461: astore 7
    //   463: ldc 243
    //   465: new 236	java/lang/StringBuilder
    //   468: dup
    //   469: ldc_w 538
    //   472: invokespecial 241	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   475: aload 7
    //   477: invokevirtual 539	java/lang/Exception:toString	()Ljava/lang/String;
    //   480: invokevirtual 247	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   483: invokevirtual 250	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   486: invokestatic 255	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   489: iconst_m1
    //   490: istore 6
    //   492: goto -180 -> 312
    //   495: iconst_0
    //   496: istore_1
    //   497: goto -178 -> 319
    //   500: getstatic 544	android/os/Build$VERSION:SDK_INT	I
    //   503: bipush 12
    //   505: if_icmplt +69 -> 574
    //   508: aload 8
    //   510: ldc_w 546
    //   513: ldc_w 522
    //   516: invokevirtual 550	android/os/Bundle:getString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   519: putstatic 101	com/tencent/smtt/sdk/QbSdk:p	Ljava/lang/String;
    //   522: getstatic 101	com/tencent/smtt/sdk/QbSdk:p	Ljava/lang/String;
    //   525: invokestatic 554	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   528: putstatic 97	com/tencent/smtt/sdk/QbSdk:o	I
    //   531: getstatic 97	com/tencent/smtt/sdk/QbSdk:o	I
    //   534: invokestatic 517	com/tencent/smtt/sdk/o:a	(I)V
    //   537: getstatic 97	com/tencent/smtt/sdk/QbSdk:o	I
    //   540: ifne +83 -> 623
    //   543: invokestatic 260	com/tencent/smtt/sdk/TbsCoreLoadStat:getInstance	()Lcom/tencent/smtt/sdk/TbsCoreLoadStat;
    //   546: aload_0
    //   547: sipush 307
    //   550: new 262	java/lang/Throwable
    //   553: dup
    //   554: ldc_w 556
    //   557: invokespecial 263	java/lang/Throwable:<init>	(Ljava/lang/String;)V
    //   560: invokevirtual 266	com/tencent/smtt/sdk/TbsCoreLoadStat:a	(Landroid/content/Context;ILjava/lang/Throwable;)V
    //   563: ldc_w 470
    //   566: invokestatic 177	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   569: iload_2
    //   570: istore_1
    //   571: goto -513 -> 58
    //   574: aload 8
    //   576: ldc_w 546
    //   579: invokevirtual 558	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   582: astore 7
    //   584: aload 7
    //   586: putstatic 101	com/tencent/smtt/sdk/QbSdk:p	Ljava/lang/String;
    //   589: aload 7
    //   591: ifnonnull -69 -> 522
    //   594: ldc_w 522
    //   597: putstatic 101	com/tencent/smtt/sdk/QbSdk:p	Ljava/lang/String;
    //   600: goto -78 -> 522
    //   603: astore 7
    //   605: ldc_w 522
    //   608: putstatic 101	com/tencent/smtt/sdk/QbSdk:p	Ljava/lang/String;
    //   611: goto -89 -> 522
    //   614: astore 7
    //   616: iconst_0
    //   617: putstatic 97	com/tencent/smtt/sdk/QbSdk:o	I
    //   620: goto -89 -> 531
    //   623: getstatic 97	com/tencent/smtt/sdk/QbSdk:o	I
    //   626: ifle +15 -> 641
    //   629: iload_3
    //   630: istore 9
    //   632: getstatic 97	com/tencent/smtt/sdk/QbSdk:o	I
    //   635: sipush 25442
    //   638: if_icmple +15 -> 653
    //   641: getstatic 97	com/tencent/smtt/sdk/QbSdk:o	I
    //   644: sipush 25472
    //   647: if_icmpne +93 -> 740
    //   650: iload_3
    //   651: istore 9
    //   653: iload 9
    //   655: ifeq -261 -> 394
    //   658: ldc_w 560
    //   661: new 236	java/lang/StringBuilder
    //   664: dup
    //   665: ldc_w 562
    //   668: invokespecial 241	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   671: getstatic 97	com/tencent/smtt/sdk/QbSdk:o	I
    //   674: invokevirtual 402	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   677: invokevirtual 250	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   680: invokestatic 255	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   683: invokestatic 272	com/tencent/smtt/sdk/an:a	()Lcom/tencent/smtt/sdk/an;
    //   686: aload_0
    //   687: invokevirtual 275	com/tencent/smtt/sdk/an:r	(Landroid/content/Context;)Ljava/io/File;
    //   690: invokestatic 567	com/tencent/smtt/utils/k:b	(Ljava/io/File;)V
    //   693: invokestatic 260	com/tencent/smtt/sdk/TbsCoreLoadStat:getInstance	()Lcom/tencent/smtt/sdk/TbsCoreLoadStat;
    //   696: aload_0
    //   697: sipush 307
    //   700: new 262	java/lang/Throwable
    //   703: dup
    //   704: new 236	java/lang/StringBuilder
    //   707: dup
    //   708: ldc_w 562
    //   711: invokespecial 241	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   714: getstatic 97	com/tencent/smtt/sdk/QbSdk:o	I
    //   717: invokevirtual 402	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   720: invokevirtual 250	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   723: invokespecial 263	java/lang/Throwable:<init>	(Ljava/lang/String;)V
    //   726: invokevirtual 266	com/tencent/smtt/sdk/TbsCoreLoadStat:a	(Landroid/content/Context;ILjava/lang/Throwable;)V
    //   729: ldc_w 470
    //   732: invokestatic 177	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   735: iload_2
    //   736: istore_1
    //   737: goto -679 -> 58
    //   740: iconst_0
    //   741: istore 9
    //   743: goto -90 -> 653
    //   746: astore 8
    //   748: invokestatic 260	com/tencent/smtt/sdk/TbsCoreLoadStat:getInstance	()Lcom/tencent/smtt/sdk/TbsCoreLoadStat;
    //   751: aload_0
    //   752: sipush 329
    //   755: aload 8
    //   757: invokevirtual 266	com/tencent/smtt/sdk/TbsCoreLoadStat:a	(Landroid/content/Context;ILjava/lang/Throwable;)V
    //   760: ldc_w 470
    //   763: invokestatic 177	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   766: iload_2
    //   767: istore_1
    //   768: goto -710 -> 58
    //   771: aload 8
    //   773: ldc_w 569
    //   776: invokevirtual 558	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   779: putstatic 570	com/tencent/smtt/sdk/QbSdk:d	Ljava/lang/String;
    //   782: aconst_null
    //   783: astore 7
    //   785: aload 7
    //   787: astore 8
    //   789: iload 6
    //   791: ifeq +22 -> 813
    //   794: getstatic 105	com/tencent/smtt/sdk/QbSdk:r	Ljava/lang/Object;
    //   797: ldc_w 572
    //   800: iconst_0
    //   801: anewarray 199	java/lang/Class
    //   804: iconst_0
    //   805: anewarray 4	java/lang/Object
    //   808: invokestatic 208	com/tencent/smtt/utils/r:a	(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    //   811: astore 8
    //   813: iload 6
    //   815: tableswitch	default:+25 -> 840, -2:+180->995, -1:+105->920, 0:+255->1070
    //   841: aconst_null
    //   842: iconst_1
    //   843: aload_0
    //   844: sipush 415
    //   847: new 262	java/lang/Throwable
    //   850: dup
    //   851: new 236	java/lang/StringBuilder
    //   854: dup
    //   855: ldc_w 574
    //   858: invokespecial 241	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   861: aload 8
    //   863: invokevirtual 536	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   866: ldc_w 576
    //   869: invokevirtual 247	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   872: iload 6
    //   874: invokevirtual 402	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   877: invokevirtual 250	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   880: invokespecial 263	java/lang/Throwable:<init>	(Ljava/lang/String;)V
    //   883: invokevirtual 266	com/tencent/smtt/sdk/TbsCoreLoadStat:a	(Landroid/content/Context;ILjava/lang/Throwable;)V
    //   886: iload_1
    //   887: ifne +12 -> 899
    //   890: ldc_w 500
    //   893: ldc_w 578
    //   896: invokestatic 255	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   899: ldc_w 470
    //   902: invokestatic 177	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   905: goto -847 -> 58
    //   908: astore_0
    //   909: ldc_w 470
    //   912: invokestatic 177	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   915: iload_2
    //   916: istore_1
    //   917: goto -859 -> 58
    //   920: aload 8
    //   922: instanceof 214
    //   925: ifeq +39 -> 964
    //   928: invokestatic 260	com/tencent/smtt/sdk/TbsCoreLoadStat:getInstance	()Lcom/tencent/smtt/sdk/TbsCoreLoadStat;
    //   931: aload_0
    //   932: aload 8
    //   934: checkcast 214	java/lang/Integer
    //   937: invokevirtual 581	java/lang/Integer:intValue	()I
    //   940: new 262	java/lang/Throwable
    //   943: dup
    //   944: ldc_w 574
    //   947: aload 8
    //   949: invokestatic 230	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   952: invokevirtual 234	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   955: invokespecial 263	java/lang/Throwable:<init>	(Ljava/lang/String;)V
    //   958: invokevirtual 266	com/tencent/smtt/sdk/TbsCoreLoadStat:a	(Landroid/content/Context;ILjava/lang/Throwable;)V
    //   961: goto -75 -> 886
    //   964: invokestatic 260	com/tencent/smtt/sdk/TbsCoreLoadStat:getInstance	()Lcom/tencent/smtt/sdk/TbsCoreLoadStat;
    //   967: aload_0
    //   968: sipush 307
    //   971: new 262	java/lang/Throwable
    //   974: dup
    //   975: ldc_w 574
    //   978: aload 8
    //   980: invokestatic 230	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   983: invokevirtual 234	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   986: invokespecial 263	java/lang/Throwable:<init>	(Ljava/lang/String;)V
    //   989: invokevirtual 266	com/tencent/smtt/sdk/TbsCoreLoadStat:a	(Landroid/content/Context;ILjava/lang/Throwable;)V
    //   992: goto -106 -> 886
    //   995: aload 8
    //   997: instanceof 214
    //   1000: ifeq +39 -> 1039
    //   1003: invokestatic 260	com/tencent/smtt/sdk/TbsCoreLoadStat:getInstance	()Lcom/tencent/smtt/sdk/TbsCoreLoadStat;
    //   1006: aload_0
    //   1007: aload 8
    //   1009: checkcast 214	java/lang/Integer
    //   1012: invokevirtual 581	java/lang/Integer:intValue	()I
    //   1015: new 262	java/lang/Throwable
    //   1018: dup
    //   1019: ldc_w 574
    //   1022: aload 8
    //   1024: invokestatic 230	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   1027: invokevirtual 234	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   1030: invokespecial 263	java/lang/Throwable:<init>	(Ljava/lang/String;)V
    //   1033: invokevirtual 266	com/tencent/smtt/sdk/TbsCoreLoadStat:a	(Landroid/content/Context;ILjava/lang/Throwable;)V
    //   1036: goto -150 -> 886
    //   1039: invokestatic 260	com/tencent/smtt/sdk/TbsCoreLoadStat:getInstance	()Lcom/tencent/smtt/sdk/TbsCoreLoadStat;
    //   1042: aload_0
    //   1043: sipush 404
    //   1046: new 262	java/lang/Throwable
    //   1049: dup
    //   1050: ldc_w 574
    //   1053: aload 8
    //   1055: invokestatic 230	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   1058: invokevirtual 234	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   1061: invokespecial 263	java/lang/Throwable:<init>	(Ljava/lang/String;)V
    //   1064: invokevirtual 266	com/tencent/smtt/sdk/TbsCoreLoadStat:a	(Landroid/content/Context;ILjava/lang/Throwable;)V
    //   1067: goto -181 -> 886
    //   1070: goto -184 -> 886
    //   1073: getstatic 105	com/tencent/smtt/sdk/QbSdk:r	Ljava/lang/Object;
    //   1076: astore 8
    //   1078: getstatic 363	java/lang/Integer:TYPE	Ljava/lang/Class;
    //   1081: astore 7
    //   1083: invokestatic 585	com/tencent/smtt/sdk/a:a	()I
    //   1086: istore 6
    //   1088: aload 8
    //   1090: ldc_w 587
    //   1093: iconst_1
    //   1094: anewarray 199	java/lang/Class
    //   1097: dup
    //   1098: iconst_0
    //   1099: aload 7
    //   1101: aastore
    //   1102: iconst_1
    //   1103: anewarray 4	java/lang/Object
    //   1106: dup
    //   1107: iconst_0
    //   1108: iload 6
    //   1110: invokestatic 218	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1113: aastore
    //   1114: invokestatic 208	com/tencent/smtt/utils/r:a	(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1117: astore 8
    //   1119: aload 8
    //   1121: ifnull +149 -> 1270
    //   1124: aload 8
    //   1126: instanceof 222
    //   1129: ifeq +28 -> 1157
    //   1132: aload 8
    //   1134: checkcast 222	java/lang/String
    //   1137: ldc_w 494
    //   1140: invokevirtual 498	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   1143: ifeq +14 -> 1157
    //   1146: ldc_w 470
    //   1149: invokestatic 177	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1152: iload_2
    //   1153: istore_1
    //   1154: goto -1096 -> 58
    //   1157: iload 4
    //   1159: istore_1
    //   1160: aload 8
    //   1162: instanceof 366
    //   1165: ifeq -279 -> 886
    //   1168: invokestatic 589	com/tencent/smtt/sdk/o:d	()I
    //   1171: putstatic 97	com/tencent/smtt/sdk/QbSdk:o	I
    //   1174: aload_0
    //   1175: invokestatic 589	com/tencent/smtt/sdk/o:d	()I
    //   1178: invokestatic 591	com/tencent/smtt/sdk/QbSdk:a	(Landroid/content/Context;I)Z
    //   1181: istore_2
    //   1182: iload 5
    //   1184: istore_1
    //   1185: aload 8
    //   1187: checkcast 366	java/lang/Boolean
    //   1190: invokevirtual 369	java/lang/Boolean:booleanValue	()Z
    //   1193: ifeq +12 -> 1205
    //   1196: iload 5
    //   1198: istore_1
    //   1199: iload_2
    //   1200: ifne +5 -> 1205
    //   1203: iconst_1
    //   1204: istore_1
    //   1205: iload_1
    //   1206: ifne +55 -> 1261
    //   1209: ldc_w 500
    //   1212: ldc_w 593
    //   1215: invokestatic 255	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1218: ldc_w 500
    //   1221: ldc_w 595
    //   1224: iload_2
    //   1225: invokestatic 598	java/lang/String:valueOf	(Z)Ljava/lang/String;
    //   1228: invokevirtual 234	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   1231: invokestatic 600	com/tencent/smtt/utils/TbsLog:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   1234: ldc_w 500
    //   1237: new 236	java/lang/StringBuilder
    //   1240: dup
    //   1241: ldc_w 602
    //   1244: invokespecial 241	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1247: aload 8
    //   1249: checkcast 366	java/lang/Boolean
    //   1252: invokevirtual 536	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1255: invokevirtual 250	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1258: invokestatic 600	com/tencent/smtt/utils/TbsLog:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   1261: ldc_w 470
    //   1264: invokestatic 177	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1267: goto -1209 -> 58
    //   1270: invokestatic 260	com/tencent/smtt/sdk/TbsCoreLoadStat:getInstance	()Lcom/tencent/smtt/sdk/TbsCoreLoadStat;
    //   1273: aload_0
    //   1274: sipush 308
    //   1277: invokevirtual 486	com/tencent/smtt/sdk/TbsCoreLoadStat:a	(Landroid/content/Context;I)V
    //   1280: iload 4
    //   1282: istore_1
    //   1283: goto -397 -> 886
    //   1286: astore 8
    //   1288: aload 7
    //   1290: astore 8
    //   1292: goto -479 -> 813
    //
    // Exception table:
    //   from	to	target	type
    //   301	312	461	java/lang/Exception
    //   500	522	603	java/lang/Exception
    //   574	589	603	java/lang/Exception
    //   594	600	603	java/lang/Exception
    //   522	531	614	java/lang/NumberFormatException
    //   394	405	746	java/lang/Throwable
    //   771	782	908	java/lang/Exception
    //   794	813	1286	java/lang/Exception
  }

  protected static String b()
  {
    AppMethodBeat.i(64053);
    Object localObject = bv.a();
    if ((localObject != null) && (((bv)localObject).b()))
    {
      localObject = ((bv)localObject).c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "getGUID", new Class[0], new Object[0]);
      if ((localObject != null) && ((localObject instanceof String)))
      {
        localObject = (String)localObject;
        AppMethodBeat.o(64053);
      }
    }
    while (true)
    {
      return localObject;
      localObject = null;
      AppMethodBeat.o(64053);
    }
  }

  static boolean b(Context paramContext)
  {
    boolean bool = false;
    AppMethodBeat.i(64003);
    if (paramContext == null)
      AppMethodBeat.o(64003);
    while (true)
    {
      return bool;
      try
      {
        if (paramContext.getApplicationInfo().packageName.contains("com.tencent.portfolio"))
        {
          TbsLog.i("QbSdk", "clearPluginConfigFile #1");
          String str1 = TbsDownloadConfig.getInstance(paramContext).mPreferences.getString("app_versionname", null);
          String str2 = paramContext.getPackageManager().getPackageInfo("com.tencent.portfolio", 0).versionName;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("clearPluginConfigFile oldAppVersionName is ");
          TbsLog.i("QbSdk", str1 + " newAppVersionName is " + str2);
          if ((str1 != null) && (!str1.contains(str2)))
          {
            paramContext = paramContext.getSharedPreferences("plugin_setting", 0);
            if (paramContext != null)
            {
              paramContext = paramContext.edit();
              paramContext.clear();
              paramContext.commit();
              TbsLog.i("QbSdk", "clearPluginConfigFile done");
            }
          }
        }
        bool = true;
        AppMethodBeat.o(64003);
      }
      catch (Throwable paramContext)
      {
        TbsLog.i("QbSdk", "clearPluginConfigFile error is " + paramContext.getMessage());
        AppMethodBeat.o(64003);
      }
    }
  }

  private static boolean c(Context paramContext)
  {
    AppMethodBeat.i(64002);
    try
    {
      Object localObject1 = q;
      if (localObject1 != null)
        AppMethodBeat.o(64002);
      for (bool = true; ; bool = false)
      {
        return bool;
        localObject2 = an.a().r(paramContext);
        if (localObject2 != null)
          break;
        TbsLog.e("QbSdk", "QbSdk initForX5DisableConfig (false) optDir == null");
        AppMethodBeat.o(64002);
      }
      if (TbsShareManager.isThirdPartyApp(paramContext))
        if (TbsShareManager.j(paramContext))
        {
          localObject1 = new java/io/File;
          ((File)localObject1).<init>(TbsShareManager.c(paramContext), "tbs_sdk_extension_dex.jar");
        }
      while (true)
      {
        if (((File)localObject1).exists())
          break label168;
        localObject1 = TbsCoreLoadStat.getInstance();
        localObject2 = new java/lang/Exception;
        ((Exception)localObject2).<init>("initForX5DisableConfig failure -- tbs_sdk_extension_dex.jar is not exist!");
        ((TbsCoreLoadStat)localObject1).a(paramContext, 406, (Throwable)localObject2);
        AppMethodBeat.o(64002);
        bool = false;
        break;
        TbsCoreLoadStat.getInstance().a(paramContext, 304);
        AppMethodBeat.o(64002);
        bool = false;
        break;
        localObject1 = new File(an.a().r(paramContext), "tbs_sdk_extension_dex.jar");
      }
      label168: if (TbsShareManager.getHostCorePathAppDefined() != null);
      for (Object localObject2 = TbsShareManager.getHostCorePathAppDefined(); ; localObject2 = ((File)localObject2).getAbsolutePath())
      {
        TbsLog.i("QbSdk", "QbSdk init optDirExtension #3 is ".concat(String.valueOf(localObject2)));
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>("new DexLoader #4 dexFile is ");
        TbsLog.i("QbSdk", ((File)localObject1).getAbsolutePath());
        bv.a().a(paramContext);
        localObject3 = new com/tencent/smtt/export/external/DexLoader;
        ((DexLoader)localObject3).<init>(((File)localObject1).getParent(), paramContext, new String[] { ((File)localObject1).getAbsolutePath() }, (String)localObject2, null);
        q = ((DexLoader)localObject3).loadClass("com.tencent.tbs.sdk.extension.TbsSDKExtension");
        loadTBSSDKExtension(paramContext, ((File)localObject1).getParent());
        localObject1 = r;
        paramContext = b.a;
        String str = b.b;
        localObject2 = b.c;
        localObject3 = b.d;
        r.a(localObject1, "putInfo", new Class[] { String.class, String.class, String.class, String.class }, new Object[] { paramContext, str, localObject2, localObject3 });
        r.a(r, "setClientVersion", new Class[] { Integer.TYPE }, new Object[] { Integer.valueOf(1) });
        AppMethodBeat.o(64002);
        bool = true;
        break;
      }
    }
    catch (Throwable paramContext)
    {
      while (true)
      {
        TbsLog.e("QbSdk", "initForX5DisableConfig sys WebView: " + Log.getStackTraceString(paramContext));
        AppMethodBeat.o(64002);
        boolean bool = false;
      }
    }
  }

  public static boolean canLoadVideo(Context paramContext)
  {
    AppMethodBeat.i(64013);
    Object localObject = r.a(r, "canLoadVideo", new Class[] { Integer.TYPE }, new Object[] { Integer.valueOf(0) });
    boolean bool;
    if (localObject != null)
    {
      if (!((Boolean)localObject).booleanValue())
        TbsCoreLoadStat.getInstance().a(paramContext, 313);
      if (localObject != null)
        break label88;
      AppMethodBeat.o(64013);
      bool = false;
    }
    while (true)
    {
      return bool;
      TbsCoreLoadStat.getInstance().a(paramContext, 314);
      break;
      label88: bool = ((Boolean)localObject).booleanValue();
      AppMethodBeat.o(64013);
    }
  }

  public static boolean canLoadX5(Context paramContext)
  {
    AppMethodBeat.i(64007);
    boolean bool = a(paramContext, false, false);
    AppMethodBeat.o(64007);
    return bool;
  }

  public static boolean canLoadX5FirstTimeThirdApp(Context paramContext)
  {
    boolean bool = true;
    AppMethodBeat.i(64000);
    try
    {
      if (paramContext.getApplicationInfo().packageName.contains("com.moji.mjweather"))
      {
        int i1 = Build.VERSION.SDK_INT;
        if (i1 == 19)
          AppMethodBeat.o(64000);
      }
      while (true)
      {
        return bool;
        if (q == null)
        {
          Object localObject1 = an.a().r(paramContext);
          if (localObject1 == null)
          {
            TbsLog.e("QbSdk", "QbSdk canLoadX5FirstTimeThirdApp (false) optDir == null");
            AppMethodBeat.o(64000);
            bool = false;
          }
          else
          {
            File localFile = new java/io/File;
            localFile.<init>(TbsShareManager.c(paramContext), "tbs_sdk_extension_dex.jar");
            if (!localFile.exists())
            {
              TbsLog.e("QbSdk", "QbSdk canLoadX5FirstTimeThirdApp (false) dexFile.exists()=false", true);
              AppMethodBeat.o(64000);
              bool = false;
            }
            else
            {
              if (TbsShareManager.getHostCorePathAppDefined() != null);
              for (localObject1 = TbsShareManager.getHostCorePathAppDefined(); ; localObject1 = ((File)localObject1).getAbsolutePath())
              {
                TbsLog.i("QbSdk", "QbSdk init optDirExtension #2 is ".concat(String.valueOf(localObject1)));
                Object localObject2 = new java/lang/StringBuilder;
                ((StringBuilder)localObject2).<init>("new DexLoader #2 dexFile is ");
                TbsLog.i("QbSdk", localFile.getAbsolutePath());
                bv.a().a(paramContext);
                localObject2 = new com/tencent/smtt/export/external/DexLoader;
                ((DexLoader)localObject2).<init>(localFile.getParent(), paramContext, new String[] { localFile.getAbsolutePath() }, (String)localObject1, null);
                q = ((DexLoader)localObject2).loadClass("com.tencent.tbs.sdk.extension.TbsSDKExtension");
                if (r != null)
                  break label292;
                if ((TbsShareManager.e(paramContext) != null) || (TbsShareManager.getHostCorePathAppDefined() != null))
                  break label283;
                TbsLogReport.getInstance(paramContext.getApplicationContext()).setLoadErrorCode(227, "host context is null!");
                AppMethodBeat.o(64000);
                bool = false;
                break;
              }
              label283: loadTBSSDKExtension(paramContext, localFile.getParent());
            }
          }
        }
        else
        {
          label292: paramContext = r.a(r, "canLoadX5CoreForThirdApp", new Class[0], new Object[0]);
          if ((paramContext != null) && ((paramContext instanceof Boolean)))
          {
            bool = ((Boolean)paramContext).booleanValue();
            AppMethodBeat.o(64000);
          }
          else
          {
            AppMethodBeat.o(64000);
            bool = false;
          }
        }
      }
    }
    catch (Throwable paramContext)
    {
      while (true)
      {
        TbsLog.e("QbSdk", "canLoadX5FirstTimeThirdApp sys WebView: " + Log.getStackTraceString(paramContext));
        AppMethodBeat.o(64000);
        bool = false;
      }
    }
  }

  public static void canOpenFile(Context paramContext, String paramString, ValueCallback<Boolean> paramValueCallback)
  {
    AppMethodBeat.i(64021);
    new h(paramContext, paramString, paramValueCallback).start();
    AppMethodBeat.o(64021);
  }

  public static boolean canOpenMimeFileType(Context paramContext, String paramString)
  {
    AppMethodBeat.i(64015);
    if (!a(paramContext, false))
      AppMethodBeat.o(64015);
    while (true)
    {
      return false;
      AppMethodBeat.o(64015);
    }
  }

  // ERROR //
  public static boolean canOpenWebPlus(Context paramContext)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: iconst_0
    //   5: istore_3
    //   6: ldc_w 761
    //   9: invokestatic 93	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   12: getstatic 142	com/tencent/smtt/sdk/QbSdk:x	I
    //   15: ifne +9 -> 24
    //   18: invokestatic 585	com/tencent/smtt/sdk/a:a	()I
    //   21: putstatic 142	com/tencent/smtt/sdk/QbSdk:x	I
    //   24: ldc 243
    //   26: new 236	java/lang/StringBuilder
    //   29: dup
    //   30: ldc_w 763
    //   33: invokespecial 241	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   36: getstatic 142	com/tencent/smtt/sdk/QbSdk:x	I
    //   39: invokevirtual 402	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   42: invokevirtual 250	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   45: invokestatic 300	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   48: getstatic 544	android/os/Build$VERSION:SDK_INT	I
    //   51: bipush 7
    //   53: if_icmplt +12 -> 65
    //   56: getstatic 142	com/tencent/smtt/sdk/QbSdk:x	I
    //   59: getstatic 144	com/tencent/smtt/sdk/QbSdk:y	I
    //   62: if_icmpge +11 -> 73
    //   65: ldc_w 761
    //   68: invokestatic 177	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   71: iload_3
    //   72: ireturn
    //   73: aload_0
    //   74: ifnonnull +12 -> 86
    //   77: ldc_w 761
    //   80: invokestatic 177	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   83: goto -12 -> 71
    //   86: new 279	java/io/File
    //   89: astore 4
    //   91: aload 4
    //   93: invokestatic 272	com/tencent/smtt/sdk/an:a	()Lcom/tencent/smtt/sdk/an;
    //   96: aload_0
    //   97: invokevirtual 275	com/tencent/smtt/sdk/an:r	(Landroid/content/Context;)Ljava/io/File;
    //   100: ldc_w 765
    //   103: invokespecial 284	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   106: new 767	java/io/FileInputStream
    //   109: astore 5
    //   111: aload 5
    //   113: aload 4
    //   115: invokespecial 769	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   118: new 771	java/io/BufferedInputStream
    //   121: astore 4
    //   123: aload 4
    //   125: aload 5
    //   127: invokespecial 774	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   130: aload 4
    //   132: astore_2
    //   133: new 776	java/util/Properties
    //   136: astore 6
    //   138: aload 4
    //   140: astore_2
    //   141: aload 6
    //   143: invokespecial 777	java/util/Properties:<init>	()V
    //   146: aload 4
    //   148: astore_2
    //   149: aload 6
    //   151: aload 4
    //   153: invokevirtual 780	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   156: aload 4
    //   158: astore_2
    //   159: aload 6
    //   161: ldc_w 782
    //   164: invokevirtual 785	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   167: astore 7
    //   169: aload 4
    //   171: astore_2
    //   172: aload 6
    //   174: ldc_w 787
    //   177: invokevirtual 785	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   180: astore 5
    //   182: aload 4
    //   184: astore_2
    //   185: aload 7
    //   187: invokestatic 554	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   190: istore 8
    //   192: aload 4
    //   194: astore_2
    //   195: aload 5
    //   197: invokestatic 554	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   200: istore 9
    //   202: aload 4
    //   204: astore_2
    //   205: getstatic 790	android/os/Build$VERSION:SDK	Ljava/lang/String;
    //   208: invokestatic 554	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   211: istore 10
    //   213: iload 10
    //   215: iload 8
    //   217: if_icmpgt +10 -> 227
    //   220: iload 10
    //   222: iload 9
    //   224: if_icmpge +36 -> 260
    //   227: aload 4
    //   229: astore_2
    //   230: ldc 243
    //   232: ldc_w 792
    //   235: iload 10
    //   237: invokestatic 412	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   240: invokevirtual 234	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   243: invokestatic 300	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   246: aload 4
    //   248: invokevirtual 795	java/io/BufferedInputStream:close	()V
    //   251: ldc_w 761
    //   254: invokestatic 177	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   257: goto -186 -> 71
    //   260: aload 4
    //   262: astore_2
    //   263: aload 6
    //   265: ldc_w 546
    //   268: invokevirtual 785	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   271: invokestatic 554	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   274: istore 9
    //   276: aload 4
    //   278: invokevirtual 795	java/io/BufferedInputStream:close	()V
    //   281: new 279	java/io/File
    //   284: astore 4
    //   286: aload 4
    //   288: aload_0
    //   289: invokestatic 797	com/tencent/smtt/sdk/an:t	(Landroid/content/Context;)Ljava/io/File;
    //   292: ldc_w 799
    //   295: invokespecial 284	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   298: new 767	java/io/FileInputStream
    //   301: astore_2
    //   302: aload_2
    //   303: aload 4
    //   305: invokespecial 769	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   308: new 776	java/util/Properties
    //   311: astore 4
    //   313: aload 4
    //   315: invokespecial 777	java/util/Properties:<init>	()V
    //   318: aload 4
    //   320: aload_2
    //   321: invokevirtual 780	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   324: aload 4
    //   326: ldc_w 801
    //   329: invokevirtual 785	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   332: invokestatic 554	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   335: istore 8
    //   337: aload 4
    //   339: ldc_w 803
    //   342: invokevirtual 785	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   345: invokestatic 554	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   348: istore 10
    //   350: iload 9
    //   352: ldc_w 804
    //   355: if_icmpeq +11 -> 366
    //   358: iload 8
    //   360: ldc_w 804
    //   363: if_icmpne +73 -> 436
    //   366: iconst_0
    //   367: istore 8
    //   369: aload_2
    //   370: invokevirtual 807	java/io/InputStream:close	()V
    //   373: iload 8
    //   375: ifne +204 -> 579
    //   378: ldc_w 761
    //   381: invokestatic 177	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   384: iconst_1
    //   385: istore_3
    //   386: goto -315 -> 71
    //   389: astore_0
    //   390: aconst_null
    //   391: astore_0
    //   392: aload_0
    //   393: astore_2
    //   394: ldc 243
    //   396: ldc_w 809
    //   399: invokestatic 300	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   402: aload_0
    //   403: ifnull +7 -> 410
    //   406: aload_0
    //   407: invokevirtual 795	java/io/BufferedInputStream:close	()V
    //   410: ldc_w 761
    //   413: invokestatic 177	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   416: goto -345 -> 71
    //   419: astore_0
    //   420: aload_2
    //   421: ifnull +7 -> 428
    //   424: aload_2
    //   425: invokevirtual 795	java/io/BufferedInputStream:close	()V
    //   428: ldc_w 761
    //   431: invokestatic 177	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   434: aload_0
    //   435: athrow
    //   436: iload 9
    //   438: iload 8
    //   440: if_icmple +9 -> 449
    //   443: iconst_0
    //   444: istore 8
    //   446: goto -77 -> 369
    //   449: iload 9
    //   451: iload 8
    //   453: if_icmpne +192 -> 645
    //   456: iload 10
    //   458: ifle +18 -> 476
    //   461: iload 10
    //   463: aload_0
    //   464: invokestatic 811	com/tencent/smtt/utils/b:b	(Landroid/content/Context;)I
    //   467: if_icmpeq +9 -> 476
    //   470: iconst_0
    //   471: istore 8
    //   473: goto -104 -> 369
    //   476: aload 4
    //   478: ldc_w 813
    //   481: invokevirtual 785	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   484: invokestatic 816	java/lang/Boolean:parseBoolean	(Ljava/lang/String;)Z
    //   487: ifeq +35 -> 522
    //   490: aload_0
    //   491: invokevirtual 735	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   494: invokestatic 645	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   497: getfield 649	com/tencent/smtt/sdk/TbsDownloadConfig:mPreferences	Landroid/content/SharedPreferences;
    //   500: ldc_w 818
    //   503: iconst_0
    //   504: invokeinterface 822 3 0
    //   509: istore 11
    //   511: iload 11
    //   513: ifne +9 -> 522
    //   516: iconst_1
    //   517: istore 8
    //   519: goto -150 -> 369
    //   522: iconst_0
    //   523: istore 8
    //   525: goto -156 -> 369
    //   528: astore_0
    //   529: aload_1
    //   530: astore_0
    //   531: ldc 243
    //   533: ldc_w 824
    //   536: invokestatic 300	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   539: aload_0
    //   540: ifnull +7 -> 547
    //   543: aload_0
    //   544: invokevirtual 807	java/io/InputStream:close	()V
    //   547: iconst_1
    //   548: istore 8
    //   550: goto -177 -> 373
    //   553: astore_0
    //   554: iconst_1
    //   555: istore 8
    //   557: goto -184 -> 373
    //   560: astore_0
    //   561: aconst_null
    //   562: astore_2
    //   563: aload_2
    //   564: ifnull +7 -> 571
    //   567: aload_2
    //   568: invokevirtual 807	java/io/InputStream:close	()V
    //   571: ldc_w 761
    //   574: invokestatic 177	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   577: aload_0
    //   578: athrow
    //   579: ldc_w 761
    //   582: invokestatic 177	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   585: goto -514 -> 71
    //   588: astore_0
    //   589: goto -338 -> 251
    //   592: astore_2
    //   593: goto -312 -> 281
    //   596: astore_0
    //   597: goto -187 -> 410
    //   600: astore_2
    //   601: goto -173 -> 428
    //   604: astore_0
    //   605: goto -232 -> 373
    //   608: astore_2
    //   609: goto -38 -> 571
    //   612: astore_0
    //   613: goto -50 -> 563
    //   616: astore_2
    //   617: aload_0
    //   618: astore 4
    //   620: aload_2
    //   621: astore_0
    //   622: aload 4
    //   624: astore_2
    //   625: goto -62 -> 563
    //   628: astore_0
    //   629: aload_2
    //   630: astore_0
    //   631: goto -100 -> 531
    //   634: astore_0
    //   635: goto -215 -> 420
    //   638: astore_0
    //   639: aload 4
    //   641: astore_0
    //   642: goto -250 -> 392
    //   645: iconst_0
    //   646: istore 8
    //   648: goto -279 -> 369
    //
    // Exception table:
    //   from	to	target	type
    //   86	130	389	java/lang/Throwable
    //   86	130	419	finally
    //   281	308	528	java/lang/Throwable
    //   543	547	553	java/lang/Exception
    //   281	308	560	finally
    //   246	251	588	java/lang/Exception
    //   276	281	592	java/lang/Exception
    //   406	410	596	java/lang/Exception
    //   424	428	600	java/lang/Exception
    //   369	373	604	java/lang/Exception
    //   567	571	608	java/lang/Exception
    //   308	350	612	finally
    //   461	470	612	finally
    //   476	511	612	finally
    //   531	539	616	finally
    //   308	350	628	java/lang/Throwable
    //   461	470	628	java/lang/Throwable
    //   476	511	628	java/lang/Throwable
    //   133	138	634	finally
    //   141	146	634	finally
    //   149	156	634	finally
    //   159	169	634	finally
    //   172	182	634	finally
    //   185	192	634	finally
    //   195	202	634	finally
    //   205	213	634	finally
    //   230	246	634	finally
    //   263	276	634	finally
    //   394	402	634	finally
    //   133	138	638	java/lang/Throwable
    //   141	146	638	java/lang/Throwable
    //   149	156	638	java/lang/Throwable
    //   159	169	638	java/lang/Throwable
    //   172	182	638	java/lang/Throwable
    //   185	192	638	java/lang/Throwable
    //   195	202	638	java/lang/Throwable
    //   205	213	638	java/lang/Throwable
    //   230	246	638	java/lang/Throwable
    //   263	276	638	java/lang/Throwable
  }

  public static boolean canUseVideoFeatrue(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(64012);
    paramContext = r.a(r, "canUseVideoFeatrue", new Class[] { Integer.TYPE }, new Object[] { Integer.valueOf(paramInt) });
    boolean bool;
    if ((paramContext != null) && ((paramContext instanceof Boolean)))
    {
      bool = ((Boolean)paramContext).booleanValue();
      AppMethodBeat.o(64012);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(64012);
      bool = false;
    }
  }

  public static void checkTbsValidity(Context paramContext)
  {
    AppMethodBeat.i(64029);
    if (paramContext == null)
      AppMethodBeat.o(64029);
    while (true)
    {
      return;
      if (!t.a(paramContext))
      {
        TbsLog.e("QbSdk", "sys WebView: SysWebViewForcedBy checkTbsValidity");
        TbsCoreLoadStat.getInstance().a(paramContext, 419);
        forceSysWebView();
      }
      AppMethodBeat.o(64029);
    }
  }

  public static void clear(Context paramContext)
  {
  }

  public static void clearAllWebViewCache(Context paramContext, boolean paramBoolean)
  {
    int i1 = 1;
    AppMethodBeat.i(64043);
    TbsLog.i("QbSdk", "clearAllWebViewCache(" + paramContext + ", " + paramBoolean + ")");
    try
    {
      localObject = new com/tencent/smtt/sdk/WebView;
      ((WebView)localObject).<init>(paramContext);
      localObject = ((WebView)localObject).getWebViewClientExtension();
      if (localObject == null);
    }
    catch (Throwable localThrowable1)
    {
      while (true)
      {
        try
        {
          Object localObject = bv.a();
          i2 = i1;
          if (localObject != null)
          {
            i2 = i1;
            if (((bv)localObject).b())
            {
              ((bv)localObject).c().a(paramContext, paramBoolean);
              i2 = i1;
            }
          }
          if (i2 != 0)
          {
            TbsLog.i("QbSdk", "is_in_x5_mode --> no need to clear system webview!");
            AppMethodBeat.o(64043);
            return;
            localThrowable1 = localThrowable1;
            i2 = 0;
            TbsLog.e("QbSdk", "clearAllWebViewCache exception 2 -- " + Log.getStackTraceString(localThrowable1));
            continue;
          }
          try
          {
            android.webkit.WebView localWebView = new android/webkit/WebView;
            localWebView.<init>(paramContext);
            if (Build.VERSION.SDK_INT >= 11)
            {
              localWebView.removeJavascriptInterface("searchBoxJavaBridge_");
              localWebView.removeJavascriptInterface("accessibility");
              localWebView.removeJavascriptInterface("accessibilityTraversal");
            }
            localWebView.clearCache(true);
            if (paramBoolean)
            {
              CookieSyncManager.createInstance(paramContext);
              CookieManager.getInstance().removeAllCookie();
            }
            WebViewDatabase.getInstance(paramContext).clearUsernamePassword();
            WebViewDatabase.getInstance(paramContext).clearHttpAuthUsernamePassword();
            WebViewDatabase.getInstance(paramContext).clearFormData();
            WebStorage.getInstance().deleteAllData();
            WebIconDatabase.getInstance().removeAllIcons();
            AppMethodBeat.o(64043);
          }
          catch (Throwable paramContext)
          {
            TbsLog.e("QbSdk", "clearAllWebViewCache exception 1 -- " + Log.getStackTraceString(paramContext));
            AppMethodBeat.o(64043);
          }
          continue;
        }
        catch (Throwable localThrowable2)
        {
          i2 = 1;
          continue;
        }
        int i2 = 0;
      }
    }
  }

  public static void closeFileReader(Context paramContext)
  {
    AppMethodBeat.i(64022);
    bv localbv = bv.a();
    localbv.a(paramContext, null);
    if (localbv.b())
      localbv.c().p();
    AppMethodBeat.o(64022);
  }

  public static void continueLoadSo(Context paramContext)
  {
    AppMethodBeat.i(64035);
    if (("com.tencent.mm".equals(getCurrentProcessName(paramContext))) && (WebView.mWebViewCreated))
      r.a(r, "continueLoadSo", new Class[0], new Object[0]);
    AppMethodBeat.o(64035);
  }

  public static boolean createMiniQBShortCut(Context paramContext, String paramString1, String paramString2, Drawable paramDrawable)
  {
    AppMethodBeat.i(64047);
    boolean bool;
    if (paramContext == null)
    {
      AppMethodBeat.o(64047);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (TbsDownloader.getOverSea(paramContext))
      {
        AppMethodBeat.o(64047);
        bool = false;
      }
      else if (isMiniQBShortCutExist(paramContext, paramString1, paramString2) == true)
      {
        AppMethodBeat.o(64047);
        bool = false;
      }
      else
      {
        bv localbv = bv.a();
        if ((localbv != null) && (localbv.b()))
        {
          Bitmap localBitmap = null;
          if ((paramDrawable instanceof BitmapDrawable))
            localBitmap = ((BitmapDrawable)paramDrawable).getBitmap();
          paramDrawable = localbv.c().b();
          TbsLog.e("QbSdk", "qbsdk createMiniQBShortCut");
          paramContext = paramDrawable.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "createMiniQBShortCut", new Class[] { Context.class, String.class, String.class, Bitmap.class }, new Object[] { paramContext, paramString1, paramString2, localBitmap });
          TbsLog.e("QbSdk", "qbsdk after createMiniQBShortCut ret: ".concat(String.valueOf(paramContext)));
          if (paramContext != null)
          {
            AppMethodBeat.o(64047);
            bool = true;
          }
          else
          {
            AppMethodBeat.o(64047);
            bool = false;
          }
        }
        else
        {
          AppMethodBeat.o(64047);
          bool = false;
        }
      }
    }
  }

  private static void d(Context paramContext)
  {
    int i1 = -1;
    AppMethodBeat.i(64032);
    C = true;
    Object localObject1 = null;
    Object localObject2 = localObject1;
    try
    {
      if (Build.VERSION.SDK_INT >= 11)
        localObject2 = localObject1;
      for (localObject1 = paramContext.getSharedPreferences("tbs_preloadx5_check_cfg_file", 4); ; localObject1 = paramContext.getSharedPreferences("tbs_preloadx5_check_cfg_file", 0))
      {
        localObject2 = localObject1;
        i2 = ((SharedPreferences)localObject1).getInt("tbs_preload_x5_recorder", -1);
        if (i2 < 0)
          break label603;
        i3 = i2 + 1;
        if (i3 <= 4)
          break;
        AppMethodBeat.o(64032);
        return;
        localObject2 = localObject1;
      }
      i2 = i3;
    }
    catch (Throwable localThrowable1)
    {
      while (true)
      {
        try
        {
          i4 = an.a().j(paramContext);
          if (i4 <= 0)
          {
            AppMethodBeat.o(64032);
            continue;
          }
          if (i2 > 4);
        }
        catch (Throwable localThrowable1)
        {
          try
          {
            ((SharedPreferences)localObject1).edit().putInt("tbs_preload_x5_recorder", i2).commit();
            int i5 = ((SharedPreferences)localObject1).getInt("tbs_preload_x5_counter", -1);
            int i6 = i3;
            localObject2 = localObject1;
            int i2 = i4;
            if (i5 >= 0)
            {
              localObject2 = ((SharedPreferences)localObject1).edit();
              i5++;
              ((SharedPreferences.Editor)localObject2).putInt("tbs_preload_x5_counter", i5).commit();
              if (i5 <= 3);
            }
            else
            {
              try
              {
                i3 = ((SharedPreferences)localObject1).getInt("tbs_preload_x5_version", -1);
                localObject1 = ((SharedPreferences)localObject1).edit();
                if (i3 == i4)
                {
                  com.tencent.smtt.utils.k.a(an.a().r(paramContext), false);
                  paramContext = ai.a(paramContext).a();
                  if (paramContext != null)
                    com.tencent.smtt.utils.k.a(paramContext, false);
                  paramContext = new java/lang/StringBuilder;
                  paramContext.<init>("QbSdk - preload_x5_check: tbs core ");
                  TbsLog.e("QbSdk", i4 + " is deleted!");
                  ((SharedPreferences.Editor)localObject1).putInt("tbs_precheck_disable_version", i3);
                  ((SharedPreferences.Editor)localObject1).commit();
                  AppMethodBeat.o(64032);
                  continue;
                  localThrowable3 = localThrowable3;
                  i3 = -1;
                  i4 = -1;
                  localObject1 = localObject2;
                  localObject2 = localThrowable3;
                  TbsLog.e("QbSdk", "tbs_preload_x5_counter Inc exception:" + Log.getStackTraceString((Throwable)localObject2));
                  i2 = i4;
                  localObject2 = localObject1;
                  i6 = i3;
                  i5 = -1;
                  i3 = i6;
                  localObject1 = localObject2;
                  i4 = i2;
                  continue;
                }
                paramContext = new java/lang/StringBuilder;
                paramContext.<init>("QbSdk - preload_x5_check -- reset exception core_ver:");
                TbsLog.e("QbSdk", i4 + "; value:" + i3);
                continue;
              }
              catch (Throwable paramContext)
              {
                TbsLog.e("QbSdk", "tbs_preload_x5_counter disable version exception:" + Log.getStackTraceString(paramContext));
                AppMethodBeat.o(64032);
              }
              continue;
            }
            int i4 = i1;
            if (i3 > 0)
            {
              i4 = i1;
              if (i3 <= 3)
              {
                TbsLog.i("QbSdk", "QbSdk - preload_x5_check -- before creation!");
                bv.a().a(paramContext, null);
                TbsLog.i("QbSdk", "QbSdk - preload_x5_check -- after creation!");
                i4 = 0;
              }
            }
            try
            {
              i3 = ((SharedPreferences)localObject1).getInt("tbs_preload_x5_counter", -1);
              if (i3 > 0)
                ((SharedPreferences)localObject1).edit().putInt("tbs_preload_x5_counter", i3 - 1).commit();
              TbsLog.i("QbSdk", "QbSdk -- preload_x5_check result:".concat(String.valueOf(i4)));
              AppMethodBeat.o(64032);
            }
            catch (Throwable paramContext)
            {
              TbsLog.e("QbSdk", "tbs_preload_x5_counter Dec exception:" + Log.getStackTraceString(paramContext));
              continue;
            }
            localThrowable1 = localThrowable1;
            i4 = -1;
            continue;
          }
          catch (Throwable localThrowable2)
          {
            continue;
          }
        }
        label603: int i3 = -1;
      }
    }
  }

  public static boolean deleteMiniQBShortCut(Context paramContext, String paramString1, String paramString2)
  {
    boolean bool = false;
    AppMethodBeat.i(64049);
    if (paramContext == null)
      AppMethodBeat.o(64049);
    while (true)
    {
      return bool;
      if (TbsDownloader.getOverSea(paramContext))
      {
        AppMethodBeat.o(64049);
      }
      else
      {
        bv localbv = bv.a();
        if ((localbv != null) && (localbv.b()))
        {
          if (localbv.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "deleteMiniQBShortCut", new Class[] { Context.class, String.class, String.class }, new Object[] { paramContext, paramString1, paramString2 }) != null)
          {
            AppMethodBeat.o(64049);
            bool = true;
          }
          else
          {
            AppMethodBeat.o(64049);
          }
        }
        else
          AppMethodBeat.o(64049);
      }
    }
  }

  public static void disAllowThirdAppDownload()
  {
    c = false;
  }

  public static void disableAutoCreateX5Webview()
  {
    j = false;
  }

  public static void fileInfoDetect(Context paramContext, String paramString, android.webkit.ValueCallback<String> paramValueCallback)
  {
    AppMethodBeat.i(64054);
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b()));
    while (true)
    {
      try
      {
        localbv.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "fileInfoDetect", new Class[] { Context.class, String.class, android.webkit.ValueCallback.class }, new Object[] { paramContext, paramString, paramValueCallback });
        AppMethodBeat.o(64054);
        return;
      }
      catch (Throwable paramContext)
      {
      }
      AppMethodBeat.o(64054);
    }
  }

  public static void forceSysWebView()
  {
    AppMethodBeat.i(64019);
    b = true;
    u = "SysWebViewForcedByOuter: " + Log.getStackTraceString(new Throwable());
    TbsLog.e("QbSdk", "sys WebView: SysWebViewForcedByOuter");
    AppMethodBeat.o(64019);
  }

  public static long getApkFileSize(Context paramContext)
  {
    long l1 = 0L;
    AppMethodBeat.i(64039);
    if (paramContext != null)
    {
      l1 = TbsDownloadConfig.getInstance(paramContext.getApplicationContext()).mPreferences.getLong("tbs_apkfilesize", 0L);
      AppMethodBeat.o(64039);
    }
    while (true)
    {
      return l1;
      AppMethodBeat.o(64039);
    }
  }

  public static String getCurrentProcessName(Context paramContext)
  {
    AppMethodBeat.i(64026);
    try
    {
      int i1 = Process.myPid();
      Object localObject = "";
      Iterator localIterator = ((ActivityManager)paramContext.getApplicationContext().getSystemService("activity")).getRunningAppProcesses().iterator();
      for (paramContext = (Context)localObject; localIterator.hasNext(); paramContext = ((ActivityManager.RunningAppProcessInfo)localObject).processName)
      {
        localObject = (ActivityManager.RunningAppProcessInfo)localIterator.next();
        if (((ActivityManager.RunningAppProcessInfo)localObject).pid != i1)
          break label93;
      }
      AppMethodBeat.o(64026);
      return paramContext;
    }
    catch (Throwable paramContext)
    {
      label93: 
      while (true)
      {
        paramContext = "";
        AppMethodBeat.o(64026);
      }
    }
  }

  public static String[] getDexLoaderFileList(Context paramContext1, Context paramContext2, String paramString)
  {
    int i1 = 0;
    AppMethodBeat.i(64037);
    if ((t instanceof String[]))
    {
      int i2 = t.length;
      paramContext1 = new String[i2];
      while (i1 < i2)
      {
        paramContext1[i1] = (paramString + t[i1]);
        i1++;
      }
      AppMethodBeat.o(64037);
      return paramContext1;
    }
    paramContext1 = r.a(r, "getJarFiles", new Class[] { Context.class, Context.class, String.class }, new Object[] { paramContext1, paramContext2, paramString });
    if ((paramContext1 instanceof String[]));
    while (true)
    {
      paramContext1 = (String[])paramContext1;
      AppMethodBeat.o(64037);
      break;
      paramContext1 = new String[1];
      paramContext1[0] = "";
    }
  }

  public static boolean getDownloadWithoutWifi()
  {
    return F;
  }

  public static boolean getIsSysWebViewForcedByOuter()
  {
    return b;
  }

  public static boolean getJarFilesAndLibraryPath(Context paramContext)
  {
    AppMethodBeat.i(64036);
    boolean bool;
    if (r == null)
    {
      TbsLog.i("QbSdk", "getJarFilesAndLibraryPath sExtensionObj is null");
      AppMethodBeat.o(64036);
      bool = false;
    }
    while (true)
    {
      return bool;
      Bundle localBundle = (Bundle)r.a(r, "canLoadX5CoreAndNotLoadSo", new Class[] { Integer.TYPE }, new Object[] { Integer.valueOf(43644) });
      if (localBundle == null)
      {
        TbsLog.i("QbSdk", "getJarFilesAndLibraryPath bundle is null and coreverison is " + an.a().a(true, paramContext));
        AppMethodBeat.o(64036);
        bool = false;
      }
      else
      {
        t = localBundle.getStringArray("tbs_jarfiles");
        d = localBundle.getString("tbs_librarypath");
        AppMethodBeat.o(64036);
        bool = true;
      }
    }
  }

  public static String getMiniQBVersion(Context paramContext)
  {
    Object localObject = null;
    AppMethodBeat.i(64046);
    bv localbv = bv.a();
    localbv.a(paramContext, null);
    if ((localbv != null) && (localbv.b()))
    {
      paramContext = localbv.c().f();
      AppMethodBeat.o(64046);
    }
    while (true)
    {
      return paramContext;
      AppMethodBeat.o(64046);
      paramContext = localObject;
    }
  }

  public static boolean getOnlyDownload()
  {
    return k;
  }

  public static String getQQBuildNumber()
  {
    return A;
  }

  public static Map<String, Object> getSettings()
  {
    return n;
  }

  public static boolean getTBSInstalling()
  {
    return G;
  }

  public static String getTID()
  {
    return z;
  }

  public static String getTbsResourcesPath(Context paramContext)
  {
    AppMethodBeat.i(64017);
    paramContext = TbsShareManager.g(paramContext);
    AppMethodBeat.o(64017);
    return paramContext;
  }

  public static int getTbsVersion(Context paramContext)
  {
    AppMethodBeat.i(64033);
    int i1;
    if (TbsShareManager.isThirdPartyApp(paramContext))
    {
      i1 = TbsShareManager.a(paramContext, false);
      AppMethodBeat.o(64033);
    }
    while (true)
    {
      return i1;
      i1 = an.a().j(paramContext);
      if ((i1 == 0) && (ai.a(paramContext).c() == 3))
        reset(paramContext);
      AppMethodBeat.o(64033);
    }
  }

  public static int getTbsVersionForCrash(Context paramContext)
  {
    AppMethodBeat.i(64034);
    int i1;
    if (TbsShareManager.isThirdPartyApp(paramContext))
    {
      i1 = TbsShareManager.a(paramContext, false);
      AppMethodBeat.o(64034);
    }
    while (true)
    {
      return i1;
      i1 = an.a().k(paramContext);
      if ((i1 == 0) && (ai.a(paramContext).c() == 3))
        reset(paramContext);
      AppMethodBeat.o(64034);
    }
  }

  public static void initBuglyAsync(boolean paramBoolean)
  {
    i = paramBoolean;
  }

  public static void initForinitAndNotLoadSo(Context paramContext)
  {
    AppMethodBeat.i(63999);
    Object localObject;
    if (q == null)
    {
      localObject = an.a().r(paramContext);
      if (localObject == null)
        AppMethodBeat.o(63999);
    }
    while (true)
    {
      return;
      File localFile = new File((File)localObject, "tbs_sdk_extension_dex.jar");
      if (!localFile.exists())
      {
        AppMethodBeat.o(63999);
      }
      else
      {
        localObject = ((File)localObject).getAbsolutePath();
        bv.a().a(paramContext);
        q = new DexLoader(localFile.getParent(), paramContext, new String[] { localFile.getAbsolutePath() }, (String)localObject, null).loadClass("com.tencent.tbs.sdk.extension.TbsSDKExtension");
        AppMethodBeat.o(63999);
      }
    }
  }

  public static void initTbsSettings(Map<String, Object> paramMap)
  {
    AppMethodBeat.i(64051);
    if (n == null)
    {
      n = paramMap;
      AppMethodBeat.o(64051);
    }
    while (true)
    {
      return;
      try
      {
        n.putAll(paramMap);
        AppMethodBeat.o(64051);
      }
      catch (Exception paramMap)
      {
        AppMethodBeat.o(64051);
      }
    }
  }

  public static void initX5Environment(Context paramContext, QbSdk.PreInitCallback paramPreInitCallback)
  {
    AppMethodBeat.i(64031);
    if (paramContext == null)
      AppMethodBeat.o(64031);
    while (true)
    {
      return;
      b(paramContext);
      E = new l(paramContext, paramPreInitCallback);
      if (TbsShareManager.isThirdPartyApp(paramContext))
        an.a().b(paramContext, true);
      TbsDownloader.needDownload(paramContext, false, false, new m(paramContext, paramPreInitCallback));
      AppMethodBeat.o(64031);
    }
  }

  public static boolean installLocalQbApk(Context paramContext, String paramString1, String paramString2, Bundle paramBundle)
  {
    boolean bool = false;
    AppMethodBeat.i(64011);
    o localo = o.a(true);
    localo.a(paramContext, false, false, null);
    if ((localo != null) && (localo.b()))
    {
      bool = localo.a().a(paramContext, paramString1, paramString2, paramBundle);
      AppMethodBeat.o(64011);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(64011);
    }
  }

  public static boolean intentDispatch(WebView paramWebView, Intent paramIntent, String paramString1, String paramString2)
  {
    AppMethodBeat.i(64050);
    boolean bool;
    if (paramWebView == null)
    {
      AppMethodBeat.o(64050);
      bool = false;
      return bool;
    }
    Context localContext;
    int i1;
    if (paramString1.startsWith("mttbrowser://miniqb/ch=icon?"))
    {
      localContext = paramWebView.getContext();
      i1 = paramString1.indexOf("url=");
      if (i1 <= 0)
        break label214;
    }
    label214: for (paramIntent = paramString1.substring(i1 + 4); ; paramIntent = null)
      while (true)
      {
        HashMap localHashMap = new HashMap();
        paramString1 = "unknown";
        try
        {
          String str = localContext.getApplicationInfo().packageName;
          paramString1 = str;
          localHashMap.put("ChannelID", paramString1);
          localHashMap.put("PosID", "14004");
          if ("miniqb://home".equals(paramIntent))
          {
            paramString1 = "qb://navicard/addCard?cardId=168&cardName=168";
            if (d.a(localContext, paramString1, localHashMap, "QbSdk.startMiniQBToLoadUrl", null) != 0)
            {
              paramString1 = bv.a();
              if ((paramString1 != null) && (paramString1.b()) && (paramString1.c().a(localContext, paramIntent, null, paramString2, null) == 0))
              {
                bool = true;
                AppMethodBeat.o(64050);
                break;
              }
              paramWebView.loadUrl(paramIntent);
            }
            while (true)
            {
              AppMethodBeat.o(64050);
              bool = false;
              break;
              paramWebView.loadUrl(paramString1);
            }
          }
        }
        catch (Exception localException)
        {
          while (true)
          {
            continue;
            paramString1 = paramIntent;
          }
        }
      }
  }

  public static boolean isMiniQBShortCutExist(Context paramContext, String paramString1, String paramString2)
  {
    AppMethodBeat.i(64048);
    if (paramContext == null)
      AppMethodBeat.o(64048);
    for (boolean bool = false; ; bool = false)
    {
      return bool;
      if (!TbsDownloader.getOverSea(paramContext))
        break;
      AppMethodBeat.o(64048);
    }
    paramString2 = bv.a();
    if ((paramString2 != null) && (paramString2.b()))
    {
      paramString1 = paramString2.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "isMiniQBShortCutExist", new Class[] { Context.class, String.class }, new Object[] { paramContext, paramString1 });
      if (paramString1 != null)
      {
        paramContext = Boolean.FALSE;
        if (!(paramString1 instanceof Boolean))
          break label152;
        paramContext = (Boolean)paramString1;
      }
    }
    label152: 
    while (true)
    {
      bool = paramContext.booleanValue();
      AppMethodBeat.o(64048);
      break;
      AppMethodBeat.o(64048);
      bool = false;
      break;
      AppMethodBeat.o(64048);
      bool = false;
      break;
    }
  }

  public static boolean isNeedInitX5FirstTime()
  {
    return w;
  }

  public static boolean isTbsCoreInited()
  {
    boolean bool = false;
    AppMethodBeat.i(64030);
    o localo = o.a(false);
    if ((localo != null) && (localo.g()))
    {
      bool = true;
      AppMethodBeat.o(64030);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(64030);
    }
  }

  public static boolean isX5DisabledSync(Context paramContext)
  {
    boolean bool = false;
    AppMethodBeat.i(64009);
    int i1;
    if (ai.a(paramContext).c() == 2)
    {
      i1 = 1;
      if (i1 == 0)
        break label38;
      AppMethodBeat.o(64009);
    }
    while (true)
    {
      return bool;
      i1 = 0;
      break;
      label38: if (!c(paramContext))
      {
        AppMethodBeat.o(64009);
        bool = true;
      }
      else
      {
        i1 = an.a().j(paramContext);
        paramContext = r.a(r, "isX5DisabledSync", new Class[] { Integer.TYPE, Integer.TYPE }, new Object[] { Integer.valueOf(i1), Integer.valueOf(43644) });
        if (paramContext != null)
        {
          bool = ((Boolean)paramContext).booleanValue();
          AppMethodBeat.o(64009);
        }
        else
        {
          AppMethodBeat.o(64009);
          bool = true;
        }
      }
    }
  }

  public static void loadTBSSDKExtension(Context paramContext, String paramString)
  {
    int i1 = 1;
    AppMethodBeat.i(63998);
    if (r != null)
      AppMethodBeat.o(63998);
    while (true)
    {
      return;
      if (q == null)
        TbsLog.i("QbSdk", "QbSdk loadTBSSDKExtension sExtensionClass is null");
      Object localObject1 = null;
      try
      {
        localObject2 = q.getConstructor(new Class[] { Context.class, Context.class, String.class, String.class, String.class });
        localObject1 = localObject2;
      }
      catch (Throwable localThrowable)
      {
        try
        {
          while (true)
          {
            if (!TbsShareManager.isThirdPartyApp(paramContext))
              break label302;
            Object localObject2 = TbsShareManager.e(paramContext);
            if ((localObject2 != null) || (TbsShareManager.getHostCorePathAppDefined() != null))
              break label133;
            TbsLogReport.getInstance(paramContext.getApplicationContext()).setLoadErrorCode(227, "host context is null!");
            AppMethodBeat.o(63998);
            break;
            localThrowable = localThrowable;
            i1 = 0;
          }
          label133: if (i1 != 0)
            break label259;
          if (localThrowable != null)
            break label211;
          r = q.getConstructor(new Class[] { Context.class, Context.class, String.class }).newInstance(new Object[] { paramContext, localThrowable, TbsShareManager.getHostCorePathAppDefined() });
          AppMethodBeat.o(63998);
        }
        catch (Throwable paramContext)
        {
          AppMethodBeat.o(63998);
        }
        continue;
        label211: r = q.getConstructor(new Class[] { Context.class, Context.class }).newInstance(new Object[] { paramContext, localThrowable });
        AppMethodBeat.o(63998);
        continue;
        label259: r = ((Constructor)localObject1).newInstance(new Object[] { paramContext, localThrowable, TbsShareManager.getHostCorePathAppDefined(), paramString, null });
        AppMethodBeat.o(63998);
      }
      continue;
      label302: if (i1 == 0)
      {
        localObject1 = q.getConstructor(new Class[] { Context.class, Context.class });
        paramString = paramContext;
        if (paramContext.getApplicationContext() != null)
          paramString = paramContext.getApplicationContext();
        r = ((Constructor)localObject1).newInstance(new Object[] { paramString, paramString });
        AppMethodBeat.o(63998);
      }
      else
      {
        Object localObject4 = null;
        Object localObject3 = localObject4;
        if ("com.tencent.mm".equals(getCurrentProcessName(paramContext)))
        {
          localObject3 = localObject4;
          if (!WebView.mWebViewCreated)
            localObject3 = "notLoadSo";
        }
        r = ((Constructor)localObject1).newInstance(new Object[] { paramContext, paramContext, null, paramString, localObject3 });
        AppMethodBeat.o(63998);
      }
    }
  }

  public static void preInit(Context paramContext)
  {
    try
    {
      AppMethodBeat.i(64023);
      preInit(paramContext, null);
      AppMethodBeat.o(64023);
      return;
    }
    finally
    {
      paramContext = finally;
    }
    throw paramContext;
  }

  public static void preInit(Context paramContext, QbSdk.PreInitCallback paramPreInitCallback)
  {
    try
    {
      AppMethodBeat.i(64027);
      TbsLog.initIfNeed(paramContext);
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>("preInit -- processName: ");
      TbsLog.i("QbSdk", getCurrentProcessName(paramContext));
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("preInit -- stack: ");
      localObject = new java/lang/Throwable;
      ((Throwable)localObject).<init>("#");
      TbsLog.i("QbSdk", Log.getStackTraceString((Throwable)localObject));
      l = a;
      if (!s)
      {
        localObject = new com/tencent/smtt/sdk/j;
        ((j)localObject).<init>(Looper.getMainLooper(), paramPreInitCallback, paramContext);
        paramPreInitCallback = new com/tencent/smtt/sdk/k;
        paramPreInitCallback.<init>(paramContext, (Handler)localObject);
        paramPreInitCallback.setName("tbs_preinit");
        paramPreInitCallback.setPriority(10);
        paramPreInitCallback.start();
        s = true;
      }
      AppMethodBeat.o(64027);
      return;
    }
    finally
    {
    }
    throw paramContext;
  }

  public static void reset(Context paramContext)
  {
    AppMethodBeat.i(64040);
    reset(paramContext, false);
    AppMethodBeat.o(64040);
  }

  public static void reset(Context paramContext, boolean paramBoolean)
  {
    int i1 = 1;
    AppMethodBeat.i(64041);
    TbsLog.e("QbSdk", "QbSdk reset!", true);
    try
    {
      TbsDownloader.stopDownload();
      if ((paramBoolean) && (!TbsShareManager.isThirdPartyApp(paramContext)))
      {
        int i2 = an.a().i(paramContext);
        int i3 = an.a().j(paramContext);
        if ((i2 > 43300) && (i2 != i3))
        {
          TbsDownloader.b(paramContext);
          com.tencent.smtt.utils.k.a(paramContext.getDir("tbs", 0), false, "core_share_decouple");
          TbsLog.i("QbSdk", "delete downloaded apk success", true);
          an.a.set(Integer.valueOf(0));
          File localFile = new java/io/File;
          localFile.<init>(paramContext.getFilesDir(), "bugly_switch.txt");
          if (localFile.exists())
            localFile.delete();
          if (i1 != 0)
          {
            com.tencent.smtt.utils.k.b(an.a().q(paramContext), an.a().u(paramContext));
            an.a().b(paramContext);
          }
          AppMethodBeat.o(64041);
          return;
        }
      }
    }
    catch (Throwable paramContext)
    {
      while (true)
      {
        TbsLog.e("QbSdk", "QbSdk reset exception:" + Log.getStackTraceString(paramContext));
        AppMethodBeat.o(64041);
        continue;
        i1 = 0;
      }
    }
  }

  public static void resetDecoupleCore(Context paramContext)
  {
    AppMethodBeat.i(64042);
    TbsLog.e("QbSdk", "QbSdk resetDecoupleCore!", true);
    try
    {
      com.tencent.smtt.utils.k.b(an.a().q(paramContext));
      AppMethodBeat.o(64042);
      return;
    }
    catch (Throwable paramContext)
    {
      while (true)
      {
        TbsLog.e("QbSdk", "QbSdk resetDecoupleCore exception:" + Log.getStackTraceString(paramContext));
        AppMethodBeat.o(64042);
      }
    }
  }

  public static void setCurrentID(String paramString)
  {
    AppMethodBeat.i(64016);
    if (paramString == null)
      AppMethodBeat.o(64016);
    while (true)
    {
      return;
      if (paramString.startsWith("QQ:"))
      {
        paramString = paramString.substring(3);
        z = "0000000000000000".substring(paramString.length()) + paramString;
      }
      AppMethodBeat.o(64016);
    }
  }

  public static void setDeviceInfo(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    b.a = paramString1;
    b.b = paramString2;
    b.c = paramString3;
    b.d = paramString4;
  }

  public static void setDisableUnpreinitBySwitch(boolean paramBoolean)
  {
    AppMethodBeat.i(64025);
    B = paramBoolean;
    TbsLog.i("QbSdk", "setDisableUnpreinitBySwitch -- mDisableUnpreinitBySwitch is " + B);
    AppMethodBeat.o(64025);
  }

  public static void setDisableUseHostBackupCoreBySwitch(boolean paramBoolean)
  {
    AppMethodBeat.i(64024);
    mDisableUseHostBackupCore = paramBoolean;
    TbsLog.i("QbSdk", "setDisableUseHostBackupCoreBySwitch -- mDisableUseHostBackupCore is " + mDisableUseHostBackupCore);
    AppMethodBeat.o(64024);
  }

  public static void setDownloadWithoutWifi(boolean paramBoolean)
  {
    F = paramBoolean;
  }

  public static void setNeedInitX5FirstTime(boolean paramBoolean)
  {
    w = paramBoolean;
  }

  public static void setOnlyDownload(boolean paramBoolean)
  {
    k = paramBoolean;
  }

  public static void setQQBuildNumber(String paramString)
  {
    A = paramString;
  }

  public static void setTBSInstallingStatus(boolean paramBoolean)
  {
    G = paramBoolean;
  }

  public static void setTbsListener(TbsListener paramTbsListener)
  {
    D = paramTbsListener;
  }

  public static void setTbsLogClient(TbsLogClient paramTbsLogClient)
  {
    AppMethodBeat.i(64010);
    TbsLog.setTbsLogClient(paramTbsLogClient);
    AppMethodBeat.o(64010);
  }

  public static void setUploadCode(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(64028);
    if ((paramInt >= 130) && (paramInt <= 139))
    {
      paramContext = TbsDownloadUpload.getInstance(paramContext);
      paramContext.a.put("tbs_needdownload_code", Integer.valueOf(paramInt));
      paramContext.commit();
      AppMethodBeat.o(64028);
    }
    while (true)
    {
      return;
      if ((paramInt >= 150) && (paramInt <= 159))
      {
        paramContext = TbsDownloadUpload.getInstance(paramContext);
        paramContext.a.put("tbs_startdownload_code", Integer.valueOf(paramInt));
        paramContext.commit();
      }
      AppMethodBeat.o(64028);
    }
  }

  public static int startMiniQBToLoadUrl(Context paramContext, String paramString, HashMap<String, String> paramHashMap, android.webkit.ValueCallback<String> paramValueCallback)
  {
    AppMethodBeat.i(64044);
    TbsCoreLoadStat.getInstance().a(paramContext, 501);
    int i1;
    if (paramContext == null)
    {
      i1 = -100;
      AppMethodBeat.o(64044);
    }
    while (true)
    {
      return i1;
      bv localbv = bv.a();
      localbv.a(paramContext, null);
      if (localbv.b())
      {
        if ((paramContext != null) && (paramContext.getApplicationInfo().packageName.equals("com.nd.android.pandahome2")) && (getTbsVersion(paramContext) < 25487))
        {
          i1 = -101;
          AppMethodBeat.o(64044);
        }
        else
        {
          i1 = localbv.c().a(paramContext, paramString, paramHashMap, null, paramValueCallback);
          if (i1 == 0)
            TbsCoreLoadStat.getInstance().a(paramContext, 503);
          while (true)
          {
            AppMethodBeat.o(64044);
            break;
            TbsLogReport.getInstance(paramContext).setLoadErrorCode(504, String.valueOf(i1));
          }
        }
      }
      else
      {
        TbsCoreLoadStat.getInstance().a(paramContext, 502);
        i1 = -102;
        AppMethodBeat.o(64044);
      }
    }
  }

  public static boolean startQBForDoc(Context paramContext, String paramString1, int paramInt1, int paramInt2, String paramString2, Bundle paramBundle)
  {
    AppMethodBeat.i(63996);
    HashMap localHashMap = new HashMap();
    localHashMap.put("ChannelID", paramContext.getApplicationContext().getApplicationInfo().processName);
    localHashMap.put("PosID", Integer.toString(paramInt1));
    boolean bool = d.a(paramContext, paramString1, paramInt2, paramString2, localHashMap, paramBundle);
    AppMethodBeat.o(63996);
    return bool;
  }

  public static boolean startQBForVideo(Context paramContext, String paramString, int paramInt)
  {
    AppMethodBeat.i(63995);
    HashMap localHashMap = new HashMap();
    localHashMap.put("ChannelID", paramContext.getApplicationInfo().processName);
    localHashMap.put("PosID", Integer.toString(paramInt));
    boolean bool = d.a(paramContext, paramString, localHashMap);
    AppMethodBeat.o(63995);
    return bool;
  }

  public static boolean startQBToLoadurl(Context paramContext, String paramString, int paramInt, WebView paramWebView)
  {
    AppMethodBeat.i(63994);
    HashMap localHashMap = new HashMap();
    localHashMap.put("ChannelID", paramContext.getApplicationInfo().processName);
    localHashMap.put("PosID", Integer.toString(paramInt));
    WebView localWebView1 = paramWebView;
    if (paramWebView == null);
    try
    {
      Object localObject = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).packageName;
      if (localObject != "com.tencent.mm")
      {
        localWebView1 = paramWebView;
        if (localObject != "com.tencent.mobileqq");
      }
      else
      {
        localObject = bv.a();
        localWebView1 = paramWebView;
        if (localObject != null)
        {
          localWebView1 = paramWebView;
          if (((bv)localObject).b())
          {
            localObject = ((bv)localObject).c().b().invokeStaticMethod("com.tencent.smtt.webkit.WebViewList", "getCurrentMainWebviewJustForQQandWechat", new Class[0], new Object[0]);
            localWebView1 = paramWebView;
            if (localObject != null)
            {
              localObject = (IX5WebViewBase)localObject;
              localWebView1 = paramWebView;
              if (localObject != null)
                localWebView1 = (WebView)((IX5WebViewBase)localObject).getView().getParent();
            }
          }
        }
      }
      boolean bool;
      if (d.a(paramContext, paramString, localHashMap, "QbSdk.startQBToLoadurl", localWebView1) == 0)
      {
        bool = true;
        AppMethodBeat.o(63994);
      }
      while (true)
      {
        return bool;
        AppMethodBeat.o(63994);
        bool = false;
      }
    }
    catch (Exception localException)
    {
      while (true)
        WebView localWebView2 = paramWebView;
    }
  }

  public static boolean startQbOrMiniQBToLoadUrl(Context paramContext, String paramString, HashMap<String, String> paramHashMap, ValueCallback<String> paramValueCallback)
  {
    AppMethodBeat.i(64045);
    boolean bool;
    if (paramContext == null)
    {
      AppMethodBeat.o(64045);
      bool = false;
    }
    while (true)
    {
      return bool;
      bv localbv = bv.a();
      localbv.a(paramContext, null);
      if ((paramHashMap != null) && ("5".equals(paramHashMap.get("PosID"))) && (localbv.b()))
        localbv.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "getAdWebViewInfoFromX5Core", new Class[0], new Object[0]);
      if (d.a(paramContext, paramString, paramHashMap, "QbSdk.startMiniQBToLoadUrl", null) != 0)
      {
        if (localbv.b())
        {
          if ((paramContext != null) && (paramContext.getApplicationInfo().packageName.equals("com.nd.android.pandahome2")) && (getTbsVersion(paramContext) < 25487))
          {
            AppMethodBeat.o(64045);
            bool = false;
            continue;
          }
          if (localbv.c().a(paramContext, paramString, paramHashMap, null, paramValueCallback) == 0)
          {
            AppMethodBeat.o(64045);
            bool = true;
          }
        }
      }
      else
      {
        AppMethodBeat.o(64045);
        bool = true;
        continue;
        AppMethodBeat.o(64045);
        bool = false;
      }
    }
  }

  public static void unForceSysWebView()
  {
    AppMethodBeat.i(64020);
    b = false;
    TbsLog.e("QbSdk", "sys WebView: unForceSysWebView called");
    AppMethodBeat.o(64020);
  }

  public static boolean unPreInit(Context paramContext)
  {
    return true;
  }

  public static boolean useSoftWare()
  {
    AppMethodBeat.i(64038);
    boolean bool;
    if (r == null)
    {
      AppMethodBeat.o(64038);
      bool = false;
    }
    while (true)
    {
      return bool;
      Object localObject1 = r.a(r, "useSoftWare", new Class[0], new Object[0]);
      Object localObject2 = localObject1;
      if (localObject1 == null)
      {
        localObject2 = r;
        localObject1 = Integer.TYPE;
        int i1 = a.a();
        localObject2 = r.a(localObject2, "useSoftWare", new Class[] { localObject1 }, new Object[] { Integer.valueOf(i1) });
      }
      if (localObject2 == null)
      {
        AppMethodBeat.o(64038);
        bool = false;
      }
      else
      {
        bool = ((Boolean)localObject2).booleanValue();
        AppMethodBeat.o(64038);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.QbSdk
 * JD-Core Version:    0.6.2
 */
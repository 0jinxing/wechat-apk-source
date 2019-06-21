package com.tencent.smtt.sdk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.utils.TbsLog;
import com.tencent.smtt.utils.a;
import com.tencent.smtt.utils.b;
import com.tencent.smtt.utils.k;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class TbsShareManager
{
  private static Context a;
  private static boolean b;
  private static String c = null;
  private static String d = null;
  private static int e = 0;
  private static String f = null;
  private static boolean g = false;
  private static boolean h = false;
  private static boolean i = false;
  private static String j = null;
  private static boolean k = false;
  private static boolean l = false;
  public static boolean mHasQueryed = false;

  static int a(Context paramContext, boolean paramBoolean)
  {
    AppMethodBeat.i(64580);
    b(paramContext, paramBoolean);
    int m = e;
    AppMethodBeat.o(64580);
    return m;
  }

  static String a()
  {
    return d;
  }

  static void a(Context paramContext)
  {
    AppMethodBeat.i(64568);
    TbsLog.i("TbsShareManager", "shareTbsCore #1");
    try
    {
      TbsLinuxToolsJni localTbsLinuxToolsJni = new com/tencent/smtt/sdk/TbsLinuxToolsJni;
      localTbsLinuxToolsJni.<init>(paramContext);
      a(paramContext, localTbsLinuxToolsJni, an.a().r(paramContext));
      File localFile = an.a().s(paramContext);
      paramContext = new java/lang/StringBuilder;
      paramContext.<init>("shareTbsCore tbsShareDir is ");
      TbsLog.i("TbsShareManager", localFile.getAbsolutePath());
      localTbsLinuxToolsJni.a(localFile.getAbsolutePath(), "755");
      AppMethodBeat.o(64568);
      return;
    }
    catch (Throwable paramContext)
    {
      while (true)
      {
        TbsLog.i("TbsShareManager", "shareTbsCore tbsShareDir error is " + paramContext.getMessage() + " ## " + paramContext.getCause());
        AppMethodBeat.o(64568);
      }
    }
  }

  private static void a(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(64589);
    int m;
    String str2;
    Object localObject;
    if (!TbsPVConfig.getInstance(a).isDisableHostBackupCore())
    {
      String str1 = paramContext.getPackageName();
      TbsLog.i("TbsShareManager", "find host backup core to unzip #1" + Log.getStackTraceString(new Throwable()));
      m = 0;
      if (m < 5)
      {
        str2 = new String[] { "com.tencent.tbs", "com.tencent.mm", "com.tencent.mobileqq", "com.qzone", str1 }[m];
        if (paramInt == getBackupCoreVersion(paramContext, str2))
        {
          localObject = getPackageContext(paramContext, str2, false);
          if (!an.a().f((Context)localObject))
            break label287;
          localObject = getBackupCoreFile(paramContext, str2);
          if (!a.a(paramContext, (File)localObject, 0L, paramInt))
            break label287;
          TbsLog.i("TbsShareManager", "find host backup core to unzip normal coreVersion is " + paramInt + " packageName is " + str2);
          an.a().a(paramContext, (File)localObject, paramInt);
          AppMethodBeat.o(64589);
        }
      }
    }
    while (true)
    {
      return;
      if (paramInt == getBackupDecoupleCoreVersion(paramContext, str2))
      {
        localObject = getPackageContext(paramContext, str2, false);
        if (an.a().f((Context)localObject))
        {
          localObject = getBackupDecoupleCoreFile(paramContext, str2);
          if (a.a(paramContext, (File)localObject, 0L, paramInt))
          {
            TbsLog.i("TbsShareManager", "find host backup core to unzip decouple coreVersion is " + paramInt + " packageName is " + str2);
            an.a().a(paramContext, (File)localObject, paramInt);
            AppMethodBeat.o(64589);
          }
        }
      }
      else
      {
        label287: m++;
        break;
        AppMethodBeat.o(64589);
      }
    }
  }

  private static void a(Context paramContext, TbsLinuxToolsJni paramTbsLinuxToolsJni, File paramFile)
  {
    AppMethodBeat.i(64570);
    TbsLog.i("TbsShareManager", "shareAllDirsAndFiles #1");
    if ((paramFile == null) || (!paramFile.exists()) || (!paramFile.isDirectory()))
      AppMethodBeat.o(64570);
    while (true)
    {
      return;
      TbsLog.i("TbsShareManager", "shareAllDirsAndFiles dir is " + paramFile.getAbsolutePath());
      paramTbsLinuxToolsJni.a(paramFile.getAbsolutePath(), "755");
      paramFile = paramFile.listFiles();
      int m = paramFile.length;
      int n = 0;
      if (n < m)
      {
        File localFile = paramFile[n];
        if (localFile.isFile())
          if (localFile.getAbsolutePath().indexOf(".so") > 0)
            paramTbsLinuxToolsJni.a(localFile.getAbsolutePath(), "755");
        while (true)
        {
          n++;
          break;
          paramTbsLinuxToolsJni.a(localFile.getAbsolutePath(), "644");
          continue;
          if (localFile.isDirectory())
            a(paramContext, paramTbsLinuxToolsJni, localFile);
          else
            TbsLog.e("TbsShareManager", "unknown file type.", true);
        }
      }
      AppMethodBeat.o(64570);
    }
  }

  static void b(Context paramContext)
  {
    AppMethodBeat.i(64569);
    try
    {
      TbsLinuxToolsJni localTbsLinuxToolsJni = new com/tencent/smtt/sdk/TbsLinuxToolsJni;
      localTbsLinuxToolsJni.<init>(paramContext);
      a(paramContext, localTbsLinuxToolsJni, an.a().q(paramContext));
      AppMethodBeat.o(64569);
      return;
    }
    catch (Throwable paramContext)
    {
      while (true)
        AppMethodBeat.o(64569);
    }
  }

  static boolean b(Context paramContext, boolean paramBoolean)
  {
    AppMethodBeat.i(64598);
    if (i(paramContext))
    {
      paramBoolean = true;
      AppMethodBeat.o(64598);
    }
    while (true)
    {
      return paramBoolean;
      if (paramBoolean)
        QbSdk.a(paramContext, "TbsShareManager::isShareTbsCoreAvailable forceSysWebViewInner!");
      paramBoolean = false;
      AppMethodBeat.o(64598);
    }
  }

  static String c(Context paramContext)
  {
    AppMethodBeat.i(64578);
    j(paramContext);
    paramContext = d;
    AppMethodBeat.o(64578);
    return paramContext;
  }

  // ERROR //
  private static void c(Context paramContext, boolean paramBoolean)
  {
    // Byte code:
    //   0: ldc_w 262
    //   3: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: ldc_w 264
    //   10: invokestatic 267	com/tencent/smtt/sdk/TbsShareManager:getTbsShareFile	(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
    //   13: astore_2
    //   14: aload_2
    //   15: ifnonnull +34 -> 49
    //   18: iconst_0
    //   19: ifeq +11 -> 30
    //   22: new 269	java/lang/NullPointerException
    //   25: dup
    //   26: invokespecial 270	java/lang/NullPointerException:<init>	()V
    //   29: athrow
    //   30: iconst_0
    //   31: ifeq +11 -> 42
    //   34: new 269	java/lang/NullPointerException
    //   37: dup
    //   38: invokespecial 270	java/lang/NullPointerException:<init>	()V
    //   41: athrow
    //   42: ldc_w 262
    //   45: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   48: return
    //   49: new 272	java/io/FileInputStream
    //   52: astore_3
    //   53: aload_3
    //   54: aload_2
    //   55: invokespecial 275	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   58: new 277	java/io/BufferedInputStream
    //   61: astore 4
    //   63: aload 4
    //   65: aload_3
    //   66: invokespecial 280	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   69: new 282	java/util/Properties
    //   72: astore_3
    //   73: aload_3
    //   74: invokespecial 283	java/util/Properties:<init>	()V
    //   77: aload_3
    //   78: aload 4
    //   80: invokevirtual 286	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   83: aload_3
    //   84: ldc_w 288
    //   87: ldc_w 290
    //   90: invokevirtual 294	java/util/Properties:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //   93: pop
    //   94: iload_1
    //   95: ifeq +63 -> 158
    //   98: invokestatic 85	com/tencent/smtt/sdk/an:a	()Lcom/tencent/smtt/sdk/an;
    //   101: aload_0
    //   102: invokevirtual 89	com/tencent/smtt/sdk/an:r	(Landroid/content/Context;)Ljava/io/File;
    //   105: invokevirtual 107	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   108: astore 5
    //   110: aload_0
    //   111: invokevirtual 298	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   114: invokevirtual 152	android/content/Context:getPackageName	()Ljava/lang/String;
    //   117: astore 6
    //   119: aload_0
    //   120: invokestatic 303	com/tencent/smtt/utils/b:b	(Landroid/content/Context;)I
    //   123: istore 7
    //   125: aload_3
    //   126: ldc_w 305
    //   129: aload 6
    //   131: invokevirtual 294	java/util/Properties:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //   134: pop
    //   135: aload_3
    //   136: ldc_w 307
    //   139: aload 5
    //   141: invokevirtual 294	java/util/Properties:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //   144: pop
    //   145: aload_3
    //   146: ldc_w 309
    //   149: iload 7
    //   151: invokestatic 313	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   154: invokevirtual 294	java/util/Properties:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //   157: pop
    //   158: new 315	java/io/FileOutputStream
    //   161: astore 5
    //   163: aload 5
    //   165: aload_2
    //   166: invokespecial 316	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   169: new 318	java/io/BufferedOutputStream
    //   172: astore_0
    //   173: aload_0
    //   174: aload 5
    //   176: invokespecial 321	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   179: aload_3
    //   180: aload_0
    //   181: aconst_null
    //   182: invokevirtual 325	java/util/Properties:store	(Ljava/io/OutputStream;Ljava/lang/String;)V
    //   185: aload 4
    //   187: ifnull +8 -> 195
    //   190: aload 4
    //   192: invokevirtual 328	java/io/BufferedInputStream:close	()V
    //   195: aload_0
    //   196: ifnull +7 -> 203
    //   199: aload_0
    //   200: invokevirtual 329	java/io/BufferedOutputStream:close	()V
    //   203: ldc_w 262
    //   206: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   209: goto -161 -> 48
    //   212: astore_0
    //   213: aconst_null
    //   214: astore_0
    //   215: aconst_null
    //   216: astore 4
    //   218: aload 4
    //   220: ifnull +8 -> 228
    //   223: aload 4
    //   225: invokevirtual 328	java/io/BufferedInputStream:close	()V
    //   228: aload_0
    //   229: ifnull +7 -> 236
    //   232: aload_0
    //   233: invokevirtual 329	java/io/BufferedOutputStream:close	()V
    //   236: ldc_w 262
    //   239: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   242: goto -194 -> 48
    //   245: astore_0
    //   246: aconst_null
    //   247: astore 4
    //   249: aconst_null
    //   250: astore_2
    //   251: aload_2
    //   252: ifnull +7 -> 259
    //   255: aload_2
    //   256: invokevirtual 328	java/io/BufferedInputStream:close	()V
    //   259: aload 4
    //   261: ifnull +8 -> 269
    //   264: aload 4
    //   266: invokevirtual 329	java/io/BufferedOutputStream:close	()V
    //   269: ldc_w 262
    //   272: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   275: aload_0
    //   276: athrow
    //   277: astore 4
    //   279: goto -51 -> 228
    //   282: astore_0
    //   283: goto -47 -> 236
    //   286: astore_2
    //   287: goto -28 -> 259
    //   290: astore 4
    //   292: goto -23 -> 269
    //   295: astore_0
    //   296: goto -266 -> 30
    //   299: astore_0
    //   300: goto -258 -> 42
    //   303: astore 4
    //   305: goto -110 -> 195
    //   308: astore_0
    //   309: goto -106 -> 203
    //   312: astore_0
    //   313: aconst_null
    //   314: astore_3
    //   315: aload 4
    //   317: astore_2
    //   318: aload_3
    //   319: astore 4
    //   321: goto -70 -> 251
    //   324: astore_3
    //   325: aload_0
    //   326: astore 5
    //   328: aload 4
    //   330: astore_2
    //   331: aload_3
    //   332: astore_0
    //   333: aload 5
    //   335: astore 4
    //   337: goto -86 -> 251
    //   340: astore_0
    //   341: aconst_null
    //   342: astore_0
    //   343: goto -125 -> 218
    //   346: astore_2
    //   347: goto -129 -> 218
    //
    // Exception table:
    //   from	to	target	type
    //   6	14	212	java/lang/Throwable
    //   49	69	212	java/lang/Throwable
    //   6	14	245	finally
    //   49	69	245	finally
    //   223	228	277	java/lang/Exception
    //   232	236	282	java/lang/Exception
    //   255	259	286	java/lang/Exception
    //   264	269	290	java/lang/Exception
    //   22	30	295	java/lang/Exception
    //   34	42	299	java/lang/Exception
    //   190	195	303	java/lang/Exception
    //   199	203	308	java/lang/Exception
    //   69	94	312	finally
    //   98	158	312	finally
    //   158	179	312	finally
    //   179	185	324	finally
    //   69	94	340	java/lang/Throwable
    //   98	158	340	java/lang/Throwable
    //   158	179	340	java/lang/Throwable
    //   179	185	346	java/lang/Throwable
  }

  static int d(Context paramContext)
  {
    AppMethodBeat.i(64579);
    int m = a(paramContext, true);
    AppMethodBeat.o(64579);
    return m;
  }

  private static String[] d(Context paramContext, boolean paramBoolean)
  {
    AppMethodBeat.i(64588);
    String[] arrayOfString;
    if (QbSdk.getOnlyDownload())
    {
      arrayOfString = new String[1];
      arrayOfString[0] = paramContext.getApplicationContext().getPackageName();
    }
    while (true)
    {
      AppMethodBeat.o(64588);
      return arrayOfString;
      arrayOfString = getCoreProviderAppList();
      if (paramBoolean)
      {
        arrayOfString = new String[1];
        arrayOfString[0] = paramContext.getApplicationContext().getPackageName();
      }
    }
  }

  static Context e(Context paramContext)
  {
    Object localObject1 = null;
    AppMethodBeat.i(64581);
    j(paramContext);
    Object localObject2 = localObject1;
    if (f != null)
    {
      localObject2 = getPackageContext(paramContext, f, true);
      if (an.a().f((Context)localObject2))
        break label50;
      localObject2 = localObject1;
    }
    label50: 
    while (true)
    {
      AppMethodBeat.o(64581);
      return localObject2;
    }
  }

  // ERROR //
  static String f(Context paramContext)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc_w 344
    //   6: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_0
    //   10: ldc_w 264
    //   13: invokestatic 267	com/tencent/smtt/sdk/TbsShareManager:getTbsShareFile	(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
    //   16: astore_0
    //   17: aload_0
    //   18: ifnonnull +28 -> 46
    //   21: iconst_0
    //   22: ifeq +11 -> 33
    //   25: new 269	java/lang/NullPointerException
    //   28: dup
    //   29: invokespecial 270	java/lang/NullPointerException:<init>	()V
    //   32: athrow
    //   33: ldc_w 344
    //   36: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   39: aconst_null
    //   40: astore_0
    //   41: ldc 2
    //   43: monitorexit
    //   44: aload_0
    //   45: areturn
    //   46: new 272	java/io/FileInputStream
    //   49: astore_1
    //   50: aload_1
    //   51: aload_0
    //   52: invokespecial 275	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   55: new 277	java/io/BufferedInputStream
    //   58: astore_0
    //   59: aload_0
    //   60: aload_1
    //   61: invokespecial 280	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   64: new 282	java/util/Properties
    //   67: astore_1
    //   68: aload_1
    //   69: invokespecial 283	java/util/Properties:<init>	()V
    //   72: aload_1
    //   73: aload_0
    //   74: invokevirtual 286	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   77: aload_1
    //   78: ldc_w 305
    //   81: ldc_w 346
    //   84: invokevirtual 350	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   87: astore_1
    //   88: ldc_w 346
    //   91: aload_1
    //   92: invokevirtual 354	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   95: istore_2
    //   96: iload_2
    //   97: ifne +28 -> 125
    //   100: aload_0
    //   101: ifnull +7 -> 108
    //   104: aload_0
    //   105: invokevirtual 328	java/io/BufferedInputStream:close	()V
    //   108: ldc_w 344
    //   111: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   114: aload_1
    //   115: astore_0
    //   116: goto -75 -> 41
    //   119: astore_0
    //   120: ldc 2
    //   122: monitorexit
    //   123: aload_0
    //   124: athrow
    //   125: aload_0
    //   126: ifnull +7 -> 133
    //   129: aload_0
    //   130: invokevirtual 328	java/io/BufferedInputStream:close	()V
    //   133: ldc_w 344
    //   136: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   139: aconst_null
    //   140: astore_0
    //   141: goto -100 -> 41
    //   144: astore_1
    //   145: aconst_null
    //   146: astore_0
    //   147: aload_0
    //   148: ifnull +7 -> 155
    //   151: aload_0
    //   152: invokevirtual 328	java/io/BufferedInputStream:close	()V
    //   155: ldc_w 344
    //   158: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   161: aload_1
    //   162: athrow
    //   163: astore_0
    //   164: aconst_null
    //   165: astore_0
    //   166: aload_0
    //   167: ifnull +7 -> 174
    //   170: aload_0
    //   171: invokevirtual 328	java/io/BufferedInputStream:close	()V
    //   174: ldc_w 344
    //   177: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   180: aconst_null
    //   181: astore_0
    //   182: goto -141 -> 41
    //   185: astore_0
    //   186: goto -12 -> 174
    //   189: astore_0
    //   190: goto -35 -> 155
    //   193: astore_0
    //   194: goto -161 -> 33
    //   197: astore_0
    //   198: goto -90 -> 108
    //   201: astore_0
    //   202: goto -69 -> 133
    //   205: astore_1
    //   206: goto -59 -> 147
    //   209: astore_1
    //   210: goto -44 -> 166
    //
    // Exception table:
    //   from	to	target	type
    //   3	9	119	finally
    //   25	33	119	finally
    //   33	39	119	finally
    //   104	108	119	finally
    //   108	114	119	finally
    //   129	133	119	finally
    //   133	139	119	finally
    //   151	155	119	finally
    //   155	163	119	finally
    //   170	174	119	finally
    //   174	180	119	finally
    //   9	17	144	finally
    //   46	64	144	finally
    //   9	17	163	java/lang/Throwable
    //   46	64	163	java/lang/Throwable
    //   170	174	185	java/lang/Exception
    //   151	155	189	java/lang/Exception
    //   25	33	193	java/lang/Exception
    //   104	108	197	java/lang/Exception
    //   129	133	201	java/lang/Exception
    //   64	96	205	finally
    //   64	96	209	java/lang/Throwable
  }

  public static int findCoreForThirdPartyApp(Context paramContext)
  {
    AppMethodBeat.i(64584);
    n(paramContext);
    TbsLog.i("TbsShareManager", "core_info mAvailableCoreVersion is " + e + " mAvailableCorePath is " + d + " mSrcPackageName is " + f);
    if (f == null)
      TbsLog.e("TbsShareManager", "mSrcPackageName is null !!!");
    int m;
    if ((f != null) && (f.equals("AppDefined")))
    {
      if (e != an.a().a(c))
      {
        e = 0;
        d = null;
        f = null;
        TbsLog.i("TbsShareManager", "check AppDefined core is error src is " + e + " dest is " + an.a().a(c));
      }
      if (e > 0)
      {
        ApplicationInfo localApplicationInfo = paramContext.getApplicationInfo();
        if ((!"com.tencent.android.qqdownloader".equals(localApplicationInfo.packageName)) && (!"com.jd.jrapp".equals(localApplicationInfo.packageName)))
          break label289;
        m = 1;
        label198: if (m != 0)
          break label294;
      }
    }
    label289: label294: for (boolean bool = QbSdk.a(paramContext, e); ; bool = false)
    {
      if ((bool) || (g))
      {
        e = 0;
        d = null;
        f = null;
        TbsLog.i("TbsShareManager", "core_info error QbSdk.isX5Disabled ");
      }
      m = e;
      AppMethodBeat.o(64584);
      return m;
      if ((k(paramContext)) || (l(paramContext)))
        break;
      e = 0;
      d = null;
      f = null;
      TbsLog.i("TbsShareManager", "core_info error checkCoreInfo is false and checkCoreInOthers is false ");
      break;
      m = 0;
      break label198;
    }
  }

  public static boolean forceLoadX5FromTBSDemo(Context paramContext)
  {
    return false;
  }

  public static void forceToLoadX5ForThirdApp(Context paramContext, boolean paramBoolean)
  {
  }

  static String g(Context paramContext)
  {
    Object localObject = null;
    AppMethodBeat.i(64592);
    try
    {
      n(paramContext);
      if (d != null)
      {
        boolean bool = TextUtils.isEmpty(d);
        if (!bool);
      }
      else
      {
        AppMethodBeat.o(64592);
        paramContext = localObject;
      }
      while (true)
      {
        return paramContext;
        paramContext = new java/lang/StringBuilder;
        paramContext.<init>(d);
        paramContext.append(File.separator);
        paramContext.append("res.apk");
        paramContext = paramContext.toString();
        AppMethodBeat.o(64592);
      }
    }
    catch (Throwable paramContext)
    {
      while (true)
      {
        new StringBuilder("getTbsResourcesPath exception: ").append(Log.getStackTraceString(paramContext));
        AppMethodBeat.o(64592);
        paramContext = localObject;
      }
    }
  }

  public static File getBackupCoreFile(Context paramContext, String paramString)
  {
    AppMethodBeat.i(64576);
    try
    {
      paramContext = getPackageContext(paramContext, paramString, false);
      paramString = new java/io/File;
      paramString.<init>(k.a(paramContext, 4));
      paramContext = new java/io/File;
      paramContext.<init>(paramString, "x5.tbs.org");
      boolean bool = paramContext.exists();
      if (bool)
      {
        AppMethodBeat.o(64576);
        return paramContext;
      }
    }
    catch (Throwable paramContext)
    {
      while (true)
      {
        paramContext = null;
        AppMethodBeat.o(64576);
      }
    }
  }

  public static int getBackupCoreVersion(Context paramContext, String paramString)
  {
    int m = 0;
    AppMethodBeat.i(64574);
    try
    {
      paramString = getPackageContext(paramContext, paramString, false);
      paramContext = new java/io/File;
      paramContext.<init>(k.a(paramString, 4));
      paramString = new java/io/File;
      paramString.<init>(paramContext, "x5.tbs.org");
      if (paramString.exists())
      {
        n = a.b(paramString);
        AppMethodBeat.o(64574);
        return n;
      }
    }
    catch (Throwable paramContext)
    {
      while (true)
      {
        AppMethodBeat.o(64574);
        int n = m;
      }
    }
  }

  public static File getBackupDecoupleCoreFile(Context paramContext, String paramString)
  {
    AppMethodBeat.i(64577);
    try
    {
      paramContext = getPackageContext(paramContext, paramString, true);
      paramString = new java/io/File;
      paramString.<init>(k.a(paramContext, 4));
      paramContext = new java/io/File;
      paramContext.<init>(paramString, "x5.tbs.decouple");
      boolean bool = paramContext.exists();
      if (bool)
      {
        AppMethodBeat.o(64577);
        return paramContext;
      }
    }
    catch (Throwable paramContext)
    {
      while (true)
      {
        paramContext = null;
        AppMethodBeat.o(64577);
      }
    }
  }

  public static int getBackupDecoupleCoreVersion(Context paramContext, String paramString)
  {
    int m = 0;
    AppMethodBeat.i(64575);
    try
    {
      paramString = getPackageContext(paramContext, paramString, false);
      paramContext = new java/io/File;
      paramContext.<init>(k.a(paramString, 4));
      paramString = new java/io/File;
      paramString.<init>(paramContext, "x5.tbs.decouple");
      if (paramString.exists())
      {
        n = a.b(paramString);
        AppMethodBeat.o(64575);
        return n;
      }
    }
    catch (Throwable paramContext)
    {
      while (true)
      {
        AppMethodBeat.o(64575);
        int n = m;
      }
    }
  }

  public static boolean getCoreDisabled()
  {
    return g;
  }

  public static boolean getCoreFormOwn()
  {
    return k;
  }

  public static String[] getCoreProviderAppList()
  {
    return new String[] { "com.tencent.tbs", "com.tencent.mm", "com.tencent.mobileqq", "com.qzone" };
  }

  public static int getCoreShareDecoupleCoreVersion(Context paramContext, String paramString)
  {
    return 0;
  }

  public static String getHostCorePathAppDefined()
  {
    return c;
  }

  public static long getHostCoreVersions(Context paramContext)
  {
    AppMethodBeat.i(64572);
    long l1 = 0L;
    String[] arrayOfString = getCoreProviderAppList();
    int m = arrayOfString.length;
    int n = 0;
    if (n < m)
    {
      String str = arrayOfString[n];
      long l2;
      if (str.equalsIgnoreCase("com.tencent.mm"))
        l2 = l1 + getSharedTbsCoreVersion(paramContext, str) * 10000000000L;
      while (true)
      {
        n++;
        l1 = l2;
        break;
        if (str.equalsIgnoreCase("com.tencent.mobileqq"))
        {
          l2 = l1 + getSharedTbsCoreVersion(paramContext, str) * 100000L;
        }
        else
        {
          l2 = l1;
          if (str.equalsIgnoreCase("com.qzone"))
            l2 = l1 + getSharedTbsCoreVersion(paramContext, str);
        }
      }
    }
    AppMethodBeat.o(64572);
    return l1;
  }

  public static Context getPackageContext(Context paramContext, String paramString, boolean paramBoolean)
  {
    Object localObject = null;
    AppMethodBeat.i(64599);
    if (paramBoolean);
    try
    {
      if ((!paramContext.getPackageName().equals(paramString)) && (TbsPVConfig.getInstance(paramContext).isEnableNoCoreGray()))
      {
        TbsLog.i("TbsShareManager", "gray no core app,skip get context");
        AppMethodBeat.o(64599);
        paramContext = localObject;
      }
      while (true)
      {
        return paramContext;
        paramContext = paramContext.createPackageContext(paramString, 2);
        AppMethodBeat.o(64599);
      }
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      while (true)
      {
        AppMethodBeat.o(64599);
        paramContext = localObject;
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        AppMethodBeat.o(64599);
        paramContext = localObject;
      }
    }
  }

  public static int getSharedTbsCoreVersion(Context paramContext, String paramString)
  {
    AppMethodBeat.i(64573);
    paramContext = getPackageContext(paramContext, paramString, true);
    int m;
    if (paramContext != null)
    {
      m = an.a().j(paramContext);
      AppMethodBeat.o(64573);
    }
    while (true)
    {
      return m;
      m = 0;
      AppMethodBeat.o(64573);
    }
  }

  public static File getTbsShareFile(Context paramContext, String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(64595);
    paramContext = an.a().s(paramContext);
    if (paramContext == null)
    {
      AppMethodBeat.o(64595);
      paramContext = localObject;
    }
    while (true)
    {
      return paramContext;
      paramContext = new File(paramContext, paramString);
      if (paramContext.exists())
        AppMethodBeat.o(64595);
      else
        try
        {
          paramContext.createNewFile();
          AppMethodBeat.o(64595);
        }
        catch (IOException paramContext)
        {
          AppMethodBeat.o(64595);
          paramContext = localObject;
        }
    }
  }

  // ERROR //
  static int h(Context paramContext)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: ldc 2
    //   4: monitorenter
    //   5: ldc_w 477
    //   8: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   11: ldc 69
    //   13: ldc_w 479
    //   16: invokestatic 76	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   19: aload_0
    //   20: ldc_w 264
    //   23: invokestatic 267	com/tencent/smtt/sdk/TbsShareManager:getTbsShareFile	(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
    //   26: astore_2
    //   27: aload_2
    //   28: ifnonnull +34 -> 62
    //   31: ldc 69
    //   33: ldc_w 481
    //   36: invokestatic 76	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   39: iconst_0
    //   40: ifeq +11 -> 51
    //   43: new 269	java/lang/NullPointerException
    //   46: dup
    //   47: invokespecial 270	java/lang/NullPointerException:<init>	()V
    //   50: athrow
    //   51: ldc_w 477
    //   54: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   57: ldc 2
    //   59: monitorexit
    //   60: iload_1
    //   61: ireturn
    //   62: new 272	java/io/FileInputStream
    //   65: astore_0
    //   66: aload_0
    //   67: aload_2
    //   68: invokespecial 275	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   71: new 277	java/io/BufferedInputStream
    //   74: dup
    //   75: aload_0
    //   76: invokespecial 280	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   79: astore_0
    //   80: new 282	java/util/Properties
    //   83: astore_2
    //   84: aload_2
    //   85: invokespecial 283	java/util/Properties:<init>	()V
    //   88: aload_2
    //   89: aload_0
    //   90: invokevirtual 286	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   93: aload_2
    //   94: ldc_w 483
    //   97: ldc_w 346
    //   100: invokevirtual 350	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   103: astore_2
    //   104: ldc_w 346
    //   107: aload_2
    //   108: invokevirtual 354	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   111: ifne +43 -> 154
    //   114: ldc 69
    //   116: ldc_w 485
    //   119: invokestatic 76	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   122: aload_2
    //   123: invokestatic 490	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   126: iconst_0
    //   127: invokestatic 496	java/lang/Math:max	(II)I
    //   130: istore_1
    //   131: aload_0
    //   132: ifnull +7 -> 139
    //   135: aload_0
    //   136: invokevirtual 328	java/io/BufferedInputStream:close	()V
    //   139: ldc_w 477
    //   142: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   145: goto -88 -> 57
    //   148: astore_0
    //   149: ldc 2
    //   151: monitorexit
    //   152: aload_0
    //   153: athrow
    //   154: ldc 69
    //   156: ldc_w 498
    //   159: invokestatic 76	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   162: aload_0
    //   163: ifnull +7 -> 170
    //   166: aload_0
    //   167: invokevirtual 328	java/io/BufferedInputStream:close	()V
    //   170: ldc_w 477
    //   173: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   176: goto -119 -> 57
    //   179: astore_2
    //   180: aconst_null
    //   181: astore_0
    //   182: aload_0
    //   183: ifnull +7 -> 190
    //   186: aload_0
    //   187: invokevirtual 328	java/io/BufferedInputStream:close	()V
    //   190: ldc_w 477
    //   193: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   196: aload_2
    //   197: athrow
    //   198: astore_0
    //   199: aconst_null
    //   200: astore_0
    //   201: aload_0
    //   202: ifnull +7 -> 209
    //   205: aload_0
    //   206: invokevirtual 328	java/io/BufferedInputStream:close	()V
    //   209: ldc 69
    //   211: ldc_w 500
    //   214: invokestatic 76	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   217: bipush 254
    //   219: istore_1
    //   220: ldc_w 477
    //   223: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   226: goto -169 -> 57
    //   229: astore_0
    //   230: goto -21 -> 209
    //   233: astore_0
    //   234: goto -44 -> 190
    //   237: astore_0
    //   238: goto -187 -> 51
    //   241: astore_0
    //   242: goto -103 -> 139
    //   245: astore_0
    //   246: goto -76 -> 170
    //   249: astore_2
    //   250: goto -68 -> 182
    //   253: astore_2
    //   254: goto -53 -> 201
    //
    // Exception table:
    //   from	to	target	type
    //   5	19	148	finally
    //   43	51	148	finally
    //   51	57	148	finally
    //   135	139	148	finally
    //   139	145	148	finally
    //   166	170	148	finally
    //   170	176	148	finally
    //   186	190	148	finally
    //   190	198	148	finally
    //   205	209	148	finally
    //   209	217	148	finally
    //   220	226	148	finally
    //   19	27	179	finally
    //   31	39	179	finally
    //   62	80	179	finally
    //   19	27	198	java/lang/Throwable
    //   31	39	198	java/lang/Throwable
    //   62	80	198	java/lang/Throwable
    //   205	209	229	java/lang/Exception
    //   186	190	233	java/lang/Exception
    //   43	51	237	java/lang/Exception
    //   135	139	241	java/lang/Exception
    //   166	170	245	java/lang/Exception
    //   80	131	249	finally
    //   154	162	249	finally
    //   80	131	253	java/lang/Throwable
    //   154	162	253	java/lang/Throwable
  }

  static boolean i(Context paramContext)
  {
    boolean bool1 = false;
    AppMethodBeat.i(64596);
    try
    {
      if (e == 0)
        findCoreForThirdPartyApp(paramContext);
      if (e == 0)
      {
        TbsLog.addLog(994, null, new Object[0]);
        AppMethodBeat.o(64596);
      }
      while (true)
      {
        return bool1;
        int m;
        int n;
        if (c == null)
        {
          if (e != 0)
          {
            m = getSharedTbsCoreVersion(paramContext, f);
            n = e;
            if (m == n)
            {
              AppMethodBeat.o(64596);
              bool1 = true;
            }
          }
        }
        else if (e != 0)
        {
          n = an.a().a(c);
          m = e;
          if (n == m)
          {
            AppMethodBeat.o(64596);
            bool1 = true;
          }
        }
        else
        {
          boolean bool2 = l(paramContext);
          if (bool2)
          {
            AppMethodBeat.o(64596);
            bool1 = true;
          }
          else
          {
            TbsCoreLoadStat localTbsCoreLoadStat = TbsCoreLoadStat.getInstance();
            Throwable localThrowable = new java/lang/Throwable;
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>("mAvailableCoreVersion=");
            localThrowable.<init>(e + "; mSrcPackageName=" + f + "; getSharedTbsCoreVersion(ctx, mSrcPackageName) is " + getSharedTbsCoreVersion(paramContext, f) + "; getHostCoreVersions is " + getHostCoreVersions(paramContext));
            localTbsCoreLoadStat.a(paramContext, 418, localThrowable);
            d = null;
            e = 0;
            TbsLog.addLog(993, null, new Object[0]);
            QbSdk.a(paramContext, "TbsShareManager::isShareTbsCoreAvailableInner forceSysWebViewInner!");
            AppMethodBeat.o(64596);
          }
        }
      }
    }
    catch (Throwable paramContext)
    {
      while (true)
      {
        TbsLog.addLog(992, null, new Object[0]);
        AppMethodBeat.o(64596);
      }
    }
  }

  public static boolean isThirdPartyApp(Context paramContext)
  {
    boolean bool = false;
    AppMethodBeat.i(64571);
    try
    {
      if ((a != null) && (a.equals(paramContext.getApplicationContext())))
      {
        bool = b;
        AppMethodBeat.o(64571);
        return bool;
      }
      paramContext = paramContext.getApplicationContext();
      a = paramContext;
      String str = paramContext.getPackageName();
      paramContext = getCoreProviderAppList();
      int m = paramContext.length;
      for (int n = 0; ; n++)
      {
        if (n >= m)
          break label100;
        if (str.equals(paramContext[n]))
        {
          b = false;
          AppMethodBeat.o(64571);
          break;
        }
      }
    }
    catch (Throwable paramContext)
    {
      while (true)
      {
        label100: b = true;
        AppMethodBeat.o(64571);
        bool = true;
      }
    }
  }

  static boolean j(Context paramContext)
  {
    AppMethodBeat.i(64597);
    boolean bool = b(paramContext, true);
    AppMethodBeat.o(64597);
    return bool;
  }

  private static boolean k(Context paramContext)
  {
    boolean bool = false;
    AppMethodBeat.i(64582);
    if (f == null)
      AppMethodBeat.o(64582);
    while (true)
    {
      return bool;
      if (e == getSharedTbsCoreVersion(paramContext, f))
      {
        bool = true;
        AppMethodBeat.o(64582);
      }
      else
      {
        AppMethodBeat.o(64582);
      }
    }
  }

  private static boolean l(Context paramContext)
  {
    boolean bool = false;
    AppMethodBeat.i(64583);
    if (QbSdk.getOnlyDownload())
      AppMethodBeat.o(64583);
    while (true)
    {
      return bool;
      String[] arrayOfString = getCoreProviderAppList();
      int m = arrayOfString.length;
      for (int n = 0; ; n++)
      {
        if (n >= m)
          break label118;
        String str = arrayOfString[n];
        if ((e > 0) && (e == getSharedTbsCoreVersion(paramContext, str)))
        {
          Context localContext = getPackageContext(paramContext, str, true);
          if (an.a().f(paramContext))
          {
            d = an.a().b(paramContext, localContext).getAbsolutePath();
            f = str;
            AppMethodBeat.o(64583);
            bool = true;
            break;
          }
        }
      }
      label118: AppMethodBeat.o(64583);
    }
  }

  private static boolean m(Context paramContext)
  {
    boolean bool = false;
    AppMethodBeat.i(64585);
    if (paramContext == null)
      AppMethodBeat.o(64585);
    while (true)
    {
      return bool;
      writeProperties(paramContext, Integer.toString(0), "", "", Integer.toString(0));
      bool = true;
      AppMethodBeat.o(64585);
    }
  }

  // ERROR //
  private static void n(Context paramContext)
  {
    // Byte code:
    //   0: ldc_w 551
    //   3: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: getstatic 45	com/tencent/smtt/sdk/TbsShareManager:l	Z
    //   9: ifeq +10 -> 19
    //   12: ldc_w 551
    //   15: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   18: return
    //   19: ldc 2
    //   21: monitorenter
    //   22: getstatic 45	com/tencent/smtt/sdk/TbsShareManager:l	Z
    //   25: ifeq +15 -> 40
    //   28: ldc 2
    //   30: monitorexit
    //   31: ldc_w 551
    //   34: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   37: goto -19 -> 18
    //   40: aload_0
    //   41: ldc_w 264
    //   44: invokestatic 267	com/tencent/smtt/sdk/TbsShareManager:getTbsShareFile	(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
    //   47: astore_0
    //   48: aload_0
    //   49: ifnonnull +27 -> 76
    //   52: iconst_0
    //   53: ifeq +11 -> 64
    //   56: new 269	java/lang/NullPointerException
    //   59: dup
    //   60: invokespecial 270	java/lang/NullPointerException:<init>	()V
    //   63: athrow
    //   64: ldc 2
    //   66: monitorexit
    //   67: ldc_w 551
    //   70: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   73: goto -55 -> 18
    //   76: new 272	java/io/FileInputStream
    //   79: astore_1
    //   80: aload_1
    //   81: aload_0
    //   82: invokespecial 275	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   85: new 277	java/io/BufferedInputStream
    //   88: astore_0
    //   89: aload_0
    //   90: aload_1
    //   91: invokespecial 280	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   94: new 282	java/util/Properties
    //   97: astore_1
    //   98: aload_1
    //   99: invokespecial 283	java/util/Properties:<init>	()V
    //   102: aload_1
    //   103: aload_0
    //   104: invokevirtual 286	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   107: aload_1
    //   108: ldc_w 483
    //   111: ldc_w 346
    //   114: invokevirtual 350	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   117: astore_2
    //   118: ldc_w 346
    //   121: aload_2
    //   122: invokevirtual 354	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   125: ifne +66 -> 191
    //   128: aload_2
    //   129: invokestatic 490	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   132: iconst_0
    //   133: invokestatic 496	java/lang/Math:max	(II)I
    //   136: putstatic 31	com/tencent/smtt/sdk/TbsShareManager:e	I
    //   139: new 97	java/lang/StringBuilder
    //   142: astore_2
    //   143: aload_2
    //   144: ldc_w 553
    //   147: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   150: aload_2
    //   151: getstatic 31	com/tencent/smtt/sdk/TbsShareManager:e	I
    //   154: invokevirtual 196	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   157: ldc_w 555
    //   160: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   163: astore_2
    //   164: new 66	java/lang/Throwable
    //   167: astore_3
    //   168: aload_3
    //   169: ldc_w 557
    //   172: invokespecial 526	java/lang/Throwable:<init>	(Ljava/lang/String;)V
    //   175: ldc 69
    //   177: aload_2
    //   178: aload_3
    //   179: invokestatic 161	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   182: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   185: invokevirtual 114	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   188: invokestatic 76	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   191: aload_1
    //   192: ldc_w 305
    //   195: ldc_w 346
    //   198: invokevirtual 350	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   201: astore_2
    //   202: ldc_w 346
    //   205: aload_2
    //   206: invokevirtual 354	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   209: ifne +7 -> 216
    //   212: aload_2
    //   213: putstatic 33	com/tencent/smtt/sdk/TbsShareManager:f	Ljava/lang/String;
    //   216: getstatic 33	com/tencent/smtt/sdk/TbsShareManager:f	Ljava/lang/String;
    //   219: ifnull +28 -> 247
    //   222: getstatic 137	com/tencent/smtt/sdk/TbsShareManager:a	Landroid/content/Context;
    //   225: ifnull +22 -> 247
    //   228: getstatic 33	com/tencent/smtt/sdk/TbsShareManager:f	Ljava/lang/String;
    //   231: getstatic 137	com/tencent/smtt/sdk/TbsShareManager:a	Landroid/content/Context;
    //   234: invokevirtual 152	android/content/Context:getPackageName	()Ljava/lang/String;
    //   237: invokevirtual 354	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   240: ifeq +97 -> 337
    //   243: iconst_1
    //   244: putstatic 43	com/tencent/smtt/sdk/TbsShareManager:k	Z
    //   247: aload_1
    //   248: ldc_w 307
    //   251: ldc_w 346
    //   254: invokevirtual 350	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   257: astore_2
    //   258: ldc_w 346
    //   261: aload_2
    //   262: invokevirtual 354	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   265: ifne +7 -> 272
    //   268: aload_2
    //   269: putstatic 29	com/tencent/smtt/sdk/TbsShareManager:d	Ljava/lang/String;
    //   272: aload_1
    //   273: ldc_w 309
    //   276: ldc_w 346
    //   279: invokevirtual 350	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   282: astore_2
    //   283: ldc_w 346
    //   286: aload_2
    //   287: invokevirtual 354	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   290: ifne +7 -> 297
    //   293: aload_2
    //   294: putstatic 41	com/tencent/smtt/sdk/TbsShareManager:j	Ljava/lang/String;
    //   297: aload_1
    //   298: ldc_w 288
    //   301: ldc_w 290
    //   304: invokevirtual 350	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   307: invokestatic 562	java/lang/Boolean:parseBoolean	(Ljava/lang/String;)Z
    //   310: putstatic 35	com/tencent/smtt/sdk/TbsShareManager:g	Z
    //   313: iconst_1
    //   314: putstatic 45	com/tencent/smtt/sdk/TbsShareManager:l	Z
    //   317: aload_0
    //   318: ifnull +7 -> 325
    //   321: aload_0
    //   322: invokevirtual 328	java/io/BufferedInputStream:close	()V
    //   325: ldc 2
    //   327: monitorexit
    //   328: ldc_w 551
    //   331: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   334: goto -316 -> 18
    //   337: iconst_0
    //   338: putstatic 43	com/tencent/smtt/sdk/TbsShareManager:k	Z
    //   341: goto -94 -> 247
    //   344: astore_1
    //   345: aload_0
    //   346: ifnull -21 -> 325
    //   349: aload_0
    //   350: invokevirtual 328	java/io/BufferedInputStream:close	()V
    //   353: goto -28 -> 325
    //   356: astore_0
    //   357: goto -32 -> 325
    //   360: astore_0
    //   361: aconst_null
    //   362: astore_1
    //   363: aload_1
    //   364: ifnull +7 -> 371
    //   367: aload_1
    //   368: invokevirtual 328	java/io/BufferedInputStream:close	()V
    //   371: ldc_w 551
    //   374: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   377: aload_0
    //   378: athrow
    //   379: astore_0
    //   380: ldc 2
    //   382: monitorexit
    //   383: ldc_w 551
    //   386: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   389: aload_0
    //   390: athrow
    //   391: astore_1
    //   392: goto -21 -> 371
    //   395: astore_0
    //   396: goto -332 -> 64
    //   399: astore_1
    //   400: aload_0
    //   401: astore_2
    //   402: aload_1
    //   403: astore_0
    //   404: aload_2
    //   405: astore_1
    //   406: goto -43 -> 363
    //   409: astore_0
    //   410: aconst_null
    //   411: astore_0
    //   412: goto -67 -> 345
    //
    // Exception table:
    //   from	to	target	type
    //   94	191	344	java/lang/Throwable
    //   191	216	344	java/lang/Throwable
    //   216	247	344	java/lang/Throwable
    //   247	272	344	java/lang/Throwable
    //   272	297	344	java/lang/Throwable
    //   297	317	344	java/lang/Throwable
    //   337	341	344	java/lang/Throwable
    //   321	325	356	java/lang/Exception
    //   349	353	356	java/lang/Exception
    //   40	48	360	finally
    //   76	94	360	finally
    //   22	31	379	finally
    //   56	64	379	finally
    //   64	67	379	finally
    //   321	325	379	finally
    //   325	328	379	finally
    //   349	353	379	finally
    //   367	371	379	finally
    //   371	379	379	finally
    //   380	383	379	finally
    //   367	371	391	java/lang/Exception
    //   56	64	395	java/lang/Exception
    //   94	191	399	finally
    //   191	216	399	finally
    //   216	247	399	finally
    //   247	272	399	finally
    //   272	297	399	finally
    //   297	317	399	finally
    //   337	341	399	finally
    //   40	48	409	java/lang/Throwable
    //   76	94	409	java/lang/Throwable
  }

  public static void setHostCorePathAppDefined(String paramString)
  {
    c = paramString;
  }

  public static void writeCoreInfoForThirdPartyApp(Context paramContext, int paramInt, boolean paramBoolean)
  {
    int m = 1;
    Object localObject1;
    Object localObject2;
    while (true)
    {
      try
      {
        AppMethodBeat.i(64587);
        TbsLog.i("TbsShareManager", "writeCoreInfoForThirdPartyApp coreVersion is ".concat(String.valueOf(paramInt)));
        if (paramInt == 0)
        {
          m(paramContext);
          TbsDownloadConfig.getInstance(a).setDownloadInterruptCode(-401);
          AppMethodBeat.o(64587);
          return;
        }
        n = h(paramContext);
        TbsLog.i("TbsShareManager", "writeCoreInfoForThirdPartyApp coreVersionFromConfig is ".concat(String.valueOf(n)));
        if (n < 0)
        {
          TbsDownloadConfig.getInstance(a).setDownloadInterruptCode(-402);
          AppMethodBeat.o(64587);
          continue;
        }
      }
      finally
      {
      }
      if (paramInt == n)
      {
        if ((d(paramContext) == 0) && (!paramBoolean))
          a(paramContext, paramInt);
        c(paramContext, paramBoolean);
        TbsDownloadConfig.getInstance(a).setDownloadInterruptCode(-403);
        AppMethodBeat.o(64587);
      }
      else if (paramInt < n)
      {
        m(paramContext);
        TbsDownloadConfig.getInstance(a).setDownloadInterruptCode(-404);
        AppMethodBeat.o(64587);
      }
      else
      {
        n = an.a().j(paramContext);
        TbsLog.i("TbsShareManager", "writeCoreInfoForThirdPartyApp coreVersionFromCoreShare is ".concat(String.valueOf(n)));
        if (paramInt < n)
        {
          m(paramContext);
          TbsDownloadConfig.getInstance(a).setDownloadInterruptCode(-404);
          AppMethodBeat.o(64587);
        }
        else
        {
          localObject1 = d(paramContext, paramBoolean);
          if (c == null)
            break label618;
          if (paramInt != an.a().a(c))
            break;
          writeProperties(paramContext, Integer.toString(paramInt), "AppDefined", c, Integer.toString(1));
          try
          {
            localObject2 = getTbsShareFile(paramContext, "core_info");
            if ((!i) && (localObject2 != null))
            {
              localObject1 = new com/tencent/smtt/sdk/TbsLinuxToolsJni;
              ((TbsLinuxToolsJni)localObject1).<init>(a);
              ((TbsLinuxToolsJni)localObject1).a(((File)localObject2).getAbsolutePath(), "644");
              ((TbsLinuxToolsJni)localObject1).a(an.a().s(paramContext).getAbsolutePath(), "755");
              i = true;
            }
            AppMethodBeat.o(64587);
          }
          catch (Throwable paramContext)
          {
            AppMethodBeat.o(64587);
          }
        }
      }
    }
    Object localObject3;
    if (paramInt > an.a().a(c))
    {
      i1 = localObject1.length;
      label612: for (n = 0; ; n++)
      {
        while (true)
        {
          if (n >= i1)
            break label618;
          localObject2 = localObject1[n];
          if (paramInt != getSharedTbsCoreVersion(paramContext, (String)localObject2))
            break label612;
          localObject3 = getPackageContext(paramContext, (String)localObject2, true);
          localObject2 = an.a().r((Context)localObject3).getAbsolutePath();
          b.b(paramContext);
          if (!an.a().f((Context)localObject3))
            break label612;
          localObject3 = new java/io/File;
          ((File)localObject3).<init>(c);
          localObject1 = new java/io/File;
          ((File)localObject1).<init>((String)localObject2);
          localObject2 = new com/tencent/smtt/sdk/bc;
          ((bc)localObject2).<init>();
          try
          {
            k.a((File)localObject1, (File)localObject3, (FileFilter)localObject2);
            writeProperties(paramContext, Integer.toString(paramInt), "AppDefined", c, Integer.toString(1));
            localObject2 = getTbsShareFile(paramContext, "core_info");
            if ((!i) && (localObject2 != null))
            {
              localObject1 = new com/tencent/smtt/sdk/TbsLinuxToolsJni;
              ((TbsLinuxToolsJni)localObject1).<init>(a);
              ((TbsLinuxToolsJni)localObject1).a(((File)localObject2).getAbsolutePath(), "644");
              ((TbsLinuxToolsJni)localObject1).a(an.a().s(paramContext).getAbsolutePath(), "755");
              i = true;
            }
            AppMethodBeat.o(64587);
          }
          catch (Throwable paramContext)
          {
            AppMethodBeat.o(64587);
          }
        }
        break;
      }
    }
    label618: int i1 = localObject1.length;
    int n = 0;
    int i2;
    if (n < i1)
    {
      localObject3 = localObject1[n];
      if (paramInt == getSharedTbsCoreVersion(paramContext, (String)localObject3))
      {
        Context localContext = getPackageContext(paramContext, (String)localObject3, true);
        localObject2 = an.a().r(localContext).getAbsolutePath();
        i2 = b.b(paramContext);
        if (an.a().f(localContext))
          if (!((String)localObject3).equals(paramContext.getApplicationContext().getPackageName()))
          {
            TbsLog.i("TbsShareManager", "thirdAPP pre--> delete old core_share Directory:".concat(String.valueOf(paramInt)));
            localObject1 = an.a().r(paramContext);
          }
      }
    }
    while (true)
    {
      try
      {
        while (true)
        {
          k.b((File)localObject1);
          TbsLog.i("TbsShareManager", "thirdAPP success--> delete old core_share Directory");
          writeProperties(paramContext, Integer.toString(paramInt), (String)localObject3, (String)localObject2, Integer.toString(i2));
          try
          {
            localObject2 = getTbsShareFile(paramContext, "core_info");
            n = m;
            if (!i)
            {
              n = m;
              if (localObject2 != null)
              {
                localObject1 = new com/tencent/smtt/sdk/TbsLinuxToolsJni;
                ((TbsLinuxToolsJni)localObject1).<init>(a);
                ((TbsLinuxToolsJni)localObject1).a(((File)localObject2).getAbsolutePath(), "644");
                ((TbsLinuxToolsJni)localObject1).a(an.a().s(paramContext).getAbsolutePath(), "755");
                i = true;
                n = m;
              }
            }
            if ((n == 0) && (!paramBoolean))
              a(paramContext, paramInt);
            AppMethodBeat.o(64587);
            break;
            n++;
          }
          catch (Throwable localThrowable1)
          {
            while (true)
              n = m;
          }
        }
      }
      catch (Throwable localThrowable2)
      {
        continue;
      }
      n = 0;
    }
  }

  // ERROR //
  public static void writeProperties(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 5
    //   3: ldc_w 609
    //   6: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: ldc 69
    //   11: new 97	java/lang/StringBuilder
    //   14: dup
    //   15: ldc_w 611
    //   18: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   21: aload_1
    //   22: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   25: ldc_w 613
    //   28: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   31: aload_2
    //   32: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   35: ldc_w 615
    //   38: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   41: aload_3
    //   42: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   45: invokevirtual 114	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   48: invokestatic 76	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   51: ldc 69
    //   53: new 97	java/lang/StringBuilder
    //   56: dup
    //   57: ldc_w 617
    //   60: invokespecial 102	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   63: new 66	java/lang/Throwable
    //   66: dup
    //   67: ldc_w 557
    //   70: invokespecial 526	java/lang/Throwable:<init>	(Ljava/lang/String;)V
    //   73: invokestatic 161	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   76: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   79: invokevirtual 114	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   82: invokestatic 76	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   85: aload_0
    //   86: ldc_w 264
    //   89: invokestatic 267	com/tencent/smtt/sdk/TbsShareManager:getTbsShareFile	(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
    //   92: astore_0
    //   93: aload_0
    //   94: ifnonnull +46 -> 140
    //   97: getstatic 137	com/tencent/smtt/sdk/TbsShareManager:a	Landroid/content/Context;
    //   100: invokestatic 579	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   103: sipush -405
    //   106: invokevirtual 582	com/tencent/smtt/sdk/TbsDownloadConfig:setDownloadInterruptCode	(I)V
    //   109: iconst_0
    //   110: ifeq +11 -> 121
    //   113: new 269	java/lang/NullPointerException
    //   116: dup
    //   117: invokespecial 270	java/lang/NullPointerException:<init>	()V
    //   120: athrow
    //   121: iconst_0
    //   122: ifeq +11 -> 133
    //   125: new 269	java/lang/NullPointerException
    //   128: dup
    //   129: invokespecial 270	java/lang/NullPointerException:<init>	()V
    //   132: athrow
    //   133: ldc_w 609
    //   136: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   139: return
    //   140: new 272	java/io/FileInputStream
    //   143: astore 6
    //   145: aload 6
    //   147: aload_0
    //   148: invokespecial 275	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   151: new 277	java/io/BufferedInputStream
    //   154: dup
    //   155: aload 6
    //   157: invokespecial 280	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   160: astore 6
    //   162: new 282	java/util/Properties
    //   165: astore 7
    //   167: aload 7
    //   169: invokespecial 283	java/util/Properties:<init>	()V
    //   172: aload 7
    //   174: aload 6
    //   176: invokevirtual 286	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   179: aload_1
    //   180: invokestatic 490	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   183: istore 8
    //   185: iload 8
    //   187: ifeq +124 -> 311
    //   190: aload 7
    //   192: ldc_w 483
    //   195: aload_1
    //   196: invokevirtual 294	java/util/Properties:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //   199: pop
    //   200: aload 7
    //   202: ldc_w 288
    //   205: ldc_w 290
    //   208: invokevirtual 294	java/util/Properties:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //   211: pop
    //   212: aload 7
    //   214: ldc_w 305
    //   217: aload_2
    //   218: invokevirtual 294	java/util/Properties:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //   221: pop
    //   222: aload 7
    //   224: ldc_w 307
    //   227: aload_3
    //   228: invokevirtual 294	java/util/Properties:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //   231: pop
    //   232: aload 7
    //   234: ldc_w 309
    //   237: aload 4
    //   239: invokevirtual 294	java/util/Properties:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //   242: pop
    //   243: new 315	java/io/FileOutputStream
    //   246: astore_1
    //   247: aload_1
    //   248: aload_0
    //   249: invokespecial 316	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   252: new 318	java/io/BufferedOutputStream
    //   255: astore_0
    //   256: aload_0
    //   257: aload_1
    //   258: invokespecial 321	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   261: aload 7
    //   263: aload_0
    //   264: aconst_null
    //   265: invokevirtual 325	java/util/Properties:store	(Ljava/io/OutputStream;Ljava/lang/String;)V
    //   268: iconst_0
    //   269: putstatic 45	com/tencent/smtt/sdk/TbsShareManager:l	Z
    //   272: getstatic 137	com/tencent/smtt/sdk/TbsShareManager:a	Landroid/content/Context;
    //   275: invokestatic 579	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   278: sipush -406
    //   281: invokevirtual 582	com/tencent/smtt/sdk/TbsDownloadConfig:setDownloadInterruptCode	(I)V
    //   284: aload 6
    //   286: ifnull +8 -> 294
    //   289: aload 6
    //   291: invokevirtual 328	java/io/BufferedInputStream:close	()V
    //   294: aload_0
    //   295: ifnull +7 -> 302
    //   298: aload_0
    //   299: invokevirtual 329	java/io/BufferedOutputStream:close	()V
    //   302: ldc_w 609
    //   305: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   308: goto -169 -> 139
    //   311: aload 7
    //   313: ldc_w 288
    //   316: ldc_w 619
    //   319: invokevirtual 294	java/util/Properties:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //   322: pop
    //   323: goto -80 -> 243
    //   326: astore_0
    //   327: aconst_null
    //   328: astore_0
    //   329: aload 6
    //   331: ifnull +8 -> 339
    //   334: aload 6
    //   336: invokevirtual 328	java/io/BufferedInputStream:close	()V
    //   339: aload_0
    //   340: ifnull +7 -> 347
    //   343: aload_0
    //   344: invokevirtual 329	java/io/BufferedOutputStream:close	()V
    //   347: ldc_w 609
    //   350: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   353: goto -214 -> 139
    //   356: astore_0
    //   357: aconst_null
    //   358: astore_1
    //   359: aconst_null
    //   360: astore 6
    //   362: aload 6
    //   364: ifnull +8 -> 372
    //   367: aload 6
    //   369: invokevirtual 328	java/io/BufferedInputStream:close	()V
    //   372: aload_1
    //   373: ifnull +7 -> 380
    //   376: aload_1
    //   377: invokevirtual 329	java/io/BufferedOutputStream:close	()V
    //   380: ldc_w 609
    //   383: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   386: aload_0
    //   387: athrow
    //   388: astore 9
    //   390: iload 5
    //   392: istore 8
    //   394: goto -209 -> 185
    //   397: astore_1
    //   398: goto -59 -> 339
    //   401: astore_0
    //   402: goto -55 -> 347
    //   405: astore_2
    //   406: goto -34 -> 372
    //   409: astore_1
    //   410: goto -30 -> 380
    //   413: astore_0
    //   414: goto -293 -> 121
    //   417: astore_0
    //   418: goto -285 -> 133
    //   421: astore_1
    //   422: goto -128 -> 294
    //   425: astore_0
    //   426: goto -124 -> 302
    //   429: astore_0
    //   430: aconst_null
    //   431: astore_1
    //   432: goto -70 -> 362
    //   435: astore_1
    //   436: aload_0
    //   437: astore_2
    //   438: aload_1
    //   439: astore_0
    //   440: aload_2
    //   441: astore_1
    //   442: goto -80 -> 362
    //   445: astore_0
    //   446: aconst_null
    //   447: astore_0
    //   448: aconst_null
    //   449: astore 6
    //   451: goto -122 -> 329
    //   454: astore_1
    //   455: goto -126 -> 329
    //
    // Exception table:
    //   from	to	target	type
    //   162	179	326	java/lang/Throwable
    //   179	185	326	java/lang/Throwable
    //   190	243	326	java/lang/Throwable
    //   243	261	326	java/lang/Throwable
    //   311	323	326	java/lang/Throwable
    //   85	93	356	finally
    //   97	109	356	finally
    //   140	162	356	finally
    //   179	185	388	java/lang/Exception
    //   334	339	397	java/lang/Exception
    //   343	347	401	java/lang/Exception
    //   367	372	405	java/lang/Exception
    //   376	380	409	java/lang/Exception
    //   113	121	413	java/lang/Exception
    //   125	133	417	java/lang/Exception
    //   289	294	421	java/lang/Exception
    //   298	302	425	java/lang/Exception
    //   162	179	429	finally
    //   179	185	429	finally
    //   190	243	429	finally
    //   243	261	429	finally
    //   311	323	429	finally
    //   261	284	435	finally
    //   85	93	445	java/lang/Throwable
    //   97	109	445	java/lang/Throwable
    //   140	162	445	java/lang/Throwable
    //   261	284	454	java/lang/Throwable
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.TbsShareManager
 * JD-Core Version:    0.6.2
 */
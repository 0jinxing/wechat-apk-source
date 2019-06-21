package com.tencent.smtt.sdk;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.utils.TbsLog;
import com.tencent.smtt.utils.k;
import com.tencent.smtt.utils.y;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.nio.channels.FileLock;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class an
{
  public static ThreadLocal<Integer> a;
  static boolean b;
  static final FileFilter c;
  private static an d;
  private static final ReentrantLock i;
  private static final Lock j;
  private static FileLock l;
  private static Handler m;
  private static final Long[][] n;
  private static int o;
  private static boolean p;
  private int e;
  private FileLock f;
  private FileOutputStream g;
  private boolean h;
  private boolean k;

  static
  {
    AppMethodBeat.i(64474);
    d = null;
    i = new ReentrantLock();
    j = new ReentrantLock();
    l = null;
    a = new ao();
    m = null;
    Long[] arrayOfLong1 = { Long.valueOf(44006L), Long.valueOf(39094008L) };
    Long[] arrayOfLong2 = { Long.valueOf(44005L), Long.valueOf(39094008L) };
    Long[] arrayOfLong3 = { Long.valueOf(44027L), Long.valueOf(39094008L) };
    Long[] arrayOfLong4 = { Long.valueOf(44029L), Long.valueOf(39094008L) };
    Long[] arrayOfLong5 = { Long.valueOf(44033L), Long.valueOf(39094008L) };
    Long[] arrayOfLong6 = { Long.valueOf(44034L), Long.valueOf(39094008L) };
    n = new Long[][] { arrayOfLong1, arrayOfLong2, { Long.valueOf(43910L), Long.valueOf(38917816L) }, arrayOfLong3, { Long.valueOf(44028L), Long.valueOf(39094008L) }, arrayOfLong4, { Long.valueOf(44030L), Long.valueOf(39094008L) }, { Long.valueOf(44032L), Long.valueOf(39094008L) }, arrayOfLong5, arrayOfLong6, { Long.valueOf(43909L), Long.valueOf(38917816L) } };
    b = false;
    c = new ap();
    o = 0;
    p = false;
    AppMethodBeat.o(64474);
  }

  private an()
  {
    AppMethodBeat.i(64405);
    this.e = 0;
    this.h = false;
    this.k = false;
    if (m == null)
      m = new aq(this, al.a().getLooper());
    AppMethodBeat.o(64405);
  }

  private void A(Context paramContext)
  {
    AppMethodBeat.i(64442);
    TbsLog.i("TbsInstaller", "TbsInstaller--generateNewTbsCoreFromUnzip");
    if (!z(paramContext))
    {
      TbsLog.i("TbsInstaller", "get rename fileLock#4 ## failed!");
      AppMethodBeat.o(64442);
    }
    while (true)
    {
      return;
      try
      {
        C(paramContext);
        D(paramContext);
        TbsLog.i("TbsInstaller", "after renameTbsCoreShareDir");
        if (!TbsShareManager.isThirdPartyApp(paramContext))
        {
          TbsLog.i("TbsInstaller", "prepare to shareTbsCore");
          TbsShareManager.a(paramContext);
        }
        while (true)
        {
          ai.a(paramContext).a(0);
          ai.a(paramContext).b(0);
          ai.a(paramContext).d(0);
          ai.a(paramContext).a("incrupdate_retry_num", 0);
          ai.a(paramContext).b(0, 3);
          ai.a(paramContext).a("");
          ai.a(paramContext).c(-1);
          if (!TbsShareManager.isThirdPartyApp(paramContext))
          {
            i1 = TbsDownloadConfig.getInstance(paramContext).mPreferences.getInt("tbs_decouplecoreversion", 0);
            if ((i1 <= 0) || (i1 == a().i(paramContext)) || (i1 != a().j(paramContext)))
              break label279;
            o(paramContext);
          }
          if (TbsShareManager.isThirdPartyApp(paramContext))
            TbsShareManager.writeCoreInfoForThirdPartyApp(paramContext, n(paramContext), true);
          a.set(Integer.valueOf(0));
          o = 0;
          g(paramContext);
          AppMethodBeat.o(64442);
          break;
          TbsLog.i("TbsInstaller", "is thirdapp and not chmod");
        }
      }
      catch (Throwable localThrowable)
      {
        while (true)
        {
          int i1;
          TbsLogReport.getInstance(paramContext).setInstallErrorCode(219, "exception when renameing from unzip:" + localThrowable.toString());
          TbsLog.e("TbsInstaller", "TbsInstaller--generateNewTbsCoreFromUnzip Exception", true);
          continue;
          label279: StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("TbsInstaller--generateNewTbsCoreFromUnzip #1 deCoupleCoreVersion is ");
          TbsLog.i("TbsInstaller", i1 + " getTbsCoreShareDecoupleCoreVersion is " + a().i(paramContext) + " getTbsCoreInstalledVerInNolock is " + a().j(paramContext));
        }
      }
    }
  }

  private void B(Context paramContext)
  {
    AppMethodBeat.i(64443);
    TbsLog.i("TbsInstaller", "TbsInstaller--generateNewTbsCoreFromCopy");
    if (!z(paramContext))
    {
      TbsLog.i("TbsInstaller", "get rename fileLock#4 ## failed!");
      AppMethodBeat.o(64443);
    }
    while (true)
    {
      return;
      try
      {
        C(paramContext);
        E(paramContext);
        TbsShareManager.a(paramContext);
        ai.a(paramContext).a(0, 3);
        int i1;
        if (!TbsShareManager.isThirdPartyApp(paramContext))
        {
          i1 = TbsDownloadConfig.getInstance(paramContext).mPreferences.getInt("tbs_decouplecoreversion", 0);
          if ((i1 <= 0) || (i1 == a().i(paramContext)) || (i1 != a().j(paramContext)))
            break label138;
          o(paramContext);
        }
        while (true)
        {
          a.set(Integer.valueOf(0));
          g(paramContext);
          AppMethodBeat.o(64443);
          break;
          label138: StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("TbsInstaller--generateNewTbsCoreFromCopy #1 deCoupleCoreVersion is ");
          TbsLog.i("TbsInstaller", i1 + " getTbsCoreShareDecoupleCoreVersion is " + a().i(paramContext) + " getTbsCoreInstalledVerInNolock is " + a().j(paramContext));
        }
      }
      catch (Exception localException)
      {
        while (true)
          TbsLogReport.getInstance(paramContext).setInstallErrorCode(219, "exception when renameing from copy:" + localException.toString());
      }
    }
  }

  private void C(Context paramContext)
  {
    AppMethodBeat.i(64453);
    TbsLog.i("TbsInstaller", "TbsInstaller--deleteOldCore");
    k.a(r(paramContext), false);
    AppMethodBeat.o(64453);
  }

  private void D(Context paramContext)
  {
    AppMethodBeat.i(64454);
    TbsLog.i("TbsInstaller", "TbsInstaller--renameShareDir");
    File localFile1 = u(paramContext);
    File localFile2 = r(paramContext);
    if ((localFile1 == null) || (localFile2 == null))
    {
      AppMethodBeat.o(64454);
      return;
    }
    boolean bool = localFile1.renameTo(localFile2);
    if ((paramContext != null) && ("com.tencent.mm".equals(paramContext.getApplicationContext().getApplicationInfo().packageName)))
    {
      if (!bool)
        break label104;
      TbsLogReport.getInstance(paramContext).setInstallErrorCode(230, " ");
    }
    while (true)
    {
      f(paramContext, false);
      AppMethodBeat.o(64454);
      break;
      label104: TbsLogReport.getInstance(paramContext).setInstallErrorCode(231, " ");
    }
  }

  private void E(Context paramContext)
  {
    AppMethodBeat.i(64456);
    TbsLog.i("TbsInstaller", "TbsInstaller--renameTbsCoreCopyDir");
    File localFile1 = w(paramContext);
    File localFile2 = r(paramContext);
    if ((localFile1 == null) || (localFile2 == null))
      AppMethodBeat.o(64456);
    while (true)
    {
      return;
      localFile1.renameTo(localFile2);
      f(paramContext, false);
      AppMethodBeat.o(64456);
    }
  }

  private void F(Context paramContext)
  {
    AppMethodBeat.i(64457);
    TbsLog.i("TbsInstaller", "TbsInstaller--clearNewTbsCore");
    File localFile = u(paramContext);
    if (localFile != null)
      k.a(localFile, false);
    ai.a(paramContext).b(0, 5);
    ai.a(paramContext).c(-1);
    QbSdk.a(paramContext, "TbsInstaller::clearNewTbsCore forceSysWebViewInner!");
    AppMethodBeat.o(64457);
  }

  static an a()
  {
    try
    {
      AppMethodBeat.i(64406);
      if (d == null);
      try
      {
        if (d == null)
        {
          localan = new com/tencent/smtt/sdk/an;
          localan.<init>();
          d = localan;
        }
        an localan = d;
        AppMethodBeat.o(64406);
        return localan;
      }
      finally
      {
        AppMethodBeat.o(64406);
      }
    }
    finally
    {
    }
  }

  // ERROR //
  private void a(int paramInt, String paramString, Context paramContext)
  {
    // Byte code:
    //   0: ldc_w 374
    //   3: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: new 318	java/io/File
    //   9: dup
    //   10: aload_2
    //   11: invokespecial 375	java/io/File:<init>	(Ljava/lang/String;)V
    //   14: invokevirtual 379	java/io/File:delete	()Z
    //   17: pop
    //   18: ldc 139
    //   20: new 251	java/lang/StringBuilder
    //   23: dup
    //   24: ldc_w 381
    //   27: invokespecial 255	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   30: aload_2
    //   31: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   34: ldc_w 383
    //   37: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   40: invokevirtual 264	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   43: iconst_1
    //   44: invokestatic 385	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;Z)V
    //   47: new 318	java/io/File
    //   50: dup
    //   51: aload_3
    //   52: ldc_w 387
    //   55: iconst_0
    //   56: invokevirtual 391	android/content/Context:getDir	(Ljava/lang/String;I)Ljava/io/File;
    //   59: ldc_w 393
    //   62: invokespecial 396	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   65: astore_2
    //   66: aload_2
    //   67: invokevirtual 399	java/io/File:canRead	()Z
    //   70: ifeq +197 -> 267
    //   73: new 318	java/io/File
    //   76: dup
    //   77: aload_2
    //   78: ldc_w 401
    //   81: invokespecial 396	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   84: astore_2
    //   85: new 403	java/util/Properties
    //   88: dup
    //   89: invokespecial 404	java/util/Properties:<init>	()V
    //   92: astore 4
    //   94: new 406	java/io/FileInputStream
    //   97: astore 5
    //   99: aload 5
    //   101: aload_2
    //   102: invokespecial 409	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   105: new 411	java/io/BufferedInputStream
    //   108: astore_3
    //   109: aload_3
    //   110: aload 5
    //   112: invokespecial 414	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   115: aload 4
    //   117: aload_3
    //   118: invokevirtual 417	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   121: new 419	java/io/FileOutputStream
    //   124: astore 5
    //   126: aload 5
    //   128: aload_2
    //   129: invokespecial 420	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   132: new 422	java/io/BufferedOutputStream
    //   135: astore_2
    //   136: aload_2
    //   137: aload 5
    //   139: invokespecial 425	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   142: aload 4
    //   144: ldc_w 427
    //   147: ldc_w 429
    //   150: invokevirtual 433	java/util/Properties:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //   153: pop
    //   154: aload 4
    //   156: aload_2
    //   157: aconst_null
    //   158: invokevirtual 437	java/util/Properties:store	(Ljava/io/OutputStream;Ljava/lang/String;)V
    //   161: ldc 139
    //   163: ldc_w 439
    //   166: iconst_1
    //   167: invokestatic 385	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;Z)V
    //   170: aload_2
    //   171: invokevirtual 442	java/io/BufferedOutputStream:close	()V
    //   174: aload_3
    //   175: invokevirtual 443	java/io/BufferedInputStream:close	()V
    //   178: ldc_w 374
    //   181: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   184: return
    //   185: astore_2
    //   186: ldc_w 374
    //   189: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   192: goto -8 -> 184
    //   195: astore_2
    //   196: aconst_null
    //   197: astore_2
    //   198: aconst_null
    //   199: astore_3
    //   200: aload_2
    //   201: ifnull +7 -> 208
    //   204: aload_2
    //   205: invokevirtual 442	java/io/BufferedOutputStream:close	()V
    //   208: aload_3
    //   209: ifnull +58 -> 267
    //   212: aload_3
    //   213: invokevirtual 443	java/io/BufferedInputStream:close	()V
    //   216: ldc_w 374
    //   219: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   222: goto -38 -> 184
    //   225: astore_2
    //   226: ldc_w 374
    //   229: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   232: goto -48 -> 184
    //   235: astore_2
    //   236: aconst_null
    //   237: astore_3
    //   238: aconst_null
    //   239: astore 4
    //   241: aload_3
    //   242: ifnull +7 -> 249
    //   245: aload_3
    //   246: invokevirtual 442	java/io/BufferedOutputStream:close	()V
    //   249: aload 4
    //   251: ifnull +8 -> 259
    //   254: aload 4
    //   256: invokevirtual 443	java/io/BufferedInputStream:close	()V
    //   259: ldc_w 374
    //   262: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   265: aload_2
    //   266: athrow
    //   267: ldc_w 374
    //   270: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   273: goto -89 -> 184
    //   276: astore_2
    //   277: goto -103 -> 174
    //   280: astore_2
    //   281: goto -73 -> 208
    //   284: astore_3
    //   285: goto -36 -> 249
    //   288: astore_3
    //   289: goto -30 -> 259
    //   292: astore_2
    //   293: aconst_null
    //   294: astore 5
    //   296: aload_3
    //   297: astore 4
    //   299: aload 5
    //   301: astore_3
    //   302: goto -61 -> 241
    //   305: astore 6
    //   307: aload_2
    //   308: astore 5
    //   310: aload_3
    //   311: astore 4
    //   313: aload 6
    //   315: astore_2
    //   316: aload 5
    //   318: astore_3
    //   319: goto -78 -> 241
    //   322: astore_2
    //   323: aconst_null
    //   324: astore_2
    //   325: goto -125 -> 200
    //   328: astore 4
    //   330: goto -130 -> 200
    //
    // Exception table:
    //   from	to	target	type
    //   174	178	185	java/io/IOException
    //   94	115	195	java/lang/Throwable
    //   212	216	225	java/io/IOException
    //   94	115	235	finally
    //   170	174	276	java/io/IOException
    //   204	208	280	java/io/IOException
    //   245	249	284	java/io/IOException
    //   254	259	288	java/io/IOException
    //   115	142	292	finally
    //   142	170	305	finally
    //   115	142	322	java/lang/Throwable
    //   142	170	328	java/lang/Throwable
  }

  public static void a(Context paramContext)
  {
    AppMethodBeat.i(64411);
    if (!y(paramContext))
      if (a(paramContext, "core_unzip_tmp"))
      {
        TbsCoreLoadStat.getInstance().a(paramContext, 417, new Throwable("TMP_TBS_UNZIP_FOLDER_NAME"));
        TbsLog.e("TbsInstaller", "TbsInstaller-UploadIfTempCoreExistConfError INFO_TEMP_CORE_EXIST_CONF_ERROR TMP_TBS_UNZIP_FOLDER_NAME");
        AppMethodBeat.o(64411);
      }
    while (true)
    {
      return;
      if (a(paramContext, "core_share_backup_tmp"))
      {
        TbsCoreLoadStat.getInstance().a(paramContext, 417, new Throwable("TMP_BACKUP_TBSCORE_FOLDER_NAME"));
        TbsLog.e("TbsInstaller", "TbsInstaller-UploadIfTempCoreExistConfError INFO_TEMP_CORE_EXIST_CONF_ERROR TMP_BACKUP_TBSCORE_FOLDER_NAME");
        AppMethodBeat.o(64411);
      }
      else
      {
        if (a(paramContext, "core_copy_tmp"))
        {
          TbsCoreLoadStat.getInstance().a(paramContext, 417, new Throwable("TMP_TBS_COPY_FOLDER_NAME"));
          TbsLog.e("TbsInstaller", "TbsInstaller-UploadIfTempCoreExistConfError INFO_TEMP_CORE_EXIST_CONF_ERROR TMP_TBS_COPY_FOLDER_NAME");
        }
        AppMethodBeat.o(64411);
      }
    }
  }

  // ERROR //
  @TargetApi(11)
  private void a(Context paramContext1, Context paramContext2, int paramInt)
  {
    // Byte code:
    //   0: ldc_w 482
    //   3: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_1
    //   7: invokestatic 201	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   10: sipush -524
    //   13: invokevirtual 485	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   16: aload_0
    //   17: aload_2
    //   18: invokevirtual 487	com/tencent/smtt/sdk/an:c	(Landroid/content/Context;)Z
    //   21: ifeq +10 -> 31
    //   24: ldc_w 482
    //   27: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   30: return
    //   31: ldc 139
    //   33: ldc_w 489
    //   36: iload_3
    //   37: invokestatic 492	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   40: invokevirtual 496	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   43: invokestatic 146	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   46: getstatic 501	android/os/Build$VERSION:SDK_INT	I
    //   49: bipush 11
    //   51: if_icmplt +75 -> 126
    //   54: aload_2
    //   55: ldc_w 503
    //   58: iconst_4
    //   59: invokevirtual 507	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   62: astore 4
    //   64: aload 4
    //   66: ldc_w 509
    //   69: iconst_m1
    //   70: invokeinterface 213 3 0
    //   75: iload_3
    //   76: if_icmpne +63 -> 139
    //   79: ldc 139
    //   81: new 251	java/lang/StringBuilder
    //   84: dup
    //   85: ldc_w 511
    //   88: invokespecial 255	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   91: iload_3
    //   92: invokevirtual 278	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   95: ldc_w 513
    //   98: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   101: invokevirtual 264	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   104: invokestatic 465	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   107: aload_1
    //   108: invokestatic 201	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   111: sipush -525
    //   114: invokevirtual 485	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   117: ldc_w 482
    //   120: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   123: goto -93 -> 30
    //   126: aload_2
    //   127: ldc_w 503
    //   130: iconst_0
    //   131: invokevirtual 507	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   134: astore 4
    //   136: goto -72 -> 64
    //   139: aload_0
    //   140: aload_2
    //   141: invokevirtual 516	com/tencent/smtt/sdk/an:x	(Landroid/content/Context;)Z
    //   144: ifne +22 -> 166
    //   147: aload_1
    //   148: invokestatic 201	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   151: sipush -526
    //   154: invokevirtual 485	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   157: ldc_w 482
    //   160: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   163: goto -133 -> 30
    //   166: getstatic 51	com/tencent/smtt/sdk/an:j	Ljava/util/concurrent/locks/Lock;
    //   169: invokeinterface 521 1 0
    //   174: istore 5
    //   176: ldc 139
    //   178: ldc_w 523
    //   181: iload 5
    //   183: invokestatic 526	java/lang/String:valueOf	(Z)Ljava/lang/String;
    //   186: invokevirtual 496	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   189: invokestatic 146	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   192: iload 5
    //   194: ifeq +1897 -> 2091
    //   197: getstatic 49	com/tencent/smtt/sdk/an:i	Ljava/util/concurrent/locks/ReentrantLock;
    //   200: invokevirtual 529	java/util/concurrent/locks/ReentrantLock:lock	()V
    //   203: aconst_null
    //   204: astore 4
    //   206: aload_2
    //   207: invokestatic 174	com/tencent/smtt/sdk/ai:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/ai;
    //   210: ldc_w 531
    //   213: invokevirtual 534	com/tencent/smtt/sdk/ai:c	(Ljava/lang/String;)I
    //   216: istore 6
    //   218: aload_2
    //   219: invokestatic 174	com/tencent/smtt/sdk/ai:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/ai;
    //   222: ldc_w 536
    //   225: invokevirtual 538	com/tencent/smtt/sdk/ai:b	(Ljava/lang/String;)I
    //   228: istore 7
    //   230: iload 6
    //   232: iload_3
    //   233: if_icmpne +51 -> 284
    //   236: getstatic 541	com/tencent/smtt/sdk/QbSdk:m	Lcom/tencent/smtt/sdk/TbsListener;
    //   239: sipush 220
    //   242: invokeinterface 546 2 0
    //   247: aload_1
    //   248: invokestatic 201	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   251: sipush -528
    //   254: invokevirtual 485	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   257: getstatic 49	com/tencent/smtt/sdk/an:i	Ljava/util/concurrent/locks/ReentrantLock;
    //   260: invokevirtual 549	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   263: getstatic 51	com/tencent/smtt/sdk/an:j	Ljava/util/concurrent/locks/Lock;
    //   266: invokeinterface 550 1 0
    //   271: aload_0
    //   272: invokevirtual 552	com/tencent/smtt/sdk/an:b	()V
    //   275: ldc_w 482
    //   278: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   281: goto -251 -> 30
    //   284: aload_0
    //   285: aload_2
    //   286: invokevirtual 221	com/tencent/smtt/sdk/an:j	(Landroid/content/Context;)I
    //   289: istore 8
    //   291: ldc 139
    //   293: ldc_w 554
    //   296: iload 8
    //   298: invokestatic 492	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   301: invokevirtual 496	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   304: invokestatic 146	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   307: iload 8
    //   309: iload_3
    //   310: if_icmpne +67 -> 377
    //   313: getstatic 541	com/tencent/smtt/sdk/QbSdk:m	Lcom/tencent/smtt/sdk/TbsListener;
    //   316: sipush 220
    //   319: invokeinterface 546 2 0
    //   324: aload_1
    //   325: invokestatic 201	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   328: sipush -528
    //   331: invokevirtual 485	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   334: ldc 139
    //   336: ldc_w 556
    //   339: iload 8
    //   341: invokestatic 492	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   344: invokevirtual 496	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   347: invokestatic 146	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   350: getstatic 49	com/tencent/smtt/sdk/an:i	Ljava/util/concurrent/locks/ReentrantLock;
    //   353: invokevirtual 549	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   356: getstatic 51	com/tencent/smtt/sdk/an:j	Ljava/util/concurrent/locks/Lock;
    //   359: invokeinterface 550 1 0
    //   364: aload_0
    //   365: invokevirtual 552	com/tencent/smtt/sdk/an:b	()V
    //   368: ldc_w 482
    //   371: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   374: goto -344 -> 30
    //   377: aload_2
    //   378: invokestatic 174	com/tencent/smtt/sdk/ai:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/ai;
    //   381: invokevirtual 559	com/tencent/smtt/sdk/ai:b	()I
    //   384: istore 9
    //   386: iload 9
    //   388: ifle +9 -> 397
    //   391: iload_3
    //   392: iload 9
    //   394: if_icmpgt +14 -> 408
    //   397: iload 6
    //   399: ifle +14 -> 413
    //   402: iload_3
    //   403: iload 6
    //   405: if_icmple +8 -> 413
    //   408: aload_0
    //   409: aload_2
    //   410: invokevirtual 561	com/tencent/smtt/sdk/an:p	(Landroid/content/Context;)V
    //   413: iload 7
    //   415: istore 9
    //   417: iload 7
    //   419: iconst_3
    //   420: if_icmpne +46 -> 466
    //   423: iload 7
    //   425: istore 9
    //   427: iload 8
    //   429: ifle +37 -> 466
    //   432: iload_3
    //   433: iload 8
    //   435: if_icmpgt +14 -> 449
    //   438: iload 7
    //   440: istore 9
    //   442: iload_3
    //   443: ldc_w 562
    //   446: if_icmpne +20 -> 466
    //   449: iconst_m1
    //   450: istore 9
    //   452: aload_0
    //   453: aload_2
    //   454: invokevirtual 561	com/tencent/smtt/sdk/an:p	(Landroid/content/Context;)V
    //   457: ldc 139
    //   459: ldc_w 564
    //   462: iconst_1
    //   463: invokestatic 385	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;Z)V
    //   466: aload_2
    //   467: invokestatic 566	com/tencent/smtt/utils/k:b	(Landroid/content/Context;)Z
    //   470: ifne +102 -> 572
    //   473: invokestatic 571	com/tencent/smtt/utils/y:a	()J
    //   476: lstore 10
    //   478: aload_2
    //   479: invokestatic 201	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   482: invokevirtual 574	com/tencent/smtt/sdk/TbsDownloadConfig:getDownloadMinFreeSpace	()J
    //   485: lstore 12
    //   487: aload_1
    //   488: invokestatic 201	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   491: sipush -529
    //   494: invokevirtual 485	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   497: aload_2
    //   498: invokestatic 249	com/tencent/smtt/sdk/TbsLogReport:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsLogReport;
    //   501: astore 14
    //   503: new 251	java/lang/StringBuilder
    //   506: astore 15
    //   508: aload 15
    //   510: ldc_w 576
    //   513: invokespecial 255	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   516: aload 14
    //   518: sipush 210
    //   521: aload 15
    //   523: lload 10
    //   525: invokevirtual 579	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   528: ldc_w 581
    //   531: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   534: lload 12
    //   536: invokevirtual 579	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   539: invokevirtual 264	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   542: invokevirtual 268	com/tencent/smtt/sdk/TbsLogReport:setInstallErrorCode	(ILjava/lang/String;)V
    //   545: getstatic 49	com/tencent/smtt/sdk/an:i	Ljava/util/concurrent/locks/ReentrantLock;
    //   548: invokevirtual 549	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   551: getstatic 51	com/tencent/smtt/sdk/an:j	Ljava/util/concurrent/locks/Lock;
    //   554: invokeinterface 550 1 0
    //   559: aload_0
    //   560: invokevirtual 552	com/tencent/smtt/sdk/an:b	()V
    //   563: ldc_w 482
    //   566: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   569: goto -539 -> 30
    //   572: iload 9
    //   574: ifle +97 -> 671
    //   577: aload_2
    //   578: invokestatic 165	com/tencent/smtt/sdk/TbsShareManager:isThirdPartyApp	(Landroid/content/Context;)Z
    //   581: ifne +32 -> 613
    //   584: aload_2
    //   585: invokestatic 201	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   588: getfield 205	com/tencent/smtt/sdk/TbsDownloadConfig:mPreferences	Landroid/content/SharedPreferences;
    //   591: ldc_w 583
    //   594: iconst_0
    //   595: invokeinterface 213 3 0
    //   600: iconst_1
    //   601: if_icmpne +12 -> 613
    //   604: iload_3
    //   605: aload_0
    //   606: aload_2
    //   607: invokevirtual 219	com/tencent/smtt/sdk/an:i	(Landroid/content/Context;)I
    //   610: if_icmpne +61 -> 671
    //   613: new 251	java/lang/StringBuilder
    //   616: astore 15
    //   618: aload 15
    //   620: ldc_w 585
    //   623: invokespecial 255	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   626: ldc 139
    //   628: aload 15
    //   630: aload_0
    //   631: aload_2
    //   632: invokevirtual 219	com/tencent/smtt/sdk/an:i	(Landroid/content/Context;)I
    //   635: invokevirtual 278	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   638: invokevirtual 264	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   641: invokestatic 146	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   644: getstatic 49	com/tencent/smtt/sdk/an:i	Ljava/util/concurrent/locks/ReentrantLock;
    //   647: invokevirtual 549	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   650: getstatic 51	com/tencent/smtt/sdk/an:j	Ljava/util/concurrent/locks/Lock;
    //   653: invokeinterface 550 1 0
    //   658: aload_0
    //   659: invokevirtual 552	com/tencent/smtt/sdk/an:b	()V
    //   662: ldc_w 482
    //   665: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   668: goto -638 -> 30
    //   671: iload 9
    //   673: ifne +85 -> 758
    //   676: aload_2
    //   677: invokestatic 174	com/tencent/smtt/sdk/ai:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/ai;
    //   680: ldc_w 587
    //   683: invokevirtual 534	com/tencent/smtt/sdk/ai:c	(Ljava/lang/String;)I
    //   686: istore 9
    //   688: iload 9
    //   690: iconst_2
    //   691: if_icmple +53 -> 744
    //   694: aload_2
    //   695: invokestatic 249	com/tencent/smtt/sdk/TbsLogReport:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsLogReport;
    //   698: sipush 211
    //   701: ldc_w 589
    //   704: invokevirtual 268	com/tencent/smtt/sdk/TbsLogReport:setInstallErrorCode	(ILjava/lang/String;)V
    //   707: aload_1
    //   708: invokestatic 201	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   711: sipush -530
    //   714: invokevirtual 485	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   717: getstatic 49	com/tencent/smtt/sdk/an:i	Ljava/util/concurrent/locks/ReentrantLock;
    //   720: invokevirtual 549	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   723: getstatic 51	com/tencent/smtt/sdk/an:j	Ljava/util/concurrent/locks/Lock;
    //   726: invokeinterface 550 1 0
    //   731: aload_0
    //   732: invokevirtual 552	com/tencent/smtt/sdk/an:b	()V
    //   735: ldc_w 482
    //   738: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   741: goto -711 -> 30
    //   744: aload_2
    //   745: invokestatic 174	com/tencent/smtt/sdk/ai:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/ai;
    //   748: ldc_w 587
    //   751: iload 9
    //   753: iconst_1
    //   754: iadd
    //   755: invokevirtual 185	com/tencent/smtt/sdk/ai:a	(Ljava/lang/String;I)V
    //   758: aload_0
    //   759: aload_1
    //   760: invokevirtual 305	com/tencent/smtt/sdk/an:r	(Landroid/content/Context;)Ljava/io/File;
    //   763: astore 14
    //   765: aload_2
    //   766: invokestatic 165	com/tencent/smtt/sdk/TbsShareManager:isThirdPartyApp	(Landroid/content/Context;)Z
    //   769: ifne +251 -> 1020
    //   772: aload_2
    //   773: invokestatic 201	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   776: getfield 205	com/tencent/smtt/sdk/TbsDownloadConfig:mPreferences	Landroid/content/SharedPreferences;
    //   779: ldc_w 583
    //   782: iconst_0
    //   783: invokeinterface 213 3 0
    //   788: iconst_1
    //   789: if_icmpne +217 -> 1006
    //   792: aload_0
    //   793: aload_2
    //   794: invokevirtual 592	com/tencent/smtt/sdk/an:q	(Landroid/content/Context;)Ljava/io/File;
    //   797: astore 15
    //   799: aload 15
    //   801: astore 4
    //   803: aload 14
    //   805: ifnull +1183 -> 1988
    //   808: aload 4
    //   810: ifnull +1178 -> 1988
    //   813: aload_2
    //   814: invokestatic 174	com/tencent/smtt/sdk/ai:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/ai;
    //   817: iload_3
    //   818: iconst_0
    //   819: invokevirtual 293	com/tencent/smtt/sdk/ai:a	(II)V
    //   822: new 594	com/tencent/smtt/utils/x
    //   825: astore 15
    //   827: aload 15
    //   829: invokespecial 595	com/tencent/smtt/utils/x:<init>	()V
    //   832: aload 15
    //   834: aload 14
    //   836: invokevirtual 597	com/tencent/smtt/utils/x:a	(Ljava/io/File;)V
    //   839: invokestatic 602	java/lang/System:currentTimeMillis	()J
    //   842: lstore 10
    //   844: aload_1
    //   845: invokestatic 201	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   848: sipush -551
    //   851: invokevirtual 485	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   854: aload 14
    //   856: aload 4
    //   858: getstatic 103	com/tencent/smtt/sdk/an:c	Ljava/io/FileFilter;
    //   861: invokestatic 605	com/tencent/smtt/utils/k:a	(Ljava/io/File;Ljava/io/File;Ljava/io/FileFilter;)Z
    //   864: istore 5
    //   866: aload_2
    //   867: invokestatic 201	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   870: getfield 205	com/tencent/smtt/sdk/TbsDownloadConfig:mPreferences	Landroid/content/SharedPreferences;
    //   873: ldc_w 583
    //   876: iconst_0
    //   877: invokeinterface 213 3 0
    //   882: iconst_1
    //   883: if_icmpne +7 -> 890
    //   886: aload_2
    //   887: invokestatic 607	com/tencent/smtt/sdk/TbsShareManager:b	(Landroid/content/Context;)V
    //   890: new 251	java/lang/StringBuilder
    //   893: astore 16
    //   895: aload 16
    //   897: ldc_w 609
    //   900: invokespecial 255	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   903: ldc 139
    //   905: aload 16
    //   907: invokestatic 602	java/lang/System:currentTimeMillis	()J
    //   910: lload 10
    //   912: lsub
    //   913: invokevirtual 579	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   916: invokevirtual 264	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   919: invokestatic 146	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   922: iload 5
    //   924: ifeq +1015 -> 1939
    //   927: aload 15
    //   929: aload 14
    //   931: invokevirtual 611	com/tencent/smtt/utils/x:b	(Ljava/io/File;)V
    //   934: aload 15
    //   936: invokevirtual 613	com/tencent/smtt/utils/x:a	()Z
    //   939: ifne +95 -> 1034
    //   942: ldc 139
    //   944: ldc_w 615
    //   947: invokestatic 146	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   950: aload 4
    //   952: iconst_1
    //   953: invokestatic 310	com/tencent/smtt/utils/k:a	(Ljava/io/File;Z)V
    //   956: aload_2
    //   957: invokestatic 249	com/tencent/smtt/sdk/TbsLogReport:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsLogReport;
    //   960: sipush 213
    //   963: ldc_w 617
    //   966: invokevirtual 268	com/tencent/smtt/sdk/TbsLogReport:setInstallErrorCode	(ILjava/lang/String;)V
    //   969: aload_1
    //   970: invokestatic 201	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   973: sipush -531
    //   976: invokevirtual 485	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   979: getstatic 49	com/tencent/smtt/sdk/an:i	Ljava/util/concurrent/locks/ReentrantLock;
    //   982: invokevirtual 549	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   985: getstatic 51	com/tencent/smtt/sdk/an:j	Ljava/util/concurrent/locks/Lock;
    //   988: invokeinterface 550 1 0
    //   993: aload_0
    //   994: invokevirtual 552	com/tencent/smtt/sdk/an:b	()V
    //   997: ldc_w 482
    //   1000: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1003: goto -973 -> 30
    //   1006: aload_0
    //   1007: aload_2
    //   1008: invokevirtual 357	com/tencent/smtt/sdk/an:w	(Landroid/content/Context;)Ljava/io/File;
    //   1011: astore 15
    //   1013: aload 15
    //   1015: astore 4
    //   1017: goto -214 -> 803
    //   1020: aload_0
    //   1021: aload_2
    //   1022: invokevirtual 357	com/tencent/smtt/sdk/an:w	(Landroid/content/Context;)Ljava/io/File;
    //   1025: astore 15
    //   1027: aload 15
    //   1029: astore 4
    //   1031: goto -228 -> 803
    //   1034: iconst_1
    //   1035: istore 7
    //   1037: iconst_1
    //   1038: istore 9
    //   1040: aconst_null
    //   1041: astore 17
    //   1043: aconst_null
    //   1044: astore 16
    //   1046: new 318	java/io/File
    //   1049: astore 15
    //   1051: aload 15
    //   1053: aload 4
    //   1055: ldc_w 619
    //   1058: invokespecial 396	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   1061: new 403	java/util/Properties
    //   1064: astore 14
    //   1066: aload 14
    //   1068: invokespecial 404	java/util/Properties:<init>	()V
    //   1071: aload 15
    //   1073: invokevirtual 622	java/io/File:exists	()Z
    //   1076: ifeq +270 -> 1346
    //   1079: new 406	java/io/FileInputStream
    //   1082: astore 18
    //   1084: aload 18
    //   1086: aload 15
    //   1088: invokespecial 409	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   1091: new 411	java/io/BufferedInputStream
    //   1094: astore 15
    //   1096: aload 15
    //   1098: aload 18
    //   1100: invokespecial 414	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   1103: aload 14
    //   1105: aload 15
    //   1107: invokevirtual 417	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   1110: aload 15
    //   1112: ifnull +8 -> 1120
    //   1115: aload 15
    //   1117: invokevirtual 443	java/io/BufferedInputStream:close	()V
    //   1120: aload 14
    //   1122: astore 15
    //   1124: iload 9
    //   1126: ifeq +1047 -> 2173
    //   1129: aload 4
    //   1131: invokevirtual 626	java/io/File:listFiles	()[Ljava/io/File;
    //   1134: astore 16
    //   1136: aload_1
    //   1137: invokestatic 201	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   1140: sipush -552
    //   1143: invokevirtual 485	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   1146: iconst_0
    //   1147: istore 7
    //   1149: iconst_1
    //   1150: istore 5
    //   1152: iload 5
    //   1154: istore 19
    //   1156: iload 7
    //   1158: aload 16
    //   1160: arraylength
    //   1161: if_icmpge +366 -> 1527
    //   1164: aload 16
    //   1166: iload 7
    //   1168: aaload
    //   1169: astore 14
    //   1171: iload 5
    //   1173: istore 19
    //   1175: ldc_w 619
    //   1178: aload 14
    //   1180: invokevirtual 629	java/io/File:getName	()Ljava/lang/String;
    //   1183: invokevirtual 346	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1186: ifne +150 -> 1336
    //   1189: iload 5
    //   1191: istore 19
    //   1193: aload 14
    //   1195: invokevirtual 629	java/io/File:getName	()Ljava/lang/String;
    //   1198: ldc_w 631
    //   1201: invokevirtual 635	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   1204: ifne +132 -> 1336
    //   1207: iload 5
    //   1209: istore 19
    //   1211: ldc_w 401
    //   1214: aload 14
    //   1216: invokevirtual 629	java/io/File:getName	()Ljava/lang/String;
    //   1219: invokevirtual 346	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1222: ifne +114 -> 1336
    //   1225: iload 5
    //   1227: istore 19
    //   1229: aload 14
    //   1231: invokevirtual 638	java/io/File:isDirectory	()Z
    //   1234: ifne +102 -> 1336
    //   1237: iload 5
    //   1239: istore 19
    //   1241: aload 14
    //   1243: invokevirtual 629	java/io/File:getName	()Ljava/lang/String;
    //   1246: ldc_w 640
    //   1249: invokevirtual 635	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   1252: ifne +84 -> 1336
    //   1255: aload 14
    //   1257: invokestatic 645	com/tencent/smtt/utils/a:a	(Ljava/io/File;)Ljava/lang/String;
    //   1260: astore 17
    //   1262: aload 15
    //   1264: aload 14
    //   1266: invokevirtual 629	java/io/File:getName	()Ljava/lang/String;
    //   1269: ldc 190
    //   1271: invokevirtual 649	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1274: astore 18
    //   1276: aload 18
    //   1278: ldc 190
    //   1280: invokevirtual 346	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1283: ifne +188 -> 1471
    //   1286: aload 17
    //   1288: aload 18
    //   1290: invokevirtual 346	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1293: ifeq +178 -> 1471
    //   1296: new 251	java/lang/StringBuilder
    //   1299: astore 17
    //   1301: aload 17
    //   1303: ldc_w 651
    //   1306: invokespecial 255	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1309: ldc 139
    //   1311: aload 17
    //   1313: aload 14
    //   1315: invokevirtual 629	java/io/File:getName	()Ljava/lang/String;
    //   1318: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1321: ldc_w 653
    //   1324: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1327: invokevirtual 264	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1330: invokestatic 146	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1333: iconst_1
    //   1334: istore 19
    //   1336: iinc 7 1
    //   1339: iload 19
    //   1341: istore 5
    //   1343: goto -191 -> 1152
    //   1346: iconst_0
    //   1347: istore 9
    //   1349: aconst_null
    //   1350: astore 15
    //   1352: goto -242 -> 1110
    //   1355: astore 15
    //   1357: aconst_null
    //   1358: astore 15
    //   1360: aload 16
    //   1362: ifnull +8 -> 1370
    //   1365: aload 16
    //   1367: invokevirtual 443	java/io/BufferedInputStream:close	()V
    //   1370: iload 7
    //   1372: istore 9
    //   1374: goto -250 -> 1124
    //   1377: astore 15
    //   1379: aload 17
    //   1381: astore 14
    //   1383: aload 14
    //   1385: ifnull +8 -> 1393
    //   1388: aload 14
    //   1390: invokevirtual 443	java/io/BufferedInputStream:close	()V
    //   1393: ldc_w 482
    //   1396: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1399: aload 15
    //   1401: athrow
    //   1402: astore 15
    //   1404: aload_2
    //   1405: invokestatic 249	com/tencent/smtt/sdk/TbsLogReport:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsLogReport;
    //   1408: sipush 215
    //   1411: aload 15
    //   1413: invokevirtual 298	java/lang/Exception:toString	()Ljava/lang/String;
    //   1416: invokevirtual 268	com/tencent/smtt/sdk/TbsLogReport:setInstallErrorCode	(ILjava/lang/String;)V
    //   1419: aload_1
    //   1420: invokestatic 201	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   1423: sipush -537
    //   1426: invokevirtual 485	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   1429: aload 4
    //   1431: iconst_0
    //   1432: invokestatic 310	com/tencent/smtt/utils/k:a	(Ljava/io/File;Z)V
    //   1435: aload_2
    //   1436: invokestatic 174	com/tencent/smtt/sdk/ai:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/ai;
    //   1439: iconst_0
    //   1440: iconst_m1
    //   1441: invokevirtual 293	com/tencent/smtt/sdk/ai:a	(II)V
    //   1444: getstatic 49	com/tencent/smtt/sdk/an:i	Ljava/util/concurrent/locks/ReentrantLock;
    //   1447: invokevirtual 549	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   1450: getstatic 51	com/tencent/smtt/sdk/an:j	Ljava/util/concurrent/locks/Lock;
    //   1453: invokeinterface 550 1 0
    //   1458: aload_0
    //   1459: invokevirtual 552	com/tencent/smtt/sdk/an:b	()V
    //   1462: ldc_w 482
    //   1465: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1468: goto -1438 -> 30
    //   1471: iconst_0
    //   1472: istore 19
    //   1474: new 251	java/lang/StringBuilder
    //   1477: astore 15
    //   1479: aload 15
    //   1481: ldc_w 655
    //   1484: invokespecial 255	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1487: ldc 139
    //   1489: aload 15
    //   1491: aload 14
    //   1493: invokevirtual 629	java/io/File:getName	()Ljava/lang/String;
    //   1496: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1499: ldc_w 657
    //   1502: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1505: aload 18
    //   1507: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1510: ldc_w 659
    //   1513: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1516: aload 17
    //   1518: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1521: invokevirtual 264	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1524: invokestatic 465	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1527: ldc 139
    //   1529: ldc_w 661
    //   1532: iload 19
    //   1534: invokestatic 526	java/lang/String:valueOf	(Z)Ljava/lang/String;
    //   1537: invokevirtual 496	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   1540: invokestatic 146	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1543: iload 9
    //   1545: ifeq +72 -> 1617
    //   1548: iload 19
    //   1550: ifne +67 -> 1617
    //   1553: ldc 139
    //   1555: ldc_w 663
    //   1558: invokestatic 465	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1561: aload 4
    //   1563: iconst_1
    //   1564: invokestatic 310	com/tencent/smtt/utils/k:a	(Ljava/io/File;Z)V
    //   1567: aload_2
    //   1568: invokestatic 249	com/tencent/smtt/sdk/TbsLogReport:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsLogReport;
    //   1571: sipush 213
    //   1574: ldc_w 665
    //   1577: invokevirtual 268	com/tencent/smtt/sdk/TbsLogReport:setInstallErrorCode	(ILjava/lang/String;)V
    //   1580: aload_1
    //   1581: invokestatic 201	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   1584: sipush -532
    //   1587: invokevirtual 485	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   1590: getstatic 49	com/tencent/smtt/sdk/an:i	Ljava/util/concurrent/locks/ReentrantLock;
    //   1593: invokevirtual 549	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   1596: getstatic 51	com/tencent/smtt/sdk/an:j	Ljava/util/concurrent/locks/Lock;
    //   1599: invokeinterface 550 1 0
    //   1604: aload_0
    //   1605: invokevirtual 552	com/tencent/smtt/sdk/an:b	()V
    //   1608: ldc_w 482
    //   1611: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1614: goto -1584 -> 30
    //   1617: ldc 139
    //   1619: ldc_w 667
    //   1622: invokestatic 146	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1625: aload_0
    //   1626: aload_2
    //   1627: iconst_1
    //   1628: invokespecial 351	com/tencent/smtt/sdk/an:f	(Landroid/content/Context;Z)V
    //   1631: aload_1
    //   1632: invokestatic 671	com/tencent/smtt/sdk/ag:b	(Landroid/content/Context;)Ljava/io/File;
    //   1635: astore 16
    //   1637: aload 16
    //   1639: ifnull +43 -> 1682
    //   1642: aload 16
    //   1644: invokevirtual 622	java/io/File:exists	()Z
    //   1647: ifeq +35 -> 1682
    //   1650: new 318	java/io/File
    //   1653: astore 14
    //   1655: aload_2
    //   1656: invokestatic 676	com/tencent/smtt/sdk/TbsDownloader:getOverSea	(Landroid/content/Context;)Z
    //   1659: ifeq +180 -> 1839
    //   1662: ldc_w 678
    //   1665: astore 15
    //   1667: aload 14
    //   1669: aload 16
    //   1671: aload 15
    //   1673: invokespecial 396	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   1676: aload 14
    //   1678: aload_2
    //   1679: invokestatic 681	com/tencent/smtt/sdk/ag:a	(Ljava/io/File;Landroid/content/Context;)V
    //   1682: aload_2
    //   1683: invokestatic 174	com/tencent/smtt/sdk/ai:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/ai;
    //   1686: iload_3
    //   1687: iconst_1
    //   1688: invokevirtual 293	com/tencent/smtt/sdk/ai:a	(II)V
    //   1691: aload_0
    //   1692: getfield 118	com/tencent/smtt/sdk/an:k	Z
    //   1695: ifeq +152 -> 1847
    //   1698: aload_2
    //   1699: invokestatic 249	com/tencent/smtt/sdk/TbsLogReport:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsLogReport;
    //   1702: sipush 220
    //   1705: ldc_w 683
    //   1708: invokevirtual 268	com/tencent/smtt/sdk/TbsLogReport:setInstallErrorCode	(ILjava/lang/String;)V
    //   1711: aload_1
    //   1712: invokestatic 201	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   1715: sipush -533
    //   1718: invokevirtual 485	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   1721: ldc 139
    //   1723: ldc_w 685
    //   1726: iload_3
    //   1727: invokestatic 492	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   1730: invokevirtual 496	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   1733: invokestatic 146	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1736: getstatic 501	android/os/Build$VERSION:SDK_INT	I
    //   1739: bipush 11
    //   1741: if_icmplt +149 -> 1890
    //   1744: aload_2
    //   1745: ldc_w 503
    //   1748: iconst_4
    //   1749: invokevirtual 507	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   1752: astore 15
    //   1754: aload 15
    //   1756: invokeinterface 689 1 0
    //   1761: astore 15
    //   1763: aload 15
    //   1765: ldc_w 691
    //   1768: iconst_0
    //   1769: invokeinterface 697 3 0
    //   1774: pop
    //   1775: aload 15
    //   1777: ldc_w 699
    //   1780: iconst_0
    //   1781: invokeinterface 697 3 0
    //   1786: pop
    //   1787: aload 15
    //   1789: ldc_w 701
    //   1792: iload_3
    //   1793: invokeinterface 697 3 0
    //   1798: pop
    //   1799: aload 15
    //   1801: invokeinterface 704 1 0
    //   1806: pop
    //   1807: aload_2
    //   1808: invokestatic 706	com/tencent/smtt/utils/y:a	(Landroid/content/Context;)Z
    //   1811: pop
    //   1812: getstatic 49	com/tencent/smtt/sdk/an:i	Ljava/util/concurrent/locks/ReentrantLock;
    //   1815: invokevirtual 549	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   1818: getstatic 51	com/tencent/smtt/sdk/an:j	Ljava/util/concurrent/locks/Lock;
    //   1821: invokeinterface 550 1 0
    //   1826: aload_0
    //   1827: invokevirtual 552	com/tencent/smtt/sdk/an:b	()V
    //   1830: ldc_w 482
    //   1833: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1836: goto -1806 -> 30
    //   1839: ldc_w 708
    //   1842: astore 15
    //   1844: goto -177 -> 1667
    //   1847: aload_2
    //   1848: invokestatic 249	com/tencent/smtt/sdk/TbsLogReport:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsLogReport;
    //   1851: sipush 220
    //   1854: ldc_w 710
    //   1857: invokevirtual 268	com/tencent/smtt/sdk/TbsLogReport:setInstallErrorCode	(ILjava/lang/String;)V
    //   1860: goto -149 -> 1711
    //   1863: astore_1
    //   1864: getstatic 49	com/tencent/smtt/sdk/an:i	Ljava/util/concurrent/locks/ReentrantLock;
    //   1867: invokevirtual 549	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   1870: getstatic 51	com/tencent/smtt/sdk/an:j	Ljava/util/concurrent/locks/Lock;
    //   1873: invokeinterface 550 1 0
    //   1878: aload_0
    //   1879: invokevirtual 552	com/tencent/smtt/sdk/an:b	()V
    //   1882: ldc_w 482
    //   1885: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1888: aload_1
    //   1889: athrow
    //   1890: aload_2
    //   1891: ldc_w 503
    //   1894: iconst_0
    //   1895: invokevirtual 507	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   1898: astore 15
    //   1900: goto -146 -> 1754
    //   1903: astore 15
    //   1905: new 251	java/lang/StringBuilder
    //   1908: astore 14
    //   1910: aload 14
    //   1912: ldc_w 712
    //   1915: invokespecial 255	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1918: ldc 139
    //   1920: aload 14
    //   1922: aload 15
    //   1924: invokestatic 718	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   1927: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1930: invokevirtual 264	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1933: invokestatic 465	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1936: goto -129 -> 1807
    //   1939: ldc 139
    //   1941: ldc_w 720
    //   1944: invokestatic 146	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1947: aload_2
    //   1948: invokestatic 174	com/tencent/smtt/sdk/ai:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/ai;
    //   1951: iload_3
    //   1952: iconst_2
    //   1953: invokevirtual 293	com/tencent/smtt/sdk/ai:a	(II)V
    //   1956: aload 4
    //   1958: iconst_0
    //   1959: invokestatic 310	com/tencent/smtt/utils/k:a	(Ljava/io/File;Z)V
    //   1962: aload_1
    //   1963: invokestatic 201	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   1966: sipush -534
    //   1969: invokevirtual 485	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   1972: aload_2
    //   1973: invokestatic 249	com/tencent/smtt/sdk/TbsLogReport:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsLogReport;
    //   1976: sipush 212
    //   1979: ldc_w 722
    //   1982: invokevirtual 268	com/tencent/smtt/sdk/TbsLogReport:setInstallErrorCode	(ILjava/lang/String;)V
    //   1985: goto -173 -> 1812
    //   1988: aload 14
    //   1990: ifnonnull +26 -> 2016
    //   1993: aload_2
    //   1994: invokestatic 249	com/tencent/smtt/sdk/TbsLogReport:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsLogReport;
    //   1997: sipush 213
    //   2000: ldc_w 724
    //   2003: invokevirtual 268	com/tencent/smtt/sdk/TbsLogReport:setInstallErrorCode	(ILjava/lang/String;)V
    //   2006: aload_1
    //   2007: invokestatic 201	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   2010: sipush -535
    //   2013: invokevirtual 485	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   2016: aload 4
    //   2018: ifnonnull -206 -> 1812
    //   2021: aload_2
    //   2022: invokestatic 249	com/tencent/smtt/sdk/TbsLogReport:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsLogReport;
    //   2025: sipush 214
    //   2028: ldc_w 726
    //   2031: invokevirtual 268	com/tencent/smtt/sdk/TbsLogReport:setInstallErrorCode	(ILjava/lang/String;)V
    //   2034: aload_1
    //   2035: invokestatic 201	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   2038: sipush -536
    //   2041: invokevirtual 485	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   2044: goto -232 -> 1812
    //   2047: astore_1
    //   2048: new 251	java/lang/StringBuilder
    //   2051: astore_2
    //   2052: aload_2
    //   2053: ldc_w 728
    //   2056: invokespecial 255	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2059: ldc 139
    //   2061: aload_2
    //   2062: aload_1
    //   2063: invokevirtual 731	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   2066: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2069: ldc_w 733
    //   2072: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2075: aload_1
    //   2076: invokevirtual 737	java/lang/Exception:getCause	()Ljava/lang/Throwable;
    //   2079: invokevirtual 740	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   2082: invokevirtual 264	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2085: invokestatic 465	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   2088: goto -644 -> 1444
    //   2091: aload_0
    //   2092: invokevirtual 552	com/tencent/smtt/sdk/an:b	()V
    //   2095: aload_1
    //   2096: invokestatic 201	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   2099: sipush -538
    //   2102: invokevirtual 485	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   2105: ldc_w 482
    //   2108: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   2111: goto -2081 -> 30
    //   2114: astore 14
    //   2116: goto -746 -> 1370
    //   2119: astore 14
    //   2121: goto -728 -> 1393
    //   2124: astore 15
    //   2126: goto -1006 -> 1120
    //   2129: astore 15
    //   2131: goto -727 -> 1404
    //   2134: astore 14
    //   2136: aload 15
    //   2138: astore 16
    //   2140: aload 14
    //   2142: astore 15
    //   2144: aload 16
    //   2146: astore 14
    //   2148: goto -765 -> 1383
    //   2151: astore 15
    //   2153: aload 14
    //   2155: astore 15
    //   2157: goto -797 -> 1360
    //   2160: astore 16
    //   2162: aload 15
    //   2164: astore 16
    //   2166: aload 14
    //   2168: astore 15
    //   2170: goto -810 -> 1360
    //   2173: iconst_1
    //   2174: istore 19
    //   2176: goto -649 -> 1527
    //
    // Exception table:
    //   from	to	target	type
    //   1046	1071	1355	java/lang/Exception
    //   1046	1071	1377	finally
    //   1071	1103	1377	finally
    //   813	890	1402	java/lang/Exception
    //   890	922	1402	java/lang/Exception
    //   927	979	1402	java/lang/Exception
    //   1115	1120	1402	java/lang/Exception
    //   1129	1146	1402	java/lang/Exception
    //   1156	1164	1402	java/lang/Exception
    //   1175	1189	1402	java/lang/Exception
    //   1193	1207	1402	java/lang/Exception
    //   1211	1225	1402	java/lang/Exception
    //   1229	1237	1402	java/lang/Exception
    //   1241	1333	1402	java/lang/Exception
    //   1365	1370	1402	java/lang/Exception
    //   1388	1393	1402	java/lang/Exception
    //   1393	1402	1402	java/lang/Exception
    //   1474	1527	1402	java/lang/Exception
    //   1527	1543	1402	java/lang/Exception
    //   1553	1590	1402	java/lang/Exception
    //   1617	1637	1402	java/lang/Exception
    //   1642	1662	1402	java/lang/Exception
    //   1667	1682	1402	java/lang/Exception
    //   1682	1711	1402	java/lang/Exception
    //   1711	1754	1402	java/lang/Exception
    //   1754	1807	1402	java/lang/Exception
    //   1807	1812	1402	java/lang/Exception
    //   1847	1860	1402	java/lang/Exception
    //   1890	1900	1402	java/lang/Exception
    //   1905	1936	1402	java/lang/Exception
    //   1939	1985	1402	java/lang/Exception
    //   1993	2016	1402	java/lang/Exception
    //   2021	2044	1402	java/lang/Exception
    //   206	230	1863	finally
    //   236	257	1863	finally
    //   284	307	1863	finally
    //   313	350	1863	finally
    //   377	386	1863	finally
    //   408	413	1863	finally
    //   452	466	1863	finally
    //   466	545	1863	finally
    //   577	613	1863	finally
    //   613	644	1863	finally
    //   676	688	1863	finally
    //   694	717	1863	finally
    //   744	758	1863	finally
    //   758	799	1863	finally
    //   813	890	1863	finally
    //   890	922	1863	finally
    //   927	979	1863	finally
    //   1006	1013	1863	finally
    //   1020	1027	1863	finally
    //   1115	1120	1863	finally
    //   1129	1146	1863	finally
    //   1156	1164	1863	finally
    //   1175	1189	1863	finally
    //   1193	1207	1863	finally
    //   1211	1225	1863	finally
    //   1229	1237	1863	finally
    //   1241	1333	1863	finally
    //   1365	1370	1863	finally
    //   1388	1393	1863	finally
    //   1393	1402	1863	finally
    //   1404	1429	1863	finally
    //   1429	1444	1863	finally
    //   1474	1527	1863	finally
    //   1527	1543	1863	finally
    //   1553	1590	1863	finally
    //   1617	1637	1863	finally
    //   1642	1662	1863	finally
    //   1667	1682	1863	finally
    //   1682	1711	1863	finally
    //   1711	1754	1863	finally
    //   1754	1807	1863	finally
    //   1807	1812	1863	finally
    //   1847	1860	1863	finally
    //   1890	1900	1863	finally
    //   1905	1936	1863	finally
    //   1939	1985	1863	finally
    //   1993	2016	1863	finally
    //   2021	2044	1863	finally
    //   2048	2088	1863	finally
    //   1754	1807	1903	java/lang/Throwable
    //   1429	1444	2047	java/lang/Exception
    //   1365	1370	2114	java/io/IOException
    //   1388	1393	2119	java/io/IOException
    //   1115	1120	2124	java/io/IOException
    //   206	230	2129	java/lang/Exception
    //   236	257	2129	java/lang/Exception
    //   284	307	2129	java/lang/Exception
    //   313	350	2129	java/lang/Exception
    //   377	386	2129	java/lang/Exception
    //   408	413	2129	java/lang/Exception
    //   452	466	2129	java/lang/Exception
    //   466	545	2129	java/lang/Exception
    //   577	613	2129	java/lang/Exception
    //   613	644	2129	java/lang/Exception
    //   676	688	2129	java/lang/Exception
    //   694	717	2129	java/lang/Exception
    //   744	758	2129	java/lang/Exception
    //   758	799	2129	java/lang/Exception
    //   1006	1013	2129	java/lang/Exception
    //   1020	1027	2129	java/lang/Exception
    //   1103	1110	2134	finally
    //   1071	1103	2151	java/lang/Exception
    //   1103	1110	2160	java/lang/Exception
  }

  private boolean a(Context paramContext, File paramFile)
  {
    AppMethodBeat.i(64431);
    boolean bool = a(paramContext, paramFile, false);
    AppMethodBeat.o(64431);
    return bool;
  }

  // ERROR //
  private boolean a(Context paramContext, File paramFile, boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 4
    //   3: iconst_0
    //   4: istore 5
    //   6: ldc_w 756
    //   9: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   12: ldc 139
    //   14: ldc_w 758
    //   17: invokestatic 146	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   20: aload_2
    //   21: invokestatic 760	com/tencent/smtt/utils/k:c	(Ljava/io/File;)Z
    //   24: ifne +39 -> 63
    //   27: aload_1
    //   28: invokestatic 249	com/tencent/smtt/sdk/TbsLogReport:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsLogReport;
    //   31: sipush 204
    //   34: ldc_w 762
    //   37: invokevirtual 268	com/tencent/smtt/sdk/TbsLogReport:setInstallErrorCode	(ILjava/lang/String;)V
    //   40: aload_1
    //   41: invokestatic 201	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   44: sipush -520
    //   47: invokevirtual 485	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   50: ldc_w 756
    //   53: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   56: iload 5
    //   58: istore 6
    //   60: iload 6
    //   62: ireturn
    //   63: aload_1
    //   64: ldc_w 387
    //   67: iconst_0
    //   68: invokevirtual 391	android/content/Context:getDir	(Ljava/lang/String;I)Ljava/io/File;
    //   71: astore 7
    //   73: iload_3
    //   74: ifeq +103 -> 177
    //   77: new 318	java/io/File
    //   80: astore 8
    //   82: aload 8
    //   84: aload 7
    //   86: ldc_w 764
    //   89: invokespecial 396	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   92: aload 8
    //   94: invokevirtual 622	java/io/File:exists	()Z
    //   97: ifeq +28 -> 125
    //   100: aload_1
    //   101: invokestatic 201	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   104: getfield 205	com/tencent/smtt/sdk/TbsDownloadConfig:mPreferences	Landroid/content/SharedPreferences;
    //   107: ldc_w 583
    //   110: iconst_0
    //   111: invokeinterface 213 3 0
    //   116: iconst_1
    //   117: if_icmpeq +8 -> 125
    //   120: aload 8
    //   122: invokestatic 765	com/tencent/smtt/utils/k:b	(Ljava/io/File;)V
    //   125: iload_3
    //   126: ifeq +99 -> 225
    //   129: aload_0
    //   130: aload_1
    //   131: invokevirtual 768	com/tencent/smtt/sdk/an:v	(Landroid/content/Context;)Ljava/io/File;
    //   134: astore 8
    //   136: aload 8
    //   138: ifnonnull +97 -> 235
    //   141: aload_1
    //   142: invokestatic 249	com/tencent/smtt/sdk/TbsLogReport:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsLogReport;
    //   145: sipush 205
    //   148: ldc_w 770
    //   151: invokevirtual 268	com/tencent/smtt/sdk/TbsLogReport:setInstallErrorCode	(ILjava/lang/String;)V
    //   154: aload_1
    //   155: invokestatic 201	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   158: sipush -521
    //   161: invokevirtual 485	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   164: ldc_w 756
    //   167: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   170: iload 5
    //   172: istore 6
    //   174: goto -114 -> 60
    //   177: new 318	java/io/File
    //   180: dup
    //   181: aload 7
    //   183: ldc_w 393
    //   186: invokespecial 396	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   189: astore 8
    //   191: goto -99 -> 92
    //   194: astore 8
    //   196: ldc 139
    //   198: new 251	java/lang/StringBuilder
    //   201: dup
    //   202: ldc_w 772
    //   205: invokespecial 255	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   208: aload 8
    //   210: invokestatic 718	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   213: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   216: invokevirtual 264	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   219: invokestatic 465	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   222: goto -97 -> 125
    //   225: aload_0
    //   226: aload_1
    //   227: invokevirtual 316	com/tencent/smtt/sdk/an:u	(Landroid/content/Context;)Ljava/io/File;
    //   230: astore 8
    //   232: goto -96 -> 136
    //   235: aload 8
    //   237: invokestatic 774	com/tencent/smtt/utils/k:a	(Ljava/io/File;)Z
    //   240: pop
    //   241: iload_3
    //   242: ifeq +9 -> 251
    //   245: aload 8
    //   247: iconst_1
    //   248: invokestatic 310	com/tencent/smtt/utils/k:a	(Ljava/io/File;Z)V
    //   251: aload_2
    //   252: aload 8
    //   254: invokestatic 777	com/tencent/smtt/utils/k:a	(Ljava/io/File;Ljava/io/File;)Z
    //   257: istore 9
    //   259: iload 9
    //   261: istore 6
    //   263: iload 9
    //   265: ifeq +12 -> 277
    //   268: aload_0
    //   269: aload 8
    //   271: aload_1
    //   272: invokespecial 780	com/tencent/smtt/sdk/an:a	(Ljava/io/File;Landroid/content/Context;)Z
    //   275: istore 6
    //   277: iload_3
    //   278: ifeq +85 -> 363
    //   281: aload 8
    //   283: invokevirtual 784	java/io/File:list	()[Ljava/lang/String;
    //   286: astore 7
    //   288: iconst_0
    //   289: istore 10
    //   291: iload 10
    //   293: aload 7
    //   295: arraylength
    //   296: if_icmpge +42 -> 338
    //   299: new 318	java/io/File
    //   302: astore_2
    //   303: aload_2
    //   304: aload 8
    //   306: aload 7
    //   308: iload 10
    //   310: aaload
    //   311: invokespecial 396	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   314: aload_2
    //   315: invokevirtual 629	java/io/File:getName	()Ljava/lang/String;
    //   318: ldc_w 631
    //   321: invokevirtual 635	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   324: ifeq +8 -> 332
    //   327: aload_2
    //   328: invokevirtual 379	java/io/File:delete	()Z
    //   331: pop
    //   332: iinc 10 1
    //   335: goto -44 -> 291
    //   338: aload_1
    //   339: invokestatic 787	com/tencent/smtt/sdk/an:t	(Landroid/content/Context;)Ljava/io/File;
    //   342: astore_2
    //   343: new 318	java/io/File
    //   346: astore 7
    //   348: aload 7
    //   350: aload_2
    //   351: ldc_w 789
    //   354: invokespecial 396	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   357: aload 7
    //   359: invokevirtual 379	java/io/File:delete	()Z
    //   362: pop
    //   363: iload 6
    //   365: ifne +63 -> 428
    //   368: aload 8
    //   370: invokestatic 765	com/tencent/smtt/utils/k:b	(Ljava/io/File;)V
    //   373: aload_1
    //   374: invokestatic 201	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   377: sipush -522
    //   380: invokevirtual 485	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   383: new 251	java/lang/StringBuilder
    //   386: astore_2
    //   387: aload_2
    //   388: ldc_w 791
    //   391: invokespecial 255	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   394: ldc 139
    //   396: aload_2
    //   397: aload 8
    //   399: invokevirtual 622	java/io/File:exists	()Z
    //   402: invokevirtual 794	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   405: invokevirtual 264	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   408: invokestatic 465	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   411: ldc 139
    //   413: ldc_w 796
    //   416: invokestatic 146	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   419: ldc_w 756
    //   422: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   425: goto -365 -> 60
    //   428: aload_0
    //   429: aload_1
    //   430: iconst_1
    //   431: invokespecial 351	com/tencent/smtt/sdk/an:f	(Landroid/content/Context;Z)V
    //   434: iload_3
    //   435: ifeq -24 -> 411
    //   438: aload_0
    //   439: aload_1
    //   440: invokevirtual 592	com/tencent/smtt/sdk/an:q	(Landroid/content/Context;)Ljava/io/File;
    //   443: astore_2
    //   444: aload_2
    //   445: iconst_1
    //   446: invokestatic 310	com/tencent/smtt/utils/k:a	(Ljava/io/File;Z)V
    //   449: aload 8
    //   451: aload_2
    //   452: invokevirtual 322	java/io/File:renameTo	(Ljava/io/File;)Z
    //   455: pop
    //   456: aload_1
    //   457: invokestatic 607	com/tencent/smtt/sdk/TbsShareManager:b	(Landroid/content/Context;)V
    //   460: goto -49 -> 411
    //   463: astore_2
    //   464: aload_1
    //   465: invokestatic 201	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   468: sipush -523
    //   471: invokevirtual 485	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   474: aload_1
    //   475: invokestatic 249	com/tencent/smtt/sdk/TbsLogReport:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsLogReport;
    //   478: sipush 206
    //   481: aload_2
    //   482: invokevirtual 799	com/tencent/smtt/sdk/TbsLogReport:setInstallErrorCode	(ILjava/lang/Throwable;)V
    //   485: aload 8
    //   487: ifnull +270 -> 757
    //   490: aload 8
    //   492: invokevirtual 622	java/io/File:exists	()Z
    //   495: istore_3
    //   496: iload_3
    //   497: ifeq +260 -> 757
    //   500: iconst_1
    //   501: istore 10
    //   503: iload 10
    //   505: ifeq +41 -> 546
    //   508: aload 8
    //   510: ifnull +36 -> 546
    //   513: aload 8
    //   515: invokestatic 765	com/tencent/smtt/utils/k:b	(Ljava/io/File;)V
    //   518: new 251	java/lang/StringBuilder
    //   521: astore_1
    //   522: aload_1
    //   523: ldc_w 801
    //   526: invokespecial 255	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   529: ldc 139
    //   531: aload_1
    //   532: aload 8
    //   534: invokevirtual 622	java/io/File:exists	()Z
    //   537: invokevirtual 794	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   540: invokevirtual 264	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   543: invokestatic 465	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   546: ldc 139
    //   548: ldc_w 796
    //   551: invokestatic 146	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   554: ldc_w 756
    //   557: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   560: iload 5
    //   562: istore 6
    //   564: goto -504 -> 60
    //   567: astore_2
    //   568: aload_1
    //   569: invokestatic 201	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   572: sipush -523
    //   575: invokevirtual 485	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   578: aload_1
    //   579: invokestatic 249	com/tencent/smtt/sdk/TbsLogReport:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsLogReport;
    //   582: sipush 207
    //   585: aload_2
    //   586: invokevirtual 799	com/tencent/smtt/sdk/TbsLogReport:setInstallErrorCode	(ILjava/lang/Throwable;)V
    //   589: aload 8
    //   591: ifnull +160 -> 751
    //   594: aload 8
    //   596: invokevirtual 622	java/io/File:exists	()Z
    //   599: istore_3
    //   600: iload_3
    //   601: ifeq +150 -> 751
    //   604: iload 4
    //   606: istore 10
    //   608: iload 10
    //   610: ifeq +41 -> 651
    //   613: aload 8
    //   615: ifnull +36 -> 651
    //   618: aload 8
    //   620: invokestatic 765	com/tencent/smtt/utils/k:b	(Ljava/io/File;)V
    //   623: new 251	java/lang/StringBuilder
    //   626: astore_1
    //   627: aload_1
    //   628: ldc_w 801
    //   631: invokespecial 255	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   634: ldc 139
    //   636: aload_1
    //   637: aload 8
    //   639: invokevirtual 622	java/io/File:exists	()Z
    //   642: invokevirtual 794	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   645: invokevirtual 264	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   648: invokestatic 465	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   651: ldc 139
    //   653: ldc_w 796
    //   656: invokestatic 146	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   659: ldc_w 756
    //   662: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   665: iload 5
    //   667: istore 6
    //   669: goto -609 -> 60
    //   672: astore_1
    //   673: ldc 139
    //   675: ldc_w 796
    //   678: invokestatic 146	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   681: ldc_w 756
    //   684: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   687: aload_1
    //   688: athrow
    //   689: astore_1
    //   690: ldc 139
    //   692: new 251	java/lang/StringBuilder
    //   695: dup
    //   696: ldc_w 803
    //   699: invokespecial 255	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   702: aload_1
    //   703: invokestatic 718	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   706: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   709: invokevirtual 264	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   712: invokestatic 465	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   715: goto -169 -> 546
    //   718: astore_1
    //   719: ldc 139
    //   721: new 251	java/lang/StringBuilder
    //   724: dup
    //   725: ldc_w 803
    //   728: invokespecial 255	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   731: aload_1
    //   732: invokestatic 718	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   735: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   738: invokevirtual 264	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   741: invokestatic 465	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   744: goto -93 -> 651
    //   747: astore_2
    //   748: goto -385 -> 363
    //   751: iconst_0
    //   752: istore 10
    //   754: goto -146 -> 608
    //   757: iconst_0
    //   758: istore 10
    //   760: goto -257 -> 503
    //
    // Exception table:
    //   from	to	target	type
    //   63	73	194	java/lang/Throwable
    //   77	92	194	java/lang/Throwable
    //   92	125	194	java/lang/Throwable
    //   177	191	194	java/lang/Throwable
    //   235	241	463	java/io/IOException
    //   245	251	463	java/io/IOException
    //   251	259	463	java/io/IOException
    //   268	277	463	java/io/IOException
    //   281	288	463	java/io/IOException
    //   291	332	463	java/io/IOException
    //   338	363	463	java/io/IOException
    //   368	411	463	java/io/IOException
    //   428	434	463	java/io/IOException
    //   438	460	463	java/io/IOException
    //   235	241	567	java/lang/Exception
    //   245	251	567	java/lang/Exception
    //   251	259	567	java/lang/Exception
    //   268	277	567	java/lang/Exception
    //   281	288	567	java/lang/Exception
    //   291	332	567	java/lang/Exception
    //   368	411	567	java/lang/Exception
    //   428	434	567	java/lang/Exception
    //   438	460	567	java/lang/Exception
    //   235	241	672	finally
    //   245	251	672	finally
    //   251	259	672	finally
    //   268	277	672	finally
    //   281	288	672	finally
    //   291	332	672	finally
    //   338	363	672	finally
    //   368	411	672	finally
    //   428	434	672	finally
    //   438	460	672	finally
    //   464	485	672	finally
    //   490	496	672	finally
    //   568	589	672	finally
    //   594	600	672	finally
    //   513	546	689	java/lang/Throwable
    //   618	651	718	java/lang/Throwable
    //   338	363	747	java/lang/Exception
  }

  static boolean a(Context paramContext, String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(64413);
    paramContext = new File(paramContext.getDir("tbs", 0), paramString);
    if (!paramContext.exists())
    {
      TbsLog.i("TbsInstaller", "TbsInstaller-isPrepareTbsCore, #1");
      AppMethodBeat.o(64413);
    }
    while (true)
    {
      return bool;
      if (!new File(paramContext, "tbs.conf").exists())
      {
        TbsLog.i("TbsInstaller", "TbsInstaller-isPrepareTbsCore, #2");
        AppMethodBeat.o(64413);
      }
      else
      {
        TbsLog.i("TbsInstaller", "TbsInstaller-isPrepareTbsCore, #3");
        bool = true;
        AppMethodBeat.o(64413);
      }
    }
  }

  // ERROR //
  private boolean a(File paramFile, Context paramContext)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: iconst_0
    //   3: istore 4
    //   5: ldc_w 811
    //   8: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   11: ldc 139
    //   13: new 251	java/lang/StringBuilder
    //   16: dup
    //   17: ldc_w 813
    //   20: invokespecial 255	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   23: aload_1
    //   24: invokevirtual 740	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   27: ldc_w 815
    //   30: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   33: aload_2
    //   34: invokevirtual 740	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   37: invokevirtual 264	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   40: invokestatic 146	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   43: new 318	java/io/File
    //   46: astore_2
    //   47: aload_2
    //   48: aload_1
    //   49: ldc_w 619
    //   52: invokespecial 396	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   55: new 403	java/util/Properties
    //   58: astore 5
    //   60: aload 5
    //   62: invokespecial 404	java/util/Properties:<init>	()V
    //   65: aload_2
    //   66: invokevirtual 622	java/io/File:exists	()Z
    //   69: ifeq +239 -> 308
    //   72: new 406	java/io/FileInputStream
    //   75: astore 6
    //   77: aload 6
    //   79: aload_2
    //   80: invokespecial 409	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   83: new 411	java/io/BufferedInputStream
    //   86: astore_2
    //   87: aload_2
    //   88: aload 6
    //   90: invokespecial 414	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   93: aload 5
    //   95: aload_2
    //   96: invokevirtual 417	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   99: iconst_1
    //   100: istore 7
    //   102: aload_2
    //   103: astore_3
    //   104: aload 5
    //   106: astore_2
    //   107: iload 7
    //   109: istore 8
    //   111: aload_3
    //   112: ifnull +14 -> 126
    //   115: aload_3
    //   116: invokevirtual 443	java/io/BufferedInputStream:close	()V
    //   119: iload 7
    //   121: istore 8
    //   123: aload 5
    //   125: astore_2
    //   126: ldc 139
    //   128: ldc_w 817
    //   131: iload 8
    //   133: invokestatic 526	java/lang/String:valueOf	(Z)Ljava/lang/String;
    //   136: invokevirtual 496	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   139: invokestatic 146	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   142: iload 8
    //   144: ifeq +378 -> 522
    //   147: aload_1
    //   148: invokevirtual 626	java/io/File:listFiles	()[Ljava/io/File;
    //   151: astore_3
    //   152: iconst_0
    //   153: istore 9
    //   155: iload 9
    //   157: aload_3
    //   158: arraylength
    //   159: if_icmpge +363 -> 522
    //   162: aload_3
    //   163: iload 9
    //   165: aaload
    //   166: astore 6
    //   168: ldc_w 619
    //   171: aload 6
    //   173: invokevirtual 629	java/io/File:getName	()Ljava/lang/String;
    //   176: invokevirtual 346	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   179: ifne +123 -> 302
    //   182: aload 6
    //   184: invokevirtual 629	java/io/File:getName	()Ljava/lang/String;
    //   187: ldc_w 631
    //   190: invokevirtual 635	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   193: ifne +109 -> 302
    //   196: ldc_w 401
    //   199: aload 6
    //   201: invokevirtual 629	java/io/File:getName	()Ljava/lang/String;
    //   204: invokevirtual 346	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   207: ifne +95 -> 302
    //   210: aload 6
    //   212: invokevirtual 638	java/io/File:isDirectory	()Z
    //   215: ifne +87 -> 302
    //   218: aload 6
    //   220: invokevirtual 629	java/io/File:getName	()Ljava/lang/String;
    //   223: ldc_w 640
    //   226: invokevirtual 635	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   229: ifne +73 -> 302
    //   232: aload 6
    //   234: invokestatic 645	com/tencent/smtt/utils/a:a	(Ljava/io/File;)Ljava/lang/String;
    //   237: astore_1
    //   238: aload_2
    //   239: aload 6
    //   241: invokevirtual 629	java/io/File:getName	()Ljava/lang/String;
    //   244: ldc 190
    //   246: invokevirtual 649	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   249: astore 5
    //   251: aload 5
    //   253: ldc 190
    //   255: invokevirtual 346	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   258: ifne +99 -> 357
    //   261: aload 5
    //   263: aload_1
    //   264: invokevirtual 346	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   267: ifeq +90 -> 357
    //   270: ldc 139
    //   272: new 251	java/lang/StringBuilder
    //   275: dup
    //   276: ldc_w 651
    //   279: invokespecial 255	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   282: aload 6
    //   284: invokevirtual 629	java/io/File:getName	()Ljava/lang/String;
    //   287: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   290: ldc_w 653
    //   293: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   296: invokevirtual 264	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   299: invokestatic 146	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   302: iinc 9 1
    //   305: goto -150 -> 155
    //   308: aconst_null
    //   309: astore_3
    //   310: iconst_0
    //   311: istore 7
    //   313: goto -209 -> 104
    //   316: astore_2
    //   317: aconst_null
    //   318: astore_2
    //   319: aconst_null
    //   320: astore 5
    //   322: aload 5
    //   324: ifnull +8 -> 332
    //   327: aload 5
    //   329: invokevirtual 443	java/io/BufferedInputStream:close	()V
    //   332: iconst_1
    //   333: istore 8
    //   335: goto -209 -> 126
    //   338: astore_1
    //   339: aload_3
    //   340: astore_2
    //   341: aload_2
    //   342: ifnull +7 -> 349
    //   345: aload_2
    //   346: invokevirtual 443	java/io/BufferedInputStream:close	()V
    //   349: ldc_w 811
    //   352: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   355: aload_1
    //   356: athrow
    //   357: ldc 139
    //   359: new 251	java/lang/StringBuilder
    //   362: dup
    //   363: ldc_w 655
    //   366: invokespecial 255	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   369: aload 6
    //   371: invokevirtual 629	java/io/File:getName	()Ljava/lang/String;
    //   374: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   377: ldc_w 657
    //   380: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   383: aload 5
    //   385: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   388: ldc_w 659
    //   391: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   394: aload_1
    //   395: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   398: invokevirtual 264	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   401: invokestatic 465	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   404: iconst_0
    //   405: istore 7
    //   407: ldc 139
    //   409: ldc_w 819
    //   412: iload 7
    //   414: invokestatic 526	java/lang/String:valueOf	(Z)Ljava/lang/String;
    //   417: invokevirtual 496	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   420: invokestatic 146	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   423: iload 8
    //   425: ifeq +29 -> 454
    //   428: iload 7
    //   430: ifne +24 -> 454
    //   433: ldc 139
    //   435: ldc_w 821
    //   438: invokestatic 465	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   441: ldc_w 811
    //   444: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   447: iload 4
    //   449: istore 7
    //   451: iload 7
    //   453: ireturn
    //   454: ldc 139
    //   456: ldc_w 823
    //   459: invokestatic 146	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   462: ldc_w 811
    //   465: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   468: iconst_1
    //   469: istore 7
    //   471: goto -20 -> 451
    //   474: astore 5
    //   476: goto -144 -> 332
    //   479: astore_2
    //   480: goto -131 -> 349
    //   483: astore_2
    //   484: aload 5
    //   486: astore_2
    //   487: iload 7
    //   489: istore 8
    //   491: goto -365 -> 126
    //   494: astore_1
    //   495: goto -154 -> 341
    //   498: astore_2
    //   499: aconst_null
    //   500: astore_3
    //   501: aload 5
    //   503: astore_2
    //   504: aload_3
    //   505: astore 5
    //   507: goto -185 -> 322
    //   510: astore_3
    //   511: aload_2
    //   512: astore_3
    //   513: aload 5
    //   515: astore_2
    //   516: aload_3
    //   517: astore 5
    //   519: goto -197 -> 322
    //   522: iconst_1
    //   523: istore 7
    //   525: goto -118 -> 407
    //
    // Exception table:
    //   from	to	target	type
    //   43	65	316	java/lang/Exception
    //   43	65	338	finally
    //   65	93	338	finally
    //   327	332	474	java/io/IOException
    //   345	349	479	java/io/IOException
    //   115	119	483	java/io/IOException
    //   93	99	494	finally
    //   65	93	498	java/lang/Exception
    //   93	99	510	java/lang/Exception
  }

  @TargetApi(11)
  private void b(Context paramContext, String paramString, int paramInt)
  {
    int i1 = 200;
    int i2 = 0;
    AppMethodBeat.i(64415);
    TbsDownloadConfig.getInstance(paramContext).setInstallInterruptCode(-501);
    if (c(paramContext))
    {
      TbsLog.i("TbsInstaller", "isTbsLocalInstalled --> no installation!", true);
      TbsDownloadConfig.getInstance(paramContext).setInstallInterruptCode(-502);
      AppMethodBeat.o(64415);
    }
    Object localObject1;
    while (true)
    {
      return;
      TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCoreInThread tbsApkPath=".concat(String.valueOf(paramString)));
      TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCoreInThread tbsCoreTargetVer=".concat(String.valueOf(paramInt)));
      TbsLog.i("TbsInstaller", "TbsInstaller-continueInstallTbsCore currentProcessName=" + paramContext.getApplicationInfo().processName);
      TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCoreInThread currentProcessId=" + android.os.Process.myPid());
      TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCoreInThread currentThreadName=" + Thread.currentThread().getName());
      if (Build.VERSION.SDK_INT >= 11);
      for (localObject1 = paramContext.getSharedPreferences("tbs_preloadx5_check_cfg_file", 4); ; localObject1 = paramContext.getSharedPreferences("tbs_preloadx5_check_cfg_file", 0))
      {
        if (((SharedPreferences)localObject1).getInt("tbs_precheck_disable_version", -1) != paramInt)
          break label260;
        TbsLog.e("TbsInstaller", "TbsInstaller-installTbsCoreInThread -- version:" + paramInt + " is disabled by preload_x5_check!");
        TbsDownloadConfig.getInstance(paramContext).setInstallInterruptCode(-503);
        AppMethodBeat.o(64415);
        break;
      }
      label260: if (!k.b(paramContext))
      {
        long l1 = y.a();
        long l2 = TbsDownloadConfig.getInstance(paramContext).getDownloadMinFreeSpace();
        TbsDownloadConfig.getInstance(paramContext).setInstallInterruptCode(-504);
        TbsLogReport.getInstance(paramContext).setInstallErrorCode(210, "rom is not enough when installing tbs core! curAvailROM=" + l1 + ",minReqRom=" + l2);
        AppMethodBeat.o(64415);
      }
      else
      {
        if (x(paramContext))
          break;
        TbsDownloadConfig.getInstance(paramContext).setInstallInterruptCode(-505);
        AppMethodBeat.o(64415);
      }
    }
    boolean bool = j.tryLock();
    TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCoreInThread locked =".concat(String.valueOf(bool)));
    if (bool)
    {
      TbsDownloadConfig.getInstance(paramContext).setInstallInterruptCode(-507);
      i.lock();
    }
    label1754: 
    while (true)
    {
      int i3;
      int i4;
      int i5;
      Object localObject2;
      int i6;
      try
      {
        i3 = ai.a(paramContext).c("copy_core_ver");
        i4 = ai.a(paramContext).b();
        TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCoreInThread tbsCoreCopyVer =".concat(String.valueOf(i3)));
        TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCoreInThread tbsCoreInstallVer =".concat(String.valueOf(i4)));
        TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCoreInThread tbsCoreTargetVer =".concat(String.valueOf(paramInt)));
        if (((i4 > 0) && (paramInt > i4)) || ((i3 > 0) && (paramInt > i3)))
          p(paramContext);
        i4 = ai.a(paramContext).c();
        i5 = j(paramContext);
        TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCoreInThread installStatus1=".concat(String.valueOf(i4)));
        TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCoreInThread tbsCoreInstalledVer=".concat(String.valueOf(i5)));
        if ((i4 >= 0) && (i4 < 2))
        {
          TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCoreInThread -- retry.....", true);
          i5 = 1;
          TbsDownloadConfig.getInstance(paramContext).setInstallInterruptCode(-508);
          TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCoreInThread installStatus2=".concat(String.valueOf(i4)));
          if (i4 > 0)
            break label1754;
          TbsLog.i("TbsInstaller", "STEP 2/2 begin installation.....", true);
          TbsDownloadConfig.getInstance(paramContext).setInstallInterruptCode(-509);
          if (i5 == 0)
            continue;
          i3 = ai.a(paramContext).c("unzip_retry_num");
          if (i3 <= 10)
            continue;
          TbsLogReport.getInstance(paramContext).setInstallErrorCode(201, "exceed unzip retry num!");
          F(paramContext);
          TbsDownloadConfig.getInstance(paramContext).setInstallInterruptCode(-510);
          i.unlock();
          j.unlock();
          b();
          AppMethodBeat.o(64415);
          break;
        }
        i3 = i4;
        if (i4 == 3)
        {
          i3 = i4;
          if (i5 > 0)
            if (paramInt <= i5)
            {
              i3 = i4;
              if (paramInt != 88888888);
            }
            else
            {
              i3 = -1;
              p(paramContext);
              TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCoreInThread -- update TBS.....", true);
            }
        }
        i5 = 0;
        i4 = i3;
        continue;
        ai.a(paramContext).b(i3 + 1);
        if (paramString == null)
        {
          localObject2 = ai.a(paramContext).d("install_apk_path");
          localObject1 = localObject2;
          if (localObject2 != null)
            continue;
          TbsLogReport.getInstance(paramContext).setInstallErrorCode(202, "apk path is null!");
          TbsDownloadConfig.getInstance(paramContext).setInstallInterruptCode(-511);
          i.unlock();
          j.unlock();
          b();
          AppMethodBeat.o(64415);
          break;
        }
        localObject1 = paramString;
        TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCoreInThread apkPath =".concat(String.valueOf(localObject1)));
        i6 = c(paramContext, (String)localObject1);
        if (i6 == 0)
        {
          TbsDownloadConfig.getInstance(paramContext).setInstallInterruptCode(-512);
          TbsLogReport.getInstance(paramContext).setInstallErrorCode(203, "apk version is 0!");
          i.unlock();
          j.unlock();
          b();
          AppMethodBeat.o(64415);
          break;
        }
        ai.a(paramContext).a("install_apk_path", (String)localObject1);
        ai.a(paramContext).b(i6, 0);
        TbsDownloadConfig.getInstance(paramContext).setInstallInterruptCode(-548);
        if (TbsDownloadConfig.getInstance(paramContext).mPreferences.getInt("tbs_downloaddecouplecore", 0) == 1)
        {
          localObject2 = new java/io/File;
          ((File)localObject2).<init>((String)localObject1);
          if (a(paramContext, (File)localObject2, true))
            continue;
          TbsLogReport.getInstance(paramContext).setInstallErrorCode(207, "unzipTbsApk failed", TbsLogReport.EventType.TYPE_INSTALL_DECOUPLE);
          i.unlock();
          j.unlock();
          b();
          AppMethodBeat.o(64415);
          break;
        }
        localObject2 = new java/io/File;
        ((File)localObject2).<init>((String)localObject1);
        if (!a(paramContext, (File)localObject2))
        {
          TbsLogReport.getInstance(paramContext).setInstallErrorCode(207, "unzipTbsApk failed");
          i.unlock();
          j.unlock();
          b();
          AppMethodBeat.o(64415);
          break;
        }
        if (i5 != 0)
        {
          i3 = ai.a(paramContext).b("unlzma_status");
          if (i3 > 5)
          {
            TbsLogReport.getInstance(paramContext).setInstallErrorCode(223, "exceed unlzma retry num!");
            TbsDownloadConfig.getInstance(paramContext).setInstallInterruptCode(-553);
            F(paramContext);
            ag.c(paramContext);
            TbsDownloadConfig.getInstance(paramContext).a.put("tbs_needdownload", Boolean.TRUE);
            TbsDownloadConfig.getInstance(paramContext).a.put("request_full_package", Boolean.TRUE);
            TbsDownloadConfig.getInstance(paramContext).commit();
            i.unlock();
            j.unlock();
            b();
            AppMethodBeat.o(64415);
            break;
          }
          ai.a(paramContext).d(i3 + 1);
        }
        TbsLog.i("TbsInstaller", "unlzma begin");
        i3 = TbsDownloadConfig.getInstance().mPreferences.getInt("tbs_responsecode", 0);
        if (j(paramContext) == 0)
          break label1647;
        localObject1 = QbSdk.a(paramContext, "can_unlzma", null);
        if ((localObject1 == null) || (!(localObject1 instanceof Boolean)))
          break label2290;
        bool = ((Boolean)localObject1).booleanValue();
        if (!bool)
          break label1647;
        localObject1 = new android/os/Bundle;
        ((Bundle)localObject1).<init>();
        ((Bundle)localObject1).putInt("responseCode", i3);
        if (TbsDownloadConfig.getInstance(paramContext).mPreferences.getInt("tbs_downloaddecouplecore", 0) == 1)
        {
          ((Bundle)localObject1).putString("unzip_temp_path", q(paramContext).getAbsolutePath());
          localObject1 = QbSdk.a(paramContext, "unlzma", (Bundle)localObject1);
          if (localObject1 != null)
            break label1504;
          TbsLog.i("TbsInstaller", "unlzma return null");
          TbsLogReport.getInstance(paramContext).setInstallErrorCode(222, "unlzma is null");
          i3 = i2;
          if (i3 != 0)
            break label1647;
          i.unlock();
          j.unlock();
          b();
          AppMethodBeat.o(64415);
          break;
        }
        ((Bundle)localObject1).putString("unzip_temp_path", u(paramContext).getAbsolutePath());
        continue;
      }
      finally
      {
        i.unlock();
        j.unlock();
        b();
        AppMethodBeat.o(64415);
      }
      label1504: if ((localObject1 instanceof Boolean))
      {
        if (((Boolean)localObject1).booleanValue())
        {
          TbsLog.i("TbsInstaller", "unlzma success");
          i3 = 1;
        }
        else
        {
          TbsLog.i("TbsInstaller", "unlzma return false");
          TbsLogReport.getInstance(paramContext).setInstallErrorCode(222, "unlzma return false");
          i3 = i2;
        }
      }
      else if ((localObject1 instanceof Bundle))
      {
        i3 = 1;
      }
      else
      {
        i3 = i2;
        if ((localObject1 instanceof Throwable))
        {
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>("unlzma failure because Throwable");
          TbsLog.i("TbsInstaller", Log.getStackTraceString((Throwable)localObject1));
          TbsLogReport.getInstance(paramContext).setInstallErrorCode(222, (Throwable)localObject1);
          i3 = i2;
          continue;
          label1647: TbsLog.i("TbsInstaller", "unlzma finished");
          ai.a(paramContext).b(i6, 1);
          i3 = i6;
          while (true)
            if (i4 < 2)
            {
              if (i5 != 0)
              {
                i4 = ai.a(paramContext).c("dexopt_retry_num");
                if (i4 > 10)
                {
                  TbsLogReport.getInstance(paramContext).setInstallErrorCode(208, "exceed dexopt retry num!");
                  TbsDownloadConfig.getInstance(paramContext).setInstallInterruptCode(-514);
                  F(paramContext);
                  i.unlock();
                  j.unlock();
                  b();
                  AppMethodBeat.o(64415);
                  break;
                  if (TbsDownloadConfig.getInstance(paramContext).mPreferences.getInt("tbs_downloaddecouplecore", 0) == 1)
                  {
                    if (paramString == null)
                    {
                      localObject2 = ai.a(paramContext).d("install_apk_path");
                      localObject1 = localObject2;
                      if (localObject2 != null)
                        break label1852;
                      TbsLogReport.getInstance(paramContext).setInstallErrorCode(202, "apk path is null!");
                      TbsDownloadConfig.getInstance(paramContext).setInstallInterruptCode(-511);
                      i.unlock();
                      j.unlock();
                      b();
                      AppMethodBeat.o(64415);
                      break;
                    }
                    localObject1 = paramString;
                    localObject2 = new java/io/File;
                    ((File)localObject2).<init>((String)localObject1);
                    a(paramContext, (File)localObject2, true);
                  }
                  i3 = 0;
                  continue;
                }
                ai.a(paramContext).a(i4 + 1);
              }
              TbsDownloadConfig.getInstance(paramContext).setInstallInterruptCode(-549);
              if (!f(paramContext, 0))
              {
                TbsDownloadConfig.getInstance(paramContext).setInstallInterruptCode(-515);
                i.unlock();
                j.unlock();
                b();
                AppMethodBeat.o(64415);
                break;
              }
              ai.a(paramContext).b(i3, 2);
              TbsLog.i("TbsInstaller", "STEP 2/2 installation completed! you can restart!", true);
              TbsLog.i("TbsInstaller", "STEP 2/2 installation completed! you can restart! version:".concat(String.valueOf(paramInt)));
              TbsDownloadConfig.getInstance(paramContext).setInstallInterruptCode(-516);
              if (Build.VERSION.SDK_INT >= 11)
                localObject1 = paramContext.getSharedPreferences("tbs_preloadx5_check_cfg_file", 4);
            }
          while (true)
          {
            try
            {
              localObject1 = ((SharedPreferences)localObject1).edit();
              ((SharedPreferences.Editor)localObject1).putInt("tbs_preload_x5_counter", 0);
              ((SharedPreferences.Editor)localObject1).putInt("tbs_preload_x5_recorder", 0);
              ((SharedPreferences.Editor)localObject1).putInt("tbs_preload_x5_version", paramInt);
              ((SharedPreferences.Editor)localObject1).commit();
              TbsDownloadConfig.getInstance(paramContext).setInstallInterruptCode(-517);
              if (paramInt == 88888888)
                a(paramInt, paramString, paramContext);
              if (this.k)
              {
                paramString = TbsLogReport.getInstance(paramContext);
                paramInt = i1;
                if (ai.a(paramContext).d() == 1)
                  paramInt = 221;
                paramString.setInstallErrorCode(paramInt, "continueInstallWithout core success");
                i.unlock();
                j.unlock();
                b();
                AppMethodBeat.o(64415);
                break;
                localObject1 = paramContext.getSharedPreferences("tbs_preloadx5_check_cfg_file", 0);
                continue;
              }
            }
            catch (Throwable localThrowable)
            {
              localObject1 = new java/lang/StringBuilder;
              ((StringBuilder)localObject1).<init>("Init tbs_preload_x5_counter#1 exception:");
              TbsLog.e("TbsInstaller", Log.getStackTraceString(localThrowable));
              TbsDownloadConfig.getInstance(paramContext).setInstallInterruptCode(-518);
              continue;
              paramString = TbsLogReport.getInstance(paramContext);
              if (ai.a(paramContext).d() != 1);
            }
            for (paramInt = 221; ; paramInt = 200)
            {
              paramString.setInstallErrorCode(paramInt, "success");
              break;
            }
            if (i4 == 2)
              QbSdk.m.onInstallFinish(200);
          }
          TbsDownloadConfig.getInstance(paramContext).setInstallInterruptCode(-519);
          b();
          AppMethodBeat.o(64415);
          break;
          label2290: bool = false;
        }
      }
    }
  }

  private boolean b(Context paramContext, File paramFile)
  {
    boolean bool1 = false;
    AppMethodBeat.i(64470);
    try
    {
      localObject = new com/tencent/smtt/sdk/av;
      ((av)localObject).<init>(this);
      localObject = paramFile.listFiles((FileFilter)localObject);
      i1 = localObject.length;
      if ((Build.VERSION.SDK_INT < 16) && (paramContext.getPackageName() != null))
      {
        boolean bool2 = paramContext.getPackageName().equalsIgnoreCase("com.tencent.tbs");
        if (!bool2);
      }
    }
    catch (Exception paramFile)
    {
      try
      {
        Object localObject;
        int i1;
        Thread.sleep(5000L);
        label70: ClassLoader localClassLoader = paramContext.getClassLoader();
        for (int i2 = 0; i2 < i1; i2++)
        {
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("jarFile: ");
          TbsLog.i("TbsInstaller", localObject[i2].getAbsolutePath());
          new DexClassLoader(localObject[i2].getAbsolutePath(), paramFile.getAbsolutePath(), null, localClassLoader);
        }
        bool1 = true;
        AppMethodBeat.o(64470);
        while (true)
        {
          return bool1;
          paramFile = paramFile;
          TbsLogReport.getInstance(paramContext).setInstallErrorCode(209, paramFile.toString());
          TbsLog.i("TbsInstaller", "TbsInstaller-doTbsDexOpt done");
          AppMethodBeat.o(64470);
        }
      }
      catch (Exception localException)
      {
        break label70;
      }
    }
  }

  private boolean c(Context paramContext, File paramFile)
  {
    boolean bool = false;
    AppMethodBeat.i(64471);
    try
    {
      Object localObject1 = new java/io/File;
      ((File)localObject1).<init>(paramFile, "tbs_sdk_extension_dex.jar");
      Object localObject2 = new java/io/File;
      ((File)localObject2).<init>(paramFile, "tbs_sdk_extension_dex.dex");
      Object localObject3 = paramContext.getClassLoader();
      new DexClassLoader(((File)localObject1).getAbsolutePath(), paramFile.getAbsolutePath(), null, (ClassLoader)localObject3);
      localObject2 = g.a(paramContext, ((File)localObject2).getAbsolutePath());
      if (TextUtils.isEmpty((CharSequence)localObject2))
      {
        TbsLogReport.getInstance(paramContext).setInstallErrorCode(226, "can not find oat command");
        AppMethodBeat.o(64471);
      }
      while (true)
      {
        return bool;
        localObject1 = new com/tencent/smtt/sdk/aw;
        ((aw)localObject1).<init>(this);
        for (localObject1 : paramFile.listFiles((FileFilter)localObject1))
        {
          localObject1 = ((File)localObject1).getName().substring(0, ((File)localObject1).getName().length() - 4);
          String str = ((String)localObject2).replaceAll("tbs_sdk_extension_dex", (String)localObject1);
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>("/system/bin/dex2oat ");
          localObject1 = str + " --dex-location=" + a().r(paramContext) + File.separator + (String)localObject1 + ".jar";
          Runtime.getRuntime().exec((String)localObject1).waitFor();
        }
        bool = true;
        AppMethodBeat.o(64471);
      }
    }
    catch (Exception paramFile)
    {
      while (true)
      {
        TbsLogReport.getInstance(paramContext).setInstallErrorCode(226, paramFile);
        AppMethodBeat.o(64471);
      }
    }
  }

  // ERROR //
  private boolean c(Context paramContext, boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: iconst_1
    //   3: istore 4
    //   5: aload_0
    //   6: monitorenter
    //   7: ldc_w 1097
    //   10: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   13: ldc 139
    //   15: ldc_w 1099
    //   18: invokestatic 146	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   21: aload_0
    //   22: aload_1
    //   23: invokevirtual 516	com/tencent/smtt/sdk/an:x	(Landroid/content/Context;)Z
    //   26: istore 5
    //   28: iload 5
    //   30: ifne +15 -> 45
    //   33: ldc_w 1097
    //   36: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   39: iload_3
    //   40: istore_2
    //   41: aload_0
    //   42: monitorexit
    //   43: iload_2
    //   44: ireturn
    //   45: getstatic 49	com/tencent/smtt/sdk/an:i	Ljava/util/concurrent/locks/ReentrantLock;
    //   48: invokevirtual 1100	java/util/concurrent/locks/ReentrantLock:tryLock	()Z
    //   51: istore_3
    //   52: ldc 139
    //   54: ldc_w 1102
    //   57: iload_3
    //   58: invokestatic 526	java/lang/String:valueOf	(Z)Ljava/lang/String;
    //   61: invokevirtual 496	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   64: invokestatic 146	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   67: iload_3
    //   68: ifeq +229 -> 297
    //   71: aload_1
    //   72: invokestatic 174	com/tencent/smtt/sdk/ai:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/ai;
    //   75: ldc_w 536
    //   78: invokevirtual 538	com/tencent/smtt/sdk/ai:b	(Ljava/lang/String;)I
    //   81: istore 6
    //   83: aload_0
    //   84: iconst_0
    //   85: aload_1
    //   86: invokevirtual 1105	com/tencent/smtt/sdk/an:a	(ZLandroid/content/Context;)I
    //   89: istore 7
    //   91: ldc 139
    //   93: ldc_w 1107
    //   96: iload 6
    //   98: invokestatic 492	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   101: invokevirtual 496	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   104: invokestatic 146	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   107: ldc 139
    //   109: ldc_w 1109
    //   112: iload 7
    //   114: invokestatic 492	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   117: invokevirtual 496	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   120: invokestatic 146	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   123: iload 6
    //   125: iconst_1
    //   126: if_icmpne +166 -> 292
    //   129: iload 7
    //   131: ifne +50 -> 181
    //   134: ldc 139
    //   136: ldc_w 1111
    //   139: iconst_1
    //   140: invokestatic 385	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;Z)V
    //   143: aload_0
    //   144: aload_1
    //   145: invokespecial 1113	com/tencent/smtt/sdk/an:B	(Landroid/content/Context;)V
    //   148: iload 4
    //   150: istore_2
    //   151: iload_2
    //   152: istore 4
    //   154: getstatic 49	com/tencent/smtt/sdk/an:i	Ljava/util/concurrent/locks/ReentrantLock;
    //   157: invokevirtual 549	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   160: iload_2
    //   161: istore 4
    //   163: aload_0
    //   164: invokevirtual 552	com/tencent/smtt/sdk/an:b	()V
    //   167: ldc_w 1097
    //   170: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   173: goto -132 -> 41
    //   176: astore_1
    //   177: aload_0
    //   178: monitorexit
    //   179: aload_1
    //   180: athrow
    //   181: iload_2
    //   182: ifeq +110 -> 292
    //   185: ldc 139
    //   187: ldc_w 1115
    //   190: iconst_1
    //   191: invokestatic 385	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;Z)V
    //   194: aload_0
    //   195: aload_1
    //   196: invokespecial 1113	com/tencent/smtt/sdk/an:B	(Landroid/content/Context;)V
    //   199: iload 4
    //   201: istore_2
    //   202: goto -51 -> 151
    //   205: astore 8
    //   207: getstatic 49	com/tencent/smtt/sdk/an:i	Ljava/util/concurrent/locks/ReentrantLock;
    //   210: invokevirtual 549	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   213: ldc_w 1097
    //   216: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   219: aload 8
    //   221: athrow
    //   222: astore 8
    //   224: iconst_0
    //   225: istore 4
    //   227: aload_1
    //   228: invokestatic 249	com/tencent/smtt/sdk/TbsLogReport:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsLogReport;
    //   231: sipush 215
    //   234: aload 8
    //   236: invokevirtual 259	java/lang/Throwable:toString	()Ljava/lang/String;
    //   239: invokevirtual 268	com/tencent/smtt/sdk/TbsLogReport:setInstallErrorCode	(ILjava/lang/String;)V
    //   242: new 251	java/lang/StringBuilder
    //   245: astore 9
    //   247: aload 9
    //   249: ldc_w 1117
    //   252: invokespecial 255	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   255: aload_1
    //   256: aload 9
    //   258: aload 8
    //   260: invokestatic 718	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   263: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   266: invokevirtual 264	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   269: invokestatic 368	com/tencent/smtt/sdk/QbSdk:a	(Landroid/content/Context;Ljava/lang/String;)V
    //   272: iload 4
    //   274: istore_2
    //   275: goto -108 -> 167
    //   278: astore_1
    //   279: ldc_w 1097
    //   282: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   285: aload_1
    //   286: athrow
    //   287: astore 8
    //   289: goto -62 -> 227
    //   292: iconst_0
    //   293: istore_2
    //   294: goto -143 -> 151
    //   297: iconst_0
    //   298: istore_2
    //   299: goto -139 -> 160
    //
    // Exception table:
    //   from	to	target	type
    //   7	21	176	finally
    //   33	39	176	finally
    //   167	173	176	finally
    //   279	287	176	finally
    //   71	123	205	finally
    //   134	148	205	finally
    //   185	199	205	finally
    //   21	28	222	java/lang/Throwable
    //   45	67	222	java/lang/Throwable
    //   207	222	222	java/lang/Throwable
    //   21	28	278	finally
    //   45	67	278	finally
    //   154	160	278	finally
    //   163	167	278	finally
    //   207	222	278	finally
    //   227	272	278	finally
    //   154	160	287	java/lang/Throwable
    //   163	167	287	java/lang/Throwable
  }

  // ERROR //
  private boolean d(Context paramContext, boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: iconst_0
    //   3: istore 4
    //   5: aload_0
    //   6: monitorenter
    //   7: ldc_w 1118
    //   10: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   13: aload_1
    //   14: ifnull +35 -> 49
    //   17: ldc_w 324
    //   20: aload_1
    //   21: invokevirtual 330	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   24: invokevirtual 334	android/content/Context:getApplicationInfo	()Landroid/content/pm/ApplicationInfo;
    //   27: getfield 340	android/content/pm/ApplicationInfo:packageName	Ljava/lang/String;
    //   30: invokevirtual 346	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   33: ifeq +16 -> 49
    //   36: aload_1
    //   37: invokestatic 249	com/tencent/smtt/sdk/TbsLogReport:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsLogReport;
    //   40: sipush 229
    //   43: ldc_w 348
    //   46: invokevirtual 268	com/tencent/smtt/sdk/TbsLogReport:setInstallErrorCode	(ILjava/lang/String;)V
    //   49: ldc 139
    //   51: ldc_w 1120
    //   54: iload_2
    //   55: invokestatic 526	java/lang/String:valueOf	(Z)Ljava/lang/String;
    //   58: invokevirtual 496	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   61: invokestatic 146	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   64: ldc 139
    //   66: ldc_w 1122
    //   69: invokestatic 146	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   72: aload_0
    //   73: aload_1
    //   74: invokevirtual 516	com/tencent/smtt/sdk/an:x	(Landroid/content/Context;)Z
    //   77: istore 5
    //   79: iload 5
    //   81: ifne +16 -> 97
    //   84: ldc_w 1118
    //   87: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   90: iload 4
    //   92: istore_2
    //   93: aload_0
    //   94: monitorexit
    //   95: iload_2
    //   96: ireturn
    //   97: ldc 139
    //   99: ldc_w 1124
    //   102: invokestatic 146	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   105: getstatic 49	com/tencent/smtt/sdk/an:i	Ljava/util/concurrent/locks/ReentrantLock;
    //   108: invokevirtual 1100	java/util/concurrent/locks/ReentrantLock:tryLock	()Z
    //   111: istore 4
    //   113: ldc 139
    //   115: ldc_w 1126
    //   118: iload 4
    //   120: invokestatic 526	java/lang/String:valueOf	(Z)Ljava/lang/String;
    //   123: invokevirtual 496	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   126: invokestatic 146	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   129: iload 4
    //   131: ifeq +173 -> 304
    //   134: aload_1
    //   135: invokestatic 174	com/tencent/smtt/sdk/ai:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/ai;
    //   138: invokevirtual 868	com/tencent/smtt/sdk/ai:c	()I
    //   141: istore 6
    //   143: ldc 139
    //   145: ldc_w 1128
    //   148: iload 6
    //   150: invokestatic 492	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   153: invokevirtual 496	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   156: invokestatic 146	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   159: aload_0
    //   160: iconst_0
    //   161: aload_1
    //   162: invokevirtual 1105	com/tencent/smtt/sdk/an:a	(ZLandroid/content/Context;)I
    //   165: istore 7
    //   167: iload 6
    //   169: iconst_2
    //   170: if_icmpne +129 -> 299
    //   173: ldc 139
    //   175: ldc_w 1130
    //   178: invokestatic 146	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   181: iload 7
    //   183: ifne +47 -> 230
    //   186: ldc 139
    //   188: ldc_w 1132
    //   191: iconst_0
    //   192: invokestatic 385	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;Z)V
    //   195: aload_0
    //   196: aload_1
    //   197: invokespecial 1134	com/tencent/smtt/sdk/an:A	(Landroid/content/Context;)V
    //   200: iload_3
    //   201: istore_2
    //   202: iload_2
    //   203: istore_3
    //   204: getstatic 49	com/tencent/smtt/sdk/an:i	Ljava/util/concurrent/locks/ReentrantLock;
    //   207: invokevirtual 549	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   210: iload_2
    //   211: istore_3
    //   212: aload_0
    //   213: invokevirtual 552	com/tencent/smtt/sdk/an:b	()V
    //   216: ldc_w 1118
    //   219: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   222: goto -129 -> 93
    //   225: astore_1
    //   226: aload_0
    //   227: monitorexit
    //   228: aload_1
    //   229: athrow
    //   230: iload_2
    //   231: ifeq +68 -> 299
    //   234: ldc 139
    //   236: ldc_w 1136
    //   239: iconst_0
    //   240: invokestatic 385	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;Z)V
    //   243: aload_0
    //   244: aload_1
    //   245: invokespecial 1134	com/tencent/smtt/sdk/an:A	(Landroid/content/Context;)V
    //   248: iload_3
    //   249: istore_2
    //   250: goto -48 -> 202
    //   253: astore 8
    //   255: getstatic 49	com/tencent/smtt/sdk/an:i	Ljava/util/concurrent/locks/ReentrantLock;
    //   258: invokevirtual 549	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   261: ldc_w 1118
    //   264: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   267: aload 8
    //   269: athrow
    //   270: astore 8
    //   272: iconst_0
    //   273: istore_3
    //   274: aload_1
    //   275: ldc_w 1138
    //   278: aload 8
    //   280: invokestatic 831	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   283: invokevirtual 496	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   286: invokestatic 368	com/tencent/smtt/sdk/QbSdk:a	(Landroid/content/Context;Ljava/lang/String;)V
    //   289: iload_3
    //   290: istore_2
    //   291: goto -75 -> 216
    //   294: astore 8
    //   296: goto -22 -> 274
    //   299: iconst_0
    //   300: istore_2
    //   301: goto -99 -> 202
    //   304: iconst_0
    //   305: istore_2
    //   306: goto -96 -> 210
    //
    // Exception table:
    //   from	to	target	type
    //   7	13	225	finally
    //   17	49	225	finally
    //   49	72	225	finally
    //   72	79	225	finally
    //   84	90	225	finally
    //   97	129	225	finally
    //   204	210	225	finally
    //   212	216	225	finally
    //   216	222	225	finally
    //   255	270	225	finally
    //   274	289	225	finally
    //   134	167	253	finally
    //   173	181	253	finally
    //   186	200	253	finally
    //   234	248	253	finally
    //   72	79	270	java/lang/Exception
    //   97	129	270	java/lang/Exception
    //   255	270	270	java/lang/Exception
    //   204	210	294	java/lang/Exception
    //   212	216	294	java/lang/Exception
  }

  private boolean e(Context paramContext, String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(64428);
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramString, 0);
      if (paramContext != null)
      {
        bool = true;
        AppMethodBeat.o(64428);
        return bool;
      }
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      while (true)
      {
        paramContext = null;
        continue;
        AppMethodBeat.o(64428);
      }
    }
  }

  private boolean e(Context paramContext, boolean paramBoolean)
  {
    return false;
  }

  private void f(Context paramContext, boolean paramBoolean)
  {
    AppMethodBeat.i(64420);
    if (paramContext == null)
    {
      TbsLogReport.getInstance(paramContext).setInstallErrorCode(225, "setTmpFolderCoreToRead context is null");
      AppMethodBeat.o(64420);
    }
    while (true)
    {
      return;
      File localFile2;
      try
      {
        File localFile1 = paramContext.getDir("tbs", 0);
        localFile2 = new java/io/File;
        localFile2.<init>(localFile1, "tmp_folder_core_to_read.conf");
        if (!paramBoolean)
          break label133;
        if (localFile2.exists())
          break label138;
        localFile2.createNewFile();
        AppMethodBeat.o(64420);
      }
      catch (Exception localException)
      {
        TbsLogReport.getInstance(paramContext).setInstallErrorCode(225, "setTmpFolderCoreToRead Exception message is " + localException.getMessage() + " Exception cause is " + localException.getCause());
        AppMethodBeat.o(64420);
      }
      continue;
      label133: k.b(localFile2);
      label138: AppMethodBeat.o(64420);
    }
  }

  private boolean f(Context paramContext, int paramInt)
  {
    boolean bool1 = true;
    int i1 = 0;
    AppMethodBeat.i(64435);
    TbsLog.i("TbsInstaller", "TbsInstaller-doTbsDexOpt start - dirMode: ".concat(String.valueOf(paramInt)));
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    case 2:
    }
    try
    {
      TbsLog.e("TbsInstaller", "doDexoptOrDexoat mode error: ".concat(String.valueOf(paramInt)));
      AppMethodBeat.o(64435);
      bool1 = false;
      while (true)
      {
        return bool1;
        paramInt = TbsDownloadConfig.getInstance(paramContext).mPreferences.getInt("tbs_downloaddecouplecore", 0);
        if (paramInt == 1)
        {
          AppMethodBeat.o(64435);
        }
        else
        {
          File localFile = u(paramContext);
          label115: boolean bool2;
          try
          {
            String str = System.getProperty("java.vm.version");
            if (str != null)
            {
              bool2 = str.startsWith("2");
              if (!bool2);
            }
            for (paramInt = 1; ; paramInt = 0)
            {
              if (Build.VERSION.SDK_INT != 23)
                break label279;
              i2 = 1;
              bool2 = TbsDownloadConfig.getInstance(paramContext).mPreferences.getBoolean("tbs_stop_preoat", false);
              int i3 = i1;
              if (paramInt != 0)
              {
                i3 = i1;
                if (i2 != 0)
                {
                  i3 = i1;
                  if (!bool2)
                    i3 = 1;
                }
              }
              if ((i3 == 0) || (!c(paramContext, localFile)))
                break label285;
              TbsLog.i("TbsInstaller", "doTbsDexOpt -- doDexoatForArtVm");
              AppMethodBeat.o(64435);
              break;
              localFile = w(paramContext);
              break label115;
              localFile = r(paramContext);
              break label115;
            }
          }
          catch (Throwable localThrowable)
          {
            while (true)
            {
              TbsLogReport.getInstance(paramContext).setInstallErrorCode(226, localThrowable);
              paramInt = 0;
              continue;
              label279: int i2 = 0;
            }
          }
          label285: if (paramInt != 0)
          {
            TbsLog.i("TbsInstaller", "doTbsDexOpt -- is ART mode, skip!");
            TbsLog.i("TbsInstaller", "TbsInstaller-doTbsDexOpt done");
            AppMethodBeat.o(64435);
          }
          else
          {
            TbsLog.i("TbsInstaller", "doTbsDexOpt -- doDexoptForDavlikVM");
            bool2 = b(paramContext, localFile);
            bool1 = bool2;
            AppMethodBeat.o(64435);
          }
        }
      }
    }
    catch (Exception localException)
    {
      while (true)
        TbsLogReport.getInstance(paramContext).setInstallErrorCode(209, localException.toString());
    }
  }

  static File t(Context paramContext)
  {
    AppMethodBeat.i(64463);
    paramContext = new File(paramContext.getDir("tbs", 0), "core_private");
    if ((!paramContext.isDirectory()) && (!paramContext.mkdir()))
    {
      paramContext = null;
      AppMethodBeat.o(64463);
    }
    while (true)
    {
      return paramContext;
      AppMethodBeat.o(64463);
    }
  }

  private static boolean y(Context paramContext)
  {
    boolean bool = true;
    AppMethodBeat.i(64419);
    if (paramContext == null)
    {
      TbsLog.i("TbsInstaller", "TbsInstaller-getTmpFolderCoreToRead, #1");
      AppMethodBeat.o(64419);
    }
    while (true)
    {
      return bool;
      try
      {
        paramContext = paramContext.getDir("tbs", 0);
        File localFile = new java/io/File;
        localFile.<init>(paramContext, "tmp_folder_core_to_read.conf");
        if (localFile.exists())
        {
          TbsLog.i("TbsInstaller", "TbsInstaller-getTmpFolderCoreToRead, #2");
          AppMethodBeat.o(64419);
        }
        else
        {
          TbsLog.i("TbsInstaller", "TbsInstaller-getTmpFolderCoreToRead, #3");
          AppMethodBeat.o(64419);
          bool = false;
        }
      }
      catch (Exception paramContext)
      {
        TbsLog.i("TbsInstaller", "TbsInstaller-getTmpFolderCoreToRead, #4");
        AppMethodBeat.o(64419);
      }
    }
  }

  private boolean z(Context paramContext)
  {
    boolean bool1 = true;
    AppMethodBeat.i(64441);
    TbsLog.i("TbsInstaller", "Tbsinstaller getTbsCoreRenameFileLock #1 ");
    try
    {
      bool2 = TbsDownloadConfig.getInstance().getTbsCoreLoadRenameFileLockEnable();
      TbsLog.i("TbsInstaller", "Tbsinstaller getTbsCoreRenameFileLock #2  enabled is ".concat(String.valueOf(bool2)));
      if (!bool2)
      {
        l = bv.a().a(paramContext);
        if (l != null)
          break label93;
        TbsLog.i("TbsInstaller", "getTbsCoreRenameFileLock## failed!");
        bool2 = false;
        AppMethodBeat.o(64441);
        return bool2;
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        boolean bool2 = true;
        continue;
        l = k.f(paramContext);
        continue;
        label93: TbsLog.i("TbsInstaller", "Tbsinstaller getTbsCoreRenameFileLock true ");
        AppMethodBeat.o(64441);
        bool2 = bool1;
      }
    }
  }

  // ERROR //
  int a(String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: ldc_w 1231
    //   5: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_1
    //   9: ifnonnull +11 -> 20
    //   12: ldc_w 1231
    //   15: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   18: iload_2
    //   19: ireturn
    //   20: aconst_null
    //   21: astore_3
    //   22: new 318	java/io/File
    //   25: astore 4
    //   27: aload 4
    //   29: aload_1
    //   30: invokespecial 375	java/io/File:<init>	(Ljava/lang/String;)V
    //   33: new 318	java/io/File
    //   36: astore_1
    //   37: aload_1
    //   38: aload 4
    //   40: ldc_w 401
    //   43: invokespecial 396	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   46: aload_1
    //   47: invokevirtual 622	java/io/File:exists	()Z
    //   50: istore 5
    //   52: iload 5
    //   54: ifne +24 -> 78
    //   57: iconst_0
    //   58: ifeq +11 -> 69
    //   61: new 1233	java/lang/NullPointerException
    //   64: dup
    //   65: invokespecial 1234	java/lang/NullPointerException:<init>	()V
    //   68: athrow
    //   69: ldc_w 1231
    //   72: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   75: goto -57 -> 18
    //   78: new 403	java/util/Properties
    //   81: astore 6
    //   83: aload 6
    //   85: invokespecial 404	java/util/Properties:<init>	()V
    //   88: new 406	java/io/FileInputStream
    //   91: astore 4
    //   93: aload 4
    //   95: aload_1
    //   96: invokespecial 409	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   99: new 411	java/io/BufferedInputStream
    //   102: astore_1
    //   103: aload_1
    //   104: aload 4
    //   106: invokespecial 414	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   109: aload 6
    //   111: aload_1
    //   112: invokevirtual 417	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   115: aload_1
    //   116: invokevirtual 443	java/io/BufferedInputStream:close	()V
    //   119: aload 6
    //   121: ldc_w 1236
    //   124: invokevirtual 1237	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   127: astore_3
    //   128: aload_3
    //   129: ifnonnull +20 -> 149
    //   132: aload_1
    //   133: ifnull +7 -> 140
    //   136: aload_1
    //   137: invokevirtual 443	java/io/BufferedInputStream:close	()V
    //   140: ldc_w 1231
    //   143: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   146: goto -128 -> 18
    //   149: aload_3
    //   150: invokestatic 1240	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   153: istore 7
    //   155: iload 7
    //   157: istore_2
    //   158: aload_1
    //   159: ifnull +7 -> 166
    //   162: aload_1
    //   163: invokevirtual 443	java/io/BufferedInputStream:close	()V
    //   166: ldc_w 1231
    //   169: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   172: goto -154 -> 18
    //   175: astore_1
    //   176: aconst_null
    //   177: astore_1
    //   178: aload_1
    //   179: ifnull +7 -> 186
    //   182: aload_1
    //   183: invokevirtual 443	java/io/BufferedInputStream:close	()V
    //   186: ldc_w 1231
    //   189: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   192: goto -174 -> 18
    //   195: astore_1
    //   196: aload_3
    //   197: ifnull +7 -> 204
    //   200: aload_3
    //   201: invokevirtual 443	java/io/BufferedInputStream:close	()V
    //   204: ldc_w 1231
    //   207: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   210: aload_1
    //   211: athrow
    //   212: astore_1
    //   213: goto -27 -> 186
    //   216: astore_3
    //   217: goto -13 -> 204
    //   220: astore_1
    //   221: goto -152 -> 69
    //   224: astore_1
    //   225: goto -85 -> 140
    //   228: astore_1
    //   229: goto -63 -> 166
    //   232: astore 4
    //   234: aload_1
    //   235: astore_3
    //   236: aload 4
    //   238: astore_1
    //   239: goto -43 -> 196
    //   242: astore_3
    //   243: goto -65 -> 178
    //
    // Exception table:
    //   from	to	target	type
    //   22	52	175	java/lang/Exception
    //   78	109	175	java/lang/Exception
    //   22	52	195	finally
    //   78	109	195	finally
    //   182	186	212	java/io/IOException
    //   200	204	216	java/io/IOException
    //   61	69	220	java/io/IOException
    //   136	140	224	java/io/IOException
    //   162	166	228	java/io/IOException
    //   109	128	232	finally
    //   149	155	232	finally
    //   109	128	242	java/lang/Exception
    //   149	155	242	java/lang/Exception
  }

  public int a(boolean paramBoolean, Context paramContext)
  {
    AppMethodBeat.i(64407);
    if ((paramBoolean) || (((Integer)a.get()).intValue() <= 0))
      a.set(Integer.valueOf(j(paramContext)));
    int i1 = ((Integer)a.get()).intValue();
    AppMethodBeat.o(64407);
    return i1;
  }

  public void a(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(64417);
    f(paramContext, true);
    ai.a(paramContext).b(paramInt, 2);
    AppMethodBeat.o(64417);
  }

  void a(Context paramContext, Bundle paramBundle)
  {
    AppMethodBeat.i(64424);
    if ((paramBundle == null) || (paramContext == null))
      AppMethodBeat.o(64424);
    while (true)
    {
      return;
      Message localMessage = new Message();
      localMessage.what = 3;
      localMessage.obj = new Object[] { paramContext, paramBundle };
      m.sendMessage(localMessage);
      AppMethodBeat.o(64424);
    }
  }

  void a(Context paramContext, String paramString, int paramInt)
  {
    AppMethodBeat.i(64414);
    TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCore tbsApkPath=".concat(String.valueOf(paramString)));
    TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCore tbsCoreTargetVer=".concat(String.valueOf(paramInt)));
    TbsLog.i("TbsInstaller", "TbsInstaller-continueInstallTbsCore currentProcessName=" + paramContext.getApplicationInfo().processName);
    TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCore currentProcessId=" + android.os.Process.myPid());
    TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCore currentThreadName=" + Thread.currentThread().getName());
    Message localMessage = new Message();
    localMessage.what = 1;
    localMessage.obj = new Object[] { paramContext, paramString, Integer.valueOf(paramInt) };
    m.sendMessage(localMessage);
    AppMethodBeat.o(64414);
  }

  void a(Context paramContext, boolean paramBoolean)
  {
    int i1 = 0;
    AppMethodBeat.i(64410);
    if (paramBoolean)
      this.k = true;
    TbsLog.i("TbsInstaller", "TbsInstaller-continueInstallTbsCore currentProcessName=" + paramContext.getApplicationInfo().processName);
    TbsLog.i("TbsInstaller", "TbsInstaller-continueInstallTbsCore currentProcessId=" + android.os.Process.myPid());
    TbsLog.i("TbsInstaller", "TbsInstaller-continueInstallTbsCore currentThreadName=" + Thread.currentThread().getName());
    if (!x(paramContext))
    {
      AppMethodBeat.o(64410);
      return;
    }
    String str = null;
    if (i.tryLock());
    while (true)
    {
      int i6;
      try
      {
        i2 = ai.a(paramContext).c();
        i3 = ai.a(paramContext).b();
        str = ai.a(paramContext).d("install_apk_path");
        i4 = ai.a(paramContext).c("copy_core_ver");
        i5 = ai.a(paramContext).b("copy_status");
        i.unlock();
        b();
        TbsLog.i("TbsInstaller", "TbsInstaller-continueInstallTbsCore installStatus=".concat(String.valueOf(i2)));
        TbsLog.i("TbsInstaller", "TbsInstaller-continueInstallTbsCore tbsCoreInstallVer=".concat(String.valueOf(i3)));
        TbsLog.i("TbsInstaller", "TbsInstaller-continueInstallTbsCore tbsApkPath=".concat(String.valueOf(str)));
        TbsLog.i("TbsInstaller", "TbsInstaller-continueInstallTbsCore tbsCoreCopyVer=".concat(String.valueOf(i4)));
        TbsLog.i("TbsInstaller", "TbsInstaller-continueInstallTbsCore copyStatus=".concat(String.valueOf(i5)));
        if (TbsShareManager.isThirdPartyApp(paramContext))
        {
          c(paramContext, TbsShareManager.a(paramContext, false));
          AppMethodBeat.o(64410);
        }
      }
      finally
      {
        i.unlock();
        AppMethodBeat.o(64410);
      }
      if ((i6 == 2) || (i6 == 4))
        i1 = 1;
      if ((i1 == 0) && (i6 != 0))
      {
        Bundle localBundle = new Bundle();
        localBundle.putInt("operation", 10001);
        a(paramContext, localBundle);
      }
      if ((i2 >= 0) && (i2 < 2))
        a(paramContext, str, i3);
      if (i5 == 0)
        b(paramContext, i4);
      AppMethodBeat.o(64410);
      break;
      int i4 = 0;
      int i5 = -1;
      int i3 = 0;
      int i2 = -1;
    }
  }

  public boolean a(Context paramContext1, Context paramContext2)
  {
    try
    {
      AppMethodBeat.i(64436);
      TbsLog.i("TbsInstaller", "TbsInstaller--quickDexOptForThirdPartyApp");
      if (p == true)
        AppMethodBeat.o(64436);
      while (true)
      {
        return true;
        p = true;
        ar localar = new com/tencent/smtt/sdk/ar;
        localar.<init>(this, paramContext2, paramContext1);
        localar.start();
        AppMethodBeat.o(64436);
      }
    }
    finally
    {
    }
    throw paramContext1;
  }

  public boolean a(Context paramContext, File paramFile, int paramInt)
  {
    AppMethodBeat.i(64430);
    TbsLog.i("TbsInstaller", "unzipTbsCoreToThirdAppTmpInThread #1");
    boolean bool = a(paramContext, paramFile, false);
    TbsLog.i("TbsInstaller", "unzipTbsCoreToThirdAppTmpInThread result is ".concat(String.valueOf(bool)));
    if (bool)
      a().a(paramContext, paramInt);
    AppMethodBeat.o(64430);
    return bool;
  }

  Context b(Context paramContext, String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(64429);
    try
    {
      if (paramContext.getPackageName() != paramString)
      {
        boolean bool = TbsPVConfig.getInstance(paramContext).isEnableNoCoreGray();
        if (bool)
        {
          AppMethodBeat.o(64429);
          paramContext = localObject;
        }
      }
      while (true)
      {
        return paramContext;
        paramContext = paramContext.createPackageContext(paramString, 2);
        AppMethodBeat.o(64429);
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        AppMethodBeat.o(64429);
        paramContext = localObject;
      }
    }
  }

  File b(Context paramContext1, Context paramContext2)
  {
    AppMethodBeat.i(64459);
    paramContext2 = new File(paramContext2.getDir("tbs", 0), "core_share");
    if ((!paramContext2.isDirectory()) && ((paramContext1 == null) || (!TbsShareManager.isThirdPartyApp(paramContext1))) && (!paramContext2.mkdir()))
    {
      paramContext1 = null;
      AppMethodBeat.o(64459);
    }
    while (true)
    {
      return paramContext1;
      AppMethodBeat.o(64459);
      paramContext1 = paramContext2;
    }
  }

  void b()
  {
    try
    {
      AppMethodBeat.i(64469);
      int i1 = this.e;
      this.e = (i1 - 1);
      if ((i1 > 1) || (!this.h))
      {
        TbsLog.i("TbsInstaller", "releaseTbsInstallingFileLock with skip");
        AppMethodBeat.o(64469);
      }
      while (true)
      {
        return;
        TbsLog.i("TbsInstaller", "releaseTbsInstallingFileLock without skip");
        k.a(this.f, this.g);
        this.h = false;
        AppMethodBeat.o(64469);
      }
    }
    finally
    {
    }
  }

  public void b(Context paramContext)
  {
    AppMethodBeat.i(64416);
    f(paramContext, true);
    ai.a(paramContext).b(i(paramContext), 2);
    AppMethodBeat.o(64416);
  }

  // ERROR //
  void b(Context paramContext, Bundle paramBundle)
  {
    // Byte code:
    //   0: ldc_w 1357
    //   3: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: aload_1
    //   8: invokevirtual 487	com/tencent/smtt/sdk/an:c	(Landroid/content/Context;)Z
    //   11: ifeq +20 -> 31
    //   14: aload_1
    //   15: invokestatic 201	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   18: sipush -539
    //   21: invokevirtual 485	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   24: ldc_w 1357
    //   27: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   30: return
    //   31: ldc 139
    //   33: ldc_w 1359
    //   36: invokestatic 146	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   39: aload_2
    //   40: ifnull +7 -> 47
    //   43: aload_1
    //   44: ifnonnull +12 -> 56
    //   47: ldc_w 1357
    //   50: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   53: goto -23 -> 30
    //   56: aload_1
    //   57: invokestatic 566	com/tencent/smtt/utils/k:b	(Landroid/content/Context;)Z
    //   60: ifne +73 -> 133
    //   63: invokestatic 571	com/tencent/smtt/utils/y:a	()J
    //   66: lstore_3
    //   67: aload_1
    //   68: invokestatic 201	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   71: invokevirtual 574	com/tencent/smtt/sdk/TbsDownloadConfig:getDownloadMinFreeSpace	()J
    //   74: lstore 5
    //   76: aload_1
    //   77: invokestatic 249	com/tencent/smtt/sdk/TbsLogReport:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsLogReport;
    //   80: sipush 210
    //   83: new 251	java/lang/StringBuilder
    //   86: dup
    //   87: ldc_w 1361
    //   90: invokespecial 255	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   93: lload_3
    //   94: invokevirtual 579	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   97: ldc_w 581
    //   100: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   103: lload 5
    //   105: invokevirtual 579	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   108: invokevirtual 264	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   111: invokevirtual 268	com/tencent/smtt/sdk/TbsLogReport:setInstallErrorCode	(ILjava/lang/String;)V
    //   114: aload_1
    //   115: invokestatic 201	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   118: sipush -540
    //   121: invokevirtual 485	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   124: ldc_w 1357
    //   127: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   130: goto -100 -> 30
    //   133: aload_0
    //   134: aload_1
    //   135: invokevirtual 516	com/tencent/smtt/sdk/an:x	(Landroid/content/Context;)Z
    //   138: ifne +22 -> 160
    //   141: aload_1
    //   142: invokestatic 201	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   145: sipush -541
    //   148: invokevirtual 485	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   151: ldc_w 1357
    //   154: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   157: goto -127 -> 30
    //   160: getstatic 51	com/tencent/smtt/sdk/an:j	Ljava/util/concurrent/locks/Lock;
    //   163: invokeinterface 521 1 0
    //   168: istore 7
    //   170: ldc 139
    //   172: ldc_w 1363
    //   175: iload 7
    //   177: invokestatic 526	java/lang/String:valueOf	(Z)Ljava/lang/String;
    //   180: invokevirtual 496	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   183: invokestatic 146	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   186: iload 7
    //   188: ifeq +1221 -> 1409
    //   191: aconst_null
    //   192: astore 8
    //   194: aconst_null
    //   195: astore 9
    //   197: aconst_null
    //   198: astore 10
    //   200: aload 8
    //   202: astore 11
    //   204: aload 9
    //   206: astore 12
    //   208: iconst_1
    //   209: invokestatic 1367	com/tencent/smtt/sdk/QbSdk:setTBSInstallingStatus	(Z)V
    //   212: aload 8
    //   214: astore 11
    //   216: aload 9
    //   218: astore 12
    //   220: aload_0
    //   221: aload_1
    //   222: invokevirtual 221	com/tencent/smtt/sdk/an:j	(Landroid/content/Context;)I
    //   225: ifle +22 -> 247
    //   228: aload 8
    //   230: astore 11
    //   232: aload 9
    //   234: astore 12
    //   236: aload_1
    //   237: invokestatic 174	com/tencent/smtt/sdk/ai:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/ai;
    //   240: invokevirtual 1000	com/tencent/smtt/sdk/ai:d	()I
    //   243: iconst_1
    //   244: if_icmpne +48 -> 292
    //   247: aload 8
    //   249: astore 11
    //   251: aload 9
    //   253: astore 12
    //   255: iconst_0
    //   256: invokestatic 1367	com/tencent/smtt/sdk/QbSdk:setTBSInstallingStatus	(Z)V
    //   259: getstatic 51	com/tencent/smtt/sdk/an:j	Ljava/util/concurrent/locks/Lock;
    //   262: invokeinterface 550 1 0
    //   267: aload_0
    //   268: invokevirtual 552	com/tencent/smtt/sdk/an:b	()V
    //   271: ldc 139
    //   273: ldc_w 1369
    //   276: invokestatic 146	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   279: iconst_0
    //   280: invokestatic 1367	com/tencent/smtt/sdk/QbSdk:setTBSInstallingStatus	(Z)V
    //   283: ldc_w 1357
    //   286: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   289: goto -259 -> 30
    //   292: aload 8
    //   294: astore 11
    //   296: aload 9
    //   298: astore 12
    //   300: aload_1
    //   301: invokestatic 201	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   304: getfield 205	com/tencent/smtt/sdk/TbsDownloadConfig:mPreferences	Landroid/content/SharedPreferences;
    //   307: ldc_w 948
    //   310: iconst_0
    //   311: invokeinterface 213 3 0
    //   316: istore 13
    //   318: iload 13
    //   320: iconst_1
    //   321: if_icmpeq +15 -> 336
    //   324: iload 13
    //   326: iconst_2
    //   327: if_icmpeq +9 -> 336
    //   330: iload 13
    //   332: iconst_4
    //   333: if_icmpne +372 -> 705
    //   336: iconst_1
    //   337: istore 14
    //   339: iload 14
    //   341: ifne +1290 -> 1631
    //   344: iload 13
    //   346: ifeq +1285 -> 1631
    //   349: aload 8
    //   351: astore 11
    //   353: aload 9
    //   355: astore 12
    //   357: aload_1
    //   358: invokestatic 174	com/tencent/smtt/sdk/ai:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/ai;
    //   361: ldc 182
    //   363: invokevirtual 534	com/tencent/smtt/sdk/ai:c	(Ljava/lang/String;)I
    //   366: istore 14
    //   368: iload 14
    //   370: iconst_5
    //   371: if_icmple +340 -> 711
    //   374: aload 8
    //   376: astore 11
    //   378: aload 9
    //   380: astore 12
    //   382: ldc 139
    //   384: ldc_w 1371
    //   387: invokestatic 146	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   390: aload 8
    //   392: astore 11
    //   394: aload 9
    //   396: astore 12
    //   398: aload_2
    //   399: ldc_w 1373
    //   402: invokevirtual 1376	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   405: astore 15
    //   407: aload 8
    //   409: astore 11
    //   411: aload 9
    //   413: astore 12
    //   415: aload_2
    //   416: ldc_w 1378
    //   419: invokevirtual 1376	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   422: astore 10
    //   424: aload 8
    //   426: astore 11
    //   428: aload 9
    //   430: astore 12
    //   432: aload_2
    //   433: ldc_w 1380
    //   436: invokevirtual 1376	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   439: astore_2
    //   440: aload 8
    //   442: astore 11
    //   444: aload 9
    //   446: astore 12
    //   448: aload 15
    //   450: invokestatic 1054	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   453: ifne +44 -> 497
    //   456: aload 8
    //   458: astore 11
    //   460: aload 9
    //   462: astore 12
    //   464: new 318	java/io/File
    //   467: astore 16
    //   469: aload 8
    //   471: astore 11
    //   473: aload 9
    //   475: astore 12
    //   477: aload 16
    //   479: aload 15
    //   481: invokespecial 375	java/io/File:<init>	(Ljava/lang/String;)V
    //   484: aload 8
    //   486: astore 11
    //   488: aload 9
    //   490: astore 12
    //   492: aload 16
    //   494: invokestatic 765	com/tencent/smtt/utils/k:b	(Ljava/io/File;)V
    //   497: aload 8
    //   499: astore 11
    //   501: aload 9
    //   503: astore 12
    //   505: aload 10
    //   507: invokestatic 1054	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   510: ifne +44 -> 554
    //   513: aload 8
    //   515: astore 11
    //   517: aload 9
    //   519: astore 12
    //   521: new 318	java/io/File
    //   524: astore 15
    //   526: aload 8
    //   528: astore 11
    //   530: aload 9
    //   532: astore 12
    //   534: aload 15
    //   536: aload 10
    //   538: invokespecial 375	java/io/File:<init>	(Ljava/lang/String;)V
    //   541: aload 8
    //   543: astore 11
    //   545: aload 9
    //   547: astore 12
    //   549: aload 15
    //   551: invokestatic 765	com/tencent/smtt/utils/k:b	(Ljava/io/File;)V
    //   554: aload 8
    //   556: astore 11
    //   558: aload 9
    //   560: astore 12
    //   562: aload_2
    //   563: invokestatic 1054	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   566: ifne +43 -> 609
    //   569: aload 8
    //   571: astore 11
    //   573: aload 9
    //   575: astore 12
    //   577: new 318	java/io/File
    //   580: astore 10
    //   582: aload 8
    //   584: astore 11
    //   586: aload 9
    //   588: astore 12
    //   590: aload 10
    //   592: aload_2
    //   593: invokespecial 375	java/io/File:<init>	(Ljava/lang/String;)V
    //   596: aload 8
    //   598: astore 11
    //   600: aload 9
    //   602: astore 12
    //   604: aload 10
    //   606: invokestatic 765	com/tencent/smtt/utils/k:b	(Ljava/io/File;)V
    //   609: aload 8
    //   611: astore 11
    //   613: aload 9
    //   615: astore 12
    //   617: aload_1
    //   618: invokestatic 201	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   621: getfield 923	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   624: ldc_w 925
    //   627: getstatic 931	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   630: invokeinterface 937 3 0
    //   635: pop
    //   636: aload 8
    //   638: astore 11
    //   640: aload 9
    //   642: astore 12
    //   644: aload_1
    //   645: invokestatic 201	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   648: invokevirtual 941	com/tencent/smtt/sdk/TbsDownloadConfig:commit	()V
    //   651: aload 8
    //   653: astore 11
    //   655: aload 9
    //   657: astore 12
    //   659: aload_1
    //   660: invokestatic 249	com/tencent/smtt/sdk/TbsLogReport:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsLogReport;
    //   663: sipush 224
    //   666: ldc_w 1382
    //   669: invokevirtual 268	com/tencent/smtt/sdk/TbsLogReport:setInstallErrorCode	(ILjava/lang/String;)V
    //   672: getstatic 51	com/tencent/smtt/sdk/an:j	Ljava/util/concurrent/locks/Lock;
    //   675: invokeinterface 550 1 0
    //   680: aload_0
    //   681: invokevirtual 552	com/tencent/smtt/sdk/an:b	()V
    //   684: ldc 139
    //   686: ldc_w 1369
    //   689: invokestatic 146	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   692: iconst_0
    //   693: invokestatic 1367	com/tencent/smtt/sdk/QbSdk:setTBSInstallingStatus	(Z)V
    //   696: ldc_w 1357
    //   699: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   702: goto -672 -> 30
    //   705: iconst_0
    //   706: istore 14
    //   708: goto -369 -> 339
    //   711: aload 8
    //   713: astore 11
    //   715: aload 9
    //   717: astore 12
    //   719: aload_1
    //   720: invokestatic 174	com/tencent/smtt/sdk/ai:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/ai;
    //   723: ldc 182
    //   725: iload 14
    //   727: iconst_1
    //   728: iadd
    //   729: invokevirtual 185	com/tencent/smtt/sdk/ai:a	(Ljava/lang/String;I)V
    //   732: aload 8
    //   734: astore 11
    //   736: aload 9
    //   738: astore 12
    //   740: aload_1
    //   741: invokestatic 787	com/tencent/smtt/sdk/an:t	(Landroid/content/Context;)Ljava/io/File;
    //   744: astore 15
    //   746: aload 15
    //   748: ifnull +883 -> 1631
    //   751: aload 8
    //   753: astore 11
    //   755: aload 9
    //   757: astore 12
    //   759: new 318	java/io/File
    //   762: astore 16
    //   764: aload 8
    //   766: astore 11
    //   768: aload 9
    //   770: astore 12
    //   772: aload 16
    //   774: aload 15
    //   776: ldc_w 789
    //   779: invokespecial 396	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   782: aload 8
    //   784: astore 11
    //   786: aload 9
    //   788: astore 12
    //   790: aload 16
    //   792: invokevirtual 622	java/io/File:exists	()Z
    //   795: ifeq +836 -> 1631
    //   798: aload 8
    //   800: astore 11
    //   802: aload 9
    //   804: astore 12
    //   806: aload_1
    //   807: invokestatic 201	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   810: sipush -550
    //   813: invokevirtual 485	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   816: aload 8
    //   818: astore 11
    //   820: aload 9
    //   822: astore 12
    //   824: aload_1
    //   825: aload_2
    //   826: invokestatic 1385	com/tencent/smtt/sdk/QbSdk:a	(Landroid/content/Context;Landroid/os/Bundle;)Landroid/os/Bundle;
    //   829: astore 8
    //   831: aload 8
    //   833: ifnonnull +174 -> 1007
    //   836: aload 8
    //   838: astore 12
    //   840: aload_1
    //   841: invokestatic 249	com/tencent/smtt/sdk/TbsLogReport:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsLogReport;
    //   844: astore 9
    //   846: aload 8
    //   848: astore 12
    //   850: new 251	java/lang/StringBuilder
    //   853: astore 11
    //   855: aload 8
    //   857: astore 12
    //   859: aload 11
    //   861: ldc_w 1387
    //   864: invokespecial 255	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   867: aload 8
    //   869: astore 12
    //   871: aload 9
    //   873: sipush 228
    //   876: aload 11
    //   878: aload_2
    //   879: ldc_w 1389
    //   882: invokevirtual 1391	android/os/Bundle:getInt	(Ljava/lang/String;)I
    //   885: invokevirtual 278	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   888: invokevirtual 264	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   891: invokevirtual 268	com/tencent/smtt/sdk/TbsLogReport:setInstallErrorCode	(ILjava/lang/String;)V
    //   894: iconst_1
    //   895: istore 14
    //   897: getstatic 51	com/tencent/smtt/sdk/an:j	Ljava/util/concurrent/locks/Lock;
    //   900: invokeinterface 550 1 0
    //   905: aload_0
    //   906: invokevirtual 552	com/tencent/smtt/sdk/an:b	()V
    //   909: iload 14
    //   911: ifne +606 -> 1517
    //   914: ldc 139
    //   916: ldc_w 1393
    //   919: invokestatic 146	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   922: aload_1
    //   923: invokestatic 174	com/tencent/smtt/sdk/ai:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/ai;
    //   926: ldc 182
    //   928: iconst_0
    //   929: invokevirtual 185	com/tencent/smtt/sdk/ai:a	(Ljava/lang/String;I)V
    //   932: aload_1
    //   933: invokestatic 201	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   936: sipush -544
    //   939: invokevirtual 485	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   942: aload_1
    //   943: invokestatic 174	com/tencent/smtt/sdk/ai:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/ai;
    //   946: iconst_0
    //   947: iconst_m1
    //   948: invokevirtual 188	com/tencent/smtt/sdk/ai:b	(II)V
    //   951: aload_1
    //   952: invokestatic 174	com/tencent/smtt/sdk/ai:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/ai;
    //   955: iconst_1
    //   956: invokevirtual 195	com/tencent/smtt/sdk/ai:c	(I)V
    //   959: aload 8
    //   961: ldc_w 1395
    //   964: invokevirtual 1376	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   967: astore_2
    //   968: new 318	java/io/File
    //   971: dup
    //   972: aload_2
    //   973: invokespecial 375	java/io/File:<init>	(Ljava/lang/String;)V
    //   976: aload_1
    //   977: invokestatic 681	com/tencent/smtt/sdk/ag:a	(Ljava/io/File;Landroid/content/Context;)V
    //   980: aload_0
    //   981: aload_1
    //   982: aload_2
    //   983: aload 8
    //   985: ldc_w 1397
    //   988: invokevirtual 1391	android/os/Bundle:getInt	(Ljava/lang/String;)I
    //   991: invokespecial 750	com/tencent/smtt/sdk/an:b	(Landroid/content/Context;Ljava/lang/String;I)V
    //   994: iconst_0
    //   995: invokestatic 1367	com/tencent/smtt/sdk/QbSdk:setTBSInstallingStatus	(Z)V
    //   998: ldc_w 1357
    //   1001: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1004: goto -974 -> 30
    //   1007: aload 8
    //   1009: astore 11
    //   1011: aload 8
    //   1013: astore 12
    //   1015: aload 8
    //   1017: ldc_w 1399
    //   1020: invokevirtual 1391	android/os/Bundle:getInt	(Ljava/lang/String;)I
    //   1023: istore 14
    //   1025: iload 14
    //   1027: istore 13
    //   1029: aload 8
    //   1031: astore 12
    //   1033: aload_1
    //   1034: invokestatic 249	com/tencent/smtt/sdk/TbsLogReport:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsLogReport;
    //   1037: astore 9
    //   1039: iload 14
    //   1041: istore 13
    //   1043: aload 8
    //   1045: astore 12
    //   1047: new 251	java/lang/StringBuilder
    //   1050: astore 11
    //   1052: iload 14
    //   1054: istore 13
    //   1056: aload 8
    //   1058: astore 12
    //   1060: aload 11
    //   1062: ldc_w 1401
    //   1065: invokespecial 255	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1068: iload 14
    //   1070: istore 13
    //   1072: aload 8
    //   1074: astore 12
    //   1076: aload 9
    //   1078: sipush 228
    //   1081: aload 11
    //   1083: iload 14
    //   1085: invokevirtual 278	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1088: ldc_w 1403
    //   1091: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1094: aload_2
    //   1095: ldc_w 1389
    //   1098: invokevirtual 1391	android/os/Bundle:getInt	(Ljava/lang/String;)I
    //   1101: invokevirtual 278	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1104: invokevirtual 264	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1107: invokevirtual 268	com/tencent/smtt/sdk/TbsLogReport:setInstallErrorCode	(ILjava/lang/String;)V
    //   1110: goto -213 -> 897
    //   1113: astore_2
    //   1114: iload 14
    //   1116: istore 13
    //   1118: aload 8
    //   1120: astore 12
    //   1122: new 251	java/lang/StringBuilder
    //   1125: astore 11
    //   1127: iload 14
    //   1129: istore 13
    //   1131: aload 8
    //   1133: astore 12
    //   1135: aload 11
    //   1137: ldc_w 1405
    //   1140: invokespecial 255	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1143: iload 14
    //   1145: istore 13
    //   1147: aload 8
    //   1149: astore 12
    //   1151: ldc 139
    //   1153: aload 11
    //   1155: aload_2
    //   1156: invokestatic 718	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   1159: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1162: invokevirtual 264	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1165: invokestatic 146	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1168: aload 8
    //   1170: astore 12
    //   1172: aload_1
    //   1173: invokestatic 201	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   1176: sipush -543
    //   1179: invokevirtual 485	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   1182: aload 8
    //   1184: astore 12
    //   1186: aload_1
    //   1187: invokestatic 249	com/tencent/smtt/sdk/TbsLogReport:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsLogReport;
    //   1190: sipush 218
    //   1193: aload_2
    //   1194: invokevirtual 298	java/lang/Exception:toString	()Ljava/lang/String;
    //   1197: invokevirtual 268	com/tencent/smtt/sdk/TbsLogReport:setInstallErrorCode	(ILjava/lang/String;)V
    //   1200: getstatic 51	com/tencent/smtt/sdk/an:j	Ljava/util/concurrent/locks/Lock;
    //   1203: invokeinterface 550 1 0
    //   1208: aload_0
    //   1209: invokevirtual 552	com/tencent/smtt/sdk/an:b	()V
    //   1212: aload_1
    //   1213: invokestatic 201	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   1216: sipush -546
    //   1219: invokevirtual 485	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   1222: ldc 139
    //   1224: ldc_w 1407
    //   1227: invokestatic 146	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1230: aload_1
    //   1231: invokestatic 201	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   1234: getfield 923	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   1237: ldc_w 925
    //   1240: getstatic 931	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   1243: invokeinterface 937 3 0
    //   1248: pop
    //   1249: aload_1
    //   1250: invokestatic 201	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   1253: invokevirtual 941	com/tencent/smtt/sdk/TbsDownloadConfig:commit	()V
    //   1256: aload_1
    //   1257: invokestatic 249	com/tencent/smtt/sdk/TbsLogReport:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsLogReport;
    //   1260: sipush 217
    //   1263: ldc_w 1409
    //   1266: iconst_1
    //   1267: invokestatic 492	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   1270: invokevirtual 496	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   1273: invokevirtual 268	com/tencent/smtt/sdk/TbsLogReport:setInstallErrorCode	(ILjava/lang/String;)V
    //   1276: iconst_0
    //   1277: invokestatic 1367	com/tencent/smtt/sdk/QbSdk:setTBSInstallingStatus	(Z)V
    //   1280: ldc_w 1357
    //   1283: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1286: goto -1256 -> 30
    //   1289: astore_2
    //   1290: iconst_2
    //   1291: istore 13
    //   1293: aload 11
    //   1295: astore 12
    //   1297: getstatic 51	com/tencent/smtt/sdk/an:j	Ljava/util/concurrent/locks/Lock;
    //   1300: invokeinterface 550 1 0
    //   1305: aload_0
    //   1306: invokevirtual 552	com/tencent/smtt/sdk/an:b	()V
    //   1309: iload 13
    //   1311: ifne +121 -> 1432
    //   1314: ldc 139
    //   1316: ldc_w 1393
    //   1319: invokestatic 146	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1322: aload_1
    //   1323: invokestatic 174	com/tencent/smtt/sdk/ai:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/ai;
    //   1326: ldc 182
    //   1328: iconst_0
    //   1329: invokevirtual 185	com/tencent/smtt/sdk/ai:a	(Ljava/lang/String;I)V
    //   1332: aload_1
    //   1333: invokestatic 201	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   1336: sipush -544
    //   1339: invokevirtual 485	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   1342: aload_1
    //   1343: invokestatic 174	com/tencent/smtt/sdk/ai:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/ai;
    //   1346: iconst_0
    //   1347: iconst_m1
    //   1348: invokevirtual 188	com/tencent/smtt/sdk/ai:b	(II)V
    //   1351: aload_1
    //   1352: invokestatic 174	com/tencent/smtt/sdk/ai:a	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/ai;
    //   1355: iconst_1
    //   1356: invokevirtual 195	com/tencent/smtt/sdk/ai:c	(I)V
    //   1359: aload 12
    //   1361: ldc_w 1395
    //   1364: invokevirtual 1376	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   1367: astore 8
    //   1369: new 318	java/io/File
    //   1372: dup
    //   1373: aload 8
    //   1375: invokespecial 375	java/io/File:<init>	(Ljava/lang/String;)V
    //   1378: aload_1
    //   1379: invokestatic 681	com/tencent/smtt/sdk/ag:a	(Ljava/io/File;Landroid/content/Context;)V
    //   1382: aload_0
    //   1383: aload_1
    //   1384: aload 8
    //   1386: aload 12
    //   1388: ldc_w 1397
    //   1391: invokevirtual 1391	android/os/Bundle:getInt	(Ljava/lang/String;)I
    //   1394: invokespecial 750	com/tencent/smtt/sdk/an:b	(Landroid/content/Context;Ljava/lang/String;I)V
    //   1397: iconst_0
    //   1398: invokestatic 1367	com/tencent/smtt/sdk/QbSdk:setTBSInstallingStatus	(Z)V
    //   1401: ldc_w 1357
    //   1404: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1407: aload_2
    //   1408: athrow
    //   1409: aload_1
    //   1410: invokestatic 201	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   1413: sipush -547
    //   1416: invokevirtual 485	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   1419: aload_0
    //   1420: invokevirtual 552	com/tencent/smtt/sdk/an:b	()V
    //   1423: ldc_w 1357
    //   1426: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1429: goto -1399 -> 30
    //   1432: iload 13
    //   1434: iconst_2
    //   1435: if_icmpne +14 -> 1449
    //   1438: ldc 139
    //   1440: ldc_w 1369
    //   1443: invokestatic 146	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1446: goto -49 -> 1397
    //   1449: aload_1
    //   1450: invokestatic 201	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   1453: sipush -546
    //   1456: invokevirtual 485	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   1459: ldc 139
    //   1461: ldc_w 1407
    //   1464: invokestatic 146	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1467: aload_1
    //   1468: invokestatic 201	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   1471: getfield 923	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   1474: ldc_w 925
    //   1477: getstatic 931	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   1480: invokeinterface 937 3 0
    //   1485: pop
    //   1486: aload_1
    //   1487: invokestatic 201	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   1490: invokevirtual 941	com/tencent/smtt/sdk/TbsDownloadConfig:commit	()V
    //   1493: aload_1
    //   1494: invokestatic 249	com/tencent/smtt/sdk/TbsLogReport:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsLogReport;
    //   1497: sipush 217
    //   1500: ldc_w 1409
    //   1503: iload 13
    //   1505: invokestatic 492	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   1508: invokevirtual 496	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   1511: invokevirtual 268	com/tencent/smtt/sdk/TbsLogReport:setInstallErrorCode	(ILjava/lang/String;)V
    //   1514: goto -117 -> 1397
    //   1517: iload 14
    //   1519: iconst_2
    //   1520: if_icmpne +14 -> 1534
    //   1523: ldc 139
    //   1525: ldc_w 1369
    //   1528: invokestatic 146	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1531: goto -537 -> 994
    //   1534: aload_1
    //   1535: invokestatic 201	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   1538: sipush -546
    //   1541: invokevirtual 485	com/tencent/smtt/sdk/TbsDownloadConfig:setInstallInterruptCode	(I)V
    //   1544: ldc 139
    //   1546: ldc_w 1407
    //   1549: invokestatic 146	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1552: aload_1
    //   1553: invokestatic 201	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   1556: getfield 923	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   1559: ldc_w 925
    //   1562: getstatic 931	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   1565: invokeinterface 937 3 0
    //   1570: pop
    //   1571: aload_1
    //   1572: invokestatic 201	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   1575: invokevirtual 941	com/tencent/smtt/sdk/TbsDownloadConfig:commit	()V
    //   1578: aload_1
    //   1579: invokestatic 249	com/tencent/smtt/sdk/TbsLogReport:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsLogReport;
    //   1582: sipush 217
    //   1585: ldc_w 1409
    //   1588: iload 14
    //   1590: invokestatic 492	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   1593: invokevirtual 496	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   1596: invokevirtual 268	com/tencent/smtt/sdk/TbsLogReport:setInstallErrorCode	(ILjava/lang/String;)V
    //   1599: goto -605 -> 994
    //   1602: astore_2
    //   1603: iconst_1
    //   1604: istore 13
    //   1606: goto -309 -> 1297
    //   1609: astore_2
    //   1610: goto -313 -> 1297
    //   1613: astore_2
    //   1614: iconst_2
    //   1615: istore 14
    //   1617: aload 12
    //   1619: astore 8
    //   1621: goto -507 -> 1114
    //   1624: astore_2
    //   1625: iconst_1
    //   1626: istore 14
    //   1628: goto -514 -> 1114
    //   1631: iconst_2
    //   1632: istore 14
    //   1634: aload 10
    //   1636: astore 8
    //   1638: goto -741 -> 897
    //
    // Exception table:
    //   from	to	target	type
    //   1033	1039	1113	java/lang/Exception
    //   1047	1052	1113	java/lang/Exception
    //   1060	1068	1113	java/lang/Exception
    //   1076	1110	1113	java/lang/Exception
    //   208	212	1289	finally
    //   220	228	1289	finally
    //   236	247	1289	finally
    //   255	259	1289	finally
    //   300	318	1289	finally
    //   357	368	1289	finally
    //   382	390	1289	finally
    //   398	407	1289	finally
    //   415	424	1289	finally
    //   432	440	1289	finally
    //   448	456	1289	finally
    //   464	469	1289	finally
    //   477	484	1289	finally
    //   492	497	1289	finally
    //   505	513	1289	finally
    //   521	526	1289	finally
    //   534	541	1289	finally
    //   549	554	1289	finally
    //   562	569	1289	finally
    //   577	582	1289	finally
    //   590	596	1289	finally
    //   604	609	1289	finally
    //   617	636	1289	finally
    //   644	651	1289	finally
    //   659	672	1289	finally
    //   719	732	1289	finally
    //   740	746	1289	finally
    //   759	764	1289	finally
    //   772	782	1289	finally
    //   790	798	1289	finally
    //   806	816	1289	finally
    //   824	831	1289	finally
    //   1015	1025	1289	finally
    //   840	846	1602	finally
    //   850	855	1602	finally
    //   859	867	1602	finally
    //   871	894	1602	finally
    //   1172	1182	1602	finally
    //   1186	1200	1602	finally
    //   1033	1039	1609	finally
    //   1047	1052	1609	finally
    //   1060	1068	1609	finally
    //   1076	1110	1609	finally
    //   1122	1127	1609	finally
    //   1135	1143	1609	finally
    //   1151	1168	1609	finally
    //   208	212	1613	java/lang/Exception
    //   220	228	1613	java/lang/Exception
    //   236	247	1613	java/lang/Exception
    //   255	259	1613	java/lang/Exception
    //   300	318	1613	java/lang/Exception
    //   357	368	1613	java/lang/Exception
    //   382	390	1613	java/lang/Exception
    //   398	407	1613	java/lang/Exception
    //   415	424	1613	java/lang/Exception
    //   432	440	1613	java/lang/Exception
    //   448	456	1613	java/lang/Exception
    //   464	469	1613	java/lang/Exception
    //   477	484	1613	java/lang/Exception
    //   492	497	1613	java/lang/Exception
    //   505	513	1613	java/lang/Exception
    //   521	526	1613	java/lang/Exception
    //   534	541	1613	java/lang/Exception
    //   549	554	1613	java/lang/Exception
    //   562	569	1613	java/lang/Exception
    //   577	582	1613	java/lang/Exception
    //   590	596	1613	java/lang/Exception
    //   604	609	1613	java/lang/Exception
    //   617	636	1613	java/lang/Exception
    //   644	651	1613	java/lang/Exception
    //   659	672	1613	java/lang/Exception
    //   719	732	1613	java/lang/Exception
    //   740	746	1613	java/lang/Exception
    //   759	764	1613	java/lang/Exception
    //   772	782	1613	java/lang/Exception
    //   790	798	1613	java/lang/Exception
    //   806	816	1613	java/lang/Exception
    //   824	831	1613	java/lang/Exception
    //   1015	1025	1613	java/lang/Exception
    //   840	846	1624	java/lang/Exception
    //   850	855	1624	java/lang/Exception
    //   859	867	1624	java/lang/Exception
    //   871	894	1624	java/lang/Exception
  }

  void b(Context paramContext, boolean paramBoolean)
  {
    AppMethodBeat.i(64412);
    if (QbSdk.b)
      AppMethodBeat.o(64412);
    while (true)
    {
      return;
      if (Build.VERSION.SDK_INT < 8)
      {
        TbsLog.e("TbsInstaller", "android version < 2.1 no need install X5 core", true);
        AppMethodBeat.o(64412);
        continue;
      }
      try
      {
        if (!TbsShareManager.isThirdPartyApp(paramContext))
        {
          File localFile = v(paramContext);
          if ((localFile != null) && (localFile.exists()))
            k.a(localFile, false);
        }
        label74: TbsLog.i("TbsInstaller", "Tbsinstaller installTbsCoreIfNeeded #1 ");
        if (y(paramContext))
        {
          TbsLog.i("TbsInstaller", "Tbsinstaller installTbsCoreIfNeeded #2 ");
          if ((a(paramContext, "core_unzip_tmp")) && (d(paramContext, paramBoolean)))
          {
            TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCoreIfNeeded, enableTbsCoreFromUnzip!!", true);
            AppMethodBeat.o(64412);
            continue;
          }
          if ((a(paramContext, "core_share_backup_tmp")) && (e(paramContext, paramBoolean)))
          {
            TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCoreIfNeeded, enableTbsCoreFromBackup!!", true);
            AppMethodBeat.o(64412);
            continue;
          }
          if ((a(paramContext, "core_copy_tmp")) && (c(paramContext, paramBoolean)))
          {
            TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCoreIfNeeded, enableTbsCoreFromCopy!!", true);
            AppMethodBeat.o(64412);
            continue;
          }
          TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCoreIfNeeded, error !!", true);
          AppMethodBeat.o(64412);
          continue;
        }
        AppMethodBeat.o(64412);
      }
      catch (Throwable localThrowable)
      {
        break label74;
      }
    }
  }

  boolean b(Context paramContext, int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(64423);
    if (TbsDownloader.getOverSea(paramContext))
      AppMethodBeat.o(64423);
    while (true)
    {
      return bool;
      TbsLog.i("TbsInstaller", "TbsInstaller-installLocalTbsCore targetTbsCoreVer=".concat(String.valueOf(paramInt)));
      TbsLog.i("TbsInstaller", "TbsInstaller-continueInstallTbsCore currentProcessName=" + paramContext.getApplicationInfo().processName);
      TbsLog.i("TbsInstaller", "TbsInstaller-installLocalTbsCore currentProcessId=" + android.os.Process.myPid());
      TbsLog.i("TbsInstaller", "TbsInstaller-installLocalTbsCore currentThreadName=" + Thread.currentThread().getName());
      Context localContext = d(paramContext, paramInt);
      if (localContext != null)
      {
        Message localMessage = new Message();
        localMessage.what = 2;
        localMessage.obj = new Object[] { localContext, paramContext, Integer.valueOf(paramInt) };
        m.sendMessage(localMessage);
        AppMethodBeat.o(64423);
        bool = true;
      }
      else
      {
        TbsLog.i("TbsInstaller", "TbsInstaller--installLocalTbsCore copy from null");
        AppMethodBeat.o(64423);
      }
    }
  }

  int c(Context paramContext, String paramString)
  {
    int i1 = 0;
    AppMethodBeat.i(64439);
    paramContext = paramContext.getPackageManager().getPackageArchiveInfo(paramString, 0);
    if (paramContext != null)
    {
      i1 = paramContext.versionCode;
      AppMethodBeat.o(64439);
    }
    while (true)
    {
      return i1;
      AppMethodBeat.o(64439);
    }
  }

  void c(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(64426);
    TbsLog.i("TbsInstaller", "TbsInstaller-installTbsCoreForThirdPartyApp");
    if (paramInt <= 0)
      AppMethodBeat.o(64426);
    while (true)
    {
      return;
      int i1 = j(paramContext);
      if (i1 == paramInt)
      {
        AppMethodBeat.o(64426);
      }
      else
      {
        Context localContext = TbsShareManager.e(paramContext);
        if ((localContext != null) || (TbsShareManager.getHostCorePathAppDefined() != null))
        {
          TbsLog.i("TbsInstaller", "TbsInstaller--quickDexOptForThirdPartyApp hostContext != null");
          a(paramContext, localContext);
          AppMethodBeat.o(64426);
        }
        else
        {
          if (i1 <= 0)
          {
            TbsLog.i("TbsInstaller", "TbsInstaller--installTbsCoreForThirdPartyApp hostContext == null");
            QbSdk.a(paramContext, "TbsInstaller::installTbsCoreForThirdPartyApp forceSysWebViewInner #2");
          }
          AppMethodBeat.o(64426);
        }
      }
    }
  }

  // ERROR //
  boolean c(Context paramContext)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: iconst_0
    //   3: istore_3
    //   4: ldc_w 1470
    //   7: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   10: new 318	java/io/File
    //   13: dup
    //   14: aload_0
    //   15: aload_1
    //   16: invokevirtual 305	com/tencent/smtt/sdk/an:r	(Landroid/content/Context;)Ljava/io/File;
    //   19: ldc_w 401
    //   22: invokespecial 396	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   25: astore 4
    //   27: aload 4
    //   29: invokevirtual 622	java/io/File:exists	()Z
    //   32: ifne +11 -> 43
    //   35: ldc_w 1470
    //   38: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   41: iload_3
    //   42: ireturn
    //   43: new 403	java/util/Properties
    //   46: dup
    //   47: invokespecial 404	java/util/Properties:<init>	()V
    //   50: astore 5
    //   52: new 406	java/io/FileInputStream
    //   55: astore 6
    //   57: aload 6
    //   59: aload 4
    //   61: invokespecial 409	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   64: new 411	java/io/BufferedInputStream
    //   67: astore_1
    //   68: aload_1
    //   69: aload 6
    //   71: invokespecial 414	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   74: aload 5
    //   76: aload_1
    //   77: invokevirtual 417	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   80: aload 5
    //   82: ldc_w 427
    //   85: ldc_w 1472
    //   88: invokevirtual 649	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   91: invokestatic 1475	java/lang/Boolean:valueOf	(Ljava/lang/String;)Ljava/lang/Boolean;
    //   94: invokevirtual 956	java/lang/Boolean:booleanValue	()Z
    //   97: istore_3
    //   98: iload_3
    //   99: ifeq +173 -> 272
    //   102: invokestatic 602	java/lang/System:currentTimeMillis	()J
    //   105: aload 4
    //   107: invokevirtual 1478	java/io/File:lastModified	()J
    //   110: lsub
    //   111: ldc2_w 1479
    //   114: lcmp
    //   115: ifle +66 -> 181
    //   118: iconst_1
    //   119: istore 7
    //   121: new 251	java/lang/StringBuilder
    //   124: astore 5
    //   126: aload 5
    //   128: ldc_w 1482
    //   131: invokespecial 255	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   134: ldc 139
    //   136: aload 5
    //   138: iload_3
    //   139: invokevirtual 794	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   142: ldc_w 1484
    //   145: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   148: iload 7
    //   150: invokevirtual 794	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   153: invokevirtual 264	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   156: invokestatic 146	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   159: iload 7
    //   161: ifne +26 -> 187
    //   164: iload_3
    //   165: iload_2
    //   166: iand
    //   167: istore_3
    //   168: aload_1
    //   169: invokevirtual 443	java/io/BufferedInputStream:close	()V
    //   172: ldc_w 1470
    //   175: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   178: goto -137 -> 41
    //   181: iconst_0
    //   182: istore 7
    //   184: goto -63 -> 121
    //   187: iconst_0
    //   188: istore_2
    //   189: goto -25 -> 164
    //   192: astore_1
    //   193: aconst_null
    //   194: astore_1
    //   195: iconst_0
    //   196: istore 7
    //   198: iload 7
    //   200: istore_3
    //   201: aload_1
    //   202: ifnull -30 -> 172
    //   205: aload_1
    //   206: invokevirtual 443	java/io/BufferedInputStream:close	()V
    //   209: iload 7
    //   211: istore_3
    //   212: goto -40 -> 172
    //   215: astore_1
    //   216: iload 7
    //   218: istore_3
    //   219: goto -47 -> 172
    //   222: astore 5
    //   224: aconst_null
    //   225: astore_1
    //   226: aload_1
    //   227: ifnull +7 -> 234
    //   230: aload_1
    //   231: invokevirtual 443	java/io/BufferedInputStream:close	()V
    //   234: ldc_w 1470
    //   237: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   240: aload 5
    //   242: athrow
    //   243: astore_1
    //   244: goto -72 -> 172
    //   247: astore_1
    //   248: goto -14 -> 234
    //   251: astore 5
    //   253: goto -27 -> 226
    //   256: astore 5
    //   258: iconst_0
    //   259: istore 7
    //   261: goto -63 -> 198
    //   264: astore 5
    //   266: iload_3
    //   267: istore 7
    //   269: goto -71 -> 198
    //   272: iconst_0
    //   273: istore 7
    //   275: goto -154 -> 121
    //
    // Exception table:
    //   from	to	target	type
    //   52	74	192	java/lang/Throwable
    //   205	209	215	java/io/IOException
    //   52	74	222	finally
    //   168	172	243	java/io/IOException
    //   230	234	247	java/io/IOException
    //   74	98	251	finally
    //   102	118	251	finally
    //   121	159	251	finally
    //   74	98	256	java/lang/Throwable
    //   102	118	264	java/lang/Throwable
    //   121	159	264	java/lang/Throwable
  }

  public Context d(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(64438);
    TbsLog.i("TbsInstaller", "TbsInstaller--getTbsCoreHostContext tbsCoreTargetVer=".concat(String.valueOf(paramInt)));
    if (paramInt <= 0)
    {
      AppMethodBeat.o(64438);
      paramContext = null;
    }
    while (true)
    {
      return paramContext;
      String[] arrayOfString = TbsShareManager.getCoreProviderAppList();
      int i1 = 0;
      if (i1 < arrayOfString.length)
      {
        Context localContext;
        if ((!paramContext.getPackageName().equalsIgnoreCase(arrayOfString[i1])) && (e(paramContext, arrayOfString[i1])))
        {
          localContext = b(paramContext, arrayOfString[i1]);
          if (localContext != null)
          {
            if (f(localContext))
              break label137;
            TbsLog.e("TbsInstaller", "TbsInstaller--getTbsCoreHostContext " + arrayOfString[i1] + " illegal signature go on next");
          }
        }
        label137: int i2;
        do
        {
          i1++;
          break;
          i2 = j(localContext);
          TbsLog.i("TbsInstaller", "TbsInstaller-getTbsCoreHostContext hostTbsCoreVer=".concat(String.valueOf(i2)));
        }
        while ((i2 == 0) || (i2 != paramInt));
        TbsLog.i("TbsInstaller", "TbsInstaller-getTbsCoreHostContext targetApp=" + arrayOfString[i1]);
        AppMethodBeat.o(64438);
        paramContext = localContext;
      }
      else
      {
        AppMethodBeat.o(64438);
        paramContext = null;
      }
    }
  }

  // ERROR //
  public String d(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: ldc_w 1505
    //   5: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_2
    //   9: invokestatic 1054	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   12: ifeq +13 -> 25
    //   15: ldc_w 1505
    //   18: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   21: aload_3
    //   22: astore_2
    //   23: aload_2
    //   24: areturn
    //   25: aload_0
    //   26: aload_1
    //   27: invokevirtual 305	com/tencent/smtt/sdk/an:r	(Landroid/content/Context;)Ljava/io/File;
    //   30: astore 4
    //   32: new 318	java/io/File
    //   35: astore_1
    //   36: aload_1
    //   37: aload 4
    //   39: ldc_w 401
    //   42: invokespecial 396	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   45: aload_1
    //   46: invokevirtual 622	java/io/File:exists	()Z
    //   49: istore 5
    //   51: iload 5
    //   53: ifne +26 -> 79
    //   56: iconst_0
    //   57: ifeq +11 -> 68
    //   60: new 1233	java/lang/NullPointerException
    //   63: dup
    //   64: invokespecial 1234	java/lang/NullPointerException:<init>	()V
    //   67: athrow
    //   68: ldc_w 1505
    //   71: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   74: aload_3
    //   75: astore_2
    //   76: goto -53 -> 23
    //   79: new 403	java/util/Properties
    //   82: astore 6
    //   84: aload 6
    //   86: invokespecial 404	java/util/Properties:<init>	()V
    //   89: new 406	java/io/FileInputStream
    //   92: astore 4
    //   94: aload 4
    //   96: aload_1
    //   97: invokespecial 409	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   100: new 411	java/io/BufferedInputStream
    //   103: astore_1
    //   104: aload_1
    //   105: aload 4
    //   107: invokespecial 414	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   110: aload 6
    //   112: aload_1
    //   113: invokevirtual 417	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   116: aload_1
    //   117: invokevirtual 443	java/io/BufferedInputStream:close	()V
    //   120: aload 6
    //   122: aload_2
    //   123: invokevirtual 1237	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   126: astore_2
    //   127: aload_1
    //   128: ifnull +7 -> 135
    //   131: aload_1
    //   132: invokevirtual 443	java/io/BufferedInputStream:close	()V
    //   135: ldc_w 1505
    //   138: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   141: goto -118 -> 23
    //   144: astore_1
    //   145: aconst_null
    //   146: astore_1
    //   147: aload_1
    //   148: ifnull +7 -> 155
    //   151: aload_1
    //   152: invokevirtual 443	java/io/BufferedInputStream:close	()V
    //   155: ldc_w 1505
    //   158: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   161: aload_3
    //   162: astore_2
    //   163: goto -140 -> 23
    //   166: astore_1
    //   167: aconst_null
    //   168: astore_2
    //   169: aload_2
    //   170: ifnull +7 -> 177
    //   173: aload_2
    //   174: invokevirtual 443	java/io/BufferedInputStream:close	()V
    //   177: ldc_w 1505
    //   180: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   183: aload_1
    //   184: athrow
    //   185: astore_1
    //   186: goto -31 -> 155
    //   189: astore_2
    //   190: goto -13 -> 177
    //   193: astore_1
    //   194: goto -126 -> 68
    //   197: astore_1
    //   198: goto -63 -> 135
    //   201: astore_2
    //   202: aload_1
    //   203: astore_3
    //   204: aload_2
    //   205: astore_1
    //   206: aload_3
    //   207: astore_2
    //   208: goto -39 -> 169
    //   211: astore_2
    //   212: goto -65 -> 147
    //
    // Exception table:
    //   from	to	target	type
    //   25	51	144	java/lang/Exception
    //   79	110	144	java/lang/Exception
    //   25	51	166	finally
    //   79	110	166	finally
    //   151	155	185	java/io/IOException
    //   173	177	189	java/io/IOException
    //   60	68	193	java/io/IOException
    //   131	135	197	java/io/IOException
    //   110	127	201	finally
    //   110	127	211	java/lang/Exception
  }

  // ERROR //
  public void d(Context paramContext)
  {
    // Byte code:
    //   0: ldc_w 1506
    //   3: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: aload_1
    //   8: invokevirtual 305	com/tencent/smtt/sdk/an:r	(Landroid/content/Context;)Ljava/io/File;
    //   11: astore_2
    //   12: new 318	java/io/File
    //   15: astore_1
    //   16: aload_1
    //   17: aload_2
    //   18: ldc_w 401
    //   21: invokespecial 396	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   24: new 403	java/util/Properties
    //   27: astore_3
    //   28: aload_3
    //   29: invokespecial 404	java/util/Properties:<init>	()V
    //   32: new 406	java/io/FileInputStream
    //   35: astore 4
    //   37: aload 4
    //   39: aload_1
    //   40: invokespecial 409	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   43: new 411	java/io/BufferedInputStream
    //   46: astore_2
    //   47: aload_2
    //   48: aload 4
    //   50: invokespecial 414	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   53: aload_3
    //   54: aload_2
    //   55: invokevirtual 417	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   58: new 419	java/io/FileOutputStream
    //   61: astore 4
    //   63: aload 4
    //   65: aload_1
    //   66: invokespecial 420	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   69: new 422	java/io/BufferedOutputStream
    //   72: astore_1
    //   73: aload_1
    //   74: aload 4
    //   76: invokespecial 425	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   79: aload_3
    //   80: ldc_w 427
    //   83: ldc_w 1472
    //   86: invokevirtual 433	java/util/Properties:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //   89: pop
    //   90: aload_3
    //   91: aload_1
    //   92: aconst_null
    //   93: invokevirtual 437	java/util/Properties:store	(Ljava/io/OutputStream;Ljava/lang/String;)V
    //   96: aload_1
    //   97: invokevirtual 442	java/io/BufferedOutputStream:close	()V
    //   100: aload_2
    //   101: invokevirtual 443	java/io/BufferedInputStream:close	()V
    //   104: ldc_w 1506
    //   107: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   110: return
    //   111: astore_1
    //   112: ldc_w 1506
    //   115: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   118: goto -8 -> 110
    //   121: astore_1
    //   122: ldc_w 1506
    //   125: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   128: goto -18 -> 110
    //   131: astore_1
    //   132: aconst_null
    //   133: astore_1
    //   134: aconst_null
    //   135: astore_2
    //   136: aload_1
    //   137: ifnull +7 -> 144
    //   140: aload_1
    //   141: invokevirtual 442	java/io/BufferedOutputStream:close	()V
    //   144: aload_2
    //   145: ifnull +55 -> 200
    //   148: aload_2
    //   149: invokevirtual 443	java/io/BufferedInputStream:close	()V
    //   152: ldc_w 1506
    //   155: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   158: goto -48 -> 110
    //   161: astore_1
    //   162: ldc_w 1506
    //   165: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   168: goto -58 -> 110
    //   171: astore_1
    //   172: aconst_null
    //   173: astore_2
    //   174: aconst_null
    //   175: astore_3
    //   176: aload_2
    //   177: ifnull +7 -> 184
    //   180: aload_2
    //   181: invokevirtual 442	java/io/BufferedOutputStream:close	()V
    //   184: aload_3
    //   185: ifnull +7 -> 192
    //   188: aload_3
    //   189: invokevirtual 443	java/io/BufferedInputStream:close	()V
    //   192: ldc_w 1506
    //   195: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   198: aload_1
    //   199: athrow
    //   200: ldc_w 1506
    //   203: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   206: goto -96 -> 110
    //   209: astore_1
    //   210: goto -110 -> 100
    //   213: astore_1
    //   214: goto -70 -> 144
    //   217: astore_2
    //   218: goto -34 -> 184
    //   221: astore_2
    //   222: goto -30 -> 192
    //   225: astore_1
    //   226: aconst_null
    //   227: astore 4
    //   229: aload_2
    //   230: astore_3
    //   231: aload 4
    //   233: astore_2
    //   234: goto -58 -> 176
    //   237: astore 4
    //   239: aload_1
    //   240: astore 5
    //   242: aload_2
    //   243: astore_3
    //   244: aload 4
    //   246: astore_1
    //   247: aload 5
    //   249: astore_2
    //   250: goto -74 -> 176
    //   253: astore_1
    //   254: aconst_null
    //   255: astore_1
    //   256: goto -120 -> 136
    //   259: astore_3
    //   260: goto -124 -> 136
    //
    // Exception table:
    //   from	to	target	type
    //   100	104	111	java/io/IOException
    //   6	32	121	java/lang/Throwable
    //   96	100	121	java/lang/Throwable
    //   100	104	121	java/lang/Throwable
    //   104	110	121	java/lang/Throwable
    //   112	118	121	java/lang/Throwable
    //   140	144	121	java/lang/Throwable
    //   148	152	121	java/lang/Throwable
    //   152	158	121	java/lang/Throwable
    //   162	168	121	java/lang/Throwable
    //   180	184	121	java/lang/Throwable
    //   188	192	121	java/lang/Throwable
    //   192	200	121	java/lang/Throwable
    //   32	53	131	java/lang/Throwable
    //   148	152	161	java/io/IOException
    //   32	53	171	finally
    //   96	100	209	java/io/IOException
    //   140	144	213	java/io/IOException
    //   180	184	217	java/io/IOException
    //   188	192	221	java/io/IOException
    //   53	79	225	finally
    //   79	96	237	finally
    //   53	79	253	java/lang/Throwable
    //   79	96	259	java/lang/Throwable
  }

  public boolean e(Context paramContext)
  {
    boolean bool = true;
    AppMethodBeat.i(64434);
    try
    {
      File localFile1 = new java/io/File;
      localFile1.<init>(k.a(paramContext, 4), "x5.tbs.decouple");
      File localFile2 = a().v(paramContext);
      k.a(localFile2);
      k.a(localFile2, true);
      k.a(localFile1, localFile2);
      String[] arrayOfString = localFile2.list();
      for (int i1 = 0; i1 < arrayOfString.length; i1++)
      {
        localFile1 = new java/io/File;
        localFile1.<init>(localFile2, arrayOfString[i1]);
        if (localFile1.getName().endsWith(".dex"))
          localFile1.delete();
      }
      a().f(paramContext, true);
      localFile1 = q(paramContext);
      k.a(localFile1, true);
      localFile2.renameTo(localFile1);
      TbsShareManager.b(paramContext);
      AppMethodBeat.o(64434);
      return bool;
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        AppMethodBeat.o(64434);
        bool = false;
      }
    }
  }

  boolean e(Context paramContext, int paramInt)
  {
    boolean bool1 = true;
    boolean bool2 = true;
    AppMethodBeat.i(64467);
    try
    {
      boolean bool3 = TbsShareManager.isThirdPartyApp(paramContext);
      File localFile;
      if (bool3)
      {
        if (TbsShareManager.j(paramContext))
        {
          localFile = new java/io/File;
          localFile.<init>(TbsShareManager.c(paramContext));
          boolean bool4 = localFile.getAbsolutePath().contains("com.tencent.tbs");
          if (bool4)
            AppMethodBeat.o(64467);
        }
        else
        {
          while (true)
          {
            return bool2;
            TbsLog.e("TbsInstaller", "321");
            AppMethodBeat.o(64467);
            bool2 = false;
          }
        }
      }
      else
      {
        localFile = r(paramContext);
        int i2;
        if (localFile != null)
        {
          Object localObject1 = n;
          int i1 = localObject1.length;
          i2 = 0;
          label115: bool2 = bool1;
          if (i2 < i1)
          {
            Object localObject2 = localObject1[i2];
            if (paramInt != localObject2[0].intValue())
              break label269;
            localObject1 = new java/io/File;
            ((File)localObject1).<init>(localFile, "libmttwebview.so");
            if ((!((File)localObject1).exists()) || (((File)localObject1).length() != localObject2[1].longValue()))
              break label229;
            paramContext = new java/lang/StringBuilder;
            paramContext.<init>("check so success: ");
            TbsLog.d("TbsInstaller", paramInt + "; file: " + localObject1);
            bool2 = bool1;
          }
        }
        while (true)
        {
          AppMethodBeat.o(64467);
          break;
          label229: if (!bool3)
            k.b(paramContext.getDir("tbs", 0));
          a.set(Integer.valueOf(0));
          TbsLog.e("TbsInstaller", "322");
          bool2 = false;
          continue;
          label269: i2++;
          break label115;
          TbsLog.e("TbsInstaller", "323");
          bool2 = false;
        }
      }
    }
    catch (Throwable paramContext)
    {
      while (true)
      {
        TbsLog.e("TbsInstaller", "ISTBSCORELEGAL exception getMessage is " + paramContext.getMessage());
        TbsLog.e("TbsInstaller", "ISTBSCORELEGAL exception getCause is " + paramContext.getCause());
        bool2 = false;
      }
    }
  }

  boolean f(Context paramContext)
  {
    boolean bool1 = true;
    AppMethodBeat.i(64437);
    if (TbsShareManager.getHostCorePathAppDefined() != null)
      AppMethodBeat.o(64437);
    while (true)
    {
      return bool1;
      try
      {
        Signature localSignature = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 64).signatures[0];
        if (paramContext.getPackageName().equals("com.tencent.mtt"))
        {
          bool2 = localSignature.toCharsString().equals("3082023f308201a8a00302010202044c46914a300d06092a864886f70d01010505003064310b30090603550406130238363110300e060355040813074265696a696e673110300e060355040713074265696a696e673110300e060355040a130754656e63656e74310c300a060355040b13035753443111300f0603550403130873616d75656c6d6f301e170d3130303732313036313835305a170d3430303731333036313835305a3064310b30090603550406130238363110300e060355040813074265696a696e673110300e060355040713074265696a696e673110300e060355040a130754656e63656e74310c300a060355040b13035753443111300f0603550403130873616d75656c6d6f30819f300d06092a864886f70d010101050003818d0030818902818100c209077044bd0d63ea00ede5b839914cabcc912a87f0f8b390877e0f7a2583f0d5933443c40431c35a4433bc4c965800141961adc44c9625b1d321385221fd097e5bdc2f44a1840d643ab59dc070cf6c4b4b4d98bed5cbb8046e0a7078ae134da107cdf2bfc9b440fe5cb2f7549b44b73202cc6f7c2c55b8cfb0d333a021f01f0203010001300d06092a864886f70d010105050003818100b007db9922774ef4ccfee81ba514a8d57c410257e7a2eba64bfa17c9e690da08106d32f637ac41fbc9f205176c71bde238c872c3ee2f8313502bee44c80288ea4ef377a6f2cdfe4d3653c145c4acfedbfbadea23b559d41980cc3cdd35d79a68240693739aabf5c5ed26148756cf88264226de394c8a24ac35b712b120d4d23a");
          if (bool2)
            break label307;
          AppMethodBeat.o(64437);
          bool1 = false;
          continue;
        }
        if (paramContext.getPackageName().equals("com.tencent.mm"))
        {
          bool2 = localSignature.toCharsString().equals("308202eb30820254a00302010202044d36f7a4300d06092a864886f70d01010505003081b9310b300906035504061302383631123010060355040813094775616e67646f6e673111300f060355040713085368656e7a68656e31353033060355040a132c54656e63656e7420546563686e6f6c6f6779285368656e7a68656e2920436f6d70616e79204c696d69746564313a3038060355040b133154656e63656e74204775616e677a686f7520526573656172636820616e6420446576656c6f706d656e742043656e7465723110300e0603550403130754656e63656e74301e170d3131303131393134333933325a170d3431303131313134333933325a3081b9310b300906035504061302383631123010060355040813094775616e67646f6e673111300f060355040713085368656e7a68656e31353033060355040a132c54656e63656e7420546563686e6f6c6f6779285368656e7a68656e2920436f6d70616e79204c696d69746564313a3038060355040b133154656e63656e74204775616e677a686f7520526573656172636820616e6420446576656c6f706d656e742043656e7465723110300e0603550403130754656e63656e7430819f300d06092a864886f70d010101050003818d0030818902818100c05f34b231b083fb1323670bfbe7bdab40c0c0a6efc87ef2072a1ff0d60cc67c8edb0d0847f210bea6cbfaa241be70c86daf56be08b723c859e52428a064555d80db448cdcacc1aea2501eba06f8bad12a4fa49d85cacd7abeb68945a5cb5e061629b52e3254c373550ee4e40cb7c8ae6f7a8151ccd8df582d446f39ae0c5e930203010001300d06092a864886f70d0101050500038181009c8d9d7f2f908c42081b4c764c377109a8b2c70582422125ce545842d5f520aea69550b6bd8bfd94e987b75a3077eb04ad341f481aac266e89d3864456e69fba13df018acdc168b9a19dfd7ad9d9cc6f6ace57c746515f71234df3a053e33ba93ece5cd0fc15f3e389a3f365588a9fcb439e069d3629cd7732a13fff7b891499");
          if (bool2)
            break label307;
          AppMethodBeat.o(64437);
          bool1 = false;
          continue;
        }
        if (paramContext.getPackageName().equals("com.tencent.mobileqq"))
        {
          bool2 = localSignature.toCharsString().equals("30820253308201bca00302010202044bbb0361300d06092a864886f70d0101050500306d310e300c060355040613054368696e61310f300d06035504080c06e58c97e4baac310f300d06035504070c06e58c97e4baac310f300d060355040a0c06e885bee8aeaf311b3019060355040b0c12e697a0e7babfe4b89ae58aa1e7b3bbe7bb9f310b30090603550403130251513020170d3130303430363039343831375a180f32323834303132303039343831375a306d310e300c060355040613054368696e61310f300d06035504080c06e58c97e4baac310f300d06035504070c06e58c97e4baac310f300d060355040a0c06e885bee8aeaf311b3019060355040b0c12e697a0e7babfe4b89ae58aa1e7b3bbe7bb9f310b300906035504031302515130819f300d06092a864886f70d010101050003818d0030818902818100a15e9756216f694c5915e0b529095254367c4e64faeff07ae13488d946615a58ddc31a415f717d019edc6d30b9603d3e2a7b3de0ab7e0cf52dfee39373bc472fa997027d798d59f81d525a69ecf156e885fd1e2790924386b2230cc90e3b7adc95603ddcf4c40bdc72f22db0f216a99c371d3bf89cba6578c60699e8a0d536950203010001300d06092a864886f70d01010505000381810094a9b80e80691645dd42d6611775a855f71bcd4d77cb60a8e29404035a5e00b21bcc5d4a562482126bd91b6b0e50709377ceb9ef8c2efd12cc8b16afd9a159f350bb270b14204ff065d843832720702e28b41491fbc3a205f5f2f42526d67f17614d8a974de6487b2c866efede3b4e49a0f916baa3c1336fd2ee1b1629652049");
          if (bool2)
            break label307;
          AppMethodBeat.o(64437);
          bool1 = false;
          continue;
        }
        if (paramContext.getPackageName().equals("com.tencent.tbs"))
        {
          bool2 = localSignature.toCharsString().equals("3082023f308201a8a00302010202044c46914a300d06092a864886f70d01010505003064310b30090603550406130238363110300e060355040813074265696a696e673110300e060355040713074265696a696e673110300e060355040a130754656e63656e74310c300a060355040b13035753443111300f0603550403130873616d75656c6d6f301e170d3130303732313036313835305a170d3430303731333036313835305a3064310b30090603550406130238363110300e060355040813074265696a696e673110300e060355040713074265696a696e673110300e060355040a130754656e63656e74310c300a060355040b13035753443111300f0603550403130873616d75656c6d6f30819f300d06092a864886f70d010101050003818d0030818902818100c209077044bd0d63ea00ede5b839914cabcc912a87f0f8b390877e0f7a2583f0d5933443c40431c35a4433bc4c965800141961adc44c9625b1d321385221fd097e5bdc2f44a1840d643ab59dc070cf6c4b4b4d98bed5cbb8046e0a7078ae134da107cdf2bfc9b440fe5cb2f7549b44b73202cc6f7c2c55b8cfb0d333a021f01f0203010001300d06092a864886f70d010105050003818100b007db9922774ef4ccfee81ba514a8d57c410257e7a2eba64bfa17c9e690da08106d32f637ac41fbc9f205176c71bde238c872c3ee2f8313502bee44c80288ea4ef377a6f2cdfe4d3653c145c4acfedbfbadea23b559d41980cc3cdd35d79a68240693739aabf5c5ed26148756cf88264226de394c8a24ac35b712b120d4d23a");
          if (bool2)
            break label307;
          AppMethodBeat.o(64437);
          bool1 = false;
          continue;
        }
        if (paramContext.getPackageName().equals("com.qzone"))
        {
          bool2 = localSignature.toCharsString().equals("308202ad30820216a00302010202044c26cea2300d06092a864886f70d010105050030819a310b3009060355040613023836311530130603550408130c4265696a696e672043697479311530130603550407130c4265696a696e67204369747931263024060355040a131d515a6f6e65205465616d206f662054656e63656e7420436f6d70616e7931183016060355040b130f54656e63656e7420436f6d70616e79311b301906035504031312416e64726f696420515a6f6e65205465616d301e170d3130303632373034303830325a170d3335303632313034303830325a30819a310b3009060355040613023836311530130603550408130c4265696a696e672043697479311530130603550407130c4265696a696e67204369747931263024060355040a131d515a6f6e65205465616d206f662054656e63656e7420436f6d70616e7931183016060355040b130f54656e63656e7420436f6d70616e79311b301906035504031312416e64726f696420515a6f6e65205465616d30819f300d06092a864886f70d010101050003818d003081890281810082d6aca037a9843fbbe88b6dd19f36e9c24ce174c1b398f3a529e2a7fe02de99c27539602c026edf96ad8d43df32a85458bca1e6fbf11958658a7d6751a1d9b782bf43a8c19bd1c06bdbfd94c0516326ae3cf638ac42bb470580e340c46e6f306a772c1ef98f10a559edf867f3f31fe492808776b7bd953b2cba2d2b2d66a44f0203010001300d06092a864886f70d0101050500038181006003b04a8a8c5be9650f350cda6896e57dd13e6e83e7f891fc70f6a3c2eaf75cfa4fc998365deabbd1b9092159edf4b90df5702a0d101f8840b5d4586eb92a1c3cd19d95fbc1c2ac956309eda8eef3944baf08c4a49d3b9b3ffb06bc13dab94ecb5b8eb74e8789aa0ba21cb567f538bbc59c2a11e6919924a24272eb79251677");
          if (bool2)
            break label307;
          AppMethodBeat.o(64437);
          bool1 = false;
          continue;
        }
        if (!paramContext.getPackageName().equals("com.tencent.qqpimsecure"))
          break label307;
        boolean bool2 = localSignature.toCharsString().equals("30820239308201a2a00302010202044c96f48f300d06092a864886f70d01010505003060310b300906035504061302434e310b300906035504081302474431123010060355040713094775616e677a686f753110300e060355040a130754656e63656e74310b3009060355040b130233473111300f0603550403130857696c736f6e57753020170d3130303932303035343334335a180f32303635303632333035343334335a3060310b300906035504061302434e310b300906035504081302474431123010060355040713094775616e677a686f753110300e060355040a130754656e63656e74310b3009060355040b130233473111300f0603550403130857696c736f6e577530819f300d06092a864886f70d010101050003818d0030818902818100b56e79dbb1185a79e52d792bb3d0bb3da8010d9b87da92ec69f7dc5ad66ab6bfdff2a6a1ed285dd2358f28b72a468be7c10a2ce30c4c27323ed4edcc936080e5bedc2cbbca0b7e879c08a631182793f44bb3ea284179b263410c298e5f6831032c9702ba4a74e2ccfc9ef857f12201451602fc8e774ac59d6398511586c83d1d0203010001300d06092a864886f70d0101050500038181002475615bb65b8d8786b890535802948840387d06b1692ff3ea47ef4c435719ba1865b81e6bfa6293ce31747c3cd6b34595b485cc1563fd90107ba5845c28b95c79138f0dec288940395bc10f92f2b69d8dc410999deb38900974ce9984b678030edfba8816582f56160d87e38641288d8588d2a31e20b89f223d788dd35cc9c8");
        if (bool2)
          break label307;
        AppMethodBeat.o(64437);
        bool1 = false;
      }
      catch (Exception paramContext)
      {
        TbsLog.i("TbsInstaller", "TbsInstaller-installLocalTbsCore getPackageInfo fail");
        AppMethodBeat.o(64437);
        bool1 = false;
      }
      continue;
      label307: AppMethodBeat.o(64437);
    }
  }

  public void g(Context paramContext)
  {
    AppMethodBeat.i(64440);
    int i1 = 1;
    try
    {
      boolean bool = TbsDownloadConfig.getInstance().getTbsCoreLoadRenameFileLockEnable();
      i1 = bool;
      label17: if ((i1 != 0) && (l != null))
        k.a(paramContext, l);
      AppMethodBeat.o(64440);
      return;
    }
    catch (Throwable localThrowable)
    {
      break label17;
    }
  }

  // ERROR //
  int h(Context paramContext)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: ldc_w 1584
    //   5: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aconst_null
    //   9: astore_3
    //   10: aload_0
    //   11: aload_1
    //   12: invokevirtual 316	com/tencent/smtt/sdk/an:u	(Landroid/content/Context;)Ljava/io/File;
    //   15: astore 4
    //   17: ldc 139
    //   19: ldc_w 1586
    //   22: aload 4
    //   24: invokestatic 831	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   27: invokevirtual 496	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   30: invokestatic 146	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   33: new 318	java/io/File
    //   36: astore_1
    //   37: aload_1
    //   38: aload 4
    //   40: ldc_w 401
    //   43: invokespecial 396	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   46: aload_1
    //   47: invokevirtual 622	java/io/File:exists	()Z
    //   50: istore 5
    //   52: iload 5
    //   54: ifne +27 -> 81
    //   57: iconst_0
    //   58: ifeq +11 -> 69
    //   61: new 1233	java/lang/NullPointerException
    //   64: dup
    //   65: invokespecial 1234	java/lang/NullPointerException:<init>	()V
    //   68: athrow
    //   69: ldc_w 1584
    //   72: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   75: iload_2
    //   76: istore 6
    //   78: iload 6
    //   80: ireturn
    //   81: new 403	java/util/Properties
    //   84: astore 7
    //   86: aload 7
    //   88: invokespecial 404	java/util/Properties:<init>	()V
    //   91: new 406	java/io/FileInputStream
    //   94: astore 4
    //   96: aload 4
    //   98: aload_1
    //   99: invokespecial 409	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   102: new 411	java/io/BufferedInputStream
    //   105: astore_1
    //   106: aload_1
    //   107: aload 4
    //   109: invokespecial 414	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   112: aload 7
    //   114: aload_1
    //   115: invokevirtual 417	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   118: aload_1
    //   119: invokevirtual 443	java/io/BufferedInputStream:close	()V
    //   122: aload 7
    //   124: ldc_w 1236
    //   127: invokevirtual 1237	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   130: astore_3
    //   131: aload_3
    //   132: ifnonnull +23 -> 155
    //   135: aload_1
    //   136: ifnull +7 -> 143
    //   139: aload_1
    //   140: invokevirtual 443	java/io/BufferedInputStream:close	()V
    //   143: ldc_w 1584
    //   146: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   149: iload_2
    //   150: istore 6
    //   152: goto -74 -> 78
    //   155: aload_3
    //   156: invokestatic 1240	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   159: istore 6
    //   161: aload_1
    //   162: ifnull +7 -> 169
    //   165: aload_1
    //   166: invokevirtual 443	java/io/BufferedInputStream:close	()V
    //   169: ldc_w 1584
    //   172: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   175: goto -97 -> 78
    //   178: astore_1
    //   179: aconst_null
    //   180: astore_1
    //   181: aload_1
    //   182: ifnull +7 -> 189
    //   185: aload_1
    //   186: invokevirtual 443	java/io/BufferedInputStream:close	()V
    //   189: ldc_w 1584
    //   192: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   195: iload_2
    //   196: istore 6
    //   198: goto -120 -> 78
    //   201: astore_1
    //   202: aload_3
    //   203: ifnull +7 -> 210
    //   206: aload_3
    //   207: invokevirtual 443	java/io/BufferedInputStream:close	()V
    //   210: ldc_w 1584
    //   213: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   216: aload_1
    //   217: athrow
    //   218: astore_1
    //   219: goto -30 -> 189
    //   222: astore_3
    //   223: goto -13 -> 210
    //   226: astore_1
    //   227: goto -158 -> 69
    //   230: astore_1
    //   231: goto -88 -> 143
    //   234: astore_1
    //   235: goto -66 -> 169
    //   238: astore_3
    //   239: aload_1
    //   240: astore 4
    //   242: aload_3
    //   243: astore_1
    //   244: aload 4
    //   246: astore_3
    //   247: goto -45 -> 202
    //   250: astore_3
    //   251: goto -70 -> 181
    //
    // Exception table:
    //   from	to	target	type
    //   10	52	178	java/lang/Exception
    //   81	112	178	java/lang/Exception
    //   10	52	201	finally
    //   81	112	201	finally
    //   185	189	218	java/io/IOException
    //   206	210	222	java/io/IOException
    //   61	69	226	java/io/IOException
    //   139	143	230	java/io/IOException
    //   165	169	234	java/io/IOException
    //   112	131	238	finally
    //   155	161	238	finally
    //   112	131	250	java/lang/Exception
    //   155	161	250	java/lang/Exception
  }

  // ERROR //
  int i(Context paramContext)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: ldc_w 1587
    //   5: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aconst_null
    //   9: astore_3
    //   10: aload_0
    //   11: aload_1
    //   12: invokevirtual 592	com/tencent/smtt/sdk/an:q	(Landroid/content/Context;)Ljava/io/File;
    //   15: astore 4
    //   17: new 318	java/io/File
    //   20: astore_1
    //   21: aload_1
    //   22: aload 4
    //   24: ldc_w 401
    //   27: invokespecial 396	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   30: aload_1
    //   31: invokevirtual 622	java/io/File:exists	()Z
    //   34: istore 5
    //   36: iload 5
    //   38: ifne +27 -> 65
    //   41: iconst_0
    //   42: ifeq +11 -> 53
    //   45: new 1233	java/lang/NullPointerException
    //   48: dup
    //   49: invokespecial 1234	java/lang/NullPointerException:<init>	()V
    //   52: athrow
    //   53: ldc_w 1587
    //   56: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   59: iload_2
    //   60: istore 6
    //   62: iload 6
    //   64: ireturn
    //   65: new 403	java/util/Properties
    //   68: astore 4
    //   70: aload 4
    //   72: invokespecial 404	java/util/Properties:<init>	()V
    //   75: new 406	java/io/FileInputStream
    //   78: astore 7
    //   80: aload 7
    //   82: aload_1
    //   83: invokespecial 409	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   86: new 411	java/io/BufferedInputStream
    //   89: astore_1
    //   90: aload_1
    //   91: aload 7
    //   93: invokespecial 414	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   96: aload 4
    //   98: aload_1
    //   99: invokevirtual 417	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   102: aload_1
    //   103: invokevirtual 443	java/io/BufferedInputStream:close	()V
    //   106: aload 4
    //   108: ldc_w 1236
    //   111: invokevirtual 1237	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   114: astore_3
    //   115: aload_3
    //   116: ifnonnull +23 -> 139
    //   119: aload_1
    //   120: ifnull +7 -> 127
    //   123: aload_1
    //   124: invokevirtual 443	java/io/BufferedInputStream:close	()V
    //   127: ldc_w 1587
    //   130: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   133: iload_2
    //   134: istore 6
    //   136: goto -74 -> 62
    //   139: aload_3
    //   140: invokestatic 1240	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   143: istore 6
    //   145: aload_1
    //   146: ifnull +7 -> 153
    //   149: aload_1
    //   150: invokevirtual 443	java/io/BufferedInputStream:close	()V
    //   153: ldc_w 1587
    //   156: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   159: goto -97 -> 62
    //   162: astore_1
    //   163: aconst_null
    //   164: astore_1
    //   165: aload_1
    //   166: ifnull +7 -> 173
    //   169: aload_1
    //   170: invokevirtual 443	java/io/BufferedInputStream:close	()V
    //   173: ldc_w 1587
    //   176: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   179: iload_2
    //   180: istore 6
    //   182: goto -120 -> 62
    //   185: astore_1
    //   186: aload_3
    //   187: ifnull +7 -> 194
    //   190: aload_3
    //   191: invokevirtual 443	java/io/BufferedInputStream:close	()V
    //   194: ldc_w 1587
    //   197: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   200: aload_1
    //   201: athrow
    //   202: astore_1
    //   203: goto -30 -> 173
    //   206: astore_3
    //   207: goto -13 -> 194
    //   210: astore_1
    //   211: goto -158 -> 53
    //   214: astore_1
    //   215: goto -88 -> 127
    //   218: astore_1
    //   219: goto -66 -> 153
    //   222: astore 4
    //   224: aload_1
    //   225: astore_3
    //   226: aload 4
    //   228: astore_1
    //   229: goto -43 -> 186
    //   232: astore_3
    //   233: goto -68 -> 165
    //
    // Exception table:
    //   from	to	target	type
    //   10	36	162	java/lang/Exception
    //   65	96	162	java/lang/Exception
    //   10	36	185	finally
    //   65	96	185	finally
    //   169	173	202	java/io/IOException
    //   190	194	206	java/io/IOException
    //   45	53	210	java/io/IOException
    //   123	127	214	java/io/IOException
    //   149	153	218	java/io/IOException
    //   96	115	222	finally
    //   139	145	222	finally
    //   96	115	232	java/lang/Exception
    //   139	145	232	java/lang/Exception
  }

  // ERROR //
  int j(Context paramContext)
  {
    // Byte code:
    //   0: ldc_w 1588
    //   3: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: aload_1
    //   8: invokevirtual 305	com/tencent/smtt/sdk/an:r	(Landroid/content/Context;)Ljava/io/File;
    //   11: astore_2
    //   12: new 318	java/io/File
    //   15: astore_1
    //   16: aload_1
    //   17: aload_2
    //   18: ldc_w 401
    //   21: invokespecial 396	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   24: aload_1
    //   25: invokevirtual 622	java/io/File:exists	()Z
    //   28: istore_3
    //   29: iload_3
    //   30: ifne +27 -> 57
    //   33: iconst_0
    //   34: ifeq +11 -> 45
    //   37: new 1233	java/lang/NullPointerException
    //   40: dup
    //   41: invokespecial 1234	java/lang/NullPointerException:<init>	()V
    //   44: athrow
    //   45: ldc_w 1588
    //   48: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   51: iconst_0
    //   52: istore 4
    //   54: iload 4
    //   56: ireturn
    //   57: new 403	java/util/Properties
    //   60: astore 5
    //   62: aload 5
    //   64: invokespecial 404	java/util/Properties:<init>	()V
    //   67: new 406	java/io/FileInputStream
    //   70: astore 6
    //   72: aload 6
    //   74: aload_1
    //   75: invokespecial 409	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   78: new 411	java/io/BufferedInputStream
    //   81: astore_2
    //   82: aload_2
    //   83: aload 6
    //   85: invokespecial 414	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   88: aload_2
    //   89: astore_1
    //   90: aload 5
    //   92: aload_2
    //   93: invokevirtual 417	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   96: aload_2
    //   97: astore_1
    //   98: aload_2
    //   99: invokevirtual 443	java/io/BufferedInputStream:close	()V
    //   102: aload_2
    //   103: astore_1
    //   104: aload 5
    //   106: ldc_w 1236
    //   109: invokevirtual 1237	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   112: astore 5
    //   114: aload 5
    //   116: ifnonnull +23 -> 139
    //   119: aload_2
    //   120: ifnull +7 -> 127
    //   123: aload_2
    //   124: invokevirtual 443	java/io/BufferedInputStream:close	()V
    //   127: ldc_w 1588
    //   130: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   133: iconst_0
    //   134: istore 4
    //   136: goto -82 -> 54
    //   139: aload_2
    //   140: astore_1
    //   141: aload 5
    //   143: invokestatic 1240	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   146: istore 4
    //   148: aload_2
    //   149: astore_1
    //   150: getstatic 105	com/tencent/smtt/sdk/an:o	I
    //   153: ifne +10 -> 163
    //   156: aload_2
    //   157: astore_1
    //   158: iload 4
    //   160: putstatic 105	com/tencent/smtt/sdk/an:o	I
    //   163: aload_2
    //   164: ifnull +7 -> 171
    //   167: aload_2
    //   168: invokevirtual 443	java/io/BufferedInputStream:close	()V
    //   171: ldc_w 1588
    //   174: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   177: goto -123 -> 54
    //   180: astore 5
    //   182: aconst_null
    //   183: astore_2
    //   184: aload_2
    //   185: astore_1
    //   186: new 251	java/lang/StringBuilder
    //   189: astore 6
    //   191: aload_2
    //   192: astore_1
    //   193: aload 6
    //   195: ldc_w 1590
    //   198: invokespecial 255	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   201: aload_2
    //   202: astore_1
    //   203: ldc 139
    //   205: aload 6
    //   207: aload 5
    //   209: invokevirtual 298	java/lang/Exception:toString	()Ljava/lang/String;
    //   212: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   215: invokevirtual 264	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   218: invokestatic 146	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   221: aload_2
    //   222: ifnull +7 -> 229
    //   225: aload_2
    //   226: invokevirtual 443	java/io/BufferedInputStream:close	()V
    //   229: ldc_w 1588
    //   232: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   235: iconst_0
    //   236: istore 4
    //   238: goto -184 -> 54
    //   241: astore_2
    //   242: aconst_null
    //   243: astore_1
    //   244: aload_1
    //   245: ifnull +7 -> 252
    //   248: aload_1
    //   249: invokevirtual 443	java/io/BufferedInputStream:close	()V
    //   252: ldc_w 1588
    //   255: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   258: aload_2
    //   259: athrow
    //   260: astore_1
    //   261: ldc 139
    //   263: new 251	java/lang/StringBuilder
    //   266: dup
    //   267: ldc_w 1592
    //   270: invokespecial 255	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   273: aload_1
    //   274: invokevirtual 1593	java/io/IOException:toString	()Ljava/lang/String;
    //   277: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   280: invokevirtual 264	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   283: invokestatic 146	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   286: goto -34 -> 252
    //   289: astore_1
    //   290: ldc 139
    //   292: new 251	java/lang/StringBuilder
    //   295: dup
    //   296: ldc_w 1592
    //   299: invokespecial 255	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   302: aload_1
    //   303: invokevirtual 1593	java/io/IOException:toString	()Ljava/lang/String;
    //   306: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   309: invokevirtual 264	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   312: invokestatic 146	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   315: goto -86 -> 229
    //   318: astore_1
    //   319: ldc 139
    //   321: new 251	java/lang/StringBuilder
    //   324: dup
    //   325: ldc_w 1592
    //   328: invokespecial 255	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   331: aload_1
    //   332: invokevirtual 1593	java/io/IOException:toString	()Ljava/lang/String;
    //   335: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   338: invokevirtual 264	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   341: invokestatic 146	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   344: goto -299 -> 45
    //   347: astore_1
    //   348: ldc 139
    //   350: new 251	java/lang/StringBuilder
    //   353: dup
    //   354: ldc_w 1592
    //   357: invokespecial 255	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   360: aload_1
    //   361: invokevirtual 1593	java/io/IOException:toString	()Ljava/lang/String;
    //   364: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   367: invokevirtual 264	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   370: invokestatic 146	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   373: goto -246 -> 127
    //   376: astore_1
    //   377: ldc 139
    //   379: new 251	java/lang/StringBuilder
    //   382: dup
    //   383: ldc_w 1592
    //   386: invokespecial 255	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   389: aload_1
    //   390: invokevirtual 1593	java/io/IOException:toString	()Ljava/lang/String;
    //   393: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   396: invokevirtual 264	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   399: invokestatic 146	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   402: goto -231 -> 171
    //   405: astore_2
    //   406: goto -162 -> 244
    //   409: astore 5
    //   411: goto -227 -> 184
    //
    // Exception table:
    //   from	to	target	type
    //   6	29	180	java/lang/Exception
    //   57	88	180	java/lang/Exception
    //   6	29	241	finally
    //   57	88	241	finally
    //   248	252	260	java/io/IOException
    //   225	229	289	java/io/IOException
    //   37	45	318	java/io/IOException
    //   123	127	347	java/io/IOException
    //   167	171	376	java/io/IOException
    //   90	96	405	finally
    //   98	102	405	finally
    //   104	114	405	finally
    //   141	148	405	finally
    //   150	156	405	finally
    //   158	163	405	finally
    //   186	191	405	finally
    //   193	201	405	finally
    //   203	221	405	finally
    //   90	96	409	java/lang/Exception
    //   98	102	409	java/lang/Exception
    //   104	114	409	java/lang/Exception
    //   141	148	409	java/lang/Exception
    //   150	156	409	java/lang/Exception
    //   158	163	409	java/lang/Exception
  }

  int k(Context paramContext)
  {
    AppMethodBeat.i(64449);
    int i1;
    if (o != 0)
    {
      i1 = o;
      AppMethodBeat.o(64449);
    }
    while (true)
    {
      return i1;
      i1 = j(paramContext);
      AppMethodBeat.o(64449);
    }
  }

  void l(Context paramContext)
  {
    AppMethodBeat.i(64450);
    if (o != 0)
      AppMethodBeat.o(64450);
    while (true)
    {
      return;
      o = j(paramContext);
      AppMethodBeat.o(64450);
    }
  }

  boolean m(Context paramContext)
  {
    AppMethodBeat.i(64451);
    boolean bool;
    if (!new File(r(paramContext), "tbs.conf").exists())
    {
      bool = false;
      AppMethodBeat.o(64451);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(64451);
    }
  }

  // ERROR //
  int n(Context paramContext)
  {
    // Byte code:
    //   0: ldc_w 1597
    //   3: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: aload_1
    //   8: invokevirtual 516	com/tencent/smtt/sdk/an:x	(Landroid/content/Context;)Z
    //   11: ifne +13 -> 24
    //   14: iconst_m1
    //   15: istore_2
    //   16: ldc_w 1597
    //   19: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   22: iload_2
    //   23: ireturn
    //   24: getstatic 49	com/tencent/smtt/sdk/an:i	Ljava/util/concurrent/locks/ReentrantLock;
    //   27: invokevirtual 1100	java/util/concurrent/locks/ReentrantLock:tryLock	()Z
    //   30: istore_3
    //   31: ldc 139
    //   33: ldc_w 1599
    //   36: iload_3
    //   37: invokestatic 526	java/lang/String:valueOf	(Z)Ljava/lang/String;
    //   40: invokevirtual 496	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   43: invokestatic 146	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   46: iload_3
    //   47: ifeq +379 -> 426
    //   50: aload_0
    //   51: aload_1
    //   52: invokevirtual 305	com/tencent/smtt/sdk/an:r	(Landroid/content/Context;)Ljava/io/File;
    //   55: astore 4
    //   57: new 318	java/io/File
    //   60: astore_1
    //   61: aload_1
    //   62: aload 4
    //   64: ldc_w 401
    //   67: invokespecial 396	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   70: aload_1
    //   71: invokevirtual 622	java/io/File:exists	()Z
    //   74: istore_3
    //   75: iload_3
    //   76: ifne +45 -> 121
    //   79: iconst_0
    //   80: ifeq +11 -> 91
    //   83: new 1233	java/lang/NullPointerException
    //   86: dup
    //   87: invokespecial 1234	java/lang/NullPointerException:<init>	()V
    //   90: athrow
    //   91: getstatic 49	com/tencent/smtt/sdk/an:i	Ljava/util/concurrent/locks/ReentrantLock;
    //   94: invokevirtual 1602	java/util/concurrent/locks/ReentrantLock:isHeldByCurrentThread	()Z
    //   97: ifeq +9 -> 106
    //   100: getstatic 49	com/tencent/smtt/sdk/an:i	Ljava/util/concurrent/locks/ReentrantLock;
    //   103: invokevirtual 549	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   106: aload_0
    //   107: invokevirtual 552	com/tencent/smtt/sdk/an:b	()V
    //   110: ldc_w 1597
    //   113: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   116: iconst_0
    //   117: istore_2
    //   118: goto -96 -> 22
    //   121: new 403	java/util/Properties
    //   124: astore 5
    //   126: aload 5
    //   128: invokespecial 404	java/util/Properties:<init>	()V
    //   131: new 406	java/io/FileInputStream
    //   134: astore 6
    //   136: aload 6
    //   138: aload_1
    //   139: invokespecial 409	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   142: new 411	java/io/BufferedInputStream
    //   145: astore 4
    //   147: aload 4
    //   149: aload 6
    //   151: invokespecial 414	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   154: aload 4
    //   156: astore_1
    //   157: aload 5
    //   159: aload 4
    //   161: invokevirtual 417	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   164: aload 4
    //   166: astore_1
    //   167: aload 4
    //   169: invokevirtual 443	java/io/BufferedInputStream:close	()V
    //   172: aload 4
    //   174: astore_1
    //   175: aload 5
    //   177: ldc_w 1236
    //   180: invokevirtual 1237	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   183: astore 5
    //   185: aload 5
    //   187: ifnonnull +43 -> 230
    //   190: aload 4
    //   192: ifnull +8 -> 200
    //   195: aload 4
    //   197: invokevirtual 443	java/io/BufferedInputStream:close	()V
    //   200: getstatic 49	com/tencent/smtt/sdk/an:i	Ljava/util/concurrent/locks/ReentrantLock;
    //   203: invokevirtual 1602	java/util/concurrent/locks/ReentrantLock:isHeldByCurrentThread	()Z
    //   206: ifeq +9 -> 215
    //   209: getstatic 49	com/tencent/smtt/sdk/an:i	Ljava/util/concurrent/locks/ReentrantLock;
    //   212: invokevirtual 549	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   215: aload_0
    //   216: invokevirtual 552	com/tencent/smtt/sdk/an:b	()V
    //   219: ldc_w 1597
    //   222: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   225: iconst_0
    //   226: istore_2
    //   227: goto -205 -> 22
    //   230: aload 4
    //   232: astore_1
    //   233: getstatic 58	com/tencent/smtt/sdk/an:a	Ljava/lang/ThreadLocal;
    //   236: aload 5
    //   238: invokestatic 1240	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   241: invokestatic 234	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   244: invokevirtual 240	java/lang/ThreadLocal:set	(Ljava/lang/Object;)V
    //   247: aload 4
    //   249: astore_1
    //   250: getstatic 58	com/tencent/smtt/sdk/an:a	Ljava/lang/ThreadLocal;
    //   253: invokevirtual 1245	java/lang/ThreadLocal:get	()Ljava/lang/Object;
    //   256: checkcast 231	java/lang/Integer
    //   259: invokevirtual 1248	java/lang/Integer:intValue	()I
    //   262: istore_2
    //   263: aload 4
    //   265: ifnull +8 -> 273
    //   268: aload 4
    //   270: invokevirtual 443	java/io/BufferedInputStream:close	()V
    //   273: getstatic 49	com/tencent/smtt/sdk/an:i	Ljava/util/concurrent/locks/ReentrantLock;
    //   276: invokevirtual 1602	java/util/concurrent/locks/ReentrantLock:isHeldByCurrentThread	()Z
    //   279: ifeq +9 -> 288
    //   282: getstatic 49	com/tencent/smtt/sdk/an:i	Ljava/util/concurrent/locks/ReentrantLock;
    //   285: invokevirtual 549	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   288: aload_0
    //   289: invokevirtual 552	com/tencent/smtt/sdk/an:b	()V
    //   292: ldc_w 1597
    //   295: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   298: goto -276 -> 22
    //   301: astore 5
    //   303: aconst_null
    //   304: astore 4
    //   306: aload 4
    //   308: astore_1
    //   309: new 251	java/lang/StringBuilder
    //   312: astore 6
    //   314: aload 4
    //   316: astore_1
    //   317: aload 6
    //   319: ldc_w 1604
    //   322: invokespecial 255	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   325: aload 4
    //   327: astore_1
    //   328: ldc 139
    //   330: aload 6
    //   332: aload 5
    //   334: invokevirtual 298	java/lang/Exception:toString	()Ljava/lang/String;
    //   337: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   340: invokevirtual 264	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   343: invokestatic 146	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   346: aload 4
    //   348: ifnull +8 -> 356
    //   351: aload 4
    //   353: invokevirtual 443	java/io/BufferedInputStream:close	()V
    //   356: getstatic 49	com/tencent/smtt/sdk/an:i	Ljava/util/concurrent/locks/ReentrantLock;
    //   359: invokevirtual 1602	java/util/concurrent/locks/ReentrantLock:isHeldByCurrentThread	()Z
    //   362: ifeq +9 -> 371
    //   365: getstatic 49	com/tencent/smtt/sdk/an:i	Ljava/util/concurrent/locks/ReentrantLock;
    //   368: invokevirtual 549	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   371: aload_0
    //   372: invokevirtual 552	com/tencent/smtt/sdk/an:b	()V
    //   375: ldc_w 1597
    //   378: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   381: iconst_0
    //   382: istore_2
    //   383: goto -361 -> 22
    //   386: astore 4
    //   388: aconst_null
    //   389: astore_1
    //   390: aload_1
    //   391: ifnull +7 -> 398
    //   394: aload_1
    //   395: invokevirtual 443	java/io/BufferedInputStream:close	()V
    //   398: getstatic 49	com/tencent/smtt/sdk/an:i	Ljava/util/concurrent/locks/ReentrantLock;
    //   401: invokevirtual 1602	java/util/concurrent/locks/ReentrantLock:isHeldByCurrentThread	()Z
    //   404: ifeq +9 -> 413
    //   407: getstatic 49	com/tencent/smtt/sdk/an:i	Ljava/util/concurrent/locks/ReentrantLock;
    //   410: invokevirtual 549	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   413: aload_0
    //   414: invokevirtual 552	com/tencent/smtt/sdk/an:b	()V
    //   417: ldc_w 1597
    //   420: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   423: aload 4
    //   425: athrow
    //   426: aload_0
    //   427: invokevirtual 552	com/tencent/smtt/sdk/an:b	()V
    //   430: ldc_w 1597
    //   433: invokestatic 109	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   436: iconst_0
    //   437: istore_2
    //   438: goto -416 -> 22
    //   441: astore_1
    //   442: ldc 139
    //   444: new 251	java/lang/StringBuilder
    //   447: dup
    //   448: ldc_w 1606
    //   451: invokespecial 255	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   454: aload_1
    //   455: invokevirtual 1593	java/io/IOException:toString	()Ljava/lang/String;
    //   458: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   461: invokevirtual 264	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   464: invokestatic 146	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   467: goto -69 -> 398
    //   470: astore_1
    //   471: ldc 139
    //   473: ldc_w 1608
    //   476: aload_1
    //   477: invokestatic 831	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   480: invokevirtual 496	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   483: invokestatic 465	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   486: goto -73 -> 413
    //   489: astore_1
    //   490: ldc 139
    //   492: new 251	java/lang/StringBuilder
    //   495: dup
    //   496: ldc_w 1606
    //   499: invokespecial 255	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   502: aload_1
    //   503: invokevirtual 1593	java/io/IOException:toString	()Ljava/lang/String;
    //   506: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   509: invokevirtual 264	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   512: invokestatic 146	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   515: goto -159 -> 356
    //   518: astore_1
    //   519: ldc 139
    //   521: ldc_w 1608
    //   524: aload_1
    //   525: invokestatic 831	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   528: invokevirtual 496	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   531: invokestatic 465	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   534: goto -163 -> 371
    //   537: astore_1
    //   538: ldc 139
    //   540: new 251	java/lang/StringBuilder
    //   543: dup
    //   544: ldc_w 1606
    //   547: invokespecial 255	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   550: aload_1
    //   551: invokevirtual 1593	java/io/IOException:toString	()Ljava/lang/String;
    //   554: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   557: invokevirtual 264	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   560: invokestatic 146	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   563: goto -472 -> 91
    //   566: astore_1
    //   567: ldc 139
    //   569: ldc_w 1608
    //   572: aload_1
    //   573: invokestatic 831	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   576: invokevirtual 496	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   579: invokestatic 465	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   582: goto -476 -> 106
    //   585: astore_1
    //   586: ldc 139
    //   588: new 251	java/lang/StringBuilder
    //   591: dup
    //   592: ldc_w 1606
    //   595: invokespecial 255	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   598: aload_1
    //   599: invokevirtual 1593	java/io/IOException:toString	()Ljava/lang/String;
    //   602: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   605: invokevirtual 264	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   608: invokestatic 146	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   611: goto -411 -> 200
    //   614: astore_1
    //   615: ldc 139
    //   617: ldc_w 1608
    //   620: aload_1
    //   621: invokestatic 831	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   624: invokevirtual 496	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   627: invokestatic 465	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   630: goto -415 -> 215
    //   633: astore_1
    //   634: ldc 139
    //   636: new 251	java/lang/StringBuilder
    //   639: dup
    //   640: ldc_w 1606
    //   643: invokespecial 255	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   646: aload_1
    //   647: invokevirtual 1593	java/io/IOException:toString	()Ljava/lang/String;
    //   650: invokevirtual 263	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   653: invokevirtual 264	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   656: invokestatic 146	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   659: goto -386 -> 273
    //   662: astore_1
    //   663: ldc 139
    //   665: ldc_w 1608
    //   668: aload_1
    //   669: invokestatic 831	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   672: invokevirtual 496	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   675: invokestatic 465	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   678: goto -390 -> 288
    //   681: astore 4
    //   683: goto -293 -> 390
    //   686: astore 5
    //   688: goto -382 -> 306
    //
    // Exception table:
    //   from	to	target	type
    //   50	75	301	java/lang/Exception
    //   121	154	301	java/lang/Exception
    //   50	75	386	finally
    //   121	154	386	finally
    //   394	398	441	java/io/IOException
    //   398	413	470	java/lang/Throwable
    //   351	356	489	java/io/IOException
    //   356	371	518	java/lang/Throwable
    //   83	91	537	java/io/IOException
    //   91	106	566	java/lang/Throwable
    //   195	200	585	java/io/IOException
    //   200	215	614	java/lang/Throwable
    //   268	273	633	java/io/IOException
    //   273	288	662	java/lang/Throwable
    //   157	164	681	finally
    //   167	172	681	finally
    //   175	185	681	finally
    //   233	247	681	finally
    //   250	263	681	finally
    //   309	314	681	finally
    //   317	325	681	finally
    //   328	346	681	finally
    //   157	164	686	java/lang/Exception
    //   167	172	686	java/lang/Exception
    //   175	185	686	java/lang/Exception
    //   233	247	686	java/lang/Exception
    //   250	263	686	java/lang/Exception
  }

  public boolean o(Context paramContext)
  {
    boolean bool = true;
    AppMethodBeat.i(64455);
    TbsLog.i("TbsInstaller", "TbsInstaller--coreShareCopyToDecouple #0");
    File localFile1 = r(paramContext);
    File localFile2 = q(paramContext);
    try
    {
      k.a(localFile2, true);
      au localau = new com/tencent/smtt/sdk/au;
      localau.<init>(this);
      k.a(localFile1, localFile2, localau);
      TbsShareManager.b(paramContext);
      TbsLog.i("TbsInstaller", "TbsInstaller--coreShareCopyToDecouple success!!!");
      AppMethodBeat.o(64455);
      return bool;
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        bool = false;
        AppMethodBeat.o(64455);
      }
    }
  }

  void p(Context paramContext)
  {
    AppMethodBeat.i(64458);
    TbsLog.i("TbsInstaller", "TbsInstaller--cleanStatusAndTmpDir");
    ai.a(paramContext).a(0);
    ai.a(paramContext).b(0);
    ai.a(paramContext).d(0);
    ai.a(paramContext).a("incrupdate_retry_num", 0);
    if (TbsDownloadConfig.getInstance(paramContext).mPreferences.getInt("tbs_downloaddecouplecore", 0) != 1)
    {
      ai.a(paramContext).b(0, -1);
      ai.a(paramContext).a("");
      ai.a(paramContext).a("copy_retry_num", 0);
      ai.a(paramContext).c(-1);
      ai.a(paramContext).a(0, -1);
      k.a(u(paramContext), true);
      k.a(w(paramContext), true);
    }
    AppMethodBeat.o(64458);
  }

  File q(Context paramContext)
  {
    AppMethodBeat.i(64460);
    paramContext = new File(paramContext.getDir("tbs", 0), "core_share_decouple");
    if ((!paramContext.isDirectory()) && (!paramContext.mkdir()))
    {
      paramContext = null;
      AppMethodBeat.o(64460);
    }
    while (true)
    {
      return paramContext;
      AppMethodBeat.o(64460);
    }
  }

  File r(Context paramContext)
  {
    AppMethodBeat.i(64461);
    paramContext = b(null, paramContext);
    AppMethodBeat.o(64461);
    return paramContext;
  }

  File s(Context paramContext)
  {
    AppMethodBeat.i(64462);
    paramContext = new File(paramContext.getDir("tbs", 0), "share");
    if ((!paramContext.isDirectory()) && (!paramContext.mkdir()))
    {
      paramContext = null;
      AppMethodBeat.o(64462);
    }
    while (true)
    {
      return paramContext;
      AppMethodBeat.o(64462);
    }
  }

  File u(Context paramContext)
  {
    AppMethodBeat.i(64464);
    paramContext = new File(paramContext.getDir("tbs", 0), "core_unzip_tmp");
    if ((!paramContext.isDirectory()) && (!paramContext.mkdir()))
    {
      paramContext = null;
      AppMethodBeat.o(64464);
    }
    while (true)
    {
      return paramContext;
      AppMethodBeat.o(64464);
    }
  }

  File v(Context paramContext)
  {
    AppMethodBeat.i(64465);
    paramContext = new File(paramContext.getDir("tbs", 0), "core_unzip_tmp_decouple");
    if ((!paramContext.isDirectory()) && (!paramContext.mkdir()))
    {
      paramContext = null;
      AppMethodBeat.o(64465);
    }
    while (true)
    {
      return paramContext;
      AppMethodBeat.o(64465);
    }
  }

  File w(Context paramContext)
  {
    AppMethodBeat.i(64466);
    paramContext = new File(paramContext.getDir("tbs", 0), "core_copy_tmp");
    if ((!paramContext.isDirectory()) && (!paramContext.mkdir()))
    {
      paramContext = null;
      AppMethodBeat.o(64466);
    }
    while (true)
    {
      return paramContext;
      AppMethodBeat.o(64466);
    }
  }

  boolean x(Context paramContext)
  {
    boolean bool = true;
    try
    {
      AppMethodBeat.i(64468);
      this.e += 1;
      if (this.h)
      {
        TbsLog.i("TbsInstaller", "getTbsInstallingFileLock success,is cached= true");
        AppMethodBeat.o(64468);
      }
      while (true)
      {
        return bool;
        this.g = k.b(paramContext, true, "tbslock.txt");
        if (this.g != null)
        {
          this.f = k.a(paramContext, this.g);
          if (this.f == null)
          {
            AppMethodBeat.o(64468);
            bool = false;
          }
        }
        else
        {
          AppMethodBeat.o(64468);
          bool = false;
          continue;
          TbsLog.i("TbsInstaller", "getTbsInstallingFileLock success,is cached= false");
          this.h = true;
          AppMethodBeat.o(64468);
        }
      }
    }
    finally
    {
    }
    throw paramContext;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.an
 * JD-Core Version:    0.6.2
 */
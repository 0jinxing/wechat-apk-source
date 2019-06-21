package com.tencent.smtt.sdk;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.utils.Apn;
import com.tencent.smtt.utils.TbsLog;
import com.tencent.smtt.utils.a;
import com.tencent.smtt.utils.b;
import com.tencent.smtt.utils.k;
import com.tencent.smtt.utils.y;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ag
{
  private static int d = 5;
  private static int e = 1;
  private static final String[] f = { "tbs_downloading_com.tencent.mtt", "tbs_downloading_com.tencent.mm", "tbs_downloading_com.tencent.mobileqq", "tbs_downloading_com.tencent.tbs", "tbs_downloading_com.qzone" };
  private Set<String> A;
  private int B;
  private boolean C;
  String a;
  String[] b;
  int c;
  private Context g;
  private String h;
  private String i;
  private String j;
  private File k;
  private long l;
  private int m;
  private int n;
  private boolean o;
  private int p;
  private int q;
  private boolean r;
  private boolean s;
  private HttpURLConnection t;
  private String u;
  private TbsLogReport.TbsLogInfo v;
  private String w;
  private int x;
  private boolean y;
  private Handler z;

  public ag(Context paramContext)
  {
    AppMethodBeat.i(64256);
    this.m = 30000;
    this.n = 20000;
    this.B = d;
    this.b = null;
    this.c = 0;
    this.g = paramContext.getApplicationContext();
    this.v = TbsLogReport.getInstance(this.g).tbsLogInfo();
    this.A = new HashSet();
    this.u = ("tbs_downloading_" + this.g.getPackageName());
    an.a();
    this.k = an.t(this.g);
    if (this.k == null)
    {
      paramContext = new NullPointerException("TbsCorePrivateDir is null!");
      AppMethodBeat.o(64256);
      throw paramContext;
    }
    f();
    this.w = null;
    this.x = -1;
    AppMethodBeat.o(64256);
  }

  private long a(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(64264);
    long l1 = System.currentTimeMillis();
    this.v.setDownConsumeTime(l1 - paramLong1);
    this.v.setDownloadSize(paramLong2);
    AppMethodBeat.o(64264);
    return l1;
  }

  @TargetApi(8)
  static File a(Context paramContext)
  {
    AppMethodBeat.i(64278);
    try
    {
      if (Build.VERSION.SDK_INT >= 8)
      {
        File localFile = new java/io/File;
        localFile.<init>(k.a(paramContext, 4));
        paramContext = localFile;
        if ((paramContext != null) && (!paramContext.exists()) && (!paramContext.isDirectory()))
          paramContext.mkdirs();
        AppMethodBeat.o(64278);
        return paramContext;
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        TbsLog.e("TbsDownload", "[TbsApkDownloader.backupApkPath] Exception is " + paramContext.getMessage());
        AppMethodBeat.o(64278);
        paramContext = null;
        continue;
        paramContext = null;
      }
    }
  }

  private static File a(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(64280);
    File localFile = new File(k.a(paramContext, paramInt));
    if ((!localFile.exists()) || (!localFile.isDirectory()))
    {
      AppMethodBeat.o(64280);
      paramContext = null;
    }
    while (true)
    {
      return paramContext;
      if (TbsDownloader.getOverSea(paramContext));
      for (paramContext = "x5.oversea.tbs.org"; ; paramContext = "x5.tbs.org")
      {
        if (!new File(localFile, paramContext).exists())
          break label82;
        AppMethodBeat.o(64280);
        paramContext = localFile;
        break;
      }
      label82: AppMethodBeat.o(64280);
      paramContext = null;
    }
  }

  private String a(Throwable paramThrowable)
  {
    AppMethodBeat.i(64266);
    paramThrowable = Log.getStackTraceString(paramThrowable);
    if (paramThrowable.length() > 1024)
    {
      paramThrowable = paramThrowable.substring(0, 1024);
      AppMethodBeat.o(64266);
    }
    while (true)
    {
      return paramThrowable;
      AppMethodBeat.o(64266);
    }
  }

  private String a(URL paramURL)
  {
    AppMethodBeat.i(64277);
    String str = "";
    try
    {
      paramURL = InetAddress.getByName(paramURL.getHost()).getHostAddress();
      AppMethodBeat.o(64277);
      return paramURL;
    }
    catch (Error paramURL)
    {
      while (true)
        paramURL = str;
    }
    catch (Exception paramURL)
    {
      while (true)
        paramURL = str;
    }
  }

  private void a(int paramInt, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(64265);
    if ((paramBoolean) || (this.p > this.B))
    {
      this.v.setErrorCode(paramInt);
      this.v.setFailDetail(paramString);
    }
    AppMethodBeat.o(64265);
  }

  private void a(long paramLong)
  {
    AppMethodBeat.i(64269);
    this.p += 1;
    long l1 = paramLong;
    if (paramLong <= 0L);
    try
    {
      l1 = m();
      Thread.sleep(l1);
      AppMethodBeat.o(64269);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(64269);
    }
  }

  private void a(Closeable paramCloseable)
  {
    AppMethodBeat.i(64268);
    if (paramCloseable != null);
    while (true)
    {
      try
      {
        paramCloseable.close();
        AppMethodBeat.o(64268);
        return;
      }
      catch (IOException paramCloseable)
      {
      }
      AppMethodBeat.o(64268);
    }
  }

  public static void a(File paramFile, Context paramContext)
  {
    int i1 = 0;
    AppMethodBeat.i(64285);
    if (paramFile != null);
    try
    {
      if (!paramFile.exists())
        return;
      while (true)
      {
        File localFile;
        try
        {
          localFile = a(paramContext);
          if (localFile != null)
            if (TbsDownloadConfig.getInstance(paramContext).mPreferences.getInt("tbs_download_version_type", 0) == 1)
            {
              localObject1 = new java/io/File;
              ((File)localObject1).<init>(localFile, "x5.tbs.decouple");
              ((File)localObject1).delete();
              k.b(paramFile, (File)localObject1);
              Object localObject2 = localObject1;
              if (TbsDownloadConfig.getInstance(paramContext).mPreferences.getInt("tbs_download_version_type", 0) != 1)
              {
                localObject2 = localObject1;
                if (TbsDownloadConfig.getInstance(paramContext).mPreferences.getInt("tbs_decouplecoreversion", 0) == a.a(paramContext, paramFile))
                {
                  localObject1 = new java/io/File;
                  ((File)localObject1).<init>(localFile, "x5.tbs.decouple");
                  localObject2 = localObject1;
                  if (a.a(paramContext, paramFile) != a.a(paramContext, (File)localObject1))
                  {
                    ((File)localObject1).delete();
                    k.b(paramFile, (File)localObject1);
                    localObject2 = localObject1;
                  }
                }
              }
              if (((File)localObject2).getName().contains("tbs.org"))
              {
                paramFile = localFile.listFiles();
                localObject2 = Pattern.compile("x5.backup(.*)");
                int i2 = paramFile.length;
                if (i1 >= i2)
                  break label324;
                localObject1 = paramFile[i1];
                if ((((Pattern)localObject2).matcher(((File)localObject1).getName()).find()) && (((File)localObject1).isFile()) && (((File)localObject1).exists()))
                  ((File)localObject1).delete();
                i1++;
                continue;
              }
            }
            else
            {
              if (!TbsDownloader.getOverSea(paramContext))
                break label317;
              localObject1 = "x5.oversea.tbs.org";
              localObject1 = new File(localFile, (String)localObject1);
              continue;
            }
        }
        catch (Exception paramFile)
        {
        }
        break;
        label317: Object localObject1 = "x5.tbs.org";
        continue;
        label324: i1 = TbsDownloadConfig.getInstance(paramContext).mPreferences.getInt("tbs_download_version", 0);
        paramFile = new java/io/File;
        paramFile.<init>(localFile, "x5.backup.".concat(String.valueOf(i1)));
        if (paramFile.exists())
        {
          TbsLog.e("TbsDownload", "[TbsApkDownloader.backupTbsApk]delete bacup config file error ");
          AppMethodBeat.o(64285);
          break;
        }
        paramFile.createNewFile();
      }
    }
    finally
    {
      AppMethodBeat.o(64285);
    }
    throw paramFile;
  }

  private void a(String paramString)
  {
    AppMethodBeat.i(64257);
    paramString = new URL(paramString);
    if (this.t != null);
    try
    {
      this.t.disconnect();
      this.t = ((HttpURLConnection)paramString.openConnection());
      this.t.setRequestProperty("User-Agent", TbsDownloader.a(this.g));
      this.t.setRequestProperty("Accept-Encoding", "identity");
      this.t.setRequestMethod("GET");
      this.t.setInstanceFollowRedirects(false);
      this.t.setConnectTimeout(this.n);
      this.t.setReadTimeout(this.m);
      AppMethodBeat.o(64257);
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
        TbsLog.e("TbsDownload", "[initHttpRequest] mHttpRequest.disconnect() Throwable:" + localThrowable.toString());
    }
  }

  @TargetApi(8)
  static File b(Context paramContext)
  {
    AppMethodBeat.i(64279);
    try
    {
      if (Build.VERSION.SDK_INT >= 8)
      {
        Object localObject1 = a(paramContext, 4);
        localObject2 = localObject1;
        if (localObject1 == null)
          localObject2 = a(paramContext, 3);
        localObject1 = localObject2;
        if (localObject2 == null)
          localObject1 = a(paramContext, 2);
        localObject2 = localObject1;
        if (localObject1 == null)
          localObject2 = a(paramContext, 1);
        AppMethodBeat.o(64279);
        return localObject2;
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        TbsLog.e("TbsDownload", "[TbsApkDownloader.backupApkPath] Exception is " + paramContext.getMessage());
        AppMethodBeat.o(64279);
        Object localObject2 = null;
        continue;
        localObject2 = null;
      }
    }
  }

  private void b(boolean paramBoolean)
  {
    AppMethodBeat.i(64267);
    y.a(this.g);
    Object localObject1 = TbsDownloadConfig.getInstance(this.g);
    ((TbsDownloadConfig)localObject1).a.put("request_full_package", Boolean.FALSE);
    ((TbsDownloadConfig)localObject1).a.put("tbs_needdownload", Boolean.FALSE);
    ((TbsDownloadConfig)localObject1).a.put("tbs_download_interrupt_code_reason", Integer.valueOf(-123));
    ((TbsDownloadConfig)localObject1).commit();
    Object localObject2 = QbSdk.m;
    int i1;
    if (paramBoolean)
    {
      i1 = 100;
      ((TbsListener)localObject2).onDownloadFinish(i1);
      int i2 = ((TbsDownloadConfig)localObject1).mPreferences.getInt("tbs_responsecode", 0);
      TbsDownloadConfig.getInstance(this.g).mPreferences.getInt("tbs_downloaddecouplecore", 0);
      if ((i2 != 3) && (i2 <= 10000))
        break label369;
      File localFile = a(this.g);
      if (localFile == null)
        break label336;
      if (!TbsDownloader.getOverSea(this.g))
        break label325;
      localObject2 = "x5.oversea.tbs.org";
      label172: localFile = new File(localFile, (String)localObject2);
      i1 = a.a(this.g, localFile);
      localObject2 = new File(this.k, "x5.tbs");
      if (!((File)localObject2).exists())
        break label331;
      localObject2 = ((File)localObject2).getAbsolutePath();
      label222: int i3 = ((TbsDownloadConfig)localObject1).mPreferences.getInt("tbs_download_version", 0);
      localObject1 = new Bundle();
      ((Bundle)localObject1).putInt("operation", i2);
      ((Bundle)localObject1).putInt("old_core_ver", i1);
      ((Bundle)localObject1).putInt("new_core_ver", i3);
      ((Bundle)localObject1).putString("old_apk_location", localFile.getAbsolutePath());
      ((Bundle)localObject1).putString("new_apk_location", (String)localObject2);
      ((Bundle)localObject1).putString("diff_file_location", (String)localObject2);
      an.a().b(this.g, (Bundle)localObject1);
      AppMethodBeat.o(64267);
    }
    while (true)
    {
      return;
      i1 = 120;
      break;
      label325: localObject2 = "x5.tbs.org";
      break label172;
      label331: localObject2 = null;
      break label222;
      label336: d();
      ((TbsDownloadConfig)localObject1).a.put("tbs_needdownload", Boolean.TRUE);
      ((TbsDownloadConfig)localObject1).commit();
      AppMethodBeat.o(64267);
      continue;
      label369: i1 = ((TbsDownloadConfig)localObject1).mPreferences.getInt("tbs_download_version", 0);
      an.a().a(this.g, new File(this.k, "x5.tbs").getAbsolutePath(), i1);
      a(new File(this.k, "x5.tbs"), this.g);
      AppMethodBeat.o(64267);
    }
  }

  private boolean b(int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(64259);
    try
    {
      File localFile1 = new java/io/File;
      localFile1.<init>(this.k, "x5.tbs");
      File localFile2 = a(this.g);
      String str;
      if (localFile2 != null)
      {
        File localFile3 = new java/io/File;
        if (TbsDownloader.getOverSea(this.g))
        {
          str = "x5.oversea.tbs.org";
          localFile3.<init>(localFile2, str);
          localFile1.delete();
          k.b(localFile3, localFile1);
          if (a.a(this.g, localFile1, 0L, paramInt))
            break label159;
          TbsLog.i("TbsDownload", "[TbsApkDownloader.copyTbsApkFromBackupToInstall] verifyTbsApk error!!");
          AppMethodBeat.o(64259);
        }
      }
      while (true)
      {
        return bool;
        str = "x5.tbs.org";
        break;
        AppMethodBeat.o(64259);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        TbsLog.e("TbsDownload", "[TbsApkDownloader.copyTbsApkFromBackupToInstall] Exception is " + localException.getMessage());
        AppMethodBeat.o(64259);
        continue;
        label159: bool = true;
        AppMethodBeat.o(64259);
      }
    }
  }

  public static void c(Context paramContext)
  {
    AppMethodBeat.i(64286);
    try
    {
      an.a();
      Object localObject = an.t(paramContext);
      File localFile = new java/io/File;
      localFile.<init>((File)localObject, "x5.tbs");
      localFile.delete();
      localFile = new java/io/File;
      localFile.<init>((File)localObject, "x5.tbs.temp");
      localFile.delete();
      paramContext = a(paramContext);
      if (paramContext != null)
      {
        localObject = new java/io/File;
        ((File)localObject).<init>(paramContext, "x5.tbs.org");
        ((File)localObject).delete();
        localObject = new java/io/File;
        ((File)localObject).<init>(paramContext, "x5.oversea.tbs.org");
        ((File)localObject).delete();
        paramContext = paramContext.listFiles();
        localObject = Pattern.compile("x5.backup(.*)");
        int i1 = paramContext.length;
        for (int i2 = 0; i2 < i1; i2++)
        {
          localFile = paramContext[i2];
          if ((((Pattern)localObject).matcher(localFile.getName()).find()) && (localFile.isFile()) && (localFile.exists()))
            localFile.delete();
        }
      }
      AppMethodBeat.o(64286);
      return;
    }
    catch (Exception paramContext)
    {
      while (true)
        AppMethodBeat.o(64286);
    }
  }

  private boolean c(boolean paramBoolean)
  {
    AppMethodBeat.i(64272);
    TbsLog.i("TbsDownload", "[TbsApkDownloader.deleteFile] isApk=".concat(String.valueOf(paramBoolean)));
    File localFile;
    if (paramBoolean)
    {
      localFile = new File(this.k, "x5.tbs");
      if (!localFile.exists())
        break label78;
    }
    label78: for (paramBoolean = localFile.delete(); ; paramBoolean = true)
    {
      AppMethodBeat.o(64272);
      return paramBoolean;
      localFile = new File(this.k, "x5.tbs.temp");
      break;
    }
  }

  private boolean c(boolean paramBoolean1, boolean paramBoolean2)
  {
    long l1 = 0L;
    boolean bool = false;
    AppMethodBeat.i(64271);
    TbsLog.i("TbsDownload", "[TbsApkDownloader.verifyTbsApk] isTempFile=".concat(String.valueOf(paramBoolean1)));
    Object localObject1 = this.k;
    Object localObject2;
    if (!paramBoolean1)
    {
      localObject2 = "x5.tbs";
      localObject2 = new File((File)localObject1, (String)localObject2);
      if (((File)localObject2).exists())
        break label81;
      AppMethodBeat.o(64271);
    }
    label81: Object localObject3;
    for (paramBoolean1 = bool; ; paramBoolean1 = bool)
    {
      return paramBoolean1;
      localObject2 = "x5.tbs.temp";
      break;
      localObject1 = TbsDownloadConfig.getInstance(this.g).mPreferences.getString("tbs_apk_md5", null);
      localObject3 = a.a((File)localObject2);
      if ((localObject1 != null) && (((String)localObject1).equals(localObject3)))
        break label178;
      TbsLog.i("TbsDownload", "[TbsApkDownloader.verifyTbsApk] isTempFile=" + paramBoolean1 + " md5 failed");
      if (paramBoolean1)
        this.v.setCheckErrorDetail("fileMd5 not match");
      AppMethodBeat.o(64271);
    }
    label178: TbsLog.i("TbsDownload", "[TbsApkDownloader.verifyTbsApk] md5(" + (String)localObject3 + ") successful!");
    long l2 = l1;
    long l3;
    if (paramBoolean1)
    {
      l3 = TbsDownloadConfig.getInstance(this.g).mPreferences.getLong("tbs_apkfilesize", 0L);
      if (!((File)localObject2).exists())
        break label794;
      l2 = l1;
      if (l3 > 0L)
      {
        l2 = ((File)localObject2).length();
        if (l3 == l2);
      }
    }
    while (true)
    {
      while (true)
      {
        TbsLog.i("TbsDownload", "[TbsApkDownloader.verifyTbsApk] isTempFile=" + paramBoolean1 + " filelength failed");
        this.v.setCheckErrorDetail("fileLength:" + l2 + ",contentLength:" + l3);
        AppMethodBeat.o(64271);
        paramBoolean1 = bool;
        break;
        TbsLog.i("TbsDownload", "[TbsApkDownloader.verifyTbsApk] length(" + l2 + ") successful!");
        int i1 = -1;
        int i2 = i1;
        if (paramBoolean2)
        {
          i2 = i1;
          if (!paramBoolean1)
          {
            i1 = a.a(this.g, (File)localObject2);
            int i3 = TbsDownloadConfig.getInstance(this.g).mPreferences.getInt("tbs_download_version", 0);
            i2 = i1;
            if (i3 != i1)
            {
              TbsLog.i("TbsDownload", "[TbsApkDownloader.verifyTbsApk] isTempFile=" + paramBoolean1 + " versionCode failed");
              if (paramBoolean1)
                this.v.setCheckErrorDetail("fileVersion:" + i1 + ",configVersion:" + i3);
              AppMethodBeat.o(64271);
              paramBoolean1 = bool;
              break;
            }
          }
        }
        TbsLog.i("TbsDownload", "[TbsApkDownloader.verifyTbsApk] tbsApkVersionCode(" + i2 + ") successful!");
        if ((paramBoolean2) && (!paramBoolean1))
        {
          String str = b.a(this.g, false, (File)localObject2);
          if (!"3082023f308201a8a00302010202044c46914a300d06092a864886f70d01010505003064310b30090603550406130238363110300e060355040813074265696a696e673110300e060355040713074265696a696e673110300e060355040a130754656e63656e74310c300a060355040b13035753443111300f0603550403130873616d75656c6d6f301e170d3130303732313036313835305a170d3430303731333036313835305a3064310b30090603550406130238363110300e060355040813074265696a696e673110300e060355040713074265696a696e673110300e060355040a130754656e63656e74310c300a060355040b13035753443111300f0603550403130873616d75656c6d6f30819f300d06092a864886f70d010101050003818d0030818902818100c209077044bd0d63ea00ede5b839914cabcc912a87f0f8b390877e0f7a2583f0d5933443c40431c35a4433bc4c965800141961adc44c9625b1d321385221fd097e5bdc2f44a1840d643ab59dc070cf6c4b4b4d98bed5cbb8046e0a7078ae134da107cdf2bfc9b440fe5cb2f7549b44b73202cc6f7c2c55b8cfb0d333a021f01f0203010001300d06092a864886f70d010105050003818100b007db9922774ef4ccfee81ba514a8d57c410257e7a2eba64bfa17c9e690da08106d32f637ac41fbc9f205176c71bde238c872c3ee2f8313502bee44c80288ea4ef377a6f2cdfe4d3653c145c4acfedbfbadea23b559d41980cc3cdd35d79a68240693739aabf5c5ed26148756cf88264226de394c8a24ac35b712b120d4d23a".equals(str))
          {
            TbsLog.i("TbsDownload", "[TbsApkDownloader.verifyTbsApk] isTempFile=" + paramBoolean1 + " signature failed");
            if (paramBoolean1)
            {
              localObject3 = this.v;
              localObject1 = new StringBuilder("signature:");
              if (str != null)
                break label662;
            }
            label662: for (localObject2 = "null"; ; localObject2 = Integer.valueOf(str.length()))
            {
              ((TbsLogReport.TbsLogInfo)localObject3).setCheckErrorDetail(localObject2);
              AppMethodBeat.o(64271);
              paramBoolean1 = bool;
              break;
            }
          }
        }
        TbsLog.i("TbsDownload", "[TbsApkDownloader.verifyTbsApk] signature successful!");
        if (paramBoolean1)
          try
          {
            localObject1 = new java/io/File;
            ((File)localObject1).<init>(this.k, "x5.tbs");
            paramBoolean1 = ((File)localObject2).renameTo((File)localObject1);
            localObject2 = null;
            paramBoolean2 = paramBoolean1;
            if (paramBoolean1)
              break label755;
            a(109, a((Throwable)localObject2), true);
            AppMethodBeat.o(64271);
            paramBoolean1 = bool;
          }
          catch (Exception localException)
          {
            while (true)
              paramBoolean1 = false;
          }
      }
      paramBoolean2 = false;
      label755: TbsLog.i("TbsDownload", "[TbsApkDownloader.verifyTbsApk] rename(" + paramBoolean2 + ") successful!");
      AppMethodBeat.o(64271);
      paramBoolean1 = true;
      break;
      label794: l2 = 0L;
    }
  }

  private void f()
  {
    this.p = 0;
    this.q = 0;
    this.l = -1L;
    this.j = null;
    this.o = false;
    this.r = false;
    this.s = false;
    this.y = false;
  }

  private void g()
  {
    AppMethodBeat.i(64258);
    TbsLog.i("TbsDownload", "[TbsApkDownloader.closeHttpRequest]");
    if (this.t != null)
      if (!this.r)
        this.v.setResolveIp(a(this.t.getURL()));
    try
    {
      this.t.disconnect();
      this.t = null;
      int i1 = this.v.a;
      if ((!this.r) && (this.y))
      {
        this.v.setEventTime(System.currentTimeMillis());
        String str1 = Apn.getApnInfo(this.g);
        String str2 = str1;
        if (str1 == null)
          str2 = "";
        int i2 = Apn.getApnType(this.g);
        this.v.setApn(str2);
        this.v.setNetworkType(i2);
        if ((i2 != this.x) || (!str2.equals(this.w)))
          this.v.setNetworkChange(0);
        if (((this.v.a == 0) || (this.v.a == 107)) && (this.v.getDownFinalFlag() == 0))
        {
          if (!Apn.isNetworkAvailable(this.g))
            a(101, null, true);
        }
        else
        {
          if (TbsDownloadConfig.getInstance(this.g).mPreferences.getInt("tbs_downloaddecouplecore", 0) != 1)
            break label327;
          TbsLogReport.getInstance(this.g).eventReport(TbsLogReport.EventType.TYPE_DOWNLOAD_DECOUPLE, this.v);
          this.v.resetArgs();
          if (i1 != 100)
            QbSdk.m.onDownloadFinish(i1);
          AppMethodBeat.o(64258);
          return;
        }
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        TbsLog.e("TbsDownload", "[closeHttpRequest] mHttpRequest.disconnect() Throwable:" + localThrowable.toString());
        continue;
        if (!l())
        {
          a(101, null, true);
          continue;
          label327: TbsLogReport.getInstance(this.g).eventReport(TbsLogReport.EventType.TYPE_DOWNLOAD, this.v);
          continue;
          TbsDownloader.a = false;
          AppMethodBeat.o(64258);
        }
      }
    }
  }

  private boolean h()
  {
    AppMethodBeat.i(64270);
    String str = k.a(this.g, 4);
    if (TbsDownloader.getOverSea(this.g));
    for (Object localObject = "x5.oversea.tbs.org"; ; localObject = "x5.tbs.org")
    {
      localObject = new File(str, (String)localObject);
      int i1 = TbsDownloadConfig.getInstance(this.g).mPreferences.getInt("use_backup_version", 0);
      int i2 = i1;
      if (i1 == 0)
        i2 = TbsDownloadConfig.getInstance(this.g).mPreferences.getInt("tbs_download_version", 0);
      boolean bool = a.a(this.g, (File)localObject, 0L, i2);
      AppMethodBeat.o(64270);
      return bool;
    }
  }

  private void i()
  {
    int i1 = 0;
    AppMethodBeat.i(64273);
    try
    {
      int i2 = TbsDownloadConfig.getInstance(this.g).mPreferences.getInt("tbs_downloaddecouplecore", 0);
      if (i2 == 1)
        AppMethodBeat.o(64273);
      while (true)
      {
        return;
        Object localObject1 = new java/io/File;
        String str = k.a(this.g, 4);
        if (TbsDownloader.getOverSea(this.g));
        for (Object localObject2 = "x5.oversea.tbs.org"; ; localObject2 = "x5.tbs.org")
        {
          ((File)localObject1).<init>(str, (String)localObject2);
          if (!((File)localObject1).exists())
            break;
          ((File)localObject1).delete();
          localObject1 = ((File)localObject1).getParentFile().listFiles();
          localObject2 = Pattern.compile("x5.backup(.*)");
          i2 = localObject1.length;
          while (i1 < i2)
          {
            str = localObject1[i1];
            if ((((Pattern)localObject2).matcher(str.getName()).find()) && (str.isFile()) && (str.exists()))
              str.delete();
            i1++;
          }
        }
        AppMethodBeat.o(64273);
      }
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(64273);
    }
  }

  private boolean j()
  {
    AppMethodBeat.i(64274);
    boolean bool = false;
    if (new File(this.k, "x5.tbs.temp").exists())
      bool = true;
    AppMethodBeat.o(64274);
    return bool;
  }

  private long k()
  {
    AppMethodBeat.i(64275);
    long l1 = 0L;
    File localFile = new File(this.k, "x5.tbs.temp");
    if (localFile.exists())
      l1 = localFile.length();
    AppMethodBeat.o(64275);
    return l1;
  }

  // ERROR //
  private boolean l()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: iconst_0
    //   3: istore_2
    //   4: ldc_w 718
    //   7: invokestatic 76	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   10: invokestatic 724	java/lang/Runtime:getRuntime	()Ljava/lang/Runtime;
    //   13: astore_3
    //   14: aload_3
    //   15: ldc_w 726
    //   18: ldc_w 728
    //   21: invokestatic 731	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   24: invokevirtual 371	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   27: invokevirtual 735	java/lang/Runtime:exec	(Ljava/lang/String;)Ljava/lang/Process;
    //   30: invokevirtual 741	java/lang/Process:getInputStream	()Ljava/io/InputStream;
    //   33: astore 4
    //   35: new 743	java/io/InputStreamReader
    //   38: astore 5
    //   40: aload 5
    //   42: aload 4
    //   44: invokespecial 746	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   47: new 748	java/io/BufferedReader
    //   50: astore 6
    //   52: aload 6
    //   54: aload 5
    //   56: invokespecial 751	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   59: iconst_0
    //   60: istore 7
    //   62: aload 6
    //   64: invokevirtual 754	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   67: astore_3
    //   68: iload_2
    //   69: istore 8
    //   71: aload_3
    //   72: ifnull +30 -> 102
    //   75: aload_3
    //   76: ldc_w 756
    //   79: invokevirtual 335	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   82: ifne +17 -> 99
    //   85: aload_3
    //   86: ldc_w 758
    //   89: invokevirtual 335	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   92: istore 8
    //   94: iload 8
    //   96: ifeq +33 -> 129
    //   99: iconst_1
    //   100: istore 8
    //   102: aload_0
    //   103: aload 4
    //   105: invokespecial 760	com/tencent/smtt/sdk/ag:a	(Ljava/io/Closeable;)V
    //   108: aload_0
    //   109: aload 5
    //   111: invokespecial 760	com/tencent/smtt/sdk/ag:a	(Ljava/io/Closeable;)V
    //   114: aload_0
    //   115: aload 6
    //   117: invokespecial 760	com/tencent/smtt/sdk/ag:a	(Ljava/io/Closeable;)V
    //   120: ldc_w 718
    //   123: invokestatic 148	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   126: iload 8
    //   128: ireturn
    //   129: iload 7
    //   131: iconst_1
    //   132: iadd
    //   133: istore 9
    //   135: iload 9
    //   137: istore 7
    //   139: iload 9
    //   141: iconst_5
    //   142: if_icmplt -80 -> 62
    //   145: iload_2
    //   146: istore 8
    //   148: goto -46 -> 102
    //   151: astore_3
    //   152: aconst_null
    //   153: astore_3
    //   154: aconst_null
    //   155: astore 6
    //   157: aconst_null
    //   158: astore 4
    //   160: aload_0
    //   161: aload 4
    //   163: invokespecial 760	com/tencent/smtt/sdk/ag:a	(Ljava/io/Closeable;)V
    //   166: aload_0
    //   167: aload 6
    //   169: invokespecial 760	com/tencent/smtt/sdk/ag:a	(Ljava/io/Closeable;)V
    //   172: aload_0
    //   173: aload_3
    //   174: invokespecial 760	com/tencent/smtt/sdk/ag:a	(Ljava/io/Closeable;)V
    //   177: iload_1
    //   178: istore 8
    //   180: goto -60 -> 120
    //   183: astore_3
    //   184: aconst_null
    //   185: astore 6
    //   187: aconst_null
    //   188: astore 5
    //   190: aconst_null
    //   191: astore 4
    //   193: aload_0
    //   194: aload 4
    //   196: invokespecial 760	com/tencent/smtt/sdk/ag:a	(Ljava/io/Closeable;)V
    //   199: aload_0
    //   200: aload 5
    //   202: invokespecial 760	com/tencent/smtt/sdk/ag:a	(Ljava/io/Closeable;)V
    //   205: aload_0
    //   206: aload 6
    //   208: invokespecial 760	com/tencent/smtt/sdk/ag:a	(Ljava/io/Closeable;)V
    //   211: ldc_w 718
    //   214: invokestatic 148	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   217: aload_3
    //   218: athrow
    //   219: astore_3
    //   220: aconst_null
    //   221: astore 6
    //   223: aconst_null
    //   224: astore 5
    //   226: goto -33 -> 193
    //   229: astore_3
    //   230: aconst_null
    //   231: astore 6
    //   233: goto -40 -> 193
    //   236: astore_3
    //   237: goto -44 -> 193
    //   240: astore_3
    //   241: aconst_null
    //   242: astore_3
    //   243: aconst_null
    //   244: astore 6
    //   246: goto -86 -> 160
    //   249: astore_3
    //   250: aconst_null
    //   251: astore_3
    //   252: aload 5
    //   254: astore 6
    //   256: goto -96 -> 160
    //   259: astore_3
    //   260: aload 6
    //   262: astore_3
    //   263: aload 5
    //   265: astore 6
    //   267: goto -107 -> 160
    //
    // Exception table:
    //   from	to	target	type
    //   14	35	151	java/lang/Throwable
    //   14	35	183	finally
    //   35	47	219	finally
    //   47	59	229	finally
    //   62	68	236	finally
    //   75	94	236	finally
    //   35	47	240	java/lang/Throwable
    //   47	59	249	java/lang/Throwable
    //   62	68	259	java/lang/Throwable
    //   75	94	259	java/lang/Throwable
  }

  private long m()
  {
    long l1;
    switch (this.p)
    {
    default:
      l1 = 200000L;
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      return l1;
      l1 = 20000L * this.p;
      continue;
      l1 = 100000L;
    }
  }

  // ERROR //
  private boolean n()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: iconst_1
    //   5: istore_3
    //   6: iconst_0
    //   7: istore 4
    //   9: ldc_w 767
    //   12: invokestatic 76	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   15: aload_0
    //   16: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   19: invokestatic 668	com/tencent/smtt/utils/Apn:getApnType	(Landroid/content/Context;)I
    //   22: iconst_3
    //   23: if_icmpne +259 -> 282
    //   26: iconst_1
    //   27: istore 5
    //   29: ldc 202
    //   31: ldc_w 769
    //   34: iload 5
    //   36: invokestatic 537	java/lang/String:valueOf	(Z)Ljava/lang/String;
    //   39: invokevirtual 371	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   42: invokestatic 525	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   45: iload 4
    //   47: istore 6
    //   49: iload 5
    //   51: ifeq +127 -> 178
    //   54: aload_0
    //   55: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   58: invokestatic 772	com/tencent/smtt/utils/Apn:getWifiSSID	(Landroid/content/Context;)Ljava/lang/String;
    //   61: astore_2
    //   62: ldc 202
    //   64: ldc_w 774
    //   67: aload_2
    //   68: invokestatic 731	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   71: invokevirtual 371	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   74: invokestatic 525	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   77: new 251	java/net/URL
    //   80: astore 7
    //   82: aload 7
    //   84: ldc_w 776
    //   87: invokespecial 380	java/net/URL:<init>	(Ljava/lang/String;)V
    //   90: aload 7
    //   92: invokevirtual 391	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   95: checkcast 384	java/net/HttpURLConnection
    //   98: astore 7
    //   100: aload 7
    //   102: iconst_0
    //   103: invokevirtual 412	java/net/HttpURLConnection:setInstanceFollowRedirects	(Z)V
    //   106: aload 7
    //   108: sipush 10000
    //   111: invokevirtual 415	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   114: aload 7
    //   116: sipush 10000
    //   119: invokevirtual 418	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   122: aload 7
    //   124: iconst_0
    //   125: invokevirtual 779	java/net/HttpURLConnection:setUseCaches	(Z)V
    //   128: aload 7
    //   130: invokevirtual 780	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   133: pop
    //   134: aload 7
    //   136: invokevirtual 783	java/net/HttpURLConnection:getResponseCode	()I
    //   139: istore 8
    //   141: ldc 202
    //   143: ldc_w 785
    //   146: iload 8
    //   148: invokestatic 367	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   151: invokevirtual 371	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   154: invokestatic 525	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   157: iload 8
    //   159: sipush 204
    //   162: if_icmpne +126 -> 288
    //   165: iload_3
    //   166: istore 6
    //   168: aload 7
    //   170: ifnull +202 -> 372
    //   173: aload 7
    //   175: invokevirtual 387	java/net/HttpURLConnection:disconnect	()V
    //   178: iload 6
    //   180: ifne +64 -> 244
    //   183: aload_2
    //   184: invokestatic 790	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   187: ifne +57 -> 244
    //   190: aload_0
    //   191: getfield 111	com/tencent/smtt/sdk/ag:A	Ljava/util/Set;
    //   194: aload_2
    //   195: invokeinterface 794 2 0
    //   200: ifne +44 -> 244
    //   203: aload_0
    //   204: getfield 111	com/tencent/smtt/sdk/ag:A	Ljava/util/Set;
    //   207: aload_2
    //   208: invokeinterface 797 2 0
    //   213: pop
    //   214: aload_0
    //   215: invokespecial 799	com/tencent/smtt/sdk/ag:o	()V
    //   218: aload_0
    //   219: getfield 801	com/tencent/smtt/sdk/ag:z	Landroid/os/Handler;
    //   222: sipush 150
    //   225: aload_2
    //   226: invokevirtual 807	android/os/Handler:obtainMessage	(ILjava/lang/Object;)Landroid/os/Message;
    //   229: astore 7
    //   231: aload_0
    //   232: getfield 801	com/tencent/smtt/sdk/ag:z	Landroid/os/Handler;
    //   235: aload 7
    //   237: ldc2_w 808
    //   240: invokevirtual 813	android/os/Handler:sendMessageDelayed	(Landroid/os/Message;J)Z
    //   243: pop
    //   244: iload 6
    //   246: ifeq +27 -> 273
    //   249: aload_0
    //   250: getfield 111	com/tencent/smtt/sdk/ag:A	Ljava/util/Set;
    //   253: aload_2
    //   254: invokeinterface 794 2 0
    //   259: ifeq +14 -> 273
    //   262: aload_0
    //   263: getfield 111	com/tencent/smtt/sdk/ag:A	Ljava/util/Set;
    //   266: aload_2
    //   267: invokeinterface 816 2 0
    //   272: pop
    //   273: ldc_w 767
    //   276: invokestatic 148	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   279: iload 6
    //   281: ireturn
    //   282: iconst_0
    //   283: istore 5
    //   285: goto -256 -> 29
    //   288: iconst_0
    //   289: istore 6
    //   291: goto -123 -> 168
    //   294: astore 7
    //   296: goto -118 -> 178
    //   299: astore 7
    //   301: aconst_null
    //   302: astore 7
    //   304: aload 7
    //   306: ifnull +59 -> 365
    //   309: aload 7
    //   311: invokevirtual 387	java/net/HttpURLConnection:disconnect	()V
    //   314: iload 4
    //   316: istore 6
    //   318: goto -140 -> 178
    //   321: astore 7
    //   323: iload 4
    //   325: istore 6
    //   327: goto -149 -> 178
    //   330: astore_2
    //   331: aload_1
    //   332: astore 7
    //   334: aload 7
    //   336: ifnull +8 -> 344
    //   339: aload 7
    //   341: invokevirtual 387	java/net/HttpURLConnection:disconnect	()V
    //   344: ldc_w 767
    //   347: invokestatic 148	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   350: aload_2
    //   351: athrow
    //   352: astore 7
    //   354: goto -10 -> 344
    //   357: astore_2
    //   358: goto -24 -> 334
    //   361: astore_1
    //   362: goto -58 -> 304
    //   365: iload 4
    //   367: istore 6
    //   369: goto -191 -> 178
    //   372: goto -194 -> 178
    //
    // Exception table:
    //   from	to	target	type
    //   173	178	294	java/lang/Exception
    //   77	100	299	java/lang/Throwable
    //   309	314	321	java/lang/Exception
    //   77	100	330	finally
    //   339	344	352	java/lang/Exception
    //   100	157	357	finally
    //   100	157	361	java/lang/Throwable
  }

  private void o()
  {
    AppMethodBeat.i(64288);
    if (this.z == null)
      this.z = new ah(this, al.a().getLooper());
    AppMethodBeat.o(64288);
  }

  public void a(int paramInt)
  {
    AppMethodBeat.i(64284);
    try
    {
      File localFile = new java/io/File;
      localFile.<init>(this.k, "x5.tbs");
      int i1 = a.a(this.g, localFile);
      if ((-1 == i1) || ((paramInt > 0) && (paramInt == i1)))
        localFile.delete();
      AppMethodBeat.o(64284);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(64284);
    }
  }

  public boolean a()
  {
    AppMethodBeat.i(64261);
    TbsLog.i("TbsApkDownloader", "verifyAndInstallDecoupleCoreFromBackup #1");
    boolean bool;
    try
    {
      File localFile1 = new java/io/File;
      localFile1.<init>(k.a(this.g, 4), "x5.tbs.decouple");
      if (localFile1.exists())
        TbsLog.i("TbsApkDownloader", "verifyAndInstallDecoupleCoreFromBackup #2");
      while (a.a(this.g, localFile1, 0L, TbsDownloadConfig.getInstance(this.g).mPreferences.getInt("tbs_decouplecoreversion", -1)))
      {
        TbsLog.i("TbsApkDownloader", "verifyAndInstallDecoupleCoreFromBackup #3");
        bool = an.a().e(this.g);
        AppMethodBeat.o(64261);
        return bool;
        File localFile3 = TbsDownloader.b(TbsDownloadConfig.getInstance(this.g).mPreferences.getInt("tbs_decouplecoreversion", -1));
        if ((localFile3 != null) && (localFile3.exists()))
          k.b(localFile3, localFile1);
      }
    }
    catch (Exception localException)
    {
    }
    while (true)
    {
      bool = false;
      AppMethodBeat.o(64261);
      break;
      TbsLog.i("TbsApkDownloader", "verifyAndInstallDecoupleCoreFromBackup no backup file !!!");
      File localFile2 = new java/io/File;
      localFile2.<init>(k.a(this.g, 4), "x5.tbs.decouple");
      if (localFile2.exists())
        localFile2.delete();
    }
  }

  public boolean a(boolean paramBoolean)
  {
    boolean bool = false;
    AppMethodBeat.i(64263);
    if ((paramBoolean) && (!n()) && ((!QbSdk.getDownloadWithoutWifi()) || (!Apn.isNetworkAvailable(this.g))))
    {
      AppMethodBeat.o(64263);
      paramBoolean = bool;
    }
    while (true)
    {
      return paramBoolean;
      if ((this.b != null) && (this.c >= 0) && (this.c < this.b.length))
      {
        String[] arrayOfString = this.b;
        int i1 = this.c;
        this.c = (i1 + 1);
        this.j = arrayOfString[i1];
        this.p = 0;
        this.q = 0;
        this.l = -1L;
        this.o = false;
        this.r = false;
        this.s = false;
        this.y = false;
        paramBoolean = true;
        AppMethodBeat.o(64263);
      }
      else
      {
        AppMethodBeat.o(64263);
        paramBoolean = bool;
      }
    }
  }

  public boolean a(boolean paramBoolean1, boolean paramBoolean2)
  {
    paramBoolean1 = true;
    AppMethodBeat.i(64260);
    int i1 = TbsDownloadConfig.getInstance(this.g).mPreferences.getInt("use_backup_version", 0);
    int i2 = an.a().j(this.g);
    if (i1 == 0)
    {
      i1 = TbsDownloadConfig.getInstance(this.g).mPreferences.getInt("tbs_download_version", 0);
      this.a = "by default key";
      if ((i1 != 0) && (i1 != i2))
        break label101;
      AppMethodBeat.o(64260);
      paramBoolean1 = false;
    }
    label399: 
    while (true)
    {
      return paramBoolean1;
      this.a = "by new key";
      break;
      label101: if (paramBoolean2)
      {
        File localFile = TbsDownloader.a(i1);
        Object localObject;
        if ((localFile != null) && (localFile.exists()))
        {
          String str = k.a(this.g, 4);
          if (TbsDownloader.getOverSea(this.g))
          {
            localObject = "x5.oversea.tbs.org";
            localObject = new File(str, (String)localObject);
          }
        }
        while (true)
        {
          try
          {
            if (TbsDownloadConfig.getInstance(this.g).mPreferences.getInt("tbs_download_version_type", 0) != 1)
            {
              k.b(localFile, (File)localObject);
              i2 = 1;
              if (!h())
                break label376;
              if (!b(i1))
                break label399;
              TbsDownloadConfig.getInstance(this.g).a.put("tbs_download_interrupt_code_reason", Integer.valueOf(-214));
              TbsDownloadConfig.getInstance(this.g).setDownloadInterruptCode(-214);
              b(false);
              if (i2 != 0)
              {
                a(100, "use local backup apk in startDownload" + this.a, true);
                if (TbsDownloadConfig.getInstance(this.g).mPreferences.getInt("tbs_downloaddecouplecore", 0) != 1)
                  break label356;
                TbsLogReport.getInstance(this.g).eventReport(TbsLogReport.EventType.TYPE_DOWNLOAD_DECOUPLE, this.v);
                this.v.resetArgs();
              }
              AppMethodBeat.o(64260);
              break;
              localObject = "x5.tbs.org";
            }
          }
          catch (Exception localException)
          {
          }
          i2 = 0;
          continue;
          TbsLogReport.getInstance(this.g).eventReport(TbsLogReport.EventType.TYPE_DOWNLOAD, this.v);
        }
        label376: i();
        if (!a.a(this.g, localFile, 0L, i1))
          k.b(localFile);
      }
      label356: if (c(false, paramBoolean2))
      {
        TbsDownloadConfig.getInstance(this.g).a.put("tbs_download_interrupt_code_reason", Integer.valueOf(-214));
        TbsDownloadConfig.getInstance(this.g).setDownloadInterruptCode(-214);
        b(false);
        AppMethodBeat.o(64260);
      }
      else
      {
        if ((!c(true)) && (!c(true)))
        {
          TbsLog.e("TbsDownload", "[TbsApkDownloader] delete file failed!");
          TbsDownloadConfig.getInstance(this.g).setDownloadInterruptCode(-301);
        }
        AppMethodBeat.o(64260);
        paramBoolean1 = false;
      }
    }
  }

  public int b()
  {
    AppMethodBeat.i(64281);
    File localFile = a(this.g);
    int i1;
    if (localFile == null)
    {
      i1 = 0;
      AppMethodBeat.o(64281);
      return i1;
    }
    Context localContext = this.g;
    if (TbsDownloader.getOverSea(this.g));
    for (String str = "x5.oversea.tbs.org"; ; str = "x5.tbs.org")
    {
      i1 = a.a(localContext, new File(localFile, str));
      AppMethodBeat.o(64281);
      break;
    }
  }

  // ERROR //
  public void b(boolean paramBoolean1, boolean paramBoolean2)
  {
    // Byte code:
    //   0: ldc_w 888
    //   3: invokestatic 76	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: invokestatic 136	com/tencent/smtt/sdk/an:a	()Lcom/tencent/smtt/sdk/an;
    //   9: aload_0
    //   10: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   13: invokevirtual 890	com/tencent/smtt/sdk/an:c	(Landroid/content/Context;)Z
    //   16: ifeq +31 -> 47
    //   19: iload_1
    //   20: ifne +27 -> 47
    //   23: iconst_0
    //   24: putstatic 705	com/tencent/smtt/sdk/TbsDownloader:a	Z
    //   27: aload_0
    //   28: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   31: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   34: sipush -322
    //   37: invokevirtual 870	com/tencent/smtt/sdk/TbsDownloadConfig:setDownloadInterruptCode	(I)V
    //   40: ldc_w 888
    //   43: invokestatic 148	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   46: return
    //   47: aload_0
    //   48: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   51: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   54: getfield 305	com/tencent/smtt/sdk/TbsDownloadConfig:mPreferences	Landroid/content/SharedPreferences;
    //   57: ldc_w 474
    //   60: iconst_0
    //   61: invokeinterface 313 3 0
    //   66: istore_3
    //   67: iload_3
    //   68: iconst_1
    //   69: if_icmpeq +13 -> 82
    //   72: iload_3
    //   73: iconst_2
    //   74: if_icmpeq +8 -> 82
    //   77: iload_3
    //   78: iconst_4
    //   79: if_icmpne +33 -> 112
    //   82: iconst_1
    //   83: istore 4
    //   85: iload_2
    //   86: ifne +32 -> 118
    //   89: aload_0
    //   90: iload_1
    //   91: iload 4
    //   93: invokevirtual 892	com/tencent/smtt/sdk/ag:a	(ZZ)Z
    //   96: ifeq +22 -> 118
    //   99: iconst_0
    //   100: putstatic 705	com/tencent/smtt/sdk/TbsDownloader:a	Z
    //   103: ldc_w 888
    //   106: invokestatic 148	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   109: goto -63 -> 46
    //   112: iconst_0
    //   113: istore 4
    //   115: goto -30 -> 85
    //   118: aload_0
    //   119: iload_1
    //   120: putfield 894	com/tencent/smtt/sdk/ag:C	Z
    //   123: aload_0
    //   124: aload_0
    //   125: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   128: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   131: getfield 305	com/tencent/smtt/sdk/TbsDownloadConfig:mPreferences	Landroid/content/SharedPreferences;
    //   134: ldc_w 896
    //   137: aconst_null
    //   138: invokeinterface 547 3 0
    //   143: putfield 898	com/tencent/smtt/sdk/ag:h	Ljava/lang/String;
    //   146: aload_0
    //   147: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   150: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   153: getfield 305	com/tencent/smtt/sdk/TbsDownloadConfig:mPreferences	Landroid/content/SharedPreferences;
    //   156: ldc_w 900
    //   159: aconst_null
    //   160: invokeinterface 547 3 0
    //   165: astore 5
    //   167: ldc 202
    //   169: ldc_w 902
    //   172: aload 5
    //   174: invokestatic 731	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   177: invokevirtual 371	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   180: iconst_1
    //   181: invokestatic 905	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;Z)V
    //   184: aload_0
    //   185: aconst_null
    //   186: putfield 84	com/tencent/smtt/sdk/ag:b	[Ljava/lang/String;
    //   189: aload_0
    //   190: iconst_0
    //   191: putfield 86	com/tencent/smtt/sdk/ag:c	I
    //   194: iload_1
    //   195: ifne +36 -> 231
    //   198: aload 5
    //   200: ifnull +31 -> 231
    //   203: ldc 249
    //   205: aload 5
    //   207: invokevirtual 908	java/lang/String:trim	()Ljava/lang/String;
    //   210: invokevirtual 554	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   213: ifne +18 -> 231
    //   216: aload_0
    //   217: aload 5
    //   219: invokevirtual 908	java/lang/String:trim	()Ljava/lang/String;
    //   222: ldc_w 910
    //   225: invokevirtual 914	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   228: putfield 84	com/tencent/smtt/sdk/ag:b	[Ljava/lang/String;
    //   231: ldc 202
    //   233: new 113	java/lang/StringBuilder
    //   236: dup
    //   237: ldc_w 916
    //   240: invokespecial 118	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   243: aload_0
    //   244: getfield 898	com/tencent/smtt/sdk/ag:h	Ljava/lang/String;
    //   247: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   250: ldc_w 918
    //   253: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   256: aload 5
    //   258: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   261: ldc_w 920
    //   264: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   267: aload_0
    //   268: getfield 634	com/tencent/smtt/sdk/ag:j	Ljava/lang/String;
    //   271: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   274: ldc_w 922
    //   277: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   280: aload_0
    //   281: getfield 638	com/tencent/smtt/sdk/ag:r	Z
    //   284: invokevirtual 557	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   287: ldc_w 924
    //   290: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   293: aload_0
    //   294: getfield 382	com/tencent/smtt/sdk/ag:t	Ljava/net/HttpURLConnection;
    //   297: invokevirtual 614	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   300: invokevirtual 129	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   303: invokestatic 525	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   306: aload_0
    //   307: getfield 898	com/tencent/smtt/sdk/ag:h	Ljava/lang/String;
    //   310: ifnonnull +42 -> 352
    //   313: aload_0
    //   314: getfield 634	com/tencent/smtt/sdk/ag:j	Ljava/lang/String;
    //   317: ifnonnull +35 -> 352
    //   320: getstatic 467	com/tencent/smtt/sdk/QbSdk:m	Lcom/tencent/smtt/sdk/TbsListener;
    //   323: bipush 110
    //   325: invokeinterface 472 2 0
    //   330: aload_0
    //   331: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   334: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   337: sipush -302
    //   340: invokevirtual 870	com/tencent/smtt/sdk/TbsDownloadConfig:setDownloadInterruptCode	(I)V
    //   343: ldc_w 888
    //   346: invokestatic 148	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   349: goto -303 -> 46
    //   352: aload_0
    //   353: getfield 382	com/tencent/smtt/sdk/ag:t	Ljava/net/HttpURLConnection;
    //   356: ifnull +42 -> 398
    //   359: aload_0
    //   360: getfield 638	com/tencent/smtt/sdk/ag:r	Z
    //   363: ifne +35 -> 398
    //   366: getstatic 467	com/tencent/smtt/sdk/QbSdk:m	Lcom/tencent/smtt/sdk/TbsListener;
    //   369: bipush 110
    //   371: invokeinterface 472 2 0
    //   376: aload_0
    //   377: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   380: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   383: sipush -303
    //   386: invokevirtual 870	com/tencent/smtt/sdk/TbsDownloadConfig:setDownloadInterruptCode	(I)V
    //   389: ldc_w 888
    //   392: invokestatic 148	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   395: goto -349 -> 46
    //   398: iload_1
    //   399: ifne +62 -> 461
    //   402: aload_0
    //   403: getfield 111	com/tencent/smtt/sdk/ag:A	Ljava/util/Set;
    //   406: aload_0
    //   407: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   410: invokestatic 772	com/tencent/smtt/utils/Apn:getWifiSSID	(Landroid/content/Context;)Ljava/lang/String;
    //   413: invokeinterface 794 2 0
    //   418: ifeq +43 -> 461
    //   421: ldc 202
    //   423: ldc_w 926
    //   426: invokestatic 525	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   429: getstatic 467	com/tencent/smtt/sdk/QbSdk:m	Lcom/tencent/smtt/sdk/TbsListener;
    //   432: bipush 110
    //   434: invokeinterface 472 2 0
    //   439: aload_0
    //   440: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   443: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   446: sipush -304
    //   449: invokevirtual 870	com/tencent/smtt/sdk/TbsDownloadConfig:setDownloadInterruptCode	(I)V
    //   452: ldc_w 888
    //   455: invokestatic 148	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   458: goto -412 -> 46
    //   461: aload_0
    //   462: invokespecial 150	com/tencent/smtt/sdk/ag:f	()V
    //   465: ldc 202
    //   467: ldc_w 928
    //   470: iconst_1
    //   471: invokestatic 905	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;Z)V
    //   474: aload_0
    //   475: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   478: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   481: invokevirtual 931	com/tencent/smtt/sdk/TbsDownloadConfig:getDownloadMaxflow	()J
    //   484: lstore 6
    //   486: iconst_0
    //   487: istore_2
    //   488: aload_0
    //   489: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   492: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   495: getfield 305	com/tencent/smtt/sdk/TbsDownloadConfig:mPreferences	Landroid/content/SharedPreferences;
    //   498: ldc_w 933
    //   501: lconst_0
    //   502: invokeinterface 574 4 0
    //   507: lstore 8
    //   509: iload_1
    //   510: ifeq +257 -> 767
    //   513: aload_0
    //   514: getstatic 51	com/tencent/smtt/sdk/ag:e	I
    //   517: putfield 82	com/tencent/smtt/sdk/ag:B	I
    //   520: iload_2
    //   521: istore 10
    //   523: aload_0
    //   524: getfield 267	com/tencent/smtt/sdk/ag:p	I
    //   527: aload_0
    //   528: getfield 82	com/tencent/smtt/sdk/ag:B	I
    //   531: if_icmpgt +36 -> 567
    //   534: aload_0
    //   535: getfield 628	com/tencent/smtt/sdk/ag:q	I
    //   538: bipush 8
    //   540: if_icmple +237 -> 777
    //   543: aload_0
    //   544: bipush 123
    //   546: aconst_null
    //   547: iconst_1
    //   548: invokespecial 624	com/tencent/smtt/sdk/ag:a	(ILjava/lang/String;Z)V
    //   551: aload_0
    //   552: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   555: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   558: sipush -306
    //   561: invokevirtual 870	com/tencent/smtt/sdk/TbsDownloadConfig:setDownloadInterruptCode	(I)V
    //   564: iload_2
    //   565: istore 10
    //   567: aload_0
    //   568: getfield 638	com/tencent/smtt/sdk/ag:r	Z
    //   571: ifne +183 -> 754
    //   574: iload 10
    //   576: istore_1
    //   577: aload_0
    //   578: getfield 640	com/tencent/smtt/sdk/ag:s	Z
    //   581: ifeq +102 -> 683
    //   584: iload 10
    //   586: istore_1
    //   587: aload_0
    //   588: getfield 84	com/tencent/smtt/sdk/ag:b	[Ljava/lang/String;
    //   591: ifnonnull +19 -> 610
    //   594: iload 10
    //   596: istore_1
    //   597: iload 10
    //   599: ifne +11 -> 610
    //   602: aload_0
    //   603: iconst_1
    //   604: iload 4
    //   606: invokespecial 881	com/tencent/smtt/sdk/ag:c	(ZZ)Z
    //   609: istore_1
    //   610: aload_0
    //   611: getfield 106	com/tencent/smtt/sdk/ag:v	Lcom/tencent/smtt/sdk/TbsLogReport$TbsLogInfo;
    //   614: astore 5
    //   616: iload_1
    //   617: ifeq +6086 -> 6703
    //   620: iconst_1
    //   621: istore_3
    //   622: aload 5
    //   624: iload_3
    //   625: invokevirtual 936	com/tencent/smtt/sdk/TbsLogReport$TbsLogInfo:setUnpkgFlag	(I)V
    //   628: iload 4
    //   630: ifne +6083 -> 6713
    //   633: aload_0
    //   634: getfield 106	com/tencent/smtt/sdk/ag:v	Lcom/tencent/smtt/sdk/TbsLogReport$TbsLogInfo;
    //   637: astore 5
    //   639: iload_1
    //   640: ifeq +6068 -> 6708
    //   643: iconst_1
    //   644: istore_3
    //   645: aload 5
    //   647: iload_3
    //   648: invokevirtual 939	com/tencent/smtt/sdk/TbsLogReport$TbsLogInfo:setPatchUpdateFlag	(I)V
    //   651: iload_1
    //   652: ifeq +6072 -> 6724
    //   655: aload_0
    //   656: iconst_1
    //   657: invokespecial 872	com/tencent/smtt/sdk/ag:b	(Z)V
    //   660: aload_0
    //   661: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   664: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   667: sipush -317
    //   670: invokevirtual 870	com/tencent/smtt/sdk/TbsDownloadConfig:setDownloadInterruptCode	(I)V
    //   673: aload_0
    //   674: bipush 100
    //   676: ldc_w 941
    //   679: iconst_1
    //   680: invokespecial 624	com/tencent/smtt/sdk/ag:a	(ILjava/lang/String;Z)V
    //   683: aload_0
    //   684: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   687: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   690: astore 11
    //   692: iload_1
    //   693: ifeq +6053 -> 6746
    //   696: aload 11
    //   698: getfield 305	com/tencent/smtt/sdk/TbsDownloadConfig:mPreferences	Landroid/content/SharedPreferences;
    //   701: ldc_w 943
    //   704: iconst_0
    //   705: invokeinterface 313 3 0
    //   710: istore_3
    //   711: aload 11
    //   713: getfield 436	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   716: ldc_w 943
    //   719: iload_3
    //   720: iconst_1
    //   721: iadd
    //   722: invokestatic 459	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   725: invokeinterface 450 3 0
    //   730: pop
    //   731: aload 11
    //   733: invokevirtual 462	com/tencent/smtt/sdk/TbsDownloadConfig:commit	()V
    //   736: aload_0
    //   737: getfield 106	com/tencent/smtt/sdk/ag:v	Lcom/tencent/smtt/sdk/TbsLogReport$TbsLogInfo;
    //   740: astore 5
    //   742: iload_1
    //   743: ifeq +6063 -> 6806
    //   746: iconst_1
    //   747: istore_3
    //   748: aload 5
    //   750: iload_3
    //   751: invokevirtual 946	com/tencent/smtt/sdk/TbsLogReport$TbsLogInfo:setDownFinalFlag	(I)V
    //   754: aload_0
    //   755: invokespecial 948	com/tencent/smtt/sdk/ag:g	()V
    //   758: ldc_w 888
    //   761: invokestatic 148	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   764: goto -718 -> 46
    //   767: aload_0
    //   768: getstatic 49	com/tencent/smtt/sdk/ag:d	I
    //   771: putfield 82	com/tencent/smtt/sdk/ag:B	I
    //   774: goto -254 -> 520
    //   777: invokestatic 162	java/lang/System:currentTimeMillis	()J
    //   780: lstore 12
    //   782: lload 8
    //   784: lstore 14
    //   786: iload_1
    //   787: ifne +439 -> 1226
    //   790: lload 8
    //   792: lstore 16
    //   794: iload_2
    //   795: istore 10
    //   797: lload 8
    //   799: lstore 18
    //   801: lload 12
    //   803: aload_0
    //   804: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   807: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   810: getfield 305	com/tencent/smtt/sdk/TbsDownloadConfig:mPreferences	Landroid/content/SharedPreferences;
    //   813: ldc_w 950
    //   816: lconst_0
    //   817: invokeinterface 574 4 0
    //   822: lsub
    //   823: ldc2_w 951
    //   826: lcmp
    //   827: ifle +250 -> 1077
    //   830: lload 8
    //   832: lstore 16
    //   834: iload_2
    //   835: istore 10
    //   837: lload 8
    //   839: lstore 18
    //   841: ldc 202
    //   843: ldc_w 954
    //   846: invokestatic 525	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   849: lload 8
    //   851: lstore 16
    //   853: iload_2
    //   854: istore 10
    //   856: lload 8
    //   858: lstore 18
    //   860: aload_0
    //   861: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   864: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   867: getfield 436	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   870: ldc_w 950
    //   873: lload 12
    //   875: invokestatic 959	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   878: invokeinterface 450 3 0
    //   883: pop
    //   884: lload 8
    //   886: lstore 16
    //   888: iload_2
    //   889: istore 10
    //   891: lload 8
    //   893: lstore 18
    //   895: aload_0
    //   896: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   899: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   902: getfield 436	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   905: ldc_w 933
    //   908: lconst_0
    //   909: invokestatic 959	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   912: invokeinterface 450 3 0
    //   917: pop
    //   918: lload 8
    //   920: lstore 16
    //   922: iload_2
    //   923: istore 10
    //   925: lload 8
    //   927: lstore 18
    //   929: aload_0
    //   930: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   933: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   936: invokevirtual 462	com/tencent/smtt/sdk/TbsDownloadConfig:commit	()V
    //   939: lconst_0
    //   940: lstore 20
    //   942: lload 20
    //   944: lstore 14
    //   946: lload 20
    //   948: lstore 16
    //   950: iload_2
    //   951: istore 10
    //   953: lload 20
    //   955: lstore 18
    //   957: aload_0
    //   958: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   961: invokestatic 961	com/tencent/smtt/utils/k:b	(Landroid/content/Context;)Z
    //   964: ifne +262 -> 1226
    //   967: lload 20
    //   969: lstore 16
    //   971: iload_2
    //   972: istore 10
    //   974: lload 20
    //   976: lstore 18
    //   978: ldc 202
    //   980: ldc_w 963
    //   983: iconst_1
    //   984: invokestatic 905	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;Z)V
    //   987: lload 20
    //   989: lstore 16
    //   991: iload_2
    //   992: istore 10
    //   994: lload 20
    //   996: lstore 18
    //   998: aload_0
    //   999: bipush 105
    //   1001: aconst_null
    //   1002: iconst_1
    //   1003: invokespecial 624	com/tencent/smtt/sdk/ag:a	(ILjava/lang/String;Z)V
    //   1006: lload 20
    //   1008: lstore 16
    //   1010: iload_2
    //   1011: istore 10
    //   1013: lload 20
    //   1015: lstore 18
    //   1017: aload_0
    //   1018: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   1021: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   1024: sipush -308
    //   1027: invokevirtual 870	com/tencent/smtt/sdk/TbsDownloadConfig:setDownloadInterruptCode	(I)V
    //   1030: iload_2
    //   1031: istore 10
    //   1033: iload_1
    //   1034: ifne -467 -> 567
    //   1037: aload_0
    //   1038: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   1041: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   1044: getfield 436	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   1047: ldc_w 933
    //   1050: lload 20
    //   1052: invokestatic 959	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1055: invokeinterface 450 3 0
    //   1060: pop
    //   1061: aload_0
    //   1062: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   1065: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   1068: invokevirtual 462	com/tencent/smtt/sdk/TbsDownloadConfig:commit	()V
    //   1071: iload_2
    //   1072: istore 10
    //   1074: goto -507 -> 567
    //   1077: lload 8
    //   1079: lstore 16
    //   1081: iload_2
    //   1082: istore 10
    //   1084: lload 8
    //   1086: lstore 18
    //   1088: ldc 202
    //   1090: ldc_w 965
    //   1093: lload 8
    //   1095: invokestatic 968	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   1098: invokevirtual 371	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   1101: invokestatic 525	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1104: lload 8
    //   1106: lstore 20
    //   1108: lload 8
    //   1110: lload 6
    //   1112: lcmp
    //   1113: iflt -171 -> 942
    //   1116: lload 8
    //   1118: lstore 16
    //   1120: iload_2
    //   1121: istore 10
    //   1123: lload 8
    //   1125: lstore 18
    //   1127: ldc 202
    //   1129: ldc_w 970
    //   1132: iconst_1
    //   1133: invokestatic 905	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;Z)V
    //   1136: lload 8
    //   1138: lstore 16
    //   1140: iload_2
    //   1141: istore 10
    //   1143: lload 8
    //   1145: lstore 18
    //   1147: aload_0
    //   1148: bipush 112
    //   1150: aconst_null
    //   1151: iconst_1
    //   1152: invokespecial 624	com/tencent/smtt/sdk/ag:a	(ILjava/lang/String;Z)V
    //   1155: lload 8
    //   1157: lstore 16
    //   1159: iload_2
    //   1160: istore 10
    //   1162: lload 8
    //   1164: lstore 18
    //   1166: aload_0
    //   1167: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   1170: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   1173: sipush -307
    //   1176: invokevirtual 870	com/tencent/smtt/sdk/TbsDownloadConfig:setDownloadInterruptCode	(I)V
    //   1179: iload_2
    //   1180: istore 10
    //   1182: iload_1
    //   1183: ifne -616 -> 567
    //   1186: aload_0
    //   1187: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   1190: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   1193: getfield 436	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   1196: ldc_w 933
    //   1199: lload 8
    //   1201: invokestatic 959	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1204: invokeinterface 450 3 0
    //   1209: pop
    //   1210: aload_0
    //   1211: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   1214: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   1217: invokevirtual 462	com/tencent/smtt/sdk/TbsDownloadConfig:commit	()V
    //   1220: iload_2
    //   1221: istore 10
    //   1223: goto -656 -> 567
    //   1226: lload 14
    //   1228: lstore 16
    //   1230: iload_2
    //   1231: istore 10
    //   1233: lload 14
    //   1235: lstore 18
    //   1237: aload_0
    //   1238: iconst_1
    //   1239: putfield 642	com/tencent/smtt/sdk/ag:y	Z
    //   1242: lload 14
    //   1244: lstore 16
    //   1246: iload_2
    //   1247: istore 10
    //   1249: lload 14
    //   1251: lstore 18
    //   1253: aload_0
    //   1254: getfield 634	com/tencent/smtt/sdk/ag:j	Ljava/lang/String;
    //   1257: ifnull +878 -> 2135
    //   1260: lload 14
    //   1262: lstore 16
    //   1264: iload_2
    //   1265: istore 10
    //   1267: lload 14
    //   1269: lstore 18
    //   1271: aload_0
    //   1272: getfield 634	com/tencent/smtt/sdk/ag:j	Ljava/lang/String;
    //   1275: astore 5
    //   1277: lload 14
    //   1279: lstore 16
    //   1281: iload_2
    //   1282: istore 10
    //   1284: lload 14
    //   1286: lstore 18
    //   1288: new 113	java/lang/StringBuilder
    //   1291: astore 11
    //   1293: lload 14
    //   1295: lstore 16
    //   1297: iload_2
    //   1298: istore 10
    //   1300: lload 14
    //   1302: lstore 18
    //   1304: aload 11
    //   1306: ldc_w 972
    //   1309: invokespecial 118	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1312: lload 14
    //   1314: lstore 16
    //   1316: iload_2
    //   1317: istore 10
    //   1319: lload 14
    //   1321: lstore 18
    //   1323: ldc 202
    //   1325: aload 11
    //   1327: aload 5
    //   1329: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1332: ldc_w 974
    //   1335: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1338: aload_0
    //   1339: getfield 267	com/tencent/smtt/sdk/ag:p	I
    //   1342: invokevirtual 594	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1345: invokevirtual 129	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1348: iconst_1
    //   1349: invokestatic 905	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;Z)V
    //   1352: lload 14
    //   1354: lstore 16
    //   1356: iload_2
    //   1357: istore 10
    //   1359: lload 14
    //   1361: lstore 18
    //   1363: aload 5
    //   1365: aload_0
    //   1366: getfield 976	com/tencent/smtt/sdk/ag:i	Ljava/lang/String;
    //   1369: invokevirtual 554	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1372: ifne +23 -> 1395
    //   1375: lload 14
    //   1377: lstore 16
    //   1379: iload_2
    //   1380: istore 10
    //   1382: lload 14
    //   1384: lstore 18
    //   1386: aload_0
    //   1387: getfield 106	com/tencent/smtt/sdk/ag:v	Lcom/tencent/smtt/sdk/TbsLogReport$TbsLogInfo;
    //   1390: aload 5
    //   1392: invokevirtual 979	com/tencent/smtt/sdk/TbsLogReport$TbsLogInfo:setDownloadUrl	(Ljava/lang/String;)V
    //   1395: lload 14
    //   1397: lstore 16
    //   1399: iload_2
    //   1400: istore 10
    //   1402: lload 14
    //   1404: lstore 18
    //   1406: aload_0
    //   1407: aload 5
    //   1409: putfield 976	com/tencent/smtt/sdk/ag:i	Ljava/lang/String;
    //   1412: lload 14
    //   1414: lstore 16
    //   1416: iload_2
    //   1417: istore 10
    //   1419: lload 14
    //   1421: lstore 18
    //   1423: aload_0
    //   1424: aload 5
    //   1426: invokespecial 981	com/tencent/smtt/sdk/ag:a	(Ljava/lang/String;)V
    //   1429: lconst_0
    //   1430: lstore 8
    //   1432: lload 14
    //   1434: lstore 16
    //   1436: iload_2
    //   1437: istore 10
    //   1439: lload 14
    //   1441: lstore 18
    //   1443: aload_0
    //   1444: getfield 636	com/tencent/smtt/sdk/ag:o	Z
    //   1447: ifne +182 -> 1629
    //   1450: lload 14
    //   1452: lstore 16
    //   1454: iload_2
    //   1455: istore 10
    //   1457: lload 14
    //   1459: lstore 18
    //   1461: aload_0
    //   1462: invokespecial 983	com/tencent/smtt/sdk/ag:k	()J
    //   1465: lstore 8
    //   1467: lload 14
    //   1469: lstore 16
    //   1471: iload_2
    //   1472: istore 10
    //   1474: lload 14
    //   1476: lstore 18
    //   1478: ldc 202
    //   1480: ldc_w 985
    //   1483: lload 8
    //   1485: invokestatic 968	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   1488: invokevirtual 371	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   1491: invokestatic 525	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1494: lload 14
    //   1496: lstore 16
    //   1498: iload_2
    //   1499: istore 10
    //   1501: lload 14
    //   1503: lstore 18
    //   1505: aload_0
    //   1506: getfield 632	com/tencent/smtt/sdk/ag:l	J
    //   1509: lconst_0
    //   1510: lcmp
    //   1511: ifgt +644 -> 2155
    //   1514: lload 14
    //   1516: lstore 16
    //   1518: iload_2
    //   1519: istore 10
    //   1521: lload 14
    //   1523: lstore 18
    //   1525: ldc 202
    //   1527: ldc_w 987
    //   1530: lload 8
    //   1532: invokestatic 968	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   1535: invokevirtual 371	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   1538: iconst_1
    //   1539: invokestatic 905	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;Z)V
    //   1542: lload 14
    //   1544: lstore 16
    //   1546: iload_2
    //   1547: istore 10
    //   1549: lload 14
    //   1551: lstore 18
    //   1553: aload_0
    //   1554: getfield 382	com/tencent/smtt/sdk/ag:t	Ljava/net/HttpURLConnection;
    //   1557: astore 11
    //   1559: lload 14
    //   1561: lstore 16
    //   1563: iload_2
    //   1564: istore 10
    //   1566: lload 14
    //   1568: lstore 18
    //   1570: new 113	java/lang/StringBuilder
    //   1573: astore 5
    //   1575: lload 14
    //   1577: lstore 16
    //   1579: iload_2
    //   1580: istore 10
    //   1582: lload 14
    //   1584: lstore 18
    //   1586: aload 5
    //   1588: ldc_w 989
    //   1591: invokespecial 118	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1594: lload 14
    //   1596: lstore 16
    //   1598: iload_2
    //   1599: istore 10
    //   1601: lload 14
    //   1603: lstore 18
    //   1605: aload 11
    //   1607: ldc_w 991
    //   1610: aload 5
    //   1612: lload 8
    //   1614: invokevirtual 583	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1617: ldc_w 993
    //   1620: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1623: invokevirtual 129	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1626: invokevirtual 399	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   1629: lload 14
    //   1631: lstore 16
    //   1633: iload_2
    //   1634: istore 10
    //   1636: lload 14
    //   1638: lstore 18
    //   1640: aload_0
    //   1641: getfield 106	com/tencent/smtt/sdk/ag:v	Lcom/tencent/smtt/sdk/TbsLogReport$TbsLogInfo;
    //   1644: astore 5
    //   1646: lload 8
    //   1648: lconst_0
    //   1649: lcmp
    //   1650: ifne +862 -> 2512
    //   1653: iconst_0
    //   1654: istore_3
    //   1655: lload 14
    //   1657: lstore 16
    //   1659: iload_2
    //   1660: istore 10
    //   1662: lload 14
    //   1664: lstore 18
    //   1666: aload 5
    //   1668: iload_3
    //   1669: invokevirtual 996	com/tencent/smtt/sdk/TbsLogReport$TbsLogInfo:setDownloadCancel	(I)V
    //   1672: lload 14
    //   1674: lstore 16
    //   1676: iload_2
    //   1677: istore 10
    //   1679: lload 14
    //   1681: lstore 18
    //   1683: aload_0
    //   1684: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   1687: invokestatic 668	com/tencent/smtt/utils/Apn:getApnType	(Landroid/content/Context;)I
    //   1690: istore_3
    //   1691: lload 14
    //   1693: lstore 16
    //   1695: iload_2
    //   1696: istore 10
    //   1698: lload 14
    //   1700: lstore 18
    //   1702: aload_0
    //   1703: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   1706: invokestatic 664	com/tencent/smtt/utils/Apn:getApnInfo	(Landroid/content/Context;)Ljava/lang/String;
    //   1709: astore 5
    //   1711: lload 14
    //   1713: lstore 16
    //   1715: iload_2
    //   1716: istore 10
    //   1718: lload 14
    //   1720: lstore 18
    //   1722: aload_0
    //   1723: getfield 152	com/tencent/smtt/sdk/ag:w	Ljava/lang/String;
    //   1726: ifnonnull +791 -> 2517
    //   1729: lload 14
    //   1731: lstore 16
    //   1733: iload_2
    //   1734: istore 10
    //   1736: lload 14
    //   1738: lstore 18
    //   1740: aload_0
    //   1741: getfield 154	com/tencent/smtt/sdk/ag:x	I
    //   1744: iconst_m1
    //   1745: if_icmpne +772 -> 2517
    //   1748: lload 14
    //   1750: lstore 16
    //   1752: iload_2
    //   1753: istore 10
    //   1755: lload 14
    //   1757: lstore 18
    //   1759: aload_0
    //   1760: aload 5
    //   1762: putfield 152	com/tencent/smtt/sdk/ag:w	Ljava/lang/String;
    //   1765: lload 14
    //   1767: lstore 16
    //   1769: iload_2
    //   1770: istore 10
    //   1772: lload 14
    //   1774: lstore 18
    //   1776: aload_0
    //   1777: iload_3
    //   1778: putfield 154	com/tencent/smtt/sdk/ag:x	I
    //   1781: lload 14
    //   1783: lstore 16
    //   1785: iload_2
    //   1786: istore 10
    //   1788: lload 14
    //   1790: lstore 18
    //   1792: aload_0
    //   1793: getfield 267	com/tencent/smtt/sdk/ag:p	I
    //   1796: ifle +28 -> 1824
    //   1799: lload 14
    //   1801: lstore 16
    //   1803: iload_2
    //   1804: istore 10
    //   1806: lload 14
    //   1808: lstore 18
    //   1810: aload_0
    //   1811: getfield 382	com/tencent/smtt/sdk/ag:t	Ljava/net/HttpURLConnection;
    //   1814: ldc_w 998
    //   1817: aload_0
    //   1818: getfield 898	com/tencent/smtt/sdk/ag:h	Ljava/lang/String;
    //   1821: invokevirtual 1001	java/net/HttpURLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   1824: lload 14
    //   1826: lstore 16
    //   1828: iload_2
    //   1829: istore 10
    //   1831: lload 14
    //   1833: lstore 18
    //   1835: aload_0
    //   1836: getfield 382	com/tencent/smtt/sdk/ag:t	Ljava/net/HttpURLConnection;
    //   1839: invokevirtual 783	java/net/HttpURLConnection:getResponseCode	()I
    //   1842: istore_3
    //   1843: lload 14
    //   1845: lstore 16
    //   1847: iload_2
    //   1848: istore 10
    //   1850: lload 14
    //   1852: lstore 18
    //   1854: ldc 202
    //   1856: ldc_w 1003
    //   1859: iload_3
    //   1860: invokestatic 367	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   1863: invokevirtual 371	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   1866: invokestatic 525	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1869: lload 14
    //   1871: lstore 16
    //   1873: iload_2
    //   1874: istore 10
    //   1876: lload 14
    //   1878: lstore 18
    //   1880: aload_0
    //   1881: getfield 106	com/tencent/smtt/sdk/ag:v	Lcom/tencent/smtt/sdk/TbsLogReport$TbsLogInfo;
    //   1884: iload_3
    //   1885: invokevirtual 1006	com/tencent/smtt/sdk/TbsLogReport$TbsLogInfo:setHttpCode	(I)V
    //   1888: iload_1
    //   1889: ifne +157 -> 2046
    //   1892: lload 14
    //   1894: lstore 16
    //   1896: iload_2
    //   1897: istore 10
    //   1899: lload 14
    //   1901: lstore 18
    //   1903: aload_0
    //   1904: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   1907: invokestatic 221	com/tencent/smtt/sdk/TbsDownloader:getOverSea	(Landroid/content/Context;)Z
    //   1910: ifne +136 -> 2046
    //   1913: lload 14
    //   1915: lstore 16
    //   1917: iload_2
    //   1918: istore 10
    //   1920: lload 14
    //   1922: lstore 18
    //   1924: aload_0
    //   1925: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   1928: invokestatic 668	com/tencent/smtt/utils/Apn:getApnType	(Landroid/content/Context;)I
    //   1931: iconst_3
    //   1932: if_icmpeq +20 -> 1952
    //   1935: lload 14
    //   1937: lstore 16
    //   1939: iload_2
    //   1940: istore 10
    //   1942: lload 14
    //   1944: lstore 18
    //   1946: invokestatic 852	com/tencent/smtt/sdk/QbSdk:getDownloadWithoutWifi	()Z
    //   1949: ifeq +24 -> 1973
    //   1952: lload 14
    //   1954: lstore 16
    //   1956: iload_2
    //   1957: istore 10
    //   1959: lload 14
    //   1961: lstore 18
    //   1963: aload_0
    //   1964: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   1967: invokestatic 668	com/tencent/smtt/utils/Apn:getApnType	(Landroid/content/Context;)I
    //   1970: ifne +76 -> 2046
    //   1973: lload 14
    //   1975: lstore 16
    //   1977: iload_2
    //   1978: istore 10
    //   1980: lload 14
    //   1982: lstore 18
    //   1984: aload_0
    //   1985: invokevirtual 1008	com/tencent/smtt/sdk/ag:c	()V
    //   1988: lload 14
    //   1990: lstore 16
    //   1992: iload_2
    //   1993: istore 10
    //   1995: lload 14
    //   1997: lstore 18
    //   1999: getstatic 467	com/tencent/smtt/sdk/QbSdk:m	Lcom/tencent/smtt/sdk/TbsListener;
    //   2002: ifnull +24 -> 2026
    //   2005: lload 14
    //   2007: lstore 16
    //   2009: iload_2
    //   2010: istore 10
    //   2012: lload 14
    //   2014: lstore 18
    //   2016: getstatic 467	com/tencent/smtt/sdk/QbSdk:m	Lcom/tencent/smtt/sdk/TbsListener;
    //   2019: bipush 111
    //   2021: invokeinterface 472 2 0
    //   2026: lload 14
    //   2028: lstore 16
    //   2030: iload_2
    //   2031: istore 10
    //   2033: lload 14
    //   2035: lstore 18
    //   2037: ldc 202
    //   2039: ldc_w 1010
    //   2042: iconst_0
    //   2043: invokestatic 905	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;Z)V
    //   2046: lload 14
    //   2048: lstore 16
    //   2050: iload_2
    //   2051: istore 10
    //   2053: lload 14
    //   2055: lstore 18
    //   2057: aload_0
    //   2058: getfield 638	com/tencent/smtt/sdk/ag:r	Z
    //   2061: ifeq +606 -> 2667
    //   2064: lload 14
    //   2066: lstore 16
    //   2068: iload_2
    //   2069: istore 10
    //   2071: lload 14
    //   2073: lstore 18
    //   2075: aload_0
    //   2076: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   2079: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   2082: sipush -309
    //   2085: invokevirtual 870	com/tencent/smtt/sdk/TbsDownloadConfig:setDownloadInterruptCode	(I)V
    //   2088: iload_2
    //   2089: istore 10
    //   2091: iload_1
    //   2092: ifne -1525 -> 567
    //   2095: aload_0
    //   2096: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   2099: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   2102: getfield 436	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   2105: ldc_w 933
    //   2108: lload 14
    //   2110: invokestatic 959	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   2113: invokeinterface 450 3 0
    //   2118: pop
    //   2119: aload_0
    //   2120: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   2123: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   2126: invokevirtual 462	com/tencent/smtt/sdk/TbsDownloadConfig:commit	()V
    //   2129: iload_2
    //   2130: istore 10
    //   2132: goto -1565 -> 567
    //   2135: lload 14
    //   2137: lstore 16
    //   2139: iload_2
    //   2140: istore 10
    //   2142: lload 14
    //   2144: lstore 18
    //   2146: aload_0
    //   2147: getfield 898	com/tencent/smtt/sdk/ag:h	Ljava/lang/String;
    //   2150: astore 5
    //   2152: goto -875 -> 1277
    //   2155: lload 14
    //   2157: lstore 16
    //   2159: iload_2
    //   2160: istore 10
    //   2162: lload 14
    //   2164: lstore 18
    //   2166: new 113	java/lang/StringBuilder
    //   2169: astore 5
    //   2171: lload 14
    //   2173: lstore 16
    //   2175: iload_2
    //   2176: istore 10
    //   2178: lload 14
    //   2180: lstore 18
    //   2182: aload 5
    //   2184: ldc_w 1012
    //   2187: invokespecial 118	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2190: lload 14
    //   2192: lstore 16
    //   2194: iload_2
    //   2195: istore 10
    //   2197: lload 14
    //   2199: lstore 18
    //   2201: ldc 202
    //   2203: aload 5
    //   2205: lload 8
    //   2207: invokevirtual 583	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   2210: ldc_w 1014
    //   2213: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2216: aload_0
    //   2217: getfield 632	com/tencent/smtt/sdk/ag:l	J
    //   2220: invokevirtual 583	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   2223: invokevirtual 129	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2226: iconst_1
    //   2227: invokestatic 905	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;Z)V
    //   2230: lload 14
    //   2232: lstore 16
    //   2234: iload_2
    //   2235: istore 10
    //   2237: lload 14
    //   2239: lstore 18
    //   2241: aload_0
    //   2242: getfield 382	com/tencent/smtt/sdk/ag:t	Ljava/net/HttpURLConnection;
    //   2245: astore 11
    //   2247: lload 14
    //   2249: lstore 16
    //   2251: iload_2
    //   2252: istore 10
    //   2254: lload 14
    //   2256: lstore 18
    //   2258: new 113	java/lang/StringBuilder
    //   2261: astore 5
    //   2263: lload 14
    //   2265: lstore 16
    //   2267: iload_2
    //   2268: istore 10
    //   2270: lload 14
    //   2272: lstore 18
    //   2274: aload 5
    //   2276: ldc_w 989
    //   2279: invokespecial 118	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2282: lload 14
    //   2284: lstore 16
    //   2286: iload_2
    //   2287: istore 10
    //   2289: lload 14
    //   2291: lstore 18
    //   2293: aload 11
    //   2295: ldc_w 991
    //   2298: aload 5
    //   2300: lload 8
    //   2302: invokevirtual 583	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   2305: ldc_w 993
    //   2308: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2311: aload_0
    //   2312: getfield 632	com/tencent/smtt/sdk/ag:l	J
    //   2315: invokevirtual 583	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   2318: invokevirtual 129	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2321: invokevirtual 399	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   2324: goto -695 -> 1629
    //   2327: astore 5
    //   2329: iload 10
    //   2331: istore 22
    //   2333: lload 16
    //   2335: lstore 18
    //   2337: aload 5
    //   2339: instanceof 1016
    //   2342: ifeq +4258 -> 6600
    //   2345: iload_1
    //   2346: ifne +4254 -> 6600
    //   2349: lload 16
    //   2351: lstore 18
    //   2353: aload_0
    //   2354: getfield 84	com/tencent/smtt/sdk/ag:b	[Ljava/lang/String;
    //   2357: ifnull +4243 -> 6600
    //   2360: lload 16
    //   2362: lstore 18
    //   2364: aload_0
    //   2365: iconst_0
    //   2366: invokevirtual 1018	com/tencent/smtt/sdk/ag:a	(Z)Z
    //   2369: ifeq +4231 -> 6600
    //   2372: lload 16
    //   2374: lstore 18
    //   2376: new 113	java/lang/StringBuilder
    //   2379: astore 11
    //   2381: lload 16
    //   2383: lstore 18
    //   2385: aload 11
    //   2387: ldc_w 1020
    //   2390: invokespecial 118	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2393: lload 16
    //   2395: lstore 18
    //   2397: ldc 202
    //   2399: aload 11
    //   2401: aload_0
    //   2402: getfield 634	com/tencent/smtt/sdk/ag:j	Ljava/lang/String;
    //   2405: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2408: ldc_w 1022
    //   2411: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2414: aload 5
    //   2416: invokevirtual 421	java/lang/Throwable:toString	()Ljava/lang/String;
    //   2419: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2422: invokevirtual 129	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2425: invokestatic 212	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   2428: lload 16
    //   2430: lstore 18
    //   2432: aload_0
    //   2433: bipush 125
    //   2435: aconst_null
    //   2436: iconst_1
    //   2437: invokespecial 624	com/tencent/smtt/sdk/ag:a	(ILjava/lang/String;Z)V
    //   2440: lload 16
    //   2442: lstore 18
    //   2444: aload_0
    //   2445: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   2448: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   2451: sipush -316
    //   2454: invokevirtual 870	com/tencent/smtt/sdk/TbsDownloadConfig:setDownloadInterruptCode	(I)V
    //   2457: lload 16
    //   2459: lstore 8
    //   2461: iload 22
    //   2463: istore_2
    //   2464: iload_1
    //   2465: ifne -1945 -> 520
    //   2468: aload_0
    //   2469: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   2472: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   2475: getfield 436	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   2478: ldc_w 933
    //   2481: lload 16
    //   2483: invokestatic 959	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   2486: invokeinterface 450 3 0
    //   2491: pop
    //   2492: aload_0
    //   2493: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   2496: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   2499: invokevirtual 462	com/tencent/smtt/sdk/TbsDownloadConfig:commit	()V
    //   2502: lload 16
    //   2504: lstore 8
    //   2506: iload 22
    //   2508: istore_2
    //   2509: goto -1989 -> 520
    //   2512: iconst_1
    //   2513: istore_3
    //   2514: goto -859 -> 1655
    //   2517: lload 14
    //   2519: lstore 16
    //   2521: iload_2
    //   2522: istore 10
    //   2524: lload 14
    //   2526: lstore 18
    //   2528: iload_3
    //   2529: aload_0
    //   2530: getfield 154	com/tencent/smtt/sdk/ag:x	I
    //   2533: if_icmpne +26 -> 2559
    //   2536: lload 14
    //   2538: lstore 16
    //   2540: iload_2
    //   2541: istore 10
    //   2543: lload 14
    //   2545: lstore 18
    //   2547: aload 5
    //   2549: aload_0
    //   2550: getfield 152	com/tencent/smtt/sdk/ag:w	Ljava/lang/String;
    //   2553: invokevirtual 554	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   2556: ifne -775 -> 1781
    //   2559: lload 14
    //   2561: lstore 16
    //   2563: iload_2
    //   2564: istore 10
    //   2566: lload 14
    //   2568: lstore 18
    //   2570: aload_0
    //   2571: getfield 106	com/tencent/smtt/sdk/ag:v	Lcom/tencent/smtt/sdk/TbsLogReport$TbsLogInfo;
    //   2574: iconst_0
    //   2575: invokevirtual 677	com/tencent/smtt/sdk/TbsLogReport$TbsLogInfo:setNetworkChange	(I)V
    //   2578: lload 14
    //   2580: lstore 16
    //   2582: iload_2
    //   2583: istore 10
    //   2585: lload 14
    //   2587: lstore 18
    //   2589: aload_0
    //   2590: aload 5
    //   2592: putfield 152	com/tencent/smtt/sdk/ag:w	Ljava/lang/String;
    //   2595: lload 14
    //   2597: lstore 16
    //   2599: iload_2
    //   2600: istore 10
    //   2602: lload 14
    //   2604: lstore 18
    //   2606: aload_0
    //   2607: iload_3
    //   2608: putfield 154	com/tencent/smtt/sdk/ag:x	I
    //   2611: goto -830 -> 1781
    //   2614: astore 5
    //   2616: lload 18
    //   2618: lstore 14
    //   2620: iload_1
    //   2621: ifne +37 -> 2658
    //   2624: aload_0
    //   2625: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   2628: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   2631: getfield 436	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   2634: ldc_w 933
    //   2637: lload 14
    //   2639: invokestatic 959	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   2642: invokeinterface 450 3 0
    //   2647: pop
    //   2648: aload_0
    //   2649: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   2652: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   2655: invokevirtual 462	com/tencent/smtt/sdk/TbsDownloadConfig:commit	()V
    //   2658: ldc_w 888
    //   2661: invokestatic 148	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   2664: aload 5
    //   2666: athrow
    //   2667: iload_3
    //   2668: sipush 200
    //   2671: if_icmpeq +10 -> 2681
    //   2674: iload_3
    //   2675: sipush 206
    //   2678: if_icmpne +2735 -> 5413
    //   2681: lload 14
    //   2683: lstore 16
    //   2685: iload_2
    //   2686: istore 10
    //   2688: lload 14
    //   2690: lstore 18
    //   2692: aload_0
    //   2693: aload_0
    //   2694: getfield 382	com/tencent/smtt/sdk/ag:t	Ljava/net/HttpURLConnection;
    //   2697: invokevirtual 1025	java/net/HttpURLConnection:getContentLength	()I
    //   2700: i2l
    //   2701: lload 8
    //   2703: ladd
    //   2704: putfield 632	com/tencent/smtt/sdk/ag:l	J
    //   2707: lload 14
    //   2709: lstore 16
    //   2711: iload_2
    //   2712: istore 10
    //   2714: lload 14
    //   2716: lstore 18
    //   2718: new 113	java/lang/StringBuilder
    //   2721: astore 5
    //   2723: lload 14
    //   2725: lstore 16
    //   2727: iload_2
    //   2728: istore 10
    //   2730: lload 14
    //   2732: lstore 18
    //   2734: aload 5
    //   2736: ldc_w 1027
    //   2739: invokespecial 118	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2742: lload 14
    //   2744: lstore 16
    //   2746: iload_2
    //   2747: istore 10
    //   2749: lload 14
    //   2751: lstore 18
    //   2753: ldc 202
    //   2755: aload 5
    //   2757: aload_0
    //   2758: getfield 632	com/tencent/smtt/sdk/ag:l	J
    //   2761: invokevirtual 583	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   2764: invokevirtual 129	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2767: invokestatic 525	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   2770: lload 14
    //   2772: lstore 16
    //   2774: iload_2
    //   2775: istore 10
    //   2777: lload 14
    //   2779: lstore 18
    //   2781: aload_0
    //   2782: getfield 106	com/tencent/smtt/sdk/ag:v	Lcom/tencent/smtt/sdk/TbsLogReport$TbsLogInfo;
    //   2785: aload_0
    //   2786: getfield 632	com/tencent/smtt/sdk/ag:l	J
    //   2789: invokevirtual 1030	com/tencent/smtt/sdk/TbsLogReport$TbsLogInfo:setPkgSize	(J)V
    //   2792: lload 14
    //   2794: lstore 16
    //   2796: iload_2
    //   2797: istore 10
    //   2799: lload 14
    //   2801: lstore 18
    //   2803: aload_0
    //   2804: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   2807: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   2810: getfield 305	com/tencent/smtt/sdk/TbsDownloadConfig:mPreferences	Landroid/content/SharedPreferences;
    //   2813: ldc_w 570
    //   2816: lconst_0
    //   2817: invokeinterface 574 4 0
    //   2822: lstore 20
    //   2824: lload 20
    //   2826: lconst_0
    //   2827: lcmp
    //   2828: ifeq +444 -> 3272
    //   2831: lload 14
    //   2833: lstore 16
    //   2835: iload_2
    //   2836: istore 10
    //   2838: lload 14
    //   2840: lstore 18
    //   2842: aload_0
    //   2843: getfield 632	com/tencent/smtt/sdk/ag:l	J
    //   2846: lload 20
    //   2848: lcmp
    //   2849: ifeq +423 -> 3272
    //   2852: lload 14
    //   2854: lstore 16
    //   2856: iload_2
    //   2857: istore 10
    //   2859: lload 14
    //   2861: lstore 18
    //   2863: new 113	java/lang/StringBuilder
    //   2866: astore 5
    //   2868: lload 14
    //   2870: lstore 16
    //   2872: iload_2
    //   2873: istore 10
    //   2875: lload 14
    //   2877: lstore 18
    //   2879: aload 5
    //   2881: ldc_w 1032
    //   2884: invokespecial 118	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2887: lload 14
    //   2889: lstore 16
    //   2891: iload_2
    //   2892: istore 10
    //   2894: lload 14
    //   2896: lstore 18
    //   2898: ldc 202
    //   2900: aload 5
    //   2902: lload 20
    //   2904: invokevirtual 583	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   2907: ldc_w 1034
    //   2910: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2913: aload_0
    //   2914: getfield 632	com/tencent/smtt/sdk/ag:l	J
    //   2917: invokevirtual 583	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   2920: invokevirtual 129	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2923: iconst_1
    //   2924: invokestatic 905	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;Z)V
    //   2927: iload_1
    //   2928: ifne +296 -> 3224
    //   2931: lload 14
    //   2933: lstore 16
    //   2935: iload_2
    //   2936: istore 10
    //   2938: lload 14
    //   2940: lstore 18
    //   2942: aload_0
    //   2943: invokespecial 425	com/tencent/smtt/sdk/ag:n	()Z
    //   2946: ifne +41 -> 2987
    //   2949: lload 14
    //   2951: lstore 16
    //   2953: iload_2
    //   2954: istore 10
    //   2956: lload 14
    //   2958: lstore 18
    //   2960: invokestatic 852	com/tencent/smtt/sdk/QbSdk:getDownloadWithoutWifi	()Z
    //   2963: ifeq +261 -> 3224
    //   2966: lload 14
    //   2968: lstore 16
    //   2970: iload_2
    //   2971: istore 10
    //   2973: lload 14
    //   2975: lstore 18
    //   2977: aload_0
    //   2978: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   2981: invokestatic 683	com/tencent/smtt/utils/Apn:isNetworkAvailable	(Landroid/content/Context;)Z
    //   2984: ifeq +240 -> 3224
    //   2987: lload 14
    //   2989: lstore 16
    //   2991: iload_2
    //   2992: istore 10
    //   2994: lload 14
    //   2996: lstore 18
    //   2998: aload_0
    //   2999: getfield 84	com/tencent/smtt/sdk/ag:b	[Ljava/lang/String;
    //   3002: ifnull +75 -> 3077
    //   3005: lload 14
    //   3007: lstore 16
    //   3009: iload_2
    //   3010: istore 10
    //   3012: lload 14
    //   3014: lstore 18
    //   3016: aload_0
    //   3017: iconst_0
    //   3018: invokevirtual 1018	com/tencent/smtt/sdk/ag:a	(Z)Z
    //   3021: istore 22
    //   3023: iload 22
    //   3025: ifeq +52 -> 3077
    //   3028: lload 14
    //   3030: lstore 8
    //   3032: iload_1
    //   3033: ifne -2513 -> 520
    //   3036: aload_0
    //   3037: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   3040: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   3043: getfield 436	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   3046: ldc_w 933
    //   3049: lload 14
    //   3051: invokestatic 959	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   3054: invokeinterface 450 3 0
    //   3059: pop
    //   3060: aload_0
    //   3061: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   3064: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   3067: invokevirtual 462	com/tencent/smtt/sdk/TbsDownloadConfig:commit	()V
    //   3070: lload 14
    //   3072: lstore 8
    //   3074: goto -2554 -> 520
    //   3077: lload 14
    //   3079: lstore 16
    //   3081: iload_2
    //   3082: istore 10
    //   3084: lload 14
    //   3086: lstore 18
    //   3088: new 113	java/lang/StringBuilder
    //   3091: astore 5
    //   3093: lload 14
    //   3095: lstore 16
    //   3097: iload_2
    //   3098: istore 10
    //   3100: lload 14
    //   3102: lstore 18
    //   3104: aload 5
    //   3106: ldc_w 1036
    //   3109: invokespecial 118	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   3112: lload 14
    //   3114: lstore 16
    //   3116: iload_2
    //   3117: istore 10
    //   3119: lload 14
    //   3121: lstore 18
    //   3123: aload_0
    //   3124: bipush 113
    //   3126: aload 5
    //   3128: lload 20
    //   3130: invokevirtual 583	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   3133: ldc_w 1034
    //   3136: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3139: aload_0
    //   3140: getfield 632	com/tencent/smtt/sdk/ag:l	J
    //   3143: invokevirtual 583	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   3146: invokevirtual 129	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   3149: iconst_1
    //   3150: invokespecial 624	com/tencent/smtt/sdk/ag:a	(ILjava/lang/String;Z)V
    //   3153: lload 14
    //   3155: lstore 16
    //   3157: iload_2
    //   3158: istore 10
    //   3160: lload 14
    //   3162: lstore 18
    //   3164: aload_0
    //   3165: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   3168: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   3171: sipush -310
    //   3174: invokevirtual 870	com/tencent/smtt/sdk/TbsDownloadConfig:setDownloadInterruptCode	(I)V
    //   3177: iload_2
    //   3178: istore 10
    //   3180: iload_1
    //   3181: ifne -2614 -> 567
    //   3184: aload_0
    //   3185: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   3188: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   3191: getfield 436	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   3194: ldc_w 933
    //   3197: lload 14
    //   3199: invokestatic 959	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   3202: invokeinterface 450 3 0
    //   3207: pop
    //   3208: aload_0
    //   3209: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   3212: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   3215: invokevirtual 462	com/tencent/smtt/sdk/TbsDownloadConfig:commit	()V
    //   3218: iload_2
    //   3219: istore 10
    //   3221: goto -2654 -> 567
    //   3224: lload 14
    //   3226: lstore 16
    //   3228: iload_2
    //   3229: istore 10
    //   3231: lload 14
    //   3233: lstore 18
    //   3235: aload_0
    //   3236: bipush 101
    //   3238: ldc_w 1038
    //   3241: iconst_1
    //   3242: invokespecial 624	com/tencent/smtt/sdk/ag:a	(ILjava/lang/String;Z)V
    //   3245: lload 14
    //   3247: lstore 16
    //   3249: iload_2
    //   3250: istore 10
    //   3252: lload 14
    //   3254: lstore 18
    //   3256: aload_0
    //   3257: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   3260: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   3263: sipush -304
    //   3266: invokevirtual 870	com/tencent/smtt/sdk/TbsDownloadConfig:setDownloadInterruptCode	(I)V
    //   3269: goto -92 -> 3177
    //   3272: aconst_null
    //   3273: astore 23
    //   3275: aconst_null
    //   3276: astore 5
    //   3278: aconst_null
    //   3279: astore 24
    //   3281: lload 14
    //   3283: lstore 16
    //   3285: iload_2
    //   3286: istore 10
    //   3288: lload 14
    //   3290: lstore 18
    //   3292: ldc 202
    //   3294: ldc_w 1040
    //   3297: invokestatic 525	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   3300: aload_0
    //   3301: getfield 382	com/tencent/smtt/sdk/ag:t	Ljava/net/HttpURLConnection;
    //   3304: invokevirtual 780	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   3307: astore 11
    //   3309: aload 11
    //   3311: ifnull +1598 -> 4909
    //   3314: aload_0
    //   3315: getfield 382	com/tencent/smtt/sdk/ag:t	Ljava/net/HttpURLConnection;
    //   3318: invokevirtual 1043	java/net/HttpURLConnection:getContentEncoding	()Ljava/lang/String;
    //   3321: astore 5
    //   3323: aload 5
    //   3325: ifnull +284 -> 3609
    //   3328: aload 5
    //   3330: ldc_w 1045
    //   3333: invokevirtual 335	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   3336: ifeq +273 -> 3609
    //   3339: new 1047	java/util/zip/GZIPInputStream
    //   3342: astore 5
    //   3344: aload 5
    //   3346: aload 11
    //   3348: invokespecial 1048	java/util/zip/GZIPInputStream:<init>	(Ljava/io/InputStream;)V
    //   3351: sipush 8192
    //   3354: newarray byte
    //   3356: astore 24
    //   3358: new 1050	java/io/FileOutputStream
    //   3361: astore 25
    //   3363: new 184	java/io/File
    //   3366: astore 26
    //   3368: aload 26
    //   3370: aload_0
    //   3371: getfield 141	com/tencent/smtt/sdk/ag:k	Ljava/io/File;
    //   3374: ldc_w 530
    //   3377: invokespecial 226	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   3380: aload 25
    //   3382: aload 26
    //   3384: iconst_1
    //   3385: invokespecial 1053	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   3388: lload 14
    //   3390: lstore 20
    //   3392: lload 14
    //   3394: lstore 18
    //   3396: invokestatic 162	java/lang/System:currentTimeMillis	()J
    //   3399: lstore 16
    //   3401: iconst_0
    //   3402: istore_3
    //   3403: lload 8
    //   3405: lstore 27
    //   3407: iload_2
    //   3408: istore 10
    //   3410: lload 14
    //   3412: lstore 20
    //   3414: iload_2
    //   3415: istore 29
    //   3417: lload 14
    //   3419: lstore 30
    //   3421: aload_0
    //   3422: getfield 638	com/tencent/smtt/sdk/ag:r	Z
    //   3425: ifeq +401 -> 3826
    //   3428: iload_2
    //   3429: istore 10
    //   3431: lload 14
    //   3433: lstore 20
    //   3435: iload_2
    //   3436: istore 29
    //   3438: lload 14
    //   3440: lstore 30
    //   3442: ldc 202
    //   3444: ldc_w 1055
    //   3447: iconst_1
    //   3448: invokestatic 905	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;Z)V
    //   3451: iload_2
    //   3452: istore 10
    //   3454: lload 14
    //   3456: lstore 20
    //   3458: iload_2
    //   3459: istore 29
    //   3461: lload 14
    //   3463: lstore 30
    //   3465: aload_0
    //   3466: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   3469: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   3472: sipush -309
    //   3475: invokevirtual 870	com/tencent/smtt/sdk/TbsDownloadConfig:setDownloadInterruptCode	(I)V
    //   3478: iload_2
    //   3479: istore 22
    //   3481: lload 14
    //   3483: lstore 8
    //   3485: iload 22
    //   3487: istore_2
    //   3488: aload 5
    //   3490: astore 26
    //   3492: aload 25
    //   3494: astore 24
    //   3496: iload_3
    //   3497: ifeq +1422 -> 4919
    //   3500: lload 14
    //   3502: lstore 16
    //   3504: iload 22
    //   3506: istore 10
    //   3508: lload 14
    //   3510: lstore 18
    //   3512: aload_0
    //   3513: aload 25
    //   3515: invokespecial 760	com/tencent/smtt/sdk/ag:a	(Ljava/io/Closeable;)V
    //   3518: lload 14
    //   3520: lstore 16
    //   3522: iload 22
    //   3524: istore 10
    //   3526: lload 14
    //   3528: lstore 18
    //   3530: aload_0
    //   3531: aload 5
    //   3533: invokespecial 760	com/tencent/smtt/sdk/ag:a	(Ljava/io/Closeable;)V
    //   3536: lload 14
    //   3538: lstore 16
    //   3540: iload 22
    //   3542: istore 10
    //   3544: lload 14
    //   3546: lstore 18
    //   3548: aload_0
    //   3549: aload 11
    //   3551: invokespecial 760	com/tencent/smtt/sdk/ag:a	(Ljava/io/Closeable;)V
    //   3554: lload 14
    //   3556: lstore 8
    //   3558: iload 22
    //   3560: istore_2
    //   3561: iload_1
    //   3562: ifne -3042 -> 520
    //   3565: aload_0
    //   3566: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   3569: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   3572: getfield 436	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   3575: ldc_w 933
    //   3578: lload 14
    //   3580: invokestatic 959	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   3583: invokeinterface 450 3 0
    //   3588: pop
    //   3589: aload_0
    //   3590: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   3593: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   3596: invokevirtual 462	com/tencent/smtt/sdk/TbsDownloadConfig:commit	()V
    //   3599: lload 14
    //   3601: lstore 8
    //   3603: iload 22
    //   3605: istore_2
    //   3606: goto -3086 -> 520
    //   3609: aload 5
    //   3611: ifnull +208 -> 3819
    //   3614: aload 5
    //   3616: ldc_w 1057
    //   3619: invokevirtual 335	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   3622: ifeq +197 -> 3819
    //   3625: new 1059	java/util/zip/Inflater
    //   3628: astore 5
    //   3630: aload 5
    //   3632: iconst_1
    //   3633: invokespecial 1061	java/util/zip/Inflater:<init>	(Z)V
    //   3636: new 1063	java/util/zip/InflaterInputStream
    //   3639: dup
    //   3640: aload 11
    //   3642: aload 5
    //   3644: invokespecial 1066	java/util/zip/InflaterInputStream:<init>	(Ljava/io/InputStream;Ljava/util/zip/Inflater;)V
    //   3647: astore 5
    //   3649: goto -298 -> 3351
    //   3652: astore 26
    //   3654: aload 11
    //   3656: astore 5
    //   3658: aload 23
    //   3660: astore 25
    //   3662: aload 26
    //   3664: astore 11
    //   3666: iload_2
    //   3667: istore 22
    //   3669: aload 11
    //   3671: instanceof 1068
    //   3674: ifne +11 -> 3685
    //   3677: aload 11
    //   3679: instanceof 1070
    //   3682: ifeq +1377 -> 5059
    //   3685: aload_0
    //   3686: ldc_w 1071
    //   3689: putfield 78	com/tencent/smtt/sdk/ag:m	I
    //   3692: aload_0
    //   3693: lconst_0
    //   3694: invokespecial 1073	com/tencent/smtt/sdk/ag:a	(J)V
    //   3697: aload_0
    //   3698: bipush 103
    //   3700: aload_0
    //   3701: aload 11
    //   3703: invokespecial 622	com/tencent/smtt/sdk/ag:a	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   3706: iconst_0
    //   3707: invokespecial 624	com/tencent/smtt/sdk/ag:a	(ILjava/lang/String;Z)V
    //   3710: lload 14
    //   3712: lstore 16
    //   3714: iload 22
    //   3716: istore 10
    //   3718: lload 14
    //   3720: lstore 18
    //   3722: aload_0
    //   3723: aload 25
    //   3725: invokespecial 760	com/tencent/smtt/sdk/ag:a	(Ljava/io/Closeable;)V
    //   3728: lload 14
    //   3730: lstore 16
    //   3732: iload 22
    //   3734: istore 10
    //   3736: lload 14
    //   3738: lstore 18
    //   3740: aload_0
    //   3741: aload 24
    //   3743: invokespecial 760	com/tencent/smtt/sdk/ag:a	(Ljava/io/Closeable;)V
    //   3746: lload 14
    //   3748: lstore 16
    //   3750: iload 22
    //   3752: istore 10
    //   3754: lload 14
    //   3756: lstore 18
    //   3758: aload_0
    //   3759: aload 5
    //   3761: invokespecial 760	com/tencent/smtt/sdk/ag:a	(Ljava/io/Closeable;)V
    //   3764: lload 14
    //   3766: lstore 8
    //   3768: iload 22
    //   3770: istore_2
    //   3771: iload_1
    //   3772: ifne -3252 -> 520
    //   3775: aload_0
    //   3776: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   3779: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   3782: getfield 436	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   3785: ldc_w 933
    //   3788: lload 14
    //   3790: invokestatic 959	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   3793: invokeinterface 450 3 0
    //   3798: pop
    //   3799: aload_0
    //   3800: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   3803: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   3806: invokevirtual 462	com/tencent/smtt/sdk/TbsDownloadConfig:commit	()V
    //   3809: lload 14
    //   3811: lstore 8
    //   3813: iload 22
    //   3815: istore_2
    //   3816: goto -3296 -> 520
    //   3819: aload 11
    //   3821: astore 5
    //   3823: goto -472 -> 3351
    //   3826: iload_2
    //   3827: istore 10
    //   3829: lload 14
    //   3831: lstore 20
    //   3833: iload_2
    //   3834: istore 29
    //   3836: lload 14
    //   3838: lstore 30
    //   3840: aload 5
    //   3842: aload 24
    //   3844: iconst_0
    //   3845: sipush 8192
    //   3848: invokevirtual 1079	java/io/InputStream:read	([BII)I
    //   3851: istore 32
    //   3853: iload 32
    //   3855: ifgt +185 -> 4040
    //   3858: iload_2
    //   3859: istore 10
    //   3861: lload 14
    //   3863: lstore 20
    //   3865: iload_2
    //   3866: istore 29
    //   3868: lload 14
    //   3870: lstore 30
    //   3872: aload_0
    //   3873: getfield 84	com/tencent/smtt/sdk/ag:b	[Ljava/lang/String;
    //   3876: ifnull +86 -> 3962
    //   3879: iload_2
    //   3880: istore 10
    //   3882: lload 14
    //   3884: lstore 20
    //   3886: iload_2
    //   3887: istore 29
    //   3889: lload 14
    //   3891: lstore 30
    //   3893: aload_0
    //   3894: iconst_1
    //   3895: iload 4
    //   3897: invokespecial 881	com/tencent/smtt/sdk/ag:c	(ZZ)Z
    //   3900: ifne +62 -> 3962
    //   3903: iload_1
    //   3904: ifne +33 -> 3937
    //   3907: iload_2
    //   3908: istore 10
    //   3910: lload 14
    //   3912: lstore 20
    //   3914: iload_2
    //   3915: istore 29
    //   3917: lload 14
    //   3919: lstore 30
    //   3921: aload_0
    //   3922: iconst_0
    //   3923: invokevirtual 1018	com/tencent/smtt/sdk/ag:a	(Z)Z
    //   3926: ifeq +11 -> 3937
    //   3929: iconst_1
    //   3930: istore_3
    //   3931: iload_2
    //   3932: istore 22
    //   3934: goto -453 -> 3481
    //   3937: iload_2
    //   3938: istore 10
    //   3940: lload 14
    //   3942: lstore 20
    //   3944: iload_2
    //   3945: istore 29
    //   3947: lload 14
    //   3949: lstore 30
    //   3951: aload_0
    //   3952: iconst_1
    //   3953: putfield 640	com/tencent/smtt/sdk/ag:s	Z
    //   3956: iconst_0
    //   3957: istore 22
    //   3959: goto -478 -> 3481
    //   3962: iload_2
    //   3963: istore 10
    //   3965: lload 14
    //   3967: lstore 20
    //   3969: iload_2
    //   3970: istore 29
    //   3972: lload 14
    //   3974: lstore 30
    //   3976: aload_0
    //   3977: iconst_1
    //   3978: putfield 640	com/tencent/smtt/sdk/ag:s	Z
    //   3981: iload_2
    //   3982: istore 22
    //   3984: iload_2
    //   3985: istore 10
    //   3987: lload 14
    //   3989: lstore 20
    //   3991: iload_2
    //   3992: istore 29
    //   3994: lload 14
    //   3996: lstore 30
    //   3998: aload_0
    //   3999: getfield 84	com/tencent/smtt/sdk/ag:b	[Ljava/lang/String;
    //   4002: ifnull +6 -> 4008
    //   4005: iconst_1
    //   4006: istore 22
    //   4008: iload 22
    //   4010: istore 10
    //   4012: lload 14
    //   4014: lstore 20
    //   4016: iload 22
    //   4018: istore 29
    //   4020: lload 14
    //   4022: lstore 30
    //   4024: aload_0
    //   4025: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   4028: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   4031: sipush -311
    //   4034: invokevirtual 870	com/tencent/smtt/sdk/TbsDownloadConfig:setDownloadInterruptCode	(I)V
    //   4037: goto -556 -> 3481
    //   4040: iload_2
    //   4041: istore 10
    //   4043: lload 14
    //   4045: lstore 20
    //   4047: iload_2
    //   4048: istore 29
    //   4050: lload 14
    //   4052: lstore 30
    //   4054: aload 25
    //   4056: aload 24
    //   4058: iconst_0
    //   4059: iload 32
    //   4061: invokevirtual 1083	java/io/FileOutputStream:write	([BII)V
    //   4064: iload_2
    //   4065: istore 10
    //   4067: lload 14
    //   4069: lstore 20
    //   4071: iload_2
    //   4072: istore 29
    //   4074: lload 14
    //   4076: lstore 30
    //   4078: aload 25
    //   4080: invokevirtual 1086	java/io/FileOutputStream:flush	()V
    //   4083: lload 14
    //   4085: lstore 18
    //   4087: iload_1
    //   4088: ifne +341 -> 4429
    //   4091: iload 32
    //   4093: i2l
    //   4094: lload 14
    //   4096: ladd
    //   4097: lstore 14
    //   4099: lload 14
    //   4101: lload 6
    //   4103: lcmp
    //   4104: iflt +140 -> 4244
    //   4107: lload 14
    //   4109: lstore 20
    //   4111: lload 14
    //   4113: lstore 18
    //   4115: ldc 202
    //   4117: ldc_w 970
    //   4120: iconst_1
    //   4121: invokestatic 905	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;Z)V
    //   4124: lload 14
    //   4126: lstore 20
    //   4128: lload 14
    //   4130: lstore 18
    //   4132: new 113	java/lang/StringBuilder
    //   4135: astore 24
    //   4137: lload 14
    //   4139: lstore 20
    //   4141: lload 14
    //   4143: lstore 18
    //   4145: aload 24
    //   4147: ldc_w 1088
    //   4150: invokespecial 118	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   4153: lload 14
    //   4155: lstore 20
    //   4157: lload 14
    //   4159: lstore 18
    //   4161: aload_0
    //   4162: bipush 112
    //   4164: aload 24
    //   4166: lload 14
    //   4168: invokevirtual 583	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   4171: ldc_w 1090
    //   4174: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4177: lload 6
    //   4179: invokevirtual 583	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   4182: invokevirtual 129	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   4185: iconst_1
    //   4186: invokespecial 624	com/tencent/smtt/sdk/ag:a	(ILjava/lang/String;Z)V
    //   4189: lload 14
    //   4191: lstore 20
    //   4193: lload 14
    //   4195: lstore 18
    //   4197: aload_0
    //   4198: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   4201: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   4204: sipush -307
    //   4207: invokevirtual 870	com/tencent/smtt/sdk/TbsDownloadConfig:setDownloadInterruptCode	(I)V
    //   4210: iload_2
    //   4211: istore 22
    //   4213: goto -732 -> 3481
    //   4216: astore 24
    //   4218: aload 11
    //   4220: astore 26
    //   4222: lload 20
    //   4224: lstore 14
    //   4226: iload_2
    //   4227: istore 22
    //   4229: aload 24
    //   4231: astore 11
    //   4233: aload 5
    //   4235: astore 24
    //   4237: aload 26
    //   4239: astore 5
    //   4241: goto -572 -> 3669
    //   4244: lload 14
    //   4246: lstore 20
    //   4248: lload 14
    //   4250: lstore 18
    //   4252: aload_0
    //   4253: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   4256: invokestatic 961	com/tencent/smtt/utils/k:b	(Landroid/content/Context;)Z
    //   4259: ifne +166 -> 4425
    //   4262: lload 14
    //   4264: lstore 20
    //   4266: lload 14
    //   4268: lstore 18
    //   4270: ldc 202
    //   4272: ldc_w 1092
    //   4275: iconst_1
    //   4276: invokestatic 905	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;Z)V
    //   4279: lload 14
    //   4281: lstore 20
    //   4283: lload 14
    //   4285: lstore 18
    //   4287: new 113	java/lang/StringBuilder
    //   4290: astore 24
    //   4292: lload 14
    //   4294: lstore 20
    //   4296: lload 14
    //   4298: lstore 18
    //   4300: aload 24
    //   4302: ldc_w 1094
    //   4305: invokespecial 118	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   4308: lload 14
    //   4310: lstore 20
    //   4312: lload 14
    //   4314: lstore 18
    //   4316: aload_0
    //   4317: bipush 105
    //   4319: aload 24
    //   4321: invokestatic 1096	com/tencent/smtt/utils/y:a	()J
    //   4324: invokevirtual 583	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   4327: ldc_w 1098
    //   4330: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4333: aload_0
    //   4334: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   4337: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   4340: invokevirtual 1101	com/tencent/smtt/sdk/TbsDownloadConfig:getDownloadMinFreeSpace	()J
    //   4343: invokevirtual 583	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   4346: invokevirtual 129	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   4349: iconst_1
    //   4350: invokespecial 624	com/tencent/smtt/sdk/ag:a	(ILjava/lang/String;Z)V
    //   4353: lload 14
    //   4355: lstore 20
    //   4357: lload 14
    //   4359: lstore 18
    //   4361: aload_0
    //   4362: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   4365: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   4368: sipush -308
    //   4371: invokevirtual 870	com/tencent/smtt/sdk/TbsDownloadConfig:setDownloadInterruptCode	(I)V
    //   4374: iload_2
    //   4375: istore 22
    //   4377: goto -896 -> 3481
    //   4380: astore 24
    //   4382: lload 18
    //   4384: lstore 14
    //   4386: aload_0
    //   4387: aload 25
    //   4389: invokespecial 760	com/tencent/smtt/sdk/ag:a	(Ljava/io/Closeable;)V
    //   4392: aload_0
    //   4393: aload 5
    //   4395: invokespecial 760	com/tencent/smtt/sdk/ag:a	(Ljava/io/Closeable;)V
    //   4398: aload_0
    //   4399: aload 11
    //   4401: invokespecial 760	com/tencent/smtt/sdk/ag:a	(Ljava/io/Closeable;)V
    //   4404: ldc_w 888
    //   4407: invokestatic 148	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   4410: aload 24
    //   4412: athrow
    //   4413: astore 5
    //   4415: lload 14
    //   4417: lstore 16
    //   4419: iload_2
    //   4420: istore 22
    //   4422: goto -2089 -> 2333
    //   4425: lload 14
    //   4427: lstore 18
    //   4429: iload 32
    //   4431: i2l
    //   4432: lstore 14
    //   4434: iload_2
    //   4435: istore 10
    //   4437: lload 18
    //   4439: lstore 20
    //   4441: iload_2
    //   4442: istore 29
    //   4444: lload 18
    //   4446: lstore 30
    //   4448: aload_0
    //   4449: lload 12
    //   4451: lload 14
    //   4453: invokespecial 1103	com/tencent/smtt/sdk/ag:a	(JJ)J
    //   4456: lstore 12
    //   4458: iload_2
    //   4459: istore 10
    //   4461: lload 18
    //   4463: lstore 20
    //   4465: iload_2
    //   4466: istore 29
    //   4468: lload 18
    //   4470: lstore 30
    //   4472: invokestatic 162	java/lang/System:currentTimeMillis	()J
    //   4475: lstore 33
    //   4477: lload 27
    //   4479: iload 32
    //   4481: i2l
    //   4482: ladd
    //   4483: lstore 27
    //   4485: lload 33
    //   4487: lload 16
    //   4489: lsub
    //   4490: ldc2_w 1104
    //   4493: lcmp
    //   4494: ifle +2447 -> 6941
    //   4497: iload_2
    //   4498: istore 10
    //   4500: lload 18
    //   4502: lstore 20
    //   4504: iload_2
    //   4505: istore 29
    //   4507: lload 18
    //   4509: lstore 30
    //   4511: new 113	java/lang/StringBuilder
    //   4514: astore 26
    //   4516: iload_2
    //   4517: istore 10
    //   4519: lload 18
    //   4521: lstore 20
    //   4523: iload_2
    //   4524: istore 29
    //   4526: lload 18
    //   4528: lstore 30
    //   4530: aload 26
    //   4532: ldc_w 1107
    //   4535: invokespecial 118	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   4538: iload_2
    //   4539: istore 10
    //   4541: lload 18
    //   4543: lstore 20
    //   4545: iload_2
    //   4546: istore 29
    //   4548: lload 18
    //   4550: lstore 30
    //   4552: ldc 202
    //   4554: aload 26
    //   4556: lload 27
    //   4558: invokevirtual 583	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   4561: ldc_w 1014
    //   4564: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4567: aload_0
    //   4568: getfield 632	com/tencent/smtt/sdk/ag:l	J
    //   4571: invokevirtual 583	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   4574: invokevirtual 129	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   4577: iconst_1
    //   4578: invokestatic 905	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;Z)V
    //   4581: iload_2
    //   4582: istore 10
    //   4584: lload 18
    //   4586: lstore 20
    //   4588: iload_2
    //   4589: istore 29
    //   4591: lload 18
    //   4593: lstore 30
    //   4595: getstatic 467	com/tencent/smtt/sdk/QbSdk:m	Lcom/tencent/smtt/sdk/TbsListener;
    //   4598: ifnull +57 -> 4655
    //   4601: iload_2
    //   4602: istore 10
    //   4604: lload 18
    //   4606: lstore 20
    //   4608: iload_2
    //   4609: istore 29
    //   4611: lload 18
    //   4613: lstore 30
    //   4615: lload 27
    //   4617: l2d
    //   4618: aload_0
    //   4619: getfield 632	com/tencent/smtt/sdk/ag:l	J
    //   4622: l2d
    //   4623: ddiv
    //   4624: ldc2_w 1108
    //   4627: dmul
    //   4628: d2i
    //   4629: istore 32
    //   4631: iload_2
    //   4632: istore 10
    //   4634: lload 18
    //   4636: lstore 20
    //   4638: iload_2
    //   4639: istore 29
    //   4641: lload 18
    //   4643: lstore 30
    //   4645: getstatic 467	com/tencent/smtt/sdk/QbSdk:m	Lcom/tencent/smtt/sdk/TbsListener;
    //   4648: iload 32
    //   4650: invokeinterface 1112 2 0
    //   4655: iload_1
    //   4656: ifne +2274 -> 6930
    //   4659: lload 27
    //   4661: lload 8
    //   4663: lsub
    //   4664: ldc2_w 1113
    //   4667: lcmp
    //   4668: ifle +2262 -> 6930
    //   4671: iload_2
    //   4672: istore 10
    //   4674: lload 18
    //   4676: lstore 20
    //   4678: iload_2
    //   4679: istore 29
    //   4681: lload 18
    //   4683: lstore 30
    //   4685: aload_0
    //   4686: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   4689: invokestatic 221	com/tencent/smtt/sdk/TbsDownloader:getOverSea	(Landroid/content/Context;)Z
    //   4692: ifne +194 -> 4886
    //   4695: iload_2
    //   4696: istore 10
    //   4698: lload 18
    //   4700: lstore 20
    //   4702: iload_2
    //   4703: istore 29
    //   4705: lload 18
    //   4707: lstore 30
    //   4709: aload_0
    //   4710: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   4713: invokestatic 668	com/tencent/smtt/utils/Apn:getApnType	(Landroid/content/Context;)I
    //   4716: iconst_3
    //   4717: if_icmpeq +23 -> 4740
    //   4720: iload_2
    //   4721: istore 10
    //   4723: lload 18
    //   4725: lstore 20
    //   4727: iload_2
    //   4728: istore 29
    //   4730: lload 18
    //   4732: lstore 30
    //   4734: invokestatic 852	com/tencent/smtt/sdk/QbSdk:getDownloadWithoutWifi	()Z
    //   4737: ifeq +27 -> 4764
    //   4740: iload_2
    //   4741: istore 10
    //   4743: lload 18
    //   4745: lstore 20
    //   4747: iload_2
    //   4748: istore 29
    //   4750: lload 18
    //   4752: lstore 30
    //   4754: aload_0
    //   4755: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   4758: invokestatic 668	com/tencent/smtt/utils/Apn:getApnType	(Landroid/content/Context;)I
    //   4761: ifne +125 -> 4886
    //   4764: iload_2
    //   4765: istore 10
    //   4767: lload 18
    //   4769: lstore 20
    //   4771: iload_2
    //   4772: istore 29
    //   4774: lload 18
    //   4776: lstore 30
    //   4778: aload_0
    //   4779: invokevirtual 1008	com/tencent/smtt/sdk/ag:c	()V
    //   4782: iload_2
    //   4783: istore 10
    //   4785: lload 18
    //   4787: lstore 20
    //   4789: iload_2
    //   4790: istore 29
    //   4792: lload 18
    //   4794: lstore 30
    //   4796: getstatic 467	com/tencent/smtt/sdk/QbSdk:m	Lcom/tencent/smtt/sdk/TbsListener;
    //   4799: ifnull +27 -> 4826
    //   4802: iload_2
    //   4803: istore 10
    //   4805: lload 18
    //   4807: lstore 20
    //   4809: iload_2
    //   4810: istore 29
    //   4812: lload 18
    //   4814: lstore 30
    //   4816: getstatic 467	com/tencent/smtt/sdk/QbSdk:m	Lcom/tencent/smtt/sdk/TbsListener;
    //   4819: bipush 111
    //   4821: invokeinterface 472 2 0
    //   4826: iload_2
    //   4827: istore 10
    //   4829: lload 18
    //   4831: lstore 20
    //   4833: iload_2
    //   4834: istore 29
    //   4836: lload 18
    //   4838: lstore 30
    //   4840: ldc 202
    //   4842: ldc_w 1116
    //   4845: iconst_0
    //   4846: invokestatic 905	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;Z)V
    //   4849: iload_2
    //   4850: istore 10
    //   4852: lload 18
    //   4854: lstore 20
    //   4856: iload_2
    //   4857: istore 29
    //   4859: lload 18
    //   4861: lstore 30
    //   4863: aload_0
    //   4864: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   4867: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   4870: sipush -304
    //   4873: invokevirtual 870	com/tencent/smtt/sdk/TbsDownloadConfig:setDownloadInterruptCode	(I)V
    //   4876: lload 18
    //   4878: lstore 14
    //   4880: iload_2
    //   4881: istore 22
    //   4883: goto -1402 -> 3481
    //   4886: lload 27
    //   4888: lstore 14
    //   4890: lload 33
    //   4892: lstore 8
    //   4894: lload 8
    //   4896: lstore 16
    //   4898: lload 14
    //   4900: lstore 8
    //   4902: lload 18
    //   4904: lstore 14
    //   4906: goto -1499 -> 3407
    //   4909: aconst_null
    //   4910: astore 26
    //   4912: aconst_null
    //   4913: astore 24
    //   4915: lload 14
    //   4917: lstore 8
    //   4919: lload 8
    //   4921: lstore 16
    //   4923: iload_2
    //   4924: istore 10
    //   4926: lload 8
    //   4928: lstore 18
    //   4930: aload_0
    //   4931: aload 24
    //   4933: invokespecial 760	com/tencent/smtt/sdk/ag:a	(Ljava/io/Closeable;)V
    //   4936: lload 8
    //   4938: lstore 16
    //   4940: iload_2
    //   4941: istore 10
    //   4943: lload 8
    //   4945: lstore 18
    //   4947: aload_0
    //   4948: aload 26
    //   4950: invokespecial 760	com/tencent/smtt/sdk/ag:a	(Ljava/io/Closeable;)V
    //   4953: lload 8
    //   4955: lstore 16
    //   4957: iload_2
    //   4958: istore 10
    //   4960: lload 8
    //   4962: lstore 18
    //   4964: aload_0
    //   4965: aload 11
    //   4967: invokespecial 760	com/tencent/smtt/sdk/ag:a	(Ljava/io/Closeable;)V
    //   4970: lload 8
    //   4972: lstore 16
    //   4974: iload_2
    //   4975: istore 10
    //   4977: lload 8
    //   4979: lstore 18
    //   4981: aload_0
    //   4982: getfield 640	com/tencent/smtt/sdk/ag:s	Z
    //   4985: ifne +27 -> 5012
    //   4988: lload 8
    //   4990: lstore 16
    //   4992: iload_2
    //   4993: istore 10
    //   4995: lload 8
    //   4997: lstore 18
    //   4999: aload_0
    //   5000: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   5003: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   5006: sipush -319
    //   5009: invokevirtual 870	com/tencent/smtt/sdk/TbsDownloadConfig:setDownloadInterruptCode	(I)V
    //   5012: iload_2
    //   5013: istore 10
    //   5015: iload_1
    //   5016: ifne -4449 -> 567
    //   5019: aload_0
    //   5020: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   5023: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   5026: getfield 436	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   5029: ldc_w 933
    //   5032: lload 8
    //   5034: invokestatic 959	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   5037: invokeinterface 450 3 0
    //   5042: pop
    //   5043: aload_0
    //   5044: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   5047: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   5050: invokevirtual 462	com/tencent/smtt/sdk/TbsDownloadConfig:commit	()V
    //   5053: iload_2
    //   5054: istore 10
    //   5056: goto -4489 -> 567
    //   5059: iload_1
    //   5060: ifne +179 -> 5239
    //   5063: aload_0
    //   5064: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   5067: invokestatic 961	com/tencent/smtt/utils/k:b	(Landroid/content/Context;)Z
    //   5070: ifne +169 -> 5239
    //   5073: new 113	java/lang/StringBuilder
    //   5076: astore 11
    //   5078: aload 11
    //   5080: ldc_w 1094
    //   5083: invokespecial 118	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   5086: aload_0
    //   5087: bipush 105
    //   5089: aload 11
    //   5091: invokestatic 1096	com/tencent/smtt/utils/y:a	()J
    //   5094: invokevirtual 583	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   5097: ldc_w 1098
    //   5100: invokevirtual 126	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5103: aload_0
    //   5104: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   5107: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   5110: invokevirtual 1101	com/tencent/smtt/sdk/TbsDownloadConfig:getDownloadMinFreeSpace	()J
    //   5113: invokevirtual 583	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   5116: invokevirtual 129	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   5119: iconst_1
    //   5120: invokespecial 624	com/tencent/smtt/sdk/ag:a	(ILjava/lang/String;Z)V
    //   5123: aload_0
    //   5124: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   5127: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   5130: sipush -308
    //   5133: invokevirtual 870	com/tencent/smtt/sdk/TbsDownloadConfig:setDownloadInterruptCode	(I)V
    //   5136: lload 14
    //   5138: lstore 16
    //   5140: iload 22
    //   5142: istore 10
    //   5144: lload 14
    //   5146: lstore 18
    //   5148: aload_0
    //   5149: aload 25
    //   5151: invokespecial 760	com/tencent/smtt/sdk/ag:a	(Ljava/io/Closeable;)V
    //   5154: lload 14
    //   5156: lstore 16
    //   5158: iload 22
    //   5160: istore 10
    //   5162: lload 14
    //   5164: lstore 18
    //   5166: aload_0
    //   5167: aload 24
    //   5169: invokespecial 760	com/tencent/smtt/sdk/ag:a	(Ljava/io/Closeable;)V
    //   5172: lload 14
    //   5174: lstore 16
    //   5176: iload 22
    //   5178: istore 10
    //   5180: lload 14
    //   5182: lstore 18
    //   5184: aload_0
    //   5185: aload 5
    //   5187: invokespecial 760	com/tencent/smtt/sdk/ag:a	(Ljava/io/Closeable;)V
    //   5190: iload 22
    //   5192: istore 10
    //   5194: iload_1
    //   5195: ifne -4628 -> 567
    //   5198: aload_0
    //   5199: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   5202: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   5205: getfield 436	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   5208: ldc_w 933
    //   5211: lload 14
    //   5213: invokestatic 959	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   5216: invokeinterface 450 3 0
    //   5221: pop
    //   5222: aload_0
    //   5223: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   5226: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   5229: invokevirtual 462	com/tencent/smtt/sdk/TbsDownloadConfig:commit	()V
    //   5232: iload 22
    //   5234: istore 10
    //   5236: goto -4669 -> 567
    //   5239: aload_0
    //   5240: lconst_0
    //   5241: invokespecial 1073	com/tencent/smtt/sdk/ag:a	(J)V
    //   5244: aload_0
    //   5245: invokespecial 1118	com/tencent/smtt/sdk/ag:j	()Z
    //   5248: ifne +125 -> 5373
    //   5251: aload_0
    //   5252: bipush 106
    //   5254: aload_0
    //   5255: aload 11
    //   5257: invokespecial 622	com/tencent/smtt/sdk/ag:a	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   5260: iconst_0
    //   5261: invokespecial 624	com/tencent/smtt/sdk/ag:a	(ILjava/lang/String;Z)V
    //   5264: lload 14
    //   5266: lstore 16
    //   5268: iload 22
    //   5270: istore 10
    //   5272: lload 14
    //   5274: lstore 18
    //   5276: aload_0
    //   5277: aload 25
    //   5279: invokespecial 760	com/tencent/smtt/sdk/ag:a	(Ljava/io/Closeable;)V
    //   5282: lload 14
    //   5284: lstore 16
    //   5286: iload 22
    //   5288: istore 10
    //   5290: lload 14
    //   5292: lstore 18
    //   5294: aload_0
    //   5295: aload 24
    //   5297: invokespecial 760	com/tencent/smtt/sdk/ag:a	(Ljava/io/Closeable;)V
    //   5300: lload 14
    //   5302: lstore 16
    //   5304: iload 22
    //   5306: istore 10
    //   5308: lload 14
    //   5310: lstore 18
    //   5312: aload_0
    //   5313: aload 5
    //   5315: invokespecial 760	com/tencent/smtt/sdk/ag:a	(Ljava/io/Closeable;)V
    //   5318: lload 14
    //   5320: lstore 8
    //   5322: iload 22
    //   5324: istore_2
    //   5325: iload_1
    //   5326: ifne -4806 -> 520
    //   5329: aload_0
    //   5330: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   5333: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   5336: getfield 436	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   5339: ldc_w 933
    //   5342: lload 14
    //   5344: invokestatic 959	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   5347: invokeinterface 450 3 0
    //   5352: pop
    //   5353: aload_0
    //   5354: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   5357: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   5360: invokevirtual 462	com/tencent/smtt/sdk/TbsDownloadConfig:commit	()V
    //   5363: lload 14
    //   5365: lstore 8
    //   5367: iload 22
    //   5369: istore_2
    //   5370: goto -4850 -> 520
    //   5373: aload_0
    //   5374: bipush 104
    //   5376: aload_0
    //   5377: aload 11
    //   5379: invokespecial 622	com/tencent/smtt/sdk/ag:a	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   5382: iconst_0
    //   5383: invokespecial 624	com/tencent/smtt/sdk/ag:a	(ILjava/lang/String;Z)V
    //   5386: goto -122 -> 5264
    //   5389: astore 23
    //   5391: aload 24
    //   5393: astore 26
    //   5395: aload 5
    //   5397: astore 11
    //   5399: iload 22
    //   5401: istore_2
    //   5402: aload 23
    //   5404: astore 24
    //   5406: aload 26
    //   5408: astore 5
    //   5410: goto -1024 -> 4386
    //   5413: iload_3
    //   5414: sipush 300
    //   5417: if_icmplt +229 -> 5646
    //   5420: iload_3
    //   5421: sipush 307
    //   5424: if_icmpgt +222 -> 5646
    //   5427: lload 14
    //   5429: lstore 16
    //   5431: iload_2
    //   5432: istore 10
    //   5434: lload 14
    //   5436: lstore 18
    //   5438: aload_0
    //   5439: getfield 382	com/tencent/smtt/sdk/ag:t	Ljava/net/HttpURLConnection;
    //   5442: ldc_w 1120
    //   5445: invokevirtual 1123	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   5448: astore 5
    //   5450: lload 14
    //   5452: lstore 16
    //   5454: iload_2
    //   5455: istore 10
    //   5457: lload 14
    //   5459: lstore 18
    //   5461: aload 5
    //   5463: invokestatic 790	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   5466: ifne +90 -> 5556
    //   5469: lload 14
    //   5471: lstore 16
    //   5473: iload_2
    //   5474: istore 10
    //   5476: lload 14
    //   5478: lstore 18
    //   5480: aload_0
    //   5481: aload 5
    //   5483: putfield 634	com/tencent/smtt/sdk/ag:j	Ljava/lang/String;
    //   5486: lload 14
    //   5488: lstore 16
    //   5490: iload_2
    //   5491: istore 10
    //   5493: lload 14
    //   5495: lstore 18
    //   5497: aload_0
    //   5498: aload_0
    //   5499: getfield 628	com/tencent/smtt/sdk/ag:q	I
    //   5502: iconst_1
    //   5503: iadd
    //   5504: putfield 628	com/tencent/smtt/sdk/ag:q	I
    //   5507: lload 14
    //   5509: lstore 8
    //   5511: iload_1
    //   5512: ifne -4992 -> 520
    //   5515: aload_0
    //   5516: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   5519: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   5522: getfield 436	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   5525: ldc_w 933
    //   5528: lload 14
    //   5530: invokestatic 959	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   5533: invokeinterface 450 3 0
    //   5538: pop
    //   5539: aload_0
    //   5540: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   5543: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   5546: invokevirtual 462	com/tencent/smtt/sdk/TbsDownloadConfig:commit	()V
    //   5549: lload 14
    //   5551: lstore 8
    //   5553: goto -5033 -> 520
    //   5556: lload 14
    //   5558: lstore 16
    //   5560: iload_2
    //   5561: istore 10
    //   5563: lload 14
    //   5565: lstore 18
    //   5567: aload_0
    //   5568: bipush 124
    //   5570: aconst_null
    //   5571: iconst_1
    //   5572: invokespecial 624	com/tencent/smtt/sdk/ag:a	(ILjava/lang/String;Z)V
    //   5575: lload 14
    //   5577: lstore 16
    //   5579: iload_2
    //   5580: istore 10
    //   5582: lload 14
    //   5584: lstore 18
    //   5586: aload_0
    //   5587: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   5590: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   5593: sipush -312
    //   5596: invokevirtual 870	com/tencent/smtt/sdk/TbsDownloadConfig:setDownloadInterruptCode	(I)V
    //   5599: iload_2
    //   5600: istore 10
    //   5602: iload_1
    //   5603: ifne -5036 -> 567
    //   5606: aload_0
    //   5607: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   5610: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   5613: getfield 436	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   5616: ldc_w 933
    //   5619: lload 14
    //   5621: invokestatic 959	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   5624: invokeinterface 450 3 0
    //   5629: pop
    //   5630: aload_0
    //   5631: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   5634: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   5637: invokevirtual 462	com/tencent/smtt/sdk/TbsDownloadConfig:commit	()V
    //   5640: iload_2
    //   5641: istore 10
    //   5643: goto -5076 -> 567
    //   5646: lload 14
    //   5648: lstore 16
    //   5650: iload_2
    //   5651: istore 10
    //   5653: lload 14
    //   5655: lstore 18
    //   5657: aload_0
    //   5658: bipush 102
    //   5660: iload_3
    //   5661: invokestatic 367	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   5664: iconst_0
    //   5665: invokespecial 624	com/tencent/smtt/sdk/ag:a	(ILjava/lang/String;Z)V
    //   5668: iload_3
    //   5669: sipush 416
    //   5672: if_icmpne +185 -> 5857
    //   5675: lload 14
    //   5677: lstore 16
    //   5679: iload_2
    //   5680: istore 10
    //   5682: lload 14
    //   5684: lstore 18
    //   5686: aload_0
    //   5687: iconst_1
    //   5688: iload 4
    //   5690: invokespecial 881	com/tencent/smtt/sdk/ag:c	(ZZ)Z
    //   5693: ifeq +76 -> 5769
    //   5696: iconst_1
    //   5697: istore 10
    //   5699: iconst_1
    //   5700: istore_2
    //   5701: lload 14
    //   5703: lstore 16
    //   5705: lload 14
    //   5707: lstore 18
    //   5709: aload_0
    //   5710: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   5713: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   5716: sipush -214
    //   5719: invokevirtual 870	com/tencent/smtt/sdk/TbsDownloadConfig:setDownloadInterruptCode	(I)V
    //   5722: iload_2
    //   5723: istore 10
    //   5725: iload_1
    //   5726: ifne -5159 -> 567
    //   5729: aload_0
    //   5730: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   5733: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   5736: getfield 436	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   5739: ldc_w 933
    //   5742: lload 14
    //   5744: invokestatic 959	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   5747: invokeinterface 450 3 0
    //   5752: pop
    //   5753: aload_0
    //   5754: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   5757: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   5760: invokevirtual 462	com/tencent/smtt/sdk/TbsDownloadConfig:commit	()V
    //   5763: iload_2
    //   5764: istore 10
    //   5766: goto -5199 -> 567
    //   5769: lload 14
    //   5771: lstore 16
    //   5773: iload_2
    //   5774: istore 10
    //   5776: lload 14
    //   5778: lstore 18
    //   5780: aload_0
    //   5781: iconst_0
    //   5782: invokespecial 883	com/tencent/smtt/sdk/ag:c	(Z)Z
    //   5785: pop
    //   5786: lload 14
    //   5788: lstore 16
    //   5790: iload_2
    //   5791: istore 10
    //   5793: lload 14
    //   5795: lstore 18
    //   5797: aload_0
    //   5798: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   5801: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   5804: sipush -313
    //   5807: invokevirtual 870	com/tencent/smtt/sdk/TbsDownloadConfig:setDownloadInterruptCode	(I)V
    //   5810: iload_2
    //   5811: istore 10
    //   5813: iload_1
    //   5814: ifne -5247 -> 567
    //   5817: aload_0
    //   5818: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   5821: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   5824: getfield 436	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   5827: ldc_w 933
    //   5830: lload 14
    //   5832: invokestatic 959	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   5835: invokeinterface 450 3 0
    //   5840: pop
    //   5841: aload_0
    //   5842: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   5845: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   5848: invokevirtual 462	com/tencent/smtt/sdk/TbsDownloadConfig:commit	()V
    //   5851: iload_2
    //   5852: istore 10
    //   5854: goto -5287 -> 567
    //   5857: iload_3
    //   5858: sipush 403
    //   5861: if_icmpeq +10 -> 5871
    //   5864: iload_3
    //   5865: sipush 406
    //   5868: if_icmpne +96 -> 5964
    //   5871: lload 14
    //   5873: lstore 16
    //   5875: iload_2
    //   5876: istore 10
    //   5878: lload 14
    //   5880: lstore 18
    //   5882: aload_0
    //   5883: getfield 632	com/tencent/smtt/sdk/ag:l	J
    //   5886: ldc2_w 629
    //   5889: lcmp
    //   5890: ifne +74 -> 5964
    //   5893: lload 14
    //   5895: lstore 16
    //   5897: iload_2
    //   5898: istore 10
    //   5900: lload 14
    //   5902: lstore 18
    //   5904: aload_0
    //   5905: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   5908: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   5911: sipush -314
    //   5914: invokevirtual 870	com/tencent/smtt/sdk/TbsDownloadConfig:setDownloadInterruptCode	(I)V
    //   5917: iload_2
    //   5918: istore 10
    //   5920: iload_1
    //   5921: ifne -5354 -> 567
    //   5924: aload_0
    //   5925: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   5928: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   5931: getfield 436	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   5934: ldc_w 933
    //   5937: lload 14
    //   5939: invokestatic 959	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   5942: invokeinterface 450 3 0
    //   5947: pop
    //   5948: aload_0
    //   5949: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   5952: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   5955: invokevirtual 462	com/tencent/smtt/sdk/TbsDownloadConfig:commit	()V
    //   5958: iload_2
    //   5959: istore 10
    //   5961: goto -5394 -> 567
    //   5964: iload_3
    //   5965: sipush 202
    //   5968: if_icmpne +52 -> 6020
    //   5971: lload 14
    //   5973: lstore 8
    //   5975: iload_1
    //   5976: ifne -5456 -> 520
    //   5979: aload_0
    //   5980: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   5983: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   5986: getfield 436	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   5989: ldc_w 933
    //   5992: lload 14
    //   5994: invokestatic 959	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   5997: invokeinterface 450 3 0
    //   6002: pop
    //   6003: aload_0
    //   6004: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   6007: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   6010: invokevirtual 462	com/tencent/smtt/sdk/TbsDownloadConfig:commit	()V
    //   6013: lload 14
    //   6015: lstore 8
    //   6017: goto -5497 -> 520
    //   6020: lload 14
    //   6022: lstore 16
    //   6024: iload_2
    //   6025: istore 10
    //   6027: lload 14
    //   6029: lstore 18
    //   6031: aload_0
    //   6032: getfield 267	com/tencent/smtt/sdk/ag:p	I
    //   6035: aload_0
    //   6036: getfield 82	com/tencent/smtt/sdk/ag:B	I
    //   6039: if_icmpge +176 -> 6215
    //   6042: iload_3
    //   6043: sipush 503
    //   6046: if_icmpne +169 -> 6215
    //   6049: lload 14
    //   6051: lstore 16
    //   6053: iload_2
    //   6054: istore 10
    //   6056: lload 14
    //   6058: lstore 18
    //   6060: aload_0
    //   6061: aload_0
    //   6062: getfield 382	com/tencent/smtt/sdk/ag:t	Ljava/net/HttpURLConnection;
    //   6065: ldc_w 1125
    //   6068: invokevirtual 1123	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   6071: invokestatic 1129	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   6074: invokespecial 1073	com/tencent/smtt/sdk/ag:a	(J)V
    //   6077: lload 14
    //   6079: lstore 16
    //   6081: iload_2
    //   6082: istore 10
    //   6084: lload 14
    //   6086: lstore 18
    //   6088: aload_0
    //   6089: getfield 638	com/tencent/smtt/sdk/ag:r	Z
    //   6092: ifeq +74 -> 6166
    //   6095: lload 14
    //   6097: lstore 16
    //   6099: iload_2
    //   6100: istore 10
    //   6102: lload 14
    //   6104: lstore 18
    //   6106: aload_0
    //   6107: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   6110: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   6113: sipush -309
    //   6116: invokevirtual 870	com/tencent/smtt/sdk/TbsDownloadConfig:setDownloadInterruptCode	(I)V
    //   6119: iload_2
    //   6120: istore 10
    //   6122: iload_1
    //   6123: ifne -5556 -> 567
    //   6126: aload_0
    //   6127: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   6130: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   6133: getfield 436	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   6136: ldc_w 933
    //   6139: lload 14
    //   6141: invokestatic 959	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   6144: invokeinterface 450 3 0
    //   6149: pop
    //   6150: aload_0
    //   6151: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   6154: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   6157: invokevirtual 462	com/tencent/smtt/sdk/TbsDownloadConfig:commit	()V
    //   6160: iload_2
    //   6161: istore 10
    //   6163: goto -5596 -> 567
    //   6166: lload 14
    //   6168: lstore 8
    //   6170: iload_1
    //   6171: ifne -5651 -> 520
    //   6174: aload_0
    //   6175: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   6178: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   6181: getfield 436	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   6184: ldc_w 933
    //   6187: lload 14
    //   6189: invokestatic 959	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   6192: invokeinterface 450 3 0
    //   6197: pop
    //   6198: aload_0
    //   6199: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   6202: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   6205: invokevirtual 462	com/tencent/smtt/sdk/TbsDownloadConfig:commit	()V
    //   6208: lload 14
    //   6210: lstore 8
    //   6212: goto -5692 -> 520
    //   6215: lload 14
    //   6217: lstore 16
    //   6219: iload_2
    //   6220: istore 10
    //   6222: lload 14
    //   6224: lstore 18
    //   6226: aload_0
    //   6227: getfield 267	com/tencent/smtt/sdk/ag:p	I
    //   6230: aload_0
    //   6231: getfield 82	com/tencent/smtt/sdk/ag:B	I
    //   6234: if_icmpge +185 -> 6419
    //   6237: iload_3
    //   6238: sipush 408
    //   6241: if_icmpeq +24 -> 6265
    //   6244: iload_3
    //   6245: sipush 504
    //   6248: if_icmpeq +17 -> 6265
    //   6251: iload_3
    //   6252: sipush 502
    //   6255: if_icmpeq +10 -> 6265
    //   6258: iload_3
    //   6259: sipush 408
    //   6262: if_icmpne +157 -> 6419
    //   6265: lload 14
    //   6267: lstore 16
    //   6269: iload_2
    //   6270: istore 10
    //   6272: lload 14
    //   6274: lstore 18
    //   6276: aload_0
    //   6277: lconst_0
    //   6278: invokespecial 1073	com/tencent/smtt/sdk/ag:a	(J)V
    //   6281: lload 14
    //   6283: lstore 16
    //   6285: iload_2
    //   6286: istore 10
    //   6288: lload 14
    //   6290: lstore 18
    //   6292: aload_0
    //   6293: getfield 638	com/tencent/smtt/sdk/ag:r	Z
    //   6296: ifeq +74 -> 6370
    //   6299: lload 14
    //   6301: lstore 16
    //   6303: iload_2
    //   6304: istore 10
    //   6306: lload 14
    //   6308: lstore 18
    //   6310: aload_0
    //   6311: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   6314: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   6317: sipush -309
    //   6320: invokevirtual 870	com/tencent/smtt/sdk/TbsDownloadConfig:setDownloadInterruptCode	(I)V
    //   6323: iload_2
    //   6324: istore 10
    //   6326: iload_1
    //   6327: ifne -5760 -> 567
    //   6330: aload_0
    //   6331: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   6334: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   6337: getfield 436	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   6340: ldc_w 933
    //   6343: lload 14
    //   6345: invokestatic 959	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   6348: invokeinterface 450 3 0
    //   6353: pop
    //   6354: aload_0
    //   6355: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   6358: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   6361: invokevirtual 462	com/tencent/smtt/sdk/TbsDownloadConfig:commit	()V
    //   6364: iload_2
    //   6365: istore 10
    //   6367: goto -5800 -> 567
    //   6370: lload 14
    //   6372: lstore 8
    //   6374: iload_1
    //   6375: ifne -5855 -> 520
    //   6378: aload_0
    //   6379: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   6382: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   6385: getfield 436	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   6388: ldc_w 933
    //   6391: lload 14
    //   6393: invokestatic 959	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   6396: invokeinterface 450 3 0
    //   6401: pop
    //   6402: aload_0
    //   6403: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   6406: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   6409: invokevirtual 462	com/tencent/smtt/sdk/TbsDownloadConfig:commit	()V
    //   6412: lload 14
    //   6414: lstore 8
    //   6416: goto -5896 -> 520
    //   6419: lload 14
    //   6421: lstore 16
    //   6423: iload_2
    //   6424: istore 10
    //   6426: lload 14
    //   6428: lstore 18
    //   6430: aload_0
    //   6431: invokespecial 983	com/tencent/smtt/sdk/ag:k	()J
    //   6434: lconst_0
    //   6435: lcmp
    //   6436: ifgt +93 -> 6529
    //   6439: lload 14
    //   6441: lstore 16
    //   6443: iload_2
    //   6444: istore 10
    //   6446: lload 14
    //   6448: lstore 18
    //   6450: aload_0
    //   6451: getfield 636	com/tencent/smtt/sdk/ag:o	Z
    //   6454: ifne +75 -> 6529
    //   6457: iload_3
    //   6458: sipush 410
    //   6461: if_icmpeq +68 -> 6529
    //   6464: lload 14
    //   6466: lstore 16
    //   6468: iload_2
    //   6469: istore 10
    //   6471: lload 14
    //   6473: lstore 18
    //   6475: aload_0
    //   6476: iconst_1
    //   6477: putfield 636	com/tencent/smtt/sdk/ag:o	Z
    //   6480: lload 14
    //   6482: lstore 8
    //   6484: iload_1
    //   6485: ifne -5965 -> 520
    //   6488: aload_0
    //   6489: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   6492: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   6495: getfield 436	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   6498: ldc_w 933
    //   6501: lload 14
    //   6503: invokestatic 959	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   6506: invokeinterface 450 3 0
    //   6511: pop
    //   6512: aload_0
    //   6513: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   6516: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   6519: invokevirtual 462	com/tencent/smtt/sdk/TbsDownloadConfig:commit	()V
    //   6522: lload 14
    //   6524: lstore 8
    //   6526: goto -6006 -> 520
    //   6529: lload 14
    //   6531: lstore 16
    //   6533: iload_2
    //   6534: istore 10
    //   6536: lload 14
    //   6538: lstore 18
    //   6540: aload_0
    //   6541: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   6544: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   6547: sipush -315
    //   6550: invokevirtual 870	com/tencent/smtt/sdk/TbsDownloadConfig:setDownloadInterruptCode	(I)V
    //   6553: iload_2
    //   6554: istore 10
    //   6556: iload_1
    //   6557: ifne -5990 -> 567
    //   6560: aload_0
    //   6561: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   6564: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   6567: getfield 436	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   6570: ldc_w 933
    //   6573: lload 14
    //   6575: invokestatic 959	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   6578: invokeinterface 450 3 0
    //   6583: pop
    //   6584: aload_0
    //   6585: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   6588: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   6591: invokevirtual 462	com/tencent/smtt/sdk/TbsDownloadConfig:commit	()V
    //   6594: iload_2
    //   6595: istore 10
    //   6597: goto -6030 -> 567
    //   6600: lload 16
    //   6602: lstore 18
    //   6604: aload_0
    //   6605: lconst_0
    //   6606: invokespecial 1073	com/tencent/smtt/sdk/ag:a	(J)V
    //   6609: lload 16
    //   6611: lstore 18
    //   6613: aload_0
    //   6614: bipush 107
    //   6616: aload_0
    //   6617: aload 5
    //   6619: invokespecial 622	com/tencent/smtt/sdk/ag:a	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   6622: iconst_0
    //   6623: invokespecial 624	com/tencent/smtt/sdk/ag:a	(ILjava/lang/String;Z)V
    //   6626: lload 16
    //   6628: lstore 18
    //   6630: aload_0
    //   6631: getfield 638	com/tencent/smtt/sdk/ag:r	Z
    //   6634: ifeq -4194 -> 2440
    //   6637: lload 16
    //   6639: lstore 18
    //   6641: aload_0
    //   6642: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   6645: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   6648: sipush -309
    //   6651: invokevirtual 870	com/tencent/smtt/sdk/TbsDownloadConfig:setDownloadInterruptCode	(I)V
    //   6654: iload 22
    //   6656: istore 10
    //   6658: iload_1
    //   6659: ifne -6092 -> 567
    //   6662: aload_0
    //   6663: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   6666: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   6669: getfield 436	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   6672: ldc_w 933
    //   6675: lload 16
    //   6677: invokestatic 959	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   6680: invokeinterface 450 3 0
    //   6685: pop
    //   6686: aload_0
    //   6687: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   6690: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   6693: invokevirtual 462	com/tencent/smtt/sdk/TbsDownloadConfig:commit	()V
    //   6696: iload 22
    //   6698: istore 10
    //   6700: goto -6133 -> 567
    //   6703: iconst_0
    //   6704: istore_3
    //   6705: goto -6083 -> 622
    //   6708: iconst_2
    //   6709: istore_3
    //   6710: goto -6065 -> 645
    //   6713: aload_0
    //   6714: getfield 106	com/tencent/smtt/sdk/ag:v	Lcom/tencent/smtt/sdk/TbsLogReport$TbsLogInfo;
    //   6717: iconst_0
    //   6718: invokevirtual 939	com/tencent/smtt/sdk/TbsLogReport$TbsLogInfo:setPatchUpdateFlag	(I)V
    //   6721: goto -6070 -> 651
    //   6724: aload_0
    //   6725: getfield 94	com/tencent/smtt/sdk/ag:g	Landroid/content/Context;
    //   6728: invokestatic 301	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   6731: sipush -318
    //   6734: invokevirtual 870	com/tencent/smtt/sdk/TbsDownloadConfig:setDownloadInterruptCode	(I)V
    //   6737: aload_0
    //   6738: iconst_0
    //   6739: invokespecial 883	com/tencent/smtt/sdk/ag:c	(Z)Z
    //   6742: pop
    //   6743: goto -6060 -> 683
    //   6746: aload 11
    //   6748: getfield 305	com/tencent/smtt/sdk/TbsDownloadConfig:mPreferences	Landroid/content/SharedPreferences;
    //   6751: ldc_w 1131
    //   6754: iconst_0
    //   6755: invokeinterface 313 3 0
    //   6760: istore_3
    //   6761: aload 11
    //   6763: getfield 436	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   6766: astore 5
    //   6768: iinc 3 1
    //   6771: aload 5
    //   6773: ldc_w 1131
    //   6776: iload_3
    //   6777: invokestatic 459	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   6780: invokeinterface 450 3 0
    //   6785: pop
    //   6786: iload_3
    //   6787: aload 11
    //   6789: invokevirtual 1134	com/tencent/smtt/sdk/TbsDownloadConfig:getDownloadFailedMaxRetrytimes	()I
    //   6792: if_icmpne -6061 -> 731
    //   6795: aload_0
    //   6796: getfield 106	com/tencent/smtt/sdk/ag:v	Lcom/tencent/smtt/sdk/TbsLogReport$TbsLogInfo;
    //   6799: iconst_2
    //   6800: invokevirtual 996	com/tencent/smtt/sdk/TbsLogReport$TbsLogInfo:setDownloadCancel	(I)V
    //   6803: goto -6072 -> 731
    //   6806: iconst_0
    //   6807: istore_3
    //   6808: goto -6060 -> 748
    //   6811: astore 5
    //   6813: goto -4193 -> 2620
    //   6816: astore 24
    //   6818: aconst_null
    //   6819: astore 5
    //   6821: aconst_null
    //   6822: astore 11
    //   6824: aconst_null
    //   6825: astore 25
    //   6827: goto -2441 -> 4386
    //   6830: astore 24
    //   6832: aconst_null
    //   6833: astore 5
    //   6835: aconst_null
    //   6836: astore 25
    //   6838: goto -2452 -> 4386
    //   6841: astore 24
    //   6843: aconst_null
    //   6844: astore 25
    //   6846: goto -2460 -> 4386
    //   6849: astore 24
    //   6851: iload 10
    //   6853: istore_2
    //   6854: lload 20
    //   6856: lstore 14
    //   6858: goto -2472 -> 4386
    //   6861: astore 11
    //   6863: iload_2
    //   6864: istore 22
    //   6866: aload 23
    //   6868: astore 25
    //   6870: goto -3201 -> 3669
    //   6873: astore 24
    //   6875: aload 11
    //   6877: astore 25
    //   6879: iload_2
    //   6880: istore 22
    //   6882: aload 24
    //   6884: astore 11
    //   6886: aload 5
    //   6888: astore 24
    //   6890: aload 25
    //   6892: astore 5
    //   6894: aload 23
    //   6896: astore 25
    //   6898: goto -3229 -> 3669
    //   6901: astore 24
    //   6903: aload 11
    //   6905: astore 26
    //   6907: lload 30
    //   6909: lstore 14
    //   6911: iload 29
    //   6913: istore 22
    //   6915: aload 24
    //   6917: astore 11
    //   6919: aload 5
    //   6921: astore 24
    //   6923: aload 26
    //   6925: astore 5
    //   6927: goto -3258 -> 3669
    //   6930: lload 8
    //   6932: lstore 14
    //   6934: lload 33
    //   6936: lstore 8
    //   6938: goto -2044 -> 4894
    //   6941: lload 8
    //   6943: lstore 14
    //   6945: lload 16
    //   6947: lstore 8
    //   6949: goto -2055 -> 4894
    //
    // Exception table:
    //   from	to	target	type
    //   801	830	2327	java/lang/Throwable
    //   841	849	2327	java/lang/Throwable
    //   860	884	2327	java/lang/Throwable
    //   895	918	2327	java/lang/Throwable
    //   929	939	2327	java/lang/Throwable
    //   957	967	2327	java/lang/Throwable
    //   978	987	2327	java/lang/Throwable
    //   998	1006	2327	java/lang/Throwable
    //   1017	1030	2327	java/lang/Throwable
    //   1088	1104	2327	java/lang/Throwable
    //   1127	1136	2327	java/lang/Throwable
    //   1147	1155	2327	java/lang/Throwable
    //   1166	1179	2327	java/lang/Throwable
    //   1237	1242	2327	java/lang/Throwable
    //   1253	1260	2327	java/lang/Throwable
    //   1271	1277	2327	java/lang/Throwable
    //   1288	1293	2327	java/lang/Throwable
    //   1304	1312	2327	java/lang/Throwable
    //   1323	1352	2327	java/lang/Throwable
    //   1363	1375	2327	java/lang/Throwable
    //   1386	1395	2327	java/lang/Throwable
    //   1406	1412	2327	java/lang/Throwable
    //   1423	1429	2327	java/lang/Throwable
    //   1443	1450	2327	java/lang/Throwable
    //   1461	1467	2327	java/lang/Throwable
    //   1478	1494	2327	java/lang/Throwable
    //   1505	1514	2327	java/lang/Throwable
    //   1525	1542	2327	java/lang/Throwable
    //   1553	1559	2327	java/lang/Throwable
    //   1570	1575	2327	java/lang/Throwable
    //   1586	1594	2327	java/lang/Throwable
    //   1605	1629	2327	java/lang/Throwable
    //   1640	1646	2327	java/lang/Throwable
    //   1666	1672	2327	java/lang/Throwable
    //   1683	1691	2327	java/lang/Throwable
    //   1702	1711	2327	java/lang/Throwable
    //   1722	1729	2327	java/lang/Throwable
    //   1740	1748	2327	java/lang/Throwable
    //   1759	1765	2327	java/lang/Throwable
    //   1776	1781	2327	java/lang/Throwable
    //   1792	1799	2327	java/lang/Throwable
    //   1810	1824	2327	java/lang/Throwable
    //   1835	1843	2327	java/lang/Throwable
    //   1854	1869	2327	java/lang/Throwable
    //   1880	1888	2327	java/lang/Throwable
    //   1903	1913	2327	java/lang/Throwable
    //   1924	1935	2327	java/lang/Throwable
    //   1946	1952	2327	java/lang/Throwable
    //   1963	1973	2327	java/lang/Throwable
    //   1984	1988	2327	java/lang/Throwable
    //   1999	2005	2327	java/lang/Throwable
    //   2016	2026	2327	java/lang/Throwable
    //   2037	2046	2327	java/lang/Throwable
    //   2057	2064	2327	java/lang/Throwable
    //   2075	2088	2327	java/lang/Throwable
    //   2146	2152	2327	java/lang/Throwable
    //   2166	2171	2327	java/lang/Throwable
    //   2182	2190	2327	java/lang/Throwable
    //   2201	2230	2327	java/lang/Throwable
    //   2241	2247	2327	java/lang/Throwable
    //   2258	2263	2327	java/lang/Throwable
    //   2274	2282	2327	java/lang/Throwable
    //   2293	2324	2327	java/lang/Throwable
    //   2528	2536	2327	java/lang/Throwable
    //   2547	2559	2327	java/lang/Throwable
    //   2570	2578	2327	java/lang/Throwable
    //   2589	2595	2327	java/lang/Throwable
    //   2606	2611	2327	java/lang/Throwable
    //   2692	2707	2327	java/lang/Throwable
    //   2718	2723	2327	java/lang/Throwable
    //   2734	2742	2327	java/lang/Throwable
    //   2753	2770	2327	java/lang/Throwable
    //   2781	2792	2327	java/lang/Throwable
    //   2803	2824	2327	java/lang/Throwable
    //   2842	2852	2327	java/lang/Throwable
    //   2863	2868	2327	java/lang/Throwable
    //   2879	2887	2327	java/lang/Throwable
    //   2898	2927	2327	java/lang/Throwable
    //   2942	2949	2327	java/lang/Throwable
    //   2960	2966	2327	java/lang/Throwable
    //   2977	2987	2327	java/lang/Throwable
    //   2998	3005	2327	java/lang/Throwable
    //   3016	3023	2327	java/lang/Throwable
    //   3088	3093	2327	java/lang/Throwable
    //   3104	3112	2327	java/lang/Throwable
    //   3123	3153	2327	java/lang/Throwable
    //   3164	3177	2327	java/lang/Throwable
    //   3235	3245	2327	java/lang/Throwable
    //   3256	3269	2327	java/lang/Throwable
    //   3292	3300	2327	java/lang/Throwable
    //   3512	3518	2327	java/lang/Throwable
    //   3530	3536	2327	java/lang/Throwable
    //   3548	3554	2327	java/lang/Throwable
    //   3722	3728	2327	java/lang/Throwable
    //   3740	3746	2327	java/lang/Throwable
    //   3758	3764	2327	java/lang/Throwable
    //   4930	4936	2327	java/lang/Throwable
    //   4947	4953	2327	java/lang/Throwable
    //   4964	4970	2327	java/lang/Throwable
    //   4981	4988	2327	java/lang/Throwable
    //   4999	5012	2327	java/lang/Throwable
    //   5148	5154	2327	java/lang/Throwable
    //   5166	5172	2327	java/lang/Throwable
    //   5184	5190	2327	java/lang/Throwable
    //   5276	5282	2327	java/lang/Throwable
    //   5294	5300	2327	java/lang/Throwable
    //   5312	5318	2327	java/lang/Throwable
    //   5438	5450	2327	java/lang/Throwable
    //   5461	5469	2327	java/lang/Throwable
    //   5480	5486	2327	java/lang/Throwable
    //   5497	5507	2327	java/lang/Throwable
    //   5567	5575	2327	java/lang/Throwable
    //   5586	5599	2327	java/lang/Throwable
    //   5657	5668	2327	java/lang/Throwable
    //   5686	5696	2327	java/lang/Throwable
    //   5709	5722	2327	java/lang/Throwable
    //   5780	5786	2327	java/lang/Throwable
    //   5797	5810	2327	java/lang/Throwable
    //   5882	5893	2327	java/lang/Throwable
    //   5904	5917	2327	java/lang/Throwable
    //   6031	6042	2327	java/lang/Throwable
    //   6060	6077	2327	java/lang/Throwable
    //   6088	6095	2327	java/lang/Throwable
    //   6106	6119	2327	java/lang/Throwable
    //   6226	6237	2327	java/lang/Throwable
    //   6276	6281	2327	java/lang/Throwable
    //   6292	6299	2327	java/lang/Throwable
    //   6310	6323	2327	java/lang/Throwable
    //   6430	6439	2327	java/lang/Throwable
    //   6450	6457	2327	java/lang/Throwable
    //   6475	6480	2327	java/lang/Throwable
    //   6540	6553	2327	java/lang/Throwable
    //   801	830	2614	finally
    //   841	849	2614	finally
    //   860	884	2614	finally
    //   895	918	2614	finally
    //   929	939	2614	finally
    //   957	967	2614	finally
    //   978	987	2614	finally
    //   998	1006	2614	finally
    //   1017	1030	2614	finally
    //   1088	1104	2614	finally
    //   1127	1136	2614	finally
    //   1147	1155	2614	finally
    //   1166	1179	2614	finally
    //   1237	1242	2614	finally
    //   1253	1260	2614	finally
    //   1271	1277	2614	finally
    //   1288	1293	2614	finally
    //   1304	1312	2614	finally
    //   1323	1352	2614	finally
    //   1363	1375	2614	finally
    //   1386	1395	2614	finally
    //   1406	1412	2614	finally
    //   1423	1429	2614	finally
    //   1443	1450	2614	finally
    //   1461	1467	2614	finally
    //   1478	1494	2614	finally
    //   1505	1514	2614	finally
    //   1525	1542	2614	finally
    //   1553	1559	2614	finally
    //   1570	1575	2614	finally
    //   1586	1594	2614	finally
    //   1605	1629	2614	finally
    //   1640	1646	2614	finally
    //   1666	1672	2614	finally
    //   1683	1691	2614	finally
    //   1702	1711	2614	finally
    //   1722	1729	2614	finally
    //   1740	1748	2614	finally
    //   1759	1765	2614	finally
    //   1776	1781	2614	finally
    //   1792	1799	2614	finally
    //   1810	1824	2614	finally
    //   1835	1843	2614	finally
    //   1854	1869	2614	finally
    //   1880	1888	2614	finally
    //   1903	1913	2614	finally
    //   1924	1935	2614	finally
    //   1946	1952	2614	finally
    //   1963	1973	2614	finally
    //   1984	1988	2614	finally
    //   1999	2005	2614	finally
    //   2016	2026	2614	finally
    //   2037	2046	2614	finally
    //   2057	2064	2614	finally
    //   2075	2088	2614	finally
    //   2146	2152	2614	finally
    //   2166	2171	2614	finally
    //   2182	2190	2614	finally
    //   2201	2230	2614	finally
    //   2241	2247	2614	finally
    //   2258	2263	2614	finally
    //   2274	2282	2614	finally
    //   2293	2324	2614	finally
    //   2337	2345	2614	finally
    //   2353	2360	2614	finally
    //   2364	2372	2614	finally
    //   2376	2381	2614	finally
    //   2385	2393	2614	finally
    //   2397	2428	2614	finally
    //   2432	2440	2614	finally
    //   2444	2457	2614	finally
    //   2528	2536	2614	finally
    //   2547	2559	2614	finally
    //   2570	2578	2614	finally
    //   2589	2595	2614	finally
    //   2606	2611	2614	finally
    //   2692	2707	2614	finally
    //   2718	2723	2614	finally
    //   2734	2742	2614	finally
    //   2753	2770	2614	finally
    //   2781	2792	2614	finally
    //   2803	2824	2614	finally
    //   2842	2852	2614	finally
    //   2863	2868	2614	finally
    //   2879	2887	2614	finally
    //   2898	2927	2614	finally
    //   2942	2949	2614	finally
    //   2960	2966	2614	finally
    //   2977	2987	2614	finally
    //   2998	3005	2614	finally
    //   3016	3023	2614	finally
    //   3088	3093	2614	finally
    //   3104	3112	2614	finally
    //   3123	3153	2614	finally
    //   3164	3177	2614	finally
    //   3235	3245	2614	finally
    //   3256	3269	2614	finally
    //   3292	3300	2614	finally
    //   3512	3518	2614	finally
    //   3530	3536	2614	finally
    //   3548	3554	2614	finally
    //   3722	3728	2614	finally
    //   3740	3746	2614	finally
    //   3758	3764	2614	finally
    //   4930	4936	2614	finally
    //   4947	4953	2614	finally
    //   4964	4970	2614	finally
    //   4981	4988	2614	finally
    //   4999	5012	2614	finally
    //   5148	5154	2614	finally
    //   5166	5172	2614	finally
    //   5184	5190	2614	finally
    //   5276	5282	2614	finally
    //   5294	5300	2614	finally
    //   5312	5318	2614	finally
    //   5438	5450	2614	finally
    //   5461	5469	2614	finally
    //   5480	5486	2614	finally
    //   5497	5507	2614	finally
    //   5567	5575	2614	finally
    //   5586	5599	2614	finally
    //   5657	5668	2614	finally
    //   5686	5696	2614	finally
    //   5709	5722	2614	finally
    //   5780	5786	2614	finally
    //   5797	5810	2614	finally
    //   5882	5893	2614	finally
    //   5904	5917	2614	finally
    //   6031	6042	2614	finally
    //   6060	6077	2614	finally
    //   6088	6095	2614	finally
    //   6106	6119	2614	finally
    //   6226	6237	2614	finally
    //   6276	6281	2614	finally
    //   6292	6299	2614	finally
    //   6310	6323	2614	finally
    //   6430	6439	2614	finally
    //   6450	6457	2614	finally
    //   6475	6480	2614	finally
    //   6540	6553	2614	finally
    //   6604	6609	2614	finally
    //   6613	6626	2614	finally
    //   6630	6637	2614	finally
    //   6641	6654	2614	finally
    //   3314	3323	3652	java/io/IOException
    //   3328	3351	3652	java/io/IOException
    //   3614	3649	3652	java/io/IOException
    //   3396	3401	4216	java/io/IOException
    //   4115	4124	4216	java/io/IOException
    //   4132	4137	4216	java/io/IOException
    //   4145	4153	4216	java/io/IOException
    //   4161	4189	4216	java/io/IOException
    //   4197	4210	4216	java/io/IOException
    //   4252	4262	4216	java/io/IOException
    //   4270	4279	4216	java/io/IOException
    //   4287	4292	4216	java/io/IOException
    //   4300	4308	4216	java/io/IOException
    //   4316	4353	4216	java/io/IOException
    //   4361	4374	4216	java/io/IOException
    //   3396	3401	4380	finally
    //   4115	4124	4380	finally
    //   4132	4137	4380	finally
    //   4145	4153	4380	finally
    //   4161	4189	4380	finally
    //   4197	4210	4380	finally
    //   4252	4262	4380	finally
    //   4270	4279	4380	finally
    //   4287	4292	4380	finally
    //   4300	4308	4380	finally
    //   4316	4353	4380	finally
    //   4361	4374	4380	finally
    //   4386	4413	4413	java/lang/Throwable
    //   3669	3685	5389	finally
    //   3685	3710	5389	finally
    //   5063	5136	5389	finally
    //   5239	5264	5389	finally
    //   5373	5386	5389	finally
    //   4386	4413	6811	finally
    //   3300	3309	6816	finally
    //   3314	3323	6830	finally
    //   3328	3351	6830	finally
    //   3614	3649	6830	finally
    //   3351	3388	6841	finally
    //   3421	3428	6849	finally
    //   3442	3451	6849	finally
    //   3465	3478	6849	finally
    //   3840	3853	6849	finally
    //   3872	3879	6849	finally
    //   3893	3903	6849	finally
    //   3921	3929	6849	finally
    //   3951	3956	6849	finally
    //   3976	3981	6849	finally
    //   3998	4005	6849	finally
    //   4024	4037	6849	finally
    //   4054	4064	6849	finally
    //   4078	4083	6849	finally
    //   4448	4458	6849	finally
    //   4472	4477	6849	finally
    //   4511	4516	6849	finally
    //   4530	4538	6849	finally
    //   4552	4581	6849	finally
    //   4595	4601	6849	finally
    //   4615	4631	6849	finally
    //   4645	4655	6849	finally
    //   4685	4695	6849	finally
    //   4709	4720	6849	finally
    //   4734	4740	6849	finally
    //   4754	4764	6849	finally
    //   4778	4782	6849	finally
    //   4796	4802	6849	finally
    //   4816	4826	6849	finally
    //   4840	4849	6849	finally
    //   4863	4876	6849	finally
    //   3300	3309	6861	java/io/IOException
    //   3351	3388	6873	java/io/IOException
    //   3421	3428	6901	java/io/IOException
    //   3442	3451	6901	java/io/IOException
    //   3465	3478	6901	java/io/IOException
    //   3840	3853	6901	java/io/IOException
    //   3872	3879	6901	java/io/IOException
    //   3893	3903	6901	java/io/IOException
    //   3921	3929	6901	java/io/IOException
    //   3951	3956	6901	java/io/IOException
    //   3976	3981	6901	java/io/IOException
    //   3998	4005	6901	java/io/IOException
    //   4024	4037	6901	java/io/IOException
    //   4054	4064	6901	java/io/IOException
    //   4078	4083	6901	java/io/IOException
    //   4448	4458	6901	java/io/IOException
    //   4472	4477	6901	java/io/IOException
    //   4511	4516	6901	java/io/IOException
    //   4530	4538	6901	java/io/IOException
    //   4552	4581	6901	java/io/IOException
    //   4595	4601	6901	java/io/IOException
    //   4615	4631	6901	java/io/IOException
    //   4645	4655	6901	java/io/IOException
    //   4685	4695	6901	java/io/IOException
    //   4709	4720	6901	java/io/IOException
    //   4734	4740	6901	java/io/IOException
    //   4754	4764	6901	java/io/IOException
    //   4778	4782	6901	java/io/IOException
    //   4796	4802	6901	java/io/IOException
    //   4816	4826	6901	java/io/IOException
    //   4840	4849	6901	java/io/IOException
    //   4863	4876	6901	java/io/IOException
  }

  public void c()
  {
    AppMethodBeat.i(64282);
    this.r = true;
    TbsLogReport.TbsLogInfo localTbsLogInfo;
    if (TbsShareManager.isThirdPartyApp(this.g))
    {
      localTbsLogInfo = TbsLogReport.getInstance(this.g).tbsLogInfo();
      localTbsLogInfo.setErrorCode(-309);
      localTbsLogInfo.setFailDetail(new Exception());
      if (TbsDownloadConfig.getInstance(this.g).mPreferences.getInt("tbs_downloaddecouplecore", 0) == 1)
      {
        TbsLogReport.getInstance(this.g).eventReport(TbsLogReport.EventType.TYPE_DOWNLOAD_DECOUPLE, localTbsLogInfo);
        AppMethodBeat.o(64282);
      }
    }
    while (true)
    {
      return;
      TbsLogReport.getInstance(this.g).eventReport(TbsLogReport.EventType.TYPE_DOWNLOAD, localTbsLogInfo);
      AppMethodBeat.o(64282);
    }
  }

  public void d()
  {
    AppMethodBeat.i(64283);
    c();
    c(false);
    c(true);
    AppMethodBeat.o(64283);
  }

  public boolean e()
  {
    AppMethodBeat.i(64289);
    TbsLog.i("TbsDownload", "[TbsApkDownloader.isDownloadForeground] mIsDownloadForeground=" + this.C);
    boolean bool = this.C;
    AppMethodBeat.o(64289);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.ag
 * JD-Core Version:    0.6.2
 */
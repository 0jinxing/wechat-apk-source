package com.tencent.smtt.sdk;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.utils.Apn;
import com.tencent.smtt.utils.TbsLog;
import com.tencent.smtt.utils.a;
import com.tencent.smtt.utils.b;
import com.tencent.smtt.utils.k;
import com.tencent.smtt.utils.n;
import com.tencent.smtt.utils.n.a;
import com.tencent.smtt.utils.v;
import java.io.File;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

public class TbsDownloader
{
  public static final boolean DEBUG_DISABLE_DOWNLOAD = false;
  public static boolean DOWNLOAD_OVERSEA_TBS = false;
  public static final String LOGTAG = "TbsDownload";
  public static final String TBS_METADATA = "com.tencent.mm.BuildInfo.CLIENT_VERSION";
  static boolean a;
  private static String b;
  private static Context c;
  private static Handler d;
  private static String e;
  private static Object f = new byte[0];
  private static ag g;
  private static HandlerThread h;
  private static boolean i = false;
  private static boolean j = false;
  private static boolean k = false;
  private static long l = -1L;

  protected static File a(int paramInt)
  {
    AppMethodBeat.i(64380);
    String[] arrayOfString = TbsShareManager.getCoreProviderAppList();
    Object localObject1 = null;
    int m = arrayOfString.length;
    int n = 0;
    Object localObject2 = localObject1;
    if (n < m)
    {
      localObject2 = arrayOfString[n];
      if (((String)localObject2).equals(c.getApplicationInfo().packageName))
        break label150;
      localObject2 = k.a(c, (String)localObject2, 4, false);
      if (!getOverSea(c))
        break label137;
    }
    label137: for (localObject1 = "x5.oversea.tbs.org"; ; localObject1 = "x5.tbs.org")
    {
      localObject1 = new File((String)localObject2, (String)localObject1);
      if (!((File)localObject1).exists())
        break label156;
      if (a.a(c, (File)localObject1) != paramInt)
        break;
      TbsLog.i("TbsDownload", "local tbs version fond,path = " + ((File)localObject1).getAbsolutePath());
      localObject2 = localObject1;
      AppMethodBeat.o(64380);
      return localObject2;
    }
    TbsLog.i("TbsDownload", "version is not match");
    while (true)
    {
      label150: n++;
      break;
      label156: TbsLog.i("TbsDownload", "can not find local backup core file");
    }
  }

  static String a(Context paramContext)
  {
    AppMethodBeat.i(64377);
    if (!TextUtils.isEmpty(b))
    {
      paramContext = b;
      AppMethodBeat.o(64377);
    }
    while (true)
    {
      return paramContext;
      Locale localLocale = Locale.getDefault();
      StringBuffer localStringBuffer = new StringBuffer();
      paramContext = Build.VERSION.RELEASE;
      try
      {
        str = new java/lang/String;
        str.<init>(paramContext.getBytes("UTF-8"), "ISO8859-1");
        paramContext = str;
        if (paramContext == null)
        {
          localStringBuffer.append("1.0");
          localStringBuffer.append("; ");
          paramContext = localLocale.getLanguage();
          if (paramContext == null)
            break label256;
          localStringBuffer.append(paramContext.toLowerCase());
          paramContext = localLocale.getCountry();
          if (paramContext != null)
          {
            localStringBuffer.append("-");
            localStringBuffer.append(paramContext.toLowerCase());
          }
          if ("REL".equals(Build.VERSION.CODENAME))
            paramContext = Build.MODEL;
        }
      }
      catch (Exception localException1)
      {
        try
        {
          while (true)
          {
            String str = new java/lang/String;
            str.<init>(paramContext.getBytes("UTF-8"), "ISO8859-1");
            paramContext = str;
            if (paramContext != null)
              break label270;
            localStringBuffer.append("; ");
            if (Build.ID != null)
              break label293;
            paramContext = "";
            paramContext = paramContext.replaceAll("[一-龥]", "");
            if (paramContext != null)
              break label300;
            localStringBuffer.append(" Build/");
            localStringBuffer.append("00");
            paramContext = String.format("Mozilla/5.0 (Linux; U; Android %s) AppleWebKit/533.1 (KHTML, like Gecko)Version/4.0 Mobile Safari/533.1", new Object[] { localStringBuffer });
            b = paramContext;
            AppMethodBeat.o(64377);
            break;
            localException1 = localException1;
            continue;
            if (paramContext.length() > 0)
              localStringBuffer.append(paramContext);
            else
              localStringBuffer.append("1.0");
          }
          label256: localStringBuffer.append("en");
        }
        catch (Exception localException2)
        {
          while (true)
          {
            continue;
            label270: if (paramContext.length() > 0)
            {
              localStringBuffer.append("; ");
              localStringBuffer.append(paramContext);
              continue;
              label293: paramContext = Build.ID;
              continue;
              label300: if (paramContext.length() > 0)
              {
                localStringBuffer.append(" Build/");
                localStringBuffer.append(paramContext);
              }
            }
          }
        }
      }
    }
  }

  private static String a(String paramString)
  {
    String str = paramString;
    if (paramString == null)
      str = "";
    return str;
  }

  private static void a(JSONArray paramJSONArray)
  {
    AppMethodBeat.i(64367);
    String[] arrayOfString = e();
    int m = arrayOfString.length;
    int n = 0;
    int i1;
    if (n < m)
    {
      String str = arrayOfString[n];
      i1 = TbsShareManager.getSharedTbsCoreVersion(c, str);
      if (i1 > 0)
      {
        Context localContext = TbsShareManager.getPackageContext(c, str, true);
        if ((localContext == null) || (an.a().f(localContext)))
          break label88;
        TbsLog.e("TbsDownload", "host check failed,packageName = ".concat(String.valueOf(str)));
      }
    }
    label145: 
    while (true)
    {
      n++;
      break;
      label88: int i2 = 0;
      label91: if (i2 < paramJSONArray.length())
        if (paramJSONArray.optInt(i2) != i1);
      for (i2 = 1; ; i2 = 0)
      {
        if (i2 != 0)
          break label145;
        paramJSONArray.put(i1);
        break;
        i2++;
        break label91;
        AppMethodBeat.o(64367);
        return;
      }
    }
  }

  private static void a(boolean paramBoolean, TbsDownloader.TbsDownloaderCallback paramTbsDownloaderCallback)
  {
    int m = 0;
    AppMethodBeat.i(64364);
    TbsLog.i("TbsDownload", "[TbsDownloader.queryConfig]");
    d.removeMessages(100);
    Message localMessage = Message.obtain(d, 100);
    if (paramTbsDownloaderCallback != null)
      localMessage.obj = paramTbsDownloaderCallback;
    localMessage.arg1 = 0;
    if (paramBoolean)
      m = 1;
    localMessage.arg1 = m;
    localMessage.sendToTarget();
    AppMethodBeat.o(64364);
  }

  private static boolean a(Context paramContext, boolean paramBoolean, TbsDownloader.TbsDownloaderCallback paramTbsDownloaderCallback)
  {
    Object localObject = null;
    boolean bool1 = false;
    AppMethodBeat.i(64351);
    TbsDownloadConfig localTbsDownloadConfig = TbsDownloadConfig.getInstance(paramContext);
    if (Build.VERSION.SDK_INT < 8)
    {
      localTbsDownloadConfig.setDownloadInterruptCode(-102);
      AppMethodBeat.o(64351);
      paramBoolean = bool1;
    }
    while (true)
    {
      return paramBoolean;
      if (!localTbsDownloadConfig.mPreferences.contains("is_oversea"))
      {
        boolean bool2 = paramBoolean;
        if (paramBoolean)
        {
          bool2 = paramBoolean;
          if (!"com.tencent.mm".equals(paramContext.getApplicationInfo().packageName))
          {
            TbsLog.i("TbsDownload", "needDownload-oversea is true, but not WX");
            bool2 = false;
          }
        }
        localTbsDownloadConfig.a.put("is_oversea", Boolean.valueOf(bool2));
        localTbsDownloadConfig.commit();
        j = bool2;
        TbsLog.i("TbsDownload", "needDownload-first-called--isoversea = ".concat(String.valueOf(bool2)));
      }
      if ((getOverSea(paramContext)) && (Build.VERSION.SDK_INT != 16) && (Build.VERSION.SDK_INT != 17) && (Build.VERSION.SDK_INT != 18))
      {
        TbsLog.i("TbsDownload", "needDownload- return false,  because of  version is " + Build.VERSION.SDK_INT + ", and overea");
        if (paramTbsDownloaderCallback != null)
          paramTbsDownloaderCallback.onNeedDownloadFinish(false, 0);
        localTbsDownloadConfig.setDownloadInterruptCode(-103);
        AppMethodBeat.o(64351);
        paramBoolean = bool1;
        continue;
      }
      paramContext = localTbsDownloadConfig.mPreferences.getString("device_cpuabi", null);
      e = paramContext;
      if (!TextUtils.isEmpty(paramContext));
      try
      {
        paramContext = Pattern.compile("i686|mips|x86_64").matcher(e);
        if ((paramContext != null) && (paramContext.find()))
        {
          if (paramTbsDownloaderCallback != null)
            paramTbsDownloaderCallback.onNeedDownloadFinish(false, 0);
          localTbsDownloadConfig.setDownloadInterruptCode(-104);
          AppMethodBeat.o(64351);
          paramBoolean = bool1;
          continue;
        }
        paramBoolean = true;
        AppMethodBeat.o(64351);
      }
      catch (Exception paramContext)
      {
        while (true)
          paramContext = localObject;
      }
    }
  }

  private static boolean a(Context paramContext, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(64350);
    TbsDownloadConfig localTbsDownloadConfig = TbsDownloadConfig.getInstance(paramContext);
    paramContext = null;
    Object localObject;
    int m;
    String str1;
    String str2;
    int n;
    String str3;
    long l1;
    long l3;
    if (!paramBoolean1)
    {
      localObject = localTbsDownloadConfig.mPreferences.getString("app_versionname", null);
      m = localTbsDownloadConfig.mPreferences.getInt("app_versioncode", 0);
      str1 = localTbsDownloadConfig.mPreferences.getString("app_metadata", null);
      str2 = b.a(c);
      n = b.b(c);
      str3 = b.a(c, "com.tencent.mm.BuildInfo.CLIENT_VERSION");
      TbsLog.i("TbsDownload", "[TbsDownloader.needSendQueryRequest] appVersionName=" + str2 + " oldAppVersionName=" + (String)localObject + " appVersionCode=" + n + " oldAppVersionCode=" + m + " appMetadata=" + str3 + " oldAppVersionMetadata=" + str1);
      l1 = System.currentTimeMillis();
      long l2 = localTbsDownloadConfig.mPreferences.getLong("last_check", 0L);
      TbsLog.i("TbsDownload", "[TbsDownloader.needSendQueryRequest] timeLastCheck=" + l2 + " timeNow=" + l1);
      l3 = l2;
      if (paramBoolean2)
      {
        paramBoolean1 = localTbsDownloadConfig.mPreferences.contains("last_check");
        TbsLog.i("TbsDownload", "[TbsDownloader.needSendQueryRequest] hasLaskCheckKey=".concat(String.valueOf(paramBoolean1)));
        l3 = l2;
        if (paramBoolean1)
        {
          l3 = l2;
          if (l2 == 0L)
            l3 = l1;
        }
      }
      l2 = localTbsDownloadConfig.mPreferences.getLong("last_request_success", 0L);
      long l4 = localTbsDownloadConfig.mPreferences.getLong("count_request_fail_in_24hours", 0L);
      long l5 = localTbsDownloadConfig.getRetryInterval();
      TbsLog.i("TbsDownload", "retryInterval = " + l5 + " s");
      TbsPVConfig.releaseInstance();
      int i1 = TbsPVConfig.getInstance(c).getEmergentCoreVersion();
      int i2 = TbsDownloadConfig.getInstance(c).mPreferences.getInt("tbs_download_version", 0);
      if ((l1 - l3 <= 1000L * l5) && ((i1 <= an.a().j(c)) || (i1 <= i2)) && ((!TbsShareManager.isThirdPartyApp(c)) || (l2 <= 0L) || (l1 - l2 <= l5 * 1000L) || (l4 >= 11L)))
      {
        if ((TbsShareManager.isThirdPartyApp(c)) && (TbsShareManager.findCoreForThirdPartyApp(c) == 0) && (!d()))
          an.a().d(c);
        for (paramBoolean1 = true; ; paramBoolean1 = true)
        {
          if ((!paramBoolean1) && (TbsShareManager.isThirdPartyApp(c)))
          {
            localObject = TbsLogReport.getInstance(c).tbsLogInfo();
            ((TbsLogReport.TbsLogInfo)localObject).setErrorCode(-119);
            ((TbsLogReport.TbsLogInfo)localObject).setFailDetail(paramContext);
            TbsLogReport.getInstance(c).eventReport(TbsLogReport.EventType.TYPE_DOWNLOAD, (TbsLogReport.TbsLogInfo)localObject);
          }
          AppMethodBeat.o(64350);
          return paramBoolean1;
          if ((str2 == null) || (n == 0) || (str3 == null))
            break;
          if ((str2.equals(localObject)) && (n == m) && (str3.equals(str1)))
            break label729;
        }
        if (!TbsShareManager.isThirdPartyApp(c))
          break label729;
      }
    }
    label729: for (paramContext = "timeNow - timeLastCheck is " + (l1 - l3) + " TbsShareManager.findCoreForThirdPartyApp(sAppContext) is " + TbsShareManager.findCoreForThirdPartyApp(c) + " sendRequestWithSameHostCoreVersion() is " + d() + " appVersionName is " + str2 + " appVersionCode is " + n + " appMetadata is " + str3 + " oldAppVersionName is " + (String)localObject + " oldAppVersionCode is " + m + " oldAppVersionMetadata is " + str1; ; paramContext = null)
    {
      paramBoolean1 = false;
      break;
      paramBoolean1 = true;
      break;
    }
  }

  // ERROR //
  @TargetApi(11)
  private static boolean a(String paramString, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    // Byte code:
    //   0: ldc_w 542
    //   3: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: ldc 14
    //   8: ldc_w 544
    //   11: aload_0
    //   12: invokestatic 262	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   15: invokevirtual 265	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   18: invokestatic 135	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   21: getstatic 58	com/tencent/smtt/sdk/TbsDownloader:c	Landroid/content/Context;
    //   24: invokestatic 313	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   27: astore 4
    //   29: aload_0
    //   30: invokestatic 156	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   33: ifeq +43 -> 76
    //   36: iload_2
    //   37: ifeq +28 -> 65
    //   40: aload 4
    //   42: bipush 148
    //   44: invokevirtual 319	com/tencent/smtt/sdk/TbsDownloadConfig:setDownloadInterruptCode	(I)V
    //   47: ldc 14
    //   49: ldc_w 546
    //   52: invokestatic 135	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   55: iconst_0
    //   56: istore_2
    //   57: ldc_w 542
    //   60: invokestatic 138	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   63: iload_2
    //   64: ireturn
    //   65: aload 4
    //   67: sipush -208
    //   70: invokevirtual 319	com/tencent/smtt/sdk/TbsDownloadConfig:setDownloadInterruptCode	(I)V
    //   73: goto -26 -> 47
    //   76: new 548	org/json/JSONObject
    //   79: dup
    //   80: aload_0
    //   81: invokespecial 549	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   84: astore 5
    //   86: aload 5
    //   88: ldc_w 551
    //   91: invokevirtual 554	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   94: istore 6
    //   96: iload 6
    //   98: ifeq +52 -> 150
    //   101: iload_2
    //   102: ifeq +37 -> 139
    //   105: aload 4
    //   107: bipush 147
    //   109: invokevirtual 319	com/tencent/smtt/sdk/TbsDownloadConfig:setDownloadInterruptCode	(I)V
    //   112: ldc 14
    //   114: ldc_w 556
    //   117: iload 6
    //   119: invokestatic 559	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   122: invokevirtual 265	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   125: invokestatic 135	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   128: iconst_0
    //   129: istore_2
    //   130: ldc_w 542
    //   133: invokestatic 138	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   136: goto -73 -> 63
    //   139: aload 4
    //   141: sipush -209
    //   144: invokevirtual 319	com/tencent/smtt/sdk/TbsDownloadConfig:setDownloadInterruptCode	(I)V
    //   147: goto -35 -> 112
    //   150: aload 5
    //   152: ldc_w 561
    //   155: invokevirtual 554	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   158: istore 7
    //   160: aload 5
    //   162: ldc_w 563
    //   165: invokevirtual 565	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   168: astore 8
    //   170: aload 5
    //   172: ldc_w 567
    //   175: ldc 214
    //   177: invokevirtual 570	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   180: astore 9
    //   182: aload 5
    //   184: ldc_w 572
    //   187: invokevirtual 554	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   190: istore 10
    //   192: aload 5
    //   194: ldc_w 574
    //   197: invokevirtual 554	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   200: istore 11
    //   202: aload 5
    //   204: ldc_w 576
    //   207: invokevirtual 554	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   210: istore 12
    //   212: aload 5
    //   214: ldc_w 578
    //   217: invokevirtual 554	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   220: istore 13
    //   222: aload 5
    //   224: ldc_w 580
    //   227: invokevirtual 554	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   230: istore 14
    //   232: aload 5
    //   234: ldc_w 582
    //   237: invokevirtual 585	org/json/JSONObject:getLong	(Ljava/lang/String;)J
    //   240: lstore 15
    //   242: aload 5
    //   244: ldc_w 587
    //   247: invokevirtual 585	org/json/JSONObject:getLong	(Ljava/lang/String;)J
    //   250: lstore 17
    //   252: aload 5
    //   254: ldc_w 589
    //   257: lconst_0
    //   258: invokevirtual 592	org/json/JSONObject:optLong	(Ljava/lang/String;J)J
    //   261: lstore 19
    //   263: aload 5
    //   265: ldc_w 594
    //   268: iconst_m1
    //   269: invokevirtual 596	org/json/JSONObject:optInt	(Ljava/lang/String;I)I
    //   272: istore 21
    //   274: iconst_0
    //   275: istore 6
    //   277: aload 5
    //   279: ldc_w 598
    //   282: invokevirtual 554	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   285: istore 22
    //   287: iload 22
    //   289: istore 6
    //   291: aload 4
    //   293: getfield 338	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   296: ldc_w 600
    //   299: iload 6
    //   301: invokestatic 605	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   304: invokeinterface 348 3 0
    //   309: pop
    //   310: iload_2
    //   311: ifeq +59 -> 370
    //   314: getstatic 608	com/tencent/smtt/sdk/QbSdk:i	Z
    //   317: ifeq +53 -> 370
    //   320: getstatic 58	com/tencent/smtt/sdk/TbsDownloader:c	Landroid/content/Context;
    //   323: invokestatic 477	com/tencent/smtt/sdk/TbsShareManager:isThirdPartyApp	(Landroid/content/Context;)Z
    //   326: ifeq +44 -> 370
    //   329: aload 5
    //   331: ldc_w 610
    //   334: iconst_0
    //   335: invokevirtual 596	org/json/JSONObject:optInt	(Ljava/lang/String;I)I
    //   338: istore 6
    //   340: invokestatic 615	com/tencent/smtt/sdk/TbsExtensionFunctionManager:getInstance	()Lcom/tencent/smtt/sdk/TbsExtensionFunctionManager;
    //   343: astore_0
    //   344: getstatic 58	com/tencent/smtt/sdk/TbsDownloader:c	Landroid/content/Context;
    //   347: astore 23
    //   349: iload 6
    //   351: iconst_1
    //   352: if_icmpne +811 -> 1163
    //   355: iconst_1
    //   356: istore 24
    //   358: aload_0
    //   359: aload 23
    //   361: ldc_w 617
    //   364: iload 24
    //   366: invokevirtual 621	com/tencent/smtt/sdk/TbsExtensionFunctionManager:setFunctionEnable	(Landroid/content/Context;Ljava/lang/String;Z)Z
    //   369: pop
    //   370: iload_2
    //   371: ifeq +189 -> 560
    //   374: aload 5
    //   376: ldc_w 623
    //   379: iconst_0
    //   380: invokevirtual 596	org/json/JSONObject:optInt	(Ljava/lang/String;I)I
    //   383: istore 6
    //   385: iload 6
    //   387: iconst_1
    //   388: iand
    //   389: ifeq +810 -> 1199
    //   392: iconst_1
    //   393: istore 24
    //   395: invokestatic 615	com/tencent/smtt/sdk/TbsExtensionFunctionManager:getInstance	()Lcom/tencent/smtt/sdk/TbsExtensionFunctionManager;
    //   398: getstatic 58	com/tencent/smtt/sdk/TbsDownloader:c	Landroid/content/Context;
    //   401: ldc_w 625
    //   404: iload 24
    //   406: invokevirtual 621	com/tencent/smtt/sdk/TbsExtensionFunctionManager:setFunctionEnable	(Landroid/content/Context;Ljava/lang/String;Z)Z
    //   409: pop
    //   410: ldc 14
    //   412: ldc_w 627
    //   415: iload 24
    //   417: invokestatic 356	java/lang/String:valueOf	(Z)Ljava/lang/String;
    //   420: invokevirtual 265	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   423: invokestatic 630	com/tencent/smtt/utils/TbsLog:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   426: iload 6
    //   428: iconst_2
    //   429: iand
    //   430: ifeq +775 -> 1205
    //   433: iconst_1
    //   434: istore 24
    //   436: invokestatic 615	com/tencent/smtt/sdk/TbsExtensionFunctionManager:getInstance	()Lcom/tencent/smtt/sdk/TbsExtensionFunctionManager;
    //   439: getstatic 58	com/tencent/smtt/sdk/TbsDownloader:c	Landroid/content/Context;
    //   442: ldc_w 632
    //   445: iload 24
    //   447: invokevirtual 621	com/tencent/smtt/sdk/TbsExtensionFunctionManager:setFunctionEnable	(Landroid/content/Context;Ljava/lang/String;Z)Z
    //   450: pop
    //   451: ldc 14
    //   453: ldc_w 634
    //   456: iload 24
    //   458: invokestatic 356	java/lang/String:valueOf	(Z)Ljava/lang/String;
    //   461: invokevirtual 265	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   464: invokestatic 630	com/tencent/smtt/utils/TbsLog:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   467: iload 6
    //   469: iconst_4
    //   470: iand
    //   471: ifeq +740 -> 1211
    //   474: iconst_1
    //   475: istore 24
    //   477: invokestatic 615	com/tencent/smtt/sdk/TbsExtensionFunctionManager:getInstance	()Lcom/tencent/smtt/sdk/TbsExtensionFunctionManager;
    //   480: getstatic 58	com/tencent/smtt/sdk/TbsDownloader:c	Landroid/content/Context;
    //   483: ldc_w 636
    //   486: iload 24
    //   488: invokevirtual 621	com/tencent/smtt/sdk/TbsExtensionFunctionManager:setFunctionEnable	(Landroid/content/Context;Ljava/lang/String;Z)Z
    //   491: pop
    //   492: iload 24
    //   494: invokestatic 640	com/tencent/smtt/sdk/QbSdk:setDisableUnpreinitBySwitch	(Z)V
    //   497: ldc 14
    //   499: ldc_w 642
    //   502: iload 24
    //   504: invokestatic 356	java/lang/String:valueOf	(Z)Ljava/lang/String;
    //   507: invokevirtual 265	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   510: invokestatic 135	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   513: iload 6
    //   515: bipush 8
    //   517: iand
    //   518: ifeq +699 -> 1217
    //   521: iconst_1
    //   522: istore 24
    //   524: invokestatic 615	com/tencent/smtt/sdk/TbsExtensionFunctionManager:getInstance	()Lcom/tencent/smtt/sdk/TbsExtensionFunctionManager;
    //   527: getstatic 58	com/tencent/smtt/sdk/TbsDownloader:c	Landroid/content/Context;
    //   530: ldc_w 644
    //   533: iload 24
    //   535: invokevirtual 621	com/tencent/smtt/sdk/TbsExtensionFunctionManager:setFunctionEnable	(Landroid/content/Context;Ljava/lang/String;Z)Z
    //   538: pop
    //   539: iload 24
    //   541: invokestatic 647	com/tencent/smtt/sdk/QbSdk:setDisableUseHostBackupCoreBySwitch	(Z)V
    //   544: ldc 14
    //   546: ldc_w 649
    //   549: iload 24
    //   551: invokestatic 356	java/lang/String:valueOf	(Z)Ljava/lang/String;
    //   554: invokevirtual 265	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   557: invokestatic 135	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   560: aconst_null
    //   561: astore 23
    //   563: iconst_0
    //   564: istore 25
    //   566: iconst_0
    //   567: istore 26
    //   569: iconst_0
    //   570: istore 27
    //   572: iconst_0
    //   573: istore 6
    //   575: iconst_1
    //   576: istore 28
    //   578: iconst_1
    //   579: istore 24
    //   581: ldc 214
    //   583: astore 29
    //   585: aload 29
    //   587: astore 30
    //   589: iload 28
    //   591: istore 31
    //   593: iload 27
    //   595: istore 32
    //   597: iload 26
    //   599: istore 33
    //   601: iload 25
    //   603: istore 22
    //   605: aload 5
    //   607: ldc_w 651
    //   610: invokevirtual 565	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   613: astore 34
    //   615: aload 29
    //   617: astore 30
    //   619: iload 28
    //   621: istore 31
    //   623: iload 27
    //   625: istore 32
    //   627: iload 26
    //   629: istore 33
    //   631: iload 25
    //   633: istore 22
    //   635: aload 34
    //   637: astore 23
    //   639: aload 5
    //   641: ldc_w 653
    //   644: invokevirtual 554	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   647: istore 25
    //   649: aload 29
    //   651: astore 30
    //   653: iload 28
    //   655: istore 31
    //   657: iload 27
    //   659: istore 32
    //   661: iload 26
    //   663: istore 33
    //   665: iload 25
    //   667: istore 22
    //   669: aload 34
    //   671: astore 23
    //   673: aload 5
    //   675: ldc_w 655
    //   678: invokevirtual 554	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   681: istore 26
    //   683: aload 29
    //   685: astore 30
    //   687: iload 28
    //   689: istore 31
    //   691: iload 27
    //   693: istore 32
    //   695: iload 26
    //   697: istore 33
    //   699: iload 25
    //   701: istore 22
    //   703: aload 34
    //   705: astore 23
    //   707: aload 5
    //   709: ldc_w 657
    //   712: invokevirtual 660	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   715: ifeq +41 -> 756
    //   718: aload 29
    //   720: astore 30
    //   722: iload 28
    //   724: istore 31
    //   726: iload 27
    //   728: istore 32
    //   730: iload 26
    //   732: istore 33
    //   734: iload 25
    //   736: istore 22
    //   738: aload 34
    //   740: astore 23
    //   742: aload 5
    //   744: ldc_w 657
    //   747: invokevirtual 554	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   750: ifeq +503 -> 1253
    //   753: iconst_1
    //   754: istore 6
    //   756: aload 29
    //   758: astore_0
    //   759: aload 29
    //   761: astore 30
    //   763: iload 28
    //   765: istore 31
    //   767: iload 6
    //   769: istore 32
    //   771: iload 26
    //   773: istore 33
    //   775: iload 25
    //   777: istore 22
    //   779: aload 34
    //   781: astore 23
    //   783: aload 5
    //   785: ldc_w 662
    //   788: invokevirtual 660	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   791: ifeq +36 -> 827
    //   794: aload 29
    //   796: astore 30
    //   798: iload 28
    //   800: istore 31
    //   802: iload 6
    //   804: istore 32
    //   806: iload 26
    //   808: istore 33
    //   810: iload 25
    //   812: istore 22
    //   814: aload 34
    //   816: astore 23
    //   818: aload 5
    //   820: ldc_w 662
    //   823: invokevirtual 565	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   826: astore_0
    //   827: aload_0
    //   828: astore 30
    //   830: iload 28
    //   832: istore 31
    //   834: iload 6
    //   836: istore 32
    //   838: iload 26
    //   840: istore 33
    //   842: iload 25
    //   844: istore 22
    //   846: aload 34
    //   848: astore 23
    //   850: aload 5
    //   852: ldc_w 664
    //   855: invokevirtual 660	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   858: ifeq +40 -> 898
    //   861: aload_0
    //   862: astore 30
    //   864: iload 28
    //   866: istore 31
    //   868: iload 6
    //   870: istore 32
    //   872: iload 26
    //   874: istore 33
    //   876: iload 25
    //   878: istore 22
    //   880: aload 34
    //   882: astore 23
    //   884: aload 5
    //   886: ldc_w 664
    //   889: invokevirtual 554	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   892: ifeq +367 -> 1259
    //   895: iconst_1
    //   896: istore 24
    //   898: aload_0
    //   899: astore 30
    //   901: iload 24
    //   903: istore 31
    //   905: iload 6
    //   907: istore 32
    //   909: iload 26
    //   911: istore 33
    //   913: iload 25
    //   915: istore 22
    //   917: aload 34
    //   919: astore 23
    //   921: aload 5
    //   923: ldc_w 666
    //   926: invokevirtual 660	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   929: ifeq +2279 -> 3208
    //   932: aload_0
    //   933: astore 30
    //   935: iload 24
    //   937: istore 31
    //   939: iload 6
    //   941: istore 32
    //   943: iload 26
    //   945: istore 33
    //   947: iload 25
    //   949: istore 22
    //   951: aload 34
    //   953: astore 23
    //   955: aload 5
    //   957: ldc_w 666
    //   960: invokevirtual 554	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   963: istore 27
    //   965: iload 27
    //   967: ifeq +298 -> 1265
    //   970: iconst_1
    //   971: istore 31
    //   973: aload 34
    //   975: astore 23
    //   977: iload 25
    //   979: istore 22
    //   981: iload 26
    //   983: istore 33
    //   985: aload 5
    //   987: ldc_w 668
    //   990: invokevirtual 554	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   993: istore 32
    //   995: iconst_0
    //   996: istore 26
    //   998: aload 5
    //   1000: ldc_w 670
    //   1003: invokevirtual 554	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   1006: istore 25
    //   1008: getstatic 41	com/tencent/smtt/sdk/TbsDownloader:f	Ljava/lang/Object;
    //   1011: astore 30
    //   1013: aload 30
    //   1015: monitorenter
    //   1016: iload 6
    //   1018: ifeq +19 -> 1037
    //   1021: aload 4
    //   1023: getfield 338	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   1026: ldc_w 672
    //   1029: ldc 214
    //   1031: invokeinterface 348 3 0
    //   1036: pop
    //   1037: aload_0
    //   1038: invokestatic 156	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   1041: ifne +59 -> 1100
    //   1044: aload_0
    //   1045: invokevirtual 234	java/lang/String:length	()I
    //   1048: bipush 96
    //   1050: if_icmpne +50 -> 1100
    //   1053: new 115	java/lang/StringBuilder
    //   1056: astore 34
    //   1058: aload 34
    //   1060: invokespecial 673	java/lang/StringBuilder:<init>	()V
    //   1063: aload 34
    //   1065: aload_0
    //   1066: invokevirtual 128	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1069: ldc_w 675
    //   1072: invokevirtual 128	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1075: invokestatic 679	com/tencent/smtt/utils/o:c	()Ljava/lang/String;
    //   1078: invokevirtual 128	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1081: invokevirtual 131	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1084: astore_0
    //   1085: aload 4
    //   1087: getfield 338	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   1090: ldc_w 672
    //   1093: aload_0
    //   1094: invokeinterface 348 3 0
    //   1099: pop
    //   1100: aload 30
    //   1102: monitorexit
    //   1103: iload 22
    //   1105: iconst_1
    //   1106: if_icmpne +223 -> 1329
    //   1109: iload_2
    //   1110: ifeq +203 -> 1313
    //   1113: aload 4
    //   1115: bipush 146
    //   1117: invokevirtual 319	com/tencent/smtt/sdk/TbsDownloadConfig:setDownloadInterruptCode	(I)V
    //   1120: getstatic 58	com/tencent/smtt/sdk/TbsDownloader:c	Landroid/content/Context;
    //   1123: astore_0
    //   1124: iload 25
    //   1126: iconst_1
    //   1127: if_icmpne +197 -> 1324
    //   1130: iconst_1
    //   1131: istore_3
    //   1132: aload_0
    //   1133: iload_3
    //   1134: invokestatic 683	com/tencent/smtt/sdk/QbSdk:reset	(Landroid/content/Context;Z)V
    //   1137: ldc 14
    //   1139: ldc_w 685
    //   1142: iload_2
    //   1143: invokestatic 356	java/lang/String:valueOf	(Z)Ljava/lang/String;
    //   1146: invokevirtual 265	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   1149: invokestatic 135	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1152: iconst_0
    //   1153: istore_2
    //   1154: ldc_w 542
    //   1157: invokestatic 138	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1160: goto -1097 -> 63
    //   1163: iconst_0
    //   1164: istore 24
    //   1166: goto -808 -> 358
    //   1169: astore_0
    //   1170: ldc_w 687
    //   1173: new 115	java/lang/StringBuilder
    //   1176: dup
    //   1177: ldc_w 689
    //   1180: invokespecial 120	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1183: aload_0
    //   1184: invokevirtual 690	java/lang/Throwable:toString	()Ljava/lang/String;
    //   1187: invokevirtual 128	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1190: invokevirtual 131	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1193: invokestatic 135	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1196: goto -826 -> 370
    //   1199: iconst_0
    //   1200: istore 24
    //   1202: goto -807 -> 395
    //   1205: iconst_0
    //   1206: istore 24
    //   1208: goto -772 -> 436
    //   1211: iconst_0
    //   1212: istore 24
    //   1214: goto -737 -> 477
    //   1217: iconst_0
    //   1218: istore 24
    //   1220: goto -696 -> 524
    //   1223: astore_0
    //   1224: ldc_w 687
    //   1227: new 115	java/lang/StringBuilder
    //   1230: dup
    //   1231: ldc_w 689
    //   1234: invokespecial 120	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1237: aload_0
    //   1238: invokevirtual 690	java/lang/Throwable:toString	()Ljava/lang/String;
    //   1241: invokevirtual 128	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1244: invokevirtual 131	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1247: invokestatic 135	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1250: goto -690 -> 560
    //   1253: iconst_0
    //   1254: istore 6
    //   1256: goto -500 -> 756
    //   1259: iconst_0
    //   1260: istore 24
    //   1262: goto -364 -> 898
    //   1265: iconst_0
    //   1266: istore 31
    //   1268: goto -295 -> 973
    //   1271: astore_0
    //   1272: aload 30
    //   1274: astore_0
    //   1275: iconst_1
    //   1276: istore 28
    //   1278: iload 31
    //   1280: istore 24
    //   1282: iload 32
    //   1284: istore 6
    //   1286: iload 28
    //   1288: istore 31
    //   1290: goto -305 -> 985
    //   1293: astore 30
    //   1295: iconst_0
    //   1296: istore 32
    //   1298: goto -303 -> 995
    //   1301: astore_0
    //   1302: aload 30
    //   1304: monitorexit
    //   1305: ldc_w 542
    //   1308: invokestatic 138	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1311: aload_0
    //   1312: athrow
    //   1313: aload 4
    //   1315: sipush -210
    //   1318: invokevirtual 319	com/tencent/smtt/sdk/TbsDownloadConfig:setDownloadInterruptCode	(I)V
    //   1321: goto -201 -> 1120
    //   1324: iconst_0
    //   1325: istore_3
    //   1326: goto -194 -> 1132
    //   1329: iload 24
    //   1331: ifne +10 -> 1341
    //   1334: aload 4
    //   1336: iload 24
    //   1338: invokevirtual 693	com/tencent/smtt/sdk/TbsDownloadConfig:setTbsCoreLoadRenameFileLockEnable	(Z)V
    //   1341: iload 31
    //   1343: ifne +10 -> 1353
    //   1346: aload 4
    //   1348: iload 31
    //   1350: invokevirtual 696	com/tencent/smtt/sdk/TbsDownloadConfig:setTbsCoreLoadRenameFileLockWaitEnable	(Z)V
    //   1353: iload 32
    //   1355: iconst_1
    //   1356: if_icmpne +9 -> 1365
    //   1359: getstatic 58	com/tencent/smtt/sdk/TbsDownloader:c	Landroid/content/Context;
    //   1362: invokestatic 699	com/tencent/smtt/sdk/QbSdk:resetDecoupleCore	(Landroid/content/Context;)V
    //   1365: iload 33
    //   1367: iconst_1
    //   1368: if_icmpne +22 -> 1390
    //   1371: getstatic 284	com/tencent/smtt/sdk/TbsDownloader:d	Landroid/os/Handler;
    //   1374: bipush 104
    //   1376: invokevirtual 289	android/os/Handler:removeMessages	(I)V
    //   1379: getstatic 284	com/tencent/smtt/sdk/TbsDownloader:d	Landroid/os/Handler;
    //   1382: bipush 104
    //   1384: invokestatic 295	android/os/Message:obtain	(Landroid/os/Handler;I)Landroid/os/Message;
    //   1387: invokevirtual 305	android/os/Message:sendToTarget	()V
    //   1390: iload 21
    //   1392: iconst_1
    //   1393: if_icmpne +1804 -> 3197
    //   1396: lload 19
    //   1398: ldc2_w 700
    //   1401: lcmp
    //   1402: ifle +1803 -> 3205
    //   1405: ldc2_w 700
    //   1408: lstore 19
    //   1410: lload 19
    //   1412: lconst_0
    //   1413: lcmp
    //   1414: ifle +1783 -> 3197
    //   1417: invokestatic 704	com/tencent/smtt/sdk/TbsDownloader:getRetryIntervalInSeconds	()J
    //   1420: lconst_0
    //   1421: lcmp
    //   1422: iflt +8 -> 1430
    //   1425: invokestatic 704	com/tencent/smtt/sdk/TbsDownloader:getRetryIntervalInSeconds	()J
    //   1428: lstore 19
    //   1430: aload 4
    //   1432: getfield 338	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   1435: ldc_w 706
    //   1438: lload 19
    //   1440: invokestatic 711	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   1443: invokeinterface 348 3 0
    //   1448: pop
    //   1449: iconst_0
    //   1450: istore 6
    //   1452: iconst_0
    //   1453: istore 22
    //   1455: iload_2
    //   1456: ifeq +259 -> 1715
    //   1459: aload 5
    //   1461: ldc_w 713
    //   1464: invokevirtual 554	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   1467: istore 33
    //   1469: iload 33
    //   1471: istore 6
    //   1473: getstatic 58	com/tencent/smtt/sdk/TbsDownloader:c	Landroid/content/Context;
    //   1476: invokestatic 313	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   1479: getfield 323	com/tencent/smtt/sdk/TbsDownloadConfig:mPreferences	Landroid/content/SharedPreferences;
    //   1482: ldc_w 715
    //   1485: iconst_0
    //   1486: invokeinterface 401 3 0
    //   1491: istore 33
    //   1493: iload 33
    //   1495: istore 22
    //   1497: iload 6
    //   1499: istore 33
    //   1501: iload_2
    //   1502: ifeq +36 -> 1538
    //   1505: iload 6
    //   1507: istore 33
    //   1509: getstatic 58	com/tencent/smtt/sdk/TbsDownloader:c	Landroid/content/Context;
    //   1512: invokestatic 477	com/tencent/smtt/sdk/TbsShareManager:isThirdPartyApp	(Landroid/content/Context;)Z
    //   1515: ifne +23 -> 1538
    //   1518: iload 6
    //   1520: istore 33
    //   1522: iload 6
    //   1524: ifne +14 -> 1538
    //   1527: invokestatic 254	com/tencent/smtt/sdk/an:a	()Lcom/tencent/smtt/sdk/an;
    //   1530: getstatic 58	com/tencent/smtt/sdk/TbsDownloader:c	Landroid/content/Context;
    //   1533: invokevirtual 717	com/tencent/smtt/sdk/an:i	(Landroid/content/Context;)I
    //   1536: istore 33
    //   1538: ldc 14
    //   1540: ldc_w 719
    //   1543: iload 33
    //   1545: invokestatic 559	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   1548: invokevirtual 265	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   1551: invokestatic 135	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1554: aload 4
    //   1556: getfield 338	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   1559: ldc_w 721
    //   1562: iload 33
    //   1564: invokestatic 605	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1567: invokeinterface 348 3 0
    //   1572: pop
    //   1573: aload 4
    //   1575: getfield 338	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   1578: ldc_w 715
    //   1581: iload 22
    //   1583: invokestatic 605	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1586: invokeinterface 348 3 0
    //   1591: pop
    //   1592: getstatic 58	com/tencent/smtt/sdk/TbsDownloader:c	Landroid/content/Context;
    //   1595: invokestatic 477	com/tencent/smtt/sdk/TbsShareManager:isThirdPartyApp	(Landroid/content/Context;)Z
    //   1598: ifne +46 -> 1644
    //   1601: iload 33
    //   1603: ifle +139 -> 1742
    //   1606: iload 33
    //   1608: invokestatic 254	com/tencent/smtt/sdk/an:a	()Lcom/tencent/smtt/sdk/an;
    //   1611: getstatic 58	com/tencent/smtt/sdk/TbsDownloader:c	Landroid/content/Context;
    //   1614: invokevirtual 717	com/tencent/smtt/sdk/an:i	(Landroid/content/Context;)I
    //   1617: if_icmpeq +125 -> 1742
    //   1620: iload 33
    //   1622: invokestatic 254	com/tencent/smtt/sdk/an:a	()Lcom/tencent/smtt/sdk/an;
    //   1625: getstatic 58	com/tencent/smtt/sdk/TbsDownloader:c	Landroid/content/Context;
    //   1628: invokevirtual 474	com/tencent/smtt/sdk/an:j	(Landroid/content/Context;)I
    //   1631: if_icmpne +111 -> 1742
    //   1634: invokestatic 254	com/tencent/smtt/sdk/an:a	()Lcom/tencent/smtt/sdk/an;
    //   1637: getstatic 58	com/tencent/smtt/sdk/TbsDownloader:c	Landroid/content/Context;
    //   1640: invokevirtual 723	com/tencent/smtt/sdk/an:o	(Landroid/content/Context;)Z
    //   1643: pop
    //   1644: aload 8
    //   1646: invokestatic 156	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   1649: ifeq +117 -> 1766
    //   1652: getstatic 58	com/tencent/smtt/sdk/TbsDownloader:c	Landroid/content/Context;
    //   1655: invokestatic 477	com/tencent/smtt/sdk/TbsShareManager:isThirdPartyApp	(Landroid/content/Context;)Z
    //   1658: ifeq +108 -> 1766
    //   1661: aload 4
    //   1663: getfield 338	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   1666: ldc_w 725
    //   1669: getstatic 729	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   1672: invokeinterface 348 3 0
    //   1677: pop
    //   1678: aload 4
    //   1680: invokevirtual 351	com/tencent/smtt/sdk/TbsDownloadConfig:commit	()V
    //   1683: iload_2
    //   1684: ifeq +12 -> 1696
    //   1687: getstatic 58	com/tencent/smtt/sdk/TbsDownloader:c	Landroid/content/Context;
    //   1690: iload 10
    //   1692: iconst_0
    //   1693: invokestatic 733	com/tencent/smtt/sdk/TbsShareManager:writeCoreInfoForThirdPartyApp	(Landroid/content/Context;IZ)V
    //   1696: ldc 14
    //   1698: ldc_w 735
    //   1701: invokestatic 135	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1704: iconst_0
    //   1705: istore_2
    //   1706: ldc_w 542
    //   1709: invokestatic 138	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1712: goto -1649 -> 63
    //   1715: getstatic 58	com/tencent/smtt/sdk/TbsDownloader:c	Landroid/content/Context;
    //   1718: invokestatic 313	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   1721: getfield 323	com/tencent/smtt/sdk/TbsDownloadConfig:mPreferences	Landroid/content/SharedPreferences;
    //   1724: ldc_w 721
    //   1727: iconst_0
    //   1728: invokeinterface 401 3 0
    //   1733: istore 33
    //   1735: iload 33
    //   1737: istore 6
    //   1739: goto -266 -> 1473
    //   1742: iload 33
    //   1744: ifne -100 -> 1644
    //   1747: invokestatic 254	com/tencent/smtt/sdk/an:a	()Lcom/tencent/smtt/sdk/an;
    //   1750: getstatic 58	com/tencent/smtt/sdk/TbsDownloader:c	Landroid/content/Context;
    //   1753: invokevirtual 739	com/tencent/smtt/sdk/an:q	(Landroid/content/Context;)Ljava/io/File;
    //   1756: invokestatic 742	com/tencent/smtt/utils/k:b	(Ljava/io/File;)V
    //   1759: goto -115 -> 1644
    //   1762: astore_0
    //   1763: goto -119 -> 1644
    //   1766: ldc 14
    //   1768: ldc_w 744
    //   1771: iload 7
    //   1773: invokestatic 559	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   1776: invokevirtual 265	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   1779: invokestatic 135	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1782: iload 7
    //   1784: ifne +130 -> 1914
    //   1787: aload 4
    //   1789: getfield 338	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   1792: ldc_w 746
    //   1795: iload 7
    //   1797: invokestatic 605	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1800: invokeinterface 348 3 0
    //   1805: pop
    //   1806: aload 4
    //   1808: getfield 338	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   1811: ldc_w 725
    //   1814: getstatic 729	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   1817: invokeinterface 348 3 0
    //   1822: pop
    //   1823: iload_2
    //   1824: ifeq +59 -> 1883
    //   1827: aload 4
    //   1829: getfield 338	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   1832: ldc_w 748
    //   1835: bipush 145
    //   1837: invokestatic 605	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1840: invokeinterface 348 3 0
    //   1845: pop
    //   1846: aload 4
    //   1848: invokevirtual 351	com/tencent/smtt/sdk/TbsDownloadConfig:commit	()V
    //   1851: getstatic 58	com/tencent/smtt/sdk/TbsDownloader:c	Landroid/content/Context;
    //   1854: invokestatic 477	com/tencent/smtt/sdk/TbsShareManager:isThirdPartyApp	(Landroid/content/Context;)Z
    //   1857: ifne +7 -> 1864
    //   1860: invokestatic 751	com/tencent/smtt/sdk/TbsDownloader:startDecoupleCoreIfNeeded	()Z
    //   1863: pop
    //   1864: ldc 14
    //   1866: ldc_w 753
    //   1869: invokestatic 135	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   1872: iconst_0
    //   1873: istore_2
    //   1874: ldc_w 542
    //   1877: invokestatic 138	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1880: goto -1817 -> 63
    //   1883: aload 4
    //   1885: getfield 338	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   1888: ldc_w 748
    //   1891: sipush -211
    //   1894: invokestatic 605	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1897: invokeinterface 348 3 0
    //   1902: pop
    //   1903: aload 4
    //   1905: sipush -211
    //   1908: invokevirtual 319	com/tencent/smtt/sdk/TbsDownloadConfig:setDownloadInterruptCode	(I)V
    //   1911: goto -65 -> 1846
    //   1914: getstatic 58	com/tencent/smtt/sdk/TbsDownloader:c	Landroid/content/Context;
    //   1917: invokestatic 313	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   1920: getfield 323	com/tencent/smtt/sdk/TbsDownloadConfig:mPreferences	Landroid/content/SharedPreferences;
    //   1923: ldc_w 470
    //   1926: iconst_0
    //   1927: invokeinterface 401 3 0
    //   1932: istore 32
    //   1934: iload 32
    //   1936: iload 10
    //   1938: if_icmple +18 -> 1956
    //   1941: getstatic 755	com/tencent/smtt/sdk/TbsDownloader:g	Lcom/tencent/smtt/sdk/ag;
    //   1944: invokevirtual 759	com/tencent/smtt/sdk/ag:d	()V
    //   1947: invokestatic 254	com/tencent/smtt/sdk/an:a	()Lcom/tencent/smtt/sdk/an;
    //   1950: getstatic 58	com/tencent/smtt/sdk/TbsDownloader:c	Landroid/content/Context;
    //   1953: invokevirtual 762	com/tencent/smtt/sdk/an:p	(Landroid/content/Context;)V
    //   1956: iconst_0
    //   1957: istore 6
    //   1959: iconst_0
    //   1960: istore 33
    //   1962: getstatic 58	com/tencent/smtt/sdk/TbsDownloader:c	Landroid/content/Context;
    //   1965: invokestatic 477	com/tencent/smtt/sdk/TbsShareManager:isThirdPartyApp	(Landroid/content/Context;)Z
    //   1968: ifne +62 -> 2030
    //   1971: invokestatic 254	com/tencent/smtt/sdk/an:a	()Lcom/tencent/smtt/sdk/an;
    //   1974: getstatic 58	com/tencent/smtt/sdk/TbsDownloader:c	Landroid/content/Context;
    //   1977: invokevirtual 764	com/tencent/smtt/sdk/an:h	(Landroid/content/Context;)I
    //   1980: istore 25
    //   1982: iload 33
    //   1984: istore 6
    //   1986: iload 25
    //   1988: iload 10
    //   1990: if_icmplt +6 -> 1996
    //   1993: iconst_1
    //   1994: istore 6
    //   1996: ldc 14
    //   1998: new 115	java/lang/StringBuilder
    //   2001: dup
    //   2002: ldc_w 766
    //   2005: invokespecial 120	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2008: iload 25
    //   2010: invokevirtual 361	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   2013: ldc_w 768
    //   2016: invokevirtual 128	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2019: iload 10
    //   2021: invokevirtual 361	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   2024: invokevirtual 131	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2027: invokestatic 135	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   2030: iload_1
    //   2031: iload 10
    //   2033: if_icmpge +16 -> 2049
    //   2036: aload 8
    //   2038: invokestatic 156	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   2041: ifne +8 -> 2049
    //   2044: iload 6
    //   2046: ifeq +279 -> 2325
    //   2049: iload 22
    //   2051: iconst_1
    //   2052: if_icmpeq +273 -> 2325
    //   2055: aload 4
    //   2057: getfield 338	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   2060: ldc_w 725
    //   2063: getstatic 729	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   2066: invokeinterface 348 3 0
    //   2071: pop
    //   2072: iload_2
    //   2073: ifeq +178 -> 2251
    //   2076: aload 8
    //   2078: invokestatic 156	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   2081: ifeq +93 -> 2174
    //   2084: aload 4
    //   2086: getfield 338	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   2089: ldc_w 748
    //   2092: bipush 132
    //   2094: invokestatic 605	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2097: invokeinterface 348 3 0
    //   2102: pop
    //   2103: aload 4
    //   2105: invokevirtual 351	com/tencent/smtt/sdk/TbsDownloadConfig:commit	()V
    //   2108: ldc 14
    //   2110: new 115	java/lang/StringBuilder
    //   2113: dup
    //   2114: ldc_w 770
    //   2117: invokespecial 120	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2120: iload_1
    //   2121: invokevirtual 361	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   2124: ldc_w 772
    //   2127: invokevirtual 128	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2130: iload 10
    //   2132: invokevirtual 361	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   2135: ldc_w 774
    //   2138: invokevirtual 128	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2141: iload 32
    //   2143: invokevirtual 361	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   2146: ldc_w 776
    //   2149: invokevirtual 128	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2152: aload 8
    //   2154: invokevirtual 128	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2157: invokevirtual 131	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2160: invokestatic 135	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   2163: iconst_0
    //   2164: istore_2
    //   2165: ldc_w 542
    //   2168: invokestatic 138	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   2171: goto -2108 -> 63
    //   2174: iload 10
    //   2176: ifgt +25 -> 2201
    //   2179: aload 4
    //   2181: getfield 338	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   2184: ldc_w 748
    //   2187: bipush 131
    //   2189: invokestatic 605	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2192: invokeinterface 348 3 0
    //   2197: pop
    //   2198: goto -95 -> 2103
    //   2201: iload_1
    //   2202: iload 10
    //   2204: if_icmplt +25 -> 2229
    //   2207: aload 4
    //   2209: getfield 338	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   2212: ldc_w 748
    //   2215: bipush 129
    //   2217: invokestatic 605	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2220: invokeinterface 348 3 0
    //   2225: pop
    //   2226: goto -123 -> 2103
    //   2229: aload 4
    //   2231: getfield 338	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   2234: ldc_w 748
    //   2237: bipush 144
    //   2239: invokestatic 605	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2242: invokeinterface 348 3 0
    //   2247: pop
    //   2248: goto -145 -> 2103
    //   2251: sipush -212
    //   2254: istore 6
    //   2256: aload 8
    //   2258: invokestatic 156	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   2261: ifeq +37 -> 2298
    //   2264: sipush -217
    //   2267: istore 6
    //   2269: aload 4
    //   2271: getfield 338	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   2274: ldc_w 748
    //   2277: iload 6
    //   2279: invokestatic 605	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2282: invokeinterface 348 3 0
    //   2287: pop
    //   2288: aload 4
    //   2290: iload 6
    //   2292: invokevirtual 319	com/tencent/smtt/sdk/TbsDownloadConfig:setDownloadInterruptCode	(I)V
    //   2295: goto -192 -> 2103
    //   2298: iload 10
    //   2300: ifgt +11 -> 2311
    //   2303: sipush -218
    //   2306: istore 6
    //   2308: goto -39 -> 2269
    //   2311: iload_1
    //   2312: iload 10
    //   2314: if_icmplt -45 -> 2269
    //   2317: sipush -219
    //   2320: istore 6
    //   2322: goto -53 -> 2269
    //   2325: aload 8
    //   2327: aload 4
    //   2329: getfield 323	com/tencent/smtt/sdk/TbsDownloadConfig:mPreferences	Landroid/content/SharedPreferences;
    //   2332: ldc_w 778
    //   2335: aconst_null
    //   2336: invokeinterface 372 3 0
    //   2341: invokevirtual 88	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   2344: ifne +45 -> 2389
    //   2347: getstatic 755	com/tencent/smtt/sdk/TbsDownloader:g	Lcom/tencent/smtt/sdk/ag;
    //   2350: invokevirtual 759	com/tencent/smtt/sdk/ag:d	()V
    //   2353: aload 4
    //   2355: getfield 338	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   2358: ldc_w 780
    //   2361: iconst_0
    //   2362: invokestatic 605	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2365: invokeinterface 348 3 0
    //   2370: pop
    //   2371: aload 4
    //   2373: getfield 338	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   2376: ldc_w 782
    //   2379: iconst_0
    //   2380: invokestatic 605	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2383: invokeinterface 348 3 0
    //   2388: pop
    //   2389: aload 4
    //   2391: getfield 338	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   2394: ldc_w 470
    //   2397: iload 10
    //   2399: invokestatic 605	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2402: invokeinterface 348 3 0
    //   2407: pop
    //   2408: ldc 14
    //   2410: ldc_w 784
    //   2413: iload 10
    //   2415: invokestatic 559	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   2418: invokevirtual 265	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   2421: invokestatic 135	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   2424: iload 10
    //   2426: ifle +43 -> 2469
    //   2429: iload 22
    //   2431: iconst_1
    //   2432: if_icmpne +340 -> 2772
    //   2435: aload 4
    //   2437: getfield 338	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   2440: ldc_w 786
    //   2443: iconst_1
    //   2444: invokestatic 605	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2447: invokeinterface 348 3 0
    //   2452: pop
    //   2453: ldc 14
    //   2455: ldc_w 788
    //   2458: iload 22
    //   2460: invokestatic 559	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   2463: invokevirtual 265	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   2466: invokestatic 135	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   2469: aload 4
    //   2471: getfield 338	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   2474: ldc_w 778
    //   2477: aload 8
    //   2479: invokeinterface 348 3 0
    //   2484: pop
    //   2485: aload 4
    //   2487: getfield 338	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   2490: ldc_w 790
    //   2493: aload 9
    //   2495: invokeinterface 348 3 0
    //   2500: pop
    //   2501: aload 4
    //   2503: getfield 338	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   2506: ldc_w 746
    //   2509: iload 7
    //   2511: invokestatic 605	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2514: invokeinterface 348 3 0
    //   2519: pop
    //   2520: aload 4
    //   2522: getfield 338	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   2525: ldc_w 792
    //   2528: iload 11
    //   2530: invokestatic 605	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2533: invokeinterface 348 3 0
    //   2538: pop
    //   2539: aload 4
    //   2541: getfield 338	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   2544: ldc_w 794
    //   2547: iload 12
    //   2549: invokestatic 605	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2552: invokeinterface 348 3 0
    //   2557: pop
    //   2558: aload 4
    //   2560: getfield 338	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   2563: ldc_w 796
    //   2566: iload 13
    //   2568: invokestatic 605	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2571: invokeinterface 348 3 0
    //   2576: pop
    //   2577: aload 4
    //   2579: getfield 338	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   2582: ldc_w 798
    //   2585: iload 14
    //   2587: invokestatic 605	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2590: invokeinterface 348 3 0
    //   2595: pop
    //   2596: aload 4
    //   2598: getfield 338	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   2601: ldc_w 800
    //   2604: lload 15
    //   2606: invokestatic 711	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   2609: invokeinterface 348 3 0
    //   2614: pop
    //   2615: aload 4
    //   2617: getfield 338	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   2620: ldc_w 802
    //   2623: lload 17
    //   2625: invokestatic 711	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   2628: invokeinterface 348 3 0
    //   2633: pop
    //   2634: aload 4
    //   2636: invokevirtual 351	com/tencent/smtt/sdk/TbsDownloadConfig:commit	()V
    //   2639: aload 23
    //   2641: ifnull +19 -> 2660
    //   2644: aload 4
    //   2646: getfield 338	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   2649: ldc_w 804
    //   2652: aload 23
    //   2654: invokeinterface 348 3 0
    //   2659: pop
    //   2660: iload_3
    //   2661: ifne +163 -> 2824
    //   2664: invokestatic 254	com/tencent/smtt/sdk/an:a	()Lcom/tencent/smtt/sdk/an;
    //   2667: getstatic 58	com/tencent/smtt/sdk/TbsDownloader:c	Landroid/content/Context;
    //   2670: iload 10
    //   2672: invokevirtual 807	com/tencent/smtt/sdk/an:b	(Landroid/content/Context;I)Z
    //   2675: ifeq +149 -> 2824
    //   2678: iload_2
    //   2679: ifeq +114 -> 2793
    //   2682: aload 4
    //   2684: getfield 338	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   2687: ldc_w 748
    //   2690: bipush 143
    //   2692: invokestatic 605	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2695: invokeinterface 348 3 0
    //   2700: pop
    //   2701: aload 4
    //   2703: getfield 338	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   2706: ldc_w 725
    //   2709: getstatic 729	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   2712: invokeinterface 348 3 0
    //   2717: pop
    //   2718: ldc 14
    //   2720: ldc_w 809
    //   2723: invokestatic 135	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   2726: aload 5
    //   2728: ldc_w 811
    //   2731: iconst_0
    //   2732: invokevirtual 596	org/json/JSONObject:optInt	(Ljava/lang/String;I)I
    //   2735: iconst_1
    //   2736: if_icmpne +20 -> 2756
    //   2739: aload 4
    //   2741: getfield 338	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   2744: ldc_w 813
    //   2747: getstatic 816	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   2750: invokeinterface 348 3 0
    //   2755: pop
    //   2756: aload 4
    //   2758: invokevirtual 351	com/tencent/smtt/sdk/TbsDownloadConfig:commit	()V
    //   2761: iconst_1
    //   2762: istore_2
    //   2763: ldc_w 542
    //   2766: invokestatic 138	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   2769: goto -2706 -> 63
    //   2772: aload 4
    //   2774: getfield 338	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   2777: ldc_w 786
    //   2780: iconst_0
    //   2781: invokestatic 605	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2784: invokeinterface 348 3 0
    //   2789: pop
    //   2790: goto -337 -> 2453
    //   2793: aload 4
    //   2795: getfield 338	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   2798: ldc_w 748
    //   2801: sipush -213
    //   2804: invokestatic 605	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   2807: invokeinterface 348 3 0
    //   2812: pop
    //   2813: aload 4
    //   2815: sipush -213
    //   2818: invokevirtual 319	com/tencent/smtt/sdk/TbsDownloadConfig:setDownloadInterruptCode	(I)V
    //   2821: goto -120 -> 2701
    //   2824: iload_3
    //   2825: ifne +159 -> 2984
    //   2828: getstatic 755	com/tencent/smtt/sdk/TbsDownloader:g	Lcom/tencent/smtt/sdk/ag;
    //   2831: astore_0
    //   2832: iload 7
    //   2834: iconst_1
    //   2835: if_icmpeq +9 -> 2844
    //   2838: iload 7
    //   2840: iconst_2
    //   2841: if_icmpne +121 -> 2962
    //   2844: iconst_1
    //   2845: istore 24
    //   2847: aload_0
    //   2848: iload_3
    //   2849: iload 24
    //   2851: invokevirtual 819	com/tencent/smtt/sdk/ag:a	(ZZ)Z
    //   2854: ifeq +130 -> 2984
    //   2857: aload 4
    //   2859: getfield 338	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   2862: ldc_w 725
    //   2865: getstatic 729	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   2868: invokeinterface 348 3 0
    //   2873: pop
    //   2874: getstatic 58	com/tencent/smtt/sdk/TbsDownloader:c	Landroid/content/Context;
    //   2877: invokestatic 492	com/tencent/smtt/sdk/TbsLogReport:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsLogReport;
    //   2880: invokevirtual 496	com/tencent/smtt/sdk/TbsLogReport:tbsLogInfo	()Lcom/tencent/smtt/sdk/TbsLogReport$TbsLogInfo;
    //   2883: astore_0
    //   2884: aload_0
    //   2885: bipush 100
    //   2887: invokevirtual 501	com/tencent/smtt/sdk/TbsLogReport$TbsLogInfo:setErrorCode	(I)V
    //   2890: aload_0
    //   2891: new 115	java/lang/StringBuilder
    //   2894: dup
    //   2895: ldc_w 821
    //   2898: invokespecial 120	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   2901: getstatic 755	com/tencent/smtt/sdk/TbsDownloader:g	Lcom/tencent/smtt/sdk/ag;
    //   2904: getfield 823	com/tencent/smtt/sdk/ag:a	Ljava/lang/String;
    //   2907: invokevirtual 128	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2910: invokevirtual 131	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2913: invokevirtual 504	com/tencent/smtt/sdk/TbsLogReport$TbsLogInfo:setFailDetail	(Ljava/lang/String;)V
    //   2916: getstatic 58	com/tencent/smtt/sdk/TbsDownloader:c	Landroid/content/Context;
    //   2919: invokestatic 313	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   2922: getfield 323	com/tencent/smtt/sdk/TbsDownloadConfig:mPreferences	Landroid/content/SharedPreferences;
    //   2925: ldc_w 715
    //   2928: iconst_0
    //   2929: invokeinterface 401 3 0
    //   2934: iconst_1
    //   2935: if_icmpne +33 -> 2968
    //   2938: getstatic 58	com/tencent/smtt/sdk/TbsDownloader:c	Landroid/content/Context;
    //   2941: invokestatic 492	com/tencent/smtt/sdk/TbsLogReport:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsLogReport;
    //   2944: getstatic 826	com/tencent/smtt/sdk/TbsLogReport$EventType:TYPE_DOWNLOAD_DECOUPLE	Lcom/tencent/smtt/sdk/TbsLogReport$EventType;
    //   2947: aload_0
    //   2948: invokevirtual 514	com/tencent/smtt/sdk/TbsLogReport:eventReport	(Lcom/tencent/smtt/sdk/TbsLogReport$EventType;Lcom/tencent/smtt/sdk/TbsLogReport$TbsLogInfo;)V
    //   2951: ldc 14
    //   2953: ldc_w 828
    //   2956: invokestatic 135	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   2959: goto -233 -> 2726
    //   2962: iconst_0
    //   2963: istore 24
    //   2965: goto -118 -> 2847
    //   2968: getstatic 58	com/tencent/smtt/sdk/TbsDownloader:c	Landroid/content/Context;
    //   2971: invokestatic 492	com/tencent/smtt/sdk/TbsLogReport:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsLogReport;
    //   2974: getstatic 510	com/tencent/smtt/sdk/TbsLogReport$EventType:TYPE_DOWNLOAD	Lcom/tencent/smtt/sdk/TbsLogReport$EventType;
    //   2977: aload_0
    //   2978: invokevirtual 514	com/tencent/smtt/sdk/TbsLogReport:eventReport	(Lcom/tencent/smtt/sdk/TbsLogReport$EventType;Lcom/tencent/smtt/sdk/TbsLogReport$TbsLogInfo;)V
    //   2981: goto -30 -> 2951
    //   2984: getstatic 58	com/tencent/smtt/sdk/TbsDownloader:c	Landroid/content/Context;
    //   2987: invokestatic 313	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   2990: getfield 323	com/tencent/smtt/sdk/TbsDownloadConfig:mPreferences	Landroid/content/SharedPreferences;
    //   2993: ldc_w 786
    //   2996: iconst_0
    //   2997: invokeinterface 401 3 0
    //   3002: iconst_1
    //   3003: if_icmpne +133 -> 3136
    //   3006: getstatic 755	com/tencent/smtt/sdk/TbsDownloader:g	Lcom/tencent/smtt/sdk/ag;
    //   3009: invokevirtual 830	com/tencent/smtt/sdk/ag:a	()Z
    //   3012: ifeq +124 -> 3136
    //   3015: aload 4
    //   3017: getfield 338	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   3020: ldc_w 725
    //   3023: getstatic 729	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   3026: invokeinterface 348 3 0
    //   3031: pop
    //   3032: getstatic 58	com/tencent/smtt/sdk/TbsDownloader:c	Landroid/content/Context;
    //   3035: invokestatic 492	com/tencent/smtt/sdk/TbsLogReport:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsLogReport;
    //   3038: invokevirtual 496	com/tencent/smtt/sdk/TbsLogReport:tbsLogInfo	()Lcom/tencent/smtt/sdk/TbsLogReport$TbsLogInfo;
    //   3041: astore_0
    //   3042: aload_0
    //   3043: bipush 100
    //   3045: invokevirtual 501	com/tencent/smtt/sdk/TbsLogReport$TbsLogInfo:setErrorCode	(I)V
    //   3048: aload_0
    //   3049: new 115	java/lang/StringBuilder
    //   3052: dup
    //   3053: ldc_w 832
    //   3056: invokespecial 120	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   3059: getstatic 755	com/tencent/smtt/sdk/TbsDownloader:g	Lcom/tencent/smtt/sdk/ag;
    //   3062: getfield 823	com/tencent/smtt/sdk/ag:a	Ljava/lang/String;
    //   3065: invokevirtual 128	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3068: invokevirtual 131	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   3071: invokevirtual 504	com/tencent/smtt/sdk/TbsLogReport$TbsLogInfo:setFailDetail	(Ljava/lang/String;)V
    //   3074: getstatic 58	com/tencent/smtt/sdk/TbsDownloader:c	Landroid/content/Context;
    //   3077: invokestatic 313	com/tencent/smtt/sdk/TbsDownloadConfig:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsDownloadConfig;
    //   3080: getfield 323	com/tencent/smtt/sdk/TbsDownloadConfig:mPreferences	Landroid/content/SharedPreferences;
    //   3083: ldc_w 715
    //   3086: iconst_0
    //   3087: invokeinterface 401 3 0
    //   3092: iconst_1
    //   3093: if_icmpne +27 -> 3120
    //   3096: getstatic 58	com/tencent/smtt/sdk/TbsDownloader:c	Landroid/content/Context;
    //   3099: invokestatic 492	com/tencent/smtt/sdk/TbsLogReport:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsLogReport;
    //   3102: getstatic 826	com/tencent/smtt/sdk/TbsLogReport$EventType:TYPE_DOWNLOAD_DECOUPLE	Lcom/tencent/smtt/sdk/TbsLogReport$EventType;
    //   3105: aload_0
    //   3106: invokevirtual 514	com/tencent/smtt/sdk/TbsLogReport:eventReport	(Lcom/tencent/smtt/sdk/TbsLogReport$EventType;Lcom/tencent/smtt/sdk/TbsLogReport$TbsLogInfo;)V
    //   3109: ldc 14
    //   3111: ldc_w 834
    //   3114: invokestatic 135	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   3117: goto -391 -> 2726
    //   3120: getstatic 58	com/tencent/smtt/sdk/TbsDownloader:c	Landroid/content/Context;
    //   3123: invokestatic 492	com/tencent/smtt/sdk/TbsLogReport:getInstance	(Landroid/content/Context;)Lcom/tencent/smtt/sdk/TbsLogReport;
    //   3126: getstatic 510	com/tencent/smtt/sdk/TbsLogReport$EventType:TYPE_DOWNLOAD	Lcom/tencent/smtt/sdk/TbsLogReport$EventType;
    //   3129: aload_0
    //   3130: invokevirtual 514	com/tencent/smtt/sdk/TbsLogReport:eventReport	(Lcom/tencent/smtt/sdk/TbsLogReport$EventType;Lcom/tencent/smtt/sdk/TbsLogReport$TbsLogInfo;)V
    //   3133: goto -24 -> 3109
    //   3136: iload_2
    //   3137: ifne +11 -> 3148
    //   3140: aload 4
    //   3142: sipush -216
    //   3145: invokevirtual 319	com/tencent/smtt/sdk/TbsDownloadConfig:setDownloadInterruptCode	(I)V
    //   3148: aload 4
    //   3150: getfield 338	com/tencent/smtt/sdk/TbsDownloadConfig:a	Ljava/util/Map;
    //   3153: ldc_w 725
    //   3156: getstatic 816	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   3159: invokeinterface 348 3 0
    //   3164: pop
    //   3165: ldc 14
    //   3167: ldc_w 836
    //   3170: invokestatic 135	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   3173: goto -447 -> 2726
    //   3176: astore_0
    //   3177: goto -1680 -> 1497
    //   3180: astore_0
    //   3181: goto -1708 -> 1473
    //   3184: astore 30
    //   3186: iload 26
    //   3188: istore 25
    //   3190: goto -2182 -> 1008
    //   3193: astore_0
    //   3194: goto -2903 -> 291
    //   3197: ldc2_w 837
    //   3200: lstore 19
    //   3202: goto -1785 -> 1417
    //   3205: goto -1795 -> 1410
    //   3208: iconst_1
    //   3209: istore 31
    //   3211: goto -2238 -> 973
    //
    // Exception table:
    //   from	to	target	type
    //   329	349	1169	java/lang/Throwable
    //   358	370	1169	java/lang/Throwable
    //   374	385	1223	java/lang/Throwable
    //   395	426	1223	java/lang/Throwable
    //   436	467	1223	java/lang/Throwable
    //   477	513	1223	java/lang/Throwable
    //   524	560	1223	java/lang/Throwable
    //   605	615	1271	java/lang/Exception
    //   639	649	1271	java/lang/Exception
    //   673	683	1271	java/lang/Exception
    //   707	718	1271	java/lang/Exception
    //   742	753	1271	java/lang/Exception
    //   783	794	1271	java/lang/Exception
    //   818	827	1271	java/lang/Exception
    //   850	861	1271	java/lang/Exception
    //   884	895	1271	java/lang/Exception
    //   921	932	1271	java/lang/Exception
    //   955	965	1271	java/lang/Exception
    //   985	995	1293	java/lang/Exception
    //   1021	1037	1301	finally
    //   1037	1100	1301	finally
    //   1100	1103	1301	finally
    //   1302	1305	1301	finally
    //   1747	1759	1762	java/lang/Throwable
    //   1473	1493	3176	java/lang/Exception
    //   1459	1469	3180	java/lang/Exception
    //   1715	1735	3180	java/lang/Exception
    //   998	1008	3184	java/lang/Exception
    //   277	287	3193	java/lang/Exception
  }

  protected static File b(int paramInt)
  {
    AppMethodBeat.i(64381);
    String[] arrayOfString = TbsShareManager.getCoreProviderAppList();
    Object localObject = null;
    int m = arrayOfString.length;
    label187: for (int n = 0; ; n++)
    {
      String str1;
      if (n < m)
      {
        str1 = arrayOfString[n];
        String str2 = k.a(c, str1, 4, false);
        if (!getOverSea(c))
          break label115;
        localObject = "x5.oversea.tbs.org";
        localObject = new File(str2, (String)localObject);
        if ((!((File)localObject).exists()) || (a.a(c, (File)localObject) != paramInt))
          break label121;
        TbsLog.i("TbsDownload", "local tbs version fond,path = " + ((File)localObject).getAbsolutePath());
      }
      while (true)
      {
        AppMethodBeat.o(64381);
        return localObject;
        label115: localObject = "x5.tbs.org";
        break;
        label121: localObject = new File(k.a(c, str1, 4, false), "x5.tbs.decouple");
        if ((!((File)localObject).exists()) || (a.a(c, (File)localObject) != paramInt))
          break label187;
        TbsLog.i("TbsDownload", "local tbs version fond,path = " + ((File)localObject).getAbsolutePath());
      }
    }
  }

  private static JSONObject b(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    AppMethodBeat.i(64371);
    TbsLog.i("TbsDownload", "[TbsDownloader.postJsonData]isQuery: " + paramBoolean1 + " forDecoupleCore is " + paramBoolean3);
    TbsDownloadConfig localTbsDownloadConfig = TbsDownloadConfig.getInstance(c);
    String str1 = a(c);
    String str2 = b.d(c);
    String str3 = b.c(c);
    String str4 = b.f(c);
    Object localObject1 = TimeZone.getDefault().getID();
    if (localObject1 != null);
    for (Object localObject3 = localObject1; ; localObject3 = "")
      try
      {
        localObject4 = (TelephonyManager)c.getSystemService("phone");
        if (localObject4 != null)
        {
          localObject4 = ((TelephonyManager)localObject4).getSimCountryIso();
          localObject1 = localObject4;
          if (localObject1 == null)
            break label1065;
          localObject4 = new JSONObject();
        }
      }
      catch (Exception localException2)
      {
        while (true)
        {
          try
          {
            Object localObject4;
            ((JSONObject)localObject4).put("TIMEZONEID", localObject3);
            ((JSONObject)localObject4).put("COUNTRYISO", localObject1);
            ((JSONObject)localObject4).put("PROTOCOLVERSION", 1);
            if (TbsShareManager.isThirdPartyApp(c))
            {
              if (QbSdk.c)
              {
                m = TbsShareManager.a(c, false);
                if (!paramBoolean1)
                  continue;
                ((JSONObject)localObject4).put("FUNCTION", 2);
                if (!TbsShareManager.isThirdPartyApp(c))
                  continue;
                localObject1 = f();
                ((JSONObject)localObject4).put("TBSVLARR", localObject1);
                localTbsDownloadConfig.a.put("last_thirdapp_sendrequest_coreversion", ((JSONArray)localObject1).toString());
                localTbsDownloadConfig.commit();
                if (QbSdk.c)
                  ((JSONObject)localObject4).put("THIRDREQ", 1);
                ((JSONObject)localObject4).put("APPN", c.getPackageName());
                ((JSONObject)localObject4).put("APPVN", a(localTbsDownloadConfig.mPreferences.getString("app_versionname", null)));
                ((JSONObject)localObject4).put("APPVC", localTbsDownloadConfig.mPreferences.getInt("app_versioncode", 0));
                ((JSONObject)localObject4).put("APPMETA", a(localTbsDownloadConfig.mPreferences.getString("app_metadata", null)));
                ((JSONObject)localObject4).put("TBSSDKV", 43644);
                ((JSONObject)localObject4).put("TBSV", m);
                if (!paramBoolean3)
                  continue;
                n = 1;
                ((JSONObject)localObject4).put("DOWNLOADDECOUPLECORE", n);
                localObject1 = localTbsDownloadConfig.a;
                if (!paramBoolean3)
                  continue;
                n = 1;
                ((Map)localObject1).put("tbs_downloaddecouplecore", Integer.valueOf(n));
                localTbsDownloadConfig.commit();
                if (m != 0)
                  ((JSONObject)localObject4).put("TBSBACKUPV", g.b());
                ((JSONObject)localObject4).put("CPU", e);
                ((JSONObject)localObject4).put("UA", str1);
                ((JSONObject)localObject4).put("IMSI", a(str2));
                ((JSONObject)localObject4).put("IMEI", a(str3));
                ((JSONObject)localObject4).put("ANDROID_ID", a(str4));
                if (!TbsShareManager.isThirdPartyApp(c))
                {
                  if (m == 0)
                    continue;
                  if (!QbSdk.a(c, m))
                    continue;
                  m = 0;
                  ((JSONObject)localObject4).put("STATUS", m);
                  ((JSONObject)localObject4).put("TBSDV", an.a().i(c));
                }
                paramBoolean3 = TbsDownloadConfig.getInstance(c).mPreferences.getBoolean("request_full_package", false);
                localObject1 = QbSdk.a(c, "can_unlzma", null);
                if ((localObject1 == null) || (!(localObject1 instanceof Boolean)))
                  continue;
                paramBoolean1 = ((Boolean)localObject1).booleanValue();
                if (!paramBoolean1)
                  continue;
                if (paramBoolean3)
                  continue;
                m = 1;
                if (m != 0)
                  ((JSONObject)localObject4).put("REQUEST_LZMA", 1);
                if (getOverSea(c))
                  ((JSONObject)localObject4).put("OVERSEA", 1);
                if (paramBoolean2)
                  ((JSONObject)localObject4).put("DOWNLOAD_FOREGROUND", 1);
                TbsLog.i("TbsDownload", "[TbsDownloader.postJsonData] jsonData=" + ((JSONObject)localObject4).toString());
                AppMethodBeat.o(64371);
                return localObject4;
                localException2 = localException2;
                continue;
              }
              m = TbsDownloadConfig.getInstance(c).mPreferences.getInt("tbs_download_version", 0);
              continue;
            }
            n = an.a().n(c);
            m = n;
            if (n == 0)
            {
              m = n;
              if (an.a().m(c))
              {
                n = -1;
                m = n;
                if ("com.tencent.mobileqq".equals(c.getApplicationInfo().packageName))
                {
                  TbsDownloadUpload.clear();
                  localObject1 = TbsDownloadUpload.getInstance(c);
                  ((TbsDownloadUpload)localObject1).a.put("tbs_local_core_version", Integer.valueOf(-1));
                  ((TbsDownloadUpload)localObject1).commit();
                  TbsPVConfig.releaseInstance();
                  m = n;
                  if (TbsPVConfig.getInstance(c).getLocalCoreVersionMoreTimes() == 1)
                    m = an.a().j(c);
                }
              }
            }
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>("[TbsDownloader.postJsonData] tbsLocalVersion=");
            TbsLog.i("TbsDownload", m + " isDownloadForeground=" + paramBoolean2);
            if (paramBoolean2)
            {
              if (an.a().m(c))
                continue;
              m = 0;
              continue;
              if (m == 0)
              {
                n = 0;
                localException2.put("FUNCTION", n);
                continue;
              }
            }
          }
          catch (Exception localException1)
          {
            continue;
            int n = 1;
            continue;
            localObject2 = h();
            if ((Apn.getApnType(c) == 3) || (((JSONArray)localObject2).length() == 0) || (m != 0) || (!paramBoolean1))
              continue;
            localException2.put("TBSBACKUPARR", localObject2);
            continue;
            n = 0;
            continue;
            n = 0;
            continue;
            int m = 1;
            continue;
            localException2.put("STATUS", 0);
            continue;
            m = 0;
            continue;
            m = 0;
            continue;
            paramBoolean1 = false;
            continue;
            continue;
          }
          label1065: Object localObject2 = "";
        }
      }
  }

  @TargetApi(11)
  static void b(Context paramContext)
  {
    AppMethodBeat.i(64378);
    TbsDownloadConfig.getInstance(paramContext).clear();
    TbsLogReport.getInstance(paramContext).clear();
    ag.c(paramContext);
    SharedPreferences localSharedPreferences;
    if (Build.VERSION.SDK_INT >= 11)
    {
      localSharedPreferences = paramContext.getSharedPreferences("tbs_extension_config", 4);
      localSharedPreferences.edit().clear().commit();
      if (Build.VERSION.SDK_INT < 11)
        break label111;
    }
    label111: for (paramContext = paramContext.getSharedPreferences("tbs_preloadx5_check_cfg_file", 4); ; paramContext = paramContext.getSharedPreferences("tbs_preloadx5_check_cfg_file", 0))
    {
      paramContext.edit().clear().commit();
      AppMethodBeat.o(64378);
      return;
      localSharedPreferences = paramContext.getSharedPreferences("tbs_extension_config", 0);
      break;
    }
  }

  private static void b(JSONArray paramJSONArray)
  {
    int m = 0;
    AppMethodBeat.i(64368);
    int n;
    if (TbsShareManager.getHostCorePathAppDefined() != null)
      n = an.a().a(TbsShareManager.getHostCorePathAppDefined());
    for (int i1 = 0; ; i1++)
    {
      int i2 = m;
      if (i1 < paramJSONArray.length())
      {
        if (paramJSONArray.optInt(i1) == n)
          i2 = 1;
      }
      else
      {
        if (i2 == 0)
          paramJSONArray.put(n);
        AppMethodBeat.o(64368);
        return;
      }
    }
  }

  private static boolean b(boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(64373);
    paramBoolean1 = c(paramBoolean1, paramBoolean2, false);
    AppMethodBeat.o(64373);
    return paramBoolean1;
  }

  private static void c()
  {
    try
    {
      AppMethodBeat.i(64363);
      if (h == null)
        h = al.a();
      try
      {
        Object localObject1 = new com/tencent/smtt/sdk/ag;
        ((ag)localObject1).<init>(c);
        g = (ag)localObject1;
        localObject1 = new com/tencent/smtt/sdk/aj;
        ((aj)localObject1).<init>(h.getLooper());
        d = (Handler)localObject1;
        AppMethodBeat.o(64363);
        return;
      }
      catch (Exception localException)
      {
        while (true)
        {
          i = true;
          TbsLog.e("TbsDownload", "TbsApkDownloader init has Exception");
          AppMethodBeat.o(64363);
        }
      }
    }
    finally
    {
    }
  }

  private static void c(JSONArray paramJSONArray)
  {
    AppMethodBeat.i(64370);
    String str;
    int i1;
    Context localContext;
    if (!TbsPVConfig.getInstance(c).isDisableHostBackupCore())
    {
      String[] arrayOfString = e();
      int m = arrayOfString.length;
      int n = 0;
      while (true)
        if (n < m)
        {
          str = arrayOfString[n];
          i1 = TbsShareManager.getBackupCoreVersion(c, str);
          if (i1 > 0)
          {
            localContext = TbsShareManager.getPackageContext(c, str, false);
            if ((localContext != null) && (!an.a().f(localContext)))
            {
              TbsLog.e("TbsDownload", "host check failed,packageName = ".concat(String.valueOf(str)));
              n++;
              continue;
            }
            i2 = 0;
            label104: if (i2 >= paramJSONArray.length())
              break label266;
            if (paramJSONArray.optInt(i2) != i1)
              break label200;
          }
        }
    }
    label264: label266: for (int i2 = 1; ; i2 = 0)
    {
      if (i2 == 0)
        paramJSONArray.put(i1);
      i1 = TbsShareManager.getBackupDecoupleCoreVersion(c, str);
      if (i1 <= 0)
        break;
      localContext = TbsShareManager.getPackageContext(c, str, false);
      if ((localContext != null) && (!an.a().f(localContext)))
      {
        TbsLog.e("TbsDownload", "host check failed,packageName = ".concat(String.valueOf(str)));
        break;
        label200: i2++;
        break label104;
      }
      i2 = 0;
      label209: if (i2 < paramJSONArray.length())
        if (paramJSONArray.optInt(i2) != i1);
      for (i2 = 1; ; i2 = 0)
      {
        if (i2 != 0)
          break label264;
        paramJSONArray.put(i1);
        break;
        i2++;
        break label209;
        AppMethodBeat.o(64370);
        return;
      }
      break;
    }
  }

  private static boolean c(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    AppMethodBeat.i(64374);
    Object localObject1;
    if (paramBoolean1)
    {
      localObject1 = TbsDownloadUpload.getInstance(c);
      ((TbsDownloadUpload)localObject1).a.put("tbs_needdownload_code", Integer.valueOf(144));
      ((TbsDownloadUpload)localObject1).commit();
      if ((QbSdk.n == null) || (!QbSdk.n.containsKey(QbSdk.KEY_SET_SENDREQUEST_AND_UPLOAD)) || (!QbSdk.n.get(QbSdk.KEY_SET_SENDREQUEST_AND_UPLOAD).equals("false")))
        break label206;
      TbsLog.i("TbsDownload", "[TbsDownloader.sendRequest] -- SET_SENDREQUEST_AND_UPLOAD is false");
      if (!paramBoolean1)
        break label169;
      localObject1 = TbsDownloadUpload.getInstance(c);
      ((TbsDownloadUpload)localObject1).a.put("tbs_needdownload_code", Integer.valueOf(145));
      ((TbsDownloadUpload)localObject1).commit();
      label122: paramBoolean1 = false;
      AppMethodBeat.o(64374);
    }
    while (true)
    {
      return paramBoolean1;
      if (paramBoolean3)
        break;
      localObject1 = TbsDownloadUpload.getInstance(c);
      ((TbsDownloadUpload)localObject1).a.put("tbs_startdownload_code", Integer.valueOf(164));
      ((TbsDownloadUpload)localObject1).commit();
      break;
      label169: if (paramBoolean3)
        break label122;
      localObject1 = TbsDownloadUpload.getInstance(c);
      ((TbsDownloadUpload)localObject1).a.put("tbs_startdownload_code", Integer.valueOf(165));
      ((TbsDownloadUpload)localObject1).commit();
      break label122;
      label206: TbsLog.i("TbsDownload", "[TbsDownloader.sendRequest]isQuery: " + paramBoolean1 + " forDecoupleCore is " + paramBoolean3);
      if (an.a().c(c))
      {
        TbsLog.i("TbsDownload", "[TbsDownloader.sendRequest] -- isTbsLocalInstalled!");
        if (paramBoolean1)
        {
          localObject1 = TbsDownloadUpload.getInstance(c);
          ((TbsDownloadUpload)localObject1).a.put("tbs_needdownload_code", Integer.valueOf(146));
          ((TbsDownloadUpload)localObject1).commit();
        }
        while (true)
        {
          paramBoolean1 = false;
          AppMethodBeat.o(64374);
          break;
          if (!paramBoolean3)
          {
            localObject1 = TbsDownloadUpload.getInstance(c);
            ((TbsDownloadUpload)localObject1).a.put("tbs_startdownload_code", Integer.valueOf(166));
            ((TbsDownloadUpload)localObject1).commit();
          }
        }
      }
      TbsDownloadConfig localTbsDownloadConfig = TbsDownloadConfig.getInstance(c);
      Object localObject3 = k.a(c, 1);
      label369: Object localObject4;
      label402: label435: label468: label501: int m;
      int n;
      if (getOverSea(c))
      {
        localObject1 = "x5.oversea.tbs.org";
        localObject3 = new File((String)localObject3, (String)localObject1);
        localObject4 = k.a(c, 2);
        if (!getOverSea(c))
          break label975;
        localObject1 = "x5.oversea.tbs.org";
        localObject4 = new File((String)localObject4, (String)localObject1);
        Object localObject5 = k.a(c, 3);
        if (!getOverSea(c))
          break label981;
        localObject1 = "x5.oversea.tbs.org";
        localObject5 = new File((String)localObject5, (String)localObject1);
        String str = k.a(c, 4);
        if (!getOverSea(c))
          break label987;
        localObject1 = "x5.oversea.tbs.org";
        localObject1 = new File(str, (String)localObject1);
        if (!((File)localObject1).exists())
        {
          if (!((File)localObject5).exists())
            break label993;
          ((File)localObject5).renameTo((File)localObject1);
        }
        if (e == null)
        {
          e = b.a();
          localTbsDownloadConfig.a.put("device_cpuabi", e);
          localTbsDownloadConfig.commit();
        }
        m = 0;
        n = m;
        if (!TextUtils.isEmpty(e))
          localObject1 = null;
      }
      try
      {
        localObject3 = Pattern.compile("i686|mips|x86_64").matcher(e);
        localObject1 = localObject3;
        label570: n = m;
        if (localObject1 != null)
        {
          n = m;
          if (((Matcher)localObject1).find())
          {
            if (!TbsShareManager.isThirdPartyApp(c))
              break label1047;
            localObject1 = TbsLogReport.getInstance(c).tbsLogInfo();
            if (!paramBoolean1)
              break label1029;
            localTbsDownloadConfig.setDownloadInterruptCode(-104);
            ((TbsLogReport.TbsLogInfo)localObject1).setErrorCode(-104);
            label625: ((TbsLogReport.TbsLogInfo)localObject1).setFailDetail("mycpu is " + e);
            TbsLogReport.getInstance(c).eventReport(TbsLogReport.EventType.TYPE_DOWNLOAD, (TbsLogReport.TbsLogInfo)localObject1);
            label661: n = 1;
          }
        }
        localTbsDownloadConfig.a.put("app_versionname", b.a(c));
        localTbsDownloadConfig.a.put("app_versioncode", Integer.valueOf(b.b(c)));
        localTbsDownloadConfig.commit();
        localObject3 = b(paramBoolean1, paramBoolean2, paramBoolean3);
        try
        {
          m = ((JSONObject)localObject3).getInt("TBSV");
          if ((n != 0) || (m != -1))
          {
            long l1 = System.currentTimeMillis();
            if (TbsShareManager.isThirdPartyApp(c))
            {
              long l2 = localTbsDownloadConfig.mPreferences.getLong("request_fail", 0L);
              l3 = localTbsDownloadConfig.mPreferences.getLong("count_request_fail_in_24hours", 0L);
              if (l1 - l2 < localTbsDownloadConfig.getRetryInterval() * 1000L)
              {
                l3 = 1L + l3;
                localTbsDownloadConfig.a.put("count_request_fail_in_24hours", Long.valueOf(l3));
              }
            }
            else
            {
              localTbsDownloadConfig.a.put("request_fail", Long.valueOf(l1));
              localTbsDownloadConfig.a.put("app_versionname", b.a(c));
              localTbsDownloadConfig.a.put("app_versioncode", Integer.valueOf(b.b(c)));
              localTbsDownloadConfig.a.put("app_metadata", b.a(c, "com.tencent.mm.BuildInfo.CLIENT_VERSION"));
              localTbsDownloadConfig.commit();
              if (n == 0)
                break label1122;
              if (!paramBoolean1)
                break label1085;
              localObject1 = TbsDownloadUpload.getInstance(c);
              ((TbsDownloadUpload)localObject1).a.put("tbs_needdownload_code", Integer.valueOf(147));
              ((TbsDownloadUpload)localObject1).commit();
              paramBoolean1 = false;
              AppMethodBeat.o(64374);
              continue;
              localObject1 = "x5.tbs.org";
              break label369;
              label975: localObject1 = "x5.tbs.org";
              break label402;
              label981: localObject1 = "x5.tbs.org";
              break label435;
              label987: localObject1 = "x5.tbs.org";
              break label468;
              label993: if (((File)localObject4).exists())
              {
                ((File)localObject4).renameTo((File)localObject1);
                break label501;
              }
              if (!((File)localObject3).exists())
                break label501;
              ((File)localObject3).renameTo((File)localObject1);
              break label501;
              label1029: localTbsDownloadConfig.setDownloadInterruptCode(-205);
              ((TbsLogReport.TbsLogInfo)localObject1).setErrorCode(-205);
              break label625;
              label1047: if (paramBoolean1)
              {
                localTbsDownloadConfig.setDownloadInterruptCode(-104);
                break label661;
              }
              localTbsDownloadConfig.setDownloadInterruptCode(-205);
            }
          }
        }
        catch (Exception localException1)
        {
          label1085: Object localObject2;
          while (true)
          {
            m = -1;
            continue;
            long l3 = 1L;
            continue;
            if (!paramBoolean3)
            {
              localObject2 = TbsDownloadUpload.getInstance(c);
              ((TbsDownloadUpload)localObject2).a.put("tbs_startdownload_code", Integer.valueOf(167));
              ((TbsDownloadUpload)localObject2).commit();
            }
          }
          label1122: if (m != -1);
          while (true)
          {
            try
            {
              localObject2 = v.a(c).d();
              TbsLog.i("TbsDownload", "[TbsDownloader.sendRequest] postUrl=".concat(String.valueOf(localObject2)));
              if (paramBoolean1)
              {
                localObject4 = TbsDownloadUpload.getInstance(c);
                ((TbsDownloadUpload)localObject4).a.put("tbs_needdownload_code", Integer.valueOf(148));
                ((TbsDownloadUpload)localObject4).a.put("tbs_needdownload_sent", Integer.valueOf(1));
                ((TbsDownloadUpload)localObject4).commit();
                TbsLog.i("TbsDownload", "sendRequest query 148");
                localObject4 = ((JSONObject)localObject3).toString().getBytes("utf-8");
                localObject3 = new com/tencent/smtt/sdk/ak;
                ((ak)localObject3).<init>(localTbsDownloadConfig, paramBoolean1);
                paramBoolean2 = a(n.a((String)localObject2, (byte[])localObject4, (n.a)localObject3, false), m, paramBoolean1, paramBoolean2);
                paramBoolean1 = paramBoolean2;
                AppMethodBeat.o(64374);
                break;
              }
              if (paramBoolean3)
                continue;
              localObject4 = TbsDownloadUpload.getInstance(c);
              ((TbsDownloadUpload)localObject4).a.put("tbs_startdownload_code", Integer.valueOf(168));
              ((TbsDownloadUpload)localObject4).a.put("tbs_startdownload_sent", Integer.valueOf(1));
              ((TbsDownloadUpload)localObject4).commit();
              TbsLog.i("TbsDownload", "sendRequest download 168");
              continue;
            }
            catch (Throwable localThrowable)
            {
              if (paramBoolean1)
              {
                localTbsDownloadConfig.setDownloadInterruptCode(-106);
                paramBoolean1 = false;
                continue;
              }
              localTbsDownloadConfig.setDownloadInterruptCode(-206);
              paramBoolean1 = false;
              continue;
            }
            TbsDownloadUpload localTbsDownloadUpload;
            if (paramBoolean1)
            {
              localTbsDownloadUpload = TbsDownloadUpload.getInstance(c);
              localTbsDownloadUpload.a.put("tbs_needdownload_code", Integer.valueOf(149));
              localTbsDownloadUpload.commit();
              paramBoolean1 = false;
            }
            else
            {
              if (!paramBoolean3)
              {
                localTbsDownloadUpload = TbsDownloadUpload.getInstance(c);
                localTbsDownloadUpload.a.put("tbs_startdownload_code", Integer.valueOf(169));
                localTbsDownloadUpload.commit();
              }
              paramBoolean1 = false;
            }
          }
        }
      }
      catch (Exception localException2)
      {
        break label570;
      }
    }
  }

  private static boolean d()
  {
    AppMethodBeat.i(64365);
    try
    {
      JSONArray localJSONArray = f();
      bool = TbsDownloadConfig.getInstance(c).mPreferences.getString("last_thirdapp_sendrequest_coreversion", "").equals(localJSONArray.toString());
      AppMethodBeat.o(64365);
      return bool;
    }
    catch (Exception localException)
    {
      while (true)
      {
        boolean bool = false;
        AppMethodBeat.o(64365);
      }
    }
  }

  private static String[] e()
  {
    AppMethodBeat.i(64366);
    Object localObject;
    if (QbSdk.getOnlyDownload())
    {
      localObject = new String[1];
      localObject[0] = c.getApplicationContext().getPackageName();
    }
    while (true)
    {
      AppMethodBeat.o(64366);
      return localObject;
      localObject = TbsShareManager.getCoreProviderAppList();
      String str = c.getApplicationContext().getPackageName();
      if (str.equals(TbsShareManager.f(c)))
      {
        int m = localObject.length;
        String[] arrayOfString = new String[m + 1];
        System.arraycopy(localObject, 0, arrayOfString, 0, m);
        arrayOfString[m] = str;
        localObject = arrayOfString;
      }
    }
  }

  private static JSONArray f()
  {
    AppMethodBeat.i(64369);
    JSONArray localJSONArray;
    if (TbsShareManager.isThirdPartyApp(c))
    {
      localJSONArray = new JSONArray();
      a(localJSONArray);
      c(localJSONArray);
      b(localJSONArray);
      AppMethodBeat.o(64369);
    }
    while (true)
    {
      return localJSONArray;
      localJSONArray = null;
      AppMethodBeat.o(64369);
    }
  }

  private static boolean g()
  {
    boolean bool = false;
    AppMethodBeat.i(64379);
    TbsDownloadConfig localTbsDownloadConfig = TbsDownloadConfig.getInstance(c);
    if (localTbsDownloadConfig.mPreferences.getInt("tbs_download_success_retrytimes", 0) >= localTbsDownloadConfig.getDownloadSuccessMaxRetrytimes())
    {
      TbsLog.i("TbsDownload", "[TbsDownloader.needStartDownload] out of success retrytimes", true);
      localTbsDownloadConfig.setDownloadInterruptCode(-115);
      AppMethodBeat.o(64379);
    }
    while (true)
    {
      return bool;
      if (localTbsDownloadConfig.mPreferences.getInt("tbs_download_failed_retrytimes", 0) >= localTbsDownloadConfig.getDownloadFailedMaxRetrytimes())
      {
        TbsLog.i("TbsDownload", "[TbsDownloader.needStartDownload] out of failed retrytimes", true);
        localTbsDownloadConfig.setDownloadInterruptCode(-116);
        AppMethodBeat.o(64379);
      }
      else if (!k.b(c))
      {
        TbsLog.i("TbsDownload", "[TbsDownloader.needStartDownload] local rom freespace limit", true);
        localTbsDownloadConfig.setDownloadInterruptCode(-117);
        AppMethodBeat.o(64379);
      }
      else if (System.currentTimeMillis() - localTbsDownloadConfig.mPreferences.getLong("tbs_downloadstarttime", 0L) <= 86400000L)
      {
        long l1 = localTbsDownloadConfig.mPreferences.getLong("tbs_downloadflow", 0L);
        TbsLog.i("TbsDownload", "[TbsDownloader.needStartDownload] downloadFlow=".concat(String.valueOf(l1)));
        if (l1 >= localTbsDownloadConfig.getDownloadMaxflow())
        {
          TbsLog.i("TbsDownload", "[TbsDownloader.needStartDownload] failed because you exceeded max flow!", true);
          localTbsDownloadConfig.setDownloadInterruptCode(-120);
          AppMethodBeat.o(64379);
        }
      }
      else
      {
        AppMethodBeat.o(64379);
        bool = true;
      }
    }
  }

  public static int getCoreShareDecoupleCoreVersion()
  {
    AppMethodBeat.i(64357);
    int m = an.a().i(c);
    AppMethodBeat.o(64357);
    return m;
  }

  public static int getCoreShareDecoupleCoreVersionByContext(Context paramContext)
  {
    AppMethodBeat.i(64356);
    int m = an.a().i(paramContext);
    AppMethodBeat.o(64356);
    return m;
  }

  public static boolean getOverSea(Context paramContext)
  {
    try
    {
      AppMethodBeat.i(64372);
      if (!k)
      {
        k = true;
        paramContext = TbsDownloadConfig.getInstance(paramContext);
        if (paramContext.mPreferences.contains("is_oversea"))
        {
          j = paramContext.mPreferences.getBoolean("is_oversea", false);
          paramContext = new java/lang/StringBuilder;
          paramContext.<init>("[TbsDownloader.getOverSea]  first called. sOverSea = ");
          TbsLog.i("TbsDownload", j);
        }
        paramContext = new java/lang/StringBuilder;
        paramContext.<init>("[TbsDownloader.getOverSea]  sOverSea = ");
        TbsLog.i("TbsDownload", j);
      }
      boolean bool = j;
      AppMethodBeat.o(64372);
      return bool;
    }
    finally
    {
    }
    throw paramContext;
  }

  public static long getRetryIntervalInSeconds()
  {
    return l;
  }

  public static HandlerThread getsTbsHandlerThread()
  {
    return h;
  }

  private static JSONArray h()
  {
    AppMethodBeat.i(64382);
    JSONArray localJSONArray = new JSONArray();
    String[] arrayOfString = TbsShareManager.getCoreProviderAppList();
    int m = arrayOfString.length;
    int n = 0;
    Object localObject;
    label58: long l1;
    if (n < m)
    {
      localObject = arrayOfString[n];
      String str = k.a(c, (String)localObject, 4, false);
      if (getOverSea(c))
      {
        localObject = "x5.oversea.tbs.org";
        localObject = new File(str, (String)localObject);
        if (((File)localObject).exists())
        {
          l1 = a.a(c, (File)localObject);
          if (l1 > 0L)
          {
            i1 = 0;
            label100: if (i1 >= localJSONArray.length())
              break label164;
            if (localJSONArray.optInt(i1) != l1)
              break label150;
          }
        }
      }
    }
    label150: label164: for (int i1 = 1; ; i1 = 0)
    {
      if (i1 == 0)
        localJSONArray.put(l1);
      n++;
      break;
      localObject = "x5.tbs.org";
      break label58;
      i1++;
      break label100;
      AppMethodBeat.o(64382);
      return localJSONArray;
    }
  }

  public static boolean isDownloadForeground()
  {
    AppMethodBeat.i(64362);
    boolean bool;
    if ((g != null) && (g.e()))
    {
      bool = true;
      AppMethodBeat.o(64362);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(64362);
    }
  }

  public static boolean isDownloading()
  {
    try
    {
      AppMethodBeat.i(64361);
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("[TbsDownloader.isDownloading] is ");
      TbsLog.i("TbsDownload", a);
      boolean bool = a;
      AppMethodBeat.o(64361);
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public static boolean needDownload(Context paramContext, boolean paramBoolean)
  {
    AppMethodBeat.i(64352);
    paramBoolean = needDownload(paramContext, paramBoolean, false, null);
    AppMethodBeat.o(64352);
    return paramBoolean;
  }

  public static boolean needDownload(Context paramContext, boolean paramBoolean1, boolean paramBoolean2, TbsDownloader.TbsDownloaderCallback paramTbsDownloaderCallback)
  {
    boolean bool = false;
    AppMethodBeat.i(64353);
    TbsDownloadUpload.clear();
    TbsDownloadUpload localTbsDownloadUpload = TbsDownloadUpload.getInstance(paramContext);
    localTbsDownloadUpload.a.put("tbs_needdownload_code", Integer.valueOf(140));
    localTbsDownloadUpload.commit();
    TbsLog.i("TbsDownload", "[TbsDownloader.needDownload] oversea=" + paramBoolean1 + ",isDownloadForeground=" + paramBoolean2);
    TbsLog.initIfNeed(paramContext);
    if (an.b)
    {
      if (paramTbsDownloaderCallback != null)
        paramTbsDownloaderCallback.onNeedDownloadFinish(false, 0);
      TbsLog.i("TbsDownload", "[TbsDownloader.needDownload]#1,return false");
      localTbsDownloadUpload.a.put("tbs_needdownload_return", Integer.valueOf(171));
      localTbsDownloadUpload.commit();
      AppMethodBeat.o(64353);
      paramBoolean1 = bool;
    }
    Object localObject;
    while (true)
    {
      return paramBoolean1;
      TbsLog.app_extra("TbsDownload", paramContext);
      localObject = paramContext.getApplicationContext();
      c = (Context)localObject;
      localObject = TbsDownloadConfig.getInstance((Context)localObject);
      ((TbsDownloadConfig)localObject).setDownloadInterruptCode(-100);
      if (!a(c, paramBoolean1, paramTbsDownloaderCallback))
      {
        TbsLog.i("TbsDownload", "[TbsDownloader.needDownload]#2,return false");
        localTbsDownloadUpload.a.put("tbs_needdownload_code", Integer.valueOf(141));
        localTbsDownloadUpload.commit();
        localTbsDownloadUpload.a.put("tbs_needdownload_return", Integer.valueOf(172));
        localTbsDownloadUpload.commit();
        AppMethodBeat.o(64353);
        paramBoolean1 = bool;
      }
      else
      {
        c();
        if (!i)
          break;
        if (paramTbsDownloaderCallback != null)
          paramTbsDownloaderCallback.onNeedDownloadFinish(false, 0);
        ((TbsDownloadConfig)localObject).setDownloadInterruptCode(-105);
        TbsLog.i("TbsDownload", "[TbsDownloader.needDownload]#3,return false");
        localTbsDownloadUpload.a.put("tbs_needdownload_code", Integer.valueOf(142));
        localTbsDownloadUpload.commit();
        localTbsDownloadUpload.a.put("tbs_needdownload_return", Integer.valueOf(173));
        localTbsDownloadUpload.commit();
        AppMethodBeat.o(64353);
        paramBoolean1 = bool;
      }
    }
    bool = a(c, paramBoolean2, false);
    TbsLog.i("TbsDownload", "[TbsDownloader.needDownload],needSendRequest=".concat(String.valueOf(bool)));
    if (bool)
    {
      a(paramBoolean2, paramTbsDownloaderCallback);
      ((TbsDownloadConfig)localObject).setDownloadInterruptCode(-114);
      label394: d.removeMessages(102);
      Message.obtain(d, 102).sendToTarget();
      if ((!QbSdk.c) && (TbsShareManager.isThirdPartyApp(paramContext)))
        break label796;
      paramBoolean2 = ((TbsDownloadConfig)localObject).mPreferences.contains("tbs_needdownload");
      TbsLog.i("TbsDownload", "[TbsDownloader.needDownload] hasNeedDownloadKey=".concat(String.valueOf(paramBoolean2)));
      if ((paramBoolean2) || (TbsShareManager.isThirdPartyApp(paramContext)))
        break label624;
      paramBoolean1 = true;
    }
    while (true)
    {
      label468: TbsLog.i("TbsDownload", "[TbsDownloader.needDownload]#4,needDownload=" + paramBoolean1 + ",hasNeedDownloadKey=" + paramBoolean2);
      if (paramBoolean1)
        if (!g())
        {
          TbsLog.i("TbsDownload", "[TbsDownloader.needDownload]#5,set needDownload = false");
          paramBoolean1 = false;
          label520: if ((!bool) && (paramTbsDownloaderCallback != null))
            paramTbsDownloaderCallback.onNeedDownloadFinish(false, 0);
          TbsLog.i("TbsDownload", "[TbsDownloader.needDownload] needDownload=".concat(String.valueOf(paramBoolean1)));
          paramContext = localTbsDownloadUpload.a;
          if (!paramBoolean1)
            break label788;
        }
      label788: for (int m = 170; ; m = 174)
      {
        paramContext.put("tbs_needdownload_return", Integer.valueOf(m));
        localTbsDownloadUpload.commit();
        AppMethodBeat.o(64353);
        break;
        localTbsDownloadUpload.a.put("tbs_needdownload_code", Integer.valueOf(143));
        localTbsDownloadUpload.commit();
        break label394;
        label624: paramBoolean1 = ((TbsDownloadConfig)localObject).mPreferences.getBoolean("tbs_needdownload", false);
        break label468;
        ((TbsDownloadConfig)localObject).setDownloadInterruptCode(-118);
        TbsLog.i("TbsDownload", "[TbsDownloader.needDownload]#6");
        break label520;
        m = an.a().n(c);
        TbsLog.i("TbsDownload", "[TbsDownloader.needDownload]#7,tbsLocalVersion=" + m + ",needSendRequest=" + bool);
        if ((bool) || (m <= 0))
        {
          d.removeMessages(103);
          if ((m <= 0) && (!bool))
            Message.obtain(d, 103, 0, 0, c).sendToTarget();
          while (true)
          {
            ((TbsDownloadConfig)localObject).setDownloadInterruptCode(-121);
            break;
            Message.obtain(d, 103, 1, 0, c).sendToTarget();
          }
        }
        ((TbsDownloadConfig)localObject).setDownloadInterruptCode(-119);
        break label520;
      }
      label796: paramBoolean1 = false;
      paramBoolean2 = false;
    }
  }

  public static boolean needDownloadDecoupleCore()
  {
    boolean bool = false;
    AppMethodBeat.i(64358);
    if (TbsShareManager.isThirdPartyApp(c))
      AppMethodBeat.o(64358);
    while (true)
    {
      return bool;
      if (TbsDownloadConfig.getInstance(c).mPreferences.getInt("tbs_downloaddecouplecore", 0) == 1)
      {
        AppMethodBeat.o(64358);
      }
      else
      {
        long l1 = TbsDownloadConfig.getInstance(c).mPreferences.getLong("last_download_decouple_core", 0L);
        if (System.currentTimeMillis() - l1 < 1000L * TbsDownloadConfig.getInstance(c).getRetryInterval())
        {
          AppMethodBeat.o(64358);
        }
        else
        {
          int m = TbsDownloadConfig.getInstance(c).mPreferences.getInt("tbs_decouplecoreversion", 0);
          if ((m > 0) && (m != an.a().i(c)) && (TbsDownloadConfig.getInstance(c).mPreferences.getInt("tbs_download_version", 0) != m))
          {
            AppMethodBeat.o(64358);
            bool = true;
          }
          else
          {
            AppMethodBeat.o(64358);
          }
        }
      }
    }
  }

  public static boolean needSendRequest(Context paramContext, boolean paramBoolean)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    AppMethodBeat.i(64349);
    c = paramContext.getApplicationContext();
    TbsLog.initIfNeed(paramContext);
    if (!a(c, paramBoolean, null))
    {
      AppMethodBeat.o(64349);
      paramBoolean = bool2;
    }
    while (true)
    {
      return paramBoolean;
      int m = an.a().n(paramContext);
      TbsLog.i("TbsDownload", "[TbsDownloader.needSendRequest] localTbsVersion=".concat(String.valueOf(m)));
      if (m > 0)
      {
        AppMethodBeat.o(64349);
        paramBoolean = bool2;
      }
      else
      {
        if (!a(c, false, true))
          break;
        AppMethodBeat.o(64349);
        paramBoolean = true;
      }
    }
    paramContext = TbsDownloadConfig.getInstance(c);
    paramBoolean = paramContext.mPreferences.contains("tbs_needdownload");
    TbsLog.i("TbsDownload", "[TbsDownloader.needSendRequest] hasNeedDownloadKey=".concat(String.valueOf(paramBoolean)));
    if (!paramBoolean)
    {
      paramBoolean = true;
      label146: TbsLog.i("TbsDownload", "[TbsDownloader.needSendRequest] needDownload=".concat(String.valueOf(paramBoolean)));
      if ((!paramBoolean) || (!g()))
        break label214;
    }
    label214: for (paramBoolean = bool1; ; paramBoolean = false)
    {
      TbsLog.i("TbsDownload", "[TbsDownloader.needSendRequest] ret=".concat(String.valueOf(paramBoolean)));
      AppMethodBeat.o(64349);
      break;
      paramBoolean = paramContext.mPreferences.getBoolean("tbs_needdownload", false);
      break label146;
    }
  }

  public static void setAppContext(Context paramContext)
  {
    AppMethodBeat.i(64348);
    if ((paramContext != null) && (paramContext.getApplicationContext() != null))
      c = paramContext.getApplicationContext();
    AppMethodBeat.o(64348);
  }

  public static void setRetryIntervalInSeconds(Context paramContext, long paramLong)
  {
    AppMethodBeat.i(64376);
    if (paramContext == null)
      AppMethodBeat.o(64376);
    while (true)
    {
      return;
      if (paramContext.getApplicationInfo().packageName.equals("com.tencent.qqlive"))
        l = paramLong;
      TbsLog.i("TbsDownload", "mRetryIntervalInSeconds is " + l);
      AppMethodBeat.o(64376);
    }
  }

  public static boolean startDecoupleCoreIfNeeded()
  {
    boolean bool = false;
    AppMethodBeat.i(64359);
    TbsLog.i("TbsDownload", "startDecoupleCoreIfNeeded ");
    if (TbsShareManager.isThirdPartyApp(c))
      AppMethodBeat.o(64359);
    int m;
    while (true)
    {
      return bool;
      TbsLog.i("TbsDownload", "startDecoupleCoreIfNeeded #1");
      if (TbsDownloadConfig.getInstance(c).mPreferences.getInt("tbs_downloaddecouplecore", 0) == 1)
      {
        AppMethodBeat.o(64359);
      }
      else if (d == null)
      {
        AppMethodBeat.o(64359);
      }
      else
      {
        TbsLog.i("TbsDownload", "startDecoupleCoreIfNeeded #2");
        long l1 = TbsDownloadConfig.getInstance(c).mPreferences.getLong("last_download_decouple_core", 0L);
        if (System.currentTimeMillis() - l1 < 1000L * TbsDownloadConfig.getInstance(c).getRetryInterval())
        {
          AppMethodBeat.o(64359);
        }
        else
        {
          TbsLog.i("TbsDownload", "startDecoupleCoreIfNeeded #3");
          m = TbsDownloadConfig.getInstance(c).mPreferences.getInt("tbs_decouplecoreversion", 0);
          if ((m <= 0) || (m == an.a().i(c)))
            break label397;
          if ((TbsDownloadConfig.getInstance(c).mPreferences.getInt("tbs_download_version", 0) == m) && (TbsDownloadConfig.getInstance(c).mPreferences.getInt("tbs_download_version_type", 0) != 1))
            break;
          TbsLog.i("TbsDownload", "startDecoupleCoreIfNeeded #4");
          a = true;
          d.removeMessages(108);
          Message localMessage = Message.obtain(d, 108, QbSdk.m);
          localMessage.arg1 = 0;
          localMessage.sendToTarget();
          TbsDownloadConfig.getInstance(c).a.put("last_download_decouple_core", Long.valueOf(System.currentTimeMillis()));
          AppMethodBeat.o(64359);
          bool = true;
        }
      }
    }
    TbsLog.i("TbsDownload", "startDecoupleCoreIfNeeded no need, KEY_TBS_DOWNLOAD_V is " + TbsDownloadConfig.getInstance(c).mPreferences.getInt("tbs_download_version", 0) + " deCoupleCoreVersion is " + m + " KEY_TBS_DOWNLOAD_V_TYPE is " + TbsDownloadConfig.getInstance(c).mPreferences.getInt("tbs_download_version_type", 0));
    while (true)
    {
      AppMethodBeat.o(64359);
      break;
      label397: TbsLog.i("TbsDownload", "startDecoupleCoreIfNeeded no need, deCoupleCoreVersion is " + m + " getTbsCoreShareDecoupleCoreVersion is " + an.a().i(c));
    }
  }

  public static void startDownload(Context paramContext)
  {
    AppMethodBeat.i(64354);
    startDownload(paramContext, false);
    AppMethodBeat.o(64354);
  }

  public static void startDownload(Context paramContext, boolean paramBoolean)
  {
    int m = 1;
    while (true)
    {
      TbsDownloadUpload localTbsDownloadUpload;
      try
      {
        AppMethodBeat.i(64355);
        localTbsDownloadUpload = TbsDownloadUpload.getInstance(paramContext);
        localTbsDownloadUpload.a.put("tbs_startdownload_code", Integer.valueOf(160));
        localTbsDownloadUpload.commit();
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("[TbsDownloader.startDownload] sAppContext=");
        TbsLog.i("TbsDownload", c);
        if (an.b)
        {
          localTbsDownloadUpload.a.put("tbs_startdownload_code", Integer.valueOf(161));
          localTbsDownloadUpload.commit();
          AppMethodBeat.o(64355);
          return;
        }
        a = true;
        paramContext = paramContext.getApplicationContext();
        c = paramContext;
        TbsDownloadConfig.getInstance(paramContext).setDownloadInterruptCode(-200);
        if (Build.VERSION.SDK_INT < 8)
        {
          QbSdk.m.onDownloadFinish(110);
          TbsDownloadConfig.getInstance(c).setDownloadInterruptCode(-201);
          localTbsDownloadUpload.a.put("tbs_startdownload_code", Integer.valueOf(162));
          localTbsDownloadUpload.commit();
          AppMethodBeat.o(64355);
          continue;
        }
      }
      finally
      {
      }
      c();
      if (!i)
        break;
      QbSdk.m.onDownloadFinish(121);
      TbsDownloadConfig.getInstance(c).setDownloadInterruptCode(-202);
      localTbsDownloadUpload.a.put("tbs_startdownload_code", Integer.valueOf(163));
      localTbsDownloadUpload.commit();
      AppMethodBeat.o(64355);
    }
    if (paramBoolean)
      stopDownload();
    d.removeMessages(101);
    d.removeMessages(100);
    paramContext = Message.obtain(d, 101, QbSdk.m);
    if (paramBoolean);
    while (true)
    {
      paramContext.arg1 = m;
      paramContext.sendToTarget();
      AppMethodBeat.o(64355);
      break;
      m = 0;
    }
  }

  public static void stopDownload()
  {
    AppMethodBeat.i(64360);
    if (i)
      AppMethodBeat.o(64360);
    while (true)
    {
      return;
      TbsLog.i("TbsDownload", "[TbsDownloader.stopDownload]");
      if (g != null)
        g.c();
      if (d != null)
      {
        d.removeMessages(100);
        d.removeMessages(101);
        d.removeMessages(108);
      }
      AppMethodBeat.o(64360);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.TbsDownloader
 * JD-Core Version:    0.6.2
 */
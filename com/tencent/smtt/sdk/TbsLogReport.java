package com.tencent.smtt.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.utils.TbsLog;
import com.tencent.smtt.utils.b;
import com.tencent.smtt.utils.n;
import com.tencent.smtt.utils.s;
import com.tencent.smtt.utils.v;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;

public class TbsLogReport
{
  private static TbsLogReport a;
  private Handler b;
  private Context c;
  private boolean d;

  private TbsLogReport(Context paramContext)
  {
    AppMethodBeat.i(64493);
    this.b = null;
    this.d = false;
    this.c = paramContext.getApplicationContext();
    paramContext = new HandlerThread("TbsLogReportThread");
    paramContext.start();
    this.b = new ax(this, paramContext.getLooper());
    AppMethodBeat.o(64493);
  }

  private String a(int paramInt)
  {
    AppMethodBeat.i(64512);
    String str = paramInt + "|";
    AppMethodBeat.o(64512);
    return str;
  }

  private String a(long paramLong)
  {
    AppMethodBeat.i(64509);
    Object localObject1 = null;
    try
    {
      Object localObject2 = new java/text/SimpleDateFormat;
      ((SimpleDateFormat)localObject2).<init>("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
      Date localDate = new java/util/Date;
      localDate.<init>(paramLong);
      localObject2 = ((SimpleDateFormat)localObject2).format(localDate);
      localObject1 = localObject2;
      label45: AppMethodBeat.o(64509);
      return localObject1;
    }
    catch (Exception localException)
    {
      break label45;
    }
  }

  private String a(String paramString)
  {
    AppMethodBeat.i(64511);
    StringBuilder localStringBuilder = new StringBuilder();
    String str = paramString;
    if (paramString == null)
      str = "";
    paramString = str + "|";
    AppMethodBeat.o(64511);
    return paramString;
  }

  private JSONArray a()
  {
    AppMethodBeat.i(64505);
    Object localObject = d().getString("tbs_download_upload", null);
    if (localObject == null)
      localObject = new JSONArray();
    while (true)
    {
      AppMethodBeat.o(64505);
      return localObject;
      try
      {
        JSONArray localJSONArray2 = new org/json/JSONArray;
        localJSONArray2.<init>((String)localObject);
        localObject = localJSONArray2;
        if (localJSONArray2.length() > 5)
        {
          JSONArray localJSONArray3 = new org/json/JSONArray;
          localJSONArray3.<init>();
          int i = localJSONArray2.length() - 1;
          localObject = localJSONArray2;
          if (i > localJSONArray2.length() - 5)
          {
            localJSONArray3.put(localJSONArray2.get(i));
            AppMethodBeat.o(64505);
            localObject = localJSONArray3;
          }
        }
      }
      catch (Exception localException)
      {
        JSONArray localJSONArray1 = new JSONArray();
      }
    }
  }

  private void a(int paramInt, TbsLogReport.TbsLogInfo paramTbsLogInfo)
  {
    AppMethodBeat.i(64504);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(a(paramInt));
    localStringBuilder.append(a(b.c(this.c)));
    localStringBuilder.append(a(s.a(this.c)));
    localStringBuilder.append(a(an.a().n(this.c)));
    Object localObject1 = Build.MODEL;
    try
    {
      localObject2 = new java/lang/String;
      ((String)localObject2).<init>(((String)localObject1).getBytes("UTF-8"), "ISO8859-1");
      localObject1 = localObject2;
      localStringBuilder.append(a((String)localObject1));
      localObject1 = this.c.getPackageName();
      localStringBuilder.append(a((String)localObject1));
      if ("com.tencent.mm".equals(localObject1))
      {
        localStringBuilder.append(a(b.a(this.c, "com.tencent.mm.BuildInfo.CLIENT_VERSION")));
        localStringBuilder.append(a(a(TbsLogReport.TbsLogInfo.a(paramTbsLogInfo))));
        localStringBuilder.append(a(TbsLogReport.TbsLogInfo.b(paramTbsLogInfo)));
        localStringBuilder.append(a(TbsLogReport.TbsLogInfo.c(paramTbsLogInfo)));
        localStringBuilder.append(a(TbsLogReport.TbsLogInfo.d(paramTbsLogInfo)));
        localStringBuilder.append(a(TbsLogReport.TbsLogInfo.e(paramTbsLogInfo)));
        localStringBuilder.append(a(TbsLogReport.TbsLogInfo.f(paramTbsLogInfo)));
        localStringBuilder.append(a(TbsLogReport.TbsLogInfo.g(paramTbsLogInfo)));
        localStringBuilder.append(a(TbsLogReport.TbsLogInfo.h(paramTbsLogInfo)));
        localStringBuilder.append(a(TbsLogReport.TbsLogInfo.i(paramTbsLogInfo)));
        localStringBuilder.append(a(TbsLogReport.TbsLogInfo.j(paramTbsLogInfo)));
        localStringBuilder.append(b(TbsLogReport.TbsLogInfo.k(paramTbsLogInfo)));
        localStringBuilder.append(b(TbsLogReport.TbsLogInfo.l(paramTbsLogInfo)));
        localStringBuilder.append(b(TbsLogReport.TbsLogInfo.m(paramTbsLogInfo)));
        localStringBuilder.append(a(TbsLogReport.TbsLogInfo.n(paramTbsLogInfo)));
        localStringBuilder.append(a(paramTbsLogInfo.a));
        localStringBuilder.append(a(TbsLogReport.TbsLogInfo.o(paramTbsLogInfo)));
        localStringBuilder.append(a(TbsLogReport.TbsLogInfo.p(paramTbsLogInfo)));
        localStringBuilder.append(a(TbsDownloadConfig.getInstance(this.c).mPreferences.getInt("tbs_download_version", 0)));
        localStringBuilder.append(a(b.f(this.c)));
        localStringBuilder.append(a("4.3.0.1057_43644"));
        localStringBuilder.append(false);
        localSharedPreferences = d();
        localObject1 = a();
        localObject2 = new JSONArray();
        if (((JSONArray)localObject2).length() < 5)
          break label551;
        i = 4;
        paramTbsLogInfo = (TbsLogReport.TbsLogInfo)localObject2;
        if (i <= 0)
          break label554;
      }
    }
    catch (Exception localException)
    {
      SharedPreferences localSharedPreferences;
      try
      {
        while (true)
        {
          Object localObject2;
          int i;
          ((JSONArray)localObject2).put(((JSONArray)localObject1).get(((JSONArray)localObject2).length() - i));
          i--;
          continue;
          localException = localException;
        }
        localStringBuilder.append(a(b.b(this.c)));
      }
      catch (Exception paramTbsLogInfo)
      {
        while (true)
          TbsLog.e("upload", "JSONArray transform error!");
      }
      label551: paramTbsLogInfo = (TbsLogReport.TbsLogInfo)localObject1;
      label554: paramTbsLogInfo.put(localStringBuilder.toString());
      localObject1 = localSharedPreferences.edit();
      ((SharedPreferences.Editor)localObject1).putString("tbs_download_upload", paramTbsLogInfo.toString());
      ((SharedPreferences.Editor)localObject1).commit();
      if ((this.d) || (paramInt != EventType.TYPE_LOAD.a))
        b();
      AppMethodBeat.o(64504);
    }
  }

  private void a(int paramInt, TbsLogReport.TbsLogInfo paramTbsLogInfo, EventType paramEventType)
  {
    AppMethodBeat.i(64498);
    paramTbsLogInfo.setErrorCode(paramInt);
    paramTbsLogInfo.setEventTime(System.currentTimeMillis());
    QbSdk.m.onInstallFinish(paramInt);
    eventReport(paramEventType, paramTbsLogInfo);
    AppMethodBeat.o(64498);
  }

  private String b(long paramLong)
  {
    AppMethodBeat.i(64513);
    String str = paramLong + "|";
    AppMethodBeat.o(64513);
    return str;
  }

  private void b()
  {
    AppMethodBeat.i(64507);
    if ((QbSdk.n != null) && (QbSdk.n.containsKey(QbSdk.KEY_SET_SENDREQUEST_AND_UPLOAD)) && (QbSdk.n.get(QbSdk.KEY_SET_SENDREQUEST_AND_UPLOAD).equals("false")))
    {
      TbsLog.i("upload", "[TbsLogReport.sendLogReportRequest] -- SET_SENDREQUEST_AND_UPLOAD is false");
      AppMethodBeat.o(64507);
    }
    while (true)
    {
      return;
      TbsLog.i("TbsDownload", "[TbsApkDownloadStat.reportDownloadStat]");
      Object localObject = a();
      if ((localObject == null) || (((JSONArray)localObject).length() == 0))
      {
        TbsLog.i("TbsDownload", "[TbsApkDownloadStat.reportDownloadStat] no data");
        AppMethodBeat.o(64507);
      }
      else
      {
        TbsLog.i("TbsDownload", "[TbsApkDownloadStat.reportDownloadStat] jsonArray:".concat(String.valueOf(localObject)));
        try
        {
          String str = v.a(this.c).c();
          localObject = ((JSONArray)localObject).toString().getBytes("utf-8");
          az localaz = new com/tencent/smtt/sdk/az;
          localaz.<init>(this);
          str = n.a(str, (byte[])localObject, localaz, true);
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>("[TbsApkDownloadStat.reportDownloadStat] response:");
          TbsLog.i("TbsDownload", str + " testcase: -1");
          AppMethodBeat.o(64507);
        }
        catch (Throwable localThrowable)
        {
          AppMethodBeat.o(64507);
        }
      }
    }
  }

  private void c()
  {
    AppMethodBeat.i(64508);
    SharedPreferences.Editor localEditor = d().edit();
    localEditor.remove("tbs_download_upload");
    localEditor.commit();
    AppMethodBeat.o(64508);
  }

  private SharedPreferences d()
  {
    AppMethodBeat.i(64510);
    SharedPreferences localSharedPreferences = this.c.getSharedPreferences("tbs_download_stat", 4);
    AppMethodBeat.o(64510);
    return localSharedPreferences;
  }

  public static TbsLogReport getInstance(Context paramContext)
  {
    AppMethodBeat.i(64494);
    if (a == null);
    try
    {
      if (a == null)
      {
        TbsLogReport localTbsLogReport = new com/tencent/smtt/sdk/TbsLogReport;
        localTbsLogReport.<init>(paramContext);
        a = localTbsLogReport;
      }
      paramContext = a;
      AppMethodBeat.o(64494);
      return paramContext;
    }
    finally
    {
      AppMethodBeat.o(64494);
    }
    throw paramContext;
  }

  public void clear()
  {
    AppMethodBeat.i(64514);
    try
    {
      SharedPreferences.Editor localEditor = d().edit();
      localEditor.clear();
      localEditor.commit();
      AppMethodBeat.o(64514);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(64514);
    }
  }

  public void dailyReport()
  {
    AppMethodBeat.i(64502);
    this.b.sendEmptyMessage(601);
    AppMethodBeat.o(64502);
  }

  public void eventReport(EventType paramEventType, TbsLogReport.TbsLogInfo paramTbsLogInfo)
  {
    AppMethodBeat.i(64503);
    try
    {
      paramTbsLogInfo = (TbsLogReport.TbsLogInfo)paramTbsLogInfo.clone();
      Message localMessage = this.b.obtainMessage();
      localMessage.what = 600;
      localMessage.arg1 = paramEventType.a;
      localMessage.obj = paramTbsLogInfo;
      this.b.sendMessage(localMessage);
      AppMethodBeat.o(64503);
      return;
    }
    catch (Throwable paramEventType)
    {
      while (true)
      {
        TbsLog.w("upload", "[TbsLogReport.eventReport] error, message=" + paramEventType.getMessage());
        AppMethodBeat.o(64503);
      }
    }
  }

  public boolean getShouldUploadEventReport()
  {
    return this.d;
  }

  // ERROR //
  public void reportTbsLog()
  {
    // Byte code:
    //   0: ldc_w 478
    //   3: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: getstatic 353	com/tencent/smtt/sdk/QbSdk:n	Ljava/util/Map;
    //   9: ifnull +53 -> 62
    //   12: getstatic 353	com/tencent/smtt/sdk/QbSdk:n	Ljava/util/Map;
    //   15: getstatic 356	com/tencent/smtt/sdk/QbSdk:KEY_SET_SENDREQUEST_AND_UPLOAD	Ljava/lang/String;
    //   18: invokeinterface 361 2 0
    //   23: ifeq +39 -> 62
    //   26: getstatic 353	com/tencent/smtt/sdk/QbSdk:n	Ljava/util/Map;
    //   29: getstatic 356	com/tencent/smtt/sdk/QbSdk:KEY_SET_SENDREQUEST_AND_UPLOAD	Ljava/lang/String;
    //   32: invokeinterface 364 2 0
    //   37: ldc_w 366
    //   40: invokevirtual 367	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   43: ifeq +19 -> 62
    //   46: ldc_w 280
    //   49: ldc_w 480
    //   52: invokestatic 371	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   55: ldc_w 478
    //   58: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   61: return
    //   62: aload_0
    //   63: getfield 43	com/tencent/smtt/sdk/TbsLogReport:c	Landroid/content/Context;
    //   66: invokestatic 485	com/tencent/smtt/utils/Apn:getApnType	(Landroid/content/Context;)I
    //   69: iconst_3
    //   70: if_icmpeq +12 -> 82
    //   73: ldc_w 478
    //   76: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   79: goto -18 -> 61
    //   82: invokestatic 488	com/tencent/smtt/utils/TbsLog:getTbsLogFilePath	()Ljava/lang/String;
    //   85: astore_1
    //   86: aload_1
    //   87: ifnonnull +12 -> 99
    //   90: ldc_w 478
    //   93: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   96: goto -35 -> 61
    //   99: invokestatic 493	com/tencent/smtt/utils/o:a	()Lcom/tencent/smtt/utils/o;
    //   102: invokevirtual 495	com/tencent/smtt/utils/o:b	()Ljava/lang/String;
    //   105: astore_2
    //   106: aload_0
    //   107: getfield 43	com/tencent/smtt/sdk/TbsLogReport:c	Landroid/content/Context;
    //   110: invokestatic 152	com/tencent/smtt/utils/b:c	(Landroid/content/Context;)Ljava/lang/String;
    //   113: astore_3
    //   114: aload_0
    //   115: getfield 43	com/tencent/smtt/sdk/TbsLogReport:c	Landroid/content/Context;
    //   118: invokestatic 269	com/tencent/smtt/utils/b:f	(Landroid/content/Context;)Ljava/lang/String;
    //   121: astore 4
    //   123: aload_3
    //   124: invokevirtual 498	java/lang/String:getBytes	()[B
    //   127: astore_3
    //   128: aload 4
    //   130: invokevirtual 498	java/lang/String:getBytes	()[B
    //   133: astore 5
    //   135: aload_3
    //   136: astore 4
    //   138: invokestatic 493	com/tencent/smtt/utils/o:a	()Lcom/tencent/smtt/utils/o;
    //   141: aload_3
    //   142: invokevirtual 501	com/tencent/smtt/utils/o:a	([B)[B
    //   145: astore_3
    //   146: aload_3
    //   147: astore 4
    //   149: invokestatic 493	com/tencent/smtt/utils/o:a	()Lcom/tencent/smtt/utils/o;
    //   152: aload 5
    //   154: invokevirtual 501	com/tencent/smtt/utils/o:a	([B)[B
    //   157: astore 6
    //   159: aload 6
    //   161: astore 4
    //   163: aload_3
    //   164: astore 5
    //   166: aload 4
    //   168: astore_3
    //   169: aload 5
    //   171: invokestatic 504	com/tencent/smtt/utils/o:b	([B)Ljava/lang/String;
    //   174: astore 4
    //   176: aload_3
    //   177: invokestatic 504	com/tencent/smtt/utils/o:b	([B)Ljava/lang/String;
    //   180: astore_3
    //   181: new 70	java/lang/StringBuilder
    //   184: dup
    //   185: invokespecial 71	java/lang/StringBuilder:<init>	()V
    //   188: aload_0
    //   189: getfield 43	com/tencent/smtt/sdk/TbsLogReport:c	Landroid/content/Context;
    //   192: invokestatic 391	com/tencent/smtt/utils/v:a	(Landroid/content/Context;)Lcom/tencent/smtt/utils/v;
    //   195: invokevirtual 506	com/tencent/smtt/utils/v:e	()Ljava/lang/String;
    //   198: invokevirtual 80	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   201: aload 4
    //   203: invokevirtual 80	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   206: ldc_w 508
    //   209: invokevirtual 80	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   212: aload_3
    //   213: invokevirtual 80	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   216: invokevirtual 84	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   219: astore 7
    //   221: new 510	java/util/HashMap
    //   224: dup
    //   225: invokespecial 511	java/util/HashMap:<init>	()V
    //   228: astore 8
    //   230: aload 8
    //   232: ldc_w 513
    //   235: ldc_w 515
    //   238: invokeinterface 518 3 0
    //   243: pop
    //   244: aload 8
    //   246: ldc_w 520
    //   249: ldc 177
    //   251: invokeinterface 518 3 0
    //   256: pop
    //   257: aload 8
    //   259: ldc_w 522
    //   262: aload_0
    //   263: getfield 43	com/tencent/smtt/sdk/TbsLogReport:c	Landroid/content/Context;
    //   266: invokestatic 158	com/tencent/smtt/utils/s:a	(Landroid/content/Context;)Ljava/lang/String;
    //   269: invokeinterface 518 3 0
    //   274: pop
    //   275: new 524	java/io/File
    //   278: getstatic 528	com/tencent/smtt/utils/k:a	Ljava/lang/String;
    //   281: invokespecial 529	java/io/File:<init>	(Ljava/lang/String;)V
    //   284: new 11	com/tencent/smtt/sdk/TbsLogReport$a
    //   287: astore 4
    //   289: new 70	java/lang/StringBuilder
    //   292: astore_3
    //   293: aload_3
    //   294: invokespecial 71	java/lang/StringBuilder:<init>	()V
    //   297: aload 4
    //   299: aload_1
    //   300: aload_3
    //   301: getstatic 528	com/tencent/smtt/utils/k:a	Ljava/lang/String;
    //   304: invokevirtual 80	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   307: ldc_w 531
    //   310: invokevirtual 80	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   313: invokevirtual 84	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   316: invokespecial 533	com/tencent/smtt/sdk/TbsLogReport$a:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   319: aload 4
    //   321: invokevirtual 535	com/tencent/smtt/sdk/TbsLogReport$a:a	()V
    //   324: new 524	java/io/File
    //   327: astore 5
    //   329: aload 5
    //   331: getstatic 528	com/tencent/smtt/utils/k:a	Ljava/lang/String;
    //   334: ldc_w 537
    //   337: invokespecial 538	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   340: new 540	java/io/FileInputStream
    //   343: astore 6
    //   345: aload 6
    //   347: aload 5
    //   349: invokespecial 543	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   352: sipush 8192
    //   355: newarray byte
    //   357: astore 4
    //   359: new 545	java/io/ByteArrayOutputStream
    //   362: astore_3
    //   363: aload_3
    //   364: invokespecial 546	java/io/ByteArrayOutputStream:<init>	()V
    //   367: aload 6
    //   369: aload 4
    //   371: invokevirtual 550	java/io/FileInputStream:read	([B)I
    //   374: istore 9
    //   376: iload 9
    //   378: iconst_m1
    //   379: if_icmpeq +106 -> 485
    //   382: aload_3
    //   383: aload 4
    //   385: iconst_0
    //   386: iload 9
    //   388: invokevirtual 554	java/io/ByteArrayOutputStream:write	([BII)V
    //   391: goto -24 -> 367
    //   394: astore 4
    //   396: aload_3
    //   397: astore 4
    //   399: aload 6
    //   401: astore_3
    //   402: aload_3
    //   403: ifnull +7 -> 410
    //   406: aload_3
    //   407: invokevirtual 557	java/io/FileInputStream:close	()V
    //   410: aload 4
    //   412: ifnull +8 -> 420
    //   415: aload 4
    //   417: invokevirtual 558	java/io/ByteArrayOutputStream:close	()V
    //   420: aload 5
    //   422: ifnull +257 -> 679
    //   425: aload 5
    //   427: invokevirtual 561	java/io/File:delete	()Z
    //   430: pop
    //   431: aconst_null
    //   432: astore 4
    //   434: new 70	java/lang/StringBuilder
    //   437: dup
    //   438: invokespecial 71	java/lang/StringBuilder:<init>	()V
    //   441: aload 7
    //   443: invokevirtual 80	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   446: ldc_w 563
    //   449: invokevirtual 80	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   452: aload_2
    //   453: invokevirtual 80	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   456: invokevirtual 84	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   459: aload 8
    //   461: aload 4
    //   463: new 565	com/tencent/smtt/sdk/ay
    //   466: dup
    //   467: aload_0
    //   468: invokespecial 566	com/tencent/smtt/sdk/ay:<init>	(Lcom/tencent/smtt/sdk/TbsLogReport;)V
    //   471: iconst_0
    //   472: invokestatic 569	com/tencent/smtt/utils/n:a	(Ljava/lang/String;Ljava/util/Map;[BLcom/tencent/smtt/utils/n$a;Z)Ljava/lang/String;
    //   475: pop
    //   476: ldc_w 478
    //   479: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   482: goto -421 -> 61
    //   485: aload_3
    //   486: invokevirtual 572	java/io/ByteArrayOutputStream:flush	()V
    //   489: invokestatic 493	com/tencent/smtt/utils/o:a	()Lcom/tencent/smtt/utils/o;
    //   492: aload_3
    //   493: invokevirtual 575	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   496: invokevirtual 501	com/tencent/smtt/utils/o:a	([B)[B
    //   499: astore 4
    //   501: aload 6
    //   503: invokevirtual 557	java/io/FileInputStream:close	()V
    //   506: aload_3
    //   507: invokevirtual 558	java/io/ByteArrayOutputStream:close	()V
    //   510: aload 5
    //   512: invokevirtual 561	java/io/File:delete	()Z
    //   515: pop
    //   516: goto -82 -> 434
    //   519: astore 4
    //   521: aconst_null
    //   522: astore_3
    //   523: aconst_null
    //   524: astore_2
    //   525: aconst_null
    //   526: astore 5
    //   528: aload 5
    //   530: ifnull +8 -> 538
    //   533: aload 5
    //   535: invokevirtual 557	java/io/FileInputStream:close	()V
    //   538: aload_3
    //   539: ifnull +7 -> 546
    //   542: aload_3
    //   543: invokevirtual 558	java/io/ByteArrayOutputStream:close	()V
    //   546: aload_2
    //   547: ifnull +8 -> 555
    //   550: aload_2
    //   551: invokevirtual 561	java/io/File:delete	()Z
    //   554: pop
    //   555: ldc_w 478
    //   558: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   561: aload 4
    //   563: athrow
    //   564: astore 6
    //   566: goto -60 -> 506
    //   569: astore_3
    //   570: goto -60 -> 510
    //   573: astore_3
    //   574: goto -164 -> 410
    //   577: astore 4
    //   579: goto -159 -> 420
    //   582: astore 5
    //   584: goto -46 -> 538
    //   587: astore_3
    //   588: goto -42 -> 546
    //   591: astore 4
    //   593: aconst_null
    //   594: astore_3
    //   595: aconst_null
    //   596: astore 6
    //   598: aload 5
    //   600: astore_2
    //   601: aload 6
    //   603: astore 5
    //   605: goto -77 -> 528
    //   608: astore 4
    //   610: aconst_null
    //   611: astore_3
    //   612: aload 5
    //   614: astore_2
    //   615: aload 6
    //   617: astore 5
    //   619: goto -91 -> 528
    //   622: astore 4
    //   624: aload 5
    //   626: astore_2
    //   627: aload 6
    //   629: astore 5
    //   631: goto -103 -> 528
    //   634: astore 4
    //   636: aconst_null
    //   637: astore 4
    //   639: aconst_null
    //   640: astore 5
    //   642: aconst_null
    //   643: astore_3
    //   644: goto -242 -> 402
    //   647: astore 4
    //   649: aconst_null
    //   650: astore 4
    //   652: aconst_null
    //   653: astore_3
    //   654: goto -252 -> 402
    //   657: astore 4
    //   659: aconst_null
    //   660: astore 4
    //   662: aload 6
    //   664: astore_3
    //   665: goto -263 -> 402
    //   668: astore_3
    //   669: aload 5
    //   671: astore_3
    //   672: aload 4
    //   674: astore 5
    //   676: goto -507 -> 169
    //   679: aconst_null
    //   680: astore 4
    //   682: goto -248 -> 434
    //
    // Exception table:
    //   from	to	target	type
    //   367	376	394	java/lang/Exception
    //   382	391	394	java/lang/Exception
    //   485	501	394	java/lang/Exception
    //   275	340	519	finally
    //   501	506	564	java/lang/Exception
    //   506	510	569	java/lang/Exception
    //   406	410	573	java/lang/Exception
    //   415	420	577	java/lang/Exception
    //   533	538	582	java/lang/Exception
    //   542	546	587	java/lang/Exception
    //   340	352	591	finally
    //   352	367	608	finally
    //   367	376	622	finally
    //   382	391	622	finally
    //   485	501	622	finally
    //   275	340	634	java/lang/Exception
    //   340	352	647	java/lang/Exception
    //   352	367	657	java/lang/Exception
    //   138	146	668	java/lang/Exception
    //   149	159	668	java/lang/Exception
  }

  public void setInstallErrorCode(int paramInt, String paramString)
  {
    AppMethodBeat.i(64496);
    setInstallErrorCode(paramInt, paramString, EventType.TYPE_INSTALL);
    AppMethodBeat.o(64496);
  }

  public void setInstallErrorCode(int paramInt, String paramString, EventType paramEventType)
  {
    AppMethodBeat.i(64497);
    if ((paramInt != 200) && (paramInt != 220) && (paramInt != 221))
      TbsLog.i("TbsDownload", "error occured in installation, errorCode:".concat(String.valueOf(paramInt)), true);
    TbsLogReport.TbsLogInfo localTbsLogInfo = tbsLogInfo();
    localTbsLogInfo.setFailDetail(paramString);
    a(paramInt, localTbsLogInfo, paramEventType);
    AppMethodBeat.o(64497);
  }

  public void setInstallErrorCode(int paramInt, Throwable paramThrowable)
  {
    AppMethodBeat.i(64499);
    TbsLogReport.TbsLogInfo localTbsLogInfo = tbsLogInfo();
    localTbsLogInfo.setFailDetail(paramThrowable);
    a(paramInt, localTbsLogInfo, EventType.TYPE_INSTALL);
    AppMethodBeat.o(64499);
  }

  public void setLoadErrorCode(int paramInt, String paramString)
  {
    AppMethodBeat.i(64500);
    TbsLogReport.TbsLogInfo localTbsLogInfo = tbsLogInfo();
    localTbsLogInfo.setErrorCode(paramInt);
    localTbsLogInfo.setEventTime(System.currentTimeMillis());
    localTbsLogInfo.setFailDetail(paramString);
    eventReport(EventType.TYPE_LOAD, localTbsLogInfo);
    AppMethodBeat.o(64500);
  }

  public void setLoadErrorCode(int paramInt, Throwable paramThrowable)
  {
    AppMethodBeat.i(64501);
    Object localObject = "NULL";
    if (paramThrowable != null)
    {
      paramThrowable = "msg: " + paramThrowable.getMessage() + "; err: " + paramThrowable + "; cause: " + Log.getStackTraceString(paramThrowable.getCause());
      localObject = paramThrowable;
      if (paramThrowable.length() > 1024)
        localObject = paramThrowable.substring(0, 1024);
    }
    setLoadErrorCode(paramInt, (String)localObject);
    AppMethodBeat.o(64501);
  }

  public void setShouldUploadEventReport(boolean paramBoolean)
  {
    this.d = paramBoolean;
  }

  public TbsLogReport.TbsLogInfo tbsLogInfo()
  {
    AppMethodBeat.i(64495);
    TbsLogReport.TbsLogInfo localTbsLogInfo = new TbsLogReport.TbsLogInfo(null);
    AppMethodBeat.o(64495);
    return localTbsLogInfo;
  }

  public static enum EventType
  {
    int a;

    static
    {
      AppMethodBeat.i(64483);
      TYPE_DOWNLOAD = new EventType("TYPE_DOWNLOAD", 0, 0);
      TYPE_INSTALL = new EventType("TYPE_INSTALL", 1, 1);
      TYPE_LOAD = new EventType("TYPE_LOAD", 2, 2);
      TYPE_DOWNLOAD_DECOUPLE = new EventType("TYPE_DOWNLOAD_DECOUPLE", 3, 3);
      TYPE_INSTALL_DECOUPLE = new EventType("TYPE_INSTALL_DECOUPLE", 4, 4);
      TYPE_COOKIE_DB_SWITCH = new EventType("TYPE_COOKIE_DB_SWITCH", 5, 5);
      TYPE_SDK_REPORT_INFO = new EventType("TYPE_SDK_REPORT_INFO", 6, 6);
      b = new EventType[] { TYPE_DOWNLOAD, TYPE_INSTALL, TYPE_LOAD, TYPE_DOWNLOAD_DECOUPLE, TYPE_INSTALL_DECOUPLE, TYPE_COOKIE_DB_SWITCH, TYPE_SDK_REPORT_INFO };
      AppMethodBeat.o(64483);
    }

    private EventType(int paramInt)
    {
      this.a = paramInt;
    }
  }

  static class a
  {
    private final String a;
    private final String b;

    public a(String paramString1, String paramString2)
    {
      this.a = paramString1;
      this.b = paramString2;
    }

    // ERROR //
    private static void a(java.io.File paramFile)
    {
      // Byte code:
      //   0: ldc 25
      //   2: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
      //   5: new 33	java/io/RandomAccessFile
      //   8: astore_1
      //   9: aload_1
      //   10: aload_0
      //   11: ldc 35
      //   13: invokespecial 38	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
      //   16: ldc 40
      //   18: iconst_2
      //   19: invokestatic 46	java/lang/Integer:parseInt	(Ljava/lang/String;I)I
      //   22: istore_2
      //   23: aload_1
      //   24: ldc2_w 47
      //   27: invokevirtual 52	java/io/RandomAccessFile:seek	(J)V
      //   30: aload_1
      //   31: invokevirtual 56	java/io/RandomAccessFile:read	()I
      //   34: istore_3
      //   35: iload_3
      //   36: iload_2
      //   37: iand
      //   38: ifle +23 -> 61
      //   41: aload_1
      //   42: ldc2_w 47
      //   45: invokevirtual 52	java/io/RandomAccessFile:seek	(J)V
      //   48: aload_1
      //   49: iload_2
      //   50: iconst_m1
      //   51: ixor
      //   52: sipush 255
      //   55: iand
      //   56: iload_3
      //   57: iand
      //   58: invokevirtual 59	java/io/RandomAccessFile:write	(I)V
      //   61: aload_1
      //   62: invokevirtual 62	java/io/RandomAccessFile:close	()V
      //   65: ldc 25
      //   67: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   70: return
      //   71: astore_0
      //   72: ldc 25
      //   74: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   77: goto -7 -> 70
      //   80: astore_0
      //   81: aconst_null
      //   82: astore_1
      //   83: aload_1
      //   84: ifnull +42 -> 126
      //   87: aload_1
      //   88: invokevirtual 62	java/io/RandomAccessFile:close	()V
      //   91: ldc 25
      //   93: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   96: goto -26 -> 70
      //   99: astore_0
      //   100: ldc 25
      //   102: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   105: goto -35 -> 70
      //   108: astore_0
      //   109: aconst_null
      //   110: astore_1
      //   111: aload_1
      //   112: ifnull +7 -> 119
      //   115: aload_1
      //   116: invokevirtual 62	java/io/RandomAccessFile:close	()V
      //   119: ldc 25
      //   121: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   124: aload_0
      //   125: athrow
      //   126: ldc 25
      //   128: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   131: goto -61 -> 70
      //   134: astore_1
      //   135: goto -16 -> 119
      //   138: astore_0
      //   139: goto -28 -> 111
      //   142: astore_0
      //   143: goto -60 -> 83
      //
      // Exception table:
      //   from	to	target	type
      //   61	65	71	java/io/IOException
      //   5	16	80	java/lang/Exception
      //   87	91	99	java/io/IOException
      //   5	16	108	finally
      //   115	119	134	java/io/IOException
      //   16	35	138	finally
      //   41	61	138	finally
      //   16	35	142	java/lang/Exception
      //   41	61	142	java/lang/Exception
    }

    // ERROR //
    public void a()
    {
      // Byte code:
      //   0: ldc 66
      //   2: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
      //   5: new 68	java/io/FileOutputStream
      //   8: astore_1
      //   9: aload_1
      //   10: aload_0
      //   11: getfield 18	com/tencent/smtt/sdk/TbsLogReport$a:b	Ljava/lang/String;
      //   14: invokespecial 71	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
      //   17: new 73	java/util/zip/ZipOutputStream
      //   20: astore_2
      //   21: new 75	java/io/BufferedOutputStream
      //   24: astore_3
      //   25: aload_3
      //   26: aload_1
      //   27: invokespecial 78	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
      //   30: aload_2
      //   31: aload_3
      //   32: invokespecial 79	java/util/zip/ZipOutputStream:<init>	(Ljava/io/OutputStream;)V
      //   35: sipush 2048
      //   38: newarray byte
      //   40: astore 4
      //   42: aload_0
      //   43: getfield 16	com/tencent/smtt/sdk/TbsLogReport$a:a	Ljava/lang/String;
      //   46: astore 5
      //   48: new 81	java/io/FileInputStream
      //   51: astore 6
      //   53: aload 6
      //   55: aload 5
      //   57: invokespecial 82	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
      //   60: new 84	java/io/BufferedInputStream
      //   63: astore_3
      //   64: aload_3
      //   65: aload 6
      //   67: sipush 2048
      //   70: invokespecial 87	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;I)V
      //   73: new 89	java/util/zip/ZipEntry
      //   76: astore 7
      //   78: aload 7
      //   80: aload 5
      //   82: aload 5
      //   84: ldc 91
      //   86: invokevirtual 97	java/lang/String:lastIndexOf	(Ljava/lang/String;)I
      //   89: iconst_1
      //   90: iadd
      //   91: invokevirtual 101	java/lang/String:substring	(I)Ljava/lang/String;
      //   94: invokespecial 102	java/util/zip/ZipEntry:<init>	(Ljava/lang/String;)V
      //   97: aload_2
      //   98: aload 7
      //   100: invokevirtual 106	java/util/zip/ZipOutputStream:putNextEntry	(Ljava/util/zip/ZipEntry;)V
      //   103: aload_3
      //   104: aload 4
      //   106: iconst_0
      //   107: sipush 2048
      //   110: invokevirtual 109	java/io/BufferedInputStream:read	([BII)I
      //   113: istore 8
      //   115: iload 8
      //   117: iconst_m1
      //   118: if_icmpeq +65 -> 183
      //   121: aload_2
      //   122: aload 4
      //   124: iconst_0
      //   125: iload 8
      //   127: invokevirtual 112	java/util/zip/ZipOutputStream:write	([BII)V
      //   130: goto -27 -> 103
      //   133: astore 5
      //   135: aload_3
      //   136: ifnull +7 -> 143
      //   139: aload_3
      //   140: invokevirtual 113	java/io/BufferedInputStream:close	()V
      //   143: aload 6
      //   145: ifnull +8 -> 153
      //   148: aload 6
      //   150: invokevirtual 114	java/io/FileInputStream:close	()V
      //   153: new 116	java/io/File
      //   156: astore_3
      //   157: aload_3
      //   158: aload_0
      //   159: getfield 18	com/tencent/smtt/sdk/TbsLogReport$a:b	Ljava/lang/String;
      //   162: invokespecial 117	java/io/File:<init>	(Ljava/lang/String;)V
      //   165: aload_3
      //   166: invokestatic 119	com/tencent/smtt/sdk/TbsLogReport$a:a	(Ljava/io/File;)V
      //   169: aload_2
      //   170: invokevirtual 120	java/util/zip/ZipOutputStream:close	()V
      //   173: aload_1
      //   174: invokevirtual 121	java/io/FileOutputStream:close	()V
      //   177: ldc 66
      //   179: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   182: return
      //   183: aload_2
      //   184: invokevirtual 124	java/util/zip/ZipOutputStream:flush	()V
      //   187: aload_2
      //   188: invokevirtual 127	java/util/zip/ZipOutputStream:closeEntry	()V
      //   191: aload_3
      //   192: invokevirtual 113	java/io/BufferedInputStream:close	()V
      //   195: aload 6
      //   197: invokevirtual 114	java/io/FileInputStream:close	()V
      //   200: goto -47 -> 153
      //   203: astore_3
      //   204: goto -51 -> 153
      //   207: astore_3
      //   208: aconst_null
      //   209: astore 6
      //   211: aconst_null
      //   212: astore 5
      //   214: aload 6
      //   216: ifnull +8 -> 224
      //   219: aload 6
      //   221: invokevirtual 113	java/io/BufferedInputStream:close	()V
      //   224: aload 5
      //   226: ifnull +8 -> 234
      //   229: aload 5
      //   231: invokevirtual 114	java/io/FileInputStream:close	()V
      //   234: ldc 66
      //   236: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   239: aload_3
      //   240: athrow
      //   241: astore_3
      //   242: aload_2
      //   243: astore_3
      //   244: aload_3
      //   245: ifnull +7 -> 252
      //   248: aload_3
      //   249: invokevirtual 120	java/util/zip/ZipOutputStream:close	()V
      //   252: aload_1
      //   253: ifnull +64 -> 317
      //   256: aload_1
      //   257: invokevirtual 121	java/io/FileOutputStream:close	()V
      //   260: ldc 66
      //   262: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   265: goto -83 -> 182
      //   268: astore_1
      //   269: ldc 66
      //   271: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   274: goto -92 -> 182
      //   277: astore_1
      //   278: ldc 66
      //   280: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   283: goto -101 -> 182
      //   286: astore_3
      //   287: aconst_null
      //   288: astore 6
      //   290: aconst_null
      //   291: astore_1
      //   292: aload 6
      //   294: ifnull +8 -> 302
      //   297: aload 6
      //   299: invokevirtual 120	java/util/zip/ZipOutputStream:close	()V
      //   302: aload_1
      //   303: ifnull +7 -> 310
      //   306: aload_1
      //   307: invokevirtual 121	java/io/FileOutputStream:close	()V
      //   310: ldc 66
      //   312: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   315: aload_3
      //   316: athrow
      //   317: ldc 66
      //   319: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   322: goto -140 -> 182
      //   325: astore_3
      //   326: goto -131 -> 195
      //   329: astore_3
      //   330: goto -187 -> 143
      //   333: astore_3
      //   334: goto -181 -> 153
      //   337: astore 6
      //   339: goto -115 -> 224
      //   342: astore 6
      //   344: goto -110 -> 234
      //   347: astore_3
      //   348: goto -175 -> 173
      //   351: astore_3
      //   352: goto -100 -> 252
      //   355: astore 6
      //   357: goto -55 -> 302
      //   360: astore_1
      //   361: goto -51 -> 310
      //   364: astore_3
      //   365: aconst_null
      //   366: astore 6
      //   368: goto -76 -> 292
      //   371: astore_3
      //   372: aload_2
      //   373: astore 6
      //   375: goto -83 -> 292
      //   378: astore_1
      //   379: aconst_null
      //   380: astore_3
      //   381: aconst_null
      //   382: astore_1
      //   383: goto -139 -> 244
      //   386: astore_3
      //   387: aconst_null
      //   388: astore_3
      //   389: goto -145 -> 244
      //   392: astore_3
      //   393: aconst_null
      //   394: astore 7
      //   396: aload 6
      //   398: astore 5
      //   400: aload 7
      //   402: astore 6
      //   404: goto -190 -> 214
      //   407: astore 4
      //   409: aload_3
      //   410: astore 7
      //   412: aload 6
      //   414: astore 5
      //   416: aload 4
      //   418: astore_3
      //   419: aload 7
      //   421: astore 6
      //   423: goto -209 -> 214
      //   426: astore_3
      //   427: aconst_null
      //   428: astore_3
      //   429: aconst_null
      //   430: astore 6
      //   432: goto -297 -> 135
      //   435: astore_3
      //   436: aconst_null
      //   437: astore_3
      //   438: goto -303 -> 135
      //
      // Exception table:
      //   from	to	target	type
      //   73	103	133	java/lang/Exception
      //   103	115	133	java/lang/Exception
      //   121	130	133	java/lang/Exception
      //   183	191	133	java/lang/Exception
      //   195	200	203	java/io/IOException
      //   48	60	207	finally
      //   35	48	241	java/lang/Exception
      //   139	143	241	java/lang/Exception
      //   148	153	241	java/lang/Exception
      //   153	169	241	java/lang/Exception
      //   191	195	241	java/lang/Exception
      //   195	200	241	java/lang/Exception
      //   219	224	241	java/lang/Exception
      //   229	234	241	java/lang/Exception
      //   234	241	241	java/lang/Exception
      //   173	177	268	java/io/IOException
      //   256	260	277	java/io/IOException
      //   5	17	286	finally
      //   191	195	325	java/io/IOException
      //   139	143	329	java/io/IOException
      //   148	153	333	java/io/IOException
      //   219	224	337	java/io/IOException
      //   229	234	342	java/io/IOException
      //   169	173	347	java/io/IOException
      //   248	252	351	java/io/IOException
      //   297	302	355	java/io/IOException
      //   306	310	360	java/io/IOException
      //   17	35	364	finally
      //   35	48	371	finally
      //   139	143	371	finally
      //   148	153	371	finally
      //   153	169	371	finally
      //   191	195	371	finally
      //   195	200	371	finally
      //   219	224	371	finally
      //   229	234	371	finally
      //   234	241	371	finally
      //   5	17	378	java/lang/Exception
      //   17	35	386	java/lang/Exception
      //   60	73	392	finally
      //   73	103	407	finally
      //   103	115	407	finally
      //   121	130	407	finally
      //   183	191	407	finally
      //   48	60	426	java/lang/Exception
      //   60	73	435	java/lang/Exception
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.TbsLogReport
 * JD-Core Version:    0.6.2
 */
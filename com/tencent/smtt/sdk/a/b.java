package com.tencent.smtt.sdk.a;

import MTT.ThirdAppInfoNew;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.sdk.QbSdk;
import com.tencent.smtt.sdk.TbsCoreLoadStat;
import com.tencent.smtt.sdk.TbsDownloadConfig;
import com.tencent.smtt.sdk.TbsDownloadUpload;
import com.tencent.smtt.sdk.TbsDownloader;
import com.tencent.smtt.sdk.TbsPVConfig;
import com.tencent.smtt.sdk.TbsShareManager;
import com.tencent.smtt.utils.TbsLog;
import com.tencent.smtt.utils.p;
import com.tencent.smtt.utils.s;
import com.tencent.smtt.utils.v;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONObject;

public class b
{
  public static byte[] a = null;

  static
  {
    AppMethodBeat.i(65150);
    try
    {
      a = "65dRa93L".getBytes("utf-8");
      AppMethodBeat.o(65150);
      return;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      while (true)
        AppMethodBeat.o(65150);
    }
  }

  private static String a(Context paramContext)
  {
    Object localObject1 = null;
    int i = 0;
    AppMethodBeat.i(65143);
    try
    {
      Object localObject2 = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 64).signatures[0].toByteArray();
      if (localObject2 != null)
      {
        paramContext = MessageDigest.getInstance("SHA-1");
        paramContext.update((byte[])localObject2);
        paramContext = paramContext.digest();
        if (paramContext != null)
        {
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("");
          if (paramContext != null)
          {
            int j = paramContext.length;
            if (j > 0);
          }
          else
          {
            AppMethodBeat.o(65143);
            paramContext = localObject1;
          }
          while (true)
          {
            return paramContext;
            while (i < paramContext.length)
            {
              localObject2 = Integer.toHexString(paramContext[i] & 0xFF).toUpperCase();
              if (i > 0)
                localStringBuilder.append(":");
              if (((String)localObject2).length() < 2)
                localStringBuilder.append(0);
              localStringBuilder.append((String)localObject2);
              i++;
            }
            paramContext = localStringBuilder.toString();
            AppMethodBeat.o(65143);
          }
        }
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        AppMethodBeat.o(65143);
        paramContext = localObject1;
      }
    }
  }

  public static void a(ThirdAppInfoNew paramThirdAppInfoNew, Context paramContext)
  {
    AppMethodBeat.i(65140);
    new c("HttpUtils", paramThirdAppInfoNew, paramContext).start();
    AppMethodBeat.o(65140);
  }

  private static void a(Context paramContext, String paramString1, String paramString2)
  {
    AppMethodBeat.i(65146);
    if (("reset".equals(paramString1)) && ("true".equals(paramString2)))
    {
      QbSdk.reset(paramContext);
      AppMethodBeat.o(65146);
    }
    while (true)
    {
      return;
      TbsPVConfig.getInstance(paramContext).putData(paramString1, paramString2);
      AppMethodBeat.o(65146);
    }
  }

  public static void a(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt, boolean paramBoolean, long paramLong)
  {
    AppMethodBeat.i(65142);
    if ((QbSdk.getSettings() != null) && (QbSdk.getSettings().containsKey(QbSdk.KEY_SET_SENDREQUEST_AND_UPLOAD)) && (QbSdk.getSettings().get(QbSdk.KEY_SET_SENDREQUEST_AND_UPLOAD).equals("false")))
    {
      TbsLog.i("sdkreport", "[HttpUtils.doReport] -- SET_SENDREQUEST_AND_UPLOAD is false");
      AppMethodBeat.o(65142);
      return;
    }
    Object localObject1 = "";
    Object localObject2 = localObject1;
    while (true)
    {
      try
      {
        ApplicationInfo localApplicationInfo = paramContext.getApplicationInfo();
        localObject3 = localObject1;
        localObject2 = localObject1;
        if ("com.tencent.mobileqq".equals(localApplicationInfo.packageName))
        {
          localObject2 = localObject1;
          localObject1 = paramContext.getPackageManager().getPackageInfo(localApplicationInfo.packageName, 0).versionName;
          localObject3 = localObject1;
          localObject2 = localObject1;
          if (!TextUtils.isEmpty(QbSdk.getQQBuildNumber()))
          {
            localObject2 = localObject1;
            localObject3 = new java/lang/StringBuilder;
            localObject2 = localObject1;
            ((StringBuilder)localObject3).<init>();
            localObject2 = localObject1;
            localObject3 = (String)localObject1 + "." + QbSdk.getQQBuildNumber();
          }
        }
        localObject2 = localObject3;
      }
      catch (Exception localException)
      {
        try
        {
          Object localObject3 = new MTT/ThirdAppInfoNew;
          ((ThirdAppInfoNew)localObject3).<init>();
          ((ThirdAppInfoNew)localObject3).sAppName = paramContext.getApplicationContext().getApplicationInfo().packageName;
          v.a(paramContext);
          localObject1 = new java/text/SimpleDateFormat;
          ((SimpleDateFormat)localObject1).<init>("yyyy-MM-dd hh:mm:ss");
          ((SimpleDateFormat)localObject1).setTimeZone(TimeZone.getTimeZone("GMT+08"));
          ((ThirdAppInfoNew)localObject3).sTime = ((SimpleDateFormat)localObject1).format(Calendar.getInstance().getTime());
          ((ThirdAppInfoNew)localObject3).sVersionCode = com.tencent.smtt.utils.b.b(paramContext);
          localObject1 = com.tencent.smtt.utils.b.a(paramContext, "com.tencent.mm.BuildInfo.CLIENT_VERSION");
          if (!TextUtils.isEmpty((CharSequence)localObject1))
            ((ThirdAppInfoNew)localObject3).sMetaData = ((String)localObject1);
          ((ThirdAppInfoNew)localObject3).sGuid = paramString1;
          if (paramBoolean)
          {
            ((ThirdAppInfoNew)localObject3).sQua2 = paramString2;
            ((ThirdAppInfoNew)localObject3).sLc = paramString3;
            paramString3 = com.tencent.smtt.utils.b.e(paramContext);
            localObject1 = com.tencent.smtt.utils.b.c(paramContext);
            paramString2 = com.tencent.smtt.utils.b.d(paramContext);
            paramString1 = com.tencent.smtt.utils.b.f(paramContext);
            if ((localObject1 != null) && (!"".equals(localObject1)))
              ((ThirdAppInfoNew)localObject3).sImei = ((String)localObject1);
            if ((paramString2 != null) && (!"".equals(paramString2)))
              ((ThirdAppInfoNew)localObject3).sImsi = paramString2;
            if (!TextUtils.isEmpty(paramString1))
              ((ThirdAppInfoNew)localObject3).sAndroidID = paramString1;
            if ((paramString3 != null) && (!"".equals(paramString3)))
              ((ThirdAppInfoNew)localObject3).sMac = paramString3;
            ((ThirdAppInfoNew)localObject3).iPv = paramInt;
            if (!TbsShareManager.isThirdPartyApp(paramContext))
              break label534;
            if (!paramBoolean)
              break label525;
            if (!TbsShareManager.getCoreFormOwn())
              break label516;
            paramInt = 2;
            paramString1 = (String)localObject3;
            paramString1.iCoreType = paramInt;
            ((ThirdAppInfoNew)localObject3).sAppVersionName = localObject2;
            ((ThirdAppInfoNew)localObject3).sAppSignature = a(paramContext);
            if (!paramBoolean)
            {
              ((ThirdAppInfoNew)localObject3).sWifiConnectedTime = paramLong;
              ((ThirdAppInfoNew)localObject3).localCoreVersion = QbSdk.getTbsVersion(paramContext);
            }
            a((ThirdAppInfoNew)localObject3, paramContext.getApplicationContext());
            AppMethodBeat.o(65142);
            break;
            localException = localException;
            continue;
          }
          localException.sQua2 = s.a(paramContext);
          continue;
        }
        catch (Throwable paramContext)
        {
          AppMethodBeat.o(65142);
        }
      }
      break;
      label516: paramInt = 1;
      paramString1 = localException;
    }
    while (true)
    {
      label525: paramInt = 0;
      paramString1 = localException;
      break;
      label534: if (paramBoolean)
      {
        paramInt = 1;
        paramString1 = localException;
        break;
      }
    }
  }

  // ERROR //
  private static String b(java.net.HttpURLConnection paramHttpURLConnection, String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: ldc_w 357
    //   3: invokestatic 17	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: ldc 84
    //   8: astore_3
    //   9: aload_0
    //   10: invokevirtual 363	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   13: astore 4
    //   15: aload_0
    //   16: invokevirtual 366	java/net/HttpURLConnection:getContentEncoding	()Ljava/lang/String;
    //   19: astore_0
    //   20: aload_0
    //   21: ifnull +138 -> 159
    //   24: aload_0
    //   25: ldc_w 368
    //   28: invokevirtual 372	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   31: ifeq +128 -> 159
    //   34: new 374	java/util/zip/GZIPInputStream
    //   37: astore_0
    //   38: aload_0
    //   39: aload 4
    //   41: invokespecial 377	java/util/zip/GZIPInputStream:<init>	(Ljava/io/InputStream;)V
    //   44: new 379	java/io/ByteArrayOutputStream
    //   47: astore 4
    //   49: aload 4
    //   51: invokespecial 380	java/io/ByteArrayOutputStream:<init>	()V
    //   54: sipush 128
    //   57: newarray byte
    //   59: astore 5
    //   61: aload_0
    //   62: aload 5
    //   64: invokevirtual 386	java/io/InputStream:read	([B)I
    //   67: istore 6
    //   69: iload 6
    //   71: iconst_m1
    //   72: if_icmpeq +138 -> 210
    //   75: aload 4
    //   77: aload 5
    //   79: iconst_0
    //   80: iload 6
    //   82: invokevirtual 390	java/io/ByteArrayOutputStream:write	([BII)V
    //   85: goto -24 -> 61
    //   88: astore_1
    //   89: aload 4
    //   91: astore_1
    //   92: aload_1
    //   93: ifnull +7 -> 100
    //   96: aload_1
    //   97: invokevirtual 393	java/io/ByteArrayOutputStream:close	()V
    //   100: aload_3
    //   101: astore 4
    //   103: aload_0
    //   104: ifnull +13 -> 117
    //   107: aload_3
    //   108: astore 4
    //   110: aload_0
    //   111: invokevirtual 394	java/io/InputStream:close	()V
    //   114: aload_3
    //   115: astore 4
    //   117: ldc 124
    //   119: new 82	java/lang/StringBuilder
    //   122: dup
    //   123: ldc_w 396
    //   126: invokespecial 88	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   129: aload 4
    //   131: invokevirtual 103	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   134: ldc_w 398
    //   137: invokevirtual 103	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   140: iload_2
    //   141: invokevirtual 401	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   144: invokevirtual 113	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   147: invokestatic 190	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   150: ldc_w 357
    //   153: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   156: aload 4
    //   158: areturn
    //   159: aload_0
    //   160: ifnull +44 -> 204
    //   163: aload_0
    //   164: ldc_w 403
    //   167: invokevirtual 372	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   170: ifeq +34 -> 204
    //   173: new 405	java/util/zip/Inflater
    //   176: astore_0
    //   177: aload_0
    //   178: iconst_1
    //   179: invokespecial 408	java/util/zip/Inflater:<init>	(Z)V
    //   182: new 410	java/util/zip/InflaterInputStream
    //   185: dup
    //   186: aload 4
    //   188: aload_0
    //   189: invokespecial 413	java/util/zip/InflaterInputStream:<init>	(Ljava/io/InputStream;Ljava/util/zip/Inflater;)V
    //   192: astore_0
    //   193: goto -149 -> 44
    //   196: astore_0
    //   197: aconst_null
    //   198: astore_1
    //   199: aconst_null
    //   200: astore_0
    //   201: goto -109 -> 92
    //   204: aload 4
    //   206: astore_0
    //   207: goto -163 -> 44
    //   210: iload_2
    //   211: ifeq +56 -> 267
    //   214: new 25	java/lang/String
    //   217: dup
    //   218: invokestatic 418	com/tencent/smtt/utils/o:a	()Lcom/tencent/smtt/utils/o;
    //   221: aload 4
    //   223: invokevirtual 419	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   226: invokevirtual 422	com/tencent/smtt/utils/o:c	([B)[B
    //   229: invokespecial 424	java/lang/String:<init>	([B)V
    //   232: astore_1
    //   233: aload 4
    //   235: ifnull +8 -> 243
    //   238: aload 4
    //   240: invokevirtual 393	java/io/ByteArrayOutputStream:close	()V
    //   243: aload_1
    //   244: astore 4
    //   246: aload_0
    //   247: ifnull -130 -> 117
    //   250: aload_1
    //   251: astore 4
    //   253: aload_0
    //   254: invokevirtual 394	java/io/InputStream:close	()V
    //   257: aload_1
    //   258: astore 4
    //   260: goto -143 -> 117
    //   263: astore_0
    //   264: goto -147 -> 117
    //   267: new 25	java/lang/String
    //   270: dup
    //   271: aload 4
    //   273: invokevirtual 419	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   276: aload_1
    //   277: invokestatic 427	com/tencent/smtt/utils/o:b	([BLjava/lang/String;)[B
    //   280: invokespecial 424	java/lang/String:<init>	([B)V
    //   283: astore_1
    //   284: goto -51 -> 233
    //   287: astore_1
    //   288: aconst_null
    //   289: astore 4
    //   291: aconst_null
    //   292: astore_0
    //   293: aload 4
    //   295: ifnull +8 -> 303
    //   298: aload 4
    //   300: invokevirtual 393	java/io/ByteArrayOutputStream:close	()V
    //   303: aload_0
    //   304: ifnull +7 -> 311
    //   307: aload_0
    //   308: invokevirtual 394	java/io/InputStream:close	()V
    //   311: ldc_w 357
    //   314: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   317: aload_1
    //   318: athrow
    //   319: astore_1
    //   320: goto -220 -> 100
    //   323: astore 4
    //   325: goto -22 -> 303
    //   328: astore_0
    //   329: goto -18 -> 311
    //   332: astore 4
    //   334: goto -91 -> 243
    //   337: astore_1
    //   338: aconst_null
    //   339: astore 4
    //   341: goto -48 -> 293
    //   344: astore_1
    //   345: goto -52 -> 293
    //   348: astore_1
    //   349: aconst_null
    //   350: astore_1
    //   351: goto -259 -> 92
    //
    // Exception table:
    //   from	to	target	type
    //   54	61	88	java/lang/Exception
    //   61	69	88	java/lang/Exception
    //   75	85	88	java/lang/Exception
    //   214	233	88	java/lang/Exception
    //   267	284	88	java/lang/Exception
    //   9	20	196	java/lang/Exception
    //   24	44	196	java/lang/Exception
    //   163	193	196	java/lang/Exception
    //   110	114	263	java/io/IOException
    //   253	257	263	java/io/IOException
    //   9	20	287	finally
    //   24	44	287	finally
    //   163	193	287	finally
    //   96	100	319	java/io/IOException
    //   298	303	323	java/io/IOException
    //   307	311	328	java/io/IOException
    //   238	243	332	java/io/IOException
    //   44	54	337	finally
    //   54	61	344	finally
    //   61	69	344	finally
    //   75	85	344	finally
    //   214	233	344	finally
    //   267	284	344	finally
    //   44	54	348	java/lang/Exception
  }

  private static void b(Context paramContext, String paramString)
  {
    int i = 0;
    AppMethodBeat.i(65145);
    try
    {
      TbsPVConfig.releaseInstance();
      TbsPVConfig.getInstance(paramContext).clear();
      boolean bool = TextUtils.isEmpty(paramString);
      if (bool)
      {
        AppMethodBeat.o(65145);
        return;
      }
      paramString = paramString.split("\\|");
      int j = paramString.length;
      if (i < j)
        arrayOfString = paramString[i];
    }
    catch (Exception paramContext)
    {
      try
      {
        while (true)
        {
          String[] arrayOfString = arrayOfString.split("=");
          if (arrayOfString.length == 2)
            a(paramContext, arrayOfString[0], arrayOfString[1]);
          label86: i++;
          continue;
          TbsPVConfig.getInstance(paramContext).commit();
          AppMethodBeat.o(65145);
        }
        paramContext = paramContext;
        AppMethodBeat.o(65145);
      }
      catch (Exception localException)
      {
        break label86;
      }
    }
  }

  private static JSONObject c(ThirdAppInfoNew paramThirdAppInfoNew, Context paramContext)
  {
    AppMethodBeat.i(65141);
    try
    {
      localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      localJSONObject.put("APPNAME", paramThirdAppInfoNew.sAppName);
      localJSONObject.put("TIME", paramThirdAppInfoNew.sTime);
      localJSONObject.put("QUA2", paramThirdAppInfoNew.sQua2);
      localJSONObject.put("LC", paramThirdAppInfoNew.sLc);
      localJSONObject.put("GUID", paramThirdAppInfoNew.sGuid);
      localJSONObject.put("IMEI", paramThirdAppInfoNew.sImei);
      localJSONObject.put("IMSI", paramThirdAppInfoNew.sImsi);
      localJSONObject.put("MAC", paramThirdAppInfoNew.sMac);
      localJSONObject.put("PV", paramThirdAppInfoNew.iPv);
      localJSONObject.put("CORETYPE", paramThirdAppInfoNew.iCoreType);
      localJSONObject.put("APPVN", paramThirdAppInfoNew.sAppVersionName);
      localJSONObject.put("APPMETADATA", paramThirdAppInfoNew.sMetaData);
      localJSONObject.put("VERSION_CODE", paramThirdAppInfoNew.sVersionCode);
      localJSONObject.put("CPU", paramThirdAppInfoNew.sCpu);
      if (("com.tencent.mm".equals(paramThirdAppInfoNew.sAppName)) || ("com.tencent.mobileqq".equals(paramThirdAppInfoNew.sAppName)) || ("com.tencent.tbs".equals(paramThirdAppInfoNew.sAppName)))
      {
        Object localObject = new com/tencent/smtt/sdk/TbsDownloadUpload;
        ((TbsDownloadUpload)localObject).<init>(paramContext);
        ((TbsDownloadUpload)localObject).readTbsDownloadInfo(paramContext);
        int i = ((TbsDownloadUpload)localObject).getNeedDownloadCode();
        j = ((TbsDownloadUpload)localObject).getStartDownloadCode();
        int k = ((TbsDownloadUpload)localObject).getNeedDownloadReturn();
        int m = ((TbsDownloadUpload)localObject).getLocalCoreVersion();
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        localJSONObject.put("SIGNATURE", i + ":" + j + ":" + k + ":" + m);
        localJSONObject.put("PROTOCOL_VERSION", 3);
        localJSONObject.put("ANDROID_ID", paramThirdAppInfoNew.sAndroidID);
        if (!TbsShareManager.isThirdPartyApp(paramContext))
          break label543;
        localJSONObject.put("HOST_COREVERSION", TbsShareManager.getHostCoreVersions(paramContext));
        label353: if (paramThirdAppInfoNew.iCoreType == 0)
        {
          localJSONObject.put("WIFICONNECTEDTIME", paramThirdAppInfoNew.sWifiConnectedTime);
          localJSONObject.put("CORE_EXIST", paramThirdAppInfoNew.localCoreVersion);
          j = TbsCoreLoadStat.mLoadErrorCode;
          if (paramThirdAppInfoNew.localCoreVersion > 0)
            break label570;
          localJSONObject.put("TBS_ERROR_CODE", TbsDownloadConfig.getInstance(paramContext).getDownloadInterruptCode());
          if (j == -1)
            TbsLog.e("sdkreport", "ATTENTION: Load errorCode missed!");
        }
        label411: TbsDownloadConfig.getInstance(paramContext).uploadDownloadInterruptCodeIfNeeded(paramContext);
      }
    }
    catch (Exception paramThirdAppInfoNew)
    {
      try
      {
        JSONObject localJSONObject;
        int j;
        if (QbSdk.getTID() != null)
        {
          if (!paramThirdAppInfoNew.sAppName.equals("com.tencent.mobileqq"))
            break label583;
          localJSONObject.put("TID", p.a().a(QbSdk.getTID()));
          localJSONObject.put("TIDTYPE", 1);
        }
        while (true)
        {
          label477: AppMethodBeat.o(65141);
          paramThirdAppInfoNew = localJSONObject;
          while (true)
          {
            return paramThirdAppInfoNew;
            if (paramThirdAppInfoNew.sAppSignature != null)
              break label528;
            localJSONObject.put("SIGNATURE", "0");
            break;
            paramThirdAppInfoNew = paramThirdAppInfoNew;
            TbsLog.e("sdkreport", "getPostData exception!");
            paramThirdAppInfoNew = null;
            AppMethodBeat.o(65141);
          }
          label528: localJSONObject.put("SIGNATURE", paramThirdAppInfoNew.sAppSignature);
          break;
          label543: localJSONObject.put("HOST_COREVERSION", TbsDownloader.getCoreShareDecoupleCoreVersionByContext(paramContext));
          localJSONObject.put("DECOUPLE_COREVERSION", TbsDownloader.getCoreShareDecoupleCoreVersionByContext(paramContext));
          break label353;
          label570: localJSONObject.put("TBS_ERROR_CODE", j);
          break label411;
          label583: if (paramThirdAppInfoNew.sAppName.equals("com.tencent.mm"))
          {
            localJSONObject.put("TID", QbSdk.getTID());
            localJSONObject.put("TIDTYPE", 0);
          }
        }
      }
      catch (Exception paramThirdAppInfoNew)
      {
        break label477;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.a.b
 * JD-Core Version:    0.6.2
 */
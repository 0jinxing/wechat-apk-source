package com.tencent.tencentmap.mapsdk.a;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.StatFs;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.maps.a.aa;
import com.tencent.tencentmap.mapsdk.maps.a.ac;
import com.tencent.tencentmap.mapsdk.maps.a.ag;
import com.tencent.tencentmap.mapsdk.maps.a.an;
import com.tencent.tencentmap.mapsdk.maps.a.aq;
import com.tencent.tencentmap.mapsdk.maps.a.as;
import com.tencent.tencentmap.mapsdk.maps.a.av;
import com.tencent.tencentmap.mapsdk.maps.a.ax;
import com.tencent.tencentmap.mapsdk.maps.a.p;
import com.tencent.tencentmap.mapsdk.maps.a.r;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.Reader;
import java.security.Key;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.KeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.http.util.EncodingUtils;

public final class e
{
  private static e a;

  public static int a(Context paramContext, Long[] paramArrayOfLong)
  {
    AppMethodBeat.i(97799);
    ag.a(" RecordDAO.deleteRecordList() start", new Object[0]);
    int i;
    if (paramContext == null)
    {
      ag.d(" deleteRecordList() have null args!", new Object[0]);
      i = -1;
      AppMethodBeat.o(97799);
    }
    while (true)
    {
      return i;
      ag.a(" RecordDAO.deleteRecordList() end", new Object[0]);
      i = p.a(paramContext, paramArrayOfLong);
      AppMethodBeat.o(97799);
    }
  }

  public static e a(Context paramContext)
  {
    try
    {
      AppMethodBeat.i(97776);
      if ((a == null) && (paramContext != null))
      {
        paramContext = new com/tencent/tencentmap/mapsdk/a/e;
        paramContext.<init>();
        a = paramContext;
      }
      paramContext = a;
      AppMethodBeat.o(97776);
      return paramContext;
    }
    finally
    {
    }
    throw paramContext;
  }

  public static aa a(int paramInt1, c paramc, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    Object localObject1 = null;
    AppMethodBeat.i(97814);
    ag.b("en2Req", new Object[0]);
    if (paramc == null)
    {
      ag.d("error no com info! ", new Object[0]);
      AppMethodBeat.o(97814);
      paramc = localObject1;
      return paramc;
    }
    while (true)
    {
      try
      {
        while (true)
        {
          aa localaa = new com/tencent/tencentmap/mapsdk/maps/a/aa;
          localaa.<init>();
          try
          {
            localaa.j = paramc.a();
            localaa.k = paramc.b();
            localaa.a = paramc.c();
            localaa.b = paramc.j();
            localaa.c = paramc.d();
            localaa.d = paramc.e();
            localaa.e = paramc.f();
            localaa.l = "";
            HashMap localHashMap;
            if (paramInt1 == 100)
            {
              localHashMap = new java/util/HashMap;
              localHashMap.<init>();
              localObject2 = new java/lang/StringBuilder;
              ((StringBuilder)localObject2).<init>();
              localHashMap.put("A1", an.a());
              localObject2 = new java/lang/StringBuilder;
              ((StringBuilder)localObject2).<init>();
              localHashMap.put("A2", paramc.i());
              localObject2 = aq.a(paramc.l());
              StringBuilder localStringBuilder = new java/lang/StringBuilder;
              localStringBuilder.<init>();
              localHashMap.put("A4", ((aq)localObject2).c());
              localStringBuilder = new java/lang/StringBuilder;
              localStringBuilder.<init>();
              localHashMap.put("A6", ((aq)localObject2).b());
              localStringBuilder = new java/lang/StringBuilder;
              localStringBuilder.<init>();
              localHashMap.put("A7", ((aq)localObject2).d());
              localStringBuilder = new java/lang/StringBuilder;
              localStringBuilder.<init>();
              localHashMap.put("A3", ((aq)localObject2).e());
              localStringBuilder = new java/lang/StringBuilder;
              localStringBuilder.<init>();
              localHashMap.put("A23", paramc.k());
              localStringBuilder = new java/lang/StringBuilder;
              localStringBuilder.<init>();
              localHashMap.put("A31", ((aq)localObject2).f());
              a(paramc.l());
              localHashMap.put("A33", g(paramc.l()));
              if (!a.g(paramc.l()))
                break label636;
              localHashMap.put("A66", "F");
            }
            while (true)
            {
              localObject2 = new java/lang/StringBuilder;
              ((StringBuilder)localObject2).<init>();
              localHashMap.put("A67", a.i(paramc.l()));
              localObject2 = new java/lang/StringBuilder;
              ((StringBuilder)localObject2).<init>();
              localHashMap.put("A68", a.h(paramc.l()));
              if (!a.b)
                break label677;
              localObject2 = "Y";
              localHashMap.put("A85", localObject2);
              localaa.l = a(localHashMap);
              if ((paramInt1 == 4) || (paramInt1 == 2) || (paramInt1 == 1))
                localaa.l = a(an.c());
              localaa.f = paramInt1;
              localaa.h = ((byte)(byte)paramInt3);
              localaa.i = ((byte)(byte)paramInt2);
              paramc = paramArrayOfByte;
              if (paramArrayOfByte == null)
                paramc = "".getBytes();
              localaa.g = paramc;
              AppMethodBeat.o(97814);
              paramc = localaa;
              break;
              label636: localHashMap.put("A66", "B");
            }
          }
          finally
          {
            AppMethodBeat.o(97814);
          }
        }
      }
      catch (Throwable paramc)
      {
        ag.a(paramc);
        AppMethodBeat.o(97814);
        paramc = localObject1;
      }
      break;
      label677: Object localObject2 = "N";
    }
  }

  public static ac a(av paramav)
  {
    AppMethodBeat.i(97794);
    if ((paramav == null) || (!"UA".equals(paramav.b())))
    {
      AppMethodBeat.o(97794);
      paramav = null;
    }
    while (true)
    {
      return paramav;
      Map localMap = paramav.e();
      if (localMap == null)
      {
        AppMethodBeat.o(97794);
        paramav = null;
      }
      else
      {
        try
        {
          ac localac = new com/tencent/tencentmap/mapsdk/maps/a/ac;
          localac.<init>();
          localac.a = ((String)localMap.get("A19"));
          localac.c = paramav.d();
          localac.h = paramav.c();
          localac.b = ((String)localMap.get("A28"));
          localac.f = Long.parseLong((String)localMap.get("A26"));
          localac.d = Boolean.parseBoolean((String)localMap.get("A25"));
          localac.e = Long.parseLong((String)localMap.get("A27"));
          localMap.remove("A19");
          localMap.remove("A28");
          localMap.remove("A26");
          localMap.remove("A25");
          localMap.remove("A27");
          localac.g = a(localMap);
          AppMethodBeat.o(97794);
          paramav = localac;
        }
        catch (Throwable paramav)
        {
          ag.a(paramav);
          ag.d(paramav.getMessage(), new Object[0]);
          AppMethodBeat.o(97794);
          paramav = null;
        }
      }
    }
  }

  public static av a(Context paramContext, String paramString, boolean paramBoolean1, long paramLong1, long paramLong2, Map<String, String> paramMap, boolean paramBoolean2)
  {
    AppMethodBeat.i(97795);
    if (paramString == null)
    {
      paramContext = null;
      AppMethodBeat.o(97795);
    }
    while (true)
    {
      return paramContext;
      c localc = c.m();
      if (localc == null)
      {
        ag.d("  CommonInfo or DeviceInfo have not been Created return null!", new Object[0]);
        paramContext = null;
        AppMethodBeat.o(97795);
      }
      else
      {
        an.a();
        long l1 = localc.h();
        long l2 = new Date().getTime();
        String str = localc.g();
        Object localObject1 = n(paramContext);
        Object localObject2 = localObject1;
        if (localObject1 == null)
          localObject2 = "null";
        localObject1 = new HashMap();
        if (paramMap != null)
          ((Map)localObject1).putAll(paramMap);
        int i = 0;
        int j = i;
        if (ax.d().g().h())
        {
          j = i;
          if (!paramString.startsWith("rqd_"))
            j = 1;
        }
        aq localaq = aq.a(paramContext);
        if (j == 0)
        {
          paramMap = an.b();
          if ((paramMap != null) && (!paramMap.equals("")))
            ((Map)localObject1).put("QQ", paramMap);
          ((Map)localObject1).put("A2", localc.i());
          ((Map)localObject1).put("A4", localaq.c());
          ((Map)localObject1).put("A6", localaq.b());
          ((Map)localObject1).put("A7", localaq.d());
          ((Map)localObject1).put("A23", localc.k());
          ((Map)localObject1).put("A31", localaq.f());
          ((Map)localObject1).put("A67", a.i(paramContext));
          ((Map)localObject1).put("A76", a.a());
          ((Map)localObject1).put("A95", a.e(paramContext));
        }
        ((Map)localObject1).put("A19", localObject2);
        ((Map)localObject1).put("A28", str);
        ((Map)localObject1).put("A25", String.valueOf(paramBoolean1));
        ((Map)localObject1).put("A26", String.valueOf(paramLong1));
        ((Map)localObject1).put("A27", String.valueOf(paramLong2));
        paramContext = new av();
        paramContext.b(paramString);
        paramContext.b(l2 + l1);
        paramContext.a("UA");
        paramContext.a((Map)localObject1);
        paramContext.a(paramBoolean2);
        AppMethodBeat.o(97795);
      }
    }
  }

  public static String a()
  {
    AppMethodBeat.i(97777);
    try
    {
      String str1 = Build.MODEL;
      AppMethodBeat.o(97777);
      return str1;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        ag.d("getDeviceName error", new Object[0]);
        ag.a(localThrowable);
        String str2 = "";
        AppMethodBeat.o(97777);
      }
    }
  }

  private static String a(Map<String, String> paramMap)
  {
    AppMethodBeat.i(97805);
    ag.b("map 2 str", new Object[0]);
    if (paramMap == null)
    {
      paramMap = "";
      AppMethodBeat.o(97805);
    }
    while (true)
    {
      return paramMap;
      Object localObject = paramMap.keySet();
      if (localObject == null)
      {
        paramMap = "";
        AppMethodBeat.o(97805);
      }
      else
      {
        if (((Set)localObject).size() > 50)
          ag.c("The Map<String, String> params size is more than 50, effective size is <= 50!", new Object[0]);
        StringBuffer localStringBuffer = new StringBuffer();
        Iterator localIterator = ((Set)localObject).iterator();
        while (localIterator.hasNext())
        {
          String str1 = (String)localIterator.next();
          int i = str1.trim().length();
          String str2;
          if ((i > 0) && (c(str1)))
          {
            str2 = str1.trim();
            localObject = str2;
            if (i > 64)
              localObject = str2.substring(0, 64);
            localStringBuffer.append("&");
            localStringBuffer.append(((String)localObject).replace("|", "%7C").replace("&", "%26").replace("=", "%3D"));
            localStringBuffer.append("=");
            localObject = (String)paramMap.get(str1);
            if (localObject != null)
            {
              str2 = ((String)localObject).trim();
              if (str2.contains(";"))
              {
                localObject = str2;
                if (str2.length() > 10240)
                {
                  localObject = str2.substring(0, 10240);
                  localObject = ((String)localObject).substring(0, ((String)localObject).lastIndexOf(";"));
                }
              }
            }
          }
          else
          {
            while (true)
            {
              localStringBuffer.append(((String)localObject).replace('\n', ' ').replace('\r', ' ').replace("|", "%7C").replace("&", "%26").replace("=", "%3D"));
              break;
              ag.c("The Map<String, String> params key is invalid!! key should be ASCII code in 32-126! key:".concat(String.valueOf(str1)), new Object[0]);
              break;
              localObject = str2;
              if (str2.length() > 1024)
                localObject = str2.substring(0, 1024);
            }
          }
        }
        paramMap = localStringBuffer.substring(1);
        localStringBuffer.setLength(0);
        AppMethodBeat.o(97805);
      }
    }
  }

  public static HashSet<String> a(ArrayList<String> paramArrayList)
  {
    AppMethodBeat.i(97823);
    int i = paramArrayList.size();
    if ((paramArrayList != null) && (i > 0))
    {
      HashSet localHashSet = new HashSet(i);
      paramArrayList = paramArrayList.iterator();
      while (paramArrayList.hasNext())
        localHashSet.add((String)paramArrayList.next());
      AppMethodBeat.o(97823);
      paramArrayList = localHashSet;
    }
    while (true)
    {
      return paramArrayList;
      paramArrayList = null;
      AppMethodBeat.o(97823);
    }
  }

  public static List<av> a(Context paramContext, int paramInt)
  {
    ArrayList localArrayList = null;
    AppMethodBeat.i(97798);
    ag.a(" RecordDAO.queryRecentRecord() start", new Object[0]);
    if (paramContext == null)
    {
      ag.d(" queryRecentRecord() have null args!", new Object[0]);
      AppMethodBeat.o(97798);
      paramContext = localArrayList;
    }
    while (true)
    {
      return paramContext;
      List localList = p.a(paramContext, new int[] { 1 }, paramInt);
      if ((localList == null) || (localList.size() <= 0))
      {
        AppMethodBeat.o(97798);
        paramContext = localArrayList;
      }
      else
      {
        localArrayList = new ArrayList();
        Object localObject1 = localList.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          p localp = (p)((Iterator)localObject1).next();
          try
          {
            Object localObject2 = b(localp.b);
            if ((localObject2 != null) && (av.class.isInstance(localObject2)))
            {
              localObject2 = (av)av.class.cast(localObject2);
              ((av)localObject2).a(localp.a);
              localArrayList.add(localObject2);
              ((Iterator)localObject1).remove();
            }
          }
          catch (Throwable localThrowable)
          {
            ag.a(localThrowable);
            ag.d(" query have error!", new Object[0]);
          }
        }
        if (localList.size() > 0)
        {
          ag.a(" there are error datas ,should be remove " + localList.size(), new Object[0]);
          localObject1 = new Long[localList.size()];
          for (paramInt = 0; paramInt < localList.size(); paramInt++)
            localObject1[paramInt] = Long.valueOf(((p)localList.get(paramInt)).a);
          p.a(paramContext, (Long[])localObject1);
        }
        ag.a(" RecordDAO.queryRecentRecord() end", new Object[0]);
        AppMethodBeat.o(97798);
        paramContext = localArrayList;
      }
    }
  }

  // ERROR //
  public static boolean a(Context paramContext, com.tencent.tencentmap.mapsdk.maps.a.y paramy)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: iconst_0
    //   3: istore_3
    //   4: iconst_0
    //   5: istore 4
    //   7: ldc 2
    //   9: monitorenter
    //   10: ldc_w 535
    //   13: invokestatic 19	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   16: aload_0
    //   17: ifnull +7 -> 24
    //   20: aload_1
    //   21: ifnonnull +27 -> 48
    //   24: ldc_w 537
    //   27: iconst_0
    //   28: anewarray 4	java/lang/Object
    //   31: invokestatic 394	com/tencent/tencentmap/mapsdk/maps/a/ag:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   34: ldc_w 535
    //   37: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   40: iload 4
    //   42: istore_2
    //   43: ldc 2
    //   45: monitorexit
    //   46: iload_2
    //   47: ireturn
    //   48: aload_0
    //   49: invokestatic 542	com/tencent/tencentmap/mapsdk/maps/a/r:a	(Landroid/content/Context;)Lcom/tencent/tencentmap/mapsdk/maps/a/r;
    //   52: invokevirtual 546	com/tencent/tencentmap/mapsdk/maps/a/r:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   55: astore 5
    //   57: aload 5
    //   59: ifnonnull +31 -> 90
    //   62: ldc_w 548
    //   65: iconst_0
    //   66: anewarray 4	java/lang/Object
    //   69: invokestatic 31	com/tencent/tencentmap/mapsdk/maps/a/ag:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   72: ldc_w 535
    //   75: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   78: iload 4
    //   80: istore_2
    //   81: goto -38 -> 43
    //   84: astore_0
    //   85: ldc 2
    //   87: monitorexit
    //   88: aload_0
    //   89: athrow
    //   90: aload_1
    //   91: ifnonnull +51 -> 142
    //   94: aconst_null
    //   95: astore_0
    //   96: aload_0
    //   97: ifnull +156 -> 253
    //   100: aload 5
    //   102: ldc_w 550
    //   105: ldc_w 552
    //   108: aload_0
    //   109: invokevirtual 557	android/database/sqlite/SQLiteDatabase:replace	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    //   112: lstore 6
    //   114: lload 6
    //   116: lconst_0
    //   117: lcmp
    //   118: ifge +106 -> 224
    //   121: ldc_w 559
    //   124: iconst_0
    //   125: anewarray 4	java/lang/Object
    //   128: invokestatic 394	com/tencent/tencentmap/mapsdk/maps/a/ag:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   131: iload_3
    //   132: istore_2
    //   133: ldc_w 535
    //   136: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   139: goto -96 -> 43
    //   142: new 561	android/content/ContentValues
    //   145: astore_0
    //   146: aload_0
    //   147: invokespecial 562	android/content/ContentValues:<init>	()V
    //   150: aload_1
    //   151: invokevirtual 566	com/tencent/tencentmap/mapsdk/maps/a/y:a	()J
    //   154: lconst_0
    //   155: lcmp
    //   156: iflt +17 -> 173
    //   159: aload_0
    //   160: ldc_w 552
    //   163: aload_1
    //   164: invokevirtual 566	com/tencent/tencentmap/mapsdk/maps/a/y:a	()J
    //   167: invokestatic 530	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   170: invokevirtual 569	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
    //   173: aload_0
    //   174: ldc_w 571
    //   177: aload_1
    //   178: invokevirtual 573	com/tencent/tencentmap/mapsdk/maps/a/y:b	()I
    //   181: invokestatic 578	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   184: invokevirtual 581	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   187: aload_0
    //   188: ldc_w 583
    //   191: aload_1
    //   192: invokevirtual 585	com/tencent/tencentmap/mapsdk/maps/a/y:c	()[B
    //   195: invokevirtual 588	android/content/ContentValues:put	(Ljava/lang/String;[B)V
    //   198: goto -102 -> 96
    //   201: astore_0
    //   202: ldc_w 590
    //   205: iconst_1
    //   206: anewarray 4	java/lang/Object
    //   209: dup
    //   210: iconst_0
    //   211: aload_0
    //   212: invokevirtual 591	java/lang/Throwable:toString	()Ljava/lang/String;
    //   215: aastore
    //   216: invokestatic 31	com/tencent/tencentmap/mapsdk/maps/a/ag:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   219: iload_3
    //   220: istore_2
    //   221: goto -88 -> 133
    //   224: aload_1
    //   225: lload 6
    //   227: invokevirtual 592	com/tencent/tencentmap/mapsdk/maps/a/y:a	(J)V
    //   230: ldc_w 594
    //   233: iconst_1
    //   234: anewarray 4	java/lang/Object
    //   237: dup
    //   238: iconst_0
    //   239: aload_1
    //   240: invokevirtual 573	com/tencent/tencentmap/mapsdk/maps/a/y:b	()I
    //   243: invokestatic 578	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   246: aastore
    //   247: invokestatic 596	com/tencent/tencentmap/mapsdk/maps/a/ag:e	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   250: goto -117 -> 133
    //   253: iconst_0
    //   254: istore_2
    //   255: goto -5 -> 250
    //
    // Exception table:
    //   from	to	target	type
    //   10	16	84	finally
    //   24	40	84	finally
    //   48	57	84	finally
    //   62	72	84	finally
    //   72	78	84	finally
    //   100	114	84	finally
    //   121	131	84	finally
    //   133	139	84	finally
    //   142	173	84	finally
    //   173	198	84	finally
    //   202	219	84	finally
    //   224	250	84	finally
    //   48	57	201	java/lang/Throwable
    //   62	72	201	java/lang/Throwable
    //   100	114	201	java/lang/Throwable
    //   121	131	201	java/lang/Throwable
    //   142	173	201	java/lang/Throwable
    //   173	198	201	java/lang/Throwable
    //   224	250	201	java/lang/Throwable
  }

  public static boolean a(Context paramContext, String paramString, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(97790);
    Object localObject1 = r.a;
    if ((paramContext != null) && (paramString != null) && (paramArrayOfObject != null));
    try
    {
      boolean bool;
      if (paramArrayOfObject.length == 0)
      {
        AppMethodBeat.o(97790);
        bool = false;
      }
      while (true)
      {
        return bool;
        try
        {
          paramContext = r.a(paramContext).getWritableDatabase();
          Object localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>("_key = '");
          paramContext.delete("t_conf", paramString + "'", null);
          localObject2 = new android/content/ContentValues;
          ((ContentValues)localObject2).<init>();
          ((ContentValues)localObject2).put("_key", paramString);
          ((ContentValues)localObject2).put("_value", (String)paramArrayOfObject[0]);
          ((ContentValues)localObject2).put("_vdate", (Long)paramArrayOfObject[1]);
          paramString = new java/util/Date;
          paramString.<init>();
          ((ContentValues)localObject2).put("_time", Long.valueOf(paramString.getTime()));
          if (paramContext.insert("t_conf", null, (ContentValues)localObject2) < 0L)
            ag.d(" insertOrUpdateByKey failure! return false!", new Object[0]);
          for (bool = false; ; bool = true)
          {
            AppMethodBeat.o(97790);
            break;
          }
        }
        catch (Exception paramContext)
        {
          while (true)
            bool = false;
        }
      }
    }
    finally
    {
      AppMethodBeat.o(97790);
    }
    throw paramContext;
  }

  // ERROR //
  private static byte[] a(Object paramObject)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: ldc_w 631
    //   5: invokestatic 19	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: ldc_w 633
    //   11: iconst_0
    //   12: anewarray 4	java/lang/Object
    //   15: invokestatic 54	com/tencent/tencentmap/mapsdk/maps/a/ag:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   18: aload_0
    //   19: ifnull +13 -> 32
    //   22: ldc_w 635
    //   25: aload_0
    //   26: invokevirtual 508	java/lang/Class:isInstance	(Ljava/lang/Object;)Z
    //   29: ifne +23 -> 52
    //   32: ldc_w 637
    //   35: iconst_0
    //   36: anewarray 4	java/lang/Object
    //   39: invokestatic 394	com/tencent/tencentmap/mapsdk/maps/a/ag:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   42: ldc_w 631
    //   45: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   48: aload_1
    //   49: astore_0
    //   50: aload_0
    //   51: areturn
    //   52: new 639	java/io/ByteArrayOutputStream
    //   55: dup
    //   56: invokespecial 640	java/io/ByteArrayOutputStream:<init>	()V
    //   59: astore_2
    //   60: new 642	java/io/ObjectOutputStream
    //   63: astore_3
    //   64: aload_3
    //   65: aload_2
    //   66: invokespecial 645	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   69: aload_3
    //   70: astore 4
    //   72: aload_3
    //   73: aload_0
    //   74: invokevirtual 649	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
    //   77: aload_3
    //   78: astore 4
    //   80: aload_3
    //   81: invokevirtual 652	java/io/ObjectOutputStream:flush	()V
    //   84: aload_3
    //   85: astore 4
    //   87: aload_2
    //   88: invokevirtual 655	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   91: astore_0
    //   92: aload_3
    //   93: invokevirtual 658	java/io/ObjectOutputStream:close	()V
    //   96: aload_2
    //   97: invokevirtual 659	java/io/ByteArrayOutputStream:close	()V
    //   100: ldc_w 631
    //   103: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   106: goto -56 -> 50
    //   109: astore 4
    //   111: aload 4
    //   113: invokestatic 222	com/tencent/tencentmap/mapsdk/maps/a/ag:a	(Ljava/lang/Throwable;)V
    //   116: goto -20 -> 96
    //   119: astore 4
    //   121: aload 4
    //   123: invokestatic 222	com/tencent/tencentmap/mapsdk/maps/a/ag:a	(Ljava/lang/Throwable;)V
    //   126: goto -26 -> 100
    //   129: astore 5
    //   131: aconst_null
    //   132: astore_0
    //   133: aload_0
    //   134: astore 4
    //   136: aload 5
    //   138: invokestatic 222	com/tencent/tencentmap/mapsdk/maps/a/ag:a	(Ljava/lang/Throwable;)V
    //   141: aload_0
    //   142: astore 4
    //   144: aload 5
    //   146: invokevirtual 291	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   149: iconst_0
    //   150: anewarray 4	java/lang/Object
    //   153: invokestatic 31	com/tencent/tencentmap/mapsdk/maps/a/ag:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   156: aload_0
    //   157: ifnull +7 -> 164
    //   160: aload_0
    //   161: invokevirtual 658	java/io/ObjectOutputStream:close	()V
    //   164: aload_2
    //   165: invokevirtual 659	java/io/ByteArrayOutputStream:close	()V
    //   168: ldc_w 631
    //   171: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   174: aload_1
    //   175: astore_0
    //   176: goto -126 -> 50
    //   179: astore_0
    //   180: aload_0
    //   181: invokestatic 222	com/tencent/tencentmap/mapsdk/maps/a/ag:a	(Ljava/lang/Throwable;)V
    //   184: goto -20 -> 164
    //   187: astore_0
    //   188: aload_0
    //   189: invokestatic 222	com/tencent/tencentmap/mapsdk/maps/a/ag:a	(Ljava/lang/Throwable;)V
    //   192: goto -24 -> 168
    //   195: astore_0
    //   196: aconst_null
    //   197: astore 4
    //   199: aload 4
    //   201: ifnull +8 -> 209
    //   204: aload 4
    //   206: invokevirtual 658	java/io/ObjectOutputStream:close	()V
    //   209: aload_2
    //   210: invokevirtual 659	java/io/ByteArrayOutputStream:close	()V
    //   213: ldc_w 631
    //   216: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   219: aload_0
    //   220: athrow
    //   221: astore 4
    //   223: aload 4
    //   225: invokestatic 222	com/tencent/tencentmap/mapsdk/maps/a/ag:a	(Ljava/lang/Throwable;)V
    //   228: goto -19 -> 209
    //   231: astore 4
    //   233: aload 4
    //   235: invokestatic 222	com/tencent/tencentmap/mapsdk/maps/a/ag:a	(Ljava/lang/Throwable;)V
    //   238: goto -25 -> 213
    //   241: astore_0
    //   242: goto -43 -> 199
    //   245: astore 5
    //   247: aload_3
    //   248: astore_0
    //   249: goto -116 -> 133
    //
    // Exception table:
    //   from	to	target	type
    //   92	96	109	java/io/IOException
    //   96	100	119	java/io/IOException
    //   60	69	129	java/lang/Throwable
    //   160	164	179	java/io/IOException
    //   164	168	187	java/io/IOException
    //   60	69	195	finally
    //   204	209	221	java/io/IOException
    //   209	213	231	java/io/IOException
    //   72	77	241	finally
    //   80	84	241	finally
    //   87	92	241	finally
    //   136	141	241	finally
    //   144	156	241	finally
    //   72	77	245	java/lang/Throwable
    //   80	84	245	java/lang/Throwable
    //   87	92	245	java/lang/Throwable
  }

  public static byte[] a(String paramString)
  {
    Object localObject1 = null;
    AppMethodBeat.i(97803);
    if (paramString == null)
    {
      AppMethodBeat.o(97803);
      paramString = (String)localObject1;
    }
    while (true)
    {
      return paramString;
      try
      {
        localObject1 = Base64.decode("MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCsAxNCSLyNUCOP1QqYStE8ZeiU\nv4afaMqEmoLCKb0mUZYvYOoVN7LPMi2IVY2MRaFJvuND3glVw1RDm2VJJtjQkwUd\n3kpR9TrHAf7UQOVTpNo3Vi7pXTOqZ6bh3ZA/fs56jDCCKV6+wT/pCeu8N6vVnPrD\nz3SdHIeNeWb/woazCwIDAQAB", 0);
        Object localObject2 = new java/security/spec/X509EncodedKeySpec;
        ((X509EncodedKeySpec)localObject2).<init>((byte[])localObject1);
        localObject2 = (RSAPublicKey)KeyFactory.getInstance("RSA", "BC").generatePublic((KeySpec)localObject2);
        localObject1 = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        ((Cipher)localObject1).init(1, (Key)localObject2);
        paramString = ((Cipher)localObject1).doFinal(paramString.getBytes());
        AppMethodBeat.o(97803);
      }
      catch (Exception paramString)
      {
        while (true)
          paramString = null;
      }
    }
  }

  private static byte[] a(String paramString, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(97801);
    if ((paramString == null) || (paramArrayOfByte == null))
    {
      paramString = null;
      AppMethodBeat.o(97801);
    }
    while (true)
    {
      return paramString;
      for (int i = paramString.length(); i < 16; i++)
        paramString = paramString + "0";
      String str = paramString.substring(0, 16);
      paramString = new SecretKeySpec(str.getBytes(), "AES");
      Cipher localCipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
      localCipher.init(2, paramString, new IvParameterSpec(str.getBytes()));
      paramString = localCipher.doFinal(paramArrayOfByte);
      AppMethodBeat.o(97801);
    }
  }

  private static byte[] a(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(97800);
    ByteArrayInputStream localByteArrayInputStream = new ByteArrayInputStream(paramArrayOfByte);
    GZIPInputStream localGZIPInputStream = new GZIPInputStream(localByteArrayInputStream);
    byte[] arrayOfByte = new byte[1024];
    paramArrayOfByte = new ByteArrayOutputStream();
    while (true)
    {
      int i = localGZIPInputStream.read(arrayOfByte, 0, 1024);
      if (i == -1)
        break;
      paramArrayOfByte.write(arrayOfByte, 0, i);
    }
    arrayOfByte = paramArrayOfByte.toByteArray();
    paramArrayOfByte.flush();
    paramArrayOfByte.close();
    localGZIPInputStream.close();
    localByteArrayInputStream.close();
    AppMethodBeat.o(97800);
    return arrayOfByte;
  }

  private static byte[] a(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(97812);
    if ((paramArrayOfByte == null) || (paramInt == -1))
      AppMethodBeat.o(97812);
    while (true)
    {
      return paramArrayOfByte;
      ag.b("zp: %s len: %s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfByte.length) });
      ByteArrayOutputStream localByteArrayOutputStream;
      Object localObject;
      if (paramInt == 1)
      {
        try
        {
          localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
          localByteArrayOutputStream.<init>();
          localObject = new java/util/zip/ZipOutputStream;
          ((ZipOutputStream)localObject).<init>(localByteArrayOutputStream);
          ZipEntry localZipEntry = new java/util/zip/ZipEntry;
          localZipEntry.<init>("zip");
          localZipEntry.setSize(paramArrayOfByte.length);
          ((ZipOutputStream)localObject).putNextEntry(localZipEntry);
          ((ZipOutputStream)localObject).write(paramArrayOfByte);
          ((ZipOutputStream)localObject).closeEntry();
          ((ZipOutputStream)localObject).close();
          paramArrayOfByte = localByteArrayOutputStream.toByteArray();
          localByteArrayOutputStream.close();
          AppMethodBeat.o(97812);
        }
        catch (Throwable paramArrayOfByte)
        {
          ag.a(paramArrayOfByte);
          ag.d("err zp : %s", new Object[] { paramArrayOfByte.toString() });
          AppMethodBeat.o(97812);
          paramArrayOfByte = null;
        }
      }
      else if (paramInt == 2)
      {
        localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
        localByteArrayOutputStream.<init>();
        localObject = new java/util/zip/GZIPOutputStream;
        ((GZIPOutputStream)localObject).<init>(localByteArrayOutputStream);
        ((GZIPOutputStream)localObject).write(paramArrayOfByte);
        ((GZIPOutputStream)localObject).finish();
        ((GZIPOutputStream)localObject).close();
        paramArrayOfByte = localByteArrayOutputStream.toByteArray();
        localByteArrayOutputStream.close();
        AppMethodBeat.o(97812);
      }
      else
      {
        AppMethodBeat.o(97812);
        paramArrayOfByte = null;
      }
    }
  }

  public static byte[] a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(97815);
    if (paramArrayOfByte == null)
    {
      AppMethodBeat.o(97815);
      paramArrayOfByte = localObject;
    }
    while (true)
    {
      return paramArrayOfByte;
      try
      {
        paramArrayOfByte = a(a(paramArrayOfByte, paramInt1), paramInt2, paramString);
        AppMethodBeat.o(97815);
      }
      catch (Throwable paramArrayOfByte)
      {
        ag.a(paramArrayOfByte);
        AppMethodBeat.o(97815);
        paramArrayOfByte = localObject;
      }
    }
  }

  private static byte[] a(byte[] paramArrayOfByte, int paramInt, String paramString)
  {
    AppMethodBeat.i(97810);
    if ((paramArrayOfByte == null) || (paramInt == -1))
      AppMethodBeat.o(97810);
    while (true)
    {
      return paramArrayOfByte;
      ag.b("enD:} %d %d", new Object[] { Integer.valueOf(paramArrayOfByte.length), Integer.valueOf(paramInt) });
      if (paramInt == 1)
      {
        if ((paramString == null) || (paramArrayOfByte == null));
        try
        {
          AppMethodBeat.o(97810);
          paramArrayOfByte = null;
          continue;
          Cipher localCipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
          Object localObject = new javax/crypto/spec/DESKeySpec;
          ((DESKeySpec)localObject).<init>(paramString.getBytes("UTF-8"));
          localObject = SecretKeyFactory.getInstance("DES").generateSecret((KeySpec)localObject);
          IvParameterSpec localIvParameterSpec = new javax/crypto/spec/IvParameterSpec;
          localIvParameterSpec.<init>(paramString.getBytes("UTF-8"));
          localCipher.init(1, (Key)localObject, localIvParameterSpec);
          paramArrayOfByte = localCipher.doFinal(paramArrayOfByte);
          AppMethodBeat.o(97810);
        }
        catch (Throwable paramArrayOfByte)
        {
          ag.a(paramArrayOfByte);
          ag.d("err enD: %s", new Object[] { paramArrayOfByte.toString() });
          AppMethodBeat.o(97810);
          paramArrayOfByte = null;
        }
      }
      else if (paramInt == 3)
      {
        paramArrayOfByte = b(paramString, paramArrayOfByte);
        AppMethodBeat.o(97810);
      }
      else
      {
        AppMethodBeat.o(97810);
        paramArrayOfByte = null;
      }
    }
  }

  public static Long[] a(Context paramContext, List<av> paramList)
  {
    int i = 0;
    AppMethodBeat.i(97797);
    ag.a(" RecordDAO.insertList() start", new Object[0]);
    if ((paramContext == null) || (paramList == null))
    {
      ag.d(" insertList() have null args!", new Object[0]);
      AppMethodBeat.o(97797);
      paramContext = null;
    }
    while (true)
    {
      return paramContext;
      int j = paramList.size();
      if (j == 0)
      {
        ag.b(" list siez == 0 , return true!", new Object[0]);
        AppMethodBeat.o(97797);
        paramContext = null;
      }
      else
      {
        Long[] arrayOfLong = new Long[j];
        ArrayList localArrayList = new ArrayList();
        int k = 0;
        if (k < j)
        {
          av localav = (av)paramList.get(k);
          if ((localav == null) || (localav.b() == null) || (!localav.b().equals("UA")))
            ag.d(" bean's type is error!", new Object[0]);
          while (true)
          {
            k++;
            break;
            try
            {
              p localp = new com/tencent/tencentmap/mapsdk/maps/a/p;
              localp.<init>(localav.c(), a(localav));
              localArrayList.add(localp);
            }
            catch (Throwable localThrowable)
            {
              ag.a(localThrowable);
            }
          }
        }
        if (!p.a(paramContext, localArrayList))
        {
          AppMethodBeat.o(97797);
          paramContext = null;
        }
        else
        {
          paramList = localArrayList.iterator();
          for (k = i; paramList.hasNext(); k++)
          {
            paramContext = (p)paramList.next();
            if (k < j)
              arrayOfLong[k] = Long.valueOf(paramContext.a);
          }
          AppMethodBeat.o(97797);
          paramContext = arrayOfLong;
        }
      }
    }
  }

  // ERROR //
  public static Object[] a(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: ldc_w 835
    //   5: invokestatic 19	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: getstatic 603	com/tencent/tencentmap/mapsdk/maps/a/r:a	Ljava/lang/Object;
    //   11: astore_3
    //   12: aload_3
    //   13: monitorenter
    //   14: aload_0
    //   15: ifnonnull +25 -> 40
    //   18: ldc_w 837
    //   21: iconst_0
    //   22: anewarray 4	java/lang/Object
    //   25: invokestatic 394	com/tencent/tencentmap/mapsdk/maps/a/ag:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   28: aload_3
    //   29: monitorexit
    //   30: ldc_w 835
    //   33: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   36: aconst_null
    //   37: astore_0
    //   38: aload_0
    //   39: areturn
    //   40: aload_1
    //   41: ifnonnull +26 -> 67
    //   44: ldc_w 839
    //   47: iconst_0
    //   48: anewarray 4	java/lang/Object
    //   51: invokestatic 394	com/tencent/tencentmap/mapsdk/maps/a/ag:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   54: aload_3
    //   55: monitorexit
    //   56: ldc_w 835
    //   59: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   62: aconst_null
    //   63: astore_0
    //   64: goto -26 -> 38
    //   67: aload_0
    //   68: invokestatic 542	com/tencent/tencentmap/mapsdk/maps/a/r:a	(Landroid/content/Context;)Lcom/tencent/tencentmap/mapsdk/maps/a/r;
    //   71: invokevirtual 546	com/tencent/tencentmap/mapsdk/maps/a/r:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   74: astore 4
    //   76: aload 4
    //   78: ifnonnull +26 -> 104
    //   81: ldc_w 841
    //   84: iconst_0
    //   85: anewarray 4	java/lang/Object
    //   88: invokestatic 394	com/tencent/tencentmap/mapsdk/maps/a/ag:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   91: aload_3
    //   92: monitorexit
    //   93: ldc_w 835
    //   96: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   99: aconst_null
    //   100: astore_0
    //   101: goto -63 -> 38
    //   104: new 108	java/lang/StringBuilder
    //   107: astore_0
    //   108: aload_0
    //   109: ldc_w 605
    //   112: invokespecial 524	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   115: aload 4
    //   117: ldc_w 607
    //   120: aconst_null
    //   121: aload_0
    //   122: aload_1
    //   123: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   126: ldc_w 609
    //   129: invokevirtual 118	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   132: invokevirtual 121	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   135: aconst_null
    //   136: aconst_null
    //   137: aconst_null
    //   138: aconst_null
    //   139: invokevirtual 845	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   142: astore_0
    //   143: aload_0
    //   144: ifnull +92 -> 236
    //   147: aload_0
    //   148: invokeinterface 850 1 0
    //   153: ifeq +83 -> 236
    //   156: iconst_3
    //   157: anewarray 4	java/lang/Object
    //   160: astore_2
    //   161: aload_2
    //   162: iconst_0
    //   163: aload_1
    //   164: aastore
    //   165: aload_2
    //   166: iconst_1
    //   167: aload_0
    //   168: aload_0
    //   169: ldc_w 618
    //   172: invokeinterface 853 2 0
    //   177: invokeinterface 856 2 0
    //   182: aastore
    //   183: aload_2
    //   184: iconst_2
    //   185: aload_0
    //   186: aload_0
    //   187: ldc_w 620
    //   190: invokeinterface 853 2 0
    //   195: invokeinterface 860 2 0
    //   200: invokestatic 530	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   203: aastore
    //   204: aload_0
    //   205: ifnull +18 -> 223
    //   208: aload_0
    //   209: invokeinterface 863 1 0
    //   214: ifne +9 -> 223
    //   217: aload_0
    //   218: invokeinterface 864 1 0
    //   223: aload_3
    //   224: monitorexit
    //   225: ldc_w 835
    //   228: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   231: aload_2
    //   232: astore_0
    //   233: goto -195 -> 38
    //   236: aload_0
    //   237: ifnull +18 -> 255
    //   240: aload_0
    //   241: invokeinterface 863 1 0
    //   246: ifne +9 -> 255
    //   249: aload_0
    //   250: invokeinterface 864 1 0
    //   255: aload_3
    //   256: monitorexit
    //   257: ldc_w 835
    //   260: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   263: aconst_null
    //   264: astore_0
    //   265: goto -227 -> 38
    //   268: astore_0
    //   269: aconst_null
    //   270: astore_0
    //   271: aload_0
    //   272: ifnull -17 -> 255
    //   275: aload_0
    //   276: invokeinterface 863 1 0
    //   281: ifne -26 -> 255
    //   284: aload_0
    //   285: invokeinterface 864 1 0
    //   290: goto -35 -> 255
    //   293: astore_0
    //   294: aload_3
    //   295: monitorexit
    //   296: ldc_w 835
    //   299: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   302: aload_0
    //   303: athrow
    //   304: astore_0
    //   305: aload_2
    //   306: astore_1
    //   307: aload_1
    //   308: ifnull +18 -> 326
    //   311: aload_1
    //   312: invokeinterface 863 1 0
    //   317: ifne +9 -> 326
    //   320: aload_1
    //   321: invokeinterface 864 1 0
    //   326: ldc_w 835
    //   329: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   332: aload_0
    //   333: athrow
    //   334: astore_1
    //   335: aload_0
    //   336: astore_2
    //   337: aload_1
    //   338: astore_0
    //   339: aload_2
    //   340: astore_1
    //   341: goto -34 -> 307
    //   344: astore_1
    //   345: goto -74 -> 271
    //
    // Exception table:
    //   from	to	target	type
    //   67	76	268	java/lang/Exception
    //   81	91	268	java/lang/Exception
    //   104	143	268	java/lang/Exception
    //   18	30	293	finally
    //   44	56	293	finally
    //   91	93	293	finally
    //   208	223	293	finally
    //   223	225	293	finally
    //   240	255	293	finally
    //   255	257	293	finally
    //   275	290	293	finally
    //   311	326	293	finally
    //   326	334	293	finally
    //   67	76	304	finally
    //   81	91	304	finally
    //   104	143	304	finally
    //   147	161	334	finally
    //   165	204	334	finally
    //   147	161	344	java/lang/Exception
    //   165	204	344	java/lang/Exception
  }

  // ERROR //
  private static Object b(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: ldc_w 865
    //   5: invokestatic 19	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: ldc_w 867
    //   11: iconst_0
    //   12: anewarray 4	java/lang/Object
    //   15: invokestatic 54	com/tencent/tencentmap/mapsdk/maps/a/ag:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   18: aload_0
    //   19: ifnull +8 -> 27
    //   22: aload_0
    //   23: arraylength
    //   24: ifge +13 -> 37
    //   27: ldc_w 865
    //   30: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   33: aload_1
    //   34: astore_0
    //   35: aload_0
    //   36: areturn
    //   37: new 727	java/io/ByteArrayInputStream
    //   40: dup
    //   41: aload_0
    //   42: invokespecial 728	java/io/ByteArrayInputStream:<init>	([B)V
    //   45: astore_2
    //   46: new 869	java/io/ObjectInputStream
    //   49: astore_3
    //   50: aload_3
    //   51: aload_2
    //   52: invokespecial 870	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   55: aload_3
    //   56: astore_0
    //   57: aload_3
    //   58: invokevirtual 873	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   61: astore 4
    //   63: aload 4
    //   65: astore_0
    //   66: aload_3
    //   67: invokevirtual 874	java/io/ObjectInputStream:close	()V
    //   70: aload_2
    //   71: invokevirtual 744	java/io/ByteArrayInputStream:close	()V
    //   74: ldc_w 865
    //   77: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   80: goto -45 -> 35
    //   83: astore_3
    //   84: aload_3
    //   85: invokestatic 222	com/tencent/tencentmap/mapsdk/maps/a/ag:a	(Ljava/lang/Throwable;)V
    //   88: goto -18 -> 70
    //   91: astore_3
    //   92: aload_3
    //   93: invokestatic 222	com/tencent/tencentmap/mapsdk/maps/a/ag:a	(Ljava/lang/Throwable;)V
    //   96: goto -22 -> 74
    //   99: astore 4
    //   101: aconst_null
    //   102: astore_3
    //   103: aload_3
    //   104: astore_0
    //   105: aload 4
    //   107: invokestatic 222	com/tencent/tencentmap/mapsdk/maps/a/ag:a	(Ljava/lang/Throwable;)V
    //   110: aload_3
    //   111: astore_0
    //   112: aload 4
    //   114: invokevirtual 291	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   117: iconst_0
    //   118: anewarray 4	java/lang/Object
    //   121: invokestatic 31	com/tencent/tencentmap/mapsdk/maps/a/ag:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   124: aload_3
    //   125: ifnull +7 -> 132
    //   128: aload_3
    //   129: invokevirtual 874	java/io/ObjectInputStream:close	()V
    //   132: aload_2
    //   133: invokevirtual 744	java/io/ByteArrayInputStream:close	()V
    //   136: ldc_w 865
    //   139: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   142: aload_1
    //   143: astore_0
    //   144: goto -109 -> 35
    //   147: astore_0
    //   148: aload_0
    //   149: invokestatic 222	com/tencent/tencentmap/mapsdk/maps/a/ag:a	(Ljava/lang/Throwable;)V
    //   152: goto -20 -> 132
    //   155: astore_0
    //   156: aload_0
    //   157: invokestatic 222	com/tencent/tencentmap/mapsdk/maps/a/ag:a	(Ljava/lang/Throwable;)V
    //   160: goto -24 -> 136
    //   163: astore_3
    //   164: aconst_null
    //   165: astore_0
    //   166: aload_0
    //   167: ifnull +7 -> 174
    //   170: aload_0
    //   171: invokevirtual 874	java/io/ObjectInputStream:close	()V
    //   174: aload_2
    //   175: invokevirtual 744	java/io/ByteArrayInputStream:close	()V
    //   178: ldc_w 865
    //   181: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   184: aload_3
    //   185: athrow
    //   186: astore_0
    //   187: aload_0
    //   188: invokestatic 222	com/tencent/tencentmap/mapsdk/maps/a/ag:a	(Ljava/lang/Throwable;)V
    //   191: goto -17 -> 174
    //   194: astore_0
    //   195: aload_0
    //   196: invokestatic 222	com/tencent/tencentmap/mapsdk/maps/a/ag:a	(Ljava/lang/Throwable;)V
    //   199: goto -21 -> 178
    //   202: astore_3
    //   203: goto -37 -> 166
    //   206: astore 4
    //   208: goto -105 -> 103
    //
    // Exception table:
    //   from	to	target	type
    //   66	70	83	java/io/IOException
    //   70	74	91	java/io/IOException
    //   46	55	99	java/lang/Throwable
    //   128	132	147	java/io/IOException
    //   132	136	155	java/io/IOException
    //   46	55	163	finally
    //   170	174	186	java/io/IOException
    //   174	178	194	java/io/IOException
    //   57	63	202	finally
    //   105	110	202	finally
    //   112	124	202	finally
    //   57	63	206	java/lang/Throwable
  }

  public static String b()
  {
    AppMethodBeat.i(97778);
    try
    {
      String str1 = Build.VERSION.RELEASE;
      AppMethodBeat.o(97778);
      return str1;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        ag.d("getVersion error", new Object[0]);
        ag.a(localThrowable);
        String str2 = "";
        AppMethodBeat.o(97778);
      }
    }
  }

  public static String b(Context paramContext)
  {
    AppMethodBeat.i(97780);
    if (paramContext == null)
    {
      ag.d("getImei but context == null!", new Object[0]);
      AppMethodBeat.o(97780);
      paramContext = "";
    }
    while (true)
    {
      return paramContext;
      try
      {
        if (a.f(paramContext))
        {
          paramContext = ((TelephonyManager)paramContext.getSystemService("phone")).getDeviceId();
          if (paramContext == null)
          {
            paramContext = "";
            localObject = paramContext;
          }
        }
      }
      catch (Throwable paramContext)
      {
        while (true)
        {
          try
          {
            ag.a("IMEI:".concat(String.valueOf(paramContext)), new Object[0]);
            AppMethodBeat.o(97780);
            break;
            Object localObject = paramContext;
            paramContext = paramContext.toLowerCase();
            continue;
            paramContext = paramContext;
            localObject = "";
            ag.d("getImei error!", new Object[0]);
            paramContext = (Context)localObject;
            continue;
          }
          catch (Throwable paramContext)
          {
            continue;
          }
          paramContext = "";
        }
      }
    }
  }

  public static String b(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(97821);
    try
    {
      Object localObject = aq.a(paramContext);
      paramContext = ((aq)localObject).a();
      String str = ((aq)localObject).b();
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append(paramContext).append("_").append(str).append("_");
      paramContext = new java/util/Date;
      paramContext.<init>();
      paramContext = g(paramContext.getTime() + "_" + paramInt);
      AppMethodBeat.o(97821);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        paramContext = null;
        AppMethodBeat.o(97821);
      }
    }
  }

  public static String b(String paramString)
  {
    AppMethodBeat.i(97804);
    String str1 = "unknown";
    if ((paramString == null) || (paramString.trim().length() == 0))
    {
      AppMethodBeat.o(97804);
      paramString = str1;
    }
    while (true)
    {
      return paramString;
      String str2 = paramString.trim();
      int i = str2.length();
      int j;
      do
      {
        i--;
        if (i < 0)
          break;
        j = str2.charAt(i);
      }
      while ((j >= 48) && (j <= 57));
      for (i = 0; ; i = 1)
      {
        if (i == 0)
          break label116;
        str1 = paramString.trim();
        paramString = str1;
        if (str1.length() > 16)
          paramString = str1.substring(0, 16);
        AppMethodBeat.o(97804);
        break;
      }
      label116: ag.c("channelID is invalid!! channelID should be Numeric! channelID:".concat(String.valueOf(paramString)), new Object[0]);
      AppMethodBeat.o(97804);
      paramString = str1;
    }
  }

  private static byte[] b(String paramString, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(97802);
    if ((paramString == null) || (paramArrayOfByte == null))
    {
      paramString = null;
      AppMethodBeat.o(97802);
    }
    while (true)
    {
      return paramString;
      for (int i = paramString.length(); i < 16; i++)
        paramString = paramString + "0";
      paramString = paramString.substring(0, 16);
      SecretKeySpec localSecretKeySpec = new SecretKeySpec(paramString.getBytes(), "AES");
      Cipher localCipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
      localCipher.init(1, localSecretKeySpec, new IvParameterSpec(paramString.getBytes()));
      paramString = localCipher.doFinal(paramArrayOfByte);
      AppMethodBeat.o(97802);
    }
  }

  private static byte[] b(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(97813);
    if ((paramArrayOfByte == null) || (paramInt == -1))
      AppMethodBeat.o(97813);
    while (true)
    {
      return paramArrayOfByte;
      ag.b("unzp: %s len: %s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfByte.length) });
      if (paramInt == 1)
      {
        ByteArrayInputStream localByteArrayInputStream;
        ZipInputStream localZipInputStream;
        while (true)
        {
          ByteArrayOutputStream localByteArrayOutputStream;
          try
          {
            localByteArrayInputStream = new java/io/ByteArrayInputStream;
            localByteArrayInputStream.<init>(paramArrayOfByte);
            localZipInputStream = new java/util/zip/ZipInputStream;
            localZipInputStream.<init>(localByteArrayInputStream);
            paramArrayOfByte = null;
            if (localZipInputStream.getNextEntry() == null)
              break label184;
            paramArrayOfByte = new byte[1024];
            localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
            localByteArrayOutputStream.<init>();
            paramInt = localZipInputStream.read(paramArrayOfByte, 0, 1024);
            if (paramInt == -1)
              break label165;
            localByteArrayOutputStream.write(paramArrayOfByte, 0, paramInt);
            continue;
          }
          catch (Throwable paramArrayOfByte)
          {
            ag.a(paramArrayOfByte);
            ag.d("err unzp}" + paramArrayOfByte.toString(), new Object[0]);
            AppMethodBeat.o(97813);
            paramArrayOfByte = null;
          }
          break;
          label165: paramArrayOfByte = localByteArrayOutputStream.toByteArray();
          localByteArrayOutputStream.flush();
          localByteArrayOutputStream.close();
        }
        label184: localZipInputStream.close();
        localByteArrayInputStream.close();
        AppMethodBeat.o(97813);
      }
      else if (paramInt == 2)
      {
        paramArrayOfByte = a(paramArrayOfByte);
        AppMethodBeat.o(97813);
      }
      else
      {
        AppMethodBeat.o(97813);
        paramArrayOfByte = null;
      }
    }
  }

  public static byte[] b(byte[] paramArrayOfByte, int paramInt1, int paramInt2, String paramString)
  {
    AppMethodBeat.i(97816);
    try
    {
      paramArrayOfByte = b(b(paramArrayOfByte, paramInt2, paramString), paramInt1);
      AppMethodBeat.o(97816);
      return paramArrayOfByte;
    }
    catch (Exception paramArrayOfByte)
    {
      while (true)
      {
        ag.a(paramArrayOfByte);
        paramArrayOfByte = null;
        AppMethodBeat.o(97816);
      }
    }
  }

  private static byte[] b(byte[] paramArrayOfByte, int paramInt, String paramString)
  {
    AppMethodBeat.i(97811);
    if ((paramArrayOfByte == null) || (paramInt == -1))
      AppMethodBeat.o(97811);
    while (true)
    {
      return paramArrayOfByte;
      if (paramInt == 1)
      {
        if ((paramString == null) || (paramArrayOfByte == null));
        try
        {
          AppMethodBeat.o(97811);
          paramArrayOfByte = null;
          continue;
          Cipher localCipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
          Object localObject = new javax/crypto/spec/DESKeySpec;
          ((DESKeySpec)localObject).<init>(paramString.getBytes("UTF-8"));
          localObject = SecretKeyFactory.getInstance("DES").generateSecret((KeySpec)localObject);
          IvParameterSpec localIvParameterSpec = new javax/crypto/spec/IvParameterSpec;
          localIvParameterSpec.<init>(paramString.getBytes("UTF-8"));
          localCipher.init(2, (Key)localObject, localIvParameterSpec);
          paramArrayOfByte = localCipher.doFinal(paramArrayOfByte);
          AppMethodBeat.o(97811);
        }
        catch (Throwable paramArrayOfByte)
        {
          ag.a(paramArrayOfByte);
          ag.d("err unD: %s", new Object[] { paramArrayOfByte.toString() });
          AppMethodBeat.o(97811);
          paramArrayOfByte = null;
        }
      }
      else if (paramInt == 3)
      {
        paramArrayOfByte = a(paramString, paramArrayOfByte);
        AppMethodBeat.o(97811);
      }
      else
      {
        AppMethodBeat.o(97811);
        paramArrayOfByte = null;
      }
    }
  }

  public static String c()
  {
    AppMethodBeat.i(97779);
    try
    {
      String str1 = Build.VERSION.SDK;
      AppMethodBeat.o(97779);
      return str1;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        ag.d("getApiLevel error", new Object[0]);
        ag.a(localThrowable);
        String str2 = "";
        AppMethodBeat.o(97779);
      }
    }
  }

  public static String c(Context paramContext)
  {
    AppMethodBeat.i(97781);
    String str = "";
    if (paramContext == null)
    {
      ag.d("getImsi but context == null!", new Object[0]);
      AppMethodBeat.o(97781);
      paramContext = str;
    }
    while (true)
    {
      return paramContext;
      Object localObject = str;
      try
      {
        if (a.f(paramContext))
        {
          localObject = str;
          paramContext = ((TelephonyManager)paramContext.getSystemService("phone")).getSubscriberId();
          if (paramContext == null);
          for (paramContext = ""; ; paramContext = paramContext.toLowerCase())
          {
            AppMethodBeat.o(97781);
            break;
            localObject = paramContext;
          }
        }
      }
      catch (Throwable paramContext)
      {
        while (true)
        {
          paramContext = (Context)localObject;
          ag.d("getImsi error!", new Object[0]);
          continue;
          paramContext = "";
        }
      }
    }
  }

  public static boolean c(String paramString)
  {
    AppMethodBeat.i(97806);
    boolean bool = true;
    int i = paramString.length();
    while (true)
    {
      int j = i - 1;
      if (j < 0)
        break;
      int k = paramString.charAt(j);
      if (k >= 32)
      {
        i = j;
        if (k < 127);
      }
      else
      {
        bool = false;
        i = j;
      }
    }
    AppMethodBeat.o(97806);
    return bool;
  }

  public static String d()
  {
    AppMethodBeat.i(97784);
    Object localObject = null;
    try
    {
      String str = Build.BRAND;
      localObject = str;
      AppMethodBeat.o(97784);
      return localObject;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        ag.d("getBrand error!", new Object[0]);
        ag.a(localThrowable);
      }
    }
  }

  public static String d(Context paramContext)
  {
    AppMethodBeat.i(97782);
    Object localObject = "";
    if (paramContext == null)
    {
      ag.d("getAndroidId but context == null!", new Object[0]);
      AppMethodBeat.o(97782);
      paramContext = (Context)localObject;
    }
    while (true)
    {
      return paramContext;
      try
      {
        paramContext = Settings.Secure.getString(paramContext.getContentResolver(), "android_id");
        if (paramContext == null);
        for (paramContext = ""; ; paramContext = paramContext.toLowerCase())
        {
          AppMethodBeat.o(97782);
          break;
          localObject = paramContext;
        }
      }
      catch (Throwable paramContext)
      {
        while (true)
        {
          ag.d("getAndroidId error!", new Object[0]);
          ag.a(paramContext);
          paramContext = (Context)localObject;
        }
      }
    }
  }

  public static Date d(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(97807);
    if ((paramString == null) || (paramString.trim().length() <= 0))
    {
      AppMethodBeat.o(97807);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      try
      {
        SimpleDateFormat localSimpleDateFormat = new java/text/SimpleDateFormat;
        localSimpleDateFormat.<init>("yyyy-MM-dd HH:mm:ss", Locale.US);
        paramString = localSimpleDateFormat.parse(paramString);
        AppMethodBeat.o(97807);
      }
      catch (ParseException paramString)
      {
        ag.a(paramString);
        AppMethodBeat.o(97807);
        paramString = localObject;
      }
    }
  }

  public static String e()
  {
    AppMethodBeat.i(97785);
    Object localObject1 = null;
    try
    {
      Object localObject2 = Environment.getDataDirectory();
      StatFs localStatFs = new android/os/StatFs;
      localStatFs.<init>(((File)localObject2).getPath());
      long l1 = localStatFs.getBlockSize();
      long l2 = localStatFs.getBlockCount();
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = l2 * l1 / 1024L / 1024L;
      localObject1 = localObject2;
      AppMethodBeat.o(97785);
      return localObject1;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        ag.d("getDisplayMetrics error!", new Object[0]);
        ag.a(localThrowable);
      }
    }
  }

  // ERROR //
  public static String e(Context paramContext)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: ldc_w 1036
    //   5: invokestatic 19	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_0
    //   9: ifnonnull +24 -> 33
    //   12: ldc_w 1038
    //   15: iconst_0
    //   16: anewarray 4	java/lang/Object
    //   19: invokestatic 31	com/tencent/tencentmap/mapsdk/maps/a/ag:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   22: ldc_w 1036
    //   25: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   28: ldc 100
    //   30: astore_0
    //   31: aload_0
    //   32: areturn
    //   33: getstatic 957	android/os/Build$VERSION:SDK	Ljava/lang/String;
    //   36: invokestatic 1041	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   39: invokevirtual 1044	java/lang/Integer:intValue	()I
    //   42: bipush 23
    //   44: if_icmpge +48 -> 92
    //   47: aload_0
    //   48: ldc_w 1046
    //   51: invokevirtual 895	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   54: checkcast 1048	android/net/wifi/WifiManager
    //   57: invokevirtual 1052	android/net/wifi/WifiManager:getConnectionInfo	()Landroid/net/wifi/WifiInfo;
    //   60: invokevirtual 1057	android/net/wifi/WifiInfo:getMacAddress	()Ljava/lang/String;
    //   63: astore_2
    //   64: aload_2
    //   65: ifnonnull +15 -> 80
    //   68: ldc 100
    //   70: astore_0
    //   71: ldc_w 1036
    //   74: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   77: goto -46 -> 31
    //   80: aload_2
    //   81: astore_0
    //   82: aload_2
    //   83: invokevirtual 905	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   86: astore_2
    //   87: aload_2
    //   88: astore_0
    //   89: goto -18 -> 71
    //   92: ldc 100
    //   94: astore_2
    //   95: aload_2
    //   96: astore_0
    //   97: iload_1
    //   98: iconst_2
    //   99: if_icmpge -28 -> 71
    //   102: aload_2
    //   103: astore_0
    //   104: iconst_2
    //   105: anewarray 211	java/lang/String
    //   108: dup
    //   109: iconst_0
    //   110: ldc_w 1059
    //   113: aastore
    //   114: dup
    //   115: iconst_1
    //   116: ldc_w 1061
    //   119: aastore
    //   120: iload_1
    //   121: aaload
    //   122: invokestatic 1063	com/tencent/tencentmap/mapsdk/a/e:e	(Ljava/lang/String;)Ljava/lang/String;
    //   125: invokevirtual 1064	java/lang/String:toString	()Ljava/lang/String;
    //   128: invokevirtual 413	java/lang/String:trim	()Ljava/lang/String;
    //   131: astore_2
    //   132: aload_2
    //   133: ifnull +24 -> 157
    //   136: aload_2
    //   137: astore_0
    //   138: aload_2
    //   139: invokevirtual 416	java/lang/String:length	()I
    //   142: ifle +15 -> 157
    //   145: aload_2
    //   146: astore_0
    //   147: aload_2
    //   148: invokevirtual 905	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   151: astore_2
    //   152: aload_2
    //   153: astore_0
    //   154: goto -83 -> 71
    //   157: iinc 1 1
    //   160: goto -65 -> 95
    //   163: astore_2
    //   164: ldc 100
    //   166: astore_0
    //   167: aload_2
    //   168: invokestatic 222	com/tencent/tencentmap/mapsdk/maps/a/ag:a	(Ljava/lang/Throwable;)V
    //   171: goto -100 -> 71
    //   174: astore_2
    //   175: goto -8 -> 167
    //
    // Exception table:
    //   from	to	target	type
    //   33	64	163	java/lang/Throwable
    //   82	87	174	java/lang/Throwable
    //   104	132	174	java/lang/Throwable
    //   138	145	174	java/lang/Throwable
    //   147	152	174	java/lang/Throwable
  }

  public static String e(String paramString)
  {
    AppMethodBeat.i(97818);
    String str1 = "";
    String str2 = str1;
    try
    {
      FileInputStream localFileInputStream = new java/io/FileInputStream;
      str2 = str1;
      localFileInputStream.<init>(paramString);
      str2 = str1;
      byte[] arrayOfByte = new byte[localFileInputStream.available()];
      str2 = str1;
      localFileInputStream.read(arrayOfByte);
      str2 = str1;
      str1 = EncodingUtils.getString(arrayOfByte, "UTF-8");
      str2 = str1;
      localFileInputStream.close();
      str2 = str1;
      AppMethodBeat.o(97818);
      return str2;
    }
    catch (Exception localException)
    {
      while (true)
        ag.d("Read file %s failed.", new Object[] { paramString });
    }
  }

  public static String f()
  {
    AppMethodBeat.i(97788);
    Object localObject1 = new StringBuilder();
    try
    {
      BufferedReader localBufferedReader = new java/io/BufferedReader;
      Object localObject2 = new java/io/FileReader;
      File localFile = new java/io/File;
      localFile.<init>("/sys/block/mmcblk0/device/type");
      ((FileReader)localObject2).<init>(localFile);
      localBufferedReader.<init>((Reader)localObject2);
      localObject2 = localBufferedReader.readLine();
      localBufferedReader.close();
      ((StringBuilder)localObject1).append((String)localObject2).append(",");
      localBufferedReader = new java/io/BufferedReader;
      localObject2 = new java/io/FileReader;
      localFile = new java/io/File;
      localFile.<init>("/sys/block/mmcblk0/device/name");
      ((FileReader)localObject2).<init>(localFile);
      localBufferedReader.<init>((Reader)localObject2);
      localObject2 = localBufferedReader.readLine();
      localBufferedReader.close();
      ((StringBuilder)localObject1).append((String)localObject2).append(",");
      localBufferedReader = new java/io/BufferedReader;
      localObject2 = new java/io/FileReader;
      localFile = new java/io/File;
      localFile.<init>("/sys/block/mmcblk0/device/cid");
      ((FileReader)localObject2).<init>(localFile);
      localBufferedReader.<init>((Reader)localObject2);
      localObject2 = localBufferedReader.readLine();
      localBufferedReader.close();
      ((StringBuilder)localObject1).append((String)localObject2);
      localObject1 = ((StringBuilder)localObject1).toString();
      AppMethodBeat.o(97788);
      return localObject1;
    }
    catch (Exception localException)
    {
      while (true)
        ag.a(localException);
    }
  }

  public static String f(Context paramContext)
  {
    AppMethodBeat.i(97786);
    if (a != null)
    {
      paramContext = g(paramContext);
      AppMethodBeat.o(97786);
    }
    while (true)
    {
      return paramContext;
      paramContext = "unknown";
      AppMethodBeat.o(97786);
    }
  }

  private static String f(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(97819);
    try
    {
      byte[] arrayOfByte = MessageDigest.getInstance("MD5").digest(paramString.getBytes());
      Object localObject = new java/lang/StringBuffer;
      ((StringBuffer)localObject).<init>();
      int j = arrayOfByte.length;
      while (i < j)
      {
        int k = arrayOfByte[i] & 0xFF;
        if (k < 16)
          ((StringBuffer)localObject).append(0);
        ((StringBuffer)localObject).append(Integer.toHexString(k));
        i++;
      }
      localObject = ((StringBuffer)localObject).toString();
      paramString = (String)localObject;
      AppMethodBeat.o(97819);
      return paramString;
    }
    catch (Exception localException)
    {
      while (true)
        ag.a(localException);
    }
  }

  public static String g()
  {
    AppMethodBeat.i(97817);
    try
    {
      SimpleDateFormat localSimpleDateFormat = new java/text/SimpleDateFormat;
      localSimpleDateFormat.<init>("yyyy-MM-dd", Locale.US);
      Object localObject = new java/util/Date;
      ((Date)localObject).<init>();
      localObject = localSimpleDateFormat.format((Date)localObject);
      AppMethodBeat.o(97817);
      return localObject;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        ag.a(localThrowable);
        String str = "";
        AppMethodBeat.o(97817);
      }
    }
  }

  public static String g(Context paramContext)
  {
    AppMethodBeat.i(97787);
    String str = "unknown";
    try
    {
      NetworkInfo localNetworkInfo = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      if (localNetworkInfo == null)
      {
        AppMethodBeat.o(97787);
        paramContext = str;
        return paramContext;
      }
      if (localNetworkInfo.getType() == 1)
        paramContext = "wifi";
      while (true)
      {
        AppMethodBeat.o(97787);
        break;
        if (localNetworkInfo.getType() != 0)
          break label277;
        paramContext = (TelephonyManager)paramContext.getSystemService("phone");
        if (paramContext == null)
          break label277;
        switch (paramContext.getNetworkType())
        {
        default:
          paramContext = "unknown";
          break;
        case 1:
          paramContext = "GPRS";
          break;
        case 2:
          paramContext = "EDGE";
          break;
        case 3:
          paramContext = "UMTS";
          break;
        case 8:
          paramContext = "HSDPA";
          break;
        case 9:
          paramContext = "HSUPA";
          break;
        case 10:
          paramContext = "HSPA";
          break;
        case 4:
          paramContext = "CDMA";
          break;
        case 5:
          paramContext = "EVDO_0";
          break;
        case 6:
          paramContext = "EVDO_A";
          break;
        case 7:
          paramContext = "1xRTT";
          break;
        case 11:
          paramContext = "iDen";
          break;
        case 12:
          paramContext = "EVDO_B";
          break;
        case 13:
          paramContext = "LTE";
          break;
        case 14:
          paramContext = "eHRPD";
          break;
        case 15:
          paramContext = "HSPA+";
        }
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        ag.a(paramContext);
        label277: paramContext = "unknown";
      }
    }
  }

  private static String g(String paramString)
  {
    AppMethodBeat.i(97820);
    String str = f(paramString);
    paramString = str;
    if (str != null);
    try
    {
      paramString = str.substring(8, 24);
      AppMethodBeat.o(97820);
      return paramString;
    }
    catch (Exception paramString)
    {
      while (true)
        paramString = str;
    }
  }

  // ERROR //
  public static com.tencent.tencentmap.mapsdk.maps.a.y h(Context paramContext)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: ldc 2
    //   4: monitorenter
    //   5: ldc_w 1184
    //   8: invokestatic 19	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   11: aload_0
    //   12: ifnonnull +26 -> 38
    //   15: ldc_w 1186
    //   18: iconst_0
    //   19: anewarray 4	java/lang/Object
    //   22: invokestatic 394	com/tencent/tencentmap/mapsdk/maps/a/ag:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   25: ldc_w 1184
    //   28: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   31: aconst_null
    //   32: astore_0
    //   33: ldc 2
    //   35: monitorexit
    //   36: aload_0
    //   37: areturn
    //   38: aload_0
    //   39: invokestatic 542	com/tencent/tencentmap/mapsdk/maps/a/r:a	(Landroid/content/Context;)Lcom/tencent/tencentmap/mapsdk/maps/a/r;
    //   42: invokevirtual 546	com/tencent/tencentmap/mapsdk/maps/a/r:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   45: astore_0
    //   46: aload_0
    //   47: ifnonnull +24 -> 71
    //   50: ldc_w 841
    //   53: iconst_0
    //   54: anewarray 4	java/lang/Object
    //   57: invokestatic 394	com/tencent/tencentmap/mapsdk/maps/a/ag:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   60: ldc_w 1184
    //   63: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   66: aconst_null
    //   67: astore_0
    //   68: goto -35 -> 33
    //   71: aload_0
    //   72: ldc_w 550
    //   75: aconst_null
    //   76: getstatic 1004	java/util/Locale:US	Ljava/util/Locale;
    //   79: ldc_w 1188
    //   82: iconst_2
    //   83: anewarray 4	java/lang/Object
    //   86: dup
    //   87: iconst_0
    //   88: ldc_w 571
    //   91: aastore
    //   92: dup
    //   93: iconst_1
    //   94: bipush 101
    //   96: invokestatic 578	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   99: aastore
    //   100: invokestatic 1191	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   103: aconst_null
    //   104: aconst_null
    //   105: aconst_null
    //   106: aconst_null
    //   107: invokevirtual 845	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   110: astore_2
    //   111: aload_2
    //   112: ifnull +290 -> 402
    //   115: aload_2
    //   116: astore_3
    //   117: aload_2
    //   118: invokeinterface 850 1 0
    //   123: ifeq +279 -> 402
    //   126: aload_1
    //   127: astore_0
    //   128: aload_2
    //   129: ifnull +33 -> 162
    //   132: aload_1
    //   133: astore_0
    //   134: aload_2
    //   135: astore_3
    //   136: aload_2
    //   137: invokeinterface 1194 1 0
    //   142: ifne +20 -> 162
    //   145: aload_2
    //   146: astore_3
    //   147: aload_2
    //   148: invokeinterface 1197 1 0
    //   153: istore 4
    //   155: iload 4
    //   157: ifeq +69 -> 226
    //   160: aload_1
    //   161: astore_0
    //   162: aload_0
    //   163: ifnull +25 -> 188
    //   166: aload_2
    //   167: astore_3
    //   168: ldc_w 1199
    //   171: iconst_1
    //   172: anewarray 4	java/lang/Object
    //   175: dup
    //   176: iconst_0
    //   177: aload_0
    //   178: invokevirtual 573	com/tencent/tencentmap/mapsdk/maps/a/y:b	()I
    //   181: invokestatic 578	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   184: aastore
    //   185: invokestatic 1201	com/tencent/tencentmap/mapsdk/maps/a/ag:g	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   188: aload_0
    //   189: astore_3
    //   190: aload_2
    //   191: ifnull +206 -> 397
    //   194: aload_0
    //   195: astore_3
    //   196: aload_2
    //   197: invokeinterface 863 1 0
    //   202: ifne +195 -> 397
    //   205: aload_2
    //   206: invokeinterface 864 1 0
    //   211: ldc_w 1184
    //   214: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   217: goto -184 -> 33
    //   220: astore_0
    //   221: ldc 2
    //   223: monitorexit
    //   224: aload_0
    //   225: athrow
    //   226: aload_2
    //   227: astore_3
    //   228: ldc_w 1203
    //   231: iconst_0
    //   232: anewarray 4	java/lang/Object
    //   235: invokestatic 54	com/tencent/tencentmap/mapsdk/maps/a/ag:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   238: aload_2
    //   239: astore_3
    //   240: new 564	com/tencent/tencentmap/mapsdk/maps/a/y
    //   243: astore_0
    //   244: aload_2
    //   245: astore_3
    //   246: aload_0
    //   247: invokespecial 1204	com/tencent/tencentmap/mapsdk/maps/a/y:<init>	()V
    //   250: aload_2
    //   251: astore_3
    //   252: aload_0
    //   253: aload_2
    //   254: aload_2
    //   255: ldc_w 552
    //   258: invokeinterface 853 2 0
    //   263: invokeinterface 860 2 0
    //   268: invokevirtual 592	com/tencent/tencentmap/mapsdk/maps/a/y:a	(J)V
    //   271: aload_2
    //   272: astore_3
    //   273: aload_0
    //   274: aload_2
    //   275: aload_2
    //   276: ldc_w 571
    //   279: invokeinterface 853 2 0
    //   284: invokeinterface 1208 2 0
    //   289: invokevirtual 1210	com/tencent/tencentmap/mapsdk/maps/a/y:a	(I)V
    //   292: aload_2
    //   293: astore_3
    //   294: aload_0
    //   295: aload_2
    //   296: aload_2
    //   297: ldc_w 583
    //   300: invokeinterface 853 2 0
    //   305: invokeinterface 1214 2 0
    //   310: invokevirtual 1216	com/tencent/tencentmap/mapsdk/maps/a/y:a	([B)V
    //   313: goto -151 -> 162
    //   316: astore_1
    //   317: aconst_null
    //   318: astore_0
    //   319: aconst_null
    //   320: astore_2
    //   321: aload_2
    //   322: astore_3
    //   323: aload_1
    //   324: invokestatic 222	com/tencent/tencentmap/mapsdk/maps/a/ag:a	(Ljava/lang/Throwable;)V
    //   327: aload_0
    //   328: astore_3
    //   329: aload_2
    //   330: ifnull +67 -> 397
    //   333: aload_0
    //   334: astore_3
    //   335: aload_2
    //   336: invokeinterface 863 1 0
    //   341: ifne +56 -> 397
    //   344: aload_2
    //   345: invokeinterface 864 1 0
    //   350: goto -139 -> 211
    //   353: astore_0
    //   354: aconst_null
    //   355: astore_3
    //   356: aload_3
    //   357: ifnull +18 -> 375
    //   360: aload_3
    //   361: invokeinterface 863 1 0
    //   366: ifne +9 -> 375
    //   369: aload_3
    //   370: invokeinterface 864 1 0
    //   375: ldc_w 1184
    //   378: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   381: aload_0
    //   382: athrow
    //   383: astore_0
    //   384: goto -28 -> 356
    //   387: astore_1
    //   388: aconst_null
    //   389: astore_0
    //   390: goto -69 -> 321
    //   393: astore_1
    //   394: goto -73 -> 321
    //   397: aload_3
    //   398: astore_0
    //   399: goto -188 -> 211
    //   402: aconst_null
    //   403: astore_0
    //   404: goto -216 -> 188
    //
    // Exception table:
    //   from	to	target	type
    //   5	11	220	finally
    //   15	31	220	finally
    //   60	66	220	finally
    //   196	211	220	finally
    //   211	217	220	finally
    //   335	350	220	finally
    //   360	375	220	finally
    //   375	383	220	finally
    //   38	46	316	java/lang/Throwable
    //   50	60	316	java/lang/Throwable
    //   71	111	316	java/lang/Throwable
    //   38	46	353	finally
    //   50	60	353	finally
    //   71	111	353	finally
    //   117	126	383	finally
    //   136	145	383	finally
    //   147	155	383	finally
    //   168	188	383	finally
    //   228	238	383	finally
    //   240	244	383	finally
    //   246	250	383	finally
    //   252	271	383	finally
    //   273	292	383	finally
    //   294	313	383	finally
    //   323	327	383	finally
    //   117	126	387	java/lang/Throwable
    //   136	145	387	java/lang/Throwable
    //   147	155	387	java/lang/Throwable
    //   228	238	387	java/lang/Throwable
    //   240	244	387	java/lang/Throwable
    //   246	250	387	java/lang/Throwable
    //   252	271	387	java/lang/Throwable
    //   273	292	387	java/lang/Throwable
    //   294	313	387	java/lang/Throwable
    //   168	188	393	java/lang/Throwable
  }

  // ERROR //
  public static int i(Context paramContext)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: ldc 2
    //   4: monitorenter
    //   5: ldc_w 1217
    //   8: invokestatic 19	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   11: aload_0
    //   12: ifnonnull +24 -> 36
    //   15: ldc_w 1219
    //   18: iconst_0
    //   19: anewarray 4	java/lang/Object
    //   22: invokestatic 394	com/tencent/tencentmap/mapsdk/maps/a/ag:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   25: ldc_w 1217
    //   28: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   31: ldc 2
    //   33: monitorexit
    //   34: iload_1
    //   35: ireturn
    //   36: aload_0
    //   37: invokestatic 542	com/tencent/tencentmap/mapsdk/maps/a/r:a	(Landroid/content/Context;)Lcom/tencent/tencentmap/mapsdk/maps/a/r;
    //   40: invokevirtual 546	com/tencent/tencentmap/mapsdk/maps/a/r:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
    //   43: astore_0
    //   44: aload_0
    //   45: ifnonnull +28 -> 73
    //   48: ldc_w 1221
    //   51: iconst_0
    //   52: anewarray 4	java/lang/Object
    //   55: invokestatic 31	com/tencent/tencentmap/mapsdk/maps/a/ag:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   58: ldc_w 1217
    //   61: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   64: goto -33 -> 31
    //   67: astore_0
    //   68: ldc 2
    //   70: monitorexit
    //   71: aload_0
    //   72: athrow
    //   73: aload_0
    //   74: ldc_w 550
    //   77: ldc_w 1223
    //   80: iconst_2
    //   81: anewarray 4	java/lang/Object
    //   84: dup
    //   85: iconst_0
    //   86: ldc_w 571
    //   89: aastore
    //   90: dup
    //   91: iconst_1
    //   92: bipush 101
    //   94: invokestatic 578	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   97: aastore
    //   98: invokestatic 1226	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   101: aconst_null
    //   102: invokevirtual 613	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   105: istore_1
    //   106: ldc_w 1228
    //   109: iconst_2
    //   110: anewarray 4	java/lang/Object
    //   113: dup
    //   114: iconst_0
    //   115: bipush 101
    //   117: invokestatic 578	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   120: aastore
    //   121: dup
    //   122: iconst_1
    //   123: iload_1
    //   124: invokestatic 578	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   127: aastore
    //   128: invokestatic 1201	com/tencent/tencentmap/mapsdk/maps/a/ag:g	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   131: ldc_w 1217
    //   134: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   137: goto -106 -> 31
    //   140: astore_0
    //   141: iconst_0
    //   142: istore_1
    //   143: aload_0
    //   144: invokestatic 222	com/tencent/tencentmap/mapsdk/maps/a/ag:a	(Ljava/lang/Throwable;)V
    //   147: goto -16 -> 131
    //   150: astore_0
    //   151: goto -8 -> 143
    //
    // Exception table:
    //   from	to	target	type
    //   5	11	67	finally
    //   15	31	67	finally
    //   36	44	67	finally
    //   48	58	67	finally
    //   58	64	67	finally
    //   73	106	67	finally
    //   106	131	67	finally
    //   131	137	67	finally
    //   143	147	67	finally
    //   36	44	140	java/lang/Throwable
    //   48	58	140	java/lang/Throwable
    //   73	106	140	java/lang/Throwable
    //   106	131	150	java/lang/Throwable
  }

  public static int j(Context paramContext)
  {
    AppMethodBeat.i(97796);
    ag.a(" RecordDAO.countRecordNum() start", new Object[0]);
    int i;
    if (paramContext == null)
    {
      ag.d(" countRecordNum() have null args!", new Object[0]);
      i = -1;
      AppMethodBeat.o(97796);
    }
    while (true)
    {
      return i;
      i = p.b(paramContext, new int[] { 1 });
      AppMethodBeat.o(97796);
    }
  }

  public static String k(Context paramContext)
  {
    AppMethodBeat.i(97822);
    try
    {
      Object localObject1 = aq.a(paramContext).d();
      paramContext = "";
      Object localObject2 = c.m();
      if (localObject2 != null)
        paramContext = ((c)localObject2).j();
      int i = (int)(Math.random() * 2147483647.0D);
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      paramContext = ((StringBuilder)localObject2).append(paramContext).append("_").append((String)localObject1).append("_");
      localObject1 = new java/util/Date;
      ((Date)localObject1).<init>();
      paramContext = g(((Date)localObject1).getTime() + "_" + i);
      AppMethodBeat.o(97822);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        paramContext = null;
        AppMethodBeat.o(97822);
      }
    }
  }

  public static boolean l(Context paramContext)
  {
    boolean bool = true;
    AppMethodBeat.i(97825);
    paramContext = o(paramContext);
    if ((paramContext != null) && (paramContext.getType() == 1))
      AppMethodBeat.o(97825);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(97825);
    }
  }

  public static boolean m(Context paramContext)
  {
    AppMethodBeat.i(97826);
    paramContext = o(paramContext);
    boolean bool;
    if ((paramContext != null) && (paramContext.isConnected()))
    {
      bool = true;
      AppMethodBeat.o(97826);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(97826);
    }
  }

  public static String n(Context paramContext)
  {
    AppMethodBeat.i(97827);
    paramContext = o(paramContext);
    if (paramContext == null)
    {
      paramContext = "unknown";
      AppMethodBeat.o(97827);
    }
    while (true)
    {
      return paramContext;
      if (paramContext.getType() == 1)
      {
        paramContext = "wifi";
        AppMethodBeat.o(97827);
      }
      else
      {
        String str = paramContext.getExtraInfo();
        paramContext = str;
        if (str != null)
        {
          paramContext = str;
          if (str.length() > 64)
            paramContext = str.substring(0, 64);
        }
        AppMethodBeat.o(97827);
      }
    }
  }

  private static NetworkInfo o(Context paramContext)
  {
    AppMethodBeat.i(97824);
    try
    {
      paramContext = (ConnectivityManager)paramContext.getSystemService("connectivity");
      if (paramContext == null)
      {
        AppMethodBeat.o(97824);
        paramContext = null;
      }
      while (true)
      {
        return paramContext;
        paramContext = paramContext.getActiveNetworkInfo();
        AppMethodBeat.o(97824);
      }
    }
    catch (Throwable paramContext)
    {
      while (true)
      {
        ag.a(paramContext);
        AppMethodBeat.o(97824);
        paramContext = null;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.e
 * JD-Core Version:    0.6.2
 */
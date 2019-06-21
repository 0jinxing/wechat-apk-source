package com.tencent.tencentmap.mapsdk.maps.a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.tencent.map.lib.basemap.data.GeoPoint;
import com.tencent.map.lib.util.StringUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.aq;
import com.tencent.tencentmap.mapsdk.a.db;
import com.tencent.tencentmap.mapsdk.a.du;
import com.tencent.tencentmap.mapsdk.a.w;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ic
{
  private static String A;
  private static String B;
  private static int C;
  private static String D;
  private static int E;
  public static String a;
  public static String b;
  public static String c;
  public static float d;
  public static int e;
  public static int f;
  public static int g;
  public static int h;
  public static boolean i;
  public static Bitmap j;
  public static final int k;
  public static String l;
  public static int m;
  public static int n;
  public static int o;
  public static int p;
  public static int q;
  public static int r;
  public static float s;
  public static aq t;
  private static String u;
  private static String v;
  private static String w;
  private static String x;
  private static String y;
  private static String z;

  static
  {
    AppMethodBeat.i(99834);
    a = null;
    b = "TencentMapSDK";
    u = null;
    v = null;
    w = null;
    x = null;
    y = null;
    z = null;
    A = null;
    B = null;
    C = 0;
    D = null;
    c = "undefined";
    d = 1.0F;
    e = 2;
    f = 0;
    g = 0;
    h = 0;
    i = false;
    j = null;
    k = Color.argb(200, 0, 163, 255);
    l = "tencentmap/mapsdk_vector/mark_location_big.png";
    m = 2;
    n = 4000000;
    o = 53500000;
    p = 73670000;
    q = 135100000;
    E = 0;
    r = 160;
    s = 0.0F;
    t = null;
    AppMethodBeat.o(99834);
  }

  public static double a(double paramDouble1, double paramDouble2)
  {
    AppMethodBeat.i(99831);
    paramDouble1 = 6.698324247899813D * paramDouble1 / Math.cos(0.0174532925199433D * paramDouble2);
    AppMethodBeat.o(99831);
    return paramDouble1;
  }

  public static Bitmap a(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(99824);
    Object localObject = null;
    try
    {
      paramContext = BitmapFactory.decodeResource(paramContext.getResources(), paramInt);
      AppMethodBeat.o(99824);
      return paramContext;
    }
    catch (OutOfMemoryError paramContext)
    {
      while (true)
        paramContext = localObject;
    }
  }

  // ERROR //
  public static final Bitmap a(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aconst_null
    //   3: astore_3
    //   4: ldc 162
    //   6: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_1
    //   10: ifnull +17 -> 27
    //   13: aload_1
    //   14: invokevirtual 168	java/lang/String:trim	()Ljava/lang/String;
    //   17: invokevirtual 172	java/lang/String:length	()I
    //   20: istore 4
    //   22: iload 4
    //   24: ifne +12 -> 36
    //   27: ldc 162
    //   29: invokestatic 129	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   32: aload_3
    //   33: astore_0
    //   34: aload_0
    //   35: areturn
    //   36: aload_1
    //   37: invokevirtual 168	java/lang/String:trim	()Ljava/lang/String;
    //   40: iconst_0
    //   41: invokevirtual 176	java/lang/String:charAt	(I)C
    //   44: bipush 47
    //   46: if_icmpeq +60 -> 106
    //   49: new 178	java/lang/StringBuilder
    //   52: astore_3
    //   53: aload_3
    //   54: invokespecial 181	java/lang/StringBuilder:<init>	()V
    //   57: aload_3
    //   58: aload_0
    //   59: invokevirtual 185	android/content/Context:getFilesDir	()Ljava/io/File;
    //   62: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   65: ldc 191
    //   67: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   70: aload_1
    //   71: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   74: invokevirtual 197	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   77: astore_1
    //   78: new 199	java/io/FileInputStream
    //   81: astore_0
    //   82: aload_0
    //   83: aload_1
    //   84: invokespecial 202	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   87: aload_0
    //   88: invokestatic 206	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   91: astore_1
    //   92: aload_0
    //   93: invokevirtual 211	java/io/InputStream:close	()V
    //   96: aload_1
    //   97: astore_0
    //   98: ldc 162
    //   100: invokestatic 129	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   103: goto -69 -> 34
    //   106: new 178	java/lang/StringBuilder
    //   109: astore_3
    //   110: aload_3
    //   111: invokespecial 181	java/lang/StringBuilder:<init>	()V
    //   114: aload_3
    //   115: aload_0
    //   116: invokevirtual 185	android/content/Context:getFilesDir	()Ljava/io/File;
    //   119: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   122: aload_1
    //   123: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   126: invokevirtual 197	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   129: astore_1
    //   130: goto -52 -> 78
    //   133: astore_0
    //   134: aconst_null
    //   135: astore_1
    //   136: aload_2
    //   137: astore_0
    //   138: aload_1
    //   139: ifnull -41 -> 98
    //   142: aload_1
    //   143: invokevirtual 211	java/io/InputStream:close	()V
    //   146: aload_2
    //   147: astore_0
    //   148: goto -50 -> 98
    //   151: astore_0
    //   152: aload_2
    //   153: astore_0
    //   154: goto -56 -> 98
    //   157: astore_0
    //   158: aconst_null
    //   159: astore_1
    //   160: aload_1
    //   161: ifnull +7 -> 168
    //   164: aload_1
    //   165: invokevirtual 211	java/io/InputStream:close	()V
    //   168: ldc 162
    //   170: invokestatic 129	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   173: aload_0
    //   174: athrow
    //   175: astore_0
    //   176: aload_1
    //   177: astore_0
    //   178: goto -80 -> 98
    //   181: astore_1
    //   182: goto -14 -> 168
    //   185: astore_1
    //   186: aload_0
    //   187: astore_2
    //   188: aload_1
    //   189: astore_0
    //   190: aload_2
    //   191: astore_1
    //   192: goto -32 -> 160
    //   195: astore_1
    //   196: aload_0
    //   197: astore_1
    //   198: goto -62 -> 136
    //
    // Exception table:
    //   from	to	target	type
    //   13	22	133	java/lang/Exception
    //   36	78	133	java/lang/Exception
    //   78	87	133	java/lang/Exception
    //   106	130	133	java/lang/Exception
    //   142	146	151	java/lang/Exception
    //   13	22	157	finally
    //   36	78	157	finally
    //   78	87	157	finally
    //   106	130	157	finally
    //   92	96	175	java/lang/Exception
    //   164	168	181	java/lang/Exception
    //   87	92	185	finally
    //   87	92	195	java/lang/Exception
  }

  public static final Bitmap a(Bitmap paramBitmap)
  {
    AppMethodBeat.i(99821);
    Object localObject = null;
    try
    {
      paramBitmap = Bitmap.createBitmap(paramBitmap);
      AppMethodBeat.o(99821);
      return paramBitmap;
    }
    catch (OutOfMemoryError paramBitmap)
    {
      while (true)
        paramBitmap = localObject;
    }
  }

  public static GeoPoint a(db paramdb)
  {
    AppMethodBeat.i(99827);
    if (paramdb == null)
    {
      paramdb = null;
      AppMethodBeat.o(99827);
    }
    while (true)
    {
      return paramdb;
      paramdb = new GeoPoint((int)(paramdb.a * 1000000.0D), (int)(paramdb.b * 1000000.0D));
      AppMethodBeat.o(99827);
    }
  }

  public static db a(GeoPoint paramGeoPoint)
  {
    AppMethodBeat.i(99829);
    if (paramGeoPoint == null)
    {
      paramGeoPoint = null;
      AppMethodBeat.o(99829);
    }
    while (true)
    {
      return paramGeoPoint;
      paramGeoPoint = new db(paramGeoPoint.getLatitudeE6() / 1000000.0D, paramGeoPoint.getLongitudeE6() / 1000000.0D);
      AppMethodBeat.o(99829);
    }
  }

  public static db a(db paramdb1, db paramdb2)
  {
    AppMethodBeat.i(99833);
    paramdb1 = new db(paramdb1.a * 2.0D - paramdb2.a, paramdb1.b * 2.0D - paramdb2.b);
    AppMethodBeat.o(99833);
    return paramdb1;
  }

  public static String a()
  {
    if (z == null);
    for (String str = ""; ; str = z)
      return str;
  }

  public static String a(int paramInt)
  {
    AppMethodBeat.i(99808);
    String str = String.format("key=%s&appid=sdk&logid=ditu&ver=%s&suid=%s&pf=%s&hm=%s&os=%s&nt=%s&dpi=%s&scrn=%s&pname=%s&pid=%s&psv=%s&wtc=%s", new Object[] { a, "4.2.2.1", z, "androidsdk", D, Integer.toString(C), A, Integer.toString(r), y, w, B, x, Integer.toString(paramInt) });
    AppMethodBeat.o(99808);
    return str;
  }

  public static String a(String paramString)
  {
    AppMethodBeat.i(99807);
    paramString = String.format("/fileupdate?sdkver=%s&pf=%s&fr=02001&imei=%s&appsuid=%s&nettp=%s&api_key=%s", new Object[] { "4.2.2", "androidsdk", a(), B, A, paramString });
    AppMethodBeat.o(99807);
    return paramString;
  }

  public static String a(String paramString1, String paramString2)
  {
    AppMethodBeat.i(99806);
    if (!StringUtil.isEmpty(paramString1));
    while (true)
    {
      if (!StringUtil.isEmpty(paramString2));
      while (true)
      {
        paramString1 = String.format("https://apikey.map.qq.com/mkey/index.php/mkey/check?key=%s&pid=%s&key2=%s&pid2=%s&channel=1&output=json&uuid=unknown&hm=%s&suid=%s&os=%s&psv=%s&ver=%s&dpi=%s&pf=%s&nt=%s", new Object[] { a, B, paramString1, paramString2, D, z, Integer.valueOf(C), x, "4.2.2.1", y, "androidsdk", A });
        AppMethodBeat.o(99806);
        return paramString1;
        paramString2 = "";
      }
      paramString1 = "";
    }
  }

  public static List<GeoPoint> a(List<db> paramList)
  {
    AppMethodBeat.i(99828);
    if ((paramList == null) || (paramList.isEmpty()))
    {
      paramList = null;
      AppMethodBeat.o(99828);
    }
    while (true)
    {
      return paramList;
      int i1 = paramList.size();
      ArrayList localArrayList = new ArrayList(i1);
      for (int i2 = 0; i2 < i1; i2++)
      {
        Object localObject = (db)paramList.get(i2);
        if (localObject != null)
        {
          localObject = a((db)localObject);
          if (localObject != null)
            localArrayList.add(localObject);
        }
      }
      AppMethodBeat.o(99828);
      paramList = localArrayList;
    }
  }

  public static void a(Context paramContext)
  {
    AppMethodBeat.i(99805);
    if (D == null);
    try
    {
      String str = Build.MODEL;
      D = str;
      str = d(str);
      D = str;
      D = URLEncoder.encode(str, "utf-8");
      label39: if (C == 0)
        C = Build.VERSION.SDK_INT;
      if (B == null);
      try
      {
        str = paramContext.getPackageName();
        B = str;
        str = d(str);
        B = str;
        B = URLEncoder.encode(str, "utf-8");
        label85: if (w == null);
        try
        {
          str = g(paramContext);
          w = str;
          str = d(str);
          w = str;
          w = URLEncoder.encode(str, "utf-8");
          label119: if (x == null);
          try
          {
            str = h(paramContext);
            x = str;
            str = d(str);
            x = str;
            x = URLEncoder.encode(str, "utf-8");
            label153: if (y == null);
            try
            {
              str = i(paramContext);
              y = str;
              str = d(str);
              y = str;
              y = URLEncoder.encode(str, "utf-8");
              label187: if (z == null);
              try
              {
                str = f(paramContext);
                z = str;
                str = d(str);
                z = str;
                z = URLEncoder.encode(str, "utf-8");
                label221: if (A == null);
                try
                {
                  str = du.c(paramContext);
                  A = str;
                  str = d(str);
                  A = str;
                  A = URLEncoder.encode(str, "utf-8");
                  label255: if (v == null);
                  try
                  {
                    str = e(paramContext);
                    v = str;
                    str = e(str);
                    v = str;
                    v = URLEncoder.encode(str, "utf-8");
                    label289: if (u == null);
                    try
                    {
                      str = d(paramContext);
                      u = str;
                      str = d(str);
                      u = str;
                      u = URLEncoder.encode(str, "utf-8");
                      label323: if (a == null);
                      try
                      {
                        str = c(paramContext);
                        a = str;
                        a = URLEncoder.encode(str, "utf-8");
                        label348: if (d == 1.0F)
                          d = 320.0F / paramContext.getResources().getDisplayMetrics().densityDpi;
                        s = paramContext.getResources().getDisplayMetrics().density;
                        i = w.a(paramContext).c("worldMapEnabled");
                        AppMethodBeat.o(99805);
                        return;
                      }
                      catch (Exception localException1)
                      {
                        break label348;
                      }
                    }
                    catch (Exception localException2)
                    {
                      break label323;
                    }
                  }
                  catch (Exception localException3)
                  {
                    break label289;
                  }
                }
                catch (Exception localException4)
                {
                  break label255;
                }
              }
              catch (Exception localException5)
              {
                break label221;
              }
            }
            catch (Exception localException6)
            {
              break label187;
            }
          }
          catch (Exception localException7)
          {
            break label153;
          }
        }
        catch (Exception localException8)
        {
          break label119;
        }
      }
      catch (Exception localException9)
      {
        break label85;
      }
    }
    catch (Exception localException10)
    {
      break label39;
    }
  }

  private static void a(DisplayMetrics paramDisplayMetrics)
  {
    AppMethodBeat.i(99816);
    Object localObject = null;
    try
    {
      Field localField = paramDisplayMetrics.getClass().getField("densityDpi");
      localObject = localField;
      label21: if (localObject != null);
      while (true)
      {
        try
        {
          r = localObject.getInt(paramDisplayMetrics);
          c();
          AppMethodBeat.o(99816);
          return;
        }
        catch (IllegalArgumentException paramDisplayMetrics)
        {
          AppMethodBeat.o(99816);
          continue;
        }
        catch (IllegalAccessException paramDisplayMetrics)
        {
          AppMethodBeat.o(99816);
          continue;
        }
        d();
        AppMethodBeat.o(99816);
      }
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      break label21;
    }
    catch (SecurityException localSecurityException)
    {
      break label21;
    }
  }

  public static void a(boolean paramBoolean)
  {
    if (paramBoolean == true)
    {
      p = 73670000;
      q = 135100000;
      o = 53500000;
    }
    for (n = 4000000; ; n = -85000000)
    {
      return;
      p = -180000000;
      q = 180000000;
      o = 85000000;
    }
  }

  public static int b(String paramString1, String paramString2)
  {
    AppMethodBeat.i(99832);
    int i1;
    if (StringUtil.isEmpty(paramString2))
    {
      AppMethodBeat.o(99832);
      i1 = 1;
    }
    while (true)
    {
      return i1;
      if (StringUtil.isEmpty(paramString1))
      {
        AppMethodBeat.o(99832);
        i1 = -1;
      }
      else
      {
        paramString1 = paramString1.split("\\.");
        paramString2 = paramString2.split("\\.");
        int i2 = paramString1.length;
        i1 = i2;
        if (i2 > paramString2.length)
          i1 = paramString2.length;
        for (i2 = 0; ; i2++)
        {
          if (i2 >= i1)
            break label148;
          if (Integer.valueOf(paramString2[i2]).intValue() < Integer.valueOf(paramString1[i2]).intValue())
          {
            AppMethodBeat.o(99832);
            i1 = 1;
            break;
          }
          if (Integer.valueOf(paramString2[i2]).intValue() > Integer.valueOf(paramString1[i2]).intValue())
          {
            AppMethodBeat.o(99832);
            i1 = -1;
            break;
          }
        }
        label148: if (paramString1.length > paramString2.length)
        {
          AppMethodBeat.o(99832);
          i1 = 1;
        }
        else if (paramString1.length == paramString2.length)
        {
          AppMethodBeat.o(99832);
          i1 = 0;
        }
        else
        {
          AppMethodBeat.o(99832);
          i1 = -1;
        }
      }
    }
  }

  // ERROR //
  public static final Bitmap b(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: ldc_w 433
    //   5: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: new 178	java/lang/StringBuilder
    //   11: astore_3
    //   12: aload_3
    //   13: invokespecial 181	java/lang/StringBuilder:<init>	()V
    //   16: aload_3
    //   17: aload_0
    //   18: invokestatic 438	com/tencent/tencentmap/mapsdk/a/r:a	(Landroid/content/Context;)Lcom/tencent/tencentmap/mapsdk/a/r;
    //   21: invokevirtual 440	com/tencent/tencentmap/mapsdk/a/r:e	()Ljava/lang/String;
    //   24: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   27: aload_1
    //   28: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   31: invokevirtual 197	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   34: invokestatic 445	com/tencent/tencentmap/mapsdk/a/v:b	(Ljava/lang/String;)Ljava/io/InputStream;
    //   37: astore 4
    //   39: aload 4
    //   41: astore_3
    //   42: aload 4
    //   44: ifnonnull +84 -> 128
    //   47: aload 4
    //   49: astore 5
    //   51: aload 4
    //   53: astore 6
    //   55: aload 4
    //   57: astore 7
    //   59: invokestatic 448	com/tencent/tencentmap/mapsdk/a/t:a	()Ljava/lang/String;
    //   62: ifnull +129 -> 191
    //   65: aload 4
    //   67: astore 5
    //   69: aload 4
    //   71: astore 6
    //   73: aload 4
    //   75: astore 7
    //   77: new 178	java/lang/StringBuilder
    //   80: astore_3
    //   81: aload 4
    //   83: astore 5
    //   85: aload 4
    //   87: astore 6
    //   89: aload 4
    //   91: astore 7
    //   93: aload_3
    //   94: invokespecial 181	java/lang/StringBuilder:<init>	()V
    //   97: aload 4
    //   99: astore 5
    //   101: aload 4
    //   103: astore 6
    //   105: aload 4
    //   107: astore 7
    //   109: aload_0
    //   110: aload_3
    //   111: invokestatic 448	com/tencent/tencentmap/mapsdk/a/t:a	()Ljava/lang/String;
    //   114: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   117: aload_1
    //   118: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   121: invokevirtual 197	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   124: invokestatic 451	com/tencent/tencentmap/mapsdk/a/t:b	(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;
    //   127: astore_3
    //   128: aload_3
    //   129: astore 4
    //   131: aload_3
    //   132: ifnonnull +28 -> 160
    //   135: aload_3
    //   136: astore 5
    //   138: aload_3
    //   139: astore 6
    //   141: aload_3
    //   142: astore 7
    //   144: aload_0
    //   145: ldc_w 453
    //   148: aload_1
    //   149: invokestatic 456	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   152: invokevirtual 459	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   155: invokestatic 451	com/tencent/tencentmap/mapsdk/a/t:b	(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;
    //   158: astore 4
    //   160: aload 4
    //   162: astore 5
    //   164: aload 4
    //   166: astore 6
    //   168: aload 4
    //   170: astore 7
    //   172: aload 4
    //   174: invokestatic 206	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   177: astore_0
    //   178: aload 4
    //   180: invokestatic 462	com/tencent/tencentmap/mapsdk/a/v:a	(Ljava/io/Closeable;)V
    //   183: ldc_w 433
    //   186: invokestatic 129	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   189: aload_0
    //   190: areturn
    //   191: aload 4
    //   193: astore_3
    //   194: aload 4
    //   196: astore 5
    //   198: aload 4
    //   200: astore 6
    //   202: aload 4
    //   204: astore 7
    //   206: invokestatic 464	com/tencent/tencentmap/mapsdk/a/t:b	()Ljava/lang/String;
    //   209: ifnull -81 -> 128
    //   212: aload 4
    //   214: astore 5
    //   216: aload 4
    //   218: astore 6
    //   220: aload 4
    //   222: astore 7
    //   224: new 178	java/lang/StringBuilder
    //   227: astore_3
    //   228: aload 4
    //   230: astore 5
    //   232: aload 4
    //   234: astore 6
    //   236: aload 4
    //   238: astore 7
    //   240: aload_3
    //   241: invokespecial 181	java/lang/StringBuilder:<init>	()V
    //   244: aload 4
    //   246: astore 5
    //   248: aload 4
    //   250: astore 6
    //   252: aload 4
    //   254: astore 7
    //   256: aload_3
    //   257: invokestatic 464	com/tencent/tencentmap/mapsdk/a/t:b	()Ljava/lang/String;
    //   260: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   263: aload_1
    //   264: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   267: invokevirtual 197	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   270: invokestatic 445	com/tencent/tencentmap/mapsdk/a/v:b	(Ljava/lang/String;)Ljava/io/InputStream;
    //   273: astore_3
    //   274: goto -146 -> 128
    //   277: astore_0
    //   278: aconst_null
    //   279: astore 7
    //   281: aload 7
    //   283: invokestatic 462	com/tencent/tencentmap/mapsdk/a/v:a	(Ljava/io/Closeable;)V
    //   286: aload_2
    //   287: astore_0
    //   288: goto -105 -> 183
    //   291: astore_0
    //   292: aconst_null
    //   293: astore 6
    //   295: aload 6
    //   297: invokestatic 462	com/tencent/tencentmap/mapsdk/a/v:a	(Ljava/io/Closeable;)V
    //   300: aload_2
    //   301: astore_0
    //   302: goto -119 -> 183
    //   305: astore_0
    //   306: aconst_null
    //   307: astore_1
    //   308: aload_1
    //   309: invokestatic 462	com/tencent/tencentmap/mapsdk/a/v:a	(Ljava/io/Closeable;)V
    //   312: ldc_w 433
    //   315: invokestatic 129	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   318: aload_0
    //   319: athrow
    //   320: astore_0
    //   321: aload 5
    //   323: astore_1
    //   324: goto -16 -> 308
    //   327: astore_0
    //   328: goto -33 -> 295
    //   331: astore_0
    //   332: goto -51 -> 281
    //
    // Exception table:
    //   from	to	target	type
    //   8	39	277	java/lang/Exception
    //   8	39	291	java/lang/OutOfMemoryError
    //   8	39	305	finally
    //   59	65	320	finally
    //   77	81	320	finally
    //   93	97	320	finally
    //   109	128	320	finally
    //   144	160	320	finally
    //   172	178	320	finally
    //   206	212	320	finally
    //   224	228	320	finally
    //   240	244	320	finally
    //   256	274	320	finally
    //   59	65	327	java/lang/OutOfMemoryError
    //   77	81	327	java/lang/OutOfMemoryError
    //   93	97	327	java/lang/OutOfMemoryError
    //   109	128	327	java/lang/OutOfMemoryError
    //   144	160	327	java/lang/OutOfMemoryError
    //   172	178	327	java/lang/OutOfMemoryError
    //   206	212	327	java/lang/OutOfMemoryError
    //   224	228	327	java/lang/OutOfMemoryError
    //   240	244	327	java/lang/OutOfMemoryError
    //   256	274	327	java/lang/OutOfMemoryError
    //   59	65	331	java/lang/Exception
    //   77	81	331	java/lang/Exception
    //   93	97	331	java/lang/Exception
    //   109	128	331	java/lang/Exception
    //   144	160	331	java/lang/Exception
    //   172	178	331	java/lang/Exception
    //   206	212	331	java/lang/Exception
    //   224	228	331	java/lang/Exception
    //   240	244	331	java/lang/Exception
    //   256	274	331	java/lang/Exception
  }

  public static Bitmap b(Bitmap paramBitmap)
  {
    AppMethodBeat.i(99825);
    Bitmap localBitmap = paramBitmap;
    int i1;
    int i2;
    if (paramBitmap != null)
    {
      float f1 = paramBitmap.getWidth();
      float f2 = paramBitmap.getHeight();
      i1 = (int)(f1 / d);
      i2 = (int)(f2 / d);
    }
    try
    {
      localBitmap = Bitmap.createScaledBitmap(paramBitmap, i1, i2, true);
      AppMethodBeat.o(99825);
      return localBitmap;
    }
    catch (OutOfMemoryError paramBitmap)
    {
      while (true)
      {
        localBitmap = null;
        AppMethodBeat.o(99825);
      }
    }
  }

  public static final Bitmap b(String paramString)
  {
    AppMethodBeat.i(99822);
    Object localObject = null;
    try
    {
      paramString = BitmapFactory.decodeFile(paramString);
      AppMethodBeat.o(99822);
      return paramString;
    }
    catch (OutOfMemoryError paramString)
    {
      while (true)
        paramString = localObject;
    }
  }

  public static String b()
  {
    if (A == null);
    for (String str = ""; ; str = A)
      return str;
  }

  public static void b(Context paramContext)
  {
    AppMethodBeat.i(99819);
    if (paramContext == null)
      AppMethodBeat.o(99819);
    while (true)
    {
      return;
      paramContext = paramContext.getResources().getDisplayMetrics();
      E = paramContext.widthPixels * paramContext.heightPixels;
      if (Build.VERSION.SDK_INT < 24)
      {
        a(paramContext);
        AppMethodBeat.o(99819);
      }
      else
      {
        b(paramContext);
        AppMethodBeat.o(99819);
      }
    }
  }

  private static void b(DisplayMetrics paramDisplayMetrics)
  {
    AppMethodBeat.i(99817);
    r = paramDisplayMetrics.densityDpi;
    c();
    AppMethodBeat.o(99817);
  }

  // ERROR //
  public static final Bitmap c(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aconst_null
    //   3: astore_3
    //   4: ldc_w 493
    //   7: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   10: aload_0
    //   11: invokevirtual 497	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   14: astore_0
    //   15: aload_0
    //   16: aload_1
    //   17: invokevirtual 502	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   20: astore_0
    //   21: aload_0
    //   22: invokestatic 206	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   25: astore_1
    //   26: aload_0
    //   27: invokestatic 462	com/tencent/tencentmap/mapsdk/a/v:a	(Ljava/io/Closeable;)V
    //   30: aload_1
    //   31: astore_0
    //   32: ldc_w 493
    //   35: invokestatic 129	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   38: aload_0
    //   39: areturn
    //   40: astore_0
    //   41: aconst_null
    //   42: astore_0
    //   43: aload_0
    //   44: invokestatic 462	com/tencent/tencentmap/mapsdk/a/v:a	(Ljava/io/Closeable;)V
    //   47: ldc_w 493
    //   50: invokestatic 129	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   53: aload_2
    //   54: astore_0
    //   55: goto -17 -> 38
    //   58: astore_0
    //   59: aconst_null
    //   60: astore_0
    //   61: aload_0
    //   62: invokestatic 462	com/tencent/tencentmap/mapsdk/a/v:a	(Ljava/io/Closeable;)V
    //   65: aload_3
    //   66: astore_0
    //   67: goto -35 -> 32
    //   70: astore_1
    //   71: aconst_null
    //   72: astore_0
    //   73: aload_0
    //   74: invokestatic 462	com/tencent/tencentmap/mapsdk/a/v:a	(Ljava/io/Closeable;)V
    //   77: ldc_w 493
    //   80: invokestatic 129	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   83: aload_1
    //   84: athrow
    //   85: astore_1
    //   86: goto -13 -> 73
    //   89: astore_1
    //   90: goto -29 -> 61
    //   93: astore_1
    //   94: goto -51 -> 43
    //
    // Exception table:
    //   from	to	target	type
    //   15	21	40	java/lang/Exception
    //   15	21	58	java/lang/OutOfMemoryError
    //   15	21	70	finally
    //   21	26	85	finally
    //   21	26	89	java/lang/OutOfMemoryError
    //   21	26	93	java/lang/Exception
  }

  private static String c(Context paramContext)
  {
    AppMethodBeat.i(99809);
    if (paramContext == null)
    {
      paramContext = "";
      AppMethodBeat.o(99809);
    }
    while (true)
    {
      return paramContext;
      String str = paramContext.getPackageName();
      Object localObject = null;
      try
      {
        paramContext = paramContext.getPackageManager().getApplicationInfo(str, 128);
        if (paramContext == null)
        {
          paramContext = "";
          AppMethodBeat.o(99809);
          continue;
        }
        if (paramContext.metaData == null)
        {
          paramContext = "";
          AppMethodBeat.o(99809);
          continue;
        }
        paramContext = paramContext.metaData.getString(b);
        AppMethodBeat.o(99809);
      }
      catch (PackageManager.NameNotFoundException paramContext)
      {
        while (true)
          paramContext = localObject;
      }
    }
  }

  public static String c(String paramString)
  {
    AppMethodBeat.i(99830);
    StringBuilder localStringBuilder = new StringBuilder(256);
    if (!TextUtils.isEmpty(z))
    {
      localStringBuilder.append("&deviceid=");
      localStringBuilder.append(z);
    }
    if (!TextUtils.isEmpty(B))
    {
      localStringBuilder.append("&appid=");
      localStringBuilder.append(B);
    }
    if (!TextUtils.isEmpty("4.2.2"))
    {
      localStringBuilder.append("&sdkver=");
      localStringBuilder.append("4.2.2");
    }
    if (!TextUtils.isEmpty(paramString))
    {
      localStringBuilder.append("&ui=");
      localStringBuilder.append(paramString);
    }
    if (!TextUtils.isEmpty(c))
      localStringBuilder.append("&appsuid=");
    try
    {
      localStringBuilder.append(URLEncoder.encode(c, "UTF-8"));
      localStringBuilder.append("&api_key=" + a);
      paramString = localStringBuilder.toString();
      AppMethodBeat.o(99830);
      return paramString;
    }
    catch (UnsupportedEncodingException paramString)
    {
      while (true)
        localStringBuilder.append(e(c));
    }
  }

  private static void c()
  {
    AppMethodBeat.i(99818);
    if (r <= 120)
    {
      m = 1;
      AppMethodBeat.o(99818);
    }
    while (true)
    {
      return;
      if (r <= 160)
      {
        m = 2;
        AppMethodBeat.o(99818);
      }
      else if (r <= 240)
      {
        m = 3;
        AppMethodBeat.o(99818);
      }
      else
      {
        d();
        AppMethodBeat.o(99818);
      }
    }
  }

  private static String d(Context paramContext)
  {
    AppMethodBeat.i(99810);
    if (paramContext == null)
    {
      paramContext = "";
      AppMethodBeat.o(99810);
    }
    while (true)
    {
      return paramContext;
      paramContext = (TelephonyManager)paramContext.getSystemService("phone");
      if (paramContext == null)
      {
        paramContext = "";
        AppMethodBeat.o(99810);
      }
      else
      {
        String str = paramContext.getSubscriberId();
        paramContext = str;
        if (str == null)
          paramContext = "";
        AppMethodBeat.o(99810);
      }
    }
  }

  private static String d(String paramString)
  {
    AppMethodBeat.i(99803);
    if (paramString == null)
    {
      paramString = "";
      AppMethodBeat.o(99803);
    }
    while (true)
    {
      return paramString;
      paramString = paramString.replace("&", "").replace("#", "").replace("?", "");
      AppMethodBeat.o(99803);
    }
  }

  private static void d()
  {
    if (E > 153600)
      m = 3;
    while (true)
    {
      return;
      if (E < 153600)
        m = 1;
      else
        m = 2;
    }
  }

  private static String e(Context paramContext)
  {
    AppMethodBeat.i(99811);
    paramContext = (WifiManager)paramContext.getSystemService("wifi");
    if (paramContext == null)
    {
      paramContext = "";
      AppMethodBeat.o(99811);
    }
    while (true)
    {
      return paramContext;
      paramContext = paramContext.getConnectionInfo();
      if (paramContext == null)
      {
        paramContext = "";
        AppMethodBeat.o(99811);
      }
      else
      {
        String str = paramContext.getMacAddress();
        paramContext = str;
        if (str == null)
          paramContext = "";
        AppMethodBeat.o(99811);
      }
    }
  }

  private static String e(String paramString)
  {
    AppMethodBeat.i(99804);
    paramString = Pattern.compile("[^a-zA-Z0-9]").matcher(paramString).replaceAll("").trim();
    AppMethodBeat.o(99804);
    return paramString;
  }

  private static String f(Context paramContext)
  {
    AppMethodBeat.i(99812);
    if (paramContext == null)
    {
      paramContext = "";
      AppMethodBeat.o(99812);
    }
    while (true)
    {
      return paramContext;
      paramContext = (TelephonyManager)paramContext.getSystemService("phone");
      if (paramContext == null)
      {
        paramContext = "";
        AppMethodBeat.o(99812);
      }
      else
      {
        String str = paramContext.getDeviceId();
        paramContext = str;
        if (str == null)
          paramContext = "";
        AppMethodBeat.o(99812);
      }
    }
  }

  private static String g(Context paramContext)
  {
    AppMethodBeat.i(99813);
    if (paramContext == null)
    {
      paramContext = "";
      AppMethodBeat.o(99813);
    }
    while (true)
    {
      return paramContext;
      PackageManager localPackageManager = paramContext.getPackageManager();
      Object localObject = null;
      try
      {
        paramContext = localPackageManager.getApplicationInfo(paramContext.getPackageName(), 128);
        if (paramContext != null)
        {
          paramContext = paramContext.loadLabel(localPackageManager);
          try
          {
            paramContext = URLEncoder.encode(paramContext.toString(), "utf-8");
            AppMethodBeat.o(99813);
          }
          catch (Exception paramContext)
          {
            while (true)
              paramContext = "";
          }
        }
      }
      catch (PackageManager.NameNotFoundException paramContext)
      {
        while (true)
        {
          paramContext = localObject;
          continue;
          paramContext = "can't find app name";
        }
      }
    }
  }

  private static String h(Context paramContext)
  {
    AppMethodBeat.i(99814);
    if (paramContext == null)
    {
      paramContext = "";
      AppMethodBeat.o(99814);
    }
    while (true)
    {
      return paramContext;
      String str = "";
      try
      {
        Object localObject = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0);
        paramContext = ((PackageInfo)localObject).versionName;
        int i1 = ((PackageInfo)localObject).versionCode;
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        paramContext = paramContext + Integer.toString(i1);
        AppMethodBeat.o(99814);
      }
      catch (Exception paramContext)
      {
        while (true)
          paramContext = str;
      }
    }
  }

  private static String i(Context paramContext)
  {
    AppMethodBeat.i(99815);
    if (paramContext == null)
    {
      paramContext = "";
      AppMethodBeat.o(99815);
    }
    while (true)
    {
      return paramContext;
      String str = "";
      try
      {
        DisplayMetrics localDisplayMetrics = paramContext.getResources().getDisplayMetrics();
        paramContext = new java/lang/StringBuilder;
        paramContext.<init>();
        paramContext = Integer.toString(localDisplayMetrics.widthPixels) + "*" + Integer.toString(localDisplayMetrics.heightPixels);
        AppMethodBeat.o(99815);
      }
      catch (Exception paramContext)
      {
        while (true)
          paramContext = str;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ic
 * JD-Core Version:    0.6.2
 */
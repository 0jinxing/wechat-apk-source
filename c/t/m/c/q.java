package c.t.m.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.preference.PreferenceManager;
import android.telephony.TelephonyManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

public class q
{
  public static final Object a;
  public static String b;
  public static long c;

  static
  {
    AppMethodBeat.i(136434);
    a = new Object();
    b = "complist_loading";
    c = 0L;
    AppMethodBeat.o(136434);
  }

  public static double a(double paramDouble)
  {
    return 3.141592653589793D * paramDouble / 180.0D;
  }

  public static double a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
  {
    AppMethodBeat.i(136431);
    paramDouble1 = a(paramDouble1);
    paramDouble3 = a(paramDouble3);
    paramDouble2 = a(paramDouble2);
    double d = a(paramDouble4);
    paramDouble4 = Math.pow(Math.sin((paramDouble1 - paramDouble3) / 2.0D), 2.0D);
    paramDouble1 = Math.round(Math.asin(Math.sqrt(Math.cos(paramDouble1) * Math.cos(paramDouble3) * Math.pow(Math.sin((paramDouble2 - d) / 2.0D), 2.0D) + paramDouble4)) * 2.0D * 6378.1369999999997D * 10000.0D) / 10000.0D;
    AppMethodBeat.o(136431);
    return paramDouble1 * 1000.0D;
  }

  public static String a()
  {
    AppMethodBeat.i(136409);
    try
    {
      String str1 = Build.MODEL.replaceAll("[_]", "");
      AppMethodBeat.o(136409);
      return str1;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        String str2 = "";
        AppMethodBeat.o(136409);
      }
    }
  }

  public static String a(Context paramContext)
  {
    AppMethodBeat.i(136405);
    try
    {
      String str = paramContext.getPackageName();
      paramContext = paramContext.getPackageManager().getPackageInfo(str, 0);
      str = paramContext.versionName;
      int i = paramContext.versionCode;
      if (str != null)
      {
        paramContext = str;
        if (str.trim().length() > 0);
      }
      else
      {
        paramContext = String.valueOf(i);
        AppMethodBeat.o(136405);
        return paramContext;
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        paramContext = "";
        AppMethodBeat.o(136405);
      }
    }
  }

  public static String a(File paramFile)
  {
    Object localObject = null;
    AppMethodBeat.i(136413);
    if (!paramFile.isFile())
    {
      AppMethodBeat.o(136413);
      paramFile = localObject;
    }
    while (true)
    {
      return paramFile;
      byte[] arrayOfByte = new byte[1024];
      MessageDigest localMessageDigest;
      FileInputStream localFileInputStream;
      try
      {
        localMessageDigest = MessageDigest.getInstance("MD5");
        localFileInputStream = new java/io/FileInputStream;
        localFileInputStream.<init>(paramFile);
        while (true)
        {
          int i = localFileInputStream.read(arrayOfByte, 0, 1024);
          if (i == -1)
            break;
          localMessageDigest.update(arrayOfByte, 0, i);
        }
      }
      catch (Exception paramFile)
      {
        AppMethodBeat.o(136413);
        paramFile = localObject;
      }
      continue;
      localFileInputStream.close();
      paramFile = c(localMessageDigest.digest());
      AppMethodBeat.o(136413);
    }
  }

  public static String a(String paramString)
  {
    AppMethodBeat.i(136414);
    try
    {
      String str = c(MessageDigest.getInstance("MD5").digest(paramString.getBytes()));
      paramString = str;
      AppMethodBeat.o(136414);
      return paramString;
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(136414);
    }
  }

  public static String a(List<a> paramList)
  {
    AppMethodBeat.i(136424);
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      paramList = (a)localIterator.next();
      localStringBuilder.append(paramList.a).append(",");
      localStringBuilder.append(paramList.b).append(",");
      if (!paramList.c.contains(".dex"))
        paramList.c += ".dex";
      localStringBuilder.append(paramList.c).append(",");
      localStringBuilder.append(paramList.d).append(",");
      localStringBuilder.append(paramList.e).append(",");
      localStringBuilder.append(paramList.f).append(";");
    }
    paramList = localStringBuilder.toString();
    AppMethodBeat.o(136424);
    return paramList;
  }

  public static void a(long paramLong)
  {
    AppMethodBeat.i(136418);
    try
    {
      Thread.sleep(paramLong);
      AppMethodBeat.o(136418);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      while (true)
        AppMethodBeat.o(136418);
    }
  }

  public static boolean a(Context paramContext, String paramString)
  {
    boolean bool1 = true;
    int i = 0;
    AppMethodBeat.i(136412);
    boolean bool2;
    if ((paramContext != null) && (paramString != null))
      if (paramContext.checkPermission(paramString, Process.myPid(), Process.myUid()) == 0)
      {
        bool2 = true;
        if (bool2)
          break label112;
      }
    while (true)
    {
      try
      {
        paramContext = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 4096).requestedPermissions;
        if (paramContext != null)
        {
          int j = paramContext.length;
          if (i < j)
          {
            boolean bool3 = paramString.equals(paramContext[i]);
            if (bool3)
            {
              bool2 = bool1;
              AppMethodBeat.o(136412);
              return bool2;
              bool2 = false;
              break;
            }
            i++;
            continue;
          }
        }
        continue;
      }
      catch (Throwable paramContext)
      {
      }
      label112: continue;
      AppMethodBeat.o(136412);
      bool2 = false;
    }
  }

  public static boolean a(Context paramContext, String paramString, Long paramLong)
  {
    AppMethodBeat.i(136402);
    boolean bool = PreferenceManager.getDefaultSharedPreferences(paramContext).edit().putLong(paramString, paramLong.longValue()).commit();
    AppMethodBeat.o(136402);
    return bool;
  }

  public static boolean a(Context paramContext, String paramString1, String paramString2)
  {
    AppMethodBeat.i(136401);
    boolean bool = PreferenceManager.getDefaultSharedPreferences(paramContext).edit().putString(paramString1, paramString2).commit();
    AppMethodBeat.o(136401);
    return bool;
  }

  public static boolean a(Context paramContext, String paramString1, String paramString2, String paramString3, long paramLong, byte[] paramArrayOfByte)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    AppMethodBeat.i(136426);
    paramString3 = paramString2 + File.separator + paramString3;
    paramString2 = new File(paramString2);
    if (!paramString2.exists())
      paramString2.mkdir();
    boolean bool3 = bool2;
    try
    {
      paramContext = paramContext.getResources().getAssets().open(paramString1);
      bool3 = bool2;
      paramString2 = new java/io/ByteArrayOutputStream;
      bool3 = bool2;
      paramString2.<init>();
      bool3 = bool2;
      paramContext.available();
      bool3 = bool2;
      paramString1 = new java/io/BufferedOutputStream;
      bool3 = bool2;
      FileOutputStream localFileOutputStream = new java/io/FileOutputStream;
      bool3 = bool2;
      localFileOutputStream.<init>(paramString3, true);
      bool3 = bool2;
      paramString1.<init>(localFileOutputStream, 1024);
      while (true)
      {
        bool3 = bool2;
        int i = paramContext.read(paramArrayOfByte);
        if (i <= 0)
          break;
        bool3 = bool2;
        paramString2.write(paramArrayOfByte, 0, i);
      }
    }
    catch (Exception paramContext)
    {
      bool1 = bool3;
    }
    while (true)
    {
      AppMethodBeat.o(136426);
      return bool1;
      bool3 = bool2;
      paramString2.close();
      bool3 = bool2;
      paramString2 = a(m.b(paramString2.toByteArray(), "sE0zy%DVqLnXA$hmNZ8NBwcg7FDrvi!q"));
      if (paramString2 != null)
      {
        bool3 = bool2;
        paramString1.write(paramString2);
        bool3 = bool2;
        paramString1.close();
        bool1 = true;
      }
      bool3 = bool1;
      paramContext.close();
    }
  }

  public static boolean a(Context paramContext, List<a> paramList)
  {
    boolean bool = false;
    AppMethodBeat.i(136425);
    List localList = b(b(paramContext, "__SP_Tencent_Loc_COMP_INFO__", ""));
    if ((localList.size() == 0) || (paramList.size() == 0))
      AppMethodBeat.o(136425);
    while (true)
    {
      return bool;
      int i = 0;
      if (i < localList.size())
      {
        a locala1 = (a)localList.get(i);
        for (int j = 0; ; j++)
          if (j < paramList.size())
          {
            a locala2 = (a)paramList.get(j);
            if (locala2.a == locala1.a)
            {
              locala1.c = locala2.c;
              locala1.b = locala2.b;
              locala1.d = locala2.d;
              locala1.e = locala2.e;
            }
          }
          else
          {
            i++;
            break;
          }
      }
      bool = a(paramContext, "__SP_Tencent_Loc_COMP_INFO__", a(localList));
      AppMethodBeat.o(136425);
    }
  }

  public static byte[] a(int paramInt)
  {
    AppMethodBeat.i(136421);
    byte[] arrayOfByte = new byte[2];
    for (int i = 0; i < 2; i++)
    {
      arrayOfByte[i] = Integer.valueOf(paramInt & 0xFF).byteValue();
      paramInt >>= 8;
    }
    AppMethodBeat.o(136421);
    return arrayOfByte;
  }

  // ERROR //
  public static byte[] a(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: ldc_w 410
    //   7: invokestatic 19	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   10: aload_0
    //   11: ifnull +8 -> 19
    //   14: aload_0
    //   15: arraylength
    //   16: ifne +13 -> 29
    //   19: ldc_w 410
    //   22: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   25: aload_2
    //   26: astore_0
    //   27: aload_0
    //   28: areturn
    //   29: new 334	java/io/ByteArrayOutputStream
    //   32: astore_2
    //   33: aload_2
    //   34: invokespecial 335	java/io/ByteArrayOutputStream:<init>	()V
    //   37: new 412	java/io/ByteArrayInputStream
    //   40: astore_3
    //   41: aload_3
    //   42: aload_0
    //   43: invokespecial 414	java/io/ByteArrayInputStream:<init>	([B)V
    //   46: new 416	java/util/zip/GZIPInputStream
    //   49: astore_0
    //   50: aload_0
    //   51: aload_3
    //   52: invokespecial 419	java/util/zip/GZIPInputStream:<init>	(Ljava/io/InputStream;)V
    //   55: ldc_w 420
    //   58: newarray byte
    //   60: astore 4
    //   62: aload_0
    //   63: aload 4
    //   65: invokevirtual 421	java/util/zip/GZIPInputStream:read	([B)I
    //   68: istore 5
    //   70: iload 5
    //   72: iflt +54 -> 126
    //   75: aload_2
    //   76: aload 4
    //   78: iconst_0
    //   79: iload 5
    //   81: invokevirtual 356	java/io/ByteArrayOutputStream:write	([BII)V
    //   84: goto -22 -> 62
    //   87: astore 4
    //   89: aload_0
    //   90: ifnull +7 -> 97
    //   93: aload_0
    //   94: invokevirtual 422	java/util/zip/GZIPInputStream:close	()V
    //   97: aload_3
    //   98: ifnull +7 -> 105
    //   101: aload_3
    //   102: invokevirtual 423	java/io/ByteArrayInputStream:close	()V
    //   105: aload_1
    //   106: astore_0
    //   107: aload_2
    //   108: ifnull +9 -> 117
    //   111: aload_2
    //   112: invokevirtual 357	java/io/ByteArrayOutputStream:close	()V
    //   115: aload_1
    //   116: astore_0
    //   117: ldc_w 410
    //   120: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   123: goto -96 -> 27
    //   126: aload_2
    //   127: invokevirtual 360	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   130: astore 4
    //   132: aload 4
    //   134: astore_1
    //   135: aload_0
    //   136: invokevirtual 422	java/util/zip/GZIPInputStream:close	()V
    //   139: aload_3
    //   140: invokevirtual 423	java/io/ByteArrayInputStream:close	()V
    //   143: aload_2
    //   144: invokevirtual 357	java/io/ByteArrayOutputStream:close	()V
    //   147: aload_1
    //   148: astore_0
    //   149: goto -32 -> 117
    //   152: astore_0
    //   153: aload_1
    //   154: astore_0
    //   155: goto -38 -> 117
    //   158: astore_0
    //   159: aconst_null
    //   160: astore_0
    //   161: aconst_null
    //   162: astore_3
    //   163: aconst_null
    //   164: astore_2
    //   165: aload_0
    //   166: ifnull +7 -> 173
    //   169: aload_0
    //   170: invokevirtual 422	java/util/zip/GZIPInputStream:close	()V
    //   173: aload_3
    //   174: ifnull +7 -> 181
    //   177: aload_3
    //   178: invokevirtual 423	java/io/ByteArrayInputStream:close	()V
    //   181: aload_1
    //   182: astore_0
    //   183: aload_2
    //   184: ifnull -67 -> 117
    //   187: aload_2
    //   188: invokevirtual 357	java/io/ByteArrayOutputStream:close	()V
    //   191: aload_1
    //   192: astore_0
    //   193: goto -76 -> 117
    //   196: astore_0
    //   197: aload_1
    //   198: astore_0
    //   199: goto -82 -> 117
    //   202: astore_0
    //   203: aconst_null
    //   204: astore_2
    //   205: aconst_null
    //   206: astore_3
    //   207: aconst_null
    //   208: astore_1
    //   209: aload_2
    //   210: ifnull +7 -> 217
    //   213: aload_2
    //   214: invokevirtual 422	java/util/zip/GZIPInputStream:close	()V
    //   217: aload_3
    //   218: ifnull +7 -> 225
    //   221: aload_3
    //   222: invokevirtual 423	java/io/ByteArrayInputStream:close	()V
    //   225: aload_1
    //   226: ifnull +7 -> 233
    //   229: aload_1
    //   230: invokevirtual 357	java/io/ByteArrayOutputStream:close	()V
    //   233: ldc_w 410
    //   236: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   239: aload_0
    //   240: athrow
    //   241: astore_2
    //   242: goto -9 -> 233
    //   245: astore_0
    //   246: aconst_null
    //   247: astore 4
    //   249: aconst_null
    //   250: astore_3
    //   251: aload_2
    //   252: astore_1
    //   253: aload 4
    //   255: astore_2
    //   256: goto -47 -> 209
    //   259: astore_0
    //   260: aconst_null
    //   261: astore 4
    //   263: aload_2
    //   264: astore_1
    //   265: aload 4
    //   267: astore_2
    //   268: goto -59 -> 209
    //   271: astore 4
    //   273: aload_0
    //   274: astore 6
    //   276: aload_2
    //   277: astore_1
    //   278: aload 4
    //   280: astore_0
    //   281: aload 6
    //   283: astore_2
    //   284: goto -75 -> 209
    //   287: astore_0
    //   288: aconst_null
    //   289: astore_0
    //   290: aconst_null
    //   291: astore_3
    //   292: goto -127 -> 165
    //   295: astore_0
    //   296: aconst_null
    //   297: astore_0
    //   298: goto -133 -> 165
    //   301: astore 4
    //   303: goto -138 -> 165
    //   306: astore_0
    //   307: aload_1
    //   308: astore_0
    //   309: goto -192 -> 117
    //   312: astore_0
    //   313: aconst_null
    //   314: astore_0
    //   315: aconst_null
    //   316: astore_3
    //   317: aconst_null
    //   318: astore_2
    //   319: goto -230 -> 89
    //   322: astore_0
    //   323: aconst_null
    //   324: astore_0
    //   325: aconst_null
    //   326: astore_3
    //   327: goto -238 -> 89
    //   330: astore_0
    //   331: aconst_null
    //   332: astore_0
    //   333: goto -244 -> 89
    //
    // Exception table:
    //   from	to	target	type
    //   55	62	87	java/lang/Exception
    //   62	70	87	java/lang/Exception
    //   75	84	87	java/lang/Exception
    //   126	132	87	java/lang/Exception
    //   135	147	152	java/lang/Exception
    //   29	37	158	java/lang/Error
    //   169	173	196	java/lang/Exception
    //   177	181	196	java/lang/Exception
    //   187	191	196	java/lang/Exception
    //   29	37	202	finally
    //   213	217	241	java/lang/Exception
    //   221	225	241	java/lang/Exception
    //   229	233	241	java/lang/Exception
    //   37	46	245	finally
    //   46	55	259	finally
    //   55	62	271	finally
    //   62	70	271	finally
    //   75	84	271	finally
    //   126	132	271	finally
    //   37	46	287	java/lang/Error
    //   46	55	295	java/lang/Error
    //   55	62	301	java/lang/Error
    //   62	70	301	java/lang/Error
    //   75	84	301	java/lang/Error
    //   126	132	301	java/lang/Error
    //   93	97	306	java/lang/Exception
    //   101	105	306	java/lang/Exception
    //   111	115	306	java/lang/Exception
    //   29	37	312	java/lang/Exception
    //   37	46	322	java/lang/Exception
    //   46	55	330	java/lang/Exception
  }

  public static Long b(Context paramContext, String paramString, Long paramLong)
  {
    AppMethodBeat.i(136404);
    long l = PreferenceManager.getDefaultSharedPreferences(paramContext).getLong(paramString, paramLong.longValue());
    AppMethodBeat.o(136404);
    return Long.valueOf(l);
  }

  public static String b()
  {
    AppMethodBeat.i(136410);
    try
    {
      String str1 = Build.MANUFACTURER.replaceAll("[_]", "");
      AppMethodBeat.o(136410);
      return str1;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        String str2 = "";
        AppMethodBeat.o(136410);
      }
    }
  }

  public static String b(Context paramContext)
  {
    AppMethodBeat.i(136406);
    paramContext = paramContext.getFilesDir().getAbsolutePath() + File.separator + "TencentLocation/comp";
    AppMethodBeat.o(136406);
    return paramContext;
  }

  public static String b(Context paramContext, String paramString)
  {
    AppMethodBeat.i(136430);
    StringBuilder localStringBuilder = new StringBuilder();
    try
    {
      paramString = paramContext.getAssets().open(paramString);
      paramContext = new java/io/BufferedReader;
      Object localObject = new java/io/InputStreamReader;
      ((InputStreamReader)localObject).<init>(paramString, "UTF-8");
      paramContext.<init>((Reader)localObject);
      while (true)
      {
        localObject = paramContext.readLine();
        if (localObject == null)
          break;
        localStringBuilder.append((String)localObject);
      }
    }
    catch (UnsupportedEncodingException paramContext)
    {
      while (true)
      {
        paramContext = localStringBuilder.toString();
        AppMethodBeat.o(136430);
        return paramContext;
        paramContext.close();
        paramString.close();
      }
    }
    catch (IOException paramContext)
    {
      label63: break label63;
    }
  }

  public static String b(Context paramContext, String paramString1, String paramString2)
  {
    AppMethodBeat.i(136403);
    paramContext = PreferenceManager.getDefaultSharedPreferences(paramContext).getString(paramString1, paramString2);
    AppMethodBeat.o(136403);
    return paramContext;
  }

  // ERROR //
  public static List<a> b(String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: ldc_w 474
    //   5: invokestatic 19	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: new 476	java/util/ArrayList
    //   11: dup
    //   12: invokespecial 477	java/util/ArrayList:<init>	()V
    //   15: astore_2
    //   16: aload_0
    //   17: ldc 234
    //   19: invokevirtual 481	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   22: astore_0
    //   23: aload_0
    //   24: arraylength
    //   25: istore_3
    //   26: iload_1
    //   27: iload_3
    //   28: if_icmpge +123 -> 151
    //   31: aload_0
    //   32: iload_1
    //   33: aaload
    //   34: ldc 208
    //   36: invokevirtual 481	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   39: astore 4
    //   41: aload 4
    //   43: arraylength
    //   44: istore 5
    //   46: iload 5
    //   48: iconst_5
    //   49: if_icmplt +95 -> 144
    //   52: new 200	c/t/m/c/a
    //   55: astore 6
    //   57: aload 6
    //   59: invokespecial 482	c/t/m/c/a:<init>	()V
    //   62: aload 6
    //   64: aload 4
    //   66: iconst_0
    //   67: aaload
    //   68: invokestatic 485	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   71: invokevirtual 488	java/lang/Integer:intValue	()I
    //   74: putfield 202	c/t/m/c/a:a	I
    //   77: aload 6
    //   79: aload 4
    //   81: iconst_1
    //   82: aaload
    //   83: putfield 212	c/t/m/c/a:b	Ljava/lang/String;
    //   86: aload 6
    //   88: aload 4
    //   90: iconst_2
    //   91: aaload
    //   92: putfield 214	c/t/m/c/a:c	Ljava/lang/String;
    //   95: aload 6
    //   97: aload 4
    //   99: iconst_3
    //   100: aaload
    //   101: invokestatic 485	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   104: invokevirtual 488	java/lang/Integer:intValue	()I
    //   107: putfield 226	c/t/m/c/a:d	I
    //   110: aload 6
    //   112: aload 4
    //   114: iconst_4
    //   115: aaload
    //   116: putfield 229	c/t/m/c/a:e	Ljava/lang/String;
    //   119: aload 4
    //   121: arraylength
    //   122: iconst_5
    //   123: if_icmple +12 -> 135
    //   126: aload 6
    //   128: aload 4
    //   130: iconst_5
    //   131: aaload
    //   132: putfield 232	c/t/m/c/a:f	Ljava/lang/String;
    //   135: aload_2
    //   136: aload 6
    //   138: invokeinterface 491 2 0
    //   143: pop
    //   144: iinc 1 1
    //   147: goto -121 -> 26
    //   150: astore_0
    //   151: ldc_w 474
    //   154: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   157: aload_2
    //   158: areturn
    //   159: astore 4
    //   161: goto -17 -> 144
    //
    // Exception table:
    //   from	to	target	type
    //   16	26	150	java/lang/Exception
    //   31	46	150	java/lang/Exception
    //   52	135	159	java/lang/Exception
    //   135	144	159	java/lang/Exception
  }

  public static boolean b(Context paramContext, String paramString1, String paramString2, String paramString3, long paramLong, byte[] paramArrayOfByte)
  {
    boolean bool1 = false;
    AppMethodBeat.i(136428);
    paramContext = paramString2 + File.separator + paramString3;
    paramString2 = new File(paramString2);
    if (!paramString2.exists())
      paramString2.mkdir();
    boolean bool2 = bool1;
    try
    {
      paramString2 = new java/io/FileInputStream;
      bool2 = bool1;
      paramString2.<init>(paramString1);
      bool2 = bool1;
      paramString1 = new java/io/FileOutputStream;
      bool2 = bool1;
      paramString1.<init>(paramContext);
      while (true)
      {
        bool2 = bool1;
        int i = paramString2.read(paramArrayOfByte);
        if (i <= 0)
          break;
        bool2 = bool1;
        paramString1.write(paramArrayOfByte, 0, i);
      }
    }
    catch (Exception paramContext)
    {
    }
    while (true)
    {
      AppMethodBeat.o(136428);
      return bool2;
      bool2 = bool1;
      paramString1.close();
      bool1 = true;
      bool2 = true;
      paramString2.close();
      bool2 = bool1;
    }
  }

  public static byte[] b(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(136420);
    Object localObject1 = null;
    Object localObject2 = localObject1;
    try
    {
      ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
      localObject2 = localObject1;
      localByteArrayOutputStream.<init>(paramArrayOfByte.length);
      localObject2 = localObject1;
      GZIPOutputStream localGZIPOutputStream = new java/util/zip/GZIPOutputStream;
      localObject2 = localObject1;
      localGZIPOutputStream.<init>(localByteArrayOutputStream);
      localObject2 = localObject1;
      localGZIPOutputStream.write(paramArrayOfByte);
      localObject2 = localObject1;
      localGZIPOutputStream.close();
      localObject2 = localObject1;
      paramArrayOfByte = localByteArrayOutputStream.toByteArray();
      localObject2 = paramArrayOfByte;
      localByteArrayOutputStream.close();
      AppMethodBeat.o(136420);
      return paramArrayOfByte;
    }
    catch (Throwable paramArrayOfByte)
    {
      while (true)
        paramArrayOfByte = (byte[])localObject2;
    }
  }

  public static int c()
  {
    return Build.VERSION.SDK_INT;
  }

  public static String c(String paramString)
  {
    Object localObject1 = null;
    AppMethodBeat.i(136423);
    try
    {
      Object localObject2 = new org/json/JSONObject;
      ((JSONObject)localObject2).<init>(paramString);
      paramString = ((JSONObject)localObject2).getString("status");
      e.a().a("DRG", "statucode:".concat(String.valueOf(paramString)));
      boolean bool = paramString.equals("-3");
      if (bool)
      {
        AppMethodBeat.o(136423);
        paramString = localObject1;
      }
      while (true)
      {
        return paramString;
        if (paramString.equals("0"))
        {
          paramString = "";
          localObject2 = ((JSONObject)localObject2).getJSONArray("compList");
          for (int i = 0; i < ((JSONArray)localObject2).length(); i++)
          {
            Object localObject3 = ((JSONArray)localObject2).getJSONObject(i);
            int j = ((JSONObject)localObject3).getInt("compId");
            String str1 = ((JSONObject)localObject3).getString("compVer");
            String str2 = ((JSONObject)localObject3).getString("md5");
            int k = ((JSONObject)localObject3).getInt("size");
            localObject3 = ((JSONObject)localObject3).getString("compName");
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>();
            paramString = paramString + j + "," + str1 + "," + (String)localObject3 + "," + k + "," + str2 + ",;";
          }
          AppMethodBeat.o(136423);
        }
        else
        {
          bool = paramString.equals("-1");
          if (bool)
          {
            AppMethodBeat.o(136423);
            paramString = localObject1;
          }
          else
          {
            bool = paramString.equals("-2");
            if (bool)
            {
              AppMethodBeat.o(136423);
              paramString = localObject1;
            }
            else
            {
              bool = paramString.equals("-4");
              if (bool)
              {
                AppMethodBeat.o(136423);
                paramString = localObject1;
              }
              else
              {
                bool = paramString.equals("-5");
                if (!bool)
                  break;
                AppMethodBeat.o(136423);
                paramString = localObject1;
              }
            }
          }
        }
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        e.a().a("DRG", "statucode:" + paramString.toString());
        AppMethodBeat.o(136423);
        paramString = localObject1;
      }
    }
  }

  private static String c(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(136415);
    if (paramArrayOfByte == null)
    {
      paramArrayOfByte = "";
      AppMethodBeat.o(136415);
    }
    while (true)
    {
      return paramArrayOfByte;
      StringBuffer localStringBuffer = new StringBuffer();
      for (int i = 0; i < paramArrayOfByte.length; i++)
      {
        String str = Integer.toHexString(paramArrayOfByte[i] & 0xFF);
        if (str.length() == 1)
          localStringBuffer.append("0");
        localStringBuffer.append(str);
      }
      paramArrayOfByte = localStringBuffer.toString().toLowerCase();
      AppMethodBeat.o(136415);
    }
  }

  public static List<String> c(Context paramContext)
  {
    AppMethodBeat.i(136407);
    Object localObject = new File(paramContext.getFilesDir(), "TencentLocation/comp");
    ArrayList localArrayList = null;
    paramContext = localArrayList;
    if (((File)localObject).exists())
    {
      paramContext = localArrayList;
      if (((File)localObject).isDirectory())
      {
        localObject = ((File)localObject).listFiles();
        paramContext = localArrayList;
        if (localObject != null)
        {
          paramContext = localArrayList;
          if (localObject.length > 0)
          {
            localArrayList = new ArrayList();
            int i = localObject.length;
            for (int j = 0; ; j++)
            {
              paramContext = localArrayList;
              if (j >= i)
                break;
              paramContext = localObject[j];
              localArrayList.add(paramContext.getName() + "," + paramContext.length());
            }
          }
        }
      }
    }
    AppMethodBeat.o(136407);
    return paramContext;
  }

  public static long d()
  {
    AppMethodBeat.i(136416);
    long l1 = 0L;
    try
    {
      File localFile = Environment.getDataDirectory();
      StatFs localStatFs = new android/os/StatFs;
      localStatFs.<init>(localFile.getPath());
      long l2 = localStatFs.getBlockSize();
      int i = localStatFs.getAvailableBlocks();
      l1 = i * l2;
      label44: AppMethodBeat.o(136416);
      return l1;
    }
    catch (Exception localException)
    {
      break label44;
    }
  }

  public static String d(Context paramContext)
  {
    AppMethodBeat.i(136408);
    try
    {
      paramContext = paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 128).metaData;
      if (paramContext != null)
      {
        if (paramContext.containsKey("TencentGeoLocationSDK"))
        {
          paramContext = paramContext.getString("TencentGeoLocationSDK");
          AppMethodBeat.o(136408);
        }
        while (true)
        {
          return paramContext;
          if (paramContext.containsKey("TencentMapSDK"))
          {
            paramContext = paramContext.getString("TencentMapSDK");
            AppMethodBeat.o(136408);
          }
          else
          {
            paramContext = "";
            AppMethodBeat.o(136408);
          }
        }
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        paramContext = "";
        AppMethodBeat.o(136408);
      }
    }
  }

  public static boolean d(String paramString)
  {
    int i = 0;
    boolean bool = false;
    AppMethodBeat.i(136427);
    File localFile = new File(paramString);
    if (!localFile.exists())
      AppMethodBeat.o(136427);
    while (true)
    {
      return bool;
      String[] arrayOfString = localFile.list();
      int j = arrayOfString.length;
      if (i < j)
      {
        localFile = new File(paramString, arrayOfString[i]);
        if (localFile.isDirectory())
        {
          d(localFile.getAbsolutePath());
          localFile.delete();
        }
        while (true)
        {
          i++;
          break;
          localFile.delete();
        }
      }
      bool = true;
      AppMethodBeat.o(136427);
    }
  }

  public static String e(Context paramContext)
  {
    AppMethodBeat.i(136411);
    Object localObject1 = "";
    if (paramContext == null)
      AppMethodBeat.o(136411);
    while (true)
    {
      return localObject1;
      Object localObject2 = localObject1;
      try
      {
        if (a(paramContext, "android.permission.READ_PHONE_STATE"))
        {
          localObject2 = localObject1;
          paramContext = (TelephonyManager)paramContext.getSystemService("phone");
          localObject2 = localObject1;
          if (Build.VERSION.SDK_INT >= 26)
          {
            localObject2 = localObject1;
            paramContext = paramContext.getImei();
            label63: if (paramContext != null)
              break label91;
          }
          for (paramContext = ""; ; paramContext = paramContext.toLowerCase())
          {
            AppMethodBeat.o(136411);
            localObject1 = paramContext;
            break;
            localObject2 = localObject1;
            paramContext = paramContext.getDeviceId();
            break label63;
            label91: localObject2 = paramContext;
          }
        }
      }
      catch (Throwable paramContext)
      {
        while (true)
        {
          paramContext = (Context)localObject2;
          continue;
          paramContext = "";
        }
      }
    }
  }

  public static boolean e(String paramString)
  {
    AppMethodBeat.i(136429);
    File localFile = new File(paramString);
    if (!localFile.exists())
    {
      localFile.mkdirs();
      AppMethodBeat.o(136429);
    }
    while (true)
    {
      return true;
      String[] arrayOfString = localFile.list();
      int i = arrayOfString.length;
      int j = 0;
      if (j < i)
      {
        localFile = new File(paramString, arrayOfString[j]);
        if (localFile.isDirectory())
        {
          d(localFile.getAbsolutePath());
          localFile.delete();
        }
        while (true)
        {
          j++;
          break;
          localFile.delete();
        }
      }
      AppMethodBeat.o(136429);
    }
  }

  public static boolean f(Context paramContext)
  {
    AppMethodBeat.i(136417);
    try
    {
      paramContext = (ConnectivityManager)paramContext.getSystemService("connectivity");
      if (paramContext != null)
      {
        paramContext = paramContext.getActiveNetworkInfo();
        if (paramContext != null)
        {
          int i = paramContext.getType();
          if (i == 1)
          {
            AppMethodBeat.o(136417);
            bool = true;
            return bool;
          }
        }
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        boolean bool = false;
        AppMethodBeat.o(136417);
      }
    }
  }

  // ERROR //
  public static int g(Context paramContext)
  {
    // Byte code:
    //   0: ldc_w 709
    //   3: invokestatic 19	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: ifnonnull +13 -> 20
    //   10: iconst_m1
    //   11: istore_1
    //   12: ldc_w 709
    //   15: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   18: iload_1
    //   19: ireturn
    //   20: aload_0
    //   21: invokestatic 712	c/t/m/c/q:h	(Landroid/content/Context;)Z
    //   24: istore_2
    //   25: aload_0
    //   26: ldc_w 714
    //   29: invokevirtual 679	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   32: checkcast 716	android/net/wifi/WifiManager
    //   35: astore_3
    //   36: aload_3
    //   37: ifnull +219 -> 256
    //   40: aload_3
    //   41: invokevirtual 719	android/net/wifi/WifiManager:isWifiEnabled	()Z
    //   44: istore 4
    //   46: iload 4
    //   48: ifeq +347 -> 395
    //   51: iconst_1
    //   52: istore_1
    //   53: getstatic 513	android/os/Build$VERSION:SDK_INT	I
    //   56: bipush 18
    //   58: if_icmplt +331 -> 389
    //   61: aload_3
    //   62: invokevirtual 722	android/net/wifi/WifiManager:isScanAlwaysAvailable	()Z
    //   65: istore 4
    //   67: iload 4
    //   69: ifeq +320 -> 389
    //   72: iconst_1
    //   73: istore 5
    //   75: iconst_1
    //   76: istore 6
    //   78: iload_1
    //   79: istore 7
    //   81: aload_0
    //   82: ldc_w 724
    //   85: invokevirtual 679	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   88: checkcast 726	android/location/LocationManager
    //   91: astore_3
    //   92: aload_3
    //   93: ifnull +220 -> 313
    //   96: aload_0
    //   97: invokevirtual 730	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   100: ldc_w 732
    //   103: invokestatic 737	android/provider/Settings$Secure:getInt	(Landroid/content/ContentResolver;Ljava/lang/String;)I
    //   106: istore_1
    //   107: aload_3
    //   108: ldc_w 739
    //   111: invokevirtual 742	android/location/LocationManager:isProviderEnabled	(Ljava/lang/String;)Z
    //   114: istore 8
    //   116: aload_3
    //   117: invokevirtual 746	android/location/LocationManager:getAllProviders	()Ljava/util/List;
    //   120: astore_0
    //   121: aload_0
    //   122: ifnonnull +177 -> 299
    //   125: iconst_0
    //   126: istore 4
    //   128: iload_2
    //   129: ifne +254 -> 383
    //   132: iconst_1
    //   133: istore 9
    //   135: iload 9
    //   137: istore 10
    //   139: iload 7
    //   141: ifne +9 -> 150
    //   144: iload 9
    //   146: iconst_2
    //   147: iadd
    //   148: istore 10
    //   150: iload 10
    //   152: istore 7
    //   154: iload 8
    //   156: ifne +9 -> 165
    //   159: iload 10
    //   161: iconst_4
    //   162: iadd
    //   163: istore 7
    //   165: iload 7
    //   167: istore 10
    //   169: iload 5
    //   171: ifne +10 -> 181
    //   174: iload 7
    //   176: bipush 8
    //   178: iadd
    //   179: istore 10
    //   181: iload 10
    //   183: istore 5
    //   185: iload 4
    //   187: ifne +10 -> 197
    //   190: iload 10
    //   192: bipush 16
    //   194: iadd
    //   195: istore 5
    //   197: iload 5
    //   199: istore 7
    //   201: iload 6
    //   203: ifne +10 -> 213
    //   206: iload 5
    //   208: bipush 32
    //   210: iadd
    //   211: istore 7
    //   213: iload_1
    //   214: tableswitch	default:+30 -> 244, 0:+122->336, 1:+131->345, 2:+141->355, 3:+151->365
    //   245: iconst_4
    //   246: istore_1
    //   247: ldc_w 709
    //   250: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   253: goto -235 -> 18
    //   256: iconst_0
    //   257: istore 6
    //   259: iconst_0
    //   260: istore_1
    //   261: iconst_0
    //   262: istore 7
    //   264: iload 6
    //   266: istore 5
    //   268: iload 7
    //   270: istore 6
    //   272: iload_1
    //   273: istore 7
    //   275: goto -194 -> 81
    //   278: astore_3
    //   279: iconst_0
    //   280: istore_1
    //   281: iconst_0
    //   282: istore 5
    //   284: iconst_0
    //   285: istore 6
    //   287: iload_1
    //   288: istore 7
    //   290: goto -209 -> 81
    //   293: astore_0
    //   294: iconst_0
    //   295: istore_1
    //   296: goto -189 -> 107
    //   299: aload_0
    //   300: ldc_w 739
    //   303: invokeinterface 748 2 0
    //   308: istore 4
    //   310: goto -182 -> 128
    //   313: iconst_0
    //   314: istore 4
    //   316: iconst_0
    //   317: istore_1
    //   318: iconst_0
    //   319: istore 8
    //   321: goto -193 -> 128
    //   324: astore_0
    //   325: iconst_0
    //   326: istore_1
    //   327: iconst_0
    //   328: istore 4
    //   330: iconst_0
    //   331: istore 8
    //   333: goto -205 -> 128
    //   336: iload 7
    //   338: bipush 64
    //   340: iadd
    //   341: istore_1
    //   342: goto -95 -> 247
    //   345: iload 7
    //   347: sipush 128
    //   350: iadd
    //   351: istore_1
    //   352: goto -105 -> 247
    //   355: iload 7
    //   357: sipush 256
    //   360: iadd
    //   361: istore_1
    //   362: goto -115 -> 247
    //   365: iload 7
    //   367: sipush 512
    //   370: iadd
    //   371: istore_1
    //   372: goto -125 -> 247
    //   375: astore_0
    //   376: goto -49 -> 327
    //   379: astore_3
    //   380: goto -99 -> 281
    //   383: iconst_0
    //   384: istore 9
    //   386: goto -251 -> 135
    //   389: iconst_1
    //   390: istore 6
    //   392: goto -131 -> 261
    //   395: iconst_0
    //   396: istore_1
    //   397: goto -344 -> 53
    //
    // Exception table:
    //   from	to	target	type
    //   25	36	278	java/lang/Throwable
    //   40	46	278	java/lang/Throwable
    //   96	107	293	java/lang/Throwable
    //   81	92	324	java/lang/Exception
    //   96	107	324	java/lang/Exception
    //   107	121	375	java/lang/Exception
    //   299	310	375	java/lang/Exception
    //   53	67	379	java/lang/Throwable
  }

  private static boolean h(Context paramContext)
  {
    AppMethodBeat.i(136433);
    try
    {
      paramContext = (TelephonyManager)paramContext.getSystemService("phone");
      if (paramContext == null)
      {
        AppMethodBeat.o(136433);
        bool = false;
      }
      while (true)
      {
        return bool;
        int i = paramContext.getSimState();
        if (i == 5)
        {
          bool = true;
          AppMethodBeat.o(136433);
        }
        else
        {
          AppMethodBeat.o(136433);
          bool = false;
        }
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        AppMethodBeat.o(136433);
        boolean bool = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     c.t.m.c.q
 * JD-Core Version:    0.6.2
 */
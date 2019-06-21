package com.tencent.ttpic.device;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ConfigurationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.StatFs;
import android.provider.Settings.System;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyCharacterMap;
import android.view.ViewConfiguration;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.baseutils.ApiHelper;
import com.tencent.ttpic.baseutils.LogUtils;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStream;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DeviceUtils
{
  public static final int COLLAGE_MATERIAL_READ_MAX_SIDE = 720;
  public static final int COLLAGE_READ_LOW_MAX_SIDE = 640;
  public static final int COLLAGE_READ_MAX_SIDE = 720;
  public static final long HIGH_END_CPU_COUNT = 4L;
  public static final long HIGH_END_MEMORY_SIZE = 256L;
  public static final long HIGH_END_SCREEN_SIZE = 1900800L;
  public static final int LAZY_HEIGHT = 854;
  public static final int LAZY_WIDTH = 640;
  public static final int[] LONG_COLLAGE_SAVE_MAX_SIDE;
  public static final long LOW_END_CPU_COUNT = 1L;
  public static final long LOW_END_MEMORY_SIZE = 64L;
  public static final long LOW_END_SCREEN_SIZE = 307200L;
  private static final int MIN_OPENGL_ES_VERSION = 131072;
  public static final int MIN_STORAGE_SIZE = 52428800;
  public static final int MOBILE_NETWORK_2G = 1;
  public static final int MOBILE_NETWORK_3G = 2;
  public static final int MOBILE_NETWORK_4G = 3;
  public static final int MOBILE_NETWORK_DISCONNECT = 5;
  public static final int MOBILE_NETWORK_UNKNOWN = 4;
  public static final int NET_2G = 2;
  public static final int NET_3G = 3;
  public static final int NET_4G = 4;
  public static final int NET_NONE = 0;
  public static final int NET_OTHER = 5;
  public static final int NET_WIFI = 1;
  public static final int[] STORY_COLLAGE_SAVE_MAX_SHORT_SIDE;
  private static final String TAG;
  public static final int TOPIC_FEED_PUBLISH_MAX_SHORT_SIDE = 640;
  private static boolean mIsAllUnusable;
  private static boolean mIsOpenGlEsValid;
  private static int sCpuCount;
  private static long sMaxCpuFreq;
  private static int sTotalMemory;

  static
  {
    AppMethodBeat.i(49928);
    TAG = DeviceUtils.class.getSimpleName();
    LONG_COLLAGE_SAVE_MAX_SIDE = new int[] { 640, 560, 480, 400, 320 };
    STORY_COLLAGE_SAVE_MAX_SHORT_SIDE = new int[] { 960, 720, 640, 560, 480, 400, 320 };
    sTotalMemory = 0;
    sMaxCpuFreq = 0L;
    sCpuCount = 0;
    mIsAllUnusable = false;
    mIsOpenGlEsValid = true;
    AppMethodBeat.o(49928);
  }

  public static boolean canWriteFile(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(49921);
    if (TextUtils.isEmpty(paramString))
      AppMethodBeat.o(49921);
    while (true)
    {
      return bool;
      Object localObject = paramString;
      if (!paramString.endsWith(File.separator))
        localObject = paramString.substring(0, paramString.lastIndexOf(File.separator));
      localObject = new File((String)localObject + File.separator + "test_temp.txt");
      try
      {
        if (((File)localObject).exists())
          ((File)localObject).delete();
        ((File)localObject).createNewFile();
        ((File)localObject).delete();
        bool = true;
        AppMethodBeat.o(49921);
      }
      catch (Exception paramString)
      {
        ((File)localObject).delete();
        AppMethodBeat.o(49921);
      }
    }
  }

  // ERROR //
  private static String fetchExternalIpProviderHTML(String paramString)
  {
    // Byte code:
    //   0: ldc 166
    //   2: invokestatic 76	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 168	java/net/URL
    //   8: astore_1
    //   9: aload_1
    //   10: aload_0
    //   11: invokespecial 169	java/net/URL:<init>	(Ljava/lang/String;)V
    //   14: aload_1
    //   15: invokevirtual 173	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   18: checkcast 175	java/net/HttpURLConnection
    //   21: astore_0
    //   22: iconst_1
    //   23: invokestatic 179	java/net/HttpURLConnection:setFollowRedirects	(Z)V
    //   26: aload_0
    //   27: ldc 181
    //   29: invokevirtual 184	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   32: aload_0
    //   33: ldc 186
    //   35: ldc 188
    //   37: invokevirtual 192	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   40: aload_0
    //   41: invokevirtual 196	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   44: astore_1
    //   45: sipush 1024
    //   48: newarray byte
    //   50: astore_2
    //   51: iconst_0
    //   52: istore_3
    //   53: iload_3
    //   54: sipush 1024
    //   57: if_icmpge +29 -> 86
    //   60: aload_1
    //   61: aload_2
    //   62: iload_3
    //   63: sipush 1024
    //   66: iload_3
    //   67: isub
    //   68: invokevirtual 202	java/io/InputStream:read	([BII)I
    //   71: istore 4
    //   73: iload 4
    //   75: iflt +11 -> 86
    //   78: iload_3
    //   79: iload 4
    //   81: iadd
    //   82: istore_3
    //   83: goto -30 -> 53
    //   86: new 123	java/lang/String
    //   89: astore 5
    //   91: aload 5
    //   93: aload_2
    //   94: ldc 204
    //   96: invokespecial 207	java/lang/String:<init>	([BLjava/lang/String;)V
    //   99: aload_1
    //   100: ifnull +7 -> 107
    //   103: aload_1
    //   104: invokevirtual 210	java/io/InputStream:close	()V
    //   107: aload_0
    //   108: ifnull +7 -> 115
    //   111: aload_0
    //   112: invokevirtual 213	java/net/HttpURLConnection:disconnect	()V
    //   115: ldc 166
    //   117: invokestatic 101	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   120: aload 5
    //   122: astore_0
    //   123: aload_0
    //   124: areturn
    //   125: astore_0
    //   126: aconst_null
    //   127: astore_1
    //   128: aconst_null
    //   129: astore_0
    //   130: aload_0
    //   131: ifnull +7 -> 138
    //   134: aload_0
    //   135: invokevirtual 210	java/io/InputStream:close	()V
    //   138: aload_1
    //   139: ifnull +7 -> 146
    //   142: aload_1
    //   143: invokevirtual 213	java/net/HttpURLConnection:disconnect	()V
    //   146: ldc 166
    //   148: invokestatic 101	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   151: aconst_null
    //   152: astore_0
    //   153: goto -30 -> 123
    //   156: astore_0
    //   157: aconst_null
    //   158: astore_0
    //   159: aconst_null
    //   160: astore_1
    //   161: aload_1
    //   162: ifnull +7 -> 169
    //   165: aload_1
    //   166: invokevirtual 210	java/io/InputStream:close	()V
    //   169: aload_0
    //   170: ifnull -24 -> 146
    //   173: aload_0
    //   174: invokevirtual 213	java/net/HttpURLConnection:disconnect	()V
    //   177: goto -31 -> 146
    //   180: astore_0
    //   181: goto -35 -> 146
    //   184: astore_0
    //   185: aconst_null
    //   186: astore 5
    //   188: aconst_null
    //   189: astore_1
    //   190: aload_1
    //   191: ifnull +7 -> 198
    //   194: aload_1
    //   195: invokevirtual 210	java/io/InputStream:close	()V
    //   198: aload 5
    //   200: ifnull +8 -> 208
    //   203: aload 5
    //   205: invokevirtual 213	java/net/HttpURLConnection:disconnect	()V
    //   208: ldc 166
    //   210: invokestatic 101	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   213: aload_0
    //   214: athrow
    //   215: astore_1
    //   216: goto -8 -> 208
    //   219: astore_1
    //   220: aload_0
    //   221: astore 5
    //   223: aconst_null
    //   224: astore_2
    //   225: aload_1
    //   226: astore_0
    //   227: aload_2
    //   228: astore_1
    //   229: goto -39 -> 190
    //   232: astore_2
    //   233: aload_0
    //   234: astore 5
    //   236: aload_2
    //   237: astore_0
    //   238: goto -48 -> 190
    //   241: astore_1
    //   242: aconst_null
    //   243: astore_1
    //   244: goto -83 -> 161
    //   247: astore 5
    //   249: goto -88 -> 161
    //   252: astore_0
    //   253: goto -107 -> 146
    //   256: astore_1
    //   257: aconst_null
    //   258: astore 5
    //   260: aload_0
    //   261: astore_1
    //   262: aload 5
    //   264: astore_0
    //   265: goto -135 -> 130
    //   268: astore 5
    //   270: aload_1
    //   271: astore 5
    //   273: aload_0
    //   274: astore_1
    //   275: aload 5
    //   277: astore_0
    //   278: goto -148 -> 130
    //   281: astore_0
    //   282: goto -167 -> 115
    //
    // Exception table:
    //   from	to	target	type
    //   5	22	125	java/net/MalformedURLException
    //   5	22	156	java/io/IOException
    //   165	169	180	java/lang/Exception
    //   173	177	180	java/lang/Exception
    //   5	22	184	finally
    //   194	198	215	java/lang/Exception
    //   203	208	215	java/lang/Exception
    //   22	45	219	finally
    //   45	51	232	finally
    //   60	73	232	finally
    //   86	99	232	finally
    //   22	45	241	java/io/IOException
    //   45	51	247	java/io/IOException
    //   60	73	247	java/io/IOException
    //   86	99	247	java/io/IOException
    //   134	138	252	java/lang/Exception
    //   142	146	252	java/lang/Exception
    //   22	45	256	java/net/MalformedURLException
    //   45	51	268	java/net/MalformedURLException
    //   60	73	268	java/net/MalformedURLException
    //   86	99	268	java/net/MalformedURLException
    //   103	107	281	java/lang/Exception
    //   111	115	281	java/lang/Exception
  }

  @TargetApi(18)
  public static long getAvailableSize(StatFs paramStatFs)
  {
    AppMethodBeat.i(49893);
    if (ApiHelper.hasJellyBeanMR2());
    for (long l = paramStatFs.getAvailableBytes(); ; l = paramStatFs.getAvailableBlocks() * paramStatFs.getBlockSize())
    {
      AppMethodBeat.o(49893);
      return l;
    }
  }

  public static String getBuildVersionName(Context paramContext)
  {
    AppMethodBeat.i(49901);
    paramContext = getVersionName(paramContext);
    if (TextUtils.isEmpty(paramContext))
    {
      paramContext = "";
      AppMethodBeat.o(49901);
    }
    while (true)
    {
      return paramContext;
      paramContext = paramContext.substring(paramContext.lastIndexOf(".") + 1);
      AppMethodBeat.o(49901);
    }
  }

  // ERROR //
  public static String getCpuName()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_0
    //   2: ldc 255
    //   4: invokestatic 76	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: new 257	java/io/FileReader
    //   10: astore_1
    //   11: aload_1
    //   12: ldc_w 259
    //   15: invokespecial 260	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   18: new 262	java/io/BufferedReader
    //   21: astore_2
    //   22: aload_2
    //   23: aload_1
    //   24: invokespecial 265	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   27: aload_2
    //   28: invokevirtual 268	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   31: astore_1
    //   32: aload_1
    //   33: ifnull +27 -> 60
    //   36: aload_1
    //   37: ldc_w 270
    //   40: iconst_2
    //   41: invokevirtual 274	java/lang/String:split	(Ljava/lang/String;I)[Ljava/lang/String;
    //   44: iconst_1
    //   45: aaload
    //   46: astore_1
    //   47: aload_2
    //   48: invokevirtual 275	java/io/BufferedReader:close	()V
    //   51: ldc 255
    //   53: invokestatic 101	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   56: aload_1
    //   57: astore_2
    //   58: aload_2
    //   59: areturn
    //   60: aload_2
    //   61: invokevirtual 275	java/io/BufferedReader:close	()V
    //   64: ldc 255
    //   66: invokestatic 101	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   69: aload_0
    //   70: astore_2
    //   71: goto -13 -> 58
    //   74: astore_2
    //   75: aconst_null
    //   76: astore_2
    //   77: aload_2
    //   78: ifnull -14 -> 64
    //   81: aload_2
    //   82: invokevirtual 275	java/io/BufferedReader:close	()V
    //   85: goto -21 -> 64
    //   88: astore_2
    //   89: goto -25 -> 64
    //   92: astore_2
    //   93: aconst_null
    //   94: astore_2
    //   95: aload_2
    //   96: ifnull -32 -> 64
    //   99: aload_2
    //   100: invokevirtual 275	java/io/BufferedReader:close	()V
    //   103: goto -39 -> 64
    //   106: astore_2
    //   107: goto -43 -> 64
    //   110: astore_2
    //   111: aconst_null
    //   112: astore_1
    //   113: aload_1
    //   114: ifnull +7 -> 121
    //   117: aload_1
    //   118: invokevirtual 275	java/io/BufferedReader:close	()V
    //   121: ldc 255
    //   123: invokestatic 101	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   126: aload_2
    //   127: athrow
    //   128: astore_2
    //   129: goto -78 -> 51
    //   132: astore_2
    //   133: goto -69 -> 64
    //   136: astore_0
    //   137: goto -16 -> 121
    //   140: astore_0
    //   141: aload_2
    //   142: astore_1
    //   143: aload_0
    //   144: astore_2
    //   145: goto -32 -> 113
    //   148: astore_1
    //   149: goto -54 -> 95
    //   152: astore_1
    //   153: goto -76 -> 77
    //
    // Exception table:
    //   from	to	target	type
    //   7	27	74	java/io/FileNotFoundException
    //   81	85	88	java/io/IOException
    //   7	27	92	java/io/IOException
    //   99	103	106	java/io/IOException
    //   7	27	110	finally
    //   47	51	128	java/io/IOException
    //   60	64	132	java/io/IOException
    //   117	121	136	java/io/IOException
    //   27	32	140	finally
    //   36	47	140	finally
    //   27	32	148	java/io/IOException
    //   36	47	148	java/io/IOException
    //   27	32	152	java/io/FileNotFoundException
    //   36	47	152	java/io/FileNotFoundException
  }

  public static File getExternalFilesDir(Context paramContext)
  {
    AppMethodBeat.i(49896);
    File localFile1 = paramContext.getExternalFilesDir(null);
    File localFile2 = localFile1;
    if (localFile1 == null)
    {
      paramContext = "/Android/data/" + paramContext.getPackageName() + "/files/";
      localFile2 = new File(Environment.getExternalStorageDirectory().getPath() + paramContext);
    }
    AppMethodBeat.o(49896);
    return localFile2;
  }

  public static File getExternalFilesDir(Context paramContext, String paramString)
  {
    AppMethodBeat.i(49897);
    Object localObject1 = null;
    Object localObject2 = localObject1;
    if (isExternalStorageAvailable())
    {
      localObject2 = localObject1;
      if (isExternalStorageSpaceEnough(52428800L))
        localObject2 = getExternalFilesDir(paramContext).getPath();
    }
    paramContext = new File((String)localObject2 + File.separator + paramString);
    try
    {
      if ((paramContext.exists()) && (paramContext.isFile()))
        paramContext.delete();
      if (!paramContext.exists())
        paramContext.mkdirs();
      label98: AppMethodBeat.o(49897);
      return paramContext;
    }
    catch (Exception paramString)
    {
      break label98;
    }
  }

  public static String getExternalLocalIpAddress()
  {
    AppMethodBeat.i(49918);
    String str = fetchExternalIpProviderHTML("http://checkip.dyndns.org/");
    if (str == null)
    {
      str = null;
      AppMethodBeat.o(49918);
    }
    while (true)
    {
      return str;
      str = parse(str);
      AppMethodBeat.o(49918);
    }
  }

  public static float getHeapAllocatedPercent(Context paramContext)
  {
    AppMethodBeat.i(49883);
    long l1 = getHeapAllocatedSizeInKb();
    long l2 = getHeapMaxSizeInKb(paramContext);
    float f = (float)l1 * 1.0F / (float)l2;
    LogUtils.v(TAG, "getHeapAllocatedPercent(), percent = %f", new Object[] { Float.valueOf(f) });
    AppMethodBeat.o(49883);
    return f;
  }

  public static long getHeapAllocatedSizeInKb()
  {
    AppMethodBeat.i(49882);
    long l = getRuntimeTotalMemory(1) - getRuntimeFreeMemory(1);
    LogUtils.v(TAG, "getHeapAllocatedSizeInKb(), heapAllocated = " + (float)l / 1024.0F + "(Mb), " + l + "(Kb)");
    AppMethodBeat.o(49882);
    return l;
  }

  public static long getHeapMaxSizeInKb(Context paramContext)
  {
    AppMethodBeat.i(49878);
    long l = getRuntimeMaxMemory(1);
    try
    {
      paramContext = (ActivityManager)paramContext.getSystemService("activity");
      String str = TAG;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("getHeapMaxSizeInKb(), heap size(Mb) = ");
      LogUtils.v(str, paramContext.getMemoryClass());
      int i = paramContext.getMemoryClass();
      l = i * 1024;
      AppMethodBeat.o(49878);
      return l;
    }
    catch (Exception paramContext)
    {
      while (true)
        LogUtils.e(paramContext);
    }
  }

  public static long getHeapMaxSizeInMb(Context paramContext)
  {
    AppMethodBeat.i(49877);
    long l = getRuntimeMaxMemory(2);
    try
    {
      paramContext = (ActivityManager)paramContext.getSystemService("activity");
      String str = TAG;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("getHeapMaxSizeInMb(), heap size(Mb) = ");
      LogUtils.v(str, paramContext.getMemoryClass());
      int i = paramContext.getMemoryClass();
      l = i;
      AppMethodBeat.o(49877);
      return l;
    }
    catch (Exception paramContext)
    {
      while (true)
        LogUtils.e(paramContext);
    }
  }

  public static long getHeapRemainSizeInKb(Context paramContext)
  {
    AppMethodBeat.i(49880);
    long l = getHeapMaxSizeInKb(paramContext) - getHeapAllocatedSizeInKb();
    LogUtils.v(TAG, "getHeapRemainSizeInKb(), remainSize = " + (float)l / 1024.0F + "(Mb), " + l + "(Kb)");
    AppMethodBeat.o(49880);
    return l;
  }

  public static String getImei(Context paramContext)
  {
    AppMethodBeat.i(49891);
    try
    {
      paramContext = ((TelephonyManager)paramContext.getSystemService("phone")).getDeviceId();
      if (!TextUtils.isEmpty(paramContext))
      {
        LogUtils.i(TAG, "[getImei] IMEI: ".concat(String.valueOf(paramContext)));
        AppMethodBeat.o(49891);
        return paramContext;
      }
    }
    catch (Throwable paramContext)
    {
      while (true)
      {
        LogUtils.e(paramContext);
        paramContext = "";
        AppMethodBeat.o(49891);
      }
    }
  }

  public static long getLargeHeapMaxSizeInKb(Context paramContext)
  {
    AppMethodBeat.i(49879);
    long l = getRuntimeMaxMemory(1);
    try
    {
      paramContext = (ActivityManager)paramContext.getSystemService("activity");
      String str = TAG;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("getLargeHeapMaxSizeInKb(), heap size(Mb) = ");
      LogUtils.v(str, paramContext.getLargeMemoryClass());
      int i = paramContext.getLargeMemoryClass();
      l = i * 1024;
      AppMethodBeat.o(49879);
      return l;
    }
    catch (Exception paramContext)
    {
      while (true)
        LogUtils.e(paramContext);
    }
  }

  public static long getLargeHeapRemainSizeInKb(Context paramContext)
  {
    AppMethodBeat.i(49881);
    long l = getLargeHeapMaxSizeInKb(paramContext) - getHeapAllocatedSizeInKb();
    LogUtils.v(TAG, "getLargeHeapRemainSizeInKb(), remainSize = " + (float)l / 1024.0F + "(Mb), " + l + "(Kb)");
    AppMethodBeat.o(49881);
    return l;
  }

  public static String getLocalIpAddress()
  {
    AppMethodBeat.i(49911);
    try
    {
      if (NetworkInterface.getNetworkInterfaces() != null)
      {
        Enumeration localEnumeration1 = NetworkInterface.getNetworkInterfaces();
        Enumeration localEnumeration2;
        do
        {
          do
          {
            do
              if (!localEnumeration1.hasMoreElements())
                break;
            while (localEnumeration1 == null);
            localObject = (NetworkInterface)localEnumeration1.nextElement();
          }
          while (localObject == null);
          localEnumeration2 = ((NetworkInterface)localObject).getInetAddresses();
        }
        while (!localEnumeration2.hasMoreElements());
        localObject = (InetAddress)localEnumeration2.nextElement();
      }
    }
    catch (SocketException localSocketException)
    {
      while (true)
        try
        {
          Object localObject;
          if ((!((InetAddress)localObject).isLoopbackAddress()) && ((localObject instanceof Inet4Address)) && (Inet4Address.getByName(((InetAddress)localObject).getHostAddress()) != null) && (!((InetAddress)localObject).getHostAddress().equals("null")) && (((InetAddress)localObject).getHostAddress() != null))
          {
            localObject = ((InetAddress)localObject).getHostAddress().trim();
            AppMethodBeat.o(49911);
            return localObject;
            localSocketException = localSocketException;
            LogUtils.e(localSocketException);
            String str = "";
            AppMethodBeat.o(49911);
          }
        }
        catch (UnknownHostException localUnknownHostException)
        {
        }
    }
  }

  // ERROR //
  public static String getLocalRealIpAddress()
  {
    // Byte code:
    //   0: ldc_w 490
    //   3: invokestatic 76	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: invokestatic 453	java/net/NetworkInterface:getNetworkInterfaces	()Ljava/util/Enumeration;
    //   9: astore_0
    //   10: iconst_0
    //   11: istore_1
    //   12: aconst_null
    //   13: astore_2
    //   14: aconst_null
    //   15: astore_3
    //   16: aload_2
    //   17: astore 4
    //   19: aload_0
    //   20: ifnull +230 -> 250
    //   23: aload_3
    //   24: astore 5
    //   26: aload_3
    //   27: astore 6
    //   29: aload_0
    //   30: invokeinterface 458 1 0
    //   35: ifeq +215 -> 250
    //   38: iload_1
    //   39: ifne +211 -> 250
    //   42: aload_3
    //   43: astore 5
    //   45: aload_3
    //   46: astore 6
    //   48: aload_0
    //   49: invokeinterface 462 1 0
    //   54: checkcast 449	java/net/NetworkInterface
    //   57: invokevirtual 465	java/net/NetworkInterface:getInetAddresses	()Ljava/util/Enumeration;
    //   60: astore 7
    //   62: aload_3
    //   63: astore 8
    //   65: aload 4
    //   67: astore_2
    //   68: aload 8
    //   70: astore_3
    //   71: aload 8
    //   73: astore 5
    //   75: aload 8
    //   77: astore 6
    //   79: aload 7
    //   81: invokeinterface 458 1 0
    //   86: ifeq -70 -> 16
    //   89: aload 8
    //   91: astore 5
    //   93: aload 8
    //   95: astore 6
    //   97: aload 7
    //   99: invokeinterface 462 1 0
    //   104: checkcast 467	java/net/InetAddress
    //   107: astore_3
    //   108: aload 8
    //   110: astore 5
    //   112: aload 8
    //   114: astore 6
    //   116: aload_3
    //   117: invokevirtual 493	java/net/InetAddress:isSiteLocalAddress	()Z
    //   120: ifne +61 -> 181
    //   123: aload 8
    //   125: astore 5
    //   127: aload 8
    //   129: astore 6
    //   131: aload_3
    //   132: invokevirtual 470	java/net/InetAddress:isLoopbackAddress	()Z
    //   135: ifne +46 -> 181
    //   138: aload 8
    //   140: astore 5
    //   142: aload 8
    //   144: astore 6
    //   146: aload_3
    //   147: invokevirtual 475	java/net/InetAddress:getHostAddress	()Ljava/lang/String;
    //   150: ldc_w 495
    //   153: invokevirtual 498	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   156: iconst_m1
    //   157: if_icmpne +24 -> 181
    //   160: aload 8
    //   162: astore 5
    //   164: aload 8
    //   166: astore 6
    //   168: aload_3
    //   169: invokevirtual 475	java/net/InetAddress:getHostAddress	()Ljava/lang/String;
    //   172: astore_2
    //   173: iconst_1
    //   174: istore_1
    //   175: aload 8
    //   177: astore_3
    //   178: goto -162 -> 16
    //   181: aload 8
    //   183: astore 5
    //   185: aload 8
    //   187: astore 6
    //   189: aload_3
    //   190: invokevirtual 493	java/net/InetAddress:isSiteLocalAddress	()Z
    //   193: ifeq -128 -> 65
    //   196: aload 8
    //   198: astore 5
    //   200: aload 8
    //   202: astore 6
    //   204: aload_3
    //   205: invokevirtual 470	java/net/InetAddress:isLoopbackAddress	()Z
    //   208: ifne -143 -> 65
    //   211: aload 8
    //   213: astore 5
    //   215: aload 8
    //   217: astore 6
    //   219: aload_3
    //   220: invokevirtual 475	java/net/InetAddress:getHostAddress	()Ljava/lang/String;
    //   223: ldc_w 495
    //   226: invokevirtual 498	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   229: iconst_m1
    //   230: if_icmpne -165 -> 65
    //   233: aload 8
    //   235: astore 5
    //   237: aload 8
    //   239: astore 6
    //   241: aload_3
    //   242: invokevirtual 475	java/net/InetAddress:getHostAddress	()Ljava/lang/String;
    //   245: astore 8
    //   247: goto -182 -> 65
    //   250: aload 4
    //   252: invokestatic 116	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   255: ifne +14 -> 269
    //   258: ldc_w 490
    //   261: invokestatic 101	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   264: aload 4
    //   266: astore_3
    //   267: aload_3
    //   268: areturn
    //   269: invokestatic 500	com/tencent/ttpic/device/DeviceUtils:getExternalLocalIpAddress	()Ljava/lang/String;
    //   272: astore 4
    //   274: aload 4
    //   276: invokestatic 116	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   279: ifne +15 -> 294
    //   282: ldc_w 490
    //   285: invokestatic 101	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   288: aload 4
    //   290: astore_3
    //   291: goto -24 -> 267
    //   294: ldc_w 490
    //   297: invokestatic 101	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   300: goto -33 -> 267
    //   303: astore_3
    //   304: aconst_null
    //   305: astore_3
    //   306: aconst_null
    //   307: astore 6
    //   309: aload_3
    //   310: invokestatic 116	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   313: ifne +12 -> 325
    //   316: ldc_w 490
    //   319: invokestatic 101	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   322: goto -55 -> 267
    //   325: invokestatic 500	com/tencent/ttpic/device/DeviceUtils:getExternalLocalIpAddress	()Ljava/lang/String;
    //   328: astore_3
    //   329: aload_3
    //   330: invokestatic 116	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   333: ifne +12 -> 345
    //   336: ldc_w 490
    //   339: invokestatic 101	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   342: goto -75 -> 267
    //   345: ldc_w 490
    //   348: invokestatic 101	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   351: aload 6
    //   353: astore_3
    //   354: goto -87 -> 267
    //   357: astore_3
    //   358: aconst_null
    //   359: astore_3
    //   360: aconst_null
    //   361: astore 5
    //   363: aload_3
    //   364: invokestatic 116	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   367: ifne +12 -> 379
    //   370: ldc_w 490
    //   373: invokestatic 101	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   376: goto -109 -> 267
    //   379: invokestatic 500	com/tencent/ttpic/device/DeviceUtils:getExternalLocalIpAddress	()Ljava/lang/String;
    //   382: astore_3
    //   383: aload_3
    //   384: invokestatic 116	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   387: ifne +12 -> 399
    //   390: ldc_w 490
    //   393: invokestatic 101	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   396: goto -129 -> 267
    //   399: ldc_w 490
    //   402: invokestatic 101	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   405: aload 5
    //   407: astore_3
    //   408: goto -141 -> 267
    //   411: astore_3
    //   412: aload 4
    //   414: astore_3
    //   415: goto -52 -> 363
    //   418: astore_3
    //   419: aload 4
    //   421: astore_3
    //   422: goto -113 -> 309
    //
    // Exception table:
    //   from	to	target	type
    //   6	10	303	java/net/SocketException
    //   6	10	357	finally
    //   29	38	411	finally
    //   48	62	411	finally
    //   79	89	411	finally
    //   97	108	411	finally
    //   116	123	411	finally
    //   131	138	411	finally
    //   146	160	411	finally
    //   168	173	411	finally
    //   189	196	411	finally
    //   204	211	411	finally
    //   219	233	411	finally
    //   241	247	411	finally
    //   29	38	418	java/net/SocketException
    //   48	62	418	java/net/SocketException
    //   79	89	418	java/net/SocketException
    //   97	108	418	java/net/SocketException
    //   116	123	418	java/net/SocketException
    //   131	138	418	java/net/SocketException
    //   146	160	418	java/net/SocketException
    //   168	173	418	java/net/SocketException
    //   189	196	418	java/net/SocketException
    //   204	211	418	java/net/SocketException
    //   219	233	418	java/net/SocketException
    //   241	247	418	java/net/SocketException
  }

  public static String getMachineInfo()
  {
    AppMethodBeat.i(49902);
    String str = DeviceInstance.getInstance().getDeviceName();
    AppMethodBeat.o(49902);
    return str;
  }

  public static long getMaxCpuFreq()
  {
    AppMethodBeat.i(49889);
    long l;
    if (sMaxCpuFreq > 0L)
    {
      l = sMaxCpuFreq;
      AppMethodBeat.o(49889);
    }
    while (true)
    {
      return l;
      String str1 = "";
      try
      {
        Object localObject = new java/lang/ProcessBuilder;
        ((ProcessBuilder)localObject).<init>(new String[] { "/system/bin/cat", "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq" });
        InputStream localInputStream = ((ProcessBuilder)localObject).start().getInputStream();
        localObject = new byte[24];
        while (localInputStream.read((byte[])localObject) != -1)
        {
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          localStringBuilder = localStringBuilder.append(str1);
          str1 = new java/lang/String;
          str1.<init>((byte[])localObject);
          str1 = str1;
        }
        localInputStream.close();
        str1 = str1.trim();
        if ((str1 == null) || (str1.length() == 0))
        {
          sMaxCpuFreq = 1L;
          LogUtils.v("DeviceUtils", "sMaxCpuFreq:" + sMaxCpuFreq);
          l = sMaxCpuFreq;
          AppMethodBeat.o(49889);
        }
      }
      catch (IOException localIOException)
      {
        while (true)
        {
          LogUtils.e(localIOException);
          String str2 = "";
          continue;
          try
          {
            sMaxCpuFreq = Long.parseLong(str2);
          }
          catch (NumberFormatException localNumberFormatException)
          {
            sMaxCpuFreq = 1L;
          }
        }
      }
    }
  }

  public static int getMobileNetworkType(Context paramContext)
  {
    AppMethodBeat.i(49916);
    int i;
    if (paramContext == null)
    {
      AppMethodBeat.o(49916);
      i = 4;
    }
    while (true)
    {
      return i;
      paramContext = (ConnectivityManager)paramContext.getSystemService("connectivity");
      if (paramContext == null)
      {
        AppMethodBeat.o(49916);
        i = 4;
      }
      else
      {
        paramContext = paramContext.getNetworkInfo(0);
        if ((paramContext != null) && (paramContext.isAvailable()) && (paramContext.isConnected()));
        switch (paramContext.getSubtype())
        {
        case 3:
        case 7:
        case 11:
        case 14:
        default:
          AppMethodBeat.o(49916);
          i = 4;
          break;
        case 1:
        case 2:
        case 4:
          i = 1;
          AppMethodBeat.o(49916);
          break;
        case 5:
        case 6:
        case 8:
        case 9:
        case 10:
        case 12:
        case 15:
          i = 2;
          AppMethodBeat.o(49916);
          break;
        case 13:
          i = 3;
          AppMethodBeat.o(49916);
          continue;
          i = 5;
          AppMethodBeat.o(49916);
        }
      }
    }
  }

  public static int getNavigationBarHeight(Activity paramActivity)
  {
    AppMethodBeat.i(49907);
    int i;
    if (!isNavigationBarShow(paramActivity))
    {
      i = 0;
      AppMethodBeat.o(49907);
    }
    while (true)
    {
      return i;
      paramActivity = paramActivity.getResources();
      i = paramActivity.getDimensionPixelSize(paramActivity.getIdentifier("navigation_bar_height", "dimen", "android"));
      AppMethodBeat.o(49907);
    }
  }

  public static int getNetworkType(Context paramContext)
  {
    AppMethodBeat.i(49915);
    int i = 5;
    try
    {
      boolean bool = isNetworkAvailable(paramContext);
      if (!bool)
        i = 0;
      while (true)
      {
        AppMethodBeat.o(49915);
        return i;
        if (isWifiNetwork(paramContext))
        {
          i = 1;
        }
        else
        {
          int j = getMobileNetworkType(paramContext);
          switch (j)
          {
          default:
            break;
          case 1:
            i = 2;
            break;
          case 2:
            i = 3;
            break;
          case 3:
            i = 4;
          }
        }
      }
    }
    catch (Exception paramContext)
    {
      while (true)
        LogUtils.e(paramContext);
    }
  }

  public static String getNetworkTypeName(Context paramContext)
  {
    AppMethodBeat.i(49917);
    switch (getNetworkType(paramContext))
    {
    default:
      paramContext = "unknow";
      AppMethodBeat.o(49917);
    case 0:
    case 2:
    case 3:
    case 4:
    case 1:
    }
    while (true)
    {
      return paramContext;
      paramContext = "none";
      AppMethodBeat.o(49917);
      continue;
      paramContext = "2G";
      AppMethodBeat.o(49917);
      continue;
      paramContext = "3G";
      AppMethodBeat.o(49917);
      continue;
      paramContext = "4G";
      AppMethodBeat.o(49917);
      continue;
      paramContext = "wifi";
      AppMethodBeat.o(49917);
    }
  }

  public static int getNumCores()
  {
    AppMethodBeat.i(49888);
    int i;
    if (sCpuCount > 0)
    {
      i = sCpuCount;
      AppMethodBeat.o(49888);
    }
    while (true)
    {
      return i;
      try
      {
        File localFile = new java/io/File;
        localFile.<init>("/sys/devices/system/cpu/");
        Object localObject = new com/tencent/ttpic/device/DeviceUtils$1CpuFilter;
        ((DeviceUtils.1CpuFilter)localObject).<init>();
        localObject = localFile.listFiles((FileFilter)localObject);
        if (localObject != null);
        for (sCpuCount = localObject.length; ; sCpuCount = 1)
        {
          LogUtils.v("DeviceUtils", "sCpuCount:" + sCpuCount);
          i = sCpuCount;
          AppMethodBeat.o(49888);
          break;
        }
      }
      catch (Throwable localThrowable)
      {
        while (true)
        {
          LogUtils.e(localThrowable);
          sCpuCount = 1;
        }
      }
    }
  }

  public static String getOSVersion()
  {
    return Build.VERSION.RELEASE;
  }

  public static int getOpenGlEsVersion(Context paramContext)
  {
    AppMethodBeat.i(49905);
    paramContext = ((ActivityManager)paramContext.getSystemService("activity")).getDeviceConfigurationInfo();
    int i;
    if (paramContext != null)
    {
      i = paramContext.reqGlEsVersion;
      AppMethodBeat.o(49905);
    }
    while (true)
    {
      return i;
      i = 65536;
      AppMethodBeat.o(49905);
    }
  }

  private static long getRuntimeFreeMemory(int paramInt)
  {
    AppMethodBeat.i(49887);
    long l;
    switch (paramInt)
    {
    default:
      l = Runtime.getRuntime().freeMemory();
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      LogUtils.v(TAG, "[getRuntimeFreeMemory] freeMemory = " + Runtime.getRuntime().freeMemory() / 1024L / 1024L + "(Mb), " + Runtime.getRuntime().freeMemory() / 1024L + "(Kb)");
      AppMethodBeat.o(49887);
      return l;
      l = Runtime.getRuntime().freeMemory();
      continue;
      l = Runtime.getRuntime().freeMemory() / 1024L;
      continue;
      l = Runtime.getRuntime().freeMemory() / 1024L / 1024L;
    }
  }

  private static long getRuntimeMaxMemory(int paramInt)
  {
    AppMethodBeat.i(49884);
    long l = Runtime.getRuntime().maxMemory();
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      LogUtils.v(TAG, "[getRuntimeMaxMemory] maxMemory = " + Runtime.getRuntime().maxMemory() / 1024L / 1024L + "(Mb), " + Runtime.getRuntime().maxMemory() / 1024L + "(Kb)");
      AppMethodBeat.o(49884);
      return l;
      l = Runtime.getRuntime().maxMemory();
      continue;
      l = Runtime.getRuntime().maxMemory() / 1024L;
      continue;
      l = Runtime.getRuntime().maxMemory() / 1024L / 1024L;
    }
  }

  public static long getRuntimeRemainSize(int paramInt)
  {
    AppMethodBeat.i(49885);
    long l1 = Runtime.getRuntime().maxMemory() - getHeapAllocatedSizeInKb() * 1024L;
    long l2 = l1;
    switch (paramInt)
    {
    default:
      l2 = l1;
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      LogUtils.v(TAG, "[getRuntimeRemainSize] remainMemory = " + l2 + " " + paramInt);
      AppMethodBeat.o(49885);
      return l2;
      l2 = l1 / 1024L;
      continue;
      l2 = l1 / 1048576L;
    }
  }

  private static long getRuntimeTotalMemory(int paramInt)
  {
    AppMethodBeat.i(49886);
    long l;
    switch (paramInt)
    {
    default:
      l = Runtime.getRuntime().totalMemory();
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      LogUtils.v(TAG, "[getRuntimeTotalMemory] totalMemory = " + Runtime.getRuntime().totalMemory() / 1024L / 1024L + "(Mb), " + Runtime.getRuntime().totalMemory() / 1024L + "(Kb)");
      AppMethodBeat.o(49886);
      return l;
      l = Runtime.getRuntime().totalMemory();
      continue;
      l = Runtime.getRuntime().totalMemory() / 1024L;
      continue;
      l = Runtime.getRuntime().totalMemory() / 1024L / 1024L;
    }
  }

  public static int getScreenHeight(Context paramContext)
  {
    AppMethodBeat.i(49875);
    int i = paramContext.getResources().getDisplayMetrics().heightPixels;
    AppMethodBeat.o(49875);
    return i;
  }

  public static int getScreenHeightWithNavigationBar(Activity paramActivity)
  {
    AppMethodBeat.i(49906);
    int i = getScreenHeight(paramActivity);
    int j = getNavigationBarHeight(paramActivity);
    AppMethodBeat.o(49906);
    return i + j;
  }

  public static float getScreenRatio(Context paramContext)
  {
    AppMethodBeat.i(49876);
    int i = getScreenWidth(paramContext);
    int j = getScreenHeight(paramContext);
    int k = Math.max(i, j);
    i = Math.min(i, j);
    j = k;
    if (NotchInScreenUtils.hasNotchInScreenHw(paramContext))
      j = k - NotchInScreenUtils.getNotchHeightHw(paramContext);
    float f = i * 1.0F / j;
    AppMethodBeat.o(49876);
    return f;
  }

  public static String getScreenSize(Context paramContext)
  {
    AppMethodBeat.i(49909);
    paramContext = paramContext.getResources().getDisplayMetrics();
    paramContext = paramContext.widthPixels + "*" + paramContext.heightPixels;
    AppMethodBeat.o(49909);
    return paramContext;
  }

  public static int getScreenWidth(Context paramContext)
  {
    AppMethodBeat.i(49874);
    int i = paramContext.getResources().getDisplayMetrics().widthPixels;
    AppMethodBeat.o(49874);
    return i;
  }

  public static int getSystemScreenBrightness(ContentResolver paramContentResolver)
  {
    AppMethodBeat.i(49924);
    int i = 0;
    try
    {
      j = Settings.System.getInt(paramContentResolver, "screen_brightness");
      AppMethodBeat.o(49924);
      return j;
    }
    catch (Exception paramContentResolver)
    {
      while (true)
      {
        LogUtils.e(paramContentResolver);
        int j = i;
      }
    }
  }

  public static int getSystemScreenMode(ContentResolver paramContentResolver)
  {
    AppMethodBeat.i(49925);
    int i = -1;
    try
    {
      j = Settings.System.getInt(paramContentResolver, "screen_brightness_mode");
      AppMethodBeat.o(49925);
      return j;
    }
    catch (Exception paramContentResolver)
    {
      while (true)
      {
        LogUtils.e(paramContentResolver);
        int j = i;
      }
    }
  }

  @TargetApi(18)
  public static long getTotalSize(StatFs paramStatFs)
  {
    AppMethodBeat.i(49892);
    if (ApiHelper.hasJellyBeanMR2());
    for (long l = paramStatFs.getTotalBytes(); ; l = paramStatFs.getBlockCount() * paramStatFs.getBlockSize())
    {
      AppMethodBeat.o(49892);
      return l;
    }
  }

  public static int getVersionCode(Context paramContext)
  {
    AppMethodBeat.i(49898);
    try
    {
      i = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 16384).versionCode;
      AppMethodBeat.o(49898);
      return i;
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        int i = -1;
        AppMethodBeat.o(49898);
      }
    }
  }

  public static String getVersionName(Context paramContext)
  {
    AppMethodBeat.i(49900);
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).versionName;
      AppMethodBeat.o(49900);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        paramContext = null;
        AppMethodBeat.o(49900);
      }
    }
  }

  public static int getVersionNameCode(Context paramContext)
  {
    int i = 0;
    AppMethodBeat.i(49899);
    String[] arrayOfString = getVersionName(paramContext).split("\\.");
    paramContext = "";
    if (arrayOfString.length >= 3)
      paramContext = arrayOfString[0] + arrayOfString[1] + arrayOfString[2];
    try
    {
      int j = Integer.parseInt(paramContext);
      i = j;
      AppMethodBeat.o(49899);
      return i;
    }
    catch (Throwable paramContext)
    {
      while (true)
      {
        LogUtils.e(paramContext);
        AppMethodBeat.o(49899);
      }
    }
  }

  public static float getWindowScreenBrightness(Window paramWindow)
  {
    AppMethodBeat.i(49922);
    float f = paramWindow.getAttributes().screenBrightness;
    AppMethodBeat.o(49922);
    return f;
  }

  public static boolean isExternalStorageAvailable()
  {
    boolean bool = false;
    AppMethodBeat.i(49894);
    try
    {
      if (("mounted".equals(Environment.getExternalStorageState())) || (!Environment.isExternalStorageRemovable()))
      {
        new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
        bool = true;
        AppMethodBeat.o(49894);
      }
      while (true)
      {
        return bool;
        AppMethodBeat.o(49894);
      }
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(49894);
    }
  }

  public static boolean isExternalStorageSpaceEnough(long paramLong)
  {
    AppMethodBeat.i(49895);
    File localFile = Environment.getExternalStorageDirectory();
    try
    {
      StatFs localStatFs = new android/os/StatFs;
      localStatFs.<init>(localFile.getAbsolutePath());
      if (getAvailableSize(localStatFs) > paramLong)
      {
        bool = true;
        AppMethodBeat.o(49895);
      }
      while (true)
      {
        return bool;
        AppMethodBeat.o(49895);
        bool = false;
      }
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      while (true)
      {
        AppMethodBeat.o(49895);
        boolean bool = false;
      }
    }
  }

  public static boolean isHighEndDevice(Context paramContext)
  {
    boolean bool1 = true;
    AppMethodBeat.i(49872);
    LogUtils.i(TAG, "[isHighEndDevice] + BEGIN");
    DeviceInstance.SOC_CLASS localSOC_CLASS = DeviceInstance.getInstance().getDeviceSocClass(DeviceAttrs.getInstance().str_deviceSocInfo);
    LogUtils.i(TAG, "[isHighEndDevice] socClass = ".concat(String.valueOf(localSOC_CLASS)));
    boolean bool2;
    if (localSOC_CLASS != DeviceInstance.SOC_CLASS.NULL)
    {
      if (localSOC_CLASS == DeviceInstance.SOC_CLASS.HIGH);
      for (bool2 = bool1; ; bool2 = false)
      {
        LogUtils.i(TAG, "[isHighEndDevice] + END, isHighEndDevice = ".concat(String.valueOf(bool2)));
        AppMethodBeat.o(49872);
        return bool2;
      }
    }
    int i = getScreenWidth(paramContext);
    int j = getScreenHeight(paramContext);
    label118: boolean bool3;
    if (i * j >= 1900800L)
    {
      bool2 = true;
      LogUtils.d(TAG, "[isHighEndDevice] isHighDisplay = " + bool2 + ", widthPixels = " + i + ", heightPixels = " + j);
      long l = getHeapMaxSizeInMb(paramContext);
      if (l < 256L)
        break label295;
      bool3 = true;
      label181: LogUtils.d(TAG, "[isHighEndDevice] isHighMemory = " + bool3 + ", deviceHeapSize(Mb) = " + l);
      i = getNumCores();
      if (i < 4L)
        break label301;
    }
    label295: label301: for (boolean bool4 = true; ; bool4 = false)
    {
      LogUtils.d(TAG, "[isHighEndDevice] isHighCpuCount = " + bool4 + ", cpuCount = " + i);
      if ((bool2) && (bool3))
      {
        bool2 = bool1;
        if (bool4)
          break;
      }
      bool2 = false;
      break;
      bool2 = false;
      break label118;
      bool3 = false;
      break label181;
    }
  }

  public static boolean isLowEndDevice(Context paramContext)
  {
    boolean bool1 = true;
    AppMethodBeat.i(49871);
    LogUtils.i(TAG, "[isLowEndDevice] + BEGIN");
    DeviceInstance.SOC_CLASS localSOC_CLASS = DeviceInstance.getInstance().getDeviceSocClass(DeviceAttrs.getInstance().str_deviceSocInfo);
    LogUtils.i(TAG, "[isLowEndDevice] socClass = ".concat(String.valueOf(localSOC_CLASS)));
    boolean bool2;
    if (localSOC_CLASS != DeviceInstance.SOC_CLASS.NULL)
    {
      if (localSOC_CLASS == DeviceInstance.SOC_CLASS.LOW);
      for (bool2 = bool1; ; bool2 = false)
      {
        LogUtils.i(TAG, "[isLowEndDevice] + END, isLowEndDevice = ".concat(String.valueOf(bool2)));
        AppMethodBeat.o(49871);
        return bool2;
      }
    }
    int i = getScreenWidth(paramContext);
    int j = getScreenHeight(paramContext);
    boolean bool3;
    label119: boolean bool4;
    if (i * j <= 307200L)
    {
      bool3 = true;
      LogUtils.d(TAG, "[isLowEndDevice] isLowEndDisplay = " + bool3 + ", widthPixels = " + i + ", heightPixels = " + j);
      long l = getHeapMaxSizeInMb(paramContext);
      if (l > 64L)
        break label301;
      bool4 = true;
      label183: LogUtils.d(TAG, "[isLowEndDevice] isLowMemory = " + bool4 + ", deviceHeapSize(Mb) = " + l);
      j = getNumCores();
      if (j > 1L)
        break label307;
    }
    label301: label307: for (boolean bool5 = true; ; bool5 = false)
    {
      LogUtils.d(TAG, "[isLowEndDevice] isLowCpuCount = " + bool5 + ", cpuCount = " + j);
      bool2 = bool1;
      if (bool3)
        break;
      bool2 = bool1;
      if (bool4)
        break;
      bool2 = bool1;
      if (bool5)
        break;
      bool2 = false;
      break;
      bool3 = false;
      break label119;
      bool4 = false;
      break label183;
    }
  }

  public static boolean isMiddleEndDevice(Context paramContext)
  {
    boolean bool = true;
    AppMethodBeat.i(49873);
    LogUtils.i(TAG, "[isMiddleEndDevice] + BEGIN");
    DeviceInstance.SOC_CLASS localSOC_CLASS = DeviceInstance.getInstance().getDeviceSocClass(DeviceAttrs.getInstance().str_deviceSocInfo);
    LogUtils.i(TAG, "[isMiddleEndDevice] socClass = ".concat(String.valueOf(localSOC_CLASS)));
    if (localSOC_CLASS != DeviceInstance.SOC_CLASS.NULL)
      if (localSOC_CLASS != DeviceInstance.SOC_CLASS.NORMAL);
    while (true)
    {
      LogUtils.i(TAG, "[isMiddleEndDevice] + END, isMiddleEndDevice = ".concat(String.valueOf(bool)));
      AppMethodBeat.o(49873);
      return bool;
      bool = false;
      continue;
      if ((isLowEndDevice(paramContext)) || (isHighEndDevice(paramContext)))
        bool = false;
    }
  }

  public static boolean isMobileNetwork(Context paramContext)
  {
    AppMethodBeat.i(49913);
    boolean bool;
    if (paramContext == null)
    {
      AppMethodBeat.o(49913);
      bool = false;
    }
    while (true)
    {
      return bool;
      paramContext = (ConnectivityManager)paramContext.getSystemService("connectivity");
      if (paramContext == null)
      {
        AppMethodBeat.o(49913);
        bool = false;
      }
      else
      {
        paramContext = paramContext.getNetworkInfo(0);
        if ((paramContext != null) && (paramContext.isAvailable()) && (paramContext.isConnected()))
        {
          bool = true;
          AppMethodBeat.o(49913);
        }
        else
        {
          AppMethodBeat.o(49913);
          bool = false;
        }
      }
    }
  }

  public static boolean isNavigationBarShow(Activity paramActivity)
  {
    boolean bool1 = true;
    AppMethodBeat.i(49908);
    if (Build.VERSION.SDK_INT >= 17)
    {
      paramActivity = paramActivity.getWindowManager().getDefaultDisplay();
      Point localPoint1 = new Point();
      Point localPoint2 = new Point();
      paramActivity.getSize(localPoint1);
      paramActivity.getRealSize(localPoint2);
      if (localPoint2.y != localPoint1.y)
        AppMethodBeat.o(49908);
    }
    while (true)
    {
      return bool1;
      AppMethodBeat.o(49908);
      bool1 = false;
      continue;
      boolean bool2 = ViewConfiguration.get(paramActivity).hasPermanentMenuKey();
      boolean bool3 = KeyCharacterMap.deviceHasKey(4);
      if ((bool2) || (bool3))
      {
        AppMethodBeat.o(49908);
        bool1 = false;
      }
      else
      {
        AppMethodBeat.o(49908);
      }
    }
  }

  public static boolean isNetworkAvailable(Context paramContext)
  {
    AppMethodBeat.i(49903);
    paramContext = (ConnectivityManager)paramContext.getSystemService("connectivity");
    boolean bool;
    if (paramContext == null)
    {
      AppMethodBeat.o(49903);
      bool = false;
    }
    while (true)
    {
      return bool;
      paramContext = paramContext.getActiveNetworkInfo();
      if ((paramContext != null) && (paramContext.isConnectedOrConnecting()))
      {
        bool = true;
        AppMethodBeat.o(49903);
      }
      else
      {
        AppMethodBeat.o(49903);
        bool = false;
      }
    }
  }

  public static boolean isSmoothHidden(Context paramContext)
  {
    AppMethodBeat.i(49870);
    boolean bool;
    if ((isLowEndDevice(paramContext)) || (isVeryLowEndDevice()))
    {
      bool = true;
      AppMethodBeat.o(49870);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(49870);
    }
  }

  public static boolean isValid(Context paramContext)
  {
    boolean bool1 = false;
    AppMethodBeat.i(49904);
    if (getOpenGlEsVersion(paramContext) >= 131072)
    {
      bool2 = true;
      mIsOpenGlEsValid = bool2;
      mIsAllUnusable = false;
      if (mIsOpenGlEsValid)
        break label48;
      AppMethodBeat.o(49904);
    }
    for (boolean bool2 = bool1; ; bool2 = true)
    {
      return bool2;
      bool2 = false;
      break;
      label48: AppMethodBeat.o(49904);
    }
  }

  public static boolean isVeryLowEndDevice()
  {
    boolean bool1 = false;
    AppMethodBeat.i(49869);
    LogUtils.i(TAG, "[isVeryLowEndDevice] + BEGIN");
    DeviceInstance.SOC_CLASS localSOC_CLASS = DeviceInstance.getInstance().getDeviceSocClass(DeviceAttrs.getInstance().str_deviceSocInfo);
    LogUtils.i(TAG, "[isVeryLowEndDevice] socClass = ".concat(String.valueOf(localSOC_CLASS)));
    boolean bool2 = bool1;
    if (localSOC_CLASS != DeviceInstance.SOC_CLASS.NULL)
    {
      bool2 = bool1;
      if (localSOC_CLASS == DeviceInstance.SOC_CLASS.V_LOW)
        bool2 = true;
    }
    LogUtils.i(TAG, "[isVeryLowEndDevice] + END, isVeryLowDevice = ".concat(String.valueOf(bool2)));
    AppMethodBeat.o(49869);
    return bool2;
  }

  public static boolean isWifiNetwork(Context paramContext)
  {
    AppMethodBeat.i(49914);
    boolean bool;
    if (paramContext == null)
    {
      AppMethodBeat.o(49914);
      bool = false;
    }
    while (true)
    {
      return bool;
      paramContext = (ConnectivityManager)paramContext.getSystemService("connectivity");
      if (paramContext == null)
      {
        AppMethodBeat.o(49914);
        bool = false;
      }
      else
      {
        paramContext = paramContext.getNetworkInfo(1);
        if ((paramContext != null) && (paramContext.isAvailable()) && (paramContext.isConnected()))
        {
          AppMethodBeat.o(49914);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(49914);
          bool = false;
        }
      }
    }
  }

  private static String parse(String paramString)
  {
    AppMethodBeat.i(49920);
    paramString = Pattern.compile("(\\d{1,3})[.](\\d{1,3})[.](\\d{1,3})[.](\\d{1,3})", 2).matcher(paramString);
    if (paramString.find())
    {
      paramString = paramString.group(0);
      AppMethodBeat.o(49920);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(49920);
    }
  }

  public static void setSystemScreenBrightness(ContentResolver paramContentResolver, int paramInt)
  {
    AppMethodBeat.i(49927);
    try
    {
      Settings.System.putInt(paramContentResolver, "screen_brightness", paramInt);
      AppMethodBeat.o(49927);
      return;
    }
    catch (Exception paramContentResolver)
    {
      while (true)
      {
        LogUtils.e(paramContentResolver);
        AppMethodBeat.o(49927);
      }
    }
  }

  public static void setSystemScreenMode(ContentResolver paramContentResolver, int paramInt)
  {
    AppMethodBeat.i(49926);
    try
    {
      Settings.System.putInt(paramContentResolver, "screen_brightness_mode", paramInt);
      paramContentResolver.notifyChange(Settings.System.getUriFor("screen_brightness_mode"), null);
      AppMethodBeat.o(49926);
      return;
    }
    catch (Exception paramContentResolver)
    {
      while (true)
      {
        LogUtils.e(paramContentResolver);
        AppMethodBeat.o(49926);
      }
    }
  }

  public static void setWindowScreenBrightness(Window paramWindow, float paramFloat)
  {
    AppMethodBeat.i(49923);
    WindowManager.LayoutParams localLayoutParams = paramWindow.getAttributes();
    localLayoutParams.screenBrightness = paramFloat;
    paramWindow.setAttributes(localLayoutParams);
    AppMethodBeat.o(49923);
  }

  public static boolean veryLargeScreen(Context paramContext)
  {
    AppMethodBeat.i(49910);
    boolean bool;
    if (getScreenHeight(paramContext) * getScreenWidth(paramContext) >= 2073600)
    {
      bool = true;
      AppMethodBeat.o(49910);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(49910);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.device.DeviceUtils
 * JD-Core Version:    0.6.2
 */
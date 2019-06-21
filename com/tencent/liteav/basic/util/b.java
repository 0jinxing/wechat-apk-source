package com.tencent.liteav.basic.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.media.MediaFormat;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug;
import android.os.Debug.MemoryInfo;
import android.os.Process;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.UUID;

public class b
{
  public static long a;
  private static float b;
  private static float c;
  private static float d;
  private static float e;
  private static float f;
  private static float g;
  private static boolean h;
  private static int[] i;
  private static long j;
  private static String k;
  private static int l;
  private static long m;
  private static final Object n;
  private static boolean o;
  private static int[] p;

  static
  {
    AppMethodBeat.i(66021);
    b = 0.0F;
    c = 0.0F;
    d = 0.0F;
    e = 0.0F;
    f = 0.0F;
    g = 0.0F;
    h = true;
    i = new int[2];
    j = 0L;
    k = "";
    a = 0L;
    l = 0;
    m = 0L;
    n = new Object();
    o = false;
    p = new int[] { 96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350 };
    AppMethodBeat.o(66021);
  }

  public static int a(int paramInt)
  {
    for (int i1 = 0; (i1 < p.length) && (p[i1] != paramInt); i1++);
    paramInt = i1;
    if (i1 >= p.length)
      paramInt = -1;
    return paramInt;
  }

  @TargetApi(16)
  public static MediaFormat a(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(66017);
    int i1 = a(paramInt1);
    ByteBuffer localByteBuffer = ByteBuffer.allocate(2);
    localByteBuffer.put(0, (byte)(paramInt3 << 3 | i1 >> 1));
    localByteBuffer.put(1, (byte)((i1 & 0x1) << 7 | paramInt2 << 3));
    MediaFormat localMediaFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", paramInt1, paramInt2);
    localMediaFormat.setInteger("channel-count", paramInt2);
    localMediaFormat.setInteger("sample-rate", paramInt1);
    localMediaFormat.setByteBuffer("csd-0", localByteBuffer);
    AppMethodBeat.o(66017);
    return localMediaFormat;
  }

  @TargetApi(16)
  public static MediaFormat a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(66020);
    MediaFormat localMediaFormat = MediaFormat.createVideoFormat("video/avc", paramInt1, paramInt2);
    paramInt1 = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    paramInt2 = 0;
    if (paramInt1 + 3 < paramArrayOfByte.length)
      if ((paramArrayOfByte[paramInt1] != 0) || (paramArrayOfByte[(paramInt1 + 1)] != 0) || (paramArrayOfByte[(paramInt1 + 2)] != 1))
        break label330;
    label330: for (int i4 = 3; ; i4 = 0)
    {
      int i5 = i4;
      if (paramArrayOfByte[paramInt1] == 0)
      {
        i5 = i4;
        if (paramArrayOfByte[(paramInt1 + 1)] == 0)
        {
          i5 = i4;
          if (paramArrayOfByte[(paramInt1 + 2)] == 0)
          {
            i5 = i4;
            if (paramArrayOfByte[(paramInt1 + 3)] == 1)
              i5 = 4;
          }
        }
      }
      int i6 = paramInt1;
      i4 = i2;
      if (i5 > 0)
      {
        if (i2 == 0)
        {
          i6 = paramInt1 + i5;
          i4 = i5;
        }
      }
      else
      {
        i5 = i6;
        i2 = i4;
      }
      while (true)
      {
        paramInt1 = i5 + 1;
        break;
        i6 = paramArrayOfByte[i2] & 0x1F;
        if (i6 == 7)
        {
          a("csd-0", localMediaFormat, paramArrayOfByte, i2, paramInt1);
          i4 = 1;
          i2 = paramInt1 + i5;
          if ((i4 != 0) && (i3 != 0))
          {
            AppMethodBeat.o(66020);
            paramArrayOfByte = localMediaFormat;
          }
        }
        else
        {
          while (true)
          {
            return paramArrayOfByte;
            i4 = paramInt2;
            if (i6 != 8)
              break;
            a("csd-1", localMediaFormat, paramArrayOfByte, i2, paramInt1);
            i3 = 1;
            i4 = paramInt2;
            break;
            paramInt1 = paramArrayOfByte[i2] & 0x1F;
            if ((paramInt2 != 0) && (paramInt1 == 8))
            {
              a("csd-1", localMediaFormat, paramArrayOfByte, i2, i1);
              AppMethodBeat.o(66020);
              paramArrayOfByte = localMediaFormat;
            }
            else if ((i3 != 0) && (paramInt1 == 7))
            {
              a("csd-0", localMediaFormat, paramArrayOfByte, i2, i1);
              AppMethodBeat.o(66020);
              paramArrayOfByte = localMediaFormat;
            }
            else
            {
              paramArrayOfByte = null;
              AppMethodBeat.o(66020);
            }
          }
        }
        i5 = i2;
        i1 = paramInt1;
        paramInt2 = i4;
      }
    }
  }

  public static com.tencent.liteav.basic.e.a a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = 0;
    AppMethodBeat.i(66013);
    if (paramInt1 * paramInt4 >= paramInt2 * paramInt3)
    {
      paramInt3 = paramInt2 * paramInt3 / paramInt4;
      paramInt4 = paramInt2;
      if (paramInt1 <= paramInt3)
        break label81;
    }
    label81: for (paramInt1 = paramInt1 - paramInt3 >> 1; ; paramInt1 = 0)
    {
      if (paramInt2 > paramInt4)
        i1 = paramInt2 - paramInt4 >> 1;
      com.tencent.liteav.basic.e.a locala = new com.tencent.liteav.basic.e.a(paramInt1, i1, paramInt3, paramInt4);
      AppMethodBeat.o(66013);
      return locala;
      paramInt4 = paramInt1 * paramInt4 / paramInt3;
      paramInt3 = paramInt1;
      break;
    }
  }

  public static String a(Context paramContext)
  {
    AppMethodBeat.i(66004);
    paramContext = TXCDRApi.getSimulateIDFA(paramContext);
    AppMethodBeat.o(66004);
    return paramContext;
  }

  public static void a(String paramString)
  {
    AppMethodBeat.i(66015);
    try
    {
      System.loadLibrary(paramString);
      AppMethodBeat.o(66015);
      return;
    }
    catch (Error localError)
    {
      while (true)
      {
        new StringBuilder("load library : ").append(localError.toString());
        b(k, paramString);
        AppMethodBeat.o(66015);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        new StringBuilder("load library : ").append(localException.toString());
        b(k, paramString);
        AppMethodBeat.o(66015);
      }
    }
  }

  private static void a(String paramString, MediaFormat paramMediaFormat, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(66019);
    ByteBuffer localByteBuffer = ByteBuffer.allocate(paramInt2 - paramInt1);
    localByteBuffer.put(paramArrayOfByte, paramInt1, paramInt2 - paramInt1);
    localByteBuffer.position(0);
    paramMediaFormat.setByteBuffer(paramString, localByteBuffer);
    AppMethodBeat.o(66019);
  }

  public static void a(WeakReference<com.tencent.liteav.basic.d.a> paramWeakReference, int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(66011);
    if (paramWeakReference == null)
      AppMethodBeat.o(66011);
    while (true)
    {
      return;
      paramWeakReference = (com.tencent.liteav.basic.d.a)paramWeakReference.get();
      if (paramWeakReference != null)
        paramWeakReference.onNotifyEvent(paramInt, paramBundle);
      AppMethodBeat.o(66011);
    }
  }

  public static void a(WeakReference<com.tencent.liteav.basic.d.a> paramWeakReference, int paramInt, String paramString)
  {
    AppMethodBeat.i(66010);
    Bundle localBundle = new Bundle();
    localBundle.putInt("EVT_ID", paramInt);
    localBundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
    if (paramString != null)
      localBundle.putCharSequence("EVT_MSG", paramString);
    a(paramWeakReference, paramInt, localBundle);
    AppMethodBeat.o(66010);
  }

  public static void a(WeakReference<com.tencent.liteav.basic.d.a> paramWeakReference, long paramLong, int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(66012);
    if (paramWeakReference == null)
      AppMethodBeat.o(66012);
    while (true)
    {
      return;
      paramWeakReference = (com.tencent.liteav.basic.d.a)paramWeakReference.get();
      if (paramWeakReference != null)
      {
        paramBundle.putLong("EVT_USERID", paramLong);
        paramWeakReference.onNotifyEvent(paramInt, paramBundle);
      }
      AppMethodBeat.o(66012);
    }
  }

  public static void a(WeakReference<com.tencent.liteav.basic.d.a> paramWeakReference, long paramLong, int paramInt, String paramString)
  {
    AppMethodBeat.i(66009);
    Bundle localBundle = new Bundle();
    localBundle.putLong("EVT_USERID", paramLong);
    localBundle.putInt("EVT_ID", paramInt);
    localBundle.putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
    if (paramString != null)
      localBundle.putCharSequence("EVT_MSG", paramString);
    a(paramWeakReference, paramInt, localBundle);
    AppMethodBeat.o(66009);
  }

  // ERROR //
  public static boolean a(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: ldc 243
    //   4: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: aload_0
    //   8: ifnull +7 -> 15
    //   11: aload_1
    //   12: ifnonnull +10 -> 22
    //   15: ldc 243
    //   17: invokestatic 79	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   20: iload_2
    //   21: ireturn
    //   22: new 245	java/io/File
    //   25: astore_3
    //   26: aload_3
    //   27: aload_0
    //   28: invokespecial 246	java/io/File:<init>	(Ljava/lang/String;)V
    //   31: aload_3
    //   32: invokevirtual 250	java/io/File:exists	()Z
    //   35: istore 4
    //   37: iload 4
    //   39: ifne +11 -> 50
    //   42: ldc 243
    //   44: invokestatic 79	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   47: goto -27 -> 20
    //   50: new 252	android/media/MediaMetadataRetriever
    //   53: astore_3
    //   54: aload_3
    //   55: invokespecial 253	android/media/MediaMetadataRetriever:<init>	()V
    //   58: aload_3
    //   59: aload_0
    //   60: invokevirtual 256	android/media/MediaMetadataRetriever:setDataSource	(Ljava/lang/String;)V
    //   63: aload_3
    //   64: invokevirtual 260	android/media/MediaMetadataRetriever:getFrameAtTime	()Landroid/graphics/Bitmap;
    //   67: astore 5
    //   69: new 245	java/io/File
    //   72: astore_0
    //   73: aload_0
    //   74: aload_1
    //   75: invokespecial 246	java/io/File:<init>	(Ljava/lang/String;)V
    //   78: aload_0
    //   79: invokevirtual 250	java/io/File:exists	()Z
    //   82: ifeq +8 -> 90
    //   85: aload_0
    //   86: invokevirtual 263	java/io/File:delete	()Z
    //   89: pop
    //   90: new 265	java/io/FileOutputStream
    //   93: astore_1
    //   94: aload_1
    //   95: aload_0
    //   96: invokespecial 268	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   99: aload 5
    //   101: getstatic 274	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   104: bipush 100
    //   106: aload_1
    //   107: invokevirtual 280	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   110: pop
    //   111: aload_1
    //   112: invokevirtual 283	java/io/FileOutputStream:flush	()V
    //   115: aload_1
    //   116: invokevirtual 286	java/io/FileOutputStream:close	()V
    //   119: aload_3
    //   120: invokevirtual 289	android/media/MediaMetadataRetriever:release	()V
    //   123: iconst_1
    //   124: istore_2
    //   125: ldc 243
    //   127: invokestatic 79	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   130: goto -110 -> 20
    //   133: astore_0
    //   134: aconst_null
    //   135: astore_3
    //   136: aconst_null
    //   137: astore_0
    //   138: aload_0
    //   139: ifnull +7 -> 146
    //   142: aload_0
    //   143: invokevirtual 286	java/io/FileOutputStream:close	()V
    //   146: aload_3
    //   147: ifnull +7 -> 154
    //   150: aload_3
    //   151: invokevirtual 289	android/media/MediaMetadataRetriever:release	()V
    //   154: ldc 243
    //   156: invokestatic 79	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   159: goto -139 -> 20
    //   162: astore_0
    //   163: aconst_null
    //   164: astore_3
    //   165: aconst_null
    //   166: astore_1
    //   167: aload_1
    //   168: ifnull +7 -> 175
    //   171: aload_1
    //   172: invokevirtual 286	java/io/FileOutputStream:close	()V
    //   175: aload_3
    //   176: ifnull +7 -> 183
    //   179: aload_3
    //   180: invokevirtual 289	android/media/MediaMetadataRetriever:release	()V
    //   183: ldc 243
    //   185: invokestatic 79	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   188: aload_0
    //   189: athrow
    //   190: astore_0
    //   191: goto -72 -> 119
    //   194: astore_0
    //   195: goto -49 -> 146
    //   198: astore_1
    //   199: goto -24 -> 175
    //   202: astore_0
    //   203: aconst_null
    //   204: astore_1
    //   205: goto -38 -> 167
    //   208: astore_0
    //   209: goto -42 -> 167
    //   212: astore_0
    //   213: aconst_null
    //   214: astore_0
    //   215: goto -77 -> 138
    //   218: astore_0
    //   219: aload_1
    //   220: astore_0
    //   221: goto -83 -> 138
    //
    // Exception table:
    //   from	to	target	type
    //   22	37	133	java/lang/Exception
    //   50	58	133	java/lang/Exception
    //   22	37	162	finally
    //   50	58	162	finally
    //   115	119	190	java/io/IOException
    //   142	146	194	java/io/IOException
    //   171	175	198	java/io/IOException
    //   58	90	202	finally
    //   90	99	202	finally
    //   99	115	208	finally
    //   58	90	212	java/lang/Exception
    //   90	99	212	java/lang/Exception
    //   99	115	218	java/lang/Exception
  }

  public static int[] a()
  {
    AppMethodBeat.i(66002);
    int[] arrayOfInt;
    if ((j != 0L) && (TXCTimeUtil.getTimeTick() - j < 2000L))
    {
      arrayOfInt = i;
      AppMethodBeat.o(66002);
    }
    while (true)
    {
      return arrayOfInt;
      arrayOfInt = new int[2];
      if (!h)
        break;
      d = (float)g();
      h();
      h = false;
      arrayOfInt[0] = 0;
      arrayOfInt[1] = 0;
      AppMethodBeat.o(66002);
    }
    e = (float)g();
    h();
    float f1;
    float f2;
    if (c != b)
    {
      f1 = 100.0F * (e - d) / (c - b);
      f2 = 100.0F * (c - b - (g - f)) / (c - b);
    }
    while (true)
    {
      b = c;
      d = e;
      f = g;
      arrayOfInt[0] = ((int)(f1 * 10.0F));
      arrayOfInt[1] = ((int)(f2 * 10.0F));
      i[0] = arrayOfInt[0];
      i[1] = arrayOfInt[1];
      j = TXCTimeUtil.getTimeTick();
      AppMethodBeat.o(66002);
      break;
      f2 = 0.0F;
      f1 = 0.0F;
    }
  }

  public static int b()
  {
    AppMethodBeat.i(66003);
    try
    {
      int i1;
      if ((m != 0L) && (TXCTimeUtil.getTimeTick() - m < 10000L))
      {
        i1 = l;
        AppMethodBeat.o(66003);
      }
      while (true)
      {
        return i1;
        Debug.MemoryInfo localMemoryInfo = new android/os/Debug$MemoryInfo;
        localMemoryInfo.<init>();
        Debug.getMemoryInfo(localMemoryInfo);
        i1 = localMemoryInfo.getTotalPss();
        m = TXCTimeUtil.getTimeTick();
        l = i1 / 1024;
        label71: i1 = l;
        AppMethodBeat.o(66003);
      }
    }
    catch (Exception localException)
    {
      break label71;
    }
  }

  public static String b(Context paramContext)
  {
    AppMethodBeat.i(66005);
    String str1 = "";
    String str2 = str1;
    if (paramContext != null);
    try
    {
      str2 = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).packageName;
      AppMethodBeat.o(66005);
      return str2;
    }
    catch (Exception paramContext)
    {
      while (true)
        str2 = str1;
    }
  }

  public static void b(String paramString)
  {
    k = paramString;
  }

  private static void b(String paramString1, String paramString2)
  {
    AppMethodBeat.i(66016);
    try
    {
      if (!TextUtils.isEmpty(paramString1))
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        System.load(paramString1 + "/lib" + paramString2 + ".so");
      }
      AppMethodBeat.o(66016);
      return;
    }
    catch (Error paramString1)
    {
      while (true)
      {
        new StringBuilder("load library : ").append(paramString1.toString());
        AppMethodBeat.o(66016);
      }
    }
    catch (Exception paramString1)
    {
      while (true)
      {
        new StringBuilder("load library : ").append(paramString1.toString());
        AppMethodBeat.o(66016);
      }
    }
  }

  public static int c(Context paramContext)
  {
    AppMethodBeat.i(66006);
    int i1;
    if (paramContext == null)
    {
      AppMethodBeat.o(66006);
      i1 = 255;
    }
    while (true)
    {
      return i1;
      Object localObject = (ConnectivityManager)paramContext.getSystemService("connectivity");
      paramContext = (TelephonyManager)paramContext.getSystemService("phone");
      localObject = ((ConnectivityManager)localObject).getActiveNetworkInfo();
      if (localObject == null)
      {
        AppMethodBeat.o(66006);
        i1 = 255;
      }
      else if (!((NetworkInfo)localObject).isConnected())
      {
        AppMethodBeat.o(66006);
        i1 = 255;
      }
      else if (((NetworkInfo)localObject).getType() == 9)
      {
        i1 = 5;
        AppMethodBeat.o(66006);
      }
      else if (((NetworkInfo)localObject).getType() == 1)
      {
        AppMethodBeat.o(66006);
        i1 = 1;
      }
      else if (((NetworkInfo)localObject).getType() == 0)
      {
        switch (paramContext.getNetworkType())
        {
        default:
          AppMethodBeat.o(66006);
          i1 = 2;
          break;
        case 1:
        case 2:
        case 4:
        case 7:
        case 11:
          i1 = 4;
          AppMethodBeat.o(66006);
          break;
        case 3:
        case 5:
        case 6:
        case 8:
        case 9:
        case 10:
        case 12:
        case 14:
        case 15:
          i1 = 3;
          AppMethodBeat.o(66006);
          break;
        case 13:
          AppMethodBeat.o(66006);
          i1 = 2;
          break;
        }
      }
      else
      {
        AppMethodBeat.o(66006);
        i1 = 255;
      }
    }
  }

  public static String c()
  {
    return Build.MODEL;
  }

  public static String d()
  {
    AppMethodBeat.i(66007);
    String str = UUID.randomUUID().toString();
    AppMethodBeat.o(66007);
    return str;
  }

  public static String d(Context paramContext)
  {
    AppMethodBeat.i(66008);
    paramContext = TXCDRApi.getDevUUID(paramContext, TXCDRApi.getSimulateIDFA(paramContext));
    AppMethodBeat.o(66008);
    return paramContext;
  }

  public static void e()
  {
    AppMethodBeat.i(66014);
    synchronized (n)
    {
      if (!o)
      {
        a("stlport_shared");
        a("saturn");
        a("txffmpeg");
        a("liteavsdk");
        o = true;
      }
      AppMethodBeat.o(66014);
      return;
    }
  }

  public static String f()
  {
    return k;
  }

  private static long g()
  {
    AppMethodBeat.i(66000);
    long l1 = 0L;
    try
    {
      int i1 = Process.myPid();
      Object localObject1 = new java/io/BufferedReader;
      Object localObject2 = new java/io/InputStreamReader;
      FileInputStream localFileInputStream = new java/io/FileInputStream;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("/proc/");
      localFileInputStream.<init>(i1 + "/stat");
      ((InputStreamReader)localObject2).<init>(localFileInputStream);
      ((BufferedReader)localObject1).<init>((Reader)localObject2, 1000);
      localObject2 = ((BufferedReader)localObject1).readLine();
      ((BufferedReader)localObject1).close();
      localObject1 = ((String)localObject2).split(" ");
      l2 = l1;
      if (localObject1 != null)
      {
        l2 = l1;
        if (!TextUtils.isEmpty(localObject1[13]))
        {
          l2 = Long.parseLong(localObject1[13]);
          long l3 = Long.parseLong(localObject1[14]);
          long l4 = Long.parseLong(localObject1[15]);
          long l5 = Long.parseLong(localObject1[16]);
          l2 = l5 + (l2 + l3 + l4);
        }
      }
      AppMethodBeat.o(66000);
      return l2;
    }
    catch (Exception localException)
    {
      while (true)
        long l2 = l1;
    }
  }

  // ERROR //
  private static void h()
  {
    // Byte code:
    //   0: ldc_w 455
    //   3: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: getstatic 460	android/os/Build$VERSION:SDK_INT	I
    //   9: bipush 26
    //   11: if_icmpge +220 -> 231
    //   14: new 418	java/io/BufferedReader
    //   17: astore_0
    //   18: new 420	java/io/InputStreamReader
    //   21: astore_1
    //   22: new 422	java/io/FileInputStream
    //   25: astore_2
    //   26: aload_2
    //   27: ldc_w 462
    //   30: invokespecial 430	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   33: aload_1
    //   34: aload_2
    //   35: invokespecial 433	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   38: aload_0
    //   39: aload_1
    //   40: sipush 1000
    //   43: invokespecial 436	java/io/BufferedReader:<init>	(Ljava/io/Reader;I)V
    //   46: aload_0
    //   47: invokevirtual 439	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   50: astore_1
    //   51: aload_0
    //   52: invokevirtual 440	java/io/BufferedReader:close	()V
    //   55: aload_1
    //   56: ldc_w 442
    //   59: invokevirtual 448	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   62: astore_0
    //   63: aload_0
    //   64: ifnull +167 -> 231
    //   67: aload_0
    //   68: arraylength
    //   69: bipush 9
    //   71: if_icmplt +160 -> 231
    //   74: aload_0
    //   75: iconst_2
    //   76: aaload
    //   77: invokestatic 454	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   80: lstore_3
    //   81: aload_0
    //   82: iconst_3
    //   83: aaload
    //   84: invokestatic 454	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   87: lstore 5
    //   89: aload_0
    //   90: iconst_4
    //   91: aaload
    //   92: invokestatic 454	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   95: lstore 7
    //   97: aload_0
    //   98: bipush 6
    //   100: aaload
    //   101: invokestatic 454	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   104: lstore 9
    //   106: aload_0
    //   107: iconst_5
    //   108: aaload
    //   109: invokestatic 454	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   112: lstore 11
    //   114: aload_0
    //   115: bipush 7
    //   117: aaload
    //   118: invokestatic 454	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   121: lstore 13
    //   123: aload_0
    //   124: bipush 8
    //   126: aaload
    //   127: invokestatic 454	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   130: lstore 15
    //   132: lload_3
    //   133: lload 5
    //   135: ladd
    //   136: lload 7
    //   138: ladd
    //   139: lload 9
    //   141: ladd
    //   142: lload 11
    //   144: ladd
    //   145: lload 13
    //   147: ladd
    //   148: lload 15
    //   150: ladd
    //   151: lstore 15
    //   153: aload_0
    //   154: iconst_5
    //   155: aaload
    //   156: invokestatic 454	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   159: lstore 7
    //   161: aload_0
    //   162: bipush 6
    //   164: aaload
    //   165: invokestatic 454	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   168: lstore_3
    //   169: lload_3
    //   170: lload 7
    //   172: ladd
    //   173: lstore_3
    //   174: getstatic 49	com/tencent/liteav/basic/util/b:h	Z
    //   177: ifeq +30 -> 207
    //   180: lload 15
    //   182: l2f
    //   183: putstatic 37	com/tencent/liteav/basic/util/b:b	F
    //   186: lload_3
    //   187: l2f
    //   188: putstatic 45	com/tencent/liteav/basic/util/b:f	F
    //   191: ldc_w 455
    //   194: invokestatic 79	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   197: return
    //   198: astore_0
    //   199: lconst_0
    //   200: lstore 15
    //   202: lconst_0
    //   203: lstore_3
    //   204: goto -30 -> 174
    //   207: lload 15
    //   209: l2f
    //   210: putstatic 39	com/tencent/liteav/basic/util/b:c	F
    //   213: lload_3
    //   214: l2f
    //   215: putstatic 47	com/tencent/liteav/basic/util/b:g	F
    //   218: ldc_w 455
    //   221: invokestatic 79	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   224: goto -27 -> 197
    //   227: astore_0
    //   228: goto -26 -> 202
    //   231: lconst_0
    //   232: lstore_3
    //   233: lconst_0
    //   234: lstore 15
    //   236: goto -62 -> 174
    //
    // Exception table:
    //   from	to	target	type
    //   14	63	198	java/lang/Exception
    //   67	132	198	java/lang/Exception
    //   153	169	227	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.basic.util.b
 * JD-Core Version:    0.6.2
 */
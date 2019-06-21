package com.tencent.tmassistantsdk.downloadservice;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Environment;
import android.os.PowerManager.WakeLock;
import android.os.StatFs;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.tmassistantsdk.storage.TMAssistantFile;
import com.tencent.tmassistantsdk.util.GlobalUtil;
import com.tencent.tmassistantsdk.util.TMLog;
import java.io.File;
import java.net.URI;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class DownloadHelper
{
  public static final int PHONE = 1;
  public static final float SAVE_FATOR = 1.5F;
  public static final long SAVE_LENGTH = 104857600L;
  public static final int SDCARD = 2;
  public static final String TAG;
  public static final int UNKNOWN = 0;

  static
  {
    AppMethodBeat.i(75713);
    TAG = DownloadHelper.class.getSimpleName();
    AppMethodBeat.o(75713);
  }

  public static String correctFileName(String paramString)
  {
    AppMethodBeat.i(75703);
    paramString = paramString.replace("?", "_").replace("*", "_").replace(" ", "_").replace("$", "_").replace("&", "_").replace("@", "_").replace("#", "_").replace("<", "_").replace(">", "_").replace("|", "_").replace(":", "_").replace("/", "_").replace("\\", "_").replace("\"", "_");
    AppMethodBeat.o(75703);
    return paramString;
  }

  public static String correctURL(String paramString)
  {
    AppMethodBeat.i(75700);
    paramString = paramString.replace("\r", "").replace("\n", "").trim();
    String str1 = new String(paramString);
    try
    {
      Uri localUri = Uri.parse(paramString);
      String str2 = localUri.getLastPathSegment();
      paramString = str1;
      if (str2 != null)
      {
        paramString = str1;
        if (str2.length() > 0)
          paramString = str1.replace(str2, URLEncoder.encode(localUri.getLastPathSegment()).replace("+", "%20"));
      }
      AppMethodBeat.o(75700);
      return paramString;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.printErrStackTrace(TAG, paramString, "", new Object[0]);
        paramString = str1;
      }
    }
  }

  public static String decodeFileName(String paramString)
  {
    AppMethodBeat.i(75702);
    if (paramString != null)
    {
      paramString = URLDecoder.decode(paramString);
      AppMethodBeat.o(75702);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(75702);
    }
  }

  public static String genAPKFileName(String paramString)
  {
    AppMethodBeat.i(75701);
    if (paramString.contains(".apk"))
    {
      String str = paramString.trim().substring(paramString.lastIndexOf("/") + 1).trim();
      paramString = str;
      if (str.contains("?"))
        paramString = str.substring(0, str.lastIndexOf("?"));
      if (!TextUtils.isEmpty(paramString))
      {
        TMLog.i(TAG, "file name = ".concat(String.valueOf(paramString)));
        paramString = renameAPKFileName(paramString);
        AppMethodBeat.o(75701);
      }
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(75701);
    }
  }

  public static String generateFileNameFromURL(String paramString1, String paramString2)
  {
    AppMethodBeat.i(75706);
    String str1 = GlobalUtil.calcMD5AsString(paramString1);
    String str2 = str1;
    if (TextUtils.isEmpty(str1))
      str2 = Integer.toString(Math.abs(paramString1.hashCode()));
    str1 = "";
    paramString1 = str1;
    if (!TextUtils.isEmpty(paramString2))
    {
      if (!paramString2.equals("application/vnd.android.package-archive"))
        break label80;
      paramString1 = ".apk";
    }
    while (true)
    {
      paramString1 = str2 + paramString1;
      AppMethodBeat.o(75706);
      return paramString1;
      label80: if (paramString2.equals("application/tm.android.apkdiff"))
      {
        paramString1 = ".diff";
      }
      else
      {
        paramString1 = str1;
        if (paramString2.equals("resource/tm.android.unknown"))
          paramString1 = ".other";
      }
    }
  }

  // ERROR //
  public static String getNetStatus()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc 222
    //   5: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: invokestatic 226	com/tencent/tmassistantsdk/util/GlobalUtil:getInstance	()Lcom/tencent/tmassistantsdk/util/GlobalUtil;
    //   11: invokevirtual 230	com/tencent/tmassistantsdk/util/GlobalUtil:getContext	()Landroid/content/Context;
    //   14: astore_0
    //   15: aload_0
    //   16: ifnonnull +16 -> 32
    //   19: ldc 91
    //   21: astore_0
    //   22: ldc 222
    //   24: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   27: ldc 2
    //   29: monitorexit
    //   30: aload_0
    //   31: areturn
    //   32: aload_0
    //   33: ldc 232
    //   35: invokevirtual 237	android/content/Context:checkCallingOrSelfPermission	(Ljava/lang/String;)I
    //   38: ifeq +32 -> 70
    //   41: ldc 91
    //   43: astore_0
    //   44: ldc 222
    //   46: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   49: goto -22 -> 27
    //   52: astore_0
    //   53: ldc 2
    //   55: monitorexit
    //   56: aload_0
    //   57: athrow
    //   58: astore_0
    //   59: ldc 91
    //   61: astore_0
    //   62: ldc 222
    //   64: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   67: goto -40 -> 27
    //   70: aload_0
    //   71: ldc 239
    //   73: invokevirtual 243	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   76: checkcast 245	android/net/ConnectivityManager
    //   79: invokevirtual 249	android/net/ConnectivityManager:getActiveNetworkInfo	()Landroid/net/NetworkInfo;
    //   82: astore_0
    //   83: aload_0
    //   84: ifnonnull +14 -> 98
    //   87: ldc 91
    //   89: astore_0
    //   90: ldc 222
    //   92: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   95: goto -68 -> 27
    //   98: aload_0
    //   99: invokevirtual 254	android/net/NetworkInfo:getType	()I
    //   102: iconst_1
    //   103: if_icmpne +15 -> 118
    //   106: ldc_w 256
    //   109: astore_0
    //   110: ldc 222
    //   112: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   115: goto -88 -> 27
    //   118: aload_0
    //   119: invokevirtual 259	android/net/NetworkInfo:getExtraInfo	()Ljava/lang/String;
    //   122: astore_0
    //   123: aload_0
    //   124: ifnonnull +14 -> 138
    //   127: ldc 91
    //   129: astore_0
    //   130: ldc 222
    //   132: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   135: goto -108 -> 27
    //   138: aload_0
    //   139: invokevirtual 262	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   142: astore_0
    //   143: getstatic 37	com/tencent/tmassistantsdk/downloadservice/DownloadHelper:TAG	Ljava/lang/String;
    //   146: ldc_w 264
    //   149: aload_0
    //   150: invokestatic 164	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   153: invokevirtual 167	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   156: invokestatic 267	com/tencent/tmassistantsdk/util/TMLog:v	(Ljava/lang/String;Ljava/lang/String;)V
    //   159: ldc 222
    //   161: invokestatic 40	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   164: goto -137 -> 27
    //
    // Exception table:
    //   from	to	target	type
    //   3	15	52	finally
    //   22	27	52	finally
    //   32	41	52	finally
    //   44	49	52	finally
    //   62	67	52	finally
    //   70	83	52	finally
    //   90	95	52	finally
    //   98	106	52	finally
    //   110	115	52	finally
    //   118	123	52	finally
    //   130	135	52	finally
    //   138	164	52	finally
    //   32	41	58	java/lang/Exception
  }

  public static int getStorePosition(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(75712);
    if (TextUtils.isEmpty(paramString))
      AppMethodBeat.o(75712);
    while (true)
    {
      return i;
      if ((paramString != null) && (paramString.startsWith("/data")))
      {
        i = 1;
        AppMethodBeat.o(75712);
      }
      else if (TMAssistantFile.isSDCardExistAndCanWrite())
      {
        i = 2;
        AppMethodBeat.o(75712);
      }
      else
      {
        AppMethodBeat.o(75712);
      }
    }
  }

  public static PowerManager.WakeLock getWakeLock()
  {
    return null;
  }

  public static boolean isDownloadFileExisted(String paramString)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    AppMethodBeat.i(75710);
    if (paramString == null)
    {
      AppMethodBeat.o(75710);
      bool1 = bool2;
    }
    while (true)
    {
      return bool1;
      try
      {
        paramString = TMAssistantFile.getSaveFilePath(paramString);
        File localFile = new java/io/File;
        localFile.<init>(paramString);
        bool2 = localFile.exists();
        if (bool2)
          bool1 = true;
        AppMethodBeat.o(75710);
      }
      catch (Exception paramString)
      {
        while (true)
          ab.printErrStackTrace(TAG, paramString, "", new Object[0]);
      }
      finally
      {
        AppMethodBeat.o(75710);
      }
    }
    throw paramString;
  }

  public static boolean isDownloadFileExisted(String paramString1, String paramString2)
  {
    boolean bool1 = false;
    AppMethodBeat.i(75709);
    try
    {
      paramString1 = TMAssistantFile.getSaveFilePath(generateFileNameFromURL(paramString1, paramString2));
      paramString2 = new java/io/File;
      paramString2.<init>(paramString1);
      boolean bool2 = paramString2.exists();
      if (bool2)
        bool1 = true;
      return bool1;
    }
    catch (Exception paramString1)
    {
      while (true)
        ab.printErrStackTrace(TAG, paramString1, "", new Object[0]);
    }
    finally
    {
      AppMethodBeat.o(75709);
    }
    throw paramString1;
  }

  public static boolean isNetworkConncted()
  {
    boolean bool = false;
    AppMethodBeat.i(75708);
    Object localObject = GlobalUtil.getInstance().getContext();
    if (localObject == null)
    {
      TMLog.w(TAG, "GlobalUtil.getInstance().getContext() == null.");
      AppMethodBeat.o(75708);
      return bool;
    }
    localObject = ((ConnectivityManager)((Context)localObject).getSystemService("connectivity")).getActiveNetworkInfo();
    if (localObject != null);
    for (bool = ((NetworkInfo)localObject).isAvailable(); ; bool = false)
    {
      AppMethodBeat.o(75708);
      break;
    }
  }

  public static boolean isSpaceEnough(String paramString, long paramLong)
  {
    long l1 = 0L;
    AppMethodBeat.i(75711);
    long l2 = -1L;
    int i = getStorePosition(paramString);
    long l3;
    boolean bool;
    if (i == 1)
    {
      paramString = new StatFs(Environment.getDataDirectory().getPath());
      l2 = paramString.getBlockSize();
      l3 = (paramString.getAvailableBlocks() - 4L) * l2;
      l2 = l3;
      if (l3 >= 0L)
        break label188;
      l2 = l1;
      paramLong = ()((float)paramLong * 1.5F);
      if (paramLong <= 104857600L)
        break label203;
      if (l2 < paramLong)
        break label191;
      AppMethodBeat.o(75711);
      bool = true;
    }
    while (true)
    {
      return bool;
      if (i == 2)
      {
        l2 = l1;
        if (!"mounted".equals(Environment.getExternalStorageState()))
          break;
        paramString = new StatFs(new File(Environment.getExternalStorageDirectory().getPath()).getPath());
        l2 = paramString.getBlockSize();
        l3 = (paramString.getAvailableBlocks() - 4L) * l2;
        l2 = l1;
        if (l3 < 0L)
          break;
        l2 = l3;
      }
      label188: break;
      label191: AppMethodBeat.o(75711);
      bool = false;
      continue;
      label203: if (l2 >= 104857600L)
      {
        AppMethodBeat.o(75711);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(75711);
        bool = false;
      }
    }
  }

  public static boolean isValidURL(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(75705);
    try
    {
      paramString = correctURL(paramString);
      new URI(paramString);
      bool = true;
      AppMethodBeat.o(75705);
      return bool;
    }
    catch (Throwable paramString)
    {
      while (true)
        ab.printErrStackTrace(TAG, paramString, "", new Object[0]);
    }
  }

  public static String renameAPKFileName(String paramString)
  {
    AppMethodBeat.i(75704);
    String str;
    if (paramString == null)
    {
      str = null;
      AppMethodBeat.o(75704);
    }
    while (true)
    {
      return str;
      i = paramString.lastIndexOf('.');
      if ((i > 0) && (i != paramString.length() - 1))
        break;
      AppMethodBeat.o(75704);
      str = paramString;
    }
    String[] arrayOfString = new String[2];
    arrayOfString[0] = paramString.substring(0, i);
    arrayOfString[1] = paramString.substring(i, paramString.length());
    int i = 0;
    label177: 
    while (true)
    {
      if (i == 0);
      for (str = paramString; ; str = arrayOfString[0] + "(" + i + ")" + arrayOfString[1])
      {
        i++;
        if (new File(TMAssistantFile.getSavePathRootDir() + File.separator + str).exists())
          break label177;
        AppMethodBeat.o(75704);
        break;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.downloadservice.DownloadHelper
 * JD-Core Version:    0.6.2
 */
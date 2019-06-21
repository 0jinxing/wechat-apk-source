package com.tencent.ttpic.baseutils;

import android.content.Context;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Base64OutputStream;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class FileUtils
{
  public static final String PIC_POSTFIX_JPEG = ".jpg";
  public static final String PIC_POSTFIX_PNG = ".png";
  public static final String PIC_POSTFIX_WEBP = ".webp";
  public static final String RES_PREFIX_ASSETS = "assets://";
  public static final String RES_PREFIX_HTTP = "http://";
  public static final String RES_PREFIX_HTTPS = "https://";
  public static final String RES_PREFIX_STORAGE = "/";
  public static final FileUtils.AssetFileComparator SIMPLE_ASSET_COMPARATOR;
  private static final String TAG;

  static
  {
    AppMethodBeat.i(49716);
    TAG = FileUtils.class.getSimpleName();
    SIMPLE_ASSET_COMPARATOR = new FileUtils.2();
    AppMethodBeat.o(49716);
  }

  public static boolean Move(File paramFile, String paramString)
  {
    AppMethodBeat.i(49698);
    boolean bool = paramFile.renameTo(new File(new File(paramString), paramFile.getName()));
    AppMethodBeat.o(49698);
    return bool;
  }

  public static void asyncCopyFile(InputStream paramInputStream, String paramString, FileUtils.OnFileCopyListener paramOnFileCopyListener)
  {
    AppMethodBeat.i(49713);
    paramInputStream = new FileUtils.FileCopyTask(paramInputStream, paramString);
    paramInputStream.setOnFileCopyListener(paramOnFileCopyListener);
    paramInputStream.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new String[0]);
    AppMethodBeat.o(49713);
  }

  // ERROR //
  public static String checkAssetsPhoto(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: ldc 115
    //   2: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_1
    //   6: invokestatic 121	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   9: ifeq +12 -> 21
    //   12: ldc 115
    //   14: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   17: aconst_null
    //   18: astore_1
    //   19: aload_1
    //   20: areturn
    //   21: aload_0
    //   22: invokevirtual 127	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   25: astore_2
    //   26: aload_2
    //   27: aload_1
    //   28: invokevirtual 133	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   31: astore_0
    //   32: aload_0
    //   33: invokestatic 139	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/InputStream;)V
    //   36: ldc 115
    //   38: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   41: goto -22 -> 19
    //   44: astore_0
    //   45: aconst_null
    //   46: invokestatic 139	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/InputStream;)V
    //   49: aload_1
    //   50: ldc 141
    //   52: invokevirtual 145	java/lang/String:lastIndexOf	(Ljava/lang/String;)I
    //   55: iconst_m1
    //   56: if_icmpeq +92 -> 148
    //   59: new 147	java/lang/StringBuilder
    //   62: dup
    //   63: invokespecial 148	java/lang/StringBuilder:<init>	()V
    //   66: aload_1
    //   67: iconst_0
    //   68: aload_1
    //   69: bipush 46
    //   71: invokevirtual 151	java/lang/String:lastIndexOf	(I)I
    //   74: iconst_1
    //   75: iadd
    //   76: invokevirtual 155	java/lang/String:substring	(II)Ljava/lang/String;
    //   79: invokevirtual 159	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   82: ldc 161
    //   84: invokevirtual 159	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   87: invokevirtual 164	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   90: astore_1
    //   91: aload_2
    //   92: aload_1
    //   93: invokevirtual 133	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   96: astore_0
    //   97: aload_0
    //   98: invokestatic 139	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/InputStream;)V
    //   101: ldc 115
    //   103: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   106: goto -87 -> 19
    //   109: astore_0
    //   110: aconst_null
    //   111: invokestatic 139	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/InputStream;)V
    //   114: ldc 115
    //   116: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   119: aload_0
    //   120: athrow
    //   121: astore_0
    //   122: aconst_null
    //   123: invokestatic 139	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/InputStream;)V
    //   126: ldc 115
    //   128: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   131: aconst_null
    //   132: astore_1
    //   133: goto -114 -> 19
    //   136: astore_0
    //   137: aconst_null
    //   138: invokestatic 139	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/InputStream;)V
    //   141: ldc 115
    //   143: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   146: aload_0
    //   147: athrow
    //   148: new 147	java/lang/StringBuilder
    //   151: dup
    //   152: invokespecial 148	java/lang/StringBuilder:<init>	()V
    //   155: aload_1
    //   156: invokevirtual 159	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   159: ldc 14
    //   161: invokevirtual 159	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   164: invokevirtual 164	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   167: astore_0
    //   168: aload_2
    //   169: aload_0
    //   170: invokevirtual 133	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   173: astore_3
    //   174: aload_3
    //   175: invokestatic 139	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/InputStream;)V
    //   178: ldc 115
    //   180: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   183: aload_0
    //   184: astore_1
    //   185: goto -166 -> 19
    //   188: astore_0
    //   189: aconst_null
    //   190: invokestatic 139	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/InputStream;)V
    //   193: new 147	java/lang/StringBuilder
    //   196: dup
    //   197: invokespecial 148	java/lang/StringBuilder:<init>	()V
    //   200: aload_1
    //   201: invokevirtual 159	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   204: ldc 20
    //   206: invokevirtual 159	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   209: invokevirtual 164	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   212: astore_0
    //   213: aload_2
    //   214: aload_0
    //   215: invokevirtual 133	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   218: astore_3
    //   219: aload_3
    //   220: invokestatic 139	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/InputStream;)V
    //   223: ldc 115
    //   225: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   228: aload_0
    //   229: astore_1
    //   230: goto -211 -> 19
    //   233: astore_0
    //   234: aconst_null
    //   235: invokestatic 139	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/InputStream;)V
    //   238: ldc 115
    //   240: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   243: aload_0
    //   244: athrow
    //   245: astore_0
    //   246: aconst_null
    //   247: invokestatic 139	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/InputStream;)V
    //   250: new 147	java/lang/StringBuilder
    //   253: dup
    //   254: invokespecial 148	java/lang/StringBuilder:<init>	()V
    //   257: aload_1
    //   258: invokevirtual 159	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   261: ldc 17
    //   263: invokevirtual 159	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   266: invokevirtual 164	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   269: astore_1
    //   270: aload_2
    //   271: aload_1
    //   272: invokevirtual 133	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   275: astore_0
    //   276: aload_0
    //   277: invokestatic 139	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/InputStream;)V
    //   280: ldc 115
    //   282: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   285: goto -266 -> 19
    //   288: astore_0
    //   289: aconst_null
    //   290: invokestatic 139	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/InputStream;)V
    //   293: ldc 115
    //   295: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   298: aload_0
    //   299: athrow
    //   300: astore_0
    //   301: aconst_null
    //   302: invokestatic 139	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/InputStream;)V
    //   305: ldc 115
    //   307: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   310: aconst_null
    //   311: astore_1
    //   312: goto -293 -> 19
    //   315: astore_0
    //   316: aconst_null
    //   317: invokestatic 139	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/InputStream;)V
    //   320: ldc 115
    //   322: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   325: aload_0
    //   326: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   26	32	44	java/io/IOException
    //   26	32	109	finally
    //   91	97	121	java/io/IOException
    //   91	97	136	finally
    //   168	174	188	java/io/IOException
    //   168	174	233	finally
    //   213	219	245	java/io/IOException
    //   213	219	288	finally
    //   270	276	300	java/io/IOException
    //   270	276	315	finally
  }

  public static String checkPhoto(String paramString)
  {
    AppMethodBeat.i(49678);
    if (TextUtils.isEmpty(paramString))
    {
      paramString = null;
      AppMethodBeat.o(49678);
    }
    while (true)
    {
      return paramString;
      if (new File(paramString).exists())
      {
        AppMethodBeat.o(49678);
      }
      else if (paramString.substring(paramString.lastIndexOf("/")).lastIndexOf(".") == -1)
      {
        String str = paramString + ".jpg";
        if (new File(str).exists())
        {
          AppMethodBeat.o(49678);
          paramString = str;
        }
        else
        {
          str = paramString + ".png";
          if (new File(str).exists())
          {
            AppMethodBeat.o(49678);
            paramString = str;
          }
        }
      }
      else
      {
        AppMethodBeat.o(49678);
      }
    }
  }

  public static void clearDir(File paramFile)
  {
    AppMethodBeat.i(49695);
    if ((paramFile == null) || (!paramFile.exists()) || (!paramFile.isDirectory()))
      AppMethodBeat.o(49695);
    while (true)
    {
      return;
      File[] arrayOfFile = paramFile.listFiles();
      if (arrayOfFile == null)
      {
        AppMethodBeat.o(49695);
      }
      else
      {
        int i = arrayOfFile.length;
        int j = 0;
        if (j < i)
        {
          File localFile = arrayOfFile[j];
          if (localFile.isDirectory())
            clearDir(localFile);
          while (true)
          {
            j++;
            break;
            localFile.delete();
          }
        }
        paramFile.delete();
        AppMethodBeat.o(49695);
      }
    }
  }

  public static void clearDirs(File[] paramArrayOfFile)
  {
    AppMethodBeat.i(49696);
    if (paramArrayOfFile == null)
      AppMethodBeat.o(49696);
    while (true)
    {
      return;
      int i = paramArrayOfFile.length;
      for (int j = 0; j < i; j++)
        clearDir(paramArrayOfFile[j]);
      AppMethodBeat.o(49696);
    }
  }

  private static void closeSilently(Closeable paramCloseable)
  {
    AppMethodBeat.i(49704);
    if (paramCloseable != null);
    while (true)
    {
      try
      {
        paramCloseable.close();
        AppMethodBeat.o(49704);
        return;
      }
      catch (Throwable paramCloseable)
      {
      }
      AppMethodBeat.o(49704);
    }
  }

  public static boolean copyAssets(Context paramContext, String paramString1, String paramString2)
  {
    AppMethodBeat.i(49690);
    boolean bool = copyAssets(paramContext, paramString1, paramString2, SIMPLE_ASSET_COMPARATOR);
    AppMethodBeat.o(49690);
    return bool;
  }

  public static boolean copyAssets(Context paramContext, String paramString1, String paramString2, FileUtils.AssetFileComparator paramAssetFileComparator)
  {
    AppMethodBeat.i(49691);
    boolean bool = performCopyAssetsFile(paramContext, paramString1, paramString2, paramAssetFileComparator);
    AppMethodBeat.o(49691);
    return bool;
  }

  public static boolean copyFile(InputStream paramInputStream, OutputStream paramOutputStream)
  {
    boolean bool = false;
    AppMethodBeat.i(49711);
    if ((paramInputStream == null) || (paramOutputStream == null))
    {
      AppMethodBeat.o(49711);
      return bool;
    }
    try
    {
      byte[] arrayOfByte = new byte[4096];
      while (true)
      {
        int i = paramInputStream.read(arrayOfByte);
        if (i <= 0)
          break;
        paramOutputStream.write(arrayOfByte, 0, i);
      }
    }
    catch (Exception paramInputStream)
    {
      LogUtils.e(paramInputStream);
    }
    while (true)
    {
      bool = true;
      AppMethodBeat.o(49711);
      break;
      paramOutputStream.flush();
    }
  }

  // ERROR //
  public static boolean copyFile(InputStream paramInputStream, String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: ldc 240
    //   4: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: new 242	java/io/FileOutputStream
    //   10: astore_3
    //   11: aload_3
    //   12: aload_1
    //   13: invokespecial 243	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   16: sipush 4096
    //   19: newarray byte
    //   21: astore_1
    //   22: aload_0
    //   23: aload_1
    //   24: invokevirtual 223	java/io/InputStream:read	([B)I
    //   27: istore 4
    //   29: iload 4
    //   31: ifle +30 -> 61
    //   34: aload_3
    //   35: aload_1
    //   36: iconst_0
    //   37: iload 4
    //   39: invokevirtual 229	java/io/OutputStream:write	([BII)V
    //   42: goto -20 -> 22
    //   45: astore_1
    //   46: aload_0
    //   47: invokestatic 139	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/InputStream;)V
    //   50: aload_3
    //   51: invokestatic 246	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/OutputStream;)V
    //   54: ldc 240
    //   56: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   59: iload_2
    //   60: ireturn
    //   61: aload_0
    //   62: invokestatic 139	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/InputStream;)V
    //   65: aload_3
    //   66: invokestatic 246	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/OutputStream;)V
    //   69: iconst_1
    //   70: istore_2
    //   71: ldc 240
    //   73: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   76: goto -17 -> 59
    //   79: astore_1
    //   80: aconst_null
    //   81: astore_3
    //   82: aload_0
    //   83: invokestatic 139	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/InputStream;)V
    //   86: aload_3
    //   87: invokestatic 246	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/OutputStream;)V
    //   90: ldc 240
    //   92: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   95: aload_1
    //   96: athrow
    //   97: astore_1
    //   98: goto -16 -> 82
    //   101: astore_1
    //   102: aconst_null
    //   103: astore_3
    //   104: goto -58 -> 46
    //
    // Exception table:
    //   from	to	target	type
    //   16	22	45	java/lang/Exception
    //   22	29	45	java/lang/Exception
    //   34	42	45	java/lang/Exception
    //   7	16	79	finally
    //   16	22	97	finally
    //   22	29	97	finally
    //   34	42	97	finally
    //   7	16	101	java/lang/Exception
  }

  // ERROR //
  public static boolean copyFile(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: ldc 248
    //   4: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: new 69	java/io/File
    //   10: astore_3
    //   11: aload_3
    //   12: aload_0
    //   13: invokespecial 72	java/io/File:<init>	(Ljava/lang/String;)V
    //   16: aload_3
    //   17: invokevirtual 171	java/io/File:exists	()Z
    //   20: istore 4
    //   22: iload 4
    //   24: ifne +18 -> 42
    //   27: aconst_null
    //   28: invokestatic 139	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/InputStream;)V
    //   31: aconst_null
    //   32: invokestatic 246	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/OutputStream;)V
    //   35: ldc 248
    //   37: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   40: iload_2
    //   41: ireturn
    //   42: new 250	java/io/FileInputStream
    //   45: astore_3
    //   46: aload_3
    //   47: aload_0
    //   48: invokespecial 251	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   51: new 242	java/io/FileOutputStream
    //   54: astore_0
    //   55: aload_0
    //   56: aload_1
    //   57: invokespecial 243	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   60: aload_0
    //   61: astore 5
    //   63: aload_3
    //   64: astore_1
    //   65: sipush 4096
    //   68: newarray byte
    //   70: astore 6
    //   72: aload_0
    //   73: astore 5
    //   75: aload_3
    //   76: astore_1
    //   77: aload_3
    //   78: aload 6
    //   80: invokevirtual 223	java/io/InputStream:read	([B)I
    //   83: istore 7
    //   85: iload 7
    //   87: ifle +48 -> 135
    //   90: aload_0
    //   91: astore 5
    //   93: aload_3
    //   94: astore_1
    //   95: aload_0
    //   96: aload 6
    //   98: iconst_0
    //   99: iload 7
    //   101: invokevirtual 229	java/io/OutputStream:write	([BII)V
    //   104: goto -32 -> 72
    //   107: astore 6
    //   109: aload_0
    //   110: astore 5
    //   112: aload_3
    //   113: astore_1
    //   114: aload 6
    //   116: invokestatic 235	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   119: aload_3
    //   120: invokestatic 139	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/InputStream;)V
    //   123: aload_0
    //   124: invokestatic 246	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/OutputStream;)V
    //   127: ldc 248
    //   129: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   132: goto -92 -> 40
    //   135: aload_3
    //   136: invokestatic 139	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/InputStream;)V
    //   139: aload_0
    //   140: invokestatic 246	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/OutputStream;)V
    //   143: iconst_1
    //   144: istore_2
    //   145: ldc 248
    //   147: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   150: goto -110 -> 40
    //   153: astore_0
    //   154: aconst_null
    //   155: astore 5
    //   157: aconst_null
    //   158: astore_1
    //   159: aload_1
    //   160: invokestatic 139	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/InputStream;)V
    //   163: aload 5
    //   165: invokestatic 246	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/OutputStream;)V
    //   168: ldc 248
    //   170: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   173: aload_0
    //   174: athrow
    //   175: astore_0
    //   176: aconst_null
    //   177: astore 5
    //   179: aload_3
    //   180: astore_1
    //   181: goto -22 -> 159
    //   184: astore_0
    //   185: goto -26 -> 159
    //   188: astore 6
    //   190: aconst_null
    //   191: astore_0
    //   192: aconst_null
    //   193: astore_3
    //   194: goto -85 -> 109
    //   197: astore 6
    //   199: aconst_null
    //   200: astore_0
    //   201: goto -92 -> 109
    //
    // Exception table:
    //   from	to	target	type
    //   65	72	107	java/lang/Exception
    //   77	85	107	java/lang/Exception
    //   95	104	107	java/lang/Exception
    //   7	22	153	finally
    //   42	51	153	finally
    //   51	60	175	finally
    //   65	72	184	finally
    //   77	85	184	finally
    //   95	104	184	finally
    //   114	119	184	finally
    //   7	22	188	java/lang/Exception
    //   42	51	188	java/lang/Exception
    //   51	60	197	java/lang/Exception
  }

  // ERROR //
  public static void copyRaw(Context paramContext, int paramInt, String paramString)
  {
    // Byte code:
    //   0: ldc 254
    //   2: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: invokevirtual 258	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   9: iload_1
    //   10: invokevirtual 264	android/content/res/Resources:openRawResource	(I)Ljava/io/InputStream;
    //   13: astore_3
    //   14: new 242	java/io/FileOutputStream
    //   17: astore_0
    //   18: aload_0
    //   19: aload_2
    //   20: invokespecial 243	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   23: aload_3
    //   24: aload_0
    //   25: invokestatic 266	com/tencent/ttpic/baseutils/FileUtils:copyFile	(Ljava/io/InputStream;Ljava/io/OutputStream;)Z
    //   28: pop
    //   29: aload_3
    //   30: invokevirtual 267	java/io/InputStream:close	()V
    //   33: aload_0
    //   34: invokevirtual 268	java/io/FileOutputStream:flush	()V
    //   37: aload_0
    //   38: invokevirtual 269	java/io/FileOutputStream:close	()V
    //   41: ldc 254
    //   43: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   46: return
    //   47: astore_0
    //   48: ldc 254
    //   50: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   53: goto -7 -> 46
    //   56: astore_0
    //   57: aconst_null
    //   58: astore_0
    //   59: aload_3
    //   60: invokevirtual 267	java/io/InputStream:close	()V
    //   63: aload_0
    //   64: ifnull +11 -> 75
    //   67: aload_0
    //   68: invokevirtual 268	java/io/FileOutputStream:flush	()V
    //   71: aload_0
    //   72: invokevirtual 269	java/io/FileOutputStream:close	()V
    //   75: ldc 254
    //   77: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   80: goto -34 -> 46
    //   83: astore_0
    //   84: ldc 254
    //   86: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   89: goto -43 -> 46
    //   92: astore_0
    //   93: aconst_null
    //   94: astore_2
    //   95: aload_3
    //   96: invokevirtual 267	java/io/InputStream:close	()V
    //   99: aload_2
    //   100: ifnull +11 -> 111
    //   103: aload_2
    //   104: invokevirtual 268	java/io/FileOutputStream:flush	()V
    //   107: aload_2
    //   108: invokevirtual 269	java/io/FileOutputStream:close	()V
    //   111: ldc 254
    //   113: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   116: aload_0
    //   117: athrow
    //   118: astore_2
    //   119: goto -8 -> 111
    //   122: astore 4
    //   124: aload_0
    //   125: astore_2
    //   126: aload 4
    //   128: astore_0
    //   129: goto -34 -> 95
    //   132: astore_2
    //   133: goto -74 -> 59
    //
    // Exception table:
    //   from	to	target	type
    //   29	41	47	java/io/IOException
    //   14	23	56	java/lang/Exception
    //   59	63	83	java/io/IOException
    //   67	75	83	java/io/IOException
    //   14	23	92	finally
    //   95	99	118	java/io/IOException
    //   103	111	118	java/io/IOException
    //   23	29	122	finally
    //   23	29	132	java/lang/Exception
  }

  public static void delete(File paramFile)
  {
    AppMethodBeat.i(49700);
    if (paramFile.isFile())
    {
      paramFile.delete();
      AppMethodBeat.o(49700);
    }
    while (true)
    {
      return;
      if (paramFile.isDirectory())
      {
        File[] arrayOfFile = paramFile.listFiles();
        if ((arrayOfFile == null) || (arrayOfFile.length == 0))
        {
          paramFile.delete();
          AppMethodBeat.o(49700);
        }
        else
        {
          for (int i = 0; i < arrayOfFile.length; i++)
            delete(arrayOfFile[i]);
          paramFile.delete();
        }
      }
      else
      {
        AppMethodBeat.o(49700);
      }
    }
  }

  public static void delete(File paramFile, boolean paramBoolean)
  {
    AppMethodBeat.i(49701);
    if ((paramFile == null) || (!paramFile.exists()))
      AppMethodBeat.o(49701);
    while (true)
    {
      return;
      if (paramFile.isFile())
      {
        paramFile.delete();
        AppMethodBeat.o(49701);
      }
      else
      {
        File[] arrayOfFile = paramFile.listFiles();
        if (arrayOfFile == null)
        {
          AppMethodBeat.o(49701);
        }
        else
        {
          int i = arrayOfFile.length;
          for (int j = 0; j < i; j++)
            delete(arrayOfFile[j], paramBoolean);
          if (!paramBoolean)
            paramFile.delete();
          AppMethodBeat.o(49701);
        }
      }
    }
  }

  public static void delete(String paramString)
  {
    AppMethodBeat.i(49699);
    if (TextUtils.isEmpty(paramString))
      AppMethodBeat.o(49699);
    while (true)
    {
      return;
      delete(new File(paramString));
      AppMethodBeat.o(49699);
    }
  }

  public static void deleteAllFilesOfDir(File paramFile)
  {
    AppMethodBeat.i(49703);
    if (!paramFile.exists())
      AppMethodBeat.o(49703);
    while (true)
    {
      return;
      if (paramFile.isFile())
      {
        paramFile.delete();
        AppMethodBeat.o(49703);
      }
      else
      {
        File[] arrayOfFile = paramFile.listFiles();
        if (arrayOfFile != null)
          for (int i = 0; i < arrayOfFile.length; i++)
            deleteAllFilesOfDir(arrayOfFile[i]);
        paramFile.delete();
        AppMethodBeat.o(49703);
      }
    }
  }

  public static void deleteFiles(String paramString1, String paramString2)
  {
    AppMethodBeat.i(49702);
    if (TextUtils.isEmpty(paramString1))
      AppMethodBeat.o(49702);
    while (true)
    {
      return;
      paramString1 = new File(paramString1).listFiles(new FileUtils.1(paramString2));
      if (paramString1 != null)
      {
        int i = paramString1.length;
        for (int j = 0; j < i; j++)
          paramString1[j].delete();
      }
      AppMethodBeat.o(49702);
    }
  }

  public static boolean exists(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(49697);
    if (TextUtils.isEmpty(paramString))
      AppMethodBeat.o(49697);
    while (true)
    {
      return bool;
      if ((paramString.indexOf("assets") >= 0) || (new File(paramString).exists()))
      {
        bool = true;
        AppMethodBeat.o(49697);
      }
      else
      {
        AppMethodBeat.o(49697);
      }
    }
  }

  // ERROR //
  private static long getAssetLength(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: ldc_w 301
    //   5: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_0
    //   9: invokevirtual 127	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   12: astore_3
    //   13: aload_3
    //   14: aload_1
    //   15: invokevirtual 305	android/content/res/AssetManager:openFd	(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
    //   18: astore_0
    //   19: aload_0
    //   20: invokevirtual 311	android/content/res/AssetFileDescriptor:getLength	()J
    //   23: lstore 4
    //   25: aload_0
    //   26: ifnull +7 -> 33
    //   29: aload_0
    //   30: invokevirtual 312	android/content/res/AssetFileDescriptor:close	()V
    //   33: ldc_w 301
    //   36: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   39: lload 4
    //   41: lreturn
    //   42: astore_0
    //   43: aconst_null
    //   44: astore_0
    //   45: aload_0
    //   46: ifnull +7 -> 53
    //   49: aload_0
    //   50: invokevirtual 312	android/content/res/AssetFileDescriptor:close	()V
    //   53: aload_3
    //   54: aload_1
    //   55: invokevirtual 133	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   58: astore_0
    //   59: aload_0
    //   60: invokevirtual 316	java/io/InputStream:available	()I
    //   63: istore 6
    //   65: iload 6
    //   67: i2l
    //   68: lstore 4
    //   70: aload_0
    //   71: invokestatic 318	com/tencent/ttpic/baseutils/FileUtils:closeSilently	(Ljava/io/Closeable;)V
    //   74: ldc_w 301
    //   77: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   80: goto -41 -> 39
    //   83: astore_1
    //   84: aconst_null
    //   85: astore_0
    //   86: aload_0
    //   87: ifnull +7 -> 94
    //   90: aload_0
    //   91: invokevirtual 312	android/content/res/AssetFileDescriptor:close	()V
    //   94: ldc_w 301
    //   97: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   100: aload_1
    //   101: athrow
    //   102: astore_0
    //   103: aload_2
    //   104: astore_0
    //   105: aload_0
    //   106: invokestatic 318	com/tencent/ttpic/baseutils/FileUtils:closeSilently	(Ljava/io/Closeable;)V
    //   109: ldc2_w 319
    //   112: lstore 4
    //   114: ldc_w 301
    //   117: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   120: goto -81 -> 39
    //   123: astore_1
    //   124: aconst_null
    //   125: astore_0
    //   126: aload_0
    //   127: invokestatic 318	com/tencent/ttpic/baseutils/FileUtils:closeSilently	(Ljava/io/Closeable;)V
    //   130: ldc_w 301
    //   133: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   136: aload_1
    //   137: athrow
    //   138: astore_0
    //   139: goto -106 -> 33
    //   142: astore_0
    //   143: goto -90 -> 53
    //   146: astore_0
    //   147: goto -53 -> 94
    //   150: astore_1
    //   151: goto -25 -> 126
    //   154: astore_1
    //   155: goto -50 -> 105
    //   158: astore_1
    //   159: goto -73 -> 86
    //   162: astore 7
    //   164: goto -119 -> 45
    //
    // Exception table:
    //   from	to	target	type
    //   13	19	42	java/io/IOException
    //   13	19	83	finally
    //   53	59	102	java/io/IOException
    //   53	59	123	finally
    //   29	33	138	java/io/IOException
    //   49	53	142	java/io/IOException
    //   90	94	146	java/io/IOException
    //   59	65	150	finally
    //   59	65	154	java/io/IOException
    //   19	25	158	finally
    //   19	25	162	java/io/IOException
  }

  public static String getFileNameByPath(String paramString)
  {
    AppMethodBeat.i(49682);
    LogUtils.v(TAG, "[getFileNameByPath] path = ".concat(String.valueOf(paramString)));
    Object localObject1 = null;
    Object localObject2 = localObject1;
    if (!TextUtils.isEmpty(paramString))
    {
      int i = paramString.indexOf(".");
      int j = paramString.lastIndexOf("/");
      localObject2 = localObject1;
      if (j >= 0)
      {
        localObject2 = localObject1;
        if (i > j)
          localObject2 = paramString.substring(j + 1, i);
      }
    }
    LogUtils.v(TAG, "[getFileNameByPath] return title = ".concat(String.valueOf(localObject2)));
    AppMethodBeat.o(49682);
    return localObject2;
  }

  public static String getFileNameFromUrl(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(49683);
    if (paramString == null)
    {
      AppMethodBeat.o(49683);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      int i = paramString.lastIndexOf("/");
      if (i == -1)
      {
        AppMethodBeat.o(49683);
        paramString = localObject;
      }
      else if (i == paramString.length() - 1)
      {
        AppMethodBeat.o(49683);
        paramString = localObject;
      }
      else
      {
        paramString = paramString.substring(i + 1);
        AppMethodBeat.o(49683);
      }
    }
  }

  public static String getFileSuffixFromUrl(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(49684);
    if (paramString == null)
    {
      AppMethodBeat.o(49684);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      int i = paramString.lastIndexOf(".");
      if (i == -1)
      {
        AppMethodBeat.o(49684);
        paramString = localObject;
      }
      else if (i == paramString.length() - 1)
      {
        AppMethodBeat.o(49684);
        paramString = localObject;
      }
      else
      {
        paramString = paramString.substring(i + 1);
        AppMethodBeat.o(49684);
      }
    }
  }

  public static String getMD5(String paramString1, String paramString2)
  {
    Object localObject1 = null;
    AppMethodBeat.i(49707);
    Object localObject2;
    FileInputStream localFileInputStream;
    int i;
    if (new File(paramString1).exists())
      try
      {
        localObject2 = MessageDigest.getInstance("MD5");
        localFileInputStream = new java/io/FileInputStream;
        localFileInputStream.<init>(paramString1);
        paramString1 = new byte[4096];
        while (true)
        {
          i = localFileInputStream.read(paramString1);
          if (i == -1)
            break;
          ((MessageDigest)localObject2).update(paramString1, 0, i);
        }
      }
      catch (Exception paramString1)
      {
        AppMethodBeat.o(49707);
        paramString1 = localObject1;
      }
    while (true)
    {
      return paramString1;
      ((MessageDigest)localObject2).update(paramString2.getBytes());
      localFileInputStream.close();
      paramString2 = new java/lang/StringBuilder;
      paramString2.<init>();
      localObject2 = ((MessageDigest)localObject2).digest();
      int j = localObject2.length;
      i = 0;
      if (i < j)
      {
        int k = localObject2[i] & 0xFF;
        if (k < 16);
        for (paramString1 = "0"; ; paramString1 = "")
        {
          paramString2.append(paramString1);
          paramString2.append(Integer.toHexString(k).toLowerCase());
          i++;
          break;
        }
      }
      paramString1 = paramString2.toString();
      AppMethodBeat.o(49707);
      continue;
      AppMethodBeat.o(49707);
      paramString1 = localObject1;
    }
  }

  public static String getRealPath(String paramString)
  {
    AppMethodBeat.i(49681);
    if ((!TextUtils.isEmpty(paramString)) && (paramString.startsWith("assets://")))
    {
      paramString = paramString.substring(9);
      AppMethodBeat.o(49681);
    }
    while (true)
    {
      return paramString;
      AppMethodBeat.o(49681);
    }
  }

  public static String getSHA1(String paramString)
  {
    Object localObject1 = null;
    AppMethodBeat.i(49706);
    Object localObject2;
    Object localObject3;
    int i;
    if (new File(paramString).exists())
      try
      {
        localObject2 = MessageDigest.getInstance("SHA-1");
        localObject3 = new java/io/FileInputStream;
        ((FileInputStream)localObject3).<init>(paramString);
        paramString = new byte[4096];
        while (true)
        {
          i = ((FileInputStream)localObject3).read(paramString);
          if (i == -1)
            break;
          ((MessageDigest)localObject2).update(paramString, 0, i);
        }
      }
      catch (Exception paramString)
      {
        AppMethodBeat.o(49706);
        paramString = localObject1;
      }
    while (true)
    {
      return paramString;
      ((FileInputStream)localObject3).close();
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject2 = ((MessageDigest)localObject2).digest();
      int j = localObject2.length;
      i = 0;
      if (i < j)
      {
        int k = localObject2[i] & 0xFF;
        if (k < 16);
        for (paramString = "0"; ; paramString = "")
        {
          ((StringBuilder)localObject3).append(paramString);
          ((StringBuilder)localObject3).append(Integer.toHexString(k).toLowerCase());
          i++;
          break;
        }
      }
      paramString = ((StringBuilder)localObject3).toString();
      AppMethodBeat.o(49706);
      continue;
      AppMethodBeat.o(49706);
      paramString = localObject1;
    }
  }

  public static boolean isDirectoryWritable(String paramString)
  {
    boolean bool1 = false;
    AppMethodBeat.i(49680);
    paramString = new File(paramString);
    if ((paramString.exists()) && (!paramString.isDirectory()))
      AppMethodBeat.o(49680);
    while (true)
    {
      return bool1;
      if (!paramString.exists())
        paramString.mkdirs();
      if (paramString.isDirectory())
        try
        {
          boolean bool2 = paramString.canWrite();
          bool1 = bool2;
          AppMethodBeat.o(49680);
        }
        catch (Exception paramString)
        {
        }
      else
        AppMethodBeat.o(49680);
    }
  }

  public static String load(Context paramContext, String paramString1, String paramString2)
  {
    AppMethodBeat.i(49686);
    if ((TextUtils.isEmpty(paramString1)) || (TextUtils.isEmpty(paramString2)))
    {
      paramContext = "";
      AppMethodBeat.o(49686);
    }
    while (true)
    {
      return paramContext;
      if (paramString1.startsWith("assets://"))
      {
        paramContext = loadAssetsString(paramContext, getRealPath(paramString1) + File.separator + paramString2);
        AppMethodBeat.o(49686);
      }
      else
      {
        paramContext = load(new File(paramString1 + File.separator + paramString2));
        AppMethodBeat.o(49686);
      }
    }
  }

  // ERROR //
  private static String load(File paramFile)
  {
    // Byte code:
    //   0: ldc_w 415
    //   3: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: new 250	java/io/FileInputStream
    //   9: astore_1
    //   10: aload_1
    //   11: aload_0
    //   12: invokespecial 417	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   15: aload_0
    //   16: invokevirtual 419	java/io/File:length	()J
    //   19: l2i
    //   20: newarray byte
    //   22: astore_2
    //   23: aload_1
    //   24: aload_2
    //   25: invokevirtual 223	java/io/InputStream:read	([B)I
    //   28: pop
    //   29: new 106	java/lang/String
    //   32: astore_0
    //   33: aload_0
    //   34: aload_2
    //   35: ldc_w 421
    //   38: invokespecial 424	java/lang/String:<init>	([BLjava/lang/String;)V
    //   41: aload_1
    //   42: invokestatic 139	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/InputStream;)V
    //   45: ldc_w 415
    //   48: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   51: aload_0
    //   52: areturn
    //   53: astore_0
    //   54: aconst_null
    //   55: astore_1
    //   56: aload_1
    //   57: invokestatic 139	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/InputStream;)V
    //   60: ldc_w 415
    //   63: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   66: aconst_null
    //   67: astore_0
    //   68: goto -17 -> 51
    //   71: astore_0
    //   72: aconst_null
    //   73: astore_1
    //   74: aload_1
    //   75: invokestatic 139	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/InputStream;)V
    //   78: goto -18 -> 60
    //   81: astore_0
    //   82: aconst_null
    //   83: astore_1
    //   84: aload_1
    //   85: invokestatic 139	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/InputStream;)V
    //   88: ldc_w 415
    //   91: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   94: aload_0
    //   95: athrow
    //   96: astore_0
    //   97: goto -13 -> 84
    //   100: astore_0
    //   101: goto -27 -> 74
    //   104: astore_0
    //   105: goto -49 -> 56
    //
    // Exception table:
    //   from	to	target	type
    //   6	15	53	java/io/FileNotFoundException
    //   6	15	71	java/lang/Exception
    //   6	15	81	finally
    //   15	41	96	finally
    //   15	41	100	java/lang/Exception
    //   15	41	104	java/io/FileNotFoundException
  }

  // ERROR //
  public static String loadAssetsString(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: ldc_w 425
    //   3: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: new 147	java/lang/StringBuilder
    //   9: dup
    //   10: invokespecial 148	java/lang/StringBuilder:<init>	()V
    //   13: astore_2
    //   14: aload_0
    //   15: invokevirtual 127	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   18: aload_1
    //   19: invokevirtual 133	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   22: astore_0
    //   23: new 427	java/io/BufferedReader
    //   26: astore_1
    //   27: new 429	java/io/InputStreamReader
    //   30: astore_3
    //   31: aload_3
    //   32: aload_0
    //   33: ldc_w 421
    //   36: invokespecial 430	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;Ljava/lang/String;)V
    //   39: aload_1
    //   40: aload_3
    //   41: invokespecial 433	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   44: aload_1
    //   45: invokevirtual 436	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   48: astore_3
    //   49: aload_3
    //   50: ifnull +42 -> 92
    //   53: aload_2
    //   54: aload_3
    //   55: invokevirtual 159	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   58: pop
    //   59: aload_2
    //   60: ldc_w 438
    //   63: invokevirtual 159	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   66: pop
    //   67: goto -23 -> 44
    //   70: astore_3
    //   71: aload_1
    //   72: invokestatic 440	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/Reader;)V
    //   75: aload_0
    //   76: invokestatic 139	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/InputStream;)V
    //   79: aload_2
    //   80: invokevirtual 164	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   83: astore_0
    //   84: ldc_w 425
    //   87: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   90: aload_0
    //   91: areturn
    //   92: aload_1
    //   93: invokestatic 440	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/Reader;)V
    //   96: aload_0
    //   97: invokestatic 139	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/InputStream;)V
    //   100: goto -21 -> 79
    //   103: astore_0
    //   104: aconst_null
    //   105: astore_1
    //   106: aconst_null
    //   107: astore_2
    //   108: aload_1
    //   109: invokestatic 440	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/Reader;)V
    //   112: aload_2
    //   113: invokestatic 139	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/InputStream;)V
    //   116: ldc_w 425
    //   119: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   122: aload_0
    //   123: athrow
    //   124: astore_1
    //   125: aconst_null
    //   126: astore_3
    //   127: aload_0
    //   128: astore_2
    //   129: aload_1
    //   130: astore_0
    //   131: aload_3
    //   132: astore_1
    //   133: goto -25 -> 108
    //   136: astore_3
    //   137: aload_0
    //   138: astore_2
    //   139: aload_3
    //   140: astore_0
    //   141: goto -33 -> 108
    //   144: astore_0
    //   145: aconst_null
    //   146: astore_1
    //   147: aconst_null
    //   148: astore_0
    //   149: goto -78 -> 71
    //   152: astore_1
    //   153: aconst_null
    //   154: astore_1
    //   155: goto -84 -> 71
    //
    // Exception table:
    //   from	to	target	type
    //   44	49	70	java/io/IOException
    //   53	67	70	java/io/IOException
    //   14	23	103	finally
    //   23	44	124	finally
    //   44	49	136	finally
    //   53	67	136	finally
    //   14	23	144	java/io/IOException
    //   23	44	152	java/io/IOException
  }

  public static String loadRawResourceString(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(49689);
    InputStreamReader localInputStreamReader = new InputStreamReader(paramContext.getResources().openRawResource(paramInt));
    paramContext = new BufferedReader(localInputStreamReader);
    StringBuilder localStringBuilder = new StringBuilder();
    try
    {
      while (true)
      {
        String str = paramContext.readLine();
        if (str == null)
          break;
        localStringBuilder.append(str);
        localStringBuilder.append('\n');
      }
    }
    catch (IOException localIOException)
    {
      IOUtils.closeQuietly(localInputStreamReader);
      IOUtils.closeQuietly(paramContext);
      paramContext = null;
      AppMethodBeat.o(49689);
      while (true)
      {
        return paramContext;
        IOUtils.closeQuietly(localInputStreamReader);
        IOUtils.closeQuietly(paramContext);
        paramContext = localStringBuilder.toString();
        AppMethodBeat.o(49689);
      }
    }
    finally
    {
      IOUtils.closeQuietly(localInputStreamReader);
      IOUtils.closeQuietly(paramContext);
      AppMethodBeat.o(49689);
    }
  }

  public static String md5ForBase64Data(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(49708);
    paramString = new StringBuffer(paramString);
    for (int j = 0; j < 16; j++)
      paramString.append(new char[] { 114, 68, 122, 111, 105, 101, 53, 101, 51, 111, 110, 103, 102, 122, 49, 108 }[j]);
    try
    {
      Object localObject = MessageDigest.getInstance("MD5");
      ((MessageDigest)localObject).update(paramString.toString().getBytes());
      localObject = ((MessageDigest)localObject).digest();
      paramString = new java/lang/StringBuffer;
      paramString.<init>();
      int k = localObject.length;
      for (j = i; j < k; j++)
        paramString.append(String.format("%02x", new Object[] { Integer.valueOf(localObject[j] & 0xFF) }));
      paramString = paramString.toString();
      AppMethodBeat.o(49708);
      return paramString;
    }
    catch (NoSuchAlgorithmException paramString)
    {
      while (true)
      {
        paramString = "";
        AppMethodBeat.o(49708);
      }
    }
  }

  // ERROR //
  private static boolean performCopyAssetsFile(Context paramContext, String paramString1, String paramString2, FileUtils.AssetFileComparator paramAssetFileComparator)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 4
    //   3: iconst_0
    //   4: istore 5
    //   6: iconst_0
    //   7: istore 6
    //   9: aconst_null
    //   10: astore 7
    //   12: ldc_w 486
    //   15: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   18: aload_1
    //   19: invokestatic 121	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   22: ifne +10 -> 32
    //   25: aload_2
    //   26: invokestatic 121	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   29: ifeq +12 -> 41
    //   32: ldc_w 486
    //   35: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   38: iload 6
    //   40: ireturn
    //   41: aload_0
    //   42: invokevirtual 127	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   45: astore 8
    //   47: new 69	java/io/File
    //   50: dup
    //   51: aload_2
    //   52: invokespecial 72	java/io/File:<init>	(Ljava/lang/String;)V
    //   55: astore_2
    //   56: aload_2
    //   57: invokevirtual 171	java/io/File:exists	()Z
    //   60: ifeq +54 -> 114
    //   63: aload_3
    //   64: ifnull +39 -> 103
    //   67: aload_3
    //   68: aload_0
    //   69: aload_1
    //   70: aload_2
    //   71: invokeinterface 490 4 0
    //   76: istore 9
    //   78: iload 9
    //   80: ifeq +23 -> 103
    //   83: aconst_null
    //   84: invokestatic 318	com/tencent/ttpic/baseutils/FileUtils:closeSilently	(Ljava/io/Closeable;)V
    //   87: aconst_null
    //   88: invokestatic 318	com/tencent/ttpic/baseutils/FileUtils:closeSilently	(Ljava/io/Closeable;)V
    //   91: ldc_w 486
    //   94: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   97: iconst_1
    //   98: istore 6
    //   100: goto -62 -> 38
    //   103: aload_2
    //   104: invokevirtual 180	java/io/File:isDirectory	()Z
    //   107: ifeq +7 -> 114
    //   110: aload_2
    //   111: invokestatic 275	com/tencent/ttpic/baseutils/FileUtils:delete	(Ljava/io/File;)V
    //   114: aload_2
    //   115: invokevirtual 494	java/io/File:getParentFile	()Ljava/io/File;
    //   118: astore_0
    //   119: aload_0
    //   120: invokevirtual 273	java/io/File:isFile	()Z
    //   123: ifeq +7 -> 130
    //   126: aload_0
    //   127: invokestatic 275	com/tencent/ttpic/baseutils/FileUtils:delete	(Ljava/io/File;)V
    //   130: aload_0
    //   131: invokevirtual 171	java/io/File:exists	()Z
    //   134: ifne +31 -> 165
    //   137: aload_0
    //   138: invokevirtual 395	java/io/File:mkdirs	()Z
    //   141: istore 9
    //   143: iload 9
    //   145: ifne +20 -> 165
    //   148: aconst_null
    //   149: invokestatic 318	com/tencent/ttpic/baseutils/FileUtils:closeSilently	(Ljava/io/Closeable;)V
    //   152: aconst_null
    //   153: invokestatic 318	com/tencent/ttpic/baseutils/FileUtils:closeSilently	(Ljava/io/Closeable;)V
    //   156: ldc_w 486
    //   159: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   162: goto -124 -> 38
    //   165: aload 8
    //   167: aload_1
    //   168: invokevirtual 133	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   171: astore_0
    //   172: aload_0
    //   173: invokevirtual 316	java/io/InputStream:available	()I
    //   176: istore 10
    //   178: iload 10
    //   180: ifgt +27 -> 207
    //   183: iload 4
    //   185: istore 6
    //   187: aload 7
    //   189: astore_1
    //   190: aload_0
    //   191: invokestatic 318	com/tencent/ttpic/baseutils/FileUtils:closeSilently	(Ljava/io/Closeable;)V
    //   194: aload_1
    //   195: invokestatic 318	com/tencent/ttpic/baseutils/FileUtils:closeSilently	(Ljava/io/Closeable;)V
    //   198: ldc_w 486
    //   201: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   204: goto -166 -> 38
    //   207: new 496	java/io/BufferedOutputStream
    //   210: astore_1
    //   211: new 242	java/io/FileOutputStream
    //   214: astore_3
    //   215: aload_3
    //   216: aload_2
    //   217: invokespecial 497	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   220: aload_1
    //   221: aload_3
    //   222: invokespecial 499	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   225: sipush 1024
    //   228: newarray byte
    //   230: astore_3
    //   231: aload_0
    //   232: aload_3
    //   233: invokevirtual 223	java/io/InputStream:read	([B)I
    //   236: istore 10
    //   238: iload 10
    //   240: ifle +34 -> 274
    //   243: aload_1
    //   244: aload_3
    //   245: iconst_0
    //   246: iload 10
    //   248: invokevirtual 229	java/io/OutputStream:write	([BII)V
    //   251: goto -20 -> 231
    //   254: astore_3
    //   255: aload_2
    //   256: invokestatic 275	com/tencent/ttpic/baseutils/FileUtils:delete	(Ljava/io/File;)V
    //   259: aload_0
    //   260: invokestatic 318	com/tencent/ttpic/baseutils/FileUtils:closeSilently	(Ljava/io/Closeable;)V
    //   263: aload_1
    //   264: invokestatic 318	com/tencent/ttpic/baseutils/FileUtils:closeSilently	(Ljava/io/Closeable;)V
    //   267: iload 5
    //   269: istore 6
    //   271: goto -73 -> 198
    //   274: iconst_1
    //   275: istore 6
    //   277: goto -87 -> 190
    //   280: astore_1
    //   281: aconst_null
    //   282: astore_0
    //   283: aconst_null
    //   284: astore_2
    //   285: aload_2
    //   286: invokestatic 318	com/tencent/ttpic/baseutils/FileUtils:closeSilently	(Ljava/io/Closeable;)V
    //   289: aload_0
    //   290: invokestatic 318	com/tencent/ttpic/baseutils/FileUtils:closeSilently	(Ljava/io/Closeable;)V
    //   293: ldc_w 486
    //   296: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   299: aload_1
    //   300: athrow
    //   301: astore_1
    //   302: aconst_null
    //   303: astore_3
    //   304: aload_0
    //   305: astore_2
    //   306: aload_3
    //   307: astore_0
    //   308: goto -23 -> 285
    //   311: astore_2
    //   312: aload_1
    //   313: astore_3
    //   314: aload_2
    //   315: astore_1
    //   316: aload_0
    //   317: astore_2
    //   318: aload_3
    //   319: astore_0
    //   320: goto -35 -> 285
    //   323: astore_2
    //   324: aload_1
    //   325: astore_3
    //   326: aload_2
    //   327: astore_1
    //   328: aload_0
    //   329: astore_2
    //   330: aload_3
    //   331: astore_0
    //   332: goto -47 -> 285
    //   335: astore_0
    //   336: aconst_null
    //   337: astore_1
    //   338: aconst_null
    //   339: astore_0
    //   340: goto -85 -> 255
    //   343: astore_1
    //   344: aconst_null
    //   345: astore_1
    //   346: goto -91 -> 255
    //
    // Exception table:
    //   from	to	target	type
    //   225	231	254	java/lang/Throwable
    //   231	238	254	java/lang/Throwable
    //   243	251	254	java/lang/Throwable
    //   56	63	280	finally
    //   67	78	280	finally
    //   103	114	280	finally
    //   114	130	280	finally
    //   130	143	280	finally
    //   165	172	280	finally
    //   172	178	301	finally
    //   207	225	301	finally
    //   225	231	311	finally
    //   231	238	311	finally
    //   243	251	311	finally
    //   255	259	323	finally
    //   56	63	335	java/lang/Throwable
    //   67	78	335	java/lang/Throwable
    //   103	114	335	java/lang/Throwable
    //   114	130	335	java/lang/Throwable
    //   130	143	335	java/lang/Throwable
    //   165	172	335	java/lang/Throwable
    //   172	178	343	java/lang/Throwable
    //   207	225	343	java/lang/Throwable
  }

  public static String readTextFileFromRaw(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(49714);
    BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader(paramContext.getResources().openRawResource(paramInt)));
    paramContext = new StringBuilder();
    try
    {
      while (true)
      {
        String str = localBufferedReader.readLine();
        if (str == null)
          break;
        paramContext.append(str);
        paramContext.append('\n');
      }
    }
    catch (IOException paramContext)
    {
      paramContext = null;
      AppMethodBeat.o(49714);
    }
    while (true)
    {
      return paramContext;
      paramContext = paramContext.toString();
      AppMethodBeat.o(49714);
    }
  }

  // ERROR //
  public static String readTxtFile(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aconst_null
    //   3: astore_3
    //   4: ldc_w 503
    //   7: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   10: aload_1
    //   11: invokestatic 121	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   14: ifeq +13 -> 27
    //   17: ldc_w 503
    //   20: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   23: aload_3
    //   24: astore_0
    //   25: aload_0
    //   26: areturn
    //   27: new 147	java/lang/StringBuilder
    //   30: dup
    //   31: invokespecial 148	java/lang/StringBuilder:<init>	()V
    //   34: astore_3
    //   35: aload_1
    //   36: ldc 23
    //   38: invokevirtual 386	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   41: ifeq +132 -> 173
    //   44: aload_0
    //   45: invokevirtual 127	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   48: aload_1
    //   49: bipush 9
    //   51: invokevirtual 174	java/lang/String:substring	(I)Ljava/lang/String;
    //   54: invokevirtual 133	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   57: astore_0
    //   58: new 427	java/io/BufferedReader
    //   61: astore_1
    //   62: new 429	java/io/InputStreamReader
    //   65: astore_2
    //   66: aload_2
    //   67: aload_0
    //   68: invokespecial 445	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   71: aload_1
    //   72: aload_2
    //   73: invokespecial 433	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   76: aload_1
    //   77: invokevirtual 436	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   80: astore_2
    //   81: aload_2
    //   82: ifnull +43 -> 125
    //   85: aload_3
    //   86: aload_2
    //   87: invokevirtual 159	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   90: pop
    //   91: goto -15 -> 76
    //   94: astore_2
    //   95: aload_1
    //   96: ifnull +7 -> 103
    //   99: aload_1
    //   100: invokevirtual 504	java/io/BufferedReader:close	()V
    //   103: aload_0
    //   104: ifnull +7 -> 111
    //   107: aload_0
    //   108: invokevirtual 267	java/io/InputStream:close	()V
    //   111: aload_3
    //   112: invokevirtual 164	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   115: astore_0
    //   116: ldc_w 503
    //   119: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   122: goto -97 -> 25
    //   125: aload_1
    //   126: invokevirtual 504	java/io/BufferedReader:close	()V
    //   129: aload_0
    //   130: ifnull -19 -> 111
    //   133: aload_0
    //   134: invokevirtual 267	java/io/InputStream:close	()V
    //   137: goto -26 -> 111
    //   140: astore_0
    //   141: goto -30 -> 111
    //   144: astore_0
    //   145: aconst_null
    //   146: astore_1
    //   147: aconst_null
    //   148: astore_2
    //   149: aload_1
    //   150: ifnull +7 -> 157
    //   153: aload_1
    //   154: invokevirtual 504	java/io/BufferedReader:close	()V
    //   157: aload_2
    //   158: ifnull +7 -> 165
    //   161: aload_2
    //   162: invokevirtual 267	java/io/InputStream:close	()V
    //   165: ldc_w 503
    //   168: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   171: aload_0
    //   172: athrow
    //   173: new 427	java/io/BufferedReader
    //   176: astore_0
    //   177: new 506	java/io/FileReader
    //   180: astore 4
    //   182: aload 4
    //   184: aload_1
    //   185: invokespecial 507	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   188: aload_0
    //   189: aload 4
    //   191: invokespecial 433	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   194: aload_0
    //   195: invokevirtual 436	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   198: astore_1
    //   199: aload_1
    //   200: ifnull +28 -> 228
    //   203: aload_3
    //   204: aload_1
    //   205: invokevirtual 159	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   208: pop
    //   209: goto -15 -> 194
    //   212: astore_1
    //   213: aload_0
    //   214: ifnull -103 -> 111
    //   217: aload_0
    //   218: invokevirtual 504	java/io/BufferedReader:close	()V
    //   221: goto -110 -> 111
    //   224: astore_0
    //   225: goto -114 -> 111
    //   228: aload_0
    //   229: invokevirtual 504	java/io/BufferedReader:close	()V
    //   232: goto -121 -> 111
    //   235: astore_0
    //   236: goto -125 -> 111
    //   239: astore_0
    //   240: aconst_null
    //   241: astore_1
    //   242: aload_1
    //   243: ifnull +7 -> 250
    //   246: aload_1
    //   247: invokevirtual 504	java/io/BufferedReader:close	()V
    //   250: ldc_w 503
    //   253: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   256: aload_0
    //   257: athrow
    //   258: astore_1
    //   259: goto -130 -> 129
    //   262: astore_1
    //   263: goto -160 -> 103
    //   266: astore_0
    //   267: goto -156 -> 111
    //   270: astore_1
    //   271: goto -114 -> 157
    //   274: astore_1
    //   275: goto -110 -> 165
    //   278: astore_1
    //   279: goto -29 -> 250
    //   282: astore_2
    //   283: aload_0
    //   284: astore_1
    //   285: aload_2
    //   286: astore_0
    //   287: goto -45 -> 242
    //   290: astore_0
    //   291: aload_2
    //   292: astore_0
    //   293: goto -80 -> 213
    //   296: astore_1
    //   297: aconst_null
    //   298: astore_3
    //   299: aload_0
    //   300: astore_2
    //   301: aload_1
    //   302: astore_0
    //   303: aload_3
    //   304: astore_1
    //   305: goto -156 -> 149
    //   308: astore_3
    //   309: aload_0
    //   310: astore_2
    //   311: aload_3
    //   312: astore_0
    //   313: goto -164 -> 149
    //   316: astore_0
    //   317: aconst_null
    //   318: astore_1
    //   319: aconst_null
    //   320: astore_0
    //   321: goto -226 -> 95
    //   324: astore_1
    //   325: aconst_null
    //   326: astore_1
    //   327: goto -232 -> 95
    //
    // Exception table:
    //   from	to	target	type
    //   76	81	94	java/io/IOException
    //   85	91	94	java/io/IOException
    //   133	137	140	java/io/IOException
    //   44	58	144	finally
    //   194	199	212	java/io/IOException
    //   203	209	212	java/io/IOException
    //   217	221	224	java/io/IOException
    //   228	232	235	java/io/IOException
    //   173	194	239	finally
    //   125	129	258	java/io/IOException
    //   99	103	262	java/io/IOException
    //   107	111	266	java/io/IOException
    //   153	157	270	java/io/IOException
    //   161	165	274	java/io/IOException
    //   246	250	278	java/io/IOException
    //   194	199	282	finally
    //   203	209	282	finally
    //   173	194	290	java/io/IOException
    //   58	76	296	finally
    //   76	81	308	finally
    //   85	91	308	finally
    //   44	58	316	java/io/IOException
    //   58	76	324	java/io/IOException
  }

  // ERROR //
  public static void save(File paramFile, String paramString)
  {
    // Byte code:
    //   0: ldc_w 509
    //   3: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: new 242	java/io/FileOutputStream
    //   9: astore_2
    //   10: aload_2
    //   11: aload_0
    //   12: invokespecial 497	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   15: new 511	java/io/BufferedWriter
    //   18: astore_0
    //   19: new 513	java/io/OutputStreamWriter
    //   22: astore_3
    //   23: aload_3
    //   24: aload_2
    //   25: ldc_w 421
    //   28: invokespecial 516	java/io/OutputStreamWriter:<init>	(Ljava/io/OutputStream;Ljava/lang/String;)V
    //   31: aload_0
    //   32: aload_3
    //   33: invokespecial 519	java/io/BufferedWriter:<init>	(Ljava/io/Writer;)V
    //   36: aload_0
    //   37: astore 4
    //   39: aload_2
    //   40: astore_3
    //   41: aload_0
    //   42: aload_1
    //   43: invokevirtual 521	java/io/BufferedWriter:write	(Ljava/lang/String;)V
    //   46: aload_2
    //   47: invokestatic 246	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/OutputStream;)V
    //   50: aload_0
    //   51: invokestatic 523	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/Writer;)V
    //   54: ldc_w 509
    //   57: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   60: return
    //   61: astore_1
    //   62: aconst_null
    //   63: astore_0
    //   64: aconst_null
    //   65: astore_2
    //   66: aload_0
    //   67: astore 4
    //   69: aload_2
    //   70: astore_3
    //   71: aload_1
    //   72: invokestatic 235	com/tencent/ttpic/baseutils/LogUtils:e	(Ljava/lang/Throwable;)V
    //   75: aload_2
    //   76: invokestatic 246	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/OutputStream;)V
    //   79: aload_0
    //   80: invokestatic 523	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/Writer;)V
    //   83: ldc_w 509
    //   86: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   89: goto -29 -> 60
    //   92: astore_0
    //   93: aconst_null
    //   94: astore 4
    //   96: aconst_null
    //   97: astore_2
    //   98: aload_2
    //   99: invokestatic 246	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/OutputStream;)V
    //   102: aload 4
    //   104: invokestatic 523	com/tencent/ttpic/baseutils/IOUtils:closeQuietly	(Ljava/io/Writer;)V
    //   107: ldc_w 509
    //   110: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   113: aload_0
    //   114: athrow
    //   115: astore_0
    //   116: aconst_null
    //   117: astore 4
    //   119: goto -21 -> 98
    //   122: astore_0
    //   123: aload_3
    //   124: astore_2
    //   125: goto -27 -> 98
    //   128: astore_1
    //   129: aconst_null
    //   130: astore_0
    //   131: goto -65 -> 66
    //   134: astore_1
    //   135: goto -69 -> 66
    //
    // Exception table:
    //   from	to	target	type
    //   6	15	61	java/lang/Exception
    //   6	15	92	finally
    //   15	36	115	finally
    //   41	46	122	finally
    //   71	75	122	finally
    //   15	36	128	java/lang/Exception
    //   41	46	134	java/lang/Exception
  }

  public static String toBase64(String paramString)
  {
    AppMethodBeat.i(49709);
    FileInputStream localFileInputStream;
    Object localObject;
    Base64OutputStream localBase64OutputStream;
    try
    {
      localFileInputStream = new java/io/FileInputStream;
      localObject = new java/io/File;
      ((File)localObject).<init>(paramString);
      localFileInputStream.<init>((File)localObject);
      localObject = new java/io/ByteArrayOutputStream;
      ((ByteArrayOutputStream)localObject).<init>();
      localBase64OutputStream = new android/util/Base64OutputStream;
      localBase64OutputStream.<init>((OutputStream)localObject, 2);
      paramString = new byte[4096];
      while (true)
      {
        int i = localFileInputStream.read(paramString);
        if (i < 0)
          break;
        localBase64OutputStream.write(paramString, 0, i);
      }
    }
    catch (Exception paramString)
    {
      paramString = null;
    }
    while (true)
    {
      AppMethodBeat.o(49709);
      return paramString;
      localBase64OutputStream.flush();
      localBase64OutputStream.close();
      paramString = new String(((ByteArrayOutputStream)localObject).toByteArray(), "UTF-8");
      try
      {
        ((ByteArrayOutputStream)localObject).close();
        localFileInputStream.close();
      }
      catch (Exception localException)
      {
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.baseutils.FileUtils
 * JD-Core Version:    0.6.2
 */
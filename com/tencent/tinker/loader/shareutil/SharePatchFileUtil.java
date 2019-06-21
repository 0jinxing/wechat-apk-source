package com.tencent.tinker.loader.shareutil;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Build.VERSION;
import com.tencent.tinker.loader.TinkerRuntimeException;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.zip.ZipFile;

public class SharePatchFileUtil
{
  private static char[] caT = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };

  private static String M(InputStream paramInputStream)
  {
    Object localObject1 = null;
    int i = 0;
    if (paramInputStream == null)
      paramInputStream = localObject1;
    while (true)
    {
      return paramInputStream;
      MessageDigest localMessageDigest;
      try
      {
        localObject2 = new java/io/BufferedInputStream;
        ((BufferedInputStream)localObject2).<init>(paramInputStream);
        localMessageDigest = MessageDigest.getInstance("MD5");
        paramInputStream = new java/lang/StringBuilder;
        paramInputStream.<init>(32);
        byte[] arrayOfByte = new byte[102400];
        while (true)
        {
          int j = ((BufferedInputStream)localObject2).read(arrayOfByte);
          if (j == -1)
            break;
          localMessageDigest.update(arrayOfByte, 0, j);
        }
      }
      catch (Exception paramInputStream)
      {
        paramInputStream = localObject1;
      }
      continue;
      Object localObject2 = localMessageDigest.digest();
      while (i < localObject2.length)
      {
        paramInputStream.append(Integer.toString((localObject2[i] & 0xFF) + 256, 16).substring(1));
        i++;
      }
      paramInputStream = paramInputStream.toString();
    }
  }

  public static String a(JarFile paramJarFile, JarEntry paramJarEntry)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    try
    {
      Object localObject = paramJarFile.getInputStream(paramJarEntry);
      paramJarEntry = new byte[16384];
      paramJarFile = new java/io/BufferedInputStream;
      paramJarFile.<init>((InputStream)localObject);
      try
      {
        while (true)
        {
          int i = paramJarFile.read(paramJarEntry);
          if (i <= 0)
            break;
          localObject = new java/lang/String;
          ((String)localObject).<init>(paramJarEntry, 0, i);
          localStringBuilder.append((String)localObject);
        }
      }
      finally
      {
      }
      ah(paramJarFile);
      throw paramJarEntry;
      ah(paramJarFile);
      return localStringBuilder.toString();
    }
    finally
    {
      while (true)
        paramJarFile = null;
    }
  }

  public static void a(ZipFile paramZipFile)
  {
    if (paramZipFile != null);
    try
    {
      paramZipFile.close();
      label8: return;
    }
    catch (IOException paramZipFile)
    {
      break label8;
    }
  }

  @SuppressLint({"NewApi"})
  public static void ah(Object paramObject)
  {
    if (paramObject == null);
    while (true)
    {
      return;
      if ((paramObject instanceof Closeable))
      {
        try
        {
          ((Closeable)paramObject).close();
        }
        catch (Throwable paramObject)
        {
        }
      }
      else if ((Build.VERSION.SDK_INT >= 19) && ((paramObject instanceof AutoCloseable)))
      {
        try
        {
          ((AutoCloseable)paramObject).close();
        }
        catch (Throwable paramObject)
        {
        }
      }
      else
      {
        if (!(paramObject instanceof ZipFile))
          break;
        try
        {
          ((ZipFile)paramObject).close();
        }
        catch (Throwable paramObject)
        {
        }
      }
    }
    throw new IllegalArgumentException("obj: " + paramObject + " cannot be closed.");
  }

  public static final boolean ap(File paramFile)
  {
    if ((paramFile != null) && (paramFile.exists()) && (paramFile.canRead()) && (paramFile.isFile()) && (paramFile.length() > 0L));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static final boolean aq(File paramFile)
  {
    if ((("vivo".equalsIgnoreCase(Build.MANUFACTURER)) || ("oppo".equalsIgnoreCase(Build.MANUFACTURER))) && ((!paramFile.exists()) || (paramFile.length() == 0L)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static long ar(File paramFile)
  {
    long l1 = 0L;
    long l2 = l1;
    if (paramFile != null)
    {
      if (paramFile.exists())
        break label19;
      l2 = l1;
    }
    label19: int i;
    int j;
    do
    {
      do
      {
        while (true)
        {
          return l2;
          if (!paramFile.isFile())
            break;
          l2 = paramFile.length();
        }
        paramFile = paramFile.listFiles();
        l2 = l1;
      }
      while (paramFile == null);
      i = paramFile.length;
      j = 0;
      l2 = l1;
    }
    while (j >= i);
    File localFile = paramFile[j];
    if (localFile.isDirectory());
    for (l1 += ar(localFile); ; l1 += localFile.length())
    {
      j++;
      break;
    }
  }

  public static final boolean as(File paramFile)
  {
    boolean bool1 = true;
    if (paramFile == null);
    while (true)
    {
      return bool1;
      if (paramFile.exists())
      {
        new StringBuilder("safeDeleteFile, try to delete path: ").append(paramFile.getPath());
        boolean bool2 = paramFile.delete();
        bool1 = bool2;
        if (!bool2)
        {
          new StringBuilder("Failed to delete file, try to delete when exit. path: ").append(paramFile.getPath());
          paramFile.deleteOnExit();
          bool1 = bool2;
        }
      }
    }
  }

  // ERROR //
  public static String at(File paramFile)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aload_1
    //   3: astore_2
    //   4: aload_0
    //   5: ifnull +12 -> 17
    //   8: aload_0
    //   9: invokevirtual 149	java/io/File:exists	()Z
    //   12: ifne +7 -> 19
    //   15: aload_1
    //   16: astore_2
    //   17: aload_2
    //   18: areturn
    //   19: new 203	java/io/FileInputStream
    //   22: astore_2
    //   23: aload_2
    //   24: aload_0
    //   25: invokespecial 206	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   28: aload_2
    //   29: invokestatic 208	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:M	(Ljava/io/InputStream;)Ljava/lang/String;
    //   32: astore_0
    //   33: aload_2
    //   34: invokestatic 102	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:ah	(Ljava/lang/Object;)V
    //   37: aload_0
    //   38: astore_2
    //   39: goto -22 -> 17
    //   42: astore_0
    //   43: aconst_null
    //   44: astore_2
    //   45: aload_2
    //   46: invokestatic 102	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:ah	(Ljava/lang/Object;)V
    //   49: aload_1
    //   50: astore_2
    //   51: goto -34 -> 17
    //   54: astore_0
    //   55: aconst_null
    //   56: astore_2
    //   57: aload_2
    //   58: invokestatic 102	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:ah	(Ljava/lang/Object;)V
    //   61: aload_0
    //   62: athrow
    //   63: astore_0
    //   64: goto -7 -> 57
    //   67: astore_0
    //   68: goto -23 -> 45
    //
    // Exception table:
    //   from	to	target	type
    //   19	28	42	java/lang/Exception
    //   19	28	54	finally
    //   28	33	63	finally
    //   28	33	67	java/lang/Exception
  }

  public static void au(File paramFile)
  {
    if (paramFile == null);
    while (true)
    {
      return;
      paramFile = paramFile.getParentFile();
      if (!paramFile.exists())
        paramFile.mkdirs();
    }
  }

  public static File auo(String paramString)
  {
    return new File(paramString + "/patch.info");
  }

  public static File aup(String paramString)
  {
    return new File(paramString + "/info.lock");
  }

  public static String auq(String paramString)
  {
    if ((paramString == null) || (paramString.length() != 32));
    for (paramString = null; ; paramString = "patch-" + paramString.substring(0, 8))
      return paramString;
  }

  public static String aur(String paramString)
  {
    if ((paramString == null) || (paramString.length() != 32));
    for (paramString = null; ; paramString = auq(paramString) + ".apk")
      return paramString;
  }

  public static boolean aus(String paramString)
  {
    if ((paramString == null) || (paramString.length() != 32));
    for (boolean bool = false; ; bool = true)
      return bool;
  }

  public static boolean aut(String paramString)
  {
    if (paramString == null);
    for (boolean bool = false; ; bool = paramString.endsWith(".dex"))
      return bool;
  }

  // ERROR //
  public static boolean b(File paramFile, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: aconst_null
    //   6: astore 5
    //   8: aload_0
    //   9: ifnull +11 -> 20
    //   12: aload_2
    //   13: ifnull +7 -> 20
    //   16: aload_1
    //   17: ifnonnull +9 -> 26
    //   20: iconst_0
    //   21: istore 6
    //   23: iload 6
    //   25: ireturn
    //   26: ldc 249
    //   28: astore 7
    //   30: aload_0
    //   31: invokevirtual 252	java/io/File:getName	()Ljava/lang/String;
    //   34: invokestatic 254	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:aut	(Ljava/lang/String;)Z
    //   37: ifeq +18 -> 55
    //   40: aload_0
    //   41: invokestatic 256	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:at	(Ljava/io/File;)Ljava/lang/String;
    //   44: astore_0
    //   45: aload_2
    //   46: aload_0
    //   47: invokevirtual 260	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   50: istore 6
    //   52: goto -29 -> 23
    //   55: new 107	java/util/zip/ZipFile
    //   58: astore 8
    //   60: aload 8
    //   62: aload_0
    //   63: invokespecial 261	java/util/zip/ZipFile:<init>	(Ljava/io/File;)V
    //   66: aload 8
    //   68: aload_1
    //   69: invokevirtual 265	java/util/zip/ZipFile:getEntry	(Ljava/lang/String;)Ljava/util/zip/ZipEntry;
    //   72: astore_3
    //   73: aload_3
    //   74: ifnonnull +34 -> 108
    //   77: new 49	java/lang/StringBuilder
    //   80: astore_1
    //   81: aload_1
    //   82: ldc_w 267
    //   85: invokespecial 134	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   88: aload_1
    //   89: aload_0
    //   90: invokevirtual 270	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   93: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   96: pop
    //   97: aload 8
    //   99: invokestatic 272	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   102: iconst_0
    //   103: istore 6
    //   105: goto -82 -> 23
    //   108: aload 5
    //   110: astore_1
    //   111: aload 8
    //   113: aload_3
    //   114: invokevirtual 273	java/util/zip/ZipFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   117: astore 5
    //   119: aload 5
    //   121: astore_1
    //   122: aload 5
    //   124: astore 4
    //   126: aload 5
    //   128: invokestatic 208	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:M	(Ljava/io/InputStream;)Ljava/lang/String;
    //   131: astore_3
    //   132: aload_3
    //   133: astore_1
    //   134: aload 5
    //   136: invokestatic 102	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:ah	(Ljava/lang/Object;)V
    //   139: aload_1
    //   140: astore_0
    //   141: aload 8
    //   143: invokestatic 272	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   146: goto -101 -> 45
    //   149: astore 4
    //   151: aload_1
    //   152: astore 4
    //   154: new 49	java/lang/StringBuilder
    //   157: astore 5
    //   159: aload_1
    //   160: astore 4
    //   162: aload 5
    //   164: ldc_w 275
    //   167: invokespecial 134	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   170: aload_1
    //   171: astore 4
    //   173: aload 5
    //   175: aload_0
    //   176: invokevirtual 270	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   179: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   182: pop
    //   183: aload_1
    //   184: invokestatic 102	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:ah	(Ljava/lang/Object;)V
    //   187: aload 7
    //   189: astore_0
    //   190: goto -49 -> 141
    //   193: astore_1
    //   194: aload 8
    //   196: astore_1
    //   197: new 49	java/lang/StringBuilder
    //   200: astore_2
    //   201: aload_2
    //   202: ldc_w 277
    //   205: invokespecial 134	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   208: aload_2
    //   209: aload_0
    //   210: invokevirtual 270	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   213: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   216: pop
    //   217: aload_1
    //   218: invokestatic 272	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   221: iconst_0
    //   222: istore 6
    //   224: goto -201 -> 23
    //   227: astore_1
    //   228: aload 4
    //   230: invokestatic 102	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:ah	(Ljava/lang/Object;)V
    //   233: aload_1
    //   234: athrow
    //   235: astore_0
    //   236: aload 8
    //   238: astore_1
    //   239: aload_1
    //   240: invokestatic 272	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   243: aload_0
    //   244: athrow
    //   245: astore_0
    //   246: aconst_null
    //   247: astore_1
    //   248: goto -9 -> 239
    //   251: astore_0
    //   252: goto -13 -> 239
    //   255: astore_1
    //   256: aload_3
    //   257: astore_1
    //   258: goto -61 -> 197
    //
    // Exception table:
    //   from	to	target	type
    //   111	119	149	java/lang/Throwable
    //   126	132	149	java/lang/Throwable
    //   66	73	193	java/lang/Throwable
    //   77	97	193	java/lang/Throwable
    //   134	139	193	java/lang/Throwable
    //   183	187	193	java/lang/Throwable
    //   228	235	193	java/lang/Throwable
    //   111	119	227	finally
    //   126	132	227	finally
    //   154	159	227	finally
    //   162	170	227	finally
    //   173	183	227	finally
    //   66	73	235	finally
    //   77	97	235	finally
    //   134	139	235	finally
    //   183	187	235	finally
    //   228	235	235	finally
    //   55	66	245	finally
    //   197	217	251	finally
    //   55	66	255	java/lang/Throwable
  }

  public static String cq(byte[] paramArrayOfByte)
  {
    try
    {
      Object localObject = MessageDigest.getInstance("MD5");
      ((MessageDigest)localObject).update(paramArrayOfByte);
      localObject = ((MessageDigest)localObject).digest();
      int i = localObject.length;
      paramArrayOfByte = new char[i * 2];
      int j = 0;
      int n;
      for (int k = 0; j < i; k = n + 1)
      {
        int m = localObject[j];
        n = k + 1;
        paramArrayOfByte[k] = ((char)caT[(m >>> 4 & 0xF)]);
        paramArrayOfByte[n] = ((char)caT[(m & 0xF)]);
        j++;
      }
      paramArrayOfByte = new String(paramArrayOfByte);
      return paramArrayOfByte;
    }
    catch (Exception paramArrayOfByte)
    {
      while (true)
        paramArrayOfByte = null;
    }
  }

  public static final boolean cu(String paramString)
  {
    if (paramString == null);
    for (boolean bool = false; ; bool = t(new File(paramString)))
      return bool;
  }

  public static boolean g(File paramFile, String paramString)
  {
    boolean bool = false;
    if (paramString == null);
    while (true)
    {
      return bool;
      paramFile = at(paramFile);
      if (paramFile != null)
        bool = paramString.equals(paramFile);
    }
  }

  public static boolean h(File paramFile, String paramString)
  {
    return b(paramFile, "classes.dex", paramString);
  }

  // ERROR //
  public static boolean i(File paramFile, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aconst_null
    //   3: astore_3
    //   4: aconst_null
    //   5: astore 4
    //   7: iconst_0
    //   8: istore 5
    //   10: aload_3
    //   11: astore 6
    //   13: new 107	java/util/zip/ZipFile
    //   16: astore 7
    //   18: aload_3
    //   19: astore 6
    //   21: aload 7
    //   23: aload_0
    //   24: invokespecial 261	java/util/zip/ZipFile:<init>	(Ljava/io/File;)V
    //   27: aload 7
    //   29: ldc_w 299
    //   32: invokevirtual 265	java/util/zip/ZipFile:getEntry	(Ljava/lang/String;)Ljava/util/zip/ZipEntry;
    //   35: astore 6
    //   37: aload 6
    //   39: ifnonnull +11 -> 50
    //   42: aload 7
    //   44: invokestatic 272	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   47: iload 5
    //   49: ireturn
    //   50: aload 4
    //   52: astore_0
    //   53: aload 7
    //   55: aload 6
    //   57: invokevirtual 273	java/util/zip/ZipFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   60: astore 6
    //   62: aload 6
    //   64: astore_0
    //   65: aload 6
    //   67: invokestatic 208	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:M	(Ljava/io/InputStream;)Ljava/lang/String;
    //   70: astore_2
    //   71: aload_2
    //   72: ifnull +34 -> 106
    //   75: aload 6
    //   77: astore_0
    //   78: aload_2
    //   79: aload_1
    //   80: invokevirtual 260	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   83: istore 8
    //   85: iload 8
    //   87: ifeq +19 -> 106
    //   90: aload 6
    //   92: invokestatic 102	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:ah	(Ljava/lang/Object;)V
    //   95: aload 7
    //   97: invokestatic 272	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   100: iconst_1
    //   101: istore 5
    //   103: goto -56 -> 47
    //   106: aload 6
    //   108: invokestatic 102	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:ah	(Ljava/lang/Object;)V
    //   111: aload 7
    //   113: invokestatic 272	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   116: goto -69 -> 47
    //   119: astore_1
    //   120: aload_0
    //   121: invokestatic 102	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:ah	(Ljava/lang/Object;)V
    //   124: aload_1
    //   125: athrow
    //   126: astore_1
    //   127: aload 7
    //   129: astore_0
    //   130: aload_0
    //   131: astore 6
    //   133: new 49	java/lang/StringBuilder
    //   136: astore 7
    //   138: aload_0
    //   139: astore 6
    //   141: aload 7
    //   143: ldc_w 301
    //   146: invokespecial 134	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   149: aload_0
    //   150: astore 6
    //   152: aload 7
    //   154: aload_1
    //   155: invokevirtual 304	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   158: invokevirtual 81	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   161: pop
    //   162: aload_0
    //   163: invokestatic 272	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   166: goto -119 -> 47
    //   169: astore_0
    //   170: aload 6
    //   172: invokestatic 272	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:a	(Ljava/util/zip/ZipFile;)V
    //   175: aload_0
    //   176: athrow
    //   177: astore_0
    //   178: aload 7
    //   180: astore 6
    //   182: goto -12 -> 170
    //   185: astore_1
    //   186: aload_2
    //   187: astore_0
    //   188: goto -58 -> 130
    //
    // Exception table:
    //   from	to	target	type
    //   53	62	119	finally
    //   65	71	119	finally
    //   78	85	119	finally
    //   27	37	126	java/lang/Throwable
    //   90	95	126	java/lang/Throwable
    //   106	111	126	java/lang/Throwable
    //   120	126	126	java/lang/Throwable
    //   13	18	169	finally
    //   21	27	169	finally
    //   133	138	169	finally
    //   141	149	169	finally
    //   152	162	169	finally
    //   27	37	177	finally
    //   90	95	177	finally
    //   106	111	177	finally
    //   120	126	177	finally
    //   13	18	185	java/lang/Throwable
    //   21	27	185	java/lang/Throwable
  }

  // ERROR //
  public static void j(File paramFile1, File paramFile2)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 308	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:ap	(Ljava/io/File;)Z
    //   4: ifeq +7 -> 11
    //   7: aload_1
    //   8: ifnonnull +4 -> 12
    //   11: return
    //   12: aload_0
    //   13: invokevirtual 270	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   16: aload_1
    //   17: invokevirtual 270	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   20: invokevirtual 260	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   23: ifne -12 -> 11
    //   26: aload_1
    //   27: invokevirtual 213	java/io/File:getParentFile	()Ljava/io/File;
    //   30: astore_2
    //   31: aload_2
    //   32: ifnull +15 -> 47
    //   35: aload_2
    //   36: invokevirtual 149	java/io/File:exists	()Z
    //   39: ifne +8 -> 47
    //   42: aload_2
    //   43: invokevirtual 216	java/io/File:mkdirs	()Z
    //   46: pop
    //   47: new 203	java/io/FileInputStream
    //   50: astore_2
    //   51: aload_2
    //   52: aload_0
    //   53: invokespecial 206	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   56: new 310	java/io/FileOutputStream
    //   59: astore_3
    //   60: aload_3
    //   61: aload_1
    //   62: iconst_0
    //   63: invokespecial 313	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   66: sipush 16384
    //   69: newarray byte
    //   71: astore_0
    //   72: aload_2
    //   73: aload_0
    //   74: invokevirtual 314	java/io/FileInputStream:read	([B)I
    //   77: istore 4
    //   79: iload 4
    //   81: ifle +27 -> 108
    //   84: aload_3
    //   85: aload_0
    //   86: iconst_0
    //   87: iload 4
    //   89: invokevirtual 317	java/io/FileOutputStream:write	([BII)V
    //   92: goto -20 -> 72
    //   95: astore_0
    //   96: aload_3
    //   97: astore_1
    //   98: aload_2
    //   99: invokestatic 102	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:ah	(Ljava/lang/Object;)V
    //   102: aload_1
    //   103: invokestatic 102	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:ah	(Ljava/lang/Object;)V
    //   106: aload_0
    //   107: athrow
    //   108: aload_2
    //   109: invokestatic 102	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:ah	(Ljava/lang/Object;)V
    //   112: aload_3
    //   113: invokestatic 102	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:ah	(Ljava/lang/Object;)V
    //   116: goto -105 -> 11
    //   119: astore_0
    //   120: aconst_null
    //   121: astore_1
    //   122: aconst_null
    //   123: astore_2
    //   124: goto -26 -> 98
    //   127: astore_0
    //   128: aconst_null
    //   129: astore_1
    //   130: goto -32 -> 98
    //
    // Exception table:
    //   from	to	target	type
    //   66	72	95	finally
    //   72	79	95	finally
    //   84	92	95	finally
    //   47	56	119	finally
    //   56	66	127	finally
  }

  public static File jh(Context paramContext)
  {
    paramContext = paramContext.getApplicationInfo();
    if (paramContext == null);
    for (paramContext = null; ; paramContext = new File(paramContext.dataDir, "tinker"))
      return paramContext;
  }

  public static File ji(Context paramContext)
  {
    paramContext = paramContext.getApplicationInfo();
    if (paramContext == null);
    for (paramContext = null; ; paramContext = new File(paramContext.dataDir, "tinker_temp"))
      return paramContext;
  }

  public static File jj(Context paramContext)
  {
    paramContext = ji(paramContext);
    if (paramContext == null);
    for (paramContext = null; ; paramContext = new File(paramContext, "tinker_last_crash"))
      return paramContext;
  }

  // ERROR //
  public static String jk(Context paramContext)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aload_0
    //   3: invokestatic 350	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:jj	(Landroid/content/Context;)Ljava/io/File;
    //   6: astore_2
    //   7: aload_2
    //   8: invokestatic 308	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:ap	(Ljava/io/File;)Z
    //   11: ifne +7 -> 18
    //   14: aload_1
    //   15: astore_0
    //   16: aload_0
    //   17: areturn
    //   18: new 352	java/lang/StringBuffer
    //   21: dup
    //   22: invokespecial 353	java/lang/StringBuffer:<init>	()V
    //   25: astore_3
    //   26: new 355	java/io/BufferedReader
    //   29: astore 4
    //   31: new 357	java/io/InputStreamReader
    //   34: astore 5
    //   36: new 203	java/io/FileInputStream
    //   39: astore_0
    //   40: aload_0
    //   41: aload_2
    //   42: invokespecial 206	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   45: aload 5
    //   47: aload_0
    //   48: invokespecial 358	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   51: aload 4
    //   53: aload 5
    //   55: invokespecial 361	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   58: aload 4
    //   60: astore_0
    //   61: aload 4
    //   63: invokevirtual 364	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   66: astore 5
    //   68: aload 5
    //   70: ifnull +67 -> 137
    //   73: aload 4
    //   75: astore_0
    //   76: aload_3
    //   77: aload 5
    //   79: invokevirtual 367	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   82: pop
    //   83: aload 4
    //   85: astore_0
    //   86: aload_3
    //   87: ldc_w 369
    //   90: invokevirtual 367	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   93: pop
    //   94: goto -36 -> 58
    //   97: astore_3
    //   98: aload 4
    //   100: astore_0
    //   101: new 49	java/lang/StringBuilder
    //   104: astore 5
    //   106: aload 4
    //   108: astore_0
    //   109: aload 5
    //   111: ldc_w 371
    //   114: invokespecial 134	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   117: aload 4
    //   119: astore_0
    //   120: aload 5
    //   122: aload_3
    //   123: invokevirtual 137	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   126: pop
    //   127: aload 4
    //   129: invokestatic 102	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:ah	(Ljava/lang/Object;)V
    //   132: aload_1
    //   133: astore_0
    //   134: goto -118 -> 16
    //   137: aload 4
    //   139: invokestatic 102	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:ah	(Ljava/lang/Object;)V
    //   142: aload_3
    //   143: invokevirtual 372	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   146: astore_0
    //   147: goto -131 -> 16
    //   150: astore 4
    //   152: aconst_null
    //   153: astore_0
    //   154: aload_0
    //   155: invokestatic 102	com/tencent/tinker/loader/shareutil/SharePatchFileUtil:ah	(Ljava/lang/Object;)V
    //   158: aload 4
    //   160: athrow
    //   161: astore 4
    //   163: goto -9 -> 154
    //   166: astore_3
    //   167: aconst_null
    //   168: astore 4
    //   170: goto -72 -> 98
    //
    // Exception table:
    //   from	to	target	type
    //   61	68	97	java/lang/Exception
    //   76	83	97	java/lang/Exception
    //   86	94	97	java/lang/Exception
    //   26	58	150	finally
    //   61	68	161	finally
    //   76	83	161	finally
    //   86	94	161	finally
    //   101	106	161	finally
    //   109	117	161	finally
    //   120	127	161	finally
    //   26	58	166	java/lang/Exception
  }

  public static String k(File paramFile1, File paramFile2)
  {
    int i;
    if (ShareTinkerInternals.dSr())
      try
      {
        str = ShareTinkerInternals.dSs();
        File localFile = paramFile1.getParentFile();
        paramFile2 = paramFile1.getName();
        i = paramFile2.lastIndexOf('.');
        paramFile1 = paramFile2;
        if (i > 0)
          paramFile1 = paramFile2.substring(0, i);
        paramFile1 = localFile.getAbsolutePath() + "/oat/" + str + "/" + paramFile1 + ".odex";
        return paramFile1;
      }
      catch (Exception paramFile1)
      {
        throw new TinkerRuntimeException("getCurrentInstructionSet fail:", paramFile1);
      }
    String str = paramFile1.getName();
    paramFile1 = str;
    if (!str.endsWith(".dex"))
    {
      i = str.lastIndexOf(".");
      if (i >= 0)
        break label168;
    }
    for (paramFile1 = str + ".dex"; ; paramFile1 = paramFile1.toString())
    {
      paramFile1 = new File(paramFile2, paramFile1).getPath();
      break;
      label168: paramFile1 = new StringBuilder(i + 4);
      paramFile1.append(str, 0, i);
      paramFile1.append(".dex");
    }
  }

  public static final boolean t(File paramFile)
  {
    int i = 0;
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (paramFile != null)
    {
      if (!paramFile.exists())
        bool2 = bool1;
    }
    else
      return bool2;
    if (paramFile.isFile())
      as(paramFile);
    while (true)
    {
      bool2 = true;
      break;
      if (paramFile.isDirectory())
      {
        File[] arrayOfFile = paramFile.listFiles();
        if (arrayOfFile != null)
        {
          int j = arrayOfFile.length;
          while (i < j)
          {
            t(arrayOfFile[i]);
            i++;
          }
          as(paramFile);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.loader.shareutil.SharePatchFileUtil
 * JD-Core Version:    0.6.2
 */
package com.tencent.smtt.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Environment;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.sdk.TbsDownloadConfig;
import com.tencent.smtt.sdk.TbsLogReport;
import com.tencent.smtt.sdk.TbsLogReport.EventType;
import com.tencent.smtt.sdk.TbsLogReport.TbsLogInfo;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;

@SuppressLint({"NewApi"})
public class k
{
  public static String a;
  public static final k.a b;
  private static final int c;
  private static RandomAccessFile d;

  static
  {
    AppMethodBeat.i(65253);
    c = 4;
    a = null;
    d = null;
    b = new m();
    AppMethodBeat.o(65253);
  }

  public static File a(Context paramContext, boolean paramBoolean, String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(65244);
    if (paramBoolean)
    {
      paramContext = d(paramContext);
      if (paramContext != null)
        break label37;
      AppMethodBeat.o(65244);
      paramContext = localObject;
    }
    while (true)
    {
      return paramContext;
      paramContext = c(paramContext);
      break;
      label37: paramContext = new File(paramContext);
      if (!paramContext.exists())
        paramContext.mkdirs();
      if (!paramContext.canWrite())
      {
        AppMethodBeat.o(65244);
        paramContext = localObject;
      }
      else
      {
        paramContext = new File(paramContext, paramString);
        if (!paramContext.exists());
        try
        {
          paramContext.createNewFile();
          AppMethodBeat.o(65244);
        }
        catch (IOException paramContext)
        {
          AppMethodBeat.o(65244);
          paramContext = localObject;
        }
      }
    }
  }

  public static String a(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(65221);
    paramContext = a(paramContext, paramContext.getApplicationInfo().packageName, paramInt, true);
    AppMethodBeat.o(65221);
    return paramContext;
  }

  private static String a(Context paramContext, String paramString)
  {
    AppMethodBeat.i(65223);
    Object localObject = "";
    if (paramContext == null)
    {
      AppMethodBeat.o(65223);
      paramContext = (Context)localObject;
      return paramContext;
    }
    localObject = paramContext.getApplicationContext();
    if (localObject == null);
    while (true)
    {
      StringBuilder localStringBuilder;
      try
      {
        localObject = paramContext.getExternalFilesDir(paramString).getAbsolutePath();
        paramContext = (Context)localObject;
        AppMethodBeat.o(65223);
      }
      catch (Throwable localThrowable)
      {
        try
        {
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          paramContext = Environment.getExternalStorageDirectory() + File.separator + "Android" + File.separator + "data" + File.separator + paramContext.getApplicationInfo().packageName + File.separator + "files" + File.separator + paramString;
        }
        catch (Exception paramContext)
        {
          paramContext = "";
          AppMethodBeat.o(65223);
        }
      }
      break;
      paramContext = localStringBuilder;
    }
  }

  public static String a(Context paramContext, String paramString, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(65222);
    if (paramContext == null)
    {
      paramContext = "";
      AppMethodBeat.o(65222);
    }
    while (true)
    {
      return paramContext;
      Object localObject1 = "";
      try
      {
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = Environment.getExternalStorageDirectory() + File.separator;
        localObject1 = localObject2;
        switch (paramInt)
        {
        default:
          paramContext = "";
          AppMethodBeat.o(65222);
          break;
        case 1:
          if (((String)localObject1).equals(""))
          {
            AppMethodBeat.o(65222);
            paramContext = (Context)localObject1;
            continue;
          }
          paramContext = (String)localObject1 + "tencent" + File.separator + "tbs" + File.separator + paramString;
          AppMethodBeat.o(65222);
          break;
        case 2:
          if (((String)localObject1).equals(""))
          {
            AppMethodBeat.o(65222);
            paramContext = (Context)localObject1;
            continue;
          }
          paramContext = (String)localObject1 + "tbs" + File.separator + "backup" + File.separator + paramString;
          AppMethodBeat.o(65222);
          break;
        case 3:
          if (((String)localObject1).equals(""))
          {
            AppMethodBeat.o(65222);
            paramContext = (Context)localObject1;
            continue;
          }
          paramContext = (String)localObject1 + "tencent" + File.separator + "tbs" + File.separator + "backup" + File.separator + paramString;
          AppMethodBeat.o(65222);
          break;
        case 4:
          if (((String)localObject1).equals(""))
          {
            paramContext = a(paramContext, "backup");
            AppMethodBeat.o(65222);
            continue;
          }
          localObject1 = (String)localObject1 + "tencent" + File.separator + "tbs" + File.separator + "backup" + File.separator + paramString;
          paramString = (String)localObject1;
          if (paramBoolean)
          {
            localObject2 = new File((String)localObject1);
            if (((File)localObject2).exists())
            {
              paramString = (String)localObject1;
              if (((File)localObject2).canWrite());
            }
            else
            {
              if (((File)localObject2).exists())
                break label489;
              ((File)localObject2).mkdirs();
              paramString = (String)localObject1;
              if (((File)localObject2).canWrite());
            }
          }
          for (paramString = a(paramContext, "backup"); ; paramString = a(paramContext, "backup"))
          {
            AppMethodBeat.o(65222);
            paramContext = paramString;
            break;
          }
        case 5:
          if (((String)localObject1).equals(""))
          {
            AppMethodBeat.o(65222);
            paramContext = (Context)localObject1;
            continue;
          }
          paramContext = (String)localObject1 + "tencent" + File.separator + "tbs" + File.separator + paramString;
          AppMethodBeat.o(65222);
          break;
        case 6:
          label56: label489: if (a != null)
          {
            paramContext = a;
            AppMethodBeat.o(65222);
            continue;
          }
          paramContext = a(paramContext, "tbslog");
          a = paramContext;
          AppMethodBeat.o(65222);
        }
      }
      catch (Exception localException)
      {
        break label56;
      }
    }
  }

  public static FileLock a(Context paramContext, FileOutputStream paramFileOutputStream)
  {
    paramContext = null;
    AppMethodBeat.i(65246);
    if (paramFileOutputStream == null)
      AppMethodBeat.o(65246);
    while (true)
    {
      return paramContext;
      try
      {
        paramFileOutputStream = paramFileOutputStream.getChannel().tryLock();
        boolean bool = paramFileOutputStream.isValid();
        if (bool)
        {
          AppMethodBeat.o(65246);
          paramContext = paramFileOutputStream;
        }
      }
      catch (Exception paramFileOutputStream)
      {
        AppMethodBeat.o(65246);
      }
      catch (OverlappingFileLockException paramFileOutputStream)
      {
        label46: break label46;
      }
    }
  }

  public static void a(Context paramContext, FileLock paramFileLock)
  {
    try
    {
      AppMethodBeat.i(65251);
      paramContext = paramFileLock.channel();
      if (paramContext != null)
      {
        boolean bool = paramContext.isOpen();
        if (!bool);
      }
      while (true)
      {
        try
        {
          paramFileLock.release();
          AppMethodBeat.o(65251);
          return;
        }
        catch (IOException paramContext)
        {
        }
        AppMethodBeat.o(65251);
      }
    }
    finally
    {
    }
    throw paramContext;
  }

  public static void a(File paramFile, boolean paramBoolean)
  {
    AppMethodBeat.i(65237);
    if ((paramFile == null) || (!paramFile.exists()))
      AppMethodBeat.o(65237);
    while (true)
    {
      return;
      if (paramFile.isFile())
      {
        paramFile.delete();
        AppMethodBeat.o(65237);
      }
      else
      {
        File[] arrayOfFile = paramFile.listFiles();
        if (arrayOfFile == null)
        {
          AppMethodBeat.o(65237);
        }
        else
        {
          int i = arrayOfFile.length;
          for (int j = 0; j < i; j++)
            a(arrayOfFile[j], paramBoolean);
          if (!paramBoolean)
            paramFile.delete();
          AppMethodBeat.o(65237);
        }
      }
    }
  }

  public static void a(File paramFile, boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(65238);
    if ((paramFile == null) || (!paramFile.exists()))
      AppMethodBeat.o(65238);
    while (true)
    {
      return;
      if (paramFile.isFile())
      {
        paramFile.delete();
        AppMethodBeat.o(65238);
      }
      else
      {
        File[] arrayOfFile = paramFile.listFiles();
        if (arrayOfFile == null)
        {
          AppMethodBeat.o(65238);
        }
        else
        {
          int i = arrayOfFile.length;
          for (int j = 0; j < i; j++)
          {
            File localFile = arrayOfFile[j];
            if (!localFile.getName().equals(paramString))
              a(localFile, paramBoolean);
          }
          if (!paramBoolean)
            paramFile.delete();
          AppMethodBeat.o(65238);
        }
      }
    }
  }

  public static void a(FileLock paramFileLock, FileOutputStream paramFileOutputStream)
  {
    AppMethodBeat.i(65247);
    if (paramFileLock != null);
    try
    {
      FileChannel localFileChannel = paramFileLock.channel();
      if ((localFileChannel != null) && (localFileChannel.isOpen()))
        paramFileLock.release();
      label29: if (paramFileOutputStream != null);
      while (true)
      {
        try
        {
          paramFileOutputStream.close();
          AppMethodBeat.o(65247);
          return;
        }
        catch (Exception paramFileLock)
        {
        }
        AppMethodBeat.o(65247);
      }
    }
    catch (Exception paramFileLock)
    {
      break label29;
    }
  }

  public static boolean a(Context paramContext)
  {
    boolean bool1 = true;
    boolean bool2 = true;
    AppMethodBeat.i(65224);
    if (Build.VERSION.SDK_INT < 23)
    {
      AppMethodBeat.o(65224);
      return bool2;
    }
    if (paramContext != null)
      if (paramContext.getApplicationContext().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0)
        bool2 = bool1;
    while (true)
    {
      AppMethodBeat.o(65224);
      break;
      bool2 = false;
      continue;
      bool2 = false;
    }
  }

  public static boolean a(File paramFile)
  {
    AppMethodBeat.i(65235);
    boolean bool;
    if (paramFile == null)
    {
      bool = false;
      AppMethodBeat.o(65235);
    }
    while (true)
    {
      return bool;
      if ((paramFile.exists()) && (paramFile.isDirectory()))
      {
        bool = true;
        AppMethodBeat.o(65235);
      }
      else
      {
        b(paramFile);
        bool = paramFile.mkdirs();
        AppMethodBeat.o(65235);
      }
    }
  }

  public static boolean a(File paramFile1, File paramFile2)
  {
    AppMethodBeat.i(65225);
    boolean bool = a(paramFile1.getPath(), paramFile2.getPath());
    AppMethodBeat.o(65225);
    return bool;
  }

  public static boolean a(File paramFile1, File paramFile2, FileFilter paramFileFilter)
  {
    AppMethodBeat.i(65232);
    boolean bool = a(paramFile1, paramFile2, paramFileFilter, b);
    AppMethodBeat.o(65232);
    return bool;
  }

  public static boolean a(File paramFile1, File paramFile2, FileFilter paramFileFilter, k.a parama)
  {
    boolean bool = false;
    AppMethodBeat.i(65233);
    if ((paramFile1 == null) || (paramFile2 == null))
      AppMethodBeat.o(65233);
    while (true)
    {
      return bool;
      if (!paramFile1.exists())
      {
        AppMethodBeat.o(65233);
      }
      else if (paramFile1.isFile())
      {
        bool = b(paramFile1, paramFile2, paramFileFilter, parama);
        AppMethodBeat.o(65233);
      }
      else
      {
        parama = paramFile1.listFiles(paramFileFilter);
        if (parama == null)
        {
          AppMethodBeat.o(65233);
        }
        else
        {
          bool = true;
          int i = parama.length;
          for (int j = 0; j < i; j++)
          {
            paramFile1 = parama[j];
            if (!a(paramFile1, new File(paramFile2, paramFile1.getName()), paramFileFilter))
              bool = false;
          }
          AppMethodBeat.o(65233);
        }
      }
    }
  }

  // ERROR //
  private static boolean a(String paramString, long paramLong1, long paramLong2, long paramLong3)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 7
    //   3: ldc_w 260
    //   6: invokestatic 28	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: new 56	java/io/File
    //   12: dup
    //   13: aload_0
    //   14: invokespecial 59	java/io/File:<init>	(Ljava/lang/String;)V
    //   17: astore_0
    //   18: aload_0
    //   19: invokevirtual 264	java/io/File:length	()J
    //   22: lload_1
    //   23: lcmp
    //   24: ifeq +48 -> 72
    //   27: ldc_w 266
    //   30: new 113	java/lang/StringBuilder
    //   33: dup
    //   34: ldc_w 268
    //   37: invokespecial 269	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   40: aload_0
    //   41: invokevirtual 264	java/io/File:length	()J
    //   44: invokevirtual 272	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   47: ldc_w 274
    //   50: invokevirtual 130	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   53: lload_1
    //   54: invokevirtual 272	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   57: invokevirtual 139	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   60: invokestatic 280	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   63: ldc_w 260
    //   66: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   69: iload 7
    //   71: ireturn
    //   72: new 282	java/io/FileInputStream
    //   75: astore 8
    //   77: aload 8
    //   79: aload_0
    //   80: invokespecial 284	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   83: new 286	java/util/zip/CRC32
    //   86: astore 9
    //   88: aload 9
    //   90: invokespecial 287	java/util/zip/CRC32:<init>	()V
    //   93: sipush 8192
    //   96: newarray byte
    //   98: astore 10
    //   100: aload 8
    //   102: aload 10
    //   104: invokevirtual 291	java/io/FileInputStream:read	([B)I
    //   107: istore 11
    //   109: iload 11
    //   111: ifle +35 -> 146
    //   114: aload 9
    //   116: aload 10
    //   118: iconst_0
    //   119: iload 11
    //   121: invokevirtual 295	java/util/zip/CRC32:update	([BII)V
    //   124: goto -24 -> 100
    //   127: astore_0
    //   128: aload 8
    //   130: ifnull +8 -> 138
    //   133: aload 8
    //   135: invokevirtual 296	java/io/FileInputStream:close	()V
    //   138: ldc_w 260
    //   141: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   144: aload_0
    //   145: athrow
    //   146: aload 9
    //   148: invokevirtual 299	java/util/zip/CRC32:getValue	()J
    //   151: lstore_1
    //   152: new 113	java/lang/StringBuilder
    //   155: astore 10
    //   157: aload 10
    //   159: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   162: ldc_w 266
    //   165: aload 10
    //   167: aload_0
    //   168: invokevirtual 207	java/io/File:getName	()Ljava/lang/String;
    //   171: invokevirtual 130	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   174: ldc_w 301
    //   177: invokevirtual 130	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   180: lload_1
    //   181: invokevirtual 272	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   184: ldc_w 303
    //   187: invokevirtual 130	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   190: lload 5
    //   192: invokevirtual 272	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   195: invokevirtual 139	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   198: invokestatic 305	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   201: lload_1
    //   202: lload 5
    //   204: lcmp
    //   205: ifeq +22 -> 227
    //   208: aload 8
    //   210: ifnull +8 -> 218
    //   213: aload 8
    //   215: invokevirtual 296	java/io/FileInputStream:close	()V
    //   218: ldc_w 260
    //   221: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   224: goto -155 -> 69
    //   227: aload 8
    //   229: ifnull +8 -> 237
    //   232: aload 8
    //   234: invokevirtual 296	java/io/FileInputStream:close	()V
    //   237: ldc_w 260
    //   240: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   243: iconst_0
    //   244: istore 7
    //   246: goto -177 -> 69
    //   249: astore_0
    //   250: aconst_null
    //   251: astore 8
    //   253: goto -125 -> 128
    //
    // Exception table:
    //   from	to	target	type
    //   83	100	127	finally
    //   100	109	127	finally
    //   114	124	127	finally
    //   146	201	127	finally
    //   72	83	249	finally
  }

  @SuppressLint({"InlinedApi"})
  public static boolean a(String paramString1, String paramString2)
  {
    AppMethodBeat.i(65226);
    String str1 = Build.CPU_ABI;
    if (Build.VERSION.SDK_INT >= 8);
    for (String str2 = Build.CPU_ABI2; ; str2 = null)
    {
      boolean bool = a(paramString1, paramString2, str1, str2, q.a("ro.product.cpu.upgradeabi", "armeabi"));
      AppMethodBeat.o(65226);
      return bool;
    }
  }

  // ERROR //
  private static boolean a(String paramString1, String paramString2, String paramString3, String paramString4, k.b paramb)
  {
    // Byte code:
    //   0: ldc_w 330
    //   3: invokestatic 28	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: new 332	java/util/zip/ZipFile
    //   9: astore 5
    //   11: aload 5
    //   13: aload_0
    //   14: invokespecial 333	java/util/zip/ZipFile:<init>	(Ljava/lang/String;)V
    //   17: iconst_0
    //   18: istore 6
    //   20: iconst_0
    //   21: istore 7
    //   23: aload 5
    //   25: invokevirtual 337	java/util/zip/ZipFile:entries	()Ljava/util/Enumeration;
    //   28: astore_0
    //   29: aload_0
    //   30: invokeinterface 342 1 0
    //   35: ifeq +355 -> 390
    //   38: aload_0
    //   39: invokeinterface 346 1 0
    //   44: checkcast 348	java/util/zip/ZipEntry
    //   47: astore 8
    //   49: aload 8
    //   51: invokevirtual 349	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   54: astore 9
    //   56: aload 9
    //   58: ifnull -29 -> 29
    //   61: aload 9
    //   63: ldc_w 351
    //   66: invokevirtual 355	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   69: ifne -40 -> 29
    //   72: aload 9
    //   74: ldc_w 357
    //   77: invokevirtual 361	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   80: ifne +14 -> 94
    //   83: aload 9
    //   85: ldc_w 363
    //   88: invokevirtual 361	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   91: ifeq -62 -> 29
    //   94: aload 9
    //   96: aload 9
    //   98: bipush 47
    //   100: invokevirtual 367	java/lang/String:lastIndexOf	(I)I
    //   103: invokevirtual 371	java/lang/String:substring	(I)Ljava/lang/String;
    //   106: astore 10
    //   108: iload 7
    //   110: istore 11
    //   112: iload 6
    //   114: istore 12
    //   116: aload 10
    //   118: ldc_w 373
    //   121: invokevirtual 376	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   124: ifeq +45 -> 169
    //   127: aload 9
    //   129: getstatic 30	com/tencent/smtt/utils/k:c	I
    //   132: aload_1
    //   133: iconst_0
    //   134: aload_1
    //   135: invokevirtual 379	java/lang/String:length	()I
    //   138: invokevirtual 383	java/lang/String:regionMatches	(ILjava/lang/String;II)Z
    //   141: ifeq +93 -> 234
    //   144: aload 9
    //   146: getstatic 30	com/tencent/smtt/utils/k:c	I
    //   149: aload_1
    //   150: invokevirtual 379	java/lang/String:length	()I
    //   153: iadd
    //   154: invokevirtual 387	java/lang/String:charAt	(I)C
    //   157: bipush 47
    //   159: if_icmpne +75 -> 234
    //   162: iconst_1
    //   163: istore 12
    //   165: iload 7
    //   167: istore 11
    //   169: aload 5
    //   171: aload 8
    //   173: invokevirtual 391	java/util/zip/ZipFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   176: astore 9
    //   178: aload 4
    //   180: aload 9
    //   182: aload 8
    //   184: aload 10
    //   186: iconst_1
    //   187: invokevirtual 371	java/lang/String:substring	(I)Ljava/lang/String;
    //   190: invokeinterface 394 4 0
    //   195: istore 13
    //   197: iload 13
    //   199: ifne +213 -> 412
    //   202: aload 9
    //   204: ifnull +8 -> 212
    //   207: aload 9
    //   209: invokevirtual 397	java/io/InputStream:close	()V
    //   212: aload 5
    //   214: ifnull +8 -> 222
    //   217: aload 5
    //   219: invokevirtual 398	java/util/zip/ZipFile:close	()V
    //   222: iconst_0
    //   223: istore 13
    //   225: ldc_w 330
    //   228: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   231: iload 13
    //   233: ireturn
    //   234: aload_2
    //   235: ifnull +56 -> 291
    //   238: aload 9
    //   240: getstatic 30	com/tencent/smtt/utils/k:c	I
    //   243: aload_2
    //   244: iconst_0
    //   245: aload_2
    //   246: invokevirtual 379	java/lang/String:length	()I
    //   249: invokevirtual 383	java/lang/String:regionMatches	(ILjava/lang/String;II)Z
    //   252: ifeq +39 -> 291
    //   255: aload 9
    //   257: getstatic 30	com/tencent/smtt/utils/k:c	I
    //   260: aload_2
    //   261: invokevirtual 379	java/lang/String:length	()I
    //   264: iadd
    //   265: invokevirtual 387	java/lang/String:charAt	(I)C
    //   268: bipush 47
    //   270: if_icmpne +21 -> 291
    //   273: iconst_1
    //   274: istore 11
    //   276: iconst_1
    //   277: istore 7
    //   279: iload 6
    //   281: istore 12
    //   283: iload 6
    //   285: ifeq -116 -> 169
    //   288: goto -259 -> 29
    //   291: aload_3
    //   292: ifnull -263 -> 29
    //   295: aload 9
    //   297: getstatic 30	com/tencent/smtt/utils/k:c	I
    //   300: aload_3
    //   301: iconst_0
    //   302: aload_3
    //   303: invokevirtual 379	java/lang/String:length	()I
    //   306: invokevirtual 383	java/lang/String:regionMatches	(ILjava/lang/String;II)Z
    //   309: ifeq -280 -> 29
    //   312: aload 9
    //   314: getstatic 30	com/tencent/smtt/utils/k:c	I
    //   317: aload_3
    //   318: invokevirtual 379	java/lang/String:length	()I
    //   321: iadd
    //   322: invokevirtual 387	java/lang/String:charAt	(I)C
    //   325: bipush 47
    //   327: if_icmpne -298 -> 29
    //   330: iload 6
    //   332: ifne -303 -> 29
    //   335: iload 7
    //   337: ifne -308 -> 29
    //   340: iload 7
    //   342: istore 11
    //   344: iload 6
    //   346: istore 12
    //   348: goto -179 -> 169
    //   351: astore_0
    //   352: aload 9
    //   354: ifnull +8 -> 362
    //   357: aload 9
    //   359: invokevirtual 397	java/io/InputStream:close	()V
    //   362: ldc_w 330
    //   365: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   368: aload_0
    //   369: athrow
    //   370: astore_0
    //   371: aload 5
    //   373: astore_1
    //   374: aload_1
    //   375: ifnull +7 -> 382
    //   378: aload_1
    //   379: invokevirtual 398	java/util/zip/ZipFile:close	()V
    //   382: ldc_w 330
    //   385: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   388: aload_0
    //   389: athrow
    //   390: aload 5
    //   392: ifnull +8 -> 400
    //   395: aload 5
    //   397: invokevirtual 398	java/util/zip/ZipFile:close	()V
    //   400: iconst_1
    //   401: istore 13
    //   403: ldc_w 330
    //   406: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   409: goto -178 -> 231
    //   412: iload 11
    //   414: istore 7
    //   416: iload 12
    //   418: istore 6
    //   420: aload 9
    //   422: ifnull -393 -> 29
    //   425: aload 9
    //   427: invokevirtual 397	java/io/InputStream:close	()V
    //   430: iload 11
    //   432: istore 7
    //   434: iload 12
    //   436: istore 6
    //   438: goto -409 -> 29
    //   441: astore_0
    //   442: aconst_null
    //   443: astore_1
    //   444: goto -70 -> 374
    //
    // Exception table:
    //   from	to	target	type
    //   178	197	351	finally
    //   23	29	370	finally
    //   29	56	370	finally
    //   61	94	370	finally
    //   94	108	370	finally
    //   116	162	370	finally
    //   169	178	370	finally
    //   207	212	370	finally
    //   238	273	370	finally
    //   295	330	370	finally
    //   357	362	370	finally
    //   362	370	370	finally
    //   425	430	370	finally
    //   6	17	441	finally
  }

  private static boolean a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    AppMethodBeat.i(65227);
    boolean bool = a(paramString1, paramString3, paramString4, paramString5, new l(paramString2));
    AppMethodBeat.o(65227);
    return bool;
  }

  public static FileOutputStream b(Context paramContext, boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(65245);
    paramString = a(paramContext, paramBoolean, paramString);
    if (paramString != null);
    while (true)
    {
      try
      {
        paramContext = new java/io/FileOutputStream;
        paramContext.<init>(paramString);
        AppMethodBeat.o(65245);
        return paramContext;
      }
      catch (FileNotFoundException paramContext)
      {
      }
      paramContext = null;
      AppMethodBeat.o(65245);
    }
  }

  public static void b(File paramFile)
  {
    AppMethodBeat.i(65236);
    a(paramFile, false);
    AppMethodBeat.o(65236);
  }

  public static boolean b(Context paramContext)
  {
    AppMethodBeat.i(65241);
    long l = y.a();
    if (l >= TbsDownloadConfig.getInstance(paramContext).getDownloadMinFreeSpace());
    for (boolean bool = true; ; bool = false)
    {
      if (!bool)
        TbsLog.e("TbsDownload", "[TbsApkDwonloader.hasEnoughFreeSpace] freeSpace too small,  freeSpace = ".concat(String.valueOf(l)));
      AppMethodBeat.o(65241);
      return bool;
    }
  }

  public static boolean b(File paramFile1, File paramFile2)
  {
    AppMethodBeat.i(65231);
    boolean bool = a(paramFile1, paramFile2, null);
    AppMethodBeat.o(65231);
    return bool;
  }

  // ERROR //
  private static boolean b(File paramFile1, File paramFile2, FileFilter paramFileFilter, k.a parama)
  {
    // Byte code:
    //   0: ldc_w 440
    //   3: invokestatic 28	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: ifnull +7 -> 14
    //   10: aload_1
    //   11: ifnonnull +15 -> 26
    //   14: ldc_w 440
    //   17: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   20: iconst_0
    //   21: istore 4
    //   23: iload 4
    //   25: ireturn
    //   26: aload_2
    //   27: ifnull +25 -> 52
    //   30: aload_2
    //   31: aload_0
    //   32: invokeinterface 445 2 0
    //   37: ifne +15 -> 52
    //   40: ldc_w 440
    //   43: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   46: iconst_0
    //   47: istore 4
    //   49: goto -26 -> 23
    //   52: aload_0
    //   53: invokevirtual 63	java/io/File:exists	()Z
    //   56: ifeq +14 -> 70
    //   59: aload_0
    //   60: invokevirtual 193	java/io/File:isFile	()Z
    //   63: istore 4
    //   65: iload 4
    //   67: ifne +39 -> 106
    //   70: iconst_0
    //   71: ifeq +11 -> 82
    //   74: new 447	java/lang/NullPointerException
    //   77: dup
    //   78: invokespecial 448	java/lang/NullPointerException:<init>	()V
    //   81: athrow
    //   82: iconst_0
    //   83: ifeq +11 -> 94
    //   86: new 447	java/lang/NullPointerException
    //   89: dup
    //   90: invokespecial 448	java/lang/NullPointerException:<init>	()V
    //   93: athrow
    //   94: ldc_w 440
    //   97: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   100: iconst_0
    //   101: istore 4
    //   103: goto -80 -> 23
    //   106: aload_1
    //   107: invokevirtual 63	java/io/File:exists	()Z
    //   110: ifeq +62 -> 172
    //   113: aload_3
    //   114: ifnull +54 -> 168
    //   117: aload_3
    //   118: aload_0
    //   119: aload_1
    //   120: invokeinterface 450 3 0
    //   125: istore 4
    //   127: iload 4
    //   129: ifeq +39 -> 168
    //   132: iconst_0
    //   133: ifeq +11 -> 144
    //   136: new 447	java/lang/NullPointerException
    //   139: dup
    //   140: invokespecial 448	java/lang/NullPointerException:<init>	()V
    //   143: athrow
    //   144: iconst_0
    //   145: ifeq +11 -> 156
    //   148: new 447	java/lang/NullPointerException
    //   151: dup
    //   152: invokespecial 448	java/lang/NullPointerException:<init>	()V
    //   155: athrow
    //   156: ldc_w 440
    //   159: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   162: iconst_1
    //   163: istore 4
    //   165: goto -142 -> 23
    //   168: aload_1
    //   169: invokestatic 233	com/tencent/smtt/utils/k:b	(Ljava/io/File;)V
    //   172: aload_1
    //   173: invokevirtual 453	java/io/File:getParentFile	()Ljava/io/File;
    //   176: astore_2
    //   177: aload_2
    //   178: invokevirtual 193	java/io/File:isFile	()Z
    //   181: ifeq +7 -> 188
    //   184: aload_2
    //   185: invokestatic 233	com/tencent/smtt/utils/k:b	(Ljava/io/File;)V
    //   188: aload_2
    //   189: invokevirtual 63	java/io/File:exists	()Z
    //   192: ifne +50 -> 242
    //   195: aload_2
    //   196: invokevirtual 66	java/io/File:mkdirs	()Z
    //   199: istore 4
    //   201: iload 4
    //   203: ifne +39 -> 242
    //   206: iconst_0
    //   207: ifeq +11 -> 218
    //   210: new 447	java/lang/NullPointerException
    //   213: dup
    //   214: invokespecial 448	java/lang/NullPointerException:<init>	()V
    //   217: athrow
    //   218: iconst_0
    //   219: ifeq +11 -> 230
    //   222: new 447	java/lang/NullPointerException
    //   225: dup
    //   226: invokespecial 448	java/lang/NullPointerException:<init>	()V
    //   229: athrow
    //   230: ldc_w 440
    //   233: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   236: iconst_0
    //   237: istore 4
    //   239: goto -216 -> 23
    //   242: new 282	java/io/FileInputStream
    //   245: astore_2
    //   246: aload_2
    //   247: aload_0
    //   248: invokespecial 284	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   251: aload_2
    //   252: invokevirtual 454	java/io/FileInputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   255: astore_0
    //   256: new 162	java/io/FileOutputStream
    //   259: astore_2
    //   260: aload_2
    //   261: aload_1
    //   262: invokespecial 411	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   265: aload_2
    //   266: invokevirtual 166	java/io/FileOutputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   269: astore_3
    //   270: aload_0
    //   271: invokevirtual 457	java/nio/channels/FileChannel:size	()J
    //   274: lstore 5
    //   276: aload_3
    //   277: aload_0
    //   278: lconst_0
    //   279: lload 5
    //   281: invokevirtual 461	java/nio/channels/FileChannel:transferFrom	(Ljava/nio/channels/ReadableByteChannel;JJ)J
    //   284: lload 5
    //   286: lcmp
    //   287: ifeq +64 -> 351
    //   290: aload_1
    //   291: invokestatic 233	com/tencent/smtt/utils/k:b	(Ljava/io/File;)V
    //   294: aload_0
    //   295: ifnull +7 -> 302
    //   298: aload_0
    //   299: invokevirtual 462	java/nio/channels/FileChannel:close	()V
    //   302: aload_3
    //   303: ifnull +7 -> 310
    //   306: aload_3
    //   307: invokevirtual 462	java/nio/channels/FileChannel:close	()V
    //   310: ldc_w 440
    //   313: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   316: iconst_0
    //   317: istore 4
    //   319: goto -296 -> 23
    //   322: astore_0
    //   323: aconst_null
    //   324: astore_1
    //   325: aconst_null
    //   326: astore_2
    //   327: aload_2
    //   328: ifnull +7 -> 335
    //   331: aload_2
    //   332: invokevirtual 462	java/nio/channels/FileChannel:close	()V
    //   335: aload_1
    //   336: ifnull +7 -> 343
    //   339: aload_1
    //   340: invokevirtual 462	java/nio/channels/FileChannel:close	()V
    //   343: ldc_w 440
    //   346: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   349: aload_0
    //   350: athrow
    //   351: aload_0
    //   352: ifnull +7 -> 359
    //   355: aload_0
    //   356: invokevirtual 462	java/nio/channels/FileChannel:close	()V
    //   359: aload_3
    //   360: ifnull +7 -> 367
    //   363: aload_3
    //   364: invokevirtual 462	java/nio/channels/FileChannel:close	()V
    //   367: ldc_w 440
    //   370: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   373: iconst_1
    //   374: istore 4
    //   376: goto -353 -> 23
    //   379: astore_1
    //   380: aconst_null
    //   381: astore_3
    //   382: aload_0
    //   383: astore_2
    //   384: aload_1
    //   385: astore_0
    //   386: aload_3
    //   387: astore_1
    //   388: goto -61 -> 327
    //   391: astore_1
    //   392: aload_0
    //   393: astore_2
    //   394: aload_1
    //   395: astore_0
    //   396: aload_3
    //   397: astore_1
    //   398: goto -71 -> 327
    //
    // Exception table:
    //   from	to	target	type
    //   52	65	322	finally
    //   106	113	322	finally
    //   117	127	322	finally
    //   168	172	322	finally
    //   172	188	322	finally
    //   188	201	322	finally
    //   242	256	322	finally
    //   256	270	379	finally
    //   270	294	391	finally
  }

  // ERROR //
  @SuppressLint({"NewApi"})
  private static boolean b(java.io.InputStream paramInputStream, java.util.zip.ZipEntry paramZipEntry, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 4
    //   3: ldc_w 463
    //   6: invokestatic 28	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: new 56	java/io/File
    //   12: dup
    //   13: aload_2
    //   14: invokespecial 59	java/io/File:<init>	(Ljava/lang/String;)V
    //   17: invokestatic 465	com/tencent/smtt/utils/k:a	(Ljava/io/File;)Z
    //   20: pop
    //   21: new 113	java/lang/StringBuilder
    //   24: dup
    //   25: invokespecial 114	java/lang/StringBuilder:<init>	()V
    //   28: aload_2
    //   29: invokevirtual 130	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   32: getstatic 127	java/io/File:separator	Ljava/lang/String;
    //   35: invokevirtual 130	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   38: aload_3
    //   39: invokevirtual 130	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   42: invokevirtual 139	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   45: astore 5
    //   47: new 56	java/io/File
    //   50: dup
    //   51: aload 5
    //   53: invokespecial 59	java/io/File:<init>	(Ljava/lang/String;)V
    //   56: astore_3
    //   57: new 162	java/io/FileOutputStream
    //   60: astore_2
    //   61: aload_2
    //   62: aload_3
    //   63: invokespecial 411	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   66: sipush 8192
    //   69: newarray byte
    //   71: astore 6
    //   73: aload_0
    //   74: aload 6
    //   76: invokevirtual 466	java/io/InputStream:read	([B)I
    //   79: istore 7
    //   81: iload 7
    //   83: ifle +70 -> 153
    //   86: aload_2
    //   87: aload 6
    //   89: iconst_0
    //   90: iload 7
    //   92: invokevirtual 469	java/io/FileOutputStream:write	([BII)V
    //   95: goto -22 -> 73
    //   98: astore_1
    //   99: aload_2
    //   100: astore_0
    //   101: aload_3
    //   102: invokestatic 233	com/tencent/smtt/utils/k:b	(Ljava/io/File;)V
    //   105: new 48	java/io/IOException
    //   108: astore_2
    //   109: aload_2
    //   110: ldc_w 471
    //   113: aload_3
    //   114: invokestatic 474	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   117: invokevirtual 438	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   120: aload_1
    //   121: invokespecial 477	java/io/IOException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   124: ldc_w 463
    //   127: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   130: aload_2
    //   131: athrow
    //   132: astore_2
    //   133: aload_0
    //   134: astore_1
    //   135: aload_2
    //   136: astore_0
    //   137: aload_1
    //   138: ifnull +7 -> 145
    //   141: aload_1
    //   142: invokevirtual 212	java/io/FileOutputStream:close	()V
    //   145: ldc_w 463
    //   148: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   151: aload_0
    //   152: athrow
    //   153: aload_2
    //   154: ifnull +7 -> 161
    //   157: aload_2
    //   158: invokevirtual 212	java/io/FileOutputStream:close	()V
    //   161: aload 5
    //   163: aload_1
    //   164: invokevirtual 480	java/util/zip/ZipEntry:getSize	()J
    //   167: aload_1
    //   168: invokevirtual 483	java/util/zip/ZipEntry:getTime	()J
    //   171: aload_1
    //   172: invokevirtual 486	java/util/zip/ZipEntry:getCrc	()J
    //   175: invokestatic 488	com/tencent/smtt/utils/k:a	(Ljava/lang/String;JJJ)Z
    //   178: ifeq +29 -> 207
    //   181: ldc_w 266
    //   184: ldc_w 490
    //   187: aload 5
    //   189: invokestatic 474	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   192: invokevirtual 438	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   195: invokestatic 280	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   198: ldc_w 463
    //   201: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   204: iload 4
    //   206: ireturn
    //   207: aload_3
    //   208: aload_1
    //   209: invokevirtual 483	java/util/zip/ZipEntry:getTime	()J
    //   212: invokevirtual 494	java/io/File:setLastModified	(J)Z
    //   215: ifne +19 -> 234
    //   218: ldc_w 266
    //   221: ldc_w 496
    //   224: aload_3
    //   225: invokestatic 474	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   228: invokevirtual 438	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   231: invokestatic 280	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   234: iconst_1
    //   235: istore 4
    //   237: ldc_w 463
    //   240: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   243: goto -39 -> 204
    //   246: astore_0
    //   247: aconst_null
    //   248: astore_1
    //   249: goto -112 -> 137
    //   252: astore_0
    //   253: aload_2
    //   254: astore_1
    //   255: goto -118 -> 137
    //   258: astore_1
    //   259: aconst_null
    //   260: astore_0
    //   261: goto -160 -> 101
    //
    // Exception table:
    //   from	to	target	type
    //   66	73	98	java/io/IOException
    //   73	81	98	java/io/IOException
    //   86	95	98	java/io/IOException
    //   101	132	132	finally
    //   57	66	246	finally
    //   66	73	252	finally
    //   73	81	252	finally
    //   86	95	252	finally
    //   57	66	258	java/io/IOException
  }

  public static String c(Context paramContext)
  {
    AppMethodBeat.i(65242);
    paramContext = Environment.getExternalStorageDirectory() + File.separator + "tbs" + File.separator + "file_locks";
    AppMethodBeat.o(65242);
    return paramContext;
  }

  public static boolean c(File paramFile)
  {
    AppMethodBeat.i(65239);
    boolean bool;
    if ((paramFile != null) && (paramFile.exists()) && (paramFile.isFile()) && (paramFile.length() > 0L))
    {
      bool = true;
      AppMethodBeat.o(65239);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(65239);
    }
  }

  public static FileOutputStream d(File paramFile)
  {
    AppMethodBeat.i(65240);
    if (paramFile.exists())
    {
      if (paramFile.isDirectory())
      {
        paramFile = new IOException("File '" + paramFile + "' exists but is a directory");
        AppMethodBeat.o(65240);
        throw paramFile;
      }
      if (!paramFile.canWrite())
      {
        paramFile = new IOException("File '" + paramFile + "' cannot be written to");
        AppMethodBeat.o(65240);
        throw paramFile;
      }
    }
    else
    {
      File localFile = paramFile.getParentFile();
      if ((localFile != null) && (!localFile.exists()) && (!localFile.mkdirs()))
      {
        paramFile = new IOException("File '" + paramFile + "' could not be created");
        AppMethodBeat.o(65240);
        throw paramFile;
      }
    }
    paramFile = new FileOutputStream(paramFile);
    AppMethodBeat.o(65240);
    return paramFile;
  }

  static String d(Context paramContext)
  {
    AppMethodBeat.i(65243);
    paramContext = new File(paramContext.getDir("tbs", 0), "core_private");
    if ((!paramContext.isDirectory()) && (!paramContext.mkdir()))
    {
      paramContext = null;
      AppMethodBeat.o(65243);
    }
    while (true)
    {
      return paramContext;
      paramContext = paramContext.getAbsolutePath();
      AppMethodBeat.o(65243);
    }
  }

  public static FileLock e(Context paramContext)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(65248);
    TbsLog.i("FileHelper", "getTbsCoreLoadFileLock #1");
    while (true)
    {
      File localFile;
      try
      {
        bool = TbsDownloadConfig.getInstance().getTbsCoreLoadRenameFileLockEnable();
        if (!bool)
        {
          localObject1 = b(paramContext, true, "tbs_rename_lock");
          if (localObject1 == null)
          {
            TbsLog.i("FileHelper", "init -- failed to get rename fileLock#1!");
            paramContext = (Context)localObject2;
            TbsLog.i("FileHelper", "getTbsCoreLoadFileLock #2 renameFileLock is ".concat(String.valueOf(paramContext)));
            AppMethodBeat.o(65248);
            return paramContext;
          }
        }
      }
      catch (Throwable localThrowable2)
      {
        boolean bool = true;
        continue;
        paramContext = a(paramContext, (FileOutputStream)localObject1);
        if (paramContext == null)
        {
          TbsLog.i("FileHelper", "init -- failed to get rename fileLock#2!");
          continue;
        }
        TbsLog.i("FileHelper", "init -- get rename fileLock success!");
        continue;
        TbsLog.i("FileHelper", "getTbsCoreLoadFileLock #3");
        localFile = a(paramContext, true, "tbs_rename_lock");
      }
      try
      {
        localObject2 = new java/io/RandomAccessFile;
        ((RandomAccessFile)localObject2).<init>(localFile.getAbsolutePath(), "r");
        d = (RandomAccessFile)localObject2;
        localObject2 = ((RandomAccessFile)localObject2).getChannel().tryLock(0L, 9223372036854775807L, true);
        localObject1 = localObject2;
        label173: localObject2 = localObject1;
        if (localObject1 == null)
          localObject2 = g(paramContext);
        if (localObject2 == null)
          TbsLog.i("FileHelper", "getTbsCoreLoadFileLock -- failed: ".concat(String.valueOf("tbs_rename_lock")));
        while (true)
        {
          AppMethodBeat.o(65248);
          paramContext = (Context)localObject2;
          break;
          TbsLog.i("FileHelper", "getTbsCoreLoadFileLock -- success: ".concat(String.valueOf("tbs_rename_lock")));
        }
      }
      catch (Throwable localThrowable1)
      {
        break label173;
      }
    }
  }

  public static FileLock f(Context paramContext)
  {
    AppMethodBeat.i(65250);
    Object localObject = null;
    File localFile = a(paramContext, true, "tbs_rename_lock");
    try
    {
      paramContext = new java/io/RandomAccessFile;
      paramContext.<init>(localFile.getAbsolutePath(), "rw");
      d = paramContext;
      paramContext = paramContext.getChannel().tryLock(0L, 9223372036854775807L, false);
      if (paramContext == null)
        TbsLog.i("FileHelper", "getTbsCoreRenameFileLock -- failed: ".concat(String.valueOf("tbs_rename_lock")));
      while (true)
      {
        AppMethodBeat.o(65250);
        return paramContext;
        TbsLog.i("FileHelper", "getTbsCoreRenameFileLock -- success: ".concat(String.valueOf("tbs_rename_lock")));
      }
    }
    catch (Throwable paramContext)
    {
      while (true)
        paramContext = localObject;
    }
  }

  private static FileLock g(Context paramContext)
  {
    AppMethodBeat.i(65249);
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    Object localObject4 = localObject2;
    try
    {
      localTbsLogInfo = TbsLogReport.getInstance(paramContext).tbsLogInfo();
      localObject4 = localObject2;
      localTbsLogInfo.setErrorCode(803);
      localObject4 = localObject2;
      localFile = a(paramContext, true, "tbs_rename_lock");
      localObject4 = localObject2;
      bool = TbsDownloadConfig.getInstance(paramContext).getTbsCoreLoadRenameFileLockWaitEnable();
      if (bool)
      {
        i = 0;
        localObject1 = localObject3;
        if ((i >= 20) || (localObject1 != null));
      }
    }
    catch (Exception paramContext)
    {
      try
      {
        TbsLogReport.TbsLogInfo localTbsLogInfo;
        int i;
        while (true)
        {
          File localFile;
          Thread.sleep(100L);
          label87: localObject4 = localObject1;
          localObject3 = new java/io/RandomAccessFile;
          localObject4 = localObject1;
          ((RandomAccessFile)localObject3).<init>(localFile.getAbsolutePath(), "r");
          localObject4 = localObject1;
          d = (RandomAccessFile)localObject3;
          localObject4 = localObject1;
          localObject3 = ((RandomAccessFile)localObject3).getChannel().tryLock(0L, 9223372036854775807L, true);
          localObject1 = localObject3;
          label134: i++;
        }
        if (localObject1 != null)
        {
          localObject4 = localObject1;
          localTbsLogInfo.setErrorCode(802);
          localObject4 = localObject1;
          TbsLogReport.getInstance(paramContext).eventReport(TbsLogReport.EventType.TYPE_SDK_REPORT_INFO, localTbsLogInfo);
          localObject4 = localObject1;
          paramContext = new java/lang/StringBuilder;
          localObject4 = localObject1;
          paramContext.<init>("getTbsCoreLoadFileLock,retry num=");
          localObject4 = localObject1;
          paramContext = paramContext.append(i).append("success=");
          if (localObject1 != null)
            break label257;
        }
        label257: for (boolean bool = true; ; bool = false)
        {
          localObject4 = localObject1;
          TbsLog.i("FileHelper", bool);
          while (true)
          {
            AppMethodBeat.o(65249);
            return localObject1;
            localObject4 = localObject1;
            localTbsLogInfo.setErrorCode(801);
            break;
            paramContext = paramContext;
            localObject1 = localObject4;
          }
        }
      }
      catch (Exception localException)
      {
        break label87;
      }
      catch (Throwable localThrowable)
      {
        break label134;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.utils.k
 * JD-Core Version:    0.6.2
 */
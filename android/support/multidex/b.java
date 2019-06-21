package android.support.multidex;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

final class b
{
  private static Method wZ;

  static
  {
    try
    {
      wZ = SharedPreferences.Editor.class.getMethod("apply", new Class[0]);
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      while (true)
        wZ = null;
    }
  }

  private static SharedPreferences K(Context paramContext)
  {
    if (Build.VERSION.SDK_INT < 11);
    for (int i = 0; ; i = 4)
      return paramContext.getSharedPreferences("multidex.version", i);
  }

  static List<File> a(Context paramContext, ApplicationInfo paramApplicationInfo, File paramFile, boolean paramBoolean)
  {
    int i = 0;
    new StringBuilder("MultiDexExtractor.load(").append(paramApplicationInfo.sourceDir).append(", ").append(paramBoolean).append(")");
    File localFile = new File(paramApplicationInfo.sourceDir);
    long l1 = c.g(localFile);
    long l2 = l1;
    if (l1 == -1L)
      l2 = l1 - 1L;
    if (!paramBoolean)
    {
      paramApplicationInfo = K(paramContext);
      if ((paramApplicationInfo.getLong("timestamp", -1L) != e(localFile)) || (paramApplicationInfo.getLong("crc", -1L) != l2))
        i = 1;
      if (i != 0);
    }
    while (true)
    {
      try
      {
        paramApplicationInfo = a(paramContext, localFile, paramFile);
        paramContext = paramApplicationInfo;
        new StringBuilder("load found ").append(paramContext.size()).append(" secondary dex files");
        return paramContext;
      }
      catch (IOException paramApplicationInfo)
      {
      }
      paramApplicationInfo = c(localFile, paramFile);
      l1 = e(localFile);
      i = paramApplicationInfo.size();
      paramContext = K(paramContext).edit();
      paramContext.putLong("timestamp", l1);
      paramContext.putLong("crc", l2);
      paramContext.putInt("dex.number", i + 1);
      if (wZ != null);
      try
      {
        wZ.invoke(paramContext, new Object[0]);
        paramContext = paramApplicationInfo;
      }
      catch (InvocationTargetException paramFile)
      {
        paramContext.commit();
        paramContext = paramApplicationInfo;
      }
      catch (IllegalAccessException paramFile)
      {
        label255: break label255;
      }
    }
  }

  private static List<File> a(Context paramContext, File paramFile1, File paramFile2)
  {
    paramFile1 = paramFile1.getName() + ".classes";
    int i = K(paramContext).getInt("dex.number", 1);
    ArrayList localArrayList = new ArrayList(i);
    for (int j = 2; j <= i; j++)
    {
      paramContext = new File(paramFile2, paramFile1 + j + ".zip");
      if (paramContext.isFile())
      {
        localArrayList.add(paramContext);
        if (!f(paramContext))
        {
          new StringBuilder("Invalid zip file: ").append(paramContext);
          throw new IOException("Invalid ZIP file.");
        }
      }
      else
      {
        throw new IOException("Missing extracted secondary dex file '" + paramContext.getPath() + "'");
      }
    }
    return localArrayList;
  }

  // ERROR //
  private static void a(ZipFile paramZipFile, java.util.zip.ZipEntry paramZipEntry, File paramFile, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual 203	java/util/zip/ZipFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   5: astore_0
    //   6: aload_3
    //   7: ldc 166
    //   9: aload_2
    //   10: invokevirtual 207	java/io/File:getParentFile	()Ljava/io/File;
    //   13: invokestatic 211	java/io/File:createTempFile	(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;
    //   16: astore_3
    //   17: new 49	java/lang/StringBuilder
    //   20: dup
    //   21: ldc 213
    //   23: invokespecial 55	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   26: aload_3
    //   27: invokevirtual 193	java/io/File:getPath	()Ljava/lang/String;
    //   30: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   33: pop
    //   34: new 215	java/util/zip/ZipOutputStream
    //   37: astore 4
    //   39: new 217	java/io/BufferedOutputStream
    //   42: astore 5
    //   44: new 219	java/io/FileOutputStream
    //   47: astore 6
    //   49: aload 6
    //   51: aload_3
    //   52: invokespecial 222	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   55: aload 5
    //   57: aload 6
    //   59: invokespecial 225	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   62: aload 4
    //   64: aload 5
    //   66: invokespecial 226	java/util/zip/ZipOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   69: new 228	java/util/zip/ZipEntry
    //   72: astore 6
    //   74: aload 6
    //   76: ldc 230
    //   78: invokespecial 231	java/util/zip/ZipEntry:<init>	(Ljava/lang/String;)V
    //   81: aload 6
    //   83: aload_1
    //   84: invokevirtual 235	java/util/zip/ZipEntry:getTime	()J
    //   87: invokevirtual 239	java/util/zip/ZipEntry:setTime	(J)V
    //   90: aload 4
    //   92: aload 6
    //   94: invokevirtual 243	java/util/zip/ZipOutputStream:putNextEntry	(Ljava/util/zip/ZipEntry;)V
    //   97: sipush 16384
    //   100: newarray byte
    //   102: astore_1
    //   103: aload_0
    //   104: aload_1
    //   105: invokevirtual 249	java/io/InputStream:read	([B)I
    //   108: istore 7
    //   110: iload 7
    //   112: iconst_m1
    //   113: if_icmpeq +22 -> 135
    //   116: aload 4
    //   118: aload_1
    //   119: iconst_0
    //   120: iload 7
    //   122: invokevirtual 253	java/util/zip/ZipOutputStream:write	([BII)V
    //   125: aload_0
    //   126: aload_1
    //   127: invokevirtual 249	java/io/InputStream:read	([B)I
    //   130: istore 7
    //   132: goto -22 -> 110
    //   135: aload 4
    //   137: invokevirtual 256	java/util/zip/ZipOutputStream:closeEntry	()V
    //   140: aload 4
    //   142: invokevirtual 259	java/util/zip/ZipOutputStream:close	()V
    //   145: new 49	java/lang/StringBuilder
    //   148: astore_1
    //   149: aload_1
    //   150: ldc_w 261
    //   153: invokespecial 55	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   156: aload_1
    //   157: aload_2
    //   158: invokevirtual 193	java/io/File:getPath	()Ljava/lang/String;
    //   161: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   164: pop
    //   165: aload_3
    //   166: aload_2
    //   167: invokevirtual 264	java/io/File:renameTo	(Ljava/io/File;)Z
    //   170: ifne +77 -> 247
    //   173: new 43	java/io/IOException
    //   176: astore_1
    //   177: new 49	java/lang/StringBuilder
    //   180: astore 4
    //   182: aload 4
    //   184: ldc_w 266
    //   187: invokespecial 55	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   190: aload_1
    //   191: aload 4
    //   193: aload_3
    //   194: invokevirtual 269	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   197: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   200: ldc_w 271
    //   203: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   206: aload_2
    //   207: invokevirtual 269	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   210: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   213: ldc_w 273
    //   216: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   219: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   222: invokespecial 188	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   225: aload_1
    //   226: athrow
    //   227: astore_1
    //   228: aload_0
    //   229: invokestatic 277	android/support/multidex/b:closeQuietly	(Ljava/io/Closeable;)V
    //   232: aload_3
    //   233: invokevirtual 280	java/io/File:delete	()Z
    //   236: pop
    //   237: aload_1
    //   238: athrow
    //   239: astore_1
    //   240: aload 4
    //   242: invokevirtual 259	java/util/zip/ZipOutputStream:close	()V
    //   245: aload_1
    //   246: athrow
    //   247: aload_0
    //   248: invokestatic 277	android/support/multidex/b:closeQuietly	(Ljava/io/Closeable;)V
    //   251: aload_3
    //   252: invokevirtual 280	java/io/File:delete	()Z
    //   255: pop
    //   256: return
    //
    // Exception table:
    //   from	to	target	type
    //   34	69	227	finally
    //   140	227	227	finally
    //   240	247	227	finally
    //   69	110	239	finally
    //   116	132	239	finally
    //   135	140	239	finally
  }

  private static void b(File paramFile, String paramString)
  {
    paramFile.mkdirs();
    if (!paramFile.isDirectory())
      throw new IOException("Failed to create dex directory " + paramFile.getPath());
    paramString = paramFile.listFiles(new b.1(paramString));
    if (paramString == null)
    {
      new StringBuilder("Failed to list secondary dex dir content (").append(paramFile.getPath()).append(").");
      return;
    }
    int i = paramString.length;
    int j = 0;
    label87: if (j < i)
    {
      paramFile = paramString[j];
      new StringBuilder("Trying to delete old file ").append(paramFile.getPath()).append(" of size ").append(paramFile.length());
      if (paramFile.delete())
        break label158;
      new StringBuilder("Failed to delete old file ").append(paramFile.getPath());
    }
    while (true)
    {
      j++;
      break label87;
      break;
      label158: new StringBuilder("Deleted old file ").append(paramFile.getPath());
    }
  }

  private static List<File> c(File paramFile1, File paramFile2)
  {
    String str = paramFile1.getName() + ".classes";
    b(paramFile2, str);
    ArrayList localArrayList = new ArrayList();
    ZipFile localZipFile = new ZipFile(paramFile1);
    try
    {
      paramFile1 = localZipFile.getEntry("classes2.dex");
      i = 2;
      if (paramFile1 != null)
      {
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        localObject = str + i + ".zip";
        File localFile = new java/io/File;
        localFile.<init>(paramFile2, (String)localObject);
        localArrayList.add(localFile);
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>("Extraction is needed for file ");
        ((StringBuilder)localObject).append(localFile);
        boolean bool = false;
        int j = 0;
        if ((j < 3) && (!bool))
        {
          j++;
          a(localZipFile, paramFile1, localFile, str);
          bool = f(localFile);
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("Extraction ");
          if (bool);
          for (localObject = "success"; ; localObject = "failed")
          {
            localStringBuilder.append((String)localObject).append(" - length ").append(localFile.getAbsolutePath()).append(": ").append(localFile.length());
            if (bool)
              break label405;
            localFile.delete();
            if (!localFile.exists())
              break label405;
            localObject = new java/lang/StringBuilder;
            ((StringBuilder)localObject).<init>("Failed to delete corrupted secondary dex '");
            ((StringBuilder)localObject).append(localFile.getPath()).append("'");
            break;
          }
        }
        if (!bool)
        {
          paramFile2 = new java/io/IOException;
          paramFile1 = new java/lang/StringBuilder;
          paramFile1.<init>("Could not create zip file ");
          paramFile2.<init>(localFile.getAbsolutePath() + " for secondary dex (" + i + ")");
          throw paramFile2;
        }
      }
    }
    finally
    {
      label405: 
      while (true)
        try
        {
          int i;
          localZipFile.close();
          throw paramFile1;
          i++;
          paramFile1 = new java/lang/StringBuilder;
          paramFile1.<init>("classes");
          paramFile1 = localZipFile.getEntry(i + ".dex");
          continue;
          try
          {
            localZipFile.close();
            return localArrayList;
          }
          catch (IOException paramFile1)
          {
          }
        }
        catch (IOException paramFile2)
        {
        }
    }
  }

  private static void closeQuietly(Closeable paramCloseable)
  {
    try
    {
      paramCloseable.close();
      label6: return;
    }
    catch (IOException paramCloseable)
    {
      break label6;
    }
  }

  private static long e(File paramFile)
  {
    long l1 = paramFile.lastModified();
    long l2 = l1;
    if (l1 == -1L)
      l2 = l1 - 1L;
    return l2;
  }

  static boolean f(File paramFile)
  {
    try
    {
      ZipFile localZipFile = new java/util/zip/ZipFile;
      localZipFile.<init>(paramFile);
      while (true)
      {
        try
        {
          localZipFile.close();
          bool = true;
          return bool;
        }
        catch (IOException localIOException1)
        {
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("Failed to close zip file: ");
          localStringBuilder.append(paramFile.getAbsolutePath());
        }
        boolean bool = false;
      }
    }
    catch (ZipException localZipException)
    {
      while (true)
        new StringBuilder("File ").append(paramFile.getAbsolutePath()).append(" is not a valid zip file.");
    }
    catch (IOException localIOException2)
    {
      while (true)
        new StringBuilder("Got an IOException trying to open zip file: ").append(paramFile.getAbsolutePath());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     android.support.multidex.b
 * JD-Core Version:    0.6.2
 */
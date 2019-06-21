package com.tencent.mm.a;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.zip.ZipOutputStream;

public final class q
{
  // ERROR //
  private static void a(File paramFile, ZipOutputStream paramZipOutputStream, String paramString)
  {
    // Byte code:
    //   0: new 10	java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial 14	java/lang/StringBuilder:<init>	()V
    //   7: aload_2
    //   8: invokevirtual 18	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   11: astore_3
    //   12: aload_2
    //   13: invokevirtual 24	java/lang/String:trim	()Ljava/lang/String;
    //   16: invokevirtual 28	java/lang/String:length	()I
    //   19: ifne +63 -> 82
    //   22: ldc 30
    //   24: astore_2
    //   25: aload_3
    //   26: aload_2
    //   27: invokevirtual 18	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   30: aload_0
    //   31: invokevirtual 35	java/io/File:getName	()Ljava/lang/String;
    //   34: invokevirtual 18	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   37: invokevirtual 38	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   40: astore_3
    //   41: aload_0
    //   42: invokevirtual 42	java/io/File:isDirectory	()Z
    //   45: ifeq +44 -> 89
    //   48: aload_0
    //   49: invokevirtual 46	java/io/File:listFiles	()[Ljava/io/File;
    //   52: astore_0
    //   53: aload_0
    //   54: arraylength
    //   55: istore 4
    //   57: iconst_0
    //   58: istore 5
    //   60: iload 5
    //   62: iload 4
    //   64: if_icmpge +138 -> 202
    //   67: aload_0
    //   68: iload 5
    //   70: aaload
    //   71: aload_1
    //   72: aload_3
    //   73: invokestatic 48	com/tencent/mm/a/q:a	(Ljava/io/File;Ljava/util/zip/ZipOutputStream;Ljava/lang/String;)V
    //   76: iinc 5 1
    //   79: goto -19 -> 60
    //   82: getstatic 52	java/io/File:separator	Ljava/lang/String;
    //   85: astore_2
    //   86: goto -61 -> 25
    //   89: ldc 53
    //   91: newarray byte
    //   93: astore 6
    //   95: new 55	java/io/BufferedInputStream
    //   98: astore_2
    //   99: new 57	java/io/FileInputStream
    //   102: astore 7
    //   104: aload 7
    //   106: aload_0
    //   107: invokespecial 60	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   110: aload_2
    //   111: aload 7
    //   113: ldc 53
    //   115: invokespecial 63	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;I)V
    //   118: aload_2
    //   119: astore_0
    //   120: new 65	java/util/zip/ZipEntry
    //   123: astore 7
    //   125: aload_2
    //   126: astore_0
    //   127: aload 7
    //   129: aload_3
    //   130: invokespecial 68	java/util/zip/ZipEntry:<init>	(Ljava/lang/String;)V
    //   133: aload_2
    //   134: astore_0
    //   135: aload_1
    //   136: aload 7
    //   138: invokevirtual 74	java/util/zip/ZipOutputStream:putNextEntry	(Ljava/util/zip/ZipEntry;)V
    //   141: aload_2
    //   142: astore_0
    //   143: aload_2
    //   144: aload 6
    //   146: invokevirtual 78	java/io/BufferedInputStream:read	([B)I
    //   149: istore 5
    //   151: iload 5
    //   153: iconst_m1
    //   154: if_icmpeq +49 -> 203
    //   157: aload_2
    //   158: astore_0
    //   159: aload_1
    //   160: aload 6
    //   162: iconst_0
    //   163: iload 5
    //   165: invokevirtual 82	java/util/zip/ZipOutputStream:write	([BII)V
    //   168: goto -27 -> 141
    //   171: astore_3
    //   172: aload_2
    //   173: astore_0
    //   174: ldc 84
    //   176: aload_3
    //   177: ldc 30
    //   179: iconst_0
    //   180: anewarray 4	java/lang/Object
    //   183: invokestatic 90	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   186: aload_2
    //   187: ifnull +7 -> 194
    //   190: aload_2
    //   191: invokevirtual 93	java/io/BufferedInputStream:close	()V
    //   194: aload_1
    //   195: invokevirtual 96	java/util/zip/ZipOutputStream:flush	()V
    //   198: aload_1
    //   199: invokevirtual 99	java/util/zip/ZipOutputStream:closeEntry	()V
    //   202: return
    //   203: aload_2
    //   204: invokevirtual 93	java/io/BufferedInputStream:close	()V
    //   207: goto -13 -> 194
    //   210: astore_0
    //   211: aconst_null
    //   212: astore_2
    //   213: aload_0
    //   214: astore_1
    //   215: aload_2
    //   216: ifnull +7 -> 223
    //   219: aload_2
    //   220: invokevirtual 93	java/io/BufferedInputStream:close	()V
    //   223: aload_1
    //   224: athrow
    //   225: astore_1
    //   226: aload_0
    //   227: astore_2
    //   228: goto -13 -> 215
    //   231: astore_3
    //   232: aconst_null
    //   233: astore_2
    //   234: goto -62 -> 172
    //
    // Exception table:
    //   from	to	target	type
    //   120	125	171	java/lang/Exception
    //   127	133	171	java/lang/Exception
    //   135	141	171	java/lang/Exception
    //   143	151	171	java/lang/Exception
    //   159	168	171	java/lang/Exception
    //   95	118	210	finally
    //   120	125	225	finally
    //   127	133	225	finally
    //   135	141	225	finally
    //   143	151	225	finally
    //   159	168	225	finally
    //   174	186	225	finally
    //   95	118	231	java/lang/Exception
  }

  public static void a(Collection<File> paramCollection, File paramFile)
  {
    paramFile = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(paramFile), 131072));
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext())
    {
      paramCollection = (File)localIterator.next();
      if (paramCollection.exists())
        a(paramCollection, paramFile, "");
    }
    paramFile.close();
  }

  public static String b(File paramFile, boolean paramBoolean, String paramString)
  {
    int i = 0;
    Object localObject;
    if (paramString != null)
    {
      localObject = new File(paramString).getParentFile();
      if ((localObject != null) && (!((File)localObject).exists()))
        ((File)localObject).mkdirs();
    }
    ArrayList localArrayList = new ArrayList();
    if (paramFile.isDirectory())
    {
      localObject = paramFile.listFiles();
      if (localObject == null)
        paramFile = null;
    }
    while (true)
    {
      return paramFile;
      for (int j = 0; j < localObject.length; j++)
        localArrayList.add(localObject[j]);
      localObject = paramString;
      if (paramString == null)
        localObject = paramFile.getAbsolutePath() + File.separator + paramFile.getName() + ".zip";
      while (true)
      {
        paramFile = new File((String)localObject);
        if (paramFile.exists())
          paramFile.delete();
        try
        {
          a(localArrayList, paramFile);
          if (!paramBoolean)
            break label272;
          for (j = i; j < localArrayList.size(); j++)
            ((File)localArrayList.get(j)).delete();
          localArrayList.add(paramFile);
          localObject = paramString;
          if (paramString == null)
            localObject = paramFile.getAbsoluteFile().getParentFile().getAbsolutePath() + File.separator + paramFile.getName() + ".zip";
        }
        catch (Exception paramFile)
        {
          paramFile = null;
        }
      }
      continue;
      label272: paramFile = paramFile.getAbsolutePath();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.a.q
 * JD-Core Version:    0.6.2
 */
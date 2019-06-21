package com.tencent.mm.vfs;

import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.util.List;

public final class e
{
  public static OutputStream L(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(54630);
    if ((paramString == null) || (paramString.isEmpty()))
    {
      paramString = new FileNotFoundException("path is empty");
      AppMethodBeat.o(54630);
      throw paramString;
    }
    paramString = a(j.parseUri(paramString), null, paramBoolean);
    AppMethodBeat.o(54630);
    return paramString;
  }

  public static boolean N(String paramString, boolean paramBoolean)
  {
    boolean bool = false;
    AppMethodBeat.i(54655);
    if ((paramString == null) || (paramString.length() == 0))
    {
      AppMethodBeat.o(54655);
      paramBoolean = bool;
    }
    while (true)
    {
      return paramBoolean;
      paramString = j.parseUri(paramString);
      paramString = FileSystemManager.dMv().a(paramString, null);
      if (!paramString.valid())
      {
        AppMethodBeat.o(54655);
        paramBoolean = bool;
      }
      else
      {
        paramBoolean = paramString.zZs.N(paramString.path, paramBoolean);
        AppMethodBeat.o(54655);
      }
    }
  }

  public static int a(String paramString, byte[] paramArrayOfByte, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(54636);
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0) || (paramArrayOfByte.length < paramInt + 0))
    {
      paramInt = -2;
      AppMethodBeat.o(54636);
    }
    Object localObject1;
    while (true)
    {
      return paramInt;
      localObject1 = null;
      Object localObject2 = null;
      try
      {
        OutputStream localOutputStream = L(paramString, true);
        localObject2 = localOutputStream;
        localObject1 = localOutputStream;
        localOutputStream.write(paramArrayOfByte, 0, paramInt);
        if (localOutputStream != null);
        try
        {
          localOutputStream.close();
          AppMethodBeat.o(54636);
          paramInt = i;
        }
        catch (IOException localIOException2)
        {
          while (true)
          {
            com.tencent.e.a.b.c("MicroMsg.VFSFileOp", localIOException2, "");
            com.tencent.e.a.b.w("MicroMsg.VFSFileOp", "file op appendToFile close e type:%s, e msg:%s, fileName:%s, buf len:%d, bufOffset:%d, writeLen:%d", new Object[] { localIOException2.getClass().getSimpleName(), localIOException2.getMessage(), paramString, Integer.valueOf(paramArrayOfByte.length), Integer.valueOf(0), Integer.valueOf(paramInt) });
          }
        }
      }
      catch (Exception localException)
      {
        localObject1 = localIOException2;
        com.tencent.e.a.b.c("MicroMsg.VFSFileOp", localException, "");
        localObject1 = localIOException2;
        com.tencent.e.a.b.w("MicroMsg.VFSFileOp", "file op appendToFile e type:%s, e msg:%s, fileName:%s, buf len:%d, bufOffset:%d, writeLen:%d", new Object[] { localException.getClass().getSimpleName(), localException.getMessage(), paramString, Integer.valueOf(paramArrayOfByte.length), Integer.valueOf(0), Integer.valueOf(paramInt) });
        if (localIOException2 != null);
        try
        {
          localIOException2.close();
          paramInt = -1;
          AppMethodBeat.o(54636);
        }
        catch (IOException localIOException3)
        {
          while (true)
          {
            com.tencent.e.a.b.c("MicroMsg.VFSFileOp", localIOException3, "");
            com.tencent.e.a.b.w("MicroMsg.VFSFileOp", "file op appendToFile close e type:%s, e msg:%s, fileName:%s, buf len:%d, bufOffset:%d, writeLen:%d", new Object[] { localIOException3.getClass().getSimpleName(), localIOException3.getMessage(), paramString, Integer.valueOf(paramArrayOfByte.length), Integer.valueOf(0), Integer.valueOf(paramInt) });
          }
        }
      }
      finally
      {
        if (localObject1 == null);
      }
    }
    try
    {
      localObject1.close();
      AppMethodBeat.o(54636);
      throw localObject3;
    }
    catch (IOException localIOException1)
    {
      while (true)
      {
        com.tencent.e.a.b.c("MicroMsg.VFSFileOp", localIOException1, "");
        com.tencent.e.a.b.w("MicroMsg.VFSFileOp", "file op appendToFile close e type:%s, e msg:%s, fileName:%s, buf len:%d, bufOffset:%d, writeLen:%d", new Object[] { localIOException1.getClass().getSimpleName(), localIOException1.getMessage(), paramString, Integer.valueOf(paramArrayOfByte.length), Integer.valueOf(0), Integer.valueOf(paramInt) });
      }
    }
  }

  static OutputStream a(Uri paramUri, FileSystemManager.d paramd, boolean paramBoolean)
  {
    AppMethodBeat.i(54632);
    paramd = FileSystemManager.dMv().a(paramUri, paramd);
    if (!paramd.valid())
    {
      paramUri = new FileNotFoundException("Cannot resolve path or URI: ".concat(String.valueOf(paramUri)));
      AppMethodBeat.o(54632);
      throw paramUri;
    }
    try
    {
      paramUri = paramd.zZs.L(paramd.path, paramBoolean);
      AppMethodBeat.o(54632);
      return paramUri;
    }
    catch (IOException paramUri)
    {
      paramUri = (FileNotFoundException)new FileNotFoundException(paramUri.getMessage()).initCause(paramUri);
      AppMethodBeat.o(54632);
    }
    throw paramUri;
  }

  private static RandomAccessFile a(Uri paramUri, boolean paramBoolean)
  {
    AppMethodBeat.i(54634);
    FileSystemManager.d locald = FileSystemManager.dMv().a(paramUri, null);
    if (!locald.valid())
    {
      paramUri = new FileNotFoundException("Cannot resolve path or URI: ".concat(String.valueOf(paramUri)));
      AppMethodBeat.o(54634);
      throw paramUri;
    }
    paramUri = FileSystemManager.a(locald, paramBoolean);
    AppMethodBeat.o(54634);
    return paramUri;
  }

  // ERROR //
  private static boolean a(FileSystemManager.d paramd1, FileSystemManager.d paramd2)
  {
    // Byte code:
    //   0: ldc 152
    //   2: invokestatic 13	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: invokevirtual 62	com/tencent/mm/vfs/FileSystemManager$d:valid	()Z
    //   9: ifeq +10 -> 19
    //   12: aload_1
    //   13: invokevirtual 62	com/tencent/mm/vfs/FileSystemManager$d:valid	()Z
    //   16: ifne +12 -> 28
    //   19: ldc 152
    //   21: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   24: iconst_0
    //   25: istore_2
    //   26: iload_2
    //   27: ireturn
    //   28: aload_0
    //   29: getfield 66	com/tencent/mm/vfs/FileSystemManager$d:zZs	Lcom/tencent/mm/vfs/FileSystem;
    //   32: aload_0
    //   33: getfield 70	com/tencent/mm/vfs/FileSystemManager$d:path	Ljava/lang/String;
    //   36: iconst_1
    //   37: invokeinterface 156 3 0
    //   42: astore_3
    //   43: aload_3
    //   44: ifnonnull +13 -> 57
    //   47: ldc 152
    //   49: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   52: iconst_0
    //   53: istore_2
    //   54: goto -28 -> 26
    //   57: new 158	java/util/HashSet
    //   60: dup
    //   61: invokespecial 160	java/util/HashSet:<init>	()V
    //   64: astore 4
    //   66: aload_1
    //   67: getfield 66	com/tencent/mm/vfs/FileSystemManager$d:zZs	Lcom/tencent/mm/vfs/FileSystem;
    //   70: aload_1
    //   71: getfield 70	com/tencent/mm/vfs/FileSystemManager$d:path	Ljava/lang/String;
    //   74: invokeinterface 164 2 0
    //   79: pop
    //   80: aload 4
    //   82: aload_1
    //   83: getfield 70	com/tencent/mm/vfs/FileSystemManager$d:path	Ljava/lang/String;
    //   86: invokevirtual 168	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   89: pop
    //   90: aload_3
    //   91: invokeinterface 174 1 0
    //   96: astore 5
    //   98: aload 5
    //   100: invokeinterface 179 1 0
    //   105: ifeq +332 -> 437
    //   108: aload 5
    //   110: invokeinterface 183 1 0
    //   115: checkcast 185	com/tencent/mm/vfs/FileSystem$a
    //   118: astore 6
    //   120: aload_0
    //   121: getfield 70	com/tencent/mm/vfs/FileSystemManager$d:path	Ljava/lang/String;
    //   124: invokevirtual 48	java/lang/String:length	()I
    //   127: istore 7
    //   129: iload 7
    //   131: istore 8
    //   133: aload_0
    //   134: getfield 70	com/tencent/mm/vfs/FileSystemManager$d:path	Ljava/lang/String;
    //   137: ldc 187
    //   139: invokevirtual 190	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   142: ifeq +9 -> 151
    //   145: iload 7
    //   147: iconst_1
    //   148: isub
    //   149: istore 8
    //   151: new 192	java/lang/StringBuilder
    //   154: dup
    //   155: invokespecial 193	java/lang/StringBuilder:<init>	()V
    //   158: aload_1
    //   159: getfield 70	com/tencent/mm/vfs/FileSystemManager$d:path	Ljava/lang/String;
    //   162: invokevirtual 197	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   165: aload 6
    //   167: getfield 200	com/tencent/mm/vfs/FileSystem$a:zYK	Ljava/lang/String;
    //   170: iload 8
    //   172: invokevirtual 204	java/lang/String:substring	(I)Ljava/lang/String;
    //   175: invokevirtual 197	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   178: invokevirtual 207	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   181: astore 9
    //   183: aload 6
    //   185: getfield 211	com/tencent/mm/vfs/FileSystem$a:zYN	Z
    //   188: ifeq +28 -> 216
    //   191: aload 4
    //   193: aload 9
    //   195: invokevirtual 168	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   198: ifeq -100 -> 98
    //   201: aload_1
    //   202: getfield 66	com/tencent/mm/vfs/FileSystemManager$d:zZs	Lcom/tencent/mm/vfs/FileSystem;
    //   205: aload 9
    //   207: invokeinterface 164 2 0
    //   212: pop
    //   213: goto -115 -> 98
    //   216: aload 9
    //   218: bipush 47
    //   220: invokevirtual 215	java/lang/String:lastIndexOf	(I)I
    //   223: istore 8
    //   225: iload 8
    //   227: ifle +32 -> 259
    //   230: aload 9
    //   232: iconst_0
    //   233: iload 8
    //   235: invokevirtual 218	java/lang/String:substring	(II)Ljava/lang/String;
    //   238: astore_3
    //   239: aload 4
    //   241: aload_3
    //   242: invokevirtual 168	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   245: ifeq +14 -> 259
    //   248: aload_1
    //   249: getfield 66	com/tencent/mm/vfs/FileSystemManager$d:zZs	Lcom/tencent/mm/vfs/FileSystem;
    //   252: aload_3
    //   253: invokeinterface 164 2 0
    //   258: pop
    //   259: aload 6
    //   261: invokevirtual 222	com/tencent/mm/vfs/FileSystem$a:dMu	()Ljava/io/InputStream;
    //   264: astore_3
    //   265: aload_1
    //   266: getfield 66	com/tencent/mm/vfs/FileSystemManager$d:zZs	Lcom/tencent/mm/vfs/FileSystem;
    //   269: aload 9
    //   271: iconst_0
    //   272: invokeinterface 141 3 0
    //   277: astore 9
    //   279: sipush 4096
    //   282: newarray byte
    //   284: astore 10
    //   286: aload_3
    //   287: aload 10
    //   289: invokevirtual 228	java/io/InputStream:read	([B)I
    //   292: istore 8
    //   294: iload 8
    //   296: iflt +88 -> 384
    //   299: aload 9
    //   301: aload 10
    //   303: iconst_0
    //   304: iload 8
    //   306: invokevirtual 88	java/io/OutputStream:write	([BII)V
    //   309: goto -23 -> 286
    //   312: astore_1
    //   313: aload 9
    //   315: astore_0
    //   316: new 192	java/lang/StringBuilder
    //   319: astore 9
    //   321: aload 9
    //   323: ldc 230
    //   325: invokespecial 231	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   328: ldc 94
    //   330: aload 9
    //   332: aload 6
    //   334: getfield 200	com/tencent/mm/vfs/FileSystem$a:zYK	Ljava/lang/String;
    //   337: invokevirtual 197	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   340: ldc 233
    //   342: invokevirtual 197	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   345: aload_1
    //   346: invokevirtual 117	java/io/IOException:getMessage	()Ljava/lang/String;
    //   349: invokevirtual 197	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   352: invokevirtual 207	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   355: invokestatic 237	com/tencent/e/a/b:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   358: aload_3
    //   359: ifnull +7 -> 366
    //   362: aload_3
    //   363: invokevirtual 238	java/io/InputStream:close	()V
    //   366: aload_0
    //   367: ifnull +7 -> 374
    //   370: aload_0
    //   371: invokevirtual 92	java/io/OutputStream:close	()V
    //   374: ldc 152
    //   376: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   379: iconst_0
    //   380: istore_2
    //   381: goto -355 -> 26
    //   384: aload_3
    //   385: ifnull +7 -> 392
    //   388: aload_3
    //   389: invokevirtual 238	java/io/InputStream:close	()V
    //   392: aload 9
    //   394: ifnull -296 -> 98
    //   397: aload 9
    //   399: invokevirtual 92	java/io/OutputStream:close	()V
    //   402: goto -304 -> 98
    //   405: astore_3
    //   406: goto -308 -> 98
    //   409: astore_1
    //   410: aconst_null
    //   411: astore_0
    //   412: aconst_null
    //   413: astore_3
    //   414: aload_3
    //   415: ifnull +7 -> 422
    //   418: aload_3
    //   419: invokevirtual 238	java/io/InputStream:close	()V
    //   422: aload_0
    //   423: ifnull +7 -> 430
    //   426: aload_0
    //   427: invokevirtual 92	java/io/OutputStream:close	()V
    //   430: ldc 152
    //   432: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   435: aload_1
    //   436: athrow
    //   437: ldc 152
    //   439: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   442: iconst_1
    //   443: istore_2
    //   444: goto -418 -> 26
    //   447: astore_3
    //   448: goto -56 -> 392
    //   451: astore_1
    //   452: goto -86 -> 366
    //   455: astore_0
    //   456: goto -82 -> 374
    //   459: astore_3
    //   460: goto -38 -> 422
    //   463: astore_0
    //   464: goto -34 -> 430
    //   467: astore_1
    //   468: aconst_null
    //   469: astore_0
    //   470: goto -56 -> 414
    //   473: astore_1
    //   474: aload 9
    //   476: astore_0
    //   477: goto -63 -> 414
    //   480: astore_1
    //   481: goto -67 -> 414
    //   484: astore_1
    //   485: aconst_null
    //   486: astore_0
    //   487: aconst_null
    //   488: astore_3
    //   489: goto -173 -> 316
    //   492: astore_1
    //   493: aconst_null
    //   494: astore_0
    //   495: goto -179 -> 316
    //
    // Exception table:
    //   from	to	target	type
    //   279	286	312	java/io/IOException
    //   286	294	312	java/io/IOException
    //   299	309	312	java/io/IOException
    //   397	402	405	java/lang/Exception
    //   259	265	409	finally
    //   388	392	447	java/lang/Exception
    //   362	366	451	java/lang/Exception
    //   370	374	455	java/lang/Exception
    //   418	422	459	java/lang/Exception
    //   426	430	463	java/lang/Exception
    //   265	279	467	finally
    //   279	286	473	finally
    //   286	294	473	finally
    //   299	309	473	finally
    //   316	358	480	finally
    //   259	265	484	java/io/IOException
    //   265	279	492	java/io/IOException
  }

  public static boolean aQ(String paramString1, String paramString2)
  {
    boolean bool = true;
    AppMethodBeat.i(54649);
    if ((paramString1 == null) || (paramString2 == null) || (paramString1.length() == 0) || (paramString2.length() == 0))
    {
      AppMethodBeat.o(54649);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (new b(paramString1).o(new b(paramString2)))
      {
        AppMethodBeat.o(54649);
      }
      else if (y(paramString1, paramString2) < 0L)
      {
        AppMethodBeat.o(54649);
        bool = false;
      }
      else
      {
        deleteFile(paramString1);
        AppMethodBeat.o(54649);
      }
    }
  }

  public static Uri asY(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(54635);
    if ((paramString == null) || (paramString.isEmpty()))
    {
      AppMethodBeat.o(54635);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      paramString = FileSystemManager.dMv().a(j.parseUri(paramString), null);
      if (!paramString.valid())
      {
        AppMethodBeat.o(54635);
        paramString = localObject;
      }
      else
      {
        paramString = FileSystemManager.a(paramString, false, true);
        if (paramString == null)
        {
          AppMethodBeat.o(54635);
          paramString = localObject;
        }
        else
        {
          paramString = Uri.fromFile(new File(paramString));
          AppMethodBeat.o(54635);
        }
      }
    }
  }

  public static long asZ(String paramString)
  {
    long l = 0L;
    AppMethodBeat.i(54637);
    if ((paramString == null) || (paramString.isEmpty()))
      AppMethodBeat.o(54637);
    while (true)
    {
      return l;
      paramString = j.parseUri(paramString);
      paramString = FileSystemManager.dMv().a(paramString, null);
      if (!paramString.valid())
      {
        AppMethodBeat.o(54637);
      }
      else
      {
        paramString = paramString.zZs.to(paramString.path);
        if (paramString == null)
        {
          AppMethodBeat.o(54637);
        }
        else
        {
          l = paramString.size;
          AppMethodBeat.o(54637);
        }
      }
    }
  }

  public static long ata(String paramString)
  {
    long l = 0L;
    AppMethodBeat.i(54638);
    if ((paramString == null) || (paramString.isEmpty()))
      AppMethodBeat.o(54638);
    while (true)
    {
      return l;
      paramString = j.parseUri(paramString);
      paramString = FileSystemManager.dMv().a(paramString, null);
      if (!paramString.valid())
      {
        AppMethodBeat.o(54638);
      }
      else
      {
        paramString = paramString.zZs.to(paramString.path);
        if (paramString == null)
        {
          AppMethodBeat.o(54638);
        }
        else
        {
          l = paramString.zYM;
          AppMethodBeat.o(54638);
        }
      }
    }
  }

  public static String atb(String paramString)
  {
    AppMethodBeat.i(54643);
    paramString = new b(paramString).dME().getParent();
    AppMethodBeat.o(54643);
    return paramString;
  }

  public static boolean atc(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(54656);
    try
    {
      b localb = new com/tencent/mm/vfs/b;
      localb.<init>(paramString);
      if ((localb.exists()) || (localb.createNewFile()))
      {
        AppMethodBeat.o(54656);
        bool = true;
      }
      while (true)
      {
        return bool;
        AppMethodBeat.o(54656);
      }
    }
    catch (IOException paramString)
    {
      while (true)
        AppMethodBeat.o(54656);
    }
  }

  public static final String atd(String paramString)
  {
    AppMethodBeat.i(54658);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      paramString = "";
      AppMethodBeat.o(54658);
    }
    while (true)
    {
      return paramString;
      String str = new b(paramString).getName();
      int i = str.lastIndexOf('.');
      if (i < 0)
      {
        AppMethodBeat.o(54658);
      }
      else if (i == 0)
      {
        paramString = "";
        AppMethodBeat.o(54658);
      }
      else
      {
        paramString = str.substring(0, i);
        AppMethodBeat.o(54658);
      }
    }
  }

  public static void ate(String paramString)
  {
    AppMethodBeat.i(54659);
    if ((paramString == null) || (paramString.isEmpty()))
      AppMethodBeat.o(54659);
    while (true)
    {
      return;
      paramString = j.parseUri(paramString);
      paramString = FileSystemManager.dMv().a(paramString, null);
      if (!paramString.valid())
        AppMethodBeat.o(54659);
      else if ((paramString.zZs.aiR() & 0x4) == 0)
        AppMethodBeat.o(54659);
      else if (paramString.zZs.O(paramString.path, true) == null)
        AppMethodBeat.o(54659);
      else
        try
        {
          FileSystem localFileSystem = paramString.zZs;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          localFileSystem.L(paramString.path + "/.nomedia", false).close();
          AppMethodBeat.o(54659);
        }
        catch (IOException paramString)
        {
          AppMethodBeat.o(54659);
        }
    }
  }

  // ERROR //
  private static byte[] atf(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: ldc_w 320
    //   5: invokestatic 13	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_0
    //   9: ifnonnull +11 -> 20
    //   12: ldc_w 320
    //   15: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   18: aload_1
    //   19: areturn
    //   20: aload_0
    //   21: invokestatic 324	com/tencent/mm/vfs/e:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   24: astore_0
    //   25: ldc_w 326
    //   28: invokestatic 332	java/security/MessageDigest:getInstance	(Ljava/lang/String;)Ljava/security/MessageDigest;
    //   31: astore_2
    //   32: sipush 2048
    //   35: newarray byte
    //   37: astore_3
    //   38: aload_0
    //   39: aload_3
    //   40: invokevirtual 228	java/io/InputStream:read	([B)I
    //   43: istore 4
    //   45: iload 4
    //   47: iflt +32 -> 79
    //   50: aload_2
    //   51: aload_3
    //   52: iconst_0
    //   53: iload 4
    //   55: invokevirtual 335	java/security/MessageDigest:update	([BII)V
    //   58: goto -20 -> 38
    //   61: astore_3
    //   62: aload_0
    //   63: ifnull +7 -> 70
    //   66: aload_0
    //   67: invokevirtual 238	java/io/InputStream:close	()V
    //   70: ldc_w 320
    //   73: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   76: goto -58 -> 18
    //   79: aload_2
    //   80: invokevirtual 339	java/security/MessageDigest:digest	()[B
    //   83: astore_3
    //   84: aload_3
    //   85: astore_1
    //   86: aload_0
    //   87: ifnull +7 -> 94
    //   90: aload_0
    //   91: invokevirtual 238	java/io/InputStream:close	()V
    //   94: ldc_w 320
    //   97: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   100: goto -82 -> 18
    //   103: astore_0
    //   104: aconst_null
    //   105: astore_1
    //   106: aload_1
    //   107: ifnull +7 -> 114
    //   110: aload_1
    //   111: invokevirtual 238	java/io/InputStream:close	()V
    //   114: ldc_w 320
    //   117: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   120: aload_0
    //   121: athrow
    //   122: astore_0
    //   123: goto -29 -> 94
    //   126: astore_0
    //   127: goto -57 -> 70
    //   130: astore_1
    //   131: goto -17 -> 114
    //   134: astore_1
    //   135: aload_0
    //   136: astore_3
    //   137: aload_1
    //   138: astore_0
    //   139: aload_3
    //   140: astore_1
    //   141: goto -35 -> 106
    //   144: astore_0
    //   145: aconst_null
    //   146: astore_0
    //   147: goto -85 -> 62
    //
    // Exception table:
    //   from	to	target	type
    //   25	38	61	java/lang/Exception
    //   38	45	61	java/lang/Exception
    //   50	58	61	java/lang/Exception
    //   79	84	61	java/lang/Exception
    //   20	25	103	finally
    //   90	94	122	java/io/IOException
    //   66	70	126	java/io/IOException
    //   110	114	130	java/io/IOException
    //   25	38	134	finally
    //   38	45	134	finally
    //   50	58	134	finally
    //   79	84	134	finally
    //   20	25	144	java/lang/Exception
  }

  public static String atg(String paramString)
  {
    AppMethodBeat.i(54661);
    byte[] arrayOfByte = atf(paramString);
    if (arrayOfByte == null)
    {
      paramString = null;
      AppMethodBeat.o(54661);
    }
    while (true)
    {
      return paramString;
      paramString = new StringBuilder(32);
      for (int i = 0; i < arrayOfByte.length; i++)
        paramString.append(Integer.toString((arrayOfByte[i] & 0xFF) + 256, 16).substring(1));
      paramString = paramString.toString();
      AppMethodBeat.o(54661);
    }
  }

  // ERROR //
  public static int b(String paramString, byte[] paramArrayOfByte, int paramInt)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: ldc_w 349
    //   5: invokestatic 13	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_1
    //   9: ifnonnull +14 -> 23
    //   12: bipush 254
    //   14: istore_2
    //   15: ldc_w 349
    //   18: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   21: iload_2
    //   22: ireturn
    //   23: aload_1
    //   24: arraylength
    //   25: iload_2
    //   26: iconst_0
    //   27: iadd
    //   28: if_icmpge +15 -> 43
    //   31: bipush 253
    //   33: istore_2
    //   34: ldc_w 349
    //   37: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   40: goto -19 -> 21
    //   43: aconst_null
    //   44: astore 4
    //   46: aconst_null
    //   47: astore 5
    //   49: aload_0
    //   50: iconst_0
    //   51: invokestatic 82	com/tencent/mm/vfs/e:L	(Ljava/lang/String;Z)Ljava/io/OutputStream;
    //   54: astore 6
    //   56: aload 6
    //   58: astore 5
    //   60: aload 6
    //   62: astore 4
    //   64: aload 6
    //   66: aload_1
    //   67: iconst_0
    //   68: iload_2
    //   69: invokevirtual 88	java/io/OutputStream:write	([BII)V
    //   72: aload 6
    //   74: ifnull +8 -> 82
    //   77: aload 6
    //   79: invokevirtual 92	java/io/OutputStream:close	()V
    //   82: ldc_w 349
    //   85: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   88: iload_3
    //   89: istore_2
    //   90: goto -69 -> 21
    //   93: astore_1
    //   94: aload 5
    //   96: astore 4
    //   98: ldc 94
    //   100: ldc_w 351
    //   103: iconst_2
    //   104: anewarray 4	java/lang/Object
    //   107: dup
    //   108: iconst_0
    //   109: aload_0
    //   110: aastore
    //   111: dup
    //   112: iconst_1
    //   113: aload_1
    //   114: invokevirtual 117	java/io/IOException:getMessage	()Ljava/lang/String;
    //   117: aastore
    //   118: invokestatic 353	com/tencent/e/a/b:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   121: aload 5
    //   123: ifnull +8 -> 131
    //   126: aload 5
    //   128: invokevirtual 92	java/io/OutputStream:close	()V
    //   131: iconst_m1
    //   132: istore_2
    //   133: ldc_w 349
    //   136: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   139: goto -118 -> 21
    //   142: astore_0
    //   143: aload 4
    //   145: ifnull +8 -> 153
    //   148: aload 4
    //   150: invokevirtual 92	java/io/OutputStream:close	()V
    //   153: ldc_w 349
    //   156: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   159: aload_0
    //   160: athrow
    //   161: astore_0
    //   162: goto -80 -> 82
    //   165: astore_0
    //   166: goto -35 -> 131
    //   169: astore_1
    //   170: goto -17 -> 153
    //
    // Exception table:
    //   from	to	target	type
    //   49	56	93	java/io/IOException
    //   64	72	93	java/io/IOException
    //   49	56	142	finally
    //   64	72	142	finally
    //   98	121	142	finally
    //   77	82	161	java/io/IOException
    //   126	131	165	java/io/IOException
    //   148	153	169	java/io/IOException
  }

  public static InputStream b(Uri paramUri, FileSystemManager.d paramd)
  {
    AppMethodBeat.i(54627);
    paramd = FileSystemManager.dMv().a(paramUri, paramd);
    if (!paramd.valid())
    {
      paramUri = new FileNotFoundException("Cannot resolve path or URI: ".concat(String.valueOf(paramUri)));
      AppMethodBeat.o(54627);
      throw paramUri;
    }
    try
    {
      paramUri = paramd.zZs.openRead(paramd.path);
      AppMethodBeat.o(54627);
      return paramUri;
    }
    catch (IOException paramUri)
    {
      paramUri = (FileNotFoundException)new FileNotFoundException(paramUri.getMessage()).initCause(paramUri);
      AppMethodBeat.o(54627);
    }
    throw paramUri;
  }

  public static RandomAccessFile ck(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(54633);
    if ((paramString == null) || (paramString.isEmpty()))
    {
      paramString = new FileNotFoundException("path is empty");
      AppMethodBeat.o(54633);
      throw paramString;
    }
    paramString = a(j.parseUri(paramString), paramBoolean);
    AppMethodBeat.o(54633);
    return paramString;
  }

  public static List<FileSystem.a> cl(String paramString, boolean paramBoolean)
  {
    Object localObject = null;
    AppMethodBeat.i(54650);
    paramString = j.parseUri(paramString);
    paramString = FileSystemManager.dMv().a(paramString, null);
    if (!paramString.valid())
    {
      AppMethodBeat.o(54650);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      paramString = paramString.zZs.M(paramString.path, paramBoolean);
      AppMethodBeat.o(54650);
    }
  }

  public static boolean ct(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(54646);
    if ((paramString == null) || (paramString.isEmpty()))
      AppMethodBeat.o(54646);
    while (true)
    {
      return bool;
      paramString = j.parseUri(paramString);
      paramString = FileSystemManager.dMv().a(paramString, null);
      if (!paramString.valid())
      {
        AppMethodBeat.o(54646);
      }
      else
      {
        bool = paramString.zZs.exists(paramString.path);
        AppMethodBeat.o(54646);
      }
    }
  }

  public static boolean cu(String paramString)
  {
    AppMethodBeat.i(138361);
    boolean bool = N(paramString, true);
    AppMethodBeat.o(138361);
    return bool;
  }

  public static String cv(String paramString)
  {
    AppMethodBeat.i(54657);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      paramString = "";
      AppMethodBeat.o(54657);
    }
    while (true)
    {
      return paramString;
      paramString = new b(paramString).getName();
      int i = paramString.lastIndexOf('.');
      if ((i <= 0) || (i == paramString.length() - 1))
      {
        paramString = "";
        AppMethodBeat.o(54657);
      }
      else
      {
        paramString = paramString.substring(i + 1);
        AppMethodBeat.o(54657);
      }
    }
  }

  // ERROR //
  public static String cy(String paramString)
  {
    // Byte code:
    //   0: ldc_w 376
    //   3: invokestatic 13	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: new 192	java/lang/StringBuilder
    //   9: dup
    //   10: invokespecial 193	java/lang/StringBuilder:<init>	()V
    //   13: astore_1
    //   14: new 378	java/io/InputStreamReader
    //   17: astore_2
    //   18: aload_2
    //   19: aload_0
    //   20: invokestatic 324	com/tencent/mm/vfs/e:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   23: invokespecial 381	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   26: aload_2
    //   27: astore_3
    //   28: sipush 512
    //   31: newarray char
    //   33: astore 4
    //   35: aload_2
    //   36: astore_3
    //   37: aload_2
    //   38: aload 4
    //   40: invokevirtual 384	java/io/InputStreamReader:read	([C)I
    //   43: istore 5
    //   45: iload 5
    //   47: iconst_m1
    //   48: if_icmpeq +73 -> 121
    //   51: aload_2
    //   52: astore_3
    //   53: aload_1
    //   54: aload 4
    //   56: iconst_0
    //   57: iload 5
    //   59: invokevirtual 387	java/lang/StringBuilder:append	([CII)Ljava/lang/StringBuilder;
    //   62: pop
    //   63: goto -28 -> 35
    //   66: astore_1
    //   67: aload_2
    //   68: astore_3
    //   69: ldc 94
    //   71: ldc_w 389
    //   74: iconst_2
    //   75: anewarray 4	java/lang/Object
    //   78: dup
    //   79: iconst_0
    //   80: aload_0
    //   81: aastore
    //   82: dup
    //   83: iconst_1
    //   84: aload_1
    //   85: invokevirtual 117	java/io/IOException:getMessage	()Ljava/lang/String;
    //   88: aastore
    //   89: invokestatic 353	com/tencent/e/a/b:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   92: aload_2
    //   93: astore_3
    //   94: ldc_w 376
    //   97: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   100: aload_2
    //   101: astore_3
    //   102: aload_1
    //   103: athrow
    //   104: astore_0
    //   105: aload_3
    //   106: ifnull +7 -> 113
    //   109: aload_3
    //   110: invokevirtual 390	java/io/InputStreamReader:close	()V
    //   113: ldc_w 376
    //   116: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   119: aload_0
    //   120: athrow
    //   121: aload_2
    //   122: invokevirtual 390	java/io/InputStreamReader:close	()V
    //   125: aload_1
    //   126: invokevirtual 207	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   129: astore_0
    //   130: ldc_w 376
    //   133: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   136: aload_0
    //   137: areturn
    //   138: astore_0
    //   139: goto -14 -> 125
    //   142: astore_3
    //   143: goto -30 -> 113
    //   146: astore_0
    //   147: aconst_null
    //   148: astore_3
    //   149: goto -44 -> 105
    //   152: astore_1
    //   153: aconst_null
    //   154: astore_2
    //   155: goto -88 -> 67
    //
    // Exception table:
    //   from	to	target	type
    //   28	35	66	java/io/IOException
    //   37	45	66	java/io/IOException
    //   53	63	66	java/io/IOException
    //   28	35	104	finally
    //   37	45	104	finally
    //   53	63	104	finally
    //   69	92	104	finally
    //   94	100	104	finally
    //   102	104	104	finally
    //   121	125	138	java/io/IOException
    //   109	113	142	java/io/IOException
    //   14	26	146	finally
    //   14	26	152	java/io/IOException
  }

  public static boolean deleteFile(String paramString)
  {
    AppMethodBeat.i(54647);
    boolean bool;
    if ((paramString == null) || (paramString.length() == 0))
    {
      bool = false;
      AppMethodBeat.o(54647);
    }
    while (true)
    {
      return bool;
      bool = new b(paramString).delete();
      AppMethodBeat.o(54647);
    }
  }

  // ERROR //
  public static byte[] e(String paramString, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: ldc_w 396
    //   3: invokestatic 13	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: ifnonnull +13 -> 20
    //   10: ldc_w 396
    //   13: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   16: aconst_null
    //   17: astore_0
    //   18: aload_0
    //   19: areturn
    //   20: iload_2
    //   21: iflt +10 -> 31
    //   24: iload_2
    //   25: ldc_w 397
    //   28: if_icmple +53 -> 81
    //   31: sipush 4096
    //   34: istore_3
    //   35: new 399	java/io/ByteArrayOutputStream
    //   38: dup
    //   39: iload_3
    //   40: invokespecial 400	java/io/ByteArrayOutputStream:<init>	(I)V
    //   43: astore 4
    //   45: aload_0
    //   46: invokestatic 324	com/tencent/mm/vfs/e:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   49: astore 5
    //   51: iload_1
    //   52: i2l
    //   53: lstore 6
    //   55: lload 6
    //   57: lconst_0
    //   58: lcmp
    //   59: ifle +27 -> 86
    //   62: aload 5
    //   64: astore 8
    //   66: lload 6
    //   68: aload 5
    //   70: lload 6
    //   72: invokevirtual 404	java/io/InputStream:skip	(J)J
    //   75: lsub
    //   76: lstore 6
    //   78: goto -23 -> 55
    //   81: iload_2
    //   82: istore_3
    //   83: goto -48 -> 35
    //   86: aload 5
    //   88: astore 8
    //   90: sipush 1024
    //   93: newarray byte
    //   95: astore 9
    //   97: iload_2
    //   98: istore_1
    //   99: iload_2
    //   100: ifge +7 -> 107
    //   103: ldc_w 405
    //   106: istore_1
    //   107: aload 5
    //   109: astore 8
    //   111: aload 5
    //   113: aload 9
    //   115: iconst_0
    //   116: iload_1
    //   117: sipush 1024
    //   120: invokestatic 411	java/lang/Math:min	(II)I
    //   123: invokevirtual 414	java/io/InputStream:read	([BII)I
    //   126: istore_2
    //   127: iload_2
    //   128: iconst_m1
    //   129: if_icmpeq +27 -> 156
    //   132: iload_1
    //   133: ifle +23 -> 156
    //   136: aload 5
    //   138: astore 8
    //   140: aload 4
    //   142: aload 9
    //   144: iconst_0
    //   145: iload_2
    //   146: invokevirtual 415	java/io/ByteArrayOutputStream:write	([BII)V
    //   149: iload_1
    //   150: iload_2
    //   151: isub
    //   152: istore_1
    //   153: goto -46 -> 107
    //   156: aload 5
    //   158: ifnull +8 -> 166
    //   161: aload 5
    //   163: invokevirtual 238	java/io/InputStream:close	()V
    //   166: aload 4
    //   168: invokevirtual 418	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   171: astore 8
    //   173: aload 4
    //   175: invokevirtual 419	java/io/ByteArrayOutputStream:close	()V
    //   178: ldc 94
    //   180: ldc_w 421
    //   183: iconst_2
    //   184: anewarray 4	java/lang/Object
    //   187: dup
    //   188: iconst_0
    //   189: aload_0
    //   190: aastore
    //   191: dup
    //   192: iconst_1
    //   193: aload 8
    //   195: arraylength
    //   196: invokestatic 123	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   199: aastore
    //   200: invokestatic 424	com/tencent/e/a/b:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   203: ldc_w 396
    //   206: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   209: aload 8
    //   211: astore_0
    //   212: goto -194 -> 18
    //   215: astore 4
    //   217: aconst_null
    //   218: astore 5
    //   220: aload 5
    //   222: astore 8
    //   224: new 192	java/lang/StringBuilder
    //   227: astore 9
    //   229: aload 5
    //   231: astore 8
    //   233: aload 9
    //   235: ldc_w 426
    //   238: invokespecial 231	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   241: aload 5
    //   243: astore 8
    //   245: ldc 94
    //   247: aload 9
    //   249: aload_0
    //   250: invokevirtual 197	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   253: ldc_w 428
    //   256: invokevirtual 197	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   259: aload 4
    //   261: invokevirtual 117	java/io/IOException:getMessage	()Ljava/lang/String;
    //   264: invokevirtual 197	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   267: invokevirtual 207	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   270: invokestatic 430	com/tencent/e/a/b:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   273: aload 5
    //   275: ifnull +8 -> 283
    //   278: aload 5
    //   280: invokevirtual 238	java/io/InputStream:close	()V
    //   283: ldc_w 396
    //   286: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   289: aconst_null
    //   290: astore_0
    //   291: goto -273 -> 18
    //   294: astore_0
    //   295: aconst_null
    //   296: astore 8
    //   298: aload 8
    //   300: ifnull +8 -> 308
    //   303: aload 8
    //   305: invokevirtual 238	java/io/InputStream:close	()V
    //   308: ldc_w 396
    //   311: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   314: aload_0
    //   315: athrow
    //   316: astore 8
    //   318: goto -152 -> 166
    //   321: astore_0
    //   322: goto -39 -> 283
    //   325: astore 8
    //   327: goto -19 -> 308
    //   330: astore 5
    //   332: goto -154 -> 178
    //   335: astore_0
    //   336: goto -38 -> 298
    //   339: astore 4
    //   341: goto -121 -> 220
    //
    // Exception table:
    //   from	to	target	type
    //   45	51	215	java/io/IOException
    //   45	51	294	finally
    //   161	166	316	java/io/IOException
    //   278	283	321	java/io/IOException
    //   303	308	325	java/io/IOException
    //   173	178	330	java/io/IOException
    //   66	78	335	finally
    //   90	97	335	finally
    //   111	127	335	finally
    //   140	149	335	finally
    //   224	229	335	finally
    //   233	241	335	finally
    //   245	273	335	finally
    //   66	78	339	java/io/IOException
    //   90	97	339	java/io/IOException
    //   111	127	339	java/io/IOException
    //   140	149	339	java/io/IOException
  }

  public static boolean h(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(54648);
    boolean bool = aQ(paramString1 + paramString2, paramString1 + paramString3);
    AppMethodBeat.o(54648);
    return bool;
  }

  public static boolean is(String paramString1, String paramString2)
  {
    AppMethodBeat.i(54651);
    paramString1 = j.parseUri(paramString1);
    paramString1 = FileSystemManager.dMv().a(paramString1, null);
    paramString2 = j.parseUri(paramString2);
    boolean bool = a(paramString1, FileSystemManager.dMv().a(paramString2, null));
    AppMethodBeat.o(54651);
    return bool;
  }

  public static boolean it(String paramString1, String paramString2)
  {
    boolean bool = true;
    AppMethodBeat.i(54653);
    Object localObject1 = j.parseUri(paramString1);
    localObject1 = FileSystemManager.dMv().a((Uri)localObject1, null);
    Object localObject2 = j.parseUri(paramString2);
    localObject2 = FileSystemManager.dMv().a((Uri)localObject2, null);
    if ((((FileSystemManager.d)localObject1).valid()) && (((FileSystemManager.d)localObject1).zZs == ((FileSystemManager.d)localObject2).zZs) && ((((FileSystemManager.d)localObject1).zZs.aiR() & 0x20) != 0) && (((FileSystemManager.d)localObject1).zZs.aS(paramString1, paramString2)))
      AppMethodBeat.o(54653);
    while (true)
    {
      return bool;
      if ((a((FileSystemManager.d)localObject1, (FileSystemManager.d)localObject2)) && (N(paramString1, false)))
      {
        AppMethodBeat.o(54653);
      }
      else
      {
        AppMethodBeat.o(54653);
        bool = false;
      }
    }
  }

  // ERROR //
  public static int iu(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: ldc_w 447
    //   5: invokestatic 13	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: new 449	java/util/zip/ZipInputStream
    //   11: astore_3
    //   12: aload_3
    //   13: aload_0
    //   14: invokestatic 324	com/tencent/mm/vfs/e:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   17: invokespecial 450	java/util/zip/ZipInputStream:<init>	(Ljava/io/InputStream;)V
    //   20: aload_3
    //   21: astore_0
    //   22: aload_3
    //   23: invokevirtual 454	java/util/zip/ZipInputStream:getNextEntry	()Ljava/util/zip/ZipEntry;
    //   26: astore 4
    //   28: aload 4
    //   30: ifnull +310 -> 340
    //   33: aload_3
    //   34: astore_0
    //   35: aload 4
    //   37: invokevirtual 457	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   40: astore 5
    //   42: aload_3
    //   43: astore_0
    //   44: aload 5
    //   46: ldc_w 459
    //   49: invokevirtual 463	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   52: ifne -32 -> 20
    //   55: aload_3
    //   56: astore_0
    //   57: aload 5
    //   59: ldc_w 465
    //   62: invokevirtual 463	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   65: ifne -45 -> 20
    //   68: aload_3
    //   69: astore_0
    //   70: aload 4
    //   72: invokevirtual 468	java/util/zip/ZipEntry:isDirectory	()Z
    //   75: ifeq +107 -> 182
    //   78: aload_3
    //   79: astore_0
    //   80: aload 5
    //   82: iconst_0
    //   83: aload 5
    //   85: invokevirtual 48	java/lang/String:length	()I
    //   88: iconst_1
    //   89: isub
    //   90: invokevirtual 218	java/lang/String:substring	(II)Ljava/lang/String;
    //   93: astore 4
    //   95: aload_3
    //   96: astore_0
    //   97: new 243	com/tencent/mm/vfs/b
    //   100: astore 6
    //   102: aload_3
    //   103: astore_0
    //   104: new 192	java/lang/StringBuilder
    //   107: astore 5
    //   109: aload_3
    //   110: astore_0
    //   111: aload 5
    //   113: invokespecial 193	java/lang/StringBuilder:<init>	()V
    //   116: aload_3
    //   117: astore_0
    //   118: aload 6
    //   120: aload 5
    //   122: aload_1
    //   123: invokevirtual 197	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   126: ldc 187
    //   128: invokevirtual 197	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   131: aload 4
    //   133: invokevirtual 197	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   136: invokevirtual 207	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   139: invokespecial 244	com/tencent/mm/vfs/b:<init>	(Ljava/lang/String;)V
    //   142: aload_3
    //   143: astore_0
    //   144: aload 6
    //   146: invokevirtual 471	com/tencent/mm/vfs/b:mkdirs	()Z
    //   149: pop
    //   150: goto -130 -> 20
    //   153: astore_1
    //   154: aload_3
    //   155: astore_0
    //   156: ldc 94
    //   158: aload_1
    //   159: ldc 96
    //   161: invokestatic 102	com/tencent/e/a/b:c	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V
    //   164: aload_3
    //   165: ifnull +7 -> 172
    //   168: aload_3
    //   169: invokevirtual 472	java/util/zip/ZipInputStream:close	()V
    //   172: ldc_w 447
    //   175: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   178: iconst_m1
    //   179: istore_2
    //   180: iload_2
    //   181: ireturn
    //   182: aload_3
    //   183: astore_0
    //   184: new 243	com/tencent/mm/vfs/b
    //   187: astore 6
    //   189: aload_3
    //   190: astore_0
    //   191: new 192	java/lang/StringBuilder
    //   194: astore 4
    //   196: aload_3
    //   197: astore_0
    //   198: aload 4
    //   200: invokespecial 193	java/lang/StringBuilder:<init>	()V
    //   203: aload_3
    //   204: astore_0
    //   205: aload 6
    //   207: aload 4
    //   209: aload_1
    //   210: invokevirtual 197	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   213: ldc 187
    //   215: invokevirtual 197	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   218: aload 5
    //   220: invokevirtual 197	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   223: invokevirtual 207	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   226: invokespecial 244	com/tencent/mm/vfs/b:<init>	(Ljava/lang/String;)V
    //   229: aload_3
    //   230: astore_0
    //   231: aload 6
    //   233: invokestatic 476	com/tencent/mm/vfs/e:q	(Lcom/tencent/mm/vfs/b;)Ljava/io/OutputStream;
    //   236: astore 5
    //   238: aload_3
    //   239: astore_0
    //   240: sipush 1024
    //   243: newarray byte
    //   245: astore 4
    //   247: aload_3
    //   248: astore_0
    //   249: aload_3
    //   250: aload 4
    //   252: invokevirtual 477	java/util/zip/ZipInputStream:read	([B)I
    //   255: istore 7
    //   257: iload 7
    //   259: iconst_m1
    //   260: if_icmpeq +49 -> 309
    //   263: aload_3
    //   264: astore_0
    //   265: aload 5
    //   267: aload 4
    //   269: iconst_0
    //   270: iload 7
    //   272: invokevirtual 88	java/io/OutputStream:write	([BII)V
    //   275: goto -28 -> 247
    //   278: astore_1
    //   279: aload_3
    //   280: astore_0
    //   281: ldc 94
    //   283: aload_1
    //   284: ldc 96
    //   286: invokestatic 102	com/tencent/e/a/b:c	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V
    //   289: aload_3
    //   290: ifnull +7 -> 297
    //   293: aload_3
    //   294: invokevirtual 472	java/util/zip/ZipInputStream:close	()V
    //   297: bipush 254
    //   299: istore_2
    //   300: ldc_w 447
    //   303: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   306: goto -126 -> 180
    //   309: aload_3
    //   310: astore_0
    //   311: aload 5
    //   313: invokevirtual 92	java/io/OutputStream:close	()V
    //   316: goto -296 -> 20
    //   319: astore_3
    //   320: aload_0
    //   321: astore_1
    //   322: aload_3
    //   323: astore_0
    //   324: aload_1
    //   325: ifnull +7 -> 332
    //   328: aload_1
    //   329: invokevirtual 472	java/util/zip/ZipInputStream:close	()V
    //   332: ldc_w 447
    //   335: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   338: aload_0
    //   339: athrow
    //   340: aload_3
    //   341: invokevirtual 472	java/util/zip/ZipInputStream:close	()V
    //   344: ldc_w 447
    //   347: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   350: goto -170 -> 180
    //   353: astore_0
    //   354: ldc 94
    //   356: ldc_w 479
    //   359: invokestatic 237	com/tencent/e/a/b:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   362: goto -18 -> 344
    //   365: astore_0
    //   366: ldc 94
    //   368: ldc_w 479
    //   371: invokestatic 237	com/tencent/e/a/b:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   374: goto -202 -> 172
    //   377: astore_0
    //   378: ldc 94
    //   380: ldc_w 479
    //   383: invokestatic 237	com/tencent/e/a/b:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   386: goto -89 -> 297
    //   389: astore_1
    //   390: ldc 94
    //   392: ldc_w 479
    //   395: invokestatic 237	com/tencent/e/a/b:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   398: goto -66 -> 332
    //   401: astore_0
    //   402: aconst_null
    //   403: astore_1
    //   404: goto -80 -> 324
    //   407: astore_1
    //   408: aconst_null
    //   409: astore_3
    //   410: goto -131 -> 279
    //   413: astore_1
    //   414: aconst_null
    //   415: astore_3
    //   416: goto -262 -> 154
    //
    // Exception table:
    //   from	to	target	type
    //   22	28	153	java/io/FileNotFoundException
    //   35	42	153	java/io/FileNotFoundException
    //   44	55	153	java/io/FileNotFoundException
    //   57	68	153	java/io/FileNotFoundException
    //   70	78	153	java/io/FileNotFoundException
    //   80	95	153	java/io/FileNotFoundException
    //   97	102	153	java/io/FileNotFoundException
    //   104	109	153	java/io/FileNotFoundException
    //   111	116	153	java/io/FileNotFoundException
    //   118	142	153	java/io/FileNotFoundException
    //   144	150	153	java/io/FileNotFoundException
    //   184	189	153	java/io/FileNotFoundException
    //   191	196	153	java/io/FileNotFoundException
    //   198	203	153	java/io/FileNotFoundException
    //   205	229	153	java/io/FileNotFoundException
    //   231	238	153	java/io/FileNotFoundException
    //   240	247	153	java/io/FileNotFoundException
    //   249	257	153	java/io/FileNotFoundException
    //   265	275	153	java/io/FileNotFoundException
    //   311	316	153	java/io/FileNotFoundException
    //   22	28	278	java/io/IOException
    //   35	42	278	java/io/IOException
    //   44	55	278	java/io/IOException
    //   57	68	278	java/io/IOException
    //   70	78	278	java/io/IOException
    //   80	95	278	java/io/IOException
    //   97	102	278	java/io/IOException
    //   104	109	278	java/io/IOException
    //   111	116	278	java/io/IOException
    //   118	142	278	java/io/IOException
    //   144	150	278	java/io/IOException
    //   184	189	278	java/io/IOException
    //   191	196	278	java/io/IOException
    //   198	203	278	java/io/IOException
    //   205	229	278	java/io/IOException
    //   231	238	278	java/io/IOException
    //   240	247	278	java/io/IOException
    //   249	257	278	java/io/IOException
    //   265	275	278	java/io/IOException
    //   311	316	278	java/io/IOException
    //   22	28	319	finally
    //   35	42	319	finally
    //   44	55	319	finally
    //   57	68	319	finally
    //   70	78	319	finally
    //   80	95	319	finally
    //   97	102	319	finally
    //   104	109	319	finally
    //   111	116	319	finally
    //   118	142	319	finally
    //   144	150	319	finally
    //   156	164	319	finally
    //   184	189	319	finally
    //   191	196	319	finally
    //   198	203	319	finally
    //   205	229	319	finally
    //   231	238	319	finally
    //   240	247	319	finally
    //   249	257	319	finally
    //   265	275	319	finally
    //   281	289	319	finally
    //   311	316	319	finally
    //   340	344	353	java/io/IOException
    //   168	172	365	java/io/IOException
    //   293	297	377	java/io/IOException
    //   328	332	389	java/io/IOException
    //   8	20	401	finally
    //   8	20	407	java/io/IOException
    //   8	20	413	java/io/FileNotFoundException
  }

  // ERROR //
  public static boolean m(List<String> paramList, String paramString)
  {
    // Byte code:
    //   0: ldc_w 482
    //   3: invokestatic 13	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_1
    //   7: ifnull +10 -> 17
    //   10: aload_1
    //   11: invokevirtual 19	java/lang/String:isEmpty	()Z
    //   14: ifeq +13 -> 27
    //   17: ldc_w 482
    //   20: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   23: iconst_0
    //   24: istore_2
    //   25: iload_2
    //   26: ireturn
    //   27: aload_1
    //   28: invokestatic 484	com/tencent/mm/vfs/e:atb	(Ljava/lang/String;)Ljava/lang/String;
    //   31: invokestatic 485	com/tencent/mm/vfs/e:tf	(Ljava/lang/String;)Z
    //   34: pop
    //   35: sipush 4096
    //   38: newarray byte
    //   40: astore_3
    //   41: new 487	java/util/zip/ZipOutputStream
    //   44: astore 4
    //   46: aload 4
    //   48: aload_1
    //   49: iconst_0
    //   50: invokestatic 82	com/tencent/mm/vfs/e:L	(Ljava/lang/String;Z)Ljava/io/OutputStream;
    //   53: invokespecial 490	java/util/zip/ZipOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   56: aload_0
    //   57: invokeinterface 174 1 0
    //   62: astore 5
    //   64: aload 5
    //   66: invokeinterface 179 1 0
    //   71: ifeq +319 -> 390
    //   74: aload 5
    //   76: invokeinterface 183 1 0
    //   81: checkcast 15	java/lang/String
    //   84: invokestatic 36	com/tencent/mm/vfs/j:parseUri	(Ljava/lang/String;)Landroid/net/Uri;
    //   87: astore_0
    //   88: invokestatic 54	com/tencent/mm/vfs/FileSystemManager:dMv	()Lcom/tencent/mm/vfs/FileSystemManager;
    //   91: aload_0
    //   92: aconst_null
    //   93: invokevirtual 57	com/tencent/mm/vfs/FileSystemManager:a	(Landroid/net/Uri;Lcom/tencent/mm/vfs/FileSystemManager$d;)Lcom/tencent/mm/vfs/FileSystemManager$d;
    //   96: astore_0
    //   97: aload_0
    //   98: invokevirtual 62	com/tencent/mm/vfs/FileSystemManager$d:valid	()Z
    //   101: ifeq -37 -> 64
    //   104: aload_0
    //   105: getfield 66	com/tencent/mm/vfs/FileSystemManager$d:zZs	Lcom/tencent/mm/vfs/FileSystem;
    //   108: aload_0
    //   109: getfield 70	com/tencent/mm/vfs/FileSystemManager$d:path	Ljava/lang/String;
    //   112: invokeinterface 275 2 0
    //   117: astore_1
    //   118: aload_1
    //   119: ifnull -55 -> 64
    //   122: aload_1
    //   123: getfield 211	com/tencent/mm/vfs/FileSystem$a:zYN	Z
    //   126: ifeq +203 -> 329
    //   129: aload_0
    //   130: getfield 70	com/tencent/mm/vfs/FileSystemManager$d:path	Ljava/lang/String;
    //   133: invokevirtual 48	java/lang/String:length	()I
    //   136: istore 6
    //   138: aload_0
    //   139: getfield 70	com/tencent/mm/vfs/FileSystemManager$d:path	Ljava/lang/String;
    //   142: ldc 187
    //   144: invokevirtual 190	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   147: ifeq +176 -> 323
    //   150: iconst_0
    //   151: istore 7
    //   153: aload_0
    //   154: getfield 66	com/tencent/mm/vfs/FileSystemManager$d:zZs	Lcom/tencent/mm/vfs/FileSystem;
    //   157: aload_0
    //   158: getfield 70	com/tencent/mm/vfs/FileSystemManager$d:path	Ljava/lang/String;
    //   161: iconst_1
    //   162: invokeinterface 156 3 0
    //   167: astore_0
    //   168: aload_0
    //   169: ifnull -105 -> 64
    //   172: iload 7
    //   174: iload 6
    //   176: iadd
    //   177: istore 7
    //   179: aload_0
    //   180: invokeinterface 174 1 0
    //   185: astore 8
    //   187: aload 8
    //   189: invokeinterface 179 1 0
    //   194: ifeq -130 -> 64
    //   197: aload 8
    //   199: invokeinterface 183 1 0
    //   204: checkcast 185	com/tencent/mm/vfs/FileSystem$a
    //   207: astore_1
    //   208: aload_1
    //   209: getfield 211	com/tencent/mm/vfs/FileSystem$a:zYN	Z
    //   212: ifne -25 -> 187
    //   215: aload_1
    //   216: getfield 200	com/tencent/mm/vfs/FileSystem$a:zYK	Ljava/lang/String;
    //   219: invokevirtual 48	java/lang/String:length	()I
    //   222: iload 7
    //   224: if_icmpge +127 -> 351
    //   227: aload_1
    //   228: getfield 493	com/tencent/mm/vfs/FileSystem$a:name	Ljava/lang/String;
    //   231: astore_0
    //   232: aload_1
    //   233: invokevirtual 222	com/tencent/mm/vfs/FileSystem$a:dMu	()Ljava/io/InputStream;
    //   236: astore_1
    //   237: new 456	java/util/zip/ZipEntry
    //   240: astore 9
    //   242: aload 9
    //   244: aload_0
    //   245: invokespecial 494	java/util/zip/ZipEntry:<init>	(Ljava/lang/String;)V
    //   248: aload 4
    //   250: aload 9
    //   252: invokevirtual 498	java/util/zip/ZipOutputStream:putNextEntry	(Ljava/util/zip/ZipEntry;)V
    //   255: aload_1
    //   256: aload_3
    //   257: invokevirtual 228	java/io/InputStream:read	([B)I
    //   260: istore 6
    //   262: iload 6
    //   264: iflt +100 -> 364
    //   267: aload 4
    //   269: aload_3
    //   270: iconst_0
    //   271: iload 6
    //   273: invokevirtual 499	java/util/zip/ZipOutputStream:write	([BII)V
    //   276: goto -21 -> 255
    //   279: astore_3
    //   280: aload 4
    //   282: astore_0
    //   283: aload_3
    //   284: astore 4
    //   286: ldc 94
    //   288: aload 4
    //   290: ldc_w 501
    //   293: invokestatic 102	com/tencent/e/a/b:c	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V
    //   296: aload_1
    //   297: ifnull +7 -> 304
    //   300: aload_1
    //   301: invokevirtual 238	java/io/InputStream:close	()V
    //   304: aload_0
    //   305: ifnull +7 -> 312
    //   308: aload_0
    //   309: invokevirtual 502	java/util/zip/ZipOutputStream:close	()V
    //   312: ldc_w 482
    //   315: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   318: iconst_0
    //   319: istore_2
    //   320: goto -295 -> 25
    //   323: iconst_1
    //   324: istore 7
    //   326: goto -173 -> 153
    //   329: aload_0
    //   330: getfield 70	com/tencent/mm/vfs/FileSystemManager$d:path	Ljava/lang/String;
    //   333: bipush 47
    //   335: invokevirtual 215	java/lang/String:lastIndexOf	(I)I
    //   338: istore 7
    //   340: aload_1
    //   341: invokestatic 508	java/util/Collections:singletonList	(Ljava/lang/Object;)Ljava/util/List;
    //   344: astore_0
    //   345: iinc 7 1
    //   348: goto -169 -> 179
    //   351: aload_1
    //   352: getfield 200	com/tencent/mm/vfs/FileSystem$a:zYK	Ljava/lang/String;
    //   355: iload 7
    //   357: invokevirtual 204	java/lang/String:substring	(I)Ljava/lang/String;
    //   360: astore_0
    //   361: goto -129 -> 232
    //   364: aload_1
    //   365: invokevirtual 238	java/io/InputStream:close	()V
    //   368: aload 4
    //   370: invokevirtual 511	java/util/zip/ZipOutputStream:closeEntry	()V
    //   373: goto -186 -> 187
    //   376: astore_1
    //   377: aload 4
    //   379: astore_0
    //   380: aconst_null
    //   381: astore_3
    //   382: aload_1
    //   383: astore 4
    //   385: aload_3
    //   386: astore_1
    //   387: goto -101 -> 286
    //   390: aload 4
    //   392: invokevirtual 502	java/util/zip/ZipOutputStream:close	()V
    //   395: ldc_w 482
    //   398: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   401: iconst_1
    //   402: istore_2
    //   403: goto -378 -> 25
    //   406: astore_0
    //   407: aconst_null
    //   408: astore 4
    //   410: aconst_null
    //   411: astore_1
    //   412: aload_1
    //   413: ifnull +7 -> 420
    //   416: aload_1
    //   417: invokevirtual 238	java/io/InputStream:close	()V
    //   420: aload 4
    //   422: ifnull +8 -> 430
    //   425: aload 4
    //   427: invokevirtual 502	java/util/zip/ZipOutputStream:close	()V
    //   430: ldc_w 482
    //   433: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   436: aload_0
    //   437: athrow
    //   438: astore_0
    //   439: goto -44 -> 395
    //   442: astore_1
    //   443: goto -139 -> 304
    //   446: astore_0
    //   447: goto -135 -> 312
    //   450: astore_1
    //   451: goto -31 -> 420
    //   454: astore_1
    //   455: goto -25 -> 430
    //   458: astore_0
    //   459: aconst_null
    //   460: astore_1
    //   461: goto -49 -> 412
    //   464: astore_0
    //   465: goto -53 -> 412
    //   468: astore_3
    //   469: aload_0
    //   470: astore 4
    //   472: aload_3
    //   473: astore_0
    //   474: goto -62 -> 412
    //   477: astore 4
    //   479: aconst_null
    //   480: astore_0
    //   481: aconst_null
    //   482: astore_1
    //   483: goto -197 -> 286
    //
    // Exception table:
    //   from	to	target	type
    //   237	255	279	java/io/IOException
    //   255	262	279	java/io/IOException
    //   267	276	279	java/io/IOException
    //   364	368	279	java/io/IOException
    //   56	64	376	java/io/IOException
    //   64	118	376	java/io/IOException
    //   122	150	376	java/io/IOException
    //   153	168	376	java/io/IOException
    //   179	187	376	java/io/IOException
    //   187	232	376	java/io/IOException
    //   232	237	376	java/io/IOException
    //   329	345	376	java/io/IOException
    //   351	361	376	java/io/IOException
    //   368	373	376	java/io/IOException
    //   41	56	406	finally
    //   390	395	438	java/io/IOException
    //   300	304	442	java/io/IOException
    //   308	312	446	java/io/IOException
    //   416	420	450	java/io/IOException
    //   425	430	454	java/io/IOException
    //   56	64	458	finally
    //   64	118	458	finally
    //   122	150	458	finally
    //   153	168	458	finally
    //   179	187	458	finally
    //   187	232	458	finally
    //   232	237	458	finally
    //   329	345	458	finally
    //   351	361	458	finally
    //   368	373	458	finally
    //   237	255	464	finally
    //   255	262	464	finally
    //   267	276	464	finally
    //   364	368	464	finally
    //   286	296	468	finally
    //   41	56	477	java/io/IOException
  }

  public static InputStream openRead(String paramString)
  {
    AppMethodBeat.i(54625);
    if ((paramString == null) || (paramString.isEmpty()))
    {
      paramString = new FileNotFoundException("path is empty");
      AppMethodBeat.o(54625);
      throw paramString;
    }
    paramString = b(j.parseUri(paramString), null);
    AppMethodBeat.o(54625);
    return paramString;
  }

  public static InputStream p(b paramb)
  {
    AppMethodBeat.i(54626);
    paramb = b(paramb.mUri, paramb.dMA());
    AppMethodBeat.o(54626);
    return paramb;
  }

  public static OutputStream pH(String paramString)
  {
    AppMethodBeat.i(138359);
    paramString = L(paramString, false);
    AppMethodBeat.o(138359);
    return paramString;
  }

  public static int q(String paramString, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(138360);
    int i = b(paramString, paramArrayOfByte, paramArrayOfByte.length);
    AppMethodBeat.o(138360);
    return i;
  }

  public static OutputStream q(b paramb)
  {
    AppMethodBeat.i(54629);
    paramb = a(paramb.mUri, paramb.dMA(), false);
    AppMethodBeat.o(54629);
    return paramb;
  }

  public static OutputStream r(b paramb)
  {
    AppMethodBeat.i(54631);
    paramb = a(paramb.mUri, paramb.dMA(), false);
    AppMethodBeat.o(54631);
    return paramb;
  }

  public static boolean tf(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(54644);
    if ((paramString == null) || (paramString.length() == 0))
      AppMethodBeat.o(54644);
    while (true)
    {
      return bool;
      paramString = new b(paramString);
      if ((paramString.mkdirs()) || (paramString.isDirectory()))
      {
        bool = true;
        AppMethodBeat.o(54644);
      }
      else
      {
        AppMethodBeat.o(54644);
      }
    }
  }

  // ERROR //
  public static long y(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: ldc2_w 539
    //   3: lstore_2
    //   4: ldc_w 541
    //   7: invokestatic 13	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   10: aload_0
    //   11: ifnull +21 -> 32
    //   14: aload_0
    //   15: invokevirtual 48	java/lang/String:length	()I
    //   18: ifeq +14 -> 32
    //   21: aload_1
    //   22: ifnull +10 -> 32
    //   25: aload_1
    //   26: invokevirtual 48	java/lang/String:length	()I
    //   29: ifne +15 -> 44
    //   32: ldc_w 541
    //   35: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   38: lload_2
    //   39: lstore 4
    //   41: lload 4
    //   43: lreturn
    //   44: aload_0
    //   45: aload_1
    //   46: invokevirtual 544	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   49: ifeq +15 -> 64
    //   52: ldc_w 541
    //   55: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   58: lload_2
    //   59: lstore 4
    //   61: goto -20 -> 41
    //   64: aconst_null
    //   65: astore 6
    //   67: aconst_null
    //   68: astore 7
    //   70: aconst_null
    //   71: astore 8
    //   73: aload_0
    //   74: invokestatic 324	com/tencent/mm/vfs/e:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   77: astore 9
    //   79: aload 7
    //   81: astore 6
    //   83: aload 9
    //   85: astore 7
    //   87: aload_1
    //   88: iconst_0
    //   89: invokestatic 82	com/tencent/mm/vfs/e:L	(Ljava/lang/String;Z)Ljava/io/OutputStream;
    //   92: astore 10
    //   94: sipush 1024
    //   97: newarray byte
    //   99: astore 7
    //   101: lconst_0
    //   102: lstore 4
    //   104: aload 9
    //   106: aload 7
    //   108: invokevirtual 228	java/io/InputStream:read	([B)I
    //   111: istore 11
    //   113: iload 11
    //   115: iconst_m1
    //   116: if_icmpeq +24 -> 140
    //   119: aload 10
    //   121: aload 7
    //   123: iconst_0
    //   124: iload 11
    //   126: invokevirtual 88	java/io/OutputStream:write	([BII)V
    //   129: lload 4
    //   131: iload 11
    //   133: i2l
    //   134: ladd
    //   135: lstore 4
    //   137: goto -33 -> 104
    //   140: ldc 94
    //   142: ldc_w 546
    //   145: iconst_2
    //   146: anewarray 4	java/lang/Object
    //   149: dup
    //   150: iconst_0
    //   151: aload_0
    //   152: aastore
    //   153: dup
    //   154: iconst_1
    //   155: aload_1
    //   156: aastore
    //   157: invokestatic 424	com/tencent/e/a/b:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   160: aload 9
    //   162: ifnull +8 -> 170
    //   165: aload 9
    //   167: invokevirtual 238	java/io/InputStream:close	()V
    //   170: aload 10
    //   172: ifnull +8 -> 180
    //   175: aload 10
    //   177: invokevirtual 92	java/io/OutputStream:close	()V
    //   180: ldc_w 541
    //   183: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   186: goto -145 -> 41
    //   189: astore 10
    //   191: aconst_null
    //   192: astore 9
    //   194: aload 8
    //   196: astore 6
    //   198: aload 9
    //   200: astore 7
    //   202: ldc 94
    //   204: ldc_w 548
    //   207: iconst_3
    //   208: anewarray 4	java/lang/Object
    //   211: dup
    //   212: iconst_0
    //   213: aload_0
    //   214: aastore
    //   215: dup
    //   216: iconst_1
    //   217: aload_1
    //   218: aastore
    //   219: dup
    //   220: iconst_2
    //   221: aload 10
    //   223: invokevirtual 117	java/io/IOException:getMessage	()Ljava/lang/String;
    //   226: aastore
    //   227: invokestatic 353	com/tencent/e/a/b:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   230: aload 9
    //   232: ifnull +8 -> 240
    //   235: aload 9
    //   237: invokevirtual 238	java/io/InputStream:close	()V
    //   240: aload 8
    //   242: ifnull +8 -> 250
    //   245: aload 8
    //   247: invokevirtual 92	java/io/OutputStream:close	()V
    //   250: ldc_w 541
    //   253: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   256: lload_2
    //   257: lstore 4
    //   259: goto -218 -> 41
    //   262: astore_0
    //   263: aconst_null
    //   264: astore 9
    //   266: aload 9
    //   268: ifnull +8 -> 276
    //   271: aload 9
    //   273: invokevirtual 238	java/io/InputStream:close	()V
    //   276: aload 6
    //   278: ifnull +8 -> 286
    //   281: aload 6
    //   283: invokevirtual 92	java/io/OutputStream:close	()V
    //   286: ldc_w 541
    //   289: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   292: aload_0
    //   293: athrow
    //   294: astore_0
    //   295: goto -125 -> 170
    //   298: astore_0
    //   299: goto -119 -> 180
    //   302: astore_0
    //   303: goto -63 -> 240
    //   306: astore_0
    //   307: goto -57 -> 250
    //   310: astore_1
    //   311: goto -35 -> 276
    //   314: astore_1
    //   315: goto -29 -> 286
    //   318: astore_0
    //   319: aload 7
    //   321: astore 9
    //   323: goto -57 -> 266
    //   326: astore_0
    //   327: aload 10
    //   329: astore 6
    //   331: goto -65 -> 266
    //   334: astore 10
    //   336: goto -142 -> 194
    //   339: astore 7
    //   341: aload 10
    //   343: astore 8
    //   345: aload 7
    //   347: astore 10
    //   349: goto -155 -> 194
    //
    // Exception table:
    //   from	to	target	type
    //   73	79	189	java/io/IOException
    //   73	79	262	finally
    //   165	170	294	java/io/IOException
    //   175	180	298	java/io/IOException
    //   235	240	302	java/io/IOException
    //   245	250	306	java/io/IOException
    //   271	276	310	java/io/IOException
    //   281	286	314	java/io/IOException
    //   87	94	318	finally
    //   202	230	318	finally
    //   94	101	326	finally
    //   104	113	326	finally
    //   119	129	326	finally
    //   140	160	326	finally
    //   87	94	334	java/io/IOException
    //   94	101	339	java/io/IOException
    //   104	113	339	java/io/IOException
    //   119	129	339	java/io/IOException
    //   140	160	339	java/io/IOException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.vfs.e
 * JD-Core Version:    0.6.2
 */
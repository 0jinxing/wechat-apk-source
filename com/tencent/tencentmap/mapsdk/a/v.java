package com.tencent.tencentmap.mapsdk.a;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Stack;

public class v
{
  public static final long a(InputStream paramInputStream, OutputStream paramOutputStream)
  {
    AppMethodBeat.i(98285);
    long l;
    if ((paramInputStream == null) || (paramOutputStream == null))
    {
      AppMethodBeat.o(98285);
      l = -1L;
    }
    while (true)
    {
      return l;
      try
      {
        byte[] arrayOfByte = new byte[4096];
        int i;
        for (l = 0L; ; l += i)
        {
          i = paramInputStream.read(arrayOfByte);
          if (i <= 0)
            break;
          paramOutputStream.write(arrayOfByte, 0, i);
        }
        AppMethodBeat.o(98285);
      }
      catch (IOException paramInputStream)
      {
        AppMethodBeat.o(98285);
        l = -1L;
      }
    }
  }

  public static void a(Bitmap paramBitmap)
  {
    AppMethodBeat.i(98289);
    if ((paramBitmap != null) && (!paramBitmap.isRecycled()))
      paramBitmap.recycle();
    AppMethodBeat.o(98289);
  }

  public static final void a(Closeable paramCloseable)
  {
    AppMethodBeat.i(98283);
    if (paramCloseable != null);
    while (true)
    {
      try
      {
        paramCloseable.close();
        AppMethodBeat.o(98283);
        return;
      }
      catch (IOException paramCloseable)
      {
      }
      AppMethodBeat.o(98283);
    }
  }

  public static boolean a(String paramString)
  {
    boolean bool1 = false;
    AppMethodBeat.i(98286);
    if (TextUtils.isEmpty(paramString))
      AppMethodBeat.o(98286);
    while (true)
    {
      return bool1;
      try
      {
        File localFile = new java/io/File;
        localFile.<init>(paramString);
        boolean bool2;
        if (localFile.exists())
        {
          bool2 = localFile.isDirectory();
          if (bool2)
          {
            bool1 = true;
            AppMethodBeat.o(98286);
          }
        }
        else
        {
          if ((localFile.exists()) && (localFile.isFile()))
            localFile.delete();
          bool2 = localFile.mkdirs();
          bool1 = bool2;
          AppMethodBeat.o(98286);
        }
      }
      catch (Exception paramString)
      {
        AppMethodBeat.o(98286);
      }
    }
  }

  // ERROR //
  public static final byte[] a(InputStream paramInputStream)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: ldc 87
    //   4: invokestatic 15	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: aload_0
    //   8: ifnonnull +12 -> 20
    //   11: ldc 87
    //   13: invokestatic 18	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   16: aload_1
    //   17: astore_0
    //   18: aload_0
    //   19: areturn
    //   20: new 89	java/io/ByteArrayOutputStream
    //   23: astore_2
    //   24: aload_2
    //   25: invokespecial 91	java/io/ByteArrayOutputStream:<init>	()V
    //   28: sipush 4096
    //   31: newarray byte
    //   33: astore_3
    //   34: aload_0
    //   35: aload_3
    //   36: iconst_0
    //   37: sipush 4096
    //   40: invokevirtual 94	java/io/InputStream:read	([BII)I
    //   43: istore 4
    //   45: iload 4
    //   47: iconst_m1
    //   48: if_icmpeq +29 -> 77
    //   51: aload_2
    //   52: aload_3
    //   53: iconst_0
    //   54: iload 4
    //   56: invokevirtual 95	java/io/ByteArrayOutputStream:write	([BII)V
    //   59: goto -25 -> 34
    //   62: astore_0
    //   63: aload_2
    //   64: invokestatic 97	com/tencent/tencentmap/mapsdk/a/v:a	(Ljava/io/Closeable;)V
    //   67: ldc 87
    //   69: invokestatic 18	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   72: aload_1
    //   73: astore_0
    //   74: goto -56 -> 18
    //   77: aload_2
    //   78: invokevirtual 100	java/io/ByteArrayOutputStream:flush	()V
    //   81: aload_2
    //   82: invokevirtual 104	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   85: astore_0
    //   86: aload_2
    //   87: invokestatic 97	com/tencent/tencentmap/mapsdk/a/v:a	(Ljava/io/Closeable;)V
    //   90: ldc 87
    //   92: invokestatic 18	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   95: goto -77 -> 18
    //   98: astore_0
    //   99: aconst_null
    //   100: astore_2
    //   101: aload_2
    //   102: invokestatic 97	com/tencent/tencentmap/mapsdk/a/v:a	(Ljava/io/Closeable;)V
    //   105: ldc 87
    //   107: invokestatic 18	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   110: aload_0
    //   111: athrow
    //   112: astore_0
    //   113: goto -12 -> 101
    //   116: astore_0
    //   117: aconst_null
    //   118: astore_2
    //   119: goto -56 -> 63
    //
    // Exception table:
    //   from	to	target	type
    //   28	34	62	java/lang/Throwable
    //   34	45	62	java/lang/Throwable
    //   51	59	62	java/lang/Throwable
    //   77	86	62	java/lang/Throwable
    //   20	28	98	finally
    //   28	34	112	finally
    //   34	45	112	finally
    //   51	59	112	finally
    //   77	86	112	finally
    //   20	28	116	java/lang/Throwable
  }

  public static final InputStream b(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(98287);
    if (TextUtils.isEmpty(paramString))
    {
      AppMethodBeat.o(98287);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      try
      {
        File localFile = new java/io/File;
        localFile.<init>(paramString);
        if ((localFile.exists()) && (localFile.isFile()) && (localFile.canRead()))
        {
          paramString = new java/io/FileInputStream;
          paramString.<init>(localFile);
          AppMethodBeat.o(98287);
        }
      }
      catch (IOException paramString)
      {
        AppMethodBeat.o(98287);
        paramString = localObject;
      }
    }
  }

  public static boolean c(String paramString)
  {
    AppMethodBeat.i(98288);
    boolean bool;
    if (TextUtils.isEmpty(paramString))
    {
      AppMethodBeat.o(98288);
      bool = false;
    }
    while (true)
    {
      return bool;
      Stack localStack = new Stack();
      localStack.push(paramString);
      while (!localStack.isEmpty())
      {
        File localFile = new File((String)localStack.peek());
        if (localFile.exists())
        {
          if (localFile.isDirectory())
          {
            paramString = localFile.listFiles();
            if ((paramString == null) || (paramString.length == 0))
            {
              localFile.delete();
              localStack.pop();
            }
            else
            {
              int i = paramString.length;
              int j = 0;
              label105: if (j < i)
              {
                localFile = paramString[j];
                if (!localFile.isDirectory())
                  break label139;
                localStack.push(localFile.getAbsolutePath());
              }
              while (true)
              {
                j++;
                break label105;
                break;
                label139: localFile.delete();
              }
            }
          }
          else
          {
            localFile.delete();
            localStack.pop();
          }
        }
        else
          localStack.pop();
      }
      bool = true;
      AppMethodBeat.o(98288);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.v
 * JD-Core Version:    0.6.2
 */
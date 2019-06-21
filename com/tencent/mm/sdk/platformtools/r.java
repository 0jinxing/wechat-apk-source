package com.tencent.mm.sdk.platformtools;

import android.graphics.BitmapFactory.Options;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.graphics.MMBitmapFactory;
import com.tencent.mm.vfs.e;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

public final class r
{
  public static boolean amn(String paramString)
  {
    Object localObject = null;
    String str = null;
    boolean bool1 = true;
    boolean bool2 = false;
    AppMethodBeat.i(93394);
    if ((paramString == null) || (paramString.length() == 0))
    {
      ab.e("MicroMsg.ImgUtil", "isImgFile, invalid argument");
      AppMethodBeat.o(93394);
    }
    while (true)
    {
      return bool2;
      if (paramString.length() < 3)
      {
        AppMethodBeat.o(93394);
      }
      else if (!e.ct(paramString))
      {
        AppMethodBeat.o(93394);
      }
      else
      {
        BitmapFactory.Options localOptions = new BitmapFactory.Options();
        localOptions.inJustDecodeBounds = true;
        try
        {
          paramString = e.openRead(paramString);
          str = paramString;
          localObject = paramString;
          MMBitmapFactory.decodeStream(paramString, null, localOptions);
          str = paramString;
          localObject = paramString;
          if (localOptions.outWidth > 0)
          {
            str = paramString;
            localObject = paramString;
            int i = localOptions.outHeight;
            if (i <= 0);
          }
          for (bool2 = bool1; ; bool2 = false)
          {
            bo.b(paramString);
            AppMethodBeat.o(93394);
            break;
          }
        }
        catch (Throwable paramString)
        {
          localObject = str;
          ab.printErrStackTrace("MicroMsg.ImgUtil", paramString, "unexpected exception.", new Object[0]);
          bo.b(str);
          AppMethodBeat.o(93394);
        }
        finally
        {
          bo.b((Closeable)localObject);
          AppMethodBeat.o(93394);
        }
      }
    }
    throw paramString;
  }

  // ERROR //
  public static boolean amo(String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: ldc 85
    //   4: invokestatic 15	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: new 87	com/tencent/mm/vfs/d
    //   10: astore_2
    //   11: aload_2
    //   12: aload_0
    //   13: invokespecial 90	com/tencent/mm/vfs/d:<init>	(Ljava/lang/String;)V
    //   16: bipush 6
    //   18: newarray byte
    //   20: astore_3
    //   21: ldc 92
    //   23: astore_0
    //   24: aload_2
    //   25: aload_3
    //   26: invokevirtual 98	java/io/InputStream:read	([B)I
    //   29: pop
    //   30: iconst_0
    //   31: istore 4
    //   33: iload 4
    //   35: bipush 6
    //   37: if_icmpge +37 -> 74
    //   40: new 100	java/lang/StringBuilder
    //   43: astore 5
    //   45: aload 5
    //   47: invokespecial 101	java/lang/StringBuilder:<init>	()V
    //   50: aload 5
    //   52: aload_0
    //   53: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   56: aload_3
    //   57: iload 4
    //   59: baload
    //   60: i2c
    //   61: invokevirtual 108	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   64: invokevirtual 112	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   67: astore_0
    //   68: iinc 4 1
    //   71: goto -38 -> 33
    //   74: aload_0
    //   75: ldc 114
    //   77: invokevirtual 117	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   80: istore 6
    //   82: iload 6
    //   84: ifne +14 -> 98
    //   87: aload_2
    //   88: invokevirtual 120	java/io/InputStream:close	()V
    //   91: ldc 85
    //   93: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   96: iload_1
    //   97: ireturn
    //   98: aload_2
    //   99: invokevirtual 120	java/io/InputStream:close	()V
    //   102: iconst_1
    //   103: istore_1
    //   104: ldc 85
    //   106: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   109: goto -13 -> 96
    //   112: astore_0
    //   113: aconst_null
    //   114: astore_2
    //   115: aload_2
    //   116: ifnull +7 -> 123
    //   119: aload_2
    //   120: invokevirtual 120	java/io/InputStream:close	()V
    //   123: ldc 85
    //   125: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   128: goto -32 -> 96
    //   131: astore_0
    //   132: aconst_null
    //   133: astore_2
    //   134: aload_2
    //   135: ifnull +7 -> 142
    //   138: aload_2
    //   139: invokevirtual 120	java/io/InputStream:close	()V
    //   142: ldc 85
    //   144: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   147: aload_0
    //   148: athrow
    //   149: astore_0
    //   150: goto -59 -> 91
    //   153: astore_0
    //   154: goto -52 -> 102
    //   157: astore_0
    //   158: goto -35 -> 123
    //   161: astore_2
    //   162: goto -20 -> 142
    //   165: astore_0
    //   166: goto -32 -> 134
    //   169: astore_0
    //   170: goto -55 -> 115
    //
    // Exception table:
    //   from	to	target	type
    //   7	16	112	java/lang/Exception
    //   7	16	131	finally
    //   87	91	149	java/io/IOException
    //   98	102	153	java/io/IOException
    //   119	123	157	java/io/IOException
    //   138	142	161	java/io/IOException
    //   16	21	165	finally
    //   24	30	165	finally
    //   40	68	165	finally
    //   74	82	165	finally
    //   16	21	169	java/lang/Exception
    //   24	30	169	java/lang/Exception
    //   40	68	169	java/lang/Exception
    //   74	82	169	java/lang/Exception
  }

  // ERROR //
  public static boolean amp(String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: ldc 122
    //   4: invokestatic 15	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: new 87	com/tencent/mm/vfs/d
    //   10: astore_2
    //   11: aload_2
    //   12: aload_0
    //   13: invokespecial 90	com/tencent/mm/vfs/d:<init>	(Ljava/lang/String;)V
    //   16: bipush 8
    //   18: newarray byte
    //   20: astore_3
    //   21: ldc 92
    //   23: astore_0
    //   24: aload_2
    //   25: aload_3
    //   26: invokevirtual 98	java/io/InputStream:read	([B)I
    //   29: pop
    //   30: iconst_0
    //   31: istore 4
    //   33: iload 4
    //   35: bipush 8
    //   37: if_icmpge +37 -> 74
    //   40: new 100	java/lang/StringBuilder
    //   43: astore 5
    //   45: aload 5
    //   47: invokespecial 101	java/lang/StringBuilder:<init>	()V
    //   50: aload 5
    //   52: aload_0
    //   53: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   56: aload_3
    //   57: iload 4
    //   59: baload
    //   60: i2c
    //   61: invokevirtual 108	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   64: invokevirtual 112	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   67: astore_0
    //   68: iinc 4 1
    //   71: goto -38 -> 33
    //   74: aload_0
    //   75: ldc 124
    //   77: invokevirtual 117	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   80: istore 6
    //   82: iload 6
    //   84: ifne +14 -> 98
    //   87: aload_2
    //   88: invokevirtual 120	java/io/InputStream:close	()V
    //   91: ldc 122
    //   93: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   96: iload_1
    //   97: ireturn
    //   98: aload_2
    //   99: invokevirtual 120	java/io/InputStream:close	()V
    //   102: iconst_1
    //   103: istore_1
    //   104: ldc 122
    //   106: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   109: goto -13 -> 96
    //   112: astore_0
    //   113: aconst_null
    //   114: astore_2
    //   115: aload_2
    //   116: ifnull +7 -> 123
    //   119: aload_2
    //   120: invokevirtual 120	java/io/InputStream:close	()V
    //   123: ldc 122
    //   125: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   128: goto -32 -> 96
    //   131: astore_0
    //   132: aconst_null
    //   133: astore_2
    //   134: aload_2
    //   135: ifnull +7 -> 142
    //   138: aload_2
    //   139: invokevirtual 120	java/io/InputStream:close	()V
    //   142: ldc 122
    //   144: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   147: aload_0
    //   148: athrow
    //   149: astore_0
    //   150: goto -59 -> 91
    //   153: astore_0
    //   154: goto -52 -> 102
    //   157: astore_0
    //   158: goto -35 -> 123
    //   161: astore_2
    //   162: goto -20 -> 142
    //   165: astore_0
    //   166: goto -32 -> 134
    //   169: astore_0
    //   170: goto -55 -> 115
    //
    // Exception table:
    //   from	to	target	type
    //   7	16	112	java/lang/Exception
    //   7	16	131	finally
    //   87	91	149	java/io/IOException
    //   98	102	153	java/io/IOException
    //   119	123	157	java/io/IOException
    //   138	142	161	java/io/IOException
    //   16	21	165	finally
    //   24	30	165	finally
    //   40	68	165	finally
    //   74	82	165	finally
    //   16	21	169	java/lang/Exception
    //   24	30	169	java/lang/Exception
    //   40	68	169	java/lang/Exception
    //   74	82	169	java/lang/Exception
  }

  public static String amq(String paramString)
  {
    AppMethodBeat.i(93399);
    if ((paramString == null) || (paramString.equals("")))
    {
      paramString = "";
      AppMethodBeat.o(93399);
    }
    while (true)
    {
      return paramString;
      paramString = bV(e.e(paramString, 0, 2));
      AppMethodBeat.o(93399);
    }
  }

  public static boolean bS(byte[] paramArrayOfByte)
  {
    boolean bool = false;
    AppMethodBeat.i(93395);
    if (paramArrayOfByte == null)
      AppMethodBeat.o(93395);
    while (true)
    {
      return bool;
      ByteArrayInputStream localByteArrayInputStream = new ByteArrayInputStream(paramArrayOfByte);
      paramArrayOfByte = "";
      int i = 0;
      while (true)
      {
        if (i >= 6)
          break label81;
        try
        {
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          paramArrayOfByte = paramArrayOfByte + (char)localByteArrayInputStream.read();
          i++;
        }
        catch (IOException paramArrayOfByte)
        {
          AppMethodBeat.o(93395);
        }
      }
      continue;
      try
      {
        label81: localByteArrayInputStream.close();
        label85: if (!paramArrayOfByte.startsWith("GIF"))
        {
          AppMethodBeat.o(93395);
          continue;
        }
        bool = true;
        AppMethodBeat.o(93395);
      }
      catch (IOException localIOException)
      {
        break label85;
      }
    }
  }

  public static boolean bT(byte[] paramArrayOfByte)
  {
    boolean bool1 = true;
    boolean bool2;
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length < 4))
      bool2 = false;
    while (true)
    {
      return bool2;
      if ((paramArrayOfByte[1] == 80) && (paramArrayOfByte[2] == 78))
      {
        bool2 = bool1;
        if (paramArrayOfByte[3] == 71);
      }
      else if ((paramArrayOfByte[0] == 71) && (paramArrayOfByte[1] == 73))
      {
        bool2 = bool1;
        if (paramArrayOfByte[2] == 70);
      }
      else if ((paramArrayOfByte[6] == 74) && (paramArrayOfByte[7] == 70) && (paramArrayOfByte[8] == 73))
      {
        bool2 = bool1;
        if (paramArrayOfByte[9] == 70);
      }
      else if ((paramArrayOfByte[0] == 119) && (paramArrayOfByte[1] == 120) && (paramArrayOfByte[2] == 103))
      {
        bool2 = bool1;
        if (paramArrayOfByte[3] == 102);
      }
      else
      {
        bool2 = false;
      }
    }
  }

  public static boolean bU(byte[] paramArrayOfByte)
  {
    boolean bool = false;
    AppMethodBeat.i(93398);
    if (paramArrayOfByte == null)
      AppMethodBeat.o(93398);
    while (true)
    {
      return bool;
      ByteArrayInputStream localByteArrayInputStream = new ByteArrayInputStream(paramArrayOfByte);
      paramArrayOfByte = "";
      int i = 0;
      while (true)
      {
        if (i >= 8)
          break label81;
        try
        {
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          paramArrayOfByte = paramArrayOfByte + (char)localByteArrayInputStream.read();
          i++;
        }
        catch (IOException paramArrayOfByte)
        {
          AppMethodBeat.o(93398);
        }
      }
      continue;
      try
      {
        label81: localByteArrayInputStream.close();
        label85: if (!paramArrayOfByte.startsWith("wxgf"))
        {
          AppMethodBeat.o(93398);
          continue;
        }
        bool = true;
        AppMethodBeat.o(93398);
      }
      catch (IOException localIOException)
      {
        break label85;
      }
    }
  }

  private static String bV(byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length < 2))
      paramArrayOfByte = "";
    while (true)
    {
      return paramArrayOfByte;
      int i = paramArrayOfByte[0];
      int j = i;
      if (i < 0)
        j = i + 256;
      int k = paramArrayOfByte[1];
      i = k;
      if (k < 0)
        i = k + 256;
      if ((j == 66) && (i == 77))
        paramArrayOfByte = ".bmp";
      else if ((j == 255) && (i == 216))
        paramArrayOfByte = ".jpg";
      else if ((j == 137) && (i == 80))
        paramArrayOfByte = ".png";
      else if ((j == 71) && (i == 73))
        paramArrayOfByte = ".gif";
      else
        paramArrayOfByte = ".jpg";
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.r
 * JD-Core Version:    0.6.2
 */
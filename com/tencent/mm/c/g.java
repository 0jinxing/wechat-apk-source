package com.tencent.mm.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.InputStream;
import java.security.MessageDigest;

public final class g
{
  // ERROR //
  public static String a(File paramFile, int paramInt, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: ldc 11
    //   2: invokestatic 17	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: invokevirtual 23	java/io/File:exists	()Z
    //   9: ifeq +7 -> 16
    //   12: iload_1
    //   13: ifgt +12 -> 25
    //   16: ldc 11
    //   18: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   21: aconst_null
    //   22: astore_0
    //   23: aload_0
    //   24: areturn
    //   25: new 28	java/io/FileInputStream
    //   28: astore_3
    //   29: aload_3
    //   30: aload_0
    //   31: invokespecial 32	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   34: aload_3
    //   35: iload_1
    //   36: aload_2
    //   37: invokestatic 35	com/tencent/mm/c/g:a	(Ljava/io/InputStream;I[B)Ljava/lang/String;
    //   40: astore_0
    //   41: aload_3
    //   42: invokevirtual 39	java/io/FileInputStream:close	()V
    //   45: aload_3
    //   46: invokevirtual 39	java/io/FileInputStream:close	()V
    //   49: ldc 11
    //   51: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   54: goto -31 -> 23
    //   57: astore_0
    //   58: aconst_null
    //   59: astore_3
    //   60: aload_3
    //   61: ifnull +7 -> 68
    //   64: aload_3
    //   65: invokevirtual 39	java/io/FileInputStream:close	()V
    //   68: ldc 11
    //   70: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   73: aconst_null
    //   74: astore_0
    //   75: goto -52 -> 23
    //   78: astore_0
    //   79: aconst_null
    //   80: astore_3
    //   81: aload_3
    //   82: ifnull +7 -> 89
    //   85: aload_3
    //   86: invokevirtual 39	java/io/FileInputStream:close	()V
    //   89: ldc 11
    //   91: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   94: aload_0
    //   95: athrow
    //   96: astore_2
    //   97: goto -48 -> 49
    //   100: astore_0
    //   101: goto -33 -> 68
    //   104: astore_2
    //   105: goto -16 -> 89
    //   108: astore_0
    //   109: goto -28 -> 81
    //   112: astore_0
    //   113: goto -53 -> 60
    //
    // Exception table:
    //   from	to	target	type
    //   25	34	57	java/lang/Exception
    //   25	34	78	finally
    //   45	49	96	java/io/IOException
    //   64	68	100	java/io/IOException
    //   85	89	104	java/io/IOException
    //   34	45	108	finally
    //   34	45	112	java/lang/Exception
  }

  private static String a(InputStream paramInputStream, int paramInt, byte[] paramArrayOfByte)
  {
    Object localObject = null;
    int i = 0;
    AppMethodBeat.i(125688);
    if (paramInt <= 0)
    {
      AppMethodBeat.o(125688);
      paramInputStream = localObject;
    }
    while (true)
    {
      return paramInputStream;
      try
      {
        long l = paramInputStream.skip(0L);
        if (l < 0L)
        {
          AppMethodBeat.o(125688);
          paramInputStream = localObject;
        }
        else
        {
          MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>(32);
          byte[] arrayOfByte = new byte[102400];
          int j = 0;
          label75: int k = paramInputStream.read(arrayOfByte);
          if ((k == -1) || (j >= paramInt))
          {
            if ((paramArrayOfByte != null) && (paramArrayOfByte.length > 0))
              localMessageDigest.update(paramArrayOfByte);
            paramInputStream = localMessageDigest.digest();
          }
          for (paramInt = i; ; paramInt++)
          {
            if (paramInt >= paramInputStream.length)
            {
              paramInputStream = localStringBuilder.toString();
              AppMethodBeat.o(125688);
              break;
              if (j + k <= paramInt)
              {
                localMessageDigest.update(arrayOfByte, 0, k);
                j += k;
                break label75;
              }
              localMessageDigest.update(arrayOfByte, 0, paramInt - j);
              j = paramInt;
              break label75;
            }
            localStringBuilder.append(Integer.toString((paramInputStream[paramInt] & 0xFF) + 256, 16).substring(1));
          }
        }
      }
      catch (Exception paramInputStream)
      {
        AppMethodBeat.o(125688);
        paramInputStream = localObject;
      }
    }
  }

  private static String b(InputStream paramInputStream, int paramInt)
  {
    Object localObject = null;
    int i = 0;
    AppMethodBeat.i(125689);
    if (paramInt <= 0)
    {
      AppMethodBeat.o(125689);
      paramInputStream = localObject;
      return paramInputStream;
    }
    while (true)
    {
      StringBuilder localStringBuilder;
      try
      {
        MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>(32);
        byte[] arrayOfByte = new byte[paramInt];
        paramInt = paramInputStream.read(arrayOfByte);
        if (paramInt == -1)
        {
          paramInputStream = localMessageDigest.digest();
          paramInt = i;
          if (paramInt < paramInputStream.length)
            break label109;
          paramInputStream = localStringBuilder.toString();
          AppMethodBeat.o(125689);
          break;
        }
        localMessageDigest.update(arrayOfByte, 0, paramInt);
        continue;
      }
      catch (Exception paramInputStream)
      {
        AppMethodBeat.o(125689);
        paramInputStream = localObject;
      }
      break;
      label109: localStringBuilder.append(Integer.toString((paramInputStream[paramInt] & 0xFF) + 256, 16).substring(1));
      paramInt++;
    }
  }

  public static String cz(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(125690);
    if (paramString == null)
    {
      AppMethodBeat.o(125690);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      paramString = new File(paramString);
      if (paramString.exists())
      {
        paramString = v(paramString);
        AppMethodBeat.o(125690);
      }
      else
      {
        AppMethodBeat.o(125690);
        paramString = localObject;
      }
    }
  }

  // ERROR //
  private static String v(File paramFile)
  {
    // Byte code:
    //   0: ldc2_w 108
    //   3: lstore_1
    //   4: aconst_null
    //   5: astore_3
    //   6: ldc 110
    //   8: invokestatic 17	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   11: aload_0
    //   12: invokevirtual 23	java/io/File:exists	()Z
    //   15: ifne +12 -> 27
    //   18: ldc 110
    //   20: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   23: aload_3
    //   24: astore_0
    //   25: aload_0
    //   26: areturn
    //   27: new 28	java/io/FileInputStream
    //   30: astore 4
    //   32: aload 4
    //   34: aload_0
    //   35: invokespecial 32	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   38: ldc2_w 108
    //   41: aload_0
    //   42: invokevirtual 114	java/io/File:length	()J
    //   45: lcmp
    //   46: ifgt +29 -> 75
    //   49: aload 4
    //   51: lload_1
    //   52: l2i
    //   53: invokestatic 116	com/tencent/mm/c/g:b	(Ljava/io/InputStream;I)Ljava/lang/String;
    //   56: astore_0
    //   57: aload 4
    //   59: invokevirtual 39	java/io/FileInputStream:close	()V
    //   62: aload 4
    //   64: invokevirtual 39	java/io/FileInputStream:close	()V
    //   67: ldc 110
    //   69: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   72: goto -47 -> 25
    //   75: aload_0
    //   76: invokevirtual 114	java/io/File:length	()J
    //   79: lstore_1
    //   80: goto -31 -> 49
    //   83: astore_0
    //   84: aconst_null
    //   85: astore 4
    //   87: aload 4
    //   89: ifnull +8 -> 97
    //   92: aload 4
    //   94: invokevirtual 39	java/io/FileInputStream:close	()V
    //   97: ldc 110
    //   99: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   102: aload_3
    //   103: astore_0
    //   104: goto -79 -> 25
    //   107: astore_0
    //   108: aconst_null
    //   109: astore 4
    //   111: aload 4
    //   113: ifnull +8 -> 121
    //   116: aload 4
    //   118: invokevirtual 39	java/io/FileInputStream:close	()V
    //   121: ldc 110
    //   123: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   126: aload_0
    //   127: athrow
    //   128: astore 4
    //   130: goto -63 -> 67
    //   133: astore_0
    //   134: goto -37 -> 97
    //   137: astore 4
    //   139: goto -18 -> 121
    //   142: astore_0
    //   143: goto -32 -> 111
    //   146: astore_0
    //   147: goto -60 -> 87
    //
    // Exception table:
    //   from	to	target	type
    //   27	38	83	java/lang/Exception
    //   27	38	107	finally
    //   62	67	128	java/io/IOException
    //   92	97	133	java/io/IOException
    //   116	121	137	java/io/IOException
    //   38	49	142	finally
    //   49	62	142	finally
    //   75	80	142	finally
    //   38	49	146	java/lang/Exception
    //   49	62	146	java/lang/Exception
    //   75	80	146	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.c.g
 * JD-Core Version:    0.6.2
 */
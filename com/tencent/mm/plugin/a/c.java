package com.tencent.mm.plugin.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.RandomAccessFile;
import java.util.Arrays;

public final class c
{
  public static long B(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(117834);
    byte[] arrayOfByte = new byte[8];
    Arrays.fill(arrayOfByte, (byte)0);
    System.arraycopy(paramArrayOfByte, paramInt, arrayOfByte, 4, 4);
    long l = af(arrayOfByte);
    AppMethodBeat.o(117834);
    return l;
  }

  public static a a(RandomAccessFile paramRandomAccessFile, byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(117835);
    try
    {
      i = paramRandomAccessFile.read(paramArrayOfByte);
      if (i >= 8)
      {
        j = readInt(paramArrayOfByte, 0);
        k = readInt(paramArrayOfByte, 4);
        if (k == paramInt)
        {
          l = paramRandomAccessFile.getFilePointer() - i;
          if (k == a.aWk)
          {
            paramRandomAccessFile = new com/tencent/mm/plugin/a/i;
            paramRandomAccessFile.<init>(j, l, k);
          }
          while (true)
          {
            AppMethodBeat.o(117835);
            return paramRandomAccessFile;
            if (k != a.aWl)
              break;
            paramRandomAccessFile = new e(j, l, k);
          }
        }
      }
    }
    catch (Exception paramRandomAccessFile)
    {
      while (true)
      {
        int i;
        int j;
        int k;
        long l;
        ab.printErrStackTrace("MicroMsg.AtomUtil", paramRandomAccessFile, "", new Object[0]);
        ab.e("MicroMsg.AtomUtil", "find Atom error: " + paramRandomAccessFile.toString());
        paramRandomAccessFile = null;
        continue;
        if (k == a.aWn)
        {
          paramRandomAccessFile = new h(j, l, k);
        }
        else
        {
          paramRandomAccessFile = new a(j, l, k, 0L);
          continue;
          if ((k == a.aWi) || (k == a.aWm))
            i = paramRandomAccessFile.read(paramArrayOfByte);
          else if (a(paramRandomAccessFile, j - 8))
            i = paramRandomAccessFile.read(paramArrayOfByte);
          else
            paramRandomAccessFile = null;
        }
      }
    }
  }

  public static boolean a(RandomAccessFile paramRandomAccessFile, long paramLong)
  {
    AppMethodBeat.i(117836);
    long l = 0L;
    while (paramLong > 2147483647L)
    {
      l += paramRandomAccessFile.skipBytes(2147483647);
      paramLong -= 2147483647L;
    }
    l += paramRandomAccessFile.skipBytes((int)paramLong);
    boolean bool;
    if (l != paramLong)
    {
      ab.w("MicroMsg.AtomUtil", "can not skip.skip: " + paramLong + " trueSkip : " + l);
      bool = false;
      AppMethodBeat.o(117836);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(117836);
    }
  }

  public static int aT(String paramString)
  {
    AppMethodBeat.i(117833);
    int i = paramString.length();
    int j = 0;
    int m;
    for (int k = 0; j < i; k = k << 8 | m)
    {
      m = paramString.charAt(j);
      j++;
    }
    AppMethodBeat.o(117833);
    return k;
  }

  public static long af(byte[] paramArrayOfByte)
  {
    return (paramArrayOfByte[0] & 0xFF) << 56 | (paramArrayOfByte[1] & 0xFF) << 48 | (paramArrayOfByte[2] & 0xFF) << 40 | (paramArrayOfByte[3] & 0xFF) << 32 | (paramArrayOfByte[4] & 0xFF) << 24 | (paramArrayOfByte[5] & 0xFF) << 16 | (paramArrayOfByte[6] & 0xFF) << 8 | paramArrayOfByte[7] & 0xFF;
  }

  public static boolean isNullOrNil(String paramString)
  {
    AppMethodBeat.i(117832);
    boolean bool;
    if ((paramString == null) || (paramString.length() <= 0))
    {
      bool = true;
      AppMethodBeat.o(117832);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(117832);
    }
  }

  public static int readInt(byte[] paramArrayOfByte, int paramInt)
  {
    int i = paramInt + 1;
    paramInt = paramArrayOfByte[paramInt];
    int j = i + 1;
    return (paramArrayOfByte[i] & 0xFF) << 16 | (paramInt & 0xFF) << 24 | (paramArrayOfByte[j] & 0xFF) << 8 | paramArrayOfByte[(j + 1)] & 0xFF;
  }

  // ERROR //
  public static boolean vC(String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: ldc 158
    //   4: invokestatic 13	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: aload_0
    //   8: invokestatic 160	com/tencent/mm/plugin/a/c:isNullOrNil	(Ljava/lang/String;)Z
    //   11: ifeq +10 -> 21
    //   14: ldc 158
    //   16: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   19: iload_1
    //   20: ireturn
    //   21: new 162	java/io/FileInputStream
    //   24: astore_2
    //   25: aload_2
    //   26: aload_0
    //   27: invokespecial 163	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   30: aload_2
    //   31: astore_0
    //   32: bipush 8
    //   34: newarray byte
    //   36: astore_3
    //   37: aload_2
    //   38: astore_0
    //   39: aload_2
    //   40: aload_3
    //   41: iconst_0
    //   42: bipush 8
    //   44: invokevirtual 168	java/io/InputStream:read	([BII)I
    //   47: istore 4
    //   49: iload 4
    //   51: bipush 8
    //   53: if_icmpge +31 -> 84
    //   56: aload_2
    //   57: invokevirtual 172	java/io/InputStream:close	()V
    //   60: ldc 158
    //   62: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   65: goto -46 -> 19
    //   68: astore_0
    //   69: ldc 72
    //   71: aload_0
    //   72: ldc 74
    //   74: iconst_0
    //   75: anewarray 4	java/lang/Object
    //   78: invokestatic 80	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   81: goto -21 -> 60
    //   84: aload_2
    //   85: astore_0
    //   86: aload_3
    //   87: iconst_0
    //   88: invokestatic 48	com/tencent/mm/plugin/a/c:readInt	([BI)I
    //   91: istore 5
    //   93: aload_2
    //   94: astore_0
    //   95: aload_3
    //   96: iconst_4
    //   97: invokestatic 48	com/tencent/mm/plugin/a/c:readInt	([BI)I
    //   100: istore 4
    //   102: aload_2
    //   103: astore_0
    //   104: getstatic 175	com/tencent/mm/plugin/a/a:aVH	I
    //   107: istore 6
    //   109: iload 4
    //   111: iload 6
    //   113: if_icmpne +38 -> 151
    //   116: iload 5
    //   118: ifle +33 -> 151
    //   121: aload_2
    //   122: invokevirtual 172	java/io/InputStream:close	()V
    //   125: iconst_1
    //   126: istore_1
    //   127: ldc 158
    //   129: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   132: goto -113 -> 19
    //   135: astore_0
    //   136: ldc 72
    //   138: aload_0
    //   139: ldc 74
    //   141: iconst_0
    //   142: anewarray 4	java/lang/Object
    //   145: invokestatic 80	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   148: goto -23 -> 125
    //   151: aload_2
    //   152: invokevirtual 172	java/io/InputStream:close	()V
    //   155: ldc 158
    //   157: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   160: goto -141 -> 19
    //   163: astore_0
    //   164: ldc 72
    //   166: aload_0
    //   167: ldc 74
    //   169: iconst_0
    //   170: anewarray 4	java/lang/Object
    //   173: invokestatic 80	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   176: goto -21 -> 155
    //   179: astore_3
    //   180: aconst_null
    //   181: astore_2
    //   182: aload_2
    //   183: astore_0
    //   184: ldc 72
    //   186: aload_3
    //   187: ldc 74
    //   189: iconst_0
    //   190: anewarray 4	java/lang/Object
    //   193: invokestatic 80	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   196: aload_2
    //   197: ifnull +7 -> 204
    //   200: aload_2
    //   201: invokevirtual 172	java/io/InputStream:close	()V
    //   204: ldc 158
    //   206: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   209: goto -190 -> 19
    //   212: astore_0
    //   213: ldc 72
    //   215: aload_0
    //   216: ldc 74
    //   218: iconst_0
    //   219: anewarray 4	java/lang/Object
    //   222: invokestatic 80	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   225: goto -21 -> 204
    //   228: astore_2
    //   229: aconst_null
    //   230: astore_0
    //   231: aload_0
    //   232: ifnull +7 -> 239
    //   235: aload_0
    //   236: invokevirtual 172	java/io/InputStream:close	()V
    //   239: ldc 158
    //   241: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   244: aload_2
    //   245: athrow
    //   246: astore_0
    //   247: ldc 72
    //   249: aload_0
    //   250: ldc 74
    //   252: iconst_0
    //   253: anewarray 4	java/lang/Object
    //   256: invokestatic 80	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   259: goto -20 -> 239
    //   262: astore_2
    //   263: goto -32 -> 231
    //   266: astore_3
    //   267: goto -85 -> 182
    //
    // Exception table:
    //   from	to	target	type
    //   56	60	68	java/io/IOException
    //   121	125	135	java/io/IOException
    //   151	155	163	java/io/IOException
    //   21	30	179	java/lang/Exception
    //   200	204	212	java/io/IOException
    //   21	30	228	finally
    //   235	239	246	java/io/IOException
    //   32	37	262	finally
    //   39	49	262	finally
    //   86	93	262	finally
    //   95	102	262	finally
    //   104	109	262	finally
    //   184	196	262	finally
    //   32	37	266	java/lang/Exception
    //   39	49	266	java/lang/Exception
    //   86	93	266	java/lang/Exception
    //   95	102	266	java/lang/Exception
    //   104	109	266	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.a.c
 * JD-Core Version:    0.6.2
 */
package com.tencent.xweb.util;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.InputStream;
import java.security.MessageDigest;

public final class d
{
  private static String b(InputStream paramInputStream, int paramInt)
  {
    Object localObject = null;
    int i = 0;
    AppMethodBeat.i(4013);
    if (paramInt <= 0)
    {
      AppMethodBeat.o(4013);
      paramInputStream = localObject;
    }
    while (true)
    {
      return paramInputStream;
      MessageDigest localMessageDigest;
      StringBuilder localStringBuilder;
      try
      {
        localMessageDigest = MessageDigest.getInstance("MD5");
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>(32);
        byte[] arrayOfByte = new byte[paramInt];
        while (true)
        {
          paramInt = paramInputStream.read(arrayOfByte);
          if (paramInt == -1)
            break;
          localMessageDigest.update(arrayOfByte, 0, paramInt);
        }
      }
      catch (Exception paramInputStream)
      {
        AppMethodBeat.o(4013);
        paramInputStream = localObject;
      }
      continue;
      paramInputStream = localMessageDigest.digest();
      for (paramInt = i; paramInt < paramInputStream.length; paramInt++)
        localStringBuilder.append(Integer.toString((paramInputStream[paramInt] & 0xFF) + 256, 16).substring(1));
      paramInputStream = localStringBuilder.toString();
      AppMethodBeat.o(4013);
    }
  }

  public static String cz(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(4014);
    if (paramString == null)
    {
      AppMethodBeat.o(4014);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      paramString = new File(paramString);
      if (paramString.exists())
      {
        paramString = v(paramString);
        AppMethodBeat.o(4014);
      }
      else
      {
        AppMethodBeat.o(4014);
        paramString = localObject;
      }
    }
  }

  public static boolean gA(String paramString1, String paramString2)
  {
    AppMethodBeat.i(4016);
    paramString1 = cz(paramString1);
    boolean bool;
    if ((paramString1 != null) && (paramString2 != null) && (paramString2.equalsIgnoreCase(paramString1)))
    {
      bool = true;
      AppMethodBeat.o(4016);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(4016);
    }
  }

  private static String r(InputStream paramInputStream)
  {
    Object localObject = null;
    int i = 0;
    AppMethodBeat.i(4012);
    try
    {
      long l = paramInputStream.skip(0L);
      if (l < 0L)
      {
        AppMethodBeat.o(4012);
        paramInputStream = localObject;
      }
      while (true)
      {
        return paramInputStream;
        MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>(32);
        byte[] arrayOfByte = new byte[102400];
        int j = 0;
        while (true)
        {
          int k = paramInputStream.read(arrayOfByte);
          if ((k == -1) || (j >= 102400))
            break;
          if (j + k <= 102400)
          {
            localMessageDigest.update(arrayOfByte, 0, k);
            j += k;
          }
          else
          {
            localMessageDigest.update(arrayOfByte, 0, 102400 - j);
            j = 102400;
          }
        }
        paramInputStream = localMessageDigest.digest();
        for (j = i; j < paramInputStream.length; j++)
          localStringBuilder.append(Integer.toString((paramInputStream[j] & 0xFF) + 256, 16).substring(1));
        paramInputStream = localStringBuilder.toString();
        AppMethodBeat.o(4012);
      }
    }
    catch (Exception paramInputStream)
    {
      while (true)
      {
        AppMethodBeat.o(4012);
        paramInputStream = localObject;
      }
    }
  }

  // ERROR //
  public static String v(File paramFile)
  {
    // Byte code:
    //   0: ldc2_w 97
    //   3: lstore_1
    //   4: aconst_null
    //   5: astore_3
    //   6: sipush 4015
    //   9: invokestatic 14	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   12: aload_0
    //   13: invokevirtual 75	java/io/File:exists	()Z
    //   16: ifne +13 -> 29
    //   19: sipush 4015
    //   22: invokestatic 17	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   25: aload_3
    //   26: astore_0
    //   27: aload_0
    //   28: areturn
    //   29: new 100	java/io/FileInputStream
    //   32: astore 4
    //   34: aload 4
    //   36: aload_0
    //   37: invokespecial 103	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   40: ldc2_w 97
    //   43: aload_0
    //   44: invokevirtual 107	java/io/File:length	()J
    //   47: lcmp
    //   48: ifgt +30 -> 78
    //   51: aload 4
    //   53: lload_1
    //   54: l2i
    //   55: invokestatic 109	com/tencent/xweb/util/d:b	(Ljava/io/InputStream;I)Ljava/lang/String;
    //   58: astore_0
    //   59: aload 4
    //   61: invokevirtual 113	java/io/FileInputStream:close	()V
    //   64: aload 4
    //   66: invokevirtual 113	java/io/FileInputStream:close	()V
    //   69: sipush 4015
    //   72: invokestatic 17	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   75: goto -48 -> 27
    //   78: aload_0
    //   79: invokevirtual 107	java/io/File:length	()J
    //   82: lstore_1
    //   83: goto -32 -> 51
    //   86: astore_0
    //   87: aconst_null
    //   88: astore_0
    //   89: aload_0
    //   90: ifnull +7 -> 97
    //   93: aload_0
    //   94: invokevirtual 113	java/io/FileInputStream:close	()V
    //   97: sipush 4015
    //   100: invokestatic 17	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   103: aload_3
    //   104: astore_0
    //   105: goto -78 -> 27
    //   108: astore_0
    //   109: aconst_null
    //   110: astore 4
    //   112: aload 4
    //   114: ifnull +8 -> 122
    //   117: aload 4
    //   119: invokevirtual 113	java/io/FileInputStream:close	()V
    //   122: sipush 4015
    //   125: invokestatic 17	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   128: aload_0
    //   129: athrow
    //   130: astore 4
    //   132: goto -63 -> 69
    //   135: astore_0
    //   136: goto -39 -> 97
    //   139: astore 4
    //   141: goto -19 -> 122
    //   144: astore_0
    //   145: goto -33 -> 112
    //   148: astore_0
    //   149: aload 4
    //   151: astore_0
    //   152: goto -63 -> 89
    //
    // Exception table:
    //   from	to	target	type
    //   29	40	86	java/lang/Exception
    //   29	40	108	finally
    //   64	69	130	java/io/IOException
    //   93	97	135	java/io/IOException
    //   117	122	139	java/io/IOException
    //   40	51	144	finally
    //   51	64	144	finally
    //   78	83	144	finally
    //   40	51	148	java/lang/Exception
    //   51	64	148	java/lang/Exception
    //   78	83	148	java/lang/Exception
  }

  // ERROR //
  public static String w(File paramFile)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: sipush 4017
    //   5: invokestatic 14	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_0
    //   9: invokevirtual 75	java/io/File:exists	()Z
    //   12: ifne +13 -> 25
    //   15: sipush 4017
    //   18: invokestatic 17	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   21: aload_1
    //   22: astore_0
    //   23: aload_0
    //   24: areturn
    //   25: new 100	java/io/FileInputStream
    //   28: astore_2
    //   29: aload_2
    //   30: aload_0
    //   31: invokespecial 103	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   34: aload_2
    //   35: invokestatic 116	com/tencent/xweb/util/d:r	(Ljava/io/InputStream;)Ljava/lang/String;
    //   38: astore_0
    //   39: aload_2
    //   40: invokevirtual 113	java/io/FileInputStream:close	()V
    //   43: aload_2
    //   44: invokevirtual 113	java/io/FileInputStream:close	()V
    //   47: sipush 4017
    //   50: invokestatic 17	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   53: goto -30 -> 23
    //   56: astore_0
    //   57: aconst_null
    //   58: astore_2
    //   59: aload_2
    //   60: ifnull +7 -> 67
    //   63: aload_2
    //   64: invokevirtual 113	java/io/FileInputStream:close	()V
    //   67: sipush 4017
    //   70: invokestatic 17	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   73: aload_1
    //   74: astore_0
    //   75: goto -52 -> 23
    //   78: astore_0
    //   79: aconst_null
    //   80: astore_2
    //   81: aload_2
    //   82: ifnull +7 -> 89
    //   85: aload_2
    //   86: invokevirtual 113	java/io/FileInputStream:close	()V
    //   89: sipush 4017
    //   92: invokestatic 17	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   95: aload_0
    //   96: athrow
    //   97: astore_2
    //   98: goto -51 -> 47
    //   101: astore_0
    //   102: goto -35 -> 67
    //   105: astore_2
    //   106: goto -17 -> 89
    //   109: astore_0
    //   110: goto -29 -> 81
    //   113: astore_0
    //   114: goto -55 -> 59
    //
    // Exception table:
    //   from	to	target	type
    //   25	34	56	java/lang/Exception
    //   25	34	78	finally
    //   43	47	97	java/io/IOException
    //   63	67	101	java/io/IOException
    //   85	89	105	java/io/IOException
    //   34	43	109	finally
    //   34	43	113	java/lang/Exception
  }

  public static final String x(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(4011);
    char[] arrayOfChar = new char[16];
    char[] tmp12_11 = arrayOfChar;
    tmp12_11[0] = 48;
    char[] tmp17_12 = tmp12_11;
    tmp17_12[1] = 49;
    char[] tmp22_17 = tmp17_12;
    tmp22_17[2] = 50;
    char[] tmp27_22 = tmp22_17;
    tmp27_22[3] = 51;
    char[] tmp32_27 = tmp27_22;
    tmp32_27[4] = 52;
    char[] tmp37_32 = tmp32_27;
    tmp37_32[5] = 53;
    char[] tmp42_37 = tmp37_32;
    tmp42_37[6] = 54;
    char[] tmp48_42 = tmp42_37;
    tmp48_42[7] = 55;
    char[] tmp54_48 = tmp48_42;
    tmp54_48[8] = 56;
    char[] tmp60_54 = tmp54_48;
    tmp60_54[9] = 57;
    char[] tmp66_60 = tmp60_54;
    tmp66_60[10] = 97;
    char[] tmp72_66 = tmp66_60;
    tmp72_66[11] = 98;
    char[] tmp78_72 = tmp72_66;
    tmp78_72[12] = 99;
    char[] tmp84_78 = tmp78_72;
    tmp84_78[13] = 100;
    char[] tmp90_84 = tmp84_78;
    tmp90_84[14] = 101;
    char[] tmp96_90 = tmp90_84;
    tmp96_90[15] = 102;
    tmp96_90;
    try
    {
      Object localObject = MessageDigest.getInstance("MD5");
      ((MessageDigest)localObject).update(paramArrayOfByte);
      paramArrayOfByte = ((MessageDigest)localObject).digest();
      int i = paramArrayOfByte.length;
      localObject = new char[i * 2];
      int j = 0;
      int n;
      for (int k = 0; j < i; k = n + 1)
      {
        int m = paramArrayOfByte[j];
        n = k + 1;
        localObject[k] = ((char)arrayOfChar[(m >>> 4 & 0xF)]);
        localObject[n] = ((char)arrayOfChar[(m & 0xF)]);
        j++;
      }
      paramArrayOfByte = new java/lang/String;
      paramArrayOfByte.<init>((char[])localObject);
      AppMethodBeat.o(4011);
      return paramArrayOfByte;
    }
    catch (Exception paramArrayOfByte)
    {
      while (true)
      {
        paramArrayOfByte = null;
        AppMethodBeat.o(4011);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.util.d
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.a;

import java.io.File;
import java.io.InputStream;
import java.security.MessageDigest;

public final class g
{
  public static final String b(InputStream paramInputStream, int paramInt)
  {
    Object localObject1 = null;
    int i = 0;
    Object localObject2 = localObject1;
    if (paramInputStream != null)
    {
      if (paramInt > 0)
        break label21;
      localObject2 = localObject1;
    }
    while (true)
    {
      return localObject2;
      label21: MessageDigest localMessageDigest;
      try
      {
        localMessageDigest = MessageDigest.getInstance("MD5");
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>(32);
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
        localObject2 = localObject1;
      }
      continue;
      paramInputStream = localMessageDigest.digest();
      for (paramInt = i; paramInt < paramInputStream.length; paramInt++)
        ((StringBuilder)localObject2).append(Integer.toString((paramInputStream[paramInt] & 0xFF) + 256, 16).substring(1));
      localObject2 = ((StringBuilder)localObject2).toString();
    }
  }

  public static String cA(String paramString)
  {
    Object localObject = null;
    if (paramString == null)
      paramString = localObject;
    while (true)
    {
      return paramString;
      File localFile = new File(paramString);
      paramString = localObject;
      if (localFile.exists())
        paramString = w(localFile);
    }
  }

  public static String cz(String paramString)
  {
    Object localObject = null;
    if (paramString == null)
      paramString = localObject;
    while (true)
    {
      return paramString;
      File localFile = new File(paramString);
      paramString = localObject;
      if (localFile.exists())
        paramString = v(localFile);
    }
  }

  public static String r(InputStream paramInputStream)
  {
    Object localObject1 = null;
    int i = 0;
    Object localObject2;
    if (paramInputStream == null)
      localObject2 = localObject1;
    while (true)
    {
      return localObject2;
      localObject2 = localObject1;
      try
      {
        if (paramInputStream.skip(0L) >= 0L)
        {
          MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>(32);
          byte[] arrayOfByte = new byte[102400];
          int j = 0;
          while (true)
          {
            int k = paramInputStream.read(arrayOfByte);
            if ((k == -1) || (j >= 256))
              break;
            if (j + k <= 256)
            {
              localMessageDigest.update(arrayOfByte, 0, k);
              j += k;
            }
            else
            {
              localMessageDigest.update(arrayOfByte, 0, 256 - j);
              j = 256;
            }
          }
          paramInputStream = localMessageDigest.digest();
          for (j = i; j < paramInputStream.length; j++)
            ((StringBuilder)localObject2).append(Integer.toString((paramInputStream[j] & 0xFF) + 256, 16).substring(1));
          localObject2 = ((StringBuilder)localObject2).toString();
        }
      }
      catch (Exception paramInputStream)
      {
        localObject2 = localObject1;
      }
    }
  }

  // ERROR //
  public static String v(File paramFile)
  {
    // Byte code:
    //   0: ldc2_w 85
    //   3: lstore_1
    //   4: aload_0
    //   5: ifnull +10 -> 15
    //   8: aload_0
    //   9: invokevirtual 67	java/io/File:exists	()Z
    //   12: ifne +7 -> 19
    //   15: aconst_null
    //   16: astore_0
    //   17: aload_0
    //   18: areturn
    //   19: new 88	java/io/FileInputStream
    //   22: astore_3
    //   23: aload_3
    //   24: aload_0
    //   25: invokespecial 91	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   28: ldc2_w 85
    //   31: aload_0
    //   32: invokevirtual 95	java/io/File:length	()J
    //   35: lcmp
    //   36: ifgt +25 -> 61
    //   39: aload_3
    //   40: lload_1
    //   41: l2i
    //   42: invokestatic 97	com/tencent/mm/a/g:b	(Ljava/io/InputStream;I)Ljava/lang/String;
    //   45: astore_0
    //   46: aload_3
    //   47: invokevirtual 101	java/io/FileInputStream:close	()V
    //   50: aload_3
    //   51: invokevirtual 101	java/io/FileInputStream:close	()V
    //   54: goto -37 -> 17
    //   57: astore_3
    //   58: goto -41 -> 17
    //   61: aload_0
    //   62: invokevirtual 95	java/io/File:length	()J
    //   65: lstore_1
    //   66: goto -27 -> 39
    //   69: astore_0
    //   70: aconst_null
    //   71: astore_0
    //   72: aload_0
    //   73: ifnull +7 -> 80
    //   76: aload_0
    //   77: invokevirtual 101	java/io/FileInputStream:close	()V
    //   80: aconst_null
    //   81: astore_0
    //   82: goto -65 -> 17
    //   85: astore_0
    //   86: aconst_null
    //   87: astore_3
    //   88: aload_3
    //   89: ifnull +7 -> 96
    //   92: aload_3
    //   93: invokevirtual 101	java/io/FileInputStream:close	()V
    //   96: aload_0
    //   97: athrow
    //   98: astore_0
    //   99: goto -19 -> 80
    //   102: astore_3
    //   103: goto -7 -> 96
    //   106: astore_0
    //   107: goto -19 -> 88
    //   110: astore_0
    //   111: aload_3
    //   112: astore_0
    //   113: goto -41 -> 72
    //
    // Exception table:
    //   from	to	target	type
    //   50	54	57	java/io/IOException
    //   19	28	69	java/lang/Exception
    //   19	28	85	finally
    //   76	80	98	java/io/IOException
    //   92	96	102	java/io/IOException
    //   28	39	106	finally
    //   39	50	106	finally
    //   61	66	106	finally
    //   28	39	110	java/lang/Exception
    //   39	50	110	java/lang/Exception
    //   61	66	110	java/lang/Exception
  }

  // ERROR //
  private static String w(File paramFile)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aload_0
    //   3: invokevirtual 67	java/io/File:exists	()Z
    //   6: ifne +7 -> 13
    //   9: aload_1
    //   10: astore_2
    //   11: aload_2
    //   12: areturn
    //   13: new 88	java/io/FileInputStream
    //   16: astore_2
    //   17: aload_2
    //   18: aload_0
    //   19: invokespecial 91	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   22: aload_2
    //   23: invokestatic 103	com/tencent/mm/a/g:r	(Ljava/io/InputStream;)Ljava/lang/String;
    //   26: astore_0
    //   27: aload_2
    //   28: invokevirtual 101	java/io/FileInputStream:close	()V
    //   31: aload_2
    //   32: invokevirtual 101	java/io/FileInputStream:close	()V
    //   35: aload_0
    //   36: astore_2
    //   37: goto -26 -> 11
    //   40: astore_0
    //   41: aconst_null
    //   42: astore_0
    //   43: aload_1
    //   44: astore_2
    //   45: aload_0
    //   46: ifnull -35 -> 11
    //   49: aload_0
    //   50: invokevirtual 101	java/io/FileInputStream:close	()V
    //   53: aload_1
    //   54: astore_2
    //   55: goto -44 -> 11
    //   58: astore_0
    //   59: aload_1
    //   60: astore_2
    //   61: goto -50 -> 11
    //   64: astore_0
    //   65: aconst_null
    //   66: astore_2
    //   67: aload_2
    //   68: ifnull +7 -> 75
    //   71: aload_2
    //   72: invokevirtual 101	java/io/FileInputStream:close	()V
    //   75: aload_0
    //   76: athrow
    //   77: astore_2
    //   78: goto -43 -> 35
    //   81: astore_2
    //   82: goto -7 -> 75
    //   85: astore_0
    //   86: goto -19 -> 67
    //   89: astore_0
    //   90: aload_2
    //   91: astore_0
    //   92: goto -49 -> 43
    //
    // Exception table:
    //   from	to	target	type
    //   13	22	40	java/lang/Exception
    //   49	53	58	java/io/IOException
    //   13	22	64	finally
    //   31	35	77	java/io/IOException
    //   71	75	81	java/io/IOException
    //   22	31	85	finally
    //   22	31	89	java/lang/Exception
  }

  public static final String x(byte[] paramArrayOfByte)
  {
    char[] arrayOfChar = new char[16];
    char[] tmp6_5 = arrayOfChar;
    tmp6_5[0] = 48;
    char[] tmp11_6 = tmp6_5;
    tmp11_6[1] = 49;
    char[] tmp16_11 = tmp11_6;
    tmp16_11[2] = 50;
    char[] tmp21_16 = tmp16_11;
    tmp21_16[3] = 51;
    char[] tmp26_21 = tmp21_16;
    tmp26_21[4] = 52;
    char[] tmp31_26 = tmp26_21;
    tmp31_26[5] = 53;
    char[] tmp36_31 = tmp31_26;
    tmp36_31[6] = 54;
    char[] tmp42_36 = tmp36_31;
    tmp42_36[7] = 55;
    char[] tmp48_42 = tmp42_36;
    tmp48_42[8] = 56;
    char[] tmp54_48 = tmp48_42;
    tmp54_48[9] = 57;
    char[] tmp60_54 = tmp54_48;
    tmp60_54[10] = 97;
    char[] tmp66_60 = tmp60_54;
    tmp66_60[11] = 98;
    char[] tmp72_66 = tmp66_60;
    tmp72_66[12] = 99;
    char[] tmp78_72 = tmp72_66;
    tmp78_72[13] = 100;
    char[] tmp84_78 = tmp78_72;
    tmp84_78[14] = 101;
    char[] tmp90_84 = tmp84_78;
    tmp90_84[15] = 102;
    tmp90_84;
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
      return paramArrayOfByte;
    }
    catch (Exception paramArrayOfByte)
    {
      while (true)
        paramArrayOfByte = null;
    }
  }

  public static final byte[] y(byte[] paramArrayOfByte)
  {
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
      localMessageDigest.update(paramArrayOfByte);
      paramArrayOfByte = localMessageDigest.digest();
      return paramArrayOfByte;
    }
    catch (Exception paramArrayOfByte)
    {
      while (true)
        paramArrayOfByte = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.a.g
 * JD-Core Version:    0.6.2
 */
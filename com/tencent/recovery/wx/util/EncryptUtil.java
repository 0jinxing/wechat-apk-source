package com.tencent.recovery.wx.util;

import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

public class EncryptUtil
{
  public static int a(PByteArray paramPByteArray, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    int i = 0;
    int j;
    if ((paramArrayOfByte1 == null) || (paramArrayOfByte2 == null))
      j = 2;
    while (true)
    {
      return j;
      if ((paramArrayOfByte1.length < 0) || (paramArrayOfByte2.length <= 0))
      {
        j = 2;
      }
      else
      {
        int k = 8 - paramArrayOfByte1.length % 8;
        byte[] arrayOfByte = new byte[paramArrayOfByte1.length + k];
        for (j = 0; j < paramArrayOfByte1.length; j++)
          arrayOfByte[j] = ((byte)paramArrayOfByte1[j]);
        for (j = 0; j < k; j++)
          arrayOfByte[(paramArrayOfByte1.length + j)] = ((byte)(byte)k);
        paramPByteArray.value = new byte[paramArrayOfByte1.length + k + 32];
        if (MyDES.a(paramPByteArray.value, arrayOfByte, arrayOfByte.length, paramArrayOfByte2.length, paramArrayOfByte2) == 0)
        {
          j = 11;
        }
        else
        {
          paramArrayOfByte1 = new byte[paramArrayOfByte1.length + k + 8];
          for (j = 0; j < paramArrayOfByte1.length; j++)
            paramArrayOfByte1[j] = ((byte)paramPByteArray.value[j]);
          paramPByteArray.value = paramArrayOfByte1;
          j = i;
        }
      }
    }
  }

  // ERROR //
  public static byte[] compress(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: new 32	java/util/zip/Deflater
    //   3: dup
    //   4: invokespecial 33	java/util/zip/Deflater:<init>	()V
    //   7: astore_1
    //   8: aload_1
    //   9: invokevirtual 36	java/util/zip/Deflater:reset	()V
    //   12: aload_1
    //   13: aload_0
    //   14: invokevirtual 40	java/util/zip/Deflater:setInput	([B)V
    //   17: aload_1
    //   18: invokevirtual 43	java/util/zip/Deflater:finish	()V
    //   21: new 45	java/io/ByteArrayOutputStream
    //   24: astore_2
    //   25: aload_2
    //   26: aload_0
    //   27: arraylength
    //   28: invokespecial 48	java/io/ByteArrayOutputStream:<init>	(I)V
    //   31: aload_2
    //   32: astore_3
    //   33: sipush 1024
    //   36: newarray byte
    //   38: astore 4
    //   40: aload_2
    //   41: astore_3
    //   42: aload_1
    //   43: invokevirtual 52	java/util/zip/Deflater:finished	()Z
    //   46: ifne +56 -> 102
    //   49: aload_2
    //   50: astore_3
    //   51: aload_2
    //   52: aload 4
    //   54: iconst_0
    //   55: aload_1
    //   56: aload 4
    //   58: invokevirtual 56	java/util/zip/Deflater:deflate	([B)I
    //   61: invokevirtual 60	java/io/ByteArrayOutputStream:write	([BII)V
    //   64: goto -24 -> 40
    //   67: astore 4
    //   69: aload_2
    //   70: astore_3
    //   71: ldc 62
    //   73: aload 4
    //   75: ldc 64
    //   77: iconst_0
    //   78: anewarray 4	java/lang/Object
    //   81: invokestatic 70	com/tencent/recovery/log/RecoveryLog:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   84: aload_0
    //   85: astore_3
    //   86: aload_2
    //   87: ifnull +9 -> 96
    //   90: aload_2
    //   91: invokevirtual 73	java/io/ByteArrayOutputStream:close	()V
    //   94: aload_0
    //   95: astore_3
    //   96: aload_1
    //   97: invokevirtual 76	java/util/zip/Deflater:end	()V
    //   100: aload_3
    //   101: areturn
    //   102: aload_2
    //   103: astore_3
    //   104: aload_2
    //   105: invokevirtual 80	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   108: astore 4
    //   110: aload 4
    //   112: astore_3
    //   113: aload_2
    //   114: invokevirtual 73	java/io/ByteArrayOutputStream:close	()V
    //   117: goto -21 -> 96
    //   120: astore_0
    //   121: ldc 62
    //   123: aload_0
    //   124: ldc 64
    //   126: iconst_0
    //   127: anewarray 4	java/lang/Object
    //   130: invokestatic 70	com/tencent/recovery/log/RecoveryLog:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   133: goto -37 -> 96
    //   136: astore_3
    //   137: ldc 62
    //   139: aload_3
    //   140: ldc 64
    //   142: iconst_0
    //   143: anewarray 4	java/lang/Object
    //   146: invokestatic 70	com/tencent/recovery/log/RecoveryLog:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   149: aload_0
    //   150: astore_3
    //   151: goto -55 -> 96
    //   154: astore_3
    //   155: aconst_null
    //   156: astore_2
    //   157: aload_2
    //   158: astore_3
    //   159: new 28	java/lang/OutOfMemoryError
    //   162: astore_1
    //   163: aload_2
    //   164: astore_3
    //   165: new 82	java/lang/StringBuilder
    //   168: astore 4
    //   170: aload_2
    //   171: astore_3
    //   172: aload 4
    //   174: ldc 84
    //   176: invokespecial 87	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   179: aload_2
    //   180: astore_3
    //   181: aload_1
    //   182: aload 4
    //   184: aload_0
    //   185: arraylength
    //   186: invokevirtual 91	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   189: invokevirtual 95	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   192: invokespecial 96	java/lang/OutOfMemoryError:<init>	(Ljava/lang/String;)V
    //   195: aload_2
    //   196: astore_3
    //   197: aload_1
    //   198: athrow
    //   199: astore_0
    //   200: aload_3
    //   201: ifnull +7 -> 208
    //   204: aload_3
    //   205: invokevirtual 73	java/io/ByteArrayOutputStream:close	()V
    //   208: aload_0
    //   209: athrow
    //   210: astore_3
    //   211: ldc 62
    //   213: aload_3
    //   214: ldc 64
    //   216: iconst_0
    //   217: anewarray 4	java/lang/Object
    //   220: invokestatic 70	com/tencent/recovery/log/RecoveryLog:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   223: goto -15 -> 208
    //   226: astore_0
    //   227: aconst_null
    //   228: astore_3
    //   229: goto -29 -> 200
    //   232: astore_3
    //   233: goto -76 -> 157
    //   236: astore 4
    //   238: aconst_null
    //   239: astore_2
    //   240: goto -171 -> 69
    //
    // Exception table:
    //   from	to	target	type
    //   33	40	67	java/lang/Exception
    //   42	49	67	java/lang/Exception
    //   51	64	67	java/lang/Exception
    //   104	110	67	java/lang/Exception
    //   113	117	120	java/io/IOException
    //   90	94	136	java/io/IOException
    //   21	31	154	java/lang/OutOfMemoryError
    //   33	40	199	finally
    //   42	49	199	finally
    //   51	64	199	finally
    //   71	84	199	finally
    //   104	110	199	finally
    //   159	163	199	finally
    //   165	170	199	finally
    //   172	179	199	finally
    //   181	195	199	finally
    //   197	199	199	finally
    //   204	208	210	java/io/IOException
    //   21	31	226	finally
    //   33	40	232	java/lang/OutOfMemoryError
    //   42	49	232	java/lang/OutOfMemoryError
    //   51	64	232	java/lang/OutOfMemoryError
    //   104	110	232	java/lang/OutOfMemoryError
    //   21	31	236	java/lang/Exception
  }

  public static byte[] g(byte[] paramArrayOfByte, String paramString)
  {
    paramString = new X509EncodedKeySpec(Base64.decode(paramString, 0));
    paramString = KeyFactory.getInstance("RSA").generatePublic(paramString);
    Cipher localCipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
    localCipher.init(2, paramString);
    int i = paramArrayOfByte.length;
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    int j = 0;
    int k = 0;
    if (i - k > 0)
    {
      if (i - k > 128);
      for (paramString = localCipher.doFinal(paramArrayOfByte, k, 128); ; paramString = localCipher.doFinal(paramArrayOfByte, k, i - k))
      {
        localByteArrayOutputStream.write(paramString, 0, paramString.length);
        j++;
        k = j * 128;
        break;
      }
    }
    paramArrayOfByte = localByteArrayOutputStream.toByteArray();
    localByteArrayOutputStream.close();
    return paramArrayOfByte;
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
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.recovery.wx.util.EncryptUtil
 * JD-Core Version:    0.6.2
 */
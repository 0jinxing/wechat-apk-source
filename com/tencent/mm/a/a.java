package com.tencent.mm.a;

import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class a
{
  // ERROR //
  private static boolean a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 4
    //   3: aload_1
    //   4: invokestatic 14	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   7: ifeq +13 -> 20
    //   10: new 16	java/security/InvalidParameterException
    //   13: dup
    //   14: ldc 18
    //   16: invokespecial 22	java/security/InvalidParameterException:<init>	(Ljava/lang/String;)V
    //   19: athrow
    //   20: new 24	java/io/File
    //   23: dup
    //   24: aload_2
    //   25: invokespecial 25	java/io/File:<init>	(Ljava/lang/String;)V
    //   28: astore_2
    //   29: new 24	java/io/File
    //   32: dup
    //   33: aload_3
    //   34: invokespecial 25	java/io/File:<init>	(Ljava/lang/String;)V
    //   37: astore 5
    //   39: iload 4
    //   41: istore 6
    //   43: aload_2
    //   44: invokevirtual 29	java/io/File:exists	()Z
    //   47: ifeq +264 -> 311
    //   50: iload 4
    //   52: istore 6
    //   54: aload_2
    //   55: invokevirtual 32	java/io/File:isFile	()Z
    //   58: ifeq +253 -> 311
    //   61: aload 5
    //   63: invokevirtual 36	java/io/File:getParentFile	()Ljava/io/File;
    //   66: invokevirtual 29	java/io/File:exists	()Z
    //   69: ifne +12 -> 81
    //   72: aload 5
    //   74: invokevirtual 36	java/io/File:getParentFile	()Ljava/io/File;
    //   77: invokevirtual 39	java/io/File:mkdirs	()Z
    //   80: pop
    //   81: aload 5
    //   83: invokevirtual 42	java/io/File:createNewFile	()Z
    //   86: pop
    //   87: new 44	java/io/FileInputStream
    //   90: astore_3
    //   91: aload_3
    //   92: aload_2
    //   93: invokespecial 47	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   96: new 49	java/io/FileOutputStream
    //   99: astore_2
    //   100: aload_2
    //   101: aload 5
    //   103: invokespecial 50	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   106: aload_0
    //   107: invokevirtual 56	java/lang/String:getBytes	()[B
    //   110: iconst_0
    //   111: invokestatic 62	android/util/Base64:decode	([BI)[B
    //   114: astore 7
    //   116: new 64	javax/crypto/spec/SecretKeySpec
    //   119: astore_0
    //   120: aload_0
    //   121: aload 7
    //   123: ldc 66
    //   125: invokespecial 69	javax/crypto/spec/SecretKeySpec:<init>	([BLjava/lang/String;)V
    //   128: aload_1
    //   129: invokestatic 75	javax/crypto/Cipher:getInstance	(Ljava/lang/String;)Ljavax/crypto/Cipher;
    //   132: astore 5
    //   134: aload 7
    //   136: aload 7
    //   138: arraylength
    //   139: invokestatic 80	java/util/Arrays:copyOf	([BI)[B
    //   142: astore 7
    //   144: new 82	javax/crypto/spec/IvParameterSpec
    //   147: astore_1
    //   148: aload_1
    //   149: aload 7
    //   151: invokespecial 85	javax/crypto/spec/IvParameterSpec:<init>	([B)V
    //   154: aload 5
    //   156: iconst_2
    //   157: aload_0
    //   158: aload_1
    //   159: invokevirtual 89	javax/crypto/Cipher:init	(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
    //   162: new 91	javax/crypto/CipherOutputStream
    //   165: astore_1
    //   166: aload_1
    //   167: aload_2
    //   168: aload 5
    //   170: invokespecial 94	javax/crypto/CipherOutputStream:<init>	(Ljava/io/OutputStream;Ljavax/crypto/Cipher;)V
    //   173: aload_1
    //   174: astore_0
    //   175: aload_2
    //   176: astore 5
    //   178: aload_3
    //   179: astore 7
    //   181: sipush 1024
    //   184: newarray byte
    //   186: astore 8
    //   188: aload_1
    //   189: astore_0
    //   190: aload_2
    //   191: astore 5
    //   193: aload_3
    //   194: astore 7
    //   196: aload_3
    //   197: aload 8
    //   199: invokevirtual 98	java/io/FileInputStream:read	([B)I
    //   202: istore 9
    //   204: iload 9
    //   206: iconst_m1
    //   207: if_icmpeq +89 -> 296
    //   210: aload_1
    //   211: astore_0
    //   212: aload_2
    //   213: astore 5
    //   215: aload_3
    //   216: astore 7
    //   218: aload_1
    //   219: aload 8
    //   221: iconst_0
    //   222: iload 9
    //   224: invokevirtual 102	javax/crypto/CipherOutputStream:write	([BII)V
    //   227: aload_1
    //   228: astore_0
    //   229: aload_2
    //   230: astore 5
    //   232: aload_3
    //   233: astore 7
    //   235: aload_1
    //   236: invokevirtual 106	javax/crypto/CipherOutputStream:flush	()V
    //   239: goto -51 -> 188
    //   242: astore 5
    //   244: aload_1
    //   245: astore_0
    //   246: aload 5
    //   248: astore_1
    //   249: aload_2
    //   250: astore 5
    //   252: aload_3
    //   253: astore 7
    //   255: aload_1
    //   256: athrow
    //   257: astore 8
    //   259: aload 7
    //   261: astore_3
    //   262: aload 5
    //   264: astore_2
    //   265: aload_0
    //   266: astore_1
    //   267: aload 8
    //   269: astore_0
    //   270: aload_1
    //   271: ifnull +7 -> 278
    //   274: aload_1
    //   275: invokevirtual 109	javax/crypto/CipherOutputStream:close	()V
    //   278: aload_2
    //   279: ifnull +7 -> 286
    //   282: aload_2
    //   283: invokevirtual 110	java/io/FileOutputStream:close	()V
    //   286: aload_3
    //   287: ifnull +7 -> 294
    //   290: aload_3
    //   291: invokevirtual 111	java/io/FileInputStream:close	()V
    //   294: aload_0
    //   295: athrow
    //   296: aload_1
    //   297: invokevirtual 109	javax/crypto/CipherOutputStream:close	()V
    //   300: aload_2
    //   301: invokevirtual 110	java/io/FileOutputStream:close	()V
    //   304: aload_3
    //   305: invokevirtual 111	java/io/FileInputStream:close	()V
    //   308: iconst_1
    //   309: istore 6
    //   311: iload 6
    //   313: ireturn
    //   314: astore_0
    //   315: aconst_null
    //   316: astore_1
    //   317: aconst_null
    //   318: astore_2
    //   319: aconst_null
    //   320: astore_3
    //   321: goto -51 -> 270
    //   324: astore_0
    //   325: aconst_null
    //   326: astore_1
    //   327: aconst_null
    //   328: astore_2
    //   329: goto -59 -> 270
    //   332: astore_0
    //   333: aconst_null
    //   334: astore_1
    //   335: goto -65 -> 270
    //   338: astore_1
    //   339: aconst_null
    //   340: astore_0
    //   341: aconst_null
    //   342: astore_2
    //   343: aconst_null
    //   344: astore_3
    //   345: goto -96 -> 249
    //   348: astore_1
    //   349: aconst_null
    //   350: astore_0
    //   351: aconst_null
    //   352: astore_2
    //   353: goto -104 -> 249
    //   356: astore_1
    //   357: aconst_null
    //   358: astore_0
    //   359: goto -110 -> 249
    //
    // Exception table:
    //   from	to	target	type
    //   181	188	242	java/lang/Exception
    //   196	204	242	java/lang/Exception
    //   218	227	242	java/lang/Exception
    //   235	239	242	java/lang/Exception
    //   181	188	257	finally
    //   196	204	257	finally
    //   218	227	257	finally
    //   235	239	257	finally
    //   255	257	257	finally
    //   87	96	314	finally
    //   96	106	324	finally
    //   106	173	332	finally
    //   87	96	338	java/lang/Exception
    //   96	106	348	java/lang/Exception
    //   106	173	356	java/lang/Exception
  }

  @Deprecated
  private static byte[] c(byte[] paramArrayOfByte, String paramString)
  {
    try
    {
      SecretKeySpec localSecretKeySpec = new javax/crypto/spec/SecretKeySpec;
      localSecretKeySpec.<init>(paramString.getBytes(), "AES");
      paramString = Cipher.getInstance("AES/ECB/PKCS5Padding");
      paramString.init(2, localSecretKeySpec);
      paramArrayOfByte = paramString.doFinal(paramArrayOfByte);
      return paramArrayOfByte;
    }
    catch (Exception paramArrayOfByte)
    {
      while (true)
      {
        ab.e("MicroMsg.AESUtils", bo.l(paramArrayOfByte));
        paramArrayOfByte = null;
      }
    }
  }

  private static byte[] cq(String paramString)
  {
    if (paramString.length() <= 0);
    byte[] arrayOfByte;
    for (paramString = null; ; paramString = arrayOfByte)
    {
      return paramString;
      arrayOfByte = new byte[paramString.length() / 2];
      for (int i = 0; i < paramString.length() / 2; i++)
        arrayOfByte[i] = ((byte)(byte)(Integer.parseInt(paramString.substring(i * 2, i * 2 + 1), 16) * 16 + Integer.parseInt(paramString.substring(i * 2 + 1, i * 2 + 2), 16)));
    }
  }

  public static boolean g(String paramString1, String paramString2, String paramString3)
  {
    return a(paramString1, "AES/CBC/PKCS7Padding", paramString2, paramString3);
  }

  @Deprecated
  public static String x(String paramString1, String paramString2)
  {
    if (bo.isNullOrNil(paramString1))
      paramString1 = "";
    while (true)
    {
      return paramString1;
      try
      {
        String str = new java/lang/String;
        str.<init>(c(cq(paramString1), paramString2));
        paramString1 = str;
      }
      catch (Exception paramString2)
      {
        ab.e("MicroMsg.AESUtils", bo.l(paramString2));
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.a.a
 * JD-Core Version:    0.6.2
 */
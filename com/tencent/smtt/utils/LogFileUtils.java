package com.tencent.smtt.utils;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;
import java.io.OutputStream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class LogFileUtils
{
  private static OutputStream a = null;

  public static void closeOutputStream(OutputStream paramOutputStream)
  {
    AppMethodBeat.i(65262);
    if (paramOutputStream != null);
    try
    {
      paramOutputStream.close();
      AppMethodBeat.o(65262);
      return;
    }
    catch (IOException paramOutputStream)
    {
      while (true)
        AppMethodBeat.o(65262);
    }
  }

  public static byte[] createHeaderText(String paramString1, String paramString2)
  {
    AppMethodBeat.i(65266);
    try
    {
      paramString2 = encryptKey(paramString1, paramString2);
      String str = String.format("%03d", new Object[] { Integer.valueOf(paramString2.length) });
      paramString1 = new byte[paramString2.length + 3];
      paramString1[0] = ((byte)(byte)str.charAt(0));
      paramString1[1] = ((byte)(byte)str.charAt(1));
      paramString1[2] = ((byte)(byte)str.charAt(2));
      System.arraycopy(paramString2, 0, paramString1, 3, paramString2.length);
      AppMethodBeat.o(65266);
      return paramString1;
    }
    catch (Exception paramString1)
    {
      while (true)
      {
        paramString1 = null;
        AppMethodBeat.o(65266);
      }
    }
  }

  public static String createKey()
  {
    AppMethodBeat.i(65264);
    long l = System.currentTimeMillis();
    AppMethodBeat.o(65264);
    return String.valueOf(l);
  }

  public static byte[] encrypt(String paramString1, String paramString2)
  {
    AppMethodBeat.i(65263);
    try
    {
      byte[] arrayOfByte = paramString2.getBytes("UTF-8");
      Cipher localCipher = Cipher.getInstance("RC4");
      paramString2 = new javax/crypto/spec/SecretKeySpec;
      paramString2.<init>(paramString1.getBytes("UTF-8"), "RC4");
      localCipher.init(1, paramString2);
      paramString1 = localCipher.update(arrayOfByte);
      AppMethodBeat.o(65263);
      return paramString1;
    }
    catch (Throwable paramString1)
    {
      while (true)
      {
        new StringBuilder("encrypt exception:").append(paramString1.getMessage());
        paramString1 = null;
        AppMethodBeat.o(65263);
      }
    }
  }

  public static byte[] encryptKey(String paramString1, String paramString2)
  {
    AppMethodBeat.i(65265);
    try
    {
      paramString2 = paramString2.getBytes("UTF-8");
      Cipher localCipher = Cipher.getInstance("RC4");
      SecretKeySpec localSecretKeySpec = new javax/crypto/spec/SecretKeySpec;
      localSecretKeySpec.<init>(paramString1.getBytes("UTF-8"), "RC4");
      localCipher.init(1, localSecretKeySpec);
      paramString1 = localCipher.update(paramString2);
      AppMethodBeat.o(65265);
      return paramString1;
    }
    catch (Throwable paramString1)
    {
      while (true)
      {
        new StringBuilder("encrypt exception:").append(paramString1.getMessage());
        paramString1 = null;
        AppMethodBeat.o(65265);
      }
    }
  }

  // ERROR //
  public static void writeDataToStorage(java.io.File paramFile, String paramString1, byte[] paramArrayOfByte, String paramString2, boolean paramBoolean)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc 124
    //   5: invokestatic 25	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_1
    //   9: aload_3
    //   10: invokestatic 126	com/tencent/smtt/utils/LogFileUtils:encrypt	(Ljava/lang/String;Ljava/lang/String;)[B
    //   13: astore_1
    //   14: aload_1
    //   15: ifnull +118 -> 133
    //   18: aconst_null
    //   19: astore_3
    //   20: aload_0
    //   21: invokevirtual 132	java/io/File:getParentFile	()Ljava/io/File;
    //   24: invokevirtual 136	java/io/File:mkdirs	()Z
    //   27: pop
    //   28: aload_0
    //   29: invokevirtual 139	java/io/File:isFile	()Z
    //   32: ifeq +31 -> 63
    //   35: aload_0
    //   36: invokevirtual 142	java/io/File:exists	()Z
    //   39: ifeq +24 -> 63
    //   42: aload_0
    //   43: invokevirtual 145	java/io/File:length	()J
    //   46: ldc2_w 146
    //   49: lcmp
    //   50: ifle +13 -> 63
    //   53: aload_0
    //   54: invokevirtual 150	java/io/File:delete	()Z
    //   57: pop
    //   58: aload_0
    //   59: invokevirtual 153	java/io/File:createNewFile	()Z
    //   62: pop
    //   63: getstatic 10	com/tencent/smtt/utils/LogFileUtils:a	Ljava/io/OutputStream;
    //   66: ifnonnull +30 -> 96
    //   69: new 155	java/io/FileOutputStream
    //   72: astore 5
    //   74: aload 5
    //   76: aload_0
    //   77: iload 4
    //   79: invokespecial 158	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   82: new 160	java/io/BufferedOutputStream
    //   85: astore_0
    //   86: aload_0
    //   87: aload 5
    //   89: invokespecial 162	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   92: aload_0
    //   93: putstatic 10	com/tencent/smtt/utils/LogFileUtils:a	Ljava/io/OutputStream;
    //   96: aload_3
    //   97: ifnull +41 -> 138
    //   100: getstatic 10	com/tencent/smtt/utils/LogFileUtils:a	Ljava/io/OutputStream;
    //   103: aload_3
    //   104: invokevirtual 165	java/lang/String:getBytes	()[B
    //   107: invokevirtual 169	java/io/OutputStream:write	([B)V
    //   110: getstatic 10	com/tencent/smtt/utils/LogFileUtils:a	Ljava/io/OutputStream;
    //   113: astore_0
    //   114: aload_0
    //   115: ifnull +9 -> 124
    //   118: getstatic 10	com/tencent/smtt/utils/LogFileUtils:a	Ljava/io/OutputStream;
    //   121: invokevirtual 172	java/io/OutputStream:flush	()V
    //   124: ldc 124
    //   126: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   129: ldc 2
    //   131: monitorexit
    //   132: return
    //   133: aconst_null
    //   134: astore_1
    //   135: goto -115 -> 20
    //   138: getstatic 10	com/tencent/smtt/utils/LogFileUtils:a	Ljava/io/OutputStream;
    //   141: aload_2
    //   142: invokevirtual 169	java/io/OutputStream:write	([B)V
    //   145: getstatic 10	com/tencent/smtt/utils/LogFileUtils:a	Ljava/io/OutputStream;
    //   148: aload_1
    //   149: invokevirtual 169	java/io/OutputStream:write	([B)V
    //   152: getstatic 10	com/tencent/smtt/utils/LogFileUtils:a	Ljava/io/OutputStream;
    //   155: iconst_2
    //   156: newarray byte
    //   158: dup
    //   159: iconst_0
    //   160: ldc 173
    //   162: bastore
    //   163: dup
    //   164: iconst_1
    //   165: ldc 173
    //   167: bastore
    //   168: invokevirtual 169	java/io/OutputStream:write	([B)V
    //   171: goto -61 -> 110
    //   174: astore_0
    //   175: getstatic 10	com/tencent/smtt/utils/LogFileUtils:a	Ljava/io/OutputStream;
    //   178: astore_0
    //   179: aload_0
    //   180: ifnull +9 -> 189
    //   183: getstatic 10	com/tencent/smtt/utils/LogFileUtils:a	Ljava/io/OutputStream;
    //   186: invokevirtual 172	java/io/OutputStream:flush	()V
    //   189: ldc 124
    //   191: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   194: goto -65 -> 129
    //   197: astore_0
    //   198: ldc 2
    //   200: monitorexit
    //   201: aload_0
    //   202: athrow
    //   203: astore_0
    //   204: getstatic 10	com/tencent/smtt/utils/LogFileUtils:a	Ljava/io/OutputStream;
    //   207: astore_1
    //   208: aload_1
    //   209: ifnull +9 -> 218
    //   212: getstatic 10	com/tencent/smtt/utils/LogFileUtils:a	Ljava/io/OutputStream;
    //   215: invokevirtual 172	java/io/OutputStream:flush	()V
    //   218: ldc 124
    //   220: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   223: aload_0
    //   224: athrow
    //   225: astore_0
    //   226: goto -102 -> 124
    //   229: astore_1
    //   230: goto -12 -> 218
    //   233: astore_0
    //   234: goto -45 -> 189
    //
    // Exception table:
    //   from	to	target	type
    //   20	63	174	java/lang/Throwable
    //   63	96	174	java/lang/Throwable
    //   100	110	174	java/lang/Throwable
    //   138	171	174	java/lang/Throwable
    //   3	14	197	finally
    //   110	114	197	finally
    //   118	124	197	finally
    //   124	129	197	finally
    //   175	179	197	finally
    //   183	189	197	finally
    //   189	194	197	finally
    //   204	208	197	finally
    //   212	218	197	finally
    //   218	225	197	finally
    //   20	63	203	finally
    //   63	96	203	finally
    //   100	110	203	finally
    //   138	171	203	finally
    //   118	124	225	java/lang/Throwable
    //   212	218	229	java/lang/Throwable
    //   183	189	233	java/lang/Throwable
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.utils.LogFileUtils
 * JD-Core Version:    0.6.2
 */
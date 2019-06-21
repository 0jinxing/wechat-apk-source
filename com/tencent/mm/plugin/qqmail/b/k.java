package com.tencent.mm.plugin.qqmail.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.File;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.KeySpec;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class k
{
  public static int ptP = 100;
  private int ehD;
  public String ptQ;

  public k(String paramString, int paramInt)
  {
    AppMethodBeat.i(67933);
    this.ptQ = null;
    this.ehD = ptP;
    ab.i("Msg.Plugin.HttpRequestCache", "HttpRequestCache constructor, path = " + paramString + ", maxCount = " + paramInt);
    this.ptQ = paramString;
    paramString = new File(this.ptQ);
    if (!paramString.exists())
      paramString.mkdir();
    if (paramInt > 0);
    while (true)
    {
      this.ehD = paramInt;
      AppMethodBeat.o(67933);
      return;
      paramInt = ptP;
    }
  }

  private static byte[] Ve(String paramString)
  {
    AppMethodBeat.i(67937);
    paramString = g.x(paramString.toString().getBytes()).substring(8, 16).getBytes();
    AppMethodBeat.o(67937);
    return paramString;
  }

  private static int Vf(String paramString)
  {
    AppMethodBeat.i(67938);
    paramString = new File(paramString).list();
    int i;
    if (paramString != null)
    {
      i = paramString.length;
      AppMethodBeat.o(67938);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(67938);
    }
  }

  private static byte[] decrypt(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    AppMethodBeat.i(67941);
    try
    {
      Object localObject = new javax/crypto/spec/DESKeySpec;
      ((DESKeySpec)localObject).<init>(paramArrayOfByte2);
      SecretKey localSecretKey = SecretKeyFactory.getInstance("DES").generateSecret((KeySpec)localObject);
      paramArrayOfByte2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      localObject = new javax/crypto/spec/IvParameterSpec;
      ((IvParameterSpec)localObject).<init>("12345678".getBytes());
      paramArrayOfByte2.init(2, localSecretKey, (AlgorithmParameterSpec)localObject);
      paramArrayOfByte1 = paramArrayOfByte2.doFinal(paramArrayOfByte1);
      AppMethodBeat.o(67941);
      return paramArrayOfByte1;
    }
    catch (Exception paramArrayOfByte1)
    {
      while (true)
      {
        ab.printErrStackTrace("Msg.Plugin.HttpRequestCache", paramArrayOfByte1, "", new Object[0]);
        paramArrayOfByte1 = null;
      }
    }
  }

  private static byte[] encrypt(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    AppMethodBeat.i(67940);
    try
    {
      Object localObject = new javax/crypto/spec/DESKeySpec;
      ((DESKeySpec)localObject).<init>(paramArrayOfByte2);
      paramArrayOfByte2 = SecretKeyFactory.getInstance("DES").generateSecret((KeySpec)localObject);
      localObject = Cipher.getInstance("DES/CBC/PKCS5Padding");
      IvParameterSpec localIvParameterSpec = new javax/crypto/spec/IvParameterSpec;
      localIvParameterSpec.<init>("12345678".getBytes());
      ((Cipher)localObject).init(1, paramArrayOfByte2, localIvParameterSpec);
      paramArrayOfByte1 = ((Cipher)localObject).doFinal(paramArrayOfByte1);
      AppMethodBeat.o(67940);
      return paramArrayOfByte1;
    }
    catch (Exception paramArrayOfByte1)
    {
      while (true)
      {
        ab.printErrStackTrace("Msg.Plugin.HttpRequestCache", paramArrayOfByte1, "", new Object[0]);
        paramArrayOfByte1 = null;
      }
    }
  }

  // ERROR //
  public static byte[] readFromFile(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: ldc 150
    //   4: invokestatic 25	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: new 58	java/io/File
    //   10: astore_2
    //   11: aload_2
    //   12: aload_0
    //   13: invokespecial 59	java/io/File:<init>	(Ljava/lang/String;)V
    //   16: aload_2
    //   17: invokevirtual 63	java/io/File:exists	()Z
    //   20: istore_3
    //   21: iload_3
    //   22: ifne +12 -> 34
    //   25: ldc 150
    //   27: invokestatic 69	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   30: aload_1
    //   31: astore_0
    //   32: aload_0
    //   33: areturn
    //   34: aload_2
    //   35: invokevirtual 154	java/io/File:length	()J
    //   38: l2i
    //   39: istore 4
    //   41: new 156	java/io/FileInputStream
    //   44: astore 5
    //   46: aload 5
    //   48: aload_2
    //   49: invokespecial 159	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   52: aload 5
    //   54: astore_0
    //   55: iload 4
    //   57: newarray byte
    //   59: astore_2
    //   60: aload 5
    //   62: astore_0
    //   63: aload 5
    //   65: aload_2
    //   66: invokevirtual 163	java/io/FileInputStream:read	([B)I
    //   69: istore 6
    //   71: iload 6
    //   73: iload 4
    //   75: if_icmpeq +34 -> 109
    //   78: aload 5
    //   80: invokevirtual 166	java/io/FileInputStream:close	()V
    //   83: ldc 150
    //   85: invokestatic 69	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   88: aload_1
    //   89: astore_0
    //   90: goto -58 -> 32
    //   93: astore_0
    //   94: ldc 31
    //   96: aload_0
    //   97: ldc 140
    //   99: iconst_0
    //   100: anewarray 4	java/lang/Object
    //   103: invokestatic 144	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   106: goto -23 -> 83
    //   109: aload 5
    //   111: invokevirtual 166	java/io/FileInputStream:close	()V
    //   114: ldc 150
    //   116: invokestatic 69	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   119: aload_2
    //   120: astore_0
    //   121: goto -89 -> 32
    //   124: astore_0
    //   125: ldc 31
    //   127: aload_0
    //   128: ldc 140
    //   130: iconst_0
    //   131: anewarray 4	java/lang/Object
    //   134: invokestatic 144	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   137: goto -23 -> 114
    //   140: astore_2
    //   141: aconst_null
    //   142: astore 5
    //   144: aload 5
    //   146: astore_0
    //   147: ldc 31
    //   149: aload_2
    //   150: ldc 140
    //   152: iconst_0
    //   153: anewarray 4	java/lang/Object
    //   156: invokestatic 144	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   159: aload 5
    //   161: ifnull +8 -> 169
    //   164: aload 5
    //   166: invokevirtual 166	java/io/FileInputStream:close	()V
    //   169: ldc 150
    //   171: invokestatic 69	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   174: aload_1
    //   175: astore_0
    //   176: goto -144 -> 32
    //   179: astore_0
    //   180: ldc 31
    //   182: aload_0
    //   183: ldc 140
    //   185: iconst_0
    //   186: anewarray 4	java/lang/Object
    //   189: invokestatic 144	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   192: goto -23 -> 169
    //   195: astore 5
    //   197: aconst_null
    //   198: astore_0
    //   199: aload_0
    //   200: ifnull +7 -> 207
    //   203: aload_0
    //   204: invokevirtual 166	java/io/FileInputStream:close	()V
    //   207: ldc 150
    //   209: invokestatic 69	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   212: aload 5
    //   214: athrow
    //   215: astore_0
    //   216: ldc 31
    //   218: aload_0
    //   219: ldc 140
    //   221: iconst_0
    //   222: anewarray 4	java/lang/Object
    //   225: invokestatic 144	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   228: goto -21 -> 207
    //   231: astore 5
    //   233: goto -34 -> 199
    //   236: astore_2
    //   237: goto -93 -> 144
    //
    // Exception table:
    //   from	to	target	type
    //   78	83	93	java/io/IOException
    //   109	114	124	java/io/IOException
    //   7	21	140	java/lang/Exception
    //   34	52	140	java/lang/Exception
    //   164	169	179	java/io/IOException
    //   7	21	195	finally
    //   34	52	195	finally
    //   203	207	215	java/io/IOException
    //   55	60	231	finally
    //   63	71	231	finally
    //   147	159	231	finally
    //   55	60	236	java/lang/Exception
    //   63	71	236	java/lang/Exception
  }

  private static String u(String paramString, Map<String, String> paramMap)
  {
    AppMethodBeat.i(67936);
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(paramString);
    if (paramMap != null)
    {
      paramMap = paramMap.entrySet().iterator();
      while (paramMap.hasNext())
      {
        Object localObject = (Map.Entry)paramMap.next();
        paramString = (String)((Map.Entry)localObject).getKey();
        localObject = (String)((Map.Entry)localObject).getValue();
        localStringBuffer.append(paramString);
        localStringBuffer.append((String)localObject);
      }
    }
    paramString = g.x(localStringBuffer.toString().getBytes());
    AppMethodBeat.o(67936);
    return paramString;
  }

  // ERROR //
  public static boolean z(String paramString, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: ldc 210
    //   4: invokestatic 25	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: new 212	java/io/FileOutputStream
    //   10: astore_3
    //   11: aload_3
    //   12: aload_0
    //   13: invokespecial 213	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   16: aload_3
    //   17: astore_0
    //   18: aload_3
    //   19: aload_1
    //   20: invokevirtual 216	java/io/FileOutputStream:write	([B)V
    //   23: aload_3
    //   24: astore_0
    //   25: aload_3
    //   26: invokevirtual 219	java/io/FileOutputStream:flush	()V
    //   29: aload_3
    //   30: invokevirtual 220	java/io/FileOutputStream:close	()V
    //   33: iconst_1
    //   34: istore_2
    //   35: ldc 210
    //   37: invokestatic 69	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   40: iload_2
    //   41: ireturn
    //   42: astore_0
    //   43: ldc 31
    //   45: aload_0
    //   46: ldc 140
    //   48: iconst_0
    //   49: anewarray 4	java/lang/Object
    //   52: invokestatic 144	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   55: goto -22 -> 33
    //   58: astore 4
    //   60: aconst_null
    //   61: astore_1
    //   62: aload_1
    //   63: astore_0
    //   64: ldc 31
    //   66: aload 4
    //   68: ldc 140
    //   70: iconst_0
    //   71: anewarray 4	java/lang/Object
    //   74: invokestatic 144	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   77: aload_1
    //   78: ifnull +7 -> 85
    //   81: aload_1
    //   82: invokevirtual 220	java/io/FileOutputStream:close	()V
    //   85: ldc 210
    //   87: invokestatic 69	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   90: goto -50 -> 40
    //   93: astore_0
    //   94: ldc 31
    //   96: aload_0
    //   97: ldc 140
    //   99: iconst_0
    //   100: anewarray 4	java/lang/Object
    //   103: invokestatic 144	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   106: goto -21 -> 85
    //   109: astore_1
    //   110: aconst_null
    //   111: astore_0
    //   112: aload_0
    //   113: ifnull +7 -> 120
    //   116: aload_0
    //   117: invokevirtual 220	java/io/FileOutputStream:close	()V
    //   120: ldc 210
    //   122: invokestatic 69	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   125: aload_1
    //   126: athrow
    //   127: astore_0
    //   128: ldc 31
    //   130: aload_0
    //   131: ldc 140
    //   133: iconst_0
    //   134: anewarray 4	java/lang/Object
    //   137: invokestatic 144	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   140: goto -20 -> 120
    //   143: astore_1
    //   144: goto -32 -> 112
    //   147: astore 4
    //   149: aload_3
    //   150: astore_1
    //   151: goto -89 -> 62
    //
    // Exception table:
    //   from	to	target	type
    //   29	33	42	java/io/IOException
    //   7	16	58	java/lang/Exception
    //   81	85	93	java/io/IOException
    //   7	16	109	finally
    //   116	120	127	java/io/IOException
    //   18	23	143	finally
    //   25	29	143	finally
    //   64	77	143	finally
    //   18	23	147	java/lang/Exception
    //   25	29	147	java/lang/Exception
  }

  public final boolean a(String paramString, Map<String, String> paramMap, byte[] paramArrayOfByte)
  {
    boolean bool = false;
    AppMethodBeat.i(67935);
    if ((paramString == null) || (paramString.length() == 0) || (paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
    {
      ab.e("Msg.Plugin.HttpRequestCache", "setCache, invalid argument");
      AppMethodBeat.o(67935);
    }
    while (true)
    {
      return bool;
      cco();
      paramString = u(paramString, paramMap);
      paramMap = encrypt(paramArrayOfByte, Ve(paramString));
      if (paramMap == null)
      {
        ab.e("Msg.Plugin.HttpRequestCache", "encrypt fail, cipherText is null");
        AppMethodBeat.o(67935);
      }
      else
      {
        bool = z(this.ptQ + paramString, paramMap);
        AppMethodBeat.o(67935);
      }
    }
  }

  public final void cco()
  {
    AppMethodBeat.i(67939);
    if (Vf(this.ptQ) < this.ehD)
      AppMethodBeat.o(67939);
    while (true)
    {
      return;
      String[] arrayOfString = new File(this.ptQ).list();
      File localFile = null;
      int i = arrayOfString.length;
      for (int j = 0; j < i; j++)
      {
        localFile = new File(arrayOfString[j]);
        localFile.lastModified();
      }
      if (localFile.exists())
        localFile.delete();
      AppMethodBeat.o(67939);
    }
  }

  public final byte[] t(String paramString, Map<String, String> paramMap)
  {
    Object localObject = null;
    AppMethodBeat.i(67934);
    if ((paramString == null) || (paramString.length() == 0))
    {
      ab.e("Msg.Plugin.HttpRequestCache", "getCache, invalid argument");
      AppMethodBeat.o(67934);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      paramMap = u(paramString, paramMap);
      paramString = readFromFile(this.ptQ + paramMap);
      if (paramString == null)
      {
        ab.i("Msg.Plugin.HttpRequestCache", "readFromFile fail, cipherText is null, read error or cache not exist");
        AppMethodBeat.o(67934);
        paramString = localObject;
      }
      else
      {
        paramString = decrypt(paramString, Ve(paramMap));
        if (paramString == null)
        {
          ab.e("Msg.Plugin.HttpRequestCache", "decrypt fail, plaintText is null");
          AppMethodBeat.o(67934);
          paramString = localObject;
        }
        else
        {
          AppMethodBeat.o(67934);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.b.k
 * JD-Core Version:    0.6.2
 */
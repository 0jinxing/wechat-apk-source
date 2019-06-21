package com.tencent.matrix.d;

import android.content.Context;
import java.io.Closeable;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class d
{
  private static char[] caT = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
  private static final ThreadLocal<MessageDigest> caU = new ThreadLocal()
  {
    private static MessageDigest zN()
    {
      try
      {
        MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
        return localMessageDigest;
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        throw new RuntimeException("Initialize MD5 failed.", localNoSuchAlgorithmException);
      }
    }
  };
  private static String processName = null;

  public static String aD(Context paramContext)
  {
    if (processName != null)
      paramContext = processName;
    while (true)
    {
      return paramContext;
      paramContext = aE(paramContext);
      processName = paramContext;
    }
  }

  // ERROR //
  private static String aE(Context paramContext)
  {
    // Byte code:
    //   0: invokestatic 54	android/os/Process:myPid	()I
    //   3: istore_1
    //   4: aload_0
    //   5: ifnull +7 -> 12
    //   8: iload_1
    //   9: ifgt +8 -> 17
    //   12: ldc 56
    //   14: astore_0
    //   15: aload_0
    //   16: areturn
    //   17: aload_0
    //   18: ldc 58
    //   20: invokevirtual 64	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   23: checkcast 66	android/app/ActivityManager
    //   26: astore_0
    //   27: aload_0
    //   28: ifnull +88 -> 116
    //   31: aload_0
    //   32: invokevirtual 70	android/app/ActivityManager:getRunningAppProcesses	()Ljava/util/List;
    //   35: astore_0
    //   36: aload_0
    //   37: ifnull +79 -> 116
    //   40: aload_0
    //   41: invokeinterface 76 1 0
    //   46: astore_2
    //   47: aload_2
    //   48: invokeinterface 82 1 0
    //   53: ifeq +35 -> 88
    //   56: aload_2
    //   57: invokeinterface 86 1 0
    //   62: checkcast 88	android/app/ActivityManager$RunningAppProcessInfo
    //   65: astore_0
    //   66: aload_0
    //   67: getfield 92	android/app/ActivityManager$RunningAppProcessInfo:pid	I
    //   70: istore_3
    //   71: iload_3
    //   72: iload_1
    //   73: if_icmpne -26 -> 47
    //   76: aload_0
    //   77: ifnull +39 -> 116
    //   80: aload_0
    //   81: getfield 93	android/app/ActivityManager$RunningAppProcessInfo:processName	Ljava/lang/String;
    //   84: astore_0
    //   85: goto -70 -> 15
    //   88: aconst_null
    //   89: astore_0
    //   90: goto -14 -> 76
    //   93: astore_0
    //   94: new 95	java/lang/StringBuilder
    //   97: dup
    //   98: ldc 97
    //   100: invokespecial 100	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   103: aload_0
    //   104: invokevirtual 104	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   107: invokevirtual 108	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   110: pop
    //   111: aconst_null
    //   112: astore_0
    //   113: goto -37 -> 76
    //   116: sipush 128
    //   119: newarray byte
    //   121: astore 4
    //   123: new 110	java/io/FileInputStream
    //   126: astore_2
    //   127: new 95	java/lang/StringBuilder
    //   130: astore_0
    //   131: aload_0
    //   132: ldc 112
    //   134: invokespecial 100	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   137: aload_2
    //   138: aload_0
    //   139: iload_1
    //   140: invokevirtual 115	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   143: ldc 117
    //   145: invokevirtual 108	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   148: invokevirtual 120	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   151: invokespecial 121	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   154: aload_2
    //   155: astore_0
    //   156: aload_2
    //   157: aload 4
    //   159: invokevirtual 125	java/io/FileInputStream:read	([B)I
    //   162: istore 5
    //   164: iload 5
    //   166: ifle +74 -> 240
    //   169: iconst_0
    //   170: istore_3
    //   171: iload 5
    //   173: istore_1
    //   174: iload_3
    //   175: iload 5
    //   177: if_icmpge +12 -> 189
    //   180: aload 4
    //   182: iload_3
    //   183: baload
    //   184: ifgt +50 -> 234
    //   187: iload_3
    //   188: istore_1
    //   189: aload_2
    //   190: astore_0
    //   191: new 127	java/lang/String
    //   194: astore 6
    //   196: aload_2
    //   197: astore_0
    //   198: aload 6
    //   200: aload 4
    //   202: iconst_0
    //   203: iload_1
    //   204: ldc 129
    //   206: invokestatic 135	java/nio/charset/Charset:forName	(Ljava/lang/String;)Ljava/nio/charset/Charset;
    //   209: invokespecial 138	java/lang/String:<init>	([BIILjava/nio/charset/Charset;)V
    //   212: aload_2
    //   213: invokevirtual 141	java/io/FileInputStream:close	()V
    //   216: aload 6
    //   218: astore_0
    //   219: goto -204 -> 15
    //   222: astore_0
    //   223: aload_0
    //   224: invokevirtual 104	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   227: pop
    //   228: aload 6
    //   230: astore_0
    //   231: goto -216 -> 15
    //   234: iinc 3 1
    //   237: goto -66 -> 171
    //   240: aload_2
    //   241: invokevirtual 141	java/io/FileInputStream:close	()V
    //   244: ldc 56
    //   246: astore_0
    //   247: goto -232 -> 15
    //   250: astore_0
    //   251: aload_0
    //   252: invokevirtual 104	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   255: pop
    //   256: goto -12 -> 244
    //   259: astore 6
    //   261: aconst_null
    //   262: astore_2
    //   263: aload_2
    //   264: astore_0
    //   265: new 95	java/lang/StringBuilder
    //   268: astore 4
    //   270: aload_2
    //   271: astore_0
    //   272: aload 4
    //   274: ldc 97
    //   276: invokespecial 100	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   279: aload_2
    //   280: astore_0
    //   281: aload 4
    //   283: aload 6
    //   285: invokevirtual 104	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   288: invokevirtual 108	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   291: pop
    //   292: aload_2
    //   293: ifnull -49 -> 244
    //   296: aload_2
    //   297: invokevirtual 141	java/io/FileInputStream:close	()V
    //   300: goto -56 -> 244
    //   303: astore_0
    //   304: aload_0
    //   305: invokevirtual 104	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   308: pop
    //   309: goto -65 -> 244
    //   312: astore_2
    //   313: aconst_null
    //   314: astore_0
    //   315: aload_0
    //   316: ifnull +7 -> 323
    //   319: aload_0
    //   320: invokevirtual 141	java/io/FileInputStream:close	()V
    //   323: aload_2
    //   324: athrow
    //   325: astore_0
    //   326: aload_0
    //   327: invokevirtual 104	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   330: pop
    //   331: goto -8 -> 323
    //   334: astore_2
    //   335: goto -20 -> 315
    //   338: astore 6
    //   340: goto -77 -> 263
    //
    // Exception table:
    //   from	to	target	type
    //   40	47	93	java/lang/Exception
    //   47	71	93	java/lang/Exception
    //   212	216	222	java/lang/Exception
    //   240	244	250	java/lang/Exception
    //   123	154	259	java/lang/Exception
    //   296	300	303	java/lang/Exception
    //   123	154	312	finally
    //   319	323	325	java/lang/Exception
    //   156	164	334	finally
    //   191	196	334	finally
    //   198	212	334	finally
    //   265	270	334	finally
    //   272	279	334	finally
    //   281	292	334	finally
    //   156	164	338	java/lang/Exception
    //   191	196	338	java/lang/Exception
    //   198	212	338	java/lang/Exception
  }

  public static String ck(String paramString)
  {
    paramString = paramString.getBytes();
    byte[] arrayOfByte = ((MessageDigest)caU.get()).digest(paramString);
    int i = arrayOfByte.length;
    paramString = new StringBuffer(i * 2);
    for (int j = 0; j < i + 0; j++)
    {
      int k = arrayOfByte[j];
      char c1 = caT[((k & 0xF0) >> 4)];
      char c2 = caT[(k & 0xF)];
      paramString.append(c1);
      paramString.append(c2);
    }
    return paramString.toString();
  }

  public static void closeQuietly(Closeable paramCloseable)
  {
    if (paramCloseable != null);
    try
    {
      paramCloseable.close();
      label10: return;
    }
    catch (IOException paramCloseable)
    {
      break label10;
    }
  }

  public static String formatTime(String paramString, long paramLong)
  {
    return new SimpleDateFormat(paramString).format(new Date(paramLong));
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.d.d
 * JD-Core Version:    0.6.2
 */
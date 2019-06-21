package c.t.m.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class p
{
  public static int a = 20000;

  public static byte[] a(String paramString)
  {
    AppMethodBeat.i(136400);
    Object localObject;
    try
    {
      localObject = new java/net/URL;
      ((URL)localObject).<init>(paramString);
      paramString = ((URL)localObject).openConnection();
      paramString.connect();
      localObject = new java/io/ByteArrayOutputStream;
      ((ByteArrayOutputStream)localObject).<init>();
      byte[] arrayOfByte = new byte[1024];
      while (true)
      {
        int i = paramString.getInputStream().read(arrayOfByte);
        if (i == -1)
          break;
        ((ByteArrayOutputStream)localObject).write(arrayOfByte, 0, i);
      }
    }
    catch (Exception paramString)
    {
      paramString = null;
      AppMethodBeat.o(136400);
    }
    while (true)
    {
      return paramString;
      paramString = ((ByteArrayOutputStream)localObject).toByteArray();
      ((ByteArrayOutputStream)localObject).close();
      AppMethodBeat.o(136400);
    }
  }

  // ERROR //
  public static byte[] a(String paramString, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: ldc 68
    //   2: invokestatic 21	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 23	java/net/URL
    //   8: astore_2
    //   9: aload_2
    //   10: aload_0
    //   11: invokespecial 27	java/net/URL:<init>	(Ljava/lang/String;)V
    //   14: aload_2
    //   15: invokevirtual 31	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   18: checkcast 70	java/net/HttpURLConnection
    //   21: astore_2
    //   22: aload_2
    //   23: astore_0
    //   24: aload_2
    //   25: getstatic 10	c/t/m/c/p:a	I
    //   28: invokevirtual 73	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   31: aload_2
    //   32: astore_0
    //   33: aload_2
    //   34: getstatic 10	c/t/m/c/p:a	I
    //   37: invokevirtual 76	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   40: aload_2
    //   41: astore_0
    //   42: aload_2
    //   43: iconst_1
    //   44: invokevirtual 80	java/net/HttpURLConnection:setDoInput	(Z)V
    //   47: aload_2
    //   48: astore_0
    //   49: aload_2
    //   50: iconst_1
    //   51: invokevirtual 83	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   54: aload_2
    //   55: astore_0
    //   56: aload_2
    //   57: ldc 85
    //   59: invokevirtual 88	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   62: aload_2
    //   63: astore_0
    //   64: aload_2
    //   65: iconst_0
    //   66: invokevirtual 91	java/net/HttpURLConnection:setUseCaches	(Z)V
    //   69: aload_2
    //   70: astore_0
    //   71: aload_2
    //   72: ldc 93
    //   74: ldc 95
    //   76: invokevirtual 99	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   79: aload_2
    //   80: astore_0
    //   81: aload_2
    //   82: ldc 101
    //   84: aload_1
    //   85: arraylength
    //   86: invokestatic 107	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   89: invokevirtual 99	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   92: aload_2
    //   93: astore_0
    //   94: aload_2
    //   95: invokevirtual 111	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   98: aload_1
    //   99: invokevirtual 116	java/io/OutputStream:write	([B)V
    //   102: aload_2
    //   103: astore_0
    //   104: aload_2
    //   105: invokevirtual 120	java/net/HttpURLConnection:getResponseCode	()I
    //   108: sipush 200
    //   111: if_icmpne +115 -> 226
    //   114: aload_2
    //   115: astore_0
    //   116: aload_2
    //   117: invokevirtual 121	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   120: astore_3
    //   121: aload_2
    //   122: astore_0
    //   123: new 38	java/io/ByteArrayOutputStream
    //   126: astore 4
    //   128: aload_2
    //   129: astore_0
    //   130: aload 4
    //   132: invokespecial 40	java/io/ByteArrayOutputStream:<init>	()V
    //   135: aload_2
    //   136: astore_0
    //   137: sipush 128
    //   140: newarray byte
    //   142: astore_1
    //   143: aload_2
    //   144: astore_0
    //   145: aload_3
    //   146: aload_1
    //   147: invokevirtual 50	java/io/InputStream:read	([B)I
    //   150: istore 5
    //   152: iload 5
    //   154: iconst_m1
    //   155: if_icmpeq +45 -> 200
    //   158: aload_2
    //   159: astore_0
    //   160: aload 4
    //   162: aload_1
    //   163: iconst_0
    //   164: iload 5
    //   166: invokevirtual 54	java/io/ByteArrayOutputStream:write	([BII)V
    //   169: goto -26 -> 143
    //   172: astore_0
    //   173: aload_2
    //   174: astore_1
    //   175: aload_1
    //   176: astore_0
    //   177: sipush 20000
    //   180: putstatic 10	c/t/m/c/p:a	I
    //   183: aload_1
    //   184: ifnull +7 -> 191
    //   187: aload_1
    //   188: invokevirtual 124	java/net/HttpURLConnection:disconnect	()V
    //   191: ldc 68
    //   193: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   196: aconst_null
    //   197: astore_0
    //   198: aload_0
    //   199: areturn
    //   200: aload_2
    //   201: astore_0
    //   202: aload 4
    //   204: invokevirtual 61	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   207: astore_1
    //   208: aload_2
    //   209: ifnull +7 -> 216
    //   212: aload_2
    //   213: invokevirtual 124	java/net/HttpURLConnection:disconnect	()V
    //   216: ldc 68
    //   218: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   221: aload_1
    //   222: astore_0
    //   223: goto -25 -> 198
    //   226: aload_2
    //   227: ifnull +7 -> 234
    //   230: aload_2
    //   231: invokevirtual 124	java/net/HttpURLConnection:disconnect	()V
    //   234: sipush 20000
    //   237: putstatic 10	c/t/m/c/p:a	I
    //   240: ldc 68
    //   242: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   245: aconst_null
    //   246: astore_0
    //   247: goto -49 -> 198
    //   250: astore_1
    //   251: aconst_null
    //   252: astore_0
    //   253: aload_0
    //   254: ifnull +7 -> 261
    //   257: aload_0
    //   258: invokevirtual 124	java/net/HttpURLConnection:disconnect	()V
    //   261: ldc 68
    //   263: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   266: aload_1
    //   267: athrow
    //   268: astore_1
    //   269: goto -16 -> 253
    //   272: astore_0
    //   273: aconst_null
    //   274: astore_1
    //   275: goto -100 -> 175
    //
    // Exception table:
    //   from	to	target	type
    //   24	31	172	java/io/IOException
    //   33	40	172	java/io/IOException
    //   42	47	172	java/io/IOException
    //   49	54	172	java/io/IOException
    //   56	62	172	java/io/IOException
    //   64	69	172	java/io/IOException
    //   71	79	172	java/io/IOException
    //   81	92	172	java/io/IOException
    //   94	102	172	java/io/IOException
    //   104	114	172	java/io/IOException
    //   116	121	172	java/io/IOException
    //   123	128	172	java/io/IOException
    //   130	135	172	java/io/IOException
    //   137	143	172	java/io/IOException
    //   145	152	172	java/io/IOException
    //   160	169	172	java/io/IOException
    //   202	208	172	java/io/IOException
    //   5	22	250	finally
    //   24	31	268	finally
    //   33	40	268	finally
    //   42	47	268	finally
    //   49	54	268	finally
    //   56	62	268	finally
    //   64	69	268	finally
    //   71	79	268	finally
    //   81	92	268	finally
    //   94	102	268	finally
    //   104	114	268	finally
    //   116	121	268	finally
    //   123	128	268	finally
    //   130	135	268	finally
    //   137	143	268	finally
    //   145	152	268	finally
    //   160	169	268	finally
    //   177	183	268	finally
    //   202	208	268	finally
    //   5	22	272	java/io/IOException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     c.t.m.c.p
 * JD-Core Version:    0.6.2
 */
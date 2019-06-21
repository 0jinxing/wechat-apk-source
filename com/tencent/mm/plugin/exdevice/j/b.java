package com.tencent.mm.plugin.exdevice.j;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.m.e;
import com.tencent.mm.m.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

public final class b
{
  public static int J(Context paramContext, int paramInt)
  {
    paramInt = 0;
    int i = 0;
    AppMethodBeat.i(20258);
    try
    {
      Rect localRect = new android/graphics/Rect;
      localRect.<init>();
      ((Activity)paramContext).getWindow().getDecorView().getWindowVisibleDisplayFrame(localRect);
      int j = ((Activity)paramContext).getWindow().getDecorView().getHeight();
      int k;
      if (j - localRect.height() >= 0)
        k = localRect.height();
      for (paramInt = j - k; paramInt <= 0; paramInt = j)
      {
        paramInt = i;
        AppMethodBeat.o(20258);
        return paramInt;
        j = localRect.top;
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        ab.i("MicroMsg.exdevice.Util", "getStatusHeight err: %s", new Object[] { paramContext.toString() });
        AppMethodBeat.o(20258);
      }
    }
    finally
    {
      while (true)
        AppMethodBeat.o(20258);
    }
  }

  public static long KK(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(20243);
    long l;
    if ((paramString == null) || (paramString.length() == 0))
    {
      ab.e("MicroMsg.exdevice.Util", "mac string is null or nil");
      AppMethodBeat.o(20243);
      l = 0L;
    }
    while (true)
    {
      return l;
      String[] arrayOfString = paramString.toUpperCase(Locale.US).split(":");
      paramString = new Byte[arrayOfString.length];
      int j = arrayOfString.length;
      int k = 0;
      int m = 0;
      if (k < j)
      {
        String str = arrayOfString[k];
        if ((byte)str.charAt(0) >= 65)
        {
          n = str.charAt(0) - 'A' + 10 << 4;
          label110: if ((byte)str.charAt(1) < 65)
            break label174;
        }
        label174: for (int i1 = str.charAt(1) - 'A' + 10; ; i1 = str.charAt(1) - '0')
        {
          paramString[m] = Byte.valueOf((byte)(n | i1));
          k++;
          m++;
          break;
          n = str.charAt(0) - '0' << 4;
          break label110;
        }
      }
      m = arrayOfString.length - 1;
      int n = paramString.length;
      l = 0L;
      k = i;
      while (k < n)
      {
        l |= (paramString[k].longValue() & 0xFF) << (m << 3);
        k++;
        m--;
      }
      AppMethodBeat.o(20243);
    }
  }

  public static String KL(String paramString)
  {
    AppMethodBeat.i(20249);
    if ((paramString == null) || (12 != paramString.length()))
    {
      ab.e("MicroMsg.exdevice.Util", "%s is not server string mac", new Object[] { paramString });
      paramString = null;
      AppMethodBeat.o(20249);
    }
    while (true)
    {
      return paramString;
      StringBuilder localStringBuilder = new StringBuilder("");
      for (int i = 0; i < paramString.length(); i++)
      {
        localStringBuilder.append(paramString.charAt(i));
        if ((i % 2 != 0) && (i < paramString.length() - 1))
          localStringBuilder.append(":");
      }
      ab.i("MicroMsg.exdevice.Util", "%s to %s is ok", new Object[] { paramString, localStringBuilder.toString() });
      paramString = localStringBuilder.toString();
      AppMethodBeat.o(20249);
    }
  }

  public static String S(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(20246);
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
    {
      paramArrayOfByte = null;
      AppMethodBeat.o(20246);
    }
    while (true)
    {
      return paramArrayOfByte;
      int i = paramInt;
      if (paramArrayOfByte.length < paramInt)
      {
        ab.w("MicroMsg.exdevice.Util", "data length is shorter then print command length");
        i = paramArrayOfByte.length;
      }
      StringBuilder localStringBuilder = new StringBuilder();
      for (paramInt = 0; paramInt < i; paramInt++)
      {
        int j = paramArrayOfByte[paramInt] & 0xFF;
        if (j < 16)
          localStringBuilder.append("0");
        localStringBuilder.append(Integer.toHexString(j));
      }
      paramArrayOfByte = localStringBuilder.toString().toUpperCase(Locale.US);
      AppMethodBeat.o(20246);
    }
  }

  public static String aN(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(20245);
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
    {
      paramArrayOfByte = null;
      AppMethodBeat.o(20245);
    }
    while (true)
    {
      return paramArrayOfByte;
      paramArrayOfByte = S(paramArrayOfByte, paramArrayOfByte.length);
      AppMethodBeat.o(20245);
    }
  }

  public static long aO(byte[] paramArrayOfByte)
  {
    long l = 0L;
    for (int i = 0; i < 8; i++)
      l |= (paramArrayOfByte[i] & 0xFF) << (7 - i << 3);
    return l;
  }

  public static UUID aP(byte[] paramArrayOfByte)
  {
    Object localObject = null;
    AppMethodBeat.i(20254);
    ab.d("MicroMsg.exdevice.Util", "parseUUIDFromByteArray, uuid byte array = %s", new Object[] { aN(paramArrayOfByte) });
    if (bo.cb(paramArrayOfByte))
    {
      ab.e("MicroMsg.exdevice.Util", "aUUIDByteArray is null or nil");
      AppMethodBeat.o(20254);
      paramArrayOfByte = localObject;
    }
    while (true)
    {
      return paramArrayOfByte;
      if (16 != paramArrayOfByte.length)
      {
        ab.e("MicroMsg.exdevice.Util", "the length (%d) of this byte array is not 16", new Object[] { Integer.valueOf(paramArrayOfByte.length) });
        AppMethodBeat.o(20254);
        paramArrayOfByte = localObject;
      }
      else
      {
        ByteBuffer localByteBuffer1 = ByteBuffer.allocate(8);
        ByteBuffer localByteBuffer2 = ByteBuffer.allocate(8);
        try
        {
          localByteBuffer1.put(paramArrayOfByte, 0, 8);
          localByteBuffer1.flip();
          localByteBuffer2.put(paramArrayOfByte, 8, 8);
          localByteBuffer2.flip();
          paramArrayOfByte = new UUID(localByteBuffer1.getLong(), localByteBuffer2.getLong());
          ab.d("MicroMsg.exdevice.Util", "parse successful, string of uuid = %s", new Object[] { paramArrayOfByte.toString() });
          AppMethodBeat.o(20254);
        }
        catch (Exception paramArrayOfByte)
        {
          ab.e("MicroMsg.exdevice.Util", "%s", new Object[] { paramArrayOfByte.getMessage() });
          AppMethodBeat.o(20254);
          paramArrayOfByte = localObject;
        }
      }
    }
  }

  // ERROR //
  public static Object aQ(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: sipush 20257
    //   7: invokestatic 14	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   10: aload_0
    //   11: ifnonnull +13 -> 24
    //   14: sipush 20257
    //   17: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   20: aload_2
    //   21: astore_0
    //   22: aload_0
    //   23: areturn
    //   24: new 218	java/io/ByteArrayInputStream
    //   27: dup
    //   28: aload_0
    //   29: invokespecial 221	java/io/ByteArrayInputStream:<init>	([B)V
    //   32: astore_3
    //   33: new 223	java/io/ObjectInputStream
    //   36: astore_2
    //   37: aload_2
    //   38: aload_3
    //   39: invokespecial 226	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   42: aload_2
    //   43: astore_0
    //   44: aload_2
    //   45: invokevirtual 230	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   48: astore 4
    //   50: aload 4
    //   52: astore_0
    //   53: aload_2
    //   54: invokevirtual 233	java/io/ObjectInputStream:close	()V
    //   57: aload_3
    //   58: invokevirtual 234	java/io/ByteArrayInputStream:close	()V
    //   61: sipush 20257
    //   64: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   67: goto -45 -> 22
    //   70: astore_2
    //   71: ldc 54
    //   73: aload_2
    //   74: ldc 121
    //   76: iconst_0
    //   77: anewarray 4	java/lang/Object
    //   80: invokestatic 238	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   83: goto -26 -> 57
    //   86: astore_2
    //   87: ldc 54
    //   89: aload_2
    //   90: ldc 121
    //   92: iconst_0
    //   93: anewarray 4	java/lang/Object
    //   96: invokestatic 238	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   99: goto -38 -> 61
    //   102: astore 4
    //   104: aconst_null
    //   105: astore_2
    //   106: aload_2
    //   107: astore_0
    //   108: new 119	java/lang/StringBuilder
    //   111: astore 5
    //   113: aload_2
    //   114: astore_0
    //   115: aload 5
    //   117: ldc 240
    //   119: invokespecial 124	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   122: aload_2
    //   123: astore_0
    //   124: ldc 54
    //   126: aload 5
    //   128: aload 4
    //   130: invokevirtual 241	java/io/StreamCorruptedException:getMessage	()Ljava/lang/String;
    //   133: invokevirtual 131	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   136: invokevirtual 134	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   139: invokestatic 79	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   142: aload_2
    //   143: astore_0
    //   144: ldc 54
    //   146: aload 4
    //   148: ldc 121
    //   150: iconst_0
    //   151: anewarray 4	java/lang/Object
    //   154: invokestatic 238	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   157: aload_2
    //   158: ifnull +7 -> 165
    //   161: aload_2
    //   162: invokevirtual 233	java/io/ObjectInputStream:close	()V
    //   165: aload_3
    //   166: invokevirtual 234	java/io/ByteArrayInputStream:close	()V
    //   169: aload_1
    //   170: astore_0
    //   171: goto -110 -> 61
    //   174: astore_0
    //   175: ldc 54
    //   177: aload_0
    //   178: ldc 121
    //   180: iconst_0
    //   181: anewarray 4	java/lang/Object
    //   184: invokestatic 238	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   187: aload_1
    //   188: astore_0
    //   189: goto -128 -> 61
    //   192: astore_0
    //   193: ldc 54
    //   195: aload_0
    //   196: ldc 121
    //   198: iconst_0
    //   199: anewarray 4	java/lang/Object
    //   202: invokestatic 238	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   205: goto -40 -> 165
    //   208: astore 4
    //   210: aconst_null
    //   211: astore_2
    //   212: aload_2
    //   213: astore_0
    //   214: new 119	java/lang/StringBuilder
    //   217: astore 5
    //   219: aload_2
    //   220: astore_0
    //   221: aload 5
    //   223: ldc 243
    //   225: invokespecial 124	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   228: aload_2
    //   229: astore_0
    //   230: ldc 54
    //   232: aload 5
    //   234: aload 4
    //   236: invokevirtual 244	java/io/IOException:getMessage	()Ljava/lang/String;
    //   239: invokevirtual 131	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   242: invokevirtual 134	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   245: invokestatic 79	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   248: aload_2
    //   249: astore_0
    //   250: ldc 54
    //   252: aload 4
    //   254: ldc 121
    //   256: iconst_0
    //   257: anewarray 4	java/lang/Object
    //   260: invokestatic 238	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   263: aload_2
    //   264: ifnull +7 -> 271
    //   267: aload_2
    //   268: invokevirtual 233	java/io/ObjectInputStream:close	()V
    //   271: aload_3
    //   272: invokevirtual 234	java/io/ByteArrayInputStream:close	()V
    //   275: aload_1
    //   276: astore_0
    //   277: goto -216 -> 61
    //   280: astore_0
    //   281: ldc 54
    //   283: aload_0
    //   284: ldc 121
    //   286: iconst_0
    //   287: anewarray 4	java/lang/Object
    //   290: invokestatic 238	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   293: aload_1
    //   294: astore_0
    //   295: goto -234 -> 61
    //   298: astore_0
    //   299: ldc 54
    //   301: aload_0
    //   302: ldc 121
    //   304: iconst_0
    //   305: anewarray 4	java/lang/Object
    //   308: invokestatic 238	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   311: goto -40 -> 271
    //   314: astore 4
    //   316: aconst_null
    //   317: astore_2
    //   318: aload_2
    //   319: astore_0
    //   320: new 119	java/lang/StringBuilder
    //   323: astore 5
    //   325: aload_2
    //   326: astore_0
    //   327: aload 5
    //   329: ldc 246
    //   331: invokespecial 124	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   334: aload_2
    //   335: astore_0
    //   336: ldc 54
    //   338: aload 5
    //   340: aload 4
    //   342: invokevirtual 247	java/lang/ClassNotFoundException:getMessage	()Ljava/lang/String;
    //   345: invokevirtual 131	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   348: invokevirtual 134	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   351: invokestatic 79	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   354: aload_2
    //   355: astore_0
    //   356: ldc 54
    //   358: aload 4
    //   360: ldc 121
    //   362: iconst_0
    //   363: anewarray 4	java/lang/Object
    //   366: invokestatic 238	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   369: aload_2
    //   370: ifnull +7 -> 377
    //   373: aload_2
    //   374: invokevirtual 233	java/io/ObjectInputStream:close	()V
    //   377: aload_3
    //   378: invokevirtual 234	java/io/ByteArrayInputStream:close	()V
    //   381: aload_1
    //   382: astore_0
    //   383: goto -322 -> 61
    //   386: astore_0
    //   387: ldc 54
    //   389: aload_0
    //   390: ldc 121
    //   392: iconst_0
    //   393: anewarray 4	java/lang/Object
    //   396: invokestatic 238	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   399: aload_1
    //   400: astore_0
    //   401: goto -340 -> 61
    //   404: astore_0
    //   405: ldc 54
    //   407: aload_0
    //   408: ldc 121
    //   410: iconst_0
    //   411: anewarray 4	java/lang/Object
    //   414: invokestatic 238	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   417: goto -40 -> 377
    //   420: astore_2
    //   421: aconst_null
    //   422: astore_0
    //   423: aload_0
    //   424: ifnull +7 -> 431
    //   427: aload_0
    //   428: invokevirtual 233	java/io/ObjectInputStream:close	()V
    //   431: aload_3
    //   432: invokevirtual 234	java/io/ByteArrayInputStream:close	()V
    //   435: sipush 20257
    //   438: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   441: aload_2
    //   442: athrow
    //   443: astore_0
    //   444: ldc 54
    //   446: aload_0
    //   447: ldc 121
    //   449: iconst_0
    //   450: anewarray 4	java/lang/Object
    //   453: invokestatic 238	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   456: goto -25 -> 431
    //   459: astore_0
    //   460: ldc 54
    //   462: aload_0
    //   463: ldc 121
    //   465: iconst_0
    //   466: anewarray 4	java/lang/Object
    //   469: invokestatic 238	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   472: goto -37 -> 435
    //   475: astore_2
    //   476: goto -53 -> 423
    //   479: astore 4
    //   481: goto -163 -> 318
    //   484: astore 4
    //   486: goto -274 -> 212
    //   489: astore 4
    //   491: goto -385 -> 106
    //
    // Exception table:
    //   from	to	target	type
    //   53	57	70	java/io/IOException
    //   57	61	86	java/io/IOException
    //   33	42	102	java/io/StreamCorruptedException
    //   165	169	174	java/io/IOException
    //   161	165	192	java/io/IOException
    //   33	42	208	java/io/IOException
    //   271	275	280	java/io/IOException
    //   267	271	298	java/io/IOException
    //   33	42	314	java/lang/ClassNotFoundException
    //   377	381	386	java/io/IOException
    //   373	377	404	java/io/IOException
    //   33	42	420	finally
    //   427	431	443	java/io/IOException
    //   431	435	459	java/io/IOException
    //   44	50	475	finally
    //   108	113	475	finally
    //   115	122	475	finally
    //   124	142	475	finally
    //   144	157	475	finally
    //   214	219	475	finally
    //   221	228	475	finally
    //   230	248	475	finally
    //   250	263	475	finally
    //   320	325	475	finally
    //   327	334	475	finally
    //   336	354	475	finally
    //   356	369	475	finally
    //   44	50	479	java/lang/ClassNotFoundException
    //   44	50	484	java/io/IOException
    //   44	50	489	java/io/StreamCorruptedException
  }

  // ERROR //
  public static byte[] bQ(Object paramObject)
  {
    // Byte code:
    //   0: sipush 20256
    //   3: invokestatic 14	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: new 251	java/io/ByteArrayOutputStream
    //   9: dup
    //   10: invokespecial 252	java/io/ByteArrayOutputStream:<init>	()V
    //   13: astore_1
    //   14: new 254	java/io/ObjectOutputStream
    //   17: astore_2
    //   18: aload_2
    //   19: aload_1
    //   20: invokespecial 257	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   23: aload_2
    //   24: astore_3
    //   25: aload_2
    //   26: aload_0
    //   27: invokevirtual 261	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
    //   30: aload_2
    //   31: astore_3
    //   32: aload_2
    //   33: invokevirtual 264	java/io/ObjectOutputStream:flush	()V
    //   36: aload_2
    //   37: astore_3
    //   38: aload_1
    //   39: invokevirtual 268	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   42: astore_0
    //   43: aload_0
    //   44: ifnonnull +13 -> 57
    //   47: aload_2
    //   48: astore_3
    //   49: ldc 54
    //   51: ldc_w 270
    //   54: invokestatic 79	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   57: aload_2
    //   58: invokevirtual 271	java/io/ObjectOutputStream:close	()V
    //   61: aload_1
    //   62: invokevirtual 272	java/io/ByteArrayOutputStream:close	()V
    //   65: sipush 20256
    //   68: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   71: aload_0
    //   72: areturn
    //   73: astore_3
    //   74: ldc 54
    //   76: aload_3
    //   77: ldc 121
    //   79: iconst_0
    //   80: anewarray 4	java/lang/Object
    //   83: invokestatic 238	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   86: goto -25 -> 61
    //   89: astore_3
    //   90: ldc 54
    //   92: aload_3
    //   93: ldc 121
    //   95: iconst_0
    //   96: anewarray 4	java/lang/Object
    //   99: invokestatic 238	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   102: goto -37 -> 65
    //   105: astore 4
    //   107: aconst_null
    //   108: astore_2
    //   109: aconst_null
    //   110: astore_0
    //   111: aload_2
    //   112: astore_3
    //   113: new 119	java/lang/StringBuilder
    //   116: astore 5
    //   118: aload_2
    //   119: astore_3
    //   120: aload 5
    //   122: ldc_w 274
    //   125: invokespecial 124	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   128: aload_2
    //   129: astore_3
    //   130: ldc 54
    //   132: aload 5
    //   134: aload 4
    //   136: invokevirtual 244	java/io/IOException:getMessage	()Ljava/lang/String;
    //   139: invokevirtual 131	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   142: invokevirtual 134	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   145: invokestatic 79	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   148: aload_2
    //   149: astore_3
    //   150: ldc 54
    //   152: aload 4
    //   154: ldc 121
    //   156: iconst_0
    //   157: anewarray 4	java/lang/Object
    //   160: invokestatic 238	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   163: aload_2
    //   164: ifnull +7 -> 171
    //   167: aload_2
    //   168: invokevirtual 271	java/io/ObjectOutputStream:close	()V
    //   171: aload_1
    //   172: invokevirtual 272	java/io/ByteArrayOutputStream:close	()V
    //   175: sipush 20256
    //   178: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   181: goto -110 -> 71
    //   184: astore_3
    //   185: ldc 54
    //   187: aload_3
    //   188: ldc 121
    //   190: iconst_0
    //   191: anewarray 4	java/lang/Object
    //   194: invokestatic 238	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   197: goto -26 -> 171
    //   200: astore_3
    //   201: ldc 54
    //   203: aload_3
    //   204: ldc 121
    //   206: iconst_0
    //   207: anewarray 4	java/lang/Object
    //   210: invokestatic 238	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   213: goto -38 -> 175
    //   216: astore_0
    //   217: aconst_null
    //   218: astore_3
    //   219: aload_3
    //   220: ifnull +7 -> 227
    //   223: aload_3
    //   224: invokevirtual 271	java/io/ObjectOutputStream:close	()V
    //   227: aload_1
    //   228: invokevirtual 272	java/io/ByteArrayOutputStream:close	()V
    //   231: sipush 20256
    //   234: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   237: aload_0
    //   238: athrow
    //   239: astore_3
    //   240: ldc 54
    //   242: aload_3
    //   243: ldc 121
    //   245: iconst_0
    //   246: anewarray 4	java/lang/Object
    //   249: invokestatic 238	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   252: goto -25 -> 227
    //   255: astore_3
    //   256: ldc 54
    //   258: aload_3
    //   259: ldc 121
    //   261: iconst_0
    //   262: anewarray 4	java/lang/Object
    //   265: invokestatic 238	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   268: goto -37 -> 231
    //   271: astore_0
    //   272: goto -53 -> 219
    //   275: astore 4
    //   277: aconst_null
    //   278: astore_0
    //   279: goto -168 -> 111
    //   282: astore 4
    //   284: goto -173 -> 111
    //
    // Exception table:
    //   from	to	target	type
    //   57	61	73	java/io/IOException
    //   61	65	89	java/io/IOException
    //   14	23	105	java/io/IOException
    //   167	171	184	java/io/IOException
    //   171	175	200	java/io/IOException
    //   14	23	216	finally
    //   223	227	239	java/io/IOException
    //   227	231	255	java/io/IOException
    //   25	30	271	finally
    //   32	36	271	finally
    //   38	43	271	finally
    //   49	57	271	finally
    //   113	118	271	finally
    //   120	128	271	finally
    //   130	148	271	finally
    //   150	163	271	finally
    //   25	30	275	java/io/IOException
    //   32	36	275	java/io/IOException
    //   38	43	275	java/io/IOException
    //   49	57	282	java/io/IOException
  }

  public static String bqh()
  {
    int i = 7;
    AppMethodBeat.i(20247);
    String str = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
    Calendar localCalendar = Calendar.getInstance();
    try
    {
      int j = bo.getInt(String.valueOf(localCalendar.get(7)), 0);
      if (j == 1);
      while (true)
      {
        str = str + i;
        AppMethodBeat.o(20247);
        return str;
        i = j - 1;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.exdevice.Util", "parse day failed : %s", new Object[] { localException.getMessage() });
        i = 0;
      }
    }
  }

  public static long bqi()
  {
    long l1 = 60000L;
    AppMethodBeat.i(20250);
    String str = g.Nu().getValue("DeviceAutoSyncDuration");
    if (!bo.isNullOrNil(str));
    while (true)
    {
      try
      {
        l2 = Long.parseLong(str);
        l2 *= 1000L;
        ab.i("MicroMsg.exdevice.Util", "now sync time out is %d", new Object[] { Long.valueOf(l2) });
        if (l2 == 0L)
        {
          AppMethodBeat.o(20250);
          l2 = l1;
          return l2;
        }
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.exdevice.Util", "parse string to time out long failed : %s", new Object[] { localException.getMessage() });
        l2 = 60000L;
        continue;
        AppMethodBeat.o(20250);
        continue;
      }
      long l2 = 60000L;
    }
  }

  public static boolean c(byte[] paramArrayOfByte1, int paramInt, byte[] paramArrayOfByte2)
  {
    boolean bool = false;
    AppMethodBeat.i(20255);
    if ((bo.cb(paramArrayOfByte1)) || (bo.cb(paramArrayOfByte2)) || (paramArrayOfByte2.length + paramInt > paramArrayOfByte1.length) || (paramInt < 0) || (paramInt >= paramArrayOfByte1.length))
      AppMethodBeat.o(20255);
    while (true)
    {
      return bool;
      for (int i = 0; (i < paramArrayOfByte2.length) && (paramArrayOfByte2[i] == paramArrayOfByte1[(i + paramInt)]); i++);
      if (i != paramArrayOfByte2.length)
      {
        AppMethodBeat.o(20255);
      }
      else
      {
        bool = true;
        AppMethodBeat.o(20255);
      }
    }
  }

  public static boolean dX(String paramString1, String paramString2)
  {
    boolean bool = false;
    AppMethodBeat.i(20251);
    ab.i("MicroMsg.exdevice.Util", "isDeviceInDeviceList, device = %s, device list = %s", new Object[] { paramString1, paramString2 });
    if ((bo.isNullOrNil(paramString1)) || (bo.isNullOrNil(paramString2)))
      AppMethodBeat.o(20251);
    while (true)
    {
      return bool;
      try
      {
        paramString2 = paramString2.split("\\|");
        if (paramString2 != null)
          break label108;
        ab.e("MicroMsg.exdevice.Util", "null == deviceArray");
        AppMethodBeat.o(20251);
      }
      catch (Exception paramString1)
      {
        ab.e("MicroMsg.exdevice.Util", "aDeviceList.split failed, %s", new Object[] { paramString1.getMessage() });
        AppMethodBeat.o(20251);
      }
      continue;
      label108: int i = paramString2.length;
      for (int j = 0; ; j++)
      {
        if (j >= i)
          break label148;
        if (paramString2[j].equalsIgnoreCase(paramString1))
        {
          AppMethodBeat.o(20251);
          bool = true;
          break;
        }
      }
      label148: AppMethodBeat.o(20251);
    }
  }

  public static String dY(String paramString1, String paramString2)
  {
    AppMethodBeat.i(20252);
    ab.i("MicroMsg.exdevice.Util", "addDeviceToDeviceList, device = %s, device list = %s", new Object[] { paramString1, paramString2 });
    if ((bo.isNullOrNil(paramString1)) || (paramString2 == null))
    {
      ab.e("MicroMsg.exdevice.Util", "Error parameters!!!");
      paramString1 = null;
      AppMethodBeat.o(20252);
    }
    while (true)
    {
      return paramString1;
      String str = new String();
      paramString2 = str + paramString2;
      paramString1 = paramString2 + paramString1;
      paramString1 = paramString1 + "|";
      ab.i("MicroMsg.exdevice.Util", "add device to device list successful, new device list = %s", new Object[] { paramString1 });
      AppMethodBeat.o(20252);
    }
  }

  public static String dZ(String paramString1, String paramString2)
  {
    AppMethodBeat.i(20253);
    ab.i("MicroMsg.exdevice.Util", "moveDevicefromDeviceList, device = %s, device list = %s", new Object[] { paramString1, paramString2 });
    if ((bo.isNullOrNil(paramString1)) || (bo.isNullOrNil(paramString2)))
    {
      ab.w("MicroMsg.exdevice.Util", "parameters is null or nil");
      AppMethodBeat.o(20253);
      paramString1 = null;
    }
    while (true)
    {
      return paramString1;
      String[] arrayOfString;
      try
      {
        arrayOfString = paramString2.split("\\|");
        if (arrayOfString != null)
          break label120;
        ab.e("MicroMsg.exdevice.Util", "null == strArray");
        AppMethodBeat.o(20253);
        paramString1 = null;
      }
      catch (Exception paramString1)
      {
        ab.e("MicroMsg.exdevice.Util", "aDeviceList.split failed!!!, %s", new Object[] { paramString1.getMessage() });
        AppMethodBeat.o(20253);
        paramString1 = null;
      }
      continue;
      label120: String str1 = new String();
      int i = arrayOfString.length;
      int j = 0;
      int k = 0;
      if (j < i)
      {
        String str2 = arrayOfString[j];
        if (!str2.equalsIgnoreCase(paramString1))
        {
          str1 = str1 + str2;
          str1 = str1 + "|";
        }
        while (true)
        {
          j++;
          break;
          k = 1;
        }
      }
      if (k == 0)
      {
        ab.e("MicroMsg.exdevice.Util", "remove failed!!!, this device is not in the list");
        AppMethodBeat.o(20253);
        paramString1 = null;
      }
      else
      {
        ab.i("MicroMsg.exdevice.Util", "add device to device list successful, new device list = %s", new Object[] { paramString2 });
        AppMethodBeat.o(20253);
        paramString1 = str1;
      }
    }
  }

  public static String ie(long paramLong)
  {
    int i = 0;
    AppMethodBeat.i(20244);
    byte[] arrayOfByte = new byte[6];
    for (int j = 0; j < 6; j++)
      arrayOfByte[j] = ((byte)(byte)(int)(paramLong >> 40 - (j << 3)));
    Object localObject = new StringBuilder();
    for (j = i; j < 6; j++)
    {
      if (j != 0)
        ((StringBuilder)localObject).append(":");
      i = arrayOfByte[j] & 0xFF;
      if (i < 16)
        ((StringBuilder)localObject).append("0");
      ((StringBuilder)localObject).append(Integer.toHexString(i));
    }
    localObject = ((StringBuilder)localObject).toString().toUpperCase(Locale.US);
    AppMethodBeat.o(20244);
    return localObject;
  }

  public static String jdMethod_if(long paramLong)
  {
    int i = 0;
    AppMethodBeat.i(20248);
    Object localObject = new byte[6];
    for (int j = 0; j < 6; j++)
      localObject[j] = ((byte)(byte)(int)(paramLong >> 40 - (j << 3)));
    StringBuilder localStringBuilder = new StringBuilder();
    for (j = i; j < 6; j++)
    {
      i = localObject[j] & 0xFF;
      if (i < 16)
        localStringBuilder.append("0");
      localStringBuilder.append(Integer.toHexString(i));
    }
    localObject = localStringBuilder.toString().toUpperCase(Locale.US);
    AppMethodBeat.o(20248);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.j.b
 * JD-Core Version:    0.6.2
 */
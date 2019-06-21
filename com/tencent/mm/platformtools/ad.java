package com.tencent.mm.platformtools;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.c;
import com.tencent.mm.a.g;
import com.tencent.mm.a.r;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;

public final class ad
{
  // ERROR //
  static boolean a(String paramString1, String paramString2, boolean paramBoolean, int paramInt)
  {
    // Byte code:
    //   0: ldc 9
    //   2: invokestatic 15	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: invokestatic 21	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   9: ifne +10 -> 19
    //   12: aload_1
    //   13: invokestatic 21	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   16: ifeq +31 -> 47
    //   19: ldc 23
    //   21: ldc 25
    //   23: iconst_2
    //   24: anewarray 4	java/lang/Object
    //   27: dup
    //   28: iconst_0
    //   29: aload_0
    //   30: aastore
    //   31: dup
    //   32: iconst_1
    //   33: aload_1
    //   34: aastore
    //   35: invokestatic 31	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   38: iconst_0
    //   39: istore_2
    //   40: ldc 9
    //   42: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   45: iload_2
    //   46: ireturn
    //   47: aload_0
    //   48: invokestatic 40	com/tencent/mm/a/e:cs	(Ljava/lang/String;)I
    //   51: istore 4
    //   53: iload 4
    //   55: ifgt +36 -> 91
    //   58: ldc 23
    //   60: ldc 42
    //   62: iconst_2
    //   63: anewarray 4	java/lang/Object
    //   66: dup
    //   67: iconst_0
    //   68: aload_0
    //   69: aastore
    //   70: dup
    //   71: iconst_1
    //   72: iload 4
    //   74: invokestatic 48	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   77: aastore
    //   78: invokestatic 31	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   81: iconst_0
    //   82: istore_2
    //   83: ldc 9
    //   85: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   88: goto -43 -> 45
    //   91: iload 4
    //   93: ldc 49
    //   95: if_icmpgt +97 -> 192
    //   98: aload_0
    //   99: iconst_0
    //   100: iconst_m1
    //   101: invokestatic 53	com/tencent/mm/a/e:f	(Ljava/lang/String;II)[B
    //   104: astore 5
    //   106: aload 5
    //   108: aload_0
    //   109: aload_1
    //   110: iload_3
    //   111: invokestatic 56	com/tencent/mm/platformtools/ad:a	([BLjava/lang/String;Ljava/lang/String;I)Z
    //   114: istore 6
    //   116: aload 5
    //   118: ifnull +69 -> 187
    //   121: aload 5
    //   123: arraylength
    //   124: istore_3
    //   125: ldc 23
    //   127: ldc 58
    //   129: iconst_3
    //   130: anewarray 4	java/lang/Object
    //   133: dup
    //   134: iconst_0
    //   135: iload 6
    //   137: invokestatic 63	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   140: aastore
    //   141: dup
    //   142: iconst_1
    //   143: iload_3
    //   144: invokestatic 48	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   147: aastore
    //   148: dup
    //   149: iconst_2
    //   150: aload_0
    //   151: aastore
    //   152: invokestatic 66	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   155: iload 6
    //   157: ifeq +19 -> 176
    //   160: iload_2
    //   161: ifeq +15 -> 176
    //   164: new 68	java/io/File
    //   167: dup
    //   168: aload_0
    //   169: invokespecial 72	java/io/File:<init>	(Ljava/lang/String;)V
    //   172: invokestatic 76	com/tencent/mm/a/e:t	(Ljava/io/File;)Z
    //   175: pop
    //   176: ldc 9
    //   178: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   181: iload 6
    //   183: istore_2
    //   184: goto -139 -> 45
    //   187: iconst_m1
    //   188: istore_3
    //   189: goto -64 -> 125
    //   192: iload 4
    //   194: ldc 77
    //   196: idiv
    //   197: iconst_1
    //   198: iadd
    //   199: istore 7
    //   201: ldc 49
    //   203: newarray byte
    //   205: astore 8
    //   207: invokestatic 81	com/tencent/mm/sdk/platformtools/bo:anU	()J
    //   210: l2i
    //   211: istore 9
    //   213: new 83	java/io/FileInputStream
    //   216: astore 10
    //   218: aload 10
    //   220: aload_0
    //   221: invokespecial 84	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   224: iconst_0
    //   225: istore 11
    //   227: iload 11
    //   229: iload 7
    //   231: if_icmpge +232 -> 463
    //   234: aload 10
    //   236: astore 5
    //   238: aload 10
    //   240: aload 8
    //   242: bipush 12
    //   244: ldc 77
    //   246: invokevirtual 88	java/io/FileInputStream:read	([BII)I
    //   249: istore 12
    //   251: iload 12
    //   253: ifge +37 -> 290
    //   256: aload 10
    //   258: astore 5
    //   260: ldc 23
    //   262: ldc 90
    //   264: iconst_1
    //   265: anewarray 4	java/lang/Object
    //   268: dup
    //   269: iconst_0
    //   270: aload_0
    //   271: aastore
    //   272: invokestatic 31	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   275: aload 10
    //   277: invokevirtual 94	java/io/FileInputStream:close	()V
    //   280: iconst_0
    //   281: istore_2
    //   282: ldc 9
    //   284: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   287: goto -242 -> 45
    //   290: aload 10
    //   292: astore 5
    //   294: iload 9
    //   296: aload 8
    //   298: iconst_0
    //   299: invokestatic 97	com/tencent/mm/platformtools/ad:d	(I[BI)Z
    //   302: pop
    //   303: aload 10
    //   305: astore 5
    //   307: iload 11
    //   309: aload 8
    //   311: iconst_4
    //   312: invokestatic 97	com/tencent/mm/platformtools/ad:d	(I[BI)Z
    //   315: pop
    //   316: aload 10
    //   318: astore 5
    //   320: iload 12
    //   322: aload 8
    //   324: bipush 8
    //   326: invokestatic 97	com/tencent/mm/platformtools/ad:d	(I[BI)Z
    //   329: pop
    //   330: iload 12
    //   332: ldc 77
    //   334: if_icmpge +112 -> 446
    //   337: aload 10
    //   339: astore 5
    //   341: iload 12
    //   343: bipush 12
    //   345: iadd
    //   346: newarray byte
    //   348: astore 13
    //   350: aload 10
    //   352: astore 5
    //   354: aload 8
    //   356: iconst_0
    //   357: aload 13
    //   359: iconst_0
    //   360: aload 13
    //   362: arraylength
    //   363: invokestatic 103	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   366: aload 10
    //   368: astore 5
    //   370: aload 13
    //   372: aload_0
    //   373: aload_1
    //   374: iload_3
    //   375: invokestatic 56	com/tencent/mm/platformtools/ad:a	([BLjava/lang/String;Ljava/lang/String;I)Z
    //   378: istore 6
    //   380: aload 10
    //   382: astore 5
    //   384: ldc 23
    //   386: ldc 105
    //   388: bipush 6
    //   390: anewarray 4	java/lang/Object
    //   393: dup
    //   394: iconst_0
    //   395: iload 11
    //   397: invokestatic 48	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   400: aastore
    //   401: dup
    //   402: iconst_1
    //   403: iload 7
    //   405: invokestatic 48	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   408: aastore
    //   409: dup
    //   410: iconst_2
    //   411: iload 12
    //   413: invokestatic 48	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   416: aastore
    //   417: dup
    //   418: iconst_3
    //   419: iload 6
    //   421: invokestatic 63	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   424: aastore
    //   425: dup
    //   426: iconst_4
    //   427: iload 4
    //   429: invokestatic 48	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   432: aastore
    //   433: dup
    //   434: iconst_5
    //   435: aload_0
    //   436: aastore
    //   437: invokestatic 66	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   440: iinc 11 1
    //   443: goto -216 -> 227
    //   446: aload 10
    //   448: astore 5
    //   450: aload 8
    //   452: aload_0
    //   453: aload_1
    //   454: iload_3
    //   455: invokestatic 56	com/tencent/mm/platformtools/ad:a	([BLjava/lang/String;Ljava/lang/String;I)Z
    //   458: istore 6
    //   460: goto -80 -> 380
    //   463: iload_2
    //   464: ifeq +29 -> 493
    //   467: aload 10
    //   469: astore 5
    //   471: new 68	java/io/File
    //   474: astore_1
    //   475: aload 10
    //   477: astore 5
    //   479: aload_1
    //   480: aload_0
    //   481: invokespecial 72	java/io/File:<init>	(Ljava/lang/String;)V
    //   484: aload 10
    //   486: astore 5
    //   488: aload_1
    //   489: invokestatic 76	com/tencent/mm/a/e:t	(Ljava/io/File;)Z
    //   492: pop
    //   493: aload 10
    //   495: invokevirtual 94	java/io/FileInputStream:close	()V
    //   498: iconst_1
    //   499: istore_2
    //   500: ldc 9
    //   502: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   505: goto -460 -> 45
    //   508: astore 13
    //   510: aconst_null
    //   511: astore_1
    //   512: aload_1
    //   513: astore 5
    //   515: ldc 23
    //   517: ldc 107
    //   519: iconst_1
    //   520: anewarray 4	java/lang/Object
    //   523: dup
    //   524: iconst_0
    //   525: aload 13
    //   527: invokestatic 111	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   530: aastore
    //   531: invokestatic 31	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   534: aload_1
    //   535: astore 5
    //   537: ldc 23
    //   539: ldc 113
    //   541: iconst_1
    //   542: anewarray 4	java/lang/Object
    //   545: dup
    //   546: iconst_0
    //   547: aload_0
    //   548: aastore
    //   549: invokestatic 31	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   552: aload_1
    //   553: ifnull +7 -> 560
    //   556: aload_1
    //   557: invokevirtual 94	java/io/FileInputStream:close	()V
    //   560: iconst_0
    //   561: istore_2
    //   562: ldc 9
    //   564: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   567: goto -522 -> 45
    //   570: astore_0
    //   571: aconst_null
    //   572: astore 5
    //   574: aload 5
    //   576: ifnull +8 -> 584
    //   579: aload 5
    //   581: invokevirtual 94	java/io/FileInputStream:close	()V
    //   584: ldc 9
    //   586: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   589: aload_0
    //   590: athrow
    //   591: astore_0
    //   592: goto -312 -> 280
    //   595: astore_0
    //   596: goto -98 -> 498
    //   599: astore_0
    //   600: goto -40 -> 560
    //   603: astore_1
    //   604: goto -20 -> 584
    //   607: astore_0
    //   608: goto -34 -> 574
    //   611: astore 13
    //   613: aload 10
    //   615: astore_1
    //   616: goto -104 -> 512
    //
    // Exception table:
    //   from	to	target	type
    //   213	224	508	java/lang/Exception
    //   213	224	570	finally
    //   275	280	591	java/lang/Exception
    //   493	498	595	java/lang/Exception
    //   556	560	599	java/lang/Exception
    //   579	584	603	java/lang/Exception
    //   238	251	607	finally
    //   260	275	607	finally
    //   294	303	607	finally
    //   307	316	607	finally
    //   320	330	607	finally
    //   341	350	607	finally
    //   354	366	607	finally
    //   370	380	607	finally
    //   384	440	607	finally
    //   450	460	607	finally
    //   471	475	607	finally
    //   479	484	607	finally
    //   488	493	607	finally
    //   515	534	607	finally
    //   537	552	607	finally
    //   238	251	611	java/lang/Exception
    //   260	275	611	java/lang/Exception
    //   294	303	611	java/lang/Exception
    //   307	316	611	java/lang/Exception
    //   320	330	611	java/lang/Exception
    //   341	350	611	java/lang/Exception
    //   354	366	611	java/lang/Exception
    //   370	380	611	java/lang/Exception
    //   384	440	611	java/lang/Exception
    //   450	460	611	java/lang/Exception
    //   471	475	611	java/lang/Exception
    //   479	484	611	java/lang/Exception
    //   488	493	611	java/lang/Exception
  }

  public static boolean a(String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(72655);
    paramBoolean1 = a(paramString1, paramString2, paramBoolean1, paramBoolean2, 20003);
    AppMethodBeat.o(72655);
    return paramBoolean1;
  }

  public static boolean a(String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    AppMethodBeat.i(72654);
    if (paramBoolean2)
    {
      com.tencent.mm.sdk.g.d.f(new ad.1(paramString1, paramString2, paramBoolean1, paramInt), "StackReportUploader_uploadFileDirect");
      paramBoolean1 = true;
      AppMethodBeat.o(72654);
    }
    while (true)
    {
      return paramBoolean1;
      paramBoolean1 = a(paramString1, paramString2, paramBoolean1, paramInt);
      AppMethodBeat.o(72654);
    }
  }

  private static boolean a(byte[] paramArrayOfByte, String paramString1, String paramString2, int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(72657);
    if (bo.cb(paramArrayOfByte))
    {
      ab.e("MicroMsg.StackReportUploader", "read file failed:%s", new Object[] { paramString1 });
      AppMethodBeat.o(72657);
    }
    while (true)
    {
      return bool;
      if (paramArrayOfByte.length > 128000)
      {
        ab.e("MicroMsg.StackReportUploader", "file :%s data len error:%d", new Object[] { paramString1, Integer.valueOf(paramArrayOfByte.length) });
        AppMethodBeat.o(72657);
      }
      else
      {
        int i = paramArrayOfByte.length;
        Object localObject1 = g.x(String.format("weixin#$()%d%d", new Object[] { Integer.valueOf(com.tencent.mm.protocal.d.vxo), Integer.valueOf(i) }).getBytes()).toLowerCase();
        Object localObject2 = r.compress(paramArrayOfByte);
        if (bo.cb((byte[])localObject2))
        {
          ab.e("MicroMsg.StackReportUploader", "zip data failed file:%s", new Object[] { paramString1 });
          AppMethodBeat.o(72657);
        }
        else
        {
          paramArrayOfByte = new PByteArray();
          c.a(paramArrayOfByte, (byte[])localObject2, ((String)localObject1).getBytes());
          paramArrayOfByte = paramArrayOfByte.value;
          if (bo.cb(paramArrayOfByte))
            ab.e("MicroMsg.StackReportUploader", "encrypt data failed file:%s", new Object[] { paramString1 });
          paramString1 = ah.getContext().getSharedPreferences("system_config_prefs", 0);
          localObject2 = "http://" + paramString1.getString("support.weixin.qq.com", "support.weixin.qq.com");
          paramString1 = new StringBuffer();
          paramString1.append((String)localObject2 + "/cgi-bin/mmsupport-bin/stackreport?version=");
          paramString1.append(Integer.toHexString(com.tencent.mm.protocal.d.vxo));
          paramString1.append("&devicetype=");
          paramString1.append(com.tencent.mm.protocal.d.eSg);
          paramString1.append("&filelength=");
          paramString1.append(i);
          paramString1.append("&sum=");
          paramString1.append((String)localObject1);
          paramString1.append("&reporttype=");
          paramString1.append(paramInt);
          paramString1.append("&reportvalue=");
          paramString1.append(bo.anU() + ".0.1");
          if ((paramString2 != null) && (!paramString2.equals("")))
          {
            paramString1.append("&username=");
            paramString1.append(paramString2);
          }
          paramString2 = new DefaultHttpClient();
          paramString1 = new HttpPost(paramString1.toString());
          try
          {
            localObject1 = new org/apache/http/entity/ByteArrayEntity;
            ((ByteArrayEntity)localObject1).<init>(paramArrayOfByte);
            ((ByteArrayEntity)localObject1).setContentType("binary/octet-stream");
            paramString1.setEntity((HttpEntity)localObject1);
            paramArrayOfByte = paramString2.execute(paramString1);
            if ((paramArrayOfByte != null) && (paramArrayOfByte.getStatusLine() != null))
              break label543;
            ab.e("MicroMsg.StackReportUploader", "execute http failed resp null");
            AppMethodBeat.o(72657);
          }
          catch (Exception paramArrayOfByte)
          {
            ab.e("MicroMsg.StackReportUploader", "exception:%s", new Object[] { bo.l(paramArrayOfByte) });
            ab.d("MicroMsg.StackReportUploader", "execute post failed msg:%s", new Object[] { paramArrayOfByte.getMessage() });
            AppMethodBeat.o(72657);
          }
          continue;
          label543: if (paramArrayOfByte.getStatusLine().getStatusCode() != 200)
          {
            ab.e("MicroMsg.StackReportUploader", "error response code:%d ", new Object[] { Integer.valueOf(paramArrayOfByte.getStatusLine().getStatusCode()) });
            AppMethodBeat.o(72657);
          }
          else
          {
            AppMethodBeat.o(72657);
            bool = true;
          }
        }
      }
    }
  }

  private static boolean d(int paramInt1, byte[] paramArrayOfByte, int paramInt2)
  {
    if (128000 < paramInt2 + 4);
    for (boolean bool = false; ; bool = true)
    {
      return bool;
      paramArrayOfByte[paramInt2] = ((byte)(byte)(paramInt1 >> 24 & 0xFF));
      paramArrayOfByte[(paramInt2 + 1)] = ((byte)(byte)(paramInt1 >> 16 & 0xFF));
      paramArrayOfByte[(paramInt2 + 2)] = ((byte)(byte)(paramInt1 >> 8 & 0xFF));
      paramArrayOfByte[(paramInt2 + 3)] = ((byte)(byte)(paramInt1 & 0xFF));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.platformtools.ad
 * JD-Core Version:    0.6.2
 */
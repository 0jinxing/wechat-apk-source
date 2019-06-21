package com.tencent.rtmp.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;

class b$a
  implements Runnable
{
  private WeakReference<b> a;
  private String b;

  public b$a(b paramb, String paramString)
  {
    AppMethodBeat.i(65975);
    this.a = new WeakReference(paramb);
    this.b = paramString;
    AppMethodBeat.o(65975);
  }

  private float a(String paramString)
  {
    float f1 = 0.0F;
    AppMethodBeat.i(65976);
    paramString = paramString.split(":");
    Object localObject;
    String str;
    if (paramString.length == 3)
    {
      localObject = paramString[0];
      str = paramString[1];
      paramString = paramString[2];
    }
    while (true)
    {
      if ((localObject == null) || (str != null))
        f1 = 0.0F + Float.valueOf(str).floatValue() * 60.0F;
      float f2 = f1;
      if (paramString != null)
        f2 = f1 + Float.valueOf(paramString).floatValue();
      AppMethodBeat.o(65976);
      return f2;
      if (paramString.length == 2)
      {
        str = paramString[0];
        paramString = paramString[1];
        localObject = null;
      }
      else if (paramString.length == 1)
      {
        paramString = paramString[0];
        str = null;
        localObject = null;
      }
      else
      {
        paramString = null;
        str = null;
        localObject = null;
      }
    }
  }

  // ERROR //
  public void run()
  {
    // Byte code:
    //   0: ldc 63
    //   2: invokestatic 25	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: getfield 32	com/tencent/rtmp/a/b$a:a	Ljava/lang/ref/WeakReference;
    //   9: invokevirtual 67	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   12: checkcast 8	com/tencent/rtmp/a/b
    //   15: astore_1
    //   16: aload_1
    //   17: aload_0
    //   18: getfield 34	com/tencent/rtmp/a/b$a:b	Ljava/lang/String;
    //   21: invokestatic 70	com/tencent/rtmp/a/b:a	(Lcom/tencent/rtmp/a/b;Ljava/lang/String;)Ljava/io/InputStream;
    //   24: astore_2
    //   25: aload_2
    //   26: ifnonnull +9 -> 35
    //   29: ldc 63
    //   31: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   34: return
    //   35: new 72	java/io/BufferedReader
    //   38: astore_3
    //   39: new 74	java/io/InputStreamReader
    //   42: astore 4
    //   44: aload 4
    //   46: aload_2
    //   47: invokespecial 77	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   50: aload_3
    //   51: aload 4
    //   53: invokespecial 80	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   56: aload_3
    //   57: invokevirtual 84	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   60: astore 4
    //   62: aload 4
    //   64: ifnull +21 -> 85
    //   67: aload 4
    //   69: invokevirtual 88	java/lang/String:length	()I
    //   72: ifeq +13 -> 85
    //   75: aload 4
    //   77: ldc 90
    //   79: invokevirtual 94	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   82: ifne +39 -> 121
    //   85: ldc 96
    //   87: ldc 98
    //   89: invokestatic 104	com/tencent/liteav/basic/log/TXCLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   92: aload_1
    //   93: ifnull +7 -> 100
    //   96: aload_1
    //   97: invokestatic 108	com/tencent/rtmp/a/b:c	(Lcom/tencent/rtmp/a/b;)V
    //   100: aload_3
    //   101: invokevirtual 111	java/io/BufferedReader:close	()V
    //   104: ldc 63
    //   106: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   109: goto -75 -> 34
    //   112: astore_3
    //   113: ldc 63
    //   115: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   118: goto -84 -> 34
    //   121: aload_3
    //   122: invokevirtual 84	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   125: astore_2
    //   126: aload_2
    //   127: ifnull +242 -> 369
    //   130: aload_2
    //   131: ldc 113
    //   133: invokevirtual 94	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   136: ifeq +233 -> 369
    //   139: aload_2
    //   140: ldc 115
    //   142: invokevirtual 48	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   145: astore 5
    //   147: aload 5
    //   149: arraylength
    //   150: iconst_2
    //   151: if_icmpne +218 -> 369
    //   154: aload_3
    //   155: invokevirtual 84	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   158: astore 6
    //   160: new 117	com/tencent/rtmp/a/c
    //   163: astore 4
    //   165: aload 4
    //   167: invokespecial 118	com/tencent/rtmp/a/c:<init>	()V
    //   170: aload 4
    //   172: aload_0
    //   173: aload 5
    //   175: iconst_0
    //   176: aaload
    //   177: invokespecial 120	com/tencent/rtmp/a/b$a:a	(Ljava/lang/String;)F
    //   180: putfield 123	com/tencent/rtmp/a/c:a	F
    //   183: aload 4
    //   185: aload_0
    //   186: aload 5
    //   188: iconst_1
    //   189: aaload
    //   190: invokespecial 120	com/tencent/rtmp/a/b$a:a	(Ljava/lang/String;)F
    //   193: putfield 125	com/tencent/rtmp/a/c:b	F
    //   196: aload 4
    //   198: aload 6
    //   200: putfield 127	com/tencent/rtmp/a/c:c	Ljava/lang/String;
    //   203: aload 6
    //   205: ldc 129
    //   207: invokevirtual 133	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   210: istore 7
    //   212: iload 7
    //   214: iconst_m1
    //   215: if_icmpeq +16 -> 231
    //   218: aload 4
    //   220: aload 6
    //   222: iconst_0
    //   223: iload 7
    //   225: invokevirtual 137	java/lang/String:substring	(II)Ljava/lang/String;
    //   228: putfield 140	com/tencent/rtmp/a/c:d	Ljava/lang/String;
    //   231: aload 6
    //   233: ldc 142
    //   235: invokevirtual 133	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   238: istore 7
    //   240: iload 7
    //   242: iconst_m1
    //   243: if_icmpeq +103 -> 346
    //   246: iload 7
    //   248: iconst_1
    //   249: iadd
    //   250: aload 6
    //   252: invokevirtual 88	java/lang/String:length	()I
    //   255: if_icmpge +91 -> 346
    //   258: aload 6
    //   260: iload 7
    //   262: iconst_1
    //   263: iadd
    //   264: aload 6
    //   266: invokevirtual 88	java/lang/String:length	()I
    //   269: invokevirtual 137	java/lang/String:substring	(II)Ljava/lang/String;
    //   272: ldc 144
    //   274: invokevirtual 48	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   277: astore 5
    //   279: aload 5
    //   281: arraylength
    //   282: iconst_4
    //   283: if_icmpne +63 -> 346
    //   286: aload 4
    //   288: aload 5
    //   290: iconst_0
    //   291: aaload
    //   292: invokestatic 149	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   295: invokevirtual 152	java/lang/Integer:intValue	()I
    //   298: putfield 155	com/tencent/rtmp/a/c:e	I
    //   301: aload 4
    //   303: aload 5
    //   305: iconst_1
    //   306: aaload
    //   307: invokestatic 149	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   310: invokevirtual 152	java/lang/Integer:intValue	()I
    //   313: putfield 158	com/tencent/rtmp/a/c:f	I
    //   316: aload 4
    //   318: aload 5
    //   320: iconst_2
    //   321: aaload
    //   322: invokestatic 149	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   325: invokevirtual 152	java/lang/Integer:intValue	()I
    //   328: putfield 161	com/tencent/rtmp/a/c:g	I
    //   331: aload 4
    //   333: aload 5
    //   335: iconst_3
    //   336: aaload
    //   337: invokestatic 149	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   340: invokevirtual 152	java/lang/Integer:intValue	()I
    //   343: putfield 164	com/tencent/rtmp/a/c:h	I
    //   346: aload_1
    //   347: ifnull +22 -> 369
    //   350: aload_1
    //   351: invokestatic 167	com/tencent/rtmp/a/b:a	(Lcom/tencent/rtmp/a/b;)Ljava/util/List;
    //   354: ifnull +15 -> 369
    //   357: aload_1
    //   358: invokestatic 167	com/tencent/rtmp/a/b:a	(Lcom/tencent/rtmp/a/b;)Ljava/util/List;
    //   361: aload 4
    //   363: invokeinterface 173 2 0
    //   368: pop
    //   369: aload_2
    //   370: ifnonnull -249 -> 121
    //   373: aload_3
    //   374: invokevirtual 111	java/io/BufferedReader:close	()V
    //   377: ldc 63
    //   379: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   382: goto -348 -> 34
    //   385: astore_3
    //   386: ldc 63
    //   388: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   391: goto -357 -> 34
    //   394: astore_3
    //   395: aconst_null
    //   396: astore_3
    //   397: aload_3
    //   398: ifnull +42 -> 440
    //   401: aload_3
    //   402: invokevirtual 111	java/io/BufferedReader:close	()V
    //   405: ldc 63
    //   407: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   410: goto -376 -> 34
    //   413: astore_3
    //   414: ldc 63
    //   416: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   419: goto -385 -> 34
    //   422: astore_1
    //   423: aconst_null
    //   424: astore_3
    //   425: aload_3
    //   426: ifnull +7 -> 433
    //   429: aload_3
    //   430: invokevirtual 111	java/io/BufferedReader:close	()V
    //   433: ldc 63
    //   435: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   438: aload_1
    //   439: athrow
    //   440: ldc 63
    //   442: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   445: goto -411 -> 34
    //   448: astore_3
    //   449: goto -16 -> 433
    //   452: astore_1
    //   453: goto -28 -> 425
    //   456: astore_1
    //   457: goto -60 -> 397
    //
    // Exception table:
    //   from	to	target	type
    //   100	104	112	java/io/IOException
    //   373	377	385	java/io/IOException
    //   16	25	394	java/io/IOException
    //   35	56	394	java/io/IOException
    //   401	405	413	java/io/IOException
    //   16	25	422	finally
    //   35	56	422	finally
    //   429	433	448	java/io/IOException
    //   56	62	452	finally
    //   67	85	452	finally
    //   85	92	452	finally
    //   96	100	452	finally
    //   121	126	452	finally
    //   130	212	452	finally
    //   218	231	452	finally
    //   231	240	452	finally
    //   246	346	452	finally
    //   350	369	452	finally
    //   56	62	456	java/io/IOException
    //   67	85	456	java/io/IOException
    //   85	92	456	java/io/IOException
    //   96	100	456	java/io/IOException
    //   121	126	456	java/io/IOException
    //   130	212	456	java/io/IOException
    //   218	231	456	java/io/IOException
    //   231	240	456	java/io/IOException
    //   246	346	456	java/io/IOException
    //   350	369	456	java/io/IOException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.rtmp.a.b.a
 * JD-Core Version:    0.6.2
 */
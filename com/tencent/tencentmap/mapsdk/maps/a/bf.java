package com.tencent.tencentmap.mapsdk.maps.a;

import android.content.Context;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.e;
import java.util.ArrayList;
import java.util.List;

public final class bf
  implements be
{
  private static bf a = null;
  private SparseArray<bd> b;
  private List<ay> c;
  private bc d;
  private Context e;
  private boolean f;
  private boolean g;

  private bf(Context paramContext, boolean paramBoolean)
  {
    AppMethodBeat.i(98550);
    this.b = new SparseArray(5);
    this.c = new ArrayList(5);
    this.e = null;
    this.f = true;
    this.g = true;
    if (paramContext != null)
      localContext = paramContext.getApplicationContext();
    if (localContext != null);
    for (this.e = localContext; ; this.e = paramContext)
    {
      this.f = paramBoolean;
      this.d = bc.a(this.e);
      AppMethodBeat.o(98550);
      return;
    }
  }

  private static ab a(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(98555);
    if (paramArrayOfByte != null);
    while (true)
    {
      try
      {
        Object localObject = v.a();
        if (localObject == null)
          break label103;
        int i = ((v)localObject).h();
        paramArrayOfByte = e.b(paramArrayOfByte, ((v)localObject).i(), i, ((v)localObject).k());
        if (paramArrayOfByte != null)
        {
          localObject = new com/tencent/tencentmap/mapsdk/maps/a/al;
          ((al)localObject).<init>();
          ((al)localObject).a(paramArrayOfByte);
          paramArrayOfByte = new com/tencent/tencentmap/mapsdk/maps/a/ab;
          paramArrayOfByte.<init>();
          ag.b(" covert to ResponsePackage ", new Object[0]);
          paramArrayOfByte = (ab)((al)localObject).b("detail", paramArrayOfByte);
          AppMethodBeat.o(98555);
          return paramArrayOfByte;
        }
      }
      catch (Throwable paramArrayOfByte)
      {
        ag.a(paramArrayOfByte);
      }
      AppMethodBeat.o(98555);
      paramArrayOfByte = null;
      continue;
      label103: paramArrayOfByte = null;
    }
  }

  public static bf a(Context paramContext)
  {
    try
    {
      AppMethodBeat.i(98548);
      if (a == null)
      {
        bf localbf = new com/tencent/tencentmap/mapsdk/maps/a/bf;
        localbf.<init>(paramContext, true);
        a = localbf;
        ag.h(" create uphandler up:true", new Object[0]);
      }
      paramContext = a;
      AppMethodBeat.o(98548);
      return paramContext;
    }
    finally
    {
    }
    throw paramContext;
  }

  public static bf a(Context paramContext, boolean paramBoolean)
  {
    try
    {
      AppMethodBeat.i(98549);
      if (a == null)
      {
        bf localbf = new com/tencent/tencentmap/mapsdk/maps/a/bf;
        localbf.<init>(paramContext, paramBoolean);
        a = localbf;
        ag.h(" create uphandler up: %b", new Object[] { Boolean.valueOf(paramBoolean) });
      }
      if (a.f != paramBoolean)
      {
        a.f = paramBoolean;
        ag.h(" change uphandler up: %b", new Object[] { Boolean.valueOf(paramBoolean) });
      }
      paramContext = a;
      AppMethodBeat.o(98549);
      return paramContext;
    }
    finally
    {
    }
    throw paramContext;
  }

  private void a(int paramInt1, int paramInt2, boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(98556);
    ay[] arrayOfay = c();
    if (arrayOfay != null)
    {
      int i = arrayOfay.length;
      for (int j = 0; j < i; j++)
        arrayOfay[j].a(paramInt1, paramInt2, 0L, 0L, paramBoolean, paramString);
    }
    AppMethodBeat.o(98556);
  }

  private static boolean a(SparseArray<bd> paramSparseArray, int paramInt, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(98559);
    boolean bool;
    if ((paramSparseArray == null) || (paramArrayOfByte == null))
    {
      AppMethodBeat.o(98559);
      bool = true;
    }
    while (true)
    {
      return bool;
      switch (paramInt)
      {
      default:
        paramSparseArray = (bd)paramSparseArray.get(paramInt);
        if (paramSparseArray == null)
        {
          ag.c(" no handler key:%d", new Object[] { Integer.valueOf(paramInt) });
          AppMethodBeat.o(98559);
          bool = false;
        }
        break;
      case 103:
        AppMethodBeat.o(98559);
        bool = true;
        continue;
        try
        {
          ag.b(" key:%d  handler: %s", new Object[] { Integer.valueOf(paramInt), paramSparseArray.getClass().toString() });
          paramSparseArray.a(paramInt, paramArrayOfByte, true);
          AppMethodBeat.o(98559);
          bool = true;
        }
        catch (Throwable paramSparseArray)
        {
          ag.a(paramSparseArray);
          ag.d(" handle error key:%d", new Object[] { Integer.valueOf(paramInt) });
          AppMethodBeat.o(98559);
          bool = false;
        }
      }
    }
  }

  private static byte[] b(az paramaz)
  {
    AppMethodBeat.i(98554);
    if (paramaz != null);
    while (true)
    {
      try
      {
        Object localObject1 = paramaz.a();
        if (localObject1 != null)
        {
          ag.b(" RequestPackage info appkey:%s sdkid:%s appVersion:%s cmd: %d", new Object[] { ((aa)localObject1).b, ((aa)localObject1).d, ((aa)localObject1).c, Integer.valueOf(((aa)localObject1).f) });
          Object localObject2 = new com/tencent/tencentmap/mapsdk/maps/a/al;
          ((al)localObject2).<init>();
          ((al)localObject2).a();
          ((al)localObject2).b("test");
          ((al)localObject2).a("test");
          ((al)localObject2).a("detail", localObject1);
          localObject1 = ((al)localObject2).b();
          localObject2 = v.a();
          if (localObject2 != null)
          {
            int i = ((v)localObject2).h();
            localObject2 = e.a((byte[])localObject1, ((v)localObject2).i(), i, ((v)localObject2).k());
            paramaz = (az)localObject2;
            AppMethodBeat.o(98554);
            return paramaz;
          }
        }
      }
      catch (Throwable localThrowable)
      {
        ag.d(" parseSendDatas error", new Object[0]);
        ag.a(localThrowable);
        paramaz.b();
      }
      paramaz = null;
      AppMethodBeat.o(98554);
    }
  }

  private ay[] c()
  {
    try
    {
      AppMethodBeat.i(98557);
      ay[] arrayOfay;
      if ((this.c != null) && (this.c.size() > 0))
      {
        arrayOfay = (ay[])this.c.toArray(new ay[0]);
        AppMethodBeat.o(98557);
      }
      while (true)
      {
        return arrayOfay;
        arrayOfay = null;
        AppMethodBeat.o(98557);
      }
    }
    finally
    {
    }
  }

  private bc d()
  {
    try
    {
      bc localbc = this.d;
      return localbc;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private SparseArray<bd> e()
  {
    try
    {
      AppMethodBeat.i(98558);
      SparseArray localSparseArray;
      if ((this.b != null) && (this.b.size() > 0))
      {
        new ah();
        localSparseArray = ah.a(this.b);
        AppMethodBeat.o(98558);
      }
      while (true)
      {
        return localSparseArray;
        localSparseArray = null;
        AppMethodBeat.o(98558);
      }
    }
    finally
    {
    }
  }

  // ERROR //
  public final void a(az paramaz)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: iconst_0
    //   3: istore_3
    //   4: iconst_0
    //   5: istore 4
    //   7: iconst_0
    //   8: istore 5
    //   10: ldc 253
    //   12: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   15: aload_0
    //   16: getfield 52	com/tencent/tencentmap/mapsdk/maps/a/bf:f	Z
    //   19: ifeq +10 -> 29
    //   22: aload_0
    //   23: invokevirtual 256	com/tencent/tencentmap/mapsdk/maps/a/bf:b	()Z
    //   26: ifne +69 -> 95
    //   29: aload_1
    //   30: invokevirtual 258	com/tencent/tencentmap/mapsdk/maps/a/az:c	()I
    //   33: iconst_2
    //   34: if_icmpne +18 -> 52
    //   37: ldc_w 260
    //   40: iconst_0
    //   41: anewarray 4	java/lang/Object
    //   44: invokestatic 126	com/tencent/tencentmap/mapsdk/maps/a/ag:h	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   47: aload_1
    //   48: iconst_0
    //   49: invokevirtual 263	com/tencent/tencentmap/mapsdk/maps/a/az:b	(Z)V
    //   52: aload_1
    //   53: getfield 265	com/tencent/tencentmap/mapsdk/maps/a/az:b	I
    //   56: ifeq +29 -> 85
    //   59: ldc_w 267
    //   62: iconst_1
    //   63: anewarray 4	java/lang/Object
    //   66: dup
    //   67: iconst_0
    //   68: aload_1
    //   69: invokevirtual 258	com/tencent/tencentmap/mapsdk/maps/a/az:c	()I
    //   72: invokestatic 163	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   75: aastore
    //   76: invokestatic 126	com/tencent/tencentmap/mapsdk/maps/a/ag:h	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   79: ldc 253
    //   81: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   84: return
    //   85: ldc_w 269
    //   88: iconst_0
    //   89: anewarray 4	java/lang/Object
    //   92: invokestatic 126	com/tencent/tencentmap/mapsdk/maps/a/ag:h	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   95: aload_0
    //   96: getfield 50	com/tencent/tencentmap/mapsdk/maps/a/bf:e	Landroid/content/Context;
    //   99: invokestatic 273	com/tencent/tencentmap/mapsdk/a/e:m	(Landroid/content/Context;)Z
    //   102: ifne +34 -> 136
    //   105: ldc_w 275
    //   108: iconst_0
    //   109: anewarray 4	java/lang/Object
    //   112: invokestatic 165	com/tencent/tencentmap/mapsdk/maps/a/ag:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   115: aload_1
    //   116: invokevirtual 258	com/tencent/tencentmap/mapsdk/maps/a/az:c	()I
    //   119: iconst_2
    //   120: if_icmpne +8 -> 128
    //   123: aload_1
    //   124: iconst_0
    //   125: invokevirtual 263	com/tencent/tencentmap/mapsdk/maps/a/az:b	(Z)V
    //   128: ldc 253
    //   130: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   133: goto -49 -> 84
    //   136: aload_1
    //   137: ifnonnull +21 -> 158
    //   140: ldc_w 277
    //   143: iconst_0
    //   144: anewarray 4	java/lang/Object
    //   147: invokestatic 183	com/tencent/tencentmap/mapsdk/maps/a/ag:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   150: ldc 253
    //   152: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   155: goto -71 -> 84
    //   158: aload_1
    //   159: invokevirtual 258	com/tencent/tencentmap/mapsdk/maps/a/az:c	()I
    //   162: istore 6
    //   164: aload_1
    //   165: invokevirtual 279	com/tencent/tencentmap/mapsdk/maps/a/az:e	()Ljava/lang/String;
    //   168: astore 7
    //   170: aload 7
    //   172: ifnull +17 -> 189
    //   175: ldc_w 281
    //   178: aload 7
    //   180: invokevirtual 286	java/lang/String:trim	()Ljava/lang/String;
    //   183: invokevirtual 290	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   186: ifeq +45 -> 231
    //   189: ldc_w 292
    //   192: iconst_0
    //   193: anewarray 4	java/lang/Object
    //   196: invokestatic 183	com/tencent/tencentmap/mapsdk/maps/a/ag:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   199: aload_1
    //   200: invokevirtual 258	com/tencent/tencentmap/mapsdk/maps/a/az:c	()I
    //   203: iconst_2
    //   204: if_icmpne +8 -> 212
    //   207: aload_1
    //   208: iconst_0
    //   209: invokevirtual 263	com/tencent/tencentmap/mapsdk/maps/a/az:b	(Z)V
    //   212: aload_0
    //   213: iload 6
    //   215: iconst_m1
    //   216: iconst_0
    //   217: ldc_w 294
    //   220: invokespecial 296	com/tencent/tencentmap/mapsdk/maps/a/bf:a	(IIZLjava/lang/String;)V
    //   223: ldc 253
    //   225: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   228: goto -144 -> 84
    //   231: aload_1
    //   232: invokestatic 298	com/tencent/tencentmap/mapsdk/maps/a/bf:b	(Lcom/tencent/tencentmap/mapsdk/maps/a/az;)[B
    //   235: astore 8
    //   237: aload_1
    //   238: invokevirtual 300	com/tencent/tencentmap/mapsdk/maps/a/az:d	()Ljava/lang/String;
    //   241: astore 9
    //   243: aconst_null
    //   244: astore 10
    //   246: aload 9
    //   248: ifnull +16 -> 264
    //   251: ldc_w 302
    //   254: aload 9
    //   256: invokestatic 305	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   259: invokevirtual 309	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   262: astore 10
    //   264: invokestatic 79	com/tencent/tencentmap/mapsdk/maps/a/v:a	()Lcom/tencent/tencentmap/mapsdk/maps/a/v;
    //   267: astore 11
    //   269: aload 10
    //   271: astore 9
    //   273: aload 11
    //   275: ifnull +52 -> 327
    //   278: aload 11
    //   280: invokevirtual 312	com/tencent/tencentmap/mapsdk/maps/a/v:l	()Ljava/lang/String;
    //   283: astore 11
    //   285: aload 10
    //   287: astore 9
    //   289: aload 11
    //   291: ifnull +36 -> 327
    //   294: aload 10
    //   296: astore 9
    //   298: ldc_w 281
    //   301: aload 11
    //   303: invokevirtual 290	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   306: ifne +21 -> 327
    //   309: aload 10
    //   311: ifnonnull +110 -> 421
    //   314: ldc_w 314
    //   317: aload 11
    //   319: invokestatic 305	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   322: invokevirtual 309	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   325: astore 9
    //   327: aload 9
    //   329: ifnull +1195 -> 1524
    //   332: new 316	java/lang/StringBuilder
    //   335: dup
    //   336: invokespecial 317	java/lang/StringBuilder:<init>	()V
    //   339: aload 7
    //   341: invokevirtual 321	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   344: aload 9
    //   346: invokevirtual 321	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   349: invokevirtual 322	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   352: astore 10
    //   354: ldc_w 324
    //   357: iconst_3
    //   358: anewarray 4	java/lang/Object
    //   361: dup
    //   362: iconst_0
    //   363: iload 6
    //   365: invokestatic 163	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   368: aastore
    //   369: dup
    //   370: iconst_1
    //   371: aload 10
    //   373: aastore
    //   374: dup
    //   375: iconst_2
    //   376: aload_1
    //   377: invokevirtual 171	java/lang/Object:getClass	()Ljava/lang/Class;
    //   380: invokevirtual 176	java/lang/Class:toString	()Ljava/lang/String;
    //   383: aastore
    //   384: invokestatic 126	com/tencent/tencentmap/mapsdk/maps/a/ag:h	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   387: aload 8
    //   389: ifnonnull +63 -> 452
    //   392: ldc_w 326
    //   395: iconst_0
    //   396: anewarray 4	java/lang/Object
    //   399: invokestatic 165	com/tencent/tencentmap/mapsdk/maps/a/ag:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   402: aload_0
    //   403: iload 6
    //   405: iconst_m1
    //   406: iconst_0
    //   407: ldc_w 328
    //   410: invokespecial 296	com/tencent/tencentmap/mapsdk/maps/a/bf:a	(IIZLjava/lang/String;)V
    //   413: ldc 253
    //   415: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   418: goto -334 -> 84
    //   421: new 316	java/lang/StringBuilder
    //   424: dup
    //   425: invokespecial 317	java/lang/StringBuilder:<init>	()V
    //   428: aload 10
    //   430: invokevirtual 321	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   433: ldc_w 330
    //   436: invokevirtual 321	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   439: aload 11
    //   441: invokevirtual 321	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   444: invokevirtual 322	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   447: astore 9
    //   449: goto -122 -> 327
    //   452: aload_0
    //   453: invokespecial 332	com/tencent/tencentmap/mapsdk/maps/a/bf:d	()Lcom/tencent/tencentmap/mapsdk/maps/a/bc;
    //   456: astore 7
    //   458: aload 7
    //   460: ifnonnull +32 -> 492
    //   463: ldc_w 334
    //   466: iconst_0
    //   467: anewarray 4	java/lang/Object
    //   470: invokestatic 183	com/tencent/tencentmap/mapsdk/maps/a/ag:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   473: aload_0
    //   474: iload 6
    //   476: iconst_m1
    //   477: iconst_0
    //   478: ldc_w 336
    //   481: invokespecial 296	com/tencent/tencentmap/mapsdk/maps/a/bf:a	(IIZLjava/lang/String;)V
    //   484: ldc 253
    //   486: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   489: goto -405 -> 84
    //   492: aload_0
    //   493: getfield 50	com/tencent/tencentmap/mapsdk/maps/a/bf:e	Landroid/content/Context;
    //   496: invokestatic 339	com/tencent/tencentmap/mapsdk/a/e:f	(Landroid/content/Context;)Ljava/lang/String;
    //   499: pop
    //   500: invokestatic 344	com/tencent/tencentmap/mapsdk/a/c:m	()Lcom/tencent/tencentmap/mapsdk/a/c;
    //   503: invokevirtual 347	com/tencent/tencentmap/mapsdk/a/c:h	()J
    //   506: pop2
    //   507: new 349	java/util/Date
    //   510: dup
    //   511: invokespecial 350	java/util/Date:<init>	()V
    //   514: invokevirtual 353	java/util/Date:getTime	()J
    //   517: pop2
    //   518: iload 4
    //   520: istore 12
    //   522: aload 7
    //   524: aload 10
    //   526: aload 8
    //   528: aload_1
    //   529: invokevirtual 356	com/tencent/tencentmap/mapsdk/maps/a/bc:a	(Ljava/lang/String;[BLcom/tencent/tencentmap/mapsdk/maps/a/az;)[B
    //   532: astore 9
    //   534: aload 9
    //   536: ifnonnull +981 -> 1517
    //   539: iload 6
    //   541: bipush 100
    //   543: if_icmpne +974 -> 1517
    //   546: iload 4
    //   548: istore 12
    //   550: ldc_w 358
    //   553: aload 10
    //   555: invokevirtual 290	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   558: ifne +959 -> 1517
    //   561: iload 4
    //   563: istore 12
    //   565: aload 7
    //   567: ldc_w 358
    //   570: aload 8
    //   572: aload_1
    //   573: invokevirtual 356	com/tencent/tencentmap/mapsdk/maps/a/bc:a	(Ljava/lang/String;[BLcom/tencent/tencentmap/mapsdk/maps/a/az;)[B
    //   576: astore 10
    //   578: iload 4
    //   580: istore 12
    //   582: aload 10
    //   584: invokestatic 360	com/tencent/tencentmap/mapsdk/maps/a/bf:a	([B)Lcom/tencent/tencentmap/mapsdk/maps/a/ab;
    //   587: astore 10
    //   589: aload 10
    //   591: ifnull +916 -> 1507
    //   594: iload 4
    //   596: istore 12
    //   598: aload 10
    //   600: getfield 361	com/tencent/tencentmap/mapsdk/maps/a/ab:b	I
    //   603: istore 13
    //   605: iload 13
    //   607: istore 14
    //   609: iload_2
    //   610: istore 5
    //   612: iload 4
    //   614: istore 12
    //   616: aload 10
    //   618: getfield 364	com/tencent/tencentmap/mapsdk/maps/a/ab:a	B
    //   621: istore 15
    //   623: iload 15
    //   625: ifne +88 -> 713
    //   628: iconst_1
    //   629: istore 12
    //   631: ldc_w 366
    //   634: iconst_2
    //   635: anewarray 4	java/lang/Object
    //   638: dup
    //   639: iconst_0
    //   640: aload 10
    //   642: getfield 361	com/tencent/tencentmap/mapsdk/maps/a/ab:b	I
    //   645: invokestatic 163	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   648: aastore
    //   649: dup
    //   650: iconst_1
    //   651: aload 10
    //   653: getfield 364	com/tencent/tencentmap/mapsdk/maps/a/ab:a	B
    //   656: invokestatic 371	java/lang/Byte:valueOf	(B)Ljava/lang/Byte;
    //   659: aastore
    //   660: invokestatic 110	com/tencent/tencentmap/mapsdk/maps/a/ag:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   663: iload 12
    //   665: istore 4
    //   667: aload_1
    //   668: ifnull +8 -> 676
    //   671: aload 10
    //   673: ifnonnull +46 -> 719
    //   676: iload 13
    //   678: istore 14
    //   680: iload 4
    //   682: istore 5
    //   684: iload 4
    //   686: istore 12
    //   688: aload_0
    //   689: iload 6
    //   691: iload 13
    //   693: iload 4
    //   695: aconst_null
    //   696: invokespecial 296	com/tencent/tencentmap/mapsdk/maps/a/bf:a	(IIZLjava/lang/String;)V
    //   699: aload_1
    //   700: iload 4
    //   702: invokevirtual 263	com/tencent/tencentmap/mapsdk/maps/a/az:b	(Z)V
    //   705: ldc 253
    //   707: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   710: goto -626 -> 84
    //   713: iconst_0
    //   714: istore 12
    //   716: goto -85 -> 631
    //   719: iload 13
    //   721: istore 14
    //   723: iload 4
    //   725: istore 5
    //   727: iload 4
    //   729: istore 12
    //   731: invokestatic 344	com/tencent/tencentmap/mapsdk/a/c:m	()Lcom/tencent/tencentmap/mapsdk/a/c;
    //   734: astore 7
    //   736: aload 7
    //   738: ifnull +151 -> 889
    //   741: iload 13
    //   743: istore 14
    //   745: iload 4
    //   747: istore 5
    //   749: iload 4
    //   751: istore 12
    //   753: aload 10
    //   755: getfield 372	com/tencent/tencentmap/mapsdk/maps/a/ab:d	Ljava/lang/String;
    //   758: ifnull +28 -> 786
    //   761: iload 13
    //   763: istore 14
    //   765: iload 4
    //   767: istore 5
    //   769: iload 4
    //   771: istore 12
    //   773: aload 7
    //   775: aload 10
    //   777: getfield 372	com/tencent/tencentmap/mapsdk/maps/a/ab:d	Ljava/lang/String;
    //   780: invokevirtual 286	java/lang/String:trim	()Ljava/lang/String;
    //   783: invokevirtual 373	com/tencent/tencentmap/mapsdk/a/c:b	(Ljava/lang/String;)V
    //   786: iload 13
    //   788: istore 14
    //   790: iload 4
    //   792: istore 5
    //   794: iload 4
    //   796: istore 12
    //   798: new 349	java/util/Date
    //   801: astore 9
    //   803: iload 13
    //   805: istore 14
    //   807: iload 4
    //   809: istore 5
    //   811: iload 4
    //   813: istore 12
    //   815: aload 9
    //   817: invokespecial 350	java/util/Date:<init>	()V
    //   820: iload 13
    //   822: istore 14
    //   824: iload 4
    //   826: istore 5
    //   828: iload 4
    //   830: istore 12
    //   832: aload 7
    //   834: aload 10
    //   836: getfield 376	com/tencent/tencentmap/mapsdk/maps/a/ab:e	J
    //   839: aload 9
    //   841: invokevirtual 353	java/util/Date:getTime	()J
    //   844: lsub
    //   845: invokevirtual 379	com/tencent/tencentmap/mapsdk/a/c:a	(J)V
    //   848: iload 13
    //   850: istore 14
    //   852: iload 4
    //   854: istore 5
    //   856: iload 4
    //   858: istore 12
    //   860: ldc_w 381
    //   863: iconst_2
    //   864: anewarray 4	java/lang/Object
    //   867: dup
    //   868: iconst_0
    //   869: aload 7
    //   871: invokevirtual 383	com/tencent/tencentmap/mapsdk/a/c:g	()Ljava/lang/String;
    //   874: aastore
    //   875: dup
    //   876: iconst_1
    //   877: aload 7
    //   879: invokevirtual 347	com/tencent/tencentmap/mapsdk/a/c:h	()J
    //   882: invokestatic 388	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   885: aastore
    //   886: invokestatic 126	com/tencent/tencentmap/mapsdk/maps/a/ag:h	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   889: iload 13
    //   891: istore 14
    //   893: iload 4
    //   895: istore 5
    //   897: iload 4
    //   899: istore 12
    //   901: aload 10
    //   903: getfield 361	com/tencent/tencentmap/mapsdk/maps/a/ab:b	I
    //   906: bipush 101
    //   908: if_icmpeq +47 -> 955
    //   911: iload 13
    //   913: istore 14
    //   915: iload 4
    //   917: istore 5
    //   919: iload 4
    //   921: istore 12
    //   923: aload 10
    //   925: getfield 361	com/tencent/tencentmap/mapsdk/maps/a/ab:b	I
    //   928: bipush 103
    //   930: if_icmpeq +25 -> 955
    //   933: iload 13
    //   935: istore 14
    //   937: iload 4
    //   939: istore 5
    //   941: iload 4
    //   943: istore 12
    //   945: aload 10
    //   947: getfield 361	com/tencent/tencentmap/mapsdk/maps/a/ab:b	I
    //   950: bipush 105
    //   952: if_icmpne +26 -> 978
    //   955: iload 13
    //   957: istore 14
    //   959: iload 4
    //   961: istore 5
    //   963: iload 4
    //   965: istore 12
    //   967: aload_0
    //   968: getfield 50	com/tencent/tencentmap/mapsdk/maps/a/bf:e	Landroid/content/Context;
    //   971: invokestatic 393	com/tencent/tencentmap/mapsdk/maps/a/t:a	(Landroid/content/Context;)Lcom/tencent/tencentmap/mapsdk/maps/a/t;
    //   974: invokevirtual 395	com/tencent/tencentmap/mapsdk/maps/a/t:e	()Lcom/tencent/tencentmap/mapsdk/maps/a/v;
    //   977: pop
    //   978: iload 13
    //   980: istore 14
    //   982: iload 4
    //   984: istore 5
    //   986: iload 4
    //   988: istore 12
    //   990: aload 10
    //   992: getfield 398	com/tencent/tencentmap/mapsdk/maps/a/ab:c	[B
    //   995: astore 7
    //   997: aload 7
    //   999: ifnonnull +88 -> 1087
    //   1002: iload 13
    //   1004: istore 14
    //   1006: iload 4
    //   1008: istore 5
    //   1010: iload 4
    //   1012: istore 12
    //   1014: ldc_w 400
    //   1017: iconst_0
    //   1018: anewarray 4	java/lang/Object
    //   1021: invokestatic 126	com/tencent/tencentmap/mapsdk/maps/a/ag:h	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1024: goto -348 -> 676
    //   1027: astore 10
    //   1029: iload 5
    //   1031: istore 4
    //   1033: iload 4
    //   1035: istore 12
    //   1037: aload_0
    //   1038: iload 6
    //   1040: iload 14
    //   1042: iconst_0
    //   1043: aload 10
    //   1045: invokevirtual 401	java/lang/Throwable:toString	()Ljava/lang/String;
    //   1048: invokespecial 296	com/tencent/tencentmap/mapsdk/maps/a/bf:a	(IIZLjava/lang/String;)V
    //   1051: iload 4
    //   1053: istore 12
    //   1055: ldc_w 403
    //   1058: iconst_1
    //   1059: anewarray 4	java/lang/Object
    //   1062: dup
    //   1063: iconst_0
    //   1064: aload 10
    //   1066: invokevirtual 401	java/lang/Throwable:toString	()Ljava/lang/String;
    //   1069: aastore
    //   1070: invokestatic 183	com/tencent/tencentmap/mapsdk/maps/a/ag:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1073: aload_1
    //   1074: iload 4
    //   1076: invokevirtual 263	com/tencent/tencentmap/mapsdk/maps/a/az:b	(Z)V
    //   1079: ldc 253
    //   1081: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1084: goto -1000 -> 84
    //   1087: iload 13
    //   1089: istore 14
    //   1091: iload 4
    //   1093: istore 5
    //   1095: iload 4
    //   1097: istore 12
    //   1099: aload_0
    //   1100: invokespecial 405	com/tencent/tencentmap/mapsdk/maps/a/bf:e	()Landroid/util/SparseArray;
    //   1103: astore 9
    //   1105: aload 9
    //   1107: ifnull +23 -> 1130
    //   1110: iload 13
    //   1112: istore 14
    //   1114: iload 4
    //   1116: istore 5
    //   1118: iload 4
    //   1120: istore 12
    //   1122: aload 9
    //   1124: invokevirtual 244	android/util/SparseArray:size	()I
    //   1127: ifgt +44 -> 1171
    //   1130: iload 13
    //   1132: istore 14
    //   1134: iload 4
    //   1136: istore 5
    //   1138: iload 4
    //   1140: istore 12
    //   1142: ldc_w 407
    //   1145: iconst_0
    //   1146: anewarray 4	java/lang/Object
    //   1149: invokestatic 126	com/tencent/tencentmap/mapsdk/maps/a/ag:h	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1152: goto -476 -> 676
    //   1155: astore 10
    //   1157: aload_1
    //   1158: iload 12
    //   1160: invokevirtual 263	com/tencent/tencentmap/mapsdk/maps/a/az:b	(Z)V
    //   1163: ldc 253
    //   1165: invokestatic 70	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1168: aload 10
    //   1170: athrow
    //   1171: iload 13
    //   1173: istore 14
    //   1175: iload 4
    //   1177: istore 5
    //   1179: iload 4
    //   1181: istore 12
    //   1183: aload_1
    //   1184: invokevirtual 258	com/tencent/tencentmap/mapsdk/maps/a/az:c	()I
    //   1187: istore 15
    //   1189: iload 13
    //   1191: istore 14
    //   1193: iload 4
    //   1195: istore 5
    //   1197: iload 4
    //   1199: istore 12
    //   1201: aload 10
    //   1203: getfield 361	com/tencent/tencentmap/mapsdk/maps/a/ab:b	I
    //   1206: istore 16
    //   1208: iload 16
    //   1210: ifne +28 -> 1238
    //   1213: iload 13
    //   1215: istore 14
    //   1217: iload 4
    //   1219: istore 5
    //   1221: iload 4
    //   1223: istore 12
    //   1225: ldc_w 409
    //   1228: iconst_0
    //   1229: anewarray 4	java/lang/Object
    //   1232: invokestatic 126	com/tencent/tencentmap/mapsdk/maps/a/ag:h	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1235: goto -559 -> 676
    //   1238: iload 15
    //   1240: lookupswitch	default:+36->1276, 4:+117->1357, 100:+69->1309, 102:+165->1405
    //   1277: fconst_2
    //   1278: istore 14
    //   1280: iload 4
    //   1282: istore 5
    //   1284: iload 4
    //   1286: istore 12
    //   1288: ldc_w 411
    //   1291: iconst_1
    //   1292: anewarray 4	java/lang/Object
    //   1295: dup
    //   1296: iconst_0
    //   1297: iload 15
    //   1299: invokestatic 163	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1302: aastore
    //   1303: invokestatic 165	com/tencent/tencentmap/mapsdk/maps/a/ag:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1306: goto -630 -> 676
    //   1309: iload 16
    //   1311: bipush 101
    //   1313: if_icmpeq +140 -> 1453
    //   1316: iload 13
    //   1318: istore 14
    //   1320: iload 4
    //   1322: istore 5
    //   1324: iload 4
    //   1326: istore 12
    //   1328: ldc_w 413
    //   1331: iconst_2
    //   1332: anewarray 4	java/lang/Object
    //   1335: dup
    //   1336: iconst_0
    //   1337: iload 15
    //   1339: invokestatic 163	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1342: aastore
    //   1343: dup
    //   1344: iconst_1
    //   1345: iload 16
    //   1347: invokestatic 163	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1350: aastore
    //   1351: invokestatic 165	com/tencent/tencentmap/mapsdk/maps/a/ag:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1354: goto -678 -> 676
    //   1357: iload 16
    //   1359: bipush 105
    //   1361: if_icmpeq +92 -> 1453
    //   1364: iload 13
    //   1366: istore 14
    //   1368: iload 4
    //   1370: istore 5
    //   1372: iload 4
    //   1374: istore 12
    //   1376: ldc_w 413
    //   1379: iconst_2
    //   1380: anewarray 4	java/lang/Object
    //   1383: dup
    //   1384: iconst_0
    //   1385: iload 15
    //   1387: invokestatic 163	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1390: aastore
    //   1391: dup
    //   1392: iconst_1
    //   1393: iload 16
    //   1395: invokestatic 163	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1398: aastore
    //   1399: invokestatic 165	com/tencent/tencentmap/mapsdk/maps/a/ag:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1402: goto -726 -> 676
    //   1405: iload 16
    //   1407: bipush 103
    //   1409: if_icmpeq +44 -> 1453
    //   1412: iload 13
    //   1414: istore 14
    //   1416: iload 4
    //   1418: istore 5
    //   1420: iload 4
    //   1422: istore 12
    //   1424: ldc_w 415
    //   1427: iconst_2
    //   1428: anewarray 4	java/lang/Object
    //   1431: dup
    //   1432: iconst_0
    //   1433: iload 15
    //   1435: invokestatic 163	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1438: aastore
    //   1439: dup
    //   1440: iconst_1
    //   1441: iload 16
    //   1443: invokestatic 163	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1446: aastore
    //   1447: invokestatic 165	com/tencent/tencentmap/mapsdk/maps/a/ag:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   1450: goto -774 -> 676
    //   1453: iload 13
    //   1455: istore 14
    //   1457: iload 4
    //   1459: istore 5
    //   1461: iload 4
    //   1463: istore 12
    //   1465: aload 9
    //   1467: iload 16
    //   1469: aload 7
    //   1471: invokestatic 417	com/tencent/tencentmap/mapsdk/maps/a/bf:a	(Landroid/util/SparseArray;I[B)Z
    //   1474: pop
    //   1475: goto -799 -> 676
    //   1478: astore 10
    //   1480: goto -323 -> 1157
    //   1483: astore 10
    //   1485: iconst_m1
    //   1486: istore 14
    //   1488: iload_3
    //   1489: istore 4
    //   1491: goto -458 -> 1033
    //   1494: astore 10
    //   1496: iload 13
    //   1498: istore 14
    //   1500: iload 12
    //   1502: istore 4
    //   1504: goto -471 -> 1033
    //   1507: iconst_m1
    //   1508: istore 13
    //   1510: iload 5
    //   1512: istore 4
    //   1514: goto -847 -> 667
    //   1517: aload 9
    //   1519: astore 10
    //   1521: goto -943 -> 578
    //   1524: aload 7
    //   1526: astore 10
    //   1528: goto -1174 -> 354
    //
    // Exception table:
    //   from	to	target	type
    //   616	623	1027	java/lang/Throwable
    //   688	699	1027	java/lang/Throwable
    //   731	736	1027	java/lang/Throwable
    //   753	761	1027	java/lang/Throwable
    //   773	786	1027	java/lang/Throwable
    //   798	803	1027	java/lang/Throwable
    //   815	820	1027	java/lang/Throwable
    //   832	848	1027	java/lang/Throwable
    //   860	889	1027	java/lang/Throwable
    //   901	911	1027	java/lang/Throwable
    //   923	933	1027	java/lang/Throwable
    //   945	955	1027	java/lang/Throwable
    //   967	978	1027	java/lang/Throwable
    //   990	997	1027	java/lang/Throwable
    //   1014	1024	1027	java/lang/Throwable
    //   1099	1105	1027	java/lang/Throwable
    //   1122	1130	1027	java/lang/Throwable
    //   1142	1152	1027	java/lang/Throwable
    //   1183	1189	1027	java/lang/Throwable
    //   1201	1208	1027	java/lang/Throwable
    //   1225	1235	1027	java/lang/Throwable
    //   1288	1306	1027	java/lang/Throwable
    //   1328	1354	1027	java/lang/Throwable
    //   1376	1402	1027	java/lang/Throwable
    //   1424	1450	1027	java/lang/Throwable
    //   1465	1475	1027	java/lang/Throwable
    //   522	534	1155	finally
    //   550	561	1155	finally
    //   565	578	1155	finally
    //   582	589	1155	finally
    //   598	605	1155	finally
    //   616	623	1155	finally
    //   688	699	1155	finally
    //   731	736	1155	finally
    //   753	761	1155	finally
    //   773	786	1155	finally
    //   798	803	1155	finally
    //   815	820	1155	finally
    //   832	848	1155	finally
    //   860	889	1155	finally
    //   901	911	1155	finally
    //   923	933	1155	finally
    //   945	955	1155	finally
    //   967	978	1155	finally
    //   990	997	1155	finally
    //   1014	1024	1155	finally
    //   1037	1051	1155	finally
    //   1055	1073	1155	finally
    //   1099	1105	1155	finally
    //   1122	1130	1155	finally
    //   1142	1152	1155	finally
    //   1183	1189	1155	finally
    //   1201	1208	1155	finally
    //   1225	1235	1155	finally
    //   1288	1306	1155	finally
    //   1328	1354	1155	finally
    //   1376	1402	1155	finally
    //   1424	1450	1155	finally
    //   1465	1475	1155	finally
    //   631	663	1478	finally
    //   522	534	1483	java/lang/Throwable
    //   550	561	1483	java/lang/Throwable
    //   565	578	1483	java/lang/Throwable
    //   582	589	1483	java/lang/Throwable
    //   598	605	1483	java/lang/Throwable
    //   631	663	1494	java/lang/Throwable
  }

  public final boolean a()
  {
    return this.f;
  }

  public final boolean a(ay paramay)
  {
    try
    {
      AppMethodBeat.i(98552);
      boolean bool;
      if (paramay == null)
      {
        bool = false;
        AppMethodBeat.o(98552);
      }
      while (true)
      {
        return bool;
        if (!this.c.contains(paramay))
          this.c.add(paramay);
        bool = true;
        AppMethodBeat.o(98552);
      }
    }
    finally
    {
    }
    throw paramay;
  }

  public final boolean a(bd parambd)
  {
    try
    {
      AppMethodBeat.i(98551);
      boolean bool;
      if (parambd == null)
      {
        bool = false;
        AppMethodBeat.o(98551);
      }
      while (true)
      {
        return bool;
        this.b.append(101, parambd);
        bool = true;
        AppMethodBeat.o(98551);
      }
    }
    finally
    {
    }
    throw parambd;
  }

  public final boolean b()
  {
    try
    {
      AppMethodBeat.i(98560);
      boolean bool;
      if (e.l(this.e))
      {
        bool = true;
        AppMethodBeat.o(98560);
      }
      while (true)
      {
        return bool;
        bool = this.g;
        AppMethodBeat.o(98560);
      }
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.bf
 * JD-Core Version:    0.6.2
 */
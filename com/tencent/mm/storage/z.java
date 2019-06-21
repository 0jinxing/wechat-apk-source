package com.tencent.mm.storage;

import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.e.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import junit.framework.Assert;

public final class z extends n
{
  public static final String[] fnj;
  private static final Object xIt;
  private h fni;
  private Handler mHandler;
  public HandlerThread mHandlerThread;
  private a<Integer> xIu;
  private a<String> xIv;
  private HashMap<Integer, b> xIw;
  private HashMap<String, b> xIx;
  private volatile boolean xIy;
  private final Runnable xIz;

  static
  {
    AppMethodBeat.i(58988);
    fnj = new String[] { "CREATE TABLE IF NOT EXISTS userinfo ( id INTEGER PRIMARY KEY, type INT, value TEXT )", "CREATE TABLE IF NOT EXISTS userinfo2 ( sid TEXT PRIMARY KEY, type INT, value TEXT )" };
    xIt = new Object();
    AppMethodBeat.o(58988);
  }

  public z(h paramh)
  {
    AppMethodBeat.i(58970);
    this.xIu = new a("userinfo", "id");
    this.xIv = new a("userinfo2", "sid");
    this.xIw = new HashMap();
    this.xIx = new HashMap();
    this.xIz = new Runnable()
    {
      // ERROR //
      public final void run()
      {
        // Byte code:
        //   0: iconst_1
        //   1: istore_1
        //   2: iconst_0
        //   3: istore_2
        //   4: iconst_0
        //   5: istore_3
        //   6: iconst_0
        //   7: istore 4
        //   9: ldc 22
        //   11: invokestatic 28	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
        //   14: aload_0
        //   15: getfield 14	com/tencent/mm/storage/z$1:xIA	Lcom/tencent/mm/storage/z;
        //   18: invokestatic 32	com/tencent/mm/storage/z:a	(Lcom/tencent/mm/storage/z;)Lcom/tencent/mm/cd/h;
        //   21: invokevirtual 38	com/tencent/mm/cd/h:dvx	()Lcom/tencent/wcdb/database/SQLiteDatabase;
        //   24: astore 5
        //   26: aload 5
        //   28: ifnull +11 -> 39
        //   31: aload 5
        //   33: invokevirtual 44	com/tencent/wcdb/database/SQLiteDatabase:isOpen	()Z
        //   36: ifne +16 -> 52
        //   39: ldc 46
        //   41: ldc 48
        //   43: invokestatic 54	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
        //   46: ldc 22
        //   48: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
        //   51: return
        //   52: aload 5
        //   54: invokevirtual 60	com/tencent/wcdb/database/SQLiteDatabase:acquireReference	()V
        //   57: aload 5
        //   59: invokevirtual 63	com/tencent/wcdb/database/SQLiteDatabase:beginTransaction	()V
        //   62: iload_2
        //   63: istore 6
        //   65: iload_3
        //   66: istore 7
        //   68: iconst_3
        //   69: anewarray 4	java/lang/Object
        //   72: astore 8
        //   74: iload_2
        //   75: istore 6
        //   77: iload_3
        //   78: istore 7
        //   80: iconst_1
        //   81: anewarray 4	java/lang/Object
        //   84: astore 9
        //   86: iload_2
        //   87: istore 6
        //   89: iload_3
        //   90: istore 7
        //   92: aload_0
        //   93: getfield 14	com/tencent/mm/storage/z$1:xIA	Lcom/tencent/mm/storage/z;
        //   96: astore 10
        //   98: iload_2
        //   99: istore 6
        //   101: iload_3
        //   102: istore 7
        //   104: aload 10
        //   106: monitorenter
        //   107: aload_0
        //   108: getfield 14	com/tencent/mm/storage/z$1:xIA	Lcom/tencent/mm/storage/z;
        //   111: invokestatic 67	com/tencent/mm/storage/z:b	(Lcom/tencent/mm/storage/z;)Ljava/util/HashMap;
        //   114: astore 11
        //   116: aload_0
        //   117: getfield 14	com/tencent/mm/storage/z$1:xIA	Lcom/tencent/mm/storage/z;
        //   120: invokestatic 70	com/tencent/mm/storage/z:c	(Lcom/tencent/mm/storage/z;)Ljava/util/HashMap;
        //   123: astore 12
        //   125: aload_0
        //   126: getfield 14	com/tencent/mm/storage/z$1:xIA	Lcom/tencent/mm/storage/z;
        //   129: astore 13
        //   131: new 72	java/util/HashMap
        //   134: astore 14
        //   136: aload 14
        //   138: invokespecial 73	java/util/HashMap:<init>	()V
        //   141: aload 13
        //   143: aload 14
        //   145: invokestatic 76	com/tencent/mm/storage/z:a	(Lcom/tencent/mm/storage/z;Ljava/util/HashMap;)Ljava/util/HashMap;
        //   148: pop
        //   149: aload_0
        //   150: getfield 14	com/tencent/mm/storage/z$1:xIA	Lcom/tencent/mm/storage/z;
        //   153: astore 13
        //   155: new 72	java/util/HashMap
        //   158: astore 14
        //   160: aload 14
        //   162: invokespecial 73	java/util/HashMap:<init>	()V
        //   165: aload 13
        //   167: aload 14
        //   169: invokestatic 78	com/tencent/mm/storage/z:b	(Lcom/tencent/mm/storage/z;Ljava/util/HashMap;)Ljava/util/HashMap;
        //   172: pop
        //   173: aload_0
        //   174: getfield 14	com/tencent/mm/storage/z$1:xIA	Lcom/tencent/mm/storage/z;
        //   177: invokestatic 82	com/tencent/mm/storage/z:d	(Lcom/tencent/mm/storage/z;)Z
        //   180: pop
        //   181: aload 10
        //   183: monitorexit
        //   184: iload_2
        //   185: istore 6
        //   187: iload_3
        //   188: istore 7
        //   190: aload 11
        //   192: invokevirtual 86	java/util/HashMap:entrySet	()Ljava/util/Set;
        //   195: invokeinterface 92 1 0
        //   200: astore 13
        //   202: iload 4
        //   204: istore 6
        //   206: iload 4
        //   208: istore 7
        //   210: aload 13
        //   212: invokeinterface 97 1 0
        //   217: ifeq +326 -> 543
        //   220: iload 4
        //   222: istore 6
        //   224: iload 4
        //   226: istore 7
        //   228: aload 13
        //   230: invokeinterface 101 1 0
        //   235: checkcast 103	java/util/Map$Entry
        //   238: astore 11
        //   240: iload 4
        //   242: istore 6
        //   244: iload 4
        //   246: istore 7
        //   248: aload 11
        //   250: invokeinterface 106 1 0
        //   255: checkcast 108	com/tencent/mm/storage/z$b
        //   258: astore 10
        //   260: aload 10
        //   262: ifnonnull +146 -> 408
        //   265: iload 4
        //   267: istore 6
        //   269: iload 4
        //   271: istore 7
        //   273: aload 9
        //   275: iconst_0
        //   276: aload 11
        //   278: invokeinterface 111 1 0
        //   283: aastore
        //   284: iload 4
        //   286: istore 6
        //   288: iload 4
        //   290: istore 7
        //   292: aload 5
        //   294: ldc 113
        //   296: aload 9
        //   298: invokevirtual 117	com/tencent/wcdb/database/SQLiteDatabase:execSQL	(Ljava/lang/String;[Ljava/lang/Object;)V
        //   301: iinc 4 1
        //   304: goto -102 -> 202
        //   307: astore 9
        //   309: aload 10
        //   311: monitorexit
        //   312: iload_2
        //   313: istore 6
        //   315: iload_3
        //   316: istore 7
        //   318: ldc 22
        //   320: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
        //   323: iload_2
        //   324: istore 6
        //   326: iload_3
        //   327: istore 7
        //   329: aload 9
        //   331: athrow
        //   332: astore 9
        //   334: iconst_1
        //   335: istore 7
        //   337: iload 6
        //   339: istore 4
        //   341: iload 7
        //   343: istore 6
        //   345: ldc 46
        //   347: aload 9
        //   349: ldc 119
        //   351: iconst_0
        //   352: anewarray 4	java/lang/Object
        //   355: invokestatic 123	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
        //   358: iload 6
        //   360: ifeq +8 -> 368
        //   363: aload 5
        //   365: invokevirtual 126	com/tencent/wcdb/database/SQLiteDatabase:endTransaction	()V
        //   368: aload 5
        //   370: invokevirtual 129	com/tencent/wcdb/database/SQLiteDatabase:releaseReference	()V
        //   373: ldc 46
        //   375: new 131	java/lang/StringBuilder
        //   378: dup
        //   379: ldc 133
        //   381: invokespecial 136	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
        //   384: iload 4
        //   386: invokevirtual 140	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
        //   389: ldc 142
        //   391: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   394: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   397: invokestatic 151	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
        //   400: ldc 22
        //   402: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
        //   405: goto -354 -> 51
        //   408: iload 4
        //   410: istore 6
        //   412: iload 4
        //   414: istore 7
        //   416: aload 8
        //   418: iconst_0
        //   419: aload 11
        //   421: invokeinterface 111 1 0
        //   426: aastore
        //   427: iload 4
        //   429: istore 6
        //   431: iload 4
        //   433: istore 7
        //   435: aload 8
        //   437: iconst_1
        //   438: aload 10
        //   440: getfield 155	com/tencent/mm/storage/z$b:type	I
        //   443: invokestatic 161	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   446: aastore
        //   447: iload 4
        //   449: istore 6
        //   451: iload 4
        //   453: istore 7
        //   455: aload 8
        //   457: iconst_2
        //   458: aload 10
        //   460: getfield 165	com/tencent/mm/storage/z$b:fns	Ljava/lang/String;
        //   463: aastore
        //   464: iload 4
        //   466: istore 6
        //   468: iload 4
        //   470: istore 7
        //   472: aload 5
        //   474: ldc 167
        //   476: aload 8
        //   478: invokevirtual 117	com/tencent/wcdb/database/SQLiteDatabase:execSQL	(Ljava/lang/String;[Ljava/lang/Object;)V
        //   481: goto -180 -> 301
        //   484: astore 9
        //   486: iload 7
        //   488: istore 4
        //   490: iload_1
        //   491: istore 6
        //   493: iload 6
        //   495: ifeq +8 -> 503
        //   498: aload 5
        //   500: invokevirtual 126	com/tencent/wcdb/database/SQLiteDatabase:endTransaction	()V
        //   503: aload 5
        //   505: invokevirtual 129	com/tencent/wcdb/database/SQLiteDatabase:releaseReference	()V
        //   508: ldc 46
        //   510: new 131	java/lang/StringBuilder
        //   513: dup
        //   514: ldc 133
        //   516: invokespecial 136	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
        //   519: iload 4
        //   521: invokevirtual 140	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
        //   524: ldc 142
        //   526: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   529: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   532: invokestatic 151	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
        //   535: ldc 22
        //   537: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
        //   540: aload 9
        //   542: athrow
        //   543: iload 4
        //   545: istore 6
        //   547: iload 4
        //   549: istore 7
        //   551: aload 12
        //   553: invokevirtual 86	java/util/HashMap:entrySet	()Ljava/util/Set;
        //   556: invokeinterface 92 1 0
        //   561: astore 11
        //   563: iload 4
        //   565: istore 6
        //   567: iload 4
        //   569: istore 7
        //   571: aload 11
        //   573: invokeinterface 97 1 0
        //   578: ifeq +166 -> 744
        //   581: iload 4
        //   583: istore 6
        //   585: iload 4
        //   587: istore 7
        //   589: aload 11
        //   591: invokeinterface 101 1 0
        //   596: checkcast 103	java/util/Map$Entry
        //   599: astore 12
        //   601: iload 4
        //   603: istore 6
        //   605: iload 4
        //   607: istore 7
        //   609: aload 12
        //   611: invokeinterface 106 1 0
        //   616: checkcast 108	com/tencent/mm/storage/z$b
        //   619: astore 10
        //   621: aload 10
        //   623: ifnonnull +45 -> 668
        //   626: iload 4
        //   628: istore 6
        //   630: iload 4
        //   632: istore 7
        //   634: aload 9
        //   636: iconst_0
        //   637: aload 12
        //   639: invokeinterface 111 1 0
        //   644: aastore
        //   645: iload 4
        //   647: istore 6
        //   649: iload 4
        //   651: istore 7
        //   653: aload 5
        //   655: ldc 169
        //   657: aload 9
        //   659: invokevirtual 117	com/tencent/wcdb/database/SQLiteDatabase:execSQL	(Ljava/lang/String;[Ljava/lang/Object;)V
        //   662: iinc 4 1
        //   665: goto -102 -> 563
        //   668: iload 4
        //   670: istore 6
        //   672: iload 4
        //   674: istore 7
        //   676: aload 8
        //   678: iconst_0
        //   679: aload 12
        //   681: invokeinterface 111 1 0
        //   686: aastore
        //   687: iload 4
        //   689: istore 6
        //   691: iload 4
        //   693: istore 7
        //   695: aload 8
        //   697: iconst_1
        //   698: aload 10
        //   700: getfield 155	com/tencent/mm/storage/z$b:type	I
        //   703: invokestatic 161	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   706: aastore
        //   707: iload 4
        //   709: istore 6
        //   711: iload 4
        //   713: istore 7
        //   715: aload 8
        //   717: iconst_2
        //   718: aload 10
        //   720: getfield 165	com/tencent/mm/storage/z$b:fns	Ljava/lang/String;
        //   723: aastore
        //   724: iload 4
        //   726: istore 6
        //   728: iload 4
        //   730: istore 7
        //   732: aload 5
        //   734: ldc 171
        //   736: aload 8
        //   738: invokevirtual 117	com/tencent/wcdb/database/SQLiteDatabase:execSQL	(Ljava/lang/String;[Ljava/lang/Object;)V
        //   741: goto -79 -> 662
        //   744: iload 4
        //   746: istore 6
        //   748: iload 4
        //   750: istore 7
        //   752: aload 5
        //   754: invokevirtual 174	com/tencent/wcdb/database/SQLiteDatabase:setTransactionSuccessful	()V
        //   757: aload 5
        //   759: invokevirtual 126	com/tencent/wcdb/database/SQLiteDatabase:endTransaction	()V
        //   762: aload 5
        //   764: invokevirtual 129	com/tencent/wcdb/database/SQLiteDatabase:releaseReference	()V
        //   767: ldc 46
        //   769: new 131	java/lang/StringBuilder
        //   772: dup
        //   773: ldc 133
        //   775: invokespecial 136	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
        //   778: iload 4
        //   780: invokevirtual 140	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
        //   783: ldc 142
        //   785: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   788: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   791: invokestatic 151	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
        //   794: ldc 22
        //   796: invokestatic 57	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
        //   799: goto -748 -> 51
        //   802: astore 9
        //   804: iconst_0
        //   805: istore 6
        //   807: iconst_0
        //   808: istore 4
        //   810: goto -317 -> 493
        //   813: astore 9
        //   815: goto -322 -> 493
        //   818: astore 9
        //   820: iconst_0
        //   821: istore 6
        //   823: iconst_0
        //   824: istore 4
        //   826: goto -481 -> 345
        //
        // Exception table:
        //   from	to	target	type
        //   107	184	307	finally
        //   309	312	307	finally
        //   68	74	332	java/lang/RuntimeException
        //   80	86	332	java/lang/RuntimeException
        //   92	98	332	java/lang/RuntimeException
        //   104	107	332	java/lang/RuntimeException
        //   190	202	332	java/lang/RuntimeException
        //   210	220	332	java/lang/RuntimeException
        //   228	240	332	java/lang/RuntimeException
        //   248	260	332	java/lang/RuntimeException
        //   273	284	332	java/lang/RuntimeException
        //   292	301	332	java/lang/RuntimeException
        //   318	323	332	java/lang/RuntimeException
        //   329	332	332	java/lang/RuntimeException
        //   416	427	332	java/lang/RuntimeException
        //   435	447	332	java/lang/RuntimeException
        //   455	464	332	java/lang/RuntimeException
        //   472	481	332	java/lang/RuntimeException
        //   551	563	332	java/lang/RuntimeException
        //   571	581	332	java/lang/RuntimeException
        //   589	601	332	java/lang/RuntimeException
        //   609	621	332	java/lang/RuntimeException
        //   634	645	332	java/lang/RuntimeException
        //   653	662	332	java/lang/RuntimeException
        //   676	687	332	java/lang/RuntimeException
        //   695	707	332	java/lang/RuntimeException
        //   715	724	332	java/lang/RuntimeException
        //   732	741	332	java/lang/RuntimeException
        //   752	757	332	java/lang/RuntimeException
        //   68	74	484	finally
        //   80	86	484	finally
        //   92	98	484	finally
        //   104	107	484	finally
        //   190	202	484	finally
        //   210	220	484	finally
        //   228	240	484	finally
        //   248	260	484	finally
        //   273	284	484	finally
        //   292	301	484	finally
        //   318	323	484	finally
        //   329	332	484	finally
        //   416	427	484	finally
        //   435	447	484	finally
        //   455	464	484	finally
        //   472	481	484	finally
        //   551	563	484	finally
        //   571	581	484	finally
        //   589	601	484	finally
        //   609	621	484	finally
        //   634	645	484	finally
        //   653	662	484	finally
        //   676	687	484	finally
        //   695	707	484	finally
        //   715	724	484	finally
        //   732	741	484	finally
        //   752	757	484	finally
        //   52	62	802	finally
        //   345	358	813	finally
        //   52	62	818	java/lang/RuntimeException
      }
    };
    this.fni = paramh;
    this.mHandlerThread = new HandlerThread("ConfigStorage");
    this.mHandlerThread.start();
    this.mHandler = new Handler(this.mHandlerThread.getLooper());
    AppMethodBeat.o(58970);
  }

  private static boolean a(String paramString, Object paramObject, boolean paramBoolean)
  {
    boolean bool = true;
    AppMethodBeat.i(58981);
    if ((paramObject == null) && (paramBoolean))
    {
      AppMethodBeat.o(58981);
      paramBoolean = bool;
    }
    while (true)
    {
      return paramBoolean;
      if ((paramString.equals("INT")) && ((paramObject instanceof Integer)))
      {
        AppMethodBeat.o(58981);
        paramBoolean = bool;
      }
      else if ((paramString.equals("LONG")) && ((paramObject instanceof Long)))
      {
        AppMethodBeat.o(58981);
        paramBoolean = bool;
      }
      else if ((paramString.equals("STRING")) && ((paramObject instanceof String)))
      {
        AppMethodBeat.o(58981);
        paramBoolean = bool;
      }
      else if ((paramString.equals("BOOLEAN")) && ((paramObject instanceof Boolean)))
      {
        AppMethodBeat.o(58981);
        paramBoolean = bool;
      }
      else if ((paramString.equals("FLOAT")) && ((paramObject instanceof Float)))
      {
        AppMethodBeat.o(58981);
        paramBoolean = bool;
      }
      else if ((paramString.equals("DOUBLE")) && ((paramObject instanceof Double)))
      {
        AppMethodBeat.o(58981);
        paramBoolean = bool;
      }
      else
      {
        if ((paramObject != null) && (b.dnO()))
          Assert.assertTrue("checkType failed, input type and value[" + paramString + ", " + paramObject + "] are not match", false);
        if (paramBoolean)
          ab.e("MicroMsg.ConfigStorage", "checkType failed, input type and value[%s, %s] are not match", new Object[] { paramString, paramObject });
        AppMethodBeat.o(58981);
        paramBoolean = false;
      }
    }
  }

  private Object get(String paramString, Object paramObject)
  {
    AppMethodBeat.i(58978);
    Assert.assertNotNull("db is null", this.fni);
    paramString = this.xIv.get(paramString);
    if ((paramString == null) || (paramString == xIt))
    {
      AppMethodBeat.o(58978);
      paramString = paramObject;
    }
    while (true)
    {
      return paramString;
      AppMethodBeat.o(58978);
    }
  }

  public final long Mm(int paramInt)
  {
    AppMethodBeat.i(58987);
    Long localLong = (Long)get(paramInt, null);
    long l;
    if (localLong == null)
    {
      l = 0L;
      AppMethodBeat.o(58987);
    }
    while (true)
    {
      return l;
      l = localLong.longValue();
      AppMethodBeat.o(58987);
    }
  }

  public final long a(ac.a parama, long paramLong)
  {
    AppMethodBeat.i(58976);
    parama = get(parama, Long.valueOf(paramLong));
    if ((parama != null) && ((parama instanceof Long)))
    {
      paramLong = ((Long)parama).longValue();
      AppMethodBeat.o(58976);
    }
    while (true)
    {
      return paramLong;
      AppMethodBeat.o(58976);
    }
  }

  public final boolean apK()
  {
    boolean bool = true;
    AppMethodBeat.i(58982);
    Object localObject;
    if ((this.fni == null) || (this.fni.dpU()))
      if (this.fni == null)
      {
        localObject = "null";
        ab.w("MicroMsg.ConfigStorage", "shouldProcessEvent db is close :%s", new Object[] { localObject });
        AppMethodBeat.o(58982);
        bool = false;
      }
    while (true)
    {
      return bool;
      localObject = Boolean.valueOf(this.fni.dpU());
      break;
      AppMethodBeat.o(58982);
    }
  }

  public final void dsb()
  {
    AppMethodBeat.i(58983);
    try
    {
      this.mHandler.removeCallbacks(this.xIz);
      this.mHandler.post(this.xIz);
      this.xIy = true;
      ab.i("MicroMsg.ConfigStorage", "Posted appendAllToDisk");
      AppMethodBeat.o(58983);
      return;
    }
    finally
    {
      AppMethodBeat.o(58983);
    }
  }

  public final Object get(int paramInt)
  {
    AppMethodBeat.i(138433);
    Object localObject = get(paramInt, null);
    AppMethodBeat.o(138433);
    return localObject;
  }

  public final Object get(int paramInt, Object paramObject)
  {
    AppMethodBeat.i(58972);
    Assert.assertNotNull("db is null", this.fni);
    Object localObject = this.xIu.get(Integer.valueOf(paramInt));
    if ((localObject == null) || (localObject == xIt))
      AppMethodBeat.o(58972);
    while (true)
    {
      return paramObject;
      AppMethodBeat.o(58972);
      paramObject = localObject;
    }
  }

  public final Object get(ac.a parama, Object paramObject)
  {
    AppMethodBeat.i(58974);
    if (parama == null)
    {
      AppMethodBeat.o(58974);
      parama = paramObject;
    }
    while (true)
    {
      return parama;
      String str = parama.name();
      if (bo.isNullOrNil(str))
      {
        AppMethodBeat.o(58974);
        parama = paramObject;
      }
      else
      {
        String[] arrayOfString = str.split("_");
        Object localObject = arrayOfString[(arrayOfString.length - 1)];
        parama = (ac.a)localObject;
        if (((String)localObject).equals("SYNC"))
          parama = arrayOfString[(arrayOfString.length - 2)];
        localObject = get(str.substring(0, str.lastIndexOf(parama) + parama.length()), paramObject);
        if (!a(parama, localObject, false))
        {
          AppMethodBeat.o(58974);
          parama = paramObject;
        }
        else
        {
          AppMethodBeat.o(58974);
          parama = (ac.a)localObject;
        }
      }
    }
  }

  public final boolean getBoolean(ac.a parama, boolean paramBoolean)
  {
    AppMethodBeat.i(58975);
    parama = get(parama, Boolean.valueOf(paramBoolean));
    if ((parama != null) && ((parama instanceof Boolean)))
    {
      paramBoolean = ((Boolean)parama).booleanValue();
      AppMethodBeat.o(58975);
    }
    while (true)
    {
      return paramBoolean;
      AppMethodBeat.o(58975);
    }
  }

  public final int getInt(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(58985);
    Integer localInteger = (Integer)get(paramInt1, null);
    if (localInteger == null)
      AppMethodBeat.o(58985);
    while (true)
    {
      return paramInt2;
      paramInt2 = localInteger.intValue();
      AppMethodBeat.o(58985);
    }
  }

  public final int getInt(ac.a parama, int paramInt)
  {
    AppMethodBeat.i(58977);
    parama = get(parama, Integer.valueOf(paramInt));
    if ((parama != null) && ((parama instanceof Integer)))
    {
      paramInt = ((Integer)parama).intValue();
      AppMethodBeat.o(58977);
    }
    while (true)
    {
      return paramInt;
      AppMethodBeat.o(58977);
    }
  }

  public final Object i(ac.a parama)
  {
    AppMethodBeat.i(138434);
    parama = get(parama, null);
    AppMethodBeat.o(138434);
    return parama;
  }

  public final void set(int paramInt, Object paramObject)
  {
    AppMethodBeat.i(58979);
    Assert.assertNotNull("db is null", this.fni);
    Object localObject1 = paramObject;
    if (paramObject == null)
      localObject1 = xIt;
    if (!localObject1.equals(this.xIu.put(Integer.valueOf(paramInt), localObject1)))
    {
      if (localObject1 != xIt)
        break label172;
      paramObject = null;
    }
    while (true)
    {
      try
      {
        this.xIw.put(Integer.valueOf(paramInt), paramObject);
        if (!this.xIy)
        {
          this.xIy = true;
          this.mHandler.postDelayed(this.xIz, 30000L);
        }
        if (localObject1 == xIt)
        {
          i = 5;
          b(i, this, Integer.valueOf(paramInt));
          Object localObject2 = new StringBuilder("SET: ").append(paramInt).append(" => ");
          if (localObject1 != xIt)
            break label212;
          paramObject = "(DELETED)";
          ab.i("MicroMsg.ConfigStorage", paramObject);
          AppMethodBeat.o(58979);
          return;
          label172: localObject2 = b.cI(localObject1);
          paramObject = localObject2;
          if (localObject2 != null)
            break;
          AppMethodBeat.o(58979);
          continue;
        }
      }
      finally
      {
        AppMethodBeat.o(58979);
      }
      int i = 4;
      continue;
      label212: paramObject = localObject1.toString();
    }
  }

  public final void set(ac.a parama, Object paramObject)
  {
    AppMethodBeat.i(58980);
    if (parama == null)
      AppMethodBeat.o(58980);
    Object localObject1;
    while (true)
    {
      return;
      localObject1 = parama.name();
      if (!bo.isNullOrNil((String)localObject1))
        break;
      AppMethodBeat.o(58980);
    }
    Object localObject2 = ((String)localObject1).split("_");
    parama = localObject2[(localObject2.length - 1)];
    if (parama.equals("SYNC"))
      parama = localObject2[(localObject2.length - 2)];
    for (int i = 1; ; i = 0)
    {
      if (!a(parama, paramObject, true))
      {
        AppMethodBeat.o(58980);
        break;
      }
      int j = ((String)localObject1).lastIndexOf(parama);
      localObject2 = ((String)localObject1).substring(0, parama.length() + j);
      parama = paramObject;
      if (paramObject == null)
        parama = xIt;
      if (!parama.equals(this.xIv.put(localObject2, parama)))
      {
        if (parama != xIt)
          break label251;
        paramObject = null;
      }
      while (true)
      {
        try
        {
          label153: this.xIx.put(localObject2, paramObject);
          if (i != 0)
          {
            dsb();
            if (parama != xIt)
              break label312;
            i = 5;
            b(i, this, localObject2);
            paramObject = new StringBuilder("SET: ").append((String)localObject2).append(" => ");
            if (parama != xIt)
              break label318;
            parama = "(DELETED)";
            ab.i("MicroMsg.ConfigStorage", parama);
            AppMethodBeat.o(58980);
            break;
            label251: localObject1 = b.cI(parama);
            paramObject = localObject1;
            if (localObject1 != null)
              break label153;
            AppMethodBeat.o(58980);
            break;
          }
          if (this.xIy)
            continue;
          this.xIy = true;
          this.mHandler.postDelayed(this.xIz, 30000L);
          continue;
        }
        finally
        {
          AppMethodBeat.o(58980);
        }
        label312: i = 4;
        continue;
        label318: parama = parama.toString();
      }
    }
  }

  public final void setInt(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(58984);
    set(paramInt1, Integer.valueOf(paramInt2));
    AppMethodBeat.o(58984);
  }

  public final void setLong(int paramInt, long paramLong)
  {
    AppMethodBeat.i(58986);
    set(paramInt, Long.valueOf(paramLong));
    AppMethodBeat.o(58986);
  }

  final class a<K> extends ae<K, Object>
  {
    private final String xIB;

    a(String paramString1, String arg3)
    {
      super();
      AppMethodBeat.i(58965);
      String str;
      this.xIB = ("SELECT * FROM " + paramString1 + " WHERE " + str + "=?;");
      AppMethodBeat.o(58965);
    }

    // ERROR //
    public final Object create(K paramK)
    {
      // Byte code:
      //   0: ldc 57
      //   2: invokestatic 25	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
      //   5: aload_0
      //   6: getfield 16	com/tencent/mm/storage/z$a:xIA	Lcom/tencent/mm/storage/z;
      //   9: invokestatic 60	com/tencent/mm/storage/z:a	(Lcom/tencent/mm/storage/z;)Lcom/tencent/mm/cd/h;
      //   12: aload_0
      //   13: getfield 46	com/tencent/mm/storage/z$a:xIB	Ljava/lang/String;
      //   16: iconst_1
      //   17: anewarray 62	java/lang/String
      //   20: dup
      //   21: iconst_0
      //   22: aload_1
      //   23: invokevirtual 65	java/lang/Object:toString	()Ljava/lang/String;
      //   26: aastore
      //   27: iconst_2
      //   28: invokevirtual 70	com/tencent/mm/cd/h:a	(Ljava/lang/String;[Ljava/lang/String;I)Landroid/database/Cursor;
      //   31: astore_2
      //   32: aload_2
      //   33: invokeinterface 76 1 0
      //   38: ifeq +92 -> 130
      //   41: new 78	com/tencent/mm/storage/z$b
      //   44: astore_3
      //   45: aload_3
      //   46: aload_2
      //   47: iconst_1
      //   48: invokeinterface 82 2 0
      //   53: aload_2
      //   54: iconst_2
      //   55: invokeinterface 86 2 0
      //   60: invokespecial 89	com/tencent/mm/storage/z$b:<init>	(ILjava/lang/String;)V
      //   63: new 27	java/lang/StringBuilder
      //   66: astore 4
      //   68: aload 4
      //   70: ldc 91
      //   72: invokespecial 32	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   75: ldc 93
      //   77: aload 4
      //   79: aload_1
      //   80: invokevirtual 65	java/lang/Object:toString	()Ljava/lang/String;
      //   83: invokevirtual 36	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   86: ldc 95
      //   88: invokevirtual 36	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   91: aload_3
      //   92: getfield 98	com/tencent/mm/storage/z$b:fns	Ljava/lang/String;
      //   95: invokevirtual 36	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   98: invokevirtual 44	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   101: invokestatic 103	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
      //   104: aload_3
      //   105: invokevirtual 107	com/tencent/mm/storage/z$b:aoq	()Ljava/lang/Object;
      //   108: astore 4
      //   110: aload_2
      //   111: ifnull +9 -> 120
      //   114: aload_2
      //   115: invokeinterface 111 1 0
      //   120: ldc 57
      //   122: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   125: aload 4
      //   127: astore_1
      //   128: aload_1
      //   129: areturn
      //   130: new 27	java/lang/StringBuilder
      //   133: astore 4
      //   135: aload 4
      //   137: ldc 91
      //   139: invokespecial 32	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   142: ldc 93
      //   144: aload 4
      //   146: aload_1
      //   147: invokevirtual 65	java/lang/Object:toString	()Ljava/lang/String;
      //   150: invokevirtual 36	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   153: ldc 113
      //   155: invokevirtual 36	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   158: invokevirtual 44	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   161: invokestatic 103	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
      //   164: invokestatic 116	com/tencent/mm/storage/z:dsc	()Ljava/lang/Object;
      //   167: astore 4
      //   169: aload_2
      //   170: ifnull +9 -> 179
      //   173: aload_2
      //   174: invokeinterface 111 1 0
      //   179: ldc 57
      //   181: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   184: aload 4
      //   186: astore_1
      //   187: goto -59 -> 128
      //   190: astore 4
      //   192: ldc 57
      //   194: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   197: aload 4
      //   199: athrow
      //   200: astore_3
      //   201: aload_2
      //   202: ifnull +14 -> 216
      //   205: aload 4
      //   207: ifnull +58 -> 265
      //   210: aload_2
      //   211: invokeinterface 111 1 0
      //   216: ldc 57
      //   218: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   221: aload_3
      //   222: athrow
      //   223: astore 4
      //   225: ldc 93
      //   227: aload 4
      //   229: ldc 118
      //   231: aload_1
      //   232: invokestatic 122	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
      //   235: invokevirtual 126	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
      //   238: iconst_0
      //   239: anewarray 64	java/lang/Object
      //   242: invokestatic 130	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      //   245: ldc 57
      //   247: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   250: aconst_null
      //   251: astore_1
      //   252: goto -124 -> 128
      //   255: astore_2
      //   256: aload 4
      //   258: aload_2
      //   259: invokevirtual 134	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
      //   262: goto -46 -> 216
      //   265: aload_2
      //   266: invokeinterface 111 1 0
      //   271: goto -55 -> 216
      //   274: astore_3
      //   275: aconst_null
      //   276: astore 4
      //   278: goto -77 -> 201
      //
      // Exception table:
      //   from	to	target	type
      //   32	110	190	java/lang/Throwable
      //   130	169	190	java/lang/Throwable
      //   192	200	200	finally
      //   5	32	223	java/lang/RuntimeException
      //   114	120	223	java/lang/RuntimeException
      //   173	179	223	java/lang/RuntimeException
      //   210	216	223	java/lang/RuntimeException
      //   216	223	223	java/lang/RuntimeException
      //   256	262	223	java/lang/RuntimeException
      //   265	271	223	java/lang/RuntimeException
      //   210	216	255	java/lang/Throwable
      //   32	110	274	finally
      //   130	169	274	finally
    }
  }

  static final class b
  {
    final String fns;
    final int type;

    b(int paramInt, String paramString)
    {
      this.type = paramInt;
      this.fns = paramString;
    }

    static b cI(Object paramObject)
    {
      AppMethodBeat.i(58967);
      int i;
      if ((paramObject instanceof Integer))
      {
        i = 1;
        paramObject = new b(i, paramObject.toString());
        AppMethodBeat.o(58967);
      }
      while (true)
      {
        return paramObject;
        if ((paramObject instanceof Long))
        {
          i = 2;
          break;
        }
        if ((paramObject instanceof String))
        {
          i = 3;
          break;
        }
        if ((paramObject instanceof Boolean))
        {
          i = 4;
          break;
        }
        if ((paramObject instanceof Float))
        {
          i = 5;
          break;
        }
        if ((paramObject instanceof Double))
        {
          i = 6;
          break;
        }
        ab.e("MicroMsg.ConfigStorage", "unresolve failed, unknown type=" + paramObject.getClass().toString());
        paramObject = null;
        AppMethodBeat.o(58967);
      }
    }

    final Object aoq()
    {
      Object localObject1 = null;
      AppMethodBeat.i(58969);
      if (this.fns == z.dsc())
        AppMethodBeat.o(58969);
      while (true)
      {
        return localObject1;
        try
        {
          int i = this.type;
          Object localObject2;
          switch (i)
          {
          default:
            AppMethodBeat.o(58969);
            break;
          case 1:
            localObject2 = Integer.valueOf(this.fns);
            localObject1 = localObject2;
            AppMethodBeat.o(58969);
            break;
          case 2:
            localObject2 = Long.valueOf(this.fns);
            localObject1 = localObject2;
            AppMethodBeat.o(58969);
            break;
          case 3:
            localObject2 = this.fns;
            AppMethodBeat.o(58969);
            localObject1 = localObject2;
            break;
          case 4:
            localObject2 = Boolean.valueOf(this.fns);
            localObject1 = localObject2;
            AppMethodBeat.o(58969);
            break;
          case 5:
            localObject2 = Float.valueOf(this.fns);
            localObject1 = localObject2;
            AppMethodBeat.o(58969);
            break;
          case 6:
            localObject2 = Double.valueOf(this.fns);
            localObject1 = localObject2;
            AppMethodBeat.o(58969);
          }
        }
        catch (Exception localException)
        {
          while (true)
            ab.e("MicroMsg.ConfigStorage", "exception:%s", new Object[] { bo.l(localException) });
        }
      }
    }

    public final boolean equals(Object paramObject)
    {
      boolean bool = false;
      AppMethodBeat.i(58968);
      if (paramObject == null)
        AppMethodBeat.o(58968);
      while (true)
      {
        return bool;
        if (!(paramObject instanceof b))
        {
          AppMethodBeat.o(58968);
        }
        else
        {
          paramObject = (b)paramObject;
          if (this.type != paramObject.type)
          {
            AppMethodBeat.o(58968);
          }
          else if (this.fns == null)
          {
            if (paramObject.fns == null)
            {
              bool = true;
              AppMethodBeat.o(58968);
            }
            else
            {
              AppMethodBeat.o(58968);
            }
          }
          else
          {
            bool = this.fns.equals(paramObject.fns);
            AppMethodBeat.o(58968);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.z
 * JD-Core Version:    0.6.2
 */
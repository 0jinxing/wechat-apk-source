package com.tencent.mm.sdk.platformtools;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;

final class bc$1 extends ContentObserver
{
  private long xBn;

  bc$1(Handler paramHandler, Context paramContext)
  {
    super(paramHandler);
  }

  // ERROR //
  public final void onChange(boolean paramBoolean, android.net.Uri paramUri)
  {
    // Byte code:
    //   0: ldc 26
    //   2: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: ldc 34
    //   7: new 36	java/lang/StringBuilder
    //   10: dup
    //   11: ldc 38
    //   13: invokespecial 41	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   16: iload_1
    //   17: invokevirtual 45	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   20: ldc 47
    //   22: invokevirtual 50	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   25: aload_2
    //   26: invokevirtual 56	android/net/Uri:toString	()Ljava/lang/String;
    //   29: invokevirtual 50	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   32: invokevirtual 57	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   35: invokestatic 63	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   38: invokestatic 67	com/tencent/mm/sdk/platformtools/bc:dpi	()Ljava/lang/ref/WeakReference;
    //   41: ifnull +12 -> 53
    //   44: invokestatic 67	com/tencent/mm/sdk/platformtools/bc:dpi	()Ljava/lang/ref/WeakReference;
    //   47: invokevirtual 73	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   50: ifnonnull +63 -> 113
    //   53: ldc 34
    //   55: ldc 75
    //   57: iconst_1
    //   58: anewarray 77	java/lang/Object
    //   61: dup
    //   62: iconst_0
    //   63: invokestatic 67	com/tencent/mm/sdk/platformtools/bc:dpi	()Ljava/lang/ref/WeakReference;
    //   66: aastore
    //   67: invokestatic 80	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   70: aload_0
    //   71: getfield 17	com/tencent/mm/sdk/platformtools/bc$1:val$context	Landroid/content/Context;
    //   74: invokevirtual 86	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   77: aload_0
    //   78: invokevirtual 92	android/content/ContentResolver:unregisterContentObserver	(Landroid/database/ContentObserver;)V
    //   81: invokestatic 96	com/tencent/mm/sdk/platformtools/bc:dpj	()Landroid/database/ContentObserver;
    //   84: pop
    //   85: invokestatic 67	com/tencent/mm/sdk/platformtools/bc:dpi	()Ljava/lang/ref/WeakReference;
    //   88: ifnull +13 -> 101
    //   91: invokestatic 67	com/tencent/mm/sdk/platformtools/bc:dpi	()Ljava/lang/ref/WeakReference;
    //   94: invokevirtual 100	java/lang/ref/WeakReference:clear	()V
    //   97: invokestatic 103	com/tencent/mm/sdk/platformtools/bc:dpk	()Ljava/lang/ref/WeakReference;
    //   100: pop
    //   101: aload_0
    //   102: iload_1
    //   103: aload_2
    //   104: invokespecial 105	android/database/ContentObserver:onChange	(ZLandroid/net/Uri;)V
    //   107: ldc 26
    //   109: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   112: return
    //   113: aload_2
    //   114: invokevirtual 56	android/net/Uri:toString	()Ljava/lang/String;
    //   117: invokestatic 111	com/tencent/mm/sdk/platformtools/bc:access$200	()Ljava/lang/String;
    //   120: invokevirtual 117	java/lang/String:matches	(Ljava/lang/String;)Z
    //   123: ifne +16 -> 139
    //   126: aload_2
    //   127: invokevirtual 56	android/net/Uri:toString	()Ljava/lang/String;
    //   130: invokestatic 111	com/tencent/mm/sdk/platformtools/bc:access$200	()Ljava/lang/String;
    //   133: invokevirtual 121	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   136: ifeq -35 -> 101
    //   139: aload_0
    //   140: getfield 17	com/tencent/mm/sdk/platformtools/bc$1:val$context	Landroid/content/Context;
    //   143: invokevirtual 86	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   146: aload_2
    //   147: invokestatic 125	com/tencent/mm/sdk/platformtools/bc:cXD	()[Ljava/lang/String;
    //   150: aconst_null
    //   151: aconst_null
    //   152: ldc 127
    //   154: invokevirtual 131	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   157: astore_3
    //   158: aload_3
    //   159: ifnull +480 -> 639
    //   162: aload_3
    //   163: astore 4
    //   165: aload_3
    //   166: invokeinterface 137 1 0
    //   171: ifeq +468 -> 639
    //   174: aload_3
    //   175: astore 4
    //   177: aload_3
    //   178: aload_3
    //   179: ldc 139
    //   181: invokeinterface 143 2 0
    //   186: invokeinterface 147 2 0
    //   191: astore 5
    //   193: aload_3
    //   194: astore 4
    //   196: aload_3
    //   197: aload_3
    //   198: ldc 149
    //   200: invokeinterface 143 2 0
    //   205: invokeinterface 153 2 0
    //   210: lstore 6
    //   212: aload_3
    //   213: astore 4
    //   215: invokestatic 159	java/lang/System:currentTimeMillis	()J
    //   218: ldc2_w 160
    //   221: ldiv
    //   222: lstore 8
    //   224: aload_3
    //   225: astore 4
    //   227: new 36	java/lang/StringBuilder
    //   230: astore 10
    //   232: aload_3
    //   233: astore 4
    //   235: aload 10
    //   237: ldc 163
    //   239: invokespecial 41	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   242: aload_3
    //   243: astore 4
    //   245: ldc 34
    //   247: aload 10
    //   249: aload 5
    //   251: invokevirtual 50	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   254: ldc 165
    //   256: invokevirtual 50	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   259: lload 6
    //   261: invokevirtual 168	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   264: ldc 170
    //   266: invokevirtual 50	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   269: lload 8
    //   271: invokevirtual 168	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   274: invokevirtual 57	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   277: invokestatic 63	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   280: aload_3
    //   281: astore 4
    //   283: lload 8
    //   285: lload 6
    //   287: lsub
    //   288: invokestatic 176	java/lang/Math:abs	(J)J
    //   291: ldc2_w 177
    //   294: lcmp
    //   295: ifgt +344 -> 639
    //   298: aload_3
    //   299: astore 4
    //   301: lload 8
    //   303: aload_0
    //   304: getfield 180	com/tencent/mm/sdk/platformtools/bc$1:xBn	J
    //   307: lsub
    //   308: lconst_1
    //   309: lcmp
    //   310: ifle +329 -> 639
    //   313: aload_3
    //   314: astore 4
    //   316: aload 5
    //   318: invokestatic 185	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   321: ifne +318 -> 639
    //   324: aload_3
    //   325: astore 4
    //   327: aload 5
    //   329: invokevirtual 188	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   332: ldc 190
    //   334: invokevirtual 121	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   337: ifne +33 -> 370
    //   340: aload_3
    //   341: astore 4
    //   343: aload 5
    //   345: ldc 192
    //   347: invokevirtual 121	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   350: ifne +20 -> 370
    //   353: aload_3
    //   354: astore 4
    //   356: aload 5
    //   358: ldc 194
    //   360: invokevirtual 121	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   363: istore 11
    //   365: iload 11
    //   367: ifeq +272 -> 639
    //   370: aload_3
    //   371: astore 4
    //   373: aload_0
    //   374: lload 8
    //   376: putfield 180	com/tencent/mm/sdk/platformtools/bc$1:xBn	J
    //   379: lload 6
    //   381: lstore 8
    //   383: aload 5
    //   385: astore 4
    //   387: aload_3
    //   388: ifnull +17 -> 405
    //   391: aload_3
    //   392: invokeinterface 197 1 0
    //   397: aload 5
    //   399: astore 4
    //   401: lload 6
    //   403: lstore 8
    //   405: aload 4
    //   407: invokestatic 185	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   410: ifne -309 -> 101
    //   413: ldc 34
    //   415: new 36	java/lang/StringBuilder
    //   418: dup
    //   419: ldc 199
    //   421: invokespecial 41	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   424: aload 4
    //   426: invokevirtual 50	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   429: ldc 201
    //   431: invokevirtual 50	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   434: lload 8
    //   436: invokevirtual 168	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   439: invokevirtual 57	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   442: invokestatic 203	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   445: invokestatic 67	com/tencent/mm/sdk/platformtools/bc:dpi	()Ljava/lang/ref/WeakReference;
    //   448: ifnull +130 -> 578
    //   451: invokestatic 67	com/tencent/mm/sdk/platformtools/bc:dpi	()Ljava/lang/ref/WeakReference;
    //   454: invokevirtual 73	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   457: ifnull +121 -> 578
    //   460: invokestatic 67	com/tencent/mm/sdk/platformtools/bc:dpi	()Ljava/lang/ref/WeakReference;
    //   463: invokevirtual 73	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   466: checkcast 205	com/tencent/mm/sdk/platformtools/bc$a
    //   469: invokeinterface 208 1 0
    //   474: goto -373 -> 101
    //   477: astore 10
    //   479: aconst_null
    //   480: astore_3
    //   481: lconst_0
    //   482: lstore 6
    //   484: aconst_null
    //   485: astore 5
    //   487: aload_3
    //   488: astore 4
    //   490: new 36	java/lang/StringBuilder
    //   493: astore 12
    //   495: aload_3
    //   496: astore 4
    //   498: aload 12
    //   500: ldc 210
    //   502: invokespecial 41	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   505: aload_3
    //   506: astore 4
    //   508: ldc 34
    //   510: aload 12
    //   512: aload 10
    //   514: invokevirtual 213	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   517: invokevirtual 50	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   520: invokevirtual 57	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   523: invokestatic 216	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   526: lload 6
    //   528: lstore 8
    //   530: aload 5
    //   532: astore 4
    //   534: aload_3
    //   535: ifnull -130 -> 405
    //   538: aload_3
    //   539: invokeinterface 197 1 0
    //   544: lload 6
    //   546: lstore 8
    //   548: aload 5
    //   550: astore 4
    //   552: goto -147 -> 405
    //   555: astore_2
    //   556: aconst_null
    //   557: astore 4
    //   559: aload 4
    //   561: ifnull +10 -> 571
    //   564: aload 4
    //   566: invokeinterface 197 1 0
    //   571: ldc 26
    //   573: invokestatic 108	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   576: aload_2
    //   577: athrow
    //   578: aload_0
    //   579: getfield 17	com/tencent/mm/sdk/platformtools/bc$1:val$context	Landroid/content/Context;
    //   582: invokevirtual 86	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   585: aload_0
    //   586: invokevirtual 92	android/content/ContentResolver:unregisterContentObserver	(Landroid/database/ContentObserver;)V
    //   589: invokestatic 96	com/tencent/mm/sdk/platformtools/bc:dpj	()Landroid/database/ContentObserver;
    //   592: pop
    //   593: invokestatic 67	com/tencent/mm/sdk/platformtools/bc:dpi	()Ljava/lang/ref/WeakReference;
    //   596: ifnull +13 -> 609
    //   599: invokestatic 67	com/tencent/mm/sdk/platformtools/bc:dpi	()Ljava/lang/ref/WeakReference;
    //   602: invokevirtual 100	java/lang/ref/WeakReference:clear	()V
    //   605: invokestatic 103	com/tencent/mm/sdk/platformtools/bc:dpk	()Ljava/lang/ref/WeakReference;
    //   608: pop
    //   609: ldc 34
    //   611: ldc 218
    //   613: invokestatic 203	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   616: goto -515 -> 101
    //   619: astore_2
    //   620: goto -61 -> 559
    //   623: astore 10
    //   625: lconst_0
    //   626: lstore 6
    //   628: aconst_null
    //   629: astore 5
    //   631: goto -144 -> 487
    //   634: astore 10
    //   636: goto -149 -> 487
    //   639: lconst_0
    //   640: lstore 6
    //   642: aconst_null
    //   643: astore 5
    //   645: goto -266 -> 379
    //
    // Exception table:
    //   from	to	target	type
    //   139	158	477	java/lang/Exception
    //   139	158	555	finally
    //   165	174	619	finally
    //   177	193	619	finally
    //   196	212	619	finally
    //   215	224	619	finally
    //   227	232	619	finally
    //   235	242	619	finally
    //   245	280	619	finally
    //   283	298	619	finally
    //   301	313	619	finally
    //   316	324	619	finally
    //   327	340	619	finally
    //   343	353	619	finally
    //   356	365	619	finally
    //   373	379	619	finally
    //   490	495	619	finally
    //   498	505	619	finally
    //   508	526	619	finally
    //   165	174	623	java/lang/Exception
    //   177	193	623	java/lang/Exception
    //   196	212	623	java/lang/Exception
    //   215	224	623	java/lang/Exception
    //   227	232	623	java/lang/Exception
    //   235	242	623	java/lang/Exception
    //   245	280	623	java/lang/Exception
    //   283	298	623	java/lang/Exception
    //   301	313	623	java/lang/Exception
    //   316	324	623	java/lang/Exception
    //   327	340	623	java/lang/Exception
    //   343	353	623	java/lang/Exception
    //   356	365	623	java/lang/Exception
    //   373	379	634	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.bc.1
 * JD-Core Version:    0.6.2
 */
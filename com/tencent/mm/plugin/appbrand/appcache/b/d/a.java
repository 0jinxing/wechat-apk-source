package com.tencent.mm.plugin.appbrand.appcache.b.d;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/appcache/predownload/statistitcs/PredownloadGetCodeStatStorage;", "Lcom/tencent/mm/plugin/appbrand/storage/MAutoStorageWithMultiKey;", "Lcom/tencent/mm/plugin/appbrand/appcache/predownload/statistitcs/PredownloadGetCodeStats;", "db", "Lcom/tencent/mm/sdk/storage/ISQLiteDatabase;", "(Lcom/tencent/mm/sdk/storage/ISQLiteDatabase;)V", "getDb", "()Lcom/tencent/mm/sdk/storage/ISQLiteDatabase;", "checkReportOnLocalPkgFound", "", "appId", "", "version", "", "delete", "", "increaseHitCount", "pruneOutdatedRecords", "setSource", "source", "Companion", "plugin-appbrand-integration_release"})
public final class a extends com.tencent.mm.plugin.appbrand.q.c<b>
{
  public static final String[] fjY;

  @Deprecated
  public static final a.a gWr;
  private final e bSd;

  static
  {
    AppMethodBeat.i(134478);
    gWr = new a.a((byte)0);
    fjY = new String[] { j.a(b.fjX, "AppBrandWxaPkgPreDownloadStatistics") };
    AppMethodBeat.o(134478);
  }

  public a(e parame)
  {
    super(parame, b.fjX, "AppBrandWxaPkgPreDownloadStatistics", b.diI);
    AppMethodBeat.i(134477);
    this.bSd = parame;
    AppMethodBeat.o(134477);
  }

  // ERROR //
  public final void aww()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: ldc 98
    //   4: invokestatic 49	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: new 100	java/util/LinkedList
    //   10: dup
    //   11: invokespecial 102	java/util/LinkedList:<init>	()V
    //   14: astore_2
    //   15: aload_0
    //   16: getfield 94	com/tencent/mm/plugin/appbrand/appcache/b/d/a:bSd	Lcom/tencent/mm/sdk/e/e;
    //   19: ldc 104
    //   21: aconst_null
    //   22: iconst_2
    //   23: invokeinterface 109 4 0
    //   28: astore_3
    //   29: aload_3
    //   30: ifnull +44 -> 74
    //   33: aload_3
    //   34: checkcast 111	java/io/Closeable
    //   37: astore_3
    //   38: aload_3
    //   39: checkcast 113	android/database/Cursor
    //   42: astore 4
    //   44: aload 4
    //   46: invokeinterface 117 1 0
    //   51: ifne +13 -> 64
    //   54: aload 4
    //   56: invokeinterface 120 1 0
    //   61: ifne +98 -> 159
    //   64: getstatic 126	a/y:AUy	La/y;
    //   67: astore 4
    //   69: aload_3
    //   70: aconst_null
    //   71: invokestatic 131	a/e/b:a	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   74: aload_2
    //   75: invokevirtual 135	java/util/LinkedList:iterator	()Ljava/util/Iterator;
    //   78: astore_1
    //   79: aload_1
    //   80: invokeinterface 140 1 0
    //   85: ifeq +156 -> 241
    //   88: aload_1
    //   89: invokeinterface 144 1 0
    //   94: checkcast 146	a/o
    //   97: astore_3
    //   98: aload_3
    //   99: getfield 150	a/o:first	Ljava/lang/Object;
    //   102: checkcast 57	java/lang/String
    //   105: astore_2
    //   106: aload_3
    //   107: getfield 153	a/o:second	Ljava/lang/Object;
    //   110: checkcast 155	java/lang/Number
    //   113: invokevirtual 159	java/lang/Number:intValue	()I
    //   116: istore 5
    //   118: aload_0
    //   119: getfield 94	com/tencent/mm/plugin/appbrand/appcache/b/d/a:bSd	Lcom/tencent/mm/sdk/e/e;
    //   122: ldc 65
    //   124: new 161	java/lang/StringBuilder
    //   127: dup
    //   128: ldc 163
    //   130: invokespecial 166	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   133: aload_2
    //   134: invokevirtual 170	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   137: ldc 172
    //   139: invokevirtual 170	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   142: iload 5
    //   144: invokevirtual 175	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   147: invokevirtual 179	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   150: invokeinterface 183 3 0
    //   155: pop
    //   156: goto -77 -> 79
    //   159: aload 4
    //   161: iconst_0
    //   162: invokeinterface 187 2 0
    //   167: astore 6
    //   169: aload 4
    //   171: iconst_1
    //   172: invokeinterface 191 2 0
    //   177: istore 5
    //   179: new 146	a/o
    //   182: astore 7
    //   184: aload 7
    //   186: aload 6
    //   188: iload 5
    //   190: invokestatic 197	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   193: invokespecial 200	a/o:<init>	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   196: aload_2
    //   197: aload 7
    //   199: invokevirtual 204	java/util/LinkedList:add	(Ljava/lang/Object;)Z
    //   202: pop
    //   203: aload 4
    //   205: invokeinterface 207 1 0
    //   210: istore 8
    //   212: iload 8
    //   214: ifne -55 -> 159
    //   217: goto -153 -> 64
    //   220: astore_1
    //   221: ldc 98
    //   223: invokestatic 76	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   226: aload_1
    //   227: athrow
    //   228: astore_2
    //   229: aload_3
    //   230: aload_1
    //   231: invokestatic 131	a/e/b:a	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   234: ldc 98
    //   236: invokestatic 76	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   239: aload_2
    //   240: athrow
    //   241: ldc 98
    //   243: invokestatic 76	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   246: return
    //   247: astore_2
    //   248: goto -19 -> 229
    //
    // Exception table:
    //   from	to	target	type
    //   38	64	220	java/lang/Throwable
    //   64	69	220	java/lang/Throwable
    //   159	212	220	java/lang/Throwable
    //   221	228	228	finally
    //   38	64	247	finally
    //   64	69	247	finally
    //   159	212	247	finally
  }

  public final void ay(String paramString, int paramInt)
  {
    AppMethodBeat.i(134476);
    Object localObject = (CharSequence)paramString;
    int i;
    if ((localObject == null) || (((CharSequence)localObject).length() == 0))
    {
      i = 1;
      if (i == 0)
        break label43;
      AppMethodBeat.o(134476);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label43: localObject = new b();
      ((b)localObject).field_appId = paramString;
      ((b)localObject).field_version = paramInt;
      ((b)localObject).field_hitCount = 0;
      ((b)localObject).field_source = 0;
      ((b)localObject).field_reportId = 0;
      boolean bool = b((com.tencent.mm.sdk.e.c)localObject, new String[0]);
      if (((b)localObject).field_source == 1)
        if (((b)localObject).field_hitCount <= 0)
          break label156;
      label156: for (paramInt = 57; ; paramInt = 56)
      {
        paramString = com.tencent.mm.plugin.appbrand.appcache.b.c.a.gWl;
        com.tencent.mm.plugin.appbrand.appcache.b.c.a.cO(((b)localObject).field_reportId, paramInt);
        ((b)localObject).field_hitCount += 1;
        if (!bool)
          break label162;
        c((com.tencent.mm.sdk.e.c)localObject, new String[0]);
        AppMethodBeat.o(134476);
        break;
      }
      label162: b((com.tencent.mm.sdk.e.c)localObject);
      AppMethodBeat.o(134476);
    }
  }

  public final boolean pI(String paramString)
  {
    AppMethodBeat.i(134474);
    CharSequence localCharSequence = (CharSequence)paramString;
    int i;
    boolean bool;
    if ((localCharSequence == null) || (localCharSequence.length() == 0))
    {
      i = 1;
      if (i == 0)
        break label47;
      AppMethodBeat.o(134474);
      bool = false;
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label47: paramString = "delete from AppBrandWxaPkgPreDownloadStatistics where appId='" + paramString + '\'';
      bool = this.bSd.hY("AppBrandWxaPkgPreDownloadStatistics", paramString);
      AppMethodBeat.o(134474);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.b.d.a
 * JD-Core Version:    0.6.2
 */
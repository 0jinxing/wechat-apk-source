package com.tencent.mm.plugin.game.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.ui.GameRegionPreference.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class a
{
  private Map<String, GameRegionPreference.a> nlT;
  public boolean nns;
  private Map<String, Boolean> nnt;

  private a()
  {
    AppMethodBeat.i(112284);
    this.nns = false;
    this.nnt = new ConcurrentHashMap();
    AppMethodBeat.o(112284);
  }

  public final boolean Op(String paramString)
  {
    try
    {
      AppMethodBeat.i(112289);
      boolean bool;
      if (bo.isNullOrNil(paramString))
      {
        AppMethodBeat.o(112289);
        bool = false;
      }
      while (true)
      {
        return bool;
        if ((!this.nnt.containsKey(paramString)) || (!((Boolean)this.nnt.get(paramString)).booleanValue()))
        {
          ab.i("MicroMsg.GameCacheUtil", "download entrance image start : %s", new Object[] { paramString });
          this.nnt.put(paramString, Boolean.TRUE);
          AppMethodBeat.o(112289);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(112289);
          bool = false;
        }
      }
    }
    finally
    {
    }
    throw paramString;
  }

  public final void Oq(String paramString)
  {
    try
    {
      AppMethodBeat.i(112290);
      if ((!bo.isNullOrNil(paramString)) && (this.nnt.containsKey(paramString)))
      {
        ab.i("MicroMsg.GameCacheUtil", "download entrance image finish : %s", new Object[] { paramString });
        this.nnt.remove(paramString);
      }
      AppMethodBeat.o(112290);
      return;
    }
    finally
    {
    }
    throw paramString;
  }

  public final void bFB()
  {
    try
    {
      AppMethodBeat.i(112286);
      if (this.nlT != null)
      {
        Iterator localIterator = this.nlT.values().iterator();
        while (localIterator.hasNext())
          ((GameRegionPreference.a)localIterator.next()).gBF = false;
      }
    }
    finally
    {
    }
    AppMethodBeat.o(112286);
  }

  // ERROR //
  public final void bFC()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 118
    //   4: invokestatic 24	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: aload_0
    //   8: getfield 90	com/tencent/mm/plugin/game/f/a:nlT	Ljava/util/Map;
    //   11: ifnonnull +16 -> 27
    //   14: new 120	java/util/LinkedHashMap
    //   17: astore_1
    //   18: aload_1
    //   19: invokespecial 121	java/util/LinkedHashMap:<init>	()V
    //   22: aload_0
    //   23: aload_1
    //   24: putfield 90	com/tencent/mm/plugin/game/f/a:nlT	Ljava/util/Map;
    //   27: aload_0
    //   28: getfield 90	com/tencent/mm/plugin/game/f/a:nlT	Ljava/util/Map;
    //   31: invokeinterface 125 1 0
    //   36: ifgt +379 -> 415
    //   39: aconst_null
    //   40: astore_1
    //   41: aconst_null
    //   42: astore_2
    //   43: invokestatic 131	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   46: invokevirtual 137	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   49: ldc 139
    //   51: invokevirtual 145	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   54: astore_3
    //   55: aload_3
    //   56: astore_2
    //   57: aload_3
    //   58: astore_1
    //   59: aload_3
    //   60: invokevirtual 150	java/io/InputStream:available	()I
    //   63: newarray byte
    //   65: astore 4
    //   67: aload_3
    //   68: astore_2
    //   69: aload_3
    //   70: astore_1
    //   71: aload_3
    //   72: aload 4
    //   74: invokevirtual 154	java/io/InputStream:read	([B)I
    //   77: pop
    //   78: aload_3
    //   79: astore_2
    //   80: aload_3
    //   81: astore_1
    //   82: new 156	java/lang/String
    //   85: astore 5
    //   87: aload_3
    //   88: astore_2
    //   89: aload_3
    //   90: astore_1
    //   91: aload 5
    //   93: aload 4
    //   95: invokespecial 159	java/lang/String:<init>	([B)V
    //   98: aload 5
    //   100: astore_1
    //   101: aload_3
    //   102: ifnull +10 -> 112
    //   105: aload_3
    //   106: invokevirtual 162	java/io/InputStream:close	()V
    //   109: aload 5
    //   111: astore_1
    //   112: aload_1
    //   113: invokevirtual 166	java/lang/String:trim	()Ljava/lang/String;
    //   116: ldc 168
    //   118: invokevirtual 172	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   121: astore_1
    //   122: iconst_0
    //   123: istore 6
    //   125: iload 6
    //   127: aload_1
    //   128: arraylength
    //   129: if_icmpge +238 -> 367
    //   132: aload_1
    //   133: iload 6
    //   135: aaload
    //   136: invokevirtual 166	java/lang/String:trim	()Ljava/lang/String;
    //   139: ldc 174
    //   141: invokevirtual 172	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   144: astore_3
    //   145: aload_3
    //   146: arraylength
    //   147: iconst_4
    //   148: if_icmpge +155 -> 303
    //   151: ldc 63
    //   153: ldc 176
    //   155: iconst_1
    //   156: anewarray 4	java/lang/Object
    //   159: dup
    //   160: iconst_0
    //   161: aload_1
    //   162: iload 6
    //   164: aaload
    //   165: aastore
    //   166: invokestatic 179	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   169: iinc 6 1
    //   172: goto -47 -> 125
    //   175: astore_1
    //   176: ldc 63
    //   178: ldc 181
    //   180: iconst_1
    //   181: anewarray 4	java/lang/Object
    //   184: dup
    //   185: iconst_0
    //   186: aload_1
    //   187: invokestatic 185	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   190: aastore
    //   191: invokestatic 179	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   194: aload 5
    //   196: astore_1
    //   197: goto -85 -> 112
    //   200: astore_1
    //   201: aload_0
    //   202: monitorexit
    //   203: aload_1
    //   204: athrow
    //   205: astore_3
    //   206: aload_2
    //   207: astore_1
    //   208: ldc 63
    //   210: ldc 181
    //   212: iconst_1
    //   213: anewarray 4	java/lang/Object
    //   216: dup
    //   217: iconst_0
    //   218: aload_3
    //   219: invokestatic 185	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   222: aastore
    //   223: invokestatic 179	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   226: aload_2
    //   227: ifnull +196 -> 423
    //   230: aload_2
    //   231: invokevirtual 162	java/io/InputStream:close	()V
    //   234: ldc 187
    //   236: astore_1
    //   237: goto -125 -> 112
    //   240: astore_1
    //   241: ldc 63
    //   243: ldc 181
    //   245: iconst_1
    //   246: anewarray 4	java/lang/Object
    //   249: dup
    //   250: iconst_0
    //   251: aload_1
    //   252: invokestatic 185	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   255: aastore
    //   256: invokestatic 179	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   259: ldc 187
    //   261: astore_1
    //   262: goto -150 -> 112
    //   265: astore_2
    //   266: aload_1
    //   267: ifnull +7 -> 274
    //   270: aload_1
    //   271: invokevirtual 162	java/io/InputStream:close	()V
    //   274: ldc 118
    //   276: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   279: aload_2
    //   280: athrow
    //   281: astore_1
    //   282: ldc 63
    //   284: ldc 181
    //   286: iconst_1
    //   287: anewarray 4	java/lang/Object
    //   290: dup
    //   291: iconst_0
    //   292: aload_1
    //   293: invokestatic 185	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   296: aastore
    //   297: invokestatic 179	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   300: goto -26 -> 274
    //   303: new 111	com/tencent/mm/plugin/game/ui/GameRegionPreference$a
    //   306: astore_2
    //   307: aload_2
    //   308: invokespecial 188	com/tencent/mm/plugin/game/ui/GameRegionPreference$a:<init>	()V
    //   311: aload_2
    //   312: aload_3
    //   313: iconst_0
    //   314: aaload
    //   315: putfield 192	com/tencent/mm/plugin/game/ui/GameRegionPreference$a:nlQ	Ljava/lang/String;
    //   318: aload_2
    //   319: aload_3
    //   320: iconst_1
    //   321: aaload
    //   322: putfield 195	com/tencent/mm/plugin/game/ui/GameRegionPreference$a:nlR	Ljava/lang/String;
    //   325: aload_2
    //   326: aload_3
    //   327: iconst_2
    //   328: aaload
    //   329: putfield 198	com/tencent/mm/plugin/game/ui/GameRegionPreference$a:nlS	Ljava/lang/String;
    //   332: aload_2
    //   333: aload_3
    //   334: iconst_3
    //   335: aaload
    //   336: putfield 201	com/tencent/mm/plugin/game/ui/GameRegionPreference$a:dui	Ljava/lang/String;
    //   339: aload_2
    //   340: iconst_0
    //   341: putfield 114	com/tencent/mm/plugin/game/ui/GameRegionPreference$a:gBF	Z
    //   344: aload_2
    //   345: iconst_0
    //   346: putfield 204	com/tencent/mm/plugin/game/ui/GameRegionPreference$a:isDefault	Z
    //   349: aload_0
    //   350: getfield 90	com/tencent/mm/plugin/game/f/a:nlT	Ljava/util/Map;
    //   353: aload_2
    //   354: getfield 201	com/tencent/mm/plugin/game/ui/GameRegionPreference$a:dui	Ljava/lang/String;
    //   357: aload_2
    //   358: invokeinterface 78 3 0
    //   363: pop
    //   364: goto -195 -> 169
    //   367: invokestatic 209	com/tencent/mm/plugin/game/model/e:bDS	()Ljava/lang/String;
    //   370: astore_1
    //   371: aload_0
    //   372: getfield 90	com/tencent/mm/plugin/game/f/a:nlT	Ljava/util/Map;
    //   375: aload_1
    //   376: invokeinterface 55 2 0
    //   381: checkcast 111	com/tencent/mm/plugin/game/ui/GameRegionPreference$a
    //   384: astore_1
    //   385: aload_1
    //   386: ifnull +29 -> 415
    //   389: aload_1
    //   390: invokestatic 212	com/tencent/mm/plugin/game/model/e:bDT	()Ljava/lang/String;
    //   393: putfield 192	com/tencent/mm/plugin/game/ui/GameRegionPreference$a:nlQ	Ljava/lang/String;
    //   396: aload_1
    //   397: invokestatic 215	com/tencent/mm/plugin/game/model/e:bDU	()Ljava/lang/String;
    //   400: putfield 195	com/tencent/mm/plugin/game/ui/GameRegionPreference$a:nlR	Ljava/lang/String;
    //   403: aload_1
    //   404: invokestatic 218	com/tencent/mm/plugin/game/model/e:bDV	()Ljava/lang/String;
    //   407: putfield 198	com/tencent/mm/plugin/game/ui/GameRegionPreference$a:nlS	Ljava/lang/String;
    //   410: aload_1
    //   411: iconst_1
    //   412: putfield 204	com/tencent/mm/plugin/game/ui/GameRegionPreference$a:isDefault	Z
    //   415: ldc 118
    //   417: invokestatic 34	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   420: aload_0
    //   421: monitorexit
    //   422: return
    //   423: ldc 187
    //   425: astore_1
    //   426: goto -314 -> 112
    //
    // Exception table:
    //   from	to	target	type
    //   105	109	175	java/io/IOException
    //   2	27	200	finally
    //   27	39	200	finally
    //   105	109	200	finally
    //   112	122	200	finally
    //   125	169	200	finally
    //   176	194	200	finally
    //   230	234	200	finally
    //   241	259	200	finally
    //   270	274	200	finally
    //   274	281	200	finally
    //   282	300	200	finally
    //   303	364	200	finally
    //   367	385	200	finally
    //   389	415	200	finally
    //   415	420	200	finally
    //   43	55	205	java/io/IOException
    //   59	67	205	java/io/IOException
    //   71	78	205	java/io/IOException
    //   82	87	205	java/io/IOException
    //   91	98	205	java/io/IOException
    //   230	234	240	java/io/IOException
    //   43	55	265	finally
    //   59	67	265	finally
    //   71	78	265	finally
    //   82	87	265	finally
    //   91	98	265	finally
    //   208	226	265	finally
    //   270	274	281	java/io/IOException
  }

  public final Map<String, GameRegionPreference.a> bFD()
  {
    try
    {
      AppMethodBeat.i(112288);
      bFC();
      Map localMap = this.nlT;
      AppMethodBeat.o(112288);
      return localMap;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void clearCache()
  {
    try
    {
      AppMethodBeat.i(112285);
      if (this.nlT != null)
        this.nlT.clear();
      this.nns = false;
      AppMethodBeat.o(112285);
      return;
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.f.a
 * JD-Core Version:    0.6.2
 */
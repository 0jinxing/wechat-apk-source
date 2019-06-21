package com.tencent.mm.plugin.fts.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.bf;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.a.a;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.m;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vfs.j;

public final class b extends com.tencent.mm.plugin.fts.a.b
{
  m eAX;
  private c<bf> fAP;
  private c mFG;
  com.tencent.mm.plugin.fts.c.b mGl;

  public b()
  {
    AppMethodBeat.i(136724);
    this.mFG = new b.1(this);
    this.fAP = new b.2(this);
    AppMethodBeat.o(136724);
  }

  public static com.tencent.mm.vfs.b bAx()
  {
    AppMethodBeat.i(136728);
    com.tencent.mm.vfs.b localb = new com.tencent.mm.vfs.b(new com.tencent.mm.vfs.b(com.tencent.mm.compatible.util.e.eSk, "fts"), "feature");
    if (!localb.exists())
      localb.mkdirs();
    AppMethodBeat.o(136728);
    return localb;
  }

  public static com.tencent.mm.vfs.b bAy()
  {
    AppMethodBeat.i(136729);
    com.tencent.mm.vfs.b localb = new com.tencent.mm.vfs.b(bAx(), "fts_feature");
    if (!localb.exists())
      localb.mkdirs();
    AppMethodBeat.o(136729);
    return localb;
  }

  // ERROR //
  static int bAz()
  {
    // Byte code:
    //   0: ldc_w 292
    //   3: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: invokestatic 56	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   9: invokevirtual 298	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   12: astore_0
    //   13: iconst_m1
    //   14: istore_1
    //   15: new 300	java/io/BufferedReader
    //   18: astore_2
    //   19: new 302	java/io/InputStreamReader
    //   22: astore_3
    //   23: aload_3
    //   24: aload_0
    //   25: ldc_w 304
    //   28: invokevirtual 310	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   31: invokespecial 313	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   34: aload_2
    //   35: aload_3
    //   36: invokespecial 316	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   39: aload_2
    //   40: astore_0
    //   41: aload_2
    //   42: invokevirtual 319	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   45: invokestatic 194	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   48: invokevirtual 197	java/lang/Integer:intValue	()I
    //   51: istore 4
    //   53: iload 4
    //   55: istore_1
    //   56: aload_2
    //   57: invokestatic 325	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   60: ldc_w 292
    //   63: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   66: iload_1
    //   67: ireturn
    //   68: astore_3
    //   69: aconst_null
    //   70: astore_2
    //   71: aload_2
    //   72: astore_0
    //   73: ldc 84
    //   75: aload_3
    //   76: aload_3
    //   77: invokevirtual 328	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   80: iconst_0
    //   81: anewarray 78	java/lang/Object
    //   84: invokestatic 332	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   87: aload_2
    //   88: invokestatic 325	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   91: goto -31 -> 60
    //   94: astore_0
    //   95: aconst_null
    //   96: astore_3
    //   97: aload_0
    //   98: astore_2
    //   99: aload_3
    //   100: invokestatic 325	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   103: ldc_w 292
    //   106: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   109: aload_2
    //   110: athrow
    //   111: astore_2
    //   112: aload_0
    //   113: astore_3
    //   114: goto -15 -> 99
    //   117: astore_3
    //   118: goto -47 -> 71
    //
    // Exception table:
    //   from	to	target	type
    //   15	39	68	java/lang/Exception
    //   15	39	94	finally
    //   41	53	111	finally
    //   73	87	111	finally
    //   41	53	117	java/lang/Exception
  }

  static int j(com.tencent.mm.vfs.b paramb)
  {
    AppMethodBeat.i(136730);
    paramb = new com.tencent.mm.vfs.b(paramb, "version.info");
    int i = -1;
    try
    {
      if (paramb.exists())
      {
        int j = Integer.parseInt(com.tencent.mm.vfs.e.cy(j.w(paramb.dMD())), 10);
        i = j;
      }
      while (true)
      {
        AppMethodBeat.o(136730);
        return i;
        ab.i("MicroMsg.FTS.FTS5SearchFeatureLogic", "version file %s not exist", new Object[] { j.w(paramb.dMD()) });
      }
    }
    catch (Exception paramb)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.FTS.FTS5SearchFeatureLogic", paramb, "getFeatureVersion", new Object[0]);
    }
  }

  public final boolean Pq()
  {
    AppMethodBeat.i(136727);
    this.mFG.dead();
    this.fAP.dead();
    this.mGl = null;
    this.eAX = null;
    AppMethodBeat.o(136727);
    return true;
  }

  public final a a(i parami)
  {
    AppMethodBeat.i(136725);
    parami = new b.c(this, parami, (byte)0);
    parami = this.eAX.a(-65536, parami);
    AppMethodBeat.o(136725);
    return parami;
  }

  public final String getName()
  {
    return "FTS5SearchFeatureLogic";
  }

  public final boolean onCreate()
  {
    AppMethodBeat.i(136726);
    boolean bool;
    if (!((n)g.M(n.class)).isFTSContextReady())
    {
      ab.i("MicroMsg.FTS.FTS5SearchFeatureLogic", "Create Fail!");
      AppMethodBeat.o(136726);
      bool = false;
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.FTS.FTS5SearchFeatureLogic", "Create Success!");
      this.eAX = ((n)g.M(n.class)).getFTSTaskDaemon();
      this.mGl = ((com.tencent.mm.plugin.fts.c.b)((n)g.M(n.class)).getFTSIndexStorage(17));
      this.mFG.dnU();
      this.fAP.dnU();
      this.eAX.a(131132, new b.b(this, (byte)0));
      this.eAX.a(131133, new b.a(this, (byte)0));
      bool = true;
      AppMethodBeat.o(136726);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.b.b
 * JD-Core Version:    0.6.2
 */
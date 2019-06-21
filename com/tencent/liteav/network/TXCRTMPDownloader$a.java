package com.tencent.liteav.network;

import com.tencent.matrix.trace.core.AppMethodBeat;

class TXCRTMPDownloader$a extends Thread
{
  private long b = 0L;
  private String c;
  private boolean d;

  TXCRTMPDownloader$a(TXCRTMPDownloader paramTXCRTMPDownloader, String paramString, boolean paramBoolean)
  {
    super("RTMPDownLoad");
    this.c = paramString;
    this.d = paramBoolean;
  }

  public void a()
  {
    AppMethodBeat.i(67531);
    try
    {
      if (this.b != 0L)
        TXCRTMPDownloader.access$300(this.a, this.b);
      return;
    }
    finally
    {
      AppMethodBeat.o(67531);
    }
  }

  public TXCStreamDownloader.DownloadStats b()
  {
    AppMethodBeat.i(67532);
    TXCStreamDownloader.DownloadStats localDownloadStats = null;
    try
    {
      if (this.b != 0L)
        localDownloadStats = TXCRTMPDownloader.access$400(this.a, this.b);
      return localDownloadStats;
    }
    finally
    {
      AppMethodBeat.o(67532);
    }
  }

  // ERROR //
  public void run()
  {
    // Byte code:
    //   0: ldc 53
    //   2: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: monitorenter
    //   7: aload_0
    //   8: aload_0
    //   9: getfield 18	com/tencent/liteav/network/TXCRTMPDownloader$a:a	Lcom/tencent/liteav/network/TXCRTMPDownloader;
    //   12: aload_0
    //   13: getfield 18	com/tencent/liteav/network/TXCRTMPDownloader$a:a	Lcom/tencent/liteav/network/TXCRTMPDownloader;
    //   16: getfield 56	com/tencent/liteav/network/TXCRTMPDownloader:mOriginUrl	Ljava/lang/String;
    //   19: aload_0
    //   20: getfield 27	com/tencent/liteav/network/TXCRTMPDownloader$a:c	Ljava/lang/String;
    //   23: aload_0
    //   24: getfield 29	com/tencent/liteav/network/TXCRTMPDownloader$a:d	Z
    //   27: aload_0
    //   28: getfield 18	com/tencent/liteav/network/TXCRTMPDownloader$a:a	Lcom/tencent/liteav/network/TXCRTMPDownloader;
    //   31: getfield 59	com/tencent/liteav/network/TXCRTMPDownloader:mEnableMessage	Z
    //   34: invokestatic 63	com/tencent/liteav/network/TXCRTMPDownloader:access$000	(Lcom/tencent/liteav/network/TXCRTMPDownloader;Ljava/lang/String;Ljava/lang/String;ZZ)J
    //   37: putfield 25	com/tencent/liteav/network/TXCRTMPDownloader$a:b	J
    //   40: aload_0
    //   41: monitorexit
    //   42: aload_0
    //   43: getfield 18	com/tencent/liteav/network/TXCRTMPDownloader$a:a	Lcom/tencent/liteav/network/TXCRTMPDownloader;
    //   46: aload_0
    //   47: getfield 25	com/tencent/liteav/network/TXCRTMPDownloader$a:b	J
    //   50: invokestatic 66	com/tencent/liteav/network/TXCRTMPDownloader:access$100	(Lcom/tencent/liteav/network/TXCRTMPDownloader;J)V
    //   53: aload_0
    //   54: monitorenter
    //   55: aload_0
    //   56: getfield 18	com/tencent/liteav/network/TXCRTMPDownloader$a:a	Lcom/tencent/liteav/network/TXCRTMPDownloader;
    //   59: aload_0
    //   60: getfield 25	com/tencent/liteav/network/TXCRTMPDownloader$a:b	J
    //   63: invokestatic 69	com/tencent/liteav/network/TXCRTMPDownloader:access$200	(Lcom/tencent/liteav/network/TXCRTMPDownloader;J)V
    //   66: aload_0
    //   67: lconst_0
    //   68: putfield 25	com/tencent/liteav/network/TXCRTMPDownloader$a:b	J
    //   71: aload_0
    //   72: monitorexit
    //   73: ldc 53
    //   75: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   78: return
    //   79: astore_1
    //   80: aload_0
    //   81: monitorexit
    //   82: ldc 53
    //   84: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   87: aload_1
    //   88: athrow
    //   89: astore_1
    //   90: aload_0
    //   91: monitorexit
    //   92: ldc 53
    //   94: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   97: aload_1
    //   98: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   7	42	79	finally
    //   80	82	79	finally
    //   55	73	89	finally
    //   90	92	89	finally
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.network.TXCRTMPDownloader.a
 * JD-Core Version:    0.6.2
 */
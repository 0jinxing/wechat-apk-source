package com.tencent.mm.t;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class d
  implements b
{
  public static a ewX = null;
  public c ewY = null;

  public static void a(a parama)
  {
    AppMethodBeat.i(128598);
    StringBuilder localStringBuilder = new StringBuilder("XWalkLib SetFileDownloaderProxy:");
    if (parama == null);
    for (boolean bool = true; ; bool = false)
    {
      ab.i("WXFileDownloaderBridge", bool);
      ewX = parama;
      AppMethodBeat.o(128598);
      return;
    }
  }

  public final void d(String paramString, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(128600);
    ab.i("WXFileDownloaderBridge", "onTaskFailed, url=" + paramString + ", errCode=" + paramInt);
    this.ewY.onTaskFail(paramString, paramInt, paramBoolean);
    AppMethodBeat.o(128600);
  }

  public final void e(String paramString, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(128601);
    ab.i("WXFileDownloaderBridge", "onTaskProgressChanged, url=" + paramString + ", cur_size:" + paramLong1 + ", total_size:" + paramLong2);
    AppMethodBeat.o(128601);
  }

  public final void f(String paramString1, String paramString2, boolean paramBoolean)
  {
    AppMethodBeat.i(128599);
    ab.i("WXFileDownloaderBridge", "onTaskFinished url=" + paramString1 + ", save_path=" + paramString2);
    this.ewY.onTaskSucc(paramString1, paramString2, paramBoolean);
    AppMethodBeat.o(128599);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.t.d
 * JD-Core Version:    0.6.2
 */
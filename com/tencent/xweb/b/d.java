package com.tencent.xweb.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import org.xwalk.core.Log;

public final class d
  implements b
{
  public static a ANp = null;
  public c ANq = null;

  public static void a(a parama)
  {
    AppMethodBeat.i(3963);
    StringBuilder localStringBuilder = new StringBuilder("XWalkLib SetFileDownloaderProxy:");
    if (parama == null);
    for (boolean bool = true; ; bool = false)
    {
      Log.i("WXFileDownloaderBridge", bool);
      ANp = parama;
      AppMethodBeat.o(3963);
      return;
    }
  }

  public static boolean isValid()
  {
    if (ANp != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void d(String paramString, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(3965);
    Log.i("WXFileDownloaderBridge", "onTaskFailed, url=" + paramString + ", errCode=" + paramInt);
    this.ANq.onTaskFail(paramString, paramInt, paramBoolean);
    AppMethodBeat.o(3965);
  }

  public final void e(String paramString, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(3966);
    Log.i("WXFileDownloaderBridge", "onTaskProgressChanged, url=" + paramString + ", cur_size:" + paramLong1 + ", total_size:" + paramLong2);
    this.ANq.onProgressChange(paramString, paramLong1, paramLong2);
    AppMethodBeat.o(3966);
  }

  public final void f(String paramString1, String paramString2, boolean paramBoolean)
  {
    AppMethodBeat.i(3964);
    Log.i("WXFileDownloaderBridge", "onTaskFinished url=" + paramString1 + ", save_path=" + paramString2);
    this.ANq.onTaskSucc(paramString1, paramString2, paramBoolean);
    AppMethodBeat.o(3964);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.b.d
 * JD-Core Version:    0.6.2
 */
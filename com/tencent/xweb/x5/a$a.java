package com.tencent.xweb.x5;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a$a
  implements com.tencent.smtt.sdk.DownloadListener
{
  android.webkit.DownloadListener AQl;

  public a$a(android.webkit.DownloadListener paramDownloadListener)
  {
    this.AQl = paramDownloadListener;
  }

  public final void onDownloadStart(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong)
  {
    AppMethodBeat.i(84777);
    if (this.AQl != null)
      this.AQl.onDownloadStart(paramString1, paramString2, paramString3, paramString4, paramLong);
    AppMethodBeat.o(84777);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.x5.a.a
 * JD-Core Version:    0.6.2
 */
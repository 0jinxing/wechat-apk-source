package com.tencent.xweb.x5.sdk;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.sdk.TbsListener;

final class e$a
  implements TbsListener
{
  h AQX;

  public e$a(h paramh)
  {
    this.AQX = paramh;
  }

  public final void onDownloadFinish(int paramInt)
  {
    AppMethodBeat.i(85091);
    if (this.AQX != null)
      this.AQX.onDownloadFinish(paramInt);
    AppMethodBeat.o(85091);
  }

  public final void onDownloadProgress(int paramInt)
  {
    AppMethodBeat.i(85093);
    if (this.AQX != null)
      this.AQX.onDownloadProgress(paramInt);
    AppMethodBeat.o(85093);
  }

  public final void onInstallFinish(int paramInt)
  {
    AppMethodBeat.i(85092);
    if (this.AQX != null)
      this.AQX.onInstallFinish(paramInt);
    AppMethodBeat.o(85092);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.x5.sdk.e.a
 * JD-Core Version:    0.6.2
 */
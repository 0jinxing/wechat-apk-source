package com.tencent.mm.plugin.mmsight.segment;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;

final class VideoSegmentUI$c
  implements Runnable
{
  private WeakReference<c> aIp;
  private int fPW;
  private int ozZ;

  public VideoSegmentUI$c(c paramc, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(55049);
    this.aIp = new WeakReference(paramc);
    this.ozZ = paramInt1;
    this.fPW = paramInt2;
    AppMethodBeat.o(55049);
  }

  public final void run()
  {
    AppMethodBeat.i(55050);
    c localc = (c)this.aIp.get();
    if (localc == null)
      AppMethodBeat.o(55050);
    while (true)
    {
      return;
      localc.setCurrentCursorPosition(this.ozZ / this.fPW);
      AppMethodBeat.o(55050);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.segment.VideoSegmentUI.c
 * JD-Core Version:    0.6.2
 */
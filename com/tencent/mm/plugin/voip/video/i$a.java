package com.tencent.mm.plugin.voip.video;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class i$a
  implements Runnable
{
  private long interval;
  private int resId;
  private int streamType;
  private boolean tbq;

  public i$a(i parami, int paramInt1, long paramLong, boolean paramBoolean, int paramInt2)
  {
    this.resId = paramInt1;
    this.interval = paramLong;
    this.tbq = paramBoolean;
    this.streamType = paramInt2;
  }

  public final void run()
  {
    AppMethodBeat.i(5100);
    this.tbl.a(this.resId, this.interval, this.tbq, this.streamType);
    AppMethodBeat.o(5100);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.video.i.a
 * JD-Core Version:    0.6.2
 */
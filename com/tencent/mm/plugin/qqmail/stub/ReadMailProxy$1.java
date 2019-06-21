package com.tencent.mm.plugin.qqmail.stub;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader.model.k;

final class ReadMailProxy$1
  implements k
{
  ReadMailProxy$1(ReadMailProxy paramReadMailProxy)
  {
  }

  public final void b(long paramLong, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(68082);
    this.pvP.CLIENT_CALL("onTaskFailed", new Object[] { Long.valueOf(paramLong) });
    AppMethodBeat.o(68082);
  }

  public final void b(long paramLong, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(68081);
    this.pvP.CLIENT_CALL("onTaskFinished", new Object[] { Long.valueOf(paramLong) });
    AppMethodBeat.o(68081);
  }

  public final void gm(long paramLong)
  {
  }

  public final void gn(long paramLong)
  {
  }

  public final void i(long paramLong, String paramString)
  {
  }

  public final void onTaskPaused(long paramLong)
  {
    AppMethodBeat.i(68083);
    this.pvP.CLIENT_CALL("onTaskPaused", new Object[] { Long.valueOf(paramLong) });
    AppMethodBeat.o(68083);
  }

  public final void onTaskRemoved(long paramLong)
  {
    AppMethodBeat.i(68080);
    this.pvP.CLIENT_CALL("onTaskRemoved", new Object[] { Long.valueOf(paramLong) });
    AppMethodBeat.o(68080);
  }

  public final void onTaskStarted(long paramLong, String paramString)
  {
    AppMethodBeat.i(68079);
    this.pvP.CLIENT_CALL("onTaskStarted", new Object[] { Long.valueOf(paramLong), paramString });
    AppMethodBeat.o(68079);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.stub.ReadMailProxy.1
 * JD-Core Version:    0.6.2
 */
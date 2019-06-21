package com.tencent.mm.plugin.trafficmonitor;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader.model.k;

final class TrafficClickFlowReceiver$1
  implements k
{
  public final void b(long paramLong, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(114762);
    TrafficClickFlowReceiver.F(13, paramLong);
    AppMethodBeat.o(114762);
  }

  public final void b(long paramLong, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(114761);
    TrafficClickFlowReceiver.F(13, paramLong);
    AppMethodBeat.o(114761);
  }

  public final void gm(long paramLong)
  {
    AppMethodBeat.i(114765);
    TrafficClickFlowReceiver.F(12, paramLong);
    AppMethodBeat.o(114765);
  }

  public final void gn(long paramLong)
  {
  }

  public final void i(long paramLong, String paramString)
  {
    AppMethodBeat.i(114766);
    TrafficClickFlowReceiver.F(11, paramLong);
    AppMethodBeat.o(114766);
  }

  public final void onTaskPaused(long paramLong)
  {
    AppMethodBeat.i(114764);
    TrafficClickFlowReceiver.F(13, paramLong);
    AppMethodBeat.o(114764);
  }

  public final void onTaskRemoved(long paramLong)
  {
    AppMethodBeat.i(114763);
    TrafficClickFlowReceiver.F(13, paramLong);
    AppMethodBeat.o(114763);
  }

  public final void onTaskStarted(long paramLong, String paramString)
  {
    AppMethodBeat.i(114760);
    TrafficClickFlowReceiver.F(11, paramLong);
    AppMethodBeat.o(114760);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.trafficmonitor.TrafficClickFlowReceiver.1
 * JD-Core Version:    0.6.2
 */
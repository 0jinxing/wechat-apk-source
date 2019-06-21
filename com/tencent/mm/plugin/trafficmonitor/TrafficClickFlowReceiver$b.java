package com.tencent.mm.plugin.trafficmonitor;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class TrafficClickFlowReceiver$b
{
  public long endTime;
  public long startTime;

  public final String toString()
  {
    AppMethodBeat.i(114768);
    String str = "DownLoadObject{startTime=" + this.startTime + ", endTime=" + this.endTime + '}';
    AppMethodBeat.o(114768);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.trafficmonitor.TrafficClickFlowReceiver.b
 * JD-Core Version:    0.6.2
 */
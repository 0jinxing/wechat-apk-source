package com.tencent.mm.plugin.trafficmonitor;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class TrafficClickFlowReceiver$c
{
  public long endTime;
  public String sJY;
  public long startTime;

  public final String toString()
  {
    AppMethodBeat.i(114769);
    String str = "UIObject{ui='" + this.sJY + '\'' + ", startTime=" + this.startTime + ", endTime=" + this.endTime + '}';
    AppMethodBeat.o(114769);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.trafficmonitor.TrafficClickFlowReceiver.c
 * JD-Core Version:    0.6.2
 */
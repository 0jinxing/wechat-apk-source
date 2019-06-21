package com.tencent.mm.plugin.trafficmonitor;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class TrafficClickFlowReceiver$a
{
  public String sJY;
  public long time;

  public final String toString()
  {
    AppMethodBeat.i(114767);
    String str = "ClickObject{ui='" + this.sJY + '\'' + ", time=" + this.time + '}';
    AppMethodBeat.o(114767);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.trafficmonitor.TrafficClickFlowReceiver.a
 * JD-Core Version:    0.6.2
 */
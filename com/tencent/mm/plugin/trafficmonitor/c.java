package com.tencent.mm.plugin.trafficmonitor;

import com.tencent.mm.sdk.platformtools.ab;

public abstract class c
{
  private final String TAG = "MicroMsg.TrafficInspector";
  int currentIndex;
  int id;
  long interval;
  d sJZ;
  c.a sKa;
  int type;

  static boolean lG(long paramLong)
  {
    boolean bool;
    if (TrafficClickFlowReceiver.lD(paramLong))
    {
      bool = TrafficClickFlowReceiver.lE(paramLong);
      ab.i("MicroMsg.TrafficInspector", "hasDownload");
    }
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  abstract void cHB();

  final void cHD()
  {
    e.cHE();
    int i = e.cHH();
    if (this.id == i)
    {
      TrafficClickFlowReceiver.cHC();
      e.cHE();
      e.cHG();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.trafficmonitor.c
 * JD-Core Version:    0.6.2
 */
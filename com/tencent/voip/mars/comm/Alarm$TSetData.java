package com.tencent.voip.mars.comm;

import com.tencent.matrix.trace.core.AppMethodBeat;

 enum Alarm$TSetData
{
  static
  {
    AppMethodBeat.i(92743);
    ID = new TSetData("ID", 0);
    WAITTIME = new TSetData("WAITTIME", 1);
    PENDINGINTENT = new TSetData("PENDINGINTENT", 2);
    $VALUES = new TSetData[] { ID, WAITTIME, PENDINGINTENT };
    AppMethodBeat.o(92743);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.voip.mars.comm.Alarm.TSetData
 * JD-Core Version:    0.6.2
 */
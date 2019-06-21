package com.tencent.voip.mars.comm;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Comparator;

class Alarm$ComparatorAlarm
  implements Comparator<Object[]>
{
  public int compare(Object[] paramArrayOfObject1, Object[] paramArrayOfObject2)
  {
    AppMethodBeat.i(92739);
    int i = (int)(((Long)paramArrayOfObject1[Alarm.TSetData.ID.ordinal()]).longValue() - ((Long)paramArrayOfObject2[Alarm.TSetData.ID.ordinal()]).longValue());
    AppMethodBeat.o(92739);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.voip.mars.comm.Alarm.ComparatorAlarm
 * JD-Core Version:    0.6.2
 */
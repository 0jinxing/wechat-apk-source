package com.tencent.mm.modelstat;

import android.hardware.SensorEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class e$a
{
  public int accuracy;
  public float[] values;

  public e$a(SensorEvent paramSensorEvent)
  {
    AppMethodBeat.i(78717);
    this.accuracy = 0;
    if (paramSensorEvent != null)
    {
      this.accuracy = paramSensorEvent.accuracy;
      this.values = new float[paramSensorEvent.values.length];
      System.arraycopy(paramSensorEvent.values, 0, this.values, 0, paramSensorEvent.values.length);
    }
    AppMethodBeat.o(78717);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelstat.e.a
 * JD-Core Version:    0.6.2
 */
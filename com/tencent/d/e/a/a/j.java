package com.tencent.d.e.a.a;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;

public final class j
{
  public final int AtV;
  public final long timestamp;
  public final float[] values;

  public j(SensorEvent paramSensorEvent, long paramLong)
  {
    AppMethodBeat.i(114573);
    this.AtV = paramSensorEvent.sensor.getType();
    this.timestamp = paramLong;
    this.values = Arrays.copyOf(paramSensorEvent.values, paramSensorEvent.values.length);
    AppMethodBeat.o(114573);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.d.e.a.a.j
 * JD-Core Version:    0.6.2
 */
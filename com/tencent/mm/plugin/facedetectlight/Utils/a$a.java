package com.tencent.mm.plugin.facedetectlight.Utils;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$a
  implements SensorEventListener
{
  private float mdp;

  private a$a(a parama)
  {
  }

  public final void onAccuracyChanged(Sensor paramSensor, int paramInt)
  {
  }

  public final void onSensorChanged(SensorEvent paramSensorEvent)
  {
    AppMethodBeat.i(749);
    if (paramSensorEvent.sensor.getType() == 5)
      this.mdp = paramSensorEvent.values[0];
    AppMethodBeat.o(749);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetectlight.Utils.a.a
 * JD-Core Version:    0.6.2
 */
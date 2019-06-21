package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class g$52
  implements SensorEventListener
{
  g$52(g paramg)
  {
  }

  public final void onAccuracyChanged(Sensor paramSensor, int paramInt)
  {
  }

  public final void onSensorChanged(SensorEvent paramSensorEvent)
  {
    AppMethodBeat.i(9112);
    if (paramSensorEvent.sensor.getType() == 3)
      g.a(this.uHd, paramSensorEvent.values[0]);
    AppMethodBeat.o(9112);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.52
 * JD-Core Version:    0.6.2
 */
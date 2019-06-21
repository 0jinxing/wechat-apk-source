package com.tencent.mm.pluginsdk.ui.tools;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class d$1
  implements SensorEventListener
{
  d$1(d paramd)
  {
  }

  public final void onAccuracyChanged(Sensor paramSensor, int paramInt)
  {
    AppMethodBeat.i(79917);
    ab.i("MicroMsg.HeadingPitchSensorMgr", "onAccuracyChanged");
    AppMethodBeat.o(79917);
  }

  public final void onSensorChanged(SensorEvent paramSensorEvent)
  {
    AppMethodBeat.i(79916);
    if (paramSensorEvent.sensor.getType() == 3)
    {
      d.a(this.vuq)[0] = paramSensorEvent.values[0];
      d.a(this.vuq)[1] = paramSensorEvent.values[1];
      d.a(this.vuq)[2] = paramSensorEvent.values[2];
      if (this.vuq.vum == -10000)
      {
        this.vuq.vum = ((int)d.a(this.vuq)[0]);
        if (this.vuq.vum == 0)
          this.vuq.vum = 1;
        if (this.vuq.vum == 365)
          this.vuq.vum = 364;
        if (this.vuq.vun != -10000)
          break label274;
        this.vuq.vun = ((int)d.a(this.vuq)[1]);
        AppMethodBeat.o(79916);
      }
    }
    while (true)
    {
      return;
      if ((d.a(this.vuq)[0] - this.vuq.vum > 300.0F) || (d.a(this.vuq)[0] - this.vuq.vum < -300.0F))
      {
        this.vuq.vum = ((int)d.a(this.vuq)[0]);
        break;
      }
      this.vuq.vum = ((int)(this.vuq.vum * 0.6D + d.a(this.vuq)[0] * 0.4D));
      break;
      label274: if (d.a(this.vuq)[1] < -68.0F)
      {
        int i = (int)(-68.0D + (d.a(this.vuq)[1] + 68.0F) / 1.5D);
        int j = i;
        if (i < -89)
          j = -89;
        this.vuq.vun = j;
        AppMethodBeat.o(79916);
      }
      else if (d.a(this.vuq)[1] > 89.0F)
      {
        this.vuq.vun = 89;
        AppMethodBeat.o(79916);
      }
      else
      {
        this.vuq.vun = ((int)(this.vuq.vun * 0.6D + d.a(this.vuq)[1] * 0.4D));
        AppMethodBeat.o(79916);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.d.1
 * JD-Core Version:    0.6.2
 */
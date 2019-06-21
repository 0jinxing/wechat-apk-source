package com.tencent.mm.plugin.appbrand.jsapi.g.a;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

final class g$a
  implements SensorEventListener
{
  private float hOK = 0.0F;
  private long timestamp = 200L;

  public final void onAccuracyChanged(Sensor paramSensor, int paramInt)
  {
  }

  public final void onSensorChanged(SensorEvent arg1)
  {
    AppMethodBeat.i(93896);
    if (???.sensor.getType() == 3)
    {
      long l1 = System.currentTimeMillis();
      long l2 = this.timestamp;
      float f = f.ap(???.values[0]);
      if ((l1 - l2 > 200L) && (Math.abs(f - this.hOK) > 3.0F))
      {
        synchronized (g.aEd())
        {
          Iterator localIterator1 = g.aEd().values().iterator();
          b localb;
          do
          {
            Iterator localIterator2;
            while (!localIterator2.hasNext())
            {
              if (!localIterator1.hasNext())
                break;
              localIterator2 = ((HashMap)localIterator1.next()).values().iterator();
            }
            localb = (b)localIterator2.next();
          }
          while (localb == null);
          localb.J(this.hOK, f);
        }
        this.hOK = f;
        this.timestamp = System.currentTimeMillis();
      }
    }
    AppMethodBeat.o(93896);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.g.a.g.a
 * JD-Core Version:    0.6.2
 */
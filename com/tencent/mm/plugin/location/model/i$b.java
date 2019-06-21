package com.tencent.mm.plugin.location.model;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;

public final class i$b
  implements SensorEventListener
{
  private float hOK = 0.0F;
  private long timestamp = 200L;

  protected i$b(i parami)
  {
  }

  public final void onAccuracyChanged(Sensor paramSensor, int paramInt)
  {
  }

  public final void onSensorChanged(SensorEvent paramSensorEvent)
  {
    int i = 0;
    AppMethodBeat.i(113319);
    if (paramSensorEvent.sensor.getType() == 3)
    {
      long l1 = System.currentTimeMillis();
      long l2 = this.timestamp;
      float f1 = paramSensorEvent.values[0];
      i locali;
      float f2;
      if (f1 > 0.0F)
      {
        f1 %= 360.0F;
        if ((l1 - l2 <= 200L) || (Math.abs(f1 - this.hOK) <= 3.0F))
          break label261;
        locali = this.nJT;
        f2 = this.hOK;
        locali.nJR = f1;
        if (locali.nJM != null)
          break label236;
      }
      while (true)
      {
        ab.d("MicroMsg.OrientationSensorMgr", "onOrientationChanged %f %f, mListenerList.size = %d", new Object[] { Float.valueOf(f2), Float.valueOf(f1), Integer.valueOf(i) });
        if (locali.nJM == null)
          break label248;
        Iterator localIterator = locali.nJM.iterator();
        while (localIterator.hasNext())
        {
          paramSensorEvent = (WeakReference)localIterator.next();
          if ((paramSensorEvent != null) && (paramSensorEvent.get() != null))
            ((i.a)paramSensorEvent.get()).y(locali.bJr());
        }
        f1 = (f1 + ((int)f1 * -1 / 360 + 1) * 360) % 360.0F;
        break;
        label236: i = locali.nJM.size();
      }
      label248: this.hOK = f1;
      this.timestamp = System.currentTimeMillis();
    }
    label261: AppMethodBeat.o(113319);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.model.i.b
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.plugin.appbrand.jsapi.p;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.s.j;
import com.tencent.mm.sdk.platformtools.ab;

abstract class b$b extends l.a
  implements SensorEventListener
{
  private j hVu;
  b.a hVv = new b.a();

  b$b(c paramc)
  {
    this.hVv.j(paramc);
    this.hVu = new j(i.hVW.aEN(), new b.b.1(this, paramc));
  }

  public void onAccuracyChanged(Sensor paramSensor, int paramInt)
  {
  }

  public void onSensorChanged(SensorEvent paramSensorEvent)
  {
    if (paramSensorEvent.sensor.getType() != 1);
    while (true)
    {
      return;
      paramSensorEvent = paramSensorEvent.values;
      if ((paramSensorEvent == null) || (paramSensorEvent.length < 3))
        ab.w("MicroMsg.JsApiEnableAccelerometer", "ACCELEROMETER sensor callback data invalidate.");
      else
        ab.v("MicroMsg.JsApiEnableAccelerometer", "try to do frequency limit action(%s).", new Object[] { Boolean.valueOf(this.hVu.l(new Object[] { paramSensorEvent })) });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.p.b.b
 * JD-Core Version:    0.6.2
 */
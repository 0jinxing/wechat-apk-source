package com.tencent.mm.plugin.appbrand.jsapi.p;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.s.j;
import com.tencent.mm.sdk.platformtools.ab;

abstract class d$b extends l.a
  implements SensorEventListener
{
  d.a hVG = new d.a();
  private j hVu;
  private boolean hVy;

  d$b(c paramc)
  {
    this.hVG.j(paramc);
    this.hVu = new j(i.hVW.aEN(), new d.b.1(this, paramc));
  }

  public final void aEP()
  {
    this.hVy = true;
  }

  public void onAccuracyChanged(Sensor paramSensor, int paramInt)
  {
  }

  public void onSensorChanged(SensorEvent paramSensorEvent)
  {
    if (this.hVy);
    while (true)
    {
      return;
      if (paramSensorEvent.sensor.getType() == 3)
      {
        paramSensorEvent = paramSensorEvent.values;
        if ((paramSensorEvent == null) || (paramSensorEvent.length < 3))
          ab.w("MicroMsg.JsApiEnableDeviceMotion", "deviceMotion sensor callback data invalidate.");
        else
          ab.v("MicroMsg.JsApiEnableDeviceMotion", "try to do frequency limit action(%s).", new Object[] { Boolean.valueOf(this.hVu.l(new Object[] { paramSensorEvent })) });
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.p.d.b
 * JD-Core Version:    0.6.2
 */
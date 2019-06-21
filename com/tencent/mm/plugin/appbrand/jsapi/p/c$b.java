package com.tencent.mm.plugin.appbrand.jsapi.p;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.s.j;
import com.tencent.mm.sdk.platformtools.ab;

abstract class c$b extends l.a
  implements SensorEventListener
{
  private float[] hVA = new float[3];
  private String hVB = "unknow";
  private int hVC = 0;
  c.a hVD = new c.a();
  private j hVu;
  private boolean hVy;
  private float[] hVz = new float[3];

  c$b(c paramc)
  {
    this.hVD.j(paramc);
    this.hVu = new j(i.hVW.aEN(), new c.b.1(this, paramc));
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
      if ((paramSensorEvent.values != null) && (paramSensorEvent.values.length >= 3))
        break;
      ab.w("MicroMsg.JsApiEnableCompass", "compass sensor callback data invalidate.");
    }
    if (paramSensorEvent.sensor.getType() == 2)
    {
      this.hVA = paramSensorEvent.values;
      switch (paramSensorEvent.accuracy)
      {
      default:
        this.hVB = "unknow";
        this.hVC = paramSensorEvent.accuracy;
      case 1:
      case 2:
      case 3:
      case 0:
      case -1:
      }
    }
    while (true)
    {
      ab.v("MicroMsg.JsApiEnableCompass", "try to do frequency limit action(%s).", new Object[] { Boolean.valueOf(this.hVu.l(new Object[0])) });
      break;
      this.hVB = "low";
      continue;
      this.hVB = "medium";
      continue;
      this.hVB = "high";
      continue;
      this.hVB = "unreliable";
      continue;
      this.hVB = "no-contact";
      continue;
      if (paramSensorEvent.sensor.getType() != 1)
        break;
      this.hVz = paramSensorEvent.values;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.p.c.b
 * JD-Core Version:    0.6.2
 */
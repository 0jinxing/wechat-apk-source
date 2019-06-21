package com.tencent.mm.pluginsdk.i;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Build;
import com.tencent.mm.sdk.platformtools.ab;

public abstract class d$a
  implements SensorEventListener
{
  private static int vgd = 5;
  private final float[] vgb = { 2.0F, 2.5F, 0.5F };
  private float[] vgc = new float[3];

  static
  {
    if (Build.MODEL.equals("LG-E510"))
      vgd = 4;
  }

  public static void reset()
  {
    ab.d("MicroMsg.ShakeSensorListener", "reset threadHold");
    vgd = 5;
    if (Build.MODEL.equals("LG-E510"))
      vgd = 4;
  }

  public abstract void bUT();

  public void onAccuracyChanged(Sensor paramSensor, int paramInt)
  {
  }

  public void onSensorChanged(SensorEvent paramSensorEvent)
  {
    float[] arrayOfFloat1 = new float[3];
    float[] arrayOfFloat2 = paramSensorEvent.values;
    int i = 0;
    int j = 0;
    if (i < 3)
    {
      arrayOfFloat1[i] = Math.round(this.vgb[i] * (arrayOfFloat2[i] - this.vgc[i]) * 0.45F);
      float f = Math.abs(arrayOfFloat1[i]);
      if (f >= 4.0F)
        ab.v("MicroMsg.ShakeSensorListener", "result:" + f + " THREAHOLD:" + vgd);
      if (vgd < 9)
      {
        if (f < 14.0F)
          break label153;
        vgd = 9;
      }
      while (true)
      {
        if (f > vgd)
          j = 1;
        this.vgc[i] = arrayOfFloat2[i];
        i++;
        break;
        label153: int k = (int)f;
        if (vgd < k - 4)
          vgd = k - 4;
      }
    }
    if (j != 0)
    {
      ab.d("MicroMsg.ShakeSensorListener", "sensorChanged " + paramSensorEvent.sensor.getName() + " (" + arrayOfFloat2[0] + ", " + arrayOfFloat2[1] + ", " + arrayOfFloat2[2] + ") diff(" + arrayOfFloat1[0] + " " + arrayOfFloat1[1] + " " + arrayOfFloat1[2] + ")");
      bUT();
      paramSensorEvent = paramSensorEvent.values;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.i.d.a
 * JD-Core Version:    0.6.2
 */
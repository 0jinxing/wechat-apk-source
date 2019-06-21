package com.tencent.mm.plugin.scanner.util;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

public final class m
  implements SensorEventListener
{
  public static final m qiz;
  public SensorManager bCW;
  public Sensor qiv;
  public float[] qiw;
  public int qix;
  private long qiy;

  static
  {
    AppMethodBeat.i(81465);
    qiz = new m();
    AppMethodBeat.o(81465);
  }

  private m()
  {
    AppMethodBeat.i(81462);
    this.qiw = new float[3];
    this.bCW = ((SensorManager)ah.getContext().getSystemService("sensor"));
    this.qiv = this.bCW.getDefaultSensor(1);
    AppMethodBeat.o(81462);
  }

  public final long cil()
  {
    if (this.qix >= 5);
    for (long l = this.qiy; ; l = 0L)
      return l;
  }

  public final void onAccuracyChanged(Sensor paramSensor, int paramInt)
  {
  }

  public final void onSensorChanged(SensorEvent paramSensorEvent)
  {
    AppMethodBeat.i(81463);
    if (paramSensorEvent.sensor.getType() == 1)
    {
      paramSensorEvent = paramSensorEvent.values;
      ab.d("MicroMsg.ScanStableDetector", "x:%f,y:%f,z:%f", new Object[] { Float.valueOf(paramSensorEvent[0]), Float.valueOf(paramSensorEvent[1]), Float.valueOf(paramSensorEvent[2]) });
      if ((this.qiw[0] == 0.0F) && (this.qiw[1] == 0.0F) && (this.qiw[2] == 0.0F))
      {
        this.qiw[0] = paramSensorEvent[0];
        this.qiw[1] = paramSensorEvent[1];
        this.qiw[2] = paramSensorEvent[2];
        AppMethodBeat.o(81463);
        return;
      }
      if ((Math.abs(paramSensorEvent[0] - this.qiw[0]) <= 0.7F) && (Math.abs(paramSensorEvent[1] - this.qiw[1]) <= 0.7F) && (Math.abs(paramSensorEvent[2] - this.qiw[2]) <= 0.7F))
        break label229;
      ab.d("MicroMsg.ScanStableDetector", "scan unstable");
      this.qix = 0;
    }
    while (true)
    {
      this.qiw[0] = paramSensorEvent[0];
      this.qiw[1] = paramSensorEvent[1];
      this.qiw[2] = paramSensorEvent[2];
      AppMethodBeat.o(81463);
      break;
      label229: if (this.qix == 0)
        this.qiy = System.currentTimeMillis();
      this.qix += 1;
      if (this.qix >= 5)
        ab.d("MicroMsg.ScanStableDetector", "scan stable");
    }
  }

  public final void stop()
  {
    AppMethodBeat.i(81464);
    ab.i("MicroMsg.ScanStableDetector", "stop detect scan stable");
    if (this.bCW != null)
    {
      ab.i("MicroMsg.ScanStableDetector", "unregister accelerate listener");
      this.bCW.unregisterListener(this);
    }
    AppMethodBeat.o(81464);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.util.m
 * JD-Core Version:    0.6.2
 */
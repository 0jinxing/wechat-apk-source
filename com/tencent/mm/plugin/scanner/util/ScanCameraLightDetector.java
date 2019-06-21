package com.tencent.mm.plugin.scanner.util;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

public class ScanCameraLightDetector
  implements SensorEventListener
{
  public static final ScanCameraLightDetector qia;
  public ak handler;
  private float lTs = -1.0F;
  public long qib = -1L;
  public Sensor qic;
  public boolean qid = false;
  public HandlerThread qie;
  public SensorManager sensorManager;

  static
  {
    AppMethodBeat.i(81449);
    qia = new ScanCameraLightDetector();
    AppMethodBeat.o(81449);
  }

  private static native int calcLumNative(byte[] paramArrayOfByte, int paramInt1, int paramInt2);

  public void onAccuracyChanged(Sensor paramSensor, int paramInt)
  {
    AppMethodBeat.i(81447);
    ab.d("MicroMsg.ScanCameraLightDetector", "onAccuracyChanged");
    AppMethodBeat.o(81447);
  }

  public void onSensorChanged(SensorEvent paramSensorEvent)
  {
    paramSensorEvent = paramSensorEvent.values;
    if ((paramSensorEvent != null) && (paramSensorEvent.length > 0))
      this.lTs = paramSensorEvent[0];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.util.ScanCameraLightDetector
 * JD-Core Version:    0.6.2
 */
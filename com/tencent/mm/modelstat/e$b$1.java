package com.tencent.mm.modelstat;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;

final class e$b$1
  implements SensorEventListener
{
  e$b$1(e.b paramb)
  {
  }

  public final void onAccuracyChanged(Sensor paramSensor, int paramInt)
  {
  }

  public final void onSensorChanged(SensorEvent paramSensorEvent)
  {
    AppMethodBeat.i(78718);
    if (paramSensorEvent == null)
    {
      AppMethodBeat.o(78718);
      return;
    }
    long l1 = bo.anU();
    if (paramSensorEvent.sensor.getType() == 1)
      this.fSK.fSA = new e.a(paramSensorEvent);
    while (true)
    {
      long l2 = l1 - this.fSK.eRt;
      if ((this.fSK.fSA != null) && (this.fSK.fSB != null) && (this.fSK.fSC != null) && ((l2 > this.fSK.fSz) || (l2 < 0L)))
      {
        paramSensorEvent = new float[9];
        SensorManager.getRotationMatrix(paramSensorEvent, null, this.fSK.fSA.values, this.fSK.fSB.values);
        float[] arrayOfFloat = new float[3];
        SensorManager.getOrientation(paramSensorEvent, arrayOfFloat);
        this.fSK.eRt = l1;
        this.fSK.fSE.add(Long.valueOf(l1));
        this.fSK.fSF.add(this.fSK.fSA);
        this.fSK.fSG.add(this.fSK.fSB);
        this.fSK.fSH.add(this.fSK.fSC);
        this.fSK.fSI.add(arrayOfFloat);
        int i = this.fSK.fSF.size() - 1;
        ab.i("MicroMsg.IndoorReporter", "RES ,  %d  acc[%d,%f,%f,%f]  ", new Object[] { Integer.valueOf(this.fSK.fSF.size()), Integer.valueOf(((e.a)this.fSK.fSF.get(i)).accuracy), Float.valueOf(((e.a)this.fSK.fSF.get(i)).values[0]), Float.valueOf(((e.a)this.fSK.fSF.get(i)).values[1]), Float.valueOf(((e.a)this.fSK.fSF.get(i)).values[2]) });
        ab.v("MicroMsg.IndoorReporter", "Res:%d acc[%d,%f,%f,%f] mag[%d,%f,%f,%f] gyr[%d,%f,%f,%f] ori[%f,%f,%f]", new Object[] { Long.valueOf(l2), Integer.valueOf(this.fSK.fSA.accuracy), Float.valueOf(this.fSK.fSA.values[0]), Float.valueOf(this.fSK.fSA.values[1]), Float.valueOf(this.fSK.fSA.values[2]), Integer.valueOf(this.fSK.fSB.accuracy), Float.valueOf(this.fSK.fSB.values[0]), Float.valueOf(this.fSK.fSB.values[1]), Float.valueOf(this.fSK.fSB.values[2]), Integer.valueOf(this.fSK.fSC.accuracy), Float.valueOf(this.fSK.fSC.values[0]), Float.valueOf(this.fSK.fSC.values[1]), Float.valueOf(this.fSK.fSC.values[2]), Float.valueOf(arrayOfFloat[0]), Float.valueOf(arrayOfFloat[1]), Float.valueOf(arrayOfFloat[2]) });
      }
      AppMethodBeat.o(78718);
      break;
      if (paramSensorEvent.sensor.getType() == 2)
        this.fSK.fSB = new e.a(paramSensorEvent);
      else if (paramSensorEvent.sensor.getType() == 4)
        this.fSK.fSC = new e.a(paramSensorEvent);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelstat.e.b.1
 * JD-Core Version:    0.6.2
 */
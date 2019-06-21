package com.tencent.mm.plugin.sport.model;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.g.a.e;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import org.json.JSONObject;

public final class c
  implements SensorEventListener
{
  private long rPl;
  private long rPm;
  private boolean rPn;
  private Sensor sensor;
  private SensorManager sensorManager;

  public c()
  {
    AppMethodBeat.i(93653);
    this.rPl = 0L;
    this.rPm = 0L;
    if ((n.eU(ah.getContext())) && (n.cvY()));
    for (boolean bool = true; ; bool = false)
    {
      this.rPn = bool;
      ab.i("MicroMsg.Sport.MMSportStepDetector", "isSupportDeviceStep %b", new Object[] { Boolean.valueOf(this.rPn) });
      if (this.rPn)
        cwl();
      AppMethodBeat.o(93653);
      return;
    }
  }

  private boolean cwl()
  {
    AppMethodBeat.i(93656);
    try
    {
      if (this.sensorManager == null)
        this.sensorManager = ((SensorManager)ah.getContext().getSystemService("sensor"));
      boolean bool;
      if ((this.sensorManager != null) && (ah.getContext().getPackageManager().hasSystemFeature("android.hardware.sensor.stepcounter")))
      {
        this.sensor = this.sensorManager.getDefaultSensor(19);
        if (this.sensor == null)
        {
          ab.i("MicroMsg.Sport.MMSportStepDetector", " TYPE_STEP_COUNTER sensor null");
          AppMethodBeat.o(93656);
          bool = false;
        }
      }
      while (true)
      {
        return bool;
        JSONObject localJSONObject = h.cwt();
        bool = this.sensorManager.registerListener(this, this.sensor, localJSONObject.optInt("stepCounterRateUs", 60000));
        if (!bool)
          cwk();
        ab.i("MicroMsg.Sport.MMSportStepDetector", "registerDetector() ok.(result : %s)", new Object[] { Boolean.valueOf(bool) });
        AppMethodBeat.o(93656);
        continue;
        ab.i("MicroMsg.Sport.MMSportStepDetector", "no step sensor");
        AppMethodBeat.o(93656);
        bool = false;
      }
    }
    catch (Exception localException)
    {
      while (true)
        ab.e("MicroMsg.Sport.MMSportStepDetector", "Exception in registerDetector %s", new Object[] { localException.getMessage() });
    }
  }

  public final boolean cwj()
  {
    boolean bool1 = false;
    AppMethodBeat.i(93654);
    boolean bool2;
    if ((n.eU(ah.getContext())) && (n.cvY()))
    {
      bool2 = true;
      this.rPn = bool2;
      if (!this.rPn)
        break label57;
      cwk();
      bool2 = cwl();
      AppMethodBeat.o(93654);
    }
    while (true)
    {
      return bool2;
      bool2 = false;
      break;
      label57: cwk();
      AppMethodBeat.o(93654);
      bool2 = bool1;
    }
  }

  public final void cwk()
  {
    AppMethodBeat.i(93655);
    try
    {
      if (this.sensorManager == null)
        this.sensorManager = ((SensorManager)ah.getContext().getSystemService("sensor"));
      this.sensorManager.unregisterListener(this);
      ab.i("MicroMsg.Sport.MMSportStepDetector", "unregisterDetector() success!");
      AppMethodBeat.o(93655);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.Sport.MMSportStepDetector", "Exception in unregisterDetector %s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(93655);
      }
    }
  }

  public final void onAccuracyChanged(Sensor paramSensor, int paramInt)
  {
  }

  public final void onSensorChanged(SensorEvent paramSensorEvent)
  {
    boolean bool1 = false;
    AppMethodBeat.i(93652);
    if ((paramSensorEvent != null) && (paramSensorEvent.values != null) && (paramSensorEvent.values.length > 0))
    {
      final long l1 = ()paramSensorEvent.values[0];
      long l2 = paramSensorEvent.timestamp;
      ab.v("MicroMsg.Sport.MMSportStepDetector", "onSensorChange %d %d", new Object[] { Long.valueOf(l1), Long.valueOf(l2) });
      if ((Math.abs(l1 - this.rPl) >= 20L) || (System.currentTimeMillis() - this.rPm >= 60000L))
      {
        ab.i("MicroMsg.Sport.MMSportStepDetector", "Step change %d, accuracy %s", new Object[] { Long.valueOf(l1), Long.valueOf(l2) });
        this.rPl = l1;
        this.rPm = System.currentTimeMillis();
        d.xDG.b(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(93651);
            try
            {
              Uri localUri = Uri.parse("content://com.tencent.mm.plugin.sport");
              ah.getContext().getContentResolver().query(localUri, null, "Key_mmSensorChange", new String[] { String.valueOf(l1), String.valueOf(this.rPp) }, null);
              AppMethodBeat.o(93651);
              return;
            }
            catch (Exception localException)
            {
              while (true)
                AppMethodBeat.o(93651);
            }
          }
        }
        , "Sport.onSensorChange");
      }
      AppMethodBeat.o(93652);
    }
    while (true)
    {
      return;
      if ((paramSensorEvent == null) || (paramSensorEvent.values == null))
      {
        if (paramSensorEvent == null);
        for (boolean bool2 = true; ; bool2 = false)
        {
          if (paramSensorEvent != null)
            bool1 = true;
          ab.e("MicroMsg.Sport.MMSportStepDetector", "[Willen][Step] SensorEvent Exception. event==null:%s , event.values==null:%s", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
          AppMethodBeat.o(93652);
          break;
        }
      }
      ab.e("MicroMsg.Sport.MMSportStepDetector", "[Willen][Step] SensorEvent Exception accuracy: %d, timestamp: %s", new Object[] { Integer.valueOf(paramSensorEvent.accuracy), Long.valueOf(paramSensorEvent.timestamp) });
      paramSensorEvent = paramSensorEvent.values;
      int i = paramSensorEvent.length;
      int j = 0;
      int k = 0;
      while (k < i)
      {
        ab.e("MicroMsg.Sport.MMSportStepDetector", "[Willen][Step] SensorEvent Exception event[%d]: %f", new Object[] { Integer.valueOf(j), Float.valueOf(paramSensorEvent[k]) });
        k++;
        j++;
      }
      AppMethodBeat.o(93652);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sport.model.c
 * JD-Core Version:    0.6.2
 */
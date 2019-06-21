package com.tencent.mm.plugin.sport.model;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.g.a.mw;
import com.tencent.mm.plugin.sport.a.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;
import org.json.JSONObject;

public final class g
  implements SensorEventListener
{
  private static long rPA = 0L;
  private static long rPB = 0L;
  private static long rPC = 0L;
  private static long rPD = 0L;
  private static long rPw = 0L;
  private static long rPx = 0L;
  private static long rPy = 0L;
  private static long rPz = 0L;
  private c<mw> rPE;
  private boolean rPn;
  private Sensor sensor;
  private SensorManager sensorManager;

  public g()
  {
    AppMethodBeat.i(93668);
    this.rPn = false;
    this.rPE = new g.1(this);
    if (d.iW(28))
    {
      ab.i("MicroMsg.Sport.PushSportStepDetector", "register push keep alive event");
      this.rPE.dnU();
    }
    boolean bool;
    if ((n.eU(ah.getContext())) && (n.cwE()))
      bool = true;
    while (true)
    {
      this.rPn = bool;
      ab.i("MicroMsg.Sport.PushSportStepDetector", "isSupportDeviceStep %b", new Object[] { Boolean.valueOf(this.rPn) });
      if (this.rPn)
        cwl();
      rPD = 0L;
      try
      {
        Object localObject;
        if (e.ct(a.rOX))
        {
          localObject = new com/tencent/mm/plugin/sport/model/j;
          ((j)localObject).<init>(a.rOX);
          rPz = ((j)localObject).getLong(202, 0L) * 10000L;
          rPx = ((j)localObject).getLong(201, 0L);
          rPw = ((j)localObject).getLong(203, 0L);
          rPA = ((j)localObject).getLong(204, 0L);
          rPC = ((j)localObject).getLong(209, 0L);
          rPy = rPx;
          rPB = rPA;
          k.ZU(cwp());
          e.deleteFile(a.rOX);
        }
        while (true)
        {
          ab.i("MicroMsg.Sport.PushSportStepDetector", "Init PushSportStepDetector currentTodayStep: %d saveTodayBeginTime: %s", new Object[] { Long.valueOf(rPx), n.fQ(rPz) });
          AppMethodBeat.o(93668);
          return;
          bool = false;
          break;
          localObject = k.cwy();
          ab.i("MicroMsg.Sport.PushSportStepDetector", "Read Info From Push Config %s", new Object[] { localObject });
          if (bo.isNullOrNil((String)localObject))
            break label378;
          localObject = n.ZV((String)localObject);
          rPz = localObject[0];
          rPA = localObject[1];
          rPB = localObject[2];
          rPC = localObject[3];
          rPw = localObject[4];
          rPx = localObject[5];
          rPy = localObject[6];
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          rPz = 0L;
          rPA = 0L;
          rPB = 0L;
          rPC = 0L;
          rPw = 0L;
          rPx = 0L;
          rPy = 0L;
          ab.printErrStackTrace("MicroMsg.Sport.PushSportStepDetector", localException, "PushSportStepDetector constructor", new Object[0]);
          AppMethodBeat.o(93668);
          continue;
          label378: long[] arrayOfLong = new long[7];
        }
      }
    }
  }

  private void cwk()
  {
    AppMethodBeat.i(93674);
    try
    {
      if (this.sensorManager == null)
        this.sensorManager = ((SensorManager)ah.getContext().getSystemService("sensor"));
      this.sensorManager.unregisterListener(this);
      ab.i("MicroMsg.Sport.PushSportStepDetector", "unregisterDetector() success!");
      AppMethodBeat.o(93674);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.Sport.PushSportStepDetector", "Exception in unregisterDetector %s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(93674);
      }
    }
  }

  private boolean cwl()
  {
    AppMethodBeat.i(93673);
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
          ab.i("MicroMsg.Sport.PushSportStepDetector", " TYPE_STEP_COUNTER sensor null");
          AppMethodBeat.o(93673);
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
        ab.i("MicroMsg.Sport.PushSportStepDetector", "registerDetector() ok.(result : %s)", new Object[] { Boolean.valueOf(bool) });
        AppMethodBeat.o(93673);
        continue;
        ab.i("MicroMsg.Sport.PushSportStepDetector", "no step sensor");
        AppMethodBeat.o(93673);
        bool = false;
      }
    }
    catch (Exception localException)
    {
      while (true)
        ab.e("MicroMsg.Sport.PushSportStepDetector", "Exception in registerDetector %s", new Object[] { localException.getMessage() });
    }
  }

  public static long cwn()
  {
    return rPx;
  }

  public static long cwo()
  {
    return rPz;
  }

  private static String cwp()
  {
    AppMethodBeat.i(93671);
    String str = String.format("%d,%d,%d,%d,%d,%d,%d", new Object[] { Long.valueOf(rPz), Long.valueOf(rPA), Long.valueOf(rPB), Long.valueOf(rPC), Long.valueOf(rPw), Long.valueOf(rPx), Long.valueOf(rPy) });
    AppMethodBeat.o(93671);
    return str;
  }

  private static void cwq()
  {
    AppMethodBeat.i(93672);
    ab.i("MicroMsg.Sport.PushSportStepDetector", "notifyUploadStep");
    Intent localIntent = new Intent();
    localIntent.setPackage(ah.getContext().getPackageName());
    localIntent.setAction("com.tencent.mm.plugin.sport.uploadstep");
    ah.getContext().sendBroadcast(localIntent);
    AppMethodBeat.o(93672);
  }

  public final void b(long paramLong1, long paramLong2, String paramString)
  {
    AppMethodBeat.i(93670);
    JSONObject localJSONObject = h.cwt();
    if (localJSONObject.optInt("deviceStepSwitch") != 1)
    {
      cwk();
      ab.i("MicroMsg.Sport.PushSportStepDetector", "device step switch off");
      AppMethodBeat.o(93670);
    }
    int i;
    long l2;
    while (true)
    {
      return;
      i = localJSONObject.optInt("stepCounterMaxStep5m", 3000);
      l1 = n.cwC();
      if (paramLong1 < 0L)
      {
        AppMethodBeat.o(93670);
      }
      else
      {
        l2 = System.currentTimeMillis();
        if (rPz == l1)
          break;
        ab.i("MicroMsg.Sport.PushSportStepDetector", "new day beginOfToday: %s saveTodayBeginTime: %s, ", new Object[] { n.fQ(l1), n.fQ(rPz) });
        rPw = paramLong1;
        rPx = 0L;
        rPy = 0L;
        rPz = l1;
        rPA = l2;
        rPB = l2;
        rPC = paramLong2;
        k.ZU(cwp());
        AppMethodBeat.o(93670);
      }
    }
    long l3 = System.currentTimeMillis() - SystemClock.elapsedRealtime();
    long l1 = 0L;
    long l4 = (l2 - rPB) / 300000L;
    int j;
    label206: long l5;
    label258: long l6;
    boolean bool;
    String str1;
    if ((l2 - rPB) % 300000L > 0L)
    {
      j = 1;
      l5 = l4 + j;
      l4 = (paramLong2 / 1000000L - rPC / 1000000L) / 300000L;
      if ((paramLong2 / 1000000L - rPC / 1000000L) % 300000L <= 0L)
        break label637;
      j = 1;
      l6 = l4 + j;
      bool = false;
      str1 = "";
      if (l3 <= rPA)
        break label643;
      ab.i("MicroMsg.Sport.PushSportStepDetector", "reboot %d %s lastSaveStepTime %d", new Object[] { Long.valueOf(l3), n.fQ(l3), Long.valueOf(rPA) });
      l4 = paramLong1 - rPy;
      if ((l4 <= 0L) || ((l4 >= i * l6) && (l4 >= i * l5)))
        break label774;
      str1 = "rebootIncrease Valid Step diffStep > 0";
    }
    label643: label774: for (l1 = l4; ; l1 = 0L)
    {
      l3 = l1;
      String str2 = str1;
      if (l4 < 0L)
        if (paramLong1 >= i * l6)
        {
          l3 = l1;
          str2 = str1;
          if (paramLong1 >= i * l5);
        }
        else
        {
          str2 = "rebootIncrease Valid Step diffStep < 0";
          l3 = paramLong1;
        }
      l1 = l3;
      bool = true;
      while (true)
      {
        ab.i("MicroMsg.Sport.PushSportStepDetector", "%s increase step %s %d %b %d todayStep:%d %d", new Object[] { paramString, str2, Long.valueOf(l1), Boolean.valueOf(bool), Long.valueOf(rPD), Long.valueOf(rPx), Long.valueOf(rPy) });
        rPx += l1;
        rPD += l1;
        if ((l2 - rPA > localJSONObject.optInt("stepCounterSaveInterval", 60000)) || (paramLong1 - rPy > localJSONObject.optInt("stepCounterSaveStep")) || (bool))
        {
          rPA = l2;
          rPy = paramLong1;
          rPw = paramLong1;
          rPB = l2;
          rPC = paramLong2;
          paramString = cwp();
          ab.i("MicroMsg.Sport.PushSportStepDetector", "save to [file] detailInfo %s", new Object[] { paramString });
          k.ZU(paramString);
          if (rPD >= 500L)
          {
            cwq();
            rPD = 0L;
          }
          AppMethodBeat.o(93670);
          break;
          j = 0;
          break label206;
          label637: j = 0;
          break label258;
          if (paramLong1 < rPw)
          {
            ab.i("MicroMsg.Sport.PushSportStepDetector", "invalid currentSensorStep %d preSensorStep %d lastSaveSensorStep %d", new Object[] { Long.valueOf(paramLong1), Long.valueOf(rPw), Long.valueOf(rPy) });
            rPw = paramLong1;
            rPy = paramLong1;
            bool = true;
          }
          if ((paramLong1 - rPw >= l6 * i) && (paramLong1 - rPw >= l5 * i))
            break label766;
          l1 = paramLong1 - rPw;
          str2 = "normalIncrease Valid Step";
          continue;
        }
        rPw = paramLong1;
        rPB = l2;
        rPC = paramLong2;
        AppMethodBeat.o(93670);
        break;
        label766: str2 = "";
      }
    }
  }

  public final boolean cwj()
  {
    boolean bool1 = false;
    AppMethodBeat.i(93675);
    boolean bool2;
    if ((n.eU(ah.getContext())) && (n.cwE()))
    {
      bool2 = true;
      this.rPn = bool2;
      if (!this.rPn)
        break label59;
      cwk();
      bool2 = cwl();
      AppMethodBeat.o(93675);
    }
    while (true)
    {
      return bool2;
      bool2 = false;
      break;
      label59: cwk();
      AppMethodBeat.o(93675);
      bool2 = bool1;
    }
  }

  public final void onAccuracyChanged(Sensor paramSensor, int paramInt)
  {
  }

  public final void onSensorChanged(SensorEvent paramSensorEvent)
  {
    boolean bool1 = false;
    AppMethodBeat.i(93669);
    ab.v("MicroMsg.Sport.PushSportStepDetector", "onSensorChange %d %d", new Object[] { Long.valueOf(()paramSensorEvent.values[0]), Long.valueOf(paramSensorEvent.timestamp) });
    if ((ah.doI()) && (!SportForegroundService.cwB()))
    {
      ab.v("MicroMsg.Sport.PushSportStepDetector", "SportForegroundService Not Running");
      AppMethodBeat.o(93669);
    }
    while (true)
    {
      return;
      if ((paramSensorEvent != null) && (paramSensorEvent.values != null) && (paramSensorEvent.values.length > 0))
      {
        ab.i("MicroMsg.Sport.PushSportStepDetector", "Step change %f, accuracy %s, %s", new Object[] { Float.valueOf(paramSensorEvent.values[0]), Integer.valueOf(paramSensorEvent.accuracy), Long.valueOf(paramSensorEvent.timestamp) });
        b(()paramSensorEvent.values[0], paramSensorEvent.timestamp, "PUSH");
        AppMethodBeat.o(93669);
      }
      else
      {
        if ((paramSensorEvent == null) || (paramSensorEvent.values == null))
        {
          if (paramSensorEvent == null);
          for (boolean bool2 = true; ; bool2 = false)
          {
            if (paramSensorEvent != null)
              bool1 = true;
            ab.e("MicroMsg.Sport.PushSportStepDetector", "[Willen][Step] SensorEvent Exception. event==null:%s , event.values==null:%s", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
            AppMethodBeat.o(93669);
            break;
          }
        }
        ab.e("MicroMsg.Sport.PushSportStepDetector", "[Willen][Step] SensorEvent Exception accuracy: %d, timestamp: %s", new Object[] { Integer.valueOf(paramSensorEvent.accuracy), Long.valueOf(paramSensorEvent.timestamp) });
        paramSensorEvent = paramSensorEvent.values;
        int i = paramSensorEvent.length;
        int j = 0;
        for (int k = 0; j < i; k++)
        {
          ab.e("MicroMsg.Sport.PushSportStepDetector", "[Willen][Step] SensorEvent Exception event[%d]: %f", new Object[] { Integer.valueOf(k), Float.valueOf(paramSensorEvent[j]) });
          j++;
        }
        AppMethodBeat.o(93669);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sport.model.g
 * JD-Core Version:    0.6.2
 */
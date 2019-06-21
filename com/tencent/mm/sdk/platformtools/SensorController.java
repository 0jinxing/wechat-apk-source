package com.tencent.mm.sdk.platformtools;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class SensorController extends BroadcastReceiver
  implements SensorEventListener
{
  private static float xBA = 4.294967E+009F;
  private static float xBC = 0.5F;
  public static boolean xBI = false;
  public static double xBJ = -1.0D;
  public boolean aGA;
  private Context context;
  private float qYv;
  private SensorManager sensorManager;
  private float xBB;
  private a xBD;
  private Sensor xBE;
  private final boolean xBF;
  private boolean xBG;
  private float xBH;

  public SensorController(Context paramContext)
  {
    AppMethodBeat.i(52265);
    this.xBG = false;
    this.aGA = false;
    this.qYv = -1.0F;
    this.xBH = -1.0F;
    if (paramContext == null)
    {
      this.xBF = false;
      AppMethodBeat.o(52265);
      return;
    }
    this.context = paramContext;
    this.sensorManager = ((SensorManager)paramContext.getSystemService("sensor"));
    this.xBE = this.sensorManager.getDefaultSensor(8);
    if (this.xBE != null)
      this.qYv = Math.min(10.0F, this.xBE.getMaximumRange());
    if (this.qYv < 0.0F)
    {
      ab.e("MicroMsg.SensorController", "error, getMaximumRange return %s, set to 1", new Object[] { Float.valueOf(this.qYv) });
      this.qYv = 1.0F;
    }
    if (this.xBE != null);
    for (boolean bool = true; ; bool = false)
    {
      this.xBF = bool;
      this.xBB = (xBC + 1.0F);
      AppMethodBeat.o(52265);
      break;
    }
  }

  public final void a(a parama)
  {
    AppMethodBeat.i(52266);
    ab.i("MicroMsg.SensorController", "sensor callback set, isRegistered:" + this.aGA + ", proximitySensor: " + this.xBE + ", maxValue: " + this.qYv);
    if (!this.aGA)
    {
      this.xBH = -1.0F;
      IntentFilter localIntentFilter = new IntentFilter();
      localIntentFilter.addAction("android.intent.action.HEADSET_PLUG");
      this.context.registerReceiver(this, localIntentFilter);
      this.sensorManager.registerListener(this, this.xBE, 2);
      this.aGA = true;
    }
    this.xBD = parama;
    AppMethodBeat.o(52266);
  }

  public final void dps()
  {
    AppMethodBeat.i(52267);
    ab.i("MicroMsg.SensorController", "sensor callback removed");
    try
    {
      this.context.unregisterReceiver(this);
      this.sensorManager.unregisterListener(this, this.xBE);
      this.sensorManager.unregisterListener(this);
      this.aGA = false;
      this.xBD = null;
      this.xBH = -1.0F;
      AppMethodBeat.o(52267);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        ab.v("MicroMsg.SensorController", "sensor receiver has already unregistered");
    }
  }

  public void onAccuracyChanged(Sensor paramSensor, int paramInt)
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(52269);
    if (paramIntent == null)
      AppMethodBeat.o(52269);
    while (true)
    {
      return;
      paramContext = paramIntent.getAction();
      if ((paramContext != null) && (paramContext.equals("android.intent.action.HEADSET_PLUG")))
      {
        int i = paramIntent.getIntExtra("state", 0);
        if (i == 1)
          this.xBG = true;
        if (i == 0)
          this.xBG = false;
      }
      AppMethodBeat.o(52269);
    }
  }

  public void onSensorChanged(SensorEvent paramSensorEvent)
  {
    AppMethodBeat.i(52268);
    if ((paramSensorEvent == null) || (paramSensorEvent.sensor == null) || (this.xBE == null))
      AppMethodBeat.o(52268);
    label28: float f1;
    float f3;
    while (true)
    {
      return;
      if (this.xBG)
      {
        AppMethodBeat.o(52268);
      }
      else
      {
        f1 = paramSensorEvent.values[0];
        double d = 3.0D;
        ab.i("MicroMsg.SensorController", "newValue: %s, maxValue: %s, divideRatio: %s, configNearFarDivideRatio: %s, lastValue: %s, maxRange: %s", new Object[] { Float.valueOf(f1), Float.valueOf(this.qYv), Double.valueOf(3.0D), Double.valueOf(xBJ), Float.valueOf(this.xBH), Float.valueOf(this.xBE.getMaximumRange()) });
        if (xBJ > 0.0D)
          d = xBJ;
        if ((xBJ > 0.0D) || (this.qYv < 0.0F));
        for (float f2 = this.xBE.getMaximumRange(); ; f2 = this.qYv)
        {
          f3 = Math.max(0.1F, (float)(f2 / d));
          ab.i("MicroMsg.SensorController", "onSensorChanged, near threshold: %s, max: %s", new Object[] { Float.valueOf(f3), Float.valueOf(f2) });
          switch (paramSensorEvent.sensor.getType())
          {
          default:
            AppMethodBeat.o(52268);
            break label28;
          case 8:
          }
        }
        if (this.xBD == null)
        {
          AppMethodBeat.o(52268);
        }
        else
        {
          if (f1 != this.xBH)
            break;
          AppMethodBeat.o(52268);
        }
      }
    }
    if (f1 < f3)
    {
      ab.i("MicroMsg.SensorController", "sensor near-far event near false");
      this.xBD.he(false);
    }
    while (true)
    {
      this.xBH = f1;
      break;
      ab.i("MicroMsg.SensorController", "sensor near-far event far true");
      this.xBD.he(true);
    }
  }

  public static abstract interface a
  {
    public abstract void he(boolean paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.SensorController
 * JD-Core Version:    0.6.2
 */
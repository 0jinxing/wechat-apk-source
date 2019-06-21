package com.b.a.a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class r$d extends r.a
{
  private boolean bFW;

  private r$d(r paramr)
  {
    super(paramr, (byte)0);
  }

  public final void run()
  {
    AppMethodBeat.i(55542);
    try
    {
      r.a(wn());
      localf = r.b(wn());
    }
    catch (Exception localException1)
    {
      try
      {
        f localf;
        localf.bDa = Build.MODEL;
        localf.bDb = Build.VERSION.RELEASE;
        localf.versionName = localf.bCY.versionName;
        Object localObject = localf.mContext.getApplicationInfo().loadLabel(localf.bCX);
        if (localObject != null)
        {
          localObject = ((CharSequence)localObject).toString();
          localf.bCZ = ((String)localObject);
          if (localf.bCW != null)
          {
            Sensor localSensor1 = localf.bCW.getDefaultSensor(1);
            localObject = localf.bCW.getDefaultSensor(4);
            Sensor localSensor2 = localf.bCW.getDefaultSensor(2);
            Sensor localSensor3 = localf.bCW.getDefaultSensor(11);
            if (localSensor1 != null)
              localf.bDe = 1;
            if (localObject != null)
              localf.bDf = 1;
            if (localSensor2 != null)
              localf.bDg = 1;
            if (localSensor3 != null)
              localf.bDh = 1;
          }
        }
        while (true)
        {
          label160: this.bFW = false;
          AppMethodBeat.o(55542);
          return;
          localObject = "unknown";
          break;
          localException1 = localException1;
        }
      }
      catch (Error localError)
      {
        break label160;
      }
      catch (Exception localException2)
      {
        break label160;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.b.a.a.r.d
 * JD-Core Version:    0.6.2
 */
package com.tencent.mm.pluginsdk.ui.tools;

import android.content.Context;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class d
  implements t.a
{
  public static d vup = null;
  public boolean hasInit;
  private SensorEventListener uGJ;
  private float[] vul;
  int vum;
  int vun;
  private SensorManager vuo;

  public d()
  {
    AppMethodBeat.i(79918);
    this.hasInit = false;
    this.vul = new float[3];
    this.vum = -10000;
    this.vun = -10000;
    AppMethodBeat.o(79918);
  }

  private void dlq()
  {
    AppMethodBeat.i(79922);
    ab.d("MicroMsg.HeadingPitchSensorMgr", "releaseSensor");
    if ((this.vuo != null) && (this.uGJ != null))
    {
      ab.d("MicroMsg.HeadingPitchSensorMgr", "releaseSensor");
      this.vuo.unregisterListener(this.uGJ);
      this.vuo = null;
      this.uGJ = null;
    }
    this.hasInit = false;
    AppMethodBeat.o(79922);
  }

  public final void dbp()
  {
    AppMethodBeat.i(79923);
    vup = null;
    dlq();
    AppMethodBeat.o(79923);
  }

  public final void dbq()
  {
    AppMethodBeat.i(79925);
    dlq();
    AppMethodBeat.o(79925);
  }

  public final int dlp()
  {
    AppMethodBeat.i(79919);
    ab.d("MicroMsg.HeadingPitchSensorMgr", "getHeading() " + this.vum);
    int i = this.vum;
    AppMethodBeat.o(79919);
    return i;
  }

  public final void fQ(Context paramContext)
  {
    AppMethodBeat.i(79921);
    ab.d("MicroMsg.HeadingPitchSensorMgr", "initSensor() ");
    if (paramContext == null)
    {
      ab.e("MicroMsg.HeadingPitchSensorMgr", "initSensor() context == null");
      AppMethodBeat.o(79921);
    }
    while (true)
    {
      return;
      if (this.vuo == null)
        this.vuo = ((SensorManager)paramContext.getSystemService("sensor"));
      if (this.uGJ == null)
        this.uGJ = new d.1(this);
      boolean bool = this.vuo.registerListener(this.uGJ, this.vuo.getDefaultSensor(3), 3);
      this.hasInit = true;
      ab.d("MicroMsg.HeadingPitchSensorMgr", "initSensor() finish, %s", new Object[] { Boolean.valueOf(bool) });
      AppMethodBeat.o(79921);
    }
  }

  public final void ft(Context paramContext)
  {
    AppMethodBeat.i(79924);
    fQ(paramContext);
    AppMethodBeat.o(79924);
  }

  public final String getName()
  {
    return "HeadingPitchSensorMgr";
  }

  public final int getPitch()
  {
    AppMethodBeat.i(79920);
    ab.d("MicroMsg.HeadingPitchSensorMgr", "getPitch() " + this.vun);
    int i = this.vun;
    AppMethodBeat.o(79920);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.d
 * JD-Core Version:    0.6.2
 */